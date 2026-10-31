package p120p;

/* renamed from: p.e */
/* loaded from: classes.dex */
public class C1684e {

    /* renamed from: a */
    public final /* synthetic */ int f7587a;

    /* renamed from: b */
    public final Object[] f7588b;

    /* renamed from: c */
    public int f7589c;

    public C1684e(int i7, int i8) {
        this.f7587a = i8;
        if (i8 != 1) {
            if (i7 <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.f7588b = new Object[i7];
        } else {
            if (i7 <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.f7588b = new Object[i7];
        }
    }

    /* renamed from: a */
    public Object mo2564a() {
        int i7 = this.f7587a;
        Object[] objArr = this.f7588b;
        switch (i7) {
            case 0:
                int i8 = this.f7589c;
                if (i8 <= 0) {
                    return null;
                }
                int i9 = i8 - 1;
                Object obj = objArr[i9];
                objArr[i9] = null;
                this.f7589c = i9;
                return obj;
            default:
                int i10 = this.f7589c;
                if (i10 <= 0) {
                    return null;
                }
                int i11 = i10 - 1;
                Object obj2 = objArr[i11];
                objArr[i11] = null;
                this.f7589c = i11;
                return obj2;
        }
    }

    /* renamed from: b */
    public boolean mo2565b(Object obj) {
        int i7;
        boolean z6;
        int i8 = this.f7587a;
        Object[] objArr = this.f7588b;
        switch (i8) {
            case 0:
                int i9 = this.f7589c;
                if (i9 >= objArr.length) {
                    return false;
                }
                objArr[i9] = obj;
                this.f7589c = i9 + 1;
                return true;
            default:
                int i10 = 0;
                while (true) {
                    i7 = this.f7589c;
                    if (i10 >= i7) {
                        z6 = false;
                    } else if (objArr[i10] == obj) {
                        z6 = true;
                    } else {
                        i10++;
                    }
                }
                if (z6) {
                    throw new IllegalStateException("Already in the pool!");
                }
                if (i7 >= objArr.length) {
                    return false;
                }
                objArr[i7] = obj;
                this.f7589c = i7 + 1;
                return true;
        }
    }
}
