package p117o4;

import android.ext.Tools;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* renamed from: o4.b */
/* loaded from: classes.dex */
public class C1668b implements Closeable, Flushable {

    /* renamed from: w1 */
    public static final Pattern f7534w1 = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* renamed from: x1 */
    public static final String[] f7535x1 = new String[Tools.Semaphore.f159S7];

    /* renamed from: X */
    public boolean f7536X;

    /* renamed from: Y */
    public String f7537Y;

    /* renamed from: Z */
    public final boolean f7538Z;

    /* renamed from: c */
    public final Writer f7539c;

    /* renamed from: e */
    public int[] f7540e;

    /* renamed from: m */
    public int f7541m;

    /* renamed from: s */
    public final String f7542s;

    static {
        for (int i7 = 0; i7 <= 31; i7++) {
            f7535x1[i7] = String.format("\\u%04x", Integer.valueOf(i7));
        }
        String[] strArr = f7535x1;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C1668b(Writer writer) {
        int[] iArr = new int[32];
        this.f7540e = iArr;
        this.f7541m = 0;
        if (iArr.length == 0) {
            this.f7540e = Arrays.copyOf(iArr, 0 * 2);
        }
        int[] iArr2 = this.f7540e;
        int i7 = this.f7541m;
        this.f7541m = i7 + 1;
        iArr2[i7] = 6;
        this.f7542s = ":";
        this.f7538Z = true;
        Objects.requireNonNull(writer, "out == null");
        this.f7539c = writer;
    }

    /* renamed from: a */
    public final void m4043a() {
        int m4051i = m4051i();
        int i7 = 2;
        if (m4051i != 1) {
            Writer writer = this.f7539c;
            if (m4051i == 2) {
                writer.append(',');
                return;
            }
            if (m4051i == 4) {
                writer.append((CharSequence) this.f7542s);
                m4052j(5);
                return;
            }
            i7 = 7;
            if (m4051i != 6) {
                if (m4051i != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f7536X) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
        }
        m4052j(i7);
    }

    /* renamed from: b */
    public void m4044b() {
        m4057o();
        m4043a();
        int i7 = this.f7541m;
        int[] iArr = this.f7540e;
        if (i7 == iArr.length) {
            this.f7540e = Arrays.copyOf(iArr, i7 * 2);
        }
        int[] iArr2 = this.f7540e;
        int i8 = this.f7541m;
        this.f7541m = i8 + 1;
        iArr2[i8] = 1;
        this.f7539c.write(91);
    }

    /* renamed from: c */
    public void m4045c() {
        m4057o();
        m4043a();
        int i7 = this.f7541m;
        int[] iArr = this.f7540e;
        if (i7 == iArr.length) {
            this.f7540e = Arrays.copyOf(iArr, i7 * 2);
        }
        int[] iArr2 = this.f7540e;
        int i8 = this.f7541m;
        this.f7541m = i8 + 1;
        iArr2[i8] = 3;
        this.f7539c.write(123);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f7539c.close();
        int i7 = this.f7541m;
        if (i7 > 1 || (i7 == 1 && this.f7540e[i7 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f7541m = 0;
    }

    /* renamed from: d */
    public final void m4046d(int i7, int i8, char c7) {
        int m4051i = m4051i();
        if (m4051i != i8 && m4051i != i7) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f7537Y == null) {
            this.f7541m--;
            this.f7539c.write(c7);
        } else {
            throw new IllegalStateException("Dangling name: " + this.f7537Y);
        }
    }

    /* renamed from: e */
    public void m4047e() {
        m4046d(1, 2, ']');
    }

    /* renamed from: f */
    public void m4048f() {
        m4046d(3, 5, '}');
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.f7541m == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f7539c.flush();
    }

    /* renamed from: g */
    public void m4049g(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f7537Y != null) {
            throw new IllegalStateException();
        }
        if (this.f7541m == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f7537Y = str;
    }

    /* renamed from: h */
    public C1668b m4050h() {
        if (this.f7537Y != null) {
            if (!this.f7538Z) {
                this.f7537Y = null;
                return this;
            }
            m4057o();
        }
        m4043a();
        this.f7539c.write("null");
        return this;
    }

    /* renamed from: i */
    public final int m4051i() {
        int i7 = this.f7541m;
        if (i7 != 0) {
            return this.f7540e[i7 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: j */
    public final void m4052j(int i7) {
        this.f7540e[this.f7541m - 1] = i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4053k(java.lang.String r8) {
        /*
            r7 = this;
            java.io.Writer r0 = r7.f7539c
            r1 = 34
            r0.write(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = 0
        Ld:
            if (r3 >= r2) goto L3a
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r6) goto L1e
            java.lang.String[] r6 = p117o4.C1668b.f7535x1
            r5 = r6[r5]
            if (r5 != 0) goto L2b
            goto L37
        L1e:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L25
            java.lang.String r5 = "\\u2028"
            goto L2b
        L25:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L37
            java.lang.String r5 = "\\u2029"
        L2b:
            if (r4 >= r3) goto L32
            int r6 = r3 - r4
            r0.write(r8, r4, r6)
        L32:
            r0.write(r5)
            int r4 = r3 + 1
        L37:
            int r3 = r3 + 1
            goto Ld
        L3a:
            if (r4 >= r2) goto L40
            int r2 = r2 - r4
            r0.write(r8, r4, r2)
        L40:
            r0.write(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p117o4.C1668b.m4053k(java.lang.String):void");
    }

    /* renamed from: l */
    public void m4054l(Number number) {
        if (number == null) {
            m4050h();
            return;
        }
        m4057o();
        String obj = number.toString();
        if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (!(cls == Integer.class || cls == Long.class || cls == Double.class || cls == Float.class || cls == Byte.class || cls == Short.class || cls == BigDecimal.class || cls == BigInteger.class || cls == AtomicInteger.class || cls == AtomicLong.class) && !f7534w1.matcher(obj).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + obj);
            }
        } else if (!this.f7536X) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(obj));
        }
        m4043a();
        this.f7539c.append((CharSequence) obj);
    }

    /* renamed from: m */
    public void m4055m(String str) {
        if (str == null) {
            m4050h();
            return;
        }
        m4057o();
        m4043a();
        m4053k(str);
    }

    /* renamed from: n */
    public void m4056n(boolean z6) {
        m4057o();
        m4043a();
        this.f7539c.write(z6 ? "true" : "false");
    }

    /* renamed from: o */
    public final void m4057o() {
        if (this.f7537Y != null) {
            int m4051i = m4051i();
            if (m4051i == 5) {
                this.f7539c.write(44);
            } else if (m4051i != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            m4052j(4);
            m4053k(this.f7537Y);
            this.f7537Y = null;
        }
    }
}
