package p175w1;

import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.util.Formatter;
import java.util.Locale;

/* renamed from: w1.w */
/* loaded from: classes.dex */
public abstract class AbstractC2114w extends PrintStream {

    /* renamed from: X */
    public final Formatter f9581X;

    /* renamed from: c */
    public CharBuffer f9582c;

    /* renamed from: e */
    public CharsetDecoder f9583e;

    /* renamed from: m */
    public ByteBuffer f9584m;

    /* renamed from: s */
    public final StringBuilder f9585s;

    /* renamed from: w1.w$a */
    public class a extends OutputStream {
        @Override // java.io.OutputStream
        public final void write(int i7) {
            throw new AssertionError();
        }
    }

    public AbstractC2114w() {
        super(new a());
        StringBuilder sb = new StringBuilder();
        this.f9585s = sb;
        this.f9581X = new Formatter(sb, (Locale) null);
    }

    /* renamed from: a */
    public final void m5161a(boolean z6) {
        StringBuilder sb = this.f9585s;
        int length = sb.length();
        int i7 = 0;
        while (i7 < length) {
            int indexOf = sb.indexOf("\n", i7);
            if (indexOf == -1) {
                break;
            }
            mo5162b(sb.substring(i7, indexOf));
            i7 = indexOf + 1;
        }
        if (!z6) {
            sb.delete(0, i7);
            return;
        }
        if (i7 < length || length == 0) {
            mo5162b(sb.substring(i7));
        }
        sb.setLength(0);
    }

    @Override // java.io.PrintStream, java.lang.Appendable
    public final synchronized PrintStream append(char c7) {
        print(c7);
        return this;
    }

    @Override // java.io.PrintStream, java.lang.Appendable
    public final synchronized PrintStream append(CharSequence charSequence) {
        this.f9585s.append(charSequence);
        m5161a(false);
        return this;
    }

    @Override // java.io.PrintStream, java.lang.Appendable
    public final synchronized PrintStream append(CharSequence charSequence, int i7, int i8) {
        this.f9585s.append(charSequence, i7, i8);
        m5161a(false);
        return this;
    }

    @Override // java.io.PrintStream, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(char c7) {
        append(c7);
        return this;
    }

    @Override // java.io.PrintStream, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        append(charSequence);
        return this;
    }

    @Override // java.io.PrintStream, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i7, int i8) {
        append(charSequence, i7, i8);
        return this;
    }

    /* renamed from: b */
    public abstract void mo5162b(String str);

    @Override // java.io.PrintStream
    public final boolean checkError() {
        return false;
    }

    @Override // java.io.PrintStream, java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.PrintStream, java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public final synchronized void flush() {
        m5161a(true);
    }

    @Override // java.io.PrintStream
    public final PrintStream format(String str, Object... objArr) {
        format(Locale.getDefault(), str, objArr);
        return this;
    }

    @Override // java.io.PrintStream
    public final synchronized PrintStream format(Locale locale, String str, Object... objArr) {
        if (str == null) {
            throw new NullPointerException("format");
        }
        this.f9581X.format(locale, str, objArr);
        m5161a(false);
        return this;
    }

    @Override // java.io.PrintStream
    public final synchronized void print(char c7) {
        this.f9585s.append(c7);
        if (c7 == '\n') {
            m5161a(false);
        }
    }

    @Override // java.io.PrintStream
    public final synchronized void print(double d7) {
        this.f9585s.append(d7);
    }

    @Override // java.io.PrintStream
    public final synchronized void print(float f7) {
        this.f9585s.append(f7);
    }

    @Override // java.io.PrintStream
    public final synchronized void print(int i7) {
        this.f9585s.append(i7);
    }

    @Override // java.io.PrintStream
    public final synchronized void print(long j7) {
        this.f9585s.append(j7);
    }

    @Override // java.io.PrintStream
    public final synchronized void print(Object obj) {
        this.f9585s.append(obj);
        m5161a(false);
    }

    @Override // java.io.PrintStream
    public final synchronized void print(String str) {
        this.f9585s.append(str);
        m5161a(false);
    }

    @Override // java.io.PrintStream
    public final synchronized void print(boolean z6) {
        this.f9585s.append(z6);
    }

    @Override // java.io.PrintStream
    public final synchronized void print(char[] cArr) {
        this.f9585s.append(cArr);
        m5161a(false);
    }

    @Override // java.io.PrintStream
    public final PrintStream printf(String str, Object... objArr) {
        format(str, objArr);
        return this;
    }

    @Override // java.io.PrintStream
    public final PrintStream printf(Locale locale, String str, Object... objArr) {
        format(locale, str, objArr);
        return this;
    }

    @Override // java.io.PrintStream
    public final synchronized void println() {
        m5161a(true);
    }

    @Override // java.io.PrintStream
    public final synchronized void println(char c7) {
        this.f9585s.append(c7);
        m5161a(true);
    }

    @Override // java.io.PrintStream
    public final synchronized void println(double d7) {
        this.f9585s.append(d7);
        m5161a(true);
    }

    @Override // java.io.PrintStream
    public final synchronized void println(float f7) {
        this.f9585s.append(f7);
        m5161a(true);
    }

    @Override // java.io.PrintStream
    public final synchronized void println(int i7) {
        this.f9585s.append(i7);
        m5161a(true);
    }

    @Override // java.io.PrintStream
    public final synchronized void println(long j7) {
        this.f9585s.append(j7);
        m5161a(true);
    }

    @Override // java.io.PrintStream
    public final synchronized void println(Object obj) {
        this.f9585s.append(obj);
        m5161a(true);
    }

    @Override // java.io.PrintStream
    public final synchronized void println(String str) {
        if (this.f9585s.length() == 0 && str != null) {
            int length = str.length();
            int i7 = 0;
            while (i7 < length) {
                int indexOf = str.indexOf(10, i7);
                if (indexOf == -1) {
                    break;
                }
                mo5162b(str.substring(i7, indexOf));
                i7 = indexOf + 1;
            }
            if (i7 < length) {
                mo5162b(str.substring(i7));
            }
        }
        this.f9585s.append(str);
        m5161a(true);
    }

    @Override // java.io.PrintStream
    public final synchronized void println(boolean z6) {
        this.f9585s.append(z6);
        m5161a(true);
    }

    @Override // java.io.PrintStream
    public final synchronized void println(char[] cArr) {
        this.f9585s.append(cArr);
        m5161a(true);
    }

    @Override // java.io.PrintStream
    public final void setError() {
    }

    @Override // java.io.PrintStream, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i7) {
        write(new byte[]{(byte) i7}, 0, 1);
    }

    @Override // java.io.PrintStream, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.PrintStream, java.io.FilterOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i7, int i8) {
        CoderResult decode;
        if (this.f9583e == null) {
            this.f9584m = ByteBuffer.allocate(80);
            this.f9582c = CharBuffer.allocate(80);
            this.f9583e = Charset.defaultCharset().newDecoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE);
        }
        int i9 = i8 + i7;
        while (i7 < i9) {
            int min = Math.min(this.f9584m.remaining(), i9 - i7);
            this.f9584m.put(bArr, i7, min);
            i7 += min;
            this.f9584m.flip();
            do {
                decode = this.f9583e.decode(this.f9584m, this.f9582c, false);
                this.f9582c.flip();
                this.f9585s.append((CharSequence) this.f9582c);
                this.f9582c.clear();
            } while (decode.isOverflow());
            this.f9584m.compact();
        }
        m5161a(false);
    }
}
