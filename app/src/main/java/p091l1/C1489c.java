package p091l1;

import android.view.MenuItem;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.C0159f;
import com.so.revelation.lua.Code;
import p049g.AbstractC1183a;

/* renamed from: l1.c */
/* loaded from: classes.dex */
public final class C1489c implements AbstractC1183a.a {

    /* renamed from: a */
    public C1487a f7097a;

    /* renamed from: b */
    public final /* synthetic */ Code f7098b;

    public C1489c(Code code) {
        this.f7098b = code;
    }

    @Override // p049g.AbstractC1183a.a
    /* renamed from: a */
    public final boolean mo1961a(AbstractC1183a abstractC1183a, C0159f c0159f) {
        abstractC1183a.mo1902o("转到");
        abstractC1183a.mo1900m(null);
        Code code = this.f7098b;
        C1487a c1487a = new C1487a(this, code.f3260o3);
        this.f7097a = c1487a;
        c1487a.setSingleLine(true);
        this.f7097a.setInputType(2);
        this.f7097a.setImeOptions(2);
        this.f7097a.setOnEditorActionListener(new C1488b(this));
        this.f7097a.setLayoutParams(new ViewGroup.LayoutParams(code.getWidth() / 3, -1));
        c0159f.m525a(0, 1, 0, "").m557f(this.f7097a);
        c0159f.m525a(0, 2, 0, code.f3260o3.getString(android.R.string.ok));
        this.f7097a.requestFocus();
        return true;
    }

    @Override // p049g.AbstractC1183a.a
    /* renamed from: b */
    public final boolean mo1962b(AbstractC1183a abstractC1183a, MenuItem menuItem) {
        if (menuItem.getItemId() != 2) {
            return false;
        }
        m3913e();
        return false;
    }

    @Override // p049g.AbstractC1183a.a
    /* renamed from: c */
    public final boolean mo1963c(AbstractC1183a abstractC1183a, C0159f c0159f) {
        return false;
    }

    @Override // p049g.AbstractC1183a.a
    /* renamed from: d */
    public final void mo1964d(AbstractC1183a abstractC1183a) {
    }

    /* renamed from: e */
    public final void m3913e() {
        String obj = this.f7097a.getText().toString();
        if (obj.isEmpty()) {
            return;
        }
        int intValue = Integer.valueOf(obj).intValue() - 1;
        Code code = this.f7098b;
        if (intValue < code.getText().m2147s()) {
            code.m3500k0(intValue, 0);
        }
    }
}
