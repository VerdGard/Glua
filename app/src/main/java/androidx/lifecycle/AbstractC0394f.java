package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;
import p032d6.C0898f;

/* renamed from: androidx.lifecycle.f */
/* loaded from: classes.dex */
public abstract class AbstractC0394f {

    /* renamed from: androidx.lifecycle.f$a */
    public enum a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        public static final C2290a Companion = new C2290a();

        /* renamed from: androidx.lifecycle.f$a$a, reason: collision with other inner class name */
        public static final class C2290a {
            /* renamed from: a */
            public static a m1376a(b bVar) {
                C0898f.m2606e(bVar, "state");
                int ordinal = bVar.ordinal();
                if (ordinal == 1) {
                    return a.ON_CREATE;
                }
                if (ordinal == 2) {
                    return a.ON_START;
                }
                if (ordinal != 3) {
                    return null;
                }
                return a.ON_RESUME;
            }
        }

        /* renamed from: androidx.lifecycle.f$a$b */
        public /* synthetic */ class b {

            /* renamed from: a */
            public static final /* synthetic */ int[] f1982a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[a.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[a.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[a.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[a.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f1982a = iArr;
            }
        }

        a() {
        }

        /* renamed from: a */
        public final b m1375a() {
            switch (b.f1982a[ordinal()]) {
                case 1:
                case 2:
                    return b.f1987m;
                case 3:
                case 4:
                    return b.f1988s;
                case 5:
                    return b.f1983X;
                case 6:
                    return b.f1985c;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* renamed from: androidx.lifecycle.f$b */
    public enum b {
        f1985c,
        f1986e,
        f1987m,
        f1988s,
        f1983X;

        b() {
        }
    }

    public AbstractC0394f() {
        new AtomicReference();
    }

    /* renamed from: a */
    public abstract void mo1373a(InterfaceC0399j interfaceC0399j);

    /* renamed from: b */
    public abstract void mo1374b(InterfaceC0399j interfaceC0399j);
}
