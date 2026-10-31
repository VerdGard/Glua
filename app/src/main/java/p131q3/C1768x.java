package p131q3;

import android.annotation.SuppressLint;
import android.widget.ImageButton;

@SuppressLint({"AppCompatCustomView"})
/* renamed from: q3.x */
/* loaded from: classes.dex */
public class C1768x extends ImageButton {

    /* renamed from: c */
    public int f8129c;

    /* renamed from: b */
    public final void m4241b(int i7, boolean z6) {
        super.setVisibility(i7);
        if (z6) {
            this.f8129c = i7;
        }
    }

    public final int getUserSetVisibility() {
        return this.f8129c;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i7) {
        m4241b(i7, true);
    }
}
