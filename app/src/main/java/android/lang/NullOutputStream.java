package android.lang;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public class NullOutputStream extends OutputStream {
    static final NullOutputStream INSTANCE = new NullOutputStream();

    private NullOutputStream() {
    }

    @Override // java.io.OutputStream
    public void write(int i7) {
        throw new IOException("Stream closed");
    }
}
