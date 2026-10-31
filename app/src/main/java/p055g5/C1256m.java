package p055g5;

import android.app.ProgressDialog;
import android.content.Context;
import android.util.SparseIntArray;
import android.widget.Toast;
import io.github.rosemoe.sora.R$string;
import p002a1.C0017d;
import p022c5.C0638b;
import p022c5.C0641e;
import p047f5.C1175f;
import p124p4.C1703a;
import p129q1.ViewOnClickListenerC1728d;
import p132q4.C1775d;
import p132q4.C1783l;

/* renamed from: g5.m */
/* loaded from: classes.dex */
public final class C1256m {

    /* renamed from: a */
    public final C1245b f6197a;

    /* renamed from: b */
    public String f6198b;

    /* renamed from: c */
    public a f6199c;

    /* renamed from: d */
    public Thread f6200d;

    /* renamed from: e */
    public C1175f f6201e;

    /* renamed from: g5.m$a */
    public static class a {

        /* renamed from: a */
        public final int f6202a = 1;
    }

    /* renamed from: g5.m$b */
    public final class b implements Runnable {

        /* renamed from: c */
        public final StringBuilder f6204c;

        /* renamed from: e */
        public final String f6205e;

        /* renamed from: m */
        public final a f6206m;

        /* renamed from: s */
        public Thread f6207s;

        public b(C0641e c0641e, a aVar, String str) {
            this.f6204c = c0641e.m2127K();
            this.f6206m = aVar;
            this.f6205e = str;
        }

        /* renamed from: a */
        public final boolean m3559a() {
            return C1256m.this.f6200d == this.f6207s && !Thread.interrupted();
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
        
            if (r3 != 3) goto L36;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                r14 = this;
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r14.f6207s = r0
                f5.f r0 = new f5.f
                r0.<init>()
                java.lang.StringBuilder r1 = r14.f6204c
                int r2 = r1.length()
                g5.m$a r3 = r14.f6206m
                r3.getClass()
                int r3 = r3.f6202a
                r4 = 3
                r5 = 0
                r6 = 1
                java.lang.String r7 = r14.f6205e
                if (r3 == r6) goto L70
                r6 = 2
                if (r3 == r6) goto L26
                if (r3 == r4) goto L3b
                goto Lb2
            L26:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r6 = "\\b"
                r3.<init>(r6)
                java.lang.String r7 = java.util.regex.Pattern.quote(r7)
                r3.append(r7)
                r3.append(r6)
                java.lang.String r7 = r3.toString()
            L3b:
                r3 = 8
                java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r7, r3)
                java.lang.String r1 = r1.toString()
                java.util.regex.Matcher r1 = r3.matcher(r1)
            L49:
                if (r5 >= r2) goto Lb2
                boolean r3 = r1.find(r5)
                if (r3 == 0) goto Lb2
                boolean r3 = r14.m3559a()
                if (r3 == 0) goto Lb2
                int r5 = r1.end()
                int r3 = r1.start()
                if (r3 != r5) goto L64
                int r5 = r5 + 1
                goto L49
            L64:
                int r3 = r1.start()
                long r6 = p002a1.C0017d.m68G(r3, r5)
                r0.m3369a(r6)
                goto L49
            L70:
                int r3 = r7.length()
                r6 = 0
            L75:
                r8 = -1
                if (r6 == r8) goto Lb2
                if (r6 >= r2) goto Lb2
                boolean r9 = r14.m3559a()
                if (r9 == 0) goto Lb2
                int r9 = r1.length()
                int r10 = r7.length()
                int r9 = r9 - r10
                int r10 = r7.length()
            L8d:
                if (r6 > r9) goto La4
                r11 = 0
            L90:
                if (r11 >= r10) goto La5
                int r12 = r6 + r11
                char r12 = r1.charAt(r12)
                char r13 = r7.charAt(r11)
                if (r12 == r13) goto La1
                int r6 = r6 + 1
                goto L8d
            La1:
                int r11 = r11 + 1
                goto L90
            La4:
                r6 = -1
            La5:
                if (r6 == r8) goto L75
                int r8 = r6 + r3
                long r9 = p002a1.C0017d.m68G(r6, r8)
                r0.m3369a(r9)
                r6 = r8
                goto L75
            Lb2:
                boolean r1 = r14.m3559a()
                if (r1 == 0) goto Lc4
                g5.m r1 = p055g5.C1256m.this
                g5.b r1 = r1.f6197a
                w.g r2 = new w.g
                r2.<init>(r14, r4, r0)
                r1.m3489e0(r2)
            Lc4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p055g5.C1256m.b.run():void");
        }
    }

    public C1256m(C1245b c1245b) {
        this.f6197a = c1245b;
        c1245b.m3508q0(C1775d.class, new C1253j(0, this));
    }

    /* renamed from: a */
    public final void m3555a() {
        Thread thread = this.f6200d;
        if (thread != null && thread.isAlive()) {
            this.f6200d.interrupt();
        }
        Thread thread2 = new Thread(new b(this.f6197a.getText(), this.f6199c, this.f6198b));
        this.f6200d = thread2;
        thread2.start();
    }

    /* renamed from: b */
    public final boolean m3556b() {
        Thread thread = this.f6200d;
        return thread == null || !thread.isAlive();
    }

    /* renamed from: c */
    public final void m3557c(final ViewOnClickListenerC1728d.b bVar, final String str) {
        C1245b c1245b = this.f6197a;
        if (c1245b.m3476S()) {
            if (!(this.f6198b != null)) {
                throw new IllegalStateException("pattern not set");
            }
            if (!m3556b()) {
                Context context = c1245b.getContext();
                int i7 = R$string.sora_editor_editor_search_busy;
                int i8 = C1703a.f7669a.get(i7);
                if (i8 != 0) {
                    i7 = i8;
                }
                Toast.makeText(context, i7, 0).show();
                return;
            }
            Context context2 = c1245b.getContext();
            int i9 = R$string.sora_editor_replaceAll;
            SparseIntArray sparseIntArray = C1703a.f7669a;
            int i10 = sparseIntArray.get(i9);
            if (i10 != 0) {
                i9 = i10;
            }
            String string = context2.getString(i9);
            int i11 = R$string.sora_editor_editor_search_replacing;
            int i12 = sparseIntArray.get(i11);
            if (i12 != 0) {
                i11 = i12;
            }
            final ProgressDialog show = ProgressDialog.show(context2, string, context2.getString(i11), true, false);
            final C1175f c1175f = this.f6201e;
            new Thread(new Runnable() { // from class: g5.i
                @Override // java.lang.Runnable
                public final void run() {
                    String str2 = str;
                    C1175f c1175f2 = c1175f;
                    final ProgressDialog progressDialog = show;
                    final Runnable runnable = bVar;
                    final C1256m c1256m = C1256m.this;
                    C1245b c1245b2 = c1256m.f6197a;
                    int i13 = 0;
                    try {
                        final StringBuilder m2127K = c1245b2.getText().m2127K();
                        int length = str2.length();
                        int i14 = 0;
                        for (int i15 = 0; i15 < c1175f2.f5759b; i15++) {
                            long m3377i = c1175f2.m3377i(i15);
                            int i16 = (int) (m3377i >> 32);
                            int m62A = C0017d.m62A(m3377i);
                            m2127K.replace(i16 + i14, m62A + i14, str2);
                            i14 += length - (m62A - i16);
                        }
                        c1245b2.m3489e0(new Runnable() { // from class: g5.k
                            @Override // java.lang.Runnable
                            public final void run() {
                                StringBuilder sb = m2127K;
                                C1245b c1245b3 = C1256m.this.f6197a;
                                C0638b m2164b = c1245b3.getCursor().m2164b();
                                c1245b3.getText().m2119C(0, 0, sb, c1245b3.getLineCount() - 1, c1245b3.getText().m2142n(c1245b3.getLineCount() - 1));
                                int i17 = m2164b.f3141b;
                                int i18 = m2164b.f3142c;
                                if (i17 < c1245b3.getLineCount()) {
                                    int m2142n = c1245b3.f5997F2.m2142n(i17);
                                    if (i18 > m2142n) {
                                        i18 = m2142n;
                                    }
                                } else {
                                    i17 = c1245b3.getLineCount() - 1;
                                    i18 = c1245b3.f5997F2.m2142n(c1245b3.getLineCount() - 1);
                                }
                                c1245b3.m3500k0(i17, i18);
                                progressDialog.dismiss();
                                Runnable runnable2 = runnable;
                                if (runnable2 != null) {
                                    runnable2.run();
                                }
                            }
                        });
                    } catch (Exception e7) {
                        c1245b2.m3489e0(new RunnableC1255l(c1256m, e7, progressDialog, i13));
                    }
                }
            }).start();
        }
    }

    /* renamed from: d */
    public final void m3558d() {
        Thread thread = this.f6200d;
        if (thread != null && thread.isAlive()) {
            this.f6200d.interrupt();
        }
        this.f6200d = null;
        this.f6201e = null;
        this.f6198b = null;
        this.f6199c = null;
        C1245b c1245b = this.f6197a;
        c1245b.f5988B1.m4244a(new C1783l(c1245b));
    }
}
