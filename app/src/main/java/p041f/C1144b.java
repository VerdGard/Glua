package p041f;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: f.b */
/* loaded from: classes.dex */
public final class C1144b {
    /* renamed from: a */
    public static Drawable m3328a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        return Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
    }

    /* renamed from: b */
    public static int m3329b(TypedArray typedArray) {
        return typedArray.getChangingConfigurations();
    }

    /* renamed from: c */
    public static void m3330c(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        drawable.inflate(resources, xmlPullParser, attributeSet, theme);
    }
}
