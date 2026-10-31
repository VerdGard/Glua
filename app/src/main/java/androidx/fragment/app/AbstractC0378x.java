package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.ext.C0089a;
import android.ext.C0090b;
import android.ext.C0091c;
import android.ext.Tools;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.AbstractC0127l;
import androidx.activity.InterfaceC0118c;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.AbstractC0136c;
import androidx.activity.result.AbstractC0138e;
import androidx.activity.result.C0134a;
import androidx.activity.result.C0137d;
import androidx.activity.result.InterfaceC0135b;
import androidx.fragment.R$id;
import androidx.fragment.app.AbstractC0346f0;
import androidx.fragment.app.ComponentCallbacksC0361n;
import androidx.lifecycle.AbstractC0394f;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p023c6.InterfaceC0655a;
import p136r0.C1820a;
import p187x5.C2199c;

/* renamed from: androidx.fragment.app.x */
/* loaded from: classes.dex */
public abstract class AbstractC0378x {

    /* renamed from: A */
    public boolean f1877A;

    /* renamed from: B */
    public boolean f1878B;

    /* renamed from: C */
    public ArrayList<C0335a> f1879C;

    /* renamed from: D */
    public ArrayList<Boolean> f1880D;

    /* renamed from: E */
    public ArrayList<ComponentCallbacksC0361n> f1881E;

    /* renamed from: F */
    public C0336a0 f1882F;

    /* renamed from: G */
    public final g f1883G;

    /* renamed from: b */
    public boolean f1885b;

    /* renamed from: d */
    public ArrayList<C0335a> f1887d;

    /* renamed from: e */
    public ArrayList<ComponentCallbacksC0361n> f1888e;

    /* renamed from: g */
    public OnBackPressedDispatcher f1890g;

    /* renamed from: k */
    public final C0377w f1894k;

    /* renamed from: l */
    public final CopyOnWriteArrayList<InterfaceC0338b0> f1895l;

    /* renamed from: m */
    public int f1896m;

    /* renamed from: n */
    public AbstractC0375u<?> f1897n;

    /* renamed from: o */
    public AbstractC0136c f1898o;

    /* renamed from: p */
    public ComponentCallbacksC0361n f1899p;

    /* renamed from: q */
    public ComponentCallbacksC0361n f1900q;

    /* renamed from: r */
    public final e f1901r;

    /* renamed from: s */
    public final f f1902s;

    /* renamed from: t */
    public C0137d f1903t;

    /* renamed from: u */
    public C0137d f1904u;

    /* renamed from: v */
    public C0137d f1905v;

    /* renamed from: w */
    public ArrayDeque<k> f1906w;

    /* renamed from: x */
    public boolean f1907x;

    /* renamed from: y */
    public boolean f1908y;

    /* renamed from: z */
    public boolean f1909z;

    /* renamed from: a */
    public final ArrayList<l> f1884a = new ArrayList<>();

    /* renamed from: c */
    public final C0344e0 f1886c = new C0344e0();

    /* renamed from: f */
    public final LayoutInflaterFactory2C0376v f1889f = new LayoutInflaterFactory2C0376v(this);

    /* renamed from: h */
    public final c f1891h = new c();

    /* renamed from: i */
    public final AtomicInteger f1892i = new AtomicInteger();

    /* renamed from: j */
    public final Map<String, Bundle> f1893j = Collections.synchronizedMap(new HashMap());

    /* renamed from: androidx.fragment.app.x$a */
    public class a implements InterfaceC0135b<C0134a> {
        public a() {
        }

        @Override // androidx.activity.result.InterfaceC0135b
        /* renamed from: a */
        public final void mo378a(C0134a c0134a) {
            StringBuilder sb;
            C0134a c0134a2 = c0134a;
            AbstractC0378x abstractC0378x = AbstractC0378x.this;
            k pollFirst = abstractC0378x.f1906w.pollFirst();
            if (pollFirst == null) {
                sb = new StringBuilder("No IntentSenders were started for ");
                sb.append(this);
            } else {
                C0344e0 c0344e0 = abstractC0378x.f1886c;
                String str = pollFirst.f1917c;
                ComponentCallbacksC0361n m1167d = c0344e0.m1167d(str);
                if (m1167d != null) {
                    m1167d.m1244r(pollFirst.f1918e, c0134a2.f248c, c0134a2.f249e);
                    return;
                } else {
                    sb = new StringBuilder("Intent Sender result delivered for unknown Fragment ");
                    sb.append(str);
                }
            }
            Log.w("FragmentManager", sb.toString());
        }
    }

    /* renamed from: androidx.fragment.app.x$b */
    public class b implements InterfaceC0135b<Map<String, Boolean>> {
        public b() {
        }

        @Override // androidx.activity.result.InterfaceC0135b
        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: a */
        public final void mo378a(Map<String, Boolean> map) {
            StringBuilder sb;
            Map<String, Boolean> map2 = map;
            ArrayList arrayList = new ArrayList(map2.values());
            int[] iArr = new int[arrayList.size()];
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                iArr[i7] = ((Boolean) arrayList.get(i7)).booleanValue() ? 0 : -1;
            }
            AbstractC0378x abstractC0378x = AbstractC0378x.this;
            k pollFirst = abstractC0378x.f1906w.pollFirst();
            if (pollFirst == null) {
                sb = new StringBuilder("No permissions were requested for ");
                sb.append(this);
            } else {
                C0344e0 c0344e0 = abstractC0378x.f1886c;
                String str = pollFirst.f1917c;
                if (c0344e0.m1167d(str) != null) {
                    return;
                }
                sb = new StringBuilder("Permission request result delivered for unknown Fragment ");
                sb.append(str);
            }
            Log.w("FragmentManager", sb.toString());
        }
    }

    /* renamed from: androidx.fragment.app.x$c */
    public class c extends AbstractC0127l {
        public c() {
        }

        @Override // androidx.activity.AbstractC0127l
        /* renamed from: a */
        public final void mo377a() {
            AbstractC0378x abstractC0378x = AbstractC0378x.this;
            abstractC0378x.m1337x(true);
            if (abstractC0378x.f1891h.f239a) {
                abstractC0378x.m1300O();
            } else {
                abstractC0378x.f1890g.m361b();
            }
        }
    }

    /* renamed from: androidx.fragment.app.x$d */
    public class d {
        public d(AbstractC0378x abstractC0378x) {
        }
    }

    /* renamed from: androidx.fragment.app.x$e */
    public class e extends C0373t {
        public e() {
        }

        @Override // androidx.fragment.app.C0373t
        /* renamed from: a */
        public final ComponentCallbacksC0361n mo1270a(String str) {
            Context context = AbstractC0378x.this.f1897n.f1870m;
            Object obj = ComponentCallbacksC0361n.f1772g2;
            try {
                return C0373t.m1269c(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (IllegalAccessException e7) {
                throw new ComponentCallbacksC0361n.c(C0091c.m228f("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e7);
            } catch (InstantiationException e8) {
                throw new ComponentCallbacksC0361n.c(C0091c.m228f("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e8);
            } catch (NoSuchMethodException e9) {
                throw new ComponentCallbacksC0361n.c(C0091c.m228f("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e9);
            } catch (InvocationTargetException e10) {
                throw new ComponentCallbacksC0361n.c(C0091c.m228f("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e10);
            }
        }
    }

    /* renamed from: androidx.fragment.app.x$f */
    public class f implements InterfaceC0372s0 {
    }

    /* renamed from: androidx.fragment.app.x$g */
    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AbstractC0378x.this.m1337x(true);
        }
    }

    /* renamed from: androidx.fragment.app.x$h */
    public class h implements InterfaceC0338b0 {

        /* renamed from: c */
        public final /* synthetic */ ComponentCallbacksC0361n f1915c;

        public h(ComponentCallbacksC0361n componentCallbacksC0361n) {
            this.f1915c = componentCallbacksC0361n;
        }

        @Override // androidx.fragment.app.InterfaceC0338b0
        /* renamed from: d */
        public final void mo1145d() {
            this.f1915c.getClass();
        }
    }

    /* renamed from: androidx.fragment.app.x$i */
    public class i implements InterfaceC0135b<C0134a> {
        public i() {
        }

        @Override // androidx.activity.result.InterfaceC0135b
        /* renamed from: a */
        public final void mo378a(C0134a c0134a) {
            StringBuilder sb;
            C0134a c0134a2 = c0134a;
            AbstractC0378x abstractC0378x = AbstractC0378x.this;
            k pollFirst = abstractC0378x.f1906w.pollFirst();
            if (pollFirst == null) {
                sb = new StringBuilder("No Activities were started for result for ");
                sb.append(this);
            } else {
                C0344e0 c0344e0 = abstractC0378x.f1886c;
                String str = pollFirst.f1917c;
                ComponentCallbacksC0361n m1167d = c0344e0.m1167d(str);
                if (m1167d != null) {
                    m1167d.m1244r(pollFirst.f1918e, c0134a2.f248c, c0134a2.f249e);
                    return;
                } else {
                    sb = new StringBuilder("Activity result delivered for unknown Fragment ");
                    sb.append(str);
                }
            }
            Log.w("FragmentManager", sb.toString());
        }
    }

    /* renamed from: androidx.fragment.app.x$j */
    public static class j extends AbstractC0136c {
        @Override // androidx.activity.result.AbstractC0136c
        /* renamed from: x */
        public final Object mo395x(Intent intent, int i7) {
            return new C0134a(intent, i7);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.fragment.app.x$k */
    public static class k implements Parcelable {
        public static final Parcelable.Creator<k> CREATOR = new a();

        /* renamed from: c */
        public final String f1917c;

        /* renamed from: e */
        public final int f1918e;

        /* renamed from: androidx.fragment.app.x$k$a */
        public class a implements Parcelable.Creator<k> {
            @Override // android.os.Parcelable.Creator
            public final k createFromParcel(Parcel parcel) {
                return new k(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final k[] newArray(int i7) {
                return new k[i7];
            }
        }

        public k(Parcel parcel) {
            this.f1917c = parcel.readString();
            this.f1918e = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            parcel.writeString(this.f1917c);
            parcel.writeInt(this.f1918e);
        }
    }

    /* renamed from: androidx.fragment.app.x$l */
    public interface l {
        /* renamed from: a */
        boolean mo1133a(ArrayList<C0335a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* renamed from: androidx.fragment.app.x$m */
    public class m implements l {

        /* renamed from: a */
        public final int f1919a;

        /* renamed from: b */
        public final int f1920b = 1;

        public m(int i7) {
            this.f1919a = i7;
        }

        @Override // androidx.fragment.app.AbstractC0378x.l
        /* renamed from: a */
        public final boolean mo1133a(ArrayList<C0335a> arrayList, ArrayList<Boolean> arrayList2) {
            AbstractC0378x abstractC0378x = AbstractC0378x.this;
            ComponentCallbacksC0361n componentCallbacksC0361n = abstractC0378x.f1900q;
            int i7 = this.f1919a;
            if (componentCallbacksC0361n == null || i7 >= 0 || !componentCallbacksC0361n.m1236g().m1300O()) {
                return abstractC0378x.m1301P(arrayList, arrayList2, i7, this.f1920b);
            }
            return false;
        }
    }

    public AbstractC0378x() {
        Collections.synchronizedMap(new HashMap());
        Collections.synchronizedMap(new HashMap());
        new d(this);
        this.f1894k = new C0377w(this);
        this.f1895l = new CopyOnWriteArrayList<>();
        this.f1896m = -1;
        this.f1901r = new e();
        this.f1902s = new f();
        this.f1906w = new ArrayDeque<>();
        this.f1883G = new g();
    }

    /* renamed from: I */
    public static boolean m1285I(int i7) {
        return Log.isLoggable("FragmentManager", i7);
    }

    /* renamed from: J */
    public static boolean m1286J(ComponentCallbacksC0361n componentCallbacksC0361n) {
        componentCallbacksC0361n.getClass();
        Iterator it = componentCallbacksC0361n.f1782J1.f1886c.m1169f().iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            ComponentCallbacksC0361n componentCallbacksC0361n2 = (ComponentCallbacksC0361n) it.next();
            if (componentCallbacksC0361n2 != null) {
                z6 = m1286J(componentCallbacksC0361n2);
            }
            if (z6) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: K */
    public static boolean m1287K(ComponentCallbacksC0361n componentCallbacksC0361n) {
        if (componentCallbacksC0361n == null) {
            return true;
        }
        return componentCallbacksC0361n.f1790R1 && (componentCallbacksC0361n.f1780H1 == null || m1287K(componentCallbacksC0361n.f1783K1));
    }

    /* renamed from: L */
    public static boolean m1288L(ComponentCallbacksC0361n componentCallbacksC0361n) {
        if (componentCallbacksC0361n == null) {
            return true;
        }
        AbstractC0378x abstractC0378x = componentCallbacksC0361n.f1780H1;
        return componentCallbacksC0361n.equals(abstractC0378x.f1900q) && m1288L(abstractC0378x.f1899p);
    }

    /* renamed from: Z */
    public static void m1289Z(ComponentCallbacksC0361n componentCallbacksC0361n) {
        if (m1285I(2)) {
            Log.v("FragmentManager", "show: " + componentCallbacksC0361n);
        }
        if (componentCallbacksC0361n.f1787O1) {
            componentCallbacksC0361n.f1787O1 = false;
            componentCallbacksC0361n.f1799Y1 = !componentCallbacksC0361n.f1799Y1;
        }
    }

    /* renamed from: A */
    public final void m1290A(ArrayList<C0335a> arrayList, ArrayList<Boolean> arrayList2) {
    }

    /* renamed from: B */
    public final ComponentCallbacksC0361n m1291B(String str) {
        return this.f1886c.m1166c(str);
    }

    /* renamed from: C */
    public final ComponentCallbacksC0361n m1292C(int i7) {
        C0344e0 c0344e0 = this.f1886c;
        ArrayList arrayList = (ArrayList) c0344e0.f1679a;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                for (C0342d0 c0342d0 : ((HashMap) c0344e0.f1680b).values()) {
                    if (c0342d0 != null) {
                        ComponentCallbacksC0361n componentCallbacksC0361n = c0342d0.f1674c;
                        if (componentCallbacksC0361n.f1784L1 == i7) {
                            return componentCallbacksC0361n;
                        }
                    }
                }
                return null;
            }
            ComponentCallbacksC0361n componentCallbacksC0361n2 = (ComponentCallbacksC0361n) arrayList.get(size);
            if (componentCallbacksC0361n2 != null && componentCallbacksC0361n2.f1784L1 == i7) {
                return componentCallbacksC0361n2;
            }
        }
    }

    /* renamed from: D */
    public final void m1293D() {
        Iterator it = m1319f().iterator();
        while (it.hasNext()) {
            AbstractC0368q0 abstractC0368q0 = (AbstractC0368q0) it.next();
            if (abstractC0368q0.f1849e) {
                abstractC0368q0.f1849e = false;
                abstractC0368q0.m1257c();
            }
        }
    }

    /* renamed from: E */
    public final ViewGroup m1294E(ComponentCallbacksC0361n componentCallbacksC0361n) {
        ViewGroup viewGroup = componentCallbacksC0361n.f1792T1;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (componentCallbacksC0361n.f1785M1 > 0 && this.f1898o.mo394w()) {
            View mo390s = this.f1898o.mo390s(componentCallbacksC0361n.f1785M1);
            if (mo390s instanceof ViewGroup) {
                return (ViewGroup) mo390s;
            }
        }
        return null;
    }

    /* renamed from: F */
    public final C0373t m1295F() {
        ComponentCallbacksC0361n componentCallbacksC0361n = this.f1899p;
        return componentCallbacksC0361n != null ? componentCallbacksC0361n.f1780H1.m1295F() : this.f1901r;
    }

    /* renamed from: G */
    public final InterfaceC0372s0 m1296G() {
        ComponentCallbacksC0361n componentCallbacksC0361n = this.f1899p;
        return componentCallbacksC0361n != null ? componentCallbacksC0361n.f1780H1.m1296G() : this.f1902s;
    }

    /* renamed from: H */
    public final void m1297H(ComponentCallbacksC0361n componentCallbacksC0361n) {
        if (m1285I(2)) {
            Log.v("FragmentManager", "hide: " + componentCallbacksC0361n);
        }
        if (componentCallbacksC0361n.f1787O1) {
            return;
        }
        componentCallbacksC0361n.f1787O1 = true;
        componentCallbacksC0361n.f1799Y1 = true ^ componentCallbacksC0361n.f1799Y1;
        m1310Y(componentCallbacksC0361n);
    }

    /* renamed from: M */
    public final void m1298M(int i7, boolean z6) {
        Object obj;
        AbstractC0375u<?> abstractC0375u;
        if (this.f1897n == null && i7 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z6 || i7 != this.f1896m) {
            this.f1896m = i7;
            C0344e0 c0344e0 = this.f1886c;
            Iterator it = ((ArrayList) c0344e0.f1679a).iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                obj = c0344e0.f1680b;
                if (!hasNext) {
                    break;
                }
                C0342d0 c0342d0 = (C0342d0) ((HashMap) obj).get(((ComponentCallbacksC0361n) it.next()).f1798Y);
                if (c0342d0 != null) {
                    c0342d0.m1156k();
                }
            }
            Iterator it2 = ((HashMap) obj).values().iterator();
            while (true) {
                boolean z7 = false;
                if (!it2.hasNext()) {
                    break;
                }
                C0342d0 c0342d02 = (C0342d0) it2.next();
                if (c0342d02 != null) {
                    c0342d02.m1156k();
                    ComponentCallbacksC0361n componentCallbacksC0361n = c0342d02.f1674c;
                    if (componentCallbacksC0361n.f1774B1) {
                        if (!(componentCallbacksC0361n.f1779G1 > 0)) {
                            z7 = true;
                        }
                    }
                    if (z7) {
                        c0344e0.m1173j(c0342d02);
                    }
                }
            }
            m1312a0();
            if (this.f1907x && (abstractC0375u = this.f1897n) != null && this.f1896m == 7) {
                abstractC0375u.mo1252B();
                this.f1907x = false;
            }
        }
    }

    /* renamed from: N */
    public final void m1299N() {
        if (this.f1897n == null) {
            return;
        }
        this.f1908y = false;
        this.f1909z = false;
        this.f1882F.f1636h = false;
        for (ComponentCallbacksC0361n componentCallbacksC0361n : this.f1886c.m1171h()) {
            if (componentCallbacksC0361n != null) {
                componentCallbacksC0361n.f1782J1.m1299N();
            }
        }
    }

    /* renamed from: O */
    public final boolean m1300O() {
        m1337x(false);
        m1336w(true);
        ComponentCallbacksC0361n componentCallbacksC0361n = this.f1900q;
        if (componentCallbacksC0361n != null && componentCallbacksC0361n.m1236g().m1300O()) {
            return true;
        }
        boolean m1301P = m1301P(this.f1879C, this.f1880D, -1, 0);
        if (m1301P) {
            this.f1885b = true;
            try {
                m1303R(this.f1879C, this.f1880D);
            } finally {
                m1318e();
            }
        }
        m1316c0();
        if (this.f1878B) {
            this.f1878B = false;
            m1312a0();
        }
        this.f1886c.m1165b();
        return m1301P;
    }

    /* renamed from: P */
    public final boolean m1301P(ArrayList arrayList, ArrayList arrayList2, int i7, int i8) {
        C0335a c0335a;
        ArrayList<C0335a> arrayList3 = this.f1887d;
        if (arrayList3 == null) {
            return false;
        }
        if (i7 >= 0 || (i8 & 1) != 0) {
            int i9 = -1;
            if (i7 >= 0) {
                int size = arrayList3.size() - 1;
                while (size >= 0) {
                    C0335a c0335a2 = this.f1887d.get(size);
                    if (i7 >= 0 && i7 == c0335a2.f1629r) {
                        break;
                    }
                    size--;
                }
                if (size < 0) {
                    return false;
                }
                if ((i8 & 1) != 0) {
                    do {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        c0335a = this.f1887d.get(size);
                        if (i7 < 0) {
                            break;
                        }
                    } while (i7 == c0335a.f1629r);
                }
                i9 = size;
            }
            if (i9 == this.f1887d.size() - 1) {
                return false;
            }
            for (int size2 = this.f1887d.size() - 1; size2 > i9; size2--) {
                arrayList.add(this.f1887d.remove(size2));
                arrayList2.add(Boolean.TRUE);
            }
        } else {
            int size3 = arrayList3.size() - 1;
            if (size3 < 0) {
                return false;
            }
            arrayList.add(this.f1887d.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    /* renamed from: Q */
    public final void m1302Q(ComponentCallbacksC0361n componentCallbacksC0361n) {
        if (m1285I(2)) {
            Log.v("FragmentManager", "remove: " + componentCallbacksC0361n + " nesting=" + componentCallbacksC0361n.f1779G1);
        }
        boolean z6 = !(componentCallbacksC0361n.f1779G1 > 0);
        if (!componentCallbacksC0361n.f1788P1 || z6) {
            C0344e0 c0344e0 = this.f1886c;
            synchronized (((ArrayList) c0344e0.f1679a)) {
                ((ArrayList) c0344e0.f1679a).remove(componentCallbacksC0361n);
            }
            componentCallbacksC0361n.f1773A1 = false;
            if (m1286J(componentCallbacksC0361n)) {
                this.f1907x = true;
            }
            componentCallbacksC0361n.f1774B1 = true;
            m1310Y(componentCallbacksC0361n);
        }
    }

    /* renamed from: R */
    public final void m1303R(ArrayList<C0335a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        m1290A(arrayList, arrayList2);
        int size = arrayList.size();
        int i7 = 0;
        int i8 = 0;
        while (i7 < size) {
            if (!arrayList.get(i7).f1700o) {
                if (i8 != i7) {
                    m1339z(arrayList, arrayList2, i8, i7);
                }
                i8 = i7 + 1;
                if (arrayList2.get(i7).booleanValue()) {
                    while (i8 < size && arrayList2.get(i8).booleanValue() && !arrayList.get(i8).f1700o) {
                        i8++;
                    }
                }
                m1339z(arrayList, arrayList2, i7, i8);
                i7 = i8 - 1;
            }
            i7++;
        }
        if (i8 != size) {
            m1339z(arrayList, arrayList2, i8, size);
        }
    }

    /* renamed from: S */
    public final void m1304S(Parcelable parcelable) {
        C0377w c0377w;
        int i7;
        C0342d0 c0342d0;
        if (parcelable == null) {
            return;
        }
        C0380z c0380z = (C0380z) parcelable;
        if (c0380z.f1925c == null) {
            return;
        }
        C0344e0 c0344e0 = this.f1886c;
        ((HashMap) c0344e0.f1680b).clear();
        Iterator<C0340c0> it = c0380z.f1925c.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            c0377w = this.f1894k;
            if (!hasNext) {
                break;
            }
            C0340c0 next = it.next();
            if (next != null) {
                ComponentCallbacksC0361n componentCallbacksC0361n = this.f1882F.f1631c.get(next.f1660e);
                if (componentCallbacksC0361n != null) {
                    if (m1285I(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + componentCallbacksC0361n);
                    }
                    c0342d0 = new C0342d0(c0377w, c0344e0, componentCallbacksC0361n, next);
                } else {
                    c0342d0 = new C0342d0(this.f1894k, this.f1886c, this.f1897n.f1870m.getClassLoader(), m1295F(), next);
                }
                ComponentCallbacksC0361n componentCallbacksC0361n2 = c0342d0.f1674c;
                componentCallbacksC0361n2.f1780H1 = this;
                if (m1285I(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + componentCallbacksC0361n2.f1798Y + "): " + componentCallbacksC0361n2);
                }
                c0342d0.m1158m(this.f1897n.f1870m.getClassLoader());
                c0344e0.m1172i(c0342d0);
                c0342d0.f1676e = this.f1896m;
            }
        }
        C0336a0 c0336a0 = this.f1882F;
        c0336a0.getClass();
        Iterator it2 = new ArrayList(c0336a0.f1631c.values()).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            ComponentCallbacksC0361n componentCallbacksC0361n3 = (ComponentCallbacksC0361n) it2.next();
            if ((((HashMap) c0344e0.f1680b).get(componentCallbacksC0361n3.f1798Y) != null ? 1 : 0) == 0) {
                if (m1285I(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + componentCallbacksC0361n3 + " that was not found in the set of active Fragments " + c0380z.f1925c);
                }
                this.f1882F.m1142b(componentCallbacksC0361n3);
                componentCallbacksC0361n3.f1780H1 = this;
                C0342d0 c0342d02 = new C0342d0(c0377w, c0344e0, componentCallbacksC0361n3);
                c0342d02.f1676e = 1;
                c0342d02.m1156k();
                componentCallbacksC0361n3.f1774B1 = true;
                c0342d02.m1156k();
            }
        }
        ArrayList<String> arrayList = c0380z.f1926e;
        ((ArrayList) c0344e0.f1679a).clear();
        if (arrayList != null) {
            for (String str : arrayList) {
                ComponentCallbacksC0361n m1166c = c0344e0.m1166c(str);
                if (m1166c == null) {
                    throw new IllegalStateException(C0091c.m228f("No instantiated fragment for (", str, ")"));
                }
                if (m1285I(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + m1166c);
                }
                c0344e0.m1164a(m1166c);
            }
        }
        if (c0380z.f1927m != null) {
            this.f1887d = new ArrayList<>(c0380z.f1927m.length);
            int i8 = 0;
            while (true) {
                C0337b[] c0337bArr = c0380z.f1927m;
                if (i8 >= c0337bArr.length) {
                    break;
                }
                C0337b c0337b = c0337bArr[i8];
                c0337b.getClass();
                C0335a c0335a = new C0335a(this);
                int i9 = 0;
                int i10 = 0;
                while (true) {
                    int[] iArr = c0337b.f1643c;
                    if (i9 >= iArr.length) {
                        break;
                    }
                    AbstractC0346f0.a aVar = new AbstractC0346f0.a();
                    int i11 = i9 + 1;
                    aVar.f1701a = iArr[i9];
                    if (m1285I(2)) {
                        Log.v("FragmentManager", "Instantiate " + c0335a + " op #" + i10 + " base fragment #" + iArr[i11]);
                    }
                    String str2 = c0337b.f1644e.get(i10);
                    aVar.f1702b = str2 != null ? m1291B(str2) : null;
                    aVar.f1707g = AbstractC0394f.b.values()[c0337b.f1645m[i10]];
                    aVar.f1708h = AbstractC0394f.b.values()[c0337b.f1646s[i10]];
                    int i12 = i11 + 1;
                    int i13 = iArr[i11];
                    aVar.f1703c = i13;
                    int i14 = i12 + 1;
                    int i15 = iArr[i12];
                    aVar.f1704d = i15;
                    int i16 = i14 + 1;
                    int i17 = iArr[i14];
                    aVar.f1705e = i17;
                    int i18 = iArr[i16];
                    aVar.f1706f = i18;
                    c0335a.f1687b = i13;
                    c0335a.f1688c = i15;
                    c0335a.f1689d = i17;
                    c0335a.f1690e = i18;
                    c0335a.m1174b(aVar);
                    i10++;
                    i9 = i16 + 1;
                }
                c0335a.f1691f = c0337b.f1640X;
                c0335a.f1693h = c0337b.f1641Y;
                c0335a.f1629r = c0337b.f1642Z;
                c0335a.f1692g = true;
                c0335a.f1694i = c0337b.f1647w1;
                c0335a.f1695j = c0337b.f1648x1;
                c0335a.f1696k = c0337b.f1649y1;
                c0335a.f1697l = c0337b.f1650z1;
                c0335a.f1698m = c0337b.f1637A1;
                c0335a.f1699n = c0337b.f1638B1;
                c0335a.f1700o = c0337b.f1639C1;
                c0335a.m1134c(1);
                if (m1285I(2)) {
                    StringBuilder m221g = C0090b.m221g("restoreAllState: back stack #", i8, " (index ");
                    m221g.append(c0335a.f1629r);
                    m221g.append("): ");
                    m221g.append(c0335a);
                    Log.v("FragmentManager", m221g.toString());
                    PrintWriter printWriter = new PrintWriter(new C0362n0());
                    c0335a.m1137f("  ", printWriter, false);
                    printWriter.close();
                }
                this.f1887d.add(c0335a);
                i8++;
            }
        } else {
            this.f1887d = null;
        }
        this.f1892i.set(c0380z.f1928s);
        String str3 = c0380z.f1922X;
        if (str3 != null) {
            ComponentCallbacksC0361n m1291B = m1291B(str3);
            this.f1900q = m1291B;
            m1330q(m1291B);
        }
        ArrayList<String> arrayList2 = c0380z.f1923Y;
        if (arrayList2 != null) {
            while (i7 < arrayList2.size()) {
                Bundle bundle = c0380z.f1924Z.get(i7);
                bundle.setClassLoader(this.f1897n.f1870m.getClassLoader());
                this.f1893j.put(arrayList2.get(i7), bundle);
                i7++;
            }
        }
        this.f1906w = new ArrayDeque<>(c0380z.f1929w1);
    }

    /* renamed from: T */
    public final C0380z m1305T() {
        ArrayList<String> arrayList;
        int size;
        m1293D();
        Iterator it = m1319f().iterator();
        while (it.hasNext()) {
            ((AbstractC0368q0) it.next()).m1259e();
        }
        m1337x(true);
        this.f1908y = true;
        this.f1882F.f1636h = true;
        C0344e0 c0344e0 = this.f1886c;
        c0344e0.getClass();
        HashMap hashMap = (HashMap) c0344e0.f1680b;
        ArrayList<C0340c0> arrayList2 = new ArrayList<>(hashMap.size());
        for (C0342d0 c0342d0 : hashMap.values()) {
            if (c0342d0 != null) {
                ComponentCallbacksC0361n componentCallbacksC0361n = c0342d0.f1674c;
                C0340c0 c0340c0 = new C0340c0(componentCallbacksC0361n);
                if (componentCallbacksC0361n.f1804c <= -1 || c0340c0.f1655B1 != null) {
                    c0340c0.f1655B1 = componentCallbacksC0361n.f1807e;
                } else {
                    Bundle m1160o = c0342d0.m1160o();
                    c0340c0.f1655B1 = m1160o;
                    if (componentCallbacksC0361n.f1813x1 != null) {
                        if (m1160o == null) {
                            c0340c0.f1655B1 = new Bundle();
                        }
                        c0340c0.f1655B1.putString("android:target_state", componentCallbacksC0361n.f1813x1);
                        int i7 = componentCallbacksC0361n.f1814y1;
                        if (i7 != 0) {
                            c0340c0.f1655B1.putInt("android:target_req_state", i7);
                        }
                    }
                }
                arrayList2.add(c0340c0);
                if (m1285I(2)) {
                    Log.v("FragmentManager", "Saved state of " + componentCallbacksC0361n + ": " + c0340c0.f1655B1);
                }
            }
        }
        C0337b[] c0337bArr = null;
        if (arrayList2.isEmpty()) {
            if (m1285I(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        C0344e0 c0344e02 = this.f1886c;
        synchronized (((ArrayList) c0344e02.f1679a)) {
            if (((ArrayList) c0344e02.f1679a).isEmpty()) {
                arrayList = null;
            } else {
                arrayList = new ArrayList<>(((ArrayList) c0344e02.f1679a).size());
                Iterator it2 = ((ArrayList) c0344e02.f1679a).iterator();
                while (it2.hasNext()) {
                    ComponentCallbacksC0361n componentCallbacksC0361n2 = (ComponentCallbacksC0361n) it2.next();
                    arrayList.add(componentCallbacksC0361n2.f1798Y);
                    if (m1285I(2)) {
                        Log.v("FragmentManager", "saveAllState: adding fragment (" + componentCallbacksC0361n2.f1798Y + "): " + componentCallbacksC0361n2);
                    }
                }
            }
        }
        ArrayList<C0335a> arrayList3 = this.f1887d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            c0337bArr = new C0337b[size];
            for (int i8 = 0; i8 < size; i8++) {
                c0337bArr[i8] = new C0337b(this.f1887d.get(i8));
                if (m1285I(2)) {
                    StringBuilder m221g = C0090b.m221g("saveAllState: adding back stack #", i8, ": ");
                    m221g.append(this.f1887d.get(i8));
                    Log.v("FragmentManager", m221g.toString());
                }
            }
        }
        C0380z c0380z = new C0380z();
        c0380z.f1925c = arrayList2;
        c0380z.f1926e = arrayList;
        c0380z.f1927m = c0337bArr;
        c0380z.f1928s = this.f1892i.get();
        ComponentCallbacksC0361n componentCallbacksC0361n3 = this.f1900q;
        if (componentCallbacksC0361n3 != null) {
            c0380z.f1922X = componentCallbacksC0361n3.f1798Y;
        }
        c0380z.f1923Y.addAll(this.f1893j.keySet());
        c0380z.f1924Z.addAll(this.f1893j.values());
        c0380z.f1929w1 = new ArrayList<>(this.f1906w);
        return c0380z;
    }

    /* renamed from: U */
    public final void m1306U() {
        synchronized (this.f1884a) {
            boolean z6 = true;
            if (this.f1884a.size() != 1) {
                z6 = false;
            }
            if (z6) {
                this.f1897n.f1871s.removeCallbacks(this.f1883G);
                this.f1897n.f1871s.post(this.f1883G);
                m1316c0();
            }
        }
    }

    /* renamed from: V */
    public final void m1307V(ComponentCallbacksC0361n componentCallbacksC0361n, boolean z6) {
        ViewGroup m1294E = m1294E(componentCallbacksC0361n);
        if (m1294E == null || !(m1294E instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) m1294E).setDrawDisappearingViewsLast(!z6);
    }

    /* renamed from: W */
    public final void m1308W(ComponentCallbacksC0361n componentCallbacksC0361n, AbstractC0394f.b bVar) {
        if (componentCallbacksC0361n.equals(m1291B(componentCallbacksC0361n.f1798Y)) && (componentCallbacksC0361n.f1781I1 == null || componentCallbacksC0361n.f1780H1 == this)) {
            componentCallbacksC0361n.f1802a2 = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + componentCallbacksC0361n + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: X */
    public final void m1309X(ComponentCallbacksC0361n componentCallbacksC0361n) {
        if (componentCallbacksC0361n == null || (componentCallbacksC0361n.equals(m1291B(componentCallbacksC0361n.f1798Y)) && (componentCallbacksC0361n.f1781I1 == null || componentCallbacksC0361n.f1780H1 == this))) {
            ComponentCallbacksC0361n componentCallbacksC0361n2 = this.f1900q;
            this.f1900q = componentCallbacksC0361n;
            m1330q(componentCallbacksC0361n2);
            m1330q(this.f1900q);
            return;
        }
        throw new IllegalArgumentException("Fragment " + componentCallbacksC0361n + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: Y */
    public final void m1310Y(ComponentCallbacksC0361n componentCallbacksC0361n) {
        ViewGroup m1294E = m1294E(componentCallbacksC0361n);
        if (m1294E != null) {
            ComponentCallbacksC0361n.b bVar = componentCallbacksC0361n.f1797X1;
            if ((bVar == null ? 0 : bVar.f1821e) + (bVar == null ? 0 : bVar.f1820d) + (bVar == null ? 0 : bVar.f1819c) + (bVar == null ? 0 : bVar.f1818b) > 0) {
                int i7 = R$id.visible_removing_fragment_view_tag;
                if (m1294E.getTag(i7) == null) {
                    m1294E.setTag(i7, componentCallbacksC0361n);
                }
                ComponentCallbacksC0361n componentCallbacksC0361n2 = (ComponentCallbacksC0361n) m1294E.getTag(i7);
                ComponentCallbacksC0361n.b bVar2 = componentCallbacksC0361n.f1797X1;
                boolean z6 = bVar2 != null ? bVar2.f1817a : false;
                if (componentCallbacksC0361n2.f1797X1 == null) {
                    return;
                }
                componentCallbacksC0361n2.m1234e().f1817a = z6;
            }
        }
    }

    /* renamed from: a */
    public final C0342d0 m1311a(ComponentCallbacksC0361n componentCallbacksC0361n) {
        if (m1285I(2)) {
            Log.v("FragmentManager", "add: " + componentCallbacksC0361n);
        }
        C0342d0 m1320g = m1320g(componentCallbacksC0361n);
        componentCallbacksC0361n.f1780H1 = this;
        C0344e0 c0344e0 = this.f1886c;
        c0344e0.m1172i(m1320g);
        if (!componentCallbacksC0361n.f1788P1) {
            c0344e0.m1164a(componentCallbacksC0361n);
            componentCallbacksC0361n.f1774B1 = false;
            if (componentCallbacksC0361n.f1793U1 == null) {
                componentCallbacksC0361n.f1799Y1 = false;
            }
            if (m1286J(componentCallbacksC0361n)) {
                this.f1907x = true;
            }
        }
        return m1320g;
    }

    /* renamed from: a0 */
    public final void m1312a0() {
        Iterator it = this.f1886c.m1168e().iterator();
        while (it.hasNext()) {
            C0342d0 c0342d0 = (C0342d0) it.next();
            ComponentCallbacksC0361n componentCallbacksC0361n = c0342d0.f1674c;
            if (componentCallbacksC0361n.f1794V1) {
                if (this.f1885b) {
                    this.f1878B = true;
                } else {
                    componentCallbacksC0361n.f1794V1 = false;
                    c0342d0.m1156k();
                }
            }
        }
    }

    /* renamed from: b */
    public final void m1313b(InterfaceC0338b0 interfaceC0338b0) {
        this.f1895l.add(interfaceC0338b0);
    }

    /* renamed from: b0 */
    public final void m1314b0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C0362n0());
        AbstractC0375u<?> abstractC0375u = this.f1897n;
        try {
            if (abstractC0375u != null) {
                abstractC0375u.mo1253y(printWriter, new String[0]);
            } else {
                m1334u("  ", null, printWriter, new String[0]);
            }
            throw illegalStateException;
        } catch (Exception e7) {
            Log.e("FragmentManager", "Failed dumping state", e7);
            throw illegalStateException;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    @android.annotation.SuppressLint({"SyntheticAccessor"})
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1315c(androidx.fragment.app.AbstractC0375u<?> r3, androidx.activity.result.AbstractC0136c r4, androidx.fragment.app.ComponentCallbacksC0361n r5) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.AbstractC0378x.m1315c(androidx.fragment.app.u, androidx.activity.result.c, androidx.fragment.app.n):void");
    }

    /* renamed from: c0 */
    public final void m1316c0() {
        synchronized (this.f1884a) {
            try {
                if (!this.f1884a.isEmpty()) {
                    c cVar = this.f1891h;
                    cVar.f239a = true;
                    InterfaceC0655a<C2199c> interfaceC0655a = cVar.f241c;
                    if (interfaceC0655a != null) {
                        interfaceC0655a.mo373a();
                    }
                    return;
                }
                c cVar2 = this.f1891h;
                ArrayList<C0335a> arrayList = this.f1887d;
                cVar2.f239a = (arrayList != null ? arrayList.size() : 0) > 0 && m1288L(this.f1899p);
                InterfaceC0655a<C2199c> interfaceC0655a2 = cVar2.f241c;
                if (interfaceC0655a2 != null) {
                    interfaceC0655a2.mo373a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: d */
    public final void m1317d(ComponentCallbacksC0361n componentCallbacksC0361n) {
        if (m1285I(2)) {
            Log.v("FragmentManager", "attach: " + componentCallbacksC0361n);
        }
        if (componentCallbacksC0361n.f1788P1) {
            componentCallbacksC0361n.f1788P1 = false;
            if (componentCallbacksC0361n.f1773A1) {
                return;
            }
            this.f1886c.m1164a(componentCallbacksC0361n);
            if (m1285I(2)) {
                Log.v("FragmentManager", "add from attach: " + componentCallbacksC0361n);
            }
            if (m1286J(componentCallbacksC0361n)) {
                this.f1907x = true;
            }
        }
    }

    /* renamed from: e */
    public final void m1318e() {
        this.f1885b = false;
        this.f1880D.clear();
        this.f1879C.clear();
    }

    /* renamed from: f */
    public final HashSet m1319f() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f1886c.m1168e().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((C0342d0) it.next()).f1674c.f1792T1;
            if (viewGroup != null) {
                hashSet.add(AbstractC0368q0.m1255f(viewGroup, m1296G()));
            }
        }
        return hashSet;
    }

    /* renamed from: g */
    public final C0342d0 m1320g(ComponentCallbacksC0361n componentCallbacksC0361n) {
        String str = componentCallbacksC0361n.f1798Y;
        C0344e0 c0344e0 = this.f1886c;
        C0342d0 m1170g = c0344e0.m1170g(str);
        if (m1170g != null) {
            return m1170g;
        }
        C0342d0 c0342d0 = new C0342d0(this.f1894k, c0344e0, componentCallbacksC0361n);
        c0342d0.m1158m(this.f1897n.f1870m.getClassLoader());
        c0342d0.f1676e = this.f1896m;
        return c0342d0;
    }

    /* renamed from: h */
    public final void m1321h(ComponentCallbacksC0361n componentCallbacksC0361n) {
        if (m1285I(2)) {
            Log.v("FragmentManager", "detach: " + componentCallbacksC0361n);
        }
        if (componentCallbacksC0361n.f1788P1) {
            return;
        }
        componentCallbacksC0361n.f1788P1 = true;
        if (componentCallbacksC0361n.f1773A1) {
            if (m1285I(2)) {
                Log.v("FragmentManager", "remove from detach: " + componentCallbacksC0361n);
            }
            C0344e0 c0344e0 = this.f1886c;
            synchronized (((ArrayList) c0344e0.f1679a)) {
                ((ArrayList) c0344e0.f1679a).remove(componentCallbacksC0361n);
            }
            componentCallbacksC0361n.f1773A1 = false;
            if (m1286J(componentCallbacksC0361n)) {
                this.f1907x = true;
            }
            m1310Y(componentCallbacksC0361n);
        }
    }

    /* renamed from: i */
    public final void m1322i(Configuration configuration) {
        for (ComponentCallbacksC0361n componentCallbacksC0361n : this.f1886c.m1171h()) {
            if (componentCallbacksC0361n != null) {
                componentCallbacksC0361n.onConfigurationChanged(configuration);
                componentCallbacksC0361n.f1782J1.m1322i(configuration);
            }
        }
    }

    /* renamed from: j */
    public final boolean m1323j() {
        if (this.f1896m < 1) {
            return false;
        }
        for (ComponentCallbacksC0361n componentCallbacksC0361n : this.f1886c.m1171h()) {
            if (componentCallbacksC0361n != null) {
                if (!componentCallbacksC0361n.f1787O1 ? componentCallbacksC0361n.f1782J1.m1323j() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: k */
    public final boolean m1324k() {
        if (this.f1896m < 1) {
            return false;
        }
        ArrayList<ComponentCallbacksC0361n> arrayList = null;
        boolean z6 = false;
        for (ComponentCallbacksC0361n componentCallbacksC0361n : this.f1886c.m1171h()) {
            if (componentCallbacksC0361n != null && m1287K(componentCallbacksC0361n)) {
                if (!componentCallbacksC0361n.f1787O1 ? componentCallbacksC0361n.f1782J1.m1324k() | false : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(componentCallbacksC0361n);
                    z6 = true;
                }
            }
        }
        if (this.f1888e != null) {
            for (int i7 = 0; i7 < this.f1888e.size(); i7++) {
                ComponentCallbacksC0361n componentCallbacksC0361n2 = this.f1888e.get(i7);
                if (arrayList == null || !arrayList.contains(componentCallbacksC0361n2)) {
                    componentCallbacksC0361n2.getClass();
                }
            }
        }
        this.f1888e = arrayList;
        return z6;
    }

    /* renamed from: l */
    public final void m1325l() {
        Integer num;
        Integer num2;
        Integer num3;
        this.f1877A = true;
        m1337x(true);
        Iterator it = m1319f().iterator();
        while (it.hasNext()) {
            ((AbstractC0368q0) it.next()).m1259e();
        }
        m1333t(-1);
        this.f1897n = null;
        this.f1898o = null;
        this.f1899p = null;
        if (this.f1890g != null) {
            Iterator<InterfaceC0118c> it2 = this.f1891h.f240b.iterator();
            while (it2.hasNext()) {
                it2.next().cancel();
            }
            this.f1890g = null;
        }
        C0137d c0137d = this.f1903t;
        if (c0137d != null) {
            AbstractC0138e abstractC0138e = c0137d.f252m;
            ArrayList<String> arrayList = abstractC0138e.f256d;
            String str = c0137d.f251e;
            if (!arrayList.contains(str) && (num3 = (Integer) abstractC0138e.f254b.remove(str)) != null) {
                abstractC0138e.f253a.remove(num3);
            }
            abstractC0138e.f257e.remove(str);
            HashMap hashMap = abstractC0138e.f258f;
            if (hashMap.containsKey(str)) {
                StringBuilder m222h = C0090b.m222h("Dropping pending result for request ", str, ": ");
                m222h.append(hashMap.get(str));
                Log.w("ActivityResultRegistry", m222h.toString());
                hashMap.remove(str);
            }
            Bundle bundle = abstractC0138e.f259g;
            if (bundle.containsKey(str)) {
                StringBuilder m222h2 = C0090b.m222h("Dropping pending result for request ", str, ": ");
                m222h2.append(bundle.getParcelable(str));
                Log.w("ActivityResultRegistry", m222h2.toString());
                bundle.remove(str);
            }
            if (((AbstractC0138e.b) abstractC0138e.f255c.get(str)) != null) {
                throw null;
            }
            C0137d c0137d2 = this.f1904u;
            AbstractC0138e abstractC0138e2 = c0137d2.f252m;
            ArrayList<String> arrayList2 = abstractC0138e2.f256d;
            String str2 = c0137d2.f251e;
            if (!arrayList2.contains(str2) && (num2 = (Integer) abstractC0138e2.f254b.remove(str2)) != null) {
                abstractC0138e2.f253a.remove(num2);
            }
            abstractC0138e2.f257e.remove(str2);
            HashMap hashMap2 = abstractC0138e2.f258f;
            if (hashMap2.containsKey(str2)) {
                StringBuilder m222h3 = C0090b.m222h("Dropping pending result for request ", str2, ": ");
                m222h3.append(hashMap2.get(str2));
                Log.w("ActivityResultRegistry", m222h3.toString());
                hashMap2.remove(str2);
            }
            Bundle bundle2 = abstractC0138e2.f259g;
            if (bundle2.containsKey(str2)) {
                StringBuilder m222h4 = C0090b.m222h("Dropping pending result for request ", str2, ": ");
                m222h4.append(bundle2.getParcelable(str2));
                Log.w("ActivityResultRegistry", m222h4.toString());
                bundle2.remove(str2);
            }
            if (((AbstractC0138e.b) abstractC0138e2.f255c.get(str2)) != null) {
                throw null;
            }
            C0137d c0137d3 = this.f1905v;
            AbstractC0138e abstractC0138e3 = c0137d3.f252m;
            ArrayList<String> arrayList3 = abstractC0138e3.f256d;
            String str3 = c0137d3.f251e;
            if (!arrayList3.contains(str3) && (num = (Integer) abstractC0138e3.f254b.remove(str3)) != null) {
                abstractC0138e3.f253a.remove(num);
            }
            abstractC0138e3.f257e.remove(str3);
            HashMap hashMap3 = abstractC0138e3.f258f;
            if (hashMap3.containsKey(str3)) {
                StringBuilder m222h5 = C0090b.m222h("Dropping pending result for request ", str3, ": ");
                m222h5.append(hashMap3.get(str3));
                Log.w("ActivityResultRegistry", m222h5.toString());
                hashMap3.remove(str3);
            }
            Bundle bundle3 = abstractC0138e3.f259g;
            if (bundle3.containsKey(str3)) {
                StringBuilder m222h6 = C0090b.m222h("Dropping pending result for request ", str3, ": ");
                m222h6.append(bundle3.getParcelable(str3));
                Log.w("ActivityResultRegistry", m222h6.toString());
                bundle3.remove(str3);
            }
            if (((AbstractC0138e.b) abstractC0138e3.f255c.get(str3)) != null) {
                throw null;
            }
        }
    }

    /* renamed from: m */
    public final void m1326m() {
        for (ComponentCallbacksC0361n componentCallbacksC0361n : this.f1886c.m1171h()) {
            if (componentCallbacksC0361n != null) {
                componentCallbacksC0361n.m1224E();
            }
        }
    }

    /* renamed from: n */
    public final void m1327n(boolean z6) {
        for (ComponentCallbacksC0361n componentCallbacksC0361n : this.f1886c.m1171h()) {
            if (componentCallbacksC0361n != null) {
                componentCallbacksC0361n.m1225F(z6);
            }
        }
    }

    /* renamed from: o */
    public final boolean m1328o() {
        if (this.f1896m < 1) {
            return false;
        }
        for (ComponentCallbacksC0361n componentCallbacksC0361n : this.f1886c.m1171h()) {
            if (componentCallbacksC0361n != null) {
                if (!componentCallbacksC0361n.f1787O1 ? componentCallbacksC0361n.f1782J1.m1328o() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: p */
    public final void m1329p() {
        if (this.f1896m < 1) {
            return;
        }
        for (ComponentCallbacksC0361n componentCallbacksC0361n : this.f1886c.m1171h()) {
            if (componentCallbacksC0361n != null && !componentCallbacksC0361n.f1787O1) {
                componentCallbacksC0361n.f1782J1.m1329p();
            }
        }
    }

    /* renamed from: q */
    public final void m1330q(ComponentCallbacksC0361n componentCallbacksC0361n) {
        if (componentCallbacksC0361n == null || !componentCallbacksC0361n.equals(m1291B(componentCallbacksC0361n.f1798Y))) {
            return;
        }
        componentCallbacksC0361n.f1780H1.getClass();
        boolean m1288L = m1288L(componentCallbacksC0361n);
        Boolean bool = componentCallbacksC0361n.f1815z1;
        if (bool == null || bool.booleanValue() != m1288L) {
            componentCallbacksC0361n.f1815z1 = Boolean.valueOf(m1288L);
            C0379y c0379y = componentCallbacksC0361n.f1782J1;
            c0379y.m1316c0();
            c0379y.m1330q(c0379y.f1900q);
        }
    }

    /* renamed from: r */
    public final void m1331r(boolean z6) {
        for (ComponentCallbacksC0361n componentCallbacksC0361n : this.f1886c.m1171h()) {
            if (componentCallbacksC0361n != null) {
                componentCallbacksC0361n.m1226G(z6);
            }
        }
    }

    /* renamed from: s */
    public final boolean m1332s() {
        boolean z6 = false;
        if (this.f1896m < 1) {
            return false;
        }
        for (ComponentCallbacksC0361n componentCallbacksC0361n : this.f1886c.m1171h()) {
            if (componentCallbacksC0361n != null && m1287K(componentCallbacksC0361n) && componentCallbacksC0361n.m1227H()) {
                z6 = true;
            }
        }
        return z6;
    }

    /* renamed from: t */
    public final void m1333t(int i7) {
        try {
            this.f1885b = true;
            for (C0342d0 c0342d0 : ((HashMap) this.f1886c.f1680b).values()) {
                if (c0342d0 != null) {
                    c0342d0.f1676e = i7;
                }
            }
            m1298M(i7, false);
            Iterator it = m1319f().iterator();
            while (it.hasNext()) {
                ((AbstractC0368q0) it.next()).m1259e();
            }
            this.f1885b = false;
            m1337x(true);
        } catch (Throwable th) {
            this.f1885b = false;
            throw th;
        }
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder(Tools.Semaphore.f159S7);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        ComponentCallbacksC0361n componentCallbacksC0361n = this.f1899p;
        if (componentCallbacksC0361n != null) {
            sb.append(componentCallbacksC0361n.getClass().getSimpleName());
            sb.append("{");
            obj = this.f1899p;
        } else {
            AbstractC0375u<?> abstractC0375u = this.f1897n;
            if (abstractC0375u == null) {
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            }
            sb.append(abstractC0375u.getClass().getSimpleName());
            sb.append("{");
            obj = this.f1897n;
        }
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
        sb.append("}");
        sb.append("}}");
        return sb.toString();
    }

    /* renamed from: u */
    public final void m1334u(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2;
        String m210h = C0089a.m210h(str, "    ");
        C0344e0 c0344e0 = this.f1886c;
        c0344e0.getClass();
        String str3 = str + "    ";
        HashMap hashMap = (HashMap) c0344e0.f1680b;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C0342d0 c0342d0 : hashMap.values()) {
                printWriter.print(str);
                if (c0342d0 != null) {
                    ComponentCallbacksC0361n componentCallbacksC0361n = c0342d0.f1674c;
                    printWriter.println(componentCallbacksC0361n);
                    componentCallbacksC0361n.getClass();
                    printWriter.print(str3);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(componentCallbacksC0361n.f1784L1));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(componentCallbacksC0361n.f1785M1));
                    printWriter.print(" mTag=");
                    printWriter.println(componentCallbacksC0361n.f1786N1);
                    printWriter.print(str3);
                    printWriter.print("mState=");
                    printWriter.print(componentCallbacksC0361n.f1804c);
                    printWriter.print(" mWho=");
                    printWriter.print(componentCallbacksC0361n.f1798Y);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(componentCallbacksC0361n.f1779G1);
                    printWriter.print(str3);
                    printWriter.print("mAdded=");
                    printWriter.print(componentCallbacksC0361n.f1773A1);
                    printWriter.print(" mRemoving=");
                    printWriter.print(componentCallbacksC0361n.f1774B1);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(componentCallbacksC0361n.f1775C1);
                    printWriter.print(" mInLayout=");
                    printWriter.println(componentCallbacksC0361n.f1776D1);
                    printWriter.print(str3);
                    printWriter.print("mHidden=");
                    printWriter.print(componentCallbacksC0361n.f1787O1);
                    printWriter.print(" mDetached=");
                    printWriter.print(componentCallbacksC0361n.f1788P1);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(componentCallbacksC0361n.f1790R1);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(str3);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(componentCallbacksC0361n.f1789Q1);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(componentCallbacksC0361n.f1795W1);
                    if (componentCallbacksC0361n.f1780H1 != null) {
                        printWriter.print(str3);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(componentCallbacksC0361n.f1780H1);
                    }
                    if (componentCallbacksC0361n.f1781I1 != null) {
                        printWriter.print(str3);
                        printWriter.print("mHost=");
                        printWriter.println(componentCallbacksC0361n.f1781I1);
                    }
                    if (componentCallbacksC0361n.f1783K1 != null) {
                        printWriter.print(str3);
                        printWriter.print("mParentFragment=");
                        printWriter.println(componentCallbacksC0361n.f1783K1);
                    }
                    if (componentCallbacksC0361n.f1800Z != null) {
                        printWriter.print(str3);
                        printWriter.print("mArguments=");
                        printWriter.println(componentCallbacksC0361n.f1800Z);
                    }
                    if (componentCallbacksC0361n.f1807e != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(componentCallbacksC0361n.f1807e);
                    }
                    if (componentCallbacksC0361n.f1810m != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(componentCallbacksC0361n.f1810m);
                    }
                    if (componentCallbacksC0361n.f1811s != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(componentCallbacksC0361n.f1811s);
                    }
                    Object obj = componentCallbacksC0361n.f1812w1;
                    if (obj == null) {
                        AbstractC0378x abstractC0378x = componentCallbacksC0361n.f1780H1;
                        obj = (abstractC0378x == null || (str2 = componentCallbacksC0361n.f1813x1) == null) ? null : abstractC0378x.m1291B(str2);
                    }
                    if (obj != null) {
                        printWriter.print(str3);
                        printWriter.print("mTarget=");
                        printWriter.print(obj);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(componentCallbacksC0361n.f1814y1);
                    }
                    printWriter.print(str3);
                    printWriter.print("mPopDirection=");
                    ComponentCallbacksC0361n.b bVar = componentCallbacksC0361n.f1797X1;
                    printWriter.println(bVar == null ? false : bVar.f1817a);
                    ComponentCallbacksC0361n.b bVar2 = componentCallbacksC0361n.f1797X1;
                    if ((bVar2 == null ? 0 : bVar2.f1818b) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getEnterAnim=");
                        ComponentCallbacksC0361n.b bVar3 = componentCallbacksC0361n.f1797X1;
                        printWriter.println(bVar3 == null ? 0 : bVar3.f1818b);
                    }
                    ComponentCallbacksC0361n.b bVar4 = componentCallbacksC0361n.f1797X1;
                    if ((bVar4 == null ? 0 : bVar4.f1819c) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getExitAnim=");
                        ComponentCallbacksC0361n.b bVar5 = componentCallbacksC0361n.f1797X1;
                        printWriter.println(bVar5 == null ? 0 : bVar5.f1819c);
                    }
                    ComponentCallbacksC0361n.b bVar6 = componentCallbacksC0361n.f1797X1;
                    if ((bVar6 == null ? 0 : bVar6.f1820d) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopEnterAnim=");
                        ComponentCallbacksC0361n.b bVar7 = componentCallbacksC0361n.f1797X1;
                        printWriter.println(bVar7 == null ? 0 : bVar7.f1820d);
                    }
                    ComponentCallbacksC0361n.b bVar8 = componentCallbacksC0361n.f1797X1;
                    if ((bVar8 == null ? 0 : bVar8.f1821e) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopExitAnim=");
                        ComponentCallbacksC0361n.b bVar9 = componentCallbacksC0361n.f1797X1;
                        printWriter.println(bVar9 == null ? 0 : bVar9.f1821e);
                    }
                    if (componentCallbacksC0361n.f1792T1 != null) {
                        printWriter.print(str3);
                        printWriter.print("mContainer=");
                        printWriter.println(componentCallbacksC0361n.f1792T1);
                    }
                    if (componentCallbacksC0361n.f1793U1 != null) {
                        printWriter.print(str3);
                        printWriter.print("mView=");
                        printWriter.println(componentCallbacksC0361n.f1793U1);
                    }
                    ComponentCallbacksC0361n.b bVar10 = componentCallbacksC0361n.f1797X1;
                    if (bVar10 != null) {
                        bVar10.getClass();
                    }
                    if (componentCallbacksC0361n.m1237i() != null) {
                        new C1820a(componentCallbacksC0361n, componentCallbacksC0361n.mo353k()).m4298y(str3, printWriter);
                    }
                    printWriter.print(str3);
                    printWriter.println("Child " + componentCallbacksC0361n.f1782J1 + ":");
                    componentCallbacksC0361n.f1782J1.m1334u(C0089a.m210h(str3, "  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = (ArrayList) c0344e0.f1679a;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i7 = 0; i7 < size3; i7++) {
                ComponentCallbacksC0361n componentCallbacksC0361n2 = (ComponentCallbacksC0361n) arrayList.get(i7);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i7);
                printWriter.print(": ");
                printWriter.println(componentCallbacksC0361n2.toString());
            }
        }
        ArrayList<ComponentCallbacksC0361n> arrayList2 = this.f1888e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i8 = 0; i8 < size2; i8++) {
                ComponentCallbacksC0361n componentCallbacksC0361n3 = this.f1888e.get(i8);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i8);
                printWriter.print(": ");
                printWriter.println(componentCallbacksC0361n3.toString());
            }
        }
        ArrayList<C0335a> arrayList3 = this.f1887d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i9 = 0; i9 < size; i9++) {
                C0335a c0335a = this.f1887d.get(i9);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i9);
                printWriter.print(": ");
                printWriter.println(c0335a.toString());
                c0335a.m1137f(m210h, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f1892i.get());
        synchronized (this.f1884a) {
            int size4 = this.f1884a.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i10 = 0; i10 < size4; i10++) {
                    Object obj2 = (l) this.f1884a.get(i10);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i10);
                    printWriter.print(": ");
                    printWriter.println(obj2);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f1897n);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f1898o);
        if (this.f1899p != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f1899p);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f1896m);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f1908y);
        printWriter.print(" mStopped=");
        printWriter.print(this.f1909z);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f1877A);
        if (this.f1907x) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f1907x);
        }
    }

    /* renamed from: v */
    public final void m1335v(l lVar, boolean z6) {
        if (!z6) {
            if (this.f1897n == null) {
                if (!this.f1877A) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.f1908y || this.f1909z) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f1884a) {
            if (this.f1897n == null) {
                if (!z6) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } else {
                this.f1884a.add(lVar);
                m1306U();
            }
        }
    }

    /* renamed from: w */
    public final void m1336w(boolean z6) {
        if (this.f1885b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f1897n == null) {
            if (!this.f1877A) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f1897n.f1871s.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z6) {
            if (this.f1908y || this.f1909z) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        if (this.f1879C == null) {
            this.f1879C = new ArrayList<>();
            this.f1880D = new ArrayList<>();
        }
        this.f1885b = false;
    }

    /* renamed from: x */
    public final boolean m1337x(boolean z6) {
        boolean z7;
        m1336w(z6);
        boolean z8 = false;
        while (true) {
            ArrayList<C0335a> arrayList = this.f1879C;
            ArrayList<Boolean> arrayList2 = this.f1880D;
            synchronized (this.f1884a) {
                if (this.f1884a.isEmpty()) {
                    z7 = false;
                } else {
                    int size = this.f1884a.size();
                    z7 = false;
                    for (int i7 = 0; i7 < size; i7++) {
                        z7 |= this.f1884a.get(i7).mo1133a(arrayList, arrayList2);
                    }
                    this.f1884a.clear();
                    this.f1897n.f1871s.removeCallbacks(this.f1883G);
                }
            }
            if (!z7) {
                break;
            }
            z8 = true;
            this.f1885b = true;
            try {
                m1303R(this.f1879C, this.f1880D);
            } finally {
                m1318e();
            }
        }
        m1316c0();
        if (this.f1878B) {
            this.f1878B = false;
            m1312a0();
        }
        this.f1886c.m1165b();
        return z8;
    }

    /* renamed from: y */
    public final void m1338y(l lVar, boolean z6) {
        if (z6 && (this.f1897n == null || this.f1877A)) {
            return;
        }
        m1336w(z6);
        if (lVar.mo1133a(this.f1879C, this.f1880D)) {
            this.f1885b = true;
            try {
                m1303R(this.f1879C, this.f1880D);
            } finally {
                m1318e();
            }
        }
        m1316c0();
        if (this.f1878B) {
            this.f1878B = false;
            m1312a0();
        }
        this.f1886c.m1165b();
    }

    /* renamed from: z */
    public final void m1339z(ArrayList<C0335a> arrayList, ArrayList<Boolean> arrayList2, int i7, int i8) {
        ViewGroup viewGroup;
        C0344e0 c0344e0;
        C0344e0 c0344e02;
        C0344e0 c0344e03;
        int i9;
        ArrayList<C0335a> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        boolean z6 = arrayList3.get(i7).f1700o;
        ArrayList<ComponentCallbacksC0361n> arrayList5 = this.f1881E;
        if (arrayList5 == null) {
            this.f1881E = new ArrayList<>();
        } else {
            arrayList5.clear();
        }
        ArrayList<ComponentCallbacksC0361n> arrayList6 = this.f1881E;
        C0344e0 c0344e04 = this.f1886c;
        arrayList6.addAll(c0344e04.m1171h());
        ComponentCallbacksC0361n componentCallbacksC0361n = this.f1900q;
        int i10 = i7;
        boolean z7 = false;
        while (true) {
            int i11 = 1;
            if (i10 >= i8) {
                C0344e0 c0344e05 = c0344e04;
                this.f1881E.clear();
                if (!z6 && this.f1896m >= 1) {
                    for (int i12 = i7; i12 < i8; i12++) {
                        Iterator<AbstractC0346f0.a> it = arrayList.get(i12).f1686a.iterator();
                        while (it.hasNext()) {
                            ComponentCallbacksC0361n componentCallbacksC0361n2 = it.next().f1702b;
                            if (componentCallbacksC0361n2 == null || componentCallbacksC0361n2.f1780H1 == null) {
                                c0344e0 = c0344e05;
                            } else {
                                c0344e0 = c0344e05;
                                c0344e0.m1172i(m1320g(componentCallbacksC0361n2));
                            }
                            c0344e05 = c0344e0;
                        }
                    }
                }
                for (int i13 = i7; i13 < i8; i13++) {
                    C0335a c0335a = arrayList.get(i13);
                    if (arrayList2.get(i13).booleanValue()) {
                        c0335a.m1134c(-1);
                        c0335a.m1139h();
                    } else {
                        c0335a.m1134c(1);
                        c0335a.m1138g();
                    }
                }
                boolean booleanValue = arrayList2.get(i8 - 1).booleanValue();
                for (int i14 = i7; i14 < i8; i14++) {
                    C0335a c0335a2 = arrayList.get(i14);
                    if (booleanValue) {
                        for (int size = c0335a2.f1686a.size() - 1; size >= 0; size--) {
                            ComponentCallbacksC0361n componentCallbacksC0361n3 = c0335a2.f1686a.get(size).f1702b;
                            if (componentCallbacksC0361n3 != null) {
                                m1320g(componentCallbacksC0361n3).m1156k();
                            }
                        }
                    } else {
                        Iterator<AbstractC0346f0.a> it2 = c0335a2.f1686a.iterator();
                        while (it2.hasNext()) {
                            ComponentCallbacksC0361n componentCallbacksC0361n4 = it2.next().f1702b;
                            if (componentCallbacksC0361n4 != null) {
                                m1320g(componentCallbacksC0361n4).m1156k();
                            }
                        }
                    }
                }
                m1298M(this.f1896m, true);
                HashSet hashSet = new HashSet();
                for (int i15 = i7; i15 < i8; i15++) {
                    Iterator<AbstractC0346f0.a> it3 = arrayList.get(i15).f1686a.iterator();
                    while (it3.hasNext()) {
                        ComponentCallbacksC0361n componentCallbacksC0361n5 = it3.next().f1702b;
                        if (componentCallbacksC0361n5 != null && (viewGroup = componentCallbacksC0361n5.f1792T1) != null) {
                            hashSet.add(AbstractC0368q0.m1255f(viewGroup, m1296G()));
                        }
                    }
                }
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    AbstractC0368q0 abstractC0368q0 = (AbstractC0368q0) it4.next();
                    abstractC0368q0.f1848d = booleanValue;
                    abstractC0368q0.m1260g();
                    abstractC0368q0.m1257c();
                }
                for (int i16 = i7; i16 < i8; i16++) {
                    C0335a c0335a3 = arrayList.get(i16);
                    if (arrayList2.get(i16).booleanValue() && c0335a3.f1629r >= 0) {
                        c0335a3.f1629r = -1;
                    }
                    c0335a3.getClass();
                }
                return;
            }
            C0335a c0335a4 = arrayList3.get(i10);
            if (arrayList4.get(i10).booleanValue()) {
                c0344e02 = c0344e04;
                int i17 = 1;
                ArrayList<ComponentCallbacksC0361n> arrayList7 = this.f1881E;
                ArrayList<AbstractC0346f0.a> arrayList8 = c0335a4.f1686a;
                int size2 = arrayList8.size() - 1;
                while (size2 >= 0) {
                    AbstractC0346f0.a aVar = arrayList8.get(size2);
                    int i18 = aVar.f1701a;
                    if (i18 != i17) {
                        if (i18 != 3) {
                            switch (i18) {
                                case 8:
                                    componentCallbacksC0361n = null;
                                    break;
                                case 9:
                                    componentCallbacksC0361n = aVar.f1702b;
                                    break;
                                case 10:
                                    aVar.f1708h = aVar.f1707g;
                                    break;
                            }
                            size2--;
                            i17 = 1;
                        }
                        arrayList7.add(aVar.f1702b);
                        size2--;
                        i17 = 1;
                    }
                    arrayList7.remove(aVar.f1702b);
                    size2--;
                    i17 = 1;
                }
            } else {
                ArrayList<ComponentCallbacksC0361n> arrayList9 = this.f1881E;
                int i19 = 0;
                while (true) {
                    ArrayList<AbstractC0346f0.a> arrayList10 = c0335a4.f1686a;
                    if (i19 < arrayList10.size()) {
                        AbstractC0346f0.a aVar2 = arrayList10.get(i19);
                        int i20 = aVar2.f1701a;
                        if (i20 != i11) {
                            if (i20 != 2) {
                                if (i20 == 3 || i20 == 6) {
                                    arrayList9.remove(aVar2.f1702b);
                                    ComponentCallbacksC0361n componentCallbacksC0361n6 = aVar2.f1702b;
                                    if (componentCallbacksC0361n6 == componentCallbacksC0361n) {
                                        arrayList10.add(i19, new AbstractC0346f0.a(9, componentCallbacksC0361n6));
                                        i19++;
                                        c0344e03 = c0344e04;
                                        i9 = 1;
                                        componentCallbacksC0361n = null;
                                    }
                                } else if (i20 != 7) {
                                    if (i20 == 8) {
                                        arrayList10.add(i19, new AbstractC0346f0.a(9, componentCallbacksC0361n));
                                        i19++;
                                        componentCallbacksC0361n = aVar2.f1702b;
                                    }
                                }
                                c0344e03 = c0344e04;
                                i9 = 1;
                            } else {
                                ComponentCallbacksC0361n componentCallbacksC0361n7 = aVar2.f1702b;
                                int i21 = componentCallbacksC0361n7.f1785M1;
                                int size3 = arrayList9.size() - 1;
                                boolean z8 = false;
                                while (size3 >= 0) {
                                    C0344e0 c0344e06 = c0344e04;
                                    ComponentCallbacksC0361n componentCallbacksC0361n8 = arrayList9.get(size3);
                                    if (componentCallbacksC0361n8.f1785M1 == i21) {
                                        if (componentCallbacksC0361n8 == componentCallbacksC0361n7) {
                                            z8 = true;
                                        } else {
                                            if (componentCallbacksC0361n8 == componentCallbacksC0361n) {
                                                arrayList10.add(i19, new AbstractC0346f0.a(9, componentCallbacksC0361n8));
                                                i19++;
                                                componentCallbacksC0361n = null;
                                            }
                                            AbstractC0346f0.a aVar3 = new AbstractC0346f0.a(3, componentCallbacksC0361n8);
                                            aVar3.f1703c = aVar2.f1703c;
                                            aVar3.f1705e = aVar2.f1705e;
                                            aVar3.f1704d = aVar2.f1704d;
                                            aVar3.f1706f = aVar2.f1706f;
                                            arrayList10.add(i19, aVar3);
                                            arrayList9.remove(componentCallbacksC0361n8);
                                            i19++;
                                            componentCallbacksC0361n = componentCallbacksC0361n;
                                        }
                                    }
                                    size3--;
                                    c0344e04 = c0344e06;
                                }
                                c0344e03 = c0344e04;
                                i9 = 1;
                                if (z8) {
                                    arrayList10.remove(i19);
                                    i19--;
                                } else {
                                    aVar2.f1701a = 1;
                                    arrayList9.add(componentCallbacksC0361n7);
                                }
                            }
                            i19 += i9;
                            c0344e04 = c0344e03;
                            i11 = 1;
                        }
                        c0344e03 = c0344e04;
                        i9 = 1;
                        arrayList9.add(aVar2.f1702b);
                        i19 += i9;
                        c0344e04 = c0344e03;
                        i11 = 1;
                    } else {
                        c0344e02 = c0344e04;
                    }
                }
            }
            z7 = z7 || c0335a4.f1692g;
            i10++;
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
            c0344e04 = c0344e02;
        }
    }
}
