package p009b0;

import java.util.Comparator;
import p006a5.C0051a;

/* renamed from: b0.d */
/* loaded from: classes.dex */
public final /* synthetic */ class C0500d implements Comparator {

    /* renamed from: a */
    public final /* synthetic */ int f2514a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f2514a) {
            case 0:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i7 = 0; i7 < bArr.length; i7++) {
                    byte b7 = bArr[i7];
                    byte b8 = bArr2[i7];
                    if (b7 != b8) {
                        return b7 - b8;
                    }
                }
                return 0;
            default:
                C0051a c0051a = (C0051a) obj;
                C0051a c0051a2 = (C0051a) obj2;
                int compare = Integer.compare(c0051a.f138c, c0051a2.f138c);
                return compare == 0 ? Integer.compare(c0051a.f139d, c0051a2.f139d) : compare;
        }
    }
}
