package p159u;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.C0401l;
import androidx.lifecycle.FragmentC0410u;
import androidx.lifecycle.InterfaceC0400k;
import p034e0.C0918f;
import p089l.C1481o;

/* renamed from: u.h */
/* loaded from: classes.dex */
public class ActivityC1961h extends Activity implements InterfaceC0400k, C0918f.a {

    /* renamed from: c */
    public final C0401l f8815c;

    public ActivityC1961h() {
        new C1481o();
        this.f8815c = new C0401l(this);
    }

    @Override // p034e0.C0918f.a
    /* renamed from: d */
    public final boolean mo1981d(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C0918f.m2693a(decorView, keyEvent)) {
            return C0918f.m2694b(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C0918f.m2693a(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    /* renamed from: m */
    public C0401l mo354m() {
        return this.f8815c;
    }

    @Override // android.app.Activity
    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i7 = FragmentC0410u.f2012e;
        FragmentC0410u.b.m1411b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        C0401l c0401l = this.f8815c;
        c0401l.getClass();
        c0401l.m1378d("markState");
        c0401l.m1381g();
        super.onSaveInstanceState(bundle);
    }
}
