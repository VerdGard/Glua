package p172v6;

import java.io.DataOutputStream;
import java.io.OutputStream;
import p165u6.AbstractC2003u;
import p165u6.C1983c;
import p165u6.C1985d;
import p165u6.C1993k;
import p165u6.C1998p;
import p165u6.C2008z;

/* renamed from: v6.b */
/* loaded from: classes.dex */
public final class C2034b {

    /* renamed from: a */
    public final DataOutputStream f9221a;

    /* renamed from: b */
    public final boolean f9222b;

    public C2034b(OutputStream outputStream, boolean z6) {
        this.f9221a = new DataOutputStream(outputStream);
        this.f9222b = z6;
    }

    /* renamed from: a */
    public static void m4931a(C2008z c2008z, OutputStream outputStream, boolean z6) {
        C2034b c2034b = new C2034b(outputStream, z6);
        DataOutputStream dataOutputStream = c2034b.f9221a;
        dataOutputStream.write(C1983c.f8965g);
        dataOutputStream.write(82);
        dataOutputStream.write(0);
        dataOutputStream.write(0);
        dataOutputStream.write(4);
        dataOutputStream.write(4);
        dataOutputStream.write(4);
        dataOutputStream.write(8);
        dataOutputStream.write(0);
        dataOutputStream.write(C1983c.f8966h);
        c2034b.m4932b(c2008z);
    }

    /* renamed from: b */
    public final void m4932b(C2008z c2008z) {
        m4933c(c2008z.f9150h);
        m4933c(c2008z.f9151i);
        int i7 = c2008z.f9152j;
        DataOutputStream dataOutputStream = this.f9221a;
        dataOutputStream.write(i7);
        dataOutputStream.write(c2008z.f9153k);
        dataOutputStream.write(c2008z.f9154l);
        int[] iArr = c2008z.f9144b;
        m4933c(iArr.length);
        for (int i8 : iArr) {
            m4933c(i8);
        }
        AbstractC2003u[] abstractC2003uArr = c2008z.f9143a;
        m4933c(abstractC2003uArr.length);
        for (AbstractC2003u abstractC2003u : abstractC2003uArr) {
            int mo4675t2 = abstractC2003u.mo4675t2();
            if (mo4675t2 == 0) {
                dataOutputStream.write(0);
            } else if (mo4675t2 == 1) {
                dataOutputStream.write(1);
                dataOutputStream.write(abstractC2003u.mo4682m2() ? 1 : 0);
            } else if (mo4675t2 == 3) {
                dataOutputStream.write(3);
                dataOutputStream.writeLong(Double.doubleToLongBits(abstractC2003u.mo4744n2()));
            } else {
                if (mo4675t2 != 4) {
                    throw new IllegalArgumentException("bad type for " + abstractC2003u);
                }
                dataOutputStream.write(4);
                m4934d((C1998p) abstractC2003u);
            }
        }
        int length = c2008z.f9145c.length;
        m4933c(length);
        for (int i9 = 0; i9 < length; i9++) {
            m4932b(c2008z.f9145c[i9]);
        }
        int length2 = c2008z.f9148f.length;
        m4933c(length2);
        for (int i10 = 0; i10 < length2; i10++) {
            dataOutputStream.writeByte(c2008z.f9148f[i10].f8962b ? 1 : 0);
            dataOutputStream.writeByte(c2008z.f9148f[i10].f8963c);
        }
        boolean z6 = this.f9222b;
        if (z6) {
            m4933c(0);
        } else {
            m4934d(c2008z.f9149g);
        }
        int length3 = z6 ? 0 : c2008z.f9146d.length;
        m4933c(length3);
        for (int i11 = 0; i11 < length3; i11++) {
            m4933c(c2008z.f9146d[i11]);
        }
        int length4 = z6 ? 0 : c2008z.f9147e.length;
        m4933c(length4);
        for (int i12 = 0; i12 < length4; i12++) {
            C1985d c1985d = c2008z.f9147e[i12];
            m4934d(c1985d.f8986a);
            m4933c(c1985d.f8987b);
            m4933c(c1985d.f8988c);
        }
        int length5 = z6 ? 0 : c2008z.f9148f.length;
        m4933c(length5);
        for (int i13 = 0; i13 < length5; i13++) {
            m4934d(c2008z.f9148f[i13].f8961a);
        }
    }

    /* renamed from: c */
    public final void m4933c(int i7) {
        this.f9221a.writeInt(i7);
    }

    /* renamed from: d */
    public final void m4934d(C1998p c1998p) {
        int i7 = (int) ((C1993k) c1998p.mo4793j1()).f9024d2;
        m4933c(i7 + 1);
        DataOutputStream dataOutputStream = this.f9221a;
        dataOutputStream.write(c1998p.f9039c2, c1998p.f9040d2 + 0, i7);
        dataOutputStream.write(0);
    }
}
