package p119o6;

import java.io.IOException;

/* renamed from: o6.f */
/* loaded from: classes.dex */
public final class C1679f extends IOException {

    /* renamed from: c */
    public final String f7550c;

    /* renamed from: e */
    public final String f7551e;

    public C1679f(String str, String str2) {
        super("Unhandled content type. Must be text/*, application/xml, or application/xhtml+xml");
        this.f7550c = str;
        this.f7551e = str2;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + ". Mimetype=" + this.f7550c + ", URL=" + this.f7551e;
    }
}
