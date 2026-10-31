package android.ext;

import android.content.SharedPreferences;
import android.os.Process;
import android.text.TextUtils;
import androidx.lifecycle.C0391d0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import p175w1.C2086f;

/* loaded from: classes.dex */
public class CheckNativeCrash {
    private static final String BUGGED_PACKAGES = "bugged-packages";
    private static final String BUGGED_UIDS = "bugged-uids";
    private static final String DELIMITER = " _QAZ_WSX_EDC_RFV_TGB_YHN_UJM_ ";
    private static final String FILENAME = "native_crash.txt";
    private static final boolean IS_CM13 = isCm13();
    private static volatile String buggedPackages = ";;";
    private static volatile String buggedUids = ";;";

    public static boolean enter(String str, String str2) {
        boolean z6 = IS_CM13;
        if (!z6 || C2086f.f9509a.equals(str)) {
            return false;
        }
        if (str.startsWith("uid:")) {
            if (str.equals("uid:" + Process.myUid())) {
                return false;
            }
        }
        if (!z6) {
            return true;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(getFile());
            fileOutputStream.write(str.getBytes());
            fileOutputStream.write(DELIMITER.getBytes());
            fileOutputStream.flush();
            fileOutputStream.close();
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }

    public static void exit(boolean z6) {
        boolean z7 = IS_CM13;
        if (z7 && z6 && z7) {
            try {
                getFile().delete();
            } catch (Throwable unused) {
            }
        }
    }

    public static String[] getBuggedPackages() {
        if (IS_CM13) {
            String buggedPackagesString = getBuggedPackagesString();
            if (buggedPackagesString.length() > 0) {
                return buggedPackagesString.split(";");
            }
        }
        return C0391d0.f1979o;
    }

    private static String getBuggedPackagesString() {
        String unique = unique(Tools.getSharedPreferences().getString(BUGGED_PACKAGES, ""));
        if (unique.length() > 0) {
            buggedPackages = String.valueOf(';') + unique + ';';
        }
        return unique;
    }

    public static String[] getBuggedUids() {
        if (IS_CM13) {
            String buggedUidsString = getBuggedUidsString();
            if (buggedUidsString.length() > 0) {
                return buggedUidsString.split(";");
            }
        }
        return C0391d0.f1979o;
    }

    private static String getBuggedUidsString() {
        String unique = unique(Tools.getSharedPreferences().getString(BUGGED_UIDS, ""));
        if (unique.length() > 0) {
            buggedUids = String.valueOf(';') + unique + ';';
        }
        return unique;
    }

    private static File getFile() {
        File file = new File(Tools.getFilesDirHidden(), String.valueOf(Process.myPid()) + FILENAME);
        try {
            file.getParentFile().mkdirs();
        } catch (Throwable unused) {
        }
        return file;
    }

    private static String[] getLastCrash() {
        File[] listFiles;
        File parentFile = getFile().getParentFile();
        if (parentFile == null || (listFiles = parentFile.listFiles()) == null) {
            return null;
        }
        int length = listFiles.length;
        String[] strArr = new String[length * 2];
        for (int i7 = 0; i7 < length; i7++) {
            File file = listFiles[i7];
            if (file != null && file.getName().endsWith(FILENAME)) {
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    byte[] bArr = new byte[Math.min(((int) file.length()) + 8192, 102400)];
                    int read = fileInputStream.read(bArr);
                    fileInputStream.close();
                    if (read > 0) {
                        String[] split = new String(bArr, 0, read).split(DELIMITER, 2);
                        if (split.length == 2) {
                            int i8 = i7 * 2;
                            strArr[i8 + 0] = split[0];
                            strArr[i8 + 1] = split[1];
                        }
                    }
                } catch (Throwable unused) {
                }
                file.delete();
            }
        }
        return strArr;
    }

    public static boolean isBuggedPackage(String str) {
        if (!IS_CM13) {
            return false;
        }
        return buggedPackages.contains(String.valueOf(';') + str + ';');
    }

    public static boolean isBuggedUid(String str) {
        if (!IS_CM13) {
            return false;
        }
        return buggedUids.contains(String.valueOf(';') + str + ';');
    }

    private static boolean isCm13() {
        boolean z6;
        boolean z7 = false;
        try {
            File file = new File("/system/lib/libandroidfw.so");
            if (!file.exists()) {
                return false;
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bytes = "_ZN7android12AssetManager10getPkgNameEPKc".getBytes();
            byte[] bArr = new byte[8192];
            int length = bytes.length;
            int i7 = 0;
            boolean z8 = false;
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, i7, 8192 - i7);
                    if (read <= 0) {
                        break;
                    }
                    i7 += read;
                    if (i7 >= length) {
                        int i8 = (i7 - length) + 1;
                        int i9 = 0;
                        while (true) {
                            if (i9 >= i8) {
                                break;
                            }
                            int i10 = 0;
                            while (true) {
                                if (i10 >= length) {
                                    z6 = true;
                                    break;
                                }
                                if (bArr[i9 + i10] != bytes[i10]) {
                                    z6 = false;
                                    break;
                                }
                                i10++;
                            }
                            if (z6) {
                                z8 = true;
                                break;
                            }
                            i9++;
                        }
                        if (z8) {
                            break;
                        }
                        int i11 = length - 1;
                        for (int i12 = 0; i12 < i11; i12++) {
                            bArr[i12] = bArr[(i7 - i11) + i12];
                        }
                        i7 = i11;
                    }
                } catch (Throwable unused) {
                    return z8;
                }
            }
            z7 = z8;
            fileInputStream.close();
            return z7;
        } catch (Throwable unused2) {
            return z7;
        }
    }

    public static void loadLastCrash() {
        String str;
        getBuggedPackagesString();
        getBuggedUidsString();
        String[] lastCrash = getLastCrash();
        if (lastCrash != null) {
            int length = lastCrash.length;
            for (int i7 = 0; i7 < length; i7 += 2) {
                String str2 = lastCrash[i7];
                if (str2 != null) {
                    String str3 = lastCrash[i7 + 1];
                    if (str2.contains("uid:")) {
                        str2 = str2.split(":", -1)[1];
                        str = BUGGED_UIDS;
                    } else {
                        str = BUGGED_PACKAGES;
                    }
                    SharedPreferences sharedPreferences = Tools.getSharedPreferences();
                    String string = sharedPreferences.getString(str, "");
                    if (string != null && string.length() != 0) {
                        str2 = (String.valueOf(';') + string + ';').contains(String.valueOf(';') + str2 + ';') ? string : string + ';' + str2;
                    }
                    sharedPreferences.edit().putString(str, unique(str2)).commit();
                }
            }
        }
        getBuggedPackagesString();
        getBuggedUidsString();
    }

    private static String unique(String str) {
        ArrayList arrayList = new ArrayList(new HashSet(Arrays.asList(str.split(";"))));
        return TextUtils.join(";", arrayList.toArray(new String[arrayList.size()]));
    }
}
