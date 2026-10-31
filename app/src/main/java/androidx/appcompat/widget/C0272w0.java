package androidx.appcompat.widget;

import android.view.View;
import androidx.appcompat.R$attr;
import androidx.appcompat.view.menu.C0159f;
import androidx.appcompat.view.menu.C0162i;
import com.so.revelation.lua.EditorActivity;

/* renamed from: androidx.appcompat.widget.w0 */
/* loaded from: classes.dex */
public final class C0272w0 {

    /* renamed from: a */
    public final C0159f f1105a;

    /* renamed from: b */
    public final C0162i f1106b;

    public C0272w0(EditorActivity editorActivity, View view) {
        int i7 = R$attr.popupMenuStyle;
        C0159f c0159f = new C0159f(editorActivity);
        this.f1105a = c0159f;
        c0159f.f476e = new C0268u0(this);
        C0162i c0162i = new C0162i(i7, 0, editorActivity, view, c0159f, false);
        this.f1106b = c0162i;
        c0162i.f535g = 0;
        c0162i.f539k = new C0270v0(this);
    }
}
