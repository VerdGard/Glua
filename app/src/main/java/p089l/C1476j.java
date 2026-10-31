package p089l;

import android.ext.C0090b;
import java.util.Arrays;
import p032d6.C0898f;
import p195y5.C2255c;

/* renamed from: l.j */
/* loaded from: classes.dex */
public final class C1476j extends AbstractC1470d {
    public C1476j() {
        super(16);
    }

    /* renamed from: b */
    public final void m3865b(int i7) {
        int[] iArr = this.f7023a;
        if (iArr.length < i7) {
            int[] copyOf = Arrays.copyOf(iArr, Math.max(i7, (iArr.length * 3) / 2));
            C0898f.m2605d(copyOf, "copyOf(this, newSize)");
            this.f7023a = copyOf;
        }
    }

    /* renamed from: c */
    public final void m3866c(int i7, int i8) {
        boolean z6 = false;
        if (i7 >= 0 && i7 <= this.f7024b) {
            if (i8 >= 0 && i8 <= this.f7024b) {
                z6 = true;
            }
            if (z6) {
                if (i8 < i7) {
                    throw new IllegalArgumentException("Start (" + i7 + ") is more than end (" + i8 + ')');
                }
                if (i8 != i7) {
                    int i9 = this.f7024b;
                    if (i8 < i9) {
                        int[] iArr = this.f7023a;
                        C2255c.m5463F0(i7, i8, i9, iArr, iArr);
                    }
                    this.f7024b -= i8 - i7;
                    return;
                }
                return;
            }
        }
        throw new IndexOutOfBoundsException("Start (" + i7 + ") and end (" + i8 + ") must be in 0.." + this.f7024b);
    }

    /* renamed from: d */
    public final void m3867d(int i7, int i8) {
        if (!(i7 >= 0 && i7 < this.f7024b)) {
            StringBuilder m221g = C0090b.m221g("set index ", i7, " must be between 0 .. ");
            m221g.append(this.f7024b - 1);
            throw new IndexOutOfBoundsException(m221g.toString());
        }
        int[] iArr = this.f7023a;
        int i9 = iArr[i7];
        iArr[i7] = i8;
    }
}
