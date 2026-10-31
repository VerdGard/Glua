package p035e1;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: e1.e */
/* loaded from: classes.dex */
public final class C0953e {

    /* renamed from: a */
    public final ArrayList f4918a;

    /* renamed from: b */
    public InterfaceC0954f f4919b;

    public C0953e(C0953e c0953e) {
        this.f4918a = new ArrayList(c0953e.f4918a);
        this.f4919b = c0953e.f4919b;
    }

    public C0953e(String... strArr) {
        this.f4918a = new ArrayList(Arrays.asList(strArr));
    }

    /* renamed from: a */
    public final boolean m2946a(int i7, String str) {
        ArrayList arrayList = this.f4918a;
        if (i7 >= arrayList.size()) {
            return false;
        }
        boolean z6 = i7 == arrayList.size() - 1;
        String str2 = (String) arrayList.get(i7);
        if (!str2.equals("**")) {
            return (z6 || (i7 == arrayList.size() + (-2) && ((String) arrayList.get(arrayList.size() + (-1))).equals("**"))) && (str2.equals(str) || str2.equals("*"));
        }
        if (!z6 && ((String) arrayList.get(i7 + 1)).equals(str)) {
            return i7 == arrayList.size() + (-2) || (i7 == arrayList.size() + (-3) && ((String) arrayList.get(arrayList.size() + (-1))).equals("**"));
        }
        if (z6) {
            return true;
        }
        int i8 = i7 + 1;
        if (i8 < arrayList.size() - 1) {
            return false;
        }
        return ((String) arrayList.get(i8)).equals(str);
    }

    /* renamed from: b */
    public final int m2947b(int i7, String str) {
        if (str.equals("__container")) {
            return 0;
        }
        ArrayList arrayList = this.f4918a;
        if (((String) arrayList.get(i7)).equals("**")) {
            return (i7 != arrayList.size() - 1 && ((String) arrayList.get(i7 + 1)).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    /* renamed from: c */
    public final boolean m2948c(int i7, String str) {
        if (str.equals("__container")) {
            return true;
        }
        ArrayList arrayList = this.f4918a;
        if (i7 >= arrayList.size()) {
            return false;
        }
        return ((String) arrayList.get(i7)).equals(str) || ((String) arrayList.get(i7)).equals("**") || ((String) arrayList.get(i7)).equals("*");
    }

    /* renamed from: d */
    public final boolean m2949d(int i7, String str) {
        if (str.equals("__container")) {
            return true;
        }
        ArrayList arrayList = this.f4918a;
        return i7 < arrayList.size() - 1 || ((String) arrayList.get(i7)).equals("**");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KeyPath{keys=");
        sb.append(this.f4918a);
        sb.append(",resolved=");
        sb.append(this.f4919b != null);
        sb.append('}');
        return sb.toString();
    }
}
