package p096l6;

import java.io.DataOutputStream;

/* renamed from: l6.b */
/* loaded from: classes.dex */
public final class C1513b extends AbstractC1511a {

    /* renamed from: A1 */
    public AbstractC1511a[] f7142A1;

    /* renamed from: X */
    public final int f7143X;

    /* renamed from: Y */
    public final int f7144Y;

    /* renamed from: Z */
    public int f7145Z;

    /* renamed from: w1 */
    public byte[] f7146w1;

    /* renamed from: x1 */
    public int f7147x1;

    /* renamed from: y1 */
    public C1515c[] f7148y1;

    /* renamed from: z1 */
    public int f7149z1;

    public C1513b(int i7, int i8, int i9, int i10, byte[] bArr, C1515c[] c1515cArr, AbstractC1511a[] abstractC1511aArr, C1529o c1529o) {
        super((byte) 2, i7, i8, c1529o);
        this.f7143X = i9;
        this.f7144Y = i10;
        this.f7146w1 = bArr;
        this.f7145Z = bArr.length;
        this.f7148y1 = c1515cArr;
        this.f7147x1 = c1515cArr.length;
        this.f7142A1 = abstractC1511aArr;
        this.f7149z1 = abstractC1511aArr.length;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f7149z1; i12++) {
            i11 += this.f7142A1[i12].f7138e + 6;
        }
        this.f7138e = (this.f7147x1 * 8) + this.f7145Z + 8 + 2 + 2 + i11;
    }

    @Override // p096l6.AbstractC1511a
    /* renamed from: a */
    public final void mo3929a(DataOutputStream dataOutputStream) {
        super.mo3929a(dataOutputStream);
        dataOutputStream.writeShort(this.f7143X);
        dataOutputStream.writeShort(this.f7144Y);
        dataOutputStream.writeInt(this.f7145Z);
        dataOutputStream.write(this.f7146w1, 0, this.f7145Z);
        dataOutputStream.writeShort(this.f7147x1);
        if (this.f7147x1 > 0) {
            C1515c c1515c = this.f7148y1[0];
            throw null;
        }
        dataOutputStream.writeShort(this.f7149z1);
        for (int i7 = 0; i7 < this.f7149z1; i7++) {
            this.f7142A1[i7].mo3929a(dataOutputStream);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01d8 A[Catch: IOException -> 0x0386, TryCatch #2 {IOException -> 0x0386, blocks: (B:28:0x0126, B:29:0x0129, B:31:0x0245, B:32:0x0248, B:33:0x024b, B:34:0x02d3, B:37:0x02d8, B:39:0x02df, B:40:0x02e6, B:41:0x02e9, B:42:0x02fe, B:44:0x0306, B:45:0x02ec, B:46:0x02fa, B:48:0x02f1, B:49:0x02f6, B:51:0x036d, B:63:0x0283, B:64:0x029e, B:65:0x036a, B:66:0x02a1, B:67:0x0335, B:68:0x02c9, B:69:0x024f, B:70:0x026c, B:72:0x031b, B:73:0x031e, B:74:0x01e0, B:75:0x0212, B:76:0x0217, B:77:0x022e, B:78:0x0130, B:80:0x0156, B:82:0x017a, B:84:0x017d, B:87:0x01c7, B:88:0x0180, B:90:0x01b3, B:92:0x01c1, B:94:0x01c4, B:97:0x01cc, B:99:0x01d0, B:100:0x01dc, B:101:0x01d8, B:102:0x0291, B:111:0x0343, B:113:0x034d, B:114:0x0361, B:115:0x0359), top: B:27:0x0126 }] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0291 A[Catch: IOException -> 0x0386, TryCatch #2 {IOException -> 0x0386, blocks: (B:28:0x0126, B:29:0x0129, B:31:0x0245, B:32:0x0248, B:33:0x024b, B:34:0x02d3, B:37:0x02d8, B:39:0x02df, B:40:0x02e6, B:41:0x02e9, B:42:0x02fe, B:44:0x0306, B:45:0x02ec, B:46:0x02fa, B:48:0x02f1, B:49:0x02f6, B:51:0x036d, B:63:0x0283, B:64:0x029e, B:65:0x036a, B:66:0x02a1, B:67:0x0335, B:68:0x02c9, B:69:0x024f, B:70:0x026c, B:72:0x031b, B:73:0x031e, B:74:0x01e0, B:75:0x0212, B:76:0x0217, B:77:0x022e, B:78:0x0130, B:80:0x0156, B:82:0x017a, B:84:0x017d, B:87:0x01c7, B:88:0x0180, B:90:0x01b3, B:92:0x01c1, B:94:0x01c4, B:97:0x01cc, B:99:0x01d0, B:100:0x01dc, B:101:0x01d8, B:102:0x0291, B:111:0x0343, B:113:0x034d, B:114:0x0361, B:115:0x0359), top: B:27:0x0126 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0343 A[Catch: IOException -> 0x0386, TryCatch #2 {IOException -> 0x0386, blocks: (B:28:0x0126, B:29:0x0129, B:31:0x0245, B:32:0x0248, B:33:0x024b, B:34:0x02d3, B:37:0x02d8, B:39:0x02df, B:40:0x02e6, B:41:0x02e9, B:42:0x02fe, B:44:0x0306, B:45:0x02ec, B:46:0x02fa, B:48:0x02f1, B:49:0x02f6, B:51:0x036d, B:63:0x0283, B:64:0x029e, B:65:0x036a, B:66:0x02a1, B:67:0x0335, B:68:0x02c9, B:69:0x024f, B:70:0x026c, B:72:0x031b, B:73:0x031e, B:74:0x01e0, B:75:0x0212, B:76:0x0217, B:77:0x022e, B:78:0x0130, B:80:0x0156, B:82:0x017a, B:84:0x017d, B:87:0x01c7, B:88:0x0180, B:90:0x01b3, B:92:0x01c1, B:94:0x01c4, B:97:0x01cc, B:99:0x01d0, B:100:0x01dc, B:101:0x01d8, B:102:0x0291, B:111:0x0343, B:113:0x034d, B:114:0x0361, B:115:0x0359), top: B:27:0x0126 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d0 A[Catch: IOException -> 0x0386, TryCatch #2 {IOException -> 0x0386, blocks: (B:28:0x0126, B:29:0x0129, B:31:0x0245, B:32:0x0248, B:33:0x024b, B:34:0x02d3, B:37:0x02d8, B:39:0x02df, B:40:0x02e6, B:41:0x02e9, B:42:0x02fe, B:44:0x0306, B:45:0x02ec, B:46:0x02fa, B:48:0x02f1, B:49:0x02f6, B:51:0x036d, B:63:0x0283, B:64:0x029e, B:65:0x036a, B:66:0x02a1, B:67:0x0335, B:68:0x02c9, B:69:0x024f, B:70:0x026c, B:72:0x031b, B:73:0x031e, B:74:0x01e0, B:75:0x0212, B:76:0x0217, B:77:0x022e, B:78:0x0130, B:80:0x0156, B:82:0x017a, B:84:0x017d, B:87:0x01c7, B:88:0x0180, B:90:0x01b3, B:92:0x01c1, B:94:0x01c4, B:97:0x01cc, B:99:0x01d0, B:100:0x01dc, B:101:0x01d8, B:102:0x0291, B:111:0x0343, B:113:0x034d, B:114:0x0361, B:115:0x0359), top: B:27:0x0126 }] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // p096l6.AbstractC1511a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 1150
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p096l6.C1513b.toString():java.lang.String");
    }
}
