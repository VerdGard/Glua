package p067i1;

import android.util.JsonReader;
import android.util.JsonToken;
import java.util.ArrayList;
import p070i4.InterfaceC1349o;
import p083k1.C1450d;

/* renamed from: i1.h */
/* loaded from: classes.dex */
public final class C1326h implements InterfaceC1328j, InterfaceC1349o {

    /* renamed from: a */
    public static final C1326h f6525a = new C1326h();

    @Override // p067i1.InterfaceC1328j
    /* renamed from: c */
    public Object mo105c(JsonReader jsonReader, float f7) {
        boolean z6 = jsonReader.peek() == JsonToken.BEGIN_ARRAY;
        if (z6) {
            jsonReader.beginArray();
        }
        float nextDouble = (float) jsonReader.nextDouble();
        float nextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        if (z6) {
            jsonReader.endArray();
        }
        return new C1450d((nextDouble / 100.0f) * f7, (nextDouble2 / 100.0f) * f7);
    }

    @Override // p070i4.InterfaceC1349o
    /* renamed from: e */
    public Object mo107e() {
        return new ArrayList();
    }
}
