package p196y6;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: y6.e */
/* loaded from: classes.dex */
public class C2269e {

    /* renamed from: f */
    public static final C2269e f10364f = new C2269e(-1, -1);

    /* renamed from: a */
    public final int f10365a;

    /* renamed from: b */
    public final int f10366b;

    /* renamed from: c */
    public C2268d f10367c;

    /* renamed from: d */
    public boolean f10368d;

    /* renamed from: e */
    public boolean f10369e;

    /* renamed from: y6.e$a */
    public static final class a extends C2269e {
        public a(int i7) {
            super(i7, -1);
        }

        @Override // p196y6.C2269e
        public final String toString() {
            return this.f10365a + ".p";
        }
    }

    /* renamed from: y6.e$b */
    public static final class b extends C2269e {

        /* renamed from: g */
        public final C2267c f10370g;

        /* renamed from: h */
        public C2269e[] f10371h;

        public b(C2267c c2267c, int i7, int i8) {
            super(i7, i8);
            this.f10370g = c2267c;
        }

        @Override // p196y6.C2269e
        /* renamed from: a */
        public final void mo5501a(HashSet hashSet, HashSet hashSet2) {
            C2267c c2267c = this.f10370g;
            C2265a[] c2265aArr = c2267c.f10353d;
            int i7 = this.f10366b;
            C2265a c2265a = c2265aArr[i7];
            int i8 = this.f10365a;
            if (i7 == 0) {
                hashSet2.add(c2267c.f10355f[i8]);
            }
            C2265a[] c2265aArr2 = c2265a.f10281c;
            int length = c2265aArr2 != null ? c2265aArr2.length : 0;
            for (int i9 = 0; i9 < length; i9++) {
                C2265a c2265a2 = c2265a.f10281c[i9];
                if (!hashSet.contains(c2265a2)) {
                    hashSet.add(c2265a2);
                    C2269e c2269e = c2267c.f10356g[i8][c2265a2.f10280b];
                    if (c2269e != null) {
                        c2269e.mo5501a(hashSet, hashSet2);
                    }
                }
            }
        }

        @Override // p196y6.C2269e
        /* renamed from: b */
        public final C2269e mo5502b() {
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            mo5501a(hashSet, hashSet2);
            C2269e c2269e = C2269e.f10364f;
            if (hashSet2.contains(c2269e)) {
                return c2269e;
            }
            int size = hashSet2.size();
            Iterator it = hashSet2.iterator();
            if (size == 1) {
                C2269e c2269e2 = (C2269e) it.next();
                c2269e2.f10369e |= this.f10369e;
                return c2269e2;
            }
            this.f10371h = new C2269e[size];
            for (int i7 = 0; i7 < size; i7++) {
                this.f10371h[i7] = (C2269e) it.next();
                this.f10371h[i7].f10369e |= this.f10369e;
            }
            return null;
        }

        @Override // p196y6.C2269e
        public final String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(super.toString());
            stringBuffer.append("={");
            C2269e[] c2269eArr = this.f10371h;
            int length = c2269eArr != null ? c2269eArr.length : 0;
            for (int i7 = 0; i7 < length; i7++) {
                if (i7 > 0) {
                    stringBuffer.append(",");
                }
                stringBuffer.append(String.valueOf(this.f10371h[i7]));
            }
            stringBuffer.append("}");
            return stringBuffer.toString();
        }
    }

    public C2269e(int i7, int i8) {
        this.f10365a = i7;
        this.f10366b = i8;
    }

    /* renamed from: a */
    public void mo5501a(HashSet hashSet, HashSet hashSet2) {
        hashSet2.add(this);
    }

    /* renamed from: b */
    public C2269e mo5502b() {
        return null;
    }

    public String toString() {
        int i7 = this.f10365a;
        if (i7 < 0) {
            return "x.x";
        }
        return i7 + "." + this.f10366b;
    }
}
