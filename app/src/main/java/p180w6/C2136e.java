package p180w6;

import java.io.FileOutputStream;

/* renamed from: w6.e */
/* loaded from: classes.dex */
public final class C2136e extends FileOutputStream {

    /* renamed from: c */
    public final /* synthetic */ C2137f f9676c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2136e(C2137f c2137f, String str) {
        super(str);
        this.f9676c = c2137f;
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream
    public final void write(int i7) {
        this.f9676c.f9679h2.m4625Z2(1L);
        super.write(i7);
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f9676c.f9679h2.m4625Z2(bArr.length);
        super.write(bArr);
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i7, int i8) {
        this.f9676c.f9679h2.m4625Z2(i8);
        super.write(bArr, i7, i8);
    }
}
