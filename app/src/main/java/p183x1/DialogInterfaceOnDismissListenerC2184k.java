package p183x1;

import android.content.DialogInterface;
import android.ext.Tools;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.DialogInterfaceC0151d;
import com.so.revelation.lua.EditorActivity;
import java.util.ArrayList;
import p165u6.AbstractC1984c0;
import p165u6.AbstractC2003u;
import p165u6.C1991i;
import p165u6.C1999q;
import p175w1.AbstractC2084e;
import p175w1.C2078b;
import p175w1.C2083d0;
import p175w1.C2101m0;

/* renamed from: x1.k */
/* loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC2184k extends AbstractC2084e implements DialogInterface.OnDismissListener, DialogInterface.OnClickListener, DialogInterface.OnMultiChoiceClickListener {

    /* renamed from: j2 */
    public volatile boolean[] f9906j2;

    /* renamed from: k2 */
    public volatile boolean f9907k2;

    /* renamed from: l2 */
    public final C2083d0 f9908l2;

    /* renamed from: x1.k$a */
    public class a implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ String f9909c;

        /* renamed from: e */
        public final /* synthetic */ CharSequence[] f9910e;

        public a(String str, CharSequence[] charSequenceArr) {
            this.f9909c = str;
            this.f9910e = charSequenceArr;
        }

        @Override // java.lang.Runnable
        public final void run() {
            EditorActivity activity = Tools.getActivity();
            C2078b.a aVar = C2078b.f9472a;
            DialogInterfaceC0151d.a aVar2 = new DialogInterfaceC0151d.a(activity);
            aVar2.f374a.f346f = Tools.getCustomTitle("启示录", this.f9909c);
            aVar2.m486c("确定", DialogInterfaceOnDismissListenerC2184k.this);
            aVar2.m485b("取消", DialogInterfaceOnDismissListenerC2184k.this);
            CharSequence[] charSequenceArr = this.f9910e;
            boolean[] zArr = DialogInterfaceOnDismissListenerC2184k.this.f9906j2;
            DialogInterfaceOnDismissListenerC2184k dialogInterfaceOnDismissListenerC2184k = DialogInterfaceOnDismissListenerC2184k.this;
            AlertController.C0145b c0145b = aVar2.f374a;
            c0145b.f356p = charSequenceArr;
            c0145b.f364x = dialogInterfaceOnDismissListenerC2184k;
            c0145b.f360t = zArr;
            c0145b.f361u = true;
            DialogInterfaceC0151d m484a = aVar2.m484a();
            C2078b.m5135b(m484a, DialogInterfaceOnDismissListenerC2184k.this);
            C2078b.m5137d(m484a, null);
            DialogInterfaceOnDismissListenerC2184k.this.f9908l2.m5143I2(true);
        }
    }

    public DialogInterfaceOnDismissListenerC2184k(C2083d0 c2083d0) {
        this.f9908l2 = c2083d0;
    }

    @Override // p175w1.AbstractC2084e
    /* renamed from: I2 */
    public final AbstractC1984c0 mo5146I2(AbstractC1984c0 abstractC1984c0) {
        int i7;
        C1999q m4636A = abstractC1984c0.m4636A(1);
        C1999q mo4773F1 = abstractC1984c0.mo4623t(2).mo4773F1();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        m4636A.getClass();
        C1999q.d dVar = m4636A.new d(m4636A);
        while (true) {
            r7 = false;
            boolean z6 = false;
            if (!dVar.m4845b()) {
                break;
            }
            AbstractC2003u m4844a = dVar.m4844a();
            arrayList2.add(dVar.m4846c().mo4742n0());
            if (mo4773F1 != null) {
                try {
                    if (mo4773F1.mo4777L0(m4844a).mo4680A1(false)) {
                        z6 = true;
                    }
                } catch (C1991i e7) {
                    String message = e7.getMessage();
                    if (message.indexOf("bad argument:") != 0) {
                        throw e7;
                    }
                    throw new C1991i("bad argument for key '" + m4844a.mo4645M() + "':" + message.substring(13));
                }
            }
            arrayList3.add(Boolean.valueOf(z6));
            arrayList.add(m4844a);
        }
        this.f9906j2 = Tools.booleanArray(arrayList3);
        this.f9907k2 = false;
        String m4644K = abstractC1984c0.m4644K(3, "");
        String str = m4644K.length() > 0 ? String.valueOf('\n') + m4644K : null;
        CharSequence[] charSequenceArr = (CharSequence[]) arrayList2.toArray(new CharSequence[arrayList2.size()]);
        synchronized (this) {
            C2101m0.m5155a(0, new a(str, charSequenceArr));
            C2083d0.m5142N2(this);
        }
        if (!this.f9907k2) {
            return AbstractC2003u.f9130m;
        }
        C1999q c1999q = new C1999q();
        for (i7 = 0; i7 < arrayList.size(); i7++) {
            if (this.f9906j2[i7]) {
                c1999q.mo4787V1((AbstractC2003u) arrayList.get(i7), AbstractC2003u.f9131s);
            }
        }
        return c1999q;
    }

    @Override // p175w1.AbstractC2084e
    /* renamed from: J2 */
    public final String mo5147J2() {
        return "gg.multiChoice(table items [, table selection = {} [, string message = nil]]) -> table || nil";
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        if (i7 == -1) {
            this.f9907k2 = true;
        }
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public final void onClick(DialogInterface dialogInterface, int i7, boolean z6) {
        this.f9906j2[i7] = z6;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        synchronized (this) {
            notify();
        }
        this.f9908l2.m5143I2(false);
    }
}
