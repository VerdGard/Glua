package p174w0;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.ext.C0089a;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import androidx.activity.result.AbstractC0136c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import p002a1.C0017d;
import p034e0.C0923h0;
import p034e0.C0946x;
import p089l.C1467a;
import p089l.C1473g;
import p089l.C1474h;
import p120p.C1686g;

/* renamed from: w0.h */
/* loaded from: classes.dex */
public abstract class AbstractC2057h implements Cloneable {

    /* renamed from: J1 */
    public static final int[] f9380J1 = {2, 1, 3, 4};

    /* renamed from: K1 */
    public static final a f9381K1 = new a();

    /* renamed from: L1 */
    public static final ThreadLocal<C1467a<Animator, b>> f9382L1 = new ThreadLocal<>();

    /* renamed from: A1 */
    public ArrayList<C2064o> f9383A1;

    /* renamed from: H1 */
    public c f9390H1;

    /* renamed from: z1 */
    public ArrayList<C2064o> f9402z1;

    /* renamed from: c */
    public final String f9395c = getClass().getName();

    /* renamed from: e */
    public long f9396e = -1;

    /* renamed from: m */
    public long f9397m = -1;

    /* renamed from: s */
    public TimeInterpolator f9398s = null;

    /* renamed from: X */
    public final ArrayList<Integer> f9392X = new ArrayList<>();

    /* renamed from: Y */
    public final ArrayList<View> f9393Y = new ArrayList<>();

    /* renamed from: Z */
    public C2065p f9394Z = new C2065p();

    /* renamed from: w1 */
    public C2065p f9399w1 = new C2065p();

    /* renamed from: x1 */
    public C2062m f9400x1 = null;

    /* renamed from: y1 */
    public final int[] f9401y1 = f9380J1;

    /* renamed from: B1 */
    public final ArrayList<Animator> f9384B1 = new ArrayList<>();

    /* renamed from: C1 */
    public int f9385C1 = 0;

    /* renamed from: D1 */
    public boolean f9386D1 = false;

    /* renamed from: E1 */
    public boolean f9387E1 = false;

    /* renamed from: F1 */
    public ArrayList<d> f9388F1 = null;

    /* renamed from: G1 */
    public ArrayList<Animator> f9389G1 = new ArrayList<>();

    /* renamed from: I1 */
    public AbstractC0136c f9391I1 = f9381K1;

    /* renamed from: w0.h$a */
    public static class a extends AbstractC0136c {
        @Override // androidx.activity.result.AbstractC0136c
        /* renamed from: r */
        public final Path mo389r(float f7, float f8, float f9, float f10) {
            Path path = new Path();
            path.moveTo(f7, f8);
            path.lineTo(f9, f10);
            return path;
        }
    }

    /* renamed from: w0.h$b */
    public static class b {

        /* renamed from: a */
        public final View f9403a;

        /* renamed from: b */
        public final String f9404b;

        /* renamed from: c */
        public final C2064o f9405c;

        /* renamed from: d */
        public final InterfaceC2050a0 f9406d;

        /* renamed from: e */
        public final AbstractC2057h f9407e;

        public b(View view, String str, AbstractC2057h abstractC2057h, C2075z c2075z, C2064o c2064o) {
            this.f9403a = view;
            this.f9404b = str;
            this.f9405c = c2064o;
            this.f9406d = c2075z;
            this.f9407e = abstractC2057h;
        }
    }

    /* renamed from: w0.h$c */
    public static abstract class c {
    }

    /* renamed from: w0.h$d */
    public interface d {
        /* renamed from: a */
        void mo5092a();

        /* renamed from: b */
        void mo5086b();

        /* renamed from: c */
        void mo5087c();

        /* renamed from: d */
        void mo5088d();

        /* renamed from: e */
        void mo5089e(AbstractC2057h abstractC2057h);
    }

    /* renamed from: c */
    public static void m5093c(C2065p c2065p, View view, C2064o c2064o) {
        c2065p.f9431a.put(view, c2064o);
        int id = view.getId();
        if (id >= 0) {
            SparseArray<View> sparseArray = c2065p.f9432b;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        String m2878k = C0946x.i.m2878k(view);
        if (m2878k != null) {
            C1467a<String, View> c1467a = c2065p.f9434d;
            if (c1467a.containsKey(m2878k)) {
                c1467a.put(m2878k, null);
            } else {
                c1467a.put(m2878k, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                C1473g<View> c1473g = c2065p.f9433c;
                if (c1473g.f7029c) {
                    int i7 = c1473g.f7032s;
                    long[] jArr = c1473g.f7030e;
                    Object[] objArr = c1473g.f7031m;
                    int i8 = 0;
                    for (int i9 = 0; i9 < i7; i9++) {
                        Object obj = objArr[i9];
                        if (obj != C1474h.f7033a) {
                            if (i9 != i8) {
                                jArr[i8] = jArr[i9];
                                objArr[i8] = obj;
                                objArr[i9] = null;
                            }
                            i8++;
                        }
                    }
                    c1473g.f7029c = false;
                    c1473g.f7032s = i8;
                }
                if (C0017d.m86k(c1473g.f7030e, c1473g.f7032s, itemIdAtPosition) < 0) {
                    C0946x.d.m2842r(view, true);
                    c1473g.m3859g(itemIdAtPosition, view);
                    return;
                }
                View m3856d = c1473g.m3856d(itemIdAtPosition);
                if (m3856d != null) {
                    C0946x.d.m2842r(m3856d, false);
                    c1473g.m3859g(itemIdAtPosition, null);
                }
            }
        }
    }

    /* renamed from: o */
    public static C1467a<Animator, b> m5094o() {
        ThreadLocal<C1467a<Animator, b>> threadLocal = f9382L1;
        C1467a<Animator, b> c1467a = threadLocal.get();
        if (c1467a != null) {
            return c1467a;
        }
        C1467a<Animator, b> c1467a2 = new C1467a<>();
        threadLocal.set(c1467a2);
        return c1467a2;
    }

    /* renamed from: t */
    public static boolean m5095t(C2064o c2064o, C2064o c2064o2, String str) {
        Object obj = c2064o.f9428a.get(str);
        Object obj2 = c2064o2.f9428a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    /* renamed from: A */
    public void mo5096A(c cVar) {
        this.f9390H1 = cVar;
    }

    /* renamed from: B */
    public void mo5097B(TimeInterpolator timeInterpolator) {
        this.f9398s = timeInterpolator;
    }

    /* renamed from: C */
    public void mo5098C(AbstractC0136c abstractC0136c) {
        if (abstractC0136c == null) {
            abstractC0136c = f9381K1;
        }
        this.f9391I1 = abstractC0136c;
    }

    /* renamed from: D */
    public void mo5099D() {
    }

    /* renamed from: E */
    public void mo5100E(long j7) {
        this.f9396e = j7;
    }

    /* renamed from: F */
    public final void m5101F() {
        if (this.f9385C1 == 0) {
            ArrayList<d> arrayList = this.f9388F1;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f9388F1.clone();
                int size = arrayList2.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((d) arrayList2.get(i7)).mo5092a();
                }
            }
            this.f9387E1 = false;
        }
        this.f9385C1++;
    }

    /* renamed from: G */
    public String mo5102G(String str) {
        StringBuilder m4107b = C1686g.m4107b(str);
        m4107b.append(getClass().getSimpleName());
        m4107b.append("@");
        m4107b.append(Integer.toHexString(hashCode()));
        m4107b.append(": ");
        String sb = m4107b.toString();
        if (this.f9397m != -1) {
            sb = sb + "dur(" + this.f9397m + ") ";
        }
        if (this.f9396e != -1) {
            sb = sb + "dly(" + this.f9396e + ") ";
        }
        if (this.f9398s != null) {
            sb = sb + "interp(" + this.f9398s + ") ";
        }
        ArrayList<Integer> arrayList = this.f9392X;
        int size = arrayList.size();
        ArrayList<View> arrayList2 = this.f9393Y;
        if (size <= 0 && arrayList2.size() <= 0) {
            return sb;
        }
        String m210h = C0089a.m210h(sb, "tgts(");
        if (arrayList.size() > 0) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                if (i7 > 0) {
                    m210h = C0089a.m210h(m210h, ", ");
                }
                StringBuilder m4107b2 = C1686g.m4107b(m210h);
                m4107b2.append(arrayList.get(i7));
                m210h = m4107b2.toString();
            }
        }
        if (arrayList2.size() > 0) {
            for (int i8 = 0; i8 < arrayList2.size(); i8++) {
                if (i8 > 0) {
                    m210h = C0089a.m210h(m210h, ", ");
                }
                StringBuilder m4107b3 = C1686g.m4107b(m210h);
                m4107b3.append(arrayList2.get(i8));
                m210h = m4107b3.toString();
            }
        }
        return C0089a.m210h(m210h, ")");
    }

    /* renamed from: a */
    public void mo5103a(d dVar) {
        if (this.f9388F1 == null) {
            this.f9388F1 = new ArrayList<>();
        }
        this.f9388F1.add(dVar);
    }

    /* renamed from: b */
    public void mo5104b(View view) {
        this.f9393Y.add(view);
    }

    /* renamed from: d */
    public abstract void mo5082d(C2064o c2064o);

    /* renamed from: e */
    public final void m5105e(View view, boolean z6) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            C2064o c2064o = new C2064o(view);
            if (z6) {
                mo5083g(c2064o);
            } else {
                mo5082d(c2064o);
            }
            c2064o.f9430c.add(this);
            mo5106f(c2064o);
            m5093c(z6 ? this.f9394Z : this.f9399w1, view, c2064o);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                m5105e(viewGroup.getChildAt(i7), z6);
            }
        }
    }

    /* renamed from: f */
    public void mo5106f(C2064o c2064o) {
    }

    /* renamed from: g */
    public abstract void mo5083g(C2064o c2064o);

    /* renamed from: h */
    public final void m5107h(ViewGroup viewGroup, boolean z6) {
        m5108i(z6);
        ArrayList<Integer> arrayList = this.f9392X;
        int size = arrayList.size();
        ArrayList<View> arrayList2 = this.f9393Y;
        if (size <= 0 && arrayList2.size() <= 0) {
            m5105e(viewGroup, z6);
            return;
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            View findViewById = viewGroup.findViewById(arrayList.get(i7).intValue());
            if (findViewById != null) {
                C2064o c2064o = new C2064o(findViewById);
                if (z6) {
                    mo5083g(c2064o);
                } else {
                    mo5082d(c2064o);
                }
                c2064o.f9430c.add(this);
                mo5106f(c2064o);
                m5093c(z6 ? this.f9394Z : this.f9399w1, findViewById, c2064o);
            }
        }
        for (int i8 = 0; i8 < arrayList2.size(); i8++) {
            View view = arrayList2.get(i8);
            C2064o c2064o2 = new C2064o(view);
            if (z6) {
                mo5083g(c2064o2);
            } else {
                mo5082d(c2064o2);
            }
            c2064o2.f9430c.add(this);
            mo5106f(c2064o2);
            m5093c(z6 ? this.f9394Z : this.f9399w1, view, c2064o2);
        }
    }

    /* renamed from: i */
    public final void m5108i(boolean z6) {
        C2065p c2065p;
        if (z6) {
            this.f9394Z.f9431a.clear();
            this.f9394Z.f9432b.clear();
            c2065p = this.f9394Z;
        } else {
            this.f9399w1.f9431a.clear();
            this.f9399w1.f9432b.clear();
            c2065p = this.f9399w1;
        }
        c2065p.f9433c.m3854b();
    }

    @Override // 
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public AbstractC2057h clone() {
        try {
            AbstractC2057h abstractC2057h = (AbstractC2057h) super.clone();
            abstractC2057h.f9389G1 = new ArrayList<>();
            abstractC2057h.f9394Z = new C2065p();
            abstractC2057h.f9399w1 = new C2065p();
            abstractC2057h.f9402z1 = null;
            abstractC2057h.f9383A1 = null;
            return abstractC2057h;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: k */
    public Animator mo5084k(ViewGroup viewGroup, C2064o c2064o, C2064o c2064o2) {
        return null;
    }

    /* renamed from: l */
    public void mo5110l(ViewGroup viewGroup, C2065p c2065p, C2065p c2065p2, ArrayList<C2064o> arrayList, ArrayList<C2064o> arrayList2) {
        Animator mo5084k;
        View view;
        Animator animator;
        C2064o c2064o;
        Animator animator2;
        C2064o c2064o2;
        ViewGroup viewGroup2 = viewGroup;
        C1467a<Animator, b> m5094o = m5094o();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            C2064o c2064o3 = arrayList.get(i7);
            C2064o c2064o4 = arrayList2.get(i7);
            if (c2064o3 != null && !c2064o3.f9430c.contains(this)) {
                c2064o3 = null;
            }
            if (c2064o4 != null && !c2064o4.f9430c.contains(this)) {
                c2064o4 = null;
            }
            if (c2064o3 != null || c2064o4 != null) {
                if ((c2064o3 == null || c2064o4 == null || mo5114r(c2064o3, c2064o4)) && (mo5084k = mo5084k(viewGroup2, c2064o3, c2064o4)) != null) {
                    if (c2064o4 != null) {
                        String[] mo5085p = mo5085p();
                        view = c2064o4.f9429b;
                        if (mo5085p != null && mo5085p.length > 0) {
                            c2064o2 = new C2064o(view);
                            C2064o c2064o5 = c2065p2.f9431a.get(view);
                            if (c2064o5 != null) {
                                int i8 = 0;
                                while (i8 < mo5085p.length) {
                                    HashMap hashMap = c2064o2.f9428a;
                                    Animator animator3 = mo5084k;
                                    String str = mo5085p[i8];
                                    hashMap.put(str, c2064o5.f9428a.get(str));
                                    i8++;
                                    mo5084k = animator3;
                                    mo5085p = mo5085p;
                                }
                            }
                            Animator animator4 = mo5084k;
                            int i9 = m5094o.f7047m;
                            int i10 = 0;
                            while (true) {
                                if (i10 >= i9) {
                                    animator2 = animator4;
                                    break;
                                }
                                b bVar = m5094o.get(m5094o.m3874f(i10));
                                if (bVar.f9405c != null && bVar.f9403a == view && bVar.f9404b.equals(this.f9395c) && bVar.f9405c.equals(c2064o2)) {
                                    animator2 = null;
                                    break;
                                }
                                i10++;
                            }
                        } else {
                            animator2 = mo5084k;
                            c2064o2 = null;
                        }
                        animator = animator2;
                        c2064o = c2064o2;
                    } else {
                        view = c2064o3.f9429b;
                        animator = mo5084k;
                        c2064o = null;
                    }
                    if (animator != null) {
                        String str2 = this.f9395c;
                        C2069t c2069t = C2067r.f9436a;
                        m5094o.put(animator, new b(view, str2, this, new C2075z(viewGroup2), c2064o));
                        this.f9389G1.add(animator);
                    }
                    i7++;
                    viewGroup2 = viewGroup;
                }
            }
            i7++;
            viewGroup2 = viewGroup;
        }
        if (sparseIntArray.size() != 0) {
            for (int i11 = 0; i11 < sparseIntArray.size(); i11++) {
                Animator animator5 = this.f9389G1.get(sparseIntArray.keyAt(i11));
                animator5.setStartDelay(animator5.getStartDelay() + (sparseIntArray.valueAt(i11) - Long.MAX_VALUE));
            }
        }
    }

    /* renamed from: m */
    public final void m5111m() {
        int i7 = this.f9385C1 - 1;
        this.f9385C1 = i7;
        if (i7 == 0) {
            ArrayList<d> arrayList = this.f9388F1;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f9388F1.clone();
                int size = arrayList2.size();
                for (int i8 = 0; i8 < size; i8++) {
                    ((d) arrayList2.get(i8)).mo5089e(this);
                }
            }
            for (int i9 = 0; i9 < this.f9394Z.f9433c.m3860h(); i9++) {
                View m3861i = this.f9394Z.f9433c.m3861i(i9);
                if (m3861i != null) {
                    WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
                    C0946x.d.m2842r(m3861i, false);
                }
            }
            for (int i10 = 0; i10 < this.f9399w1.f9433c.m3860h(); i10++) {
                View m3861i2 = this.f9399w1.f9433c.m3861i(i10);
                if (m3861i2 != null) {
                    WeakHashMap<View, C0923h0> weakHashMap2 = C0946x.f4876a;
                    C0946x.d.m2842r(m3861i2, false);
                }
            }
            this.f9387E1 = true;
        }
    }

    /* renamed from: n */
    public final C2064o m5112n(View view, boolean z6) {
        C2062m c2062m = this.f9400x1;
        if (c2062m != null) {
            return c2062m.m5112n(view, z6);
        }
        ArrayList<C2064o> arrayList = z6 ? this.f9402z1 : this.f9383A1;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                i7 = -1;
                break;
            }
            C2064o c2064o = arrayList.get(i7);
            if (c2064o == null) {
                return null;
            }
            if (c2064o.f9429b == view) {
                break;
            }
            i7++;
        }
        if (i7 >= 0) {
            return (z6 ? this.f9383A1 : this.f9402z1).get(i7);
        }
        return null;
    }

    /* renamed from: p */
    public String[] mo5085p() {
        return null;
    }

    /* renamed from: q */
    public final C2064o m5113q(View view, boolean z6) {
        C2062m c2062m = this.f9400x1;
        if (c2062m != null) {
            return c2062m.m5113q(view, z6);
        }
        return (z6 ? this.f9394Z : this.f9399w1).f9431a.get(view);
    }

    /* renamed from: r */
    public boolean mo5114r(C2064o c2064o, C2064o c2064o2) {
        if (c2064o == null || c2064o2 == null) {
            return false;
        }
        String[] mo5085p = mo5085p();
        if (mo5085p == null) {
            Iterator it = c2064o.f9428a.keySet().iterator();
            while (it.hasNext()) {
                if (m5095t(c2064o, c2064o2, (String) it.next())) {
                }
            }
            return false;
        }
        for (String str : mo5085p) {
            if (!m5095t(c2064o, c2064o2, str)) {
            }
        }
        return false;
        return true;
    }

    /* renamed from: s */
    public final boolean m5115s(View view) {
        int id = view.getId();
        ArrayList<Integer> arrayList = this.f9392X;
        int size = arrayList.size();
        ArrayList<View> arrayList2 = this.f9393Y;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final String toString() {
        return mo5102G("");
    }

    /* renamed from: u */
    public void mo5116u(View view) {
        int i7;
        if (this.f9387E1) {
            return;
        }
        C1467a<Animator, b> m5094o = m5094o();
        int i8 = m5094o.f7047m;
        C2069t c2069t = C2067r.f9436a;
        WindowId windowId = view.getWindowId();
        int i9 = i8 - 1;
        while (true) {
            i7 = 0;
            if (i9 < 0) {
                break;
            }
            b m3877i = m5094o.m3877i(i9);
            if (m3877i.f9403a != null) {
                InterfaceC2050a0 interfaceC2050a0 = m3877i.f9406d;
                if ((interfaceC2050a0 instanceof C2075z) && ((C2075z) interfaceC2050a0).f9461a.equals(windowId)) {
                    i7 = 1;
                }
                if (i7 != 0) {
                    m5094o.m3874f(i9).pause();
                }
            }
            i9--;
        }
        ArrayList<d> arrayList = this.f9388F1;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f9388F1.clone();
            int size = arrayList2.size();
            while (i7 < size) {
                ((d) arrayList2.get(i7)).mo5086b();
                i7++;
            }
        }
        this.f9386D1 = true;
    }

    /* renamed from: v */
    public void mo5117v(d dVar) {
        ArrayList<d> arrayList = this.f9388F1;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(dVar);
        if (this.f9388F1.size() == 0) {
            this.f9388F1 = null;
        }
    }

    /* renamed from: w */
    public void mo5118w(View view) {
        this.f9393Y.remove(view);
    }

    /* renamed from: x */
    public void mo5119x(ViewGroup viewGroup) {
        if (this.f9386D1) {
            if (!this.f9387E1) {
                C1467a<Animator, b> m5094o = m5094o();
                int i7 = m5094o.f7047m;
                C2069t c2069t = C2067r.f9436a;
                WindowId windowId = viewGroup.getWindowId();
                for (int i8 = i7 - 1; i8 >= 0; i8--) {
                    b m3877i = m5094o.m3877i(i8);
                    if (m3877i.f9403a != null) {
                        InterfaceC2050a0 interfaceC2050a0 = m3877i.f9406d;
                        if ((interfaceC2050a0 instanceof C2075z) && ((C2075z) interfaceC2050a0).f9461a.equals(windowId)) {
                            m5094o.m3874f(i8).resume();
                        }
                    }
                }
                ArrayList<d> arrayList = this.f9388F1;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f9388F1.clone();
                    int size = arrayList2.size();
                    for (int i9 = 0; i9 < size; i9++) {
                        ((d) arrayList2.get(i9)).mo5087c();
                    }
                }
            }
            this.f9386D1 = false;
        }
    }

    /* renamed from: y */
    public void mo5120y() {
        m5101F();
        C1467a<Animator, b> m5094o = m5094o();
        Iterator<Animator> it = this.f9389G1.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (m5094o.containsKey(next)) {
                m5101F();
                if (next != null) {
                    next.addListener(new C2058i(this, m5094o));
                    long j7 = this.f9397m;
                    if (j7 >= 0) {
                        next.setDuration(j7);
                    }
                    long j8 = this.f9396e;
                    if (j8 >= 0) {
                        next.setStartDelay(next.getStartDelay() + j8);
                    }
                    TimeInterpolator timeInterpolator = this.f9398s;
                    if (timeInterpolator != null) {
                        next.setInterpolator(timeInterpolator);
                    }
                    next.addListener(new C2059j(this));
                    next.start();
                }
            }
        }
        this.f9389G1.clear();
        m5111m();
    }

    /* renamed from: z */
    public void mo5121z(long j7) {
        this.f9397m = j7;
    }
}
