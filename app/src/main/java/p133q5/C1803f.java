package p133q5;

import android.ext.Tools;

/* renamed from: q5.f */
/* loaded from: classes.dex */
public final class C1803f extends AbstractC1804g {

    /* renamed from: w1 */
    public static final /* synthetic */ int f8177w1 = 0;

    /* renamed from: X */
    public final int f8178X = 0;

    /* renamed from: Y */
    public final int f8179Y;

    /* renamed from: Z */
    public final int f8180Z;

    /* renamed from: s */
    public final byte[] f8181s;

    /* renamed from: q5.f$a */
    public static final class a {

        /* renamed from: a */
        public static final C1803f[] f8182a = new C1803f[Tools.Semaphore.f159S7];
    }

    public C1803f(byte[] bArr, int i7) {
        this.f8181s = bArr;
        this.f8179Y = i7;
        int i8 = (i7 >> 5) + 1;
        int i9 = i7;
        while (i7 >= i8) {
            i9 ^= ((i9 << 5) + (i9 >> 2)) + (bArr[(i7 + 0) - 1] & 255);
            i7 -= i8;
        }
        this.f8180Z = i9;
    }

    /* renamed from: B */
    public static C1803f m4255B(String str) {
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i7 = length;
        while (true) {
            length--;
            if (length < 0) {
                break;
            }
            char c7 = charArray[length];
            if (c7 >= 128) {
                i7 += c7 >= 2048 ? 2 : 1;
            }
        }
        byte[] bArr = new byte[i7];
        int i8 = 0;
        for (char c8 : charArray) {
            int i9 = i8 + 1;
            if (c8 < 128) {
                bArr[i8] = (byte) c8;
            } else if (c8 < 2048) {
                bArr[i8] = (byte) (((c8 >> 6) & 31) | 192);
                i8 = i9 + 1;
                bArr[i9] = (byte) ((c8 & '?') | Tools.Semaphore.f159S7);
            } else {
                bArr[i8] = (byte) (((c8 >> '\f') & 15) | 224);
                int i10 = i9 + 1;
                bArr[i9] = (byte) (((c8 >> 6) & 63) | Tools.Semaphore.f159S7);
                i9 = i10 + 1;
                bArr[i10] = (byte) ((c8 & '?') | Tools.Semaphore.f159S7);
            }
            i8 = i9;
        }
        return m4256C(bArr, i7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005b, code lost:
    
        if (r3 == false) goto L31;
     */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p133q5.C1803f m4256C(byte[] r11, int r12) {
        /*
            int r0 = r11.length
            r1 = 32
            if (r0 <= r1) goto Lb
            q5.f r0 = new q5.f
            r0.<init>(r11, r12)
            return r0
        Lb:
            int r0 = r12 >> 5
            r1 = 1
            int r0 = r0 + r1
            r2 = r12
            r3 = r2
        L11:
            if (r2 < r0) goto L24
            int r4 = r3 << 5
            int r5 = r3 >> 2
            int r4 = r4 + r5
            int r5 = r2 + 0
            int r5 = r5 + (-1)
            r5 = r11[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r4 = r4 + r5
            r3 = r3 ^ r4
            int r2 = r2 - r0
            goto L11
        L24:
            r0 = r3 & 127(0x7f, float:1.78E-43)
            q5.f[] r2 = p133q5.C1803f.a.f8182a
            r4 = r2[r0]
            if (r4 == 0) goto L62
            int r5 = r4.f8180Z
            if (r5 != r3) goto L62
            int r3 = r4.f8179Y
            r5 = 0
            if (r3 != r12) goto L5e
            byte[] r3 = r4.f8181s
            int r6 = r3.length
            int r7 = r4.f8178X
            int r8 = r7 + r12
            if (r6 < r8) goto L5a
            int r6 = r11.length
            int r8 = r5 + r12
            if (r6 >= r8) goto L44
            goto L5a
        L44:
            r6 = r12
            r8 = 0
        L46:
            int r6 = r6 + (-1)
            if (r6 < 0) goto L58
            int r9 = r7 + 1
            r7 = r3[r7]
            int r10 = r8 + 1
            r8 = r11[r8]
            if (r7 == r8) goto L55
            goto L5a
        L55:
            r7 = r9
            r8 = r10
            goto L46
        L58:
            r3 = 1
            goto L5b
        L5a:
            r3 = 0
        L5b:
            if (r3 == 0) goto L5e
            goto L5f
        L5e:
            r1 = 0
        L5f:
            if (r1 == 0) goto L62
            return r4
        L62:
            q5.f r1 = new q5.f
            r1.<init>(r11, r12)
            r2[r0] = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p133q5.C1803f.m4256C(byte[], int):q5.f");
    }

    @Override // p133q5.AbstractC1804g
    /* renamed from: A */
    public final String mo4251A() {
        byte[] bArr;
        int i7;
        int i8 = this.f8179Y;
        int i9 = this.f8178X;
        int i10 = i8 + i9;
        int i11 = 0;
        int i12 = i9;
        int i13 = 0;
        while (true) {
            bArr = this.f8181s;
            if (i12 >= i10) {
                break;
            }
            int i14 = i12 + 1;
            int i15 = bArr[i12] & 224;
            if (i15 != 192) {
                if (i15 != 224) {
                    i12 = i14;
                    i13++;
                } else {
                    i14++;
                }
            }
            i14++;
            i12 = i14;
            i13++;
        }
        char[] cArr = new char[i13];
        while (i9 < i10) {
            int i16 = i11 + 1;
            int i17 = i9 + 1;
            int i18 = bArr[i9];
            if (i18 < 0 && i17 < i10) {
                if (i18 < -32 || (i7 = i17 + 1) >= i10) {
                    i18 = ((i18 & 63) << 6) | (bArr[i17] & '?');
                    i17++;
                } else {
                    int i19 = ((i18 & 15) << 12) | ((bArr[i17] & '?') << 6);
                    i17 = i7 + 1;
                    i18 = i19 | (bArr[i7] & '?');
                }
            }
            cArr[i11] = (char) i18;
            i11 = i16;
            i9 = i17;
        }
        return new String(cArr);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1803f)) {
            return false;
        }
        C1803f c1803f = (C1803f) obj;
        if (this != c1803f) {
            int i7 = c1803f.f8179Y;
            int i8 = this.f8179Y;
            if (i7 != i8) {
                return false;
            }
            int i9 = this.f8178X;
            byte[] bArr = this.f8181s;
            int i10 = c1803f.f8178X;
            byte[] bArr2 = c1803f.f8181s;
            if (bArr2 != bArr || i10 != i9) {
                if (c1803f.f8180Z != this.f8180Z) {
                    return false;
                }
                for (int i11 = 0; i11 < i8; i11++) {
                    if (bArr2[i10 + i11] != bArr[i9 + i11]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f8180Z;
    }
}
