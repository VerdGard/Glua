package p002a1;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.ext.C0091c;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.Choreographer;
import com.airbnb.lottie.C0680a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import p027d1.C0877a;
import p027d1.C0878b;
import p035e1.C0953e;
import p035e1.InterfaceC0954f;
import p043f1.C1161f;
import p059h1.C1285c;
import p059h1.C1287e;
import p075j1.ChoreographerFrameCallbackC1401b;
import p083k1.C1449c;

/* renamed from: a1.g */
/* loaded from: classes.dex */
public final class C0020g extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: A1 */
    public boolean f41A1;

    /* renamed from: X */
    public final ArrayList<e> f42X;

    /* renamed from: Y */
    public C0878b f43Y;

    /* renamed from: Z */
    public String f44Z;

    /* renamed from: c */
    public final Matrix f45c = new Matrix();

    /* renamed from: e */
    public C0680a f46e;

    /* renamed from: m */
    public final ChoreographerFrameCallbackC1401b f47m;

    /* renamed from: s */
    public float f48s;

    /* renamed from: w1 */
    public C0877a f49w1;

    /* renamed from: x1 */
    public boolean f50x1;

    /* renamed from: y1 */
    public C1285c f51y1;

    /* renamed from: z1 */
    public int f52z1;

    /* renamed from: a1.g$a */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float f7;
            C0020g c0020g = C0020g.this;
            C1285c c1285c = c0020g.f51y1;
            if (c1285c != null) {
                ChoreographerFrameCallbackC1401b choreographerFrameCallbackC1401b = c0020g.f47m;
                C0680a c0680a = choreographerFrameCallbackC1401b.f6755x1;
                if (c0680a == null) {
                    f7 = 0.0f;
                } else {
                    float f8 = choreographerFrameCallbackC1401b.f6749X;
                    float f9 = c0680a.f3256j;
                    f7 = (f8 - f9) / (c0680a.f3257k - f9);
                }
                c1285c.mo3604o(f7);
            }
        }
    }

    /* renamed from: a1.g$b */
    public class b implements e {
        public b() {
        }

        @Override // p002a1.C0020g.e
        public final void run() {
            C0020g.this.m112c();
        }
    }

    /* renamed from: a1.g$c */
    public class c implements e {

        /* renamed from: a */
        public final /* synthetic */ float f55a;

        public c(float f7) {
            this.f55a = f7;
        }

        @Override // p002a1.C0020g.e
        public final void run() {
            C0020g.this.m113d(this.f55a);
        }
    }

    /* renamed from: a1.g$d */
    public class d implements e {

        /* renamed from: a */
        public final /* synthetic */ C0953e f57a;

        /* renamed from: b */
        public final /* synthetic */ Object f58b;

        /* renamed from: c */
        public final /* synthetic */ C1449c f59c;

        public d(C0953e c0953e, Object obj, C1449c c1449c) {
            this.f57a = c0953e;
            this.f58b = obj;
            this.f59c = c1449c;
        }

        @Override // p002a1.C0020g.e
        public final void run() {
            C0020g.this.m110a(this.f57a, this.f58b, this.f59c);
        }
    }

    /* renamed from: a1.g$e */
    public interface e {
        void run();
    }

    public C0020g() {
        ChoreographerFrameCallbackC1401b choreographerFrameCallbackC1401b = new ChoreographerFrameCallbackC1401b();
        this.f47m = choreographerFrameCallbackC1401b;
        this.f48s = 1.0f;
        new HashSet();
        this.f42X = new ArrayList<>();
        this.f52z1 = 255;
        choreographerFrameCallbackC1401b.addUpdateListener(new a());
    }

    /* renamed from: a */
    public final <T> void m110a(C0953e c0953e, T t7, C1449c c1449c) {
        float f7;
        if (this.f51y1 == null) {
            this.f42X.add(new d(c0953e, t7, c1449c));
            return;
        }
        InterfaceC0954f interfaceC0954f = c0953e.f4919b;
        boolean z6 = true;
        if (interfaceC0954f != null) {
            interfaceC0954f.mo1827b(t7, c1449c);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f51y1.mo1830g(c0953e, 0, arrayList, new C0953e(new String[0]));
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                ((C0953e) arrayList.get(i7)).f4919b.mo1827b(t7, c1449c);
            }
            z6 = true ^ arrayList.isEmpty();
        }
        if (z6) {
            invalidateSelf();
            if (t7 == InterfaceC0025l.f90w) {
                ChoreographerFrameCallbackC1401b choreographerFrameCallbackC1401b = this.f47m;
                C0680a c0680a = choreographerFrameCallbackC1401b.f6755x1;
                if (c0680a == null) {
                    f7 = 0.0f;
                } else {
                    float f8 = choreographerFrameCallbackC1401b.f6749X;
                    float f9 = c0680a.f3256j;
                    f7 = (f8 - f9) / (c0680a.f3257k - f9);
                }
                m113d(f7);
            }
        }
    }

    /* renamed from: b */
    public final void m111b() {
        C0680a c0680a = this.f46e;
        Rect rect = c0680a.f3255i;
        C1287e c1287e = new C1287e(Collections.emptyList(), c0680a, "__container", -1L, 1, -1L, null, Collections.emptyList(), new C1161f(), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, Collections.emptyList(), 1, null);
        C0680a c0680a2 = this.f46e;
        this.f51y1 = new C1285c(this, c1287e, c0680a2.f3254h, c0680a2);
    }

    /* renamed from: c */
    public final void m112c() {
        if (this.f51y1 == null) {
            this.f42X.add(new b());
            return;
        }
        ChoreographerFrameCallbackC1401b choreographerFrameCallbackC1401b = this.f47m;
        choreographerFrameCallbackC1401b.f6749X = choreographerFrameCallbackC1401b.m3752d() ? choreographerFrameCallbackC1401b.m3750b() : choreographerFrameCallbackC1401b.m3751c();
        choreographerFrameCallbackC1401b.f6753s = System.nanoTime();
        choreographerFrameCallbackC1401b.f6750Y = 0;
        Choreographer.getInstance().removeFrameCallback(choreographerFrameCallbackC1401b);
        choreographerFrameCallbackC1401b.f6756y1 = false;
        Choreographer.getInstance().postFrameCallback(choreographerFrameCallbackC1401b);
        choreographerFrameCallbackC1401b.f6756y1 = true;
        boolean m3752d = choreographerFrameCallbackC1401b.m3752d();
        Iterator it = choreographerFrameCallbackC1401b.f6748e.iterator();
        while (it.hasNext()) {
            Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) it.next();
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart(choreographerFrameCallbackC1401b, m3752d);
            } else {
                animatorListener.onAnimationStart(choreographerFrameCallbackC1401b);
            }
        }
    }

    /* renamed from: d */
    public final void m113d(float f7) {
        C0680a c0680a = this.f46e;
        if (c0680a == null) {
            this.f42X.add(new c(f7));
            return;
        }
        float f8 = c0680a.f3257k;
        float f9 = c0680a.f3256j;
        int m227e = (int) C0091c.m227e(f8, f9, f7, f9);
        ChoreographerFrameCallbackC1401b choreographerFrameCallbackC1401b = this.f47m;
        float f10 = m227e;
        if (choreographerFrameCallbackC1401b.f6749X == f10) {
            return;
        }
        choreographerFrameCallbackC1401b.f6749X = C0017d.m89n(f10, choreographerFrameCallbackC1401b.m3751c(), choreographerFrameCallbackC1401b.m3750b());
        choreographerFrameCallbackC1401b.m3753e();
        choreographerFrameCallbackC1401b.f6753s = System.nanoTime();
        Iterator it = choreographerFrameCallbackC1401b.f6747c.iterator();
        while (it.hasNext()) {
            ((ValueAnimator.AnimatorUpdateListener) it.next()).onAnimationUpdate(choreographerFrameCallbackC1401b);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f7;
        if (this.f51y1 == null) {
            return;
        }
        float f8 = this.f48s;
        float min = Math.min(canvas.getWidth() / this.f46e.f3255i.width(), canvas.getHeight() / this.f46e.f3255i.height());
        if (f8 > min) {
            f7 = this.f48s / min;
        } else {
            min = f8;
            f7 = 1.0f;
        }
        if (f7 > 1.0f) {
            canvas.save();
            float width = this.f46e.f3255i.width() / 2.0f;
            float height = this.f46e.f3255i.height() / 2.0f;
            float f9 = width * min;
            float f10 = height * min;
            float f11 = this.f48s;
            canvas.translate((width * f11) - f9, (f11 * height) - f10);
            canvas.scale(f7, f7, f9, f10);
        }
        Matrix matrix = this.f45c;
        matrix.reset();
        matrix.preScale(min, min);
        this.f51y1.mo1829e(canvas, matrix, this.f52z1);
        C0017d.m96u();
        if (f7 > 1.0f) {
            canvas.restore();
        }
    }

    /* renamed from: e */
    public final void m114e() {
        if (this.f46e == null) {
            return;
        }
        float f7 = this.f48s;
        setBounds(0, 0, (int) (r0.f3255i.width() * f7), (int) (this.f46e.f3255i.height() * f7));
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f52z1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        if (this.f46e == null) {
            return -1;
        }
        return (int) (r0.f3255i.height() * this.f48s);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        if (this.f46e == null) {
            return -1;
        }
        return (int) (r0.f3255i.width() * this.f48s);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f47m.f6756y1;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j7) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j7);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        this.f52z1 = i7;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Log.w("LOTTIE", "Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        m112c();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f42X.clear();
        ChoreographerFrameCallbackC1401b choreographerFrameCallbackC1401b = this.f47m;
        choreographerFrameCallbackC1401b.getClass();
        Choreographer.getInstance().removeFrameCallback(choreographerFrameCallbackC1401b);
        choreographerFrameCallbackC1401b.f6756y1 = false;
        choreographerFrameCallbackC1401b.m3749a(choreographerFrameCallbackC1401b.m3752d());
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }
}
