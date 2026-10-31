package p145s1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.so.revelation.lua.RunnableC0721b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p161u1.C1967a;

/* renamed from: s1.c */
/* loaded from: classes.dex */
public final class C1876c extends RecyclerView.AbstractC0436e<RecyclerView.AbstractC0432a0> {

    /* renamed from: c */
    public final List<? extends AbstractC1877d> f8416c;

    /* renamed from: f */
    public b f8419f;

    /* renamed from: e */
    public final int f8418e = 30;

    /* renamed from: d */
    public final ArrayList f8417d = new ArrayList();

    /* renamed from: s1.c$a */
    public class a implements View.OnClickListener {

        /* renamed from: c */
        public final /* synthetic */ RecyclerView.AbstractC0432a0 f8420c;

        public a(RecyclerView.AbstractC0432a0 abstractC0432a0) {
            this.f8420c = abstractC0432a0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C1876c c1876c = C1876c.this;
            ArrayList arrayList = c1876c.f8417d;
            RecyclerView.AbstractC0432a0 abstractC0432a0 = this.f8420c;
            int m1569c = abstractC0432a0.m1569c();
            View view2 = abstractC0432a0.f2177a;
            C1875b c1875b = (C1875b) arrayList.get(m1569c);
            try {
                if (System.currentTimeMillis() - ((Long) view2.getTag()).longValue() < 500) {
                    return;
                }
            } catch (Exception unused) {
                view2.setTag(Long.valueOf(System.currentTimeMillis()));
            }
            view2.setTag(Long.valueOf(System.currentTimeMillis()));
            b bVar = c1876c.f8419f;
            if (bVar != null) {
                RunnableC0721b.this.f3639c.f3291Q1.m121f().m3500k0(c1875b.f8415s, 0);
                if (!c1875b.m4410a()) {
                    ((C1967a.a) abstractC0432a0).f8822t.animate().rotationBy(c1875b.f8414m ^ true ? 90 : -90).start();
                }
            }
            if (c1875b.m4410a()) {
                return;
            }
            boolean z6 = c1875b.f8414m;
            int indexOf = c1876c.f8417d.indexOf(c1875b) + 1;
            RecyclerView.C0437f c0437f = c1876c.f2197a;
            if (z6) {
                c0437f.m1593d(indexOf, c1876c.m4413j(c1875b, true));
            } else {
                c0437f.m1592c(indexOf, c1876c.m4411h(c1875b, indexOf));
            }
        }
    }

    /* renamed from: s1.c$b */
    public interface b {
    }

    public C1876c(List<C1875b> list, List<? extends AbstractC1877d> list2) {
        if (list != null) {
            m4412i(list);
        }
        this.f8416c = list2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0436e
    /* renamed from: a */
    public final int mo1583a() {
        ArrayList arrayList = this.f8417d;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0436e
    /* renamed from: c */
    public final int mo1585c(int i7) {
        return ((C1875b) this.f8417d.get(i7)).f8412c.mo4409a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0436e
    /* renamed from: d */
    public final void mo1586d(RecyclerView.AbstractC0432a0 abstractC0432a0, int i7) {
        ArrayList arrayList = this.f8417d;
        ((C1875b) arrayList.get(i7)).getClass();
        int i8 = this.f8418e * 0;
        View view = abstractC0432a0.f2177a;
        view.setPaddingRelative(i8, 3, 3, 3);
        view.setOnClickListener(new a(abstractC0432a0));
        for (AbstractC1877d abstractC1877d : this.f8416c) {
            if (abstractC1877d.mo4409a() == ((C1875b) arrayList.get(i7)).f8412c.mo4409a()) {
                abstractC1877d.mo4414b(abstractC0432a0, (C1875b) arrayList.get(i7));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0436e
    /* renamed from: e */
    public final void mo1587e(RecyclerView.AbstractC0432a0 abstractC0432a0, int i7, List<Object> list) {
        if (list != null && !list.isEmpty()) {
            Bundle bundle = (Bundle) list.get(0);
            for (String str : bundle.keySet()) {
                str.getClass();
                if (str.equals("IS_EXPAND") && this.f8419f != null) {
                    ((C1967a.a) abstractC0432a0).f8822t.animate().rotationBy(bundle.getBoolean(str) ? 90 : -90).start();
                }
            }
        }
        mo1586d(abstractC0432a0, i7);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0436e
    /* renamed from: f */
    public final RecyclerView.AbstractC0432a0 mo1588f(RecyclerView recyclerView, int i7) {
        View inflate = LayoutInflater.from(recyclerView.getContext()).inflate(i7, (ViewGroup) recyclerView, false);
        List<? extends AbstractC1877d> list = this.f8416c;
        if (list.size() != 1) {
            for (AbstractC1877d abstractC1877d : list) {
                if (abstractC1877d.mo4409a() == i7) {
                    return abstractC1877d.mo4415c(inflate);
                }
            }
        }
        return list.get(0).mo4415c(inflate);
    }

    /* renamed from: h */
    public final int m4411h(C1875b c1875b, int i7) {
        Iterator it = c1875b.f8413e.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            C1875b c1875b2 = (C1875b) it.next();
            int i9 = i8 + 1;
            this.f8417d.add(i8 + i7, c1875b2);
            i8 = c1875b2.f8414m ? m4411h(c1875b2, i7 + i9) + i9 : i9;
        }
        boolean z6 = c1875b.f8414m;
        if (!z6) {
            c1875b.f8414m = !z6;
        }
        return i8;
    }

    /* renamed from: i */
    public final void m4412i(List<C1875b> list) {
        for (C1875b c1875b : list) {
            this.f8417d.add(c1875b);
            if (!c1875b.m4410a() && c1875b.f8414m) {
                m4412i(c1875b.f8413e);
            }
        }
    }

    /* renamed from: j */
    public final int m4413j(C1875b c1875b, boolean z6) {
        if (c1875b.m4410a()) {
            return 0;
        }
        ArrayList<C1875b> arrayList = c1875b.f8413e;
        int size = arrayList.size();
        this.f8417d.removeAll(arrayList);
        for (C1875b c1875b2 : arrayList) {
            if (c1875b2.f8414m) {
                size += m4413j(c1875b2, false);
            }
        }
        if (z6) {
            c1875b.f8414m = !c1875b.f8414m;
        }
        return size;
    }
}
