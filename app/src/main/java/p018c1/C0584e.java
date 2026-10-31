package p018c1;

import android.ext.C0091c;
import java.util.List;
import p083k1.C1447a;
import p083k1.C1449c;
import p083k1.C1450d;

/* renamed from: c1.e */
/* loaded from: classes.dex */
public final class C0584e extends AbstractC0585f {

    /* renamed from: g */
    public final /* synthetic */ int f2960g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0584e(int i7, List list) {
        super(list);
        this.f2960g = i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p018c1.AbstractC0580a
    /* renamed from: f */
    public final Object mo2031f(C1447a c1447a, float f7) {
        T t7;
        Object obj;
        switch (this.f2960g) {
            case 0:
                T t8 = c1447a.f6948b;
                if (t8 == 0 || (obj = c1447a.f6949c) == null) {
                    throw new IllegalStateException("Missing values for keyframe.");
                }
                C1449c c1449c = this.f2955e;
                if (c1449c == null) {
                    return Integer.valueOf((int) ((f7 * (((Integer) obj).intValue() - r5)) + ((Integer) t8).intValue()));
                }
                c1447a.f6952f.floatValue();
                m2029d();
                return (Integer) c1449c.m3834a(c1447a.f6948b, obj);
            default:
                T t9 = c1447a.f6948b;
                if (t9 == 0 || (t7 = c1447a.f6949c) == 0) {
                    throw new IllegalStateException("Missing values for keyframe.");
                }
                C1450d c1450d = (C1450d) t9;
                C1450d c1450d2 = (C1450d) t7;
                C1449c c1449c2 = this.f2955e;
                if (c1449c2 != null) {
                    c1447a.f6952f.floatValue();
                    m2029d();
                    return (C1450d) c1449c2.m3834a(c1450d, c1450d2);
                }
                float f8 = c1450d2.f6962a;
                float f9 = c1450d.f6962a;
                float m227e = C0091c.m227e(f8, f9, f7, f9);
                float f10 = c1450d2.f6963b;
                float f11 = c1450d.f6963b;
                return new C1450d(m227e, C0091c.m227e(f10, f11, f7, f11));
        }
    }
}
