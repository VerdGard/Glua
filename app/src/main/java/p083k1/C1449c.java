package p083k1;

import androidx.activity.C0143v;
import p002a1.C0028o;
import p060h2.EnumC1292a;
import p060h2.InterfaceC1295d;
import p076j2.InterfaceC1404a;
import p104m6.C1606q1;
import p165u6.C2008z;
import p196y6.C2266b;
import p196y6.C2267c;

/* renamed from: k1.c */
/* loaded from: classes.dex */
public final class C1449c implements InterfaceC1295d {

    /* renamed from: a */
    public final Object f6959a;

    /* renamed from: b */
    public Object f6960b;

    /* renamed from: c */
    public final Object f6961c;

    public /* synthetic */ C1449c(C0028o c0028o) {
        this.f6959a = new C1448b();
        this.f6961c = null;
        this.f6961c = c0028o;
    }

    public /* synthetic */ C1449c(InterfaceC1404a interfaceC1404a, EnumC1292a enumC1292a) {
        this.f6959a = new C0143v();
        this.f6960b = interfaceC1404a;
        this.f6961c = enumC1292a;
    }

    public C1449c(C2008z c2008z, String str, String str2) {
        this(new C2267c(c2008z, str, null), str, str2);
    }

    /* renamed from: b */
    public static void m3832b(C2008z c2008z, C2266b c2266b, int i7, int i8) {
        if (i8 <= 255) {
            c2266b.m5487m(i7, i8);
        } else {
            c2266b.m5486l(c2008z.f9143a[i8 & 255]);
        }
    }

    /* renamed from: c */
    public static void m3833c(C2266b c2266b, int i7, int i8, int i9) {
        if (i9 <= i8) {
            c2266b.m5491q();
            c2266b.m5477c(new C1606q1(c2266b.f10333e, (i8 + 1) - i9));
            c2266b.m5476b(c2266b.f10334f.m3953b(C2266b.f10324v, "subargs", C2266b.f10291A, C2266b.f10302L, (short) 182));
            return;
        }
        if (i9 == i8) {
            c2266b.m5491q();
            return;
        }
        c2266b.m5485k(i7, i8, i9 - i8);
        c2266b.m5491q();
        c2266b.m5476b(c2266b.f10334f.m3953b(C2266b.f10325w, "varargsOf", C2266b.f10291A, C2266b.f10311U, (short) 184));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final Object m3834a(Object obj, Object obj2) {
        C1448b c1448b = (C1448b) this.f6959a;
        c1448b.f6957a = obj;
        c1448b.f6958b = obj2;
        Object obj3 = this.f6961c;
        if (obj3 != null) {
            return obj3;
        }
        throw new IllegalArgumentException("You must provide a static value in the constructor , call setValue, or override getValue.");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x043e, code lost:
    
        if (r9 != 0) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0475, code lost:
    
        r10 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0476, code lost:
    
        r6 = r1 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0472, code lost:
    
        if (r14 != 0) goto L176;
     */
    /* JADX WARN: Removed duplicated region for block: B:138:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x067b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1449c(p196y6.C2267c r42, java.lang.String r43, java.lang.String r44) {
        /*
            Method dump skipped, instructions count: 2304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p083k1.C1449c.<init>(y6.c, java.lang.String, java.lang.String):void");
    }
}
