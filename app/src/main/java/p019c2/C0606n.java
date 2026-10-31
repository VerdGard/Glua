package p019c2;

import java.io.Serializable;
import java.io.Writer;

/* renamed from: c2.n */
/* loaded from: classes.dex */
public final class C0606n extends Writer implements Serializable {

    /* renamed from: c */
    public final StringBuilder f3015c = new StringBuilder();

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(char c7) {
        this.f3015c.append(c7);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) {
        this.f3015c.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i7, int i8) {
        this.f3015c.append(charSequence, i7, i8);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(char c7) {
        this.f3015c.append(c7);
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
    }

    public final String toString() {
        return this.f3015c.toString();
    }

    @Override // java.io.Writer
    public final void write(String str) {
        if (str != null) {
            this.f3015c.append(str);
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i7, int i8) {
        if (cArr != null) {
            this.f3015c.append(cArr, i7, i8);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        this.f3015c.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i7, int i8) {
        this.f3015c.append(charSequence, i7, i8);
        return this;
    }
}
