package p071i5;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.PixelCopy;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.PopupWindow;
import io.github.rosemoe.sora.R$id;
import io.github.rosemoe.sora.R$layout;
import p055g5.C1245b;

/* renamed from: i5.h0 */
/* loaded from: classes.dex */
public final class C1371h0 implements InterfaceC1375l {

    /* renamed from: X */
    public final float f6657X;

    /* renamed from: Y */
    public int f6658Y;

    /* renamed from: Z */
    public int f6659Z;

    /* renamed from: c */
    public final C1245b f6660c;

    /* renamed from: e */
    public final PopupWindow f6661e;

    /* renamed from: m */
    public final ImageView f6662m;

    /* renamed from: s */
    public final Paint f6663s;

    /* renamed from: w1 */
    public long f6664w1;

    /* renamed from: x1 */
    public boolean f6665x1 = true;

    /* renamed from: y1 */
    public final C1245b f6666y1;

    /* renamed from: z1 */
    public final float f6667z1;

    public C1371h0(C1245b c1245b) {
        this.f6660c = c1245b;
        this.f6666y1 = c1245b;
        PopupWindow popupWindow = new PopupWindow();
        this.f6661e = popupWindow;
        popupWindow.setElevation(c1245b.getDpUnit() * 4.0f);
        View inflate = LayoutInflater.from(c1245b.getContext()).inflate(R$layout.magnifier_popup, (ViewGroup) null);
        this.f6662m = (ImageView) inflate.findViewById(R$id.magnifier_image_view);
        popupWindow.setHeight((int) (c1245b.getDpUnit() * 70.0f));
        popupWindow.setWidth((int) (c1245b.getDpUnit() * 100.0f));
        popupWindow.setContentView(inflate);
        this.f6657X = TypedValue.applyDimension(2, 28.0f, inflate.getResources().getDisplayMetrics());
        this.f6667z1 = 1.25f;
        this.f6663s = new Paint();
    }

    /* renamed from: a */
    public final void m3728a() {
        this.f6661e.dismiss();
    }

    /* JADX WARN: Type inference failed for: r4v7, types: [i5.g0] */
    /* renamed from: b */
    public final void m3729b() {
        int i7;
        PopupWindow popupWindow = this.f6661e;
        if (popupWindow.isShowing()) {
            int i8 = Build.VERSION.SDK_INT;
            float f7 = this.f6667z1;
            C1245b c1245b = this.f6660c;
            if (i8 >= 26 && (c1245b.getContext() instanceof Activity)) {
                Activity activity = (Activity) c1245b.getContext();
                int width = (int) (popupWindow.getWidth() / f7);
                int height = (int) (popupWindow.getHeight() / f7);
                int max = Math.max(this.f6658Y - (width / 2), 0);
                int max2 = Math.max(this.f6659Z - (height / 2), 0);
                int min = Math.min(max + width, c1245b.getWidth());
                int min2 = Math.min(max2 + height, c1245b.getHeight());
                if (min - max < width) {
                    max = Math.max(0, min - width);
                }
                if (min2 - max2 < height) {
                    max2 = Math.max(0, min2 - height);
                }
                int i9 = min - max;
                if (i9 <= 0 || (i7 = min2 - max2) <= 0) {
                    m3728a();
                    return;
                }
                int[] iArr = new int[2];
                c1245b.getLocationInWindow(iArr);
                final long currentTimeMillis = System.currentTimeMillis();
                this.f6664w1 = currentTimeMillis;
                final Bitmap createBitmap = Bitmap.createBitmap(i9, i7, Bitmap.Config.ARGB_8888);
                try {
                    Window window = activity.getWindow();
                    int i10 = iArr[0];
                    int i11 = iArr[1];
                    PixelCopy.request(window, new Rect(max + i10, max2 + i11, i10 + min, i11 + min2), createBitmap, (PixelCopy.OnPixelCopyFinishedListener) new PixelCopy.OnPixelCopyFinishedListener() { // from class: i5.g0
                        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                        public final void onPixelCopyFinished(int i12) {
                            C1371h0 c1371h0 = C1371h0.this;
                            long j7 = currentTimeMillis;
                            Bitmap bitmap = createBitmap;
                            if (j7 != c1371h0.f6664w1) {
                                return;
                            }
                            if (i12 != 0) {
                                Log.w("Magnifier", "Failed to copy pixels, error = " + i12);
                                return;
                            }
                            PopupWindow popupWindow2 = c1371h0.f6661e;
                            Bitmap createBitmap2 = Bitmap.createBitmap(popupWindow2.getWidth(), popupWindow2.getHeight(), Bitmap.Config.ARGB_8888);
                            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, popupWindow2.getWidth(), popupWindow2.getHeight(), true);
                            bitmap.recycle();
                            Canvas canvas = new Canvas(createBitmap2);
                            Paint paint = c1371h0.f6663s;
                            paint.reset();
                            paint.setAntiAlias(true);
                            canvas.drawARGB(0, 0, 0, 0);
                            float width2 = popupWindow2.getWidth();
                            float height2 = popupWindow2.getHeight();
                            C1245b c1245b2 = c1371h0.f6660c;
                            canvas.drawRoundRect(0.0f, 0.0f, width2, height2, c1245b2.getDpUnit() * 6.0f, c1245b2.getDpUnit() * 6.0f, paint);
                            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                            canvas.drawBitmap(createScaledBitmap, 0.0f, 0.0f, paint);
                            createScaledBitmap.recycle();
                            c1371h0.f6662m.setImageBitmap(createBitmap2);
                        }
                    }, c1245b.getHandler());
                    return;
                } catch (IllegalArgumentException unused) {
                    m3728a();
                    if (createBitmap.isRecycled()) {
                        return;
                    }
                    createBitmap.recycle();
                    return;
                }
            }
            if (popupWindow.getWidth() <= 0 || popupWindow.getHeight() <= 0) {
                m3728a();
                return;
            }
            Bitmap createBitmap2 = Bitmap.createBitmap(popupWindow.getWidth(), popupWindow.getHeight(), Bitmap.Config.ARGB_8888);
            int width2 = (int) (popupWindow.getWidth() / f7);
            int height2 = (int) (popupWindow.getHeight() / f7);
            int max3 = Math.max(this.f6658Y - (width2 / 2), 0);
            int max4 = Math.max(this.f6659Z - (height2 / 2), 0);
            int min3 = Math.min(max3 + width2, c1245b.getWidth());
            int min4 = Math.min(max4 + height2, c1245b.getHeight());
            if (min3 - max3 < width2) {
                max3 = Math.max(0, min3 - width2);
            }
            if (min4 - max4 < height2) {
                max4 = Math.max(0, min4 - height2);
            }
            if (min3 - max3 <= 0 || min4 - max4 <= 0) {
                m3728a();
                createBitmap2.recycle();
                return;
            }
            Bitmap createBitmap3 = Bitmap.createBitmap(width2, height2, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap3);
            canvas.translate(-max3, -max4);
            c1245b.draw(canvas);
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap3, popupWindow.getWidth(), popupWindow.getHeight(), true);
            createBitmap3.recycle();
            Canvas canvas2 = new Canvas(createBitmap2);
            Paint paint = this.f6663s;
            paint.reset();
            paint.setAntiAlias(true);
            canvas2.drawARGB(0, 0, 0, 0);
            canvas2.drawRoundRect(0.0f, 0.0f, popupWindow.getWidth(), popupWindow.getHeight(), c1245b.getDpUnit() * 6.0f, c1245b.getDpUnit() * 6.0f, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas2.drawBitmap(createScaledBitmap, 0.0f, 0.0f, paint);
            createScaledBitmap.recycle();
            this.f6662m.setImageBitmap(createBitmap2);
        }
    }
}
