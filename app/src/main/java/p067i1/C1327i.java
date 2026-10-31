package p067i1;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import p002a1.C0017d;
import p035e1.C0949a;
import p051g1.C1202k;
import p070i4.InterfaceC1349o;

/* renamed from: i1.i */
/* loaded from: classes.dex */
public final class C1327i implements InterfaceC1328j, InterfaceC1349o {

    /* renamed from: a */
    public static final C1327i f6526a = new C1327i();

    @Override // p067i1.InterfaceC1328j
    /* renamed from: c */
    public Object mo105c(JsonReader jsonReader, float f7) {
        char c7;
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
        }
        jsonReader.beginObject();
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        boolean z6 = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            int hashCode = nextName.hashCode();
            if (hashCode == 99) {
                if (nextName.equals("c")) {
                    c7 = 0;
                }
                c7 = 65535;
            } else if (hashCode == 105) {
                if (nextName.equals("i")) {
                    c7 = 1;
                }
                c7 = 65535;
            } else if (hashCode != 111) {
                if (hashCode == 118 && nextName.equals("v")) {
                    c7 = 3;
                }
                c7 = 65535;
            } else {
                if (nextName.equals("o")) {
                    c7 = 2;
                }
                c7 = 65535;
            }
            if (c7 == 0) {
                z6 = jsonReader.nextBoolean();
            } else if (c7 == 1) {
                arrayList2 = C1322d.m3684c(jsonReader, f7);
            } else if (c7 == 2) {
                arrayList3 = C1322d.m3684c(jsonReader, f7);
            } else if (c7 == 3) {
                arrayList = C1322d.m3684c(jsonReader, f7);
            }
        }
        jsonReader.endObject();
        if (jsonReader.peek() == JsonToken.END_ARRAY) {
            jsonReader.endArray();
        }
        if (arrayList == null || arrayList2 == null || arrayList3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (arrayList.isEmpty()) {
            return new C1202k(new PointF(), false, Collections.emptyList());
        }
        int size = arrayList.size();
        PointF pointF = (PointF) arrayList.get(0);
        ArrayList arrayList4 = new ArrayList(size);
        for (int i7 = 1; i7 < size; i7++) {
            PointF pointF2 = (PointF) arrayList.get(i7);
            int i8 = i7 - 1;
            arrayList4.add(new C0949a(C0017d.m84i((PointF) arrayList.get(i8), (PointF) arrayList3.get(i8)), C0017d.m84i(pointF2, (PointF) arrayList2.get(i7)), pointF2));
        }
        if (z6) {
            PointF pointF3 = (PointF) arrayList.get(0);
            int i9 = size - 1;
            arrayList4.add(new C0949a(C0017d.m84i((PointF) arrayList.get(i9), (PointF) arrayList3.get(i9)), C0017d.m84i(pointF3, (PointF) arrayList2.get(0)), pointF3));
        }
        return new C1202k(pointF, z6, arrayList4);
    }

    @Override // p070i4.InterfaceC1349o
    /* renamed from: e */
    public Object mo107e() {
        return new LinkedHashMap();
    }
}
