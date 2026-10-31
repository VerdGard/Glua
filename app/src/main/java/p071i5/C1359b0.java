package p071i5;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupMenu;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.activity.RunnableC0125j;
import io.github.rosemoe.sora.R$id;
import io.github.rosemoe.sora.R$layout;
import io.github.rosemoe.sora.R$string;
import io.github.rosemoe.sora.R$style;
import java.util.ArrayList;
import java.util.List;
import p002a1.C0017d;
import p022c5.C0637a;
import p022c5.C0638b;
import p032d6.C0898f;
import p055g5.C1245b;
import p058h0.C1277d;
import p063h5.C1302a;
import p071i5.C1374k;
import p079j5.InterfaceC1433b;
import p095l5.C1510a;
import p124p4.C1703a;
import p132q4.AbstractC1786o;
import p132q4.C1773b0;
import p132q4.C1774c;
import p132q4.C1780i;
import p132q4.C1785n;
import p132q4.C1787p;
import p132q4.C1790s;
import p132q4.C1795x;
import p132q4.C1796y;
import p132q4.InterfaceC1788q;
import p187x5.C2197a;
import p194y4.C2249a;
import p194y4.C2250b;
import p194y4.C2251c;
import p194y4.C2252d;

/* renamed from: i5.b0 */
/* loaded from: classes.dex */
public final class C1359b0 extends C1302a implements InterfaceC1375l {

    /* renamed from: B1 */
    public final C1787p f6605B1;

    /* renamed from: C1 */
    public final View f6606C1;

    /* renamed from: D1 */
    public final TextView f6607D1;

    /* renamed from: E1 */
    public final TextView f6608E1;

    /* renamed from: F1 */
    public final TextView f6609F1;

    /* renamed from: G1 */
    public final TextView f6610G1;

    /* renamed from: H1 */
    public final ViewGroup f6611H1;

    /* renamed from: I1 */
    public final ViewGroup f6612I1;

    /* renamed from: J1 */
    public C0638b f6613J1;

    /* renamed from: K1 */
    public C2249a f6614K1;

    /* renamed from: L1 */
    public final int f6615L1;

    /* renamed from: M1 */
    public final ArrayList f6616M1;

    /* renamed from: N1 */
    public final float[] f6617N1;

    /* renamed from: O1 */
    public final int[] f6618O1;

    /* renamed from: P1 */
    public final PopupMenu f6619P1;

    /* renamed from: Q1 */
    public C0638b f6620Q1;

    /* renamed from: R1 */
    public C2197a<Float, Float> f6621R1;

    /* renamed from: S1 */
    public boolean f6622S1;

    /* renamed from: T1 */
    public boolean f6623T1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1359b0(final C1245b c1245b) {
        super(c1245b, 6);
        C0898f.m2606e(c1245b, "editor");
        C1787p c1787p = new C1787p(c1245b.f5988B1);
        this.f6605B1 = c1787p;
        View inflate = LayoutInflater.from(c1245b.getContext()).inflate(R$layout.diagnostic_tooltip_window, (ViewGroup) null);
        C0898f.m2605d(inflate, "from(editor.context).inf…tic_tooltip_window, null)");
        this.f6606C1 = inflate;
        this.f6607D1 = (TextView) inflate.findViewById(R$id.diagnostic_tooltip_brief_message);
        this.f6608E1 = (TextView) inflate.findViewById(R$id.diagnostic_tooltip_detailed_message);
        TextView textView = (TextView) inflate.findViewById(R$id.diagnostic_tooltip_preferred_action);
        this.f6609F1 = textView;
        TextView textView2 = (TextView) inflate.findViewById(R$id.diagnostic_tooltip_more_actions);
        this.f6610G1 = textView2;
        this.f6611H1 = (ViewGroup) inflate.findViewById(R$id.diagnostic_container_message);
        this.f6612I1 = (ViewGroup) inflate.findViewById(R$id.diagnostic_container_quickfix);
        this.f6615L1 = (int) (c1245b.getDpUnit() * 175);
        this.f6616M1 = new ArrayList();
        this.f6617N1 = new float[2];
        this.f6618O1 = new int[2];
        PopupMenu popupMenu = new PopupMenu(c1245b.getContext(), textView2);
        this.f6619P1 = popupMenu;
        Float valueOf = Float.valueOf(0.0f);
        this.f6621R1 = new C2197a<>(valueOf, valueOf);
        this.f6464c.setContentView(inflate);
        this.f6464c.setAnimationStyle(R$style.diagnostic_popup_animation);
        final int i7 = 1;
        inflate.setClipToOutline(true);
        inflate.setOnGenericMotionListener(new View.OnGenericMotionListener() { // from class: i5.s
            @Override // android.view.View.OnGenericMotionListener
            public final boolean onGenericMotion(View view, MotionEvent motionEvent) {
                C1359b0 c1359b0 = C1359b0.this;
                C0898f.m2606e(c1359b0, "this$0");
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 9) {
                    c1359b0.f6623T1 = true;
                } else if (actionMasked == 10) {
                    c1359b0.f6623T1 = false;
                }
                return false;
            }
        });
        final int i8 = 0;
        c1787p.m4249f(C1796y.class, new InterfaceC1788q(this) { // from class: i5.x

            /* renamed from: e */
            public final /* synthetic */ C1359b0 f6713e;

            {
                this.f6713e = this;
            }

            @Override // p132q4.InterfaceC1788q
            /* renamed from: d */
            public final void mo2065d(AbstractC1786o abstractC1786o, C1773b0 c1773b0) {
                int i9;
                int i10 = i8;
                C1359b0 c1359b0 = this.f6713e;
                switch (i10) {
                    case 0:
                        C1796y c1796y = (C1796y) abstractC1786o;
                        C0898f.m2606e(c1359b0, "this$0");
                        C0898f.m2606e(c1796y, "event");
                        if (c1359b0.f6605B1.f8152f && !c1359b0.f6465e.m3478U()) {
                            if (!c1796y.m4250a() && ((i9 = c1796y.f8167e) == 3 || i9 == 1)) {
                                C0638b c0638b = c1796y.f8165c;
                                C0898f.m2605d(c0638b, "event.left");
                                c1359b0.m3720g(c0638b);
                                break;
                            } else {
                                c1359b0.m3721h(null, null);
                                break;
                            }
                        }
                        break;
                    default:
                        C0898f.m2606e(c1359b0, "this$0");
                        C0898f.m2606e((C1774c) abstractC1786o, "<anonymous parameter 0>");
                        c1359b0.m3719e();
                        break;
                }
            }
        });
        c1787p.m4249f(C1795x.class, new InterfaceC1788q(this) { // from class: i5.y

            /* renamed from: e */
            public final /* synthetic */ C1359b0 f6715e;

            {
                this.f6715e = this;
            }

            @Override // p132q4.InterfaceC1788q
            /* renamed from: d */
            public final void mo2065d(AbstractC1786o abstractC1786o, C1773b0 c1773b0) {
                int i9 = i8;
                C1359b0 c1359b0 = this.f6715e;
                switch (i9) {
                    case 0:
                        C0898f.m2606e(c1359b0, "this$0");
                        C0898f.m2606e((C1795x) abstractC1786o, "<anonymous parameter 0>");
                        C1245b c1245b2 = c1359b0.f6465e;
                        if (!c1245b2.m3478U() && c1359b0.f6614K1 != null && c1359b0.m3617d()) {
                            C0638b m2164b = c1245b2.getCursor().m2164b();
                            InterfaceC1433b layout = c1245b2.getLayout();
                            int i10 = m2164b.f3141b;
                            int i11 = m2164b.f3142c;
                            float[] fArr = c1359b0.f6617N1;
                            layout.mo3811p(i10, i11, fArr);
                            boolean z6 = false;
                            if (fArr[0] >= c1245b2.getOffsetY()) {
                                if (fArr[0] - c1245b2.getRowHeight() <= c1245b2.getHeight() + c1245b2.getOffsetY() && fArr[1] >= c1245b2.getOffsetX()) {
                                    if (fArr[1] - 100.0f <= c1245b2.getWidth() + c1245b2.getOffsetX()) {
                                        z6 = true;
                                    }
                                }
                            }
                            if (!z6) {
                                c1359b0.mo3615b();
                                break;
                            } else {
                                c1359b0.m3722i();
                                break;
                            }
                        }
                        break;
                    default:
                        C1780i c1780i = (C1780i) abstractC1786o;
                        C0898f.m2606e(c1359b0, "this$0");
                        C0898f.m2606e(c1780i, "event");
                        if (!c1780i.f8137c) {
                            c1359b0.mo3615b();
                            break;
                        }
                        break;
                }
            }
        });
        final RunnableC0125j runnableC0125j = new RunnableC0125j(6, this);
        c1787p.m4248e(C1790s.class, new C1787p.a() { // from class: i5.z
            @Override // p132q4.C1787p.a
            /* renamed from: c */
            public final void mo3554c(AbstractC1786o abstractC1786o) {
                C1790s c1790s = (C1790s) abstractC1786o;
                C1359b0 c1359b0 = C1359b0.this;
                C0898f.m2606e(c1359b0, "this$0");
                Runnable runnable = runnableC0125j;
                C0898f.m2606e(runnable, "$callback");
                C1245b c1245b2 = c1359b0.f6465e;
                if (c1245b2.m3478U()) {
                    int action = c1790s.f8143d.getAction();
                    MotionEvent motionEvent = c1790s.f8143d;
                    if (action != 7) {
                        if (action == 9) {
                            c1245b2.removeCallbacks(runnable);
                            c1359b0.m3721h(null, null);
                        } else {
                            if (action != 10) {
                                return;
                            }
                            c1359b0.f6620Q1 = null;
                            if (c1359b0.f6623T1 || c1359b0.f6622S1) {
                                return;
                            } else {
                                C1359b0.m3718f(c1359b0, runnable);
                            }
                        }
                        c1359b0.f6621R1 = new C2197a<>(Float.valueOf(motionEvent.getX()), Float.valueOf(motionEvent.getY()));
                        return;
                    }
                    if (c1359b0.f6623T1 || c1359b0.f6622S1) {
                        return;
                    }
                    if (!c1245b2.m3479V(motionEvent.getX(), motionEvent.getY())) {
                        c1359b0.f6620Q1 = null;
                    } else {
                        if (Math.abs(motionEvent.getX() - c1359b0.f6621R1.f9967c.floatValue()) <= 20.0f && Math.abs(motionEvent.getY() - c1359b0.f6621R1.f9968e.floatValue()) <= 20.0f) {
                            return;
                        }
                        c1359b0.f6621R1 = new C2197a<>(Float.valueOf(motionEvent.getX()), Float.valueOf(motionEvent.getY()));
                        long m3470M = c1245b2.m3470M(motionEvent.getX(), motionEvent.getY());
                        c1359b0.f6620Q1 = ((C0637a) c1245b2.getText().m2145q()).m2111q((int) (m3470M >> 32), C0017d.m62A(m3470M));
                    }
                    C1359b0.m3718f(c1359b0, runnable);
                }
            }
        });
        c1787p.m4249f(C1774c.class, new InterfaceC1788q(this) { // from class: i5.x

            /* renamed from: e */
            public final /* synthetic */ C1359b0 f6713e;

            {
                this.f6713e = this;
            }

            @Override // p132q4.InterfaceC1788q
            /* renamed from: d */
            public final void mo2065d(AbstractC1786o abstractC1786o, C1773b0 c1773b0) {
                int i9;
                int i10 = i7;
                C1359b0 c1359b0 = this.f6713e;
                switch (i10) {
                    case 0:
                        C1796y c1796y = (C1796y) abstractC1786o;
                        C0898f.m2606e(c1359b0, "this$0");
                        C0898f.m2606e(c1796y, "event");
                        if (c1359b0.f6605B1.f8152f && !c1359b0.f6465e.m3478U()) {
                            if (!c1796y.m4250a() && ((i9 = c1796y.f8167e) == 3 || i9 == 1)) {
                                C0638b c0638b = c1796y.f8165c;
                                C0898f.m2605d(c0638b, "event.left");
                                c1359b0.m3720g(c0638b);
                                break;
                            } else {
                                c1359b0.m3721h(null, null);
                                break;
                            }
                        }
                        break;
                    default:
                        C0898f.m2606e(c1359b0, "this$0");
                        C0898f.m2606e((C1774c) abstractC1786o, "<anonymous parameter 0>");
                        c1359b0.m3719e();
                        break;
                }
            }
        });
        c1787p.m4249f(C1780i.class, new InterfaceC1788q(this) { // from class: i5.y

            /* renamed from: e */
            public final /* synthetic */ C1359b0 f6715e;

            {
                this.f6715e = this;
            }

            @Override // p132q4.InterfaceC1788q
            /* renamed from: d */
            public final void mo2065d(AbstractC1786o abstractC1786o, C1773b0 c1773b0) {
                int i9 = i7;
                C1359b0 c1359b0 = this.f6715e;
                switch (i9) {
                    case 0:
                        C0898f.m2606e(c1359b0, "this$0");
                        C0898f.m2606e((C1795x) abstractC1786o, "<anonymous parameter 0>");
                        C1245b c1245b2 = c1359b0.f6465e;
                        if (!c1245b2.m3478U() && c1359b0.f6614K1 != null && c1359b0.m3617d()) {
                            C0638b m2164b = c1245b2.getCursor().m2164b();
                            InterfaceC1433b layout = c1245b2.getLayout();
                            int i10 = m2164b.f3141b;
                            int i11 = m2164b.f3142c;
                            float[] fArr = c1359b0.f6617N1;
                            layout.mo3811p(i10, i11, fArr);
                            boolean z6 = false;
                            if (fArr[0] >= c1245b2.getOffsetY()) {
                                if (fArr[0] - c1245b2.getRowHeight() <= c1245b2.getHeight() + c1245b2.getOffsetY() && fArr[1] >= c1245b2.getOffsetX()) {
                                    if (fArr[1] - 100.0f <= c1245b2.getWidth() + c1245b2.getOffsetX()) {
                                        z6 = true;
                                    }
                                }
                            }
                            if (!z6) {
                                c1359b0.mo3615b();
                                break;
                            } else {
                                c1359b0.m3722i();
                                break;
                            }
                        }
                        break;
                    default:
                        C1780i c1780i = (C1780i) abstractC1786o;
                        C0898f.m2606e(c1359b0, "this$0");
                        C0898f.m2606e(c1780i, "event");
                        if (!c1780i.f8137c) {
                            c1359b0.mo3615b();
                            break;
                        }
                        break;
                }
            }
        });
        c1787p.m4249f(C1785n.class, new C1277d(2, this));
        this.f6464c.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: i5.t
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                C1359b0 c1359b0 = C1359b0.this;
                C0898f.m2606e(c1359b0, "this$0");
                c1359b0.f6614K1 = null;
                c1359b0.f6623T1 = false;
                c1359b0.f6622S1 = false;
            }
        });
        textView.setOnClickListener(new View.OnClickListener() { // from class: i5.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1359b0 c1359b0 = C1359b0.this;
                C0898f.m2606e(c1359b0, "this$0");
                C2249a c2249a = c1359b0.f6614K1;
                List<C2252d> list = c2249a != null ? c2249a.f10260c : null;
                if (list == null || list.isEmpty()) {
                    return;
                }
                Runnable runnable = list.get(0).f10270b;
                if (runnable != null) {
                    runnable.run();
                }
                c1359b0.mo3615b();
            }
        });
        int i9 = R$string.sora_editor_diagnostics_more_actions;
        int i10 = C1703a.f7669a.get(i9);
        textView2.setText(i10 != 0 ? i10 : i9);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: i5.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final C1359b0 c1359b0 = C1359b0.this;
                C0898f.m2606e(c1359b0, "this$0");
                C1245b c1245b2 = c1245b;
                C0898f.m2606e(c1245b2, "$editor");
                C2249a c2249a = c1359b0.f6614K1;
                final List<C2252d> list = c2249a != null ? c2249a.f10260c : null;
                if ((list == null || list.isEmpty()) || list.size() <= 1) {
                    return;
                }
                PopupMenu popupMenu2 = c1359b0.f6619P1;
                Menu menu = popupMenu2.getMenu();
                menu.clear();
                int size = list.size();
                for (int i11 = 1; i11 < size; i11++) {
                    C2252d c2252d = list.get(i11);
                    Context context = c1245b2.getContext();
                    C0898f.m2605d(context, "editor.context");
                    CharSequence charSequence = c2252d.f10269a;
                    if (charSequence == null) {
                        charSequence = context.getString(0);
                        C0898f.m2605d(charSequence, "context.getString(resourceId)");
                    }
                    menu.add(0, i11, 0, charSequence);
                }
                popupMenu2.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: i5.a0
                    @Override // android.widget.PopupMenu.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        C1359b0 c1359b02 = c1359b0;
                        C0898f.m2606e(c1359b02, "this$0");
                        Runnable runnable = ((C2252d) list.get(menuItem.getItemId())).f10270b;
                        if (runnable != null) {
                            runnable.run();
                        }
                        c1359b02.mo3615b();
                        return true;
                    }
                });
                popupMenu2.show();
                c1359b0.f6622S1 = true;
            }
        });
        popupMenu.setOnDismissListener(new PopupMenu.OnDismissListener() { // from class: i5.w
            @Override // android.widget.PopupMenu.OnDismissListener
            public final void onDismiss(PopupMenu popupMenu2) {
                C1359b0 c1359b0 = C1359b0.this;
                C0898f.m2606e(c1359b0, "this$0");
                c1359b0.f6622S1 = false;
            }
        });
        m3719e();
    }

    /* renamed from: f */
    public static void m3718f(C1359b0 c1359b0, Runnable runnable) {
        C1245b c1245b = c1359b0.f6465e;
        c1245b.removeCallbacks(runnable);
        c1245b.m3487d0(runnable, 1000L);
    }

    @Override // p063h5.C1302a
    /* renamed from: b */
    public final void mo3615b() {
        if (m3617d()) {
            Thread.dumpStack();
            super.mo3615b();
        }
    }

    /* renamed from: e */
    public final void m3719e() {
        C1245b c1245b = this.f6465e;
        C1510a colorScheme = c1245b.getColorScheme();
        C0898f.m2605d(colorScheme, "editor.colorScheme");
        this.f6607D1.setTextColor(colorScheme.m3927c(54));
        this.f6608E1.setTextColor(colorScheme.m3927c(55));
        this.f6609F1.setTextColor(colorScheme.m3927c(56));
        this.f6610G1.setTextColor(colorScheme.m3927c(56));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(c1245b.getDpUnit() * 5);
        gradientDrawable.setColor(colorScheme.m3927c(53));
        this.f6606C1.setBackground(gradientDrawable);
    }

    /* renamed from: g */
    public final void m3720g(C0638b c0638b) {
        C0898f.m2606e(c0638b, "pos");
        C1245b c1245b = this.f6465e;
        C2251c diagnostics = c1245b.getDiagnostics();
        if (diagnostics == null) {
            m3721h(null, null);
            return;
        }
        ArrayList arrayList = this.f6616M1;
        int i7 = c0638b.f3140a;
        diagnostics.m5456a(i7 - 1, i7 + 1, arrayList);
        if (!arrayList.isEmpty()) {
            boolean z6 = false;
            int i8 = ((C2250b) arrayList.get(0)).f10266s - ((C2250b) arrayList.get(0)).f10265m;
            int size = arrayList.size();
            int i9 = 0;
            for (int i10 = 1; i10 < size; i10++) {
                int i11 = ((C2250b) arrayList.get(i10)).f10266s - ((C2250b) arrayList.get(i10)).f10265m;
                if (i11 < i8) {
                    i9 = i10;
                    i8 = i11;
                }
            }
            m3721h(((C2250b) arrayList.get(i9)).f10264e, c0638b);
            InterfaceC1375l m3468K = c1245b.m3468K(C1374k.class);
            C0898f.m2605d(m3468K, "getComponent(T::class.java)");
            C1374k c1374k = (C1374k) m3468K;
            C1374k.a aVar = c1374k.f6676F1;
            if (c1374k.m3617d() || c1374k.f6684N1 > c1374k.f6685O1 || (aVar != null && aVar.isAlive())) {
                z6 = true;
            }
            if (!z6 && !m3617d()) {
                m3614a(true);
            }
        } else {
            m3721h(null, null);
        }
        arrayList.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0098  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3721h(p194y4.C2249a r8, p022c5.C0638b r9) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p071i5.C1359b0.m3721h(y4.a, c5.b):void");
    }

    /* renamed from: i */
    public final void m3722i() {
        C0638b c0638b = this.f6613J1;
        if (c0638b == null) {
            return;
        }
        int i7 = c0638b.f3141b;
        int i8 = c0638b.f3142c;
        C1245b c1245b = this.f6465e;
        float m3482Y = (c1245b.m3482Y() + c1245b.f5990C1.m3801b(i7, i8)[1]) - c1245b.getOffsetX();
        float offsetY = (c1245b.f5990C1.m3801b(c0638b.f3141b, c0638b.f3142c)[0] - c1245b.getOffsetY()) - c1245b.getRowHeight();
        c1245b.getLocationInWindow(this.f6618O1);
        float f7 = r5[1] + offsetY;
        float height = (c1245b.getHeight() - offsetY) - c1245b.getRowHeight();
        InterfaceC1375l m3468K = c1245b.m3468K(C1374k.class);
        C0898f.m2605d(m3468K, "getComponent(T::class.java)");
        boolean m3617d = ((C1374k) m3468K).m3617d();
        float rowHeight = (f7 > height || m3617d) ? offsetY - this.f6460A1 : (c1245b.getRowHeight() * 1.5f) + offsetY;
        if (m3617d && rowHeight < 0.0f) {
            mo3615b();
            return;
        }
        float f8 = m3482Y - (this.f6471z1 / 2);
        int offsetX = c1245b.getOffsetX() + ((int) (f8 >= 0.0f ? f8 : 0.0f));
        int offsetY2 = c1245b.getOffsetY();
        this.f6469x1 = offsetX;
        this.f6470y1 = offsetY2 + ((int) rowHeight);
        this.f6468w1 = c1245b.getOffsetY();
        this.f6463Z = c1245b.getOffsetX();
        m3614a(false);
    }
}
