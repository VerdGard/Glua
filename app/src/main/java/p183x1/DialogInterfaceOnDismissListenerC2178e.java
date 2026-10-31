package p183x1;

import android.content.DialogInterface;
import android.ext.Tools;
import android.view.View;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.DialogInterfaceC0151d;
import com.so.revelation.lua.EditorActivity;
import p165u6.AbstractC1984c0;
import p165u6.C1993k;
import p175w1.AbstractC2084e;
import p175w1.C2078b;
import p175w1.C2083d0;

/* renamed from: x1.e */
/* loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC2178e extends AbstractC2084e implements DialogInterface.OnDismissListener, DialogInterface.OnClickListener {

    /* renamed from: j2 */
    public int f9889j2 = 0;

    /* renamed from: k2 */
    public final EditorActivity f9890k2;

    /* renamed from: l2 */
    public final C2083d0 f9891l2;

    /* renamed from: x1.e$a */
    public class a implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ String f9893c;

        /* renamed from: e */
        public final /* synthetic */ String f9894e;

        /* renamed from: m */
        public final /* synthetic */ String f9895m;

        /* renamed from: s */
        public final /* synthetic */ String f9896s;

        public a(String str, String str2, String str3, String str4) {
            this.f9893c = str;
            this.f9894e = str2;
            this.f9895m = str3;
            this.f9896s = str4;
        }

        @Override // java.lang.Runnable
        public final void run() {
            DialogInterfaceC0151d.a m5134a = C2078b.m5134a();
            View customTitle = Tools.getCustomTitle("启示录");
            AlertController.C0145b c0145b = m5134a.f374a;
            c0145b.f346f = customTitle;
            c0145b.f347g = this.f9893c;
            String str = this.f9894e;
            DialogInterfaceOnDismissListenerC2178e dialogInterfaceOnDismissListenerC2178e = DialogInterfaceOnDismissListenerC2178e.this;
            m5134a.m486c(str, dialogInterfaceOnDismissListenerC2178e);
            String str2 = this.f9895m;
            if (str2 != null) {
                m5134a.m485b(str2, dialogInterfaceOnDismissListenerC2178e);
            }
            String str3 = this.f9896s;
            if (str3 != null) {
                c0145b.f352l = str3;
                c0145b.f353m = dialogInterfaceOnDismissListenerC2178e;
            }
            DialogInterfaceC0151d m484a = m5134a.m484a();
            C2078b.m5135b(m484a, dialogInterfaceOnDismissListenerC2178e);
            C2078b.m5137d(m484a, null);
            dialogInterfaceOnDismissListenerC2178e.f9891l2.m5143I2(true);
        }
    }

    public DialogInterfaceOnDismissListenerC2178e(EditorActivity editorActivity, C2083d0 c2083d0) {
        this.f9890k2 = editorActivity;
        this.f9891l2 = c2083d0;
    }

    @Override // p175w1.AbstractC2084e
    /* renamed from: I2 */
    public final AbstractC1984c0 mo5146I2(AbstractC1984c0 abstractC1984c0) {
        String m4649x = abstractC1984c0.m4649x(1);
        String m4644K = abstractC1984c0.m4644K(2, "确定");
        String m4644K2 = abstractC1984c0.m4644K(3, null);
        String m4644K3 = abstractC1984c0.m4644K(4, null);
        this.f9889j2 = 0;
        synchronized (this) {
            this.f9890k2.runOnUiThread(new a(m4649x, m4644K, m4644K2, m4644K3));
            C2083d0.m5142N2(this);
        }
        return C1993k.m4765C2(this.f9889j2);
    }

    @Override // p175w1.AbstractC2084e
    /* renamed from: J2 */
    public final String mo5147J2() {
        return "gg.alert(string text [, string positive = 'ok' [, string negative = nil [, string neutral = nil]]]) -> int: 0 = cancel, 1 = positive, 2 = negative, 3 = neutral";
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        this.f9889j2 = -i7;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        synchronized (this) {
            notify();
        }
        this.f9891l2.m5143I2(false);
    }
}
