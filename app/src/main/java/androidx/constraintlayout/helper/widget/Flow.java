package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.R$styleable;
import p127q.C1713d;
import p127q.C1715f;
import p127q.C1719j;
import p143s.AbstractC1864d;

/* loaded from: classes.dex */
public class Flow extends AbstractC1864d {

    /* renamed from: A1 */
    public C1715f f1169A1;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // p143s.AbstractC1864d, androidx.constraintlayout.widget.AbstractC0282a
    /* renamed from: e */
    public final void mo932e(AttributeSet attributeSet) {
        super.mo932e(attributeSet);
        this.f1169A1 = new C1715f();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.f1264b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                if (index == R$styleable.ConstraintLayout_Layout_android_orientation) {
                    this.f1169A1.f7829J0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == R$styleable.ConstraintLayout_Layout_android_padding) {
                    C1715f c1715f = this.f1169A1;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c1715f.f7870g0 = dimensionPixelSize;
                    c1715f.f7871h0 = dimensionPixelSize;
                    c1715f.f7872i0 = dimensionPixelSize;
                    c1715f.f7873j0 = dimensionPixelSize;
                } else if (index == R$styleable.ConstraintLayout_Layout_android_paddingStart) {
                    C1715f c1715f2 = this.f1169A1;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c1715f2.f7872i0 = dimensionPixelSize2;
                    c1715f2.f7874k0 = dimensionPixelSize2;
                    c1715f2.f7875l0 = dimensionPixelSize2;
                } else if (index == R$styleable.ConstraintLayout_Layout_android_paddingEnd) {
                    this.f1169A1.f7873j0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == R$styleable.ConstraintLayout_Layout_android_paddingLeft) {
                    this.f1169A1.f7874k0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == R$styleable.ConstraintLayout_Layout_android_paddingTop) {
                    this.f1169A1.f7870g0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == R$styleable.ConstraintLayout_Layout_android_paddingRight) {
                    this.f1169A1.f7875l0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == R$styleable.ConstraintLayout_Layout_android_paddingBottom) {
                    this.f1169A1.f7871h0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_wrapMode) {
                    this.f1169A1.f7827H0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_horizontalStyle) {
                    this.f1169A1.f7836r0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_verticalStyle) {
                    this.f1169A1.f7837s0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_firstHorizontalStyle) {
                    this.f1169A1.f7838t0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_lastHorizontalStyle) {
                    this.f1169A1.f7840v0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_firstVerticalStyle) {
                    this.f1169A1.f7839u0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_lastVerticalStyle) {
                    this.f1169A1.f7841w0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_horizontalBias) {
                    this.f1169A1.f7842x0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_firstHorizontalBias) {
                    this.f1169A1.f7844z0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_lastHorizontalBias) {
                    this.f1169A1.f7821B0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_firstVerticalBias) {
                    this.f1169A1.f7820A0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_lastVerticalBias) {
                    this.f1169A1.f7822C0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_verticalBias) {
                    this.f1169A1.f7843y0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_horizontalAlign) {
                    this.f1169A1.f7825F0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_verticalAlign) {
                    this.f1169A1.f7826G0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_horizontalGap) {
                    this.f1169A1.f7823D0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_verticalGap) {
                    this.f1169A1.f7824E0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_maxElementsWrap) {
                    this.f1169A1.f7828I0 = obtainStyledAttributes.getInt(index, -1);
                }
            }
        }
        this.f1276s = this.f1169A1;
        m946g();
    }

    @Override // androidx.constraintlayout.widget.AbstractC0282a
    /* renamed from: f */
    public final void mo933f(C1713d c1713d, boolean z6) {
        C1715f c1715f = this.f1169A1;
        int i7 = c1715f.f7872i0;
        if (i7 > 0 || c1715f.f7873j0 > 0) {
            if (z6) {
                c1715f.f7874k0 = c1715f.f7873j0;
                c1715f.f7875l0 = i7;
            } else {
                c1715f.f7874k0 = i7;
                c1715f.f7875l0 = c1715f.f7873j0;
            }
        }
    }

    @Override // p143s.AbstractC1864d
    /* renamed from: h */
    public final void mo934h(C1719j c1719j, int i7, int i8) {
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        int mode2 = View.MeasureSpec.getMode(i8);
        int size2 = View.MeasureSpec.getSize(i8);
        if (c1719j == null) {
            setMeasuredDimension(0, 0);
        } else {
            c1719j.mo4184B(mode, size, mode2, size2);
            setMeasuredDimension(c1719j.f7877n0, c1719j.f7878o0);
        }
    }

    @Override // androidx.constraintlayout.widget.AbstractC0282a, android.view.View
    @SuppressLint({"WrongCall"})
    public final void onMeasure(int i7, int i8) {
        mo934h(this.f1169A1, i7, i8);
    }

    public void setFirstHorizontalBias(float f7) {
        this.f1169A1.f7844z0 = f7;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i7) {
        this.f1169A1.f7838t0 = i7;
        requestLayout();
    }

    public void setFirstVerticalBias(float f7) {
        this.f1169A1.f7820A0 = f7;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i7) {
        this.f1169A1.f7839u0 = i7;
        requestLayout();
    }

    public void setHorizontalAlign(int i7) {
        this.f1169A1.f7825F0 = i7;
        requestLayout();
    }

    public void setHorizontalBias(float f7) {
        this.f1169A1.f7842x0 = f7;
        requestLayout();
    }

    public void setHorizontalGap(int i7) {
        this.f1169A1.f7823D0 = i7;
        requestLayout();
    }

    public void setHorizontalStyle(int i7) {
        this.f1169A1.f7836r0 = i7;
        requestLayout();
    }

    public void setMaxElementsWrap(int i7) {
        this.f1169A1.f7828I0 = i7;
        requestLayout();
    }

    public void setOrientation(int i7) {
        this.f1169A1.f7829J0 = i7;
        requestLayout();
    }

    public void setPadding(int i7) {
        C1715f c1715f = this.f1169A1;
        c1715f.f7870g0 = i7;
        c1715f.f7871h0 = i7;
        c1715f.f7872i0 = i7;
        c1715f.f7873j0 = i7;
        requestLayout();
    }

    public void setPaddingBottom(int i7) {
        this.f1169A1.f7871h0 = i7;
        requestLayout();
    }

    public void setPaddingLeft(int i7) {
        this.f1169A1.f7874k0 = i7;
        requestLayout();
    }

    public void setPaddingRight(int i7) {
        this.f1169A1.f7875l0 = i7;
        requestLayout();
    }

    public void setPaddingTop(int i7) {
        this.f1169A1.f7870g0 = i7;
        requestLayout();
    }

    public void setVerticalAlign(int i7) {
        this.f1169A1.f7826G0 = i7;
        requestLayout();
    }

    public void setVerticalBias(float f7) {
        this.f1169A1.f7843y0 = f7;
        requestLayout();
    }

    public void setVerticalGap(int i7) {
        this.f1169A1.f7824E0 = i7;
        requestLayout();
    }

    public void setVerticalStyle(int i7) {
        this.f1169A1.f7837s0 = i7;
        requestLayout();
    }

    public void setWrapMode(int i7) {
        this.f1169A1.f7827H0 = i7;
        requestLayout();
    }
}
