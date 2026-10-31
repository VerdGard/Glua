package p063h5;

import android.widget.PopupWindow;
import java.util.Objects;
import p055g5.C1245b;
import p058h0.C1277d;
import p132q4.C1795x;

/* renamed from: h5.a */
/* loaded from: classes.dex */
public class C1302a {

    /* renamed from: A1 */
    public int f6460A1;

    /* renamed from: X */
    public boolean f6461X;

    /* renamed from: Y */
    public final C1245b f6462Y;

    /* renamed from: Z */
    public int f6463Z;

    /* renamed from: c */
    public final PopupWindow f6464c;

    /* renamed from: e */
    public final C1245b f6465e;

    /* renamed from: m */
    public final int f6466m;

    /* renamed from: s */
    public final int[] f6467s = new int[2];

    /* renamed from: w1 */
    public int f6468w1;

    /* renamed from: x1 */
    public int f6469x1;

    /* renamed from: y1 */
    public int f6470y1;

    /* renamed from: z1 */
    public int f6471z1;

    public C1302a(C1245b c1245b, int i7) {
        Objects.requireNonNull(c1245b);
        this.f6465e = c1245b;
        this.f6466m = i7;
        this.f6462Y = c1245b;
        PopupWindow popupWindow = new PopupWindow();
        this.f6464c = popupWindow;
        popupWindow.setElevation(c1245b.getDpUnit() * 4.0f);
        c1245b.m3508q0(C1795x.class, new C1277d(1, this));
        this.f6461X = true;
    }

    /* renamed from: a */
    public final void m3614a(boolean z6) {
        int i7;
        int i8;
        if (z6 || m3617d()) {
            boolean m3616c = m3616c(1);
            int i9 = this.f6469x1;
            C1245b c1245b = this.f6465e;
            int offsetX = i9 - (m3616c ? c1245b.getOffsetX() : this.f6463Z);
            if (m3616c) {
                i7 = this.f6470y1;
                i8 = c1245b.getOffsetY();
            } else {
                i7 = this.f6470y1;
                i8 = this.f6468w1;
            }
            int i10 = i7 - i8;
            int i11 = this.f6471z1 + offsetX;
            int i12 = this.f6460A1 + i10;
            if (!m3616c(2)) {
                offsetX = Math.max(0, Math.min(offsetX, c1245b.getWidth()));
                i11 = Math.max(0, Math.min(i11, c1245b.getWidth()));
                i10 = Math.max(0, Math.min(i10, c1245b.getHeight()));
                i12 = Math.max(0, Math.min(i12, c1245b.getHeight()));
                if (i10 >= i12 || offsetX >= i11) {
                    mo3615b();
                    return;
                }
            }
            int[] iArr = this.f6467s;
            c1245b.getLocationInWindow(iArr);
            int i13 = i11 - offsetX;
            int i14 = i12 - i10;
            int i15 = offsetX + iArr[0];
            int i16 = i10 + iArr[1];
            PopupWindow popupWindow = this.f6464c;
            if (popupWindow.isShowing()) {
                popupWindow.update(i15, i16, i13, i14);
            } else if (z6) {
                popupWindow.setHeight(i14);
                popupWindow.setWidth(i13);
                popupWindow.showAtLocation(this.f6462Y, 8388659, i15, i16);
            }
        }
    }

    /* renamed from: b */
    public void mo3615b() {
        if (m3617d()) {
            this.f6464c.dismiss();
        }
    }

    /* renamed from: c */
    public final boolean m3616c(int i7) {
        if (Integer.bitCount(i7) == 1) {
            return (i7 & this.f6466m) != 0;
        }
        throw new IllegalArgumentException("Not a valid feature integer");
    }

    /* renamed from: d */
    public final boolean m3617d() {
        return this.f6464c.isShowing();
    }
}
