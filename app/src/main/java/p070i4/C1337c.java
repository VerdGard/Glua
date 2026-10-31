package p070i4;

/* renamed from: i4.c */
/* loaded from: classes.dex */
public final class C1337c implements InterfaceC1349o<Object> {

    /* renamed from: a */
    public final /* synthetic */ Class f6544a;

    public C1337c(Class cls) {
        this.f6544a = cls;
    }

    @Override // p070i4.InterfaceC1349o
    /* renamed from: e */
    public final Object mo107e() {
        Class cls = this.f6544a;
        try {
            return AbstractC1355u.f6602a.mo3715b(cls);
        } catch (Exception e7) {
            throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e7);
        }
    }
}
