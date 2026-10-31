package p113o0;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.emoji2.text.C0323g;

/* renamed from: o0.h */
/* loaded from: classes.dex */
public final class C1659h implements TransformationMethod {

    /* renamed from: c */
    public final TransformationMethod f7512c;

    public C1659h(TransformationMethod transformationMethod) {
        this.f7512c = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f7512c;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || C0323g.m1102a().m1103b() != 1) {
            return charSequence;
        }
        C0323g m1102a = C0323g.m1102a();
        m1102a.getClass();
        return m1102a.m1107f(0, charSequence.length(), charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z6, int i7, Rect rect) {
        TransformationMethod transformationMethod = this.f7512c;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z6, i7, rect);
        }
    }
}
