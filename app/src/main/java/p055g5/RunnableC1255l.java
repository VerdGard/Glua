package p055g5;

import android.app.ProgressDialog;
import android.widget.Toast;
import p006a5.C0056f;

/* renamed from: g5.l */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1255l implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ int f6193c;

    /* renamed from: e */
    public final /* synthetic */ Object f6194e;

    /* renamed from: m */
    public final /* synthetic */ Object f6195m;

    /* renamed from: s */
    public final /* synthetic */ Object f6196s;

    public /* synthetic */ RunnableC1255l(C1256m c1256m, Object obj, Object obj2, int i7) {
        this.f6193c = i7;
        this.f6194e = c1256m;
        this.f6195m = obj;
        this.f6196s = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.f6193c;
        Object obj = this.f6196s;
        Object obj2 = this.f6195m;
        Object obj3 = this.f6194e;
        switch (i7) {
            case 0:
                Toast.makeText(((C1256m) obj3).f6197a.getContext(), "Replace failed:" + ((Exception) obj2), 0).show();
                ((ProgressDialog) obj).dismiss();
                break;
            default:
                Runnable runnable = (Runnable) obj3;
                C1245b c1245b = (C1245b) obj2;
                C0056f c0056f = (C0056f) obj;
                if (runnable != null) {
                    runnable.run();
                }
                c1245b.setStyles(c0056f);
                break;
        }
    }
}
