package com.google.android.material.appbar;

import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0159f;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.R$style;
import java.util.ArrayList;
import java.util.Collections;
import p002a1.C0017d;
import p131q3.C1763s;
import p189y.C2213a;
import p193y3.C2237f;

/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: r2 */
    public static final int f3794r2 = R$style.Widget_MaterialComponents_Toolbar;

    /* renamed from: s2 */
    public static final ImageView.ScaleType[] f3795s2 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: m2 */
    public Integer f3796m2;

    /* renamed from: n2 */
    public boolean f3797n2;

    /* renamed from: o2 */
    public boolean f3798o2;

    /* renamed from: p2 */
    public ImageView.ScaleType f3799p2;

    /* renamed from: q2 */
    public Boolean f3800q2;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialToolbar(android.content.Context r8, android.util.AttributeSet r9) {
        /*
            r7 = this;
            int r3 = com.google.android.material.R$attr.toolbarStyle
            int r4 = com.google.android.material.appbar.MaterialToolbar.f3794r2
            android.content.Context r8 = p038e4.C1138a.m3322a(r8, r9, r3, r4)
            r7.<init>(r8, r9, r3)
            android.content.Context r8 = r7.getContext()
            int[] r2 = com.google.android.material.R$styleable.f3747u
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            android.content.res.TypedArray r9 = p131q3.C1762r.m4235d(r0, r1, r2, r3, r4, r5)
            int r0 = com.google.android.material.R$styleable.MaterialToolbar_navigationIconTint
            boolean r1 = r9.hasValue(r0)
            r2 = -1
            if (r1 == 0) goto L2a
            int r0 = r9.getColor(r0, r2)
            r7.setNavigationIconTint(r0)
        L2a:
            int r0 = com.google.android.material.R$styleable.MaterialToolbar_titleCentered
            boolean r0 = r9.getBoolean(r0, r6)
            r7.f3797n2 = r0
            int r0 = com.google.android.material.R$styleable.MaterialToolbar_subtitleCentered
            boolean r0 = r9.getBoolean(r0, r6)
            r7.f3798o2 = r0
            int r0 = com.google.android.material.R$styleable.MaterialToolbar_logoScaleType
            int r0 = r9.getInt(r0, r2)
            if (r0 < 0) goto L4b
            android.widget.ImageView$ScaleType[] r1 = com.google.android.material.appbar.MaterialToolbar.f3795s2
            int r2 = r1.length
            if (r0 >= r2) goto L4b
            r0 = r1[r0]
            r7.f3799p2 = r0
        L4b:
            int r0 = com.google.android.material.R$styleable.MaterialToolbar_logoAdjustViewBounds
            boolean r1 = r9.hasValue(r0)
            if (r1 == 0) goto L5d
            boolean r0 = r9.getBoolean(r0, r6)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.f3800q2 = r0
        L5d:
            r9.recycle()
            android.graphics.drawable.Drawable r9 = r7.getBackground()
            if (r9 == 0) goto L6b
            boolean r0 = r9 instanceof android.graphics.drawable.ColorDrawable
            if (r0 != 0) goto L6b
            goto L8e
        L6b:
            y3.f r0 = new y3.f
            r0.<init>()
            if (r9 == 0) goto L78
            android.graphics.drawable.ColorDrawable r9 = (android.graphics.drawable.ColorDrawable) r9
            int r6 = r9.getColor()
        L78:
            android.content.res.ColorStateList r9 = android.content.res.ColorStateList.valueOf(r6)
            r0.m5428k(r9)
            r0.m5426i(r8)
            java.util.WeakHashMap<android.view.View, e0.h0> r8 = p034e0.C0946x.f4876a
            float r8 = p034e0.C0946x.i.m2876i(r7)
            r0.m5427j(r8)
            p034e0.C0946x.d.m2841q(r7, r0)
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.MaterialToolbar.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f3799p2;
    }

    public Integer getNavigationIconTint() {
        return this.f3796m2;
    }

    @Override // androidx.appcompat.widget.Toolbar
    /* renamed from: k */
    public final void mo632k(int i7) {
        Menu menu = getMenu();
        boolean z6 = menu instanceof C0159f;
        if (z6) {
            ((C0159f) menu).m547w();
        }
        super.mo632k(i7);
        if (z6) {
            ((C0159f) menu).m546v();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0017d.m77Q(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z6, i7, i8, i9, i10);
        int i11 = 0;
        ImageView imageView2 = null;
        if (this.f3797n2 || this.f3798o2) {
            ArrayList m4237b = C1763s.m4237b(this, getTitle());
            boolean isEmpty = m4237b.isEmpty();
            C1763s.a aVar = C1763s.f8121a;
            TextView textView = isEmpty ? null : (TextView) Collections.min(m4237b, aVar);
            ArrayList m4237b2 = C1763s.m4237b(this, getSubtitle());
            TextView textView2 = m4237b2.isEmpty() ? null : (TextView) Collections.max(m4237b2, aVar);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i12 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i13 = 0; i13 < getChildCount(); i13++) {
                    View childAt = getChildAt(i13);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i12 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i12 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f3797n2 && textView != null) {
                    m2279t(textView, pair);
                }
                if (this.f3798o2 && textView2 != null) {
                    m2279t(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i11 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i11);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i11++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f3800q2;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f3799p2;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f7) {
        super.setElevation(f7);
        Drawable background = getBackground();
        if (background instanceof C2237f) {
            ((C2237f) background).m5427j(f7);
        }
    }

    public void setLogoAdjustViewBounds(boolean z6) {
        Boolean bool = this.f3800q2;
        if (bool == null || bool.booleanValue() != z6) {
            this.f3800q2 = Boolean.valueOf(z6);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f3799p2 != scaleType) {
            this.f3799p2 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f3796m2 != null) {
            drawable = C2213a.m5359g(drawable.mutate());
            C2213a.b.m5371g(drawable, this.f3796m2.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i7) {
        this.f3796m2 = Integer.valueOf(i7);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z6) {
        if (this.f3798o2 != z6) {
            this.f3798o2 = z6;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z6) {
        if (this.f3797n2 != z6) {
            this.f3797n2 = z6;
            requestLayout();
        }
    }

    /* renamed from: t */
    public final void m2279t(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i7 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i8 = measuredWidth2 + i7;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i7, 0), Math.max(i8 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i7 += max;
            i8 -= max;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i8 - i7, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i7, textView.getTop(), i8, textView.getBottom());
    }
}
