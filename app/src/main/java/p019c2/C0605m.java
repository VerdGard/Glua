package p019c2;

import android.os.Handler;

/* renamed from: c2.m */
/* loaded from: classes.dex */
public final class C0605m extends Thread {

    /* renamed from: c */
    public final Handler f3013c;

    /* renamed from: e */
    public final String f3014e;

    public C0605m(String str, Handler handler) {
        this.f3014e = str;
        this.f3013c = handler;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.InputStreamReader] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2048a(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            r2 = 0
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L35
            r3.<init>(r7)     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L35
            java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L35
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L35
            r7.<init>(r3, r4)     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L35
            r2 = 1024(0x400, float:1.435E-42)
            char[] r2 = new char[r2]     // Catch: java.io.IOException -> L31 java.lang.Throwable -> L63
        L17:
            int r3 = r7.read(r2)     // Catch: java.io.IOException -> L31 java.lang.Throwable -> L63
            r4 = -1
            if (r3 == r4) goto L27
            java.lang.String r4 = new java.lang.String     // Catch: java.io.IOException -> L31 java.lang.Throwable -> L63
            r4.<init>(r2, r1, r3)     // Catch: java.io.IOException -> L31 java.lang.Throwable -> L63
            r0.append(r4)     // Catch: java.io.IOException -> L31 java.lang.Throwable -> L63
            goto L17
        L27:
            r7.close()     // Catch: java.io.IOException -> L2b
            goto L2f
        L2b:
            r7 = move-exception
            r7.printStackTrace()
        L2f:
            r1 = 1
            goto L46
        L31:
            r2 = move-exception
            goto L39
        L33:
            r0 = move-exception
            goto L65
        L35:
            r7 = move-exception
            r5 = r2
            r2 = r7
            r7 = r5
        L39:
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L63
            if (r7 == 0) goto L46
            r7.close()     // Catch: java.io.IOException -> L42
            goto L46
        L42:
            r7 = move-exception
            r7.printStackTrace()
        L46:
            android.os.Handler r7 = r6.f3013c
            if (r1 == 0) goto L57
            if (r7 == 0) goto L62
            r1 = 257(0x101, float:3.6E-43)
            java.lang.String r0 = r0.toString()
            android.os.Message r0 = android.os.Message.obtain(r7, r1, r0)
            goto L5f
        L57:
            if (r7 == 0) goto L62
            r0 = 258(0x102, float:3.62E-43)
            android.os.Message r0 = android.os.Message.obtain(r7, r0)
        L5f:
            r7.sendMessage(r0)
        L62:
            return
        L63:
            r0 = move-exception
            r2 = r7
        L65:
            if (r2 == 0) goto L6f
            r2.close()     // Catch: java.io.IOException -> L6b
            goto L6f
        L6b:
            r7 = move-exception
            r7.printStackTrace()
        L6f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p019c2.C0605m.m2048a(java.lang.String):void");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        synchronized (this.f3013c) {
            m2048a(this.f3014e);
        }
    }
}
