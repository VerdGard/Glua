package p022c5;

/* renamed from: c5.l */
/* loaded from: classes.dex */
public final class C0648l {

    /* renamed from: e */
    public static final C0648l[] f3171e = new C0648l[8];

    /* renamed from: a */
    public CharSequence f3172a;

    /* renamed from: b */
    public int f3173b;

    /* renamed from: c */
    public int f3174c;

    /* renamed from: d */
    public int f3175d;

    /* renamed from: a */
    public final int m2167a() {
        char charAt;
        int i7 = this.f3174c;
        this.f3173b = i7;
        if (i7 == this.f3175d) {
            return 2;
        }
        char charAt2 = this.f3172a.charAt(i7);
        if (charAt2 == '\n') {
            this.f3174c = this.f3173b + 1;
            return 1;
        }
        if (charAt2 == '\r') {
            int i8 = this.f3173b;
            this.f3174c = (i8 + 1 >= this.f3175d || this.f3172a.charAt(i8 + 1) != '\n') ? this.f3173b + 1 : this.f3173b + 2;
            return 1;
        }
        int i9 = this.f3173b;
        while (true) {
            this.f3174c = i9 + 1;
            int i10 = this.f3174c;
            if (i10 >= this.f3175d || (charAt = this.f3172a.charAt(i10)) == '\n' || charAt == '\r') {
                return 0;
            }
            i9 = this.f3174c;
        }
    }

    /* renamed from: b */
    public final void m2168b() {
        synchronized (C0648l.class) {
            int i7 = 0;
            while (true) {
                C0648l[] c0648lArr = f3171e;
                if (i7 >= 8) {
                    break;
                }
                if (c0648lArr[i7] == null) {
                    c0648lArr[i7] = this;
                    this.f3172a = null;
                    this.f3173b = 0;
                    this.f3175d = 0;
                    break;
                }
                i7++;
            }
        }
    }
}
