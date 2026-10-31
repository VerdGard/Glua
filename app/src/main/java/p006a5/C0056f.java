package p006a5;

import android.ext.Tools;
import java.util.ArrayList;
import java.util.Collections;
import p156t4.AbstractC1927b;

/* renamed from: a5.f */
/* loaded from: classes.dex */
public final class C0056f {

    /* renamed from: a */
    public final InterfaceC0055e f144a;

    /* renamed from: c */
    public int f146c = Integer.MAX_VALUE;

    /* renamed from: b */
    public ArrayList f145b = new ArrayList(Tools.Semaphore.f159S7);

    public C0056f(AbstractC1927b.b bVar) {
        this.f144a = bVar;
    }

    /* renamed from: a */
    public final void m167a() {
        if (this.f145b != null) {
            boolean z6 = false;
            int i7 = -1;
            int i8 = 0;
            while (true) {
                if (i8 >= this.f145b.size() - 1) {
                    break;
                }
                i8++;
                int i9 = ((C0051a) this.f145b.get(i8)).f138c;
                if (i7 > i9) {
                    z6 = true;
                    break;
                }
                i7 = i9;
            }
            if (z6) {
                Collections.sort(this.f145b, C0051a.f134e);
            }
            Collections.sort(new ArrayList(this.f145b), C0051a.f135f);
        }
    }
}
