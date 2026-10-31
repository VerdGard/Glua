package p012b3;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: b3.f */
/* loaded from: classes.dex */
public class C0536f<V extends View> extends CoordinatorLayout.AbstractC0289c<V> {

    /* renamed from: c */
    public C0537g f2687c;

    /* renamed from: e */
    public int f2688e;

    public C0536f() {
        this.f2688e = 0;
    }

    public C0536f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2688e = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0289c
    /* renamed from: l */
    public boolean mo985l(CoordinatorLayout coordinatorLayout, V v5, int i7) {
        mo1847x(coordinatorLayout, v5, i7);
        if (this.f2687c == null) {
            this.f2687c = new C0537g(v5);
        }
        C0537g c0537g = this.f2687c;
        View view = c0537g.f2689a;
        c0537g.f2690b = view.getTop();
        c0537g.f2691c = view.getLeft();
        this.f2687c.m1851a();
        int i8 = this.f2688e;
        if (i8 == 0) {
            return true;
        }
        C0537g c0537g2 = this.f2687c;
        if (c0537g2.f2692d != i8) {
            c0537g2.f2692d = i8;
            c0537g2.m1851a();
        }
        this.f2688e = 0;
        return true;
    }

    /* renamed from: w */
    public final int m1850w() {
        C0537g c0537g = this.f2687c;
        if (c0537g != null) {
            return c0537g.f2692d;
        }
        return 0;
    }

    /* renamed from: x */
    public void mo1847x(CoordinatorLayout coordinatorLayout, V v5, int i7) {
        coordinatorLayout.m972q(v5, i7);
    }
}
