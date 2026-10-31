package p193y3;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: y3.g */
/* loaded from: classes.dex */
public final class C2238g implements InterfaceC2234c {

    /* renamed from: a */
    public final float f10184a;

    public C2238g(float f7) {
        this.f10184a = f7;
    }

    @Override // p193y3.InterfaceC2234c
    /* renamed from: a */
    public final float mo5418a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f10184a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2238g) && this.f10184a == ((C2238g) obj).f10184a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f10184a)});
    }
}
