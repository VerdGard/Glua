package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.ext.C0091c;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.Property;
import android.view.View;
import com.google.android.material.R$attr;
import com.google.android.material.R$integer;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.Iterator;
import p004a3.C0034a;
import p004a3.C0038e;
import p004a3.C0039f;
import p004a3.C0040g;
import p036e2.C1109v5;
import p121p0.C1689a;
import p123p3.C1700a;
import p123p3.C1702c;
import p123p3.ViewTreeObserverOnPreDrawListenerC1701b;
import p131q3.C1758n;
import p139r3.C1832j;
import p185x3.InterfaceC2192b;
import p193y3.C2240i;

/* renamed from: com.google.android.material.floatingactionbutton.d */
/* loaded from: classes.dex */
public class C0819d {

    /* renamed from: a */
    public C2240i f4274a;

    /* renamed from: b */
    public boolean f4275b;

    /* renamed from: d */
    public float f4277d;

    /* renamed from: e */
    public float f4278e;

    /* renamed from: f */
    public float f4279f;

    /* renamed from: g */
    public Animator f4280g;

    /* renamed from: h */
    public C0040g f4281h;

    /* renamed from: i */
    public C0040g f4282i;

    /* renamed from: j */
    public float f4283j;

    /* renamed from: l */
    public int f4285l;

    /* renamed from: n */
    public ArrayList<Animator.AnimatorListener> f4287n;

    /* renamed from: o */
    public ArrayList<Animator.AnimatorListener> f4288o;

    /* renamed from: p */
    public ArrayList<f> f4289p;

    /* renamed from: q */
    public final FloatingActionButton f4290q;

    /* renamed from: r */
    public final InterfaceC2192b f4291r;

    /* renamed from: w */
    public ViewTreeObserverOnPreDrawListenerC1701b f4296w;

    /* renamed from: x */
    public static final C1689a f4271x = C0034a.f110c;

    /* renamed from: y */
    public static final int f4272y = R$attr.motionDurationLong2;

    /* renamed from: z */
    public static final int f4273z = R$attr.motionEasingEmphasizedInterpolator;

    /* renamed from: A */
    public static final int f4263A = R$attr.motionDurationMedium1;

    /* renamed from: B */
    public static final int f4264B = R$attr.motionEasingEmphasizedAccelerateInterpolator;

    /* renamed from: C */
    public static final int[] f4265C = {R.attr.state_pressed, R.attr.state_enabled};

    /* renamed from: D */
    public static final int[] f4266D = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};

    /* renamed from: E */
    public static final int[] f4267E = {R.attr.state_focused, R.attr.state_enabled};

    /* renamed from: F */
    public static final int[] f4268F = {R.attr.state_hovered, R.attr.state_enabled};

    /* renamed from: G */
    public static final int[] f4269G = {R.attr.state_enabled};

    /* renamed from: H */
    public static final int[] f4270H = new int[0];

    /* renamed from: c */
    public boolean f4276c = true;

    /* renamed from: k */
    public float f4284k = 1.0f;

    /* renamed from: m */
    public int f4286m = 0;

    /* renamed from: s */
    public final Rect f4292s = new Rect();

    /* renamed from: t */
    public final RectF f4293t = new RectF();

    /* renamed from: u */
    public final RectF f4294u = new RectF();

    /* renamed from: v */
    public final Matrix f4295v = new Matrix();

    /* renamed from: com.google.android.material.floatingactionbutton.d$a */
    public class a extends C0039f {
        public a() {
        }

        @Override // android.animation.TypeEvaluator
        public final Matrix evaluate(float f7, Matrix matrix, Matrix matrix2) {
            C0819d.this.f4284k = f7;
            float[] fArr = this.f117a;
            matrix.getValues(fArr);
            float[] fArr2 = this.f118b;
            matrix2.getValues(fArr2);
            for (int i7 = 0; i7 < 9; i7++) {
                float f8 = fArr2[i7];
                float f9 = fArr[i7];
                fArr2[i7] = C0091c.m227e(f8, f9, f7, f9);
            }
            Matrix matrix3 = this.f119c;
            matrix3.setValues(fArr2);
            return matrix3;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$b */
    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ float f4298a;

        /* renamed from: b */
        public final /* synthetic */ float f4299b;

        /* renamed from: c */
        public final /* synthetic */ float f4300c;

        /* renamed from: d */
        public final /* synthetic */ float f4301d;

        /* renamed from: e */
        public final /* synthetic */ float f4302e;

        /* renamed from: f */
        public final /* synthetic */ float f4303f;

        /* renamed from: g */
        public final /* synthetic */ float f4304g;

        /* renamed from: h */
        public final /* synthetic */ Matrix f4305h;

        public b(float f7, float f8, float f9, float f10, float f11, float f12, float f13, Matrix matrix) {
            this.f4298a = f7;
            this.f4299b = f8;
            this.f4300c = f9;
            this.f4301d = f10;
            this.f4302e = f11;
            this.f4303f = f12;
            this.f4304g = f13;
            this.f4305h = matrix;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C0819d c0819d = C0819d.this;
            c0819d.f4290q.setAlpha(C0034a.m126a(this.f4298a, this.f4299b, 0.0f, 0.2f, floatValue));
            FloatingActionButton floatingActionButton = c0819d.f4290q;
            float f7 = this.f4301d;
            float f8 = this.f4300c;
            floatingActionButton.setScaleX(((f7 - f8) * floatValue) + f8);
            FloatingActionButton floatingActionButton2 = c0819d.f4290q;
            float f9 = this.f4302e;
            floatingActionButton2.setScaleY(((f7 - f9) * floatValue) + f9);
            float f10 = this.f4304g;
            float f11 = this.f4303f;
            c0819d.f4284k = C0091c.m227e(f10, f11, floatValue, f11);
            float m227e = C0091c.m227e(f10, f11, floatValue, f11);
            Matrix matrix = this.f4305h;
            c0819d.m2462a(m227e, matrix);
            c0819d.f4290q.setImageMatrix(matrix);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$c */
    public class c extends i {
        public c(C1702c c1702c) {
            super(c1702c);
        }

        @Override // com.google.android.material.floatingactionbutton.C0819d.i
        /* renamed from: a */
        public final float mo2475a() {
            return 0.0f;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$d */
    public class d extends i {

        /* renamed from: c */
        public final /* synthetic */ C0819d f4307c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C1702c c1702c) {
            super(c1702c);
            this.f4307c = c1702c;
        }

        @Override // com.google.android.material.floatingactionbutton.C0819d.i
        /* renamed from: a */
        public final float mo2475a() {
            C0819d c0819d = this.f4307c;
            return c0819d.f4277d + c0819d.f4278e;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$e */
    public class e extends i {

        /* renamed from: c */
        public final /* synthetic */ C0819d f4308c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C1702c c1702c) {
            super(c1702c);
            this.f4308c = c1702c;
        }

        @Override // com.google.android.material.floatingactionbutton.C0819d.i
        /* renamed from: a */
        public final float mo2475a() {
            C0819d c0819d = this.f4308c;
            return c0819d.f4277d + c0819d.f4279f;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$f */
    public interface f {
        /* renamed from: a */
        void mo2459a();

        /* renamed from: b */
        void mo2460b();
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$g */
    public interface g {
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$h */
    public class h extends i {

        /* renamed from: c */
        public final /* synthetic */ C0819d f4309c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(C1702c c1702c) {
            super(c1702c);
            this.f4309c = c1702c;
        }

        @Override // com.google.android.material.floatingactionbutton.C0819d.i
        /* renamed from: a */
        public final float mo2475a() {
            return this.f4309c.f4277d;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$i */
    public abstract class i extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public boolean f4310a;

        /* renamed from: b */
        public final /* synthetic */ C0819d f4311b;

        public i(C1702c c1702c) {
            this.f4311b = c1702c;
        }

        /* renamed from: a */
        public abstract float mo2475a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.f4311b.getClass();
            this.f4310a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            boolean z6 = this.f4310a;
            C0819d c0819d = this.f4311b;
            if (!z6) {
                c0819d.getClass();
                mo2475a();
                this.f4310a = true;
            }
            valueAnimator.getAnimatedFraction();
            c0819d.getClass();
        }
    }

    public C0819d(FloatingActionButton floatingActionButton, FloatingActionButton.C0814b c0814b) {
        this.f4290q = floatingActionButton;
        this.f4291r = c0814b;
        C1758n c1758n = new C1758n();
        C1702c c1702c = (C1702c) this;
        c1758n.m4229a(f4265C, m2461d(new e(c1702c)));
        c1758n.m4229a(f4266D, m2461d(new d(c1702c)));
        c1758n.m4229a(f4267E, m2461d(new d(c1702c)));
        c1758n.m4229a(f4268F, m2461d(new d(c1702c)));
        c1758n.m4229a(f4269G, m2461d(new h(c1702c)));
        c1758n.m4229a(f4270H, m2461d(new c(c1702c)));
        this.f4283j = floatingActionButton.getRotation();
    }

    /* renamed from: d */
    public static ValueAnimator m2461d(i iVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f4271x);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(iVar);
        valueAnimator.addUpdateListener(iVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    /* renamed from: a */
    public final void m2462a(float f7, Matrix matrix) {
        matrix.reset();
        if (this.f4290q.getDrawable() == null || this.f4285l == 0) {
            return;
        }
        RectF rectF = this.f4293t;
        RectF rectF2 = this.f4294u;
        rectF.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        int i7 = this.f4285l;
        rectF2.set(0.0f, 0.0f, i7, i7);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i8 = this.f4285l;
        matrix.postScale(f7, f7, i8 / 2.0f, i8 / 2.0f);
    }

    /* renamed from: b */
    public final AnimatorSet m2463b(C0040g c0040g, float f7, float f8, float f9) {
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float[] fArr = {f7};
        FloatingActionButton floatingActionButton = this.f4290q;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) property, fArr);
        c0040g.m130c("opacity").m131a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_X, f8);
        c0040g.m130c("scale").m131a(ofFloat2);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 == 26) {
            ofFloat2.setEvaluator(new C1700a());
        }
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_Y, f8);
        c0040g.m130c("scale").m131a(ofFloat3);
        if (i7 == 26) {
            ofFloat3.setEvaluator(new C1700a());
        }
        arrayList.add(ofFloat3);
        Matrix matrix = this.f4295v;
        m2462a(f9, matrix);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(floatingActionButton, new C0038e(), new a(), new Matrix(matrix));
        c0040g.m130c("iconScale").m131a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        C1109v5.m3256t(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: c */
    public final AnimatorSet m2464c(float f7, float f8, float f9, int i7, int i8) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        FloatingActionButton floatingActionButton = this.f4290q;
        ofFloat.addUpdateListener(new b(floatingActionButton.getAlpha(), f7, floatingActionButton.getScaleX(), f8, floatingActionButton.getScaleY(), this.f4284k, f9, new Matrix(this.f4295v)));
        arrayList.add(ofFloat);
        C1109v5.m3256t(animatorSet, arrayList);
        animatorSet.setDuration(C1832j.m4312c(floatingActionButton.getContext(), i7, floatingActionButton.getContext().getResources().getInteger(R$integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(C1832j.m4313d(floatingActionButton.getContext(), i8, C0034a.f109b));
        return animatorSet;
    }

    /* renamed from: e */
    public float mo2465e() {
        throw null;
    }

    /* renamed from: f */
    public void mo2466f(Rect rect) {
        int max = this.f4275b ? Math.max((0 - this.f4290q.getSizeDimension()) / 2, 0) : 0;
        int max2 = Math.max(max, (int) Math.ceil(this.f4276c ? mo2465e() + this.f4279f : 0.0f));
        int max3 = Math.max(max, (int) Math.ceil(r0 * 1.5f));
        rect.set(max2, max3, max2, max3);
    }

    /* renamed from: g */
    public void mo2467g() {
        throw null;
    }

    /* renamed from: h */
    public void mo2468h() {
        throw null;
    }

    /* renamed from: i */
    public void mo2469i(int[] iArr) {
        throw null;
    }

    /* renamed from: j */
    public void mo2470j(float f7, float f8, float f9) {
        throw null;
    }

    /* renamed from: k */
    public final void m2471k() {
        ArrayList<f> arrayList = this.f4289p;
        if (arrayList != null) {
            Iterator<f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo2459a();
            }
        }
    }

    /* renamed from: l */
    public void mo2472l() {
        throw null;
    }

    /* renamed from: m */
    public void mo2473m() {
        throw null;
    }

    /* renamed from: n */
    public final void m2474n() {
        mo2466f(this.f4292s);
        C1109v5.m3253q(null, "Didn't initialize content background");
        throw null;
    }
}
