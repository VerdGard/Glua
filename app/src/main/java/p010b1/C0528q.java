package p010b1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import p002a1.InterfaceC0025l;
import p018c1.AbstractC0585f;
import p018c1.C0592m;
import p083k1.C1449c;

/* renamed from: b1.q */
/* loaded from: classes.dex */
public final class C0528q extends AbstractC0512a {

    /* renamed from: n */
    public final String f2657n;

    /* renamed from: o */
    public final AbstractC0585f f2658o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0528q(p002a1.C0020g r13, p059h1.AbstractC1284b r14, p051g1.C1206o r15) {
        /*
            r12 = this;
            int r0 = r15.f5916g
            r1 = 0
            if (r0 == 0) goto L51
            int r0 = r0 + (-1)
            r2 = 1
            if (r0 == 0) goto L12
            if (r0 == r2) goto Lf
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.SQUARE
            goto L14
        Lf:
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.ROUND
            goto L14
        L12:
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.BUTT
        L14:
            r6 = r0
            int r0 = r15.f5917h
            if (r0 == 0) goto L50
            int r0 = r0 + (-1)
            if (r0 == 0) goto L29
            if (r0 == r2) goto L26
            r2 = 2
            if (r0 == r2) goto L23
            goto L2b
        L23:
            android.graphics.Paint$Join r1 = android.graphics.Paint.Join.BEVEL
            goto L2b
        L26:
            android.graphics.Paint$Join r1 = android.graphics.Paint.Join.ROUND
            goto L2b
        L29:
            android.graphics.Paint$Join r1 = android.graphics.Paint.Join.MITER
        L2b:
            r7 = r1
            f1.d r8 = r15.f5914e
            f1.b r9 = r15.f5915f
            java.util.List<f1.b> r10 = r15.f5912c
            f1.b r11 = r15.f5911b
            r3 = r12
            r4 = r13
            r5 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.String r13 = r15.f5910a
            r12.f2657n = r13
            f1.a r13 = r15.f5913d
            c1.a r13 = r13.mo1994a()
            r15 = r13
            c1.f r15 = (p018c1.AbstractC0585f) r15
            r12.f2658o = r15
            r13.m2026a(r12)
            r14.m3597d(r13)
            return
        L50:
            throw r1
        L51:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p010b1.C0528q.<init>(a1.g, h1.b, g1.o):void");
    }

    @Override // p010b1.AbstractC0512a, p035e1.InterfaceC0954f
    /* renamed from: b */
    public final <T> void mo1827b(T t7, C1449c c1449c) {
        super.mo1827b(t7, c1449c);
        if (t7 == InterfaceC0025l.f69b) {
            this.f2658o.m2034i(c1449c);
        } else {
            if (t7 != InterfaceC0025l.f91x || c1449c == null) {
                return;
            }
            new C0592m(c1449c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p010b1.AbstractC0512a, p010b1.InterfaceC0515d
    /* renamed from: e */
    public final void mo1829e(Canvas canvas, Matrix matrix, int i7) {
        this.f2559h.setColor(((Integer) this.f2658o.mo2030e()).intValue());
        super.mo1829e(canvas, matrix, i7);
    }

    @Override // p010b1.InterfaceC0513b
    public final String getName() {
        return this.f2657n;
    }
}
