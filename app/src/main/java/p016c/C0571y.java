package p016c;

import android.content.Context;
import android.util.Log;
import android.util.Xml;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import org.xmlpull.v1.XmlSerializer;
import p016c.C0571y;

/* renamed from: c.y */
/* loaded from: classes.dex */
public final class C0571y {

    /* renamed from: c.y$a */
    public static class a implements Executor {

        /* renamed from: c */
        public final Object f2920c = new Object();

        /* renamed from: e */
        public final ArrayDeque f2921e = new ArrayDeque();

        /* renamed from: m */
        public final Executor f2922m;

        /* renamed from: s */
        public Runnable f2923s;

        public a(b bVar) {
            this.f2922m = bVar;
        }

        /* renamed from: a */
        public final void m1993a() {
            synchronized (this.f2920c) {
                Runnable runnable = (Runnable) this.f2921e.poll();
                this.f2923s = runnable;
                if (runnable != null) {
                    this.f2922m.execute(runnable);
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public final void execute(final Runnable runnable) {
            synchronized (this.f2920c) {
                this.f2921e.add(new Runnable() { // from class: c.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        Runnable runnable2 = runnable;
                        C0571y.a aVar = C0571y.a.this;
                        aVar.getClass();
                        try {
                            runnable2.run();
                        } finally {
                            aVar.m1993a();
                        }
                    }
                });
                if (this.f2923s == null) {
                    m1993a();
                }
            }
        }
    }

    /* renamed from: c.y$b */
    public static class b implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    /* renamed from: a */
    public static void m1991a(Context context, String str) {
        if (str.equals("")) {
            context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            return;
        }
        try {
            FileOutputStream openFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
            XmlSerializer newSerializer = Xml.newSerializer();
            try {
                try {
                    newSerializer.setOutput(openFileOutput, null);
                    newSerializer.startDocument("UTF-8", Boolean.TRUE);
                    newSerializer.startTag(null, "locales");
                    newSerializer.attribute(null, "application_locales", str);
                    newSerializer.endTag(null, "locales");
                    newSerializer.endDocument();
                    Log.d("AppLocalesStorageHelper", "Storing App Locales : app-locales: " + str + " persisted successfully.");
                    if (openFileOutput == null) {
                        return;
                    }
                } catch (Throwable th) {
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (IOException unused) {
                        }
                    }
                    throw th;
                }
            } catch (Exception e7) {
                Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales: ".concat(str), e7);
                if (openFileOutput == null) {
                    return;
                }
            }
            try {
                openFileOutput.close();
            } catch (IOException unused2) {
            }
        } catch (FileNotFoundException unused3) {
            Log.w("AppLocalesStorageHelper", String.format("Storing App Locales : FileNotFoundException: Cannot open file %s for writing ", "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        if (r3 != null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0039, code lost:
    
        r2 = r4.getAttributeValue(null, "application_locales");
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x004f, code lost:
    
        if (r3 == null) goto L27;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m1992b(android.content.Context r9) {
        /*
            java.lang.String r0 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.lang.String r1 = "AppLocalesStorageHelper"
            java.lang.String r2 = ""
            java.io.FileInputStream r3 = r9.openFileInput(r0)     // Catch: java.io.FileNotFoundException -> L6c
            org.xmlpull.v1.XmlPullParser r4 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L48 java.lang.Throwable -> L4a
            java.lang.String r5 = "UTF-8"
            r4.setInput(r3, r5)     // Catch: java.lang.Throwable -> L48 java.lang.Throwable -> L4a
            int r5 = r4.getDepth()     // Catch: java.lang.Throwable -> L48 java.lang.Throwable -> L4a
        L17:
            int r6 = r4.next()     // Catch: java.lang.Throwable -> L48 java.lang.Throwable -> L4a
            r7 = 1
            if (r6 == r7) goto L40
            r7 = 3
            if (r6 != r7) goto L27
            int r8 = r4.getDepth()     // Catch: java.lang.Throwable -> L48 java.lang.Throwable -> L4a
            if (r8 <= r5) goto L40
        L27:
            if (r6 == r7) goto L17
            r7 = 4
            if (r6 != r7) goto L2d
            goto L17
        L2d:
            java.lang.String r6 = r4.getName()     // Catch: java.lang.Throwable -> L48 java.lang.Throwable -> L4a
            java.lang.String r7 = "locales"
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L48 java.lang.Throwable -> L4a
            if (r6 == 0) goto L17
            java.lang.String r5 = "application_locales"
            r6 = 0
            java.lang.String r2 = r4.getAttributeValue(r6, r5)     // Catch: java.lang.Throwable -> L48 java.lang.Throwable -> L4a
        L40:
            if (r3 == 0) goto L52
        L42:
            r3.close()     // Catch: java.io.IOException -> L46
            goto L52
        L46:
            goto L52
        L48:
            r9 = move-exception
            goto L66
        L4a:
            java.lang.String r4 = "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r1, r4)     // Catch: java.lang.Throwable -> L48
            if (r3 == 0) goto L52
            goto L42
        L52:
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L62
            java.lang.String r9 = "Reading app Locales : Locales read from file: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file , appLocales: "
            java.lang.String r9 = r9.concat(r2)
            android.util.Log.d(r1, r9)
            goto L65
        L62:
            r9.deleteFile(r0)
        L65:
            return r2
        L66:
            if (r3 == 0) goto L6b
            r3.close()     // Catch: java.io.IOException -> L6b
        L6b:
            throw r9
        L6c:
            java.lang.String r9 = "Reading app Locales : Locales record file not found: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r1, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p016c.C0571y.m1992b(android.content.Context):java.lang.String");
    }
}
