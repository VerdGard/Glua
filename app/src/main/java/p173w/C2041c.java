package p173w;

import android.content.res.ColorStateList;
import android.graphics.Shader;

/* renamed from: w.c */
/* loaded from: classes.dex */
public final class C2041c {

    /* renamed from: a */
    public final Shader f9309a;

    /* renamed from: b */
    public final ColorStateList f9310b;

    /* renamed from: c */
    public int f9311c;

    public C2041c(Shader shader, ColorStateList colorStateList, int i7) {
        this.f9309a = shader;
        this.f9310b = colorStateList;
        this.f9311c = i7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0182, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r2.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p173w.C2041c m5058a(android.content.res.Resources r28, int r29, android.content.res.Resources.Theme r30) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p173w.C2041c.m5058a(android.content.res.Resources, int, android.content.res.Resources$Theme):w.c");
    }

    /* renamed from: b */
    public final boolean m5059b() {
        ColorStateList colorStateList;
        return this.f9309a == null && (colorStateList = this.f9310b) != null && colorStateList.isStateful();
    }
}
