package p096l6;

import java.io.Serializable;

/* renamed from: l6.w */
/* loaded from: classes.dex */
public final class C1537w implements Cloneable, Serializable {

    /* renamed from: c */
    public final int f7191c;

    /* renamed from: e */
    public final int f7192e;

    public C1537w(int i7, int i8) {
        this.f7191c = i7;
        this.f7192e = i8;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("LineNumber(");
        stringBuffer.append(this.f7191c);
        stringBuffer.append(", ");
        stringBuffer.append(this.f7192e);
        stringBuffer.append(")");
        return stringBuffer.toString();
    }
}
