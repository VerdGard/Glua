package p058h0;

import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import androidx.emoji2.text.RunnableC0324h;
import java.util.ArrayList;
import java.util.Collections;
import p032d6.C0898f;
import p034e0.C0912c;
import p034e0.C0946x;
import p055g5.C1245b;
import p058h0.C1282i;
import p063h5.C1302a;
import p071i5.C1359b0;
import p071i5.RunnableC1365e0;
import p071i5.ViewOnClickListenerC1367f0;
import p079j5.AbstractC1432a;
import p079j5.C1440i;
import p132q4.AbstractC1786o;
import p132q4.C1773b0;
import p132q4.C1785n;
import p132q4.C1787p;
import p132q4.C1789r;
import p132q4.C1795x;
import p132q4.InterfaceC1788q;

/* renamed from: h0.d */
/* loaded from: classes.dex */
public final /* synthetic */ class C1277d implements InterfaceC1280g, InterfaceC1788q, C1787p.a, AbstractC1432a.b.a {

    /* renamed from: c */
    public final /* synthetic */ int f6350c;

    /* renamed from: e */
    public final /* synthetic */ Object f6351e;

    public /* synthetic */ C1277d(int i7, Object obj) {
        this.f6350c = i7;
        this.f6351e = obj;
    }

    /* renamed from: a */
    public final boolean m3590a(C1282i c1282i, int i7, Bundle bundle) {
        View view = (View) this.f6351e;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 25 && (i7 & 1) != 0) {
            try {
                c1282i.f6354a.mo3595d();
                InputContentInfo inputContentInfo = (InputContentInfo) c1282i.f6354a.mo3593b();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
            } catch (Exception e7) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e7);
                return false;
            }
        }
        ClipDescription mo3592a = c1282i.f6354a.mo3592a();
        C1282i.c cVar = c1282i.f6354a;
        ClipData clipData = new ClipData(mo3592a, new ClipData.Item(cVar.mo3594c()));
        C0912c.b aVar = i8 >= 31 ? new C0912c.a(clipData, 2) : new C0912c.c(clipData, 2);
        aVar.mo2663a(cVar.mo3596e());
        aVar.setExtras(bundle);
        return C0946x.m2813n(view, aVar.build()) == null;
    }

    @Override // p079j5.AbstractC1432a.b.a
    /* renamed from: b */
    public final void mo3553b(int i7, Object[] objArr) {
        C1440i c1440i = (C1440i) this.f6351e;
        int i8 = C1440i.f6911Z;
        C1245b c1245b = c1440i.f6872c;
        if (c1245b != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : objArr) {
                arrayList.add((C1440i.d) obj);
            }
            Collections.sort(arrayList);
            c1245b.m3489e0(new RunnableC0324h(c1440i, c1245b, arrayList, 1));
        }
    }

    @Override // p132q4.C1787p.a
    /* renamed from: c */
    public final void mo3554c(AbstractC1786o abstractC1786o) {
        ViewOnClickListenerC1367f0 viewOnClickListenerC1367f0 = (ViewOnClickListenerC1367f0) this.f6351e;
        C1789r c1789r = (C1789r) abstractC1786o;
        viewOnClickListenerC1367f0.getClass();
        if (c1789r.f8156d) {
            viewOnClickListenerC1367f0.m3725f();
        }
        if (c1789r.f8145a.getCursor().m2163a() || c1789r.f8155c != 0 || c1789r.f8156d) {
            return;
        }
        viewOnClickListenerC1367f0.m3724e();
        viewOnClickListenerC1367f0.f6638B1.m3487d0(new RunnableC1365e0(viewOnClickListenerC1367f0), 100L);
    }

    @Override // p132q4.InterfaceC1788q
    /* renamed from: d */
    public final void mo2065d(AbstractC1786o abstractC1786o, C1773b0 c1773b0) {
        int i7 = this.f6350c;
        Object obj = this.f6351e;
        switch (i7) {
            case 1:
                C1302a c1302a = (C1302a) obj;
                C1795x c1795x = (C1795x) abstractC1786o;
                if (!c1302a.f6461X) {
                    c1773b0.f8130a = true;
                    break;
                } else {
                    int i8 = c1795x.f8162g;
                    if ((i8 != 2 && i8 != 3 && i8 != 4 && i8 != 5) || !c1302a.m3616c(4) || ((Math.abs(c1795x.f8160e - c1795x.f8158c) <= 80 && Math.abs(c1795x.f8161f - c1795x.f8159d) <= 80) || !c1302a.m3617d())) {
                        if (c1302a.m3616c(1)) {
                            c1302a.m3614a(false);
                            break;
                        }
                    } else {
                        c1302a.mo3615b();
                        break;
                    }
                }
                break;
            default:
                C1359b0 c1359b0 = (C1359b0) obj;
                C0898f.m2606e(c1359b0, "this$0");
                C0898f.m2606e((C1785n) abstractC1786o, "<anonymous parameter 0>");
                c1359b0.f6605B1.m4247d(false);
                c1359b0.mo3615b();
                break;
        }
    }
}
