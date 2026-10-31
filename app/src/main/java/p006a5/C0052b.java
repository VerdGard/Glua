package p006a5;

import androidx.activity.C0143v;
import java.util.ArrayList;
import p006a5.InterfaceC0055e;

/* renamed from: a5.b */
/* loaded from: classes.dex */
public final class C0052b implements InterfaceC0055e.a {

    /* renamed from: b */
    public static final C0052b f140b = new C0052b();

    /* renamed from: a */
    public final ArrayList f141a;

    public C0052b() {
        ArrayList arrayList = new ArrayList(1);
        this.f141a = arrayList;
        arrayList.add(C0143v.m425W(5L, 0));
    }

    @Override // p006a5.InterfaceC0055e.a
    /* renamed from: a */
    public final void mo155a(int i7) {
    }

    @Override // p006a5.InterfaceC0055e.a
    /* renamed from: b */
    public final InterfaceC0053c mo156b(int i7) {
        return (InterfaceC0053c) this.f141a.get(i7);
    }

    @Override // p006a5.InterfaceC0055e.a
    /* renamed from: c */
    public final int mo157c() {
        return 1;
    }
}
