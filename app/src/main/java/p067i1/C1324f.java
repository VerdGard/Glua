package p067i1;

import android.util.JsonReader;
import java.util.concurrent.ConcurrentSkipListMap;
import p070i4.InterfaceC1349o;

/* renamed from: i1.f */
/* loaded from: classes.dex */
public final class C1324f implements InterfaceC1328j, InterfaceC1349o {

    /* renamed from: a */
    public static final C1324f f6523a = new C1324f();

    @Override // p067i1.InterfaceC1328j
    /* renamed from: c */
    public Object mo105c(JsonReader jsonReader, float f7) {
        return C1322d.m3683b(jsonReader, f7);
    }

    @Override // p070i4.InterfaceC1349o
    /* renamed from: e */
    public Object mo107e() {
        return new ConcurrentSkipListMap();
    }
}
