package p165u6;

import android.ext.C0090b;

/* renamed from: u6.i */
/* loaded from: classes.dex */
public class C1991i extends RuntimeException {

    /* renamed from: X */
    public final Throwable f9015X;

    /* renamed from: Y */
    public final AbstractC2003u f9016Y;

    /* renamed from: c */
    public final int f9017c;

    /* renamed from: e */
    public String f9018e;

    /* renamed from: m */
    public String f9019m;

    /* renamed from: s */
    public String f9020s;

    public C1991i(int i7, String str) {
        super(str);
        this.f9017c = i7;
    }

    public C1991i(String str) {
        super(str);
        this.f9017c = 1;
    }

    public C1991i(Throwable th) {
        super("vm error: " + th);
        this.f9015X = th;
        this.f9017c = 1;
    }

    public C1991i(AbstractC2003u abstractC2003u) {
        super(abstractC2003u.mo4645M());
        this.f9016Y = abstractC2003u;
        this.f9017c = 1;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f9015X;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str = this.f9020s;
        if (str != null) {
            return str;
        }
        String message = super.getMessage();
        if (message == null) {
            return null;
        }
        if (this.f9019m != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(message);
            sb.append(" ( ");
            message = C0090b.m220f(sb, this.f9019m, " )");
        }
        if (this.f9018e == null) {
            return message;
        }
        return this.f9018e + " " + message;
    }
}
