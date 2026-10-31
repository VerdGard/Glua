package p119o6;

import java.io.IOException;

/* renamed from: o6.e */
/* loaded from: classes.dex */
public final class C1678e extends RuntimeException {
    public C1678e() {
        super(new IOException("Input is binary and unsupported"));
    }

    public C1678e(IOException iOException) {
        super(iOException);
    }
}
