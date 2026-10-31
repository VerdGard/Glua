package p181x;

import android.graphics.Paint;
import android.graphics.Rect;
import p026d0.C0875c;

/* renamed from: x.c */
/* loaded from: classes.dex */
public final class C2154c {

    /* renamed from: a */
    public static final ThreadLocal<C0875c<Rect, Rect>> f9768a = new ThreadLocal<>();

    /* renamed from: x.c$a */
    public static class a {
        /* renamed from: a */
        public static boolean m5272a(Paint paint, String str) {
            boolean hasGlyph;
            hasGlyph = paint.hasGlyph(str);
            return hasGlyph;
        }
    }
}
