package p021c4;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.C0219d;
import androidx.appcompat.widget.C0262r0;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Locale;
import java.util.WeakHashMap;
import p034e0.C0923h0;
import p034e0.C0946x;
import p181x.C2152a;
import p189y.C2213a;
import p193y3.C2237f;

/* renamed from: c4.u */
/* loaded from: classes.dex */
public final class C0633u extends C0219d {

    /* renamed from: A1 */
    public final float f3110A1;

    /* renamed from: B1 */
    public ColorStateList f3111B1;

    /* renamed from: C1 */
    public int f3112C1;

    /* renamed from: D1 */
    public ColorStateList f3113D1;

    /* renamed from: w1 */
    public final C0262r0 f3114w1;

    /* renamed from: x1 */
    public final AccessibilityManager f3115x1;

    /* renamed from: y1 */
    public final Rect f3116y1;

    /* renamed from: z1 */
    public final int f3117z1;

    /* renamed from: c4.u$a */
    public class a<T> extends ArrayAdapter<String> {

        /* renamed from: c */
        public ColorStateList f3118c;

        /* renamed from: e */
        public ColorStateList f3119e;

        public a(Context context, int i7, String[] strArr) {
            super(context, i7, strArr);
            m2093b();
        }

        /* renamed from: b */
        public final void m2093b() {
            ColorStateList colorStateList;
            C0633u c0633u = C0633u.this;
            ColorStateList colorStateList2 = c0633u.f3113D1;
            ColorStateList colorStateList3 = null;
            if (colorStateList2 != null) {
                int[] iArr = {R.attr.state_pressed};
                colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
            } else {
                colorStateList = null;
            }
            this.f3119e = colorStateList;
            if (c0633u.f3112C1 != 0) {
                if (c0633u.f3113D1 != null) {
                    int[] iArr2 = {R.attr.state_hovered, -16842919};
                    int[] iArr3 = {R.attr.state_selected, -16842919};
                    colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{C2152a.m5264c(c0633u.f3113D1.getColorForState(iArr3, 0), c0633u.f3112C1), C2152a.m5264c(c0633u.f3113D1.getColorForState(iArr2, 0), c0633u.f3112C1), c0633u.f3112C1});
                }
            }
            this.f3118c = colorStateList3;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final View getView(int i7, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i7, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                C0633u c0633u = C0633u.this;
                Drawable drawable = null;
                if (c0633u.getText().toString().contentEquals(textView.getText())) {
                    if (c0633u.f3112C1 != 0) {
                        ColorDrawable colorDrawable = new ColorDrawable(c0633u.f3112C1);
                        if (this.f3119e != null) {
                            C2213a.b.m5372h(colorDrawable, this.f3118c);
                            drawable = new RippleDrawable(this.f3119e, colorDrawable, null);
                        } else {
                            drawable = colorDrawable;
                        }
                    }
                }
                WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
                C0946x.d.m2841q(textView, drawable);
            }
            return view2;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0633u(android.content.Context r8, android.util.AttributeSet r9) {
        /*
            r7 = this;
            int r3 = com.google.android.material.R$attr.autoCompleteTextViewStyle
            r6 = 0
            android.content.Context r8 = p038e4.C1138a.m3322a(r8, r9, r3, r6)
            r7.<init>(r8, r9, r3)
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>()
            r7.f3116y1 = r8
            android.content.Context r8 = r7.getContext()
            int[] r2 = com.google.android.material.R$styleable.f3737k
            int r4 = com.google.android.material.R$style.Widget_AppCompat_AutoCompleteTextView
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            android.content.res.TypedArray r9 = p131q3.C1762r.m4235d(r0, r1, r2, r3, r4, r5)
            int r0 = com.google.android.material.R$styleable.MaterialAutoCompleteTextView_android_inputType
            boolean r1 = r9.hasValue(r0)
            if (r1 == 0) goto L33
            int r0 = r9.getInt(r0, r6)
            if (r0 != 0) goto L33
            r0 = 0
            r7.setKeyListener(r0)
        L33:
            int r0 = com.google.android.material.R$styleable.MaterialAutoCompleteTextView_simpleItemLayout
            int r1 = com.google.android.material.R$layout.mtrl_auto_complete_simple_item
            int r0 = r9.getResourceId(r0, r1)
            r7.f3117z1 = r0
            int r0 = com.google.android.material.R$styleable.MaterialAutoCompleteTextView_android_popupElevation
            int r1 = com.google.android.material.R$dimen.mtrl_exposed_dropdown_menu_popup_elevation
            int r0 = r9.getDimensionPixelOffset(r0, r1)
            float r0 = (float) r0
            r7.f3110A1 = r0
            int r0 = com.google.android.material.R$styleable.MaterialAutoCompleteTextView_dropDownBackgroundTint
            boolean r1 = r9.hasValue(r0)
            if (r1 == 0) goto L5a
            int r0 = r9.getColor(r0, r6)
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r7.f3111B1 = r0
        L5a:
            int r0 = com.google.android.material.R$styleable.MaterialAutoCompleteTextView_simpleItemSelectedColor
            int r0 = r9.getColor(r0, r6)
            r7.f3112C1 = r0
            int r0 = com.google.android.material.R$styleable.MaterialAutoCompleteTextView_simpleItemSelectedRippleColor
            android.content.res.ColorStateList r0 = p163u3.C1972c.m4585a(r8, r9, r0)
            r7.f3113D1 = r0
            java.lang.String r0 = "accessibility"
            java.lang.Object r0 = r8.getSystemService(r0)
            android.view.accessibility.AccessibilityManager r0 = (android.view.accessibility.AccessibilityManager) r0
            r7.f3115x1 = r0
            androidx.appcompat.widget.r0 r0 = new androidx.appcompat.widget.r0
            r0.<init>(r8)
            r7.f3114w1 = r0
            r8 = 1
            r0.f1070N1 = r8
            androidx.appcompat.widget.r r1 = r0.f1071O1
            r1.setFocusable(r8)
            r0.f1060D1 = r7
            r8 = 2
            r1.setInputMethodMode(r8)
            android.widget.ListAdapter r8 = r7.getAdapter()
            r0.mo880p(r8)
            c4.t r8 = new c4.t
            r8.<init>(r7)
            r0.f1061E1 = r8
            int r8 = com.google.android.material.R$styleable.MaterialAutoCompleteTextView_simpleItems
            boolean r0 = r9.hasValue(r8)
            if (r0 == 0) goto La6
            int r8 = r9.getResourceId(r8, r6)
            r7.setSimpleItems(r8)
        La6:
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p021c4.C0633u.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* renamed from: a */
    public static void m2091a(C0633u c0633u, Object obj) {
        c0633u.setText(c0633u.convertSelectionToString(obj), false);
    }

    /* renamed from: b */
    public final TextInputLayout m2092b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        AccessibilityManager accessibilityManager = this.f3115x1;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            this.f3114w1.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f3111B1;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout m2092b = m2092b();
        return (m2092b == null || !m2092b.f4501W1) ? super.getHint() : m2092b.getHint();
    }

    public float getPopupElevation() {
        return this.f3110A1;
    }

    public int getSimpleItemSelectedColor() {
        return this.f3112C1;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f3113D1;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout m2092b = m2092b();
        if (m2092b != null && m2092b.f4501W1 && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f3114w1.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        if (View.MeasureSpec.getMode(i7) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout m2092b = m2092b();
            int i9 = 0;
            if (adapter != null && m2092b != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                C0262r0 c0262r0 = this.f3114w1;
                int min = Math.min(adapter.getCount(), Math.max(0, !c0262r0.mo502c() ? -1 : c0262r0.f1077m.getSelectedItemPosition()) + 15);
                View view = null;
                int i10 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i9) {
                        view = null;
                        i9 = itemViewType;
                    }
                    view = adapter.getView(max, view, m2092b);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i10 = Math.max(i10, view.getMeasuredWidth());
                }
                Drawable m875f = c0262r0.m875f();
                if (m875f != null) {
                    Rect rect = this.f3116y1;
                    m875f.getPadding(rect);
                    i10 += rect.left + rect.right;
                }
                i9 = m2092b.getEndIconView().getMeasuredWidth() + i10;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i9), View.MeasureSpec.getSize(i7)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z6) {
        AccessibilityManager accessibilityManager = this.f3115x1;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        super.onWindowFocusChanged(z6);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t7) {
        super.setAdapter(t7);
        this.f3114w1.mo880p(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        C0262r0 c0262r0 = this.f3114w1;
        if (c0262r0 != null) {
            c0262r0.m876i(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i7) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i7));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f3111B1 = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof C2237f) {
            ((C2237f) dropDownBackground).m5428k(this.f3111B1);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f3114w1.f1062F1 = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i7) {
        super.setRawInputType(i7);
        TextInputLayout m2092b = m2092b();
        if (m2092b != null) {
            m2092b.m2524r();
        }
    }

    public void setSimpleItemSelectedColor(int i7) {
        this.f3112C1 = i7;
        if (getAdapter() instanceof a) {
            ((a) getAdapter()).m2093b();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f3113D1 = colorStateList;
        if (getAdapter() instanceof a) {
            ((a) getAdapter()).m2093b();
        }
    }

    public void setSimpleItems(int i7) {
        setSimpleItems(getResources().getStringArray(i7));
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new a(getContext(), this.f3117z1, strArr));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        AccessibilityManager accessibilityManager = this.f3115x1;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            this.f3114w1.mo500a();
        } else {
            super.showDropDown();
        }
    }
}
