package p055g5;

import p132q4.C1773b0;
import p132q4.C1796y;
import p132q4.InterfaceC1788q;

/* renamed from: g5.c */
/* loaded from: classes.dex */
public final class RunnableC1246c implements Runnable, InterfaceC1788q<C1796y> {

    /* renamed from: X */
    public int f6085X;

    /* renamed from: Y */
    public float[] f6086Y;

    /* renamed from: c */
    public final C1245b f6087c;

    /* renamed from: m */
    public boolean f6089m;

    /* renamed from: s */
    public long f6090s = 0;

    /* renamed from: e */
    public boolean f6088e = true;

    public RunnableC1246c(C1245b c1245b, int i7) {
        this.f6087c = c1245b;
        this.f6085X = i7;
        c1245b.m3508q0(C1796y.class, this);
    }

    @Override // p132q4.InterfaceC1788q
    /* renamed from: d */
    public final void mo2065d(C1796y c1796y, C1773b0 c1773b0) {
        this.f6090s = System.currentTimeMillis();
        this.f6088e = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x008a, code lost:
    
        if ((r8.f6086Y[1] - 100.0f) <= (r0.getWidth() + r0.getOffsetX())) goto L20;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r8 = this;
            boolean r0 = r8.f6089m
            r1 = 1
            if (r0 == 0) goto L9d
            int r0 = r8.f6085X
            if (r0 <= 0) goto L9d
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r8.f6090s
            long r2 = r2 - r4
            int r0 = r8.f6085X
            long r4 = (long) r0
            r6 = 2
            long r4 = r4 * r6
            g5.b r0 = r8.f6087c
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L94
            boolean r2 = r8.f6088e
            r2 = r2 ^ r1
            r8.f6088e = r2
            c5.i r2 = r0.getCursor()
            c5.b r2 = r2.m2164b()
            j5.b r3 = r0.getLayout()
            int r4 = r2.f3141b
            int r2 = r2.f3142c
            float[] r5 = r8.f6086Y
            float[] r2 = r3.mo3811p(r4, r2, r5)
            r8.f6086Y = r2
            c5.i r2 = r0.getCursor()
            boolean r2 = r2.m2163a()
            if (r2 != 0) goto L96
            float[] r2 = r8.f6086Y
            r3 = 0
            r2 = r2[r3]
            int r4 = r0.getOffsetY()
            float r4 = (float) r4
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 < 0) goto L8d
            float[] r2 = r8.f6086Y
            r2 = r2[r3]
            int r4 = r0.getRowHeight()
            float r4 = (float) r4
            float r2 = r2 - r4
            int r4 = r0.getOffsetY()
            int r5 = r0.getHeight()
            int r5 = r5 + r4
            float r4 = (float) r5
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto L8d
            float[] r2 = r8.f6086Y
            r2 = r2[r1]
            int r4 = r0.getOffsetX()
            float r4 = (float) r4
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 < 0) goto L8d
            float[] r2 = r8.f6086Y
            r2 = r2[r1]
            r4 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 - r4
            int r4 = r0.getOffsetX()
            int r5 = r0.getWidth()
            int r5 = r5 + r4
            float r4 = (float) r5
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto L8d
            goto L8e
        L8d:
            r1 = 0
        L8e:
            if (r1 == 0) goto L96
            r0.postInvalidate()
            goto L96
        L94:
            r8.f6088e = r1
        L96:
            int r1 = r8.f6085X
            long r1 = (long) r1
            r0.m3487d0(r8, r1)
            goto L9f
        L9d:
            r8.f6088e = r1
        L9f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p055g5.RunnableC1246c.run():void");
    }
}
