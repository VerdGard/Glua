package p048f6;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import p032d6.C0898f;
import p040e6.AbstractC1140a;

/* renamed from: f6.a */
/* loaded from: classes.dex */
public final class C1182a extends AbstractC1140a {
    @Override // p040e6.AbstractC1140a
    /* renamed from: b */
    public final Random mo3326b() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        C0898f.m2605d(current, "current()");
        return current;
    }
}
