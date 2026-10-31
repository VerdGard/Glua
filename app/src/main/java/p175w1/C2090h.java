package p175w1;

import android.ext.Tools;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.reflect.Field;

/* renamed from: w1.h */
/* loaded from: classes.dex */
public final class C2090h extends EditText implements InterfaceC2092i {

    /* renamed from: e */
    public static volatile a[] f9512e = new a[0];

    /* renamed from: c */
    public int f9513c;

    /* renamed from: w1.h$a */
    public static class a {

        /* renamed from: a */
        public int f9514a;

        /* renamed from: b */
        public float f9515b;

        /* renamed from: c */
        public float f9516c;

        /* renamed from: d */
        public int f9517d;

        /* renamed from: e */
        public float f9518e;
    }

    /* renamed from: a */
    public static void m5148a(EditText editText) {
        int i7;
        int i8;
        int[] iArr = View.ENABLED_FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET;
        Drawable background = editText.getBackground();
        if (background != null) {
            int dp2px = (int) Tools.dp2px(36.0f);
            Rect copyBounds = background.copyBounds();
            int[] state = background.getState();
            background.setBounds(0, 0, dp2px, dp2px);
            background.setState(iArr);
            try {
                Bitmap createBitmap = Bitmap.createBitmap(dp2px, dp2px, Bitmap.Config.ARGB_8888);
                background.draw(new Canvas(createBitmap));
                int i9 = dp2px / 2;
                i7 = createBitmap.getPixel(i9, i9);
                background.setBounds(copyBounds);
                background.setState(state);
            } catch (OutOfMemoryError unused) {
                return;
            }
        } else {
            i7 = -16777216;
        }
        int colorForState = editText.getTextColors().getColorForState(iArr, editText.getCurrentTextColor());
        try {
            try {
                i8 = editText.getHighlightColor();
            } catch (Throwable unused2) {
                i8 = 0;
            }
        } catch (Throwable unused3) {
            Field declaredField = TextView.class.getDeclaredField("mHighlightColor");
            declaredField.setAccessible(true);
            i8 = declaredField.getInt(editText);
        }
        int m5151d = m5151d(colorForState, i7);
        int m5151d2 = m5151d(i8, i7);
        float[] fArr = {2.0f, 50.0f, 150.0f};
        if (m5149b(m5151d, i7, new float[]{4.5f, 125.0f, 500.0f}) || m5149b(m5151d, m5151d2, fArr) || m5149b(m5151d2, i7, fArr)) {
            editText.setTextColor(-1);
            editText.setHighlightColor(-6262672);
        }
    }

    /* renamed from: b */
    public static boolean m5149b(int i7, int i8, float[] fArr) {
        a aVar;
        a[] aVarArr = f9512e;
        int length = aVarArr.length;
        int i9 = 0;
        while (true) {
            if (i9 >= length) {
                aVar = null;
                break;
            }
            aVar = aVarArr[i9];
            if (aVar.f9517d == i7 && aVar.f9514a == i8) {
                break;
            }
            i9++;
        }
        if (aVar == null) {
            aVar = new a();
            aVar.f9517d = i7;
            aVar.f9514a = i8;
            double m5150c = m5150c(i7) + 0.05d;
            double m5150c2 = m5150c(i8) + 0.05d;
            aVar.f9518e = (float) (m5150c > m5150c2 ? m5150c / m5150c2 : m5150c2 / m5150c);
            aVar.f9515b = (float) Math.abs((((Color.blue(i7) * 114) + ((Color.green(i7) * 587) + (Color.red(i7) * 299))) / 1000.0d) - (((Color.blue(i8) * 114) + ((Color.green(i8) * 587) + (Color.red(i8) * 299))) / 1000.0d));
            int red = Color.red(i7);
            int green = Color.green(i7);
            int blue = Color.blue(i7);
            int red2 = Color.red(i8);
            int green2 = Color.green(i8);
            int blue2 = Color.blue(i8);
            aVar.f9516c = (Math.max(blue, blue2) - Math.min(blue, blue2)) + (Math.max(green, green2) - Math.min(green, green2)) + (Math.max(red, red2) - Math.min(red, red2));
            int length2 = aVarArr.length;
            a[] aVarArr2 = new a[length2 + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length2);
            aVarArr2[length2] = aVar;
            f9512e = aVarArr2;
        }
        return aVar.f9518e < fArr[0] || aVar.f9515b < fArr[1] || aVar.f9516c < fArr[2];
    }

    /* renamed from: c */
    public static double m5150c(int i7) {
        double red = Color.red(i7) / 255.0d;
        double green = Color.green(i7) / 255.0d;
        double blue = Color.blue(i7) / 255.0d;
        return ((blue <= 0.03928d ? blue / 12.92d : Math.pow((blue + 0.055d) / 1.055d, 2.4d)) * 0.0722d) + ((green <= 0.03928d ? green / 12.92d : Math.pow((green + 0.055d) / 1.055d, 2.4d)) * 0.7152d) + ((red <= 0.03928d ? red / 12.92d : Math.pow((red + 0.055d) / 1.055d, 2.4d)) * 0.2126d);
    }

    /* renamed from: d */
    public static int m5151d(int i7, int i8) {
        int alpha = Color.alpha(i7);
        int i9 = -16777216;
        for (int i10 = 0; i10 < 3; i10++) {
            int i11 = i10 * 8;
            i9 |= ((((255 - alpha) * ((i8 >> i11) & 255)) + (((i7 >> i11) & 255) * alpha)) / 255) << i11;
        }
        return i9;
    }

    @Override // p175w1.InterfaceC2092i
    public int getDataType() {
        return this.f9513c;
    }

    @Override // p175w1.InterfaceC2092i
    public void setDataType(int i7) {
        this.f9513c = i7;
    }
}
