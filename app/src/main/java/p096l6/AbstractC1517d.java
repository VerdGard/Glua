package p096l6;

import java.io.DataOutputStream;
import java.io.Serializable;
import p088k6.InterfaceC1466a;
import p192y2.C2231a;

/* renamed from: l6.d */
/* loaded from: classes.dex */
public abstract class AbstractC1517d implements Cloneable, Serializable {

    /* renamed from: e */
    public static final C2231a f7152e = new C2231a(1);

    /* renamed from: c */
    public final byte f7153c;

    public AbstractC1517d(byte b7) {
        this.f7153c = b7;
    }

    /* renamed from: a */
    public abstract void mo3930a(DataOutputStream dataOutputStream);

    public final Object clone() {
        return super.clone();
    }

    public final boolean equals(Object obj) {
        return f7152e.m5416a(this, obj);
    }

    public final int hashCode() {
        return f7152e.m5417b(this);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String[] strArr = InterfaceC1466a.f6995b;
        byte b7 = this.f7153c;
        stringBuffer.append(strArr[b7]);
        stringBuffer.append("[");
        stringBuffer.append((int) b7);
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
