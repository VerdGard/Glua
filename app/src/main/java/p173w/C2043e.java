package p173w;

import java.util.ArrayList;

/* renamed from: w.e */
/* loaded from: classes.dex */
public final class C2043e {

    /* renamed from: a */
    public final int[] f9323a;

    /* renamed from: b */
    public final float[] f9324b;

    public C2043e(int i7, int i8) {
        this.f9323a = new int[]{i7, i8};
        this.f9324b = new float[]{0.0f, 1.0f};
    }

    public C2043e(int i7, int i8, int i9) {
        this.f9323a = new int[]{i7, i8, i9};
        this.f9324b = new float[]{0.0f, 0.5f, 1.0f};
    }

    public C2043e(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        this.f9323a = new int[size];
        this.f9324b = new float[size];
        for (int i7 = 0; i7 < size; i7++) {
            this.f9323a[i7] = ((Integer) arrayList.get(i7)).intValue();
            this.f9324b[i7] = ((Float) arrayList2.get(i7)).floatValue();
        }
    }
}
