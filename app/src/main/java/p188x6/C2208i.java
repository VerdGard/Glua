package p188x6;

import android.ext.C0090b;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import p165u6.C1991i;
import p165u6.C1998p;
import p180w6.AbstractC2138g;

/* renamed from: x6.i */
/* loaded from: classes.dex */
public final class C2208i extends AbstractC2138g {

    /* renamed from: x6.i$a */
    public final class a extends AbstractC2138g.a {

        /* renamed from: d2 */
        public final RandomAccessFile f10017d2;

        /* renamed from: e2 */
        public final InputStream f10018e2;

        /* renamed from: f2 */
        public final OutputStream f10019f2;

        /* renamed from: g2 */
        public boolean f10020g2;

        /* renamed from: h2 */
        public boolean f10021h2;

        public a(C2208i c2208i, RandomAccessFile randomAccessFile, InputStream inputStream, OutputStream outputStream) {
            super();
            this.f10020g2 = false;
            this.f10021h2 = false;
            this.f10017d2 = randomAccessFile;
            if (inputStream == null) {
                inputStream = null;
            } else if (!inputStream.markSupported()) {
                inputStream = new BufferedInputStream(inputStream);
            }
            this.f10018e2 = inputStream;
            this.f10019f2 = outputStream;
        }

        @Override // p180w6.AbstractC2138g.a
        /* renamed from: C2 */
        public final void mo5221C2() {
            this.f10020g2 = true;
            RandomAccessFile randomAccessFile = this.f10017d2;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
        }

        @Override // p180w6.AbstractC2138g.a
        /* renamed from: D2 */
        public final void mo5222D2() {
            OutputStream outputStream = this.f10019f2;
            if (outputStream != null) {
                outputStream.flush();
            }
        }

        @Override // p180w6.AbstractC2138g.a
        /* renamed from: E2 */
        public final boolean mo5223E2() {
            return this.f10020g2;
        }

        @Override // p180w6.AbstractC2138g.a
        /* renamed from: F2 */
        public final boolean mo5224F2() {
            return this.f10017d2 == null;
        }

        @Override // p180w6.AbstractC2138g.a
        /* renamed from: G2 */
        public final int mo5225G2() {
            InputStream inputStream = this.f10018e2;
            if (inputStream != null) {
                inputStream.mark(1);
                int read = inputStream.read();
                inputStream.reset();
                return read;
            }
            RandomAccessFile randomAccessFile = this.f10017d2;
            if (randomAccessFile == null) {
                throw new C1991i("not implemented");
            }
            long filePointer = randomAccessFile.getFilePointer();
            int read2 = randomAccessFile.read();
            randomAccessFile.seek(filePointer);
            return read2;
        }

        @Override // p180w6.AbstractC2138g.a
        /* renamed from: H2 */
        public final int mo5226H2() {
            InputStream inputStream = this.f10018e2;
            if (inputStream != null) {
                return inputStream.read();
            }
            RandomAccessFile randomAccessFile = this.f10017d2;
            if (randomAccessFile != null) {
                return randomAccessFile.read();
            }
            throw new C1991i("not implemented");
        }

        @Override // p180w6.AbstractC2138g.a
        /* renamed from: I2 */
        public final int mo5227I2(byte[] bArr, int i7) {
            RandomAccessFile randomAccessFile = this.f10017d2;
            if (randomAccessFile != null) {
                return randomAccessFile.read(bArr, 0, i7);
            }
            InputStream inputStream = this.f10018e2;
            if (inputStream != null) {
                return inputStream.read(bArr, 0, i7);
            }
            throw new C1991i("not implemented");
        }

        @Override // p180w6.AbstractC2138g.a
        /* renamed from: J2 */
        public final int mo5228J2() {
            RandomAccessFile randomAccessFile = this.f10017d2;
            if (randomAccessFile != null) {
                return (int) (randomAccessFile.length() - randomAccessFile.getFilePointer());
            }
            return -1;
        }

        @Override // p180w6.AbstractC2138g.a
        /* renamed from: K2 */
        public final int mo5229K2(int i7, String str) {
            RandomAccessFile randomAccessFile = this.f10017d2;
            if (randomAccessFile == null) {
                throw new C1991i("not implemented");
            }
            if ("set".equals(str)) {
                randomAccessFile.seek(i7);
            } else {
                randomAccessFile.seek(("end".equals(str) ? randomAccessFile.length() : randomAccessFile.getFilePointer()) + i7);
            }
            return (int) randomAccessFile.getFilePointer();
        }

        @Override // p180w6.AbstractC2138g.a
        /* renamed from: L2 */
        public final void mo5230L2(String str) {
            this.f10021h2 = "no".equals(str);
        }

        @Override // p180w6.AbstractC2138g.a, p165u6.AbstractC2003u, p165u6.AbstractC1984c0
        /* renamed from: M */
        public final String mo4645M() {
            return C0090b.m220f(new StringBuilder("file ("), this.f10020g2 ? "closed" : String.valueOf(hashCode()), ")");
        }

        @Override // p180w6.AbstractC2138g.a
        /* renamed from: M2 */
        public final void mo5231M2(C1998p c1998p) {
            OutputStream outputStream = this.f10019f2;
            if (outputStream != null) {
                outputStream.write(c1998p.f9039c2, c1998p.f9040d2, c1998p.f9041e2);
            } else {
                RandomAccessFile randomAccessFile = this.f10017d2;
                if (randomAccessFile == null) {
                    throw new C1991i("not implemented");
                }
                randomAccessFile.write(c1998p.f9039c2, c1998p.f9040d2, c1998p.f9041e2);
            }
            if (this.f10021h2) {
                mo5222D2();
            }
        }
    }

    /* renamed from: x6.i$b */
    public final class b extends AbstractC2138g.a {
        public b() {
            super();
        }

        @Override // p180w6.AbstractC2138g.a
        /* renamed from: C2 */
        public final void mo5221C2() {
        }

        @Override // p180w6.AbstractC2138g.a
        /* renamed from: D2 */
        public final void mo5222D2() {
        }

        @Override // p180w6.AbstractC2138g.a
        /* renamed from: E2 */
        public final boolean mo5223E2() {
            return false;
        }

        @Override // p180w6.AbstractC2138g.a
        /* renamed from: F2 */
        public final boolean mo5224F2() {
            return true;
        }

        @Override // p180w6.AbstractC2138g.a
        /* renamed from: G2 */
        public final int mo5225G2() {
            C2208i.this.f9694k2.getClass();
            throw null;
        }

        @Override // p180w6.AbstractC2138g.a
        /* renamed from: H2 */
        public final int mo5226H2() {
            C2208i.this.f9694k2.getClass();
            throw null;
        }

        @Override // p180w6.AbstractC2138g.a
        /* renamed from: I2 */
        public final int mo5227I2(byte[] bArr, int i7) {
            C2208i.this.f9694k2.getClass();
            throw null;
        }

        @Override // p180w6.AbstractC2138g.a
        /* renamed from: J2 */
        public final int mo5228J2() {
            return -1;
        }

        @Override // p180w6.AbstractC2138g.a
        /* renamed from: K2 */
        public final int mo5229K2(int i7, String str) {
            return 0;
        }

        @Override // p180w6.AbstractC2138g.a
        /* renamed from: L2 */
        public final void mo5230L2(String str) {
        }

        @Override // p180w6.AbstractC2138g.a, p165u6.AbstractC2003u, p165u6.AbstractC1984c0
        /* renamed from: M */
        public final String mo4645M() {
            return "file (" + hashCode() + ")";
        }

        @Override // p180w6.AbstractC2138g.a
        /* renamed from: M2 */
        public final void mo5231M2(C1998p c1998p) {
        }
    }

    /* renamed from: x6.i$c */
    public final class c extends AbstractC2138g.a {

        /* renamed from: d2 */
        public final int f10023d2;

        public c(int i7) {
            super();
            this.f10023d2 = i7;
        }

        @Override // p180w6.AbstractC2138g.a
        /* renamed from: C2 */
        public final void mo5221C2() {
        }

        @Override // p180w6.AbstractC2138g.a
        /* renamed from: D2 */
        public final void mo5222D2() {
            int i7 = this.f10023d2;
            C2208i c2208i = C2208i.this;
            (i7 == 2 ? c2208i.f9694k2.f8946m2 : c2208i.f9694k2.f8945l2).flush();
        }

        @Override // p180w6.AbstractC2138g.a
        /* renamed from: E2 */
        public final boolean mo5223E2() {
            return false;
        }

        @Override // p180w6.AbstractC2138g.a
        /* renamed from: F2 */
        public final boolean mo5224F2() {
            return true;
        }

        @Override // p180w6.AbstractC2138g.a
        /* renamed from: G2 */
        public final int mo5225G2() {
            return 0;
        }

        @Override // p180w6.AbstractC2138g.a
        /* renamed from: H2 */
        public final int mo5226H2() {
            return 0;
        }

        @Override // p180w6.AbstractC2138g.a
        /* renamed from: I2 */
        public final int mo5227I2(byte[] bArr, int i7) {
            return 0;
        }

        @Override // p180w6.AbstractC2138g.a
        /* renamed from: J2 */
        public final int mo5228J2() {
            return 0;
        }

        @Override // p180w6.AbstractC2138g.a
        /* renamed from: K2 */
        public final int mo5229K2(int i7, String str) {
            return 0;
        }

        @Override // p180w6.AbstractC2138g.a
        /* renamed from: L2 */
        public final void mo5230L2(String str) {
        }

        @Override // p180w6.AbstractC2138g.a, p165u6.AbstractC2003u, p165u6.AbstractC1984c0
        /* renamed from: M */
        public final String mo4645M() {
            return "file (" + hashCode() + ")";
        }

        @Override // p180w6.AbstractC2138g.a
        /* renamed from: M2 */
        public final void mo5231M2(C1998p c1998p) {
            int i7 = this.f10023d2;
            C2208i c2208i = C2208i.this;
            (i7 == 2 ? c2208i.f9694k2.f8946m2 : c2208i.f9694k2.f8945l2).write(c1998p.f9039c2, c1998p.f9040d2, c1998p.f9041e2);
        }
    }
}
