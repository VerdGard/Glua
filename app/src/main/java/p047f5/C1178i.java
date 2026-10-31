package p047f5;

/* renamed from: f5.i */
/* loaded from: classes.dex */
public class C1178i {

    /* renamed from: a */
    public final int f5764a;

    /* renamed from: b */
    public final a[] f5765b;

    /* renamed from: c */
    public final int[] f5766c;

    /* renamed from: d */
    public final boolean[] f5767d;

    /* renamed from: e */
    public int f5768e;

    /* renamed from: f */
    public int f5769f;

    /* renamed from: f5.i$a */
    public interface a {
        /* renamed from: a */
        int mo3389a(int i7);

        /* renamed from: b */
        int mo3390b();
    }

    public C1178i(int i7, a... aVarArr) {
        this.f5764a = i7;
        this.f5765b = aVarArr;
        this.f5766c = new int[aVarArr.length];
        this.f5767d = new boolean[aVarArr.length];
    }

    /* renamed from: a */
    public final int m3387a() {
        int[] iArr = this.f5766c;
        int i7 = iArr[0];
        a[] aVarArr = this.f5765b;
        int mo3390b = aVarArr[0].mo3390b();
        int i8 = this.f5764a;
        int mo3389a = i7 < mo3390b ? aVarArr[0].mo3389a(0) : i8;
        return ((this.f5769f > mo3389a || mo3389a >= i8) && !this.f5767d[0]) ? iArr[0] : iArr[0] - 1;
    }

    /* renamed from: b */
    public final void m3388b() {
        a[] aVarArr;
        int[] iArr;
        int i7;
        this.f5768e = this.f5769f;
        int i8 = this.f5764a;
        int i9 = i8;
        int i10 = 0;
        while (true) {
            aVarArr = this.f5765b;
            int length = aVarArr.length;
            iArr = this.f5766c;
            if (i10 >= length) {
                break;
            }
            if (iArr[i10] >= aVarArr[i10].mo3390b() || (i7 = aVarArr[i10].mo3389a(iArr[i10])) > i8) {
                i7 = i8;
            }
            i9 = Math.min(i7, i9);
            i10++;
        }
        this.f5769f = i9;
        for (int i11 = 0; i11 < aVarArr.length; i11++) {
            int i12 = iArr[i11];
            int mo3390b = aVarArr[i11].mo3390b();
            boolean[] zArr = this.f5767d;
            if (i12 >= mo3390b || aVarArr[i11].mo3389a(iArr[i11]) != i9) {
                zArr[i11] = false;
            } else {
                iArr[i11] = iArr[i11] + 1;
                zArr[i11] = true;
            }
        }
    }
}
