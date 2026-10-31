package p075j1;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import p002a1.C0017d;
import p010b1.C0529r;

/* renamed from: j1.d */
/* loaded from: classes.dex */
public final class C1403d {

    /* renamed from: a */
    public static final PathMeasure f6758a = new PathMeasure();

    /* renamed from: b */
    public static final Path f6759b = new Path();

    /* renamed from: c */
    public static final Path f6760c = new Path();

    /* renamed from: d */
    public static final float[] f6761d = new float[4];

    /* renamed from: e */
    public static final float f6762e = (float) Math.sqrt(2.0d);

    /* renamed from: f */
    public static float f6763f = -1.0f;

    /* renamed from: a */
    public static void m3754a(Path path, float f7, float f8, float f9) {
        PathMeasure pathMeasure = f6758a;
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f7 == 1.0f && f8 == 0.0f) {
            C0017d.m96u();
            return;
        }
        if (length < 1.0f || Math.abs((f8 - f7) - 1.0f) < 0.01d) {
            C0017d.m96u();
            return;
        }
        float f10 = f7 * length;
        float f11 = f8 * length;
        float f12 = f9 * length;
        float min = Math.min(f10, f11) + f12;
        float max = Math.max(f10, f11) + f12;
        if (min >= length && max >= length) {
            min = C0017d.m97v(min, length);
            max = C0017d.m97v(max, length);
        }
        if (min < 0.0f) {
            min = C0017d.m97v(min, length);
        }
        if (max < 0.0f) {
            max = C0017d.m97v(max, length);
        }
        if (min == max) {
            path.reset();
        } else {
            if (min >= max) {
                min -= length;
            }
            Path path2 = f6759b;
            path2.reset();
            pathMeasure.getSegment(min, max, path2, true);
            Path path3 = f6760c;
            if (max > length) {
                path3.reset();
                pathMeasure.getSegment(0.0f, max % length, path3, true);
            } else {
                if (min < 0.0f) {
                    path3.reset();
                    pathMeasure.getSegment(min + length, length, path3, true);
                }
                path.set(path2);
            }
            path2.addPath(path3);
            path.set(path2);
        }
        C0017d.m96u();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static void m3755b(Path path, C0529r c0529r) {
        if (c0529r == null) {
            return;
        }
        m3754a(path, ((Float) c0529r.f2661c.mo2030e()).floatValue() / 100.0f, ((Float) c0529r.f2662d.mo2030e()).floatValue() / 100.0f, ((Float) c0529r.f2663e.mo2030e()).floatValue() / 360.0f);
    }

    /* renamed from: c */
    public static float m3756c() {
        if (f6763f == -1.0f) {
            f6763f = Resources.getSystem().getDisplayMetrics().density;
        }
        return f6763f;
    }

    /* renamed from: d */
    public static float m3757d(Matrix matrix) {
        float[] fArr = f6761d;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f7 = f6762e;
        fArr[2] = f7;
        fArr[3] = f7;
        matrix.mapPoints(fArr);
        return ((float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1])) / 2.0f;
    }
}
