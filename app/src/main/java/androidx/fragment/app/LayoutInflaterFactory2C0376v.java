package androidx.fragment.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.fragment.app.v */
/* loaded from: classes.dex */
public final class LayoutInflaterFactory2C0376v implements LayoutInflater.Factory2 {

    /* renamed from: c */
    public final AbstractC0378x f1872c;

    /* renamed from: androidx.fragment.app.v$a */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: c */
        public final /* synthetic */ C0342d0 f1873c;

        public a(C0342d0 c0342d0) {
            this.f1873c = c0342d0;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            C0342d0 c0342d0 = this.f1873c;
            ComponentCallbacksC0361n componentCallbacksC0361n = c0342d0.f1674c;
            c0342d0.m1156k();
            AbstractC0368q0.m1255f((ViewGroup) componentCallbacksC0361n.f1793U1.getParent(), LayoutInflaterFactory2C0376v.this.f1872c.m1296G()).m1259e();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    public LayoutInflaterFactory2C0376v(AbstractC0378x abstractC0378x) {
        this.f1872c = abstractC0378x;
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0195  */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.View r12, java.lang.String r13, android.content.Context r14, android.util.AttributeSet r15) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.LayoutInflaterFactory2C0376v.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
