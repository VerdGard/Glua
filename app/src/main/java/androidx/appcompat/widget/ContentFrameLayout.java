package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C0159f;
import p016c.C0562p;
import p016c.LayoutInflaterFactory2C0560n;
import p034e0.C0923h0;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: c */
    public TypedValue f656c;

    /* renamed from: e */
    public TypedValue f657e;

    /* renamed from: m */
    public TypedValue f658m;

    /* renamed from: s */
    public TypedValue f659s;

    /* renamed from: w1 */
    public TypedValue f660w1;

    /* renamed from: x1 */
    public TypedValue f661x1;

    /* renamed from: y1 */
    public final Rect f662y1;

    /* renamed from: z1 */
    public InterfaceC0181a f663z1;

    /* renamed from: androidx.appcompat.widget.ContentFrameLayout$a */
    public interface InterfaceC0181a {
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f662y1 = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f660w1 == null) {
            this.f660w1 = new TypedValue();
        }
        return this.f660w1;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f661x1 == null) {
            this.f661x1 = new TypedValue();
        }
        return this.f661x1;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f658m == null) {
            this.f658m = new TypedValue();
        }
        return this.f658m;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f659s == null) {
            this.f659s = new TypedValue();
        }
        return this.f659s;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f656c == null) {
            this.f656c = new TypedValue();
        }
        return this.f656c;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f657e == null) {
            this.f657e = new TypedValue();
        }
        return this.f657e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC0181a interfaceC0181a = this.f663z1;
        if (interfaceC0181a != null) {
            interfaceC0181a.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0181a interfaceC0181a = this.f663z1;
        if (interfaceC0181a != null) {
            LayoutInflaterFactory2C0560n layoutInflaterFactory2C0560n = ((C0562p) interfaceC0181a).f2896a;
            InterfaceC0238j0 interfaceC0238j0 = layoutInflaterFactory2C0560n.f2814G1;
            if (interfaceC0238j0 != null) {
                interfaceC0238j0.mo581l();
            }
            if (layoutInflaterFactory2C0560n.f2819L1 != null) {
                layoutInflaterFactory2C0560n.f2808A1.getDecorView().removeCallbacks(layoutInflaterFactory2C0560n.f2820M1);
                if (layoutInflaterFactory2C0560n.f2819L1.isShowing()) {
                    try {
                        layoutInflaterFactory2C0560n.f2819L1.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                layoutInflaterFactory2C0560n.f2819L1 = null;
            }
            C0923h0 c0923h0 = layoutInflaterFactory2C0560n.f2821N1;
            if (c0923h0 != null) {
                c0923h0.m2704b();
            }
            C0159f c0159f = layoutInflaterFactory2C0560n.m1951P(0).f2885h;
            if (c0159f != null) {
                c0159f.m527c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b3  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(InterfaceC0181a interfaceC0181a) {
        this.f663z1 = interfaceC0181a;
    }
}
