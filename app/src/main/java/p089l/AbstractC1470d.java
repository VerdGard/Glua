package p089l;

import android.ext.C0090b;
import p032d6.C0898f;
import p056g6.C1266c;

/* renamed from: l.d */
/* loaded from: classes.dex */
public abstract class AbstractC1470d {

    /* renamed from: a */
    public int[] f7023a;

    /* renamed from: b */
    public int f7024b;

    public AbstractC1470d(int i7) {
        this.f7023a = i7 == 0 ? C1472f.f7028a : new int[i7];
    }

    /* renamed from: a */
    public final int m3852a(int i7) {
        boolean z6 = false;
        if (i7 >= 0 && i7 < this.f7024b) {
            z6 = true;
        }
        if (z6) {
            return this.f7023a[i7];
        }
        StringBuilder m221g = C0090b.m221g("Index ", i7, " must be in 0..");
        m221g.append(this.f7024b - 1);
        throw new IndexOutOfBoundsException(m221g.toString());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AbstractC1470d) {
            AbstractC1470d abstractC1470d = (AbstractC1470d) obj;
            int i7 = abstractC1470d.f7024b;
            int i8 = this.f7024b;
            if (i7 == i8) {
                int[] iArr = this.f7023a;
                int[] iArr2 = abstractC1470d.f7023a;
                C1266c c1266c = i8 <= Integer.MIN_VALUE ? C1266c.f6312s : new C1266c(0, i8 - 1);
                int i9 = c1266c.f6305c;
                int i10 = c1266c.f6306e;
                if (i9 > i10) {
                    return true;
                }
                while (iArr[i9] == iArr2[i9]) {
                    if (i9 == i10) {
                        return true;
                    }
                    i9++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.f7023a;
        int i7 = this.f7024b;
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            i8 += iArr[i9] * 31;
        }
        return i8;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.f7023a;
        int i7 = this.f7024b;
        int i8 = 0;
        while (true) {
            if (i8 >= i7) {
                sb.append((CharSequence) "]");
                break;
            }
            int i9 = iArr[i8];
            if (i8 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i8 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(i9);
            i8++;
        }
        String sb2 = sb.toString();
        C0898f.m2605d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
