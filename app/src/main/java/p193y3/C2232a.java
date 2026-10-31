package p193y3;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: y3.a */
/* loaded from: classes.dex */
public final class C2232a implements InterfaceC2234c {

    /* renamed from: a */
    public final float f10135a;

    public C2232a(float f7) {
        this.f10135a = f7;
    }

    @Override // p193y3.InterfaceC2234c
    /* renamed from: a */
    public final float mo5418a(RectF rectF) {
        return this.f10135a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2232a) && this.f10135a == ((C2232a) obj).f10135a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f10135a)});
    }
}
