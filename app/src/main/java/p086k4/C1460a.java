package p086k4;

import java.util.TimeZone;

/* renamed from: k4.a */
/* loaded from: classes.dex */
public final class C1460a {

    /* renamed from: a */
    public static final TimeZone f6975a = TimeZone.getTimeZone("UTC");

    /* renamed from: a */
    public static boolean m3840a(String str, int i7, char c7) {
        return i7 < str.length() && str.charAt(i7) == c7;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00e5 A[Catch: IllegalArgumentException -> 0x01d2, NumberFormatException -> 0x01d4, NumberFormatException | IllegalArgumentException | IndexOutOfBoundsException -> 0x01d6, TRY_LEAVE, TryCatch #2 {NumberFormatException | IllegalArgumentException | IndexOutOfBoundsException -> 0x01d6, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0036, B:13:0x003c, B:18:0x0054, B:20:0x0064, B:21:0x0066, B:23:0x0072, B:24:0x0074, B:26:0x007a, B:30:0x0084, B:35:0x0094, B:37:0x009c, B:38:0x00a0, B:40:0x00a6, B:44:0x00b3, B:47:0x00bd, B:52:0x00df, B:54:0x00e5, B:59:0x019a, B:64:0x00fa, B:65:0x0115, B:66:0x0116, B:69:0x0132, B:71:0x013f, B:74:0x0148, B:76:0x0167, B:79:0x0177, B:80:0x0199, B:81:0x0121, B:82:0x01ca, B:83:0x01d1, B:84:0x00cd, B:85:0x00d0, B:88:0x00b8), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ca A[Catch: IllegalArgumentException -> 0x01d2, NumberFormatException -> 0x01d4, NumberFormatException | IllegalArgumentException | IndexOutOfBoundsException -> 0x01d6, TryCatch #2 {NumberFormatException | IllegalArgumentException | IndexOutOfBoundsException -> 0x01d6, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0036, B:13:0x003c, B:18:0x0054, B:20:0x0064, B:21:0x0066, B:23:0x0072, B:24:0x0074, B:26:0x007a, B:30:0x0084, B:35:0x0094, B:37:0x009c, B:38:0x00a0, B:40:0x00a6, B:44:0x00b3, B:47:0x00bd, B:52:0x00df, B:54:0x00e5, B:59:0x019a, B:64:0x00fa, B:65:0x0115, B:66:0x0116, B:69:0x0132, B:71:0x013f, B:74:0x0148, B:76:0x0167, B:79:0x0177, B:80:0x0199, B:81:0x0121, B:82:0x01ca, B:83:0x01d1, B:84:0x00cd, B:85:0x00d0, B:88:0x00b8), top: B:2:0x0004 }] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Date m3841b(java.lang.String r17, java.text.ParsePosition r18) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p086k4.C1460a.m3841b(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    /* renamed from: c */
    public static int m3842c(int i7, int i8, String str) {
        int i9;
        int i10;
        if (i7 < 0 || i8 > str.length() || i7 > i8) {
            throw new NumberFormatException(str);
        }
        if (i7 < i8) {
            i10 = i7 + 1;
            int digit = Character.digit(str.charAt(i7), 10);
            if (digit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i7, i8));
            }
            i9 = -digit;
        } else {
            i9 = 0;
            i10 = i7;
        }
        while (i10 < i8) {
            int i11 = i10 + 1;
            int digit2 = Character.digit(str.charAt(i10), 10);
            if (digit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i7, i8));
            }
            i9 = (i9 * 10) - digit2;
            i10 = i11;
        }
        return -i9;
    }
}
