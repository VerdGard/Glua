package p181x;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import p009b0.C0509m;
import p173w.C2042d;

/* renamed from: x.j */
/* loaded from: classes.dex */
public final class C2161j extends C2163l {
    /* renamed from: g */
    public static Font m5295g(FontFamily fontFamily, int i7) {
        FontStyle fontStyle = new FontStyle((i7 & 1) != 0 ? 700 : 400, (i7 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int m5296h = m5296h(fontStyle, font.getStyle());
        for (int i8 = 1; i8 < fontFamily.getSize(); i8++) {
            Font font2 = fontFamily.getFont(i8);
            int m5296h2 = m5296h(fontStyle, font2.getStyle());
            if (m5296h2 < m5296h) {
                font = font2;
                m5296h = m5296h2;
            }
        }
        return font;
    }

    /* renamed from: h */
    public static int m5296h(FontStyle fontStyle, FontStyle fontStyle2) {
        int weight;
        int weight2;
        int slant;
        int slant2;
        weight = fontStyle.getWeight();
        weight2 = fontStyle2.getWeight();
        int abs = Math.abs(weight - weight2) / 100;
        slant = fontStyle.getSlant();
        slant2 = fontStyle2.getSlant();
        return abs + (slant == slant2 ? 0 : 2);
    }

    @Override // p181x.C2163l
    /* renamed from: a */
    public final Typeface mo5284a(Context context, C2042d.c cVar, Resources resources, int i7) {
        try {
            FontFamily.Builder builder = null;
            for (C2042d.d dVar : cVar.f9312a) {
                try {
                    Font build = new Font.Builder(resources, dVar.f9318f).setWeight(dVar.f9314b).setSlant(dVar.f9315c ? 1 : 0).setTtcIndex(dVar.f9317e).setFontVariationSettings(dVar.f9316d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(m5295g(build2, i7).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // p181x.C2163l
    /* renamed from: b */
    public final Typeface mo5285b(Context context, C0509m[] c0509mArr, int i7) {
        int i8;
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            int length = c0509mArr.length;
            FontFamily.Builder builder = null;
            while (i8 < length) {
                C0509m c0509m = c0509mArr[i8];
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(c0509m.f2539a, "r", null);
                } catch (IOException unused) {
                }
                if (openFileDescriptor == null) {
                    i8 = openFileDescriptor == null ? i8 + 1 : 0;
                } else {
                    try {
                        Font build = new Font.Builder(openFileDescriptor).setWeight(c0509m.f2541c).setSlant(c0509m.f2542d ? 1 : 0).setTtcIndex(c0509m.f2540b).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                    } catch (Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                openFileDescriptor.close();
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(m5295g(build2, i7).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // p181x.C2163l
    /* renamed from: c */
    public final Typeface mo5297c(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // p181x.C2163l
    /* renamed from: d */
    public final Typeface mo5289d(Context context, Resources resources, int i7, String str, int i8) {
        try {
            Font build = new Font.Builder(resources, i7).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p181x.C2163l
    /* renamed from: f */
    public final C0509m mo5298f(int i7, C0509m[] c0509mArr) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
