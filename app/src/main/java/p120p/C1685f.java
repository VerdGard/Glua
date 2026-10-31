package p120p;

import android.ext.Tools;
import java.util.Arrays;
import java.util.Comparator;
import p120p.C1681b;

/* renamed from: p.f */
/* loaded from: classes.dex */
public final class C1685f extends C1681b {

    /* renamed from: f */
    public C1687h[] f7590f;

    /* renamed from: g */
    public C1687h[] f7591g;

    /* renamed from: h */
    public int f7592h;

    /* renamed from: i */
    public final b f7593i;

    /* renamed from: p.f$a */
    public class a implements Comparator<C1687h> {
        @Override // java.util.Comparator
        public final int compare(C1687h c1687h, C1687h c1687h2) {
            return c1687h.f7598b - c1687h2.f7598b;
        }
    }

    /* renamed from: p.f$b */
    public class b implements Comparable {

        /* renamed from: c */
        public C1687h f7594c;

        public b() {
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.f7594c.f7598b - ((C1687h) obj).f7598b;
        }

        public final String toString() {
            String str = "[ ";
            if (this.f7594c != null) {
                for (int i7 = 0; i7 < 9; i7++) {
                    StringBuilder m4107b = C1686g.m4107b(str);
                    m4107b.append(this.f7594c.f7604h[i7]);
                    m4107b.append(" ");
                    str = m4107b.toString();
                }
            }
            return str + "] " + this.f7594c;
        }
    }

    public C1685f(C1682c c1682c) {
        super(c1682c);
        this.f7590f = new C1687h[Tools.Semaphore.f159S7];
        this.f7591g = new C1687h[Tools.Semaphore.f159S7];
        this.f7592h = 0;
        this.f7593i = new b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x004d, code lost:
    
        if (r9 < r8) goto L30;
     */
    @Override // p120p.C1681b, p120p.C1683d.a
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p120p.C1687h mo4076a(boolean[] r12) {
        /*
            r11 = this;
            r0 = -1
            r1 = 0
            r2 = 0
            r3 = -1
        L4:
            int r4 = r11.f7592h
            if (r2 >= r4) goto L57
            p.h[] r4 = r11.f7590f
            r5 = r4[r2]
            int r6 = r5.f7598b
            boolean r6 = r12[r6]
            if (r6 == 0) goto L13
            goto L54
        L13:
            p.f$b r6 = r11.f7593i
            r6.f7594c = r5
            r5 = 1
            r7 = 8
            if (r3 != r0) goto L36
        L1c:
            if (r7 < 0) goto L32
            p.h r4 = r6.f7594c
            float[] r4 = r4.f7604h
            r4 = r4[r7]
            r8 = 0
            int r9 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r9 <= 0) goto L2a
            goto L32
        L2a:
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 >= 0) goto L2f
            goto L33
        L2f:
            int r7 = r7 + (-1)
            goto L1c
        L32:
            r5 = 0
        L33:
            if (r5 == 0) goto L54
            goto L53
        L36:
            r4 = r4[r3]
        L38:
            if (r7 < 0) goto L50
            float[] r8 = r4.f7604h
            r8 = r8[r7]
            p.h r9 = r6.f7594c
            float[] r9 = r9.f7604h
            r9 = r9[r7]
            int r10 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r10 != 0) goto L4b
            int r7 = r7 + (-1)
            goto L38
        L4b:
            int r4 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r4 >= 0) goto L50
            goto L51
        L50:
            r5 = 0
        L51:
            if (r5 == 0) goto L54
        L53:
            r3 = r2
        L54:
            int r2 = r2 + 1
            goto L4
        L57:
            if (r3 != r0) goto L5b
            r12 = 0
            return r12
        L5b:
            p.h[] r12 = r11.f7590f
            r12 = r12[r3]
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p120p.C1685f.mo4076a(boolean[]):p.h");
    }

    @Override // p120p.C1681b
    /* renamed from: i */
    public final void mo4084i(C1681b c1681b, boolean z6) {
        boolean z7;
        C1687h c1687h = c1681b.f7562a;
        if (c1687h == null) {
            return;
        }
        C1681b.a aVar = c1681b.f7565d;
        int mo4071g = aVar.mo4071g();
        for (int i7 = 0; i7 < mo4071g; i7++) {
            C1687h mo4072h = aVar.mo4072h(i7);
            float mo4065a = aVar.mo4065a(i7);
            b bVar = this.f7593i;
            bVar.f7594c = mo4072h;
            boolean z8 = mo4072h.f7597a;
            float[] fArr = c1687h.f7604h;
            if (z8) {
                boolean z9 = true;
                for (int i8 = 0; i8 < 9; i8++) {
                    float[] fArr2 = bVar.f7594c.f7604h;
                    float f7 = (fArr[i8] * mo4065a) + fArr2[i8];
                    fArr2[i8] = f7;
                    if (Math.abs(f7) < 1.0E-4f) {
                        bVar.f7594c.f7604h[i8] = 0.0f;
                    } else {
                        z9 = false;
                    }
                }
                if (z9) {
                    C1685f.this.m4105k(bVar.f7594c);
                }
                z7 = false;
            } else {
                for (int i9 = 0; i9 < 9; i9++) {
                    float f8 = fArr[i9];
                    if (f8 != 0.0f) {
                        float f9 = f8 * mo4065a;
                        if (Math.abs(f9) < 1.0E-4f) {
                            f9 = 0.0f;
                        }
                        bVar.f7594c.f7604h[i9] = f9;
                    } else {
                        bVar.f7594c.f7604h[i9] = 0.0f;
                    }
                }
                z7 = true;
            }
            if (z7) {
                m4104j(mo4072h);
            }
            this.f7563b = (c1681b.f7563b * mo4065a) + this.f7563b;
        }
        m4105k(c1687h);
    }

    /* renamed from: j */
    public final void m4104j(C1687h c1687h) {
        int i7;
        int i8 = this.f7592h + 1;
        C1687h[] c1687hArr = this.f7590f;
        if (i8 > c1687hArr.length) {
            C1687h[] c1687hArr2 = (C1687h[]) Arrays.copyOf(c1687hArr, c1687hArr.length * 2);
            this.f7590f = c1687hArr2;
            this.f7591g = (C1687h[]) Arrays.copyOf(c1687hArr2, c1687hArr2.length * 2);
        }
        C1687h[] c1687hArr3 = this.f7590f;
        int i9 = this.f7592h;
        c1687hArr3[i9] = c1687h;
        int i10 = i9 + 1;
        this.f7592h = i10;
        if (i10 > 1 && c1687hArr3[i10 - 1].f7598b > c1687h.f7598b) {
            int i11 = 0;
            while (true) {
                i7 = this.f7592h;
                if (i11 >= i7) {
                    break;
                }
                this.f7591g[i11] = this.f7590f[i11];
                i11++;
            }
            Arrays.sort(this.f7591g, 0, i7, new a());
            for (int i12 = 0; i12 < this.f7592h; i12++) {
                this.f7590f[i12] = this.f7591g[i12];
            }
        }
        c1687h.f7597a = true;
        c1687h.m4110a(this);
    }

    /* renamed from: k */
    public final void m4105k(C1687h c1687h) {
        int i7 = 0;
        while (i7 < this.f7592h) {
            if (this.f7590f[i7] == c1687h) {
                while (true) {
                    int i8 = this.f7592h;
                    if (i7 >= i8 - 1) {
                        this.f7592h = i8 - 1;
                        c1687h.f7597a = false;
                        return;
                    } else {
                        C1687h[] c1687hArr = this.f7590f;
                        int i9 = i7 + 1;
                        c1687hArr[i7] = c1687hArr[i9];
                        i7 = i9;
                    }
                }
            } else {
                i7++;
            }
        }
    }

    @Override // p120p.C1681b
    public final String toString() {
        String str = " goal -> (" + this.f7563b + ") : ";
        for (int i7 = 0; i7 < this.f7592h; i7++) {
            C1687h c1687h = this.f7590f[i7];
            b bVar = this.f7593i;
            bVar.f7594c = c1687h;
            str = str + bVar + " ";
        }
        return str;
    }
}
