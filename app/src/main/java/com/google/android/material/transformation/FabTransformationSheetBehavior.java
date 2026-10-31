package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R$animator;
import com.google.android.material.transformation.FabTransformationBehavior;
import java.util.HashMap;
import java.util.WeakHashMap;
import p002a1.C0017d;
import p004a3.C0040g;
import p034e0.C0923h0;
import p034e0.C0946x;

@Deprecated
/* loaded from: classes.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: x1 */
    public HashMap f4638x1;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    /* renamed from: D */
    public final FabTransformationBehavior.C0867b mo2559D(Context context, boolean z6) {
        int i7 = z6 ? R$animator.mtrl_fab_transformation_sheet_expand_spec : R$animator.mtrl_fab_transformation_sheet_collapse_spec;
        FabTransformationBehavior.C0867b c0867b = new FabTransformationBehavior.C0867b();
        c0867b.f4632a = C0040g.m128a(i7, context);
        c0867b.f4633b = new C0017d();
        return c0867b;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    /* renamed from: w */
    public final void mo2553w(View view, View view2, boolean z6, boolean z7) {
        int i7;
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z6) {
                this.f4638x1 = new HashMap(childCount);
            }
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = coordinatorLayout.getChildAt(i8);
                boolean z8 = (childAt.getLayoutParams() instanceof CoordinatorLayout.C0292f) && (((CoordinatorLayout.C0292f) childAt.getLayoutParams()).f1419a instanceof FabTransformationScrimBehavior);
                if (childAt != view2 && !z8) {
                    HashMap hashMap = this.f4638x1;
                    if (z6) {
                        hashMap.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
                        i7 = 4;
                    } else if (hashMap != null && hashMap.containsKey(childAt)) {
                        i7 = ((Integer) this.f4638x1.get(childAt)).intValue();
                        WeakHashMap<View, C0923h0> weakHashMap2 = C0946x.f4876a;
                    }
                    C0946x.d.m2843s(childAt, i7);
                }
            }
            if (!z6) {
                this.f4638x1 = null;
            }
        }
        super.mo2553w(view, view2, z6, z7);
    }
}
