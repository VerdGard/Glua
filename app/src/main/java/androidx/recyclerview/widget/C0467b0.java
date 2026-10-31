package androidx.recyclerview.widget;

import android.view.View;

/* renamed from: androidx.recyclerview.widget.b0 */
/* loaded from: classes.dex */
public final class C0467b0 {

    /* renamed from: a */
    public final b f2357a;

    /* renamed from: b */
    public final a f2358b = new a();

    /* renamed from: androidx.recyclerview.widget.b0$a */
    public static class a {

        /* renamed from: a */
        public int f2359a = 0;

        /* renamed from: b */
        public int f2360b;

        /* renamed from: c */
        public int f2361c;

        /* renamed from: d */
        public int f2362d;

        /* renamed from: e */
        public int f2363e;

        /* renamed from: a */
        public final boolean m1761a() {
            int i7 = this.f2359a;
            int i8 = 2;
            if ((i7 & 7) != 0) {
                int i9 = this.f2362d;
                int i10 = this.f2360b;
                if ((((i9 > i10 ? 1 : i9 == i10 ? 2 : 4) << 0) & i7) == 0) {
                    return false;
                }
            }
            if ((i7 & 112) != 0) {
                int i11 = this.f2362d;
                int i12 = this.f2361c;
                if ((((i11 > i12 ? 1 : i11 == i12 ? 2 : 4) << 4) & i7) == 0) {
                    return false;
                }
            }
            if ((i7 & 1792) != 0) {
                int i13 = this.f2363e;
                int i14 = this.f2360b;
                if ((((i13 > i14 ? 1 : i13 == i14 ? 2 : 4) << 8) & i7) == 0) {
                    return false;
                }
            }
            if ((i7 & 28672) != 0) {
                int i15 = this.f2363e;
                int i16 = this.f2361c;
                if (i15 > i16) {
                    i8 = 1;
                } else if (i15 != i16) {
                    i8 = 4;
                }
                if ((i7 & (i8 << 12)) == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: androidx.recyclerview.widget.b0$b */
    public interface b {
        /* renamed from: a */
        int mo1646a();

        /* renamed from: b */
        int mo1647b(View view);

        /* renamed from: c */
        View mo1648c(int i7);

        /* renamed from: d */
        int mo1649d();

        /* renamed from: e */
        int mo1650e(View view);
    }

    public C0467b0(b bVar) {
        this.f2357a = bVar;
    }

    /* renamed from: a */
    public final View m1759a(int i7, int i8, int i9, int i10) {
        b bVar = this.f2357a;
        int mo1649d = bVar.mo1649d();
        int mo1646a = bVar.mo1646a();
        int i11 = i8 > i7 ? 1 : -1;
        View view = null;
        while (i7 != i8) {
            View mo1648c = bVar.mo1648c(i7);
            int mo1647b = bVar.mo1647b(mo1648c);
            int mo1650e = bVar.mo1650e(mo1648c);
            a aVar = this.f2358b;
            aVar.f2360b = mo1649d;
            aVar.f2361c = mo1646a;
            aVar.f2362d = mo1647b;
            aVar.f2363e = mo1650e;
            if (i9 != 0) {
                aVar.f2359a = i9 | 0;
                if (aVar.m1761a()) {
                    return mo1648c;
                }
            }
            if (i10 != 0) {
                aVar.f2359a = i10 | 0;
                if (aVar.m1761a()) {
                    view = mo1648c;
                }
            }
            i7 += i11;
        }
        return view;
    }

    /* renamed from: b */
    public final boolean m1760b(View view) {
        b bVar = this.f2357a;
        int mo1649d = bVar.mo1649d();
        int mo1646a = bVar.mo1646a();
        int mo1647b = bVar.mo1647b(view);
        int mo1650e = bVar.mo1650e(view);
        a aVar = this.f2358b;
        aVar.f2360b = mo1649d;
        aVar.f2361c = mo1646a;
        aVar.f2362d = mo1647b;
        aVar.f2363e = mo1650e;
        aVar.f2359a = 24579 | 0;
        return aVar.m1761a();
    }
}
