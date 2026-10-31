package p032d6;

import androidx.activity.OnBackPressedDispatcher;
import java.io.Serializable;

/* renamed from: d6.a */
/* loaded from: classes.dex */
public abstract class AbstractC0893a implements Serializable {

    /* renamed from: Y */
    public final boolean f4680Y;

    /* renamed from: c */
    public transient C0896d f4681c;

    /* renamed from: e */
    public final Object f4682e;

    /* renamed from: m */
    public final Class f4683m = OnBackPressedDispatcher.class;

    /* renamed from: s */
    public final String f4684s = "updateEnabledCallbacks";

    /* renamed from: X */
    public final String f4679X = "updateEnabledCallbacks()V";

    public AbstractC0893a(OnBackPressedDispatcher onBackPressedDispatcher, boolean z6) {
        this.f4682e = onBackPressedDispatcher;
        this.f4680Y = z6;
    }

    /* renamed from: b */
    public final InterfaceC0894b m2600b() {
        InterfaceC0894b c0895c;
        Class cls = this.f4683m;
        if (cls == null) {
            return null;
        }
        if (this.f4680Y) {
            C0901i.f4692a.getClass();
            c0895c = new C0900h(cls);
        } else {
            C0901i.f4692a.getClass();
            c0895c = new C0895c(cls);
        }
        return c0895c;
    }
}
