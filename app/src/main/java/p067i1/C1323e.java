package p067i1;

import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.JsonReader;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.airbnb.lottie.C0680a;
import java.lang.ref.WeakReference;
import p002a1.C0017d;
import p050g0.C1191a;
import p075j1.C1403d;
import p083k1.C1447a;
import p089l.C1482p;

/* renamed from: i1.e */
/* loaded from: classes.dex */
public final class C1323e {

    /* renamed from: a */
    public static final LinearInterpolator f6521a = new LinearInterpolator();

    /* renamed from: b */
    public static C1482p<WeakReference<Interpolator>> f6522b;

    /* renamed from: a */
    public static <T> C1447a<T> m3686a(JsonReader jsonReader, C0680a c0680a, float f7, InterfaceC1328j<T> interfaceC1328j, boolean z6) {
        Interpolator interpolator;
        Interpolator interpolator2;
        T t7;
        WeakReference<Interpolator> m3880c;
        if (!z6) {
            return new C1447a<>(interfaceC1328j.mo105c(jsonReader, f7));
        }
        jsonReader.beginObject();
        PointF pointF = null;
        PointF pointF2 = null;
        T t8 = null;
        T t9 = null;
        PointF pointF3 = null;
        PointF pointF4 = null;
        boolean z7 = false;
        float f8 = 0.0f;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "e":
                    t8 = interfaceC1328j.mo105c(jsonReader, f7);
                    break;
                case "h":
                    if (jsonReader.nextInt() != 1) {
                        z7 = false;
                        break;
                    } else {
                        z7 = true;
                        break;
                    }
                case "i":
                    pointF2 = C1322d.m3683b(jsonReader, f7);
                    break;
                case "o":
                    pointF = C1322d.m3683b(jsonReader, f7);
                    break;
                case "s":
                    t9 = interfaceC1328j.mo105c(jsonReader, f7);
                    break;
                case "t":
                    f8 = (float) jsonReader.nextDouble();
                    break;
                case "ti":
                    pointF3 = C1322d.m3683b(jsonReader, f7);
                    break;
                case "to":
                    pointF4 = C1322d.m3683b(jsonReader, f7);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (z7) {
            interpolator2 = f6521a;
            t7 = t9;
        } else {
            if (pointF == null || pointF2 == null) {
                interpolator = f6521a;
            } else {
                float f9 = -f7;
                pointF.x = C0017d.m89n(pointF.x, f9, f7);
                pointF.y = C0017d.m89n(pointF.y, -100.0f, 100.0f);
                pointF2.x = C0017d.m89n(pointF2.x, f9, f7);
                float m89n = C0017d.m89n(pointF2.y, -100.0f, 100.0f);
                pointF2.y = m89n;
                float f10 = pointF.x;
                float f11 = pointF.y;
                float f12 = pointF2.x;
                PathMeasure pathMeasure = C1403d.f6758a;
                int i7 = f10 != 0.0f ? (int) (527 * f10) : 17;
                if (f11 != 0.0f) {
                    i7 = (int) (i7 * 31 * f11);
                }
                if (f12 != 0.0f) {
                    i7 = (int) (i7 * 31 * f12);
                }
                if (m89n != 0.0f) {
                    i7 = (int) (i7 * 31 * m89n);
                }
                synchronized (C1323e.class) {
                    if (f6522b == null) {
                        f6522b = new C1482p<>();
                    }
                    m3880c = f6522b.m3880c(i7);
                }
                interpolator = m3880c != null ? m3880c.get() : null;
                if (m3880c == null || interpolator == null) {
                    interpolator = C1191a.m3409b(pointF.x / f7, pointF.y / f7, pointF2.x / f7, pointF2.y / f7);
                    try {
                        m3687b(i7, new WeakReference(interpolator));
                    } catch (ArrayIndexOutOfBoundsException unused) {
                    }
                }
            }
            interpolator2 = interpolator;
            t7 = t8;
        }
        C1447a<T> c1447a = new C1447a<>(c0680a, t9, t7, interpolator2, f8, null);
        c1447a.f6955i = pointF4;
        c1447a.f6956j = pointF3;
        return c1447a;
    }

    /* renamed from: b */
    public static void m3687b(int i7, WeakReference<Interpolator> weakReference) {
        synchronized (C1323e.class) {
            f6522b.m3881d(i7, weakReference);
        }
    }
}
