package p158t6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p134q6.C1806b;
import p142r6.C1852i;

/* renamed from: t6.b */
/* loaded from: classes.dex */
public abstract class AbstractC1947b extends AbstractC1949d {

    /* renamed from: b */
    public int f8765b = 0;

    /* renamed from: a */
    public final ArrayList<AbstractC1949d> f8764a = new ArrayList<>();

    /* renamed from: t6.b$a */
    public static final class a extends AbstractC1947b {
        public a(List list) {
            this.f8764a.addAll(list);
            this.f8765b = this.f8764a.size();
        }

        public a(AbstractC1949d... abstractC1949dArr) {
            this(Arrays.asList(abstractC1949dArr));
        }

        @Override // p158t6.AbstractC1949d
        /* renamed from: a */
        public final boolean mo4546a(C1852i c1852i, C1852i c1852i2) {
            for (int i7 = 0; i7 < this.f8765b; i7++) {
                if (!this.f8764a.get(i7).mo4546a(c1852i, c1852i2)) {
                    return false;
                }
            }
            return true;
        }

        public final String toString() {
            return C1806b.m4262f(this.f8764a, " ");
        }
    }

    /* renamed from: t6.b$b */
    public static final class b extends AbstractC1947b {
        public b() {
        }

        public b(AbstractC1949d... abstractC1949dArr) {
            List asList = Arrays.asList(abstractC1949dArr);
            if (this.f8765b > 1) {
                this.f8764a.add(new a(asList));
            } else {
                this.f8764a.addAll(asList);
            }
            this.f8765b = this.f8764a.size();
        }

        @Override // p158t6.AbstractC1949d
        /* renamed from: a */
        public final boolean mo4546a(C1852i c1852i, C1852i c1852i2) {
            for (int i7 = 0; i7 < this.f8765b; i7++) {
                if (this.f8764a.get(i7).mo4546a(c1852i, c1852i2)) {
                    return true;
                }
            }
            return false;
        }

        public final String toString() {
            return C1806b.m4262f(this.f8764a, ", ");
        }
    }
}
