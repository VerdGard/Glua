package p067i1;

import android.graphics.Color;
import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.util.ArrayList;

/* renamed from: i1.d */
/* loaded from: classes.dex */
public final class C1322d {

    /* renamed from: i1.d$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f6520a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f6520a = iArr;
            try {
                iArr[JsonToken.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6520a[JsonToken.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6520a[JsonToken.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: a */
    public static int m3682a(JsonReader jsonReader) {
        jsonReader.beginArray();
        int nextDouble = (int) (jsonReader.nextDouble() * 255.0d);
        int nextDouble2 = (int) (jsonReader.nextDouble() * 255.0d);
        int nextDouble3 = (int) (jsonReader.nextDouble() * 255.0d);
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.endArray();
        return Color.argb(255, nextDouble, nextDouble2, nextDouble3);
    }

    /* renamed from: b */
    public static PointF m3683b(JsonReader jsonReader, float f7) {
        int i7 = a.f6520a[jsonReader.peek().ordinal()];
        if (i7 == 1) {
            float nextDouble = (float) jsonReader.nextDouble();
            float nextDouble2 = (float) jsonReader.nextDouble();
            while (jsonReader.hasNext()) {
                jsonReader.skipValue();
            }
            return new PointF(nextDouble * f7, nextDouble2 * f7);
        }
        if (i7 == 2) {
            jsonReader.beginArray();
            float nextDouble3 = (float) jsonReader.nextDouble();
            float nextDouble4 = (float) jsonReader.nextDouble();
            while (jsonReader.peek() != JsonToken.END_ARRAY) {
                jsonReader.skipValue();
            }
            jsonReader.endArray();
            return new PointF(nextDouble3 * f7, nextDouble4 * f7);
        }
        if (i7 != 3) {
            throw new IllegalArgumentException("Unknown point starts with " + jsonReader.peek());
        }
        jsonReader.beginObject();
        float f8 = 0.0f;
        float f9 = 0.0f;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (nextName.equals("x")) {
                f8 = m3685d(jsonReader);
            } else if (nextName.equals("y")) {
                f9 = m3685d(jsonReader);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return new PointF(f8 * f7, f9 * f7);
    }

    /* renamed from: c */
    public static ArrayList m3684c(JsonReader jsonReader, float f7) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            arrayList.add(m3683b(jsonReader, f7));
            jsonReader.endArray();
        }
        jsonReader.endArray();
        return arrayList;
    }

    /* renamed from: d */
    public static float m3685d(JsonReader jsonReader) {
        JsonToken peek = jsonReader.peek();
        int i7 = a.f6520a[peek.ordinal()];
        if (i7 == 1) {
            return (float) jsonReader.nextDouble();
        }
        if (i7 != 2) {
            throw new IllegalArgumentException("Unknown value for token of type " + peek);
        }
        jsonReader.beginArray();
        float nextDouble = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.endArray();
        return nextDouble;
    }
}
