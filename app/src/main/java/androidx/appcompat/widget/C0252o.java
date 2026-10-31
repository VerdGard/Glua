package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.appcompat.R$attr;
import p025d.C0872a;

/* renamed from: androidx.appcompat.widget.o */
/* loaded from: classes.dex */
public class C0252o extends ImageButton {

    /* renamed from: c */
    public final C0222e f1013c;

    /* renamed from: e */
    public final C0255p f1014e;

    /* renamed from: m */
    public boolean f1015m;

    public C0252o(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.imageButtonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0252o(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        C0224e1.m743a(context);
        this.f1015m = false;
        C0218c1.m702a(getContext(), this);
        C0222e c0222e = new C0222e(this);
        this.f1013c = c0222e;
        c0222e.m737d(attributeSet, i7);
        C0255p c0255p = new C0255p(this);
        this.f1014e = c0255p;
        c0255p.m868b(attributeSet, i7);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0222e c0222e = this.f1013c;
        if (c0222e != null) {
            c0222e.m734a();
        }
        C0255p c0255p = this.f1014e;
        if (c0255p != null) {
            c0255p.m867a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0222e c0222e = this.f1013c;
        if (c0222e != null) {
            return c0222e.m735b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0222e c0222e = this.f1013c;
        if (c0222e != null) {
            return c0222e.m736c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C0227f1 c0227f1;
        C0255p c0255p = this.f1014e;
        if (c0255p == null || (c0227f1 = c0255p.f1029b) == null) {
            return null;
        }
        return c0227f1.f889a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C0227f1 c0227f1;
        C0255p c0255p = this.f1014e;
        if (c0255p == null || (c0227f1 = c0255p.f1029b) == null) {
            return null;
        }
        return c0227f1.f890b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return ((this.f1014e.f1028a.getBackground() instanceof RippleDrawable) ^ true) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0222e c0222e = this.f1013c;
        if (c0222e != null) {
            c0222e.m738e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        C0222e c0222e = this.f1013c;
        if (c0222e != null) {
            c0222e.m739f(i7);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0255p c0255p = this.f1014e;
        if (c0255p != null) {
            c0255p.m867a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C0255p c0255p = this.f1014e;
        if (c0255p != null && drawable != null && !this.f1015m) {
            c0255p.f1031d = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (c0255p != null) {
            c0255p.m867a();
            if (this.f1015m) {
                return;
            }
            ImageView imageView = c0255p.f1028a;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(c0255p.f1031d);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i7) {
        super.setImageLevel(i7);
        this.f1015m = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i7) {
        Drawable drawable;
        C0255p c0255p = this.f1014e;
        ImageView imageView = c0255p.f1028a;
        if (i7 != 0) {
            drawable = C0872a.m2561a(imageView.getContext(), i7);
            if (drawable != null) {
                C0244l0.m842a(drawable);
            }
        } else {
            drawable = null;
        }
        imageView.setImageDrawable(drawable);
        c0255p.m867a();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0255p c0255p = this.f1014e;
        if (c0255p != null) {
            c0255p.m867a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0222e c0222e = this.f1013c;
        if (c0222e != null) {
            c0222e.m741h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0222e c0222e = this.f1013c;
        if (c0222e != null) {
            c0222e.m742i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0255p c0255p = this.f1014e;
        if (c0255p != null) {
            if (c0255p.f1029b == null) {
                c0255p.f1029b = new C0227f1();
            }
            C0227f1 c0227f1 = c0255p.f1029b;
            c0227f1.f889a = colorStateList;
            c0227f1.f892d = true;
            c0255p.m867a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0255p c0255p = this.f1014e;
        if (c0255p != null) {
            if (c0255p.f1029b == null) {
                c0255p.f1029b = new C0227f1();
            }
            C0227f1 c0227f1 = c0255p.f1029b;
            c0227f1.f890b = mode;
            c0227f1.f891c = true;
            c0255p.m867a();
        }
    }
}
