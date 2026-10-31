package p067i1;

import android.graphics.Color;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.Log;
import java.util.ArrayList;
import p051g1.C1194c;

/* renamed from: i1.b */
/* loaded from: classes.dex */
public final class C1320b implements InterfaceC1328j<C1194c> {

    /* renamed from: a */
    public int f6518a;

    public C1320b(int i7) {
        this.f6518a = i7;
    }

    @Override // p067i1.InterfaceC1328j
    /* renamed from: c */
    public final C1194c mo105c(JsonReader jsonReader, float f7) {
        int i7;
        double d7;
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        boolean z6 = jsonReader.peek() == JsonToken.BEGIN_ARRAY;
        if (z6) {
            jsonReader.beginArray();
        }
        while (jsonReader.hasNext()) {
            arrayList.add(Float.valueOf((float) jsonReader.nextDouble()));
        }
        if (z6) {
            jsonReader.endArray();
        }
        if (this.f6518a == -1) {
            this.f6518a = arrayList.size() / 4;
        }
        int i9 = this.f6518a;
        float[] fArr = new float[i9];
        int[] iArr = new int[i9];
        if (arrayList.size() != this.f6518a * 4) {
            Log.w("LOTTIE", "Unexpected gradient length: " + arrayList.size() + ". Expected " + (this.f6518a * 4) + ". This may affect the appearance of the gradient. Make sure to save your After Effects file before exporting an animation with gradients.");
        }
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i7 = this.f6518a * 4;
            if (i10 >= i7) {
                break;
            }
            int i13 = i10 / 4;
            double floatValue = ((Float) arrayList.get(i10)).floatValue();
            int i14 = i10 % 4;
            if (i14 == 0) {
                fArr[i13] = (float) floatValue;
            } else if (i14 == 1) {
                i11 = (int) (floatValue * 255.0d);
            } else if (i14 == 2) {
                i12 = (int) (floatValue * 255.0d);
            } else if (i14 == 3) {
                iArr[i13] = Color.argb(255, i11, i12, (int) (floatValue * 255.0d));
            }
            i10++;
        }
        C1194c c1194c = new C1194c(fArr, iArr);
        if (arrayList.size() > i7) {
            int size = (arrayList.size() - i7) / 2;
            double[] dArr = new double[size];
            double[] dArr2 = new double[size];
            int i15 = 0;
            while (i7 < arrayList.size()) {
                if (i7 % 2 == 0) {
                    dArr[i15] = ((Float) arrayList.get(i7)).floatValue();
                } else {
                    dArr2[i15] = ((Float) arrayList.get(i7)).floatValue();
                    i15++;
                }
                i7++;
            }
            while (true) {
                int[] iArr2 = c1194c.f5857b;
                if (i8 >= iArr2.length) {
                    break;
                }
                int i16 = iArr2[i8];
                double d8 = c1194c.f5856a[i8];
                int i17 = 1;
                while (true) {
                    if (i17 >= size) {
                        d7 = dArr2[size - 1] * 255.0d;
                        break;
                    }
                    int i18 = i17 - 1;
                    double d9 = dArr[i18];
                    double d10 = dArr[i17];
                    if (d10 >= d8) {
                        double d11 = dArr2[i18];
                        d7 = (((dArr2[i17] - d11) * ((d8 - d9) / (d10 - d9))) + d11) * 255.0d;
                        break;
                    }
                    i17++;
                }
                iArr2[i8] = Color.argb((int) d7, Color.red(i16), Color.green(i16), Color.blue(i16));
                i8++;
            }
        }
        return c1194c;
    }
}
