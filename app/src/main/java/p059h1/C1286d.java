package p059h1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import p002a1.C0020g;
import p002a1.C0024k;
import p002a1.InterfaceC0025l;
import p018c1.C0592m;
import p027d1.C0878b;
import p075j1.C1403d;
import p083k1.C1449c;

/* renamed from: h1.d */
/* loaded from: classes.dex */
public final class C1286d extends AbstractC1284b {

    /* renamed from: v */
    public final Paint f6386v;

    /* renamed from: w */
    public final Rect f6387w;

    /* renamed from: x */
    public final Rect f6388x;

    /* renamed from: y */
    public C0592m f6389y;

    public C1286d(C0020g c0020g, C1287e c1287e) {
        super(c0020g, c1287e);
        this.f6386v = new Paint(3);
        this.f6387w = new Rect();
        this.f6388x = new Rect();
    }

    @Override // p059h1.AbstractC1284b, p035e1.InterfaceC0954f
    /* renamed from: b */
    public final <T> void mo1827b(T t7, C1449c c1449c) {
        super.mo1827b(t7, c1449c);
        if (t7 == InterfaceC0025l.f91x) {
            this.f6389y = c1449c == null ? null : new C0592m(c1449c);
        }
    }

    @Override // p059h1.AbstractC1284b, p010b1.InterfaceC0515d
    /* renamed from: h */
    public final void mo1831h(RectF rectF, Matrix matrix) {
        super.mo1831h(rectF, matrix);
        if (m3605p() != null) {
            rectF.set(rectF.left, rectF.top, Math.min(rectF.right, r6.getWidth()), Math.min(rectF.bottom, r6.getHeight()));
            this.f6372l.mapRect(rectF);
        }
    }

    @Override // p059h1.AbstractC1284b
    /* renamed from: k */
    public final void mo3600k(Canvas canvas, Matrix matrix, int i7) {
        Bitmap m3605p = m3605p();
        if (m3605p == null) {
            return;
        }
        float m3756c = C1403d.m3756c();
        Paint paint = this.f6386v;
        paint.setAlpha(i7);
        C0592m c0592m = this.f6389y;
        if (c0592m != null) {
            paint.setColorFilter((ColorFilter) c0592m.mo2030e());
        }
        canvas.save();
        canvas.concat(matrix);
        int width = m3605p.getWidth();
        int height = m3605p.getHeight();
        Rect rect = this.f6387w;
        rect.set(0, 0, width, height);
        int width2 = (int) (m3605p.getWidth() * m3756c);
        int height2 = (int) (m3605p.getHeight() * m3756c);
        Rect rect2 = this.f6388x;
        rect2.set(0, 0, width2, height2);
        canvas.drawBitmap(m3605p, rect, rect2, paint);
        canvas.restore();
    }

    /* renamed from: p */
    public final Bitmap m3605p() {
        C0878b c0878b;
        String str = this.f6374n.f6396g;
        C0020g c0020g = this.f6373m;
        if (c0020g.getCallback() == null) {
            c0878b = null;
        } else {
            C0878b c0878b2 = c0020g.f43Y;
            if (c0878b2 != null) {
                Drawable.Callback callback = c0020g.getCallback();
                Context context = (callback != null && (callback instanceof View)) ? ((View) callback).getContext() : null;
                Context context2 = c0878b2.f4651a;
                if (!((context == null && context2 == null) || (context != null && context2.equals(context)))) {
                    c0020g.f43Y.m2566a();
                    c0020g.f43Y = null;
                }
            }
            if (c0020g.f43Y == null) {
                c0020g.f43Y = new C0878b(c0020g.getCallback(), c0020g.f44Z, c0020g.f46e.f3250d);
            }
            c0878b = c0020g.f43Y;
        }
        if (c0878b == null) {
            return null;
        }
        String str2 = c0878b.f4652b;
        HashMap hashMap = c0878b.f4654d;
        Bitmap bitmap = (Bitmap) hashMap.get(str);
        if (bitmap != null) {
            return bitmap;
        }
        C0024k c0024k = c0878b.f4653c.get(str);
        if (c0024k == null) {
            return null;
        }
        try {
            if (TextUtils.isEmpty(str2)) {
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            }
            InputStream open = c0878b.f4651a.getAssets().open(str2 + c0024k.f67a);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inScaled = true;
            options.inDensity = 160;
            Bitmap decodeStream = BitmapFactory.decodeStream(open, null, options);
            hashMap.put(str, decodeStream);
            return decodeStream;
        } catch (IOException e7) {
            Log.w("LOTTIE", "Unable to open asset.", e7);
            return null;
        }
    }
}
