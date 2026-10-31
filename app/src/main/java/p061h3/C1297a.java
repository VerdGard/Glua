package p061h3;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.ext.C0090b;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.activity.C0143v;
import androidx.appcompat.widget.C0228g;
import com.google.android.material.R$attr;
import com.google.android.material.R$id;
import com.google.android.material.R$string;
import com.google.android.material.R$style;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p025d.C0872a;
import p066i0.C1308b;
import p101m3.C1549a;
import p101m3.C1550b;
import p131q3.C1767w;
import p182x0.AbstractC2167c;
import p182x0.C2166b;
import p182x0.C2168d;
import p182x0.C2169e;
import p189y.C2213a;

/* renamed from: h3.a */
/* loaded from: classes.dex */
public final class C1297a extends C0228g {

    /* renamed from: Q1 */
    public static final int f6433Q1 = R$style.Widget_MaterialComponents_CompoundButton_CheckBox;

    /* renamed from: R1 */
    public static final int[] f6434R1 = {R$attr.state_indeterminate};

    /* renamed from: S1 */
    public static final int[] f6435S1;

    /* renamed from: T1 */
    public static final int[][] f6436T1;

    /* renamed from: U1 */
    @SuppressLint({"DiscouragedApi"})
    public static final int f6437U1;

    /* renamed from: A1 */
    public boolean f6438A1;

    /* renamed from: B1 */
    public boolean f6439B1;

    /* renamed from: C1 */
    public CharSequence f6440C1;

    /* renamed from: D1 */
    public Drawable f6441D1;

    /* renamed from: E1 */
    public Drawable f6442E1;

    /* renamed from: F1 */
    public boolean f6443F1;

    /* renamed from: G1 */
    public ColorStateList f6444G1;

    /* renamed from: H1 */
    public ColorStateList f6445H1;

    /* renamed from: I1 */
    public PorterDuff.Mode f6446I1;

    /* renamed from: J1 */
    public int f6447J1;

    /* renamed from: K1 */
    public int[] f6448K1;

    /* renamed from: L1 */
    public boolean f6449L1;

    /* renamed from: M1 */
    public CharSequence f6450M1;

    /* renamed from: N1 */
    public CompoundButton.OnCheckedChangeListener f6451N1;

    /* renamed from: O1 */
    public final C2168d f6452O1;

    /* renamed from: P1 */
    public final a f6453P1;

    /* renamed from: w1 */
    public final LinkedHashSet<c> f6454w1;

    /* renamed from: x1 */
    public final LinkedHashSet<b> f6455x1;

    /* renamed from: y1 */
    public ColorStateList f6456y1;

    /* renamed from: z1 */
    public boolean f6457z1;

    /* renamed from: h3.a$a */
    public class a extends AbstractC2167c {
        public a() {
        }

        @Override // p182x0.AbstractC2167c
        /* renamed from: a */
        public final void mo3610a(Drawable drawable) {
            ColorStateList colorStateList = C1297a.this.f6444G1;
            if (colorStateList != null) {
                C2213a.b.m5372h(drawable, colorStateList);
            }
        }

        @Override // p182x0.AbstractC2167c
        /* renamed from: b */
        public final void mo3611b(Drawable drawable) {
            C1297a c1297a = C1297a.this;
            ColorStateList colorStateList = c1297a.f6444G1;
            if (colorStateList != null) {
                C2213a.b.m5371g(drawable, colorStateList.getColorForState(c1297a.f6448K1, colorStateList.getDefaultColor()));
            }
        }
    }

    /* renamed from: h3.a$b */
    public interface b {
        /* renamed from: a */
        void m3612a();
    }

    /* renamed from: h3.a$c */
    public interface c {
        /* renamed from: a */
        void m3613a();
    }

    /* renamed from: h3.a$d */
    public static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: c */
        public int f6459c;

        /* renamed from: h3.a$d$a */
        public class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i7) {
                return new d[i7];
            }
        }

        public d(Parcel parcel) {
            super(parcel);
            this.f6459c = ((Integer) parcel.readValue(d.class.getClassLoader())).intValue();
        }

        public d(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" CheckedState=");
            int i7 = this.f6459c;
            return C0090b.m220f(sb, i7 != 1 ? i7 != 2 ? "unchecked" : "indeterminate" : "checked", "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeValue(Integer.valueOf(this.f6459c));
        }
    }

    static {
        int i7 = R$attr.state_error;
        f6435S1 = new int[]{i7};
        f6436T1 = new int[][]{new int[]{R.attr.state_enabled, i7}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
        f6437U1 = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1297a(android.content.Context r13, android.util.AttributeSet r14) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p061h3.C1297a.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private String getButtonStateDescription() {
        Resources resources;
        int i7;
        int i8 = this.f6447J1;
        if (i8 == 1) {
            resources = getResources();
            i7 = R$string.mtrl_checkbox_state_description_checked;
        } else if (i8 == 0) {
            resources = getResources();
            i7 = R$string.mtrl_checkbox_state_description_unchecked;
        } else {
            resources = getResources();
            i7 = R$string.mtrl_checkbox_state_description_indeterminate;
        }
        return resources.getString(i7);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f6456y1 == null) {
            int m400B = C0143v.m400B(this, R$attr.colorControlActivated);
            int m400B2 = C0143v.m400B(this, R$attr.colorError);
            int m400B3 = C0143v.m400B(this, R$attr.colorSurface);
            int m400B4 = C0143v.m400B(this, R$attr.colorOnSurface);
            this.f6456y1 = new ColorStateList(f6436T1, new int[]{C0143v.m417O(1.0f, m400B3, m400B2), C0143v.m417O(1.0f, m400B3, m400B), C0143v.m417O(0.54f, m400B3, m400B4), C0143v.m417O(0.38f, m400B3, m400B4), C0143v.m417O(0.38f, m400B3, m400B4)});
        }
        return this.f6456y1;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f6444G1;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    /* renamed from: b */
    public final void m3609b() {
        LayerDrawable layerDrawable;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C2169e c2169e;
        this.f6441D1 = C1549a.m3947a(this.f6441D1, this.f6444G1, C1308b.a.m3629b(this));
        this.f6442E1 = C1549a.m3947a(this.f6442E1, this.f6445H1, this.f6446I1);
        if (this.f6443F1) {
            C2168d c2168d = this.f6452O1;
            if (c2168d != null) {
                Drawable drawable = c2168d.f9818c;
                a aVar = this.f6453P1;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (aVar.f9802a == null) {
                        aVar.f9802a = new C2166b(aVar);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(aVar.f9802a);
                }
                ArrayList<AbstractC2167c> arrayList = c2168d.f9804X;
                C2168d.b bVar = c2168d.f9806e;
                if (arrayList != null && aVar != null) {
                    arrayList.remove(aVar);
                    if (c2168d.f9804X.size() == 0 && (c2169e = c2168d.f9808s) != null) {
                        bVar.f9811b.removeListener(c2169e);
                        c2168d.f9808s = null;
                    }
                }
                Drawable drawable2 = c2168d.f9818c;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    if (aVar.f9802a == null) {
                        aVar.f9802a = new C2166b(aVar);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(aVar.f9802a);
                } else if (aVar != null) {
                    if (c2168d.f9804X == null) {
                        c2168d.f9804X = new ArrayList<>();
                    }
                    if (!c2168d.f9804X.contains(aVar)) {
                        c2168d.f9804X.add(aVar);
                        if (c2168d.f9808s == null) {
                            c2168d.f9808s = new C2169e(c2168d);
                        }
                        bVar.f9811b.addListener(c2168d.f9808s);
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Drawable drawable3 = this.f6441D1;
                if ((drawable3 instanceof AnimatedStateListDrawable) && c2168d != null) {
                    int i7 = R$id.checked;
                    int i8 = R$id.unchecked;
                    ((AnimatedStateListDrawable) drawable3).addTransition(i7, i8, c2168d, false);
                    ((AnimatedStateListDrawable) this.f6441D1).addTransition(R$id.indeterminate, i8, c2168d, false);
                }
            }
        }
        Drawable drawable4 = this.f6441D1;
        if (drawable4 != null && (colorStateList2 = this.f6444G1) != null) {
            C2213a.b.m5372h(drawable4, colorStateList2);
        }
        Drawable drawable5 = this.f6442E1;
        if (drawable5 != null && (colorStateList = this.f6445H1) != null) {
            C2213a.b.m5372h(drawable5, colorStateList);
        }
        Drawable drawable6 = this.f6441D1;
        Drawable drawable7 = this.f6442E1;
        if (drawable6 == null) {
            drawable6 = drawable7;
        } else if (drawable7 != null) {
            int intrinsicWidth = drawable7.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable6.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable7.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable6.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable6.getIntrinsicWidth() || intrinsicHeight > drawable6.getIntrinsicHeight()) {
                float f7 = intrinsicWidth / intrinsicHeight;
                if (f7 >= drawable6.getIntrinsicWidth() / drawable6.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable6.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f7);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable6.getIntrinsicHeight();
                    intrinsicWidth = (int) (f7 * intrinsicHeight);
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
                layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
                layerDrawable.setLayerGravity(1, 17);
            } else {
                layerDrawable = new LayerDrawable(new Drawable[]{drawable6, new C1550b(drawable7, intrinsicWidth, intrinsicHeight).f4756c});
                int max = Math.max((drawable6.getIntrinsicWidth() - intrinsicWidth) / 2, 0);
                int max2 = Math.max((drawable6.getIntrinsicHeight() - intrinsicHeight) / 2, 0);
                layerDrawable.setLayerInset(1, max, max2, max, max2);
            }
            drawable6 = layerDrawable;
        }
        super.setButtonDrawable(drawable6);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f6441D1;
    }

    public Drawable getButtonIconDrawable() {
        return this.f6442E1;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f6445H1;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f6446I1;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f6444G1;
    }

    public int getCheckedState() {
        return this.f6447J1;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f6440C1;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f6447J1 == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f6457z1 && this.f6444G1 == null && this.f6445H1 == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i7) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i7 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, f6434R1);
        }
        if (this.f6439B1) {
            View.mergeDrawableStates(onCreateDrawableState, f6435S1);
        }
        int i8 = 0;
        while (true) {
            if (i8 >= onCreateDrawableState.length) {
                copyOf = Arrays.copyOf(onCreateDrawableState, onCreateDrawableState.length + 1);
                copyOf[onCreateDrawableState.length] = 16842912;
                break;
            }
            int i9 = onCreateDrawableState[i8];
            if (i9 == 16842912) {
                copyOf = onCreateDrawableState;
                break;
            }
            if (i9 == 0) {
                copyOf = (int[]) onCreateDrawableState.clone();
                copyOf[i8] = 16842912;
                break;
            }
            i8++;
        }
        this.f6448K1 = copyOf;
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable m3627a;
        if (!this.f6438A1 || !TextUtils.isEmpty(getText()) || (m3627a = C1308b.m3627a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - m3627a.getIntrinsicWidth()) / 2) * (C1767w.m4239b(this) ? -1 : 1);
        int save = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = m3627a.getBounds();
            C2213a.b.m5370f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f6439B1) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f6440C1));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        setCheckedState(dVar.f6459c);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f6459c = getCheckedState();
        return dVar;
    }

    @Override // androidx.appcompat.widget.C0228g, android.widget.CompoundButton
    public void setButtonDrawable(int i7) {
        setButtonDrawable(C0872a.m2561a(getContext(), i7));
    }

    @Override // androidx.appcompat.widget.C0228g, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f6441D1 = drawable;
        this.f6443F1 = false;
        m3609b();
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f6442E1 = drawable;
        m3609b();
    }

    public void setButtonIconDrawableResource(int i7) {
        setButtonIconDrawable(C0872a.m2561a(getContext(), i7));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f6445H1 == colorStateList) {
            return;
        }
        this.f6445H1 = colorStateList;
        m3609b();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f6446I1 == mode) {
            return;
        }
        this.f6446I1 = mode;
        m3609b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f6444G1 == colorStateList) {
            return;
        }
        this.f6444G1 = colorStateList;
        m3609b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        m3609b();
    }

    public void setCenterIfNoTextEnabled(boolean z6) {
        this.f6438A1 = z6;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z6) {
        setCheckedState(z6 ? 1 : 0);
    }

    public void setCheckedState(int i7) {
        Object systemService;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f6447J1 != i7) {
            this.f6447J1 = i7;
            super.setChecked(i7 == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.f6450M1 == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f6449L1) {
                return;
            }
            this.f6449L1 = true;
            LinkedHashSet<b> linkedHashSet = this.f6455x1;
            if (linkedHashSet != null) {
                Iterator<b> it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    it.next().m3612a();
                }
            }
            if (this.f6447J1 != 2 && (onCheckedChangeListener = this.f6451N1) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (Build.VERSION.SDK_INT >= 26) {
                systemService = getContext().getSystemService((Class<Object>) AutofillManager.class);
                AutofillManager autofillManager = (AutofillManager) systemService;
                if (autofillManager != null) {
                    autofillManager.notifyValueChanged(this);
                }
            }
            this.f6449L1 = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z6) {
        super.setEnabled(z6);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f6440C1 = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i7) {
        setErrorAccessibilityLabel(i7 != 0 ? getResources().getText(i7) : null);
    }

    public void setErrorShown(boolean z6) {
        if (this.f6439B1 == z6) {
            return;
        }
        this.f6439B1 = z6;
        refreshDrawableState();
        Iterator<c> it = this.f6454w1.iterator();
        while (it.hasNext()) {
            it.next().m3613a();
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f6451N1 = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f6450M1 = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z6) {
        this.f6457z1 = z6;
        C1308b.a.m3630c(this, z6 ? getMaterialThemeColorsTintList() : null);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }
}
