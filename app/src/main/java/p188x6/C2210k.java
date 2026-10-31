package p188x6;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import p165u6.AbstractC1984c0;
import p165u6.AbstractC2003u;
import p165u6.C1981b;
import p165u6.C1993k;
import p165u6.C1998p;
import p180w6.C2142k;

/* renamed from: x6.k */
/* loaded from: classes.dex */
public final class C2210k extends C2142k {
    @Override // p180w6.C2142k
    /* renamed from: K2 */
    public final AbstractC1984c0 mo5243K2(String str) {
        int i7;
        C2211l c2211l;
        try {
            C1981b c1981b = this.f9713g2;
            PrintStream printStream = c1981b.f8945l2;
            PrintStream printStream2 = c1981b.f8946m2;
            Process exec = Runtime.getRuntime().exec(str);
            C2211l c2211l2 = null;
            if (printStream == null) {
                c2211l = null;
            } else {
                c2211l = new C2211l(printStream, null, exec.getInputStream(), exec.getInputStream());
                c2211l.start();
            }
            if (printStream2 != null) {
                C2211l c2211l3 = new C2211l(printStream2, null, exec.getErrorStream(), exec.getErrorStream());
                c2211l3.start();
                c2211l2 = c2211l3;
            }
            i7 = exec.waitFor();
            if (c2211l != null) {
                c2211l.join();
            }
            if (c2211l2 != null) {
                c2211l2.join();
            }
            exec.destroy();
        } catch (IOException unused) {
            i7 = 1;
        } catch (InterruptedException unused2) {
            i7 = -2;
        } catch (Throwable unused3) {
            i7 = -3;
        }
        if (i7 != 0) {
            return AbstractC2003u.m4866x2(AbstractC2003u.f9130m, C1998p.m4815M2("signal"), C1993k.m4765C2(i7));
        }
        return AbstractC2003u.m4866x2(AbstractC2003u.f9131s, C1998p.m4815M2("exit"), AbstractC2003u.f9126Z);
    }

    @Override // p180w6.C2142k
    /* renamed from: L2 */
    public final String mo5244L2(String str) {
        String str2 = System.getenv(str);
        return str2 != null ? str2 : System.getProperty(str);
    }

    @Override // p180w6.C2142k
    /* renamed from: M2 */
    public final void mo5245M2(String str) {
        File file = new File(str);
        if (!file.exists()) {
            throw new IOException("No such file or directory");
        }
        if (!file.delete()) {
            throw new IOException("Failed to delete");
        }
    }

    @Override // p180w6.C2142k
    /* renamed from: N2 */
    public final void mo5246N2(String str, String str2) {
        File file = new File(str);
        if (!file.exists()) {
            throw new IOException("No such file or directory");
        }
        if (!file.renameTo(new File(str2))) {
            throw new IOException("Failed to delete");
        }
    }

    @Override // p180w6.C2142k
    /* renamed from: Q2 */
    public final String mo5247Q2() {
        try {
            return File.createTempFile(".luaj", "tmp").getName();
        } catch (IOException unused) {
            return super.mo5247Q2();
        }
    }
}
