package p173w;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Base64;
import android.util.Xml;
import androidx.core.R$styleable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;
import p009b0.C0502f;

/* renamed from: w.d */
/* loaded from: classes.dex */
public final class C2042d {

    /* renamed from: w.d$a */
    public static class a {
        /* renamed from: a */
        public static int m5063a(TypedArray typedArray, int i7) {
            return typedArray.getType(i7);
        }
    }

    /* renamed from: w.d$b */
    public interface b {
    }

    /* renamed from: w.d$c */
    public static final class c implements b {

        /* renamed from: a */
        public final d[] f9312a;

        public c(d[] dVarArr) {
            this.f9312a = dVarArr;
        }
    }

    /* renamed from: w.d$d */
    public static final class d {

        /* renamed from: a */
        public final String f9313a;

        /* renamed from: b */
        public final int f9314b;

        /* renamed from: c */
        public final boolean f9315c;

        /* renamed from: d */
        public final String f9316d;

        /* renamed from: e */
        public final int f9317e;

        /* renamed from: f */
        public final int f9318f;

        public d(int i7, int i8, int i9, String str, String str2, boolean z6) {
            this.f9313a = str;
            this.f9314b = i7;
            this.f9315c = z6;
            this.f9316d = str2;
            this.f9317e = i8;
            this.f9318f = i9;
        }
    }

    /* renamed from: w.d$e */
    public static final class e implements b {

        /* renamed from: a */
        public final C0502f f9319a;

        /* renamed from: b */
        public final int f9320b;

        /* renamed from: c */
        public final int f9321c;

        /* renamed from: d */
        public final String f9322d;

        public e(C0502f c0502f, int i7, int i8, String str) {
            this.f9319a = c0502f;
            this.f9321c = i7;
            this.f9320b = i8;
            this.f9322d = str;
        }
    }

    /* renamed from: a */
    public static b m5060a(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            m5062c(xmlResourceParser);
            return null;
        }
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.f1439b);
        String string = obtainAttributes.getString(R$styleable.FontFamily_fontProviderAuthority);
        String string2 = obtainAttributes.getString(R$styleable.FontFamily_fontProviderPackage);
        String string3 = obtainAttributes.getString(R$styleable.FontFamily_fontProviderQuery);
        int resourceId = obtainAttributes.getResourceId(R$styleable.FontFamily_fontProviderCerts, 0);
        int integer = obtainAttributes.getInteger(R$styleable.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = obtainAttributes.getInteger(R$styleable.FontFamily_fontProviderFetchTimeout, 500);
        String string4 = obtainAttributes.getString(R$styleable.FontFamily_fontProviderSystemFontFamily);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlResourceParser.next() != 3) {
                m5062c(xmlResourceParser);
            }
            return new e(new C0502f(string, string2, string3, m5061b(resourceId, resources)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlResourceParser.next() != 3) {
            if (xmlResourceParser.getEventType() == 2) {
                if (xmlResourceParser.getName().equals("font")) {
                    TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.f1440c);
                    int i7 = R$styleable.FontFamilyFont_fontWeight;
                    if (!obtainAttributes2.hasValue(i7)) {
                        i7 = R$styleable.FontFamilyFont_android_fontWeight;
                    }
                    int i8 = obtainAttributes2.getInt(i7, 400);
                    int i9 = R$styleable.FontFamilyFont_fontStyle;
                    if (!obtainAttributes2.hasValue(i9)) {
                        i9 = R$styleable.FontFamilyFont_android_fontStyle;
                    }
                    boolean z6 = 1 == obtainAttributes2.getInt(i9, 0);
                    int i10 = R$styleable.FontFamilyFont_ttcIndex;
                    if (!obtainAttributes2.hasValue(i10)) {
                        i10 = R$styleable.FontFamilyFont_android_ttcIndex;
                    }
                    int i11 = R$styleable.FontFamilyFont_fontVariationSettings;
                    if (!obtainAttributes2.hasValue(i11)) {
                        i11 = R$styleable.FontFamilyFont_android_fontVariationSettings;
                    }
                    String string5 = obtainAttributes2.getString(i11);
                    int i12 = obtainAttributes2.getInt(i10, 0);
                    int i13 = R$styleable.FontFamilyFont_font;
                    if (!obtainAttributes2.hasValue(i13)) {
                        i13 = R$styleable.FontFamilyFont_android_font;
                    }
                    int resourceId2 = obtainAttributes2.getResourceId(i13, 0);
                    String string6 = obtainAttributes2.getString(i13);
                    obtainAttributes2.recycle();
                    while (xmlResourceParser.next() != 3) {
                        m5062c(xmlResourceParser);
                    }
                    arrayList.add(new d(i8, i12, resourceId2, string6, string5, z6));
                } else {
                    m5062c(xmlResourceParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new c((d[]) arrayList.toArray(new d[0]));
    }

    /* renamed from: b */
    public static List m5061b(int i7, Resources resources) {
        if (i7 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i7);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a.m5063a(obtainTypedArray, 0) == 1) {
                for (int i8 = 0; i8 < obtainTypedArray.length(); i8++) {
                    int resourceId = obtainTypedArray.getResourceId(i8, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i7);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: c */
    public static void m5062c(XmlResourceParser xmlResourceParser) {
        int i7 = 1;
        while (i7 > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i7++;
            } else if (next == 3) {
                i7--;
            }
        }
    }
}
