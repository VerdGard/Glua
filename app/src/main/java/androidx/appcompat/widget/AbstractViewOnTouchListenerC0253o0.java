package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import p057h.InterfaceC1272f;

/* renamed from: androidx.appcompat.widget.o0 */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC0253o0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: X */
    public a f1016X;

    /* renamed from: Y */
    public b f1017Y;

    /* renamed from: Z */
    public boolean f1018Z;

    /* renamed from: c */
    public final float f1019c;

    /* renamed from: e */
    public final int f1020e;

    /* renamed from: m */
    public final int f1021m;

    /* renamed from: s */
    public final View f1022s;

    /* renamed from: w1 */
    public int f1023w1;

    /* renamed from: x1 */
    public final int[] f1024x1 = new int[2];

    /* renamed from: androidx.appcompat.widget.o0$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewParent parent = AbstractViewOnTouchListenerC0253o0.this.f1022s.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.o0$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AbstractViewOnTouchListenerC0253o0 abstractViewOnTouchListenerC0253o0 = AbstractViewOnTouchListenerC0253o0.this;
            abstractViewOnTouchListenerC0253o0.m866a();
            View view = abstractViewOnTouchListenerC0253o0.f1022s;
            if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC0253o0.mo494c()) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                view.onTouchEvent(obtain);
                obtain.recycle();
                abstractViewOnTouchListenerC0253o0.f1018Z = true;
            }
        }
    }

    public AbstractViewOnTouchListenerC0253o0(View view) {
        this.f1022s = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1019c = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1020e = tapTimeout;
        this.f1021m = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    /* renamed from: a */
    public final void m866a() {
        b bVar = this.f1017Y;
        View view = this.f1022s;
        if (bVar != null) {
            view.removeCallbacks(bVar);
        }
        a aVar = this.f1016X;
        if (aVar != null) {
            view.removeCallbacks(aVar);
        }
    }

    /* renamed from: b */
    public abstract InterfaceC1272f mo493b();

    /* renamed from: c */
    public abstract boolean mo494c();

    /* renamed from: d */
    public boolean mo700d() {
        InterfaceC1272f mo493b = mo493b();
        if (mo493b == null || !mo493b.mo502c()) {
            return true;
        }
        mo493b.dismiss();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0080, code lost:
    
        if (r4 != 3) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010c  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AbstractViewOnTouchListenerC0253o0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f1018Z = false;
        this.f1023w1 = -1;
        a aVar = this.f1016X;
        if (aVar != null) {
            this.f1022s.removeCallbacks(aVar);
        }
    }
}
