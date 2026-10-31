package p104m6;

import java.io.DataOutputStream;
import p036e2.C1101u4;

/* renamed from: m6.m1 */
/* loaded from: classes.dex */
public abstract class AbstractC1594m1 extends AbstractC1630z0 implements InterfaceC1628y0 {

    /* renamed from: m */
    public int f7368m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1594m1(short s7, short s8, int i7) {
        super(s7, (short) 2);
        short s9 = 2;
        this.f7368m = -1;
        if (i7 < 0 || i7 > 65535) {
            StringBuffer stringBuffer = new StringBuffer("Illegal value: ");
            stringBuffer.append(i7);
            throw new C1101u4(stringBuffer.toString());
        }
        this.f7368m = i7;
        if (i7 < 0 || i7 > 3) {
            this.f7437e = s7;
            if (i7 > 255) {
                s9 = 4;
            }
        } else {
            this.f7437e = (short) (s8 + i7);
            s9 = 1;
        }
        this.f7436c = s9;
    }

    @Override // p104m6.AbstractC1630z0
    /* renamed from: c */
    public final void mo3965c(DataOutputStream dataOutputStream) {
        if (this.f7368m > 255) {
            dataOutputStream.writeByte(196);
        }
        dataOutputStream.writeByte(this.f7437e);
        if (this.f7436c > 1) {
            int i7 = this.f7368m;
            if (i7 > 255) {
                dataOutputStream.writeShort(i7);
            } else {
                dataOutputStream.writeByte(i7);
            }
        }
    }

    @Override // p104m6.AbstractC1630z0
    /* renamed from: e */
    public final String mo3973e(boolean z6) {
        short s7 = this.f7437e;
        if ((s7 >= 26 && s7 <= 45) || (s7 >= 59 && s7 <= 78)) {
            return super.mo3973e(z6);
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.mo3973e(z6));
        stringBuffer.append(" ");
        stringBuffer.append(this.f7368m);
        return stringBuffer.toString();
    }

    @Override // p104m6.InterfaceC1628y0
    public final int getIndex() {
        return this.f7368m;
    }
}
