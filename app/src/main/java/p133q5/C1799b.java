package p133q5;

/* renamed from: q5.b */
/* loaded from: classes.dex */
public final class C1799b extends RuntimeException {

    /* renamed from: c */
    public final int f8171c;

    /* renamed from: e */
    public final int f8172e;

    /* renamed from: m */
    public final int f8173m;

    public C1799b() {
        super("compiler assert failed");
        this.f8171c = 0;
    }

    public C1799b(int i7, int i8, int i9, String str) {
        super(str);
        this.f8171c = 0;
        this.f8171c = i7;
        this.f8172e = i8;
        this.f8173m = i9;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return null;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        if (message == null) {
            return null;
        }
        return message;
    }
}
