package p055g5;

import android.view.MotionEvent;
import p006a5.InterfaceC0053c;
import p022c5.C0638b;
import p022c5.C0651o;
import p023c6.InterfaceC0673s;
import p132q4.C1790s;
import p132q4.C1793v;

/* renamed from: g5.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C1244a implements InterfaceC0673s {

    /* renamed from: c */
    public final /* synthetic */ int f5984c;

    public /* synthetic */ C1244a(int i7) {
        this.f5984c = i7;
    }

    @Override // p023c6.InterfaceC0673s
    /* renamed from: a */
    public final Object mo215a(C1245b c1245b, C0638b c0638b, Object obj, InterfaceC0053c interfaceC0053c, C0651o c0651o) {
        switch (this.f5984c) {
            case 0:
                return new C1790s(c1245b, c0638b, (MotionEvent) obj, interfaceC0053c);
            default:
                return new C1793v(c1245b, c0638b, (MotionEvent) obj, interfaceC0053c);
        }
    }
}
