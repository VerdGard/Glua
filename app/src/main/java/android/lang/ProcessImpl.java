package android.lang;

import java.io.FileDescriptor;
import java.lang.reflect.Field;
import java.util.Map;

/* loaded from: classes.dex */
public final class ProcessImpl {
    static final boolean $assertionsDisabled = false;

    private ProcessImpl() {
    }

    public static int getFD(FileDescriptor fileDescriptor) {
        try {
            Field declaredField = FileDescriptor.class.getDeclaredField("descriptor");
            declaredField.setAccessible(true);
            return ((Integer) declaredField.get(fileDescriptor)).intValue();
        } catch (Throwable th) {
            throw new RuntimeException("Failed get fd", th);
        }
    }

    public static Process start(String[] strArr, Map<String, String> map, String str, boolean z6) {
        int length = strArr.length - 1;
        byte[][] bArr = new byte[length][];
        int i7 = length;
        int i8 = 0;
        while (i8 < length) {
            int i9 = i8 + 1;
            byte[] bytes = strArr[i9].getBytes();
            bArr[i8] = bytes;
            i7 += bytes.length;
            i8 = i9;
        }
        byte[] bArr2 = new byte[i7];
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            byte[] bArr3 = bArr[i11];
            System.arraycopy(bArr3, 0, bArr2, i10, bArr3.length);
            i10 += bArr3.length + 1;
        }
        int[] iArr = new int[1];
        return new UNIXProcess(toCString(strArr[0]), bArr2, length, ProcessEnvironment.toEnvironmentBlock(map, iArr), iArr[0], toCString(str), new int[]{-1, -1, -1}, z6);
    }

    private static byte[] toCString(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes();
        int length = bytes.length + 1;
        byte[] bArr = new byte[length];
        System.arraycopy(bytes, 0, bArr, 0, bytes.length);
        bArr[length - 1] = 0;
        return bArr;
    }
}
