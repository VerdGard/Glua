package p117o4;

import android.ext.C0090b;
import androidx.activity.result.AbstractC0136c;
import java.io.Closeable;
import java.io.Reader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import p054g4.C1235q;
import p078j4.C1416e;
import p120p.C1686g;

/* renamed from: o4.a */
/* loaded from: classes.dex */
public class C1667a implements Closeable {

    /* renamed from: A1 */
    public int[] f7519A1;

    /* renamed from: C1 */
    public String[] f7521C1;

    /* renamed from: D1 */
    public int[] f7522D1;

    /* renamed from: c */
    public final Reader f7526c;

    /* renamed from: x1 */
    public long f7531x1;

    /* renamed from: y1 */
    public int f7532y1;

    /* renamed from: z1 */
    public String f7533z1;

    /* renamed from: e */
    public boolean f7527e = false;

    /* renamed from: m */
    public final char[] f7528m = new char[1024];

    /* renamed from: s */
    public int f7529s = 0;

    /* renamed from: X */
    public int f7523X = 0;

    /* renamed from: Y */
    public int f7524Y = 0;

    /* renamed from: Z */
    public int f7525Z = 0;

    /* renamed from: w1 */
    public int f7530w1 = 0;

    /* renamed from: B1 */
    public int f7520B1 = 1;

    /* renamed from: o4.a$a */
    public class a extends AbstractC0136c {
        /* renamed from: y */
        public final void m4042y(C1667a c1667a) {
            int i7;
            if (c1667a instanceof C1416e) {
                C1416e c1416e = (C1416e) c1667a;
                c1416e.m3766F(5);
                Map.Entry entry = (Map.Entry) ((Iterator) c1416e.m3768H()).next();
                c1416e.m3770J(entry.getValue());
                c1416e.m3770J(new C1235q((String) entry.getKey()));
                return;
            }
            int i8 = c1667a.f7530w1;
            if (i8 == 0) {
                i8 = c1667a.m4032d();
            }
            if (i8 == 13) {
                i7 = 9;
            } else if (i8 == 12) {
                i7 = 8;
            } else {
                if (i8 != 14) {
                    throw new IllegalStateException("Expected a name but was " + C0090b.m224j(c1667a.mo3785x()) + c1667a.m4036m());
                }
                i7 = 10;
            }
            c1667a.f7530w1 = i7;
        }
    }

    static {
        AbstractC0136c.f250c = new a();
    }

    public C1667a(StringReader stringReader) {
        int[] iArr = new int[32];
        this.f7519A1 = iArr;
        iArr[0] = 6;
        this.f7521C1 = new String[32];
        this.f7522D1 = new int[32];
        this.f7526c = stringReader;
    }

    /* renamed from: A */
    public final void m4027A(char c7) {
        while (true) {
            int i7 = this.f7529s;
            int i8 = this.f7523X;
            while (true) {
                if (i7 < i8) {
                    int i9 = i7 + 1;
                    char c8 = this.f7528m[i7];
                    if (c8 == c7) {
                        this.f7529s = i9;
                        return;
                    }
                    if (c8 == '\\') {
                        this.f7529s = i9;
                        m4041z();
                        break;
                    } else {
                        if (c8 == '\n') {
                            this.f7524Y++;
                            this.f7525Z = i9;
                        }
                        i7 = i9;
                    }
                } else {
                    this.f7529s = i7;
                    if (!m4033g(1)) {
                        m4030E("Unterminated string");
                        throw null;
                    }
                }
            }
        }
    }

    /* renamed from: B */
    public final void m4028B() {
        char c7;
        do {
            if (this.f7529s >= this.f7523X && !m4033g(1)) {
                return;
            }
            int i7 = this.f7529s;
            int i8 = i7 + 1;
            this.f7529s = i8;
            c7 = this.f7528m[i7];
            if (c7 == '\n') {
                this.f7524Y++;
                this.f7525Z = i8;
                return;
            }
        } while (c7 != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        m4031c();
     */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4029C() {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.f7529s
            int r2 = r1 + r0
            int r3 = r4.f7523X
            if (r2 >= r3) goto L51
            char[] r2 = r4.f7528m
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.m4031c()
        L4b:
            int r1 = r4.f7529s
            int r1 = r1 + r0
            r4.f7529s = r1
            return
        L51:
            int r1 = r1 + r0
            r4.f7529s = r1
            r0 = 1
            boolean r0 = r4.m4033g(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p117o4.C1667a.m4029C():void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: D */
    public void mo3765D() {
        int i7 = 0;
        do {
            int i8 = this.f7530w1;
            if (i8 == 0) {
                i8 = m4032d();
            }
            switch (i8) {
                case 1:
                    m4040y(3);
                    i7++;
                    this.f7530w1 = 0;
                    break;
                case 2:
                    if (i7 == 0) {
                        this.f7521C1[this.f7520B1 - 1] = null;
                    }
                    this.f7520B1--;
                    i7--;
                    this.f7530w1 = 0;
                    break;
                case 3:
                    m4040y(1);
                    i7++;
                    this.f7530w1 = 0;
                    break;
                case 4:
                    this.f7520B1--;
                    i7--;
                    this.f7530w1 = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.f7530w1 = 0;
                    break;
                case 8:
                    m4027A('\'');
                    this.f7530w1 = 0;
                    break;
                case 9:
                    m4027A('\"');
                    this.f7530w1 = 0;
                    break;
                case 10:
                    m4029C();
                    this.f7530w1 = 0;
                    break;
                case 12:
                    m4027A('\'');
                    if (i7 == 0) {
                        this.f7521C1[this.f7520B1 - 1] = "<skipped>";
                    }
                    this.f7530w1 = 0;
                    break;
                case 13:
                    m4027A('\"');
                    if (i7 == 0) {
                        this.f7521C1[this.f7520B1 - 1] = "<skipped>";
                    }
                    this.f7530w1 = 0;
                    break;
                case 14:
                    m4029C();
                    if (i7 == 0) {
                        this.f7521C1[this.f7520B1 - 1] = "<skipped>";
                    }
                    this.f7530w1 = 0;
                    break;
                case 16:
                    this.f7529s += this.f7532y1;
                    this.f7530w1 = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i7 > 0);
        int[] iArr = this.f7522D1;
        int i9 = this.f7520B1 - 1;
        iArr[i9] = iArr[i9] + 1;
    }

    /* renamed from: E */
    public final void m4030E(String str) {
        StringBuilder m4107b = C1686g.m4107b(str);
        m4107b.append(m4036m());
        throw new C1669c(m4107b.toString());
    }

    /* renamed from: a */
    public void mo3771a() {
        int i7 = this.f7530w1;
        if (i7 == 0) {
            i7 = m4032d();
        }
        if (i7 == 3) {
            m4040y(1);
            this.f7522D1[this.f7520B1 - 1] = 0;
            this.f7530w1 = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + C0090b.m224j(mo3785x()) + m4036m());
        }
    }

    /* renamed from: b */
    public void mo3772b() {
        int i7 = this.f7530w1;
        if (i7 == 0) {
            i7 = m4032d();
        }
        if (i7 == 1) {
            m4040y(3);
            this.f7530w1 = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + C0090b.m224j(mo3785x()) + m4036m());
        }
    }

    /* renamed from: c */
    public final void m4031c() {
        if (this.f7527e) {
            return;
        }
        m4030E("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f7530w1 = 0;
        this.f7519A1[0] = 8;
        this.f7520B1 = 1;
        this.f7526c.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0211, code lost:
    
        if (m4035l(r5) != false) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0213, code lost:
    
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0214, code lost:
    
        if (r11 != 2) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0216, code lost:
    
        if (r13 == false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x021c, code lost:
    
        if (r7 != Long.MIN_VALUE) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x021e, code lost:
    
        if (r12 == false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0222, code lost:
    
        if (r7 != 0) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0224, code lost:
    
        if (r12 != false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0226, code lost:
    
        if (r12 == false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0229, code lost:
    
        r7 = -r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x022a, code lost:
    
        r19.f7531x1 = r7;
        r19.f7529s += r3;
        r8 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0245, code lost:
    
        r19.f7530w1 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0236, code lost:
    
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0237, code lost:
    
        if (r11 == r1) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x023a, code lost:
    
        if (r11 == 4) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x023d, code lost:
    
        if (r11 != 7) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x023f, code lost:
    
        r19.f7532y1 = r3;
        r8 = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0180 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x026f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00ed  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m4032d() {
        /*
            Method dump skipped, instructions count: 792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p117o4.C1667a.m4032d():int");
    }

    /* renamed from: e */
    public void mo3773e() {
        int i7 = this.f7530w1;
        if (i7 == 0) {
            i7 = m4032d();
        }
        if (i7 != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + C0090b.m224j(mo3785x()) + m4036m());
        }
        int i8 = this.f7520B1 - 1;
        this.f7520B1 = i8;
        int[] iArr = this.f7522D1;
        int i9 = i8 - 1;
        iArr[i9] = iArr[i9] + 1;
        this.f7530w1 = 0;
    }

    /* renamed from: f */
    public void mo3774f() {
        int i7 = this.f7530w1;
        if (i7 == 0) {
            i7 = m4032d();
        }
        if (i7 != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + C0090b.m224j(mo3785x()) + m4036m());
        }
        int i8 = this.f7520B1 - 1;
        this.f7520B1 = i8;
        this.f7521C1[i8] = null;
        int[] iArr = this.f7522D1;
        int i9 = i8 - 1;
        iArr[i9] = iArr[i9] + 1;
        this.f7530w1 = 0;
    }

    /* renamed from: g */
    public final boolean m4033g(int i7) {
        int i8;
        int i9;
        int i10 = this.f7525Z;
        int i11 = this.f7529s;
        this.f7525Z = i10 - i11;
        int i12 = this.f7523X;
        char[] cArr = this.f7528m;
        if (i12 != i11) {
            int i13 = i12 - i11;
            this.f7523X = i13;
            System.arraycopy(cArr, i11, cArr, 0, i13);
        } else {
            this.f7523X = 0;
        }
        this.f7529s = 0;
        do {
            int i14 = this.f7523X;
            int read = this.f7526c.read(cArr, i14, cArr.length - i14);
            if (read == -1) {
                return false;
            }
            i8 = this.f7523X + read;
            this.f7523X = i8;
            if (this.f7524Y == 0 && (i9 = this.f7525Z) == 0 && i8 > 0 && cArr[0] == 65279) {
                this.f7529s++;
                this.f7525Z = i9 + 1;
                i7++;
            }
        } while (i8 < i7);
        return true;
    }

    /* renamed from: h */
    public String mo3775h() {
        return m4034i(false);
    }

    /* renamed from: i */
    public final String m4034i(boolean z6) {
        StringBuilder sb = new StringBuilder("$");
        int i7 = 0;
        while (true) {
            int i8 = this.f7520B1;
            if (i7 >= i8) {
                return sb.toString();
            }
            int i9 = this.f7519A1[i7];
            if (i9 == 1 || i9 == 2) {
                int i10 = this.f7522D1[i7];
                if (z6 && i10 > 0 && i7 == i8 - 1) {
                    i10--;
                }
                sb.append('[');
                sb.append(i10);
                sb.append(']');
            } else if (i9 == 3 || i9 == 4 || i9 == 5) {
                sb.append('.');
                String str = this.f7521C1[i7];
                if (str != null) {
                    sb.append(str);
                }
            }
            i7++;
        }
    }

    /* renamed from: j */
    public String mo3776j() {
        return m4034i(true);
    }

    /* renamed from: k */
    public boolean mo3777k() {
        int i7 = this.f7530w1;
        if (i7 == 0) {
            i7 = m4032d();
        }
        return (i7 == 2 || i7 == 4 || i7 == 17) ? false : true;
    }

    /* renamed from: l */
    public final boolean m4035l(char c7) {
        if (c7 == '\t' || c7 == '\n' || c7 == '\f' || c7 == '\r' || c7 == ' ') {
            return false;
        }
        if (c7 != '#') {
            if (c7 == ',') {
                return false;
            }
            if (c7 != '/' && c7 != '=') {
                if (c7 == '{' || c7 == '}' || c7 == ':') {
                    return false;
                }
                if (c7 != ';') {
                    switch (c7) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m4031c();
        return false;
    }

    /* renamed from: m */
    public final String m4036m() {
        return " at line " + (this.f7524Y + 1) + " column " + ((this.f7529s - this.f7525Z) + 1) + " path " + mo3775h();
    }

    /* renamed from: n */
    public boolean mo3778n() {
        int i7 = this.f7530w1;
        if (i7 == 0) {
            i7 = m4032d();
        }
        if (i7 == 5) {
            this.f7530w1 = 0;
            int[] iArr = this.f7522D1;
            int i8 = this.f7520B1 - 1;
            iArr[i8] = iArr[i8] + 1;
            return true;
        }
        if (i7 != 6) {
            throw new IllegalStateException("Expected a boolean but was " + C0090b.m224j(mo3785x()) + m4036m());
        }
        this.f7530w1 = 0;
        int[] iArr2 = this.f7522D1;
        int i9 = this.f7520B1 - 1;
        iArr2[i9] = iArr2[i9] + 1;
        return false;
    }

    /* renamed from: o */
    public double mo3779o() {
        String m4038u;
        int i7 = this.f7530w1;
        if (i7 == 0) {
            i7 = m4032d();
        }
        if (i7 == 15) {
            this.f7530w1 = 0;
            int[] iArr = this.f7522D1;
            int i8 = this.f7520B1 - 1;
            iArr[i8] = iArr[i8] + 1;
            return this.f7531x1;
        }
        if (i7 == 16) {
            this.f7533z1 = new String(this.f7528m, this.f7529s, this.f7532y1);
            this.f7529s += this.f7532y1;
        } else {
            if (i7 == 8 || i7 == 9) {
                m4038u = m4038u(i7 == 8 ? '\'' : '\"');
            } else if (i7 == 10) {
                m4038u = m4039w();
            } else if (i7 != 11) {
                throw new IllegalStateException("Expected a double but was " + C0090b.m224j(mo3785x()) + m4036m());
            }
            this.f7533z1 = m4038u;
        }
        this.f7530w1 = 11;
        double parseDouble = Double.parseDouble(this.f7533z1);
        if (!this.f7527e && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new C1669c("JSON forbids NaN and infinities: " + parseDouble + m4036m());
        }
        this.f7533z1 = null;
        this.f7530w1 = 0;
        int[] iArr2 = this.f7522D1;
        int i9 = this.f7520B1 - 1;
        iArr2[i9] = iArr2[i9] + 1;
        return parseDouble;
    }

    /* renamed from: p */
    public int mo3780p() {
        String m4038u;
        int i7 = this.f7530w1;
        if (i7 == 0) {
            i7 = m4032d();
        }
        if (i7 == 15) {
            long j7 = this.f7531x1;
            int i8 = (int) j7;
            if (j7 != i8) {
                throw new NumberFormatException("Expected an int but was " + this.f7531x1 + m4036m());
            }
            this.f7530w1 = 0;
            int[] iArr = this.f7522D1;
            int i9 = this.f7520B1 - 1;
            iArr[i9] = iArr[i9] + 1;
            return i8;
        }
        if (i7 == 16) {
            this.f7533z1 = new String(this.f7528m, this.f7529s, this.f7532y1);
            this.f7529s += this.f7532y1;
        } else {
            if (i7 != 8 && i7 != 9 && i7 != 10) {
                throw new IllegalStateException("Expected an int but was " + C0090b.m224j(mo3785x()) + m4036m());
            }
            if (i7 == 10) {
                m4038u = m4039w();
            } else {
                m4038u = m4038u(i7 == 8 ? '\'' : '\"');
            }
            this.f7533z1 = m4038u;
            try {
                int parseInt = Integer.parseInt(this.f7533z1);
                this.f7530w1 = 0;
                int[] iArr2 = this.f7522D1;
                int i10 = this.f7520B1 - 1;
                iArr2[i10] = iArr2[i10] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f7530w1 = 11;
        double parseDouble = Double.parseDouble(this.f7533z1);
        int i11 = (int) parseDouble;
        if (i11 != parseDouble) {
            throw new NumberFormatException("Expected an int but was " + this.f7533z1 + m4036m());
        }
        this.f7533z1 = null;
        this.f7530w1 = 0;
        int[] iArr3 = this.f7522D1;
        int i12 = this.f7520B1 - 1;
        iArr3[i12] = iArr3[i12] + 1;
        return i11;
    }

    /* renamed from: q */
    public long mo3781q() {
        String m4038u;
        int i7 = this.f7530w1;
        if (i7 == 0) {
            i7 = m4032d();
        }
        if (i7 == 15) {
            this.f7530w1 = 0;
            int[] iArr = this.f7522D1;
            int i8 = this.f7520B1 - 1;
            iArr[i8] = iArr[i8] + 1;
            return this.f7531x1;
        }
        if (i7 == 16) {
            this.f7533z1 = new String(this.f7528m, this.f7529s, this.f7532y1);
            this.f7529s += this.f7532y1;
        } else {
            if (i7 != 8 && i7 != 9 && i7 != 10) {
                throw new IllegalStateException("Expected a long but was " + C0090b.m224j(mo3785x()) + m4036m());
            }
            if (i7 == 10) {
                m4038u = m4039w();
            } else {
                m4038u = m4038u(i7 == 8 ? '\'' : '\"');
            }
            this.f7533z1 = m4038u;
            try {
                long parseLong = Long.parseLong(this.f7533z1);
                this.f7530w1 = 0;
                int[] iArr2 = this.f7522D1;
                int i9 = this.f7520B1 - 1;
                iArr2[i9] = iArr2[i9] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.f7530w1 = 11;
        double parseDouble = Double.parseDouble(this.f7533z1);
        long j7 = (long) parseDouble;
        if (j7 != parseDouble) {
            throw new NumberFormatException("Expected a long but was " + this.f7533z1 + m4036m());
        }
        this.f7533z1 = null;
        this.f7530w1 = 0;
        int[] iArr3 = this.f7522D1;
        int i10 = this.f7520B1 - 1;
        iArr3[i10] = iArr3[i10] + 1;
        return j7;
    }

    /* renamed from: r */
    public String mo3782r() {
        char c7;
        String m4038u;
        int i7 = this.f7530w1;
        if (i7 == 0) {
            i7 = m4032d();
        }
        if (i7 == 14) {
            m4038u = m4039w();
        } else {
            if (i7 == 12) {
                c7 = '\'';
            } else {
                if (i7 != 13) {
                    throw new IllegalStateException("Expected a name but was " + C0090b.m224j(mo3785x()) + m4036m());
                }
                c7 = '\"';
            }
            m4038u = m4038u(c7);
        }
        this.f7530w1 = 0;
        this.f7521C1[this.f7520B1 - 1] = m4038u;
        return m4038u;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
    
        if (r0 != '/') goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        r9.f7529s = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
    
        if (r3 != r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
    
        r9.f7529s = r3 - 1;
        r1 = m4033g(2);
        r9.f7529s++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
    
        if (r1 != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0069, code lost:
    
        m4031c();
        r1 = r9.f7529s;
        r3 = r4[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0072, code lost:
    
        if (r3 == '*') goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
    
        r9.f7529s = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0080, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0086, code lost:
    
        if ((r9.f7529s + 2) <= r9.f7523X) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:
    
        if (m4033g(2) == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008f, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b9, code lost:
    
        if (r2 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c0, code lost:
    
        m4030E("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c6, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0091, code lost:
    
        r0 = r9.f7529s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0095, code lost:
    
        if (r4[r0] != '\n') goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0097, code lost:
    
        r9.f7524Y++;
        r9.f7525Z = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b0, code lost:
    
        r9.f7529s++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a1, code lost:
    
        if (r3 >= 2) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ae, code lost:
    
        if (r4[r9.f7529s + r3] == "*\/".charAt(r3)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b6, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0074, code lost:
    
        if (r3 == '/') goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0077, code lost:
    
        r9.f7529s = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0076, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00c7, code lost:
    
        r9.f7529s = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00cb, code lost:
    
        if (r0 != '#') goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00cd, code lost:
    
        m4031c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00d5, code lost:
    
        return r0;
     */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m4037s(boolean r10) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p117o4.C1667a.m4037s(boolean):int");
    }

    /* renamed from: t */
    public void mo3783t() {
        int i7 = this.f7530w1;
        if (i7 == 0) {
            i7 = m4032d();
        }
        if (i7 != 7) {
            throw new IllegalStateException("Expected null but was " + C0090b.m224j(mo3785x()) + m4036m());
        }
        this.f7530w1 = 0;
        int[] iArr = this.f7522D1;
        int i8 = this.f7520B1 - 1;
        iArr[i8] = iArr[i8] + 1;
    }

    public String toString() {
        return getClass().getSimpleName() + m4036m();
    }

    /* renamed from: u */
    public final String m4038u(char c7) {
        StringBuilder sb = null;
        while (true) {
            int i7 = this.f7529s;
            int i8 = this.f7523X;
            int i9 = i7;
            while (true) {
                char[] cArr = this.f7528m;
                if (i9 < i8) {
                    int i10 = i9 + 1;
                    char c8 = cArr[i9];
                    if (c8 == c7) {
                        this.f7529s = i10;
                        int i11 = (i10 - i7) - 1;
                        if (sb == null) {
                            return new String(cArr, i7, i11);
                        }
                        sb.append(cArr, i7, i11);
                        return sb.toString();
                    }
                    if (c8 == '\\') {
                        this.f7529s = i10;
                        int i12 = (i10 - i7) - 1;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max((i12 + 1) * 2, 16));
                        }
                        sb.append(cArr, i7, i12);
                        sb.append(m4041z());
                    } else {
                        if (c8 == '\n') {
                            this.f7524Y++;
                            this.f7525Z = i10;
                        }
                        i9 = i10;
                    }
                } else {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max((i9 - i7) * 2, 16));
                    }
                    sb.append(cArr, i7, i9 - i7);
                    this.f7529s = i9;
                    if (!m4033g(1)) {
                        m4030E("Unterminated string");
                        throw null;
                    }
                }
            }
        }
    }

    /* renamed from: v */
    public String mo3784v() {
        String str;
        char c7;
        int i7 = this.f7530w1;
        if (i7 == 0) {
            i7 = m4032d();
        }
        if (i7 == 10) {
            str = m4039w();
        } else {
            if (i7 == 8) {
                c7 = '\'';
            } else if (i7 == 9) {
                c7 = '\"';
            } else if (i7 == 11) {
                str = this.f7533z1;
                this.f7533z1 = null;
            } else if (i7 == 15) {
                str = Long.toString(this.f7531x1);
            } else {
                if (i7 != 16) {
                    throw new IllegalStateException("Expected a string but was " + C0090b.m224j(mo3785x()) + m4036m());
                }
                str = new String(this.f7528m, this.f7529s, this.f7532y1);
                this.f7529s += this.f7532y1;
            }
            str = m4038u(c7);
        }
        this.f7530w1 = 0;
        int[] iArr = this.f7522D1;
        int i8 = this.f7520B1 - 1;
        iArr[i8] = iArr[i8] + 1;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x004a, code lost:
    
        m4031c();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m4039w() {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = 0
        L3:
            int r3 = r7.f7529s
            int r4 = r3 + r2
            int r5 = r7.f7523X
            char[] r6 = r7.f7528m
            if (r4 >= r5) goto L4e
            int r3 = r3 + r2
            char r3 = r6[r3]
            r4 = 9
            if (r3 == r4) goto L5a
            r4 = 10
            if (r3 == r4) goto L5a
            r4 = 12
            if (r3 == r4) goto L5a
            r4 = 13
            if (r3 == r4) goto L5a
            r4 = 32
            if (r3 == r4) goto L5a
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5a
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5a
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5a
            r4 = 58
            if (r3 == r4) goto L5a
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5a;
                case 92: goto L4a;
                case 93: goto L5a;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r7.m4031c()
            goto L5a
        L4e:
            int r3 = r6.length
            if (r2 >= r3) goto L5c
            int r3 = r2 + 1
            boolean r3 = r7.m4033g(r3)
            if (r3 == 0) goto L5a
            goto L3
        L5a:
            r1 = r2
            goto L7a
        L5c:
            if (r0 != 0) goto L69
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L69:
            int r3 = r7.f7529s
            r0.append(r6, r3, r2)
            int r3 = r7.f7529s
            int r3 = r3 + r2
            r7.f7529s = r3
            r2 = 1
            boolean r2 = r7.m4033g(r2)
            if (r2 != 0) goto L2
        L7a:
            if (r0 != 0) goto L84
            java.lang.String r0 = new java.lang.String
            int r2 = r7.f7529s
            r0.<init>(r6, r2, r1)
            goto L8d
        L84:
            int r2 = r7.f7529s
            r0.append(r6, r2, r1)
            java.lang.String r0 = r0.toString()
        L8d:
            int r2 = r7.f7529s
            int r2 = r2 + r1
            r7.f7529s = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p117o4.C1667a.m4039w():java.lang.String");
    }

    /* renamed from: x */
    public int mo3785x() {
        int i7 = this.f7530w1;
        if (i7 == 0) {
            i7 = m4032d();
        }
        switch (i7) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: y */
    public final void m4040y(int i7) {
        int i8 = this.f7520B1;
        int[] iArr = this.f7519A1;
        if (i8 == iArr.length) {
            int i9 = i8 * 2;
            this.f7519A1 = Arrays.copyOf(iArr, i9);
            this.f7522D1 = Arrays.copyOf(this.f7522D1, i9);
            this.f7521C1 = (String[]) Arrays.copyOf(this.f7521C1, i9);
        }
        int[] iArr2 = this.f7519A1;
        int i10 = this.f7520B1;
        this.f7520B1 = i10 + 1;
        iArr2[i10] = i7;
    }

    /* renamed from: z */
    public final char m4041z() {
        int i7;
        int i8;
        if (this.f7529s == this.f7523X && !m4033g(1)) {
            m4030E("Unterminated escape sequence");
            throw null;
        }
        int i9 = this.f7529s;
        int i10 = i9 + 1;
        this.f7529s = i10;
        char[] cArr = this.f7528m;
        char c7 = cArr[i9];
        if (c7 == '\n') {
            this.f7524Y++;
            this.f7525Z = i10;
        } else if (c7 != '\"' && c7 != '\'' && c7 != '/' && c7 != '\\') {
            if (c7 == 'b') {
                return '\b';
            }
            if (c7 == 'f') {
                return '\f';
            }
            if (c7 == 'n') {
                return '\n';
            }
            if (c7 == 'r') {
                return '\r';
            }
            if (c7 == 't') {
                return '\t';
            }
            if (c7 != 'u') {
                m4030E("Invalid escape sequence");
                throw null;
            }
            if (i10 + 4 > this.f7523X && !m4033g(4)) {
                m4030E("Unterminated escape sequence");
                throw null;
            }
            int i11 = this.f7529s;
            int i12 = i11 + 4;
            char c8 = 0;
            while (i11 < i12) {
                char c9 = cArr[i11];
                char c10 = (char) (c8 << 4);
                if (c9 < '0' || c9 > '9') {
                    if (c9 >= 'a' && c9 <= 'f') {
                        i7 = c9 - 'a';
                    } else {
                        if (c9 < 'A' || c9 > 'F') {
                            throw new NumberFormatException("\\u".concat(new String(cArr, this.f7529s, 4)));
                        }
                        i7 = c9 - 'A';
                    }
                    i8 = i7 + 10;
                } else {
                    i8 = c9 - '0';
                }
                c8 = (char) (i8 + c10);
                i11++;
            }
            this.f7529s += 4;
            return c8;
        }
        return c7;
    }
}
