package p071i5;

import android.content.Context;
import android.ext.C0089a;
import android.ext.C0090b;
import android.ext.C0091c;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.activity.RunnableC0119d;
import androidx.activity.RunnableC0125j;
import java.lang.ref.WeakReference;
import java.util.List;
import p006a5.C0057g;
import p021c4.C0623k;
import p022c5.C0638b;
import p022c5.C0641e;
import p022c5.C0644h;
import p022c5.C0645i;
import p022c5.C0652p;
import p023c6.InterfaceC0666l;
import p055g5.C1245b;
import p063h5.C1302a;
import p071i5.C1374k;
import p079j5.AbstractC1432a;
import p079j5.InterfaceC1433b;
import p095l5.C1510a;
import p132q4.AbstractC1786o;
import p132q4.C1772b;
import p132q4.C1773b0;
import p132q4.C1774c;
import p132q4.C1775d;
import p132q4.C1780i;
import p132q4.C1781j;
import p132q4.C1782k;
import p132q4.C1783l;
import p132q4.C1785n;
import p132q4.C1787p;
import p132q4.C1795x;
import p132q4.C1796y;
import p132q4.C1797z;
import p132q4.InterfaceC1788q;
import p147s3.C1882d;
import p148s4.InterfaceC1885b;
import p171v4.AbstractC2020d;
import p171v4.C2019c;
import p171v4.C2024h;

/* renamed from: i5.k */
/* loaded from: classes.dex */
public final class C1374k extends C1302a implements InterfaceC1375l {

    /* renamed from: B1 */
    public final C1245b f6672B1;

    /* renamed from: C1 */
    public boolean f6673C1;

    /* renamed from: D1 */
    public long f6674D1;

    /* renamed from: E1 */
    public int f6675E1;

    /* renamed from: F1 */
    public a f6676F1;

    /* renamed from: G1 */
    public C2024h f6677G1;

    /* renamed from: H1 */
    public WeakReference<List<AbstractC2020d>> f6678H1;

    /* renamed from: I1 */
    public int f6679I1;

    /* renamed from: J1 */
    public final C1358b f6680J1;

    /* renamed from: K1 */
    public InterfaceC1356a f6681K1;

    /* renamed from: L1 */
    public final C1787p f6682L1;

    /* renamed from: M1 */
    public C0638b f6683M1;

    /* renamed from: N1 */
    public long f6684N1;

    /* renamed from: O1 */
    public long f6685O1;

    /* renamed from: P1 */
    public boolean f6686P1;

    /* renamed from: Q1 */
    public boolean f6687Q1;

    /* renamed from: i5.k$a */
    public class a extends Thread implements C0652p.a {

        /* renamed from: X */
        public long f6688X;

        /* renamed from: Y */
        public boolean f6689Y;

        /* renamed from: c */
        public final C0638b f6691c;

        /* renamed from: e */
        public final InterfaceC1885b f6692e;

        /* renamed from: m */
        public final C0644h f6693m;

        /* renamed from: s */
        public final C2024h f6694s;

        public a(long j7, C2024h c2024h) {
            this.f6688X = j7;
            this.f6691c = C1374k.this.f6672B1.getCursor().m2164b();
            C1245b c1245b = C1374k.this.f6672B1;
            this.f6692e = c1245b.getEditorLanguage();
            C0644h c0644h = new C0644h(c1245b.getText());
            this.f6693m = c0644h;
            c0644h.f3191s = this;
            this.f6694s = c2024h;
            c1245b.getExtraArguments();
            this.f6689Y = false;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            C2024h c2024h = this.f6694s;
            try {
                this.f6692e.mo4420e(this.f6693m, this.f6691c, c2024h);
                int i7 = 1;
                boolean z6 = c2024h.f9193b.size() + c2024h.f9192a.size() > 0;
                C1374k c1374k = C1374k.this;
                if (!z6) {
                    c1374k.f6672B1.m3489e0(new RunnableC1372i(c1374k, i7));
                } else if (c1374k.f6676F1 == Thread.currentThread()) {
                    c2024h.m4917c(true);
                }
                c1374k.f6672B1.m3489e0(new RunnableC0119d(10, this));
            } catch (Exception e7) {
                if (e7 instanceof C2019c) {
                    Log.v("CompletionThread", "Completion is cancelled");
                } else {
                    Log.e("CompletionThread", "Completion failed", e7);
                }
            }
        }
    }

    public C1374k(C1245b c1245b) {
        super(c1245b, 4);
        final int i7 = 0;
        this.f6673C1 = false;
        this.f6679I1 = -1;
        this.f6684N1 = 0L;
        this.f6685O1 = -1L;
        final int i8 = 1;
        this.f6686P1 = true;
        this.f6687Q1 = false;
        this.f6672B1 = c1245b;
        C1358b c1358b = new C1358b();
        this.f6680J1 = c1358b;
        final C1366f c1366f = new C1366f();
        this.f6681K1 = c1366f;
        c1366f.f6637d = this;
        final Context context = c1245b.getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        c1366f.f6636c = linearLayout;
        c1366f.f6634a = new ListView(context);
        c1366f.f6635b = new ProgressBar(context, null, R.attr.progressBarStyleHorizontal);
        linearLayout.setOrientation(1);
        c1366f.f6636c.setLayoutTransition(null);
        c1366f.f6634a.setLayoutTransition(null);
        linearLayout.addView(c1366f.f6635b, new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 20.0f, context.getResources().getDisplayMetrics())));
        linearLayout.addView(c1366f.f6634a, new LinearLayout.LayoutParams(-1, -1));
        c1366f.f6635b.setIndeterminate(true);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) c1366f.f6635b.getLayoutParams();
        layoutParams.topMargin = (int) TypedValue.applyDimension(1, -8.0f, context.getResources().getDisplayMetrics());
        layoutParams.bottomMargin = (int) TypedValue.applyDimension(1, -8.0f, context.getResources().getDisplayMetrics());
        layoutParams.leftMargin = (int) TypedValue.applyDimension(1, 4.0f, context.getResources().getDisplayMetrics());
        layoutParams.rightMargin = (int) TypedValue.applyDimension(1, 4.0f, context.getResources().getDisplayMetrics());
        LinearLayout linearLayout2 = c1366f.f6636c;
        linearLayout2.setOutlineProvider(new C1364e());
        linearLayout2.setClipToOutline(true);
        c1366f.f6634a.setDividerHeight(0);
        c1366f.f6635b.setVisibility(0);
        c1366f.f6634a.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: i5.c
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i9, long j7) {
                C1366f c1366f2 = C1366f.this;
                c1366f2.getClass();
                try {
                    c1366f2.f6637d.m3735j(i9);
                } catch (Exception e7) {
                    e7.printStackTrace(System.err);
                    Toast.makeText(context, e7.toString(), 0).show();
                }
            }
        });
        this.f6464c.setContentView(linearLayout);
        m3731f();
        ((C1366f) this.f6681K1).f6634a.setAdapter((ListView) c1358b);
        C1787p c1787p = new C1787p(c1245b.f5988B1);
        this.f6682L1 = c1787p;
        c1787p.m4249f(C1774c.class, new InterfaceC1788q(this) { // from class: i5.g

            /* renamed from: e */
            public final /* synthetic */ C1374k f6651e;

            {
                this.f6651e = this;
            }

            @Override // p132q4.InterfaceC1788q
            /* renamed from: d */
            public final void mo2065d(AbstractC1786o abstractC1786o, C1773b0 c1773b0) {
                int i9;
                int i10 = i7;
                C1374k c1374k = this.f6651e;
                switch (i10) {
                    case 0:
                        c1374k.m3731f();
                        break;
                    default:
                        C1796y c1796y = (C1796y) abstractC1786o;
                        c1374k.getClass();
                        if (!c1796y.m4250a() && (i9 = c1796y.f8167e) != 4 && i9 != 2 && i9 != 3 && i9 != 6 && i9 != 0) {
                            C0638b c0638b = c1374k.f6683M1;
                            C0638b c0638b2 = c1796y.f8165c;
                            if (c0638b != null) {
                                if (i9 == 7) {
                                    if (c0638b.f3141b == c0638b2.f3141b) {
                                        if (c1374k.m3617d() && Math.abs(c1374k.f6683M1.f3142c - c0638b2.f3142c) <= 1) {
                                            if (c0638b2.f3142c > 0) {
                                                c1374k.m3734i();
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                c1374k.f6683M1 = c0638b2.m2115a();
                                break;
                            }
                        }
                        c1374k.m3733h();
                        break;
                }
            }
        });
        c1787p.m4249f(C1775d.class, new InterfaceC1788q(this) { // from class: i5.h

            /* renamed from: e */
            public final /* synthetic */ C1374k f6656e;

            {
                this.f6656e = this;
            }

            @Override // p132q4.InterfaceC1788q
            /* renamed from: d */
            public final void mo2065d(AbstractC1786o abstractC1786o, C1773b0 c1773b0) {
                int i9;
                int i10 = i7;
                C1374k c1374k = this.f6656e;
                boolean z6 = false;
                switch (i10) {
                    case 0:
                        C1775d c1775d = (C1775d) abstractC1786o;
                        c1374k.getClass();
                        if (!c1775d.f8135g && c1374k.f6686P1 && (i9 = c1775d.f8131c) != 1) {
                            C1245b c1245b2 = c1374k.f6672B1;
                            C0638b c0638b = c1775d.f8132d;
                            C0638b c0638b2 = c1775d.f8133e;
                            if (i9 == 2) {
                                if ((!c1245b2.f5986A1.f6126b.m2116a() || c1245b2.getProps().f6113X) && c0638b2.f3142c != 0 && c0638b.f3141b == c0638b2.f3141b) {
                                    z6 = true;
                                } else {
                                    c1374k.m3733h();
                                }
                                c1374k.m3738m(c1374k.m3617d());
                            } else if (i9 == 3 && !c1245b2.f5986A1.f6126b.m2116a() && c1374k.m3617d()) {
                                if (c0638b.f3141b == c0638b2.f3141b && c0638b.f3142c == c0638b2.f3142c - 1) {
                                    c1374k.m3738m(true);
                                    z6 = true;
                                } else {
                                    c1374k.m3733h();
                                }
                            }
                            if (z6) {
                                c1374k.m3734i();
                                break;
                            }
                        } else {
                            c1374k.m3733h();
                            break;
                        }
                        break;
                    default:
                        c1374k.f6686P1 = false;
                        c1374k.f6682L1.m4247d(false);
                        c1374k.m3732g();
                        c1374k.m3733h();
                        break;
                }
            }
        });
        c1787p.m4249f(C1795x.class, new C0623k(4, this));
        c1787p.m4249f(C1782k.class, new C1882d(3, this));
        c1787p.m4249f(C1796y.class, new InterfaceC1788q(this) { // from class: i5.g

            /* renamed from: e */
            public final /* synthetic */ C1374k f6651e;

            {
                this.f6651e = this;
            }

            @Override // p132q4.InterfaceC1788q
            /* renamed from: d */
            public final void mo2065d(AbstractC1786o abstractC1786o, C1773b0 c1773b0) {
                int i9;
                int i10 = i8;
                C1374k c1374k = this.f6651e;
                switch (i10) {
                    case 0:
                        c1374k.m3731f();
                        break;
                    default:
                        C1796y c1796y = (C1796y) abstractC1786o;
                        c1374k.getClass();
                        if (!c1796y.m4250a() && (i9 = c1796y.f8167e) != 4 && i9 != 2 && i9 != 3 && i9 != 6 && i9 != 0) {
                            C0638b c0638b = c1374k.f6683M1;
                            C0638b c0638b2 = c1796y.f8165c;
                            if (c0638b != null) {
                                if (i9 == 7) {
                                    if (c0638b.f3141b == c0638b2.f3141b) {
                                        if (c1374k.m3617d() && Math.abs(c1374k.f6683M1.f3142c - c0638b2.f3142c) <= 1) {
                                            if (c0638b2.f3142c > 0) {
                                                c1374k.m3734i();
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                c1374k.f6683M1 = c0638b2.m2115a();
                                break;
                            }
                        }
                        c1374k.m3733h();
                        break;
                }
            }
        });
        c1787p.m4249f(C1785n.class, new InterfaceC1788q(this) { // from class: i5.h

            /* renamed from: e */
            public final /* synthetic */ C1374k f6656e;

            {
                this.f6656e = this;
            }

            @Override // p132q4.InterfaceC1788q
            /* renamed from: d */
            public final void mo2065d(AbstractC1786o abstractC1786o, C1773b0 c1773b0) {
                int i9;
                int i10 = i8;
                C1374k c1374k = this.f6656e;
                boolean z6 = false;
                switch (i10) {
                    case 0:
                        C1775d c1775d = (C1775d) abstractC1786o;
                        c1374k.getClass();
                        if (!c1775d.f8135g && c1374k.f6686P1 && (i9 = c1775d.f8131c) != 1) {
                            C1245b c1245b2 = c1374k.f6672B1;
                            C0638b c0638b = c1775d.f8132d;
                            C0638b c0638b2 = c1775d.f8133e;
                            if (i9 == 2) {
                                if ((!c1245b2.f5986A1.f6126b.m2116a() || c1245b2.getProps().f6113X) && c0638b2.f3142c != 0 && c0638b.f3141b == c0638b2.f3141b) {
                                    z6 = true;
                                } else {
                                    c1374k.m3733h();
                                }
                                c1374k.m3738m(c1374k.m3617d());
                            } else if (i9 == 3 && !c1245b2.f5986A1.f6126b.m2116a() && c1374k.m3617d()) {
                                if (c0638b.f3141b == c0638b2.f3141b && c0638b.f3142c == c0638b2.f3142c - 1) {
                                    c1374k.m3738m(true);
                                    z6 = true;
                                } else {
                                    c1374k.m3733h();
                                }
                            }
                            if (z6) {
                                c1374k.m3734i();
                                break;
                            }
                        } else {
                            c1374k.m3733h();
                            break;
                        }
                        break;
                    default:
                        c1374k.f6686P1 = false;
                        c1374k.f6682L1.m4247d(false);
                        c1374k.m3732g();
                        c1374k.m3733h();
                        break;
                }
            }
        });
        m3737l(C1781j.class, new C0091c());
        m3737l(C1772b.class, null);
        m3737l(C1783l.class, null);
        m3737l(C1780i.class, new C0089a());
        m3737l(C1797z.class, new C0090b());
    }

    /* renamed from: e */
    public static void m3730e(C1374k c1374k, long j7) {
        if (c1374k.f6685O1 >= c1374k.f6684N1 || c1374k.f6674D1 != j7 || c1374k.m3617d()) {
            return;
        }
        c1374k.m3614a(true);
    }

    /* renamed from: f */
    public final void m3731f() {
        C1510a colorScheme = this.f6672B1.getColorScheme();
        C1366f c1366f = (C1366f) this.f6681K1;
        c1366f.getClass();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(colorScheme.m3927c(19));
        c1366f.f6636c.setBackground(gradientDrawable);
        LinearLayout linearLayout = c1366f.f6636c;
        linearLayout.setOutlineProvider(new C1364e());
        linearLayout.setClipToOutline(true);
    }

    /* renamed from: g */
    public final void m3732g() {
        a aVar = this.f6676F1;
        if (aVar != null && aVar.isAlive()) {
            aVar.f6689Y = true;
            aVar.f6692e.mo4418c();
            aVar.interrupt();
            aVar.f6694s.f9200i = true;
            aVar.f6688X = -1L;
        }
        this.f6676F1 = null;
    }

    /* renamed from: h */
    public final void m3733h() {
        mo3615b();
        m3732g();
        this.f6685O1 = System.currentTimeMillis();
    }

    /* renamed from: i */
    public final void m3734i() {
        if (this.f6673C1 || !this.f6686P1) {
            return;
        }
        C1245b c1245b = this.f6672B1;
        if (!c1245b.getText().m2144p().m2163a()) {
            if (!C0057g.m168a(c1245b.getStyles(), c1245b.getCursor().m2164b())) {
                if (System.nanoTime() - this.f6674D1 < c1245b.getProps().f6121x1) {
                    m3733h();
                    this.f6674D1 = System.nanoTime();
                    return;
                }
                m3732g();
                this.f6674D1 = System.nanoTime();
                this.f6679I1 = -1;
                Handler handler = c1245b.getHandler();
                RunnableC1372i runnableC1372i = new RunnableC1372i(this, 0);
                c1245b.getEditorLanguage().mo4418c();
                this.f6677G1 = new C2024h(handler, runnableC1372i, 0);
                this.f6676F1 = new a(this.f6674D1, this.f6677G1);
                this.f6687Q1 = true;
                c1245b.m3487d0(new RunnableC0125j(5, this), 50L);
                this.f6676F1.start();
                return;
            }
        }
        m3733h();
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: j */
    public final boolean m3735j(int i7) {
        if (i7 == -1) {
            return false;
        }
        AbstractC2020d abstractC2020d = ((AbstractC1376m) ((C1366f) this.f6681K1).f6634a.getAdapter()).f6696e.get(i7);
        C1245b c1245b = this.f6672B1;
        C0645i cursor = c1245b.getCursor();
        a aVar = this.f6676F1;
        if (!cursor.m2163a() && aVar != null) {
            this.f6673C1 = true;
            c1245b.f6052g2++;
            c1245b.getText().m2130b();
            c1245b.m3495h0();
            try {
                C0641e text = c1245b.getText();
                C0638b c0638b = aVar.f6691c;
                abstractC2020d.getClass();
                abstractC2020d.mo4914a(c1245b, text, c0638b.f3141b, c0638b.f3142c);
                c1245b.m3510s0();
                c1245b.getText().m2140l();
                int i8 = c1245b.f6052g2 - 1;
                c1245b.f6052g2 = i8;
                if (i8 < 0) {
                    c1245b.f6052g2 = 0;
                }
                this.f6673C1 = false;
                c1245b.m3495h0();
            } catch (Throwable th) {
                c1245b.getText().m2140l();
                int i9 = c1245b.f6052g2 - 1;
                c1245b.f6052g2 = i9;
                if (i9 < 0) {
                    c1245b.f6052g2 = 0;
                }
                this.f6673C1 = false;
                throw th;
            }
        }
        m3733h();
        return true;
    }

    /* renamed from: k */
    public final void m3736k() {
        if (this.f6673C1 || !this.f6686P1) {
            return;
        }
        this.f6684N1 = System.currentTimeMillis();
        final long j7 = this.f6674D1;
        this.f6672B1.m3487d0(new Runnable() { // from class: i5.j
            @Override // java.lang.Runnable
            public final void run() {
                C1374k.m3730e(C1374k.this, j7);
            }
        }, 70L);
    }

    /* renamed from: l */
    public final <T extends AbstractC1786o> void m3737l(Class<T> cls, final InterfaceC0666l<T, Boolean> interfaceC0666l) {
        this.f6682L1.m4249f(cls, new InterfaceC1788q() { // from class: y1.b
            @Override // p132q4.InterfaceC1788q
            /* renamed from: d */
            public final void mo2065d(AbstractC1786o abstractC1786o, C1773b0 c1773b0) {
                C1374k c1374k = (C1374k) this;
                InterfaceC0666l interfaceC0666l2 = (InterfaceC0666l) interfaceC0666l;
                if (interfaceC0666l2 != null) {
                    c1374k.getClass();
                    if (!((Boolean) interfaceC0666l2.mo216c(abstractC1786o)).booleanValue()) {
                        return;
                    }
                }
                c1374k.m3733h();
            }
        });
    }

    /* renamed from: m */
    public final void m3738m(boolean z6) {
        int min;
        C1245b c1245b = this.f6672B1;
        float dpUnit = c1245b.getDpUnit();
        C0645i cursor = c1245b.getCursor();
        float m3511t0 = (dpUnit * 20.0f) + c1245b.m3511t0();
        int rowHeight = c1245b.getRowHeight();
        InterfaceC1433b layout = c1245b.getLayout();
        C0638b c0638b = cursor.f3167d;
        float f7 = rowHeight;
        float offsetY = (f7 / 2.0f) + (((AbstractC1432a) layout).m3801b(c0638b.f3141b, c0638b.f3142c)[0] - c1245b.getOffsetY());
        float height = c1245b.getHeight() - offsetY;
        float f8 = 200.0f * dpUnit;
        if (height > f8) {
            height = f8;
        } else if (height < f8 && z6) {
            float f9 = 0.0f;
            while (height < f8 && c1245b.getOffsetY() + f9 + f7 <= c1245b.getScrollMaxY()) {
                height += f7;
                offsetY -= f7;
                f9 += f7;
            }
            float f10 = 42.0f * dpUnit;
            offsetY -= f10;
            c1245b.getScroller().m3552e(c1245b.getOffsetX(), c1245b.getOffsetY(), 0, (int) (f9 + f10));
        }
        if (c1245b.getWidth() < 500.0f * dpUnit) {
            min = (c1245b.getWidth() * 19) / 20;
            m3511t0 = (c1245b.getWidth() / 20.0f) / 2.0f;
        } else {
            min = (int) Math.min(dpUnit * 400.0f, c1245b.getWidth() / 2.0f);
        }
        int i7 = this.f6460A1;
        this.f6675E1 = (int) height;
        int offsetX = c1245b.getOffsetX() + ((int) m3511t0);
        int offsetY2 = c1245b.getOffsetY();
        this.f6469x1 = offsetX;
        this.f6470y1 = offsetY2 + ((int) offsetY);
        C1245b c1245b2 = this.f6465e;
        this.f6468w1 = c1245b2.getOffsetY();
        this.f6463Z = c1245b2.getOffsetX();
        m3614a(false);
        this.f6471z1 = min;
        this.f6460A1 = i7;
        m3614a(false);
    }
}
