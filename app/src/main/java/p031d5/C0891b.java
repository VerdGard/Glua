package p031d5;

import java.util.Objects;
import p002a1.C0017d;
import p022c5.C0641e;
import p022c5.InterfaceC0643g;

/* renamed from: d5.b */
/* loaded from: classes.dex */
public final class C0891b implements InterfaceC0643g {

    /* renamed from: c */
    public final a[] f4672c = new a[64];

    /* renamed from: e */
    public final C0641e f4673e;

    /* renamed from: m */
    public boolean f4674m;

    /* renamed from: d5.b$a */
    public static class a {

        /* renamed from: a */
        public final C0892c f4675a;

        /* renamed from: b */
        public int f4676b;

        public a(C0892c c0892c, int i7) {
            this.f4675a = c0892c;
            this.f4676b = i7;
        }
    }

    public C0891b(C0641e c0641e) {
        Objects.requireNonNull(c0641e);
        this.f4673e = c0641e;
        c0641e.m2129a(this);
    }

    /* renamed from: b */
    public final C0892c m2596b(int i7) {
        if (!this.f4674m) {
            return new C0892c(new long[]{C0017d.m68G(0, 0)}, this.f4673e.m2146r(i7).f3160e);
        }
        synchronized (this) {
            int i8 = 0;
            while (true) {
                a[] aVarArr = this.f4672c;
                if (i8 >= aVarArr.length) {
                    C0892c m98w = C0017d.m98w(this.f4673e.m2146r(i7));
                    synchronized (this) {
                        a[] aVarArr2 = this.f4672c;
                        System.arraycopy(aVarArr2, 0, aVarArr2, 1, aVarArr2.length - 1);
                        this.f4672c[0] = new a(m98w, i7);
                    }
                    return m98w;
                }
                a aVar = aVarArr[i8];
                if (aVar != null && aVar.f4676b == i7) {
                    return aVar.f4675a;
                }
                i8++;
            }
        }
    }

    @Override // p022c5.InterfaceC0643g
    /* renamed from: c */
    public final void mo2102c(C0641e c0641e) {
    }

    @Override // p022c5.InterfaceC0643g
    /* renamed from: n */
    public final synchronized void mo2109n(C0641e c0641e, int i7, int i8, int i9, int i10, StringBuilder sb) {
        int i11;
        int i12 = i9 - i7;
        int i13 = 0;
        while (true) {
            a[] aVarArr = this.f4672c;
            if (i13 < aVarArr.length) {
                a aVar = aVarArr[i13];
                if (aVar != null && (i11 = aVar.f4676b) >= i7) {
                    if (i11 > i9) {
                        aVar.f4676b = i11 - i12;
                    } else {
                        aVarArr[i13] = null;
                    }
                }
                i13++;
            }
        }
    }

    @Override // p022c5.InterfaceC0643g
    /* renamed from: y */
    public final synchronized void mo2113y(C0641e c0641e, int i7, int i8, int i9, int i10, CharSequence charSequence) {
        int i11 = i9 - i7;
        int i12 = 0;
        while (true) {
            a[] aVarArr = this.f4672c;
            if (i12 < aVarArr.length) {
                a aVar = aVarArr[i12];
                if (aVar != null) {
                    int i13 = aVar.f4676b;
                    if (i13 > i7) {
                        aVar.f4676b = i13 + i11;
                    } else if (i13 == i7) {
                        aVarArr[i12] = null;
                    }
                }
                i12++;
            }
        }
    }

    @Override // p022c5.InterfaceC0643g
    /* renamed from: z */
    public final /* synthetic */ void mo2114z(C0641e c0641e) {
    }
}
