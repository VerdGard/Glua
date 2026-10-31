package p089l;

import p032d6.C0898f;

/* renamed from: l.e */
/* loaded from: classes.dex */
public abstract class AbstractC1471e {

    /* renamed from: a */
    public long[] f7025a = C1480n.f7044a;

    /* renamed from: b */
    public int[] f7026b = C1472f.f7028a;

    /* renamed from: c */
    public int f7027c;

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c8, code lost:
    
        r5 = -9187201950435737472L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d4, code lost:
    
        if (((r2 & ((~r2) << 6)) & (-9187201950435737472L)) == 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d6, code lost:
    
        r23 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p089l.AbstractC1471e.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int[] iArr = this.f7026b;
        long[] jArr = this.f7025a;
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
                            i9 += iArr[(i8 << 3) + i11];
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
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.f7026b;
        long[] jArr = this.f7025a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i7 = 0;
            int i8 = 0;
            loop0: while (true) {
                long j7 = jArr[i7];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j7) < 128) {
                            int i11 = iArr[(i7 << 3) + i10];
                            if (i8 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i8 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append(i11);
                            i8++;
                        }
                        j7 >>= 8;
                    }
                    if (i9 != 8) {
                        break;
                    }
                }
                if (i7 == length) {
                    break;
                }
                i7++;
            }
        }
        sb.append((CharSequence) "]");
        String sb2 = sb.toString();
        C0898f.m2605d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
