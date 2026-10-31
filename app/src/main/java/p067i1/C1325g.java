package p067i1;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import p070i4.C1348n;
import p070i4.InterfaceC1349o;

/* renamed from: i1.g */
/* loaded from: classes.dex */
public final class C1325g implements InterfaceC1328j, InterfaceC1349o {

    /* renamed from: a */
    public static final C1325g f6524a = new C1325g();

    @Override // p067i1.InterfaceC1328j
    /* renamed from: c */
    public Object mo105c(JsonReader jsonReader, float f7) {
        JsonToken peek = jsonReader.peek();
        if (peek == JsonToken.BEGIN_ARRAY || peek == JsonToken.BEGIN_OBJECT) {
            return C1322d.m3683b(jsonReader, f7);
        }
        if (peek != JsonToken.NUMBER) {
            throw new IllegalArgumentException("Cannot convert json to point. Next token is " + peek);
        }
        PointF pointF = new PointF(((float) jsonReader.nextDouble()) * f7, ((float) jsonReader.nextDouble()) * f7);
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        return pointF;
    }

    @Override // p070i4.InterfaceC1349o
    /* renamed from: e */
    public Object mo107e() {
        return new C1348n();
    }
}
