package com.google.android.material.carousel;

import com.google.android.material.carousel.C0771a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.material.carousel.b */
/* loaded from: classes.dex */
public final class C0772b {

    /* renamed from: a */
    public final C0771a f4008a;

    /* renamed from: b */
    public final List<C0771a> f4009b;

    /* renamed from: c */
    public final List<C0771a> f4010c;

    /* renamed from: d */
    public final float[] f4011d;

    /* renamed from: e */
    public final float[] f4012e;

    /* renamed from: f */
    public final float f4013f;

    /* renamed from: g */
    public final float f4014g;

    public C0772b(C0771a c0771a, ArrayList arrayList, ArrayList arrayList2) {
        this.f4008a = c0771a;
        this.f4009b = Collections.unmodifiableList(arrayList);
        this.f4010c = Collections.unmodifiableList(arrayList2);
        float f7 = ((C0771a) arrayList.get(arrayList.size() - 1)).m2354b().f4004a - c0771a.m2354b().f4004a;
        this.f4013f = f7;
        float f8 = c0771a.m2356d().f4004a - ((C0771a) arrayList2.get(arrayList2.size() - 1)).m2356d().f4004a;
        this.f4014g = f8;
        this.f4011d = m2359a(f7, arrayList, true);
        this.f4012e = m2359a(f8, arrayList2, false);
    }

    /* renamed from: a */
    public static float[] m2359a(float f7, ArrayList arrayList, boolean z6) {
        int size = arrayList.size();
        float[] fArr = new float[size];
        int i7 = 1;
        while (i7 < size) {
            int i8 = i7 - 1;
            C0771a c0771a = (C0771a) arrayList.get(i8);
            C0771a c0771a2 = (C0771a) arrayList.get(i7);
            fArr[i7] = i7 == size + (-1) ? 1.0f : fArr[i8] + ((z6 ? c0771a2.m2354b().f4004a - c0771a.m2354b().f4004a : c0771a.m2356d().f4004a - c0771a2.m2356d().f4004a) / f7);
            i7++;
        }
        return fArr;
    }

    /* renamed from: b */
    public static C0771a m2360b(C0771a c0771a, int i7, int i8, float f7, int i9, int i10) {
        ArrayList arrayList = new ArrayList(c0771a.f3994b);
        arrayList.add(i8, (C0771a.b) arrayList.remove(i7));
        C0771a.a aVar = new C0771a.a(c0771a.f3993a);
        int i11 = 0;
        while (i11 < arrayList.size()) {
            C0771a.b bVar = (C0771a.b) arrayList.get(i11);
            float f8 = bVar.f4007d;
            aVar.m2357a((f8 / 2.0f) + f7, bVar.f4006c, f8, i11 >= i9 && i11 <= i10);
            f7 += bVar.f4007d;
            i11++;
        }
        return aVar.m2358b();
    }
}
