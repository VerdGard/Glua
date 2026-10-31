package p164u5;

import androidx.activity.C0143v;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import p133q5.C1799b;
import p133q5.C1803f;

/* renamed from: u5.a */
/* loaded from: classes.dex */
public final class C1976a {

    /* renamed from: a */
    public int f8848a;

    /* renamed from: b */
    public final String f8849b;

    /* renamed from: c */
    public int f8850c;

    /* renamed from: d */
    public C1977b f8851d;

    /* renamed from: e */
    public int f8852e;

    /* renamed from: f */
    public int f8853f;

    /* renamed from: g */
    public final Closeable f8854g;

    /* renamed from: h */
    public char[] f8855h;

    /* renamed from: i */
    public int f8856i;

    /* renamed from: j */
    public C1977b f8857j;

    /* renamed from: k */
    public final byte[][] f8858k;

    /* renamed from: l */
    public char[] f8859l;

    /* renamed from: m */
    public int f8860m;

    public C1976a(BufferedReader bufferedReader) {
        this.f8858k = new byte[][]{new byte[]{-64, -79}, new byte[]{-32, Byte.MIN_VALUE, -79}, new byte[]{-16, Byte.MIN_VALUE, Byte.MIN_VALUE, -79}, new byte[]{-8, Byte.MIN_VALUE, Byte.MIN_VALUE, Byte.MIN_VALUE, -79}, new byte[]{-4, Byte.MIN_VALUE, Byte.MIN_VALUE, Byte.MIN_VALUE, Byte.MIN_VALUE, -79}};
        this.f8854g = bufferedReader;
        this.f8849b = "分析器";
        this.f8850c = 1;
        this.f8856i = 0;
        int m4607k = m4607k();
        this.f8848a = m4607k;
        if (m4607k == 35) {
            while (!m4599c() && this.f8848a != -1) {
                m4603g();
            }
        }
    }

    /* renamed from: a */
    public final EnumC1978c m4597a() {
        if (this.f8851d == null) {
            this.f8852e = this.f8850c;
            this.f8851d = m4605i();
        }
        return this.f8851d.f8863b;
    }

    /* renamed from: b */
    public final boolean m4598b(String str) {
        if (str.indexOf(this.f8848a) < 0) {
            return false;
        }
        m4611o();
        return true;
    }

    /* renamed from: c */
    public final boolean m4599c() {
        int i7 = this.f8848a;
        return i7 == 10 || i7 == 13;
    }

    /* renamed from: d */
    public final void m4600d(int i7, int i8, String str) {
        throw new C1799b(m4602f(), i7, i8, String.format("%s:%d: %s", str, Integer.valueOf(m4602f()), str));
    }

    /* renamed from: e */
    public final void m4601e() {
        int i7 = this.f8848a;
        int i8 = this.f8853f - 1;
        if (!m4599c()) {
            throw new C1799b();
        }
        m4603g();
        if (m4599c() && this.f8848a != i7) {
            m4603g();
        }
        int i9 = this.f8850c + 1;
        this.f8850c = i9;
        if (i9 < 2147483645) {
            return;
        }
        m4600d(i8, this.f8853f - 1, "chunk has too many lines");
        throw null;
    }

    /* renamed from: f */
    public final int m4602f() {
        return this.f8851d != null ? this.f8852e : this.f8850c;
    }

    /* renamed from: g */
    public final void m4603g() {
        try {
            this.f8848a = m4607k();
            this.f8853f++;
        } catch (IOException e7) {
            e7.printStackTrace();
            this.f8848a = -1;
        }
    }

    /* renamed from: h */
    public final C1977b m4604h() {
        return m4606j(EnumC1978c.f8927u2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:286:0x05cb, code lost:
    
        r2 = r20.f8853f - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x05cf, code lost:
    
        m4611o();
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x05d2, code lost:
    
        r7 = r20.f8848a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x05d4, code lost:
    
        if (r7 == r3) goto L391;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x05d6, code lost:
    
        if (r7 == (-1)) goto L392;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x05d8, code lost:
    
        if (r7 == 10) goto L393;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x05da, code lost:
    
        if (r7 == r6) goto L394;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x05de, code lost:
    
        if (r7 == 92) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x05e1, code lost:
    
        m4603g();
        r7 = r20.f8848a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x05e6, code lost:
    
        if (r7 == (-1)) goto L400;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x05e8, code lost:
    
        if (r7 == 10) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x05ea, code lost:
    
        if (r7 == r6) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x05ee, code lost:
    
        if (r7 == 102) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x05f2, code lost:
    
        if (r7 == 110) goto L331;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x05f6, code lost:
    
        if (r7 == 114) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x05fa, code lost:
    
        if (r7 == 116) goto L329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x05fe, code lost:
    
        if (r7 == 118) goto L328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x0602, code lost:
    
        if (r7 == 120) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x0604, code lost:
    
        if (r7 == 122) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x0606, code lost:
    
        if (r7 == 97) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x060a, code lost:
    
        if (r7 == 98) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x0610, code lost:
    
        if (androidx.activity.C0143v.m415M(r7) != false) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x0613, code lost:
    
        r7 = 0;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x0615, code lost:
    
        r7 = (r7 * 10) + (r20.f8848a - 48);
        m4603g();
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x0622, code lost:
    
        if (r8 >= 3) goto L405;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x062a, code lost:
    
        if (androidx.activity.C0143v.m415M(r20.f8848a) != false) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0632, code lost:
    
        if (r7 > 255) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0634, code lost:
    
        m4610n(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x06f1, code lost:
    
        r6 = 13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0638, code lost:
    
        m4600d(r2, r20.f8853f - 1, "escape sequence too large");
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0641, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0642, code lost:
    
        r6 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x06e1, code lost:
    
        m4610n(r6);
        m4603g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0646, code lost:
    
        r6 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x064d, code lost:
    
        m4603g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x0652, code lost:
    
        if (r20.f8848a > 32) goto L303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x0654, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x0657, code lost:
    
        if (r7 == false) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x065d, code lost:
    
        if (m4599c() == false) goto L408;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x065f, code lost:
    
        m4601e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0656, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x0667, code lost:
    
        r6 = r20.f8853f - 1;
        m4603g();
        r7 = r20.f8848a;
        m4603g();
        r8 = r20.f8848a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0679, code lost:
    
        if (androidx.activity.C0143v.m416N(r7) == false) goto L395;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x067f, code lost:
    
        if (androidx.activity.C0143v.m416N(r8) == false) goto L396;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x0683, code lost:
    
        if (r7 > 57) goto L316;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x0685, code lost:
    
        r7 = r7 - 48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x0693, code lost:
    
        r7 = r7 << 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x0697, code lost:
    
        if (r8 > 57) goto L322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x0699, code lost:
    
        r8 = r8 - 48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x06a7, code lost:
    
        r6 = r7 + r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x069c, code lost:
    
        if (r8 > 70) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x069e, code lost:
    
        r8 = (r8 + 10) - 65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x06a3, code lost:
    
        r8 = (r8 + 10) - 97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x0688, code lost:
    
        if (r7 > 70) goto L318;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x068a, code lost:
    
        r7 = (r7 + 10) - 65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x068f, code lost:
    
        r7 = (r7 + 10) - 97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x06aa, code lost:
    
        m4600d(r6, r20.f8853f - 1, "hexadecimal digit expected 'x" + ((char) r7) + ((char) r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x06c3, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x06c4, code lost:
    
        r6 = 11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x06ca, code lost:
    
        r6 = 9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x06d0, code lost:
    
        r6 = 13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x06d6, code lost:
    
        r6 = 10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x06dc, code lost:
    
        r6 = 12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x06e8, code lost:
    
        m4610n(10);
        m4601e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x06f9, code lost:
    
        m4600d(r2, r20.f8853f - 1, "unfinished string");
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x0702, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x0703, code lost:
    
        m4611o();
        r2 = r20.f8855h;
        r3 = r20.f8856i - 2;
        r5 = p133q5.C1803f.f8177w1;
        r5 = new byte[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x0710, code lost:
    
        if (r10 >= r3) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x0712, code lost:
    
        r6 = r10 + 1;
        r5[r10] = (byte) r2[r6];
        r10 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x0729, code lost:
    
        return new p164u5.C1977b(r20.f8850c, p133q5.C1803f.m4256C(r5, r3), r1, r20.f8853f - 1);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p164u5.C1977b m4605i() {
        /*
            Method dump skipped, instructions count: 1930
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p164u5.C1976a.m4605i():u5.b");
    }

    /* renamed from: j */
    public final C1977b m4606j(EnumC1978c enumC1978c) {
        C1977b m4605i = m4605i();
        if (m4605i.f8863b == enumC1978c) {
            return m4605i;
        }
        throw new C1799b(m4602f(), m4605i.f8868g, m4605i.f8869h, String.format("%s:%d: %s", this.f8849b, Integer.valueOf(m4602f()), String.format("syntax error near '%s'", m4605i.m4613a())));
    }

    /* renamed from: k */
    public final int m4607k() {
        Closeable closeable = this.f8854g;
        if (closeable instanceof BufferedReader) {
            return ((BufferedReader) closeable).read();
        }
        if (closeable instanceof InputStream) {
            return ((InputStream) closeable).read();
        }
        return 0;
    }

    /* renamed from: l */
    public final C1803f m4608l(int i7, boolean z6) {
        int i8 = this.f8853f - 1;
        m4611o();
        if (m4599c()) {
            m4601e();
        }
        boolean z7 = false;
        while (!z7) {
            int i9 = this.f8848a;
            if (i9 == -1) {
                m4600d(i8, this.f8853f - 1, z6 ? "unfinished long comment" : "unfinished string");
                throw null;
            }
            if (i9 == 10 || i9 == 13) {
                m4610n(10);
                m4601e();
                if (z6) {
                    this.f8856i = 0;
                }
            } else if (i9 != 91) {
                if (i9 != 93) {
                    if (z6) {
                        m4603g();
                    } else {
                        m4611o();
                    }
                } else if (m4612p() == i7) {
                    m4611o();
                    z7 = true;
                }
            } else if (m4612p() == i7) {
                m4611o();
                if (i7 == 0) {
                    m4600d(i8, this.f8853f - 1, "nesting of [[...]] is deprecated");
                    throw null;
                }
            } else {
                continue;
            }
        }
        if (z6) {
            return C1803f.m4255B("");
        }
        char[] cArr = this.f8855h;
        int i10 = i7 + 2;
        int i11 = this.f8856i - (i10 * 2);
        int i12 = C1803f.f8177w1;
        byte[] bArr = new byte[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            bArr[i13] = (byte) cArr[i13 + i10];
        }
        return C1803f.m4256C(bArr, i11);
    }

    /* renamed from: m */
    public final String m4609m() {
        int i7 = this.f8848a;
        if (!C0143v.m415M(i7)) {
            throw new C1799b();
        }
        m4611o();
        String str = (i7 == 48 && m4598b("Xx")) ? "Pp" : "Ee";
        while (true) {
            if (m4598b(str)) {
                m4598b("+-");
            }
            if (!C0143v.m416N(this.f8848a) && this.f8848a != 46) {
                return new String(this.f8855h, 0, this.f8856i);
            }
            m4611o();
        }
    }

    /* renamed from: n */
    public final void m4610n(int i7) {
        char[] cArr = this.f8855h;
        if (cArr == null || this.f8856i + 1 > cArr.length) {
            int i8 = (this.f8856i * 2) + 1;
            char[] cArr2 = new char[i8];
            if (cArr != null) {
                System.arraycopy(cArr, 0, cArr2, 0, Math.min(cArr.length, i8));
            }
            this.f8855h = cArr2;
        }
        char[] cArr3 = this.f8855h;
        int i9 = this.f8856i;
        this.f8856i = i9 + 1;
        cArr3[i9] = (char) i7;
    }

    /* renamed from: o */
    public final void m4611o() {
        m4610n(this.f8848a);
        m4603g();
    }

    /* renamed from: p */
    public final int m4612p() {
        int i7;
        int i8 = this.f8848a;
        int i9 = 0;
        if (!(i8 == 91 || i8 == 93)) {
            throw new C1799b();
        }
        m4611o();
        while (true) {
            i7 = this.f8848a;
            if (i7 != 61) {
                break;
            }
            m4611o();
            i9++;
        }
        return i7 == i8 ? i9 : (-i9) - 1;
    }

    public C1976a(ByteArrayInputStream byteArrayInputStream) {
        this.f8858k = new byte[][]{new byte[]{-64, -79}, new byte[]{-32, Byte.MIN_VALUE, -79}, new byte[]{-16, Byte.MIN_VALUE, Byte.MIN_VALUE, -79}, new byte[]{-8, Byte.MIN_VALUE, Byte.MIN_VALUE, Byte.MIN_VALUE, -79}, new byte[]{-4, Byte.MIN_VALUE, Byte.MIN_VALUE, Byte.MIN_VALUE, Byte.MIN_VALUE, -79}};
        this.f8854g = byteArrayInputStream;
        this.f8849b = "格式化程序异常：";
        this.f8850c = 1;
        this.f8856i = 0;
        int m4607k = m4607k();
        this.f8848a = m4607k;
        if (m4607k == 35) {
            while (!m4599c() && this.f8848a != -1) {
                m4603g();
            }
        }
    }
}
