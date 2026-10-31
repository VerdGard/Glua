package p183x1;

import android.content.DialogInterface;
import android.ext.Tools;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.DialogInterfaceC0151d;
import com.so.revelation.lua.EditorActivity;
import java.util.ArrayList;
import p165u6.AbstractC1984c0;
import p165u6.AbstractC2003u;
import p165u6.C1999q;
import p175w1.AbstractC2084e;
import p175w1.C2078b;
import p175w1.C2083d0;
import p175w1.C2101m0;

/* renamed from: x1.f */
/* loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC2179f extends AbstractC2084e implements DialogInterface.OnDismissListener, DialogInterface.OnClickListener {

    /* renamed from: j2 */
    public volatile int f9897j2 = 0;

    /* renamed from: k2 */
    public final C2083d0 f9898k2;

    /* renamed from: x1.f$a */
    public class a implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ String f9900c;

        /* renamed from: e */
        public final /* synthetic */ AbstractC2003u f9901e;

        /* renamed from: m */
        public final /* synthetic */ CharSequence[] f9902m;

        /* renamed from: s */
        public final /* synthetic */ int f9903s;

        public a(String str, AbstractC2003u abstractC2003u, CharSequence[] charSequenceArr, int i7) {
            this.f9900c = str;
            this.f9901e = abstractC2003u;
            this.f9902m = charSequenceArr;
            this.f9903s = i7;
        }

        @Override // java.lang.Runnable
        public final void run() {
            EditorActivity activity = Tools.getActivity();
            C2078b.a aVar = C2078b.f9472a;
            DialogInterfaceC0151d.a aVar2 = new DialogInterfaceC0151d.a(activity);
            String str = this.f9900c;
            AlertController.C0145b c0145b = aVar2.f374a;
            c0145b.f345e = str;
            DialogInterfaceOnDismissListenerC2179f dialogInterfaceOnDismissListenerC2179f = DialogInterfaceOnDismissListenerC2179f.this;
            aVar2.m485b("取消", dialogInterfaceOnDismissListenerC2179f);
            boolean mo4804d1 = this.f9901e.mo4804d1();
            CharSequence[] charSequenceArr = this.f9902m;
            if (mo4804d1) {
                c0145b.f356p = charSequenceArr;
                c0145b.f358r = dialogInterfaceOnDismissListenerC2179f;
            } else {
                c0145b.f356p = charSequenceArr;
                c0145b.f358r = dialogInterfaceOnDismissListenerC2179f;
                c0145b.f363w = this.f9903s;
                c0145b.f362v = true;
            }
            DialogInterfaceC0151d m484a = aVar2.m484a();
            m484a.setOnDismissListener(dialogInterfaceOnDismissListenerC2179f);
            m484a.show();
            dialogInterfaceOnDismissListenerC2179f.f9898k2.m5143I2(true);
        }
    }

    public DialogInterfaceOnDismissListenerC2179f(C2083d0 c2083d0) {
        this.f9898k2 = c2083d0;
    }

    @Override // p175w1.AbstractC2084e
    /* renamed from: I2 */
    public final AbstractC1984c0 mo5146I2(AbstractC1984c0 abstractC1984c0) {
        C1999q m4636A = abstractC1984c0.m4636A(1);
        AbstractC2003u mo4623t = abstractC1984c0.mo4623t(2);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        m4636A.getClass();
        C1999q.d dVar = m4636A.new d(m4636A);
        int i7 = 0;
        int i8 = -1;
        while (dVar.m4845b()) {
            AbstractC2003u m4844a = dVar.m4844a();
            AbstractC2003u m4846c = dVar.m4846c();
            if (m4844a.mo4704G0(mo4623t)) {
                i8 = i7;
            }
            arrayList2.add(m4846c.mo4742n0());
            arrayList.add(m4844a);
            i7++;
        }
        String m4644K = abstractC1984c0.m4644K(3, "");
        if (m4644K.length() <= 0) {
            m4644K = null;
        }
        CharSequence[] charSequenceArr = (CharSequence[]) arrayList2.toArray(new CharSequence[arrayList2.size()]);
        this.f9897j2 = -1;
        synchronized (this) {
            C2101m0.m5155a(0, new a(m4644K, mo4623t, charSequenceArr, i8));
            C2083d0.m5142N2(this);
        }
        return this.f9897j2 < 0 ? AbstractC2003u.f9130m : (AbstractC1984c0) arrayList.get(this.f9897j2);
    }

    @Override // p175w1.AbstractC2084e
    /* renamed from: J2 */
    public final String mo5147J2() {
        return "gg.choice(table items [, string selected = nil [, string message = nil]]) -> string || nil";
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        this.f9897j2 = i7;
        Tools.dismiss(dialogInterface);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        synchronized (this) {
            notify();
        }
        this.f9898k2.m5143I2(false);
    }
}
