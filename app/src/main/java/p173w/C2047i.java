package p173w;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: w.i */
/* loaded from: classes.dex */
public final class C2047i {
    /* renamed from: a */
    public static C2041c m5075a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i7) {
        C2041c c2041c;
        if (m5079e(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i7, typedValue);
            int i8 = typedValue.type;
            if (i8 >= 28 && i8 <= 31) {
                return new C2041c(null, null, typedValue.data);
            }
            try {
                c2041c = C2041c.m5058a(typedArray.getResources(), typedArray.getResourceId(i7, 0), theme);
            } catch (Exception e7) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e7);
                c2041c = null;
            }
            if (c2041c != null) {
                return c2041c;
            }
        }
        return new C2041c(null, null, 0);
    }

    /* renamed from: b */
    public static float m5076b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i7, float f7) {
        return !m5079e(xmlPullParser, str) ? f7 : typedArray.getFloat(i7, f7);
    }

    /* renamed from: c */
    public static int m5077c(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i7, int i8) {
        return !m5079e(xmlPullParser, str) ? i8 : typedArray.getInt(i7, i8);
    }

    /* renamed from: d */
    public static String m5078d(TypedArray typedArray, XmlResourceParser xmlResourceParser, String str, int i7) {
        if (m5079e(xmlResourceParser, str)) {
            return typedArray.getString(i7);
        }
        return null;
    }

    /* renamed from: e */
    public static boolean m5079e(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* renamed from: f */
    public static TypedArray m5080f(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
