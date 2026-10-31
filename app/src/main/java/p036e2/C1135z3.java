package p036e2;

import java.security.MessageDigest;

/* renamed from: e2.z3 */
/* loaded from: classes.dex */
public final class C1135z3 {

    /* renamed from: e2.z3$a */
    public static class a {
        /* renamed from: a */
        public static String m3315a(byte[] bArr) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("md5");
                messageDigest.update(bArr);
                return C1135z3.m3314a(messageDigest.digest());
            } catch (Exception unused) {
                return "";
            }
        }
    }

    /* renamed from: a */
    public static String m3314a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b7 : bArr) {
            int i7 = (b7 >> 4) & 15;
            int i8 = b7 & 15;
            sb.append((char) (i7 >= 10 ? (i7 + 97) - 10 : i7 + 48));
            sb.append((char) (i8 >= 10 ? (i8 + 97) - 10 : i8 + 48));
        }
        return sb.toString();
    }
}
