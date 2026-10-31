package p019c2;

import android.content.DialogInterface;
import android.widget.Toast;
import androidx.appcompat.app.DialogInterfaceC0151d;
import com.so.revelation.lua.EditorActivity;

/* renamed from: c2.h */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0600h implements DialogInterface.OnClickListener {

    /* renamed from: c */
    public final /* synthetic */ C0602j f2997c;

    public DialogInterfaceOnClickListenerC0600h(C0602j c0602j) {
        this.f2997c = c0602j;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        C0602j c0602j = this.f2997c;
        DialogInterfaceC0151d dialogInterfaceC0151d = c0602j.f3003b;
        if (dialogInterfaceC0151d != null) {
            dialogInterfaceC0151d.cancel();
            c0602j.f3003b = null;
        }
        Toast.makeText(EditorActivity.this, "权限不通过!", 0).show();
    }
}
