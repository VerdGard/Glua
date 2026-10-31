package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.emoji2.text.C0323g;

/* renamed from: androidx.emoji2.text.e */
/* loaded from: classes.dex */
public final class C0321e implements C0323g.d {

    /* renamed from: b */
    public static final ThreadLocal<StringBuilder> f1553b = new ThreadLocal<>();

    /* renamed from: a */
    public final TextPaint f1554a;

    public C0321e() {
        TextPaint textPaint = new TextPaint();
        this.f1554a = textPaint;
        textPaint.setTextSize(10.0f);
    }
}
