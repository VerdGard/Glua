package p174w0;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.transition.R$id;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p034e0.C0923h0;
import p034e0.C0946x;
import p089l.C1467a;

/* renamed from: w0.l */
/* loaded from: classes.dex */
public final class C2061l {

    /* renamed from: a */
    public static final C2049a f9411a = new C2049a();

    /* renamed from: b */
    public static final ThreadLocal<WeakReference<C1467a<ViewGroup, ArrayList<AbstractC2057h>>>> f9412b = new ThreadLocal<>();

    /* renamed from: c */
    public static final ArrayList<ViewGroup> f9413c = new ArrayList<>();

    /* renamed from: w0.l$a */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: c */
        public final AbstractC2057h f9414c;

        /* renamed from: e */
        public final ViewGroup f9415e;

        /* renamed from: w0.l$a$a, reason: collision with other inner class name */
        public class C2303a extends C2060k {

            /* renamed from: a */
            public final /* synthetic */ C1467a f9416a;

            public C2303a(C1467a c1467a) {
                this.f9416a = c1467a;
            }

            @Override // p174w0.AbstractC2057h.d
            /* renamed from: e */
            public final void mo5089e(AbstractC2057h abstractC2057h) {
                ((ArrayList) this.f9416a.get(a.this.f9415e)).remove(abstractC2057h);
                abstractC2057h.mo5117v(this);
            }
        }

        public a(ViewGroup viewGroup, AbstractC2057h abstractC2057h) {
            this.f9414c = abstractC2057h;
            this.f9415e = viewGroup;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:11:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:122:0x01c8 A[EDGE_INSN: B:122:0x01c8->B:123:0x01c8 BREAK  A[LOOP:1: B:17:0x0082->B:29:0x01bf], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:126:0x01ce  */
        /* JADX WARN: Removed duplicated region for block: B:136:0x01ef  */
        /* JADX WARN: Removed duplicated region for block: B:146:0x021d  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0087  */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean onPreDraw() {
            /*
                Method dump skipped, instructions count: 666
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p174w0.C2061l.a.onPreDraw():boolean");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            ViewGroup viewGroup = this.f9415e;
            viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
            viewGroup.removeOnAttachStateChangeListener(this);
            C2061l.f9413c.remove(viewGroup);
            ArrayList<AbstractC2057h> arrayList = C2061l.m5123b().get(viewGroup);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<AbstractC2057h> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().mo5119x(viewGroup);
                }
            }
            this.f9414c.m5108i(true);
        }
    }

    /* renamed from: a */
    public static void m5122a(ViewGroup viewGroup, AbstractC2057h abstractC2057h) {
        ArrayList<ViewGroup> arrayList = f9413c;
        if (arrayList.contains(viewGroup)) {
            return;
        }
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        if (C0946x.g.m2860c(viewGroup)) {
            arrayList.add(viewGroup);
            if (abstractC2057h == null) {
                abstractC2057h = f9411a;
            }
            AbstractC2057h clone = abstractC2057h.clone();
            ArrayList<AbstractC2057h> arrayList2 = m5123b().get(viewGroup);
            if (arrayList2 != null && arrayList2.size() > 0) {
                Iterator<AbstractC2057h> it = arrayList2.iterator();
                while (it.hasNext()) {
                    it.next().mo5116u(viewGroup);
                }
            }
            if (clone != null) {
                clone.m5107h(viewGroup, true);
            }
            int i7 = R$id.transition_current_scene;
            if (((C2056g) viewGroup.getTag(i7)) != null) {
                throw null;
            }
            viewGroup.setTag(i7, null);
            if (clone != null) {
                a aVar = new a(viewGroup, clone);
                viewGroup.addOnAttachStateChangeListener(aVar);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
            }
        }
    }

    /* renamed from: b */
    public static C1467a<ViewGroup, ArrayList<AbstractC2057h>> m5123b() {
        C1467a<ViewGroup, ArrayList<AbstractC2057h>> c1467a;
        ThreadLocal<WeakReference<C1467a<ViewGroup, ArrayList<AbstractC2057h>>>> threadLocal = f9412b;
        WeakReference<C1467a<ViewGroup, ArrayList<AbstractC2057h>>> weakReference = threadLocal.get();
        if (weakReference != null && (c1467a = weakReference.get()) != null) {
            return c1467a;
        }
        C1467a<ViewGroup, ArrayList<AbstractC2057h>> c1467a2 = new C1467a<>();
        threadLocal.set(new WeakReference<>(c1467a2));
        return c1467a2;
    }
}
