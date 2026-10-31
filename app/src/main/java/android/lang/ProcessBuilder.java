package android.lang;

import android.ext.C0090b;
import android.ext.C0091c;
import android.ext.DaemonLoader;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public final class ProcessBuilder {
    static final boolean $assertionsDisabled = false;
    private static volatile boolean loaded = false;
    private String[] command;
    private File directory;
    private Map<String, String> environment;

    public ProcessBuilder(String... strArr) {
        this.command = strArr;
    }

    public static Process exec(String[] strArr, String[] strArr2, File file) {
        if (!loaded) {
            loaded = true;
            DaemonLoader.initNative();
        }
        return new ProcessBuilder(strArr).environment(strArr2).directory(file).start();
    }

    public static native boolean loaded();

    public ProcessBuilder directory(File file) {
        this.directory = file;
        return this;
    }

    public ProcessBuilder environment(String[] strArr) {
        if (strArr != null) {
            this.environment = ProcessEnvironment.emptyEnvironment(strArr.length);
            for (String str : strArr) {
                if (str.indexOf(0) != -1) {
                    str = str.replaceFirst("\u0000.*", "");
                }
                int indexOf = str.indexOf(61, 0);
                if (indexOf != -1) {
                    this.environment.put(str.substring(0, indexOf), str.substring(indexOf + 1));
                }
            }
        }
        return this;
    }

    public Process start() {
        String[] strArr = (String[]) this.command.clone();
        for (String str : strArr) {
            str.getClass();
        }
        String str2 = strArr[0];
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkExec(str2);
        }
        File file = this.directory;
        String file2 = file == null ? null : file.toString();
        for (int i7 = 1; i7 < strArr.length; i7++) {
            if (strArr[i7].indexOf(0) >= 0) {
                throw new IOException("invalid null character in command");
            }
        }
        try {
            return ProcessImpl.start(strArr, this.environment, file2, false);
        } catch (IOException | IllegalArgumentException e7) {
            e = e7;
            String str3 = ": " + e.getMessage();
            if ((e instanceof IOException) && securityManager != null) {
                try {
                    securityManager.checkRead(str2);
                } catch (SecurityException e8) {
                    e = e8;
                    str3 = "";
                }
            }
            StringBuilder sb = new StringBuilder("Cannot run program \"");
            sb.append(str2);
            sb.append('\"');
            throw new IOException(C0090b.m220f(sb, file2 != null ? C0091c.m228f(" (in directory \"", file2, "\")") : "", str3), e);
        }
    }
}
