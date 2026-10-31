package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.fragment.app.i0 */
/* loaded from: classes.dex */
public final class C0352i0 extends AbstractC0358l0 {

    /* renamed from: androidx.fragment.app.i0$a */
    public class a implements Transition.TransitionListener {

        /* renamed from: a */
        public final /* synthetic */ View f1721a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f1722b;

        public a(View view, ArrayList arrayList) {
            this.f1721a = view;
            this.f1722b = arrayList;
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f1721a.setVisibility(8);
            ArrayList arrayList = this.f1722b;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((View) arrayList.get(i7)).setVisibility(0);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionStart(Transition transition) {
            transition.removeListener(this);
            transition.addListener(this);
        }
    }

    /* renamed from: androidx.fragment.app.i0$b */
    public class b implements Transition.TransitionListener {

        /* renamed from: a */
        public final /* synthetic */ Object f1723a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f1724b;

        /* renamed from: c */
        public final /* synthetic */ Object f1725c;

        /* renamed from: d */
        public final /* synthetic */ ArrayList f1726d;

        /* renamed from: e */
        public final /* synthetic */ Object f1727e;

        /* renamed from: f */
        public final /* synthetic */ ArrayList f1728f;

        public b(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f1723a = obj;
            this.f1724b = arrayList;
            this.f1725c = obj2;
            this.f1726d = arrayList2;
            this.f1727e = obj3;
            this.f1728f = arrayList3;
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionStart(Transition transition) {
            C0352i0 c0352i0 = C0352i0.this;
            Object obj = this.f1723a;
            if (obj != null) {
                c0352i0.m1193v(obj, this.f1724b, null);
            }
            Object obj2 = this.f1725c;
            if (obj2 != null) {
                c0352i0.m1193v(obj2, this.f1726d, null);
            }
            Object obj3 = this.f1727e;
            if (obj3 != null) {
                c0352i0.m1193v(obj3, this.f1728f, null);
            }
        }
    }

    /* renamed from: androidx.fragment.app.i0$c */
    public class c extends Transition.EpicenterCallback {

        /* renamed from: a */
        public final /* synthetic */ Rect f1730a;

        public c(Rect rect) {
            this.f1730a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public final Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f1730a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return rect;
        }
    }

    /* renamed from: u */
    public static boolean m1177u(Transition transition) {
        return (AbstractC0358l0.m1204h(transition.getTargetIds()) && AbstractC0358l0.m1204h(transition.getTargetNames()) && AbstractC0358l0.m1204h(transition.getTargetTypes())) ? false : true;
    }

    @Override // androidx.fragment.app.AbstractC0358l0
    /* renamed from: a */
    public final void mo1178a(View view, Object obj) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC0358l0
    /* renamed from: b */
    public final void mo1179b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i7 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i7 < transitionCount) {
                mo1179b(transitionSet.getTransitionAt(i7), arrayList);
                i7++;
            }
            return;
        }
        if (m1177u(transition) || !AbstractC0358l0.m1204h(transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i7 < size) {
            transition.addTarget(arrayList.get(i7));
            i7++;
        }
    }

    @Override // androidx.fragment.app.AbstractC0358l0
    /* renamed from: c */
    public final void mo1180c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.AbstractC0358l0
    /* renamed from: e */
    public final boolean mo1181e(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.AbstractC0358l0
    /* renamed from: f */
    public final Object mo1182f(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.AbstractC0358l0
    /* renamed from: i */
    public final Object mo1183i(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    @Override // androidx.fragment.app.AbstractC0358l0
    /* renamed from: j */
    public final Object mo1184j(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // androidx.fragment.app.AbstractC0358l0
    /* renamed from: l */
    public final void mo1185l(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new a(view, arrayList));
    }

    @Override // androidx.fragment.app.AbstractC0358l0
    /* renamed from: m */
    public final void mo1186m(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new b(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.AbstractC0358l0
    /* renamed from: n */
    public final void mo1187n(View view, Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            AbstractC0358l0.m1203g(view, rect);
            ((Transition) obj).setEpicenterCallback(new C0350h0(rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC0358l0
    /* renamed from: o */
    public final void mo1188o(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new c(rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC0358l0
    /* renamed from: p */
    public final void mo1189p(Object obj, Runnable runnable) {
        ((Transition) obj).addListener(new C0354j0(runnable));
    }

    @Override // androidx.fragment.app.AbstractC0358l0
    /* renamed from: r */
    public final void mo1190r(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            AbstractC0358l0.m1202d(arrayList.get(i7), targets);
        }
        targets.add(view);
        arrayList.add(view);
        mo1179b(transitionSet, arrayList);
    }

    @Override // androidx.fragment.app.AbstractC0358l0
    /* renamed from: s */
    public final void mo1191s(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            m1193v(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.AbstractC0358l0
    /* renamed from: t */
    public final Object mo1192t(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    /* renamed from: v */
    public final void m1193v(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i7 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i7 < transitionCount) {
                m1193v(transitionSet.getTransitionAt(i7), arrayList, arrayList2);
                i7++;
            }
            return;
        }
        if (m1177u(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i7 < size) {
            transition.addTarget(arrayList2.get(i7));
            i7++;
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            transition.removeTarget(arrayList.get(size2));
        }
    }
}
