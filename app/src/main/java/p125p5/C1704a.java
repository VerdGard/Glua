package p125p5;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import io.github.rosemoe.sora.R$drawable;
import p118o5.InterfaceC1673d;

/* renamed from: p5.a */
/* loaded from: classes.dex */
public class C1704a implements InterfaceC1673d {

    /* renamed from: a */
    public final Drawable f7670a;

    /* renamed from: b */
    public final int f7671b;

    /* renamed from: c */
    public final int f7672c;

    /* renamed from: d */
    public int f7673d = 0;

    public C1704a(Context context) {
        this.f7670a = context.getDrawable(R$drawable.ic_sora_handle_drop).mutate();
        this.f7671b = (int) TypedValue.applyDimension(1, 20.0f, context.getResources().getDisplayMetrics());
        this.f7672c = (int) TypedValue.applyDimension(1, 30.0f, context.getResources().getDisplayMetrics());
    }
}
