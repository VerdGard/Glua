package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: androidx.appcompat.widget.h0 */
/* loaded from: classes.dex */
public final class C0232h0 {

    /* renamed from: l */
    public static final RectF f901l = new RectF();

    /* renamed from: m */
    @SuppressLint({"BanConcurrentHashMap"})
    public static final ConcurrentHashMap<String, Method> f902m = new ConcurrentHashMap<>();

    /* renamed from: a */
    public int f903a = 0;

    /* renamed from: b */
    public boolean f904b = false;

    /* renamed from: c */
    public float f905c = -1.0f;

    /* renamed from: d */
    public float f906d = -1.0f;

    /* renamed from: e */
    public float f907e = -1.0f;

    /* renamed from: f */
    public int[] f908f = new int[0];

    /* renamed from: g */
    public boolean f909g = false;

    /* renamed from: h */
    public TextPaint f910h;

    /* renamed from: i */
    public final TextView f911i;

    /* renamed from: j */
    public final Context f912j;

    /* renamed from: k */
    public final f f913k;

    /* renamed from: androidx.appcompat.widget.h0$a */
    public static final class a {
        /* renamed from: a */
        public static StaticLayout m784a(CharSequence charSequence, Layout.Alignment alignment, int i7, TextView textView, TextPaint textPaint) {
            return new StaticLayout(charSequence, textPaint, i7, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
        }

        /* renamed from: b */
        public static int m785b(TextView textView) {
            return textView.getMaxLines();
        }
    }

    /* renamed from: androidx.appcompat.widget.h0$b */
    public static final class b {
        /* renamed from: a */
        public static boolean m786a(View view) {
            return view.isInLayout();
        }
    }

    /* renamed from: androidx.appcompat.widget.h0$c */
    public static final class c {
        /* renamed from: a */
        public static StaticLayout m787a(CharSequence charSequence, Layout.Alignment alignment, int i7, int i8, TextView textView, TextPaint textPaint, f fVar) {
            StaticLayout.Builder obtain;
            StaticLayout.Builder alignment2;
            StaticLayout.Builder lineSpacing;
            StaticLayout.Builder includePad;
            int breakStrategy;
            StaticLayout.Builder breakStrategy2;
            int hyphenationFrequency;
            StaticLayout.Builder hyphenationFrequency2;
            StaticLayout build;
            obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i7);
            alignment2 = obtain.setAlignment(alignment);
            lineSpacing = alignment2.setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier());
            includePad = lineSpacing.setIncludePad(textView.getIncludeFontPadding());
            breakStrategy = textView.getBreakStrategy();
            breakStrategy2 = includePad.setBreakStrategy(breakStrategy);
            hyphenationFrequency = textView.getHyphenationFrequency();
            hyphenationFrequency2 = breakStrategy2.setHyphenationFrequency(hyphenationFrequency);
            if (i8 == -1) {
                i8 = Integer.MAX_VALUE;
            }
            hyphenationFrequency2.setMaxLines(i8);
            try {
                fVar.mo788a(obtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            build = obtain.build();
            return build;
        }
    }

    /* renamed from: androidx.appcompat.widget.h0$d */
    public static class d extends f {
        @Override // androidx.appcompat.widget.C0232h0.f
        /* renamed from: a */
        public void mo788a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) C0232h0.m776e(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* renamed from: androidx.appcompat.widget.h0$e */
    public static class e extends d {
        @Override // androidx.appcompat.widget.C0232h0.d, androidx.appcompat.widget.C0232h0.f
        /* renamed from: a */
        public void mo788a(StaticLayout.Builder builder, TextView textView) {
            TextDirectionHeuristic textDirectionHeuristic;
            textDirectionHeuristic = textView.getTextDirectionHeuristic();
            builder.setTextDirection(textDirectionHeuristic);
        }

        @Override // androidx.appcompat.widget.C0232h0.f
        /* renamed from: b */
        public boolean mo789b(TextView textView) {
            boolean isHorizontallyScrollable;
            isHorizontallyScrollable = textView.isHorizontallyScrollable();
            return isHorizontallyScrollable;
        }
    }

    /* renamed from: androidx.appcompat.widget.h0$f */
    public static class f {
        /* renamed from: a */
        public void mo788a(StaticLayout.Builder builder, TextView textView) {
        }

        /* renamed from: b */
        public boolean mo789b(TextView textView) {
            return ((Boolean) C0232h0.m776e(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    static {
        new ConcurrentHashMap();
    }

    public C0232h0(TextView textView) {
        this.f911i = textView;
        this.f912j = textView.getContext();
        int i7 = Build.VERSION.SDK_INT;
        this.f913k = i7 >= 29 ? new e() : i7 >= 23 ? new d() : new f();
    }

    /* renamed from: b */
    public static int[] m774b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i7 : iArr) {
            if (i7 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i7)) < 0) {
                arrayList.add(Integer.valueOf(i7));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i8 = 0; i8 < size; i8++) {
            iArr2[i8] = ((Integer) arrayList.get(i8)).intValue();
        }
        return iArr2;
    }

    /* renamed from: d */
    public static Method m775d(String str) {
        try {
            ConcurrentHashMap<String, Method> concurrentHashMap = f902m;
            Method method = concurrentHashMap.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                concurrentHashMap.put(str, method);
            }
            return method;
        } catch (Exception e7) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e7);
            return null;
        }
    }

    /* renamed from: e */
    public static <T> T m776e(Object obj, String str, T t7) {
        try {
            return (T) m775d(str).invoke(obj, new Object[0]);
        } catch (Exception e7) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e7);
            return t7;
        }
    }

    /* renamed from: a */
    public final void m777a() {
        if (m782i() && this.f903a != 0) {
            if (this.f904b) {
                if (this.f911i.getMeasuredHeight() <= 0 || this.f911i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f913k.mo789b(this.f911i) ? 1048576 : (this.f911i.getMeasuredWidth() - this.f911i.getTotalPaddingLeft()) - this.f911i.getTotalPaddingRight();
                int height = (this.f911i.getHeight() - this.f911i.getCompoundPaddingBottom()) - this.f911i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f901l;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float m778c = m778c(rectF);
                    if (m778c != this.f911i.getTextSize()) {
                        m779f(0, m778c);
                    }
                }
            }
            this.f904b = true;
        }
    }

    /* renamed from: c */
    public final int m778c(RectF rectF) {
        int i7;
        StaticLayout m784a;
        CharSequence transformation;
        int length = this.f908f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i8 = length - 1;
        int i9 = 1;
        int i10 = 0;
        while (i9 <= i8) {
            int i11 = (i9 + i8) / 2;
            int i12 = this.f908f[i11];
            TextView textView = this.f911i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                text = transformation;
            }
            int i13 = Build.VERSION.SDK_INT;
            int m785b = a.m785b(textView);
            TextPaint textPaint = this.f910h;
            if (textPaint == null) {
                this.f910h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f910h.set(textView.getPaint());
            this.f910h.setTextSize(i12);
            Layout.Alignment alignment = (Layout.Alignment) m776e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
            int round = Math.round(rectF.right);
            if (i13 >= 23) {
                i7 = m785b;
                m784a = c.m787a(text, alignment, round, m785b, this.f911i, this.f910h, this.f913k);
            } else {
                i7 = m785b;
                m784a = a.m784a(text, alignment, round, textView, this.f910h);
            }
            if ((i7 == -1 || (m784a.getLineCount() <= i7 && m784a.getLineEnd(m784a.getLineCount() - 1) == text.length())) && ((float) m784a.getHeight()) <= rectF.bottom) {
                int i14 = i11 + 1;
                i10 = i9;
                i9 = i14;
            } else {
                i10 = i11 - 1;
                i8 = i10;
            }
        }
        return this.f908f[i10];
    }

    /* renamed from: f */
    public final void m779f(int i7, float f7) {
        Context context = this.f912j;
        float applyDimension = TypedValue.applyDimension(i7, f7, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f911i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean m786a = b.m786a(textView);
            if (textView.getLayout() != null) {
                this.f904b = false;
                try {
                    Method m775d = m775d("nullLayouts");
                    if (m775d != null) {
                        m775d.invoke(textView, new Object[0]);
                    }
                } catch (Exception e7) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e7);
                }
                if (m786a) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    /* renamed from: g */
    public final boolean m780g() {
        if (m782i() && this.f903a == 1) {
            if (!this.f909g || this.f908f.length == 0) {
                int floor = ((int) Math.floor((this.f907e - this.f906d) / this.f905c)) + 1;
                int[] iArr = new int[floor];
                for (int i7 = 0; i7 < floor; i7++) {
                    iArr[i7] = Math.round((i7 * this.f905c) + this.f906d);
                }
                this.f908f = m774b(iArr);
            }
            this.f904b = true;
        } else {
            this.f904b = false;
        }
        return this.f904b;
    }

    /* renamed from: h */
    public final boolean m781h() {
        boolean z6 = this.f908f.length > 0;
        this.f909g = z6;
        if (z6) {
            this.f903a = 1;
            this.f906d = r0[0];
            this.f907e = r0[r1 - 1];
            this.f905c = -1.0f;
        }
        return z6;
    }

    /* renamed from: i */
    public final boolean m782i() {
        return !(this.f911i instanceof C0243l);
    }

    /* renamed from: j */
    public final void m783j(float f7, float f8, float f9) {
        if (f7 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f7 + "px) is less or equal to (0px)");
        }
        if (f8 <= f7) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f8 + "px) is less or equal to minimum auto-size text size (" + f7 + "px)");
        }
        if (f9 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f9 + "px) is less or equal to (0px)");
        }
        this.f903a = 1;
        this.f906d = f7;
        this.f907e = f8;
        this.f905c = f9;
        this.f909g = false;
    }
}
