package p131q3;

import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.activity.result.AbstractC0136c;
import java.lang.ref.WeakReference;
import p163u3.C1973d;

/* renamed from: q3.p */
/* loaded from: classes.dex */
public final class C1760p {

    /* renamed from: c */
    public float f8114c;

    /* renamed from: e */
    public WeakReference<b> f8116e;

    /* renamed from: f */
    public C1973d f8117f;

    /* renamed from: a */
    public final TextPaint f8112a = new TextPaint(1);

    /* renamed from: b */
    public final a f8113b = new a();

    /* renamed from: d */
    public boolean f8115d = true;

    /* renamed from: q3.p$a */
    public class a extends AbstractC0136c {
        public a() {
        }

        @Override // androidx.activity.result.AbstractC0136c
        /* renamed from: u */
        public final void mo392u(int i7) {
            C1760p c1760p = C1760p.this;
            c1760p.f8115d = true;
            b bVar = c1760p.f8116e.get();
            if (bVar != null) {
                bVar.mo2395a();
            }
        }

        @Override // androidx.activity.result.AbstractC0136c
        /* renamed from: v */
        public final void mo393v(Typeface typeface, boolean z6) {
            if (z6) {
                return;
            }
            C1760p c1760p = C1760p.this;
            c1760p.f8115d = true;
            b bVar = c1760p.f8116e.get();
            if (bVar != null) {
                bVar.mo2395a();
            }
        }
    }

    /* renamed from: q3.p$b */
    public interface b {
        /* renamed from: a */
        void mo2395a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public C1760p(b bVar) {
        this.f8116e = new WeakReference<>(null);
        this.f8116e = new WeakReference<>(bVar);
    }

    /* renamed from: a */
    public final float m4231a(String str) {
        if (!this.f8115d) {
            return this.f8114c;
        }
        TextPaint textPaint = this.f8112a;
        this.f8114c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.f8115d = false;
        return this.f8114c;
    }
}
