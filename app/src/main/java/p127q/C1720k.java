package p127q;

import java.util.ArrayList;
import p120p.C1682c;

/* renamed from: q.k */
/* loaded from: classes.dex */
public class C1720k extends C1713d {

    /* renamed from: e0 */
    public ArrayList<C1713d> f7881e0 = new ArrayList<>();

    /* renamed from: B */
    public void mo4180B() {
        ArrayList<C1713d> arrayList = this.f7881e0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            C1713d c1713d = this.f7881e0.get(i7);
            if (c1713d instanceof C1720k) {
                ((C1720k) c1713d).mo4180B();
            }
        }
    }

    @Override // p127q.C1713d
    /* renamed from: s */
    public void mo4172s() {
        this.f7881e0.clear();
        super.mo4172s();
    }

    @Override // p127q.C1713d
    /* renamed from: u */
    public final void mo4174u(C1682c c1682c) {
        super.mo4174u(c1682c);
        int size = this.f7881e0.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.f7881e0.get(i7).mo4174u(c1682c);
        }
    }
}
