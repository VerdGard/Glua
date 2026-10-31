package p134q6;

import androidx.activity.C0143v;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.SocketTimeoutException;

/* renamed from: q6.a */
/* loaded from: classes.dex */
public final class C1805a extends BufferedInputStream {

    /* renamed from: Z */
    public static final /* synthetic */ int f8185Z = 0;

    /* renamed from: X */
    public int f8186X;

    /* renamed from: Y */
    public boolean f8187Y;

    /* renamed from: c */
    public final boolean f8188c;

    /* renamed from: e */
    public final int f8189e;

    /* renamed from: m */
    public long f8190m;

    /* renamed from: s */
    public long f8191s;

    public C1805a(InputStream inputStream, int i7) {
        super(inputStream, 32768);
        this.f8191s = 0L;
        C0143v.m414L(i7 >= 0);
        this.f8189e = i7;
        this.f8186X = i7;
        this.f8188c = i7 != 0;
        this.f8190m = System.nanoTime();
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i7, int i8) {
        boolean z6;
        int i9;
        if (this.f8187Y || ((z6 = this.f8188c) && this.f8186X <= 0)) {
            return -1;
        }
        if (Thread.interrupted()) {
            this.f8187Y = true;
            return -1;
        }
        if (this.f8191s != 0 && System.nanoTime() - this.f8190m > this.f8191s) {
            throw new SocketTimeoutException("Read timeout");
        }
        if (z6 && i8 > (i9 = this.f8186X)) {
            i8 = i9;
        }
        try {
            int read = super.read(bArr, i7, i8);
            this.f8186X -= read;
            return read;
        } catch (SocketTimeoutException unused) {
            return 0;
        }
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        super.reset();
        this.f8186X = this.f8189e - ((BufferedInputStream) this).markpos;
    }
}
