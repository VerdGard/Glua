package p131q3;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.reflect.Constructor;

/* renamed from: q3.o */
/* loaded from: classes.dex */
public final class C1759o {

    /* renamed from: m */
    public static final int f8096m;

    /* renamed from: n */
    public static boolean f8097n;

    /* renamed from: o */
    public static Constructor<StaticLayout> f8098o;

    /* renamed from: p */
    public static TextDirectionHeuristic f8099p;

    /* renamed from: a */
    public CharSequence f8100a;

    /* renamed from: b */
    public final TextPaint f8101b;

    /* renamed from: c */
    public final int f8102c;

    /* renamed from: d */
    public int f8103d;

    /* renamed from: k */
    public boolean f8110k;

    /* renamed from: e */
    public Layout.Alignment f8104e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f */
    public int f8105f = Integer.MAX_VALUE;

    /* renamed from: g */
    public float f8106g = 0.0f;

    /* renamed from: h */
    public float f8107h = 1.0f;

    /* renamed from: i */
    public int f8108i = f8096m;

    /* renamed from: j */
    public boolean f8109j = true;

    /* renamed from: l */
    public TextUtils.TruncateAt f8111l = null;

    /* renamed from: q3.o$a */
    public static class a extends Exception {
        public a(Exception exc) {
            super("Error thrown initializing StaticLayout " + exc.getMessage(), exc);
        }
    }

    static {
        f8096m = Build.VERSION.SDK_INT >= 23 ? 1 : 0;
    }

    public C1759o(CharSequence charSequence, TextPaint textPaint, int i7) {
        this.f8100a = charSequence;
        this.f8101b = textPaint;
        this.f8102c = i7;
        this.f8103d = charSequence.length();
    }

    /* renamed from: a */
    public final StaticLayout m4230a() {
        StaticLayout.Builder obtain;
        StaticLayout build;
        if (this.f8100a == null) {
            this.f8100a = "";
        }
        int max = Math.max(0, this.f8102c);
        CharSequence charSequence = this.f8100a;
        int i7 = this.f8105f;
        TextPaint textPaint = this.f8101b;
        if (i7 == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.f8111l);
        }
        int min = Math.min(charSequence.length(), this.f8103d);
        this.f8103d = min;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 < 23) {
            if (!f8097n) {
                try {
                    f8099p = this.f8110k && i8 >= 23 ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
                    Class cls = Integer.TYPE;
                    Class cls2 = Float.TYPE;
                    Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
                    f8098o = declaredConstructor;
                    declaredConstructor.setAccessible(true);
                    f8097n = true;
                } catch (Exception e7) {
                    throw new a(e7);
                }
            }
            try {
                Constructor<StaticLayout> constructor = f8098o;
                constructor.getClass();
                TextDirectionHeuristic textDirectionHeuristic = f8099p;
                textDirectionHeuristic.getClass();
                return constructor.newInstance(charSequence, 0, Integer.valueOf(this.f8103d), textPaint, Integer.valueOf(max), this.f8104e, textDirectionHeuristic, Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.f8109j), null, Integer.valueOf(max), Integer.valueOf(this.f8105f));
            } catch (Exception e8) {
                throw new a(e8);
            }
        }
        if (this.f8110k && this.f8105f == 1) {
            this.f8104e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.f8104e);
        obtain.setIncludePad(this.f8109j);
        obtain.setTextDirection(this.f8110k ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f8111l;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f8105f);
        float f7 = this.f8106g;
        if (f7 != 0.0f || this.f8107h != 1.0f) {
            obtain.setLineSpacing(f7, this.f8107h);
        }
        if (this.f8105f > 1) {
            obtain.setHyphenationFrequency(this.f8108i);
        }
        build = obtain.build();
        return build;
    }
}
