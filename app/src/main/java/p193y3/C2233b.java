package p193y3;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: y3.b */
/* loaded from: classes.dex */
public final class C2233b implements InterfaceC2234c {

    /* renamed from: a */
    public final InterfaceC2234c f10136a;

    /* renamed from: b */
    public final float f10137b;

    public C2233b(float f7, InterfaceC2234c interfaceC2234c) {
        while (interfaceC2234c instanceof C2233b) {
            interfaceC2234c = ((C2233b) interfaceC2234c).f10136a;
            f7 += ((C2233b) interfaceC2234c).f10137b;
        }
        this.f10136a = interfaceC2234c;
        this.f10137b = f7;
    }

    @Override // p193y3.InterfaceC2234c
    /* renamed from: a */
    public final float mo5418a(RectF rectF) {
        return Math.max(0.0f, this.f10136a.mo5418a(rectF) + this.f10137b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2233b)) {
            return false;
        }
        C2233b c2233b = (C2233b) obj;
        return this.f10136a.equals(c2233b.f10136a) && this.f10137b == c2233b.f10137b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10136a, Float.valueOf(this.f10137b)});
    }
}
