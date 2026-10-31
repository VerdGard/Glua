package p040e6;

import java.util.Random;
import p032d6.C0898f;

/* renamed from: e6.b */
/* loaded from: classes.dex */
public final class C1141b extends AbstractC1140a {

    /* renamed from: m */
    public final a f5677m = new a();

    /* renamed from: e6.b$a */
    public static final class a extends ThreadLocal<Random> {
        @Override // java.lang.ThreadLocal
        public final Random initialValue() {
            return new Random();
        }
    }

    @Override // p040e6.AbstractC1140a
    /* renamed from: b */
    public final Random mo3326b() {
        Random random = this.f5677m.get();
        C0898f.m2605d(random, "implStorage.get()");
        return random;
    }
}
