package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C0283b;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.HashMap;

/* renamed from: androidx.constraintlayout.widget.c */
/* loaded from: classes.dex */
public final class C0284c extends ViewGroup {

    /* renamed from: c */
    public C0283b f1374c;

    /* renamed from: androidx.constraintlayout.widget.c$a */
    public static class a extends ConstraintLayout.C0280a {

        /* renamed from: m0 */
        public final float f1375m0;

        /* renamed from: n0 */
        public final boolean f1376n0;

        /* renamed from: o0 */
        public final float f1377o0;

        /* renamed from: p0 */
        public final float f1378p0;

        /* renamed from: q0 */
        public final float f1379q0;

        /* renamed from: r0 */
        public final float f1380r0;

        /* renamed from: s0 */
        public final float f1381s0;

        /* renamed from: t0 */
        public final float f1382t0;

        /* renamed from: u0 */
        public final float f1383u0;

        /* renamed from: v0 */
        public final float f1384v0;

        /* renamed from: w0 */
        public final float f1385w0;

        /* renamed from: x0 */
        public final float f1386x0;

        /* renamed from: y0 */
        public final float f1387y0;

        public a() {
            this.f1375m0 = 1.0f;
            this.f1376n0 = false;
            this.f1377o0 = 0.0f;
            this.f1378p0 = 0.0f;
            this.f1379q0 = 0.0f;
            this.f1380r0 = 0.0f;
            this.f1381s0 = 1.0f;
            this.f1382t0 = 1.0f;
            this.f1383u0 = 0.0f;
            this.f1384v0 = 0.0f;
            this.f1385w0 = 0.0f;
            this.f1386x0 = 0.0f;
            this.f1387y0 = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1375m0 = 1.0f;
            this.f1376n0 = false;
            this.f1377o0 = 0.0f;
            this.f1378p0 = 0.0f;
            this.f1379q0 = 0.0f;
            this.f1380r0 = 0.0f;
            this.f1381s0 = 1.0f;
            this.f1382t0 = 1.0f;
            this.f1383u0 = 0.0f;
            this.f1384v0 = 0.0f;
            this.f1385w0 = 0.0f;
            this.f1386x0 = 0.0f;
            this.f1387y0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f1265c);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                if (index == R$styleable.ConstraintSet_android_alpha) {
                    this.f1375m0 = obtainStyledAttributes.getFloat(index, this.f1375m0);
                } else if (index == R$styleable.ConstraintSet_android_elevation) {
                    this.f1377o0 = obtainStyledAttributes.getFloat(index, this.f1377o0);
                    this.f1376n0 = true;
                } else if (index == R$styleable.ConstraintSet_android_rotationX) {
                    this.f1379q0 = obtainStyledAttributes.getFloat(index, this.f1379q0);
                } else if (index == R$styleable.ConstraintSet_android_rotationY) {
                    this.f1380r0 = obtainStyledAttributes.getFloat(index, this.f1380r0);
                } else if (index == R$styleable.ConstraintSet_android_rotation) {
                    this.f1378p0 = obtainStyledAttributes.getFloat(index, this.f1378p0);
                } else if (index == R$styleable.ConstraintSet_android_scaleX) {
                    this.f1381s0 = obtainStyledAttributes.getFloat(index, this.f1381s0);
                } else if (index == R$styleable.ConstraintSet_android_scaleY) {
                    this.f1382t0 = obtainStyledAttributes.getFloat(index, this.f1382t0);
                } else if (index == R$styleable.ConstraintSet_android_transformPivotX) {
                    this.f1383u0 = obtainStyledAttributes.getFloat(index, this.f1383u0);
                } else if (index == R$styleable.ConstraintSet_android_transformPivotY) {
                    this.f1384v0 = obtainStyledAttributes.getFloat(index, this.f1384v0);
                } else if (index == R$styleable.ConstraintSet_android_translationX) {
                    this.f1385w0 = obtainStyledAttributes.getFloat(index, this.f1385w0);
                } else if (index == R$styleable.ConstraintSet_android_translationY) {
                    this.f1386x0 = obtainStyledAttributes.getFloat(index, this.f1386x0);
                } else if (index == R$styleable.ConstraintSet_android_translationZ) {
                    this.f1387y0 = obtainStyledAttributes.getFloat(index, this.f1387y0);
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.C0280a(layoutParams);
    }

    public C0283b getConstraintSet() {
        if (this.f1374c == null) {
            this.f1374c = new C0283b();
        }
        C0283b c0283b = this.f1374c;
        c0283b.getClass();
        int childCount = getChildCount();
        HashMap<Integer, C0283b.a> hashMap = c0283b.f1283c;
        hashMap.clear();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            a aVar = (a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (c0283b.f1282b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                hashMap.put(Integer.valueOf(id), new C0283b.a());
            }
            C0283b.a aVar2 = hashMap.get(Integer.valueOf(id));
            if (childAt instanceof AbstractC0282a) {
                AbstractC0282a abstractC0282a = (AbstractC0282a) childAt;
                aVar2.m955c(id, aVar);
                if (abstractC0282a instanceof Barrier) {
                    C0283b.b bVar = aVar2.f1287d;
                    bVar.f1322c0 = 1;
                    Barrier barrier = (Barrier) abstractC0282a;
                    bVar.f1318a0 = barrier.getType();
                    bVar.f1324d0 = barrier.getReferencedIds();
                    bVar.f1320b0 = barrier.getMargin();
                }
            }
            aVar2.m955c(id, aVar);
        }
        return this.f1374c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
    }
}
