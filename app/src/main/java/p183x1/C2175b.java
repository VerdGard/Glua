package p183x1;

import java.io.Serializable;

/* renamed from: x1.b */
/* loaded from: classes.dex */
public final class C2175b {

    /* renamed from: a */
    public final int f9886a;

    /* renamed from: b */
    public final Object f9887b;

    public /* synthetic */ C2175b(int i7, StringBuilder sb) {
        this.f9887b = sb;
        this.f9886a = i7;
        if (i7 < 0 || i7 > sb.length()) {
            throw new IllegalArgumentException("invalid shiftLeft");
        }
    }

    public /* synthetic */ C2175b(Serializable serializable, int i7) {
        this.f9887b = serializable;
        this.f9886a = i7;
    }

    /* renamed from: a */
    public final int m5318a() {
        return ((int[]) this.f9887b)[this.f9886a];
    }
}
