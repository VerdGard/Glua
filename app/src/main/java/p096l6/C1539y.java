package p096l6;

import java.io.Serializable;
import p088k6.InterfaceC1466a;

/* renamed from: l6.y */
/* loaded from: classes.dex */
public final class C1539y implements InterfaceC1466a, Cloneable, Serializable {

    /* renamed from: X */
    public final int f7195X;

    /* renamed from: Y */
    public final C1529o f7196Y;

    /* renamed from: c */
    public final int f7197c;

    /* renamed from: e */
    public final int f7198e;

    /* renamed from: m */
    public final int f7199m;

    /* renamed from: s */
    public final int f7200s;

    public C1539y(int i7, int i8, int i9, int i10, int i11, C1529o c1529o) {
        this.f7197c = i7;
        this.f7198e = i8;
        this.f7199m = i9;
        this.f7200s = i10;
        this.f7195X = i11;
        this.f7196Y = c1529o;
    }

    public final String toString() {
        int i7 = this.f7199m;
        C1529o c1529o = this.f7196Y;
        C1531q c1531q = (C1531q) c1529o.m3937b((byte) 1, i7);
        String m3935e = AbstractC1518d0.m3935e(((C1531q) c1529o.m3937b((byte) 1, this.f7200s)).f7168m, true);
        StringBuffer stringBuffer = new StringBuffer("LocalVariable(start_pc = ");
        stringBuffer.append(this.f7197c);
        stringBuffer.append(", length = ");
        stringBuffer.append(this.f7198e);
        stringBuffer.append(", index = ");
        stringBuffer.append(this.f7195X);
        stringBuffer.append(":");
        stringBuffer.append(m3935e);
        stringBuffer.append(" ");
        stringBuffer.append(c1531q.f7168m);
        stringBuffer.append(")");
        return stringBuffer.toString();
    }
}
