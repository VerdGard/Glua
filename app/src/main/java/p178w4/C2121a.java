package p178w4;

import android.ext.C0090b;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: w4.a */
/* loaded from: classes.dex */
public final class C2121a {

    /* renamed from: a */
    public final List<C2123c> f9588a;

    /* renamed from: b */
    public final ArrayList f9589b = new ArrayList();

    /* renamed from: c */
    public int f9590c;

    public C2121a(ArrayList arrayList) {
        this.f9588a = arrayList;
    }

    /* renamed from: a */
    public final void m5168a(int i7, ArrayList arrayList) {
        C2123c c2123c;
        List<C2123c> list = this.f9588a;
        Iterator<C2123c> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                c2123c = null;
                break;
            } else {
                c2123c = it.next();
                if (c2123c.f9592a == i7) {
                    break;
                }
            }
        }
        if (c2123c == null) {
            c2123c = new C2123c(i7, null, new ArrayList(), null);
            list.add(c2123c);
        }
        c2123c.f9594c.addAll(arrayList);
        this.f9589b.add(new C2124d(c2123c, this.f9590c));
    }

    /* renamed from: b */
    public final void m5169b(int i7, String str) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            arrayList.add(new C2125e(str));
        }
        m5168a(i7, arrayList);
    }

    /* renamed from: c */
    public final void m5170c(String str) {
        ArrayList arrayList = this.f9589b;
        if (arrayList.isEmpty() || !(arrayList.get(arrayList.size() - 1) instanceof C2126f)) {
            int i7 = this.f9590c;
            arrayList.add(new C2126f(i7, str.length() + i7, str));
        } else {
            C2126f c2126f = (C2126f) arrayList.get(arrayList.size() - 1);
            c2126f.f9598m = C0090b.m220f(new StringBuilder(), c2126f.f9598m, str);
            int i8 = c2126f.f9599c;
            int length = str.length() + c2126f.f9600e;
            c2126f.f9599c = i8;
            c2126f.f9600e = length;
        }
        this.f9590c = str.length() + this.f9590c;
    }
}
