package android.lang;

import java.io.InputStream;

/* loaded from: classes.dex */
public class NullInputStream extends InputStream {
    static final NullInputStream INSTANCE = new NullInputStream();

    private NullInputStream() {
    }

    @Override // java.io.InputStream
    public int available() {
        return 0;
    }

    @Override // java.io.InputStream
    public int read() {
        return -1;
    }
}
