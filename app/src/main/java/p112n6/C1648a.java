package p112n6;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;

/* renamed from: n6.a */
/* loaded from: classes.dex */
public final class C1648a extends DataInputStream {

    /* renamed from: c */
    public final a f7483c;

    /* renamed from: n6.a$a */
    public static final class a extends ByteArrayInputStream {
        public a(byte[] bArr) {
            super(bArr);
        }

        public final int getPosition() {
            return ((ByteArrayInputStream) this).pos;
        }
    }

    public C1648a(byte[] bArr) {
        super(new a(bArr));
        this.f7483c = (a) ((DataInputStream) this).in;
    }

    /* renamed from: a */
    public final int m4008a() {
        return this.f7483c.getPosition();
    }
}
