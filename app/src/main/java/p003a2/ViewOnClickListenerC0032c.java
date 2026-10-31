package p003a2;

import android.util.SparseBooleanArray;
import android.view.View;
import androidx.fragment.app.AbstractC0378x;
import androidx.fragment.app.C0335a;
import androidx.fragment.app.ComponentCallbacksC0361n;
import com.so.revelation.lua.Code;
import com.so.revelation.lua.EditorActivity;
import p122p1.C1694b;
import p129q1.C1726b;
import p129q1.C1734j;
import p129q1.C1736l;

/* renamed from: a2.c */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0032c implements View.OnClickListener {

    /* renamed from: c */
    public final /* synthetic */ int f99c;

    /* renamed from: e */
    public final /* synthetic */ C0033d f100e;

    public ViewOnClickListenerC0032c(C0033d c0033d, int i7) {
        this.f100e = c0033d;
        this.f99c = i7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f100e.f102b.m4124j(this.f99c).f7890X.setText("");
        C0033d c0033d = this.f100e;
        int i7 = this.f99c;
        C1694b c1694b = c0033d.f102b;
        C1726b m4124j = c1694b.m4124j(i7);
        if (m4124j == null) {
            return;
        }
        Code code = m4124j.f7890X;
        if (code != null) {
            int i8 = code.getText().m2144p().f3166c.f3142c;
        }
        String m4197c = m4124j.m4197c();
        if (c1694b.f7626g == null) {
            AbstractC0378x abstractC0378x = c1694b.f7628i;
            abstractC0378x.getClass();
            c1694b.f7626g = new C0335a(abstractC0378x);
        }
        while (c1694b.f7631l.size() <= i7) {
            c1694b.f7631l.add(null);
        }
        while (c1694b.f7629j.size() <= i7) {
            c1694b.f7629j.add(null);
        }
        c1694b.f7631l.remove(i7);
        ComponentCallbacksC0361n componentCallbacksC0361n = c1694b.f7629j.get(i7);
        c1694b.f7629j.remove(i7);
        if (componentCallbacksC0361n != null) {
            c1694b.f7626g.m1140i(componentCallbacksC0361n);
        }
        synchronized (c1694b.f8252f) {
            c1694b.f8251e.remove(i7);
        }
        c1694b.f8250d = new SparseBooleanArray(c1694b.f8251e.size());
        c1694b.m5503e();
        EditorActivity editorActivity = c0033d.f101a;
        int i9 = C1736l.f7944c;
        new C1734j(editorActivity.getApplicationContext()).m4205c(m4197c);
        int currentItem = c0033d.f105e.getCurrentItem();
        if (c0033d.m120e() != 0) {
            c0033d.m123h(currentItem);
        }
    }
}
