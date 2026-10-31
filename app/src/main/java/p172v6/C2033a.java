package p172v6;

import p165u6.C1987e;
import p165u6.C1991i;
import p172v6.C2037e;
import p183x1.C2175b;

/* renamed from: v6.a */
/* loaded from: classes.dex */
public class C2033a extends C1987e {
    /* renamed from: d */
    public static void m4925d(C2175b c2175b, int i7) {
        ((int[]) c2175b.f9887b)[c2175b.f9886a] = ((i7 << 6) & 16320) | (c2175b.m5318a() & (-16321));
    }

    /* renamed from: e */
    public static void m4926e(C2175b c2175b, int i7) {
        ((int[]) c2175b.f9887b)[c2175b.f9886a] = ((i7 << 23) & (-8388608)) | (c2175b.m5318a() & 8388607);
    }

    /* renamed from: f */
    public static void m4927f(C2175b c2175b, int i7) {
        ((int[]) c2175b.f9887b)[c2175b.f9886a] = ((i7 << 14) & 8372224) | (c2175b.m5318a() & (-8372225));
    }

    /* renamed from: g */
    public static void m4928g(boolean z6) {
        if (!z6) {
            throw new C1991i("compiler assert failed");
        }
    }

    /* renamed from: h */
    public static C2037e.d[] m4929h(C2037e.d[] dVarArr, int i7) {
        if (dVarArr == null) {
            return new C2037e.d[2];
        }
        if (dVarArr.length >= i7) {
            return dVarArr;
        }
        int length = dVarArr.length * 2;
        C2037e.d[] dVarArr2 = new C2037e.d[length];
        System.arraycopy(dVarArr, 0, dVarArr2, 0, Math.min(dVarArr.length, length));
        return dVarArr2;
    }

    /* renamed from: i */
    public static int[] m4930i(int i7, int[] iArr) {
        int[] iArr2 = new int[i7];
        if (iArr != null) {
            System.arraycopy(iArr, 0, iArr2, 0, Math.min(iArr.length, i7));
        }
        return iArr2;
    }
}
