package p188x6;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: x6.l */
/* loaded from: classes.dex */
public final class C2211l extends Thread {

    /* renamed from: c */
    public final OutputStream f10025c;

    /* renamed from: e */
    public final OutputStream f10026e;

    /* renamed from: m */
    public final InputStream f10027m;

    /* renamed from: s */
    public final InputStream f10028s;

    public C2211l(OutputStream outputStream, OutputStream outputStream2, InputStream inputStream, InputStream inputStream2) {
        this.f10025c = outputStream;
        this.f10026e = outputStream2;
        this.f10027m = inputStream;
        this.f10028s = inputStream2;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        OutputStream outputStream = this.f10026e;
        InputStream inputStream = this.f10027m;
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                try {
                    int read = this.f10028s.read(bArr);
                    if (read < 0) {
                        break;
                    } else {
                        this.f10025c.write(bArr, 0, read);
                    }
                } catch (Throwable th) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    throw th;
                }
            }
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        } catch (IOException e7) {
            e7.printStackTrace();
        }
    }
}
