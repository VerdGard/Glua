package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.RunnableC0119d;
import androidx.constraintlayout.widget.C0283b;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.R$styleable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import p034e0.C0923h0;
import p034e0.C0946x;
import p193y3.C2237f;
import p193y3.C2238g;
import p193y3.C2240i;

/* renamed from: com.google.android.material.timepicker.c */
/* loaded from: classes.dex */
public class C0861c extends ConstraintLayout {

    /* renamed from: I1 */
    public final RunnableC0119d f4611I1;

    /* renamed from: J1 */
    public int f4612J1;

    /* renamed from: K1 */
    public C2237f f4613K1;

    public C0861c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0861c(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        LayoutInflater.from(context).inflate(R$layout.material_radial_view_group, this);
        C2237f c2237f = new C2237f();
        this.f4613K1 = c2237f;
        C2238g c2238g = new C2238g(0.5f);
        C2240i c2240i = c2237f.f10154c.f10163a;
        c2240i.getClass();
        C2240i.a aVar = new C2240i.a(c2240i);
        aVar.f10202e = c2238g;
        aVar.f10203f = c2238g;
        aVar.f10204g = c2238g;
        aVar.f10205h = c2238g;
        c2237f.setShapeAppearanceModel(new C2240i(aVar));
        this.f4613K1.m5428k(ColorStateList.valueOf(-1));
        C2237f c2237f2 = this.f4613K1;
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        C0946x.d.m2841q(this, c2237f2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f3749w, i7, 0);
        this.f4612J1 = obtainStyledAttributes.getDimensionPixelSize(R$styleable.RadialViewGroup_materialCircleRadius, 0);
        this.f4611I1 = new RunnableC0119d(9, this);
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i7, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            view.setId(C0946x.e.m2844a());
        }
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC0119d runnableC0119d = this.f4611I1;
            handler.removeCallbacks(runnableC0119d);
            handler.post(runnableC0119d);
        }
    }

    /* renamed from: g */
    public void mo2548g() {
        C0283b c0283b = new C0283b();
        c0283b.m951b(this);
        HashMap hashMap = new HashMap();
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getId() != R$id.circle_center && !"skip".equals(childAt.getTag())) {
                int i8 = (Integer) childAt.getTag(R$id.material_clock_level);
                if (i8 == null) {
                    i8 = 1;
                }
                if (!hashMap.containsKey(i8)) {
                    hashMap.put(i8, new ArrayList());
                }
                ((List) hashMap.get(i8)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            List list = (List) entry.getValue();
            int round = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.f4612J1 * 0.66f) : this.f4612J1;
            Iterator it = list.iterator();
            float f7 = 0.0f;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                int i9 = R$id.circle_center;
                HashMap<Integer, C0283b.a> hashMap2 = c0283b.f1283c;
                if (!hashMap2.containsKey(Integer.valueOf(id))) {
                    hashMap2.put(Integer.valueOf(id), new C0283b.a());
                }
                C0283b.b bVar = hashMap2.get(Integer.valueOf(id)).f1287d;
                bVar.f1348w = i9;
                bVar.f1349x = round;
                bVar.f1350y = f7;
                f7 += 360.0f / list.size();
            }
        }
        c0283b.m950a(this);
        setConstraintSet(null);
        requestLayout();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        mo2548g();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC0119d runnableC0119d = this.f4611I1;
            handler.removeCallbacks(runnableC0119d);
            handler.post(runnableC0119d);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i7) {
        this.f4613K1.m5428k(ColorStateList.valueOf(i7));
    }
}
