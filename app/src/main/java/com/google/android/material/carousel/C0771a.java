package com.google.android.material.carousel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.material.carousel.a */
/* loaded from: classes.dex */
public final class C0771a {

    /* renamed from: a */
    public final float f3993a;

    /* renamed from: b */
    public final List<b> f3994b;

    /* renamed from: c */
    public final int f3995c;

    /* renamed from: d */
    public final int f3996d;

    /* renamed from: com.google.android.material.carousel.a$a */
    public static final class a {

        /* renamed from: a */
        public final float f3997a;

        /* renamed from: c */
        public b f3999c;

        /* renamed from: d */
        public b f4000d;

        /* renamed from: b */
        public final ArrayList f3998b = new ArrayList();

        /* renamed from: e */
        public int f4001e = -1;

        /* renamed from: f */
        public int f4002f = -1;

        /* renamed from: g */
        public float f4003g = 0.0f;

        public a(float f7) {
            this.f3997a = f7;
        }

        /* renamed from: a */
        public final void m2357a(float f7, float f8, float f9, boolean z6) {
            if (f9 <= 0.0f) {
                return;
            }
            b bVar = new b(Float.MIN_VALUE, f7, f8, f9);
            ArrayList arrayList = this.f3998b;
            b bVar2 = this.f3999c;
            if (z6) {
                if (bVar2 == null) {
                    this.f3999c = bVar;
                    this.f4001e = arrayList.size();
                }
                if (this.f4002f != -1 && arrayList.size() - this.f4002f > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f9 != this.f3999c.f4007d) {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
                this.f4000d = bVar;
                this.f4002f = arrayList.size();
            } else {
                if (bVar2 == null && f9 < this.f4003g) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.f4000d != null && f9 > this.f4003g) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.f4003g = f9;
            arrayList.add(bVar);
        }

        /* renamed from: b */
        public final C0771a m2358b() {
            if (this.f3999c == null) {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
            ArrayList arrayList = new ArrayList();
            int i7 = 0;
            while (true) {
                ArrayList arrayList2 = this.f3998b;
                int size = arrayList2.size();
                float f7 = this.f3997a;
                if (i7 >= size) {
                    return new C0771a(f7, arrayList, this.f4001e, this.f4002f);
                }
                b bVar = (b) arrayList2.get(i7);
                arrayList.add(new b((i7 * f7) + (this.f3999c.f4005b - (this.f4001e * f7)), bVar.f4005b, bVar.f4006c, bVar.f4007d));
                i7++;
            }
        }
    }

    /* renamed from: com.google.android.material.carousel.a$b */
    public static final class b {

        /* renamed from: a */
        public final float f4004a;

        /* renamed from: b */
        public final float f4005b;

        /* renamed from: c */
        public final float f4006c;

        /* renamed from: d */
        public final float f4007d;

        public b(float f7, float f8, float f9, float f10) {
            this.f4004a = f7;
            this.f4005b = f8;
            this.f4006c = f9;
            this.f4007d = f10;
        }
    }

    public C0771a(float f7, ArrayList arrayList, int i7, int i8) {
        this.f3993a = f7;
        this.f3994b = Collections.unmodifiableList(arrayList);
        this.f3995c = i7;
        this.f3996d = i8;
    }

    /* renamed from: a */
    public final b m2353a() {
        return this.f3994b.get(this.f3995c);
    }

    /* renamed from: b */
    public final b m2354b() {
        return this.f3994b.get(0);
    }

    /* renamed from: c */
    public final b m2355c() {
        return this.f3994b.get(this.f3996d);
    }

    /* renamed from: d */
    public final b m2356d() {
        return this.f3994b.get(r0.size() - 1);
    }
}
