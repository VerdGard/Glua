package p022c5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: c5.q */
/* loaded from: classes.dex */
public final class C0653q implements InterfaceC0643g, Parcelable {
    public static final Parcelable.Creator<C0653q> CREATOR = new a();

    /* renamed from: Y */
    public C0641e f3193Y;

    /* renamed from: e */
    public boolean f3196e;

    /* renamed from: m */
    public int f3197m;

    /* renamed from: y1 */
    public boolean f3201y1;

    /* renamed from: z1 */
    public C0651o f3202z1;

    /* renamed from: c */
    public final ArrayList f3195c = new ArrayList();

    /* renamed from: Z */
    public boolean f3194Z = false;

    /* renamed from: s */
    public d f3198s = null;

    /* renamed from: X */
    public c f3192X = null;

    /* renamed from: w1 */
    public int f3199w1 = 0;

    /* renamed from: x1 */
    public boolean f3200x1 = false;

    /* renamed from: c5.q$a */
    public class a implements Parcelable.Creator<C0653q> {
        @Override // android.os.Parcelable.Creator
        public final C0653q createFromParcel(Parcel parcel) {
            C0653q c0653q = new C0653q();
            c0653q.f3197m = parcel.readInt();
            c0653q.f3199w1 = parcel.readInt();
            c0653q.f3196e = parcel.readInt() > 0;
            for (int readInt = parcel.readInt(); readInt > 0; readInt--) {
                c0653q.f3195c.add((b) parcel.readParcelable(C0653q.class.getClassLoader()));
            }
            return c0653q;
        }

        @Override // android.os.Parcelable.Creator
        public final C0653q[] newArray(int i7) {
            return new C0653q[i7];
        }
    }

    /* renamed from: c5.q$b */
    public static abstract class b implements Parcelable {

        /* renamed from: c */
        public transient C0651o f3203c;

        /* renamed from: a */
        public abstract boolean mo2174a(b bVar);

        /* renamed from: c */
        public abstract void mo2175c(b bVar);

        /* renamed from: d */
        public abstract void mo2176d(C0641e c0641e);

        /* renamed from: j */
        public abstract void mo2177j(C0641e c0641e);
    }

    /* renamed from: c5.q$c */
    public static final class c extends b {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: X */
        public int f3204X;

        /* renamed from: Y */
        public final transient long f3205Y = System.currentTimeMillis();

        /* renamed from: Z */
        public CharSequence f3206Z;

        /* renamed from: e */
        public int f3207e;

        /* renamed from: m */
        public int f3208m;

        /* renamed from: s */
        public int f3209s;

        /* renamed from: c5.q$c$a */
        public class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            public final c createFromParcel(Parcel parcel) {
                c cVar = new c();
                cVar.f3207e = parcel.readInt();
                cVar.f3209s = parcel.readInt();
                cVar.f3208m = parcel.readInt();
                cVar.f3204X = parcel.readInt();
                cVar.f3206Z = parcel.readString();
                return cVar;
            }

            @Override // android.os.Parcelable.Creator
            public final c[] newArray(int i7) {
                return new c[i7];
            }
        }

        @Override // p022c5.C0653q.b
        /* renamed from: a */
        public final boolean mo2174a(b bVar) {
            if (!(bVar instanceof c)) {
                return false;
            }
            c cVar = (c) bVar;
            if (cVar.f3204X == this.f3209s && cVar.f3208m == this.f3207e) {
                return this.f3206Z.length() + cVar.f3206Z.length() < 10000 && Math.abs(cVar.f3205Y - this.f3205Y) < 8000;
            }
            return false;
        }

        @Override // p022c5.C0653q.b
        /* renamed from: c */
        public final void mo2175c(b bVar) {
            StringBuilder sb;
            if (!mo2174a(bVar)) {
                throw new IllegalArgumentException();
            }
            c cVar = (c) bVar;
            this.f3209s = cVar.f3209s;
            this.f3207e = cVar.f3207e;
            CharSequence charSequence = this.f3206Z;
            if (charSequence instanceof StringBuilder) {
                sb = (StringBuilder) charSequence;
            } else {
                StringBuilder sb2 = new StringBuilder(charSequence);
                this.f3206Z = sb2;
                sb = sb2;
            }
            sb.insert(0, cVar.f3206Z);
        }

        @Override // p022c5.C0653q.b
        /* renamed from: d */
        public final void mo2176d(C0641e c0641e) {
            c0641e.m2136h(this.f3207e, this.f3209s, this.f3208m, this.f3204X);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // p022c5.C0653q.b
        /* renamed from: j */
        public final void mo2177j(C0641e c0641e) {
            c0641e.m2151w(this.f3207e, this.f3209s, this.f3206Z);
        }

        public final String toString() {
            return "DeleteAction{startLine=" + this.f3207e + ", endLine=" + this.f3208m + ", startColumn=" + this.f3209s + ", endColumn=" + this.f3204X + ", createTime=" + this.f3205Y + ", text=" + ((Object) this.f3206Z) + '}';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            parcel.writeInt(this.f3207e);
            parcel.writeInt(this.f3209s);
            parcel.writeInt(this.f3208m);
            parcel.writeInt(this.f3204X);
            parcel.writeString(this.f3206Z.toString());
        }
    }

    /* renamed from: c5.q$d */
    public static final class d extends b {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: X */
        public int f3210X;

        /* renamed from: Y */
        public final transient long f3211Y = System.currentTimeMillis();

        /* renamed from: Z */
        public CharSequence f3212Z;

        /* renamed from: e */
        public int f3213e;

        /* renamed from: m */
        public int f3214m;

        /* renamed from: s */
        public int f3215s;

        /* renamed from: c5.q$d$a */
        public class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                d dVar = new d();
                dVar.f3213e = parcel.readInt();
                dVar.f3215s = parcel.readInt();
                dVar.f3214m = parcel.readInt();
                dVar.f3210X = parcel.readInt();
                dVar.f3212Z = parcel.readString();
                return dVar;
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i7) {
                return new d[i7];
            }
        }

        @Override // p022c5.C0653q.b
        /* renamed from: a */
        public final boolean mo2174a(b bVar) {
            if (!(bVar instanceof d)) {
                return false;
            }
            d dVar = (d) bVar;
            if (dVar.f3215s == this.f3210X && dVar.f3213e == this.f3214m) {
                return this.f3212Z.length() + dVar.f3212Z.length() < 10000 && Math.abs(dVar.f3211Y - this.f3211Y) < 8000;
            }
            return false;
        }

        @Override // p022c5.C0653q.b
        /* renamed from: c */
        public final void mo2175c(b bVar) {
            StringBuilder sb;
            if (!mo2174a(bVar)) {
                throw new IllegalArgumentException();
            }
            d dVar = (d) bVar;
            this.f3210X = dVar.f3210X;
            this.f3214m = dVar.f3214m;
            CharSequence charSequence = this.f3212Z;
            if (charSequence instanceof StringBuilder) {
                sb = (StringBuilder) charSequence;
            } else {
                StringBuilder sb2 = new StringBuilder(charSequence);
                this.f3212Z = sb2;
                sb = sb2;
            }
            sb.append(dVar.f3212Z);
        }

        @Override // p022c5.C0653q.b
        /* renamed from: d */
        public final void mo2176d(C0641e c0641e) {
            c0641e.m2151w(this.f3213e, this.f3215s, this.f3212Z);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // p022c5.C0653q.b
        /* renamed from: j */
        public final void mo2177j(C0641e c0641e) {
            c0641e.m2136h(this.f3213e, this.f3215s, this.f3214m, this.f3210X);
        }

        public final String toString() {
            return "InsertAction{startLine=" + this.f3213e + ", endLine=" + this.f3214m + ", startColumn=" + this.f3215s + ", endColumn=" + this.f3210X + ", createTime=" + this.f3211Y + ", text=" + ((Object) this.f3212Z) + '}';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            parcel.writeInt(this.f3213e);
            parcel.writeInt(this.f3215s);
            parcel.writeInt(this.f3214m);
            parcel.writeInt(this.f3210X);
            parcel.writeString(this.f3212Z.toString());
        }
    }

    /* renamed from: c5.q$e */
    public static final class e extends b {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: e */
        public final ArrayList f3216e = new ArrayList();

        /* renamed from: c5.q$e$a */
        public class a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            public final e createFromParcel(Parcel parcel) {
                e eVar = new e();
                for (int readInt = parcel.readInt(); readInt > 0; readInt--) {
                    eVar.f3216e.add((b) parcel.readParcelable(e.class.getClassLoader()));
                }
                return eVar;
            }

            @Override // android.os.Parcelable.Creator
            public final e[] newArray(int i7) {
                return new e[i7];
            }
        }

        @Override // p022c5.C0653q.b
        /* renamed from: a */
        public final boolean mo2174a(b bVar) {
            return false;
        }

        @Override // p022c5.C0653q.b
        /* renamed from: c */
        public final void mo2175c(b bVar) {
            throw new UnsupportedOperationException();
        }

        @Override // p022c5.C0653q.b
        /* renamed from: d */
        public final void mo2176d(C0641e c0641e) {
            int i7 = 0;
            while (true) {
                ArrayList arrayList = this.f3216e;
                if (i7 >= arrayList.size()) {
                    return;
                }
                ((b) arrayList.get(i7)).mo2176d(c0641e);
                i7++;
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // p022c5.C0653q.b
        /* renamed from: j */
        public final void mo2177j(C0641e c0641e) {
            ArrayList arrayList = this.f3216e;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    return;
                } else {
                    ((b) arrayList.get(size)).mo2177j(c0641e);
                }
            }
        }

        /* renamed from: l */
        public final void m2178l(b bVar) {
            ArrayList arrayList = this.f3216e;
            if (!arrayList.isEmpty()) {
                b bVar2 = (b) arrayList.get(arrayList.size() - 1);
                if (bVar2.mo2174a(bVar)) {
                    bVar2.mo2175c(bVar);
                    return;
                }
            }
            arrayList.add(bVar);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            ArrayList arrayList = this.f3216e;
            parcel.writeInt(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable((b) it.next(), i7);
            }
        }
    }

    /* renamed from: c5.q$f */
    public static final class f extends b {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: e */
        public d f3217e;

        /* renamed from: m */
        public c f3218m;

        /* renamed from: c5.q$f$a */
        public class a implements Parcelable.Creator<f> {
            @Override // android.os.Parcelable.Creator
            public final f createFromParcel(Parcel parcel) {
                f fVar = new f();
                fVar.f3217e = (d) parcel.readParcelable(f.class.getClassLoader());
                fVar.f3218m = (c) parcel.readParcelable(f.class.getClassLoader());
                return fVar;
            }

            @Override // android.os.Parcelable.Creator
            public final f[] newArray(int i7) {
                return new f[i7];
            }
        }

        @Override // p022c5.C0653q.b
        /* renamed from: a */
        public final boolean mo2174a(b bVar) {
            return false;
        }

        @Override // p022c5.C0653q.b
        /* renamed from: c */
        public final void mo2175c(b bVar) {
            throw new UnsupportedOperationException();
        }

        @Override // p022c5.C0653q.b
        /* renamed from: d */
        public final void mo2176d(C0641e c0641e) {
            this.f3218m.mo2176d(c0641e);
            this.f3217e.mo2176d(c0641e);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // p022c5.C0653q.b
        /* renamed from: j */
        public final void mo2177j(C0641e c0641e) {
            this.f3217e.mo2177j(c0641e);
            this.f3218m.mo2177j(c0641e);
        }

        public final String toString() {
            return "ReplaceAction{insert=" + this.f3217e + ", delete=" + this.f3218m + '}';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            parcel.writeParcelable(this.f3217e, i7);
            parcel.writeParcelable(this.f3218m, i7);
        }
    }

    /* renamed from: B */
    public final void m2172B() {
        boolean z6 = this.f3196e;
        ArrayList arrayList = this.f3195c;
        if (!z6) {
            arrayList.clear();
            this.f3199w1 = 0;
        } else {
            while (this.f3199w1 > 1 && arrayList.size() > this.f3197m) {
                arrayList.remove(0);
                this.f3199w1--;
            }
        }
    }

    /* renamed from: C */
    public final void m2173C(C0641e c0641e, b bVar) {
        ArrayList arrayList;
        e eVar;
        if (this.f3196e) {
            while (true) {
                int i7 = this.f3199w1;
                arrayList = this.f3195c;
                if (i7 >= arrayList.size()) {
                    break;
                } else {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
            if (!(c0641e.f3148X > 0)) {
                if (!arrayList.isEmpty()) {
                    b bVar2 = (b) arrayList.get(arrayList.size() - 1);
                    if (bVar2.mo2174a(bVar)) {
                        bVar2.mo2175c(bVar);
                        this.f3201y1 = false;
                        m2172B();
                    }
                }
                arrayList.add(bVar);
                this.f3199w1++;
                this.f3201y1 = false;
                m2172B();
            }
            if (arrayList.isEmpty()) {
                eVar = new e();
            } else {
                b bVar3 = (b) arrayList.get(arrayList.size() - 1);
                if ((bVar3 instanceof e) && !this.f3201y1) {
                    ((e) bVar3).m2178l(bVar);
                    this.f3201y1 = false;
                    m2172B();
                }
                eVar = new e();
            }
            eVar.m2178l(bVar);
            eVar.f3203c = bVar.f3203c;
            arrayList.add(eVar);
            this.f3199w1++;
            this.f3201y1 = false;
            m2172B();
        }
    }

    @Override // p022c5.InterfaceC0643g
    /* renamed from: c */
    public final void mo2102c(C0641e c0641e) {
        if (this.f3200x1) {
            return;
        }
        this.f3194Z = true;
        this.f3193Y = c0641e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p022c5.InterfaceC0643g
    /* renamed from: n */
    public final void mo2109n(C0641e c0641e, int i7, int i8, int i9, int i10, StringBuilder sb) {
        if (this.f3200x1) {
            return;
        }
        c cVar = new c();
        this.f3192X = cVar;
        cVar.f3204X = i10;
        cVar.f3209s = i8;
        cVar.f3208m = i9;
        cVar.f3207e = i7;
        cVar.f3206Z = sb;
        cVar.f3203c = this.f3202z1;
        if (this.f3194Z) {
            return;
        }
        m2173C(c0641e, cVar);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f3197m);
        parcel.writeInt(this.f3199w1);
        parcel.writeInt(this.f3196e ? 1 : 0);
        ArrayList arrayList = this.f3195c;
        parcel.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable((b) it.next(), i7);
        }
    }

    @Override // p022c5.InterfaceC0643g
    /* renamed from: y */
    public final void mo2113y(C0641e c0641e, int i7, int i8, int i9, int i10, CharSequence charSequence) {
        if (this.f3200x1) {
            return;
        }
        d dVar = new d();
        this.f3198s = dVar;
        dVar.f3213e = i7;
        dVar.f3215s = i8;
        dVar.f3214m = i9;
        dVar.f3210X = i10;
        dVar.f3212Z = charSequence;
        if (!this.f3194Z || this.f3192X == null) {
            dVar.f3203c = this.f3202z1;
            m2173C(c0641e, dVar);
        } else {
            f fVar = new f();
            fVar.f3218m = this.f3192X;
            fVar.f3217e = this.f3198s;
            fVar.f3203c = this.f3202z1;
            m2173C(c0641e, fVar);
        }
        this.f3192X = null;
        this.f3198s = null;
        this.f3194Z = false;
    }

    @Override // p022c5.InterfaceC0643g
    /* renamed from: z */
    public final void mo2114z(C0641e c0641e) {
        if (this.f3196e) {
            if (c0641e.f3157y1 != null) {
                if (!this.f3194Z || this.f3192X == null) {
                    C0645i m2144p = c0641e.m2144p();
                    this.f3202z1 = new C0651o(m2144p.m2164b(), m2144p.m2165c());
                }
            }
        }
    }
}
