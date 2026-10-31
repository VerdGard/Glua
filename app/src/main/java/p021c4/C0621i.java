package p021c4;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import p193y3.C2237f;
import p193y3.C2240i;

/* renamed from: c4.i */
/* loaded from: classes.dex */
public class C0621i extends C2237f {

    /* renamed from: N1 */
    public static final /* synthetic */ int f3048N1 = 0;

    /* renamed from: M1 */
    public a f3049M1;

    /* renamed from: c4.i$a */
    public static final class a extends C2237f.b {

        /* renamed from: v */
        public final RectF f3050v;

        public a(a aVar) {
            super(aVar);
            this.f3050v = aVar.f3050v;
        }

        @Override // p193y3.C2237f.b, android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            b bVar = new b(this);
            bVar.invalidateSelf();
            return bVar;
        }

        public a(C2240i c2240i, RectF rectF) {
            super(c2240i);
            this.f3050v = rectF;
        }
    }

    @TargetApi(18)
    /* renamed from: c4.i$b */
    public static class b extends C0621i {
        public b(a aVar) {
            super(aVar);
        }

        @Override // p193y3.C2237f
        /* renamed from: g */
        public final void mo2064g(Canvas canvas) {
            if (this.f3049M1.f3050v.isEmpty()) {
                super.mo2064g(canvas);
                return;
            }
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutRect(this.f3049M1.f3050v);
            } else {
                canvas.clipRect(this.f3049M1.f3050v, Region.Op.DIFFERENCE);
            }
            super.mo2064g(canvas);
            canvas.restore();
        }
    }

    public C0621i(a aVar) {
        super(aVar);
        this.f3049M1 = aVar;
    }

    @Override // p193y3.C2237f, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f3049M1 = new a(this.f3049M1);
        return this;
    }

    /* renamed from: o */
    public final void m2063o(float f7, float f8, float f9, float f10) {
        RectF rectF = this.f3049M1.f3050v;
        if (f7 == rectF.left && f8 == rectF.top && f9 == rectF.right && f10 == rectF.bottom) {
            return;
        }
        rectF.set(f7, f8, f9, f10);
        invalidateSelf();
    }
}
