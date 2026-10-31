package p186x4;

import android.util.SparseArray;

/* renamed from: x4.b */
/* loaded from: classes.dex */
public final class C2194b {

    /* renamed from: d */
    public static final SparseArray<EnumC2196d> f9942d = new SparseArray<>();

    /* renamed from: c */
    public final String f9945c;

    /* renamed from: b */
    public int f9944b = 0;

    /* renamed from: a */
    public int f9943a = 0;

    static {
        for (EnumC2196d enumC2196d : EnumC2196d.values()) {
            char c7 = enumC2196d.f9966c;
            if (c7 != 0) {
                f9942d.put(c7, enumC2196d);
            }
        }
    }

    public C2194b(String str) {
        this.f9945c = str;
    }

    /* renamed from: a */
    public static boolean m5334a(char c7) {
        return (c7 >= 'a' && c7 <= 'z') || (c7 >= 'A' && c7 <= 'Z') || c7 == '_';
    }

    /* renamed from: b */
    public final C2195c m5335b() {
        EnumC2196d enumC2196d;
        int i7 = this.f9943a + this.f9944b;
        this.f9943a = i7;
        this.f9944b = 0;
        String str = this.f9945c;
        if (i7 >= str.length()) {
            enumC2196d = EnumC2196d.EOF;
        } else {
            char charAt = str.charAt(this.f9943a);
            SparseArray<EnumC2196d> sparseArray = f9942d;
            EnumC2196d enumC2196d2 = sparseArray.get(charAt);
            if (enumC2196d2 != null) {
                this.f9944b = 1;
                enumC2196d = enumC2196d2;
            } else if (Character.isDigit(charAt)) {
                this.f9944b = 1;
                while (this.f9943a + this.f9944b < str.length() && Character.isDigit(str.charAt(this.f9943a + this.f9944b))) {
                    this.f9944b++;
                }
                enumC2196d = EnumC2196d.Int;
            } else if (m5334a(charAt)) {
                this.f9944b = 1;
                while (this.f9943a + this.f9944b < str.length()) {
                    char charAt2 = str.charAt(this.f9943a + this.f9944b);
                    if (!m5334a(charAt2) && !Character.isDigit(charAt2)) {
                        break;
                    }
                    this.f9944b++;
                }
                enumC2196d = EnumC2196d.VariableName;
            } else {
                while (this.f9943a + this.f9944b < str.length() && !Character.isDigit(charAt) && !m5334a(charAt) && sparseArray.get(charAt) == null) {
                    int i8 = this.f9944b + 1;
                    this.f9944b = i8;
                    if (this.f9943a + i8 < str.length()) {
                        charAt = str.charAt(this.f9943a + this.f9944b);
                    }
                }
                enumC2196d = EnumC2196d.Format;
            }
        }
        return new C2195c(this.f9943a, this.f9944b, enumC2196d);
    }
}
