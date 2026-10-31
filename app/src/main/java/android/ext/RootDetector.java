package android.ext;

import android.content.SharedPreferences;
import android.ext.ExceptionHandler;
import android.os.Process;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public class RootDetector {
    public static final String SH_KEY = "sh";
    public static final String SU_KEY = "su";
    public static String debug = "";
    static volatile int runCmdPid = 0;
    private static String suGlobal = "su";
    private static boolean useSh = false;

    static {
        SharedPreferences sharedPreferences = Tools.getSharedPreferences();
        suGlobal = sharedPreferences.getString(SU_KEY, SU_KEY);
        useSh = sharedPreferences.getBoolean(SH_KEY, false);
    }

    private static String addPath() {
        String[] strArr = {"/vendor/bin", "/system/bin", "/bin", "/data/local", "/data/local/bin", "/system/sd/bin", "/system/bin/failsafe", "/system/bin/bstk", "/su/bin", "/magisk/.core/bin", "/magisk/phh/bin"};
        ArrayList arrayList = new ArrayList(33);
        for (int i7 = 0; i7 < 11; i7++) {
            String str = strArr[i7];
            arrayList.add(str);
            if (str.contains("/bin")) {
                arrayList.add(str.replace("/bin", "/xbin"));
                arrayList.add(str.replace("/bin", "/sbin"));
            }
        }
        return TextUtils.join(":", arrayList);
    }

    private static String getData(String str, InputStream inputStream) {
        byte[] bArr;
        int read;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(": ");
        try {
            int available = inputStream.available();
            if (available > 0 && (read = inputStream.read((bArr = new byte[available]))) > 0) {
                sb.append(new String(Arrays.copyOf(bArr, read)));
            }
        } catch (IOException e7) {
            sb.append(e7.toString());
        }
        sb.append('\n');
        return sb.toString();
    }

    private static String[] getEnv() {
        Map<String, String> map = System.getenv();
        int size = map.size();
        String str = map.get("PATH");
        if (str == null) {
            size++;
        }
        String[] strArr = new String[size];
        int i7 = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if ("PATH".equals(key)) {
                value = String.valueOf(value) + ':' + addPath();
            }
            strArr[i7] = String.valueOf(key) + '=' + value;
            i7++;
        }
        if (str == null) {
            strArr[i7] = "PATH=" + addPath();
        }
        return strArr;
    }

    public static String getInfo(Process process) {
        StringBuilder sb = new StringBuilder();
        if (process != null) {
            sb.append(getData("stdout", process.getInputStream()));
            sb.append(getData("stderr", process.getErrorStream()));
            sb.append("exit value: ");
            try {
                sb.append(process.exitValue());
            } catch (IllegalThreadStateException unused) {
                sb.append("already run");
            }
            sb.append('\n');
        } else {
            sb.append("process is null\n");
        }
        return sb.toString();
    }

    public static String getSu(String str) {
        return Config.vSpace ? SH_KEY : str == null ? suGlobal : str;
    }

    public static String runCmd(String str, int i7) {
        String runCmd = runCmd(str, i7, null);
        debug = "";
        return runCmd;
    }

    public static String runCmd(final String str, int i7, final String str2) {
        final StringBuilder sb = new StringBuilder();
        runCmdPid = 0;
        FutureTask futureTask = new FutureTask(new Callable<String>() { // from class: android.ext.RootDetector.1
            @Override // java.util.concurrent.Callable
            public String call() {
                String su;
                String readLine;
                if (!Config.vSpace || "" != (su = str2)) {
                    su = RootDetector.getSu(str2);
                }
                Process exec = su == "" ? Tools.exec(new String[]{str}) : RootDetector.tryRoot(str, su, true);
                if (exec == null) {
                    return "cmd fail - got null";
                }
                int pid = Tools.getPid(exec);
                RootDetector.runCmdPid = pid;
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()));
                while (true) {
                    try {
                        readLine = bufferedReader.readLine();
                    } catch (Throwable unused) {
                        bufferedReader.close();
                    }
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                    sb.append('\n');
                }
                bufferedReader.close();
                sb.append("exit code: ");
                sb.append(exec.waitFor());
                if (pid > 0) {
                    try {
                        Process.killProcess(pid);
                    } catch (Throwable unused2) {
                    }
                }
                RootDetector.runCmdPid = 0;
                return null;
            }
        });
        new ExceptionHandler.ThreadEx(futureTask, C0089a.m208f("runCmd: ", str)).start();
        try {
            futureTask.get(i7, TimeUnit.SECONDS);
        } catch (InterruptedException e7) {
            e = e7;
            sb.append("expection: ");
            sb.append(e.getMessage());
        } catch (ExecutionException e8) {
            e = e8;
            sb.append("expection: ");
            sb.append(e.getMessage());
        } catch (TimeoutException unused) {
            sb.append("timeout: ");
            sb.append(i7);
        }
        int i8 = runCmdPid;
        if (i8 > 0) {
            try {
                Process.killProcess(i8);
            } catch (Throwable unused2) {
            }
        }
        runCmdPid = 0;
        return sb.toString();
    }

    public static Process tryRoot(String str) {
        return tryRoot(str, null, false);
    }

    public static Process tryRoot(String str, String str2, boolean z6) {
        StringBuilder sb = new StringBuilder();
        if (!str.contains("exec") && !str.contains("exit")) {
            throw new RuntimeException("You forgot exec or exit");
        }
        str.contains("/emulated/0");
        sb.append("try: ");
        sb.append(str);
        sb.append("\nsu: ");
        String su = getSu(str2);
        sb.append(su);
        sb.append('\n');
        if (!Config.vSpace && useSh) {
            str = "exec " + su + '\n' + str;
            su = SH_KEY;
        }
        String[] strArr = {su};
        Process process = null;
        for (int i7 = 0; i7 < 2; i7++) {
            if (i7 == 0) {
                try {
                    process = Tools.exec(strArr);
                    DataOutputStream dataOutputStream = new DataOutputStream(process.getOutputStream());
                    dataOutputStream.writeBytes(String.valueOf(Tools.getRealPath(str)) + '\n');
                    dataOutputStream.flush();
                    sb.append("process started: " + i7 + '\n');
                } catch (Throwable th) {
                    for (th = th; th != null; th = th.getCause()) {
                        sb.append(th.toString());
                        sb.append('\n');
                    }
                    sb.append('\n');
                    sb.append(getInfo(process));
                }
                if (process == null) {
                    if (z6) {
                        debug = sb.toString();
                    }
                    return process;
                }
            } else if (i7 == 1) {
                try {
                    process = Tools.exec(strArr, getEnv());
                    DataOutputStream dataOutputStream2 = new DataOutputStream(process.getOutputStream());
                    dataOutputStream2.writeBytes(String.valueOf(Tools.getRealPath(str)) + '\n');
                    dataOutputStream2.flush();
                    sb.append("process started: " + i7 + '\n');
                } catch (IOException unused) {
                }
            }
        }
        return process;
    }
}
