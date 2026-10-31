package p036e2;

import android.ext.Tools;
import java.lang.reflect.Array;

/* renamed from: e2.q0 */
/* loaded from: classes.dex */
public final class C1069q0 implements InterfaceC1062p0 {

    /* renamed from: g */
    public static final int[] f5323g;

    /* renamed from: h */
    public static final int[] f5324h;

    /* renamed from: i */
    public static final byte[] f5325i;

    /* renamed from: j */
    public static final byte[] f5326j;

    /* renamed from: k */
    public static final int[] f5327k;

    /* renamed from: l */
    public static final int[] f5328l;

    /* renamed from: m */
    public static final int[] f5329m;

    /* renamed from: n */
    public static final int[] f5330n;

    /* renamed from: o */
    public static final int[] f5331o;

    /* renamed from: p */
    public static final int[] f5332p;

    /* renamed from: q */
    public static final int[] f5333q;

    /* renamed from: r */
    public static final int[] f5334r;

    /* renamed from: s */
    public static final int[] f5335s;

    /* renamed from: t */
    public static final int[] f5336t;

    /* renamed from: u */
    public static final int[] f5337u;

    /* renamed from: v */
    public static final int[] f5338v;

    /* renamed from: w */
    public static final byte[] f5339w;

    /* renamed from: b */
    public boolean f5340b = false;

    /* renamed from: c */
    public boolean f5341c = false;

    /* renamed from: d */
    public Object[] f5342d = null;

    /* renamed from: e */
    public int[] f5343e = null;

    /* renamed from: f */
    public int f5344f = 0;

    static {
        int i7;
        int[] iArr = new int[Tools.Semaphore.f160S8];
        f5323g = iArr;
        f5324h = new int[Tools.Semaphore.f160S8];
        f5325i = new byte[Tools.Semaphore.f160S8];
        f5326j = new byte[Tools.Semaphore.f160S8];
        f5327k = new int[Tools.Semaphore.f160S8];
        f5328l = new int[Tools.Semaphore.f160S8];
        f5329m = new int[Tools.Semaphore.f160S8];
        f5330n = new int[Tools.Semaphore.f160S8];
        f5331o = new int[Tools.Semaphore.f160S8];
        f5332p = new int[Tools.Semaphore.f160S8];
        f5333q = new int[Tools.Semaphore.f160S8];
        f5334r = new int[Tools.Semaphore.f160S8];
        f5335s = new int[Tools.Semaphore.f160S8];
        f5336t = new int[Tools.Semaphore.f160S8];
        f5337u = new int[Tools.Semaphore.f160S8];
        f5338v = new int[Tools.Semaphore.f160S8];
        f5339w = new byte[30];
        iArr[0] = 1;
        for (int i8 = 1; i8 < 256; i8++) {
            int[] iArr2 = f5323g;
            int i9 = iArr2[i8 - 1];
            int i10 = i9 ^ (i9 << 1);
            if ((i10 & Tools.Semaphore.f160S8) != 0) {
                i10 ^= 283;
            }
            iArr2[i8] = i10;
        }
        for (int i11 = 1; i11 < 255; i11++) {
            f5324h[f5323g[i11]] = i11;
        }
        byte[][] bArr = {new byte[]{1, 1, 1, 1, 1, 0, 0, 0}, new byte[]{0, 1, 1, 1, 1, 1, 0, 0}, new byte[]{0, 0, 1, 1, 1, 1, 1, 0}, new byte[]{0, 0, 0, 1, 1, 1, 1, 1}, new byte[]{1, 0, 0, 0, 1, 1, 1, 1}, new byte[]{1, 1, 0, 0, 0, 1, 1, 1}, new byte[]{1, 1, 1, 0, 0, 0, 1, 1}, new byte[]{1, 1, 1, 1, 0, 0, 0, 1}};
        byte[] bArr2 = {0, 1, 1, 0, 0, 0, 1, 1};
        byte[][] bArr3 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, Tools.Semaphore.f160S8, 8);
        bArr3[1][7] = 1;
        for (int i12 = 2; i12 < 256; i12++) {
            int i13 = f5323g[255 - f5324h[i12]];
            for (int i14 = 0; i14 < 8; i14++) {
                bArr3[i12][i14] = (byte) ((i13 >>> (7 - i14)) & 1);
            }
        }
        byte[][] bArr4 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, Tools.Semaphore.f160S8, 8);
        for (int i15 = 0; i15 < 256; i15++) {
            for (int i16 = 0; i16 < 8; i16++) {
                bArr4[i15][i16] = bArr2[i16];
                for (int i17 = 0; i17 < 8; i17++) {
                    byte[] bArr5 = bArr4[i15];
                    bArr5[i16] = (byte) (bArr5[i16] ^ (bArr[i16][i17] * bArr3[i15][i17]));
                }
            }
        }
        for (int i18 = 0; i18 < 256; i18++) {
            f5325i[i18] = (byte) (bArr4[i18][0] << 7);
            for (int i19 = 1; i19 < 8; i19++) {
                byte[] bArr6 = f5325i;
                bArr6[i18] = (byte) (bArr6[i18] ^ (bArr4[i18][i19] << (7 - i19)));
            }
            f5326j[f5325i[i18] & 255] = (byte) i18;
        }
        byte[][] bArr7 = {new byte[]{2, 1, 1, 3}, new byte[]{3, 2, 1, 1}, new byte[]{1, 3, 2, 1}, new byte[]{1, 1, 3, 2}};
        byte[][] bArr8 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 4, 8);
        for (int i20 = 0; i20 < 4; i20++) {
            for (int i21 = 0; i21 < 4; i21++) {
                bArr8[i20][i21] = bArr7[i20][i21];
            }
            bArr8[i20][i20 + 4] = 1;
        }
        byte[][] bArr9 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 4, 4);
        for (int i22 = 0; i22 < 4; i22++) {
            byte b7 = bArr8[i22][i22];
            if (b7 == 0) {
                int i23 = i22 + 1;
                while (bArr8[i23][i22] == 0 && i23 < 4) {
                    i23++;
                }
                if (i23 == 4) {
                    throw new RuntimeException("G matrix is not invertible");
                }
                for (int i24 = 0; i24 < 8; i24++) {
                    byte[] bArr10 = bArr8[i22];
                    byte b8 = bArr10[i24];
                    byte[] bArr11 = bArr8[i23];
                    bArr10[i24] = bArr11[i24];
                    bArr11[i24] = b8;
                }
                b7 = bArr8[i22][i22];
            }
            for (int i25 = 0; i25 < 8; i25++) {
                byte[] bArr12 = bArr8[i22];
                byte b9 = bArr12[i25];
                if (b9 != 0) {
                    int[] iArr3 = f5323g;
                    int[] iArr4 = f5324h;
                    bArr12[i25] = (byte) iArr3[((iArr4[b9 & 255] + 255) - iArr4[b7 & 255]) % 255];
                }
            }
            for (int i26 = 0; i26 < 4; i26++) {
                if (i22 != i26) {
                    for (int i27 = i22 + 1; i27 < 8; i27++) {
                        byte[] bArr13 = bArr8[i26];
                        byte b10 = bArr13[i27];
                        byte b11 = bArr8[i22][i27];
                        byte b12 = bArr13[i22];
                        if (b11 == 0 || b12 == 0) {
                            i7 = 0;
                        } else {
                            int[] iArr5 = f5324h;
                            i7 = f5323g[(iArr5[b11 & 255] + iArr5[b12 & 255]) % 255];
                        }
                        bArr13[i27] = (byte) (b10 ^ i7);
                    }
                    bArr8[i26][i22] = 0;
                }
            }
        }
        for (int i28 = 0; i28 < 4; i28++) {
            for (int i29 = 0; i29 < 4; i29++) {
                bArr9[i28][i29] = bArr8[i28][i29 + 4];
            }
        }
        for (int i30 = 0; i30 < 256; i30++) {
            byte b13 = f5325i[i30];
            f5327k[i30] = m3165a(b13, bArr7[0]);
            f5328l[i30] = m3165a(b13, bArr7[1]);
            f5329m[i30] = m3165a(b13, bArr7[2]);
            f5330n[i30] = m3165a(b13, bArr7[3]);
            byte b14 = f5326j[i30];
            f5331o[i30] = m3165a(b14, bArr9[0]);
            f5332p[i30] = m3165a(b14, bArr9[1]);
            f5333q[i30] = m3165a(b14, bArr9[2]);
            f5334r[i30] = m3165a(b14, bArr9[3]);
            f5335s[i30] = m3165a(i30, bArr9[0]);
            f5336t[i30] = m3165a(i30, bArr9[1]);
            f5337u[i30] = m3165a(i30, bArr9[2]);
            f5338v[i30] = m3165a(i30, bArr9[3]);
        }
        f5339w[0] = 1;
        int i31 = 1;
        for (int i32 = 1; i32 < 30; i32++) {
            if (i31 != 0) {
                int[] iArr6 = f5324h;
                i31 = f5323g[(iArr6[2] + iArr6[i31 & 255]) % 255];
            } else {
                i31 = 0;
            }
            f5339w[i32] = (byte) i31;
        }
        f5324h = null;
        f5323g = null;
    }

    /* renamed from: a */
    public static final int m3165a(int i7, byte[] bArr) {
        if (i7 == 0) {
            return 0;
        }
        int[] iArr = f5324h;
        int i8 = iArr[i7 & 255];
        byte b7 = bArr[0];
        int[] iArr2 = f5323g;
        int i9 = b7 != 0 ? iArr2[(iArr[b7 & 255] + i8) % 255] & 255 : 0;
        byte b8 = bArr[1];
        int i10 = b8 != 0 ? iArr2[(iArr[b8 & 255] + i8) % 255] & 255 : 0;
        byte b9 = bArr[2];
        int i11 = b9 != 0 ? iArr2[(iArr[b9 & 255] + i8) % 255] & 255 : 0;
        byte b10 = bArr[3];
        return (i9 << 24) | (i10 << 16) | (i11 << 8) | (b10 != 0 ? iArr2[(i8 + iArr[b10 & 255]) % 255] & 255 : 0);
    }

    /* renamed from: b */
    public final void m3166b(int i7, byte[] bArr, byte[] bArr2) {
        int i8;
        int i9 = i7 + 1;
        int i10 = i9 + 1;
        int i11 = ((bArr[i9] & 255) << 16) | (bArr[i7] << 24);
        int i12 = i10 + 1;
        int i13 = i11 | ((bArr[i10] & 255) << 8);
        int i14 = i12 + 1;
        int i15 = i13 | (bArr[i12] & 255);
        int[] iArr = this.f5343e;
        int i16 = i15 ^ iArr[4];
        int i17 = i14 + 1;
        int i18 = i17 + 1;
        int i19 = (bArr[i14] << 24) | ((bArr[i17] & 255) << 16);
        int i20 = i18 + 1;
        int i21 = i19 | ((bArr[i18] & 255) << 8);
        int i22 = i20 + 1;
        int i23 = (i21 | (bArr[i20] & 255)) ^ iArr[5];
        int i24 = i22 + 1;
        int i25 = i24 + 1;
        int i26 = (bArr[i22] << 24) | ((bArr[i24] & 255) << 16);
        int i27 = i25 + 1;
        int i28 = i26 | ((bArr[i25] & 255) << 8);
        int i29 = i27 + 1;
        int i30 = (i28 | (bArr[i27] & 255)) ^ iArr[6];
        int i31 = i29 + 1;
        int i32 = i31 + 1;
        int i33 = ((((bArr[i29] << 24) | ((bArr[i31] & 255) << 16)) | ((bArr[i32] & 255) << 8)) | (bArr[i32 + 1] & 255)) ^ iArr[7];
        boolean z6 = this.f5340b;
        int[] iArr2 = f5334r;
        int[] iArr3 = f5333q;
        int[] iArr4 = f5332p;
        int[] iArr5 = f5331o;
        if (z6) {
            int i34 = (((iArr4[(i33 >>> 16) & 255] ^ iArr5[i16 >>> 24]) ^ iArr3[(i30 >>> 8) & 255]) ^ iArr2[i23 & 255]) ^ iArr[8];
            int i35 = (((iArr4[(i16 >>> 16) & 255] ^ iArr5[i23 >>> 24]) ^ iArr3[(i33 >>> 8) & 255]) ^ iArr2[i30 & 255]) ^ iArr[9];
            int i36 = (((iArr4[(i23 >>> 16) & 255] ^ iArr5[i30 >>> 24]) ^ iArr3[(i16 >>> 8) & 255]) ^ iArr2[i33 & 255]) ^ iArr[10];
            int i37 = (iArr2[i16 & 255] ^ (iArr3[(i23 >>> 8) & 255] ^ (iArr4[(i30 >>> 16) & 255] ^ iArr5[i33 >>> 24]))) ^ iArr[11];
            int i38 = (((iArr5[i34 >>> 24] ^ iArr4[(i37 >>> 16) & 255]) ^ iArr3[(i36 >>> 8) & 255]) ^ iArr2[i35 & 255]) ^ iArr[12];
            int i39 = (((iArr5[i35 >>> 24] ^ iArr4[(i34 >>> 16) & 255]) ^ iArr3[(i37 >>> 8) & 255]) ^ iArr2[i36 & 255]) ^ iArr[13];
            int i40 = (((iArr5[i36 >>> 24] ^ iArr4[(i35 >>> 16) & 255]) ^ iArr3[(i34 >>> 8) & 255]) ^ iArr2[i37 & 255]) ^ iArr[14];
            int i41 = (((iArr5[i37 >>> 24] ^ iArr4[(i36 >>> 16) & 255]) ^ iArr3[(i35 >>> 8) & 255]) ^ iArr2[i34 & 255]) ^ iArr[15];
            if (this.f5341c) {
                int i42 = (((iArr5[i38 >>> 24] ^ iArr4[(i41 >>> 16) & 255]) ^ iArr3[(i40 >>> 8) & 255]) ^ iArr2[i39 & 255]) ^ iArr[16];
                int i43 = (((iArr5[i39 >>> 24] ^ iArr4[(i38 >>> 16) & 255]) ^ iArr3[(i41 >>> 8) & 255]) ^ iArr2[i40 & 255]) ^ iArr[17];
                int i44 = (((iArr5[i40 >>> 24] ^ iArr4[(i39 >>> 16) & 255]) ^ iArr3[(i38 >>> 8) & 255]) ^ iArr2[i41 & 255]) ^ iArr[18];
                int i45 = (((iArr5[i41 >>> 24] ^ iArr4[(i40 >>> 16) & 255]) ^ iArr3[(i39 >>> 8) & 255]) ^ iArr2[i38 & 255]) ^ iArr[19];
                i38 = (((iArr5[i42 >>> 24] ^ iArr4[(i45 >>> 16) & 255]) ^ iArr3[(i44 >>> 8) & 255]) ^ iArr2[i43 & 255]) ^ iArr[20];
                i39 = (((iArr5[i43 >>> 24] ^ iArr4[(i42 >>> 16) & 255]) ^ iArr3[(i45 >>> 8) & 255]) ^ iArr2[i44 & 255]) ^ iArr[21];
                i40 = (((iArr5[i44 >>> 24] ^ iArr4[(i43 >>> 16) & 255]) ^ iArr3[(i42 >>> 8) & 255]) ^ iArr2[i45 & 255]) ^ iArr[22];
                i41 = (((iArr5[i45 >>> 24] ^ iArr4[(i44 >>> 16) & 255]) ^ iArr3[(i43 >>> 8) & 255]) ^ iArr2[i42 & 255]) ^ iArr[23];
                i8 = 24;
            } else {
                i8 = 16;
            }
            int i46 = i40;
            i33 = i41;
            i16 = i38;
            i23 = i39;
            i30 = i46;
        } else {
            i8 = 8;
        }
        int i47 = i8 + 1;
        int i48 = iArr[i8] ^ (((iArr5[i16 >>> 24] ^ iArr4[(i33 >>> 16) & 255]) ^ iArr3[(i30 >>> 8) & 255]) ^ iArr2[i23 & 255]);
        int i49 = i47 + 1;
        int i50 = (((iArr5[i23 >>> 24] ^ iArr4[(i16 >>> 16) & 255]) ^ iArr3[(i33 >>> 8) & 255]) ^ iArr2[i30 & 255]) ^ iArr[i47];
        int i51 = ((iArr4[(i23 >>> 16) & 255] ^ iArr5[i30 >>> 24]) ^ iArr3[(i16 >>> 8) & 255]) ^ iArr2[i33 & 255];
        int i52 = i49 + 1;
        int i53 = i51 ^ iArr[i49];
        int i54 = iArr2[i16 & 255] ^ (iArr3[(i23 >>> 8) & 255] ^ (iArr4[(i30 >>> 16) & 255] ^ iArr5[i33 >>> 24]));
        int i55 = i52 + 1;
        int i56 = i54 ^ iArr[i52];
        int i57 = i55 + 1;
        int i58 = iArr[i55] ^ (((iArr5[i48 >>> 24] ^ iArr4[(i56 >>> 16) & 255]) ^ iArr3[(i53 >>> 8) & 255]) ^ iArr2[i50 & 255]);
        int i59 = i57 + 1;
        int i60 = (((iArr5[i50 >>> 24] ^ iArr4[(i48 >>> 16) & 255]) ^ iArr3[(i56 >>> 8) & 255]) ^ iArr2[i53 & 255]) ^ iArr[i57];
        int i61 = i59 + 1;
        int i62 = (((iArr5[i53 >>> 24] ^ iArr4[(i50 >>> 16) & 255]) ^ iArr3[(i48 >>> 8) & 255]) ^ iArr2[i56 & 255]) ^ iArr[i59];
        int i63 = ((iArr5[i56 >>> 24] ^ iArr4[(i53 >>> 16) & 255]) ^ iArr3[(i50 >>> 8) & 255]) ^ iArr2[i48 & 255];
        int i64 = i61 + 1;
        int i65 = i63 ^ iArr[i61];
        int i66 = i64 + 1;
        int i67 = iArr[i64] ^ (((iArr5[i58 >>> 24] ^ iArr4[(i65 >>> 16) & 255]) ^ iArr3[(i62 >>> 8) & 255]) ^ iArr2[i60 & 255]);
        int i68 = i66 + 1;
        int i69 = (((iArr5[i60 >>> 24] ^ iArr4[(i58 >>> 16) & 255]) ^ iArr3[(i65 >>> 8) & 255]) ^ iArr2[i62 & 255]) ^ iArr[i66];
        int i70 = i68 + 1;
        int i71 = (((iArr5[i62 >>> 24] ^ iArr4[(i60 >>> 16) & 255]) ^ iArr3[(i58 >>> 8) & 255]) ^ iArr2[i65 & 255]) ^ iArr[i68];
        int i72 = ((iArr5[i65 >>> 24] ^ iArr4[(i62 >>> 16) & 255]) ^ iArr3[(i60 >>> 8) & 255]) ^ iArr2[i58 & 255];
        int i73 = i70 + 1;
        int i74 = i72 ^ iArr[i70];
        int i75 = i73 + 1;
        int i76 = iArr[i73] ^ (((iArr5[i67 >>> 24] ^ iArr4[(i74 >>> 16) & 255]) ^ iArr3[(i71 >>> 8) & 255]) ^ iArr2[i69 & 255]);
        int i77 = i75 + 1;
        int i78 = (((iArr5[i69 >>> 24] ^ iArr4[(i67 >>> 16) & 255]) ^ iArr3[(i74 >>> 8) & 255]) ^ iArr2[i71 & 255]) ^ iArr[i75];
        int i79 = i77 + 1;
        int i80 = (((iArr5[i71 >>> 24] ^ iArr4[(i69 >>> 16) & 255]) ^ iArr3[(i67 >>> 8) & 255]) ^ iArr2[i74 & 255]) ^ iArr[i77];
        int i81 = ((iArr5[i74 >>> 24] ^ iArr4[(i71 >>> 16) & 255]) ^ iArr3[(i69 >>> 8) & 255]) ^ iArr2[i67 & 255];
        int i82 = i79 + 1;
        int i83 = i81 ^ iArr[i79];
        int i84 = i82 + 1;
        int i85 = iArr[i82] ^ (((iArr5[i76 >>> 24] ^ iArr4[(i83 >>> 16) & 255]) ^ iArr3[(i80 >>> 8) & 255]) ^ iArr2[i78 & 255]);
        int i86 = i84 + 1;
        int i87 = (((iArr5[i78 >>> 24] ^ iArr4[(i76 >>> 16) & 255]) ^ iArr3[(i83 >>> 8) & 255]) ^ iArr2[i80 & 255]) ^ iArr[i84];
        int i88 = i86 + 1;
        int i89 = (((iArr5[i80 >>> 24] ^ iArr4[(i78 >>> 16) & 255]) ^ iArr3[(i76 >>> 8) & 255]) ^ iArr2[i83 & 255]) ^ iArr[i86];
        int i90 = ((iArr5[i83 >>> 24] ^ iArr4[(i80 >>> 16) & 255]) ^ iArr3[(i78 >>> 8) & 255]) ^ iArr2[i76 & 255];
        int i91 = i88 + 1;
        int i92 = i90 ^ iArr[i88];
        int i93 = i91 + 1;
        int i94 = iArr[i91] ^ (((iArr5[i85 >>> 24] ^ iArr4[(i92 >>> 16) & 255]) ^ iArr3[(i89 >>> 8) & 255]) ^ iArr2[i87 & 255]);
        int i95 = i93 + 1;
        int i96 = (((iArr5[i87 >>> 24] ^ iArr4[(i85 >>> 16) & 255]) ^ iArr3[(i92 >>> 8) & 255]) ^ iArr2[i89 & 255]) ^ iArr[i93];
        int i97 = i95 + 1;
        int i98 = (((iArr5[i89 >>> 24] ^ iArr4[(i87 >>> 16) & 255]) ^ iArr3[(i85 >>> 8) & 255]) ^ iArr2[i92 & 255]) ^ iArr[i95];
        int i99 = ((iArr5[i92 >>> 24] ^ iArr4[(i89 >>> 16) & 255]) ^ iArr3[(i87 >>> 8) & 255]) ^ iArr2[i85 & 255];
        int i100 = i97 + 1;
        int i101 = i99 ^ iArr[i97];
        int i102 = i100 + 1;
        int i103 = iArr[i100] ^ (((iArr5[i94 >>> 24] ^ iArr4[(i101 >>> 16) & 255]) ^ iArr3[(i98 >>> 8) & 255]) ^ iArr2[i96 & 255]);
        int i104 = i102 + 1;
        int i105 = (((iArr5[i96 >>> 24] ^ iArr4[(i94 >>> 16) & 255]) ^ iArr3[(i101 >>> 8) & 255]) ^ iArr2[i98 & 255]) ^ iArr[i102];
        int i106 = i104 + 1;
        int i107 = (((iArr5[i98 >>> 24] ^ iArr4[(i96 >>> 16) & 255]) ^ iArr3[(i94 >>> 8) & 255]) ^ iArr2[i101 & 255]) ^ iArr[i104];
        int i108 = ((iArr5[i101 >>> 24] ^ iArr4[(i98 >>> 16) & 255]) ^ iArr3[(i96 >>> 8) & 255]) ^ iArr2[i94 & 255];
        int i109 = i106 + 1;
        int i110 = i108 ^ iArr[i106];
        int i111 = i109 + 1;
        int i112 = iArr[i109] ^ (((iArr5[i103 >>> 24] ^ iArr4[(i110 >>> 16) & 255]) ^ iArr3[(i107 >>> 8) & 255]) ^ iArr2[i105 & 255]);
        int i113 = i111 + 1;
        int i114 = (((iArr5[i105 >>> 24] ^ iArr4[(i103 >>> 16) & 255]) ^ iArr3[(i110 >>> 8) & 255]) ^ iArr2[i107 & 255]) ^ iArr[i111];
        int i115 = i113 + 1;
        int i116 = (((iArr5[i107 >>> 24] ^ iArr4[(i105 >>> 16) & 255]) ^ iArr3[(i103 >>> 8) & 255]) ^ iArr2[i110 & 255]) ^ iArr[i113];
        int i117 = ((iArr5[i110 >>> 24] ^ iArr4[(i107 >>> 16) & 255]) ^ iArr3[(i105 >>> 8) & 255]) ^ iArr2[i103 & 255];
        int i118 = i115 + 1;
        int i119 = i117 ^ iArr[i115];
        int i120 = i118 + 1;
        int i121 = iArr[i118] ^ (((iArr5[i112 >>> 24] ^ iArr4[(i119 >>> 16) & 255]) ^ iArr3[(i116 >>> 8) & 255]) ^ iArr2[i114 & 255]);
        int i122 = i120 + 1;
        int i123 = (((iArr5[i114 >>> 24] ^ iArr4[(i112 >>> 16) & 255]) ^ iArr3[(i119 >>> 8) & 255]) ^ iArr2[i116 & 255]) ^ iArr[i120];
        int i124 = (((iArr5[i116 >>> 24] ^ iArr4[(i114 >>> 16) & 255]) ^ iArr3[(i112 >>> 8) & 255]) ^ iArr2[i119 & 255]) ^ iArr[i122];
        int i125 = (((iArr5[i119 >>> 24] ^ iArr4[(i116 >>> 16) & 255]) ^ iArr3[(i114 >>> 8) & 255]) ^ iArr2[i112 & 255]) ^ iArr[i122 + 1];
        int i126 = iArr[0];
        byte[] bArr3 = f5326j;
        bArr2[0] = (byte) (bArr3[i121 >>> 24] ^ (i126 >>> 24));
        bArr2[1] = (byte) (bArr3[(i125 >>> 16) & 255] ^ (i126 >>> 16));
        bArr2[2] = (byte) (bArr3[(i124 >>> 8) & 255] ^ (i126 >>> 8));
        bArr2[3] = (byte) (bArr3[i123 & 255] ^ i126);
        int i127 = iArr[1];
        bArr2[4] = (byte) (bArr3[i123 >>> 24] ^ (i127 >>> 24));
        bArr2[5] = (byte) (bArr3[(i121 >>> 16) & 255] ^ (i127 >>> 16));
        bArr2[6] = (byte) (bArr3[(i125 >>> 8) & 255] ^ (i127 >>> 8));
        bArr2[7] = (byte) (i127 ^ bArr3[i124 & 255]);
        int i128 = iArr[2];
        bArr2[8] = (byte) (bArr3[i124 >>> 24] ^ (i128 >>> 24));
        bArr2[9] = (byte) (bArr3[(i123 >>> 16) & 255] ^ (i128 >>> 16));
        bArr2[10] = (byte) (bArr3[(i121 >>> 8) & 255] ^ (i128 >>> 8));
        bArr2[11] = (byte) (i128 ^ bArr3[i125 & 255]);
        int i129 = iArr[3];
        bArr2[12] = (byte) (bArr3[i125 >>> 24] ^ (i129 >>> 24));
        bArr2[13] = (byte) (bArr3[(i124 >>> 16) & 255] ^ (i129 >>> 16));
        bArr2[14] = (byte) (bArr3[(i123 >>> 8) & 255] ^ (i129 >>> 8));
        bArr2[15] = (byte) (bArr3[i121 & 255] ^ i129);
    }
}
