package p195y5;

import androidx.activity.C0143v;
import p032d6.C0898f;

/* renamed from: y5.c */
/* loaded from: classes.dex */
public class C2255c extends C0143v {
    /* renamed from: F0 */
    public static final void m5463F0(int i7, int i8, int i9, int[] iArr, int[] iArr2) {
        C0898f.m2606e(iArr, "<this>");
        C0898f.m2606e(iArr2, "destination");
        System.arraycopy(iArr, i8, iArr2, i7, i9 - i8);
    }

    /* renamed from: G0 */
    public static final void m5464G0(Object[] objArr, Object[] objArr2, int i7, int i8, int i9) {
        C0898f.m2606e(objArr, "<this>");
        C0898f.m2606e(objArr2, "destination");
        System.arraycopy(objArr, i8, objArr2, i7, i9 - i8);
    }

    /* renamed from: H0 */
    public static /* synthetic */ void m5465H0(int[] iArr, int[] iArr2, int i7, int i8, int i9) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 8) != 0) {
            i8 = iArr.length;
        }
        m5463F0(i7, 0, i8, iArr, iArr2);
    }

    /* renamed from: I0 */
    public static /* synthetic */ void m5466I0(Object[] objArr, Object[] objArr2, int i7, int i8, int i9) {
        if ((i9 & 4) != 0) {
            i7 = 0;
        }
        if ((i9 & 8) != 0) {
            i8 = objArr.length;
        }
        m5464G0(objArr, objArr2, 0, i7, i8);
    }
}
