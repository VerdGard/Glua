package p140r4;

import java.util.List;
import p006a5.InterfaceC0053c;
import p047f5.C1178i;

/* renamed from: r4.f */
/* loaded from: classes.dex */
public final class C1838f extends C1178i {

    /* renamed from: g */
    public final List<InterfaceC0053c> f8306g;

    /* renamed from: r4.f$a */
    public static class a implements C1178i.a {

        /* renamed from: a */
        public final List<Integer> f8307a;

        public a(List<Integer> list) {
            this.f8307a = list;
        }

        @Override // p047f5.C1178i.a
        /* renamed from: a */
        public final int mo3389a(int i7) {
            return this.f8307a.get(i7).intValue();
        }

        @Override // p047f5.C1178i.a
        /* renamed from: b */
        public final int mo3390b() {
            List<Integer> list = this.f8307a;
            if (list == null) {
                return 0;
            }
            return list.size();
        }
    }

    /* renamed from: r4.f$b */
    public static class b implements C1178i.a {

        /* renamed from: a */
        public final List<InterfaceC0053c> f8308a;

        public b(List<InterfaceC0053c> list) {
            this.f8308a = list;
        }

        @Override // p047f5.C1178i.a
        /* renamed from: a */
        public final int mo3389a(int i7) {
            return this.f8308a.get(i7).mo166i();
        }

        @Override // p047f5.C1178i.a
        /* renamed from: b */
        public final int mo3390b() {
            List<InterfaceC0053c> list = this.f8308a;
            if (list == null) {
                return 0;
            }
            return list.size();
        }
    }

    public C1838f(int i7, List<InterfaceC0053c> list, List<Integer> list2) {
        super(i7, new b(list), new a(list2));
        this.f8306g = list;
    }

    /* renamed from: c */
    public final void m4329c(int i7) {
        int i8 = this.f5764a;
        if (i7 > i8) {
            throw new IllegalArgumentException();
        }
        if (this.f5768e != 0) {
            throw new IllegalStateException();
        }
        do {
            m3388b();
            if (Math.min(this.f5769f, i8) > i7) {
                break;
            }
        } while (this.f5769f < i8);
        this.f5768e = i7;
    }
}
