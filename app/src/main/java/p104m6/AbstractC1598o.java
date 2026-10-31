package p104m6;

import java.io.DataOutputStream;
import java.util.HashSet;
import p036e2.C1101u4;

/* renamed from: m6.o */
/* loaded from: classes.dex */
public abstract class AbstractC1598o extends AbstractC1630z0 implements InterfaceC1570e1 {

    /* renamed from: X */
    public int f7385X;

    /* renamed from: m */
    public int f7386m;

    /* renamed from: s */
    public C1564c1 f7387s;

    public AbstractC1598o() {
    }

    public AbstractC1598o(short s7) {
        super(s7, (short) 3);
        m3981g(this.f7387s, null, this);
        this.f7387s = null;
    }

    /* renamed from: g */
    public static final void m3981g(C1564c1 c1564c1, C1564c1 c1564c12, InterfaceC1570e1 interfaceC1570e1) {
        HashSet hashSet;
        if (c1564c1 != null && (hashSet = c1564c1.f7341X) != null) {
            hashSet.remove(interfaceC1570e1);
        }
        if (c1564c12 != null) {
            if (c1564c12.f7341X == null) {
                c1564c12.f7341X = new HashSet();
            }
            c1564c12.f7341X.add(interfaceC1570e1);
        }
    }

    @Override // p104m6.AbstractC1630z0
    /* renamed from: b */
    public void mo3982b() {
        m3981g(this.f7387s, null, this);
        this.f7387s = null;
        this.f7386m = -1;
        this.f7385X = -1;
    }

    @Override // p104m6.AbstractC1630z0
    /* renamed from: c */
    public void mo3965c(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(this.f7437e);
        int m3983f = m3983f();
        this.f7386m = m3983f;
        if (Math.abs(m3983f) >= 32767) {
            throw new C1101u4("Branch target offset too large for short");
        }
        dataOutputStream.writeShort(this.f7386m);
    }

    @Override // p104m6.AbstractC1630z0
    /* renamed from: e */
    public String mo3973e(boolean z6) {
        String stringBuffer;
        String mo3973e = super.mo3973e(z6);
        if (z6) {
            C1564c1 c1564c1 = this.f7387s;
            if (c1564c1 != null) {
                AbstractC1630z0 abstractC1630z0 = c1564c1.f7344m;
                stringBuffer = abstractC1630z0 == this ? "<points to itself>" : abstractC1630z0 == null ? "<null instruction!!!?>" : abstractC1630z0.mo3973e(false);
            }
            stringBuffer = "null";
        } else {
            if (this.f7387s != null) {
                this.f7386m = m3983f();
                StringBuffer stringBuffer2 = new StringBuffer("");
                stringBuffer2.append(this.f7386m + this.f7385X);
                stringBuffer = stringBuffer2.toString();
            }
            stringBuffer = "null";
        }
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append(mo3973e);
        stringBuffer3.append(" -> ");
        stringBuffer3.append(stringBuffer);
        return stringBuffer3.toString();
    }

    /* renamed from: f */
    public final int m3983f() {
        C1564c1 c1564c1 = this.f7387s;
        if (c1564c1 == null) {
            StringBuffer stringBuffer = new StringBuffer("Target of ");
            stringBuffer.append(super.mo3973e(true));
            stringBuffer.append(" is invalid null handle");
            throw new C1101u4(stringBuffer.toString());
        }
        int mo3955b = c1564c1.mo3955b();
        if (mo3955b >= 0) {
            return mo3955b - this.f7385X;
        }
        StringBuffer stringBuffer2 = new StringBuffer("Invalid branch target position offset for ");
        stringBuffer2.append(super.mo3973e(true));
        stringBuffer2.append(":");
        stringBuffer2.append(mo3955b);
        stringBuffer2.append(":");
        stringBuffer2.append(c1564c1);
        throw new C1101u4(stringBuffer2.toString());
    }

    /* renamed from: h */
    public int mo3974h(int i7, int i8) {
        this.f7385X += i7;
        return 0;
    }
}
