package p175w1;

import android.content.DialogInterface;
import android.ext.Tools;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.DialogInterfaceC0151d;
import java.lang.ref.WeakReference;

/* renamed from: w1.j */
/* loaded from: classes.dex */
public final class C2094j implements TextView.OnEditorActionListener {

    /* renamed from: a */
    public final WeakReference<DialogInterfaceC0151d> f9521a;

    public C2094j(DialogInterfaceC0151d dialogInterfaceC0151d) {
        this.f9521a = new WeakReference<>(null);
        this.f9521a = new WeakReference<>(dialogInterfaceC0151d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        Button m483h;
        boolean z6 = false;
        if (i7 != 6 && i7 != 3 && i7 != 4 && i7 != 2) {
            return false;
        }
        DialogInterfaceC0151d dialogInterfaceC0151d = this.f9521a.get();
        if ((dialogInterfaceC0151d instanceof DialogInterfaceC0151d) && (m483h = dialogInterfaceC0151d.m483h(-1)) != null && m483h.getVisibility() == 0) {
            Tools.click(m483h);
            z6 = true;
        }
        if (!z6 && (dialogInterfaceC0151d instanceof DialogInterface.OnClickListener)) {
            ((DialogInterface.OnClickListener) dialogInterfaceC0151d).onClick(null, -1);
            z6 = true;
        }
        if (z6 || !(dialogInterfaceC0151d instanceof View.OnClickListener)) {
            return z6;
        }
        ((View.OnClickListener) dialogInterfaceC0151d).onClick(textView);
        return true;
    }
}
