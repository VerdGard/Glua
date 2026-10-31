package p052g2;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: g2.b */
/* loaded from: classes.dex */
public final class C1209b implements Closeable {

    /* renamed from: X */
    public int f5945X;

    /* renamed from: c */
    public final InputStream f5946c;

    /* renamed from: e */
    public final Charset f5947e;

    /* renamed from: m */
    public byte[] f5948m;

    /* renamed from: s */
    public int f5949s;

    /* renamed from: g2.b$a */
    public class a extends ByteArrayOutputStream {
        public a(int i7) {
            super(i7);
        }

        @Override // java.io.ByteArrayOutputStream
        public final String toString() {
            int i7 = ((ByteArrayOutputStream) this).count;
            if (i7 > 0 && ((ByteArrayOutputStream) this).buf[i7 - 1] == 13) {
                i7--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i7, C1209b.this.f5947e.name());
            } catch (UnsupportedEncodingException e7) {
                throw new AssertionError(e7);
            }
        }
    }

    public C1209b(FileInputStream fileInputStream, Charset charset) {
        if (charset == null) {
            throw null;
        }
        if (!charset.equals(C1210c.f5951a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f5946c = fileInputStream;
        this.f5947e = charset;
        this.f5948m = new byte[8192];
    }

    /* renamed from: a */
    public final String m3422a() {
        int i7;
        synchronized (this.f5946c) {
            byte[] bArr = this.f5948m;
            if (bArr == null) {
                throw new IOException("LineReader is closed");
            }
            if (this.f5949s >= this.f5945X) {
                int read = this.f5946c.read(bArr, 0, bArr.length);
                if (read == -1) {
                    throw new EOFException();
                }
                this.f5949s = 0;
                this.f5945X = read;
            }
            for (int i8 = this.f5949s; i8 != this.f5945X; i8++) {
                byte[] bArr2 = this.f5948m;
                if (bArr2[i8] == 10) {
                    int i9 = this.f5949s;
                    if (i8 != i9) {
                        i7 = i8 - 1;
                        if (bArr2[i7] == 13) {
                            String str = new String(bArr2, i9, i7 - i9, this.f5947e.name());
                            this.f5949s = i8 + 1;
                            return str;
                        }
                    }
                    i7 = i8;
                    String str2 = new String(bArr2, i9, i7 - i9, this.f5947e.name());
                    this.f5949s = i8 + 1;
                    return str2;
                }
            }
            a aVar = new a((this.f5945X - this.f5949s) + 80);
            while (true) {
                byte[] bArr3 = this.f5948m;
                int i10 = this.f5949s;
                aVar.write(bArr3, i10, this.f5945X - i10);
                this.f5945X = -1;
                byte[] bArr4 = this.f5948m;
                int read2 = this.f5946c.read(bArr4, 0, bArr4.length);
                if (read2 == -1) {
                    throw new EOFException();
                }
                this.f5949s = 0;
                this.f5945X = read2;
                for (int i11 = 0; i11 != this.f5945X; i11++) {
                    byte[] bArr5 = this.f5948m;
                    if (bArr5[i11] == 10) {
                        int i12 = this.f5949s;
                        if (i11 != i12) {
                            aVar.write(bArr5, i12, i11 - i12);
                        }
                        this.f5949s = i11 + 1;
                        return aVar.toString();
                    }
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f5946c) {
            if (this.f5948m != null) {
                this.f5948m = null;
                this.f5946c.close();
            }
        }
    }
}
