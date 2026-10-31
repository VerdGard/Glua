package androidx.fragment.app;

import android.ext.Tools;
import android.util.Log;
import androidx.fragment.app.AbstractC0346f0;
import androidx.fragment.app.AbstractC0378x;
import androidx.fragment.app.ComponentCallbacksC0361n;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.a */
/* loaded from: classes.dex */
public final class C0335a extends AbstractC0346f0 implements AbstractC0378x.l {

    /* renamed from: p */
    public final AbstractC0378x f1627p;

    /* renamed from: q */
    public boolean f1628q;

    /* renamed from: r */
    public int f1629r;

    public C0335a(AbstractC0378x abstractC0378x) {
        abstractC0378x.m1295F();
        AbstractC0375u<?> abstractC0375u = abstractC0378x.f1897n;
        if (abstractC0375u != null) {
            abstractC0375u.f1870m.getClassLoader();
        }
        this.f1629r = -1;
        this.f1627p = abstractC0378x;
    }

    @Override // androidx.fragment.app.AbstractC0378x.l
    /* renamed from: a */
    public final boolean mo1133a(ArrayList<C0335a> arrayList, ArrayList<Boolean> arrayList2) {
        if (AbstractC0378x.m1285I(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f1692g) {
            return true;
        }
        AbstractC0378x abstractC0378x = this.f1627p;
        if (abstractC0378x.f1887d == null) {
            abstractC0378x.f1887d = new ArrayList<>();
        }
        abstractC0378x.f1887d.add(this);
        return true;
    }

    /* renamed from: c */
    public final void m1134c(int i7) {
        if (this.f1692g) {
            if (AbstractC0378x.m1285I(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i7);
            }
            ArrayList<AbstractC0346f0.a> arrayList = this.f1686a;
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                AbstractC0346f0.a aVar = arrayList.get(i8);
                ComponentCallbacksC0361n componentCallbacksC0361n = aVar.f1702b;
                if (componentCallbacksC0361n != null) {
                    componentCallbacksC0361n.f1779G1 += i7;
                    if (AbstractC0378x.m1285I(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f1702b + " to " + aVar.f1702b.f1779G1);
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public final int m1135d(boolean z6) {
        if (this.f1628q) {
            throw new IllegalStateException("commit already called");
        }
        if (AbstractC0378x.m1285I(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new C0362n0());
            m1137f("  ", printWriter, true);
            printWriter.close();
        }
        this.f1628q = true;
        boolean z7 = this.f1692g;
        AbstractC0378x abstractC0378x = this.f1627p;
        this.f1629r = z7 ? abstractC0378x.f1892i.getAndIncrement() : -1;
        abstractC0378x.m1335v(this, z6);
        return this.f1629r;
    }

    /* renamed from: e */
    public final void m1136e(int i7, ComponentCallbacksC0361n componentCallbacksC0361n, String str, int i8) {
        Class<?> cls = componentCallbacksC0361n.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = componentCallbacksC0361n.f1786N1;
            if (str2 != null && !str.equals(str2)) {
                throw new IllegalStateException("Can't change tag of fragment " + componentCallbacksC0361n + ": was " + componentCallbacksC0361n.f1786N1 + " now " + str);
            }
            componentCallbacksC0361n.f1786N1 = str;
        }
        if (i7 != 0) {
            if (i7 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + componentCallbacksC0361n + " with tag " + str + " to container view with no id");
            }
            int i9 = componentCallbacksC0361n.f1784L1;
            if (i9 != 0 && i9 != i7) {
                throw new IllegalStateException("Can't change container ID of fragment " + componentCallbacksC0361n + ": was " + componentCallbacksC0361n.f1784L1 + " now " + i7);
            }
            componentCallbacksC0361n.f1784L1 = i7;
            componentCallbacksC0361n.f1785M1 = i7;
        }
        m1174b(new AbstractC0346f0.a(i8, componentCallbacksC0361n));
        componentCallbacksC0361n.f1780H1 = this.f1627p;
    }

    /* renamed from: f */
    public final void m1137f(String str, PrintWriter printWriter, boolean z6) {
        String str2;
        if (z6) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f1693h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f1629r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1628q);
            if (this.f1691f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f1691f));
            }
            if (this.f1687b != 0 || this.f1688c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1687b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1688c));
            }
            if (this.f1689d != 0 || this.f1690e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1689d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1690e));
            }
            if (this.f1694i != 0 || this.f1695j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1694i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f1695j);
            }
            if (this.f1696k != 0 || this.f1697l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1696k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f1697l);
            }
        }
        ArrayList<AbstractC0346f0.a> arrayList = this.f1686a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            AbstractC0346f0.a aVar = arrayList.get(i7);
            switch (aVar.f1701a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f1701a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i7);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f1702b);
            if (z6) {
                if (aVar.f1703c != 0 || aVar.f1704d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f1703c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f1704d));
                }
                if (aVar.f1705e != 0 || aVar.f1706f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f1705e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f1706f));
                }
            }
        }
    }

    /* renamed from: g */
    public final void m1138g() {
        ArrayList<AbstractC0346f0.a> arrayList = this.f1686a;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            AbstractC0346f0.a aVar = arrayList.get(i7);
            ComponentCallbacksC0361n componentCallbacksC0361n = aVar.f1702b;
            if (componentCallbacksC0361n != null) {
                if (componentCallbacksC0361n.f1797X1 != null) {
                    componentCallbacksC0361n.m1234e().f1817a = false;
                }
                int i8 = this.f1691f;
                if (componentCallbacksC0361n.f1797X1 != null || i8 != 0) {
                    componentCallbacksC0361n.m1234e();
                    componentCallbacksC0361n.f1797X1.f1822f = i8;
                }
                ArrayList<String> arrayList2 = this.f1698m;
                ArrayList<String> arrayList3 = this.f1699n;
                componentCallbacksC0361n.m1234e();
                ComponentCallbacksC0361n.b bVar = componentCallbacksC0361n.f1797X1;
                bVar.f1823g = arrayList2;
                bVar.f1824h = arrayList3;
            }
            int i9 = aVar.f1701a;
            AbstractC0378x abstractC0378x = this.f1627p;
            switch (i9) {
                case 1:
                    componentCallbacksC0361n.m1231L(aVar.f1703c, aVar.f1704d, aVar.f1705e, aVar.f1706f);
                    abstractC0378x.m1307V(componentCallbacksC0361n, false);
                    abstractC0378x.m1311a(componentCallbacksC0361n);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f1701a);
                case 3:
                    componentCallbacksC0361n.m1231L(aVar.f1703c, aVar.f1704d, aVar.f1705e, aVar.f1706f);
                    abstractC0378x.m1302Q(componentCallbacksC0361n);
                    break;
                case 4:
                    componentCallbacksC0361n.m1231L(aVar.f1703c, aVar.f1704d, aVar.f1705e, aVar.f1706f);
                    abstractC0378x.m1297H(componentCallbacksC0361n);
                    break;
                case 5:
                    componentCallbacksC0361n.m1231L(aVar.f1703c, aVar.f1704d, aVar.f1705e, aVar.f1706f);
                    abstractC0378x.m1307V(componentCallbacksC0361n, false);
                    AbstractC0378x.m1289Z(componentCallbacksC0361n);
                    break;
                case 6:
                    componentCallbacksC0361n.m1231L(aVar.f1703c, aVar.f1704d, aVar.f1705e, aVar.f1706f);
                    abstractC0378x.m1321h(componentCallbacksC0361n);
                    break;
                case 7:
                    componentCallbacksC0361n.m1231L(aVar.f1703c, aVar.f1704d, aVar.f1705e, aVar.f1706f);
                    abstractC0378x.m1307V(componentCallbacksC0361n, false);
                    abstractC0378x.m1317d(componentCallbacksC0361n);
                    break;
                case 8:
                    abstractC0378x.m1309X(componentCallbacksC0361n);
                    break;
                case 9:
                    abstractC0378x.m1309X(null);
                    break;
                case 10:
                    abstractC0378x.m1308W(componentCallbacksC0361n, aVar.f1708h);
                    break;
            }
        }
    }

    /* renamed from: h */
    public final void m1139h() {
        ArrayList<AbstractC0346f0.a> arrayList = this.f1686a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC0346f0.a aVar = arrayList.get(size);
            ComponentCallbacksC0361n componentCallbacksC0361n = aVar.f1702b;
            if (componentCallbacksC0361n != null) {
                if (componentCallbacksC0361n.f1797X1 != null) {
                    componentCallbacksC0361n.m1234e().f1817a = true;
                }
                int i7 = this.f1691f;
                int i8 = i7 != 4097 ? i7 != 4099 ? i7 != 8194 ? 0 : 4097 : 4099 : 8194;
                if (componentCallbacksC0361n.f1797X1 != null || i8 != 0) {
                    componentCallbacksC0361n.m1234e();
                    componentCallbacksC0361n.f1797X1.f1822f = i8;
                }
                ArrayList<String> arrayList2 = this.f1699n;
                ArrayList<String> arrayList3 = this.f1698m;
                componentCallbacksC0361n.m1234e();
                ComponentCallbacksC0361n.b bVar = componentCallbacksC0361n.f1797X1;
                bVar.f1823g = arrayList2;
                bVar.f1824h = arrayList3;
            }
            int i9 = aVar.f1701a;
            AbstractC0378x abstractC0378x = this.f1627p;
            switch (i9) {
                case 1:
                    componentCallbacksC0361n.m1231L(aVar.f1703c, aVar.f1704d, aVar.f1705e, aVar.f1706f);
                    abstractC0378x.m1307V(componentCallbacksC0361n, true);
                    abstractC0378x.m1302Q(componentCallbacksC0361n);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f1701a);
                case 3:
                    componentCallbacksC0361n.m1231L(aVar.f1703c, aVar.f1704d, aVar.f1705e, aVar.f1706f);
                    abstractC0378x.m1311a(componentCallbacksC0361n);
                    break;
                case 4:
                    componentCallbacksC0361n.m1231L(aVar.f1703c, aVar.f1704d, aVar.f1705e, aVar.f1706f);
                    abstractC0378x.getClass();
                    AbstractC0378x.m1289Z(componentCallbacksC0361n);
                    break;
                case 5:
                    componentCallbacksC0361n.m1231L(aVar.f1703c, aVar.f1704d, aVar.f1705e, aVar.f1706f);
                    abstractC0378x.m1307V(componentCallbacksC0361n, true);
                    abstractC0378x.m1297H(componentCallbacksC0361n);
                    break;
                case 6:
                    componentCallbacksC0361n.m1231L(aVar.f1703c, aVar.f1704d, aVar.f1705e, aVar.f1706f);
                    abstractC0378x.m1317d(componentCallbacksC0361n);
                    break;
                case 7:
                    componentCallbacksC0361n.m1231L(aVar.f1703c, aVar.f1704d, aVar.f1705e, aVar.f1706f);
                    abstractC0378x.m1307V(componentCallbacksC0361n, true);
                    abstractC0378x.m1321h(componentCallbacksC0361n);
                    break;
                case 8:
                    abstractC0378x.m1309X(null);
                    break;
                case 9:
                    abstractC0378x.m1309X(componentCallbacksC0361n);
                    break;
                case 10:
                    abstractC0378x.m1308W(componentCallbacksC0361n, aVar.f1707g);
                    break;
            }
        }
    }

    /* renamed from: i */
    public final C0335a m1140i(ComponentCallbacksC0361n componentCallbacksC0361n) {
        AbstractC0378x abstractC0378x = componentCallbacksC0361n.f1780H1;
        if (abstractC0378x == null || abstractC0378x == this.f1627p) {
            m1174b(new AbstractC0346f0.a(3, componentCallbacksC0361n));
            return this;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + componentCallbacksC0361n.toString() + " is already attached to a FragmentManager.");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(Tools.Semaphore.f159S7);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1629r >= 0) {
            sb.append(" #");
            sb.append(this.f1629r);
        }
        if (this.f1693h != null) {
            sb.append(" ");
            sb.append(this.f1693h);
        }
        sb.append("}");
        return sb.toString();
    }
}
