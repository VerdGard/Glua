package p189y;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* renamed from: y.f */
/* loaded from: classes.dex */
public final class C2218f extends Drawable.ConstantState {

    /* renamed from: a */
    public int f10045a;

    /* renamed from: b */
    public Drawable.ConstantState f10046b;

    /* renamed from: c */
    public ColorStateList f10047c;

    /* renamed from: d */
    public PorterDuff.Mode f10048d;

    public C2218f(C2218f c2218f) {
        this.f10047c = null;
        this.f10048d = C2216d.f10037Z;
        if (c2218f != null) {
            this.f10045a = c2218f.f10045a;
            this.f10046b = c2218f.f10046b;
            this.f10047c = c2218f.f10047c;
            this.f10048d = c2218f.f10048d;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        int i7 = this.f10045a;
        Drawable.ConstantState constantState = this.f10046b;
        return i7 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C2217e(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C2217e(this, resources);
    }
}
