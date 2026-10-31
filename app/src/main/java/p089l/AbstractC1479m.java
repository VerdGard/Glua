package p089l;

import p002a1.C0017d;

/* renamed from: l.m */
/* loaded from: classes.dex */
public abstract class AbstractC1479m<K, V> {

    /* renamed from: a */
    public long[] f7040a = C1480n.f7044a;

    /* renamed from: b */
    public Object[] f7041b;

    /* renamed from: c */
    public Object[] f7042c;

    /* renamed from: d */
    public int f7043d;

    public AbstractC1479m() {
        Object[] objArr = C0017d.f28p;
        this.f7041b = objArr;
        this.f7042c = objArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0077, code lost:
    
        r11 = -1;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V m3868a(K r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r18.hashCode()
            goto Ld
        Lc:
            r3 = 0
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f7043d
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = 0
        L1d:
            long[] r7 = r0.f7040a
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L4a:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L52
            r11 = 1
            goto L53
        L52:
            r11 = 0
        L53:
            if (r11 == 0) goto L6e
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.f7041b
            r15 = r15[r11]
            boolean r15 = p032d6.C0898f.m2602a(r15, r1)
            if (r15 == 0) goto L68
            goto L78
        L68:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L4a
        L6e:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r9 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r9 == 0) goto L81
            r11 = -1
        L78:
            if (r11 < 0) goto L7f
            java.lang.Object[] r1 = r0.f7042c
            r1 = r1[r11]
            goto L80
        L7f:
            r1 = 0
        L80:
            return r1
        L81:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: p089l.AbstractC1479m.m3868a(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00df, code lost:
    
        r26 = r3;
        r7 = -9187201950435737472L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ed, code lost:
    
        if (((r5 & ((~r5) << 6)) & (-9187201950435737472L)) == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ef, code lost:
    
        r24 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p089l.AbstractC1479m.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Object[] objArr = this.f7041b;
        Object[] objArr2 = this.f7042c;
        long[] jArr = this.f7040a;
        int length = jArr.length - 2;
        int i7 = 0;
        if (length >= 0) {
            int i8 = 0;
            int i9 = 0;
            while (true) {
                long j7 = jArr[i8];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i8 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j7) < 128) {
                            int i12 = (i8 << 3) + i11;
                            Object obj = objArr[i12];
                            Object obj2 = objArr2[i12];
                            i9 += (obj2 != null ? obj2.hashCode() : 0) ^ (obj != null ? obj.hashCode() : 0);
                        }
                        j7 >>= 8;
                    }
                    if (i10 != 8) {
                        return i9;
                    }
                }
                if (i8 == length) {
                    i7 = i9;
                    break;
                }
                i8++;
            }
        }
        return i7;
    }

    public final String toString() {
        return "{}";
    }
}
