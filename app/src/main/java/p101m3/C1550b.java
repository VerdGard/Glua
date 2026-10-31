package p101m3;

import android.graphics.drawable.Drawable;
import p033e.C0905c;

/* renamed from: m3.b */
/* loaded from: classes.dex */
public final class C1550b extends C0905c {

    /* renamed from: e */
    public final int f7213e;

    /* renamed from: m */
    public final int f7214m;

    public C1550b(Drawable drawable, int i7, int i8) {
        super(drawable);
        this.f7213e = i7;
        this.f7214m = i8;
    }

    @Override // p033e.C0905c, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f7214m;
    }

    @Override // p033e.C0905c, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f7213e;
    }
}
