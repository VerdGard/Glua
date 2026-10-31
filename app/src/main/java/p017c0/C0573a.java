package p017c0;

import android.text.SpannableStringBuilder;
import p017c0.C0578f;

/* renamed from: c0.a */
/* loaded from: classes.dex */
public final class C0573a {

    /* renamed from: d */
    public static final String f2926d;

    /* renamed from: e */
    public static final String f2927e;

    /* renamed from: f */
    public static final C0573a f2928f;

    /* renamed from: g */
    public static final C0573a f2929g;

    /* renamed from: a */
    public final boolean f2930a;

    /* renamed from: b */
    public final int f2931b;

    /* renamed from: c */
    public final InterfaceC0577e f2932c;

    /* renamed from: c0.a$a */
    public static class a {

        /* renamed from: e */
        public static final byte[] f2933e = new byte[1792];

        /* renamed from: a */
        public final CharSequence f2934a;

        /* renamed from: b */
        public final int f2935b;

        /* renamed from: c */
        public int f2936c;

        /* renamed from: d */
        public char f2937d;

        static {
            for (int i7 = 0; i7 < 1792; i7++) {
                f2933e[i7] = Character.getDirectionality(i7);
            }
        }

        public a(CharSequence charSequence) {
            this.f2934a = charSequence;
            this.f2935b = charSequence.length();
        }

        /* renamed from: a */
        public final byte m2000a() {
            int i7 = this.f2936c - 1;
            CharSequence charSequence = this.f2934a;
            char charAt = charSequence.charAt(i7);
            this.f2937d = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(charSequence, this.f2936c);
                this.f2936c -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f2936c--;
            char c7 = this.f2937d;
            return c7 < 1792 ? f2933e[c7] : Character.getDirectionality(c7);
        }
    }

    static {
        C0578f.d dVar = C0578f.f2945c;
        f2926d = Character.toString((char) 8206);
        f2927e = Character.toString((char) 8207);
        f2928f = new C0573a(false, 2, dVar);
        f2929g = new C0573a(true, 2, dVar);
    }

    public C0573a(boolean z6, int i7, C0578f.d dVar) {
        this.f2930a = z6;
        this.f2931b = i7;
        this.f2932c = dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0086, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006e, code lost:
    
        if (r1 != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0071, code lost:
    
        if (r2 == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x008f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0077, code lost:
    
        if (r0.f2936c <= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x007d, code lost:
    
        switch(r0.m2000a()) {
            case 14: goto L66;
            case 15: goto L66;
            case 16: goto L65;
            case 17: goto L65;
            case 18: goto L64;
            default: goto L70;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0081, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0084, code lost:
    
        if (r1 != r3) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x008c, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0088, code lost:
    
        if (r1 != r3) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:?, code lost:
    
        return 0;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m1997a(java.lang.CharSequence r9) {
        /*
            c0.a$a r0 = new c0.a$a
            r0.<init>(r9)
            r9 = 0
            r0.f2936c = r9
            r1 = 0
            r2 = 0
            r3 = 0
        Lb:
            int r4 = r0.f2936c
            int r5 = r0.f2935b
            r6 = -1
            r7 = 1
            if (r4 >= r5) goto L6e
            if (r1 != 0) goto L6e
            java.lang.CharSequence r5 = r0.f2934a
            char r4 = r5.charAt(r4)
            r0.f2937d = r4
            boolean r4 = java.lang.Character.isHighSurrogate(r4)
            if (r4 == 0) goto L37
            int r4 = r0.f2936c
            int r4 = java.lang.Character.codePointAt(r5, r4)
            int r5 = r0.f2936c
            int r8 = java.lang.Character.charCount(r4)
            int r8 = r8 + r5
            r0.f2936c = r8
            byte r4 = java.lang.Character.getDirectionality(r4)
            goto L4b
        L37:
            int r4 = r0.f2936c
            int r4 = r4 + r7
            r0.f2936c = r4
            char r4 = r0.f2937d
            r5 = 1792(0x700, float:2.511E-42)
            if (r4 >= r5) goto L47
            byte[] r5 = p017c0.C0573a.a.f2933e
            r4 = r5[r4]
            goto L4b
        L47:
            byte r4 = java.lang.Character.getDirectionality(r4)
        L4b:
            if (r4 == 0) goto L69
            if (r4 == r7) goto L66
            r5 = 2
            if (r4 == r5) goto L66
            r5 = 9
            if (r4 == r5) goto Lb
            switch(r4) {
                case 14: goto L62;
                case 15: goto L62;
                case 16: goto L5e;
                case 17: goto L5e;
                case 18: goto L5a;
                default: goto L59;
            }
        L59:
            goto L6c
        L5a:
            int r3 = r3 + (-1)
            r2 = 0
            goto Lb
        L5e:
            int r3 = r3 + 1
            r2 = 1
            goto Lb
        L62:
            int r3 = r3 + 1
            r2 = -1
            goto Lb
        L66:
            if (r3 != 0) goto L6c
            goto L86
        L69:
            if (r3 != 0) goto L6c
            goto L8a
        L6c:
            r1 = r3
            goto Lb
        L6e:
            if (r1 != 0) goto L71
            goto L8f
        L71:
            if (r2 == 0) goto L75
            r9 = r2
            goto L8f
        L75:
            int r2 = r0.f2936c
            if (r2 <= 0) goto L8f
            byte r2 = r0.m2000a()
            switch(r2) {
                case 14: goto L88;
                case 15: goto L88;
                case 16: goto L84;
                case 17: goto L84;
                case 18: goto L81;
                default: goto L80;
            }
        L80:
            goto L75
        L81:
            int r3 = r3 + 1
            goto L75
        L84:
            if (r1 != r3) goto L8c
        L86:
            r9 = 1
            goto L8f
        L88:
            if (r1 != r3) goto L8c
        L8a:
            r9 = -1
            goto L8f
        L8c:
            int r3 = r3 + (-1)
            goto L75
        L8f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p017c0.C0573a.m1997a(java.lang.CharSequence):int");
    }

    /* renamed from: b */
    public static int m1998b(CharSequence charSequence) {
        a aVar = new a(charSequence);
        aVar.f2936c = aVar.f2935b;
        int i7 = 0;
        int i8 = 0;
        while (aVar.f2936c > 0) {
            byte m2000a = aVar.m2000a();
            if (m2000a != 0) {
                if (m2000a == 1 || m2000a == 2) {
                    if (i7 == 0) {
                        return 1;
                    }
                    if (i8 == 0) {
                        i8 = i7;
                    }
                } else if (m2000a != 9) {
                    switch (m2000a) {
                        case 14:
                        case 15:
                            if (i8 == i7) {
                                return -1;
                            }
                            i7--;
                            break;
                        case 16:
                        case 17:
                            if (i8 == i7) {
                                return 1;
                            }
                            i7--;
                            break;
                        case 18:
                            i7++;
                            break;
                        default:
                            if (i8 != 0) {
                                break;
                            } else {
                                i8 = i7;
                                break;
                            }
                    }
                } else {
                    continue;
                }
            } else {
                if (i7 == 0) {
                    return -1;
                }
                if (i8 == 0) {
                    i8 = i7;
                }
            }
        }
        return 0;
    }

    /* renamed from: c */
    public final SpannableStringBuilder m1999c(CharSequence charSequence, InterfaceC0577e interfaceC0577e) {
        if (charSequence == null) {
            return null;
        }
        boolean m2024b = ((C0578f.c) interfaceC0577e).m2024b(charSequence.length(), charSequence);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean z6 = (this.f2931b & 2) != 0;
        String str = f2927e;
        String str2 = f2926d;
        boolean z7 = this.f2930a;
        if (z6) {
            boolean m2024b2 = (m2024b ? C0578f.f2944b : C0578f.f2943a).m2024b(charSequence.length(), charSequence);
            spannableStringBuilder.append((CharSequence) ((z7 || !(m2024b2 || m1997a(charSequence) == 1)) ? (!z7 || (m2024b2 && m1997a(charSequence) != -1)) ? "" : str : str2));
        }
        if (m2024b != z7) {
            spannableStringBuilder.append(m2024b ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean m2024b3 = (m2024b ? C0578f.f2944b : C0578f.f2943a).m2024b(charSequence.length(), charSequence);
        if (!z7 && (m2024b3 || m1998b(charSequence) == 1)) {
            str = str2;
        } else if (!z7 || (m2024b3 && m1998b(charSequence) != -1)) {
            str = "";
        }
        spannableStringBuilder.append((CharSequence) str);
        return spannableStringBuilder;
    }
}
