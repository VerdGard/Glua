package p016c;

import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.R$color;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0257p1;
import java.lang.reflect.Method;
import p034e0.C0935n0;
import p034e0.C0946x;
import p034e0.InterfaceC0938p;
import p166v.C2009a;

/* renamed from: c.o */
/* loaded from: classes.dex */
public final class C0561o implements InterfaceC0938p {

    /* renamed from: a */
    public final /* synthetic */ LayoutInflaterFactory2C0560n f2895a;

    public C0561o(LayoutInflaterFactory2C0560n layoutInflaterFactory2C0560n) {
        this.f2895a = layoutInflaterFactory2C0560n;
    }

    @Override // p034e0.InterfaceC0938p
    /* renamed from: a */
    public final C0935n0 mo133a(View view, C0935n0 c0935n0) {
        boolean z6;
        View view2;
        C0935n0 c0935n02;
        boolean z7;
        int m2754e = c0935n0.m2754e();
        LayoutInflaterFactory2C0560n layoutInflaterFactory2C0560n = this.f2895a;
        layoutInflaterFactory2C0560n.getClass();
        int m2754e2 = c0935n0.m2754e();
        ActionBarContextView actionBarContextView = layoutInflaterFactory2C0560n.f2818K1;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z6 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutInflaterFactory2C0560n.f2818K1.getLayoutParams();
            if (layoutInflaterFactory2C0560n.f2818K1.isShown()) {
                if (layoutInflaterFactory2C0560n.f2852s2 == null) {
                    layoutInflaterFactory2C0560n.f2852s2 = new Rect();
                    layoutInflaterFactory2C0560n.f2853t2 = new Rect();
                }
                Rect rect = layoutInflaterFactory2C0560n.f2852s2;
                Rect rect2 = layoutInflaterFactory2C0560n.f2853t2;
                rect.set(c0935n0.m2752c(), c0935n0.m2754e(), c0935n0.m2753d(), c0935n0.m2751b());
                ViewGroup viewGroup = layoutInflaterFactory2C0560n.f2824Q1;
                Method method = C0257p1.f1047a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect, rect2);
                    } catch (Exception e7) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e7);
                    }
                }
                int i7 = rect.top;
                int i8 = rect.left;
                int i9 = rect.right;
                C0935n0 m2808i = C0946x.m2808i(layoutInflaterFactory2C0560n.f2824Q1);
                int m2752c = m2808i == null ? 0 : m2808i.m2752c();
                int m2753d = m2808i == null ? 0 : m2808i.m2753d();
                if (marginLayoutParams.topMargin == i7 && marginLayoutParams.leftMargin == i8 && marginLayoutParams.rightMargin == i9) {
                    z7 = false;
                } else {
                    marginLayoutParams.topMargin = i7;
                    marginLayoutParams.leftMargin = i8;
                    marginLayoutParams.rightMargin = i9;
                    z7 = true;
                }
                Context context = layoutInflaterFactory2C0560n.f2858z1;
                if (i7 <= 0 || layoutInflaterFactory2C0560n.f2826S1 != null) {
                    View view3 = layoutInflaterFactory2C0560n.f2826S1;
                    if (view3 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
                        int i10 = marginLayoutParams2.height;
                        int i11 = marginLayoutParams.topMargin;
                        if (i10 != i11 || marginLayoutParams2.leftMargin != m2752c || marginLayoutParams2.rightMargin != m2753d) {
                            marginLayoutParams2.height = i11;
                            marginLayoutParams2.leftMargin = m2752c;
                            marginLayoutParams2.rightMargin = m2753d;
                            layoutInflaterFactory2C0560n.f2826S1.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view4 = new View(context);
                    layoutInflaterFactory2C0560n.f2826S1 = view4;
                    view4.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = m2752c;
                    layoutParams.rightMargin = m2753d;
                    layoutInflaterFactory2C0560n.f2824Q1.addView(layoutInflaterFactory2C0560n.f2826S1, -1, layoutParams);
                }
                View view5 = layoutInflaterFactory2C0560n.f2826S1;
                z6 = view5 != null;
                if (z6 && view5.getVisibility() != 0) {
                    View view6 = layoutInflaterFactory2C0560n.f2826S1;
                    view6.setBackgroundColor(C2009a.m4895b(context, (C0946x.d.m2831g(view6) & 8192) != 0 ? R$color.abc_decor_view_status_guard_light : R$color.abc_decor_view_status_guard));
                }
                if (!layoutInflaterFactory2C0560n.f2831X1 && z6) {
                    m2754e2 = 0;
                }
            } else {
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                } else {
                    r8 = false;
                }
                z7 = r8;
                z6 = false;
            }
            if (z7) {
                layoutInflaterFactory2C0560n.f2818K1.setLayoutParams(marginLayoutParams);
            }
        }
        View view7 = layoutInflaterFactory2C0560n.f2826S1;
        if (view7 != null) {
            view7.setVisibility(z6 ? 0 : 8);
        }
        if (m2754e != m2754e2) {
            c0935n02 = c0935n0.m2755g(c0935n0.m2752c(), m2754e2, c0935n0.m2753d(), c0935n0.m2751b());
            view2 = view;
        } else {
            view2 = view;
            c0935n02 = c0935n0;
        }
        return C0946x.m2812m(view2, c0935n02);
    }
}
