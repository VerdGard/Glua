package androidx.fragment.app;

import android.ext.Tools;
import android.util.Log;
import java.io.Writer;

/* renamed from: androidx.fragment.app.n0 */
/* loaded from: classes.dex */
public final class C0362n0 extends Writer {

    /* renamed from: e */
    public final StringBuilder f1832e = new StringBuilder(Tools.Semaphore.f159S7);

    /* renamed from: c */
    public final String f1831c = "FragmentManager";

    /* renamed from: a */
    public final void m1247a() {
        StringBuilder sb = this.f1832e;
        if (sb.length() > 0) {
            Log.d(this.f1831c, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m1247a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        m1247a();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i7, int i8) {
        for (int i9 = 0; i9 < i8; i9++) {
            char c7 = cArr[i7 + i9];
            if (c7 == '\n') {
                m1247a();
            } else {
                this.f1832e.append(c7);
            }
        }
    }
}
