package p119o6;

import java.io.IOException;

/* renamed from: o6.c */
/* loaded from: classes.dex */
public final class C1676c extends IOException {

    /* renamed from: c */
    public final int f7548c;

    /* renamed from: e */
    public final String f7549e;

    public C1676c(int i7, String str) {
        super("HTTP error fetching URL");
        this.f7548c = i7;
        this.f7549e = str;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + ". Status=" + this.f7548c + ", URL=" + this.f7549e;
    }
}
