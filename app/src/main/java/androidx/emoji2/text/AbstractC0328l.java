package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import p106n0.C1633a;

/* renamed from: androidx.emoji2.text.l */
/* loaded from: classes.dex */
public abstract class AbstractC0328l extends ReplacementSpan {

    /* renamed from: e */
    public final C0326j f1596e;

    /* renamed from: c */
    public final Paint.FontMetricsInt f1595c = new Paint.FontMetricsInt();

    /* renamed from: m */
    public float f1597m = 1.0f;

    public AbstractC0328l(C0326j c0326j) {
        if (c0326j == null) {
            throw new NullPointerException("metadata cannot be null");
        }
        this.f1596e = c0326j;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i7, int i8, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f1595c;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        C0326j c0326j = this.f1596e;
        this.f1597m = abs / (c0326j.m1112c().m4005a(14) != 0 ? r8.f7462b.getShort(r1 + r8.f7461a) : (short) 0);
        C1633a m1112c = c0326j.m1112c();
        int m4005a = m1112c.m4005a(14);
        if (m4005a != 0) {
            m1112c.f7462b.getShort(m4005a + m1112c.f7461a);
        }
        short s7 = (short) ((c0326j.m1112c().m4005a(12) != 0 ? r5.f7462b.getShort(r7 + r5.f7461a) : (short) 0) * this.f1597m);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s7;
    }
}
