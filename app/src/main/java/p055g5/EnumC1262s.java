package p055g5;

import android.text.Editable;
import android.text.Selection;
import androidx.activity.C0143v;
import p002a1.C0017d;
import p022c5.C0637a;
import p022c5.C0638b;
import p022c5.C0641e;
import p022c5.C0642f;
import p022c5.C0645i;
import p022c5.C0650n;
import p023c6.InterfaceC0670p;
import p032d6.AbstractC0899g;
import p032d6.C0898f;
import p079j5.AbstractC1432a;
import p079j5.C1436e;

/* renamed from: g5.s */
/* loaded from: classes.dex */
public enum EnumC1262s {
    UP(f.f6287m, 1),
    DOWN(g.f6288m, 2),
    LEFT(h.f6289m, 1),
    RIGHT(i.f6290m, 2),
    PREVIOUS_WORD_BOUNDARY(j.f6291m, 3),
    NEXT_WORD_BOUNDARY(k.f6292m, 3),
    PAGE_UP(l.f6293m, 3),
    PAGE_DOWN(m.f6294m, 3),
    PAGE_TOP(n.f6295m, 3),
    PAGE_BOTTOM(a.f6282m, 3),
    LINE_START(b.f6283m, 3),
    LINE_END(c.f6284m, 3),
    TEXT_START(d.f6285m, 3),
    TEXT_END(e.f6286m, 3);


    /* renamed from: c */
    public final InterfaceC0670p<C1245b, C0638b, C0638b> f6280c;

    /* renamed from: e */
    public final int f6281e;

    /* renamed from: g5.s$a */
    public static final class a extends AbstractC0899g implements InterfaceC0670p<C1245b, C0638b, C0638b> {

        /* renamed from: m */
        public static final a f6282m = new a();

        public a() {
            super(2);
        }

        @Override // p023c6.InterfaceC0670p
        /* renamed from: b */
        public final C0638b mo237b(C1245b c1245b, C0638b c0638b) {
            C1245b c1245b2 = c1245b;
            C0638b c0638b2 = c0638b;
            C0898f.m2606e(c1245b2, "editor");
            C0898f.m2606e(c0638b2, "pos");
            AbstractC1432a abstractC1432a = c1245b2.f5990C1;
            int i7 = c0638b2.f3142c - abstractC1432a.mo3816v(abstractC1432a.mo3807d(c0638b2.f3140a)).f6901c;
            C1436e mo3816v = abstractC1432a.mo3816v(c1245b2.getLastVisibleRow());
            C0898f.m2605d(mo3816v, "layout.getRowAt(afterIdx)");
            int i8 = mo3816v.f6899a;
            int i9 = mo3816v.f6901c;
            return ((C0637a) c1245b2.getText().m2145q()).m2111q(i8, C0017d.m90o(i7, mo3816v.f6902d - i9) + i9);
        }
    }

    /* renamed from: g5.s$b */
    public static final class b extends AbstractC0899g implements InterfaceC0670p<C1245b, C0638b, C0638b> {

        /* renamed from: m */
        public static final b f6283m = new b();

        public b() {
            super(2);
        }

        @Override // p023c6.InterfaceC0670p
        /* renamed from: b */
        public final C0638b mo237b(C1245b c1245b, C0638b c0638b) {
            int m470w;
            C1245b c1245b2 = c1245b;
            C0638b c0638b2 = c0638b;
            C0898f.m2606e(c1245b2, "editor");
            C0898f.m2606e(c0638b2, "pos");
            return (!c1245b2.getProps().f6103M1 || c0638b2.f3142c == (m470w = (int) (C0143v.m470w(c1245b2.getText().m2146r(c0638b2.f3141b)) >> 32))) ? ((C0637a) c1245b2.getText().m2145q()).m2111q(c0638b2.f3141b, 0) : ((C0637a) c1245b2.getText().m2145q()).m2111q(c0638b2.f3141b, m470w);
        }
    }

    /* renamed from: g5.s$c */
    public static final class c extends AbstractC0899g implements InterfaceC0670p<C1245b, C0638b, C0638b> {

        /* renamed from: m */
        public static final c f6284m = new c();

        public c() {
            super(2);
        }

        @Override // p023c6.InterfaceC0670p
        /* renamed from: b */
        public final C0638b mo237b(C1245b c1245b, C0638b c0638b) {
            int m62A;
            C1245b c1245b2 = c1245b;
            C0638b c0638b2 = c0638b;
            C0898f.m2606e(c1245b2, "editor");
            C0898f.m2606e(c0638b2, "pos");
            return (!c1245b2.getProps().f6103M1 || c0638b2.f3142c == (m62A = C0017d.m62A(C0143v.m470w(c1245b2.getText().m2146r(c0638b2.f3141b))))) ? ((C0637a) c1245b2.getText().m2145q()).m2111q(c0638b2.f3141b, c1245b2.getText().m2142n(c0638b2.f3141b)) : ((C0637a) c1245b2.getText().m2145q()).m2111q(c0638b2.f3141b, m62A);
        }
    }

    /* renamed from: g5.s$d */
    public static final class d extends AbstractC0899g implements InterfaceC0670p<C1245b, C0638b, C0638b> {

        /* renamed from: m */
        public static final d f6285m = new d();

        public d() {
            super(2);
        }

        @Override // p023c6.InterfaceC0670p
        /* renamed from: b */
        public final C0638b mo237b(C1245b c1245b, C0638b c0638b) {
            C0898f.m2606e(c1245b, "<anonymous parameter 0>");
            C0898f.m2606e(c0638b, "<anonymous parameter 1>");
            C0638b c0638b2 = new C0638b();
            c0638b2.f3142c = 0;
            c0638b2.f3141b = 0;
            c0638b2.f3140a = 0;
            return c0638b2;
        }
    }

    /* renamed from: g5.s$e */
    public static final class e extends AbstractC0899g implements InterfaceC0670p<C1245b, C0638b, C0638b> {

        /* renamed from: m */
        public static final e f6286m = new e();

        public e() {
            super(2);
        }

        @Override // p023c6.InterfaceC0670p
        /* renamed from: b */
        public final C0638b mo237b(C1245b c1245b, C0638b c0638b) {
            C1245b c1245b2 = c1245b;
            C0898f.m2606e(c1245b2, "editor");
            C0898f.m2606e(c0638b, "<anonymous parameter 1>");
            return ((C0637a) c1245b2.getText().m2145q()).m2110o(c1245b2.getText().f3154s);
        }
    }

    /* renamed from: g5.s$f */
    public static final class f extends AbstractC0899g implements InterfaceC0670p<C1245b, C0638b, C0638b> {

        /* renamed from: m */
        public static final f f6287m = new f();

        public f() {
            super(2);
        }

        @Override // p023c6.InterfaceC0670p
        /* renamed from: b */
        public final C0638b mo237b(C1245b c1245b, C0638b c0638b) {
            C1245b c1245b2 = c1245b;
            C0638b c0638b2 = c0638b;
            C0898f.m2606e(c1245b2, "editor");
            C0898f.m2606e(c0638b2, "pos");
            long mo3812r = c1245b2.f5990C1.mo3812r(c0638b2.f3141b, c0638b2.f3142c);
            return ((C0637a) c1245b2.getText().m2145q()).m2111q((int) (mo3812r >> 32), C0017d.m62A(mo3812r));
        }
    }

    /* renamed from: g5.s$g */
    public static final class g extends AbstractC0899g implements InterfaceC0670p<C1245b, C0638b, C0638b> {

        /* renamed from: m */
        public static final g f6288m = new g();

        public g() {
            super(2);
        }

        @Override // p023c6.InterfaceC0670p
        /* renamed from: b */
        public final C0638b mo237b(C1245b c1245b, C0638b c0638b) {
            C1245b c1245b2 = c1245b;
            C0638b c0638b2 = c0638b;
            C0898f.m2606e(c1245b2, "editor");
            C0898f.m2606e(c0638b2, "pos");
            long mo3815u = c1245b2.f5990C1.mo3815u(c0638b2.f3141b, c0638b2.f3142c);
            return ((C0637a) c1245b2.getText().m2145q()).m2111q((int) (mo3815u >> 32), C0017d.m62A(mo3815u));
        }
    }

    /* renamed from: g5.s$h */
    public static final class h extends AbstractC0899g implements InterfaceC0670p<C1245b, C0638b, C0638b> {

        /* renamed from: m */
        public static final h f6289m = new h();

        public h() {
            super(2);
        }

        @Override // p023c6.InterfaceC0670p
        /* renamed from: b */
        public final C0638b mo237b(C1245b c1245b, C0638b c0638b) {
            long m68G;
            C1245b c1245b2 = c1245b;
            C0638b c0638b2 = c0638b;
            C0898f.m2606e(c1245b2, "editor");
            C0898f.m2606e(c0638b2, "pos");
            C0645i cursor = c1245b2.getCursor();
            long m68G2 = C0017d.m68G(c0638b2.f3141b, c0638b2.f3142c);
            cursor.getClass();
            int i7 = (int) (m68G2 >> 32);
            int m62A = C0017d.m62A(m68G2);
            C0650n m2169a = C0650n.m2169a();
            C0641e c0641e = cursor.f3164a;
            int m2170b = m2169a.m2170b(m62A, c0641e.m2146r(i7));
            if (m2170b != m62A || m62A != 0) {
                m68G = C0017d.m68G(i7, m2170b);
            } else if (i7 == 0) {
                m68G = 0;
            } else {
                int i8 = i7 - 1;
                m68G = C0017d.m68G(i8, c0641e.m2142n(i8));
            }
            return ((C0637a) c1245b2.getText().m2145q()).m2111q((int) (m68G >> 32), C0017d.m62A(m68G));
        }
    }

    /* renamed from: g5.s$i */
    public static final class i extends AbstractC0899g implements InterfaceC0670p<C1245b, C0638b, C0638b> {

        /* renamed from: m */
        public static final i f6290m = new i();

        public i() {
            super(2);
        }

        @Override // p023c6.InterfaceC0670p
        /* renamed from: b */
        public final C0638b mo237b(C1245b c1245b, C0638b c0638b) {
            long m68G;
            C1245b c1245b2 = c1245b;
            C0638b c0638b2 = c0638b;
            C0898f.m2606e(c1245b2, "editor");
            C0898f.m2606e(c0638b2, "pos");
            C0645i cursor = c1245b2.getCursor();
            long m68G2 = C0017d.m68G(c0638b2.f3141b, c0638b2.f3142c);
            int i7 = (int) (m68G2 >> 32);
            int m62A = C0017d.m62A(m68G2);
            C0641e c0641e = cursor.f3164a;
            int m2142n = c0641e.m2142n(i7);
            C0650n m2169a = C0650n.m2169a();
            C0642f m2146r = c0641e.m2146r(i7);
            int max = Math.max(0, m62A - 64);
            int min = Math.min(m2146r.f3160e, m62A + 64 + 1);
            Editable editable = m2169a.f3184a;
            editable.append((CharSequence) m2146r, max, min);
            Selection.setSelection(editable, Math.min(m62A - max, editable.length()));
            Selection.moveRight(editable, m2169a.f3185b);
            int selectionStart = Selection.getSelectionStart(editable);
            editable.clear();
            Selection.removeSelection(editable);
            int i8 = selectionStart + max;
            if (i8 == m2142n && m62A == i8) {
                int i9 = i7 + 1;
                m68G = i9 == c0641e.m2147s() ? C0017d.m68G(i7, m2142n) : C0017d.m68G(i9, 0);
            } else {
                m68G = C0017d.m68G(i7, i8);
            }
            return ((C0637a) c1245b2.getText().m2145q()).m2111q((int) (m68G >> 32), C0017d.m62A(m68G));
        }
    }

    /* renamed from: g5.s$j */
    public static final class j extends AbstractC0899g implements InterfaceC0670p<C1245b, C0638b, C0638b> {

        /* renamed from: m */
        public static final j f6291m = new j();

        public j() {
            super(2);
        }

        @Override // p023c6.InterfaceC0670p
        /* renamed from: b */
        public final C0638b mo237b(C1245b c1245b, C0638b c0638b) {
            C1245b c1245b2 = c1245b;
            C0638b c0638b2 = c0638b;
            C0898f.m2606e(c1245b2, "editor");
            C0898f.m2606e(c0638b2, "pos");
            C0641e text = c1245b2.getText();
            C0898f.m2605d(text, "editor.text");
            C0638b c0638b3 = C0143v.m472x(c0638b2, text, true).f3186a;
            C0898f.m2605d(c0638b3, "findWord(position, text, true).start");
            return ((C0637a) c1245b2.getText().m2145q()).m2111q(c0638b3.f3141b, c0638b3.f3142c);
        }
    }

    /* renamed from: g5.s$k */
    public static final class k extends AbstractC0899g implements InterfaceC0670p<C1245b, C0638b, C0638b> {

        /* renamed from: m */
        public static final k f6292m = new k();

        public k() {
            super(2);
        }

        @Override // p023c6.InterfaceC0670p
        /* renamed from: b */
        public final C0638b mo237b(C1245b c1245b, C0638b c0638b) {
            C1245b c1245b2 = c1245b;
            C0638b c0638b2 = c0638b;
            C0898f.m2606e(c1245b2, "editor");
            C0898f.m2606e(c0638b2, "pos");
            C0641e text = c1245b2.getText();
            C0898f.m2605d(text, "editor.text");
            C0638b c0638b3 = C0143v.m472x(c0638b2, text, false).f3187b;
            C0898f.m2605d(c0638b3, "findWord(position, text).end");
            return ((C0637a) c1245b2.getText().m2145q()).m2111q(c0638b3.f3141b, c0638b3.f3142c);
        }
    }

    /* renamed from: g5.s$l */
    public static final class l extends AbstractC0899g implements InterfaceC0670p<C1245b, C0638b, C0638b> {

        /* renamed from: m */
        public static final l f6293m = new l();

        public l() {
            super(2);
        }

        @Override // p023c6.InterfaceC0670p
        /* renamed from: b */
        public final C0638b mo237b(C1245b c1245b, C0638b c0638b) {
            C1245b c1245b2 = c1245b;
            C0638b c0638b2 = c0638b;
            C0898f.m2606e(c1245b2, "editor");
            C0898f.m2606e(c0638b2, "pos");
            AbstractC1432a abstractC1432a = c1245b2.f5990C1;
            int mo3807d = abstractC1432a.mo3807d(c0638b2.f3140a);
            int m90o = C0017d.m90o(mo3807d - ((int) Math.ceil(c1245b2.getHeight() / c1245b2.getRowHeight())), abstractC1432a.mo3806a() - 1);
            int i7 = c0638b2.f3142c - abstractC1432a.mo3816v(mo3807d).f6901c;
            C1436e mo3816v = abstractC1432a.mo3816v(m90o);
            C0898f.m2605d(mo3816v, "layout.getRowAt(afterIdx)");
            int i8 = mo3816v.f6899a;
            int i9 = mo3816v.f6901c;
            return ((C0637a) c1245b2.getText().m2145q()).m2111q(i8, C0017d.m90o(i7, mo3816v.f6902d - i9) + i9);
        }
    }

    /* renamed from: g5.s$m */
    public static final class m extends AbstractC0899g implements InterfaceC0670p<C1245b, C0638b, C0638b> {

        /* renamed from: m */
        public static final m f6294m = new m();

        public m() {
            super(2);
        }

        @Override // p023c6.InterfaceC0670p
        /* renamed from: b */
        public final C0638b mo237b(C1245b c1245b, C0638b c0638b) {
            C1245b c1245b2 = c1245b;
            C0638b c0638b2 = c0638b;
            C0898f.m2606e(c1245b2, "editor");
            C0898f.m2606e(c0638b2, "pos");
            AbstractC1432a abstractC1432a = c1245b2.f5990C1;
            int mo3807d = abstractC1432a.mo3807d(c0638b2.f3140a);
            int m90o = C0017d.m90o(((int) Math.ceil(c1245b2.getHeight() / c1245b2.getRowHeight())) + mo3807d, abstractC1432a.mo3806a() - 1);
            int i7 = c0638b2.f3142c - abstractC1432a.mo3816v(mo3807d).f6901c;
            C1436e mo3816v = abstractC1432a.mo3816v(m90o);
            C0898f.m2605d(mo3816v, "layout.getRowAt(afterIdx)");
            int i8 = mo3816v.f6899a;
            int i9 = mo3816v.f6901c;
            return ((C0637a) c1245b2.getText().m2145q()).m2111q(i8, C0017d.m90o(i7, mo3816v.f6902d - i9) + i9);
        }
    }

    /* renamed from: g5.s$n */
    public static final class n extends AbstractC0899g implements InterfaceC0670p<C1245b, C0638b, C0638b> {

        /* renamed from: m */
        public static final n f6295m = new n();

        public n() {
            super(2);
        }

        @Override // p023c6.InterfaceC0670p
        /* renamed from: b */
        public final C0638b mo237b(C1245b c1245b, C0638b c0638b) {
            C1245b c1245b2 = c1245b;
            C0638b c0638b2 = c0638b;
            C0898f.m2606e(c1245b2, "editor");
            C0898f.m2606e(c0638b2, "pos");
            AbstractC1432a abstractC1432a = c1245b2.f5990C1;
            int i7 = c0638b2.f3142c - abstractC1432a.mo3816v(abstractC1432a.mo3807d(c0638b2.f3140a)).f6901c;
            C1436e mo3816v = abstractC1432a.mo3816v(c1245b2.getFirstVisibleRow());
            C0898f.m2605d(mo3816v, "layout.getRowAt(afterIdx)");
            int i8 = mo3816v.f6899a;
            int i9 = mo3816v.f6901c;
            return ((C0637a) c1245b2.getText().m2145q()).m2111q(i8, C0017d.m90o(i7, mo3816v.f6902d - i9) + i9);
        }
    }

    EnumC1262s(InterfaceC0670p interfaceC0670p, int i7) {
        this.f6280c = interfaceC0670p;
        this.f6281e = i7;
    }
}
