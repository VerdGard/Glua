package p165u6;

import android.content.Context;
import android.ext.C0090b;
import android.ext.Tools;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import p165u6.C1983c;
import p172v6.C2033a;
import p172v6.C2035c;
import p172v6.C2037e;
import p172v6.C2038f;
import p180w6.AbstractC2149r;
import p180w6.C2135d;
import p180w6.C2143l;

/* renamed from: u6.b */
/* loaded from: classes.dex */
public final class C1981b extends C1999q {

    /* renamed from: n2 */
    public AbstractC2149r f8947n2;

    /* renamed from: p2 */
    public C2143l f8949p2;

    /* renamed from: q2 */
    public C2135d f8950q2;

    /* renamed from: r2 */
    public C2038f f8951r2;

    /* renamed from: s2 */
    public C2038f f8952s2;

    /* renamed from: t2 */
    public C1983c.a f8953t2;

    /* renamed from: l2 */
    public PrintStream f8945l2 = System.out;

    /* renamed from: m2 */
    public PrintStream f8946m2 = System.err;

    /* renamed from: o2 */
    public C2000r f8948o2 = new C2000r(this);

    /* renamed from: u2 */
    public String f8954u2 = null;

    /* renamed from: v2 */
    public int f8955v2 = 0;

    /* renamed from: w2 */
    public long f8956w2 = 0;

    /* renamed from: u6.b$a */
    public static abstract class a extends InputStream {

        /* renamed from: e */
        public int f8958e = 0;

        /* renamed from: m */
        public int f8959m = 0;

        /* renamed from: c */
        public byte[] f8957c = new byte[Tools.Semaphore.f159S7];

        /* renamed from: a */
        public abstract int mo4630a();

        @Override // java.io.InputStream
        public final int available() {
            return this.f8959m - this.f8958e;
        }

        @Override // java.io.InputStream
        public final int read() {
            if (mo4630a() <= 0) {
                return -1;
            }
            byte[] bArr = this.f8957c;
            int i7 = this.f8958e;
            this.f8958e = i7 + 1;
            return bArr[i7] & 255;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr) {
            return read(bArr, 0, bArr.length);
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i7, int i8) {
            int mo4630a = mo4630a();
            if (mo4630a <= 0) {
                return -1;
            }
            int min = Math.min(mo4630a, i8);
            System.arraycopy(this.f8957c, this.f8958e, bArr, i7, min);
            this.f8958e += min;
            return min;
        }

        @Override // java.io.InputStream
        public final long skip(long j7) {
            long min = Math.min(j7, this.f8959m - this.f8958e);
            this.f8958e = (int) (this.f8958e + min);
            return min;
        }
    }

    /* renamed from: u6.b$b */
    public static class b extends a {

        /* renamed from: s */
        public final InputStream f8960s;

        public b(InputStream inputStream) {
            this.f8960s = inputStream;
        }

        @Override // p165u6.C1981b.a
        /* renamed from: a */
        public final int mo4630a() {
            int i7 = this.f8958e;
            int i8 = this.f8959m;
            if (i7 < i8) {
                return i8 - i7;
            }
            byte[] bArr = this.f8957c;
            if (i8 >= bArr.length) {
                this.f8959m = 0;
                this.f8958e = 0;
            }
            int i9 = this.f8959m;
            int length = bArr.length - i9;
            InputStream inputStream = this.f8960s;
            int read = inputStream.read(bArr, i9, length);
            if (read < 0) {
                return -1;
            }
            if (read == 0) {
                int read2 = inputStream.read();
                if (read2 < 0) {
                    return -1;
                }
                this.f8957c[this.f8959m] = (byte) read2;
                read = 1;
            }
            this.f8959m += read;
            return read;
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f8960s.close();
        }

        @Override // java.io.InputStream
        public final synchronized void mark(int i7) {
            int i8 = this.f8958e;
            if (i8 > 0 || i7 > this.f8957c.length) {
                byte[] bArr = this.f8957c;
                byte[] bArr2 = i7 > bArr.length ? new byte[i7] : bArr;
                System.arraycopy(bArr, i8, bArr2, 0, this.f8959m - i8);
                this.f8959m -= this.f8958e;
                this.f8958e = 0;
                this.f8957c = bArr2;
            }
        }

        @Override // java.io.InputStream
        public final boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public final synchronized void reset() {
            this.f8958e = 0;
        }
    }

    /* renamed from: Z2 */
    public final void m4625Z2(long j7) {
        long j8 = this.f8956w2 + j7;
        this.f8956w2 = j8;
        if (j8 < 1073741824) {
            return;
        }
        Context context = Tools.getContext();
        throw new C1991i("Too many write to files: " + Tools.formatFileSize(context, this.f8956w2) + "; last: " + Tools.formatFileSize(context, j7));
    }

    /* renamed from: a3 */
    public final C1989g m4626a3(InputStream inputStream, String str, String str2, AbstractC2003u abstractC2003u) {
        try {
            C2008z m4627b3 = m4627b3(inputStream, str, str2);
            this.f8951r2.getClass();
            return new C1989g(m4627b3, this, abstractC2003u);
        } catch (C1991i e7) {
            throw e7;
        } catch (Exception e8) {
            throw new C1991i("load " + str + ": " + e8);
        }
    }

    /* renamed from: b3 */
    public final C2008z m4627b3(InputStream inputStream, String str, String str2) {
        C2008z c2008z;
        boolean z6 = false;
        if (str2.indexOf(98) >= 0) {
            if (this.f8953t2 == null) {
                AbstractC2003u.m4861I0("No undumper.");
                throw null;
            }
            if (!inputStream.markSupported()) {
                inputStream = new b(inputStream);
            }
            inputStream.mark(4);
            this.f8953t2.getClass();
            int read = inputStream.read();
            byte[] bArr = C1983c.f8965g;
            if (read == bArr[0] && inputStream.read() == bArr[1] && inputStream.read() == bArr[2] && inputStream.read() == bArr[3]) {
                String substring = (str.startsWith("@") || str.startsWith("=")) ? str.substring(1) : str.startsWith("\u001b") ? "binary string" : str;
                C1983c c1983c = new C1983c(inputStream);
                DataInputStream dataInputStream = c1983c.f8975d;
                dataInputStream.readByte();
                dataInputStream.readByte();
                c1983c.f8972a = dataInputStream.readByte() != 0;
                dataInputStream.readByte();
                c1983c.f8973b = dataInputStream.readByte();
                dataInputStream.readByte();
                dataInputStream.readByte();
                c1983c.f8974c = dataInputStream.readByte();
                for (int i7 = 0; i7 < 6; i7++) {
                    if (dataInputStream.readByte() != C1983c.f8966h[i7]) {
                        throw new C1991i(C0090b.m219e("Unexpeted byte in luac tail of header, index=", i7));
                    }
                }
                int i8 = c1983c.f8974c;
                if (i8 != 0 && i8 != 1 && i8 != 4) {
                    throw new C1991i("unsupported int size");
                }
                C1998p.m4815M2(substring);
                c2008z = c1983c.m4631a();
            } else {
                c2008z = null;
            }
            if (c2008z != null) {
                return c2008z;
            }
            inputStream.reset();
        }
        if (str2.indexOf(116) < 0) {
            AbstractC2003u.m4861I0("Failed to load prototype " + str + " using mode '" + str2 + "'");
            throw null;
        }
        if (this.f8952s2 == null) {
            AbstractC2003u.m4861I0("No compiler.");
            throw null;
        }
        C2038f.a aVar = new C2038f.a();
        C2037e c2037e = new C2037e(aVar, inputStream);
        C2035c c2035c = new C2035c();
        c2037e.f9258i = c2035c;
        int read2 = inputStream.read();
        C1998p m4815M2 = C1998p.m4815M2(str);
        c2037e.f9259j = aVar;
        c2037e.f9257h.f9287a = 301;
        c2037e.f9260k = inputStream;
        c2037e.f9258i = null;
        c2037e.f9254e = 1;
        c2037e.f9255f = 1;
        c2037e.f9264o = m4815M2;
        c2037e.f9265p = AbstractC2003u.f9134y1;
        c2037e.f9262m = 0;
        c2037e.f9253d = read2;
        if (read2 == 35) {
            while (!c2037e.m4991A() && c2037e.f9253d != -1) {
                c2037e.m5009W();
            }
        }
        C2008z c2008z2 = new C2008z();
        c2035c.f9223b = c2008z2;
        c2008z2.f9149g = C1998p.m4815M2(str);
        c2037e.m5010X(c2035c, new C2035c.a());
        c2037e.f9258i.f9223b.f9153k = 1;
        C2037e.i iVar = new C2037e.i();
        iVar.m5049b(7, 0);
        c2037e.f9258i.m4955T(c2037e.f9265p, iVar);
        c2037e.m5006T(c2037e.f9265p);
        C2037e.i iVar2 = new C2037e.i();
        C2035c.m4935g0(c2037e.f9258i, c2037e.f9265p, iVar2, 1);
        c2037e.m5025l(1, 1, iVar2);
        c2037e.m5027m(1);
        c2037e.m5008V();
        C2037e.g gVar = c2037e.f9256g;
        if ((gVar.f9287a == 123) || c2037e.m5034p0(304)) {
            c2037e.m5015c0();
        } else {
            c2037e.m5022j0();
        }
        if (gVar.f9287a != 301) {
            c2037e.m4993C(301);
            throw null;
        }
        c2037e.m5042u();
        C2033a.m4928g(c2035c.f9225d == null);
        C2037e.b bVar = c2037e.f9263n;
        if (bVar == null || (bVar.f9272b == 0 && bVar.f9274d == 0 && bVar.f9276f == 0)) {
            z6 = true;
        }
        C2033a.m4928g(z6);
        return c2035c.f9223b;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [w6.m, w6.r] */
    /* renamed from: c3 */
    public final C1989g m4628c3(String str) {
        try {
            return m4626a3(this.f8947n2.mo5145s(str), "@" + str, "bt", this);
        } catch (Exception e7) {
            throw new C1991i("load " + str + ": " + e7);
        }
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: l0 */
    public final C1981b mo4629l0() {
        return this;
    }
}
