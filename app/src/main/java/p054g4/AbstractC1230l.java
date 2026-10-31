package p054g4;

import java.io.IOException;
import java.io.StringWriter;
import p078j4.C1427p;
import p117o4.C1668b;

/* renamed from: g4.l */
/* loaded from: classes.dex */
public abstract class AbstractC1230l {
    @Deprecated
    public AbstractC1230l() {
    }

    /* renamed from: a */
    public final C1233o m3450a() {
        if (this instanceof C1233o) {
            return (C1233o) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    /* renamed from: b */
    public String mo3447b() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C1668b c1668b = new C1668b(stringWriter);
            c1668b.f7536X = true;
            C1427p.f6854z.m3800d(c1668b, this);
            return stringWriter.toString();
        } catch (IOException e7) {
            throw new AssertionError(e7);
        }
    }
}
