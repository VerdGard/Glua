package p180w6;

import android.ext.Tools;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import p165u6.AbstractC1984c0;
import p165u6.AbstractC1992j;
import p165u6.AbstractC2003u;
import p165u6.C1979a;
import p165u6.C1989g;
import p165u6.C1991i;
import p165u6.C1993k;
import p165u6.C1998p;
import p165u6.C1999q;
import p165u6.C2002t;
import p172v6.C2034b;

/* renamed from: w6.n */
/* loaded from: classes.dex */
public final class C2145n extends AbstractC2149r {

    /* renamed from: g2 */
    public static final C1998p f9739g2 = C1998p.m4815M2("^$*+?.([%-");

    /* renamed from: h2 */
    public static final byte[] f9740h2 = new byte[Tools.Semaphore.f160S8];

    /* renamed from: w6.n$a */
    public class a {

        /* renamed from: a */
        public final boolean f9741a;

        /* renamed from: b */
        public final boolean f9742b;

        /* renamed from: c */
        public final boolean f9743c;

        /* renamed from: d */
        public final boolean f9744d;

        /* renamed from: e */
        public final int f9745e;

        /* renamed from: f */
        public final int f9746f;

        /* renamed from: g */
        public final int f9747g;

        /* renamed from: h */
        public final int f9748h;

        public a(C2145n c2145n, C1998p c1998p, int i7) {
            int i8;
            int i9;
            int i10;
            int i11 = 0;
            int i12 = i7;
            boolean z6 = true;
            int i13 = 0;
            while (true) {
                i8 = c1998p.f9041e2;
                if (!z6) {
                    break;
                }
                if (i12 < i8) {
                    i13 = c1998p.m4820H2(i12);
                    i12++;
                } else {
                    i13 = 0;
                }
                if (i13 == 32) {
                    this.f9744d = true;
                } else if (i13 != 35) {
                    if (i13 == 43) {
                        this.f9743c = true;
                    } else if (i13 == 45) {
                        this.f9741a = true;
                    } else if (i13 != 48) {
                        z6 = false;
                    } else {
                        this.f9742b = true;
                    }
                }
            }
            if (i12 - i7 > 5) {
                AbstractC2003u.m4861I0("invalid format (repeated flags)");
                throw null;
            }
            this.f9745e = -1;
            if (Character.isDigit((char) i13)) {
                int i14 = i13 - 48;
                this.f9745e = i14;
                if (i12 < i8) {
                    i10 = c1998p.m4820H2(i12);
                    i12++;
                } else {
                    i10 = 0;
                }
                if (Character.isDigit((char) i10)) {
                    this.f9745e = (i10 - 48) + (i14 * 10);
                    if (i12 < i8) {
                        i13 = c1998p.m4820H2(i12);
                        i12++;
                    } else {
                        i13 = 0;
                    }
                } else {
                    i13 = i10;
                }
            }
            this.f9746f = -1;
            if (i13 == 46) {
                if (i12 < i8) {
                    i13 = c1998p.m4820H2(i12);
                    i12++;
                } else {
                    i13 = 0;
                }
                if (Character.isDigit((char) i13)) {
                    int i15 = i13 - 48;
                    this.f9746f = i15;
                    if (i12 < i8) {
                        int i16 = i12 + 1;
                        int m4820H2 = c1998p.m4820H2(i12);
                        i12 = i16;
                        i9 = m4820H2;
                    } else {
                        i9 = 0;
                    }
                    if (Character.isDigit((char) i9)) {
                        this.f9746f = (i9 - 48) + (i15 * 10);
                        if (i12 < i8) {
                            int m4820H22 = c1998p.m4820H2(i12);
                            i12++;
                            i11 = m4820H22;
                        }
                        i13 = i11;
                    } else {
                        i13 = i9;
                    }
                }
            }
            if (Character.isDigit((char) i13)) {
                AbstractC2003u.m4861I0("invalid format (width or precision too long)");
                throw null;
            }
            this.f9742b &= !this.f9741a;
            this.f9747g = i13;
            this.f9748h = i12 - i7;
            c1998p.m4823K2(i7 - 1, i12).mo4645M();
        }

        /* JADX WARN: Removed duplicated region for block: B:64:0x0029  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void m5251a(p165u6.C1979a r11, long r12) {
            /*
                r10 = this;
                r0 = 0
                int r2 = r10.f9746f
                int r3 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
                if (r3 != 0) goto Ld
                if (r2 != 0) goto Ld
                java.lang.String r12 = ""
                goto L2d
            Ld:
                r0 = 88
                int r1 = r10.f9747g
                if (r1 == r0) goto L21
                r4 = 111(0x6f, float:1.56E-43)
                if (r1 == r4) goto L1e
                r4 = 120(0x78, float:1.68E-43)
                if (r1 == r4) goto L21
                r4 = 10
                goto L23
            L1e:
                r4 = 8
                goto L23
            L21:
                r4 = 16
            L23:
                java.lang.String r12 = java.lang.Long.toString(r12, r4)
                if (r1 != r0) goto L2d
                java.lang.String r12 = r12.toUpperCase()
            L2d:
                int r13 = r12.length()
                boolean r0 = r10.f9744d
                boolean r1 = r10.f9743c
                if (r3 >= 0) goto L3d
                int r4 = r13 + (-1)
                r9 = r4
                r4 = r13
                r13 = r9
                goto L46
            L3d:
                if (r1 != 0) goto L44
                if (r0 == 0) goto L42
                goto L44
            L42:
                r4 = r13
                goto L46
            L44:
                int r4 = r13 + 1
            L46:
                r5 = 0
                int r6 = r10.f9745e
                if (r2 <= r13) goto L4d
                int r2 = r2 - r13
                goto L5a
            L4d:
                r13 = -1
                if (r2 != r13) goto L59
                boolean r13 = r10.f9742b
                if (r13 == 0) goto L59
                if (r6 <= r4) goto L59
                int r2 = r6 - r4
                goto L5a
            L59:
                r2 = 0
            L5a:
                int r4 = r4 + r2
                if (r6 <= r4) goto L5f
                int r5 = r6 - r4
            L5f:
                boolean r13 = r10.f9741a
                r4 = 32
                if (r13 != 0) goto L70
                byte r6 = (byte) r4
                r7 = r5
            L67:
                int r8 = r7 + (-1)
                if (r7 <= 0) goto L70
                r11.m4614a(r6)
                r7 = r8
                goto L67
            L70:
                if (r3 >= 0) goto L7f
                if (r2 <= 0) goto L8c
                r0 = 45
                r11.m4614a(r0)
                r0 = 1
                java.lang.String r12 = r12.substring(r0)
                goto L8c
            L7f:
                if (r1 == 0) goto L87
                r0 = 43
                r11.m4614a(r0)
                goto L8c
            L87:
                if (r0 == 0) goto L8c
                r11.m4614a(r4)
            L8c:
                if (r2 <= 0) goto L9a
                r0 = 48
                byte r0 = (byte) r0
            L91:
                int r1 = r2 + (-1)
                if (r2 <= 0) goto L9a
                r11.m4614a(r0)
                r2 = r1
                goto L91
            L9a:
                r11.m4615b(r12)
                if (r13 == 0) goto La9
                byte r12 = (byte) r4
            La0:
                int r13 = r5 + (-1)
                if (r5 <= 0) goto La9
                r11.m4614a(r12)
                r5 = r13
                goto La0
            La9:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p180w6.C2145n.a.m5251a(u6.a, long):void");
        }
    }

    /* renamed from: w6.n$b */
    public static class b extends AbstractC2150s {

        /* renamed from: g2 */
        public final int f9749g2;

        /* renamed from: h2 */
        public final c f9750h2;

        /* renamed from: i2 */
        public final boolean f9751i2;

        /* renamed from: j2 */
        public int f9752j2 = 0;

        /* renamed from: k2 */
        public int f9753k2 = -1;

        public b(AbstractC1984c0 abstractC1984c0, C1998p c1998p, C1998p c1998p2, boolean z6) {
            this.f9749g2 = c1998p.f9041e2;
            this.f9750h2 = new c(abstractC1984c0, c1998p, c1998p2);
            this.f9751i2 = z6;
        }

        @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: W0 */
        public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
            while (true) {
                int i7 = this.f9752j2;
                if (i7 > this.f9749g2) {
                    return AbstractC2003u.f9130m;
                }
                c cVar = this.f9750h2;
                cVar.f9758e = 0;
                cVar.f9754a = 200;
                int m5254b = cVar.m5254b(i7, 0);
                if (m5254b >= 0 && m5254b != this.f9753k2) {
                    int i8 = this.f9752j2;
                    this.f9752j2 = m5254b;
                    this.f9753k2 = m5254b;
                    return this.f9751i2 ? AbstractC2003u.m4866x2(C1993k.m4765C2(i8 + 1), C1993k.m4765C2(m5254b), cVar.m5258g(i8, m5254b, false)) : cVar.m5258g(i8, m5254b, true);
                }
                this.f9752j2++;
            }
        }
    }

    /* renamed from: w6.n$c */
    public static class c {

        /* renamed from: b */
        public final C1998p f9755b;

        /* renamed from: c */
        public final C1998p f9756c;

        /* renamed from: d */
        public final AbstractC1984c0 f9757d;

        /* renamed from: e */
        public int f9758e = 0;

        /* renamed from: f */
        public final int[] f9759f = new int[32];

        /* renamed from: g */
        public final int[] f9760g = new int[32];

        /* renamed from: a */
        public int f9754a = 200;

        public c(AbstractC1984c0 abstractC1984c0, C1998p c1998p, C1998p c1998p2) {
            this.f9755b = c1998p;
            this.f9756c = c1998p2;
            this.f9757d = abstractC1984c0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x003d, code lost:
        
            if ((r1 & Byte.MIN_VALUE) != 0) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x003f, code lost:
        
            r5 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0041, code lost:
        
            r5 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0045, code lost:
        
            if ((r1 & 9) != 0) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x004a, code lost:
        
            if ((r1 & 8) != 0) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x004f, code lost:
        
            if ((r1 & 64) != 0) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0052, code lost:
        
            if (r5 == 0) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0057, code lost:
        
            if ((r1 & 4) != 0) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x005c, code lost:
        
            if ((r1 & 32) != 0) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0061, code lost:
        
            if ((r1 & 16) != 0) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0066, code lost:
        
            if ((r1 & 2) != 0) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x006b, code lost:
        
            if ((r1 & 25) != 0) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x0070, code lost:
        
            if ((r1 & 1) != 0) goto L29;
         */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static boolean m5252d(int r5, int r6) {
            /*
                char r0 = (char) r6
                char r0 = java.lang.Character.toLowerCase(r0)
                byte[] r1 = p180w6.C2145n.f9740h2
                r1 = r1[r5]
                r2 = 97
                r3 = 0
                r4 = 1
                if (r0 == r2) goto L6e
                r2 = 103(0x67, float:1.44E-43)
                if (r0 == r2) goto L69
                r2 = 108(0x6c, float:1.51E-43)
                if (r0 == r2) goto L64
                r2 = 112(0x70, float:1.57E-43)
                if (r0 == r2) goto L5f
                r2 = 115(0x73, float:1.61E-43)
                if (r0 == r2) goto L5a
                r2 = 117(0x75, float:1.64E-43)
                if (r0 == r2) goto L55
                r2 = 122(0x7a, float:1.71E-43)
                if (r0 == r2) goto L52
                r2 = 99
                if (r0 == r2) goto L4d
                r2 = 100
                if (r0 == r2) goto L48
                r2 = 119(0x77, float:1.67E-43)
                if (r0 == r2) goto L43
                r2 = 120(0x78, float:1.68E-43)
                if (r0 == r2) goto L3b
                if (r6 != r5) goto L3a
                r3 = 1
            L3a:
                return r3
            L3b:
                r5 = r1 & (-128(0xffffffffffffff80, float:NaN))
                if (r5 == 0) goto L41
            L3f:
                r5 = 1
                goto L73
            L41:
                r5 = 0
                goto L73
            L43:
                r5 = r1 & 9
                if (r5 == 0) goto L41
                goto L3f
            L48:
                r5 = r1 & 8
                if (r5 == 0) goto L41
                goto L3f
            L4d:
                r5 = r1 & 64
                if (r5 == 0) goto L41
                goto L3f
            L52:
                if (r5 != 0) goto L41
                goto L3f
            L55:
                r5 = r1 & 4
                if (r5 == 0) goto L41
                goto L3f
            L5a:
                r5 = r1 & 32
                if (r5 == 0) goto L41
                goto L3f
            L5f:
                r5 = r1 & 16
                if (r5 == 0) goto L41
                goto L3f
            L64:
                r5 = r1 & 2
                if (r5 == 0) goto L41
                goto L3f
            L69:
                r5 = r1 & 25
                if (r5 == 0) goto L41
                goto L3f
            L6e:
                r5 = r1 & 1
                if (r5 == 0) goto L41
                goto L3f
            L73:
                if (r0 != r6) goto L77
                r3 = r5
                goto L7a
            L77:
                if (r5 != 0) goto L7a
                r3 = 1
            L7a:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p180w6.C2145n.c.m5252d(int, int):boolean");
        }

        /* renamed from: a */
        public final int m5253a(int i7) {
            int i8 = i7 + 1;
            C1998p c1998p = this.f9756c;
            int m4820H2 = c1998p.m4820H2(i7);
            int i9 = c1998p.f9041e2;
            if (m4820H2 == 37) {
                if (i8 != i9) {
                    return i8 + 1;
                }
                AbstractC2003u.m4861I0("malformed pattern (ends with '%')");
                throw null;
            }
            if (m4820H2 != 91) {
                return i8;
            }
            if (i8 != i9 && c1998p.m4820H2(i8) == 94) {
                i8++;
            }
            while (i8 != i9) {
                int i10 = i8 + 1;
                if (c1998p.m4820H2(i8) == 37 && i10 < i9) {
                    i10++;
                }
                i8 = i10;
                if (i8 != i9 && c1998p.m4820H2(i8) == 93) {
                    return i8 + 1;
                }
            }
            AbstractC2003u.m4861I0("malformed pattern (missing ']')");
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:118:0x01a2, code lost:
        
            return r11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:151:0x00ca, code lost:
        
            p165u6.AbstractC2003u.m4861I0("missing '[' after '%f' in pattern");
         */
        /* JADX WARN: Code restructure failed: missing block: B:152:0x00cf, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0198, code lost:
        
            return r5;
         */
        /* JADX WARN: Removed duplicated region for block: B:115:0x0199 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x010b A[Catch: all -> 0x01a3, TryCatch #0 {all -> 0x01a3, blocks: (B:5:0x000c, B:7:0x0012, B:163:0x002f, B:165:0x0034, B:169:0x003a, B:171:0x0048, B:167:0x004c, B:173:0x004f, B:174:0x0054, B:68:0x0128, B:70:0x0130, B:74:0x013f, B:94:0x0156, B:85:0x015d, B:101:0x0173, B:103:0x017b, B:105:0x017f, B:107:0x0189, B:114:0x018e, B:116:0x0199, B:176:0x0055, B:178:0x0058, B:180:0x005e, B:181:0x0066, B:12:0x006c, B:14:0x0070, B:64:0x007c, B:126:0x0087, B:129:0x008f, B:131:0x0097, B:133:0x009b, B:135:0x00a3, B:138:0x00b1, B:141:0x00ba, B:143:0x00c2, B:148:0x00b6, B:149:0x00ab, B:151:0x00ca, B:152:0x00cf, B:17:0x00d0, B:19:0x00d4, B:21:0x00d8, B:26:0x010b, B:34:0x00dd, B:37:0x00e8, B:38:0x00ed, B:40:0x00f0, B:51:0x00f6, B:54:0x00fa, B:43:0x00fd, B:46:0x0103, B:58:0x010f, B:59:0x0114, B:155:0x0115, B:156:0x011a, B:66:0x011b, B:121:0x011f), top: B:4:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0109 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:74:0x013f A[Catch: all -> 0x01a3, TryCatch #0 {all -> 0x01a3, blocks: (B:5:0x000c, B:7:0x0012, B:163:0x002f, B:165:0x0034, B:169:0x003a, B:171:0x0048, B:167:0x004c, B:173:0x004f, B:174:0x0054, B:68:0x0128, B:70:0x0130, B:74:0x013f, B:94:0x0156, B:85:0x015d, B:101:0x0173, B:103:0x017b, B:105:0x017f, B:107:0x0189, B:114:0x018e, B:116:0x0199, B:176:0x0055, B:178:0x0058, B:180:0x005e, B:181:0x0066, B:12:0x006c, B:14:0x0070, B:64:0x007c, B:126:0x0087, B:129:0x008f, B:131:0x0097, B:133:0x009b, B:135:0x00a3, B:138:0x00b1, B:141:0x00ba, B:143:0x00c2, B:148:0x00b6, B:149:0x00ab, B:151:0x00ca, B:152:0x00cf, B:17:0x00d0, B:19:0x00d4, B:21:0x00d8, B:26:0x010b, B:34:0x00dd, B:37:0x00e8, B:38:0x00ed, B:40:0x00f0, B:51:0x00f6, B:54:0x00fa, B:43:0x00fd, B:46:0x0103, B:58:0x010f, B:59:0x0114, B:155:0x0115, B:156:0x011a, B:66:0x011b, B:121:0x011f), top: B:4:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0147  */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int m5254b(int r11, int r12) {
            /*
                Method dump skipped, instructions count: 432
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p180w6.C2145n.c.m5254b(int, int):int");
        }

        /* renamed from: c */
        public final int m5255c(int i7, int i8) {
            int i9;
            int i10 = i8 - 49;
            if (i10 < 0 || i10 >= this.f9758e || (i9 = this.f9760g[i10]) == -1) {
                AbstractC2003u.m4861I0("invalid capture index %" + (i10 + 1));
                throw null;
            }
            C1998p c1998p = this.f9755b;
            if (c1998p.f9041e2 - i7 >= i9) {
                int i11 = this.f9759f[i10];
                int i12 = c1998p.f9040d2;
                byte[] bArr = c1998p.f9039c2;
                if (C1998p.m4813E2(bArr, i11 + i12, i12 + i7, bArr, i9)) {
                    return i7 + i9;
                }
            }
            return -1;
        }

        /* renamed from: e */
        public final boolean m5256e(int i7, int i8, int i9) {
            boolean z6;
            int i10;
            int i11 = i8 + 1;
            C1998p c1998p = this.f9756c;
            if (c1998p.m4820H2(i11) == 94) {
                i8 = i11;
                z6 = false;
            } else {
                z6 = true;
            }
            while (true) {
                i8++;
                if (i8 >= i9) {
                    return !z6;
                }
                if (c1998p.m4820H2(i8) == 37) {
                    i8++;
                    if (m5252d(i7, c1998p.m4820H2(i8))) {
                        return z6;
                    }
                } else if (c1998p.m4820H2(i8 + 1) != 45 || (i10 = i8 + 2) >= i9) {
                    if (c1998p.m4820H2(i8) == i7) {
                        return z6;
                    }
                } else {
                    if (c1998p.m4820H2(i10 - 2) <= i7 && i7 <= c1998p.m4820H2(i10)) {
                        return z6;
                    }
                    i8 = i10;
                }
            }
        }

        /* renamed from: f */
        public final int m5257f(int i7, int i8, int i9) {
            int i10 = 0;
            while (true) {
                int i11 = i7 + i10;
                C1998p c1998p = this.f9755b;
                if (i11 >= c1998p.f9041e2 || !m5260i(c1998p.m4820H2(i11), i8, i9)) {
                    break;
                }
                i10++;
            }
            while (i10 >= 0) {
                int m5254b = m5254b(i7 + i10, i9 + 1);
                if (m5254b != -1) {
                    return m5254b;
                }
                i10--;
            }
            return -1;
        }

        /* renamed from: g */
        public final AbstractC1984c0 m5258g(int i7, int i8, boolean z6) {
            int i9 = this.f9758e;
            if (i9 == 0 && z6) {
                i9 = 1;
            }
            if (i9 == 0) {
                return AbstractC2003u.f9124Y;
            }
            if (i9 == 1) {
                return m5259h(0, i7, i8);
            }
            AbstractC2003u[] abstractC2003uArr = new AbstractC2003u[i9];
            for (int i10 = 0; i10 < i9; i10++) {
                abstractC2003uArr[i10] = m5259h(i10, i7, i8);
            }
            return AbstractC2003u.m4868z2(abstractC2003uArr);
        }

        /* renamed from: h */
        public final AbstractC2003u m5259h(int i7, int i8, int i9) {
            int i10 = this.f9758e;
            C1998p c1998p = this.f9755b;
            if (i7 >= i10) {
                if (i7 == 0) {
                    return c1998p.m4823K2(i8, i9);
                }
                throw new C1991i("invalid capture index %" + (i7 + 1));
            }
            int i11 = this.f9760g[i7];
            if (i11 == -1) {
                throw new C1991i("unfinished capture");
            }
            int[] iArr = this.f9759f;
            if (i11 == -2) {
                return C1993k.m4765C2(iArr[i7] + 1);
            }
            int i12 = iArr[i7];
            return c1998p.m4823K2(i12, i11 + i12);
        }

        /* renamed from: i */
        public final boolean m5260i(int i7, int i8, int i9) {
            C1998p c1998p = this.f9756c;
            int m4820H2 = c1998p.m4820H2(i8);
            if (m4820H2 == 37) {
                return m5252d(i7, c1998p.m4820H2(i8 + 1));
            }
            if (m4820H2 != 46) {
                return m4820H2 != 91 ? c1998p.m4820H2(i8) == i7 : m5256e(i7, i8, i9 - 1);
            }
            return true;
        }

        /* renamed from: j */
        public final int m5261j(int i7, int i8, int i9) {
            int i10 = this.f9758e;
            if (i10 >= 32) {
                AbstractC2003u.m4861I0("too many captures");
                throw null;
            }
            this.f9759f[i10] = i7;
            this.f9760g[i10] = i9;
            this.f9758e = i10 + 1;
            int m5254b = m5254b(i7, i8);
            if (m5254b == -1) {
                this.f9758e--;
            }
            return m5254b;
        }
    }

    /* renamed from: w6.n$d */
    public static final class d extends AbstractC2150s {
        @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: W0 */
        public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
            C1998p m4651z = abstractC1984c0.m4651z(1);
            int i7 = m4651z.f9041e2;
            int m4643J = abstractC1984c0.m4643J(2, 1);
            if (m4643J < 0) {
                m4643J = m4643J + i7 + 1;
            }
            int m4643J2 = abstractC1984c0.m4643J(3, m4643J);
            if (m4643J2 < 0) {
                m4643J2 = m4643J2 + i7 + 1;
            }
            if (m4643J <= 0) {
                m4643J = 1;
            }
            if (m4643J2 <= i7) {
                i7 = m4643J2;
            }
            if (m4643J > i7) {
                return AbstractC2003u.f9124Y;
            }
            int i8 = (i7 - m4643J) + 1;
            if (m4643J + i8 <= i7) {
                AbstractC2003u.m4861I0("string slice too long");
                throw null;
            }
            AbstractC2003u[] abstractC2003uArr = new AbstractC2003u[i8];
            for (int i9 = 0; i9 < i8; i9++) {
                abstractC2003uArr[i9] = C1993k.m4765C2(m4651z.m4820H2((m4643J + i9) - 1));
            }
            return AbstractC2003u.m4868z2(abstractC2003uArr);
        }
    }

    /* renamed from: w6.n$e */
    public static final class e extends AbstractC2150s {
        @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: W0 */
        public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
            int mo4621I = abstractC1984c0.mo4621I();
            byte[] bArr = new byte[mo4621I];
            int i7 = 1;
            int i8 = 0;
            while (i8 < mo4621I) {
                int m4648w = abstractC1984c0.m4648w(i7);
                if (m4648w < 0 || m4648w >= 256) {
                    AbstractC2003u.m4863R(i7, "invalid value for string.char [0; 255]: " + m4648w);
                    throw null;
                }
                bArr[i8] = (byte) m4648w;
                i8++;
                i7++;
            }
            return C1998p.m4817O2(bArr, 0, mo4621I);
        }
    }

    /* renamed from: w6.n$f */
    public static final class f extends AbstractC2150s {
        @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: W0 */
        public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
            AbstractC1992j mo4764k0 = abstractC1984c0.mo4623t(1).mo4764k0();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                C2034b.m4931a(((C1989g) mo4764k0).f9008e2, byteArrayOutputStream, abstractC1984c0.mo4623t(2).mo4680A1(true));
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return C1998p.m4817O2(byteArray, 0, byteArray.length);
            } catch (IOException e7) {
                throw new C1991i(e7.getMessage());
            }
        }
    }

    /* renamed from: w6.n$g */
    public static final class g extends AbstractC2150s {
        @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: W0 */
        public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
            return C2145n.m5250I2(abstractC1984c0, true);
        }
    }

    /* renamed from: w6.n$h */
    public final class h extends AbstractC2150s {
        public h() {
        }

        @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: W0 */
        public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
            int i7 = 1;
            C1998p m4651z = abstractC1984c0.m4651z(1);
            int i8 = m4651z.f9041e2;
            C1979a c1979a = new C1979a(i8);
            int i9 = 0;
            int i10 = 0;
            while (i10 < i8) {
                int i11 = i10 + 1;
                int m4820H2 = m4651z.m4820H2(i10);
                if (m4820H2 == 10) {
                    c1979a.m4615b("\n");
                } else if (m4820H2 != 37) {
                    c1979a.m4614a((byte) m4820H2);
                } else if (i11 < i8) {
                    if (m4651z.m4820H2(i11) == 37) {
                        i10 = i11 + 1;
                        c1979a.m4614a((byte) 37);
                    } else {
                        i7++;
                        C2145n c2145n = C2145n.this;
                        a aVar = new a(c2145n, m4651z, i11);
                        i11 += aVar.f9748h;
                        int i12 = aVar.f9747g;
                        if (i12 != 69 && i12 != 71) {
                            if (i12 != 88 && i12 != 105 && i12 != 111) {
                                if (i12 == 113) {
                                    C1998p m4651z2 = abstractC1984c0.m4651z(i7);
                                    c1979a.m4614a((byte) 34);
                                    int i13 = m4651z2.f9041e2;
                                    for (int i14 = 0; i14 < i13; i14++) {
                                        int m4820H22 = m4651z2.m4820H2(i14);
                                        if (m4820H22 == 10 || m4820H22 == 34 || m4820H22 == 92) {
                                            c1979a.m4614a((byte) 92);
                                        } else if (m4820H22 <= 31 || m4820H22 == 127) {
                                            c1979a.m4614a((byte) 92);
                                            int i15 = i14 + 1;
                                            if (i15 == i13 || m4651z2.m4820H2(i15) < 48 || m4651z2.m4820H2(i15) > 57) {
                                                c1979a.m4615b(Integer.toString(m4820H22));
                                            } else {
                                                c1979a.m4614a((byte) 48);
                                                c1979a.m4614a((byte) ((char) ((m4820H22 / 10) + 48)));
                                                m4820H22 = (char) ((m4820H22 % 10) + 48);
                                            }
                                        }
                                        c1979a.m4614a((byte) m4820H22);
                                    }
                                    c1979a.m4614a((byte) 34);
                                } else if (i12 == 115) {
                                    C1998p m4651z3 = abstractC1984c0.m4651z(i7);
                                    if (aVar.f9746f != -1 || m4651z3.f9041e2 < 100) {
                                        int i16 = 0;
                                        while (true) {
                                            if (i16 < m4651z3.f9041e2) {
                                                if (m4651z3.f9039c2[m4651z3.f9040d2 + i16] != 0) {
                                                    i16++;
                                                }
                                            } else {
                                                i16 = -1;
                                            }
                                        }
                                        if (i16 != -1) {
                                            m4651z3 = m4651z3.m4823K2(i9, i16);
                                        }
                                        c1979a.m4616c(m4651z3);
                                    } else {
                                        c1979a.m4616c(m4651z3);
                                    }
                                } else if (i12 != 117 && i12 != 120) {
                                    switch (i12) {
                                        case 99:
                                            c1979a.m4614a((byte) abstractC1984c0.m4648w(i7));
                                            break;
                                        case 100:
                                            break;
                                        case 101:
                                        case 102:
                                        case 103:
                                            break;
                                        default:
                                            AbstractC2003u.m4861I0("invalid option '%" + ((char) i12) + "' to 'format'");
                                            throw null;
                                    }
                                }
                            }
                            aVar.m5251a(c1979a, abstractC1984c0.m4650y(i7));
                        }
                        double m4647v = abstractC1984c0.m4647v(i7);
                        c2145n.getClass();
                        c1979a.m4615b(String.valueOf(m4647v));
                    }
                }
                i10 = i11;
                i9 = 0;
            }
            return c1979a.m4619f();
        }
    }

    /* renamed from: w6.n$i */
    public static final class i extends AbstractC2150s {
        @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: W0 */
        public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
            return new b(abstractC1984c0, abstractC1984c0.m4651z(1), abstractC1984c0.m4651z(2), true);
        }
    }

    /* renamed from: w6.n$j */
    public static final class j extends AbstractC2150s {
        @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: W0 */
        public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
            return new b(abstractC1984c0, abstractC1984c0.m4651z(1), abstractC1984c0.m4651z(2), false);
        }
    }

    /* renamed from: w6.n$k */
    public static final class k extends AbstractC2150s {
        /* JADX WARN: Removed duplicated region for block: B:9:0x0042  */
        @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: W0 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final p165u6.AbstractC1984c0 mo4689W0(p165u6.AbstractC1984c0 r19) {
            /*
                Method dump skipped, instructions count: 363
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p180w6.C2145n.k.mo4689W0(u6.c0):u6.c0");
        }
    }

    /* renamed from: w6.n$l */
    public static final class l extends AbstractC2141j {
        @Override // p180w6.AbstractC2141j, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: f0 */
        public final AbstractC2003u mo4691f0(AbstractC2003u abstractC2003u) {
            return abstractC2003u.mo4753s0().mo4793j1();
        }
    }

    /* renamed from: w6.n$m */
    public static final class m extends AbstractC2141j {
        @Override // p180w6.AbstractC2141j, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: f0 */
        public final AbstractC2003u mo4691f0(AbstractC2003u abstractC2003u) {
            return C1998p.m4815M2(abstractC2003u.mo4742n0().toLowerCase());
        }
    }

    /* renamed from: w6.n$n */
    public static final class n extends AbstractC2150s {
        @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: W0 */
        public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
            return C2145n.m5250I2(abstractC1984c0, false);
        }
    }

    /* renamed from: w6.n$o */
    public static final class o extends AbstractC2150s {
        @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: W0 */
        public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
            C1998p m4651z = abstractC1984c0.m4651z(1);
            int m4648w = abstractC1984c0.m4648w(2);
            int i7 = m4651z.f9041e2;
            int i8 = m4648w * i7;
            byte[] bArr = new byte[i8];
            for (int i9 = 0; i9 < i8; i9 += i7) {
                System.arraycopy(m4651z.f9039c2, m4651z.f9040d2 + 0, bArr, i9, i7);
            }
            return C1998p.m4817O2(bArr, 0, i8);
        }
    }

    /* renamed from: w6.n$p */
    public static final class p extends AbstractC2141j {
        @Override // p180w6.AbstractC2141j, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: f0 */
        public final AbstractC2003u mo4691f0(AbstractC2003u abstractC2003u) {
            C1998p mo4753s0 = abstractC2003u.mo4753s0();
            int i7 = mo4753s0.f9041e2;
            byte[] bArr = new byte[i7];
            int i8 = i7 - 1;
            int i9 = 0;
            while (i9 < i7) {
                bArr[i8] = (byte) mo4753s0.m4820H2(i9);
                i9++;
                i8--;
            }
            return C1998p.m4817O2(bArr, 0, i7);
        }
    }

    /* renamed from: w6.n$q */
    public static final class q extends AbstractC2150s {
        @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: W0 */
        public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
            C1998p m4651z = abstractC1984c0.m4651z(1);
            int i7 = m4651z.f9041e2;
            int m4648w = abstractC1984c0.m4648w(2);
            if (m4648w < 0) {
                m4648w = m4648w + i7 + 1;
            }
            int m4643J = abstractC1984c0.m4643J(3, -1);
            if (m4643J < 0) {
                m4643J = m4643J + i7 + 1;
            }
            if (m4648w < 1) {
                m4648w = 1;
            }
            if (m4643J <= i7) {
                i7 = m4643J;
            }
            return m4648w <= i7 ? m4651z.m4823K2(m4648w - 1, i7) : AbstractC2003u.f9116R1;
        }
    }

    /* renamed from: w6.n$r */
    public static final class r extends AbstractC2141j {
        @Override // p180w6.AbstractC2141j, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: f0 */
        public final AbstractC2003u mo4691f0(AbstractC2003u abstractC2003u) {
            char[] charArray = abstractC2003u.mo4645M().toCharArray();
            return new C2002t(charArray, charArray.length);
        }
    }

    /* renamed from: w6.n$s */
    public static final class s extends AbstractC2141j {
        @Override // p180w6.AbstractC2141j, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: f0 */
        public final AbstractC2003u mo4691f0(AbstractC2003u abstractC2003u) {
            return C1998p.m4815M2(abstractC2003u.mo4742n0().toUpperCase());
        }
    }

    static {
        for (int i7 = 0; i7 < 128; i7++) {
            char c7 = (char) i7;
            byte[] bArr = f9740h2;
            byte b7 = (byte) (((c7 < ' ' || c7 == 127) ? 64 : 0) | (Character.isDigit(c7) ? 8 : 0) | (Character.isLowerCase(c7) ? 2 : 0) | (Character.isUpperCase(c7) ? 4 : 0));
            bArr[i7] = b7;
            if ((c7 >= 'a' && c7 <= 'f') || ((c7 >= 'A' && c7 <= 'F') || (c7 >= '0' && c7 <= '9'))) {
                bArr[i7] = (byte) (b7 | Byte.MIN_VALUE);
            }
            if ((c7 >= '!' && c7 <= '/') || ((c7 >= ':' && c7 <= '@') || ((c7 >= '[' && c7 <= '`') || (c7 >= '{' && c7 <= '~')))) {
                bArr[i7] = (byte) (bArr[i7] | 16);
            }
            byte b8 = bArr[i7];
            if ((b8 & 6) != 0) {
                bArr[i7] = (byte) (b8 | 1);
            }
        }
        byte[] bArr2 = f9740h2;
        bArr2[32] = 32;
        bArr2[13] = (byte) (bArr2[13] | 32);
        bArr2[10] = (byte) (bArr2[10] | 32);
        bArr2[9] = (byte) (bArr2[9] | 32);
        bArr2[11] = (byte) (bArr2[11] | 32);
        bArr2[12] = (byte) (bArr2[12] | 32);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
    
        if (r10 == (-1)) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0091  */
    /* renamed from: I2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p165u6.AbstractC1984c0 m5250I2(p165u6.AbstractC1984c0 r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p180w6.C2145n.m5250I2(u6.c0, boolean):u6.c0");
    }

    @Override // p180w6.AbstractC2149r, p180w6.AbstractC2139h, p165u6.AbstractC2003u
    /* renamed from: g0 */
    public final AbstractC2003u mo4692g0(AbstractC2003u abstractC2003u, AbstractC2003u abstractC2003u2) {
        C1999q c1999q = new C1999q();
        c1999q.mo4790Y1(C1998p.m4815M2("byte"), new d());
        c1999q.mo4790Y1(C1998p.m4815M2("char"), new e());
        c1999q.mo4790Y1(C1998p.m4815M2("dump"), new f());
        c1999q.mo4790Y1(C1998p.m4815M2("find"), new g());
        c1999q.mo4790Y1(C1998p.m4815M2("format"), new h());
        c1999q.mo4790Y1(C1998p.m4815M2("gmatch"), new j());
        c1999q.mo4790Y1(C1998p.m4815M2("gfind"), new i());
        c1999q.mo4790Y1(C1998p.m4815M2("gsub"), new k());
        c1999q.mo4790Y1(C1998p.m4815M2("len"), new l());
        c1999q.mo4790Y1(C1998p.m4815M2("lower"), new m());
        c1999q.mo4790Y1(C1998p.m4815M2("match"), new n());
        c1999q.mo4790Y1(C1998p.m4815M2("rep"), new o());
        c1999q.mo4790Y1(C1998p.m4815M2("reverse"), new p());
        c1999q.mo4790Y1(C1998p.m4815M2("sub"), new q());
        c1999q.mo4790Y1(C1998p.m4815M2("upper"), new s());
        c1999q.mo4790Y1(C1998p.m4815M2("toutf8"), new r());
        abstractC2003u2.getClass();
        abstractC2003u2.mo4790Y1(C1998p.m4815M2("string"), c1999q);
        if (!abstractC2003u2.mo4777L0(C1998p.m4815M2("package")).mo4804d1()) {
            AbstractC2003u mo4777L0 = abstractC2003u2.mo4777L0(C1998p.m4815M2("package"));
            mo4777L0.getClass();
            AbstractC2003u mo4777L02 = mo4777L0.mo4777L0(C1998p.m4815M2("loaded"));
            mo4777L02.getClass();
            mo4777L02.mo4790Y1(C1998p.m4815M2("string"), c1999q);
        }
        if (C1998p.f9038h2 == null) {
            C1998p.f9038h2 = new C1999q(new AbstractC2003u[]{AbstractC2003u.f9135z1, c1999q});
        }
        return c1999q;
    }
}
