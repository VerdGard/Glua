package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.ext.Tools;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.C0143v;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0359m;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$drawable;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.R$string;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.datepicker.C0776a;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p025d.C0872a;
import p034e0.C0923h0;
import p034e0.C0929k0;
import p034e0.C0931l0;
import p034e0.C0937o0;
import p034e0.C0946x;
import p093l3.ViewOnTouchListenerC1508a;
import p163u3.C1971b;
import p181x.C2152a;
import p193y3.C2237f;

/* renamed from: com.google.android.material.datepicker.r */
/* loaded from: classes.dex */
public final class C0800r<S> extends DialogInterfaceOnCancelListenerC0359m {

    /* renamed from: B2 */
    public int f4179B2;

    /* renamed from: C2 */
    public InterfaceC0782d<S> f4180C2;

    /* renamed from: D2 */
    public AbstractC0777a0<S> f4181D2;

    /* renamed from: E2 */
    public C0776a f4182E2;

    /* renamed from: F2 */
    public AbstractC0786f f4183F2;

    /* renamed from: G2 */
    public C0791i<S> f4184G2;

    /* renamed from: H2 */
    public int f4185H2;

    /* renamed from: I2 */
    public CharSequence f4186I2;

    /* renamed from: J2 */
    public boolean f4187J2;

    /* renamed from: K2 */
    public int f4188K2;

    /* renamed from: L2 */
    public int f4189L2;

    /* renamed from: M2 */
    public CharSequence f4190M2;

    /* renamed from: N2 */
    public int f4191N2;

    /* renamed from: O2 */
    public CharSequence f4192O2;

    /* renamed from: P2 */
    public TextView f4193P2;

    /* renamed from: Q2 */
    public TextView f4194Q2;

    /* renamed from: R2 */
    public CheckableImageButton f4195R2;

    /* renamed from: S2 */
    public C2237f f4196S2;

    /* renamed from: T2 */
    public Button f4197T2;

    /* renamed from: U2 */
    public boolean f4198U2;

    /* renamed from: V2 */
    public CharSequence f4199V2;

    /* renamed from: W2 */
    public CharSequence f4200W2;

    /* renamed from: x2 */
    public final LinkedHashSet<InterfaceC0802t<? super S>> f4201x2 = new LinkedHashSet<>();

    /* renamed from: y2 */
    public final LinkedHashSet<View.OnClickListener> f4202y2 = new LinkedHashSet<>();

    /* renamed from: z2 */
    public final LinkedHashSet<DialogInterface.OnCancelListener> f4203z2 = new LinkedHashSet<>();

    /* renamed from: A2 */
    public final LinkedHashSet<DialogInterface.OnDismissListener> f4178A2 = new LinkedHashSet<>();

    /* renamed from: com.google.android.material.datepicker.r$a */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C0800r c0800r = C0800r.this;
            Iterator<InterfaceC0802t<? super S>> it = c0800r.f4201x2.iterator();
            while (it.hasNext()) {
                InterfaceC0802t<? super S> next = it.next();
                c0800r.m2432R().m2419q();
                next.m2435a();
            }
            c0800r.m1210O(false, false);
        }
    }

    /* renamed from: com.google.android.material.datepicker.r$b */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C0800r c0800r = C0800r.this;
            Iterator<View.OnClickListener> it = c0800r.f4202y2.iterator();
            while (it.hasNext()) {
                it.next().onClick(view);
            }
            c0800r.m1210O(false, false);
        }
    }

    /* renamed from: com.google.android.material.datepicker.r$c */
    public class c extends AbstractC0808z<S> {
        public c() {
        }

        @Override // com.google.android.material.datepicker.AbstractC0808z
        /* renamed from: a */
        public final void mo2434a(S s7) {
            C0800r c0800r = C0800r.this;
            InterfaceC0782d<S> m2432R = c0800r.m2432R();
            c0800r.m1237i();
            String m2413e = m2432R.m2413e();
            TextView textView = c0800r.f4194Q2;
            InterfaceC0782d<S> m2432R2 = c0800r.m2432R();
            c0800r.m1228I();
            textView.setContentDescription(m2432R2.m2417k());
            c0800r.f4194Q2.setText(m2413e);
            c0800r.f4197T2.setEnabled(c0800r.m2432R().m2416i());
        }
    }

    /* renamed from: S */
    public static int m2429S(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R$dimen.mtrl_calendar_content_padding);
        Calendar m2424d = C0785e0.m2424d();
        m2424d.set(5, 1);
        Calendar m2423c = C0785e0.m2423c(m2424d);
        m2423c.get(2);
        m2423c.get(1);
        int maximum = m2423c.getMaximum(7);
        m2423c.getActualMaximum(5);
        m2423c.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R$dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R$dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    /* renamed from: T */
    public static boolean m2430T(Context context) {
        return m2431U(R.attr.windowFullscreen, context);
    }

    /* renamed from: U */
    public static boolean m2431U(int i7, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C1971b.m4584c(R$attr.materialCalendarStyle, context, C0791i.class.getCanonicalName()).data, new int[]{i7});
        boolean z6 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z6;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0359m, androidx.fragment.app.ComponentCallbacksC0361n
    /* renamed from: A */
    public final void mo1207A() {
        this.f4181D2.f4118h2.clear();
        super.mo1207A();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0359m
    /* renamed from: P */
    public final Dialog mo1211P(Bundle bundle) {
        Context m1228I = m1228I();
        m1228I();
        int i7 = this.f4179B2;
        if (i7 == 0) {
            i7 = m2432R().m2414f();
        }
        Dialog dialog = new Dialog(m1228I, i7);
        Context context = dialog.getContext();
        this.f4187J2 = m2430T(context);
        int i8 = R$attr.materialCalendarStyle;
        int i9 = R$style.Widget_MaterialComponents_MaterialCalendar;
        this.f4196S2 = new C2237f(context, null, i8, i9);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, R$styleable.f3740n, i8, i9);
        int color = obtainStyledAttributes.getColor(R$styleable.MaterialCalendar_backgroundTint, 0);
        obtainStyledAttributes.recycle();
        this.f4196S2.m5426i(context);
        this.f4196S2.m5428k(ColorStateList.valueOf(color));
        C2237f c2237f = this.f4196S2;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        c2237f.m5427j(C0946x.i.m2876i(decorView));
        return dialog;
    }

    /* renamed from: R */
    public final InterfaceC0782d<S> m2432R() {
        if (this.f4180C2 == null) {
            this.f4180C2 = (InterfaceC0782d) this.f1800Z.getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f4180C2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00de  */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.fragment.app.n, com.google.android.material.datepicker.u] */
    /* renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2433V() {
        /*
            r8 = this;
            r8.m1228I()
            int r0 = r8.f4179B2
            if (r0 == 0) goto L8
            goto L10
        L8:
            com.google.android.material.datepicker.d r0 = r8.m2432R()
            int r0 = r0.m2414f()
        L10:
            com.google.android.material.datepicker.d r1 = r8.m2432R()
            com.google.android.material.datepicker.a r2 = r8.f4182E2
            com.google.android.material.datepicker.f r3 = r8.f4183F2
            com.google.android.material.datepicker.i r4 = new com.google.android.material.datepicker.i
            r4.<init>()
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r6 = "THEME_RES_ID_KEY"
            r5.putInt(r6, r0)
            java.lang.String r7 = "GRID_SELECTOR_KEY"
            r5.putParcelable(r7, r1)
            java.lang.String r1 = "CALENDAR_CONSTRAINTS_KEY"
            r5.putParcelable(r1, r2)
            java.lang.String r7 = "DAY_VIEW_DECORATOR_KEY"
            r5.putParcelable(r7, r3)
            com.google.android.material.datepicker.v r2 = r2.f4110s
            java.lang.String r3 = "CURRENT_MONTH_KEY"
            r5.putParcelable(r3, r2)
            r4.m1232M(r5)
            r8.f4184G2 = r4
            int r2 = r8.f4188K2
            r3 = 1
            if (r2 != r3) goto L66
            com.google.android.material.datepicker.d r2 = r8.m2432R()
            com.google.android.material.datepicker.a r4 = r8.f4182E2
            com.google.android.material.datepicker.u r5 = new com.google.android.material.datepicker.u
            r5.<init>()
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            r7.putInt(r6, r0)
            java.lang.String r0 = "DATE_SELECTOR_KEY"
            r7.putParcelable(r0, r2)
            r7.putParcelable(r1, r4)
            r5.m1232M(r7)
            r4 = r5
        L66:
            r8.f4181D2 = r4
            android.widget.TextView r0 = r8.f4193P2
            int r1 = r8.f4188K2
            r2 = 0
            r4 = 2
            if (r1 != r3) goto L87
            android.content.Context r1 = r8.m1228I()
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.orientation
            if (r1 != r4) goto L81
            goto L82
        L81:
            r3 = 0
        L82:
            if (r3 == 0) goto L87
            java.lang.CharSequence r1 = r8.f4200W2
            goto L89
        L87:
            java.lang.CharSequence r1 = r8.f4199V2
        L89:
            r0.setText(r1)
            com.google.android.material.datepicker.d r0 = r8.m2432R()
            r8.m1237i()
            java.lang.String r0 = r0.m2413e()
            android.widget.TextView r1 = r8.f4194Q2
            com.google.android.material.datepicker.d r3 = r8.m2432R()
            r8.m1228I()
            java.lang.String r3 = r3.m2417k()
            r1.setContentDescription(r3)
            android.widget.TextView r1 = r8.f4194Q2
            r1.setText(r0)
            androidx.fragment.app.x r0 = r8.m1236g()
            r0.getClass()
            androidx.fragment.app.a r1 = new androidx.fragment.app.a
            r1.<init>(r0)
            int r0 = com.google.android.material.R$id.mtrl_calendar_frame
            com.google.android.material.datepicker.a0<S> r3 = r8.f4181D2
            if (r0 == 0) goto Lde
            r5 = 0
            r1.m1136e(r0, r3, r5, r4)
            boolean r0 = r1.f1692g
            if (r0 != 0) goto Ld6
            androidx.fragment.app.x r0 = r1.f1627p
            r0.m1338y(r1, r2)
            com.google.android.material.datepicker.a0<S> r0 = r8.f4181D2
            com.google.android.material.datepicker.r$c r1 = new com.google.android.material.datepicker.r$c
            r1.<init>()
            r0.mo2409O(r1)
            return
        Ld6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This transaction is already being added to the back stack"
            r0.<init>(r1)
            throw r0
        Lde:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Must use non-zero containerViewId"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.C0800r.m2433V():void");
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0359m, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f4203z2.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0359m, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f4178A2.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.f1793U1;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0359m, androidx.fragment.app.ComponentCallbacksC0361n
    /* renamed from: t */
    public final void mo1215t(Bundle bundle) {
        super.mo1215t(bundle);
        if (bundle == null) {
            bundle = this.f1800Z;
        }
        this.f4179B2 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f4180C2 = (InterfaceC0782d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f4182E2 = (C0776a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f4183F2 = (AbstractC0786f) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f4185H2 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f4186I2 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f4188K2 = bundle.getInt("INPUT_MODE_KEY");
        this.f4189L2 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f4190M2 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f4191N2 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f4192O2 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        CharSequence charSequence = this.f4186I2;
        if (charSequence == null) {
            charSequence = m1228I().getResources().getText(this.f4185H2);
        }
        this.f4199V2 = charSequence;
        if (charSequence != null) {
            CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
            if (split.length > 1) {
                charSequence = split[0];
            }
        } else {
            charSequence = null;
        }
        this.f4200W2 = charSequence;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0361n
    /* renamed from: u */
    public final View mo1245u(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View findViewById;
        LinearLayout.LayoutParams layoutParams;
        View inflate = layoutInflater.inflate(this.f4187J2 ? R$layout.mtrl_picker_fullscreen : R$layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.f4187J2) {
            findViewById = inflate.findViewById(R$id.mtrl_calendar_frame);
            layoutParams = new LinearLayout.LayoutParams(m2429S(context), -2);
        } else {
            findViewById = inflate.findViewById(R$id.mtrl_calendar_main_pane);
            layoutParams = new LinearLayout.LayoutParams(m2429S(context), -1);
        }
        findViewById.setLayoutParams(layoutParams);
        TextView textView = (TextView) inflate.findViewById(R$id.mtrl_picker_header_selection_text);
        this.f4194Q2 = textView;
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        C0946x.g.m2863f(textView, 1);
        this.f4195R2 = (CheckableImageButton) inflate.findViewById(R$id.mtrl_picker_header_toggle);
        this.f4193P2 = (TextView) inflate.findViewById(R$id.mtrl_picker_title_text);
        this.f4195R2.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f4195R2;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, C0872a.m2561a(context, R$drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], C0872a.m2561a(context, R$drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f4195R2.setChecked(this.f4188K2 != 0);
        C0946x.m2817r(this.f4195R2, null);
        this.f4195R2.setContentDescription(this.f4195R2.getContext().getString(this.f4188K2 == 1 ? R$string.mtrl_picker_toggle_to_calendar_input_mode : R$string.mtrl_picker_toggle_to_text_input_mode));
        this.f4195R2.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0800r c0800r = C0800r.this;
                c0800r.f4197T2.setEnabled(c0800r.m2432R().m2416i());
                c0800r.f4195R2.toggle();
                int i7 = c0800r.f4188K2 == 1 ? 0 : 1;
                c0800r.f4188K2 = i7;
                c0800r.f4195R2.setContentDescription(c0800r.f4195R2.getContext().getString(i7 == 1 ? R$string.mtrl_picker_toggle_to_calendar_input_mode : R$string.mtrl_picker_toggle_to_text_input_mode));
                c0800r.m2433V();
            }
        });
        this.f4197T2 = (Button) inflate.findViewById(R$id.confirm_button);
        if (m2432R().m2416i()) {
            this.f4197T2.setEnabled(true);
        } else {
            this.f4197T2.setEnabled(false);
        }
        this.f4197T2.setTag("CONFIRM_BUTTON_TAG");
        CharSequence charSequence = this.f4190M2;
        if (charSequence != null) {
            this.f4197T2.setText(charSequence);
        } else {
            int i7 = this.f4189L2;
            if (i7 != 0) {
                this.f4197T2.setText(i7);
            }
        }
        this.f4197T2.setOnClickListener(new a());
        Button button = (Button) inflate.findViewById(R$id.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        CharSequence charSequence2 = this.f4192O2;
        if (charSequence2 != null) {
            button.setText(charSequence2);
        } else {
            int i8 = this.f4191N2;
            if (i8 != 0) {
                button.setText(i8);
            }
        }
        button.setOnClickListener(new b());
        return inflate;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0359m, androidx.fragment.app.ComponentCallbacksC0361n
    /* renamed from: y */
    public final void mo1219y(Bundle bundle) {
        super.mo1219y(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f4179B2);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f4180C2);
        C0776a.b bVar = new C0776a.b(this.f4182E2);
        C0791i<S> c0791i = this.f4184G2;
        C0804v c0804v = c0791i == null ? null : c0791i.f4153m2;
        if (c0804v != null) {
            bVar.f4115c = Long.valueOf(c0804v.f4215Y);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", bVar.f4117e);
        C0804v m2437c = C0804v.m2437c(bVar.f4113a);
        C0804v m2437c2 = C0804v.m2437c(bVar.f4114b);
        C0776a.c cVar = (C0776a.c) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l7 = bVar.f4115c;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new C0776a(m2437c, m2437c2, cVar, l7 != null ? C0804v.m2437c(l7.longValue()) : null, bVar.f4116d));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f4183F2);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f4185H2);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f4186I2);
        bundle.putInt("INPUT_MODE_KEY", this.f4188K2);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f4189L2);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f4190M2);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f4191N2);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f4192O2);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0359m, androidx.fragment.app.ComponentCallbacksC0361n
    /* renamed from: z */
    public final void mo1220z() {
        C0937o0.e cVar;
        C0937o0.e cVar2;
        super.mo1220z();
        Window window = m1212Q().getWindow();
        if (this.f4187J2) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f4196S2);
            if (!this.f4198U2) {
                View findViewById = m1229J().findViewById(R$id.fullscreen_header);
                Integer valueOf = findViewById.getBackground() instanceof ColorDrawable ? Integer.valueOf(((ColorDrawable) findViewById.getBackground()).getColor()) : null;
                int i7 = Build.VERSION.SDK_INT;
                boolean z6 = false;
                boolean z7 = valueOf == null || valueOf.intValue() == 0;
                int m398A = C0143v.m398A(window.getContext(), R.attr.colorBackground, -16777216);
                if (z7) {
                    valueOf = Integer.valueOf(m398A);
                }
                Integer valueOf2 = Integer.valueOf(m398A);
                if (i7 >= 30) {
                    C0931l0.m2735a(window, false);
                } else {
                    C0929k0.m2726a(window, false);
                }
                int m5266e = i7 < 23 ? C2152a.m5266e(C0143v.m398A(window.getContext(), R.attr.statusBarColor, -16777216), Tools.Semaphore.f159S7) : 0;
                int m5266e2 = i7 < 27 ? C2152a.m5266e(C0143v.m398A(window.getContext(), R.attr.navigationBarColor, -16777216), Tools.Semaphore.f159S7) : 0;
                window.setStatusBarColor(m5266e);
                window.setNavigationBarColor(m5266e2);
                int intValue = valueOf.intValue();
                boolean z8 = (m5266e != 0 && (C2152a.m5263b(m5266e) > 0.5d ? 1 : (C2152a.m5263b(m5266e) == 0.5d ? 0 : -1)) > 0) || (m5266e == 0 && (intValue != 0 && (C2152a.m5263b(intValue) > 0.5d ? 1 : (C2152a.m5263b(intValue) == 0.5d ? 0 : -1)) > 0));
                View decorView = window.getDecorView();
                int i8 = Build.VERSION.SDK_INT;
                if (i8 >= 30) {
                    cVar = new C0937o0.d(window);
                } else {
                    cVar = i8 >= 26 ? new C0937o0.c(window, decorView) : i8 >= 23 ? new C0937o0.b(window, decorView) : new C0937o0.a(window, decorView);
                }
                cVar.mo2793b(z8);
                int intValue2 = valueOf2.intValue();
                boolean z9 = intValue2 != 0 && C2152a.m5263b(intValue2) > 0.5d;
                if ((m5266e2 != 0 && C2152a.m5263b(m5266e2) > 0.5d) || (m5266e2 == 0 && z9)) {
                    z6 = true;
                }
                View decorView2 = window.getDecorView();
                int i9 = Build.VERSION.SDK_INT;
                if (i9 >= 30) {
                    cVar2 = new C0937o0.d(window);
                } else {
                    cVar2 = i9 >= 26 ? new C0937o0.c(window, decorView2) : i9 >= 23 ? new C0937o0.b(window, decorView2) : new C0937o0.a(window, decorView2);
                }
                cVar2.mo2794a(z6);
                C0801s c0801s = new C0801s(findViewById.getLayoutParams().height, findViewById, findViewById.getPaddingTop());
                WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
                C0946x.i.m2888u(findViewById, c0801s);
                this.f4198U2 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = m1228I().getResources().getDimensionPixelOffset(R$dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f4196S2, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new ViewOnTouchListenerC1508a(m1212Q(), rect));
        }
        m2433V();
    }
}
