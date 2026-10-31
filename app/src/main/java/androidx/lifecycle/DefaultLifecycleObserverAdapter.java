package androidx.lifecycle;

import androidx.lifecycle.AbstractC0394f;
import p032d6.C0898f;

/* loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements InterfaceC0398i {

    /* renamed from: a */
    public final InterfaceC0386b f1931a;

    /* renamed from: b */
    public final InterfaceC0398i f1932b;

    /* renamed from: androidx.lifecycle.DefaultLifecycleObserverAdapter$a */
    public /* synthetic */ class C0381a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1933a;

        static {
            int[] iArr = new int[AbstractC0394f.a.values().length];
            try {
                iArr[AbstractC0394f.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC0394f.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC0394f.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractC0394f.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AbstractC0394f.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AbstractC0394f.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AbstractC0394f.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f1933a = iArr;
        }
    }

    public DefaultLifecycleObserverAdapter(InterfaceC0386b interfaceC0386b, InterfaceC0398i interfaceC0398i) {
        C0898f.m2606e(interfaceC0386b, "defaultLifecycleObserver");
        this.f1931a = interfaceC0386b;
        this.f1932b = interfaceC0398i;
    }

    @Override // androidx.lifecycle.InterfaceC0398i
    /* renamed from: d */
    public final void mo357d(InterfaceC0400k interfaceC0400k, AbstractC0394f.a aVar) {
        int i7 = C0381a.f1933a[aVar.ordinal()];
        InterfaceC0386b interfaceC0386b = this.f1931a;
        switch (i7) {
            case 1:
                interfaceC0386b.mo1076c(interfaceC0400k);
                break;
            case 2:
                interfaceC0386b.mo1078f(interfaceC0400k);
                break;
            case 3:
                interfaceC0386b.mo1074a();
                break;
            case 4:
                interfaceC0386b.mo1077e(interfaceC0400k);
                break;
            case 5:
                interfaceC0386b.mo1079g(interfaceC0400k);
                break;
            case 6:
                interfaceC0386b.mo1075b(interfaceC0400k);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC0398i interfaceC0398i = this.f1932b;
        if (interfaceC0398i != null) {
            interfaceC0398i.mo357d(interfaceC0400k, aVar);
        }
    }
}
