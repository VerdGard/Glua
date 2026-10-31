package p021c4;

import p022c5.C0638b;
import p022c5.C0640d;
import p022c5.C0653q;
import p032d6.C0898f;
import p042f0.InterfaceC1148d;
import p047f5.C1174e;
import p055g5.C1248e;
import p055g5.C1258o;
import p071i5.C1374k;
import p072i6.C1390a;
import p103m5.C1555a;
import p132q4.AbstractC1786o;
import p132q4.C1773b0;
import p132q4.C1775d;
import p132q4.C1795x;
import p132q4.C1796y;
import p132q4.InterfaceC1788q;
import p144s0.RunnableC1869e;

/* renamed from: c4.k */
/* loaded from: classes.dex */
public final /* synthetic */ class C0623k implements InterfaceC1148d, InterfaceC1788q {

    /* renamed from: c */
    public final /* synthetic */ int f3052c;

    /* renamed from: e */
    public final /* synthetic */ Object f3053e;

    public /* synthetic */ C0623k(int i7, Object obj) {
        this.f3052c = i7;
        this.f3053e = obj;
    }

    @Override // p132q4.InterfaceC1788q
    /* renamed from: d */
    public final void mo2065d(AbstractC1786o abstractC1786o, C1773b0 c1773b0) {
        C0653q.c cVar;
        int i7;
        int i8 = this.f3052c;
        int i9 = 3;
        Object obj = this.f3053e;
        switch (i8) {
            case 2:
                C1248e c1248e = (C1248e) obj;
                C1775d c1775d = (C1775d) abstractC1786o;
                C1174e c1174e = C1248e.f6124d;
                c1248e.getClass();
                int i10 = c1775d.f8131c;
                C0640d c0640d = c1248e.f6126b;
                C0638b c0638b = c1775d.f8133e;
                C0638b c0638b2 = c1775d.f8132d;
                if (i10 == 2) {
                    int i11 = c0638b2.f3140a;
                    int i12 = c0638b.f3140a - i11;
                    int i13 = c0640d.f3145a;
                    if (i13 <= i11 && (i7 = c0640d.f3146b) >= i11) {
                        c0640d.f3146b = i7 + i12;
                    }
                    if (i13 > i11) {
                        c0640d.f3145a = i13 + i12;
                        c0640d.f3146b += i12;
                        return;
                    }
                    return;
                }
                if (i10 == 3) {
                    int i14 = c0638b2.f3140a;
                    int i15 = c0638b.f3140a;
                    int i16 = i15 - i14;
                    int max = Math.max(i14, c0640d.f3145a);
                    int min = Math.min(i15, c0640d.f3146b);
                    if (min <= max) {
                        int i17 = c0640d.f3145a;
                        if (i17 >= i15) {
                            c0640d.f3145a = i17 - i16;
                            c0640d.f3146b -= i16;
                            return;
                        }
                        return;
                    }
                    int i18 = c0640d.f3146b - (min - max);
                    c0640d.f3146b = i18;
                    int i19 = c0640d.f3145a;
                    if (i19 > i14) {
                        int i20 = i19 - i14;
                        c0640d.f3145a = i19 - i20;
                        c0640d.f3146b = i18 - i20;
                        return;
                    }
                    return;
                }
                return;
            case 3:
                C1258o c1258o = (C1258o) obj;
                c1258o.getClass();
                if (((C1796y) abstractC1786o).m4250a()) {
                    return;
                }
                c1258o.m3560a(new RunnableC1869e(i9, c1258o));
                return;
            case 4:
                C1374k c1374k = (C1374k) obj;
                C1795x c1795x = (C1795x) abstractC1786o;
                c1374k.getClass();
                int i21 = c1795x.f8162g;
                if (i21 == 1) {
                    c1374k.m3738m(false);
                    return;
                }
                if (i21 == 2) {
                    float dpUnit = c1374k.f6672B1.getDpUnit() * 2000.0f;
                    if (Math.abs(c1795x.f8163h) >= dpUnit || Math.abs(c1795x.f8164i) >= dpUnit) {
                        c1374k.m3733h();
                        return;
                    }
                    return;
                }
                return;
            default:
                C1555a c1555a = (C1555a) obj;
                C1775d c1775d2 = (C1775d) abstractC1786o;
                C1390a c1390a = C1555a.f7225d;
                C0898f.m2606e(c1555a, "this$0");
                C0898f.m2606e(c1775d2, "event");
                if (c1555a.m3950c()) {
                    c1555a.getClass();
                    int i22 = c1775d2.f8131c;
                    if (i22 != 1) {
                        C0638b c0638b3 = c1775d2.f8132d;
                        CharSequence charSequence = c1775d2.f8134f;
                        if (i22 != 2) {
                            if (i22 != 3) {
                                return;
                            }
                            if (c1555a.m3948a(c0638b3.f3140a) && c1555a.m3948a(c1775d2.f8133e.f3140a)) {
                                C0653q c0653q = c1555a.f7226a.getText().f3156x1;
                                if (c0653q.f3194Z && (cVar = c0653q.f3192X) != null) {
                                    c0653q.m2173C(c0653q.f3193Y, cVar);
                                }
                                c0653q.f3194Z = false;
                                c0653q.f3193Y = null;
                                charSequence.length();
                                c1555a.m3949b();
                                C0898f.m2603b(null);
                                throw null;
                            }
                        } else if (c1555a.m3948a(c0638b3.f3140a)) {
                            C0898f.m2605d(charSequence, "event.changedText");
                            C1390a c1390a2 = C1555a.f7225d;
                            c1390a2.getClass();
                            if (c1390a2.f6718c.matcher(charSequence).find()) {
                                int length = charSequence.length();
                                for (int i23 = 0; i23 < length; i23++) {
                                    char charAt = charSequence.charAt(i23);
                                    if (!(charAt == '\r' || charAt == '\n')) {
                                    }
                                }
                            } else {
                                charSequence.length();
                            }
                            c1555a.m3949b();
                            C0898f.m2603b(null);
                            throw null;
                        }
                    }
                    c1555a.m3951d();
                    return;
                }
                return;
        }
    }
}
