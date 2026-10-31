package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.fragment.R$animator;
import androidx.fragment.R$id;
import androidx.fragment.app.ComponentCallbacksC0361n;
import p034e0.ViewTreeObserverOnPreDrawListenerC0941s;

/* renamed from: androidx.fragment.app.r */
/* loaded from: classes.dex */
public final class C0369r {

    /* renamed from: androidx.fragment.app.r$a */
    public static class a {

        /* renamed from: a */
        public final Animation f1858a;

        /* renamed from: b */
        public final Animator f1859b;

        public a(Animator animator) {
            this.f1858a = null;
            this.f1859b = animator;
        }

        public a(Animation animation) {
            this.f1858a = animation;
            this.f1859b = null;
        }
    }

    /* renamed from: androidx.fragment.app.r$b */
    public static class b extends AnimationSet implements Runnable {

        /* renamed from: X */
        public boolean f1860X;

        /* renamed from: c */
        public final ViewGroup f1861c;

        /* renamed from: e */
        public final View f1862e;

        /* renamed from: m */
        public boolean f1863m;

        /* renamed from: s */
        public boolean f1864s;

        public b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f1860X = true;
            this.f1861c = viewGroup;
            this.f1862e = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public final boolean getTransformation(long j7, Transformation transformation) {
            this.f1860X = true;
            if (this.f1863m) {
                return !this.f1864s;
            }
            if (!super.getTransformation(j7, transformation)) {
                this.f1863m = true;
                ViewTreeObserverOnPreDrawListenerC0941s.m2796a(this.f1861c, this);
            }
            return true;
        }

        @Override // android.view.animation.Animation
        public final boolean getTransformation(long j7, Transformation transformation, float f7) {
            this.f1860X = true;
            if (this.f1863m) {
                return !this.f1864s;
            }
            if (!super.getTransformation(j7, transformation, f7)) {
                this.f1863m = true;
                ViewTreeObserverOnPreDrawListenerC0941s.m2796a(this.f1861c, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z6 = this.f1863m;
            ViewGroup viewGroup = this.f1861c;
            if (z6 || !this.f1860X) {
                viewGroup.endViewTransition(this.f1862e);
                this.f1864s = true;
            } else {
                this.f1860X = false;
                viewGroup.post(this);
            }
        }
    }

    /* renamed from: a */
    public static a m1266a(Context context, ComponentCallbacksC0361n componentCallbacksC0361n, boolean z6, boolean z7) {
        int i7;
        int i8;
        ComponentCallbacksC0361n.b bVar = componentCallbacksC0361n.f1797X1;
        boolean z8 = false;
        int i9 = bVar == null ? 0 : bVar.f1822f;
        if (z7) {
            if (z6) {
                if (bVar != null) {
                    i7 = bVar.f1820d;
                }
                i7 = 0;
            } else {
                if (bVar != null) {
                    i7 = bVar.f1821e;
                }
                i7 = 0;
            }
        } else if (z6) {
            if (bVar != null) {
                i7 = bVar.f1818b;
            }
            i7 = 0;
        } else {
            if (bVar != null) {
                i7 = bVar.f1819c;
            }
            i7 = 0;
        }
        componentCallbacksC0361n.m1231L(0, 0, 0, 0);
        ViewGroup viewGroup = componentCallbacksC0361n.f1792T1;
        if (viewGroup != null) {
            int i10 = R$id.visible_removing_fragment_view_tag;
            if (viewGroup.getTag(i10) != null) {
                componentCallbacksC0361n.f1792T1.setTag(i10, null);
            }
        }
        ViewGroup viewGroup2 = componentCallbacksC0361n.f1792T1;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        if (i7 == 0 && i9 != 0) {
            if (i9 == 4097) {
                i8 = z6 ? R$animator.fragment_open_enter : R$animator.fragment_open_exit;
            } else if (i9 == 4099) {
                i8 = z6 ? R$animator.fragment_fade_enter : R$animator.fragment_fade_exit;
            } else if (i9 != 8194) {
                i7 = -1;
            } else {
                i8 = z6 ? R$animator.fragment_close_enter : R$animator.fragment_close_exit;
            }
            i7 = i8;
        }
        if (i7 != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(i7));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, i7);
                    if (loadAnimation != null) {
                        return new a(loadAnimation);
                    }
                    z8 = true;
                } catch (Resources.NotFoundException e7) {
                    throw e7;
                } catch (RuntimeException unused) {
                }
            }
            if (!z8) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, i7);
                    if (loadAnimator != null) {
                        return new a(loadAnimator);
                    }
                } catch (RuntimeException e8) {
                    if (equals) {
                        throw e8;
                    }
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(context, i7);
                    if (loadAnimation2 != null) {
                        return new a(loadAnimation2);
                    }
                }
            }
        }
        return null;
    }
}
