package p022c5;

import android.os.Build;
import android.text.DynamicLayout;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import java.lang.reflect.Field;

/* renamed from: c5.n */
/* loaded from: classes.dex */
public final class C0650n {

    /* renamed from: c */
    public static final ThreadLocal<C0650n> f3183c = new ThreadLocal<>();

    /* renamed from: a */
    public final Editable f3184a;

    /* renamed from: b */
    public final DynamicLayout f3185b;

    public C0650n() {
        DynamicLayout.Builder obtain;
        DynamicLayout.Builder includePad;
        DynamicLayout.Builder lineSpacing;
        DynamicLayout.Builder textDirection;
        DynamicLayout.Builder alignment;
        DynamicLayout build;
        Editable newEditable = Editable.Factory.getInstance().newEditable("");
        this.f3184a = newEditable;
        if (Build.VERSION.SDK_INT > 28) {
            obtain = DynamicLayout.Builder.obtain(newEditable, new TextPaint(), 1073741823);
            includePad = obtain.setIncludePad(true);
            lineSpacing = includePad.setLineSpacing(0.0f, 0.0f);
            textDirection = lineSpacing.setTextDirection(TextDirectionHeuristics.LTR);
            alignment = textDirection.setAlignment(Layout.Alignment.ALIGN_NORMAL);
            build = alignment.build();
            this.f3185b = build;
            return;
        }
        DynamicLayout dynamicLayout = new DynamicLayout(newEditable, new TextPaint(), 1073741823, Layout.Alignment.ALIGN_NORMAL, 0.0f, 0.0f, true);
        this.f3185b = dynamicLayout;
        try {
            Field declaredField = Layout.class.getDeclaredField("mTextDir");
            declaredField.setAccessible(true);
            declaredField.set(dynamicLayout, TextDirectionHeuristics.LTR);
        } catch (Exception e7) {
            e7.printStackTrace();
        }
    }

    /* renamed from: a */
    public static C0650n m2169a() {
        ThreadLocal<C0650n> threadLocal = f3183c;
        C0650n c0650n = threadLocal.get();
        if (c0650n != null) {
            return c0650n;
        }
        C0650n c0650n2 = new C0650n();
        threadLocal.set(c0650n2);
        return c0650n2;
    }

    /* renamed from: b */
    public final int m2170b(int i7, C0642f c0642f) {
        int max = Math.max(0, i7 - 64);
        int i8 = i7 - max;
        int min = Math.min(c0642f.f3160e, i7 + 64 + 1);
        Editable editable = this.f3184a;
        editable.append((CharSequence) c0642f, max, min);
        Selection.setSelection(editable, Math.min(i8, editable.length()));
        Selection.moveLeft(editable, this.f3185b);
        int selectionStart = Selection.getSelectionStart(editable);
        editable.clear();
        Selection.removeSelection(editable);
        return selectionStart + max;
    }
}
