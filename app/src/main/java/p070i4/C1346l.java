package p070i4;

/* renamed from: i4.l */
/* loaded from: classes.dex */
public final class C1346l {

    /* renamed from: a */
    public static final int f6569a;

    static {
        int i7;
        String property = System.getProperty("java.version");
        try {
            String[] split = property.split("[._]");
            i7 = Integer.parseInt(split[0]);
            if (i7 == 1 && split.length > 1) {
                i7 = Integer.parseInt(split[1]);
            }
        } catch (NumberFormatException unused) {
            i7 = -1;
        }
        if (i7 == -1) {
            try {
                StringBuilder sb = new StringBuilder();
                for (int i8 = 0; i8 < property.length(); i8++) {
                    char charAt = property.charAt(i8);
                    if (!Character.isDigit(charAt)) {
                        break;
                    }
                    sb.append(charAt);
                }
                i7 = Integer.parseInt(sb.toString());
            } catch (NumberFormatException unused2) {
                i7 = -1;
            }
        }
        if (i7 == -1) {
            i7 = 6;
        }
        f6569a = i7;
    }
}
