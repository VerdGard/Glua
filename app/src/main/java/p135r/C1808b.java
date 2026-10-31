package p135r;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import p127q.C1713d;
import p127q.C1714e;

/* renamed from: r.b */
/* loaded from: classes.dex */
public final class C1808b {

    /* renamed from: a */
    public final ArrayList<C1713d> f8194a = new ArrayList<>();

    /* renamed from: b */
    public final a f8195b = new a();

    /* renamed from: c */
    public final C1714e f8196c;

    /* renamed from: r.b$a */
    public static class a {

        /* renamed from: a */
        public int f8197a;

        /* renamed from: b */
        public int f8198b;

        /* renamed from: c */
        public int f8199c;

        /* renamed from: d */
        public int f8200d;

        /* renamed from: e */
        public int f8201e;

        /* renamed from: f */
        public int f8202f;

        /* renamed from: g */
        public int f8203g;

        /* renamed from: h */
        public boolean f8204h;

        /* renamed from: i */
        public boolean f8205i;

        /* renamed from: j */
        public boolean f8206j;
    }

    /* renamed from: r.b$b */
    public interface b {
    }

    public C1808b(C1714e c1714e) {
        this.f8196c = c1714e;
    }

    /* renamed from: a */
    public final boolean m4265a(b bVar, C1713d c1713d, boolean z6) {
        int[] iArr = c1713d.f7759J;
        int i7 = iArr[0];
        a aVar = this.f8195b;
        aVar.f8197a = i7;
        aVar.f8198b = iArr[1];
        aVar.f8199c = c1713d.m4165l();
        aVar.f8200d = c1713d.m4163j();
        aVar.f8205i = false;
        aVar.f8206j = z6;
        boolean z7 = aVar.f8197a == 3;
        boolean z8 = aVar.f8198b == 3;
        boolean z9 = z7 && c1713d.f7763N > 0.0f;
        boolean z10 = z8 && c1713d.f7763N > 0.0f;
        int[] iArr2 = c1713d.f7791l;
        if (z9 && iArr2[0] == 4) {
            aVar.f8197a = 1;
        }
        if (z10 && iArr2[1] == 4) {
            aVar.f8198b = 1;
        }
        ((ConstraintLayout.C0281b) bVar).m941a(c1713d, aVar);
        c1713d.m4178y(aVar.f8201e);
        c1713d.m4175v(aVar.f8202f);
        c1713d.f7802w = aVar.f8204h;
        int i8 = aVar.f8203g;
        c1713d.f7767R = i8;
        c1713d.f7802w = i8 > 0;
        aVar.f8206j = false;
        return aVar.f8205i;
    }

    /* renamed from: b */
    public final void m4266b(C1714e c1714e, int i7, int i8) {
        int i9 = c1714e.f7768S;
        int i10 = c1714e.f7769T;
        c1714e.f7768S = 0;
        c1714e.f7769T = 0;
        c1714e.m4178y(i7);
        c1714e.m4175v(i8);
        if (i9 < 0) {
            i9 = 0;
        }
        c1714e.f7768S = i9;
        if (i10 < 0) {
            i10 = 0;
        }
        c1714e.f7769T = i10;
        this.f8196c.mo4180B();
    }
}
