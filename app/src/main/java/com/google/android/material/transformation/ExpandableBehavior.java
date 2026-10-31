package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p034e0.C0923h0;
import p034e0.C0946x;
import p116o3.InterfaceC1666a;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.AbstractC0289c<View> {

    /* renamed from: c */
    public int f4617c;

    /* renamed from: com.google.android.material.transformation.ExpandableBehavior$a */
    public class ViewTreeObserverOnPreDrawListenerC0865a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: c */
        public final /* synthetic */ View f4618c;

        /* renamed from: e */
        public final /* synthetic */ int f4619e;

        /* renamed from: m */
        public final /* synthetic */ InterfaceC1666a f4620m;

        public ViewTreeObserverOnPreDrawListenerC0865a(View view, int i7, InterfaceC1666a interfaceC1666a) {
            this.f4618c = view;
            this.f4619e = i7;
            this.f4620m = interfaceC1666a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            View view = this.f4618c;
            view.getViewTreeObserver().removeOnPreDrawListener(this);
            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
            if (expandableBehavior.f4617c == this.f4619e) {
                InterfaceC1666a interfaceC1666a = this.f4620m;
                expandableBehavior.mo2553w((View) interfaceC1666a, view, interfaceC1666a.mo2446a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f4617c = 0;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4617c = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0289c
    /* renamed from: f */
    public abstract boolean mo979f(View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0289c
    /* renamed from: h */
    public final boolean mo981h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        int i7;
        InterfaceC1666a interfaceC1666a = (InterfaceC1666a) view2;
        if (!(!interfaceC1666a.mo2446a() ? this.f4617c != 1 : !((i7 = this.f4617c) == 0 || i7 == 2))) {
            return false;
        }
        this.f4617c = interfaceC1666a.mo2446a() ? 1 : 2;
        mo2553w((View) interfaceC1666a, view, interfaceC1666a.mo2446a(), true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0289c
    /* renamed from: l */
    public final boolean mo985l(CoordinatorLayout coordinatorLayout, View view, int i7) {
        InterfaceC1666a interfaceC1666a;
        int i8;
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        if (!C0946x.g.m2860c(view)) {
            ArrayList m967d = coordinatorLayout.m967d(view);
            int size = m967d.size();
            int i9 = 0;
            while (true) {
                if (i9 >= size) {
                    interfaceC1666a = null;
                    break;
                }
                View view2 = (View) m967d.get(i9);
                if (mo979f(view, view2)) {
                    interfaceC1666a = (InterfaceC1666a) view2;
                    break;
                }
                i9++;
            }
            if (interfaceC1666a != null) {
                if (!interfaceC1666a.mo2446a() ? this.f4617c != 1 : !((i8 = this.f4617c) == 0 || i8 == 2)) {
                    int i10 = interfaceC1666a.mo2446a() ? 1 : 2;
                    this.f4617c = i10;
                    view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC0865a(view, i10, interfaceC1666a));
                }
            }
        }
        return false;
    }

    /* renamed from: w */
    public abstract void mo2553w(View view, View view2, boolean z6, boolean z7);
}
