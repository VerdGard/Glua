package p054g4;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;
import p070i4.C1347m;

/* renamed from: g4.q */
/* loaded from: classes.dex */
public final class C1235q extends AbstractC1230l {

    /* renamed from: c */
    public final Serializable f5979c;

    public C1235q(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f5979c = bool;
    }

    public C1235q(Number number) {
        Objects.requireNonNull(number);
        this.f5979c = number;
    }

    public C1235q(String str) {
        Objects.requireNonNull(str);
        this.f5979c = str;
    }

    /* renamed from: e */
    public static boolean m3452e(C1235q c1235q) {
        Serializable serializable = c1235q.f5979c;
        if (serializable instanceof Number) {
            Number number = (Number) serializable;
            if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
                return true;
            }
        }
        return false;
    }

    @Override // p054g4.AbstractC1230l
    /* renamed from: b */
    public final String mo3447b() {
        Serializable serializable = this.f5979c;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return m3454d().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    /* renamed from: c */
    public final boolean m3453c() {
        Serializable serializable = this.f5979c;
        return serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(mo3447b());
    }

    /* renamed from: d */
    public final Number m3454d() {
        Serializable serializable = this.f5979c;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new C1347m((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1235q.class != obj.getClass()) {
            return false;
        }
        C1235q c1235q = (C1235q) obj;
        Serializable serializable = this.f5979c;
        Serializable serializable2 = c1235q.f5979c;
        if (serializable == null) {
            return serializable2 == null;
        }
        if (m3452e(this) && m3452e(c1235q)) {
            return m3454d().longValue() == c1235q.m3454d().longValue();
        }
        if (!(serializable instanceof Number) || !(serializable2 instanceof Number)) {
            return serializable.equals(serializable2);
        }
        double doubleValue = m3454d().doubleValue();
        double doubleValue2 = c1235q.m3454d().doubleValue();
        if (doubleValue != doubleValue2) {
            return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
        }
        return true;
    }

    public final int hashCode() {
        long doubleToLongBits;
        Serializable serializable = this.f5979c;
        if (serializable == null) {
            return 31;
        }
        if (m3452e(this)) {
            doubleToLongBits = m3454d().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(m3454d().doubleValue());
        }
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }
}
