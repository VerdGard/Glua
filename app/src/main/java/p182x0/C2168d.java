package p182x0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import p089l.C1467a;
import p189y.C2213a;

/* renamed from: x0.d */
/* loaded from: classes.dex */
public final class C2168d extends AbstractC2172h implements Animatable {

    /* renamed from: Z */
    public static final /* synthetic */ int f9803Z = 0;

    /* renamed from: X */
    public ArrayList<AbstractC2167c> f9804X;

    /* renamed from: Y */
    public final a f9805Y;

    /* renamed from: e */
    public final b f9806e;

    /* renamed from: m */
    public final Context f9807m;

    /* renamed from: s */
    public C2169e f9808s;

    /* renamed from: x0.d$a */
    public class a implements Drawable.Callback {
        public a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(Drawable drawable) {
            C2168d.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j7) {
            C2168d.this.scheduleSelf(runnable, j7);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C2168d.this.unscheduleSelf(runnable);
        }
    }

    /* renamed from: x0.d$b */
    public static class b extends Drawable.ConstantState {

        /* renamed from: a */
        public C2173i f9810a;

        /* renamed from: b */
        public AnimatorSet f9811b;

        /* renamed from: c */
        public ArrayList<Animator> f9812c;

        /* renamed from: d */
        public C1467a<Animator, String> f9813d;

        public b(a aVar) {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    /* renamed from: x0.d$c */
    public static class c extends Drawable.ConstantState {

        /* renamed from: a */
        public final Drawable.ConstantState f9814a;

        public c(Drawable.ConstantState constantState) {
            this.f9814a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return this.f9814a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return this.f9814a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            C2168d c2168d = new C2168d();
            Drawable newDrawable = this.f9814a.newDrawable();
            c2168d.f9818c = newDrawable;
            newDrawable.setCallback(c2168d.f9805Y);
            return c2168d;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            C2168d c2168d = new C2168d();
            Drawable newDrawable = this.f9814a.newDrawable(resources);
            c2168d.f9818c = newDrawable;
            newDrawable.setCallback(c2168d.f9805Y);
            return c2168d;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C2168d c2168d = new C2168d();
            Drawable newDrawable = this.f9814a.newDrawable(resources, theme);
            c2168d.f9818c = newDrawable;
            newDrawable.setCallback(c2168d.f9805Y);
            return c2168d;
        }
    }

    public C2168d() {
        this(null);
    }

    public C2168d(Context context) {
        this.f9808s = null;
        this.f9804X = null;
        a aVar = new a();
        this.f9805Y = aVar;
        this.f9807m = context;
        this.f9806e = new b(aVar);
    }

    @Override // p182x0.AbstractC2172h, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f9818c;
        if (drawable != null) {
            C2213a.b.m5365a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f9818c;
        if (drawable != null) {
            return C2213a.b.m5366b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f9818c;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        b bVar = this.f9806e;
        bVar.f9810a.draw(canvas);
        if (bVar.f9811b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f9818c;
        return drawable != null ? C2213a.a.m5360a(drawable) : this.f9806e.f9810a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f9818c;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f9806e.getClass();
        return changingConfigurations | 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f9818c;
        return drawable != null ? C2213a.b.m5367c(drawable) : this.f9806e.f9810a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f9818c == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new c(this.f9818c.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f9818c;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f9806e.f9810a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f9818c;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f9806e.f9810a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f9818c;
        return drawable != null ? drawable.getOpacity() : this.f9806e.f9810a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0172, code lost:
    
        if (r8.f9811b != null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0174, code lost:
    
        r8.f9811b = new android.animation.AnimatorSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x017b, code lost:
    
        r8.f9811b.playTogether(r8.f9812c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0182, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void inflate(android.content.res.Resources r21, org.xmlpull.v1.XmlPullParser r22, android.util.AttributeSet r23, android.content.res.Resources.Theme r24) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p182x0.C2168d.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f9818c;
        return drawable != null ? C2213a.a.m5363d(drawable) : this.f9806e.f9810a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f9818c;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f9806e.f9811b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f9818c;
        return drawable != null ? drawable.isStateful() : this.f9806e.f9810a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f9818c;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f9818c;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f9806e.f9810a.setBounds(rect);
        }
    }

    @Override // p182x0.AbstractC2172h, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i7) {
        Drawable drawable = this.f9818c;
        return drawable != null ? drawable.setLevel(i7) : this.f9806e.f9810a.setLevel(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f9818c;
        return drawable != null ? drawable.setState(iArr) : this.f9806e.f9810a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        Drawable drawable = this.f9818c;
        if (drawable != null) {
            drawable.setAlpha(i7);
        } else {
            this.f9806e.f9810a.setAlpha(i7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z6) {
        Drawable drawable = this.f9818c;
        if (drawable != null) {
            C2213a.a.m5364e(drawable, z6);
        } else {
            this.f9806e.f9810a.setAutoMirrored(z6);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f9818c;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f9806e.f9810a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i7) {
        Drawable drawable = this.f9818c;
        if (drawable != null) {
            C2213a.m5356d(drawable, i7);
        } else {
            this.f9806e.f9810a.setTint(i7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f9818c;
        if (drawable != null) {
            C2213a.m5357e(drawable, colorStateList);
        } else {
            this.f9806e.f9810a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f9818c;
        if (drawable != null) {
            C2213a.m5358f(drawable, mode);
        } else {
            this.f9806e.f9810a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z6, boolean z7) {
        Drawable drawable = this.f9818c;
        if (drawable != null) {
            return drawable.setVisible(z6, z7);
        }
        this.f9806e.f9810a.setVisible(z6, z7);
        return super.setVisible(z6, z7);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f9818c;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        b bVar = this.f9806e;
        if (bVar.f9811b.isStarted()) {
            return;
        }
        bVar.f9811b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f9818c;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f9806e.f9811b.end();
        }
    }
}
