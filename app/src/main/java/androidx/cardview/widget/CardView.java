package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import androidx.activity.C0143v;
import p081k.C1444b;
import p081k.InterfaceC1443a;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* renamed from: x1 */
    public static final int[] f1160x1 = {R.attr.colorBackground};

    /* renamed from: y1 */
    public static final C0143v f1161y1 = new C0143v();

    /* renamed from: c */
    public boolean f1162c;

    /* renamed from: e */
    public boolean f1163e;

    /* renamed from: m */
    public final Rect f1164m;

    /* renamed from: s */
    public final Rect f1165s;

    /* renamed from: w1 */
    public final C0279a f1166w1;

    /* renamed from: androidx.cardview.widget.CardView$a */
    public class C0279a implements InterfaceC1443a {

        /* renamed from: a */
        public Drawable f1167a;

        public C0279a() {
        }

        /* renamed from: a */
        public final void m931a(int i7, int i8, int i9, int i10) {
            CardView cardView = CardView.this;
            cardView.f1165s.set(i7, i8, i9, i10);
            Rect rect = cardView.f1164m;
            CardView.super.setPadding(i7 + rect.left, i8 + rect.top, i9 + rect.right, i10 + rect.bottom);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CardView(android.content.Context r10, android.util.AttributeSet r11) {
        /*
            r9 = this;
            int r0 = androidx.cardview.R$attr.cardViewStyle
            r9.<init>(r10, r11, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r9.f1164m = r1
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r9.f1165s = r2
            androidx.cardview.widget.CardView$a r2 = new androidx.cardview.widget.CardView$a
            r2.<init>()
            r9.f1166w1 = r2
            int[] r3 = androidx.cardview.R$styleable.f1159a
            int r4 = androidx.cardview.R$style.CardView
            android.content.res.TypedArray r10 = r10.obtainStyledAttributes(r11, r3, r0, r4)
            int r11 = androidx.cardview.R$styleable.CardView_cardBackgroundColor
            boolean r0 = r10.hasValue(r11)
            r3 = 0
            if (r0 == 0) goto L30
            android.content.res.ColorStateList r11 = r10.getColorStateList(r11)
            goto L65
        L30:
            android.content.Context r11 = r9.getContext()
            int[] r0 = androidx.cardview.widget.CardView.f1160x1
            android.content.res.TypedArray r11 = r11.obtainStyledAttributes(r0)
            int r0 = r11.getColor(r3, r3)
            r11.recycle()
            r11 = 3
            float[] r11 = new float[r11]
            android.graphics.Color.colorToHSV(r0, r11)
            r0 = 2
            r11 = r11[r0]
            r0 = 1056964608(0x3f000000, float:0.5)
            int r11 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r11 <= 0) goto L57
            android.content.res.Resources r11 = r9.getResources()
            int r0 = androidx.cardview.R$color.cardview_light_background
            goto L5d
        L57:
            android.content.res.Resources r11 = r9.getResources()
            int r0 = androidx.cardview.R$color.cardview_dark_background
        L5d:
            int r11 = r11.getColor(r0)
            android.content.res.ColorStateList r11 = android.content.res.ColorStateList.valueOf(r11)
        L65:
            int r0 = androidx.cardview.R$styleable.CardView_cardCornerRadius
            r4 = 0
            float r0 = r10.getDimension(r0, r4)
            int r5 = androidx.cardview.R$styleable.CardView_cardElevation
            float r5 = r10.getDimension(r5, r4)
            int r6 = androidx.cardview.R$styleable.CardView_cardMaxElevation
            float r4 = r10.getDimension(r6, r4)
            int r6 = androidx.cardview.R$styleable.CardView_cardUseCompatPadding
            boolean r6 = r10.getBoolean(r6, r3)
            r9.f1162c = r6
            int r6 = androidx.cardview.R$styleable.CardView_cardPreventCornerOverlap
            r7 = 1
            boolean r6 = r10.getBoolean(r6, r7)
            r9.f1163e = r6
            int r6 = androidx.cardview.R$styleable.CardView_contentPadding
            int r6 = r10.getDimensionPixelSize(r6, r3)
            int r8 = androidx.cardview.R$styleable.CardView_contentPaddingLeft
            int r8 = r10.getDimensionPixelSize(r8, r6)
            r1.left = r8
            int r8 = androidx.cardview.R$styleable.CardView_contentPaddingTop
            int r8 = r10.getDimensionPixelSize(r8, r6)
            r1.top = r8
            int r8 = androidx.cardview.R$styleable.CardView_contentPaddingRight
            int r8 = r10.getDimensionPixelSize(r8, r6)
            r1.right = r8
            int r8 = androidx.cardview.R$styleable.CardView_contentPaddingBottom
            int r6 = r10.getDimensionPixelSize(r8, r6)
            r1.bottom = r6
            int r1 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r1 <= 0) goto Lb4
            r4 = r5
        Lb4:
            int r1 = androidx.cardview.R$styleable.CardView_android_minWidth
            r10.getDimensionPixelSize(r1, r3)
            int r1 = androidx.cardview.R$styleable.CardView_android_minHeight
            r10.getDimensionPixelSize(r1, r3)
            r10.recycle()
            androidx.activity.v r10 = androidx.cardview.widget.CardView.f1161y1
            k.b r1 = new k.b
            r1.<init>(r0, r11)
            r2.f1167a = r1
            r9.setBackgroundDrawable(r1)
            r9.setClipToOutline(r7)
            r9.setElevation(r5)
            r10.m477x0(r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.cardview.widget.CardView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public ColorStateList getCardBackgroundColor() {
        return ((C1444b) this.f1166w1.f1167a).f6939h;
    }

    public float getCardElevation() {
        return CardView.this.getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f1164m.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f1164m.left;
    }

    public int getContentPaddingRight() {
        return this.f1164m.right;
    }

    public int getContentPaddingTop() {
        return this.f1164m.top;
    }

    public float getMaxCardElevation() {
        return ((C1444b) this.f1166w1.f1167a).f6936e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f1163e;
    }

    public float getRadius() {
        return ((C1444b) this.f1166w1.f1167a).f6932a;
    }

    public boolean getUseCompatPadding() {
        return this.f1162c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
    }

    public void setCardBackgroundColor(int i7) {
        ColorStateList valueOf = ColorStateList.valueOf(i7);
        C1444b c1444b = (C1444b) this.f1166w1.f1167a;
        c1444b.m3827b(valueOf);
        c1444b.invalidateSelf();
    }

    public void setCardElevation(float f7) {
        CardView.this.setElevation(f7);
    }

    public void setMaxCardElevation(float f7) {
        f1161y1.m477x0(this.f1166w1, f7);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i7) {
        super.setMinimumHeight(i7);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i7) {
        super.setMinimumWidth(i7);
    }

    @Override // android.view.View
    public final void setPadding(int i7, int i8, int i9, int i10) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i7, int i8, int i9, int i10) {
    }

    public void setPreventCornerOverlap(boolean z6) {
        if (z6 != this.f1163e) {
            this.f1163e = z6;
            C0143v c0143v = f1161y1;
            C0279a c0279a = this.f1166w1;
            c0143v.m477x0(c0279a, ((C1444b) c0279a.f1167a).f6936e);
        }
    }

    public void setRadius(float f7) {
        C1444b c1444b = (C1444b) this.f1166w1.f1167a;
        if (f7 == c1444b.f6932a) {
            return;
        }
        c1444b.f6932a = f7;
        c1444b.m3828c(null);
        c1444b.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z6) {
        if (this.f1162c != z6) {
            this.f1162c = z6;
            C0143v c0143v = f1161y1;
            C0279a c0279a = this.f1166w1;
            c0143v.m477x0(c0279a, ((C1444b) c0279a.f1167a).f6936e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        C1444b c1444b = (C1444b) this.f1166w1.f1167a;
        c1444b.m3827b(colorStateList);
        c1444b.invalidateSelf();
    }
}
