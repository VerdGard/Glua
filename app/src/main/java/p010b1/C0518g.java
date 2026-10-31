package p010b1;

import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import p002a1.C0017d;
import p002a1.C0020g;
import p002a1.InterfaceC0025l;
import p018c1.AbstractC0580a;
import p018c1.AbstractC0585f;
import p018c1.C0592m;
import p035e1.C0953e;
import p051g1.C1195d;
import p059h1.AbstractC1284b;
import p083k1.C1449c;
import p089l.C1473g;

/* renamed from: b1.g */
/* loaded from: classes.dex */
public final class C0518g implements InterfaceC0515d, AbstractC0580a.a, InterfaceC0521j {

    /* renamed from: a */
    public final String f2591a;

    /* renamed from: b */
    public final C1473g<LinearGradient> f2592b = new C1473g<>();

    /* renamed from: c */
    public final C1473g<RadialGradient> f2593c = new C1473g<>();

    /* renamed from: d */
    public final Matrix f2594d = new Matrix();

    /* renamed from: e */
    public final Path f2595e;

    /* renamed from: f */
    public final Paint f2596f;

    /* renamed from: g */
    public final RectF f2597g;

    /* renamed from: h */
    public final ArrayList f2598h;

    /* renamed from: i */
    public final int f2599i;

    /* renamed from: j */
    public final AbstractC0585f f2600j;

    /* renamed from: k */
    public final AbstractC0580a<Integer, Integer> f2601k;

    /* renamed from: l */
    public final AbstractC0585f f2602l;

    /* renamed from: m */
    public final AbstractC0585f f2603m;

    /* renamed from: n */
    public C0592m f2604n;

    /* renamed from: o */
    public final C0020g f2605o;

    /* renamed from: p */
    public final int f2606p;

    public C0518g(C0020g c0020g, AbstractC1284b abstractC1284b, C1195d c1195d) {
        Path path = new Path();
        this.f2595e = path;
        this.f2596f = new Paint(1);
        this.f2597g = new RectF();
        this.f2598h = new ArrayList();
        this.f2591a = c1195d.f5864g;
        this.f2605o = c0020g;
        this.f2599i = c1195d.f5858a;
        path.setFillType(c1195d.f5859b);
        this.f2606p = (int) (c0020g.f46e.m2184b() / 32.0f);
        AbstractC0580a<?, ?> mo1994a = c1195d.f5860c.mo1994a();
        this.f2600j = (AbstractC0585f) mo1994a;
        mo1994a.m2026a(this);
        abstractC1284b.m3597d(mo1994a);
        AbstractC0580a<Integer, Integer> mo1994a2 = c1195d.f5861d.mo1994a();
        this.f2601k = mo1994a2;
        mo1994a2.m2026a(this);
        abstractC1284b.m3597d(mo1994a2);
        AbstractC0580a<?, ?> mo1994a3 = c1195d.f5862e.mo1994a();
        this.f2602l = (AbstractC0585f) mo1994a3;
        mo1994a3.m2026a(this);
        abstractC1284b.m3597d(mo1994a3);
        AbstractC0580a<?, ?> mo1994a4 = c1195d.f5863f.mo1994a();
        this.f2603m = (AbstractC0585f) mo1994a4;
        mo1994a4.m2026a(this);
        abstractC1284b.m3597d(mo1994a4);
    }

    @Override // p018c1.AbstractC0580a.a
    /* renamed from: a */
    public final void mo1826a() {
        this.f2605o.invalidateSelf();
    }

    @Override // p035e1.InterfaceC0954f
    /* renamed from: b */
    public final <T> void mo1827b(T t7, C1449c c1449c) {
        if (t7 == InterfaceC0025l.f91x) {
            this.f2604n = c1449c == null ? null : new C0592m(c1449c);
        }
    }

    @Override // p010b1.InterfaceC0513b
    /* renamed from: c */
    public final void mo1828c(List<InterfaceC0513b> list, List<InterfaceC0513b> list2) {
        for (int i7 = 0; i7 < list2.size(); i7++) {
            InterfaceC0513b interfaceC0513b = list2.get(i7);
            if (interfaceC0513b instanceof InterfaceC0523l) {
                this.f2598h.add((InterfaceC0523l) interfaceC0513b);
            }
        }
    }

    /* renamed from: d */
    public final int m1834d() {
        float f7 = this.f2602l.f2954d;
        float f8 = this.f2606p;
        int round = Math.round(f7 * f8);
        int round2 = Math.round(this.f2603m.f2954d * f8);
        int round3 = Math.round(this.f2600j.f2954d * f8);
        int i7 = round != 0 ? round * 527 : 17;
        if (round2 != 0) {
            i7 = i7 * 31 * round2;
        }
        return round3 != 0 ? i7 * 31 * round3 : i7;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v3 ??, still in use, count: 1, list:
          (r3v3 ?? I:java.lang.Object) from 0x00b6: INVOKE (r9v0 ?? I:l.g), (r4v5 ?? I:long), (r3v3 ?? I:java.lang.Object) VIRTUAL call: l.g.g(long, java.lang.Object):void A[MD:(long, E):void (m)] (LINE:183)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    @Override // p010b1.InterfaceC0515d
    /* renamed from: e */
    public final void mo1829e(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v3 ??, still in use, count: 1, list:
          (r3v3 ?? I:java.lang.Object) from 0x00b6: INVOKE (r9v0 ?? I:l.g), (r4v5 ?? I:long), (r3v3 ?? I:java.lang.Object) VIRTUAL call: l.g.g(long, java.lang.Object):void A[MD:(long, E):void (m)] (LINE:183)
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

    @Override // p035e1.InterfaceC0954f
    /* renamed from: g */
    public final void mo1830g(C0953e c0953e, int i7, ArrayList arrayList, C0953e c0953e2) {
        C0017d.m74M(c0953e, i7, arrayList, c0953e2, this);
    }

    @Override // p010b1.InterfaceC0513b
    public final String getName() {
        return this.f2591a;
    }

    @Override // p010b1.InterfaceC0515d
    /* renamed from: h */
    public final void mo1831h(RectF rectF, Matrix matrix) {
        Path path = this.f2595e;
        path.reset();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f2598h;
            if (i7 >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((InterfaceC0523l) arrayList.get(i7)).mo1833f(), matrix);
                i7++;
            }
        }
    }
}
