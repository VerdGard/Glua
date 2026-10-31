package p012b3;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0143v;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.search.SearchBar;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p034e0.C0916e;
import p034e0.C0923h0;
import p034e0.C0935n0;
import p034e0.C0946x;

/* renamed from: b3.e */
/* loaded from: classes.dex */
public abstract class AbstractC0535e extends C0536f<View> {

    /* renamed from: X */
    public int f2683X;

    /* renamed from: Y */
    public int f2684Y;

    /* renamed from: m */
    public final Rect f2685m;

    /* renamed from: s */
    public final Rect f2686s;

    public AbstractC0535e() {
        this.f2685m = new Rect();
        this.f2686s = new Rect();
        this.f2683X = 0;
    }

    public AbstractC0535e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2685m = new Rect();
        this.f2686s = new Rect();
        this.f2683X = 0;
    }

    /* renamed from: A */
    public int mo1846A(View view) {
        return view.getMeasuredHeight();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0289c
    /* renamed from: m */
    public final boolean mo986m(CoordinatorLayout coordinatorLayout, View view, int i7, int i8, int i9) {
        AppBarLayout mo1848y;
        C0935n0 lastWindowInsets;
        int i10 = view.getLayoutParams().height;
        if ((i10 != -1 && i10 != -2) || (mo1848y = mo1848y(coordinatorLayout.m967d(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i9);
        if (size > 0) {
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            if (C0946x.d.m2826b(mo1848y) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                size += lastWindowInsets.m2751b() + lastWindowInsets.m2754e();
            }
        } else {
            size = coordinatorLayout.getHeight();
        }
        int mo1846A = mo1846A(mo1848y) + size;
        int measuredHeight = mo1848y.getMeasuredHeight();
        if (this instanceof SearchBar.ScrollingViewBehavior) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            mo1846A -= measuredHeight;
        }
        coordinatorLayout.m973r(view, i7, i8, View.MeasureSpec.makeMeasureSpec(mo1846A, i10 == -1 ? 1073741824 : Integer.MIN_VALUE));
        return true;
    }

    @Override // p012b3.C0536f
    /* renamed from: x */
    public final void mo1847x(CoordinatorLayout coordinatorLayout, View view, int i7) {
        AppBarLayout mo1848y = mo1848y(coordinatorLayout.m967d(view));
        int i8 = 0;
        if (mo1848y != null) {
            CoordinatorLayout.C0292f c0292f = (CoordinatorLayout.C0292f) view.getLayoutParams();
            int paddingLeft = coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0292f).leftMargin;
            int bottom = mo1848y.getBottom() + ((ViewGroup.MarginLayoutParams) c0292f).topMargin;
            int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0292f).rightMargin;
            int bottom2 = ((mo1848y.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c0292f).bottomMargin;
            Rect rect = this.f2685m;
            rect.set(paddingLeft, bottom, width, bottom2);
            C0935n0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null) {
                WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
                if (C0946x.d.m2826b(coordinatorLayout) && !C0946x.d.m2826b(view)) {
                    rect.left = lastWindowInsets.m2752c() + rect.left;
                    rect.right -= lastWindowInsets.m2753d();
                }
            }
            Rect rect2 = this.f2686s;
            int i9 = c0292f.f1421c;
            C0916e.m2684b(i9 == 0 ? 8388659 : i9, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i7);
            if (this.f2684Y != 0) {
                float mo1849z = mo1849z(mo1848y);
                int i10 = this.f2684Y;
                i8 = C0143v.m460r((int) (mo1849z * i10), 0, i10);
            }
            view.layout(rect2.left, rect2.top - i8, rect2.right, rect2.bottom - i8);
            i8 = rect2.top - mo1848y.getBottom();
        } else {
            coordinatorLayout.m972q(view, i7);
        }
        this.f2683X = i8;
    }

    /* renamed from: y */
    public abstract AppBarLayout mo1848y(ArrayList arrayList);

    /* renamed from: z */
    public float mo1849z(View view) {
        return 1.0f;
    }
}
