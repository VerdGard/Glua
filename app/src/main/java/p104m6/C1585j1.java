package p104m6;

import java.io.Serializable;

/* renamed from: m6.j1 */
/* loaded from: classes.dex */
public final class C1585j1 implements InterfaceC1570e1, Cloneable, Serializable {

    /* renamed from: c */
    public C1564c1 f7359c;

    /* renamed from: e */
    public int f7360e;

    public C1585j1(C1564c1 c1564c1, int i7) {
        AbstractC1598o.m3981g(this.f7359c, c1564c1, this);
        this.f7359c = c1564c1;
        this.f7360e = i7;
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e7) {
            System.err.println(e7);
            return null;
        }
    }
}
