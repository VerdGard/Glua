package p047f5;

import java.util.Arrays;

/* renamed from: f5.h */
/* loaded from: classes.dex */
public final class C1177h {

    /* renamed from: a */
    public static int[] f5762a;

    /* renamed from: b */
    public static int[] f5763b;

    static {
        if (f5762a != null) {
            return;
        }
        int[] iArr = new int[2048];
        f5763b = iArr;
        f5762a = new int[2048];
        Arrays.fill(iArr, 0);
        Arrays.fill(f5762a, 0);
        for (int i7 = 0; i7 <= 65535; i7++) {
            char c7 = (char) i7;
            if (Character.isJavaIdentifierPart(c7)) {
                int[] iArr2 = f5763b;
                int i8 = i7 / 32;
                iArr2[i8] = iArr2[i8] | (1 << (i7 % 32));
            }
            if (Character.isJavaIdentifierStart(c7)) {
                int[] iArr3 = f5762a;
                int i9 = i7 / 32;
                iArr3[i9] = (1 << (i7 % 32)) | iArr3[i9];
            }
        }
    }

    /* renamed from: a */
    public static boolean m3385a(char c7) {
        return (c7 >= 'a' && c7 <= 'z') || (c7 >= 'A' && c7 <= 'Z');
    }

    /* renamed from: b */
    public static boolean m3386b(char c7) {
        return ((1 << (c7 % ' ')) & f5763b[c7 / ' ']) != 0;
    }
}
