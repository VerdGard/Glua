package p078j4;

import android.ext.C0090b;
import java.io.Reader;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import p054g4.C1228j;
import p054g4.C1232n;
import p054g4.C1233o;
import p054g4.C1235q;
import p070i4.C1348n;
import p117o4.C1667a;
import p117o4.C1669c;
import p120p.C1686g;

/* renamed from: j4.e */
/* loaded from: classes.dex */
public final class C1416e extends C1667a {

    /* renamed from: I1 */
    public static final Object f6785I1;

    /* renamed from: E1 */
    public Object[] f6786E1;

    /* renamed from: F1 */
    public int f6787F1;

    /* renamed from: G1 */
    public String[] f6788G1;

    /* renamed from: H1 */
    public int[] f6789H1;

    /* renamed from: j4.e$a */
    public class a extends Reader {
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public final int read(char[] cArr, int i7, int i8) {
            throw new AssertionError();
        }
    }

    static {
        new a();
        f6785I1 = new Object();
    }

    /* renamed from: i */
    private String m3763i(boolean z6) {
        StringBuilder sb = new StringBuilder("$");
        int i7 = 0;
        while (true) {
            int i8 = this.f6787F1;
            if (i7 >= i8) {
                return sb.toString();
            }
            Object[] objArr = this.f6786E1;
            Object obj = objArr[i7];
            if (obj instanceof C1228j) {
                i7++;
                if (i7 < i8 && (objArr[i7] instanceof Iterator)) {
                    int i9 = this.f6789H1[i7];
                    if (z6 && i9 > 0 && (i7 == i8 - 1 || i7 == i8 - 2)) {
                        i9--;
                    }
                    sb.append('[');
                    sb.append(i9);
                    sb.append(']');
                }
            } else if ((obj instanceof C1233o) && (i7 = i7 + 1) < i8 && (objArr[i7] instanceof Iterator)) {
                sb.append('.');
                String str = this.f6788G1[i7];
                if (str != null) {
                    sb.append(str);
                }
            }
            i7++;
        }
    }

    /* renamed from: m */
    private String m3764m() {
        return " at path " + m3763i(false);
    }

    @Override // p117o4.C1667a
    /* renamed from: D */
    public final void mo3765D() {
        int m4108c = C1686g.m4108c(mo3785x());
        if (m4108c == 1) {
            mo3773e();
            return;
        }
        if (m4108c != 9) {
            if (m4108c == 3) {
                mo3774f();
                return;
            }
            if (m4108c == 4) {
                m3767G(true);
                return;
            }
            m3769I();
            int i7 = this.f6787F1;
            if (i7 > 0) {
                int[] iArr = this.f6789H1;
                int i8 = i7 - 1;
                iArr[i8] = iArr[i8] + 1;
            }
        }
    }

    /* renamed from: F */
    public final void m3766F(int i7) {
        if (mo3785x() == i7) {
            return;
        }
        throw new IllegalStateException("Expected " + C0090b.m224j(i7) + " but was " + C0090b.m224j(mo3785x()) + m3764m());
    }

    /* renamed from: G */
    public final String m3767G(boolean z6) {
        m3766F(5);
        Map.Entry entry = (Map.Entry) ((Iterator) m3768H()).next();
        String str = (String) entry.getKey();
        this.f6788G1[this.f6787F1 - 1] = z6 ? "<skipped>" : str;
        m3770J(entry.getValue());
        return str;
    }

    /* renamed from: H */
    public final Object m3768H() {
        return this.f6786E1[this.f6787F1 - 1];
    }

    /* renamed from: I */
    public final Object m3769I() {
        Object[] objArr = this.f6786E1;
        int i7 = this.f6787F1 - 1;
        this.f6787F1 = i7;
        Object obj = objArr[i7];
        objArr[i7] = null;
        return obj;
    }

    /* renamed from: J */
    public final void m3770J(Object obj) {
        int i7 = this.f6787F1;
        Object[] objArr = this.f6786E1;
        if (i7 == objArr.length) {
            int i8 = i7 * 2;
            this.f6786E1 = Arrays.copyOf(objArr, i8);
            this.f6789H1 = Arrays.copyOf(this.f6789H1, i8);
            this.f6788G1 = (String[]) Arrays.copyOf(this.f6788G1, i8);
        }
        Object[] objArr2 = this.f6786E1;
        int i9 = this.f6787F1;
        this.f6787F1 = i9 + 1;
        objArr2[i9] = obj;
    }

    @Override // p117o4.C1667a
    /* renamed from: a */
    public final void mo3771a() {
        m3766F(1);
        m3770J(((C1228j) m3768H()).iterator());
        this.f6789H1[this.f6787F1 - 1] = 0;
    }

    @Override // p117o4.C1667a
    /* renamed from: b */
    public final void mo3772b() {
        m3766F(3);
        m3770J(new C1348n.b.a((C1348n.b) ((C1233o) m3768H()).f5978c.entrySet()));
    }

    @Override // p117o4.C1667a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f6786E1 = new Object[]{f6785I1};
        this.f6787F1 = 1;
    }

    @Override // p117o4.C1667a
    /* renamed from: e */
    public final void mo3773e() {
        m3766F(2);
        m3769I();
        m3769I();
        int i7 = this.f6787F1;
        if (i7 > 0) {
            int[] iArr = this.f6789H1;
            int i8 = i7 - 1;
            iArr[i8] = iArr[i8] + 1;
        }
    }

    @Override // p117o4.C1667a
    /* renamed from: f */
    public final void mo3774f() {
        m3766F(4);
        this.f6788G1[this.f6787F1 - 1] = null;
        m3769I();
        m3769I();
        int i7 = this.f6787F1;
        if (i7 > 0) {
            int[] iArr = this.f6789H1;
            int i8 = i7 - 1;
            iArr[i8] = iArr[i8] + 1;
        }
    }

    @Override // p117o4.C1667a
    /* renamed from: h */
    public final String mo3775h() {
        return m3763i(false);
    }

    @Override // p117o4.C1667a
    /* renamed from: j */
    public final String mo3776j() {
        return m3763i(true);
    }

    @Override // p117o4.C1667a
    /* renamed from: k */
    public final boolean mo3777k() {
        int mo3785x = mo3785x();
        return (mo3785x == 4 || mo3785x == 2 || mo3785x == 10) ? false : true;
    }

    @Override // p117o4.C1667a
    /* renamed from: n */
    public final boolean mo3778n() {
        m3766F(8);
        boolean m3453c = ((C1235q) m3769I()).m3453c();
        int i7 = this.f6787F1;
        if (i7 > 0) {
            int[] iArr = this.f6789H1;
            int i8 = i7 - 1;
            iArr[i8] = iArr[i8] + 1;
        }
        return m3453c;
    }

    @Override // p117o4.C1667a
    /* renamed from: o */
    public final double mo3779o() {
        int mo3785x = mo3785x();
        if (mo3785x != 7 && mo3785x != 6) {
            throw new IllegalStateException("Expected " + C0090b.m224j(7) + " but was " + C0090b.m224j(mo3785x) + m3764m());
        }
        C1235q c1235q = (C1235q) m3768H();
        double doubleValue = c1235q.f5979c instanceof Number ? c1235q.m3454d().doubleValue() : Double.parseDouble(c1235q.mo3447b());
        if (!this.f7527e && (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue))) {
            throw new C1669c("JSON forbids NaN and infinities: " + doubleValue);
        }
        m3769I();
        int i7 = this.f6787F1;
        if (i7 > 0) {
            int[] iArr = this.f6789H1;
            int i8 = i7 - 1;
            iArr[i8] = iArr[i8] + 1;
        }
        return doubleValue;
    }

    @Override // p117o4.C1667a
    /* renamed from: p */
    public final int mo3780p() {
        int mo3785x = mo3785x();
        if (mo3785x != 7 && mo3785x != 6) {
            throw new IllegalStateException("Expected " + C0090b.m224j(7) + " but was " + C0090b.m224j(mo3785x) + m3764m());
        }
        C1235q c1235q = (C1235q) m3768H();
        int intValue = c1235q.f5979c instanceof Number ? c1235q.m3454d().intValue() : Integer.parseInt(c1235q.mo3447b());
        m3769I();
        int i7 = this.f6787F1;
        if (i7 > 0) {
            int[] iArr = this.f6789H1;
            int i8 = i7 - 1;
            iArr[i8] = iArr[i8] + 1;
        }
        return intValue;
    }

    @Override // p117o4.C1667a
    /* renamed from: q */
    public final long mo3781q() {
        int mo3785x = mo3785x();
        if (mo3785x != 7 && mo3785x != 6) {
            throw new IllegalStateException("Expected " + C0090b.m224j(7) + " but was " + C0090b.m224j(mo3785x) + m3764m());
        }
        C1235q c1235q = (C1235q) m3768H();
        long longValue = c1235q.f5979c instanceof Number ? c1235q.m3454d().longValue() : Long.parseLong(c1235q.mo3447b());
        m3769I();
        int i7 = this.f6787F1;
        if (i7 > 0) {
            int[] iArr = this.f6789H1;
            int i8 = i7 - 1;
            iArr[i8] = iArr[i8] + 1;
        }
        return longValue;
    }

    @Override // p117o4.C1667a
    /* renamed from: r */
    public final String mo3782r() {
        return m3767G(false);
    }

    @Override // p117o4.C1667a
    /* renamed from: t */
    public final void mo3783t() {
        m3766F(9);
        m3769I();
        int i7 = this.f6787F1;
        if (i7 > 0) {
            int[] iArr = this.f6789H1;
            int i8 = i7 - 1;
            iArr[i8] = iArr[i8] + 1;
        }
    }

    @Override // p117o4.C1667a
    public final String toString() {
        return C1416e.class.getSimpleName() + m3764m();
    }

    @Override // p117o4.C1667a
    /* renamed from: v */
    public final String mo3784v() {
        int mo3785x = mo3785x();
        if (mo3785x != 6 && mo3785x != 7) {
            throw new IllegalStateException("Expected " + C0090b.m224j(6) + " but was " + C0090b.m224j(mo3785x) + m3764m());
        }
        String mo3447b = ((C1235q) m3769I()).mo3447b();
        int i7 = this.f6787F1;
        if (i7 > 0) {
            int[] iArr = this.f6789H1;
            int i8 = i7 - 1;
            iArr[i8] = iArr[i8] + 1;
        }
        return mo3447b;
    }

    @Override // p117o4.C1667a
    /* renamed from: x */
    public final int mo3785x() {
        if (this.f6787F1 == 0) {
            return 10;
        }
        Object m3768H = m3768H();
        if (m3768H instanceof Iterator) {
            boolean z6 = this.f6786E1[this.f6787F1 - 2] instanceof C1233o;
            Iterator it = (Iterator) m3768H;
            if (!it.hasNext()) {
                return z6 ? 4 : 2;
            }
            if (z6) {
                return 5;
            }
            m3770J(it.next());
            return mo3785x();
        }
        if (m3768H instanceof C1233o) {
            return 3;
        }
        if (m3768H instanceof C1228j) {
            return 1;
        }
        if (m3768H instanceof C1235q) {
            Serializable serializable = ((C1235q) m3768H).f5979c;
            if (serializable instanceof String) {
                return 6;
            }
            if (serializable instanceof Boolean) {
                return 8;
            }
            if (serializable instanceof Number) {
                return 7;
            }
            throw new AssertionError();
        }
        if (m3768H instanceof C1232n) {
            return 9;
        }
        if (m3768H == f6785I1) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw new C1669c("Custom JsonElement subclass " + m3768H.getClass().getName() + " is not supported");
    }
}
