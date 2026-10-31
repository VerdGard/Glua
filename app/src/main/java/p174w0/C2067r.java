package p174w0;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import java.util.WeakHashMap;
import p034e0.C0923h0;
import p034e0.C0946x;

/* renamed from: w0.r */
/* loaded from: classes.dex */
public final class C2067r {

    /* renamed from: a */
    public static final C2069t f9436a;

    /* renamed from: b */
    public static final a f9437b;

    /* renamed from: w0.r$a */
    public static class a extends Property<View, Float> {
        public a() {
            super(Float.class, "translationAlpha");
        }

        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(C2067r.f9436a.mo5127W(view));
        }

        @Override // android.util.Property
        public final void set(View view, Float f7) {
            float floatValue = f7.floatValue();
            C2067r.f9436a.mo5128X(view, floatValue);
        }
    }

    /* renamed from: w0.r$b */
    public static class b extends Property<View, Rect> {
        public b() {
            super(Rect.class, "clipBounds");
        }

        @Override // android.util.Property
        public final Rect get(View view) {
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            return C0946x.f.m2855a(view);
        }

        @Override // android.util.Property
        public final void set(View view, Rect rect) {
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            C0946x.f.m2857c(view, rect);
        }
    }

    static {
        int i7 = Build.VERSION.SDK_INT;
        f9436a = i7 >= 29 ? new C2072w() : i7 >= 23 ? new C2071v() : i7 >= 22 ? new C2070u() : new C2069t();
        f9437b = new a();
        new b();
    }

    /* renamed from: a */
    public static void m5126a(View view, int i7, int i8, int i9, int i10) {
        f9436a.mo102P(view, i7, i8, i9, i10);
    }
}
