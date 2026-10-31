package p071i5;

import android.ext.Tools;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.activity.RunnableC0125j;
import io.github.rosemoe.sora.R$id;
import io.github.rosemoe.sora.R$layout;
import io.github.rosemoe.sora.R$style;
import p022c5.C0638b;
import p022c5.C0645i;
import p055g5.C1245b;
import p055g5.C1253j;
import p055g5.GestureDetectorOnGestureListenerC1261r;
import p058h0.C1277d;
import p063h5.C1302a;
import p132q4.AbstractC1786o;
import p132q4.C1780i;
import p132q4.C1785n;
import p132q4.C1787p;
import p132q4.C1789r;
import p132q4.C1793v;
import p132q4.C1795x;
import p132q4.C1796y;
import p144s0.RunnableC1869e;

/* renamed from: i5.f0 */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1367f0 extends C1302a implements View.OnClickListener, InterfaceC1375l {

    /* renamed from: B1 */
    public final C1245b f6638B1;

    /* renamed from: C1 */
    public final ImageButton f6639C1;

    /* renamed from: D1 */
    public final ImageButton f6640D1;

    /* renamed from: E1 */
    public final ImageButton f6641E1;

    /* renamed from: F1 */
    public final View f6642F1;

    /* renamed from: G1 */
    public final GestureDetectorOnGestureListenerC1261r f6643G1;

    /* renamed from: H1 */
    public final C1787p f6644H1;

    /* renamed from: I1 */
    public long f6645I1;

    /* renamed from: J1 */
    public int f6646J1;

    /* renamed from: K1 */
    public int f6647K1;

    /* renamed from: L1 */
    public boolean f6648L1;

    /* renamed from: i5.f0$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewOnClickListenerC1367f0 viewOnClickListenerC1367f0 = ViewOnClickListenerC1367f0.this;
            boolean m3565d = viewOnClickListenerC1367f0.f6643G1.m3565d();
            C1245b c1245b = viewOnClickListenerC1367f0.f6638B1;
            if (m3565d || c1245b.getSnippetController().m3950c() || System.currentTimeMillis() - viewOnClickListenerC1367f0.f6645I1 <= 200 || !c1245b.getScroller().f6181b.isFinished()) {
                c1245b.m3487d0(this, 200L);
            } else {
                viewOnClickListenerC1367f0.m3724e();
            }
        }
    }

    public ViewOnClickListenerC1367f0(C1245b c1245b) {
        super(c1245b, 2);
        final int i7 = 1;
        this.f6648L1 = true;
        this.f6638B1 = c1245b;
        this.f6643G1 = c1245b.getEventHandler();
        C1787p c1787p = new C1787p(c1245b.f5988B1);
        this.f6644H1 = c1787p;
        View inflate = LayoutInflater.from(c1245b.getContext()).inflate(R$layout.text_compose_panel, (ViewGroup) null);
        this.f6642F1 = inflate;
        ImageButton imageButton = (ImageButton) inflate.findViewById(R$id.panel_btn_select_all);
        ImageButton imageButton2 = (ImageButton) inflate.findViewById(R$id.panel_btn_cut);
        this.f6641E1 = imageButton2;
        ImageButton imageButton3 = (ImageButton) inflate.findViewById(R$id.panel_btn_copy);
        this.f6640D1 = imageButton3;
        ImageButton imageButton4 = (ImageButton) inflate.findViewById(R$id.panel_btn_paste);
        this.f6639C1 = imageButton4;
        imageButton.setOnClickListener(this);
        imageButton2.setOnClickListener(this);
        imageButton3.setOnClickListener(this);
        imageButton4.setOnClickListener(this);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(c1245b.getDpUnit() * 5.0f);
        gradientDrawable.setColor(-1);
        inflate.setBackground(gradientDrawable);
        this.f6464c.setContentView(inflate);
        int dpUnit = (int) (c1245b.getDpUnit() * 48.0f);
        final int i8 = 0;
        this.f6471z1 = 0;
        this.f6460A1 = dpUnit;
        m3614a(false);
        this.f6464c.setAnimationStyle(R$style.text_action_popup_animation);
        c1787p.m4248e(C1796y.class, new C1787p.a(this) { // from class: i5.c0

            /* renamed from: e */
            public final /* synthetic */ ViewOnClickListenerC1367f0 f6627e;

            {
                this.f6627e = this;
            }

            @Override // p132q4.C1787p.a
            /* renamed from: c */
            public final void mo3554c(AbstractC1786o abstractC1786o) {
                int i9;
                int i10 = i8;
                ViewOnClickListenerC1367f0 viewOnClickListenerC1367f0 = this.f6627e;
                switch (i10) {
                    case 0:
                        C1796y c1796y = (C1796y) abstractC1786o;
                        if (!viewOnClickListenerC1367f0.f6643G1.m3565d()) {
                            viewOnClickListenerC1367f0.f6647K1 = c1796y.f8167e;
                            boolean m4250a = c1796y.m4250a();
                            C1245b c1245b2 = viewOnClickListenerC1367f0.f6638B1;
                            int i11 = c1796y.f8167e;
                            if (!m4250a) {
                                boolean z6 = false;
                                C0638b c0638b = c1796y.f8165c;
                                if (i11 == 3 && c0638b.f3140a == viewOnClickListenerC1367f0.f6646J1 && !viewOnClickListenerC1367f0.m3617d()) {
                                    if (!(c1245b2.getText().f3148X > 0) && c1245b2.m3476S()) {
                                        c1245b2.m3489e0(new RunnableC1869e(4, viewOnClickListenerC1367f0));
                                        z6 = true;
                                        if (i11 == 3 && !z6) {
                                            i9 = c0638b.f3140a;
                                            viewOnClickListenerC1367f0.f6646J1 = i9;
                                            break;
                                        }
                                    }
                                }
                                viewOnClickListenerC1367f0.mo3615b();
                                if (i11 == 3) {
                                    i9 = c0638b.f3140a;
                                    viewOnClickListenerC1367f0.f6646J1 = i9;
                                }
                            } else if (i11 != 6) {
                                c1245b2.m3489e0(new RunnableC0125j(7, viewOnClickListenerC1367f0));
                            } else {
                                viewOnClickListenerC1367f0.mo3615b();
                            }
                            i9 = -1;
                            viewOnClickListenerC1367f0.f6646J1 = i9;
                        }
                        break;
                    default:
                        viewOnClickListenerC1367f0.getClass();
                        if (!((C1780i) abstractC1786o).f8137c) {
                            viewOnClickListenerC1367f0.mo3615b();
                            break;
                        }
                        break;
                }
            }
        });
        c1787p.m4248e(C1795x.class, new C1787p.a(this) { // from class: i5.d0

            /* renamed from: e */
            public final /* synthetic */ ViewOnClickListenerC1367f0 f6632e;

            {
                this.f6632e = this;
            }

            @Override // p132q4.C1787p.a
            /* renamed from: c */
            public final void mo3554c(AbstractC1786o abstractC1786o) {
                int i9 = i8;
                ViewOnClickListenerC1367f0 viewOnClickListenerC1367f0 = this.f6632e;
                switch (i9) {
                    case 0:
                        long j7 = viewOnClickListenerC1367f0.f6645I1;
                        long currentTimeMillis = System.currentTimeMillis();
                        viewOnClickListenerC1367f0.f6645I1 = currentTimeMillis;
                        if (currentTimeMillis - j7 < 200 && viewOnClickListenerC1367f0.f6647K1 != 6) {
                            viewOnClickListenerC1367f0.m3725f();
                            break;
                        }
                        break;
                    default:
                        viewOnClickListenerC1367f0.f6648L1 = false;
                        viewOnClickListenerC1367f0.f6644H1.m4247d(false);
                        viewOnClickListenerC1367f0.mo3615b();
                        break;
                }
            }
        });
        c1787p.m4248e(C1789r.class, new C1277d(3, this));
        c1787p.m4248e(C1793v.class, new C1253j(i7, this));
        c1787p.m4248e(C1780i.class, new C1787p.a(this) { // from class: i5.c0

            /* renamed from: e */
            public final /* synthetic */ ViewOnClickListenerC1367f0 f6627e;

            {
                this.f6627e = this;
            }

            @Override // p132q4.C1787p.a
            /* renamed from: c */
            public final void mo3554c(AbstractC1786o abstractC1786o) {
                int i9;
                int i10 = i7;
                ViewOnClickListenerC1367f0 viewOnClickListenerC1367f0 = this.f6627e;
                switch (i10) {
                    case 0:
                        C1796y c1796y = (C1796y) abstractC1786o;
                        if (!viewOnClickListenerC1367f0.f6643G1.m3565d()) {
                            viewOnClickListenerC1367f0.f6647K1 = c1796y.f8167e;
                            boolean m4250a = c1796y.m4250a();
                            C1245b c1245b2 = viewOnClickListenerC1367f0.f6638B1;
                            int i11 = c1796y.f8167e;
                            if (!m4250a) {
                                boolean z6 = false;
                                C0638b c0638b = c1796y.f8165c;
                                if (i11 == 3 && c0638b.f3140a == viewOnClickListenerC1367f0.f6646J1 && !viewOnClickListenerC1367f0.m3617d()) {
                                    if (!(c1245b2.getText().f3148X > 0) && c1245b2.m3476S()) {
                                        c1245b2.m3489e0(new RunnableC1869e(4, viewOnClickListenerC1367f0));
                                        z6 = true;
                                        if (i11 == 3 && !z6) {
                                            i9 = c0638b.f3140a;
                                            viewOnClickListenerC1367f0.f6646J1 = i9;
                                            break;
                                        }
                                    }
                                }
                                viewOnClickListenerC1367f0.mo3615b();
                                if (i11 == 3) {
                                    i9 = c0638b.f3140a;
                                    viewOnClickListenerC1367f0.f6646J1 = i9;
                                }
                            } else if (i11 != 6) {
                                c1245b2.m3489e0(new RunnableC0125j(7, viewOnClickListenerC1367f0));
                            } else {
                                viewOnClickListenerC1367f0.mo3615b();
                            }
                            i9 = -1;
                            viewOnClickListenerC1367f0.f6646J1 = i9;
                        }
                        break;
                    default:
                        viewOnClickListenerC1367f0.getClass();
                        if (!((C1780i) abstractC1786o).f8137c) {
                            viewOnClickListenerC1367f0.mo3615b();
                            break;
                        }
                        break;
                }
            }
        });
        c1787p.m4248e(C1785n.class, new C1787p.a(this) { // from class: i5.d0

            /* renamed from: e */
            public final /* synthetic */ ViewOnClickListenerC1367f0 f6632e;

            {
                this.f6632e = this;
            }

            @Override // p132q4.C1787p.a
            /* renamed from: c */
            public final void mo3554c(AbstractC1786o abstractC1786o) {
                int i9 = i7;
                ViewOnClickListenerC1367f0 viewOnClickListenerC1367f0 = this.f6632e;
                switch (i9) {
                    case 0:
                        long j7 = viewOnClickListenerC1367f0.f6645I1;
                        long currentTimeMillis = System.currentTimeMillis();
                        viewOnClickListenerC1367f0.f6645I1 = currentTimeMillis;
                        if (currentTimeMillis - j7 < 200 && viewOnClickListenerC1367f0.f6647K1 != 6) {
                            viewOnClickListenerC1367f0.m3725f();
                            break;
                        }
                        break;
                    default:
                        viewOnClickListenerC1367f0.f6648L1 = false;
                        viewOnClickListenerC1367f0.f6644H1.m4247d(false);
                        viewOnClickListenerC1367f0.mo3615b();
                        break;
                }
            }
        });
    }

    /* renamed from: e */
    public final void m3724e() {
        C1245b c1245b = this.f6638B1;
        boolean hasPrimaryClip = c1245b.f5991C2.hasPrimaryClip();
        ImageButton imageButton = this.f6639C1;
        imageButton.setEnabled(hasPrimaryClip);
        int i7 = 8;
        this.f6640D1.setVisibility(c1245b.getCursor().m2163a() ? 0 : 8);
        imageButton.setVisibility(c1245b.m3476S() ? 0 : 8);
        if (c1245b.getCursor().m2163a() && c1245b.m3476S()) {
            i7 = 0;
        }
        this.f6641E1.setVisibility(i7);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(1000000, Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Tools.AID_USER, Integer.MIN_VALUE);
        View view = this.f6642F1;
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        int min = Math.min(view.getMeasuredWidth(), (int) (c1245b.getDpUnit() * 230.0f));
        int i8 = this.f6460A1;
        this.f6471z1 = min;
        this.f6460A1 = i8;
        m3614a(false);
        int max = Math.max(0, Math.min(c1245b.getCursor().m2163a() ? Math.min(m3726g(c1245b.getLeftHandleDescriptor().f7546a), m3726g(c1245b.getRightHandleDescriptor().f7546a)) : m3726g(c1245b.getInsertHandleDescriptor().f7546a), (c1245b.getHeight() - this.f6460A1) - 5));
        int m3482Y = (int) (((((c1245b.m3482Y() + c1245b.f5990C1.m3801b(c1245b.getCursor().f3167d.f3141b, c1245b.getCursor().f3167d.f3142c)[1]) - c1245b.getOffsetX()) + ((c1245b.m3482Y() + c1245b.f5990C1.m3801b(c1245b.getCursor().f3166c.f3141b, c1245b.getCursor().f3166c.f3142c)[1]) - c1245b.getOffsetX())) / 2.0f) - (view.getMeasuredWidth() / 2.0f));
        C1245b c1245b2 = this.f6465e;
        int offsetX = c1245b2.getOffsetX() + m3482Y;
        int offsetY = c1245b2.getOffsetY() + max;
        this.f6469x1 = offsetX;
        this.f6470y1 = offsetY;
        this.f6468w1 = c1245b2.getOffsetY();
        this.f6463Z = c1245b2.getOffsetX();
        m3614a(false);
        m3727h();
    }

    /* renamed from: f */
    public final void m3725f() {
        if (m3617d()) {
            mo3615b();
            C1245b c1245b = this.f6638B1;
            if (c1245b.getCursor().m2163a()) {
                c1245b.m3487d0(new a(), 200L);
            }
        }
    }

    /* renamed from: g */
    public final int m3726g(RectF rectF) {
        int rowHeight = this.f6638B1.getRowHeight();
        float f7 = rectF.top;
        float f8 = f7 - ((rowHeight * 3) / 2.0f);
        int i7 = this.f6460A1;
        return f8 > ((float) i7) ? (int) ((f7 - (r2 / 2)) - i7) : (int) (rectF.bottom + (rowHeight / 2));
    }

    /* renamed from: h */
    public final void m3727h() {
        if (this.f6648L1) {
            C1245b c1245b = this.f6638B1;
            if (c1245b.getSnippetController().m3950c() || !c1245b.hasFocus() || c1245b.m3478U() || m3617d()) {
                return;
            }
            m3614a(true);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7;
        C0645i cursor;
        int id = view.getId();
        int i8 = R$id.panel_btn_select_all;
        C1245b c1245b = this.f6638B1;
        if (id == i8) {
            c1245b.m3497i0();
            return;
        }
        if (id != R$id.panel_btn_cut) {
            if (id == R$id.panel_btn_paste) {
                c1245b.m3486c0();
                i7 = c1245b.getCursor().f3167d.f3141b;
                cursor = c1245b.getCursor();
            } else if (id == R$id.panel_btn_copy) {
                c1245b.m3496i(true);
                i7 = c1245b.getCursor().f3167d.f3141b;
                cursor = c1245b.getCursor();
            } else if (id == R$id.panel_btn_long_select && c1245b.m3476S()) {
                if (c1245b.f5995E2.m2163a()) {
                    C0638b c0638b = c1245b.f5995E2.f3166c;
                    c1245b.m3500k0(c0638b.f3141b, c0638b.f3142c);
                }
                c1245b.f6075u2 = true;
                c1245b.invalidate();
            }
            c1245b.m3500k0(i7, cursor.f3167d.f3142c);
        } else if (c1245b.getCursor().m2163a()) {
            c1245b.m3513x();
        }
        mo3615b();
    }
}
