package p104m6;

import java.util.ArrayList;
import p032d6.AbstractC0899g;
import p096l6.AbstractC1511a;

/* renamed from: m6.i0 */
/* loaded from: classes.dex */
public abstract class AbstractC1581i0 extends AbstractC0899g implements Cloneable {

    /* renamed from: X */
    public C1610s f7352X;

    /* renamed from: Y */
    public final ArrayList f7353Y = new ArrayList();

    /* renamed from: m */
    public String f7354m;

    /* renamed from: s */
    public AbstractC1624w1 f7355s;

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e7) {
            System.err.println(e7);
            return null;
        }
    }

    /* renamed from: d */
    public final AbstractC1511a[] m3967d() {
        ArrayList arrayList = this.f7353Y;
        AbstractC1511a[] abstractC1511aArr = new AbstractC1511a[arrayList.size()];
        arrayList.toArray(abstractC1511aArr);
        return abstractC1511aArr;
    }

    /* renamed from: e */
    public final void m3968e(AbstractC1624w1 abstractC1624w1) {
        if (abstractC1624w1.f7433c != 16) {
            this.f7355s = abstractC1624w1;
        } else {
            StringBuffer stringBuffer = new StringBuffer("Type can not be ");
            stringBuffer.append(abstractC1624w1);
            throw new IllegalArgumentException(stringBuffer.toString());
        }
    }
}
