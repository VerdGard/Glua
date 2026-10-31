package p113o0;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.emoji2.text.C0323g;
import androidx.emoji2.text.C0327k;

/* renamed from: o0.e */
/* loaded from: classes.dex */
public final class C1656e implements KeyListener {

    /* renamed from: a */
    public final KeyListener f7500a;

    /* renamed from: b */
    public final a f7501b;

    /* renamed from: o0.e$a */
    public static class a {
    }

    public C1656e(KeyListener keyListener) {
        a aVar = new a();
        this.f7500a = keyListener;
        this.f7501b = aVar;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i7) {
        this.f7500a.clearMetaKeyState(view, editable, i7);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f7500a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i7, KeyEvent keyEvent) {
        boolean z6;
        this.f7501b.getClass();
        Object obj = C0323g.f1556i;
        if (i7 != 67 ? i7 != 112 ? false : C0327k.m1113a(editable, keyEvent, true) : C0327k.m1113a(editable, keyEvent, false)) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z6 = true;
        } else {
            z6 = false;
        }
        return z6 || this.f7500a.onKeyDown(view, editable, i7, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f7500a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i7, KeyEvent keyEvent) {
        return this.f7500a.onKeyUp(view, editable, i7, keyEvent);
    }
}
