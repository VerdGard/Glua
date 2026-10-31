package p016c;

import android.ext.C0090b;
import android.graphics.PointF;
import androidx.activity.C0143v;
import java.security.SecureRandom;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import javax.crypto.IllegalBlockSizeException;
import p018c1.AbstractC0580a;
import p018c1.C0583d;
import p018c1.C0588i;
import p036e2.AbstractC0978d0;
import p036e2.C0957a0;
import p036e2.C0971c0;
import p036e2.C0985e0;
import p036e2.C0992f0;
import p036e2.C1125y0;
import p036e2.C1130y5;
import p036e2.C1132z0;
import p043f1.InterfaceC1162g;
import p083k1.C1447a;

/* renamed from: c.z */
/* loaded from: classes.dex */
public final class C0572z implements InterfaceC1162g {

    /* renamed from: a */
    public final /* synthetic */ int f2924a;

    /* renamed from: b */
    public Object f2925b;

    public C0572z(int i7) {
        this.f2924a = i7;
        if (i7 == 1) {
            this.f2925b = new HashMap();
            return;
        }
        if (i7 == 3) {
            this.f2925b = Collections.singletonList(new C1447a(new PointF(0.0f, 0.0f)));
            return;
        }
        if (i7 == 4) {
            this.f2925b = new AbstractC0978d0[]{new C0985e0(8, 0), new C0992f0(0), new C0992f0(1), new C0985e0(7, 1)};
        } else if (i7 != 5) {
            if (i7 != 6) {
                this.f2925b = new ArrayDeque();
            } else {
                this.f2925b = C1130y5.f5623a;
            }
        }
    }

    @Override // p043f1.InterfaceC1162g
    /* renamed from: a */
    public final AbstractC0580a mo1994a() {
        return ((C1447a) ((List) this.f2925b).get(0)).f6950d == null ? new C0583d(1, (List) this.f2925b) : new C0588i((List) this.f2925b);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c7  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1995b(android.content.Context r22, org.json.JSONObject r23) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p016c.C0572z.m1995b(android.content.Context, org.json.JSONObject):void");
    }

    /* renamed from: c */
    public final byte[] m1996c(byte[] bArr) {
        int numberOfLeadingZeros;
        int i7;
        C0957a0 c0957a0;
        long j7;
        byte[] m3302a;
        int i8;
        C0572z c0572z = this;
        byte[] bArr2 = bArr;
        int i9 = 1;
        switch (c0572z.f2924a) {
            case 4:
                C0971c0 c0971c0 = new C0971c0();
                int length = ((((AbstractC0978d0[]) c0572z.f2925b).length + 1) * 5) + bArr2.length;
                if (bArr2.length == 0) {
                    throw new IllegalArgumentException("original array should not be null or empty");
                }
                if (length < 0) {
                    throw new IllegalArgumentException("length should be more than zero!");
                }
                byte[] copyOf = Arrays.copyOf(bArr2, length);
                C0143v.m436f(bArr2.length, copyOf, c0971c0.m2988a());
                int i10 = 0;
                while (true) {
                    AbstractC0978d0[] abstractC0978d0Arr = (AbstractC0978d0[]) c0572z.f2925b;
                    if (i10 >= abstractC0978d0Arr.length) {
                        return Arrays.copyOf(c0971c0.m2988a(), 5);
                    }
                    AbstractC0978d0 abstractC0978d0 = abstractC0978d0Arr[i10];
                    int i11 = i10 + 1;
                    int length2 = (i11 * 5) + bArr2.length;
                    C0957a0 mo3001a = abstractC0978d0.mo3001a(copyOf, length2);
                    int i12 = abstractC0978d0.f5000b;
                    int i13 = abstractC0978d0.f4999a;
                    int i14 = abstractC0978d0.f5001c;
                    int i15 = i12 + i13;
                    C0957a0 c0957a02 = c0971c0.f4981a;
                    c0957a02.getClass();
                    C0957a0.m2950b(i12, i15);
                    int i16 = c0957a02.f4926e;
                    if (i16 == 0) {
                        numberOfLeadingZeros = 0;
                    } else {
                        int i17 = i16 - 1;
                        numberOfLeadingZeros = (64 - Long.numberOfLeadingZeros(c0957a02.f4925c[i17])) + (i17 * 64);
                    }
                    if (numberOfLeadingZeros <= i12 || i12 == i15) {
                        i7 = i11;
                        c0957a0 = new C0957a0(0);
                    } else {
                        if (i15 > numberOfLeadingZeros) {
                            i15 = numberOfLeadingZeros;
                        }
                        int i18 = i15 - i12;
                        c0957a0 = new C0957a0(i18);
                        int i19 = ((i18 - i9) >> 6) + i9;
                        int i20 = i12 >> 6;
                        int i21 = i12 & 63;
                        boolean z6 = i21 == 0;
                        i7 = i11;
                        int i22 = 0;
                        while (true) {
                            int i23 = i19 - 1;
                            if (i22 < i23) {
                                long[] jArr = c0957a0.f4925c;
                                long[] jArr2 = c0957a02.f4925c;
                                jArr[i22] = z6 ? jArr2[i20] : (jArr2[i20] >>> i12) | (jArr2[i20 + 1] << (-i12));
                                i22++;
                                i20++;
                            } else {
                                long j8 = (-1) >>> (-i15);
                                long[] jArr3 = c0957a0.f4925c;
                                if (((i15 - 1) & 63) < i21) {
                                    long[] jArr4 = c0957a02.f4925c;
                                    j7 = ((jArr4[i20 + 1] & j8) << (-i12)) | (jArr4[i20] >>> i12);
                                } else {
                                    j7 = (c0957a02.f4925c[i20] & j8) >>> i12;
                                }
                                jArr3[i23] = j7;
                                c0957a0.f4926e = i19;
                                c0957a0.m2952c();
                            }
                        }
                    }
                    if (i14 != 0) {
                        if (i14 != 1) {
                            if (i14 == 2) {
                                int min = Math.min(c0957a0.f4926e, mo3001a.f4926e);
                                while (true) {
                                    min--;
                                    if (min >= 0) {
                                        long[] jArr5 = c0957a0.f4925c;
                                        jArr5[min] = jArr5[min] & (~mo3001a.f4925c[min]);
                                    } else {
                                        c0957a0.m2952c();
                                    }
                                }
                            } else if (i14 == 3) {
                                if (c0957a0 != mo3001a) {
                                    int min2 = Math.min(c0957a0.f4926e, mo3001a.f4926e);
                                    int i24 = c0957a0.f4926e;
                                    int i25 = mo3001a.f4926e;
                                    if (i24 < i25) {
                                        c0957a0.m2953d(i25);
                                        c0957a0.f4926e = mo3001a.f4926e;
                                    }
                                    for (int i26 = 0; i26 < min2; i26++) {
                                        long[] jArr6 = c0957a0.f4925c;
                                        jArr6[i26] = jArr6[i26] | mo3001a.f4925c[i26];
                                    }
                                    if (min2 < mo3001a.f4926e) {
                                        System.arraycopy(mo3001a.f4925c, min2, c0957a0.f4925c, min2, c0957a0.f4926e - min2);
                                    }
                                }
                            }
                        }
                        int min3 = Math.min(c0957a0.f4926e, mo3001a.f4926e);
                        int i27 = c0957a0.f4926e;
                        int i28 = mo3001a.f4926e;
                        if (i27 < i28) {
                            c0957a0.m2953d(i28);
                            c0957a0.f4926e = mo3001a.f4926e;
                        }
                        for (int i29 = 0; i29 < min3; i29++) {
                            long[] jArr7 = c0957a0.f4925c;
                            jArr7[i29] = jArr7[i29] ^ mo3001a.f4925c[i29];
                        }
                        int i30 = mo3001a.f4926e;
                        if (min3 < i30) {
                            System.arraycopy(mo3001a.f4925c, min3, c0957a0.f4925c, min3, i30 - min3);
                        }
                        c0957a0.m2952c();
                    } else if (c0957a0 != mo3001a) {
                        while (true) {
                            int i31 = c0957a0.f4926e;
                            if (i31 > mo3001a.f4926e) {
                                long[] jArr8 = c0957a0.f4925c;
                                int i32 = i31 - 1;
                                c0957a0.f4926e = i32;
                                jArr8[i32] = 0;
                            } else {
                                for (int i33 = 0; i33 < c0957a0.f4926e; i33++) {
                                    long[] jArr9 = c0957a0.f4925c;
                                    jArr9[i33] = jArr9[i33] & mo3001a.f4925c[i33];
                                }
                                c0957a0.m2952c();
                            }
                        }
                    }
                    for (int i34 = 0; i34 < i13; i34++) {
                        int i35 = i12 + i34;
                        if (i34 < 0) {
                            throw new IndexOutOfBoundsException(C0090b.m219e("bitIndex < 0: ", i34));
                        }
                        int i36 = i34 >> 6;
                        if (i36 < c0957a0.f4926e && (c0957a0.f4925c[i36] & (1 << i34)) != 0) {
                            if (i35 < 0) {
                                throw new IndexOutOfBoundsException(C0090b.m219e("bitIndex < 0: ", i35));
                            }
                            int i37 = i35 >> 6;
                            int i38 = i37 + 1;
                            if (c0957a02.f4926e < i38) {
                                c0957a02.m2953d(i38);
                                c0957a02.f4926e = i38;
                            }
                            long[] jArr10 = c0957a02.f4925c;
                            jArr10[i37] = jArr10[i37] | (1 << i35);
                        } else {
                            if (i35 < 0) {
                                throw new IndexOutOfBoundsException(C0090b.m219e("bitIndex < 0: ", i35));
                            }
                            int i39 = i35 >> 6;
                            if (i39 < c0957a02.f4926e) {
                                long[] jArr11 = c0957a02.f4925c;
                                jArr11[i39] = jArr11[i39] & (~(1 << i35));
                                c0957a02.m2952c();
                            }
                        }
                    }
                    C0143v.m436f(length2, copyOf, c0971c0.m2988a());
                    i9 = 1;
                    c0572z = this;
                    bArr2 = bArr;
                    i10 = i7;
                }
                break;
            default:
                if (bArr == null) {
                    throw new IllegalArgumentException("Null input buffer");
                }
                C1132z0 c1132z0 = (C1132z0) this.f2925b;
                int length3 = bArr.length;
                c1132z0.getClass();
                if (length3 != 0) {
                    int i40 = c1132z0.f5629e;
                    int i41 = i40 + length3;
                    byte[] bArr3 = c1132z0.f5628d;
                    if (i41 > bArr3.length) {
                        i8 = bArr3.length + 1;
                    } else {
                        System.arraycopy(bArr, 0, bArr3, i40, length3);
                        i8 = c1132z0.f5629e + length3;
                    }
                    c1132z0.f5629e = i8;
                }
                int i42 = c1132z0.f5629e;
                byte[] bArr4 = c1132z0.f5628d;
                if (i42 > bArr4.length) {
                    throw new IllegalBlockSizeException("Data must not be longer than " + c1132z0.f5628d.length + " bytes");
                }
                try {
                    int i43 = c1132z0.f5625a;
                    if (i43 == 1) {
                        m3302a = C1125y0.m3302a(c1132z0.f5627c.m2964b(bArr4, i42), c1132z0.f5630f);
                    } else {
                        if (i43 == 2) {
                            throw new UnsupportedOperationException("only verify supported");
                        }
                        if (i43 == 3) {
                            throw new UnsupportedOperationException("only verify supported");
                        }
                        if (i43 != 4) {
                            throw new AssertionError("Internal error");
                        }
                        SecureRandom secureRandom = C1125y0.f5607a;
                        if (i42 != bArr4.length) {
                            byte[] bArr5 = new byte[i42];
                            System.arraycopy(bArr4, 0, bArr5, 0, i42);
                            bArr4 = bArr5;
                        }
                        m3302a = c1132z0.f5627c.m2965c(C1125y0.m3302a(bArr4, c1132z0.f5630f));
                    }
                    return m3302a;
                } finally {
                    c1132z0.f5629e = 0;
                }
        }
    }

    public /* synthetic */ C0572z(int i7, Object obj) {
        this.f2924a = i7;
        this.f2925b = obj;
    }
}
