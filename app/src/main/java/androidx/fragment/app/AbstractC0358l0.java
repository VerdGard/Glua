package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import p034e0.C0923h0;
import p034e0.C0946x;
import p034e0.ViewTreeObserverOnPreDrawListenerC0941s;
import p089l.C1467a;

@SuppressLint({"UnknownNullness"})
/* renamed from: androidx.fragment.app.l0 */
/* loaded from: classes.dex */
public abstract class AbstractC0358l0 {
    /* renamed from: d */
    public static void m1202d(View view, List list) {
        boolean z6;
        boolean z7;
        int size = list.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                z6 = false;
                break;
            } else {
                if (list.get(i7) == view) {
                    z6 = true;
                    break;
                }
                i7++;
            }
        }
        if (z6) {
            return;
        }
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        if (C0946x.i.m2878k(view) != null) {
            list.add(view);
        }
        for (int i8 = size; i8 < list.size(); i8++) {
            View view2 = (View) list.get(i8);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i9 = 0; i9 < childCount; i9++) {
                    View childAt = viewGroup.getChildAt(i9);
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            z7 = false;
                            break;
                        } else {
                            if (list.get(i10) == childAt) {
                                z7 = true;
                                break;
                            }
                            i10++;
                        }
                    }
                    if (!z7 && C0946x.i.m2878k(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    /* renamed from: g */
    public static void m1203g(View view, Rect rect) {
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        if (C0946x.g.m2859b(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            view.getRootView().getLocationOnScreen(new int[2]);
            rectF.offset(r1[0], r1[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    /* renamed from: h */
    public static boolean m1204h(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: k */
    public static ArrayList m1205k(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            View view = (View) arrayList.get(i7);
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            arrayList2.add(C0946x.i.m2878k(view));
            C0946x.i.m2889v(view, null);
        }
        return arrayList2;
    }

    /* renamed from: q */
    public static void m1206q(ViewGroup viewGroup, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, C1467a c1467a) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i7 = 0; i7 < size; i7++) {
            View view = (View) arrayList.get(i7);
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            String m2878k = C0946x.i.m2878k(view);
            arrayList4.add(m2878k);
            if (m2878k != null) {
                C0946x.i.m2889v(view, null);
                String str = (String) c1467a.get(m2878k);
                int i8 = 0;
                while (true) {
                    if (i8 >= size) {
                        break;
                    }
                    if (str.equals(arrayList3.get(i8))) {
                        C0946x.i.m2889v((View) arrayList2.get(i8), m2878k);
                        break;
                    }
                    i8++;
                }
            }
        }
        ViewTreeObserverOnPreDrawListenerC0941s.m2796a(viewGroup, new RunnableC0356k0(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    /* renamed from: a */
    public abstract void mo1178a(View view, Object obj);

    /* renamed from: b */
    public abstract void mo1179b(Object obj, ArrayList<View> arrayList);

    /* renamed from: c */
    public abstract void mo1180c(ViewGroup viewGroup, Object obj);

    /* renamed from: e */
    public abstract boolean mo1181e(Object obj);

    /* renamed from: f */
    public abstract Object mo1182f(Object obj);

    /* renamed from: i */
    public abstract Object mo1183i(Object obj, Object obj2, Object obj3);

    /* renamed from: j */
    public abstract Object mo1184j(Object obj, Object obj2, Object obj3);

    /* renamed from: l */
    public abstract void mo1185l(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: m */
    public abstract void mo1186m(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: n */
    public abstract void mo1187n(View view, Object obj);

    /* renamed from: o */
    public abstract void mo1188o(Object obj, Rect rect);

    /* renamed from: p */
    public void mo1189p(Object obj, Runnable runnable) {
        runnable.run();
    }

    /* renamed from: r */
    public abstract void mo1190r(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: s */
    public abstract void mo1191s(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: t */
    public abstract Object mo1192t(Object obj);
}
