package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$styleable;
import androidx.appcompat.view.menu.C0159f;
import p034e0.C0923h0;
import p034e0.C0946x;
import p034e0.InterfaceC0925i0;

/* renamed from: androidx.appcompat.widget.a */
/* loaded from: classes.dex */
public abstract class AbstractC0210a extends ViewGroup {

    /* renamed from: c */
    public final a f790c;

    /* renamed from: e */
    public final Context f791e;

    /* renamed from: m */
    public ActionMenuView f792m;

    /* renamed from: s */
    public C0216c f793s;

    /* renamed from: w1 */
    public int f794w1;

    /* renamed from: x1 */
    public C0923h0 f795x1;

    /* renamed from: y1 */
    public boolean f796y1;

    /* renamed from: z1 */
    public boolean f797z1;

    /* renamed from: androidx.appcompat.widget.a$a */
    public class a implements InterfaceC0925i0 {

        /* renamed from: a */
        public boolean f798a = false;

        /* renamed from: b */
        public int f799b;

        public a() {
        }

        @Override // p034e0.InterfaceC0925i0
        /* renamed from: a */
        public final void mo651a() {
            if (this.f798a) {
                return;
            }
            AbstractC0210a abstractC0210a = AbstractC0210a.this;
            abstractC0210a.f795x1 = null;
            AbstractC0210a.super.setVisibility(this.f799b);
        }

        @Override // p034e0.InterfaceC0925i0
        /* renamed from: b */
        public final void mo104b(View view) {
            this.f798a = true;
        }

        @Override // p034e0.InterfaceC0925i0
        /* renamed from: f */
        public final void mo108f() {
            AbstractC0210a.super.setVisibility(0);
            this.f798a = false;
        }
    }

    public AbstractC0210a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AbstractC0210a(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f790c = new a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R$attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f791e = context;
        } else {
            this.f791e = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* renamed from: c */
    public static int m648c(View view, int i7, int i8) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE), i8);
        return Math.max(0, (i7 - view.getMeasuredWidth()) - 0);
    }

    /* renamed from: d */
    public static int m649d(int i7, int i8, int i9, View view, boolean z6) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i10 = ((i9 - measuredHeight) / 2) + i8;
        if (z6) {
            view.layout(i7 - measuredWidth, i10, i7, measuredHeight + i10);
        } else {
            view.layout(i7, i10, i7 + measuredWidth, measuredHeight + i10);
        }
        return z6 ? -measuredWidth : measuredWidth;
    }

    /* renamed from: e */
    public final C0923h0 m650e(long j7, int i7) {
        C0923h0 c0923h0 = this.f795x1;
        if (c0923h0 != null) {
            c0923h0.m2704b();
        }
        a aVar = this.f790c;
        if (i7 != 0) {
            C0923h0 m2800a = C0946x.m2800a(this);
            m2800a.m2703a(0.0f);
            m2800a.m2705c(j7);
            AbstractC0210a.this.f795x1 = m2800a;
            aVar.f799b = i7;
            m2800a.m2706d(aVar);
            return m2800a;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        C0923h0 m2800a2 = C0946x.m2800a(this);
        m2800a2.m2703a(1.0f);
        m2800a2.m2705c(j7);
        AbstractC0210a.this.f795x1 = m2800a2;
        aVar.f799b = i7;
        m2800a2.m2706d(aVar);
        return m2800a2;
    }

    public int getAnimatedVisibility() {
        return this.f795x1 != null ? this.f790c.f799b : getVisibility();
    }

    public int getContentHeight() {
        return this.f794w1;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, R$styleable.f273a, R$attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(R$styleable.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        C0216c c0216c = this.f793s;
        if (c0216c != null) {
            Configuration configuration2 = c0216c.f414e.getResources().getConfiguration();
            int i7 = configuration2.screenWidthDp;
            int i8 = configuration2.screenHeightDp;
            c0216c.f826F1 = (configuration2.smallestScreenWidthDp > 600 || i7 > 600 || (i7 > 960 && i8 > 720) || (i7 > 720 && i8 > 960)) ? 5 : (i7 >= 500 || (i7 > 640 && i8 > 480) || (i7 > 480 && i8 > 640)) ? 4 : i7 >= 360 ? 3 : 2;
            C0159f c0159f = c0216c.f415m;
            if (c0159f != null) {
                c0159f.mo540p(true);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f797z1 = false;
        }
        if (!this.f797z1) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f797z1 = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f797z1 = false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f796y1 = false;
        }
        if (!this.f796y1) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f796y1 = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f796y1 = false;
        }
        return true;
    }

    public void setContentHeight(int i7) {
        this.f794w1 = i7;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        if (i7 != getVisibility()) {
            C0923h0 c0923h0 = this.f795x1;
            if (c0923h0 != null) {
                c0923h0.m2704b();
            }
            super.setVisibility(i7);
        }
    }
}
