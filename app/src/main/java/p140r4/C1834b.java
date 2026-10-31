package p140r4;

import android.ext.Tools;
import java.io.Serializable;

/* renamed from: r4.b */
/* loaded from: classes.dex */
public final class C1834b {

    /* renamed from: a */
    public final /* synthetic */ int f8279a;

    /* renamed from: b */
    public int f8280b;

    /* renamed from: c */
    public Serializable f8281c;

    /* JADX WARN: Type inference failed for: r0v2, types: [float[], java.io.Serializable] */
    public C1834b() {
        this.f8279a = 0;
        this.f8281c = new float[Tools.Semaphore.f159S7];
    }

    public final String toString() {
        switch (this.f8279a) {
            case 1:
                return this.f8280b + ": " + ((String) this.f8281c);
            default:
                return super.toString();
        }
    }

    public C1834b(int i7, String str) {
        this.f8279a = 1;
        this.f8280b = i7;
        this.f8281c = str;
    }

    public C1834b(int i7, String str, Object[] objArr) {
        this.f8279a = 1;
        this.f8281c = String.format(str, objArr);
        this.f8280b = i7;
    }
}
