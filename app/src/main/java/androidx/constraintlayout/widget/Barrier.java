package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p127q.C1710a;

/* loaded from: classes.dex */
public class Barrier extends AbstractC0282a {

    /* renamed from: A1 */
    public C1710a f1170A1;

    /* renamed from: y1 */
    public int f1171y1;

    /* renamed from: z1 */
    public int f1172z1;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    @Override // androidx.constraintlayout.widget.AbstractC0282a
    /* renamed from: e */
    public final void mo932e(AttributeSet attributeSet) {
        super.mo932e(attributeSet);
        this.f1170A1 = new C1710a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.f1264b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                if (index == R$styleable.ConstraintLayout_Layout_barrierDirection) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == R$styleable.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.f1170A1.f7715h0 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == R$styleable.ConstraintLayout_Layout_barrierMargin) {
                    this.f1170A1.f7716i0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
        }
        this.f1276s = this.f1170A1;
        m946g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0012, code lost:
    
        if (r0 == 6) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (r0 == 6) goto L9;
     */
    @Override // androidx.constraintlayout.widget.AbstractC0282a
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo933f(p127q.C1713d r4, boolean r5) {
        /*
            r3 = this;
            int r0 = r3.f1171y1
            r3.f1172z1 = r0
            r1 = 6
            r2 = 5
            if (r5 == 0) goto Le
            if (r0 != r2) goto Lb
            goto L14
        Lb:
            if (r0 != r1) goto L17
            goto L10
        Le:
            if (r0 != r2) goto L12
        L10:
            r5 = 0
            goto L15
        L12:
            if (r0 != r1) goto L17
        L14:
            r5 = 1
        L15:
            r3.f1172z1 = r5
        L17:
            boolean r5 = r4 instanceof p127q.C1710a
            if (r5 == 0) goto L21
            q.a r4 = (p127q.C1710a) r4
            int r5 = r3.f1172z1
            r4.f7714g0 = r5
        L21:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.Barrier.mo933f(q.d, boolean):void");
    }

    public int getMargin() {
        return this.f1170A1.f7716i0;
    }

    public int getType() {
        return this.f1171y1;
    }

    public void setAllowsGoneWidget(boolean z6) {
        this.f1170A1.f7715h0 = z6;
    }

    public void setDpMargin(int i7) {
        this.f1170A1.f7716i0 = (int) ((i7 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i7) {
        this.f1170A1.f7716i0 = i7;
    }

    public void setType(int i7) {
        this.f1171y1 = i7;
    }
}
