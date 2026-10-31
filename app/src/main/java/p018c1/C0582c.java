package p018c1;

import java.util.List;
import p035e1.C0950b;
import p083k1.C1447a;
import p083k1.C1449c;

/* renamed from: c1.c */
/* loaded from: classes.dex */
public final class C0582c extends AbstractC0585f {

    /* renamed from: g */
    public final /* synthetic */ int f2957g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0582c(int i7, List list) {
        super(list);
        this.f2957g = i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p018c1.AbstractC0580a
    /* renamed from: f */
    public final Object mo2031f(C1447a c1447a, float f7) {
        Object obj;
        switch (this.f2957g) {
            case 0:
                T t7 = c1447a.f6948b;
                if (t7 == 0 || (obj = c1447a.f6949c) == null) {
                    throw new IllegalStateException("Missing values for keyframe.");
                }
                C1449c c1449c = this.f2955e;
                if (c1449c == null) {
                    float floatValue = ((Float) t7).floatValue();
                    return Float.valueOf(((((Float) obj).floatValue() - floatValue) * f7) + floatValue);
                }
                c1447a.f6952f.floatValue();
                m2029d();
                return (Float) c1449c.m3834a(c1447a.f6948b, obj);
            default:
                return (C0950b) c1447a.f6948b;
        }
    }
}
