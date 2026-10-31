package androidx.lifecycle;

import android.os.Bundle;
import androidx.savedstate.C0493a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import p023c6.InterfaceC0655a;
import p032d6.AbstractC0899g;
import p032d6.C0895c;
import p032d6.C0898f;
import p032d6.C0901i;
import p128q0.AbstractC1721a;
import p128q0.C1722b;
import p128q0.C1724d;
import p187x5.C2198b;

/* renamed from: androidx.lifecycle.z */
/* loaded from: classes.dex */
public final class C0415z implements C0493a.b {

    /* renamed from: a */
    public final C0493a f2025a;

    /* renamed from: b */
    public boolean f2026b;

    /* renamed from: c */
    public Bundle f2027c;

    /* renamed from: d */
    public final C2198b f2028d;

    /* renamed from: androidx.lifecycle.z$a */
    public static final class a extends AbstractC0899g implements InterfaceC0655a<C0385a0> {

        /* renamed from: m */
        public final /* synthetic */ InterfaceC0395f0 f2029m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC0395f0 interfaceC0395f0) {
            super(0);
            this.f2029m = interfaceC0395f0;
        }

        @Override // p023c6.InterfaceC0655a
        /* renamed from: a */
        public final C0385a0 mo373a() {
            InterfaceC0395f0 interfaceC0395f0 = this.f2029m;
            C0898f.m2606e(interfaceC0395f0, "<this>");
            ArrayList arrayList = new ArrayList();
            C0901i.f4692a.getClass();
            Class<?> mo2601a = new C0895c(C0385a0.class).mo2601a();
            C0898f.m2604c(mo2601a, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
            arrayList.add(new C1724d(mo2601a));
            C1724d[] c1724dArr = (C1724d[]) arrayList.toArray(new C1724d[0]);
            return (C0385a0) new C0389c0(interfaceC0395f0.mo353k(), new C1722b((C1724d[]) Arrays.copyOf(c1724dArr, c1724dArr.length)), interfaceC0395f0 instanceof InterfaceC0392e ? ((InterfaceC0392e) interfaceC0395f0).mo351h() : AbstractC1721a.a.f7883b).m1355b("androidx.lifecycle.internal.SavedStateHandlesVM", C0385a0.class);
        }
    }

    public C0415z(C0493a c0493a, InterfaceC0395f0 interfaceC0395f0) {
        C0898f.m2606e(c0493a, "savedStateRegistry");
        C0898f.m2606e(interfaceC0395f0, "viewModelStoreOwner");
        this.f2025a = c0493a;
        this.f2028d = new C2198b(new a(interfaceC0395f0));
    }

    @Override // androidx.savedstate.C0493a.b
    /* renamed from: a */
    public final Bundle mo374a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f2027c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((C0385a0) this.f2028d.m5336a()).f1959c.entrySet()) {
            String str = (String) entry.getKey();
            Bundle mo374a = ((C0412w) entry.getValue()).f2020e.mo374a();
            if (!C0898f.m2602a(mo374a, Bundle.EMPTY)) {
                bundle.putBundle(str, mo374a);
            }
        }
        this.f2026b = false;
        return bundle;
    }
}
