package p194y4;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: y4.c */
/* loaded from: classes.dex */
public final class C2251c {

    /* renamed from: a */
    public final ArrayList f10267a = new ArrayList();

    /* renamed from: b */
    public final boolean f10268b = true;

    /* renamed from: a */
    public final synchronized void m5456a(int i7, int i8, ArrayList arrayList) {
        Iterator it = this.f10267a.iterator();
        while (it.hasNext()) {
            C2250b c2250b = (C2250b) it.next();
            if (c2250b.f10266s > i7 && c2250b.f10265m <= i8) {
                arrayList.add(c2250b);
            }
        }
    }

    /* renamed from: b */
    public final synchronized void m5457b(int i7, int i8) {
        if (this.f10268b) {
            int i9 = i8 - i7;
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f10267a.iterator();
            while (it.hasNext()) {
                C2250b c2250b = (C2250b) it.next();
                int max = Math.max(i7, c2250b.f10265m);
                int min = Math.min(i8, c2250b.f10266s);
                if (min <= max) {
                    int i10 = c2250b.f10265m;
                    if (i10 >= i8) {
                        c2250b.f10265m = i10 - i9;
                        c2250b.f10266s -= i9;
                    }
                } else {
                    int i11 = c2250b.f10266s - (min - max);
                    c2250b.f10266s = i11;
                    int i12 = c2250b.f10265m;
                    if (i12 > i7) {
                        int i13 = i12 - i7;
                        c2250b.f10265m = i12 - i13;
                        c2250b.f10266s = i11 - i13;
                    }
                    if (c2250b.f10265m == c2250b.f10266s) {
                        arrayList.add(c2250b);
                    }
                }
            }
            this.f10267a.removeAll(arrayList);
        }
    }

    /* renamed from: c */
    public final synchronized void m5458c(int i7, int i8) {
        int i9;
        if (this.f10268b) {
            int i10 = i8 - i7;
            Iterator it = this.f10267a.iterator();
            while (it.hasNext()) {
                C2250b c2250b = (C2250b) it.next();
                int i11 = c2250b.f10265m;
                if (i11 <= i7 && (i9 = c2250b.f10266s) >= i7) {
                    c2250b.f10266s = i9 + i10;
                }
                if (i11 > i7) {
                    c2250b.f10265m = i11 + i10;
                    c2250b.f10266s += i10;
                }
            }
        }
    }
}
