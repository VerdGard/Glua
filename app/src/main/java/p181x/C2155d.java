package p181x;

import android.ext.C0089a;
import android.graphics.Path;
import android.util.Log;

/* renamed from: x.d */
/* loaded from: classes.dex */
public final class C2155d {

    /* renamed from: x.d$a */
    public static class a {

        /* renamed from: a */
        public char f9769a;

        /* renamed from: b */
        public final float[] f9770b;

        public a(char c7, float[] fArr) {
            this.f9769a = c7;
            this.f9770b = fArr;
        }

        public a(a aVar) {
            this.f9769a = aVar.f9769a;
            float[] fArr = aVar.f9770b;
            this.f9770b = C2155d.m5274b(fArr.length, fArr);
        }

        /* renamed from: a */
        public static void m5278a(Path path, float f7, float f8, float f9, float f10, float f11, float f12, float f13, boolean z6, boolean z7) {
            double d7;
            double d8;
            double radians = Math.toRadians(f13);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d9 = f7;
            double d10 = f8;
            double d11 = (d10 * sin) + (d9 * cos);
            double d12 = d9;
            double d13 = f11;
            double d14 = d11 / d13;
            double d15 = f12;
            double d16 = ((d10 * cos) + ((-f7) * sin)) / d15;
            double d17 = d10;
            double d18 = f10;
            double d19 = ((d18 * sin) + (f9 * cos)) / d13;
            double d20 = ((d18 * cos) + ((-f9) * sin)) / d15;
            double d21 = d14 - d19;
            double d22 = d16 - d20;
            double d23 = (d14 + d19) / 2.0d;
            double d24 = (d16 + d20) / 2.0d;
            double d25 = (d22 * d22) + (d21 * d21);
            if (d25 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d26 = (1.0d / d25) - 0.25d;
            if (d26 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d25);
                float sqrt = (float) (Math.sqrt(d25) / 1.99999d);
                m5278a(path, f7, f8, f9, f10, f11 * sqrt, f12 * sqrt, f13, z6, z7);
                return;
            }
            double sqrt2 = Math.sqrt(d26);
            double d27 = d21 * sqrt2;
            double d28 = sqrt2 * d22;
            if (z6 == z7) {
                d7 = d23 - d28;
                d8 = d24 + d27;
            } else {
                d7 = d23 + d28;
                d8 = d24 - d27;
            }
            double atan2 = Math.atan2(d16 - d8, d14 - d7);
            double atan22 = Math.atan2(d20 - d8, d19 - d7) - atan2;
            int i7 = 0;
            if (z7 != (atan22 >= 0.0d)) {
                atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
            }
            double d29 = d7 * d13;
            double d30 = d8 * d15;
            double d31 = (d29 * cos) - (d30 * sin);
            double d32 = (d30 * cos) + (d29 * sin);
            int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
            double cos2 = Math.cos(radians);
            double sin2 = Math.sin(radians);
            double cos3 = Math.cos(atan2);
            double sin3 = Math.sin(atan2);
            double d33 = -d13;
            double d34 = d33 * cos2;
            double d35 = d15 * sin2;
            double d36 = (d34 * sin3) - (d35 * cos3);
            double d37 = d33 * sin2;
            double d38 = d15 * cos2;
            double d39 = (cos3 * d38) + (sin3 * d37);
            double d40 = atan22 / ceil;
            double d41 = atan2;
            while (i7 < ceil) {
                double d42 = d41 + d40;
                double sin4 = Math.sin(d42);
                double cos4 = Math.cos(d42);
                double d43 = d40;
                double d44 = (((d13 * cos2) * cos4) + d31) - (d35 * sin4);
                double d45 = d31;
                double d46 = (d38 * sin4) + (d13 * sin2 * cos4) + d32;
                double d47 = (d34 * sin4) - (d35 * cos4);
                double d48 = (cos4 * d38) + (sin4 * d37);
                double d49 = d42 - d41;
                double tan = Math.tan(d49 / 2.0d);
                double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d49)) / 3.0d;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) ((d36 * sqrt3) + d12), (float) ((d39 * sqrt3) + d17), (float) (d44 - (sqrt3 * d47)), (float) (d46 - (sqrt3 * d48)), (float) d44, (float) d46);
                i7++;
                d38 = d38;
                d37 = d37;
                ceil = ceil;
                cos2 = cos2;
                d41 = d42;
                d13 = d13;
                d39 = d48;
                d36 = d47;
                d12 = d44;
                d17 = d46;
                d40 = d43;
                d31 = d45;
            }
        }

        /* renamed from: b */
        public static void m5279b(a[] aVarArr, Path path) {
            int i7;
            int i8;
            char c7;
            a aVar;
            int i9;
            float f7;
            float f8;
            float f9;
            float f10;
            float f11;
            float f12;
            float f13;
            float f14;
            float f15;
            float f16;
            float f17;
            float f18;
            float f19;
            float f20;
            float f21;
            float f22;
            float f23;
            float f24;
            float f25;
            float f26;
            float f27;
            a[] aVarArr2 = aVarArr;
            float[] fArr = new float[6];
            char c8 = 'm';
            char c9 = 0;
            char c10 = 'm';
            int i10 = 0;
            while (i10 < aVarArr2.length) {
                a aVar2 = aVarArr2[i10];
                char c11 = aVar2.f9769a;
                float f28 = fArr[c9];
                float f29 = fArr[1];
                float f30 = fArr[2];
                float f31 = fArr[3];
                float f32 = fArr[4];
                float f33 = fArr[5];
                switch (c11) {
                    case 'A':
                    case 'a':
                        i7 = 7;
                        break;
                    case 'C':
                    case 'c':
                        i7 = 6;
                        break;
                    case 'H':
                    case 'V':
                    case 'h':
                    case 'v':
                        i7 = 1;
                        break;
                    case 'Q':
                    case 'S':
                    case 'q':
                    case 's':
                        i7 = 4;
                        break;
                    case 'Z':
                    case 'z':
                        path.close();
                        path.moveTo(f32, f33);
                        f28 = f32;
                        f30 = f28;
                        f29 = f33;
                        f31 = f29;
                    default:
                        i7 = 2;
                        break;
                }
                float f34 = f32;
                float f35 = f33;
                float f36 = f28;
                float f37 = f29;
                int i11 = 0;
                while (true) {
                    float[] fArr2 = aVar2.f9770b;
                    if (i11 < fArr2.length) {
                        if (c11 != 'A') {
                            if (c11 != 'C') {
                                if (c11 == 'H') {
                                    i8 = i11;
                                    c7 = c11;
                                    aVar = aVar2;
                                    i9 = i10;
                                    int i12 = i8 + 0;
                                    path.lineTo(fArr2[i12], f37);
                                    f36 = fArr2[i12];
                                } else if (c11 == 'Q') {
                                    i8 = i11;
                                    c7 = c11;
                                    aVar = aVar2;
                                    i9 = i10;
                                    int i13 = i8 + 0;
                                    int i14 = i8 + 1;
                                    int i15 = i8 + 2;
                                    int i16 = i8 + 3;
                                    path.quadTo(fArr2[i13], fArr2[i14], fArr2[i15], fArr2[i16]);
                                    f7 = fArr2[i13];
                                    f8 = fArr2[i14];
                                    f36 = fArr2[i15];
                                    f37 = fArr2[i16];
                                } else if (c11 == 'V') {
                                    i8 = i11;
                                    c7 = c11;
                                    aVar = aVar2;
                                    i9 = i10;
                                    int i17 = i8 + 0;
                                    path.lineTo(f36, fArr2[i17]);
                                    f37 = fArr2[i17];
                                } else if (c11 != 'a') {
                                    if (c11 != 'c') {
                                        if (c11 == 'h') {
                                            i8 = i11;
                                            int i18 = i8 + 0;
                                            path.rLineTo(fArr2[i18], 0.0f);
                                            f36 += fArr2[i18];
                                        } else if (c11 != 'q') {
                                            if (c11 != 'v') {
                                                if (c11 != 'L') {
                                                    if (c11 == 'M') {
                                                        i8 = i11;
                                                        f18 = fArr2[i8 + 0];
                                                        f19 = fArr2[i8 + 1];
                                                        if (i8 > 0) {
                                                            path.lineTo(f18, f19);
                                                        } else {
                                                            path.moveTo(f18, f19);
                                                            f34 = f18;
                                                            f35 = f19;
                                                        }
                                                    } else if (c11 == 'S') {
                                                        i8 = i11;
                                                        float f38 = f37;
                                                        float f39 = f36;
                                                        if (c10 == 'c' || c10 == 's' || c10 == 'C' || c10 == 'S') {
                                                            f20 = (f38 * 2.0f) - f31;
                                                            f21 = (f39 * 2.0f) - f30;
                                                        } else {
                                                            f21 = f39;
                                                            f20 = f38;
                                                        }
                                                        int i19 = i8 + 0;
                                                        int i20 = i8 + 1;
                                                        int i21 = i8 + 2;
                                                        int i22 = i8 + 3;
                                                        path.cubicTo(f21, f20, fArr2[i19], fArr2[i20], fArr2[i21], fArr2[i22]);
                                                        float f40 = fArr2[i19];
                                                        float f41 = fArr2[i20];
                                                        f15 = fArr2[i21];
                                                        f14 = fArr2[i22];
                                                        f30 = f40;
                                                        f31 = f41;
                                                        f36 = f15;
                                                        f37 = f14;
                                                    } else if (c11 == 'T') {
                                                        i8 = i11;
                                                        float f42 = f37;
                                                        float f43 = f36;
                                                        if (c10 == 'q' || c10 == 't' || c10 == 'Q' || c10 == 'T') {
                                                            f22 = (f43 * 2.0f) - f30;
                                                            f23 = (f42 * 2.0f) - f31;
                                                        } else {
                                                            f22 = f43;
                                                            f23 = f42;
                                                        }
                                                        int i23 = i8 + 0;
                                                        int i24 = i8 + 1;
                                                        path.quadTo(f22, f23, fArr2[i23], fArr2[i24]);
                                                        f31 = f23;
                                                        f30 = f22;
                                                        c7 = c11;
                                                        aVar = aVar2;
                                                        i9 = i10;
                                                        f36 = fArr2[i23];
                                                        f37 = fArr2[i24];
                                                    } else if (c11 == 'l') {
                                                        i8 = i11;
                                                        f16 = f37;
                                                        int i25 = i8 + 0;
                                                        float f44 = fArr2[i25];
                                                        int i26 = i8 + 1;
                                                        path.rLineTo(f44, fArr2[i26]);
                                                        f36 += fArr2[i25];
                                                        f17 = fArr2[i26];
                                                    } else if (c11 == c8) {
                                                        i8 = i11;
                                                        float f45 = fArr2[i8 + 0];
                                                        f36 += f45;
                                                        float f46 = fArr2[i8 + 1];
                                                        f37 += f46;
                                                        if (i8 > 0) {
                                                            path.rLineTo(f45, f46);
                                                        } else {
                                                            path.rMoveTo(f45, f46);
                                                            f35 = f37;
                                                            f34 = f36;
                                                        }
                                                    } else if (c11 != 's') {
                                                        if (c11 == 't') {
                                                            if (c10 == 'q' || c10 == 't' || c10 == 'Q' || c10 == 'T') {
                                                                f26 = f36 - f30;
                                                                f27 = f37 - f31;
                                                            } else {
                                                                f27 = 0.0f;
                                                                f26 = 0.0f;
                                                            }
                                                            int i27 = i11 + 0;
                                                            int i28 = i11 + 1;
                                                            path.rQuadTo(f26, f27, fArr2[i27], fArr2[i28]);
                                                            float f47 = f26 + f36;
                                                            float f48 = f27 + f37;
                                                            f36 += fArr2[i27];
                                                            f37 += fArr2[i28];
                                                            f31 = f48;
                                                            f30 = f47;
                                                        }
                                                        i8 = i11;
                                                    } else {
                                                        if (c10 == 'c' || c10 == 's' || c10 == 'C' || c10 == 'S') {
                                                            float f49 = f36 - f30;
                                                            f24 = f37 - f31;
                                                            f25 = f49;
                                                        } else {
                                                            f24 = 0.0f;
                                                            f25 = 0.0f;
                                                        }
                                                        int i29 = i11 + 0;
                                                        int i30 = i11 + 1;
                                                        int i31 = i11 + 2;
                                                        int i32 = i11 + 3;
                                                        i8 = i11;
                                                        f9 = f37;
                                                        float f50 = f36;
                                                        path.rCubicTo(f25, f24, fArr2[i29], fArr2[i30], fArr2[i31], fArr2[i32]);
                                                        f10 = fArr2[i29] + f50;
                                                        f11 = fArr2[i30] + f9;
                                                        f12 = f50 + fArr2[i31];
                                                        f13 = fArr2[i32];
                                                    }
                                                    f36 = f34;
                                                    f37 = f35;
                                                } else {
                                                    i8 = i11;
                                                    int i33 = i8 + 0;
                                                    int i34 = i8 + 1;
                                                    path.lineTo(fArr2[i33], fArr2[i34]);
                                                    f18 = fArr2[i33];
                                                    f19 = fArr2[i34];
                                                }
                                                f36 = f18;
                                                f37 = f19;
                                            } else {
                                                i8 = i11;
                                                f16 = f37;
                                                int i35 = i8 + 0;
                                                path.rLineTo(0.0f, fArr2[i35]);
                                                f17 = fArr2[i35];
                                            }
                                            f37 = f16 + f17;
                                        } else {
                                            i8 = i11;
                                            f9 = f37;
                                            float f51 = f36;
                                            int i36 = i8 + 0;
                                            float f52 = fArr2[i36];
                                            int i37 = i8 + 1;
                                            int i38 = i8 + 2;
                                            int i39 = i8 + 3;
                                            path.rQuadTo(f52, fArr2[i37], fArr2[i38], fArr2[i39]);
                                            f10 = fArr2[i36] + f51;
                                            f11 = fArr2[i37] + f9;
                                            float f53 = f51 + fArr2[i38];
                                            float f54 = fArr2[i39];
                                            f12 = f53;
                                            f13 = f54;
                                        }
                                        c7 = c11;
                                        aVar = aVar2;
                                        i9 = i10;
                                    } else {
                                        i8 = i11;
                                        f9 = f37;
                                        float f55 = f36;
                                        int i40 = i8 + 2;
                                        int i41 = i8 + 3;
                                        int i42 = i8 + 4;
                                        int i43 = i8 + 5;
                                        path.rCubicTo(fArr2[i8 + 0], fArr2[i8 + 1], fArr2[i40], fArr2[i41], fArr2[i42], fArr2[i43]);
                                        f10 = fArr2[i40] + f55;
                                        f11 = fArr2[i41] + f9;
                                        f12 = f55 + fArr2[i42];
                                        f13 = fArr2[i43];
                                    }
                                    f14 = f9 + f13;
                                    f30 = f10;
                                    f31 = f11;
                                    f15 = f12;
                                    f36 = f15;
                                    f37 = f14;
                                    c7 = c11;
                                    aVar = aVar2;
                                    i9 = i10;
                                } else {
                                    i8 = i11;
                                    float f56 = f37;
                                    float f57 = f36;
                                    int i44 = i8 + 5;
                                    int i45 = i8 + 6;
                                    c7 = c11;
                                    aVar = aVar2;
                                    i9 = i10;
                                    m5278a(path, f57, f56, fArr2[i44] + f57, fArr2[i45] + f56, fArr2[i8 + 0], fArr2[i8 + 1], fArr2[i8 + 2], fArr2[i8 + 3] != 0.0f, fArr2[i8 + 4] != 0.0f);
                                    f36 = f57 + fArr2[i44];
                                    f37 = f56 + fArr2[i45];
                                }
                                i11 = i8 + i7;
                                aVar2 = aVar;
                                c10 = c7;
                                c11 = c10;
                                i10 = i9;
                                c8 = 'm';
                            } else {
                                i8 = i11;
                                c7 = c11;
                                aVar = aVar2;
                                i9 = i10;
                                int i46 = i8 + 2;
                                int i47 = i8 + 3;
                                int i48 = i8 + 4;
                                int i49 = i8 + 5;
                                path.cubicTo(fArr2[i8 + 0], fArr2[i8 + 1], fArr2[i46], fArr2[i47], fArr2[i48], fArr2[i49]);
                                float f58 = fArr2[i48];
                                float f59 = fArr2[i49];
                                f7 = fArr2[i46];
                                f36 = f58;
                                f37 = f59;
                                f8 = fArr2[i47];
                            }
                            f30 = f7;
                            f31 = f8;
                            i11 = i8 + i7;
                            aVar2 = aVar;
                            c10 = c7;
                            c11 = c10;
                            i10 = i9;
                            c8 = 'm';
                        } else {
                            i8 = i11;
                            c7 = c11;
                            aVar = aVar2;
                            i9 = i10;
                            int i50 = i8 + 5;
                            int i51 = i8 + 6;
                            m5278a(path, f36, f37, fArr2[i50], fArr2[i51], fArr2[i8 + 0], fArr2[i8 + 1], fArr2[i8 + 2], fArr2[i8 + 3] != 0.0f, fArr2[i8 + 4] != 0.0f);
                            f36 = fArr2[i50];
                            f37 = fArr2[i51];
                        }
                        f31 = f37;
                        f30 = f36;
                        i11 = i8 + i7;
                        aVar2 = aVar;
                        c10 = c7;
                        c11 = c10;
                        i10 = i9;
                        c8 = 'm';
                    }
                }
                int i52 = i10;
                fArr[0] = f36;
                fArr[1] = f37;
                fArr[2] = f30;
                fArr[3] = f31;
                fArr[4] = f34;
                fArr[5] = f35;
                i10 = i52 + 1;
                c10 = aVarArr[i52].f9769a;
                c8 = 'm';
                c9 = 0;
                aVarArr2 = aVarArr;
            }
        }
    }

    /* renamed from: a */
    public static boolean m5273a(a[] aVarArr, a[] aVarArr2) {
        if (aVarArr == null || aVarArr2 == null || aVarArr.length != aVarArr2.length) {
            return false;
        }
        for (int i7 = 0; i7 < aVarArr.length; i7++) {
            a aVar = aVarArr[i7];
            char c7 = aVar.f9769a;
            a aVar2 = aVarArr2[i7];
            if (c7 != aVar2.f9769a || aVar.f9770b.length != aVar2.f9770b.length) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static float[] m5274b(int i7, float[] fArr) {
        if (i7 < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i8 = i7 - 0;
        int min = Math.min(i8, length - 0);
        float[] fArr2 = new float[i8];
        System.arraycopy(fArr, 0, fArr2, 0, min);
        return fArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x008b, code lost:
    
        if (r13 == false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0098 A[Catch: NumberFormatException -> 0x00b9, LOOP:3: B:29:0x006d->B:40:0x0098, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00b9, blocks: (B:26:0x005a, B:29:0x006d, B:31:0x0073, B:36:0x0081, B:40:0x0098, B:44:0x009d, B:49:0x00ad, B:61:0x00b1), top: B:25:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009d A[Catch: NumberFormatException -> 0x00b9, TryCatch #0 {NumberFormatException -> 0x00b9, blocks: (B:26:0x005a, B:29:0x006d, B:31:0x0073, B:36:0x0081, B:40:0x0098, B:44:0x009d, B:49:0x00ad, B:61:0x00b1), top: B:25:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ad A[Catch: NumberFormatException -> 0x00b9, TryCatch #0 {NumberFormatException -> 0x00b9, blocks: (B:26:0x005a, B:29:0x006d, B:31:0x0073, B:36:0x0081, B:40:0x0098, B:44:0x009d, B:49:0x00ad, B:61:0x00b1), top: B:25:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d6 A[SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p181x.C2155d.a[] m5275c(java.lang.String r16) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p181x.C2155d.m5275c(java.lang.String):x.d$a[]");
    }

    /* renamed from: d */
    public static Path m5276d(String str) {
        Path path = new Path();
        a[] m5275c = m5275c(str);
        if (m5275c == null) {
            return null;
        }
        try {
            a.m5279b(m5275c, path);
            return path;
        } catch (RuntimeException e7) {
            throw new RuntimeException(C0089a.m208f("Error in parsing ", str), e7);
        }
    }

    /* renamed from: e */
    public static a[] m5277e(a[] aVarArr) {
        if (aVarArr == null) {
            return null;
        }
        a[] aVarArr2 = new a[aVarArr.length];
        for (int i7 = 0; i7 < aVarArr.length; i7++) {
            aVarArr2[i7] = new a(aVarArr[i7]);
        }
        return aVarArr2;
    }
}
