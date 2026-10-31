package p034e0;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* renamed from: e0.l */
/* loaded from: classes.dex */
public final class C0930l {

    /* renamed from: a */
    public ViewParent f4802a;

    /* renamed from: b */
    public ViewParent f4803b;

    /* renamed from: c */
    public final View f4804c;

    /* renamed from: d */
    public boolean f4805d;

    /* renamed from: e */
    public int[] f4806e;

    public C0930l(View view) {
        this.f4804c = view;
    }

    /* renamed from: a */
    public final boolean m2727a(float f7, float f8, boolean z6) {
        ViewParent m2732f;
        if (!this.f4805d || (m2732f = m2732f(0)) == null) {
            return false;
        }
        try {
            return C0917e0.m2686a(m2732f, this.f4804c, f7, f8, z6);
        } catch (AbstractMethodError e7) {
            Log.e("ViewParentCompat", "ViewParent " + m2732f + " does not implement interface method onNestedFling", e7);
            return false;
        }
    }

    /* renamed from: b */
    public final boolean m2728b(float f7, float f8) {
        ViewParent m2732f;
        if (!this.f4805d || (m2732f = m2732f(0)) == null) {
            return false;
        }
        try {
            return C0917e0.m2687b(m2732f, this.f4804c, f7, f8);
        } catch (AbstractMethodError e7) {
            Log.e("ViewParentCompat", "ViewParent " + m2732f + " does not implement interface method onNestedPreFling", e7);
            return false;
        }
    }

    /* renamed from: c */
    public final boolean m2729c(int i7, int i8, int i9, int[] iArr, int[] iArr2) {
        ViewParent m2732f;
        int i10;
        int i11;
        int[] iArr3;
        if (!this.f4805d || (m2732f = m2732f(i9)) == null) {
            return false;
        }
        if (i7 == 0 && i8 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        View view = this.f4804c;
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            i10 = iArr2[0];
            i11 = iArr2[1];
        } else {
            i10 = 0;
            i11 = 0;
        }
        if (iArr == null) {
            if (this.f4806e == null) {
                this.f4806e = new int[2];
            }
            iArr3 = this.f4806e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        View view2 = this.f4804c;
        if (m2732f instanceof InterfaceC0932m) {
            ((InterfaceC0932m) m2732f).mo579j(view2, i7, i8, iArr3, i9);
        } else if (i9 == 0) {
            try {
                C0917e0.m2688c(m2732f, view2, i7, i8, iArr3);
            } catch (AbstractMethodError e7) {
                Log.e("ViewParentCompat", "ViewParent " + m2732f + " does not implement interface method onNestedPreScroll", e7);
            }
        }
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i10;
            iArr2[1] = iArr2[1] - i11;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    /* renamed from: d */
    public final void m2730d(int i7, int i8, int i9, int[] iArr) {
        m2731e(0, i7, 0, i8, null, i9, iArr);
    }

    /* renamed from: e */
    public final boolean m2731e(int i7, int i8, int i9, int i10, int[] iArr, int i11, int[] iArr2) {
        ViewParent m2732f;
        int i12;
        int i13;
        int[] iArr3;
        if (!this.f4805d || (m2732f = m2732f(i11)) == null) {
            return false;
        }
        if (i7 == 0 && i8 == 0 && i9 == 0 && i10 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        View view = this.f4804c;
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            i12 = iArr[0];
            i13 = iArr[1];
        } else {
            i12 = 0;
            i13 = 0;
        }
        if (iArr2 == null) {
            if (this.f4806e == null) {
                this.f4806e = new int[2];
            }
            int[] iArr4 = this.f4806e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        View view2 = this.f4804c;
        if (m2732f instanceof InterfaceC0934n) {
            ((InterfaceC0934n) m2732f).mo582m(view2, i7, i8, i9, i10, i11, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i9;
            iArr3[1] = iArr3[1] + i10;
            if (m2732f instanceof InterfaceC0932m) {
                ((InterfaceC0932m) m2732f).mo583n(view2, i7, i8, i9, i10, i11);
            } else if (i11 == 0) {
                try {
                    C0917e0.m2689d(m2732f, view2, i7, i8, i9, i10);
                } catch (AbstractMethodError e7) {
                    Log.e("ViewParentCompat", "ViewParent " + m2732f + " does not implement interface method onNestedScroll", e7);
                }
            }
        }
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i12;
            iArr[1] = iArr[1] - i13;
        }
        return true;
    }

    /* renamed from: f */
    public final ViewParent m2732f(int i7) {
        if (i7 == 0) {
            return this.f4802a;
        }
        if (i7 != 1) {
            return null;
        }
        return this.f4803b;
    }

    /* renamed from: g */
    public final boolean m2733g(int i7, int i8) {
        boolean m2691f;
        if (m2732f(i8) != null) {
            return true;
        }
        if (this.f4805d) {
            View view = this.f4804c;
            View view2 = view;
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                boolean z6 = parent instanceof InterfaceC0932m;
                if (z6) {
                    m2691f = ((InterfaceC0932m) parent).mo584o(view2, view, i7, i8);
                } else {
                    if (i8 == 0) {
                        try {
                            m2691f = C0917e0.m2691f(parent, view2, view, i7);
                        } catch (AbstractMethodError e7) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e7);
                        }
                    }
                    m2691f = false;
                }
                if (m2691f) {
                    if (i8 == 0) {
                        this.f4802a = parent;
                    } else if (i8 == 1) {
                        this.f4803b = parent;
                    }
                    if (z6) {
                        ((InterfaceC0932m) parent).mo577h(view2, view, i7, i8);
                    } else if (i8 == 0) {
                        try {
                            C0917e0.m2690e(parent, view2, view, i7);
                        } catch (AbstractMethodError e8) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e8);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
        }
        return false;
    }

    /* renamed from: h */
    public final void m2734h(int i7) {
        ViewParent m2732f = m2732f(i7);
        if (m2732f != null) {
            boolean z6 = m2732f instanceof InterfaceC0932m;
            View view = this.f4804c;
            if (z6) {
                ((InterfaceC0932m) m2732f).mo578i(view, i7);
            } else if (i7 == 0) {
                try {
                    C0917e0.m2692g(m2732f, view);
                } catch (AbstractMethodError e7) {
                    Log.e("ViewParentCompat", "ViewParent " + m2732f + " does not implement interface method onStopNestedScroll", e7);
                }
            }
            if (i7 == 0) {
                this.f4802a = null;
            } else {
                if (i7 != 1) {
                    return;
                }
                this.f4803b = null;
            }
        }
    }
}
