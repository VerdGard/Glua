package p016c;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import androidx.appcompat.R$styleable;
import p016c.LayoutInflaterFactory2C0560n;
import p033e.C0906d;
import p049g.AbstractC1183a;

/* renamed from: c.a */
/* loaded from: classes.dex */
public abstract class AbstractC0542a {

    /* renamed from: c.a$a */
    public static class a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f2699a;

        public a() {
            super(-2, -2);
            this.f2699a = 8388627;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2699a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f274b);
            this.f2699a = obtainStyledAttributes.getInt(R$styleable.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2699a = 0;
        }

        public a(a aVar) {
            super((ViewGroup.MarginLayoutParams) aVar);
            this.f2699a = 0;
            this.f2699a = aVar.f2699a;
        }
    }

    /* renamed from: c.a$b */
    public interface b {
        /* renamed from: a */
        void m1872a();
    }

    /* renamed from: a */
    public boolean mo1854a() {
        return false;
    }

    /* renamed from: b */
    public abstract boolean mo1855b();

    /* renamed from: c */
    public abstract void mo1856c(boolean z6);

    /* renamed from: d */
    public abstract int mo1857d();

    /* renamed from: e */
    public abstract Context mo1858e();

    /* renamed from: f */
    public boolean mo1859f() {
        return false;
    }

    /* renamed from: g */
    public abstract void mo1860g();

    /* renamed from: h */
    public void mo1861h() {
    }

    /* renamed from: i */
    public abstract boolean mo1862i(int i7, KeyEvent keyEvent);

    /* renamed from: j */
    public boolean mo1863j(KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: k */
    public boolean mo1864k() {
        return false;
    }

    /* renamed from: l */
    public abstract void mo1865l(boolean z6);

    /* renamed from: m */
    public abstract void mo1866m();

    /* renamed from: n */
    public abstract void mo1867n(int i7);

    /* renamed from: o */
    public abstract void mo1868o(C0906d c0906d);

    /* renamed from: p */
    public abstract void mo1869p(boolean z6);

    /* renamed from: q */
    public abstract void mo1870q(CharSequence charSequence);

    /* renamed from: r */
    public AbstractC1183a mo1871r(LayoutInflaterFactory2C0560n.e eVar) {
        return null;
    }
}
