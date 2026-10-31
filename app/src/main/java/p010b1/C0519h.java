package p010b1;

import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import p018c1.AbstractC0585f;
import p089l.C1473g;

/* renamed from: b1.h */
/* loaded from: classes.dex */
public final class C0519h extends AbstractC0512a {

    /* renamed from: n */
    public final String f2607n;

    /* renamed from: o */
    public final C1473g<LinearGradient> f2608o;

    /* renamed from: p */
    public final C1473g<RadialGradient> f2609p;

    /* renamed from: q */
    public final RectF f2610q;

    /* renamed from: r */
    public final int f2611r;

    /* renamed from: s */
    public final int f2612s;

    /* renamed from: t */
    public final AbstractC0585f f2613t;

    /* renamed from: u */
    public final AbstractC0585f f2614u;

    /* renamed from: v */
    public final AbstractC0585f f2615v;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0519h(p002a1.C0020g r13, p059h1.AbstractC1284b r14, p051g1.C1196e r15) {
        /*
            r12 = this;
            int r0 = r15.f5872h
            r1 = 0
            if (r0 == 0) goto L98
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
            int r0 = r15.f5873i
            if (r0 == 0) goto L97
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
            f1.d r8 = r15.f5868d
            f1.b r9 = r15.f5871g
            java.util.List<f1.b> r10 = r15.f5874j
            f1.b r11 = r15.f5875k
            r3 = r12
            r4 = r13
            r5 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            l.g r0 = new l.g
            r0.<init>()
            r12.f2608o = r0
            l.g r0 = new l.g
            r0.<init>()
            r12.f2609p = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r12.f2610q = r0
            java.lang.String r0 = r15.f5865a
            r12.f2607n = r0
            int r0 = r15.f5866b
            r12.f2611r = r0
            com.airbnb.lottie.a r13 = r13.f46e
            float r13 = r13.m2184b()
            r0 = 1107296256(0x42000000, float:32.0)
            float r13 = r13 / r0
            int r13 = (int) r13
            r12.f2612s = r13
            f1.c r13 = r15.f5867c
            c1.a r13 = r13.mo1994a()
            r0 = r13
            c1.f r0 = (p018c1.AbstractC0585f) r0
            r12.f2613t = r0
            r13.m2026a(r12)
            r14.m3597d(r13)
            f1.a r13 = r15.f5869e
            c1.a r13 = r13.mo1994a()
            r0 = r13
            c1.f r0 = (p018c1.AbstractC0585f) r0
            r12.f2614u = r0
            r13.m2026a(r12)
            r14.m3597d(r13)
            f1.a r13 = r15.f5870f
            c1.a r13 = r13.mo1994a()
            r15 = r13
            c1.f r15 = (p018c1.AbstractC0585f) r15
            r12.f2615v = r15
            r13.m2026a(r12)
            r14.m3597d(r13)
            return
        L97:
            throw r1
        L98:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p010b1.C0519h.<init>(a1.g, h1.b, g1.e):void");
    }

    /* renamed from: d */
    public final int m1835d() {
        float f7 = this.f2614u.f2954d;
        float f8 = this.f2612s;
        int round = Math.round(f7 * f8);
        int round2 = Math.round(this.f2615v.f2954d * f8);
        int round3 = Math.round(this.f2613t.f2954d * f8);
        int i7 = round != 0 ? round * 527 : 17;
        if (round2 != 0) {
            i7 = i7 * 31 * round2;
        }
        return round3 != 0 ? i7 * 31 * round3 : i7;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v3 ??, still in use, count: 1, list:
          (r6v3 ?? I:java.lang.Object) from 0x0082: INVOKE (r10v1 ?? I:l.g), (r4v4 ?? I:long), (r6v3 ?? I:java.lang.Object) VIRTUAL call: l.g.g(long, java.lang.Object):void A[MD:(long, E):void (m)] (LINE:131)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    @Override // p010b1.AbstractC0512a, p010b1.InterfaceC0515d
    /* renamed from: e */
    public final void mo1829e(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v3 ??, still in use, count: 1, list:
          (r6v3 ?? I:java.lang.Object) from 0x0082: INVOKE (r10v1 ?? I:l.g), (r4v4 ?? I:long), (r6v3 ?? I:java.lang.Object) VIRTUAL call: l.g.g(long, java.lang.Object):void A[MD:(long, E):void (m)] (LINE:131)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r20v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */

    @Override // p010b1.InterfaceC0513b
    public final String getName() {
        return this.f2607n;
    }
}
