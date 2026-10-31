package androidx.appcompat.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import p189y.InterfaceC2215c;

/* renamed from: androidx.appcompat.widget.s */
/* loaded from: classes.dex */
public class C0263s {

    /* renamed from: c */
    public static final int[] f1088c = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: a */
    public final ProgressBar f1089a;

    /* renamed from: b */
    public Bitmap f1090b;

    public C0263s(ProgressBar progressBar) {
        this.f1089a = progressBar;
    }

    /* renamed from: a */
    public void mo886a(AttributeSet attributeSet, int i7) {
        ProgressBar progressBar = this.f1089a;
        C0233h1 m790m = C0233h1.m790m(progressBar.getContext(), attributeSet, f1088c, i7);
        Drawable m796f = m790m.m796f(0);
        if (m796f != null) {
            if (m796f instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) m796f;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i8 = 0; i8 < numberOfFrames; i8++) {
                    Drawable m887b = m887b(animationDrawable.getFrame(i8), true);
                    m887b.setLevel(10000);
                    animationDrawable2.addFrame(m887b, animationDrawable.getDuration(i8));
                }
                animationDrawable2.setLevel(10000);
                m796f = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(m796f);
        }
        Drawable m796f2 = m790m.m796f(1);
        if (m796f2 != null) {
            progressBar.setProgressDrawable(m887b(m796f2, false));
        }
        m790m.m803n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final Drawable m887b(Drawable drawable, boolean z6) {
        int layerGravity;
        int layerWidth;
        int layerHeight;
        int layerInsetLeft;
        int layerInsetRight;
        int layerInsetTop;
        int layerInsetBottom;
        int layerInsetStart;
        int layerInsetEnd;
        if (drawable instanceof InterfaceC2215c) {
            InterfaceC2215c interfaceC2215c = (InterfaceC2215c) drawable;
            Drawable mo5377b = interfaceC2215c.mo5377b();
            if (mo5377b != null) {
                interfaceC2215c.mo5376a(m887b(mo5377b, z6));
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i7 = 0; i7 < numberOfLayers; i7++) {
                    int id = layerDrawable.getId(i7);
                    drawableArr[i7] = m887b(layerDrawable.getDrawable(i7), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i8 = 0; i8 < numberOfLayers; i8++) {
                    layerDrawable2.setId(i8, layerDrawable.getId(i8));
                    if (Build.VERSION.SDK_INT >= 23) {
                        layerGravity = layerDrawable.getLayerGravity(i8);
                        layerDrawable2.setLayerGravity(i8, layerGravity);
                        layerWidth = layerDrawable.getLayerWidth(i8);
                        layerDrawable2.setLayerWidth(i8, layerWidth);
                        layerHeight = layerDrawable.getLayerHeight(i8);
                        layerDrawable2.setLayerHeight(i8, layerHeight);
                        layerInsetLeft = layerDrawable.getLayerInsetLeft(i8);
                        layerDrawable2.setLayerInsetLeft(i8, layerInsetLeft);
                        layerInsetRight = layerDrawable.getLayerInsetRight(i8);
                        layerDrawable2.setLayerInsetRight(i8, layerInsetRight);
                        layerInsetTop = layerDrawable.getLayerInsetTop(i8);
                        layerDrawable2.setLayerInsetTop(i8, layerInsetTop);
                        layerInsetBottom = layerDrawable.getLayerInsetBottom(i8);
                        layerDrawable2.setLayerInsetBottom(i8, layerInsetBottom);
                        layerInsetStart = layerDrawable.getLayerInsetStart(i8);
                        layerDrawable2.setLayerInsetStart(i8, layerInsetStart);
                        layerInsetEnd = layerDrawable.getLayerInsetEnd(i8);
                        layerDrawable2.setLayerInsetEnd(i8, layerInsetEnd);
                    }
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.f1090b == null) {
                    this.f1090b = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z6 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }
}
