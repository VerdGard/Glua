package p143s;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.AbstractC0282a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R$styleable;
import p127q.C1719j;

/* renamed from: s.d */
/* loaded from: classes.dex */
public abstract class AbstractC1864d extends AbstractC0282a {

    /* renamed from: y1 */
    public boolean f8378y1;

    /* renamed from: z1 */
    public boolean f8379z1;

    public AbstractC1864d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.AbstractC0282a
    /* renamed from: e */
    public void mo932e(AttributeSet attributeSet) {
        super.mo932e(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.f1264b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                if (index == R$styleable.ConstraintLayout_Layout_android_visibility) {
                    this.f8378y1 = true;
                } else if (index == R$styleable.ConstraintLayout_Layout_android_elevation) {
                    this.f8379z1 = true;
                }
            }
        }
    }

    /* renamed from: h */
    public void mo934h(C1719j c1719j, int i7, int i8) {
    }

    @Override // androidx.constraintlayout.widget.AbstractC0282a, android.view.View
    public final void onAttachedToWindow() {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.f8378y1 || this.f8379z1) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i7 = 0; i7 < this.f1274e; i7++) {
                View view = constraintLayout.f1181c.get(this.f1273c[i7]);
                if (view != null) {
                    if (this.f8378y1) {
                        view.setVisibility(visibility);
                    }
                    if (this.f8379z1 && elevation > 0.0f) {
                        view.setTranslationZ(view.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f7) {
        super.setElevation(f7);
        m944c();
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        m944c();
    }
}
