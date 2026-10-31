package p131q3;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import java.util.WeakHashMap;
import p034e0.C0923h0;
import p034e0.C0935n0;
import p034e0.C0946x;
import p034e0.InterfaceC0938p;
import p181x.C2153b;

/* renamed from: q3.m */
/* loaded from: classes.dex */
public class C1757m extends FrameLayout {

    /* renamed from: c */
    public Drawable f8084c;

    /* renamed from: e */
    public Rect f8085e;

    /* renamed from: m */
    public final Rect f8086m;

    /* renamed from: s */
    public boolean f8087s;

    /* renamed from: w1 */
    public boolean f8088w1;

    /* renamed from: x1 */
    public boolean f8089x1;

    /* renamed from: y1 */
    public boolean f8090y1;

    /* renamed from: q3.m$a */
    public class a implements InterfaceC0938p {
        public a() {
        }

        @Override // p034e0.InterfaceC0938p
        /* renamed from: a */
        public final C0935n0 mo133a(View view, C0935n0 c0935n0) {
            C1757m c1757m = C1757m.this;
            if (c1757m.f8085e == null) {
                c1757m.f8085e = new Rect();
            }
            c1757m.f8085e.set(c0935n0.m2752c(), c0935n0.m2754e(), c0935n0.m2753d(), c0935n0.m2751b());
            c1757m.mo2477e(c0935n0);
            C0935n0.k kVar = c0935n0.f4835a;
            boolean z6 = true;
            if ((!kVar.mo2772j().equals(C2153b.f9763e)) && c1757m.f8084c != null) {
                z6 = false;
            }
            c1757m.setWillNotDraw(z6);
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            C0946x.d.m2835k(c1757m);
            return kVar.mo2780c();
        }
    }

    public C1757m(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1757m(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f8086m = new Rect();
        this.f8087s = true;
        this.f8088w1 = true;
        this.f8089x1 = true;
        this.f8090y1 = true;
        TypedArray m4235d = C1762r.m4235d(context, attributeSet, R$styleable.f3750x, i7, R$style.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        this.f8084c = m4235d.getDrawable(R$styleable.ScrimInsetsFrameLayout_insetForeground);
        m4235d.recycle();
        setWillNotDraw(true);
        a aVar = new a();
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        C0946x.i.m2888u(this, aVar);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f8085e == null || this.f8084c == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        boolean z6 = this.f8087s;
        Rect rect = this.f8086m;
        if (z6) {
            rect.set(0, 0, width, this.f8085e.top);
            this.f8084c.setBounds(rect);
            this.f8084c.draw(canvas);
        }
        if (this.f8088w1) {
            rect.set(0, height - this.f8085e.bottom, width, height);
            this.f8084c.setBounds(rect);
            this.f8084c.draw(canvas);
        }
        if (this.f8089x1) {
            Rect rect2 = this.f8085e;
            rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
            this.f8084c.setBounds(rect);
            this.f8084c.draw(canvas);
        }
        if (this.f8090y1) {
            Rect rect3 = this.f8085e;
            rect.set(width - rect3.right, rect3.top, width, height - rect3.bottom);
            this.f8084c.setBounds(rect);
            this.f8084c.draw(canvas);
        }
        canvas.restoreToCount(save);
    }

    /* renamed from: e */
    public void mo2477e(C0935n0 c0935n0) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f8084c;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f8084c;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z6) {
        this.f8088w1 = z6;
    }

    public void setDrawLeftInsetForeground(boolean z6) {
        this.f8089x1 = z6;
    }

    public void setDrawRightInsetForeground(boolean z6) {
        this.f8090y1 = z6;
    }

    public void setDrawTopInsetForeground(boolean z6) {
        this.f8087s = z6;
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.f8084c = drawable;
    }
}
