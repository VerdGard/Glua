package p036e2;

import android.content.DialogInterface;
import android.ext.DaemonManager;
import p036e2.C1091t1;

/* renamed from: e2.q1 */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC1070q1 implements DialogInterface.OnClickListener {
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        C1091t1.b bVar;
        dialogInterface.dismiss();
        C1119x1 c1119x1 = C1119x1.f5553E;
        c1119x1.m3284c();
        C1023j3.f5170m.m382g(3, "autotrace: connect close, app close");
        c1119x1.m3282a(4, "");
        if (!c1119x1.m3287f() || (bVar = c1119x1.f5560c.f5441b) == null || bVar.f5237w1 == null) {
            return;
        }
        bVar.f5235m.m3068i(DaemonManager.TIME_JUMP_MUL_INT, "", false);
    }
}
