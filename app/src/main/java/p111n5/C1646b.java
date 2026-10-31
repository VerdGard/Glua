package p111n5;

import java.util.HashMap;

/* renamed from: n5.b */
/* loaded from: classes.dex */
public final class C1646b implements InterfaceC1647c {

    /* renamed from: a */
    public final HashMap f7482a = new HashMap();

    /* renamed from: a */
    public final void m4007a(InterfaceC1647c interfaceC1647c) {
        if (interfaceC1647c instanceof C1646b) {
            throw new IllegalArgumentException();
        }
        for (String str : interfaceC1647c.mo106d()) {
            this.f7482a.put(str, interfaceC1647c);
        }
    }

    @Override // p111n5.InterfaceC1647c
    /* renamed from: d */
    public final String[] mo106d() {
        return new String[0];
    }
}
