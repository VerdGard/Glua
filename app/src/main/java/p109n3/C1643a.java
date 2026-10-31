package p109n3;

import android.content.Context;
import androidx.activity.C0143v;
import com.google.android.material.R$attr;
import p163u3.C1971b;

/* renamed from: n3.a */
/* loaded from: classes.dex */
public final class C1643a {

    /* renamed from: f */
    public static final int f7473f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a */
    public final boolean f7474a;

    /* renamed from: b */
    public final int f7475b;

    /* renamed from: c */
    public final int f7476c;

    /* renamed from: d */
    public final int f7477d;

    /* renamed from: e */
    public final float f7478e;

    public C1643a(Context context) {
        boolean m4583b = C1971b.m4583b(R$attr.elevationOverlayEnabled, context, false);
        int m398A = C0143v.m398A(context, R$attr.elevationOverlayColor, 0);
        int m398A2 = C0143v.m398A(context, R$attr.elevationOverlayAccentColor, 0);
        int m398A3 = C0143v.m398A(context, R$attr.colorSurface, 0);
        float f7 = context.getResources().getDisplayMetrics().density;
        this.f7474a = m4583b;
        this.f7475b = m398A;
        this.f7476c = m398A2;
        this.f7477d = m398A3;
        this.f7478e = f7;
    }
}
