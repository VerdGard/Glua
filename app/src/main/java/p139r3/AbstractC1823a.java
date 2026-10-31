package p139r3;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import androidx.activity.C0117b;
import com.google.android.material.R$attr;
import p050g0.C1191a;

/* renamed from: r3.a */
/* loaded from: classes.dex */
public abstract class AbstractC1823a<V extends View> {

    /* renamed from: a */
    public final TimeInterpolator f8256a;

    /* renamed from: b */
    public final V f8257b;

    /* renamed from: c */
    public final int f8258c;

    /* renamed from: d */
    public final int f8259d;

    /* renamed from: e */
    public final int f8260e;

    /* renamed from: f */
    public C0117b f8261f;

    public AbstractC1823a(V v5) {
        this.f8257b = v5;
        Context context = v5.getContext();
        this.f8256a = C1832j.m4313d(context, R$attr.motionEasingStandardDecelerateInterpolator, C1191a.m3409b(0.0f, 0.0f, 0.0f, 1.0f));
        this.f8258c = C1832j.m4312c(context, R$attr.motionDurationMedium2, 300);
        this.f8259d = C1832j.m4312c(context, R$attr.motionDurationShort3, 150);
        this.f8260e = C1832j.m4312c(context, R$attr.motionDurationShort2, 100);
    }
}
