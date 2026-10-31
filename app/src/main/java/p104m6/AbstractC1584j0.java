package p104m6;

import java.util.ArrayList;
import p160u0.C1966c;

/* renamed from: m6.j0 */
/* loaded from: classes.dex */
public abstract class AbstractC1584j0 extends AbstractC1587k0 {

    /* renamed from: s */
    public final /* synthetic */ int f7358s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC1584j0(short s7, int i7, int i8) {
        super(s7, i7);
        this.f7358s = i8;
    }

    @Override // p104m6.AbstractC1630z0
    /* renamed from: a */
    public int mo3969a(C1610s c1610s) {
        switch (this.f7358s) {
            case 1:
                String m3972g = m3972g(c1610s);
                C1592m c1592m = AbstractC1624w1.f7427m;
                ArrayList arrayList = new ArrayList();
                try {
                    if (m3972g.charAt(0) != '(') {
                        throw new C1966c("Invalid method signature: ".concat(m3972g));
                    }
                    for (int i7 = 1; m3972g.charAt(i7) != ')'; i7 += ((Integer) AbstractC1624w1.f7423D1.get()).intValue()) {
                        arrayList.add(AbstractC1624w1.m3993c(m3972g.substring(i7)));
                    }
                    int size = arrayList.size();
                    AbstractC1624w1[] abstractC1624w1Arr = new AbstractC1624w1[size];
                    arrayList.toArray(abstractC1624w1Arr);
                    int i8 = this.f7437e == 184 ? 0 : 1;
                    for (int i9 = 0; i9 < size; i9++) {
                        i8 += abstractC1624w1Arr[i9].m3994b();
                    }
                    return i8;
                } catch (StringIndexOutOfBoundsException unused) {
                    StringBuffer stringBuffer = new StringBuffer("Invalid method signature: ");
                    stringBuffer.append(m3972g);
                    throw new C1966c(stringBuffer.toString());
                }
            default:
                return super.mo3969a(c1610s);
        }
    }

    @Override // p104m6.AbstractC1630z0
    /* renamed from: d */
    public int mo3970d(C1610s c1610s) {
        switch (this.f7358s) {
            case 1:
                String m3972g = m3972g(c1610s);
                C1592m c1592m = AbstractC1624w1.f7427m;
                try {
                    return AbstractC1624w1.m3993c(m3972g.substring(m3972g.lastIndexOf(41) + 1)).m3994b();
                } catch (StringIndexOutOfBoundsException unused) {
                    StringBuffer stringBuffer = new StringBuffer("Invalid method signature: ");
                    stringBuffer.append(m3972g);
                    throw new C1966c(stringBuffer.toString());
                }
            default:
                return super.mo3970d(c1610s);
        }
    }

    /* renamed from: h */
    public final int m3971h(C1610s c1610s) {
        return AbstractC1624w1.m3993c(m3972g(c1610s)).m3994b();
    }
}
