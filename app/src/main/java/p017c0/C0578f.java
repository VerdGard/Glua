package p017c0;

/* renamed from: c0.f */
/* loaded from: classes.dex */
public final class C0578f {

    /* renamed from: a */
    public static final d f2943a = new d(null, false);

    /* renamed from: b */
    public static final d f2944b = new d(null, true);

    /* renamed from: c */
    public static final d f2945c;

    /* renamed from: d */
    public static final d f2946d;

    /* renamed from: c0.f$a */
    public static class a implements b {

        /* renamed from: a */
        public static final a f2947a = new a();

        @Override // p017c0.C0578f.b
        /* renamed from: a */
        public final int mo2022a(int i7, CharSequence charSequence) {
            int i8 = i7 + 0;
            int i9 = 2;
            for (int i10 = 0; i10 < i8 && i9 == 2; i10++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i10));
                d dVar = C0578f.f2943a;
                if (directionality != 0) {
                    if (directionality != 1 && directionality != 2) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                break;
                            case 16:
                            case 17:
                                break;
                            default:
                                i9 = 2;
                                break;
                        }
                    }
                    i9 = 0;
                }
                i9 = 1;
            }
            return i9;
        }
    }

    /* renamed from: c0.f$b */
    public interface b {
        /* renamed from: a */
        int mo2022a(int i7, CharSequence charSequence);
    }

    /* renamed from: c0.f$c */
    public static abstract class c implements InterfaceC0577e {

        /* renamed from: a */
        public final b f2948a;

        public c(a aVar) {
            this.f2948a = aVar;
        }

        /* renamed from: a */
        public abstract boolean mo2023a();

        /* renamed from: b */
        public final boolean m2024b(int i7, CharSequence charSequence) {
            if (charSequence == null || i7 < 0 || charSequence.length() - i7 < 0) {
                throw new IllegalArgumentException();
            }
            b bVar = this.f2948a;
            if (bVar == null) {
                return mo2023a();
            }
            int mo2022a = bVar.mo2022a(i7, charSequence);
            if (mo2022a == 0) {
                return true;
            }
            if (mo2022a != 1) {
                return mo2023a();
            }
            return false;
        }
    }

    /* renamed from: c0.f$d */
    public static class d extends c {

        /* renamed from: b */
        public final boolean f2949b;

        public d(a aVar, boolean z6) {
            super(aVar);
            this.f2949b = z6;
        }

        @Override // p017c0.C0578f.c
        /* renamed from: a */
        public final boolean mo2023a() {
            return this.f2949b;
        }
    }

    static {
        a aVar = a.f2947a;
        f2945c = new d(aVar, false);
        f2946d = new d(aVar, true);
    }
}
