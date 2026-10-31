package p106n0;

import androidx.activity.C0143v;
import java.nio.ByteBuffer;

/* renamed from: n0.c */
/* loaded from: classes.dex */
public class C1635c {

    /* renamed from: a */
    public int f7461a;

    /* renamed from: b */
    public ByteBuffer f7462b;

    /* renamed from: c */
    public int f7463c;

    /* renamed from: d */
    public int f7464d;

    public C1635c() {
        if (C0143v.f265d == null) {
            C0143v.f265d = new C0143v();
        }
    }

    /* renamed from: a */
    public final int m4005a(int i7) {
        if (i7 < this.f7464d) {
            return this.f7462b.getShort(this.f7463c + i7);
        }
        return 0;
    }
}
