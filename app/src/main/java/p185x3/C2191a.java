package p185x3;

import android.graphics.Paint;
import android.graphics.Path;
import p181x.C2152a;

/* renamed from: x3.a */
/* loaded from: classes.dex */
public final class C2191a {

    /* renamed from: i */
    public static final int[] f9926i = new int[3];

    /* renamed from: j */
    public static final float[] f9927j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k */
    public static final int[] f9928k = new int[4];

    /* renamed from: l */
    public static final float[] f9929l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a */
    public final Paint f9930a;

    /* renamed from: b */
    public final Paint f9931b;

    /* renamed from: c */
    public final Paint f9932c;

    /* renamed from: d */
    public int f9933d;

    /* renamed from: e */
    public int f9934e;

    /* renamed from: f */
    public int f9935f;

    /* renamed from: g */
    public final Path f9936g = new Path();

    /* renamed from: h */
    public final Paint f9937h;

    public C2191a() {
        Paint paint = new Paint();
        this.f9937h = paint;
        this.f9930a = new Paint();
        m5323a(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f9931b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f9932c = new Paint(paint2);
    }

    /* renamed from: a */
    public final void m5323a(int i7) {
        this.f9933d = C2152a.m5266e(i7, 68);
        this.f9934e = C2152a.m5266e(i7, 20);
        this.f9935f = C2152a.m5266e(i7, 0);
        this.f9930a.setColor(this.f9933d);
    }
}
