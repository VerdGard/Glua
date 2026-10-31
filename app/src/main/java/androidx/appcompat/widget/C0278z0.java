package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.z0 */
/* loaded from: classes.dex */
public final class C0278z0 {

    /* renamed from: a */
    public int f1151a = 0;

    /* renamed from: b */
    public int f1152b = 0;

    /* renamed from: c */
    public int f1153c = Integer.MIN_VALUE;

    /* renamed from: d */
    public int f1154d = Integer.MIN_VALUE;

    /* renamed from: e */
    public int f1155e = 0;

    /* renamed from: f */
    public int f1156f = 0;

    /* renamed from: g */
    public boolean f1157g = false;

    /* renamed from: h */
    public boolean f1158h = false;

    /* renamed from: a */
    public final void m929a(int i7, int i8) {
        this.f1153c = i7;
        this.f1154d = i8;
        this.f1158h = true;
        if (this.f1157g) {
            if (i8 != Integer.MIN_VALUE) {
                this.f1151a = i8;
            }
            if (i7 != Integer.MIN_VALUE) {
                this.f1152b = i7;
                return;
            }
            return;
        }
        if (i7 != Integer.MIN_VALUE) {
            this.f1151a = i7;
        }
        if (i8 != Integer.MIN_VALUE) {
            this.f1152b = i8;
        }
    }
}
