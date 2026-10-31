package p070i4;

import java.math.BigDecimal;

/* renamed from: i4.m */
/* loaded from: classes.dex */
public final class C1347m extends Number {

    /* renamed from: c */
    public final String f6570c;

    public C1347m(String str) {
        this.f6570c = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f6570c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1347m)) {
            return false;
        }
        Object obj2 = ((C1347m) obj).f6570c;
        String str = this.f6570c;
        return str == obj2 || str.equals(obj2);
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f6570c);
    }

    public final int hashCode() {
        return this.f6570c.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f6570c;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f6570c;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return new BigDecimal(str).longValue();
        }
    }

    public final String toString() {
        return this.f6570c;
    }
}
