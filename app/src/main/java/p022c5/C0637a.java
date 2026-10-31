package p022c5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: c5.a */
/* loaded from: classes.dex */
public final class C0637a implements InterfaceC0647k, InterfaceC0643g {

    /* renamed from: X */
    public final int f3134X;

    /* renamed from: Y */
    public final int f3135Y;

    /* renamed from: c */
    public final C0641e f3136c;

    /* renamed from: e */
    public final C0638b f3137e;

    /* renamed from: m */
    public final C0638b f3138m;

    /* renamed from: s */
    public final ArrayList f3139s;

    public C0637a(C0641e c0641e) {
        C0638b c0638b = new C0638b();
        c0638b.f3142c = 0;
        c0638b.f3141b = 0;
        c0638b.f3140a = 0;
        this.f3137e = c0638b;
        this.f3138m = new C0638b();
        this.f3139s = new ArrayList();
        this.f3134X = 50;
        this.f3135Y = 50;
        this.f3136c = c0641e;
        m2101C();
    }

    /* renamed from: b */
    public static void m2099b(int i7, int i8, C0638b c0638b) {
        if (c0638b.f3141b != i7) {
            throw new IllegalArgumentException("can not find other lines with findInLine()");
        }
        c0638b.f3140a = (c0638b.f3140a - c0638b.f3142c) + i8;
        c0638b.f3142c = i8;
    }

    /* renamed from: B */
    public final synchronized void m2100B(C0638b c0638b) {
        if (this.f3135Y <= 0) {
            return;
        }
        this.f3139s.add(c0638b);
        if (this.f3139s.size() > this.f3135Y) {
            this.f3139s.remove(0);
        }
    }

    /* renamed from: C */
    public final void m2101C() {
        C0641e c0641e = this.f3136c;
        int i7 = c0641e.f3154s;
        C0638b c0638b = this.f3138m;
        c0638b.f3140a = i7;
        c0638b.f3141b = c0641e.m2147s() - 1;
        c0638b.f3142c = c0641e.m2142n(c0638b.f3141b);
    }

    @Override // p022c5.InterfaceC0643g
    /* renamed from: c */
    public final void mo2102c(C0641e c0641e) {
    }

    /* renamed from: e */
    public final void m2103e(C0638b c0638b, int i7, C0638b c0638b2) {
        int i8 = c0638b.f3140a;
        if (i8 < i7) {
            throw new IllegalArgumentException("Unable to find forward from method findIndexBackward()");
        }
        int i9 = c0638b.f3141b;
        int i10 = c0638b.f3142c;
        while (i8 > i7) {
            i8 -= i10 + 1;
            i9--;
            if (i9 == -1) {
                m2104f(this.f3137e, i7, c0638b2);
                return;
            } else {
                i10 = this.f3136c.m2143o(i9) + Math.max(r5.m2149u(i9).f3182e - 1, 0);
            }
        }
        int i11 = i7 - i8;
        if (i11 > 0) {
            i9++;
            i10 = i11 - 1;
        }
        c0638b2.f3142c = i10;
        c0638b2.f3141b = i9;
        c0638b2.f3140a = i7;
    }

    /* renamed from: f */
    public final void m2104f(C0638b c0638b, int i7, C0638b c0638b2) {
        int i8 = c0638b.f3140a;
        if (i8 > i7) {
            throw new IllegalArgumentException("Unable to find backward from method findIndexForward()");
        }
        int i9 = c0638b.f3141b;
        int i10 = c0638b.f3142c;
        C0641e c0641e = this.f3136c;
        int m2143o = c0641e.m2143o(i9) + Math.max(c0641e.m2149u(i9).f3182e - 1, 0);
        int i11 = (m2143o - i10) + i8;
        while (i11 < i7) {
            i9++;
            m2143o = c0641e.m2143o(i9) + Math.max(c0641e.m2149u(i9).f3182e - 1, 0);
            i11 += m2143o + 1;
        }
        if (i11 > i7) {
            m2143o -= i11 - i7;
        }
        c0638b2.f3142c = m2143o;
        c0638b2.f3141b = i9;
        c0638b2.f3140a = i7;
    }

    /* renamed from: g */
    public final void m2105g(C0638b c0638b, int i7, int i8, C0638b c0638b2) {
        int i9 = c0638b.f3141b;
        if (i9 < i7) {
            throw new IllegalArgumentException("can not find forward from findLiCoBackward()");
        }
        int i10 = c0638b.f3140a - c0638b.f3142c;
        while (i9 > i7) {
            i9--;
            C0641e c0641e = this.f3136c;
            i10 -= c0641e.m2143o(i9) + c0641e.m2149u(i9).f3182e;
        }
        c0638b2.f3142c = 0;
        c0638b2.f3141b = i9;
        c0638b2.f3140a = i10;
        m2099b(i7, i8, c0638b2);
    }

    /* renamed from: h */
    public final void m2106h(C0638b c0638b, int i7, int i8, C0638b c0638b2) {
        int i9 = c0638b.f3141b;
        if (i9 > i7) {
            throw new IllegalArgumentException("can not find backward from findLiCoForward()");
        }
        int i10 = c0638b.f3140a - c0638b.f3142c;
        while (i9 < i7) {
            C0641e c0641e = this.f3136c;
            i10 += c0641e.m2143o(i9) + c0641e.m2149u(i9).f3182e;
            i9++;
        }
        c0638b2.f3142c = 0;
        c0638b2.f3141b = i9;
        c0638b2.f3140a = i10;
        m2099b(i7, i8, c0638b2);
    }

    /* renamed from: i */
    public final synchronized C0638b m2107i(int i7) {
        C0638b c0638b;
        c0638b = this.f3137e;
        int i8 = i7;
        int i9 = i8;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= this.f3139s.size()) {
                break;
            }
            C0638b c0638b2 = (C0638b) this.f3139s.get(i10);
            int abs = Math.abs(c0638b2.f3140a - i7);
            if (abs < i8) {
                i11 = i10;
                c0638b = c0638b2;
                i8 = abs;
            }
            if (abs <= this.f3134X) {
                i9 = abs;
                break;
            }
            i10++;
            i9 = abs;
        }
        if (Math.abs(this.f3138m.f3140a - i7) < i9) {
            c0638b = this.f3138m;
        }
        if (c0638b != this.f3137e && c0638b != this.f3138m) {
            Collections.swap(this.f3139s, i11, 0);
        }
        return c0638b;
    }

    /* renamed from: k */
    public final synchronized C0638b m2108k(int i7) {
        C0638b c0638b;
        c0638b = this.f3137e;
        int i8 = i7;
        int i9 = i8;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= this.f3139s.size()) {
                break;
            }
            C0638b c0638b2 = (C0638b) this.f3139s.get(i10);
            int abs = Math.abs(c0638b2.f3141b - i7);
            if (abs < i8) {
                i11 = i10;
                c0638b = c0638b2;
                i8 = abs;
            }
            if (i8 <= 50) {
                i9 = abs;
                break;
            }
            i10++;
            i9 = abs;
        }
        if (Math.abs(this.f3138m.f3141b - i7) < i9) {
            c0638b = this.f3138m;
        }
        if (c0638b != this.f3137e && c0638b != this.f3138m) {
            Collections.swap(this.f3139s, 0, i11);
        }
        return c0638b;
    }

    @Override // p022c5.InterfaceC0643g
    /* renamed from: n */
    public final synchronized void mo2109n(C0641e c0641e, int i7, int i8, int i9, int i10, StringBuilder sb) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f3139s.iterator();
        while (it.hasNext()) {
            C0638b c0638b = (C0638b) it.next();
            int i11 = c0638b.f3141b;
            if (i11 == i7) {
                if (c0638b.f3142c >= i8) {
                    arrayList.add(c0638b);
                }
            } else if (i11 > i7) {
                if (i11 >= i9 && i11 != i9) {
                    c0638b.f3140a -= sb.length();
                    c0638b.f3141b -= i9 - i7;
                }
                arrayList.add(c0638b);
            }
        }
        this.f3139s.removeAll(arrayList);
        m2101C();
    }

    /* renamed from: o */
    public final C0638b m2110o(int i7) {
        C0638b c0638b = new C0638b();
        m2112x(i7, c0638b);
        return c0638b;
    }

    /* renamed from: q */
    public final C0638b m2111q(int i7, int i8) {
        C0638b c0638b = new C0638b();
        C0641e c0641e = this.f3136c;
        c0641e.m2134f(i7, i8);
        c0641e.m2154z(false);
        try {
            C0638b m2108k = m2108k(i7);
            int i9 = m2108k.f3141b;
            if (i9 == i7) {
                c0638b.f3140a = m2108k.f3140a;
                c0638b.f3141b = i9;
                c0638b.f3142c = m2108k.f3142c;
                if (m2108k.f3142c == i8) {
                    return c0638b;
                }
                m2099b(i7, i8, c0638b);
            } else if (i9 < i7) {
                m2106h(m2108k, i7, i8, c0638b);
            } else {
                m2105g(m2108k, i7, i8, c0638b);
            }
            if (Math.abs(m2108k.f3141b - i7) > 50) {
                m2100B(c0638b.m2115a());
            }
            return c0638b;
        } finally {
            c0641e.m2128L(false);
        }
    }

    /* renamed from: x */
    public final void m2112x(int i7, C0638b c0638b) {
        C0641e c0641e = this.f3136c;
        c0641e.m2132d(i7);
        c0641e.m2154z(false);
        try {
            C0638b m2107i = m2107i(i7);
            int i8 = m2107i.f3140a;
            if (i8 == i7) {
                c0638b.f3140a = i8;
                c0638b.f3141b = m2107i.f3141b;
                c0638b.f3142c = m2107i.f3142c;
            } else if (i8 < i7) {
                m2104f(m2107i, i7, c0638b);
            } else {
                m2103e(m2107i, i7, c0638b);
            }
            if (Math.abs(i7 - m2107i.f3140a) >= this.f3134X) {
                m2100B(c0638b.m2115a());
            }
        } finally {
            c0641e.m2128L(false);
        }
    }

    @Override // p022c5.InterfaceC0643g
    /* renamed from: y */
    public final synchronized void mo2113y(C0641e c0641e, int i7, int i8, int i9, int i10, CharSequence charSequence) {
        Iterator it = this.f3139s.iterator();
        while (it.hasNext()) {
            C0638b c0638b = (C0638b) it.next();
            int i11 = c0638b.f3141b;
            if (i11 == i7) {
                if (c0638b.f3142c >= i8) {
                    c0638b.f3140a += charSequence.length();
                    c0638b.f3141b = (i9 - i7) + c0638b.f3141b;
                    c0638b.f3142c = (c0638b.f3142c + i10) - i8;
                }
            } else if (i11 > i7) {
                c0638b.f3140a += charSequence.length();
                c0638b.f3141b = (i9 - i7) + c0638b.f3141b;
            }
        }
        m2101C();
    }

    @Override // p022c5.InterfaceC0643g
    /* renamed from: z */
    public final /* synthetic */ void mo2114z(C0641e c0641e) {
    }
}
