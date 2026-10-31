package p122p1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0378x;
import androidx.fragment.app.C0335a;
import androidx.fragment.app.C0342d0;
import androidx.fragment.app.C0379y;
import androidx.fragment.app.ComponentCallbacksC0361n;
import com.so.revelation.lua.EditorActivity;
import com.so.revelation.lua.R;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p129q1.C1732h;
import p129q1.ViewOnClickListenerC1728d;
import p137r1.AbstractC1821a;

/* renamed from: p1.a */
/* loaded from: classes.dex */
public abstract class AbstractC1693a<T> extends AbstractC1821a<T> {

    /* renamed from: i */
    public final AbstractC0378x f7628i;

    /* renamed from: k */
    public a f7630k;

    /* renamed from: g */
    public C0335a f7626g = null;

    /* renamed from: l */
    public final ArrayList<ComponentCallbacksC0361n.e> f7631l = new ArrayList<>();

    /* renamed from: j */
    public final ArrayList<ComponentCallbacksC0361n> f7629j = new ArrayList<>();

    /* renamed from: h */
    public ComponentCallbacksC0361n f7627h = null;

    /* renamed from: m */
    public boolean f7632m = false;

    /* renamed from: p1.a$a */
    public interface a<T> {
        /* renamed from: a */
        ArrayList<T> mo4121a(Bundle bundle);

        /* renamed from: b */
        void mo4122b(Bundle bundle, ArrayList<T> arrayList);
    }

    /* renamed from: p1.a$b */
    public static class b implements a<Parcelable> {
        @Override // p122p1.AbstractC1693a.a
        /* renamed from: a */
        public final ArrayList<Parcelable> mo4121a(Bundle bundle) {
            return bundle.getParcelableArrayList("apa_items_key");
        }

        @Override // p122p1.AbstractC1693a.a
        /* renamed from: b */
        public final void mo4122b(Bundle bundle, ArrayList<Parcelable> arrayList) {
            bundle.putParcelableArrayList("apa_items_key", arrayList);
        }
    }

    /* renamed from: p1.a$c */
    public static class c implements a<Serializable> {
        @Override // p122p1.AbstractC1693a.a
        /* renamed from: a */
        public final ArrayList<Serializable> mo4121a(Bundle bundle) {
            return (ArrayList) bundle.getSerializable("apa_items_key");
        }

        @Override // p122p1.AbstractC1693a.a
        /* renamed from: b */
        public final void mo4122b(Bundle bundle, ArrayList<Serializable> arrayList) {
            bundle.putSerializable("apa_items_key", arrayList);
        }
    }

    public AbstractC1693a(C0379y c0379y) {
        this.f7628i = c0379y;
    }

    @Override // p198z0.AbstractC2273a
    @SuppressLint({"CommitTransaction"})
    /* renamed from: a */
    public final void mo4117a(int i7, Object obj) {
        ArrayList<ComponentCallbacksC0361n.e> arrayList;
        ArrayList<ComponentCallbacksC0361n> arrayList2;
        ComponentCallbacksC0361n.e eVar;
        Bundle m1160o;
        View view;
        C0335a c0335a = this.f7626g;
        AbstractC0378x abstractC0378x = this.f7628i;
        if (c0335a == null) {
            abstractC0378x.getClass();
            this.f7626g = new C0335a(abstractC0378x);
        }
        while (true) {
            arrayList = this.f7631l;
            if (arrayList.size() > i7) {
                break;
            } else {
                arrayList.add(null);
            }
        }
        while (true) {
            arrayList2 = this.f7629j;
            if (arrayList2.size() > i7) {
                break;
            } else {
                arrayList2.add(null);
            }
        }
        List<ComponentCallbacksC0361n> m1171h = abstractC0378x.f1886c.m1171h();
        if (m1171h != null) {
            for (ComponentCallbacksC0361n componentCallbacksC0361n : m1171h) {
                if (componentCallbacksC0361n != null && (view = componentCallbacksC0361n.f1793U1) != null && obj == view.getTag(R.id.avpa_view_tag_key)) {
                    break;
                }
            }
        }
        componentCallbacksC0361n = null;
        if (componentCallbacksC0361n != null) {
            if (arrayList2.contains(componentCallbacksC0361n)) {
                if (componentCallbacksC0361n.f1781I1 != null && componentCallbacksC0361n.f1773A1) {
                    C0342d0 m1170g = abstractC0378x.f1886c.m1170g(componentCallbacksC0361n.f1798Y);
                    if (m1170g != null) {
                        ComponentCallbacksC0361n componentCallbacksC0361n2 = m1170g.f1674c;
                        if (componentCallbacksC0361n2.equals(componentCallbacksC0361n)) {
                            if (componentCallbacksC0361n2.f1804c > -1 && (m1160o = m1170g.m1160o()) != null) {
                                eVar = new ComponentCallbacksC0361n.e(m1160o);
                                arrayList.set(i7, eVar);
                                arrayList2.set(i7, null);
                            }
                        }
                    }
                    abstractC0378x.m1314b0(new IllegalStateException("Fragment " + componentCallbacksC0361n + " is not currently in the FragmentManager"));
                    throw null;
                }
                eVar = null;
                arrayList.set(i7, eVar);
                arrayList2.set(i7, null);
            }
            C0335a c0335a2 = this.f7626g;
            c0335a2.m1140i(componentCallbacksC0361n);
            if (c0335a2.f1692g) {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
            c0335a2.f1627p.m1338y(c0335a2, true);
        }
    }

    @Override // p198z0.AbstractC2273a
    /* renamed from: b */
    public final void mo4118b() {
        View view;
        ArrayList<AbstractC1821a<T>.a<T>> arrayList = this.f8251e;
        int size = arrayList.size();
        ArrayList<ComponentCallbacksC0361n> arrayList2 = this.f7629j;
        int min = Math.min(size, arrayList2.size());
        for (int i7 = 0; i7 < min; i7++) {
            ComponentCallbacksC0361n componentCallbacksC0361n = arrayList2.get(i7);
            if (componentCallbacksC0361n != null && (view = componentCallbacksC0361n.f1793U1) != null) {
                view.setTag(R.id.avpa_view_tag_key, arrayList.get(i7));
            }
        }
        C0335a c0335a = this.f7626g;
        if (c0335a != null) {
            c0335a.m1135d(true);
            this.f7626g = null;
            AbstractC0378x abstractC0378x = this.f7628i;
            abstractC0378x.m1337x(true);
            abstractC0378x.m1293D();
        }
    }

    @Override // p198z0.AbstractC2273a
    @SuppressLint({"CommitTransaction"})
    /* renamed from: d */
    public final Object mo4119d(ViewGroup viewGroup, int i7) {
        ComponentCallbacksC0361n.e eVar;
        ArrayList<ComponentCallbacksC0361n> arrayList = this.f7629j;
        if (arrayList.size() > i7 && arrayList.get(i7) != null) {
            return this.f8251e.get(i7);
        }
        if (this.f7626g == null) {
            AbstractC0378x abstractC0378x = this.f7628i;
            abstractC0378x.getClass();
            this.f7626g = new C0335a(abstractC0378x);
        }
        C1732h c1732h = (C1732h) this.f8251e.get(i7).f8254b;
        EditorActivity editorActivity = ViewOnClickListenerC1728d.f7900A2;
        File file = c1732h.f7934X;
        Bundle bundle = new Bundle();
        bundle.putSerializable("KEY_FILE", file);
        bundle.putInt("KEY_OFFSET", c1732h.f7935m);
        bundle.putString("KEY_ENCODING", c1732h.f7936s);
        ViewOnClickListenerC1728d viewOnClickListenerC1728d = new ViewOnClickListenerC1728d();
        viewOnClickListenerC1728d.m1232M(bundle);
        ArrayList<ComponentCallbacksC0361n.e> arrayList2 = this.f7631l;
        if (arrayList2.size() > i7 && (eVar = arrayList2.get(i7)) != null) {
            if (viewOnClickListenerC1728d.f1780H1 != null) {
                throw new IllegalStateException("Fragment already added");
            }
            Bundle bundle2 = eVar.f1830c;
            if (bundle2 == null) {
                bundle2 = null;
            }
            viewOnClickListenerC1728d.f1807e = bundle2;
        }
        while (arrayList.size() <= i7) {
            arrayList.add(null);
        }
        if (viewOnClickListenerC1728d.f1790R1) {
            viewOnClickListenerC1728d.f1790R1 = false;
        }
        viewOnClickListenerC1728d.m1233N(false);
        arrayList.set(i7, viewOnClickListenerC1728d);
        this.f7626g.m1136e(viewGroup.getId(), viewOnClickListenerC1728d, null, 1);
        return this.f8251e.get(i7);
    }

    @Override // p198z0.AbstractC2273a
    /* renamed from: f */
    public final void mo4120f(Parcelable parcelable, ClassLoader classLoader) {
        ComponentCallbacksC0361n m1291B;
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            ArrayList<ComponentCallbacksC0361n.e> arrayList = this.f7631l;
            arrayList.clear();
            ArrayList<ComponentCallbacksC0361n> arrayList2 = this.f7629j;
            arrayList2.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    arrayList.add((ComponentCallbacksC0361n.e) parcelable2);
                }
            }
            a aVar = this.f7630k;
            if (aVar != null) {
                this.f8251e = this.f8249c.m4301a(aVar.mo4121a(bundle));
                m5503e();
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    AbstractC0378x abstractC0378x = this.f7628i;
                    abstractC0378x.getClass();
                    String string = bundle.getString(str);
                    if (string == null) {
                        m1291B = null;
                    } else {
                        m1291B = abstractC0378x.m1291B(string);
                        if (m1291B == null) {
                            abstractC0378x.m1314b0(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
                            throw null;
                        }
                    }
                    if (m1291B != null) {
                        while (arrayList2.size() <= parseInt) {
                            arrayList2.add(null);
                        }
                        if (m1291B.f1790R1) {
                            m1291B.f1790R1 = false;
                        }
                        arrayList2.set(parseInt, m1291B);
                    } else {
                        Log.w("StatePagerAdapter", "Bad fragment at key ".concat(str));
                    }
                }
            }
        }
    }
}
