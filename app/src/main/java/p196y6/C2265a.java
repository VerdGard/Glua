package p196y6;

/* renamed from: y6.a */
/* loaded from: classes.dex */
public final class C2265a {

    /* renamed from: a */
    public final int f10279a;

    /* renamed from: b */
    public int f10280b;

    /* renamed from: c */
    public C2265a[] f10281c;

    /* renamed from: d */
    public C2265a[] f10282d;

    /* renamed from: e */
    public boolean f10283e;

    /* renamed from: y6.a$a */
    public static final class a extends b {

        /* renamed from: b */
        public final int[] f10284b;

        /* renamed from: c */
        public final int[] f10285c;

        /* renamed from: d */
        public final C2265a[] f10286d;

        public a(boolean[] zArr, int[] iArr, int[] iArr2, C2265a[] c2265aArr) {
            super(zArr);
            this.f10284b = iArr;
            this.f10285c = iArr2;
            this.f10286d = c2265aArr;
        }

        @Override // p196y6.C2265a.b
        /* renamed from: a */
        public final void mo5472a(int i7, int i8) {
            C2265a[] c2265aArr = this.f10286d;
            C2265a c2265a = c2265aArr[i7];
            C2265a[] c2265aArr2 = c2265a.f10282d;
            int[] iArr = this.f10284b;
            if (c2265aArr2 == null) {
                c2265a.f10282d = new C2265a[iArr[i7]];
            }
            C2265a c2265a2 = c2265aArr[i8];
            C2265a[] c2265aArr3 = c2265a2.f10281c;
            int[] iArr2 = this.f10285c;
            if (c2265aArr3 == null) {
                c2265a2.f10281c = new C2265a[iArr2[i8]];
            }
            C2265a[] c2265aArr4 = c2265a.f10282d;
            int i9 = iArr[i7] - 1;
            iArr[i7] = i9;
            c2265aArr4[i9] = c2265a2;
            C2265a[] c2265aArr5 = c2265aArr[i8].f10281c;
            int i10 = iArr2[i8] - 1;
            iArr2[i8] = i10;
            c2265aArr5[i10] = c2265aArr[i7];
        }
    }

    /* renamed from: y6.a$b */
    public static abstract class b {

        /* renamed from: a */
        public final boolean[] f10287a;

        public b(boolean[] zArr) {
            this.f10287a = zArr;
        }

        /* renamed from: a */
        public abstract void mo5472a(int i7, int i8);

        /* renamed from: b */
        public void mo5473b(int i7) {
        }
    }

    /* renamed from: y6.a$c */
    public static final class c extends b {

        /* renamed from: b */
        public final int[] f10288b;

        /* renamed from: c */
        public final int[] f10289c;

        public c(boolean[] zArr, int[] iArr, int[] iArr2) {
            super(zArr);
            this.f10288b = iArr;
            this.f10289c = iArr2;
        }

        @Override // p196y6.C2265a.b
        /* renamed from: a */
        public final void mo5472a(int i7, int i8) {
            int[] iArr = this.f10288b;
            iArr[i7] = iArr[i7] + 1;
            int[] iArr2 = this.f10289c;
            iArr2[i8] = iArr2[i8] + 1;
        }
    }

    /* renamed from: y6.a$d */
    public static final class d extends b {

        /* renamed from: b */
        public final boolean[] f10290b;

        public d(boolean[] zArr, boolean[] zArr2) {
            super(zArr);
            this.f10290b = zArr2;
        }

        @Override // p196y6.C2265a.b
        /* renamed from: a */
        public final void mo5472a(int i7, int i8) {
            this.f10290b[i7] = true;
            this.f10287a[i8] = true;
        }

        @Override // p196y6.C2265a.b
        /* renamed from: b */
        public final void mo5473b(int i7) {
            this.f10290b[i7] = true;
        }
    }

    public C2265a(int i7) {
        this.f10280b = i7;
        this.f10279a = i7;
    }

    /* renamed from: a */
    public static String m5470a(C2265a[] c2265aArr, int i7) {
        if (c2265aArr == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer("(");
        int length = c2265aArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (i8 > 0) {
                stringBuffer.append(",");
            }
            stringBuffer.append(String.valueOf((i7 == 1 ? c2265aArr[i8].f10280b : c2265aArr[i8].f10279a) + 1));
        }
        stringBuffer.append(")");
        return stringBuffer.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0043  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m5471b(p165u6.C2008z r6, p196y6.C2265a.b r7) {
        /*
            int[] r6 = r6.f9144b
            int r0 = r6.length
            r1 = 0
        L4:
            if (r1 >= r0) goto L8b
            r2 = r6[r1]
            int r3 = r2 >> 0
            r3 = r3 & 63
            r4 = 3
            r5 = 23
            if (r3 == r4) goto L5c
            r4 = 35
            if (r3 == r4) goto L4f
            switch(r3) {
                case 23: goto L43;
                case 24: goto L1c;
                case 25: goto L1c;
                case 26: goto L1c;
                case 27: goto L1c;
                case 28: goto L1c;
                default: goto L18;
            }
        L18:
            switch(r3) {
                case 30: goto L4b;
                case 31: goto L4b;
                case 32: goto L4f;
                case 33: goto L43;
                default: goto L1b;
            }
        L1b:
            goto L62
        L1c:
            int r2 = r1 + 1
            r3 = r6[r2]
            int r4 = r3 >> 0
            r4 = r4 & 63
            if (r4 != r5) goto L37
            int r1 = p165u6.C1987e.m4678b(r3)
            int r1 = r1 + r2
            int r1 = r1 + 1
            r7.mo5472a(r2, r1)
            int r1 = r2 + 1
            r7.mo5472a(r2, r1)
            r1 = r2
            goto L7c
        L37:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "test not followed by jump at "
            java.lang.String r7 = android.ext.C0090b.m219e(r7, r1)
            r6.<init>(r7)
            throw r6
        L43:
            int r2 = p165u6.C1987e.m4678b(r2)
            int r2 = r2 + r1
            int r2 = r2 + 1
            goto L79
        L4b:
            r7.mo5473b(r1)
            goto L7c
        L4f:
            int r2 = p165u6.C1987e.m4678b(r2)
            int r2 = r2 + r1
            int r2 = r2 + 1
            r7.mo5472a(r1, r2)
            int r2 = r1 + 1
            goto L79
        L5c:
            int r2 = r2 >> 14
            r2 = r2 & 511(0x1ff, float:7.16E-43)
            if (r2 != 0) goto L6d
        L62:
            int r2 = r1 + 1
            if (r2 >= r0) goto L7c
            boolean[] r3 = r7.f10287a
            boolean r3 = r3[r2]
            if (r3 == 0) goto L7c
            goto L79
        L6d:
            int r2 = r1 + 1
            r2 = r6[r2]
            int r2 = r2 >> 0
            r2 = r2 & 63
            if (r2 == r5) goto L7f
            int r2 = r1 + 2
        L79:
            r7.mo5472a(r1, r2)
        L7c:
            int r1 = r1 + 1
            goto L4
        L7f:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "OP_LOADBOOL followed by jump at "
            java.lang.String r7 = android.ext.C0090b.m219e(r7, r1)
            r6.<init>(r7)
            throw r6
        L8b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p196y6.C2265a.m5471b(u6.z, y6.a$b):void");
    }

    public final String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f10279a + 1);
        sb.append("-");
        sb.append(this.f10280b + 1);
        String str2 = "";
        if (this.f10281c != null) {
            str = "  prv: " + m5470a(this.f10281c, 1);
        } else {
            str = "";
        }
        sb.append(str);
        if (this.f10282d != null) {
            str2 = "  nxt: " + m5470a(this.f10282d, 0);
        }
        sb.append(str2);
        sb.append("\n");
        stringBuffer.append(sb.toString());
        return stringBuffer.toString();
    }
}
