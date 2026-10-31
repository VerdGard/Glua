package p096l6;

import java.io.DataOutputStream;
import p032d6.AbstractC0899g;

/* renamed from: l6.u */
/* loaded from: classes.dex */
public abstract class AbstractC1535u extends AbstractC0899g implements Cloneable {

    /* renamed from: X */
    public int f7171X;

    /* renamed from: Y */
    public AbstractC1511a[] f7172Y;

    /* renamed from: Z */
    public final C1529o f7173Z;

    /* renamed from: m */
    public final int f7174m;

    /* renamed from: s */
    public final int f7175s;

    public AbstractC1535u() {
    }

    public AbstractC1535u(int i7, int i8, int i9, AbstractC1511a[] abstractC1511aArr, C1529o c1529o) {
        this.f4690e = i7;
        this.f7174m = i8;
        this.f7175s = i9;
        this.f7173Z = c1529o;
        this.f7172Y = abstractC1511aArr;
        this.f7171X = abstractC1511aArr.length;
    }

    /* renamed from: d */
    public final void m3940d(DataOutputStream dataOutputStream) {
        dataOutputStream.writeShort(this.f4690e);
        dataOutputStream.writeShort(this.f7174m);
        dataOutputStream.writeShort(this.f7175s);
        dataOutputStream.writeShort(this.f7171X);
        for (int i7 = 0; i7 < this.f7171X; i7++) {
            this.f7172Y[i7].mo3929a(dataOutputStream);
        }
    }

    /* renamed from: e */
    public final String m3941e() {
        return ((C1531q) this.f7173Z.m3937b((byte) 1, this.f7174m)).f7168m;
    }

    /* renamed from: f */
    public final String m3942f() {
        return ((C1531q) this.f7173Z.m3937b((byte) 1, this.f7175s)).f7168m;
    }
}
