package p188x6;

import android.ext.Tools;
import java.lang.reflect.Array;
import java.util.Map;
import p165u6.AbstractC1984c0;
import p180w6.AbstractC2150s;
import p188x6.C2201b;

/* renamed from: x6.g */
/* loaded from: classes.dex */
public abstract class AbstractC2206g extends AbstractC2150s {

    /* renamed from: g2 */
    public final C2201b.c[] f10009g2;

    /* renamed from: h2 */
    public final C2201b.c f10010h2;

    /* renamed from: i2 */
    public final C2201b.c f10011i2;

    /* renamed from: j2 */
    public final Class f10012j2;

    public AbstractC2206g(Class[] clsArr, int i7) {
        int i8 = 0;
        boolean z6 = (i7 & Tools.Semaphore.f159S7) != 0;
        int length = clsArr.length;
        this.f10009g2 = new C2201b.c[z6 ? length - 1 : length];
        while (true) {
            C2201b.c[] cVarArr = this.f10009g2;
            if (i8 >= cVarArr.length) {
                break;
            }
            cVarArr[i8] = C2201b.m5340b(clsArr[i8]);
            i8++;
        }
        this.f10010h2 = z6 ? C2201b.m5340b(clsArr[clsArr.length - 1]) : null;
        if (z6) {
            Class<?> componentType = clsArr[clsArr.length - 1].getComponentType();
            this.f10012j2 = componentType;
            this.f10011i2 = C2201b.m5340b(componentType);
        }
    }

    /* renamed from: I2 */
    public final Object[] m5347I2(AbstractC1984c0 abstractC1984c0) {
        int i7 = 0;
        C2201b.c[] cVarArr = this.f10009g2;
        C2201b.c cVar = this.f10010h2;
        if (cVar == null) {
            int length = cVarArr.length;
            Object[] objArr = new Object[length];
            while (i7 < length) {
                int i8 = i7 + 1;
                objArr[i7] = cVarArr[i7].mo5342a(abstractC1984c0.mo4623t(i8));
                i7 = i8;
            }
            return objArr;
        }
        int mo4621I = abstractC1984c0.mo4621I();
        Object[] objArr2 = new Object[cVarArr.length + 1];
        int i9 = 0;
        while (i9 < cVarArr.length) {
            int i10 = i9 + 1;
            objArr2[i9] = cVarArr[i9].mo5342a(abstractC1984c0.mo4623t(i10));
            i9 = i10;
        }
        if (mo4621I != cVarArr.length + 1 || cVar.mo5343b(abstractC1984c0.mo4623t(cVarArr.length + 1)) >= 256) {
            Object newInstance = Array.newInstance((Class<?>) this.f10012j2, Math.max(abstractC1984c0.mo4621I() - cVarArr.length, 0));
            int length2 = cVarArr.length;
            while (length2 < mo4621I) {
                int length3 = length2 - cVarArr.length;
                length2++;
                Array.set(newInstance, length3, this.f10011i2.mo5342a(abstractC1984c0.mo4623t(length2)));
            }
            objArr2[cVarArr.length] = newInstance;
        } else {
            objArr2[cVarArr.length] = cVar.mo5342a(abstractC1984c0.mo4623t(cVarArr.length + 1));
        }
        return objArr2;
    }

    /* renamed from: J2 */
    public final int m5348J2(AbstractC1984c0 abstractC1984c0) {
        int i7;
        int mo4621I = abstractC1984c0.mo4621I();
        C2201b.c[] cVarArr = this.f10009g2;
        int i8 = 0;
        if (mo4621I > cVarArr.length) {
            Map map = C2201b.f9977a;
            i7 = (mo4621I - cVarArr.length) * Tools.Semaphore.f160S8;
        } else {
            i7 = 0;
        }
        while (i8 < cVarArr.length) {
            C2201b.c cVar = cVarArr[i8];
            i8++;
            i7 += cVar.mo5343b(abstractC1984c0.mo4623t(i8));
        }
        C2201b.c cVar2 = this.f10010h2;
        if (cVar2 == null) {
            return i7;
        }
        int length = cVarArr.length + 1;
        C2201b.c cVar3 = this.f10011i2;
        if (mo4621I == length) {
            return i7 + Math.min(cVar2.mo5343b(abstractC1984c0.mo4623t(cVarArr.length + 1)), cVar3.mo5343b(abstractC1984c0.mo4623t(cVarArr.length + 1)));
        }
        int length2 = cVarArr.length;
        while (length2 < mo4621I) {
            length2++;
            i7 += cVar3.mo5343b(abstractC1984c0.mo4623t(length2));
        }
        return i7;
    }
}
