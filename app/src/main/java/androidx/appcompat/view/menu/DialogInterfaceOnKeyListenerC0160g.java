package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.DialogInterfaceC0151d;
import androidx.appcompat.view.menu.C0157d.a;
import androidx.appcompat.view.menu.InterfaceC0163j;

/* renamed from: androidx.appcompat.view.menu.g */
/* loaded from: classes.dex */
public final class DialogInterfaceOnKeyListenerC0160g implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC0163j.a {

    /* renamed from: c */
    public final C0159f f496c;

    /* renamed from: e */
    public DialogInterfaceC0151d f497e;

    /* renamed from: m */
    public C0157d f498m;

    public DialogInterfaceOnKeyListenerC0160g(C0159f c0159f) {
        this.f496c = c0159f;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0163j.a
    /* renamed from: b */
    public final void mo550b(C0159f c0159f, boolean z6) {
        DialogInterfaceC0151d dialogInterfaceC0151d;
        if ((z6 || c0159f == this.f496c) && (dialogInterfaceC0151d = this.f497e) != null) {
            dialogInterfaceC0151d.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0163j.a
    /* renamed from: c */
    public final boolean mo551c(C0159f c0159f) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        C0157d c0157d = this.f498m;
        if (c0157d.f458Z == null) {
            c0157d.f458Z = c0157d.new a();
        }
        this.f496c.m541q(c0157d.f458Z.getItem(i7), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f498m.mo501b(this.f496c, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i7, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        C0159f c0159f = this.f496c;
        if (i7 == 82 || i7 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f497e.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f497e.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                c0159f.m527c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return c0159f.performShortcut(i7, keyEvent, 0);
    }
}
