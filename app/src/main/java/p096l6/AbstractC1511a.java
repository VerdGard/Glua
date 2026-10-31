package p096l6;

import java.io.DataOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import p088k6.InterfaceC1466a;

/* renamed from: l6.a */
/* loaded from: classes.dex */
public abstract class AbstractC1511a implements Cloneable, Serializable {

    /* renamed from: c */
    public final int f7137c;

    /* renamed from: e */
    public int f7138e;

    /* renamed from: m */
    public final byte f7139m;

    /* renamed from: s */
    public final C1529o f7140s;

    static {
        new HashMap();
    }

    public AbstractC1511a(byte b7, int i7, int i8, C1529o c1529o) {
        this.f7139m = b7;
        this.f7137c = i7;
        this.f7138e = i8;
        this.f7140s = c1529o;
    }

    /* renamed from: a */
    public void mo3929a(DataOutputStream dataOutputStream) {
        dataOutputStream.writeShort(this.f7137c);
        dataOutputStream.writeInt(this.f7138e);
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e7) {
            e7.printStackTrace();
            return null;
        }
    }

    public String toString() {
        return InterfaceC1466a.f7003l[this.f7139m];
    }
}
