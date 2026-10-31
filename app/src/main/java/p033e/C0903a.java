package p033e;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import p002a1.C0017d;
import p033e.C0904b;
import p033e.C0907e;
import p041f.C1143a;
import p089l.C1473g;
import p089l.C1482p;
import p089l.C1483q;
import p182x0.C2168d;
import p189y.InterfaceC2214b;

/* renamed from: e.a */
/* loaded from: classes.dex */
public final class C0903a extends C0907e implements InterfaceC2214b {

    /* renamed from: E1 */
    public b f4694E1;

    /* renamed from: F1 */
    public f f4695F1;

    /* renamed from: G1 */
    public int f4696G1;

    /* renamed from: H1 */
    public int f4697H1;

    /* renamed from: I1 */
    public boolean f4698I1;

    /* renamed from: e.a$a */
    public static class a extends f {

        /* renamed from: a */
        public final Animatable f4699a;

        public a(Animatable animatable) {
            this.f4699a = animatable;
        }

        @Override // p033e.C0903a.f
        /* renamed from: c */
        public final void mo2612c() {
            this.f4699a.start();
        }

        @Override // p033e.C0903a.f
        /* renamed from: d */
        public final void mo2613d() {
            this.f4699a.stop();
        }
    }

    /* renamed from: e.a$b */
    public static class b extends C0907e.a {

        /* renamed from: I */
        public C1473g<Long> f4700I;

        /* renamed from: J */
        public C1482p<Integer> f4701J;

        public b(b bVar, C0903a c0903a, Resources resources) {
            super(bVar, c0903a, resources);
            C1482p<Integer> c1482p;
            if (bVar != null) {
                this.f4700I = bVar.f4700I;
                c1482p = bVar.f4701J;
            } else {
                this.f4700I = new C1473g<>();
                c1482p = new C1482p<>();
            }
            this.f4701J = c1482p;
        }

        @Override // p033e.C0907e.a, p033e.C0904b.c
        /* renamed from: e */
        public final void mo2614e() {
            this.f4700I = this.f4700I.clone();
            this.f4701J = this.f4701J.clone();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* renamed from: g */
        public final int m2615g(int i7) {
            ?? r52;
            if (i7 < 0) {
                return 0;
            }
            C1482p<Integer> c1482p = this.f4701J;
            int i8 = 0;
            c1482p.getClass();
            Object obj = C1483q.f7051a;
            int m85j = C0017d.m85j(c1482p.f7050m, i7, c1482p.f7048c);
            if (m85j >= 0 && (r52 = c1482p.f7049e[m85j]) != C1483q.f7051a) {
                i8 = r52;
            }
            return i8.intValue();
        }

        @Override // p033e.C0907e.a, android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new C0903a(this, null);
        }

        @Override // p033e.C0907e.a, android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new C0903a(this, resources);
        }
    }

    /* renamed from: e.a$c */
    public static class c extends f {

        /* renamed from: a */
        public final C2168d f4702a;

        public c(C2168d c2168d) {
            this.f4702a = c2168d;
        }

        @Override // p033e.C0903a.f
        /* renamed from: c */
        public final void mo2612c() {
            this.f4702a.start();
        }

        @Override // p033e.C0903a.f
        /* renamed from: d */
        public final void mo2613d() {
            this.f4702a.stop();
        }
    }

    /* renamed from: e.a$d */
    public static class d extends f {

        /* renamed from: a */
        public final ObjectAnimator f4703a;

        /* renamed from: b */
        public final boolean f4704b;

        public d(AnimationDrawable animationDrawable, boolean z6, boolean z7) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i7 = z6 ? numberOfFrames - 1 : 0;
            int i8 = z6 ? 0 : numberOfFrames - 1;
            e eVar = new e(animationDrawable, z6);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i7, i8);
            C1143a.m3327a(ofInt, true);
            ofInt.setDuration(eVar.f4707c);
            ofInt.setInterpolator(eVar);
            this.f4704b = z7;
            this.f4703a = ofInt;
        }

        @Override // p033e.C0903a.f
        /* renamed from: a */
        public final boolean mo2616a() {
            return this.f4704b;
        }

        @Override // p033e.C0903a.f
        /* renamed from: b */
        public final void mo2617b() {
            this.f4703a.reverse();
        }

        @Override // p033e.C0903a.f
        /* renamed from: c */
        public final void mo2612c() {
            this.f4703a.start();
        }

        @Override // p033e.C0903a.f
        /* renamed from: d */
        public final void mo2613d() {
            this.f4703a.cancel();
        }
    }

    /* renamed from: e.a$e */
    public static class e implements TimeInterpolator {

        /* renamed from: a */
        public int[] f4705a;

        /* renamed from: b */
        public int f4706b;

        /* renamed from: c */
        public int f4707c;

        public e(AnimationDrawable animationDrawable, boolean z6) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f4706b = numberOfFrames;
            int[] iArr = this.f4705a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f4705a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f4705a;
            int i7 = 0;
            for (int i8 = 0; i8 < numberOfFrames; i8++) {
                int duration = animationDrawable.getDuration(z6 ? (numberOfFrames - i8) - 1 : i8);
                iArr2[i8] = duration;
                i7 += duration;
            }
            this.f4707c = i7;
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f7) {
            int i7 = (int) ((f7 * this.f4707c) + 0.5f);
            int i8 = this.f4706b;
            int[] iArr = this.f4705a;
            int i9 = 0;
            while (i9 < i8) {
                int i10 = iArr[i9];
                if (i7 < i10) {
                    break;
                }
                i7 -= i10;
                i9++;
            }
            return (i9 / i8) + (i9 < i8 ? i7 / this.f4707c : 0.0f);
        }
    }

    /* renamed from: e.a$f */
    public static abstract class f {
        /* renamed from: a */
        public boolean mo2616a() {
            return false;
        }

        /* renamed from: b */
        public void mo2617b() {
        }

        /* renamed from: c */
        public abstract void mo2612c();

        /* renamed from: d */
        public abstract void mo2613d();
    }

    public C0903a() {
        this(null, null);
    }

    public C0903a(b bVar, Resources resources) {
        this.f4696G1 = -1;
        this.f4697H1 = -1;
        mo2610e(new b(bVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0264, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r27.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0288, code lost:
    
        r4.onStateChange(r4.getState());
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x028f, code lost:
    
        return r4;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p033e.C0903a m2608g(android.content.Context r23, android.content.res.Resources.Theme r24, android.content.res.Resources r25, android.util.AttributeSet r26, android.content.res.XmlResourceParser r27) {
        /*
            Method dump skipped, instructions count: 686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p033e.C0903a.m2608g(android.content.Context, android.content.res.Resources$Theme, android.content.res.Resources, android.util.AttributeSet, android.content.res.XmlResourceParser):e.a");
    }

    @Override // p033e.C0907e, p033e.C0904b
    /* renamed from: b */
    public final C0904b.c mo2609b() {
        return new b(this.f4694E1, this, null);
    }

    @Override // p033e.C0907e, p033e.C0904b
    /* renamed from: e */
    public final void mo2610e(C0904b.c cVar) {
        super.mo2610e(cVar);
        if (cVar instanceof b) {
            this.f4694E1 = (b) cVar;
        }
    }

    @Override // p033e.C0907e
    /* renamed from: f */
    public final C0907e.a mo2609b() {
        return new b(this.f4694E1, this, null);
    }

    @Override // p033e.C0904b, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        f fVar = this.f4695F1;
        if (fVar != null) {
            fVar.mo2613d();
            this.f4695F1 = null;
            m2620d(this.f4696G1);
            this.f4696G1 = -1;
            this.f4697H1 = -1;
        }
    }

    @Override // p033e.C0907e, p033e.C0904b, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f4698I1) {
            super.mutate();
            this.f4694E1.mo2614e();
            this.f4698I1 = true;
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e4  */
    @Override // p033e.C0907e, p033e.C0904b, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onStateChange(int[] r18) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p033e.C0903a.onStateChange(int[]):boolean");
    }

    @Override // p033e.C0904b, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z6, boolean z7) {
        boolean visible = super.setVisible(z6, z7);
        f fVar = this.f4695F1;
        if (fVar != null && (visible || z7)) {
            if (z6) {
                fVar.mo2612c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }
}
