package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.appcompat.R$id;
import androidx.appcompat.R$layout;
import androidx.appcompat.R$style;

/* renamed from: androidx.appcompat.widget.n1 */
/* loaded from: classes.dex */
public final class C0251n1 {

    /* renamed from: a */
    public final Context f1006a;

    /* renamed from: b */
    public final View f1007b;

    /* renamed from: c */
    public final TextView f1008c;

    /* renamed from: d */
    public final WindowManager.LayoutParams f1009d;

    /* renamed from: e */
    public final Rect f1010e;

    /* renamed from: f */
    public final int[] f1011f;

    /* renamed from: g */
    public final int[] f1012g;

    public C0251n1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1009d = layoutParams;
        this.f1010e = new Rect();
        this.f1011f = new int[2];
        this.f1012g = new int[2];
        this.f1006a = context;
        View inflate = LayoutInflater.from(context).inflate(R$layout.abc_tooltip, (ViewGroup) null);
        this.f1007b = inflate;
        this.f1008c = (TextView) inflate.findViewById(R$id.message);
        layoutParams.setTitle(C0251n1.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R$style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }
}
