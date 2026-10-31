package p009b0;

import android.util.Base64;
import java.util.List;

/* renamed from: b0.f */
/* loaded from: classes.dex */
public final class C0502f {

    /* renamed from: a */
    public final String f2516a;

    /* renamed from: b */
    public final String f2517b;

    /* renamed from: c */
    public final String f2518c;

    /* renamed from: d */
    public final List<List<byte[]>> f2519d;

    /* renamed from: e */
    public final String f2520e;

    public C0502f(String str, String str2, String str3, List<List<byte[]>> list) {
        str.getClass();
        this.f2516a = str;
        str2.getClass();
        this.f2517b = str2;
        this.f2518c = str3;
        list.getClass();
        this.f2519d = list;
        this.f2520e = str + "-" + str2 + "-" + str3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f2516a + ", mProviderPackage: " + this.f2517b + ", mQuery: " + this.f2518c + ", mCertificates:");
        int i7 = 0;
        while (true) {
            List<List<byte[]>> list = this.f2519d;
            if (i7 >= list.size()) {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
            sb.append(" [");
            List<byte[]> list2 = list.get(i7);
            for (int i8 = 0; i8 < list2.size(); i8++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list2.get(i8), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i7++;
        }
    }
}
