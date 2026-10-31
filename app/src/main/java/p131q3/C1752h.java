package p131q3;

import android.content.Context;
import android.view.SubMenu;
import androidx.appcompat.view.menu.C0159f;
import androidx.appcompat.view.menu.C0161h;

/* renamed from: q3.h */
/* loaded from: classes.dex */
public final class C1752h extends C0159f {
    public C1752h(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.view.menu.C0159f, android.view.Menu
    public final SubMenu addSubMenu(int i7, int i8, int i9, CharSequence charSequence) {
        C0161h m525a = m525a(i7, i8, i9, charSequence);
        C1755k c1755k = new C1755k(this.f472a, this, m525a);
        m525a.f516o = c1755k;
        c1755k.setHeaderTitle(m525a.f506e);
        return c1755k;
    }
}
