package p055g5;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.ext.C0090b;
import android.ext.C0091c;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.TransactionTooLargeException;
import android.util.Log;
import android.util.TypedValue;
import android.view.ContextMenu;
import android.view.DragEvent;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import android.widget.Toast;
import androidx.activity.C0143v;
import androidx.activity.RunnableC0123h;
import io.github.rosemoe.sora.R$string;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import p002a1.C0017d;
import p006a5.C0051a;
import p006a5.C0056f;
import p006a5.InterfaceC0053c;
import p006a5.InterfaceC0055e;
import p022c5.C0637a;
import p022c5.C0638b;
import p022c5.C0640d;
import p022c5.C0641e;
import p022c5.C0642f;
import p022c5.C0644h;
import p022c5.C0645i;
import p022c5.C0650n;
import p022c5.C0651o;
import p022c5.C0653q;
import p022c5.EnumC0649m;
import p022c5.InterfaceC0643g;
import p022c5.InterfaceC0647k;
import p031d5.C0891b;
import p031d5.C0892c;
import p032d6.C0898f;
import p039e5.C1139a;
import p047f5.C1170a;
import p047f5.C1171b;
import p047f5.C1172c;
import p047f5.C1174e;
import p047f5.C1176g;
import p047f5.C1180k;
import p047f5.HandlerC1173d;
import p056g6.C1265b;
import p056g6.C1266c;
import p057h.AbstractC1268b;
import p071i5.C1359b0;
import p071i5.C1371h0;
import p071i5.C1374k;
import p071i5.C1378o;
import p071i5.InterfaceC1375l;
import p071i5.ViewOnClickListenerC1367f0;
import p072i6.C1394e;
import p079j5.AbstractC1432a;
import p079j5.C1435d;
import p079j5.C1436e;
import p079j5.C1440i;
import p079j5.InterfaceC1433b;
import p087k5.C1461a;
import p087k5.C1462b;
import p087k5.C1463c;
import p087k5.C1464d;
import p087k5.C1465e;
import p089l.C1476j;
import p095l5.C1510a;
import p103m5.C1555a;
import p118o5.EnumC1671b;
import p118o5.InterfaceC1670a;
import p118o5.InterfaceC1672c;
import p118o5.InterfaceC1673d;
import p124p4.C1703a;
import p125p5.C1706c;
import p132q4.AbstractC1786o;
import p132q4.C1770a;
import p132q4.C1775d;
import p132q4.C1777f;
import p132q4.C1779h;
import p132q4.C1780i;
import p132q4.C1782k;
import p132q4.C1787p;
import p132q4.C1792u;
import p132q4.C1795x;
import p132q4.C1796y;
import p132q4.InterfaceC1788q;
import p140r4.C1836d;
import p140r4.C1837e;
import p144s0.RunnableC1869e;
import p148s4.C1884a;
import p148s4.InterfaceC1885b;
import p156t4.AbstractC1927b;
import p156t4.AbstractC1927b.b.c;
import p156t4.InterfaceC1926a;
import p171v4.RunnableC2023g;
import p173w.RunnableC2045g;
import p194y4.C2251c;
import p195y5.AbstractC2263k;
import p195y5.C2255c;
import p195y5.C2258f;
import p195y5.C2262j;

/* renamed from: g5.b */
/* loaded from: classes.dex */
public class C1245b extends View implements InterfaceC0643g {

    /* renamed from: n3 */
    public static final /* synthetic */ int f5985n3 = 0;

    /* renamed from: A1 */
    public C1248e f5986A1;

    /* renamed from: A2 */
    public InterfaceC1673d.a f5987A2;

    /* renamed from: B1 */
    public C1787p f5988B1;

    /* renamed from: B2 */
    public InterfaceC1673d.a f5989B2;

    /* renamed from: C1 */
    public AbstractC1432a f5990C1;

    /* renamed from: C2 */
    public ClipboardManager f5991C2;

    /* renamed from: D1 */
    public int f5992D1;

    /* renamed from: D2 */
    public InputMethodManager f5993D2;

    /* renamed from: E1 */
    public int f5994E1;

    /* renamed from: E2 */
    public C0645i f5995E2;

    /* renamed from: F1 */
    public int f5996F1;

    /* renamed from: F2 */
    public C0641e f5997F2;

    /* renamed from: G1 */
    public int f5998G1;

    /* renamed from: G2 */
    public Matrix f5999G2;

    /* renamed from: H1 */
    public int f6000H1;

    /* renamed from: H2 */
    public C1510a f6001H2;

    /* renamed from: I1 */
    public float f6002I1;

    /* renamed from: I2 */
    public InterfaceC1672c f6003I2;

    /* renamed from: J1 */
    public float f6004J1;

    /* renamed from: J2 */
    public String f6005J2;

    /* renamed from: K1 */
    public float f6006K1;

    /* renamed from: K2 */
    public InterfaceC1885b f6007K2;

    /* renamed from: L1 */
    public float f6008L1;

    /* renamed from: L2 */
    public EnumC1671b f6009L2;

    /* renamed from: M1 */
    public float f6010M1;

    /* renamed from: M2 */
    public long f6011M2;

    /* renamed from: N1 */
    public float f6012N1;

    /* renamed from: N2 */
    public C1374k f6013N2;

    /* renamed from: O1 */
    public float f6014O1;

    /* renamed from: O2 */
    public GestureDetectorOnGestureListenerC1261r f6015O2;

    /* renamed from: P1 */
    public float f6016P1;

    /* renamed from: P2 */
    public Paint.Align f6017P2;

    /* renamed from: Q1 */
    public float f6018Q1;

    /* renamed from: Q2 */
    public GestureDetector f6019Q2;

    /* renamed from: R1 */
    public float f6020R1;

    /* renamed from: R2 */
    public ScaleGestureDetector f6021R2;

    /* renamed from: S1 */
    public float f6022S1;

    /* renamed from: S2 */
    public CursorAnchorInfo.Builder f6023S2;

    /* renamed from: T1 */
    public float f6024T1;

    /* renamed from: T2 */
    public EdgeEffect f6025T2;

    /* renamed from: U1 */
    public boolean f6026U1;

    /* renamed from: U2 */
    public EdgeEffect f6027U2;

    /* renamed from: V1 */
    public boolean f6028V1;

    /* renamed from: V2 */
    public ExtractedTextRequest f6029V2;

    /* renamed from: W1 */
    public boolean f6030W1;

    /* renamed from: W2 */
    public C1256m f6031W2;

    /* renamed from: X1 */
    public boolean f6032X1;

    /* renamed from: X2 */
    public InterfaceC1670a f6033X2;

    /* renamed from: Y1 */
    public boolean f6034Y1;

    /* renamed from: Y2 */
    public InterfaceC1673d f6035Y2;

    /* renamed from: Z1 */
    public boolean f6036Z1;

    /* renamed from: Z2 */
    public RunnableC1246c f6037Z2;

    /* renamed from: a2 */
    public boolean f6038a2;

    /* renamed from: a3 */
    public C1247d f6039a3;

    /* renamed from: b2 */
    public boolean f6040b2;

    /* renamed from: b3 */
    public Bundle f6041b3;

    /* renamed from: c */
    public final C1249f f6042c;

    /* renamed from: c2 */
    public volatile boolean f6043c2;

    /* renamed from: c3 */
    public C0056f f6044c3;

    /* renamed from: d2 */
    public boolean f6045d2;

    /* renamed from: d3 */
    public C2251c f6046d3;

    /* renamed from: e */
    public C1263t f6047e;

    /* renamed from: e2 */
    public int f6048e2;

    /* renamed from: e3 */
    public C1464d f6049e3;

    /* renamed from: f2 */
    public int f6050f2;

    /* renamed from: f3 */
    public C1250g f6051f3;

    /* renamed from: g2 */
    public int f6052g2;

    /* renamed from: g3 */
    public boolean f6053g3;

    /* renamed from: h2 */
    public boolean f6054h2;

    /* renamed from: h3 */
    public float f6055h3;

    /* renamed from: i2 */
    public boolean f6056i2;

    /* renamed from: i3 */
    public float f6057i3;

    /* renamed from: j2 */
    public boolean f6058j2;

    /* renamed from: j3 */
    public boolean f6059j3;

    /* renamed from: k2 */
    public boolean f6060k2;

    /* renamed from: k3 */
    public boolean f6061k3;

    /* renamed from: l2 */
    public boolean f6062l2;

    /* renamed from: l3 */
    public EnumC0649m f6063l3;

    /* renamed from: m */
    public ViewOnClickListenerC1367f0 f6064m;

    /* renamed from: m2 */
    public boolean f6065m2;

    /* renamed from: m3 */
    public C1555a f6066m3;

    /* renamed from: n2 */
    public boolean f6067n2;

    /* renamed from: o2 */
    public boolean f6068o2;

    /* renamed from: p2 */
    public boolean f6069p2;

    /* renamed from: q2 */
    public boolean f6070q2;

    /* renamed from: r2 */
    public boolean f6071r2;

    /* renamed from: s */
    public C1359b0 f6072s;

    /* renamed from: s2 */
    public boolean f6073s2;

    /* renamed from: t2 */
    public boolean f6074t2;

    /* renamed from: u2 */
    public boolean f6075u2;

    /* renamed from: v2 */
    public boolean f6076v2;

    /* renamed from: w1 */
    public C1378o f6077w1;

    /* renamed from: w2 */
    public boolean f6078w2;

    /* renamed from: x1 */
    public final ArrayList f6079x1;

    /* renamed from: x2 */
    public boolean f6080x2;

    /* renamed from: y1 */
    public C1258o f6081y1;

    /* renamed from: y2 */
    public boolean f6082y2;

    /* renamed from: z1 */
    public C0638b f6083z1;

    /* renamed from: z2 */
    public InterfaceC1673d.a f6084z2;

    static {
        C1174e.m3367a("CodeEditor");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0202  */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [float] */
    /* JADX WARN: Type inference failed for: r5v38, types: [float] */
    /* JADX WARN: Type inference failed for: r5v4, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1245b(android.content.Context r13, android.util.AttributeSet r14) {
        /*
            Method dump skipped, instructions count: 875
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p055g5.C1245b.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0055, code lost:
    
        if (r2 < 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0057, code lost:
    
        if (r2 <= r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x005b, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:?, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
    
        return -1;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m3458b(int r7, java.util.List r8) {
        /*
            boolean r0 = r8.isEmpty()
            r1 = -1
            if (r0 == 0) goto L8
            goto L5b
        L8:
            int r0 = r8.size()
            int r0 = r0 + r1
            r2 = 0
            r3 = r0
        Lf:
            if (r2 > r3) goto L55
            int r4 = r3 - r2
            int r4 = r4 / 2
            int r4 = r4 + r2
            if (r4 < 0) goto L5b
            if (r4 <= r0) goto L1b
            goto L5b
        L1b:
            java.lang.Object r5 = r8.get(r4)
            a5.a r5 = (p006a5.C0051a) r5
            if (r5 != 0) goto L48
            int r5 = r4 + (-1)
        L25:
            int r4 = r4 + 1
            if (r5 >= r2) goto L2c
            if (r4 <= r3) goto L2c
            goto L5b
        L2c:
            if (r5 < r2) goto L36
            java.lang.Object r6 = r8.get(r5)
            if (r6 == 0) goto L36
            r4 = r5
            goto L3e
        L36:
            if (r4 > r3) goto L45
            java.lang.Object r6 = r8.get(r4)
            if (r6 == 0) goto L45
        L3e:
            java.lang.Object r5 = r8.get(r4)
            a5.a r5 = (p006a5.C0051a) r5
            goto L48
        L45:
            int r5 = r5 + (-1)
            goto L25
        L48:
            int r5 = r5.f138c
            if (r5 <= r7) goto L4f
            int r3 = r4 + (-1)
            goto Lf
        L4f:
            if (r5 >= r7) goto L54
            int r2 = r4 + 1
            goto Lf
        L54:
            r2 = r4
        L55:
            if (r2 < 0) goto L5b
            if (r2 <= r0) goto L5a
            goto L5b
        L5a:
            r1 = r2
        L5b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p055g5.C1245b.m3458b(int, java.util.List):int");
    }

    /* renamed from: B */
    public final void m3459B() {
        boolean z6;
        boolean z7;
        C0645i c0645i = this.f5995E2;
        if (c0645i.m2163a()) {
            C0641e c0641e = this.f5997F2;
            C0638b c0638b = c0645i.f3166c;
            int i7 = c0638b.f3141b;
            int i8 = c0638b.f3142c;
            C0638b c0638b2 = c0645i.f3167d;
            c0641e.m2136h(i7, i8, c0638b2.f3141b, c0638b2.f3142c);
            return;
        }
        C0638b c0638b3 = c0645i.f3166c;
        int i9 = c0638b3.f3142c;
        int i10 = c0638b3.f3141b;
        C1247d c1247d = this.f6039a3;
        if (c1247d.f6117e || (c1247d.f6118m != 1 && i9 > 0 && this.f5997F2.m2131c(i10, i9 - 1) == ' ')) {
            char[] cArr = this.f5997F2.m2146r(c0645i.f3166c.f3141b).f3159c;
            int i11 = i9 - 1;
            int i12 = i11;
            while (true) {
                if (i12 < 0) {
                    z6 = true;
                    break;
                }
                char c7 = cArr[i12];
                if (c7 != ' ' && c7 != '\t') {
                    z6 = false;
                    break;
                }
                i12--;
            }
            if (z6) {
                int m2142n = this.f5997F2.m2142n(i10);
                int i13 = i9;
                while (true) {
                    if (i13 < m2142n) {
                        char c8 = cArr[i13];
                        if (c8 != ' ' && c8 != '\t') {
                            z7 = false;
                            break;
                        }
                        i13++;
                    } else {
                        z7 = true;
                        break;
                    }
                }
                C1247d c1247d2 = this.f6039a3;
                if (c1247d2.f6117e && z7) {
                    C0641e c0641e2 = this.f5997F2;
                    if (i10 == 0) {
                        c0641e2.m2136h(i10, 0, i10, i9);
                        return;
                    } else {
                        int i14 = i10 - 1;
                        c0641e2.m2136h(i14, c0641e2.m2142n(i14), i10, m2142n);
                        return;
                    }
                }
                if (c1247d2.f6118m != 1 && i9 > 0 && this.f5997F2.m2131c(i10, i11) == ' ') {
                    C0641e c0641e3 = this.f5997F2;
                    int i15 = this.f6039a3.f6118m;
                    if (i15 == -1) {
                        i15 = getTabWidth();
                    }
                    c0641e3.m2136h(i10, Math.max(0, i9 - i15), i10, i9);
                    return;
                }
            }
        }
        int m2170b = C0650n.m2169a().m2170b(i9, this.f5997F2.m2146r(c0645i.f3166c.f3141b));
        C0638b c0638b4 = c0645i.f3166c;
        int i16 = c0638b4.f3142c;
        if (m2170b > i16) {
            i16 = m2170b;
            m2170b = i16;
        }
        if (m2170b != i16) {
            C0641e c0641e4 = this.f5997F2;
            int i17 = c0638b4.f3141b;
            c0641e4.m2136h(i17, m2170b, i17, i16);
        } else {
            int i18 = c0638b4.f3141b;
            if (i18 > 0) {
                C0641e c0641e5 = this.f5997F2;
                c0641e5.m2136h(i18 - 1, c0641e5.m2142n(i18 - 1), c0645i.f3166c.f3141b, 0);
            }
        }
    }

    /* renamed from: C */
    public final <T extends AbstractC1786o> int m3460C(T t7) {
        return this.f5988B1.m4244a(t7);
    }

    /* renamed from: D */
    public final void m3461D(String str, boolean z6) {
        C0645i cursor = getCursor();
        if (cursor.m2163a()) {
            C0638b m2164b = cursor.m2164b();
            C0638b m2115a = cursor.m2165c().m2115a();
            C0641e m2123G = getText().m2123G(m2164b.f3141b, m2164b.f3142c, m2115a.f3141b, m2115a.f3142c);
            m3500k0(m2115a.f3141b, m2115a.f3142c);
            m3492g(str + ((Object) m2123G), false);
            if (z6) {
                C0638b m2165c = cursor.m2165c();
                m3502m0(m2115a.f3141b, m2115a.f3142c, m2165c.f3141b, m2165c.f3142c);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x011d, code lost:
    
        if ((java.lang.Math.abs(r1 - ((float) getOffsetY())) < java.lang.Math.abs(1.0f)) != false) goto L57;
     */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3462E(int r15, int r16) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p055g5.C1245b.m3462E(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:? A[RETURN, SYNTHETIC] */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3463F() {
        /*
            r7 = this;
            c5.b r0 = r7.f6083z1
            if (r0 == 0) goto L4e
            c5.e r1 = r7.f5997F2
            r1.getClass()
            int r2 = r0.f3141b
            int r3 = r0.f3142c
            int r0 = r0.f3140a
            r4 = 0
            r1.m2154z(r4)
            if (r2 < 0) goto L49
            int r5 = r1.m2147s()     // Catch: java.lang.Throwable -> L44
            if (r2 < r5) goto L1c
            goto L49
        L1c:
            c5.f r5 = r1.m2146r(r2)     // Catch: java.lang.Throwable -> L44
            int r6 = r5.f3160e     // Catch: java.lang.Throwable -> L44
            c5.m r5 = r5.m2160d()     // Catch: java.lang.Throwable -> L44
            int r5 = r5.f3182e     // Catch: java.lang.Throwable -> L44
            int r6 = r6 + r5
            if (r3 > r6) goto L49
            if (r3 >= 0) goto L2e
            goto L49
        L2e:
            c5.k r5 = r1.m2145q()     // Catch: java.lang.Throwable -> L44
            c5.a r5 = (p022c5.C0637a) r5     // Catch: java.lang.Throwable -> L44
            c5.b r2 = r5.m2111q(r2, r3)     // Catch: java.lang.Throwable -> L44
            int r2 = r2.f3140a     // Catch: java.lang.Throwable -> L44
            if (r2 != r0) goto L3e
            r0 = 1
            goto L3f
        L3e:
            r0 = 0
        L3f:
            r1.m2128L(r4)
            r4 = r0
            goto L4c
        L44:
            r0 = move-exception
            r1.m2128L(r4)
            throw r0
        L49:
            r1.m2128L(r4)
        L4c:
            if (r4 != 0) goto L56
        L4e:
            c5.i r0 = r7.f5995E2
            c5.b r0 = r0.m2165c()
            r7.f6083z1 = r0
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p055g5.C1245b.m3463F():void");
    }

    /* renamed from: G */
    public final void m3464G() {
        m3462E(getCursor().f3167d.f3141b, getCursor().f3167d.f3142c);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004e  */
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3465H(p055g5.EnumC1262s r10) {
        /*
            r9 = this;
            r9.m3463F()
            c5.b r0 = r9.getSelectingTarget()
            java.lang.String r1 = "pos"
            p032d6.C0898f.m2606e(r0, r1)
            c6.p<g5.b, c5.b, c5.b> r1 = r10.f6280c
            java.lang.Object r0 = r1.mo237b(r9, r0)
            c5.b r0 = (p022c5.C0638b) r0
            c5.b r1 = r9.f6083z1
            int r3 = r1.f3141b
            int r4 = r1.f3142c
            int r5 = r0.f3141b
            int r6 = r0.f3142c
            r7 = 0
            r8 = 7
            r2 = r9
            r2.m3505o0(r3, r4, r5, r6, r7, r8)
            g5.s r0 = p055g5.EnumC1262s.PAGE_UP
            if (r10 != r0) goto L30
            g5.r r10 = r9.f6015O2
            int r0 = r9.getHeight()
            int r0 = -r0
            goto L3a
        L30:
            g5.s r0 = p055g5.EnumC1262s.PAGE_DOWN
            if (r10 != r0) goto L40
            g5.r r10 = r9.f6015O2
            int r0 = r9.getHeight()
        L3a:
            float r0 = (float) r0
            r1 = 0
            r2 = 1
            r10.m3568g(r1, r0, r2)
        L40:
            c5.i r10 = r9.f5995E2
            c5.b r10 = r10.m2164b()
            c5.b r0 = r9.f6083z1
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L52
            r9.m3464G()
            goto L5d
        L52:
            c5.i r10 = r9.f5995E2
            c5.b r10 = r10.f3166c
            int r0 = r10.f3141b
            int r10 = r10.f3142c
            r9.m3462E(r0, r10)
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p055g5.C1245b.m3465H(g5.s):void");
    }

    /* renamed from: I */
    public final ExtractedText m3466I(ExtractedTextRequest extractedTextRequest) {
        getProps().getClass();
        getProps().getClass();
        C0645i cursor = getCursor();
        ExtractedText extractedText = new ExtractedText();
        int i7 = cursor.f3166c.f3140a;
        int i8 = cursor.f3167d.f3140a;
        if (extractedTextRequest.hintMaxChars == 0) {
            extractedTextRequest.hintMaxChars = this.f6039a3.f6115Z;
        }
        int i9 = extractedTextRequest.hintMaxChars;
        int min = 0 + i9 < i7 ? Math.min(i7 - (i9 / 2), i7) : 0;
        extractedText.text = this.f5986A1.m3517d(min, extractedTextRequest.hintMaxChars + min, extractedTextRequest.flags);
        extractedText.startOffset = min;
        extractedText.selectionStart = i7 - min;
        extractedText.selectionEnd = i8 - min;
        if (i7 != i8) {
            extractedText.flags |= 2;
        }
        return extractedText;
    }

    /* renamed from: J */
    public final int m3467J() {
        int i7;
        C0056f c0056f = this.f6044c3;
        ArrayList arrayList = c0056f == null ? null : c0056f.f145b;
        int i8 = -1;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i9 = this.f5995E2.f3166c.f3141b;
            int m3458b = m3458b(i9, arrayList);
            int i10 = 0;
            if (m3458b == -1) {
                m3458b = 0;
            }
            int size = arrayList.size() - 1;
            C0056f c0056f2 = this.f6044c3;
            int i11 = c0056f2 != null ? c0056f2.f146c : Integer.MAX_VALUE;
            int i12 = Integer.MAX_VALUE;
            while (m3458b <= size) {
                C0051a c0051a = (C0051a) arrayList.get(m3458b);
                if (c0051a != null) {
                    int i13 = c0051a.f138c;
                    if (i13 >= i9 && (i7 = c0051a.f136a) <= i9) {
                        int i14 = i13 - i7;
                        if (i14 < i12) {
                            i8 = m3458b;
                            i12 = i14;
                        }
                    } else if (i12 != Integer.MAX_VALUE && (i10 = i10 + 1) >= i11) {
                        break;
                    }
                }
                m3458b++;
            }
        }
        return i8;
    }

    /* renamed from: K */
    public final <T extends InterfaceC1375l> T m3468K(Class<T> cls) {
        if (cls == C1374k.class) {
            return this.f6013N2;
        }
        if (cls == C1371h0.class) {
            return this.f6015O2.f6249s;
        }
        if (cls == ViewOnClickListenerC1367f0.class) {
            return this.f6064m;
        }
        if (cls == C1359b0.class) {
            return this.f6072s;
        }
        if (cls == C1378o.class) {
            return this.f6077w1;
        }
        throw new IllegalArgumentException("Unknown component type");
    }

    /* renamed from: L */
    public final long m3469L(float f7, float f8) {
        return this.f5990C1.mo3809l(f7 - m3482Y(), f8);
    }

    /* renamed from: M */
    public final long m3470M(float f7, float f8) {
        float max = Math.max(0.0f, f8);
        this.f6051f3.getClass();
        return m3469L(f7 + getOffsetX(), max + getOffsetY());
    }

    /* renamed from: N */
    public final int m3471N(int i7) {
        int lineSpacingPixels = getLineSpacingPixels();
        Paint.FontMetricsInt fontMetricsInt = this.f6051f3.f6155q;
        return (((i7 + 1) * Math.max(1, (fontMetricsInt.descent - fontMetricsInt.ascent) + lineSpacingPixels)) - fontMetricsInt.descent) - (lineSpacingPixels / 2);
    }

    /* renamed from: O */
    public final int m3472O(int i7) {
        return (i7 + 1) * getRowHeight();
    }

    /* renamed from: P */
    public final int m3473P(int i7) {
        return getRowHeight() * i7;
    }

    /* renamed from: Q */
    public final List<InterfaceC0053c> m3474Q(int i7) {
        C0056f c0056f = this.f6044c3;
        InterfaceC0055e interfaceC0055e = c0056f == null ? null : c0056f.f144a;
        ArrayList arrayList = this.f6079x1;
        if (arrayList.isEmpty()) {
            arrayList.add(C0143v.m425W(5L, 0));
        }
        if (interfaceC0055e != null) {
            try {
                return ((AbstractC1927b.b) interfaceC0055e).new c().m4543d(i7);
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    /* renamed from: R */
    public final void m3475R(boolean z6) {
        C0645i cursor = getCursor();
        if (!z6 || cursor.m2163a()) {
            String m3507q = m3507q();
            C0641e text = getText();
            int tabWidth = getTabWidth();
            text.m2130b();
            for (int i7 = cursor.f3166c.f3141b; i7 <= cursor.f3167d.f3141b; i7++) {
                long m466u = C0143v.m466u(text.m2146r(i7));
                int i8 = (int) (m466u >> 32);
                int m62A = C0017d.m62A(m466u);
                int i9 = (m62A * tabWidth) + i8;
                int i10 = i8 + m62A;
                int i11 = tabWidth - (i9 % tabWidth);
                if (i8 > 0 && m62A > 0) {
                    if (i11 == 0) {
                        i11 = tabWidth;
                    }
                    text.m2119C(i7, 0, C1394e.m3741X((i11 + i9) / tabWidth, m3507q), i7, i10);
                } else if (i11 == 0) {
                    text.m2151w(i7, i10, m3507q);
                } else {
                    text.m2151w(i7, i10, C1394e.m3741X(i11, " "));
                }
            }
            text.m2140l();
        }
    }

    /* renamed from: S */
    public final boolean m3476S() {
        if (!this.f6030W1 || this.f6043c2) {
            return false;
        }
        m3477T();
        return true;
    }

    /* renamed from: T */
    public final void m3477T() {
        this.f6007K2.mo4422g();
    }

    /* renamed from: U */
    public final boolean m3478U() {
        this.f6039a3.getClass();
        this.f6039a3.getClass();
        return this.f6036Z1 || this.f6038a2;
    }

    /* renamed from: V */
    public final boolean m3479V(float f7, float f8) {
        long m3470M = m3470M(f7, f8);
        C1436e mo3816v = this.f5990C1.mo3816v(this.f5990C1.mo3807d(this.f5997F2.m2141m((int) (m3470M >> 32), C0017d.m62A(m3470M))));
        C1250g c1250g = this.f6051f3;
        C0642f m2146r = this.f5997F2.m2146r(mo3816v.f6899a);
        int i7 = mo3816v.f6899a;
        int i8 = mo3816v.f6901c;
        float m3544x = c1250g.m3544x(m2146r, i7, i8, mo3816v.f6902d - i8);
        float m3482Y = m3482Y();
        float offsetX = getOffsetX() + f7;
        return offsetX >= m3482Y && offsetX <= m3544x + m3482Y;
    }

    /* renamed from: W */
    public final boolean m3480W() {
        return this.f5995E2.m2163a();
    }

    /* renamed from: X */
    public final float m3481X() {
        float[] fArr;
        float f7 = 0.0f;
        if (!this.f6054h2) {
            return 0.0f;
        }
        int i7 = 0;
        for (int lineCount = getLineCount(); lineCount > 0; lineCount /= 10) {
            i7++;
        }
        C1180k.a aVar = C1180k.f5771a;
        synchronized (aVar) {
            fArr = aVar.f5772a;
            aVar.f5772a = null;
        }
        if (fArr == null || fArr.length < 19) {
            fArr = new float[19];
        }
        this.f6051f3.f6141c.getTextWidths("0 1 2 3 4 5 6 7 8 9", fArr);
        C1180k.m3392a(fArr);
        for (int i8 = 0; i8 < 19; i8 += 2) {
            f7 = Math.max(f7, fArr[i8]);
        }
        return (f7 * i7) + this.f6022S1;
    }

    /* renamed from: Y */
    public final float m3482Y() {
        if (!this.f6054h2) {
            return this.f6002I1 * 5.0f;
        }
        float m3481X = m3481X() + this.f6006K1 + this.f6008L1 + this.f6004J1;
        this.f6051f3.m3542v();
        return m3481X + 0;
    }

    /* renamed from: Z */
    public final void m3483Z(EnumC1262s enumC1262s) {
        C0638b c0638b;
        GestureDetectorOnGestureListenerC1261r gestureDetectorOnGestureListenerC1261r;
        int height;
        if (this.f5995E2.m2163a()) {
            if (enumC1262s == EnumC1262s.LEFT) {
                C0638b c0638b2 = this.f5995E2.f3166c;
                m3501l0(c0638b2.f3141b, c0638b2.f3142c, 7, true);
                return;
            } else if (enumC1262s == EnumC1262s.RIGHT) {
                C0638b c0638b3 = this.f5995E2.f3167d;
                m3501l0(c0638b3.f3141b, c0638b3.f3142c, 7, true);
                return;
            }
        }
        int i7 = enumC1262s.f6281e;
        if (i7 == 0) {
            throw null;
        }
        if (i7 == 1) {
            c0638b = this.f5995E2.m2164b();
        } else if (i7 == 2) {
            c0638b = this.f5995E2.m2165c();
        } else {
            m3463F();
            c0638b = this.f6083z1;
        }
        C0898f.m2606e(c0638b, "pos");
        C0638b mo237b = enumC1262s.f6280c.mo237b(this, c0638b);
        if (enumC1262s != EnumC1262s.PAGE_UP) {
            if (enumC1262s == EnumC1262s.PAGE_DOWN) {
                gestureDetectorOnGestureListenerC1261r = this.f6015O2;
                height = getHeight();
            }
            m3501l0(mo237b.f3141b, mo237b.f3142c, 7, true);
        }
        gestureDetectorOnGestureListenerC1261r = this.f6015O2;
        height = -getHeight();
        gestureDetectorOnGestureListenerC1261r.m3568g(0.0f, height, true);
        m3501l0(mo237b.f3141b, mo237b.f3142c, 7, true);
    }

    /* renamed from: a0 */
    public final void m3484a0() {
        ExtractedTextRequest extractedTextRequest = this.f6029V2;
        if (extractedTextRequest != null) {
            this.f5993D2.updateExtractedText(this, this.f6029V2.token, m3466I(extractedTextRequest));
        }
        m3512u0();
        m3511t0();
        if (this.f5986A1.f6126b.m2116a()) {
            m3495h0();
        }
    }

    /* renamed from: b0 */
    public final void m3485b0(int i7) {
        this.f5988B1.m4244a(new C1796y(this, i7));
        getCursorRange();
    }

    @Override // p022c5.InterfaceC0643g
    /* renamed from: c */
    public final void mo2102c(C0641e c0641e) {
        this.f6026U1 = true;
        this.f5990C1.mo2102c(c0641e);
    }

    /* renamed from: c0 */
    public final void m3486c0() {
        ClipData primaryClip;
        String m3366a;
        C1248e c1248e;
        try {
            if (!this.f5991C2.hasPrimaryClip() || (primaryClip = this.f5991C2.getPrimaryClip()) == null || (m3366a = C1172c.m3366a(primaryClip)) == null || (c1248e = this.f5986A1) == null) {
                return;
            }
            c1248e.commitText(m3366a, 1);
            this.f6039a3.getClass();
            m3484a0();
        } catch (Exception e7) {
            Log.w("CodeEditor", "Error pasting text to editor", e7);
            Toast.makeText(getContext(), e7.toString(), 0).show();
        }
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return Math.max(0, Math.min(getScrollMaxX(), getOffsetX()));
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return getScrollMaxX();
    }

    @Override // android.view.View
    public final void computeScroll() {
        C1251h c1251h = this.f6015O2.f6247e;
        boolean computeScrollOffset = c1251h.f6181b.computeScrollOffset();
        if (computeScrollOffset) {
            c1251h.m3551d();
        }
        if (computeScrollOffset) {
            OverScroller overScroller = c1251h.f6181b;
            if (!overScroller.isFinished() && (overScroller.getStartX() != overScroller.getFinalX() || overScroller.getStartY() != overScroller.getFinalY())) {
                this.f6055h3 = overScroller.getFinalX();
                this.f6057i3 = overScroller.getFinalY();
                this.f6061k3 = ((float) Math.abs(overScroller.getStartX() - overScroller.getFinalX())) > getDpUnit() * 5.0f;
                this.f6059j3 = ((float) Math.abs(overScroller.getStartY() - overScroller.getFinalY())) > getDpUnit() * 5.0f;
            }
            if (c1251h.m3549b() > 0 || this.f6055h3 > 0.0f || !this.f6027U2.isFinished() || !this.f6061k3) {
                int scrollMaxX = getScrollMaxX();
                if (c1251h.m3549b() >= scrollMaxX && this.f6055h3 >= scrollMaxX && this.f6027U2.isFinished() && this.f6061k3) {
                    this.f6027U2.onAbsorb((int) c1251h.m3548a());
                    this.f6015O2.f6252y1 = true;
                }
            } else {
                this.f6027U2.onAbsorb((int) c1251h.m3548a());
                this.f6015O2.f6252y1 = false;
            }
            if (c1251h.m3550c() > 0 || this.f6057i3 > 0.0f || !this.f6025T2.isFinished() || !this.f6059j3) {
                int scrollMaxY = getScrollMaxY();
                if (c1251h.m3550c() >= scrollMaxY && this.f6057i3 >= scrollMaxY && this.f6025T2.isFinished() && this.f6059j3) {
                    this.f6025T2.onAbsorb((int) c1251h.m3548a());
                    this.f6015O2.f6251x1 = true;
                }
            } else {
                this.f6025T2.onAbsorb((int) c1251h.m3548a());
                this.f6015O2.f6251x1 = false;
            }
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, Math.min(getScrollMaxY(), getOffsetY()));
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        return getScrollMaxY();
    }

    @Override // android.view.View
    public final AccessibilityNodeInfo createAccessibilityNodeInfo() {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
        AccessibilityNodeInfo createAccessibilityNodeInfo = super.createAccessibilityNodeInfo();
        if (isEnabled()) {
            createAccessibilityNodeInfo.setEditable(m3476S());
            C0645i c0645i = this.f5995E2;
            createAccessibilityNodeInfo.setTextSelection(c0645i.f3166c.f3140a, c0645i.f3167d.f3140a);
            createAccessibilityNodeInfo.setInputType(1);
            createAccessibilityNodeInfo.setMultiLine(true);
            createAccessibilityNodeInfo.setText(getText().m2127K());
            createAccessibilityNodeInfo.setLongClickable(true);
            createAccessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_COPY);
            createAccessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CUT);
            createAccessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_PASTE);
            createAccessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_TEXT);
            int scrollMaxY = getScrollMaxY();
            if (scrollMaxY > 0) {
                createAccessibilityNodeInfo.setScrollable(true);
                int offsetY = getOffsetY();
                if (offsetY > 0) {
                    createAccessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
                    if (Build.VERSION.SDK_INT >= 23) {
                        accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP;
                        createAccessibilityNodeInfo.addAction(accessibilityAction2);
                    }
                }
                if (offsetY < scrollMaxY) {
                    createAccessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
                    if (Build.VERSION.SDK_INT >= 23) {
                        accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN;
                        createAccessibilityNodeInfo.addAction(accessibilityAction);
                    }
                }
            }
        }
        return createAccessibilityNodeInfo;
    }

    /* renamed from: d0 */
    public final void m3487d0(Runnable runnable, long j7) {
        HandlerC1173d.f5755a.postDelayed(new RunnableC2045g(this, 2, runnable), j7);
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        boolean z6;
        int x7 = (int) motionEvent.getX();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f5996F1 = x7;
            if (this.f6058j2) {
                parent = getParent();
                z6 = true;
                parent.requestDisallowInterceptTouchEvent(z6);
            }
        } else if (action == 2) {
            int i7 = x7 - this.f5996F1;
            if (this.f6058j2 && !this.f6015O2.m3565d() && ((i7 > 0 && getScroller().m3549b() == 0) || (i7 < 0 && getScroller().m3549b() == getScrollMaxX()))) {
                parent = getParent();
                z6 = false;
                parent.requestDisallowInterceptTouchEvent(z6);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: e */
    public final void m3488e() {
        ViewGroup.LayoutParams layoutParams;
        if (!this.f6076v2 || (layoutParams = getLayoutParams()) == null) {
            return;
        }
        if (layoutParams.width != -2 && (layoutParams.height != -2 || getHeight() == this.f5990C1.mo3810m())) {
            return;
        }
        requestLayout();
    }

    /* renamed from: e0 */
    public final void m3489e0(Runnable runnable) {
        HandlerC1173d.f5755a.post(new RunnableC2023g(this, 1, runnable));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r0.hardKeyboardHidden != 1) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021 A[RETURN] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m3490f() {
        /*
            r4 = this;
            boolean r0 = r4.f6082y2
            if (r0 == 0) goto L22
            android.content.Context r0 = r4.getContext()
            r1 = 0
            if (r0 != 0) goto Lc
            goto L1e
        Lc:
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r2 = r0.keyboard
            r3 = 1
            if (r2 != r3) goto L1f
            int r0 = r0.hardKeyboardHidden
            if (r0 != r3) goto L1e
            goto L1f
        L1e:
            r3 = 0
        L1f:
            if (r3 == 0) goto L22
            return r1
        L22:
            boolean r0 = r4.f6080x2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p055g5.C1245b.m3490f():boolean");
    }

    /* renamed from: f0 */
    public final void m3491f0() {
        C0641e c0641e = this.f5997F2;
        C0653q c0653q = c0641e.f3156x1;
        if ((c0653q.f3196e && c0653q.f3199w1 < c0653q.f3195c.size()) && !c0653q.f3200x1) {
            c0653q.f3200x1 = true;
            ((C0653q.b) c0653q.f3195c.get(c0653q.f3199w1)).mo2176d(c0641e);
            c0653q.f3199w1++;
            c0653q.f3200x1 = false;
        }
        m3484a0();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:5|(11:9|(1:11)(1:170)|12|(1:14)(1:169)|(1:16)(3:112|(5:115|(1:117)(1:167)|(1:166)(4:119|120|(4:153|154|(4:(1:157)|158|(2:160|161)(2:163|164)|162)|165)(2:122|(1:152)(5:124|125|(3:127|(2:129|130)(2:132|133)|131)|134|(3:137|(3:139|(2:141|142)(2:144|145)|143)|146)))|(2:148|149)(1:150))|151|113)|168)|17|18|19|(4:23|(1:25)(1:57)|26|(2:31|(2:55|56)(2:34|(5:38|(2:40|(3:46|47|(2:49|(2:51|52)(1:53))))|54|47|(0))))(2:29|30))|58|(2:60|61)(4:62|(1:109)(11:70|(4:73|(1:107)(1:77)|(3:79|(2:81|82)(2:84|85)|83)(1:86)|71)|108|87|88|89|90|91|92|(1:98)|99)|100|101))|171|17|18|19|(9:21|23|(0)(0)|26|(0)|31|(0)|55|56)|58|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0103, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0241  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3492g(java.lang.CharSequence r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 743
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p055g5.C1245b.m3492g(java.lang.CharSequence, boolean):void");
    }

    /* renamed from: g0 */
    public final void m3493g0() {
        if (this.f6076v2) {
            requestLayout();
        }
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return C1245b.class.getName();
    }

    public int getBlockIndex() {
        return this.f5994E1;
    }

    public float getBlockLineWidth() {
        return this.f6012N1;
    }

    public ClipboardManager getClipboardManager() {
        return this.f5991C2;
    }

    public C1510a getColorScheme() {
        return this.f6001H2;
    }

    public int getCurrentCursorBlock() {
        return this.f5994E1;
    }

    public C0645i getCursor() {
        return this.f5995E2;
    }

    public InterfaceC1670a getCursorAnimator() {
        return this.f6033X2;
    }

    public RunnableC1246c getCursorBlink() {
        return this.f6037Z2;
    }

    public C0651o getCursorRange() {
        C0645i c0645i = this.f5995E2;
        return new C0651o(c0645i.m2164b(), c0645i.m2165c());
    }

    public EnumC1671b getDiagnosticIndicatorStyle() {
        return this.f6009L2;
    }

    public C2251c getDiagnostics() {
        return this.f6046d3;
    }

    public float getDividerMarginLeft() {
        return this.f6006K1;
    }

    public float getDividerMarginRight() {
        return this.f6008L1;
    }

    public float getDividerWidth() {
        return this.f6004J1;
    }

    public float getDpUnit() {
        return this.f6002I1;
    }

    public int getEdgeEffectColor() {
        return this.f6025T2.getColor();
    }

    public boolean getEditable() {
        return this.f6030W1;
    }

    public InterfaceC1885b getEditorLanguage() {
        return this.f6007K2;
    }

    public GestureDetectorOnGestureListenerC1261r getEventHandler() {
        return this.f6015O2;
    }

    public Bundle getExtraArguments() {
        return this.f6041b3;
    }

    public int getFirstVisibleLine() {
        try {
            return this.f5990C1.mo3813s(getFirstVisibleRow());
        } catch (IndexOutOfBoundsException unused) {
            return 0;
        }
    }

    public int getFirstVisibleRow() {
        return Math.max(0, getOffsetY() / getRowHeight());
    }

    public String getFormatTip() {
        return this.f6005J2;
    }

    public C1836d getGraphPaint() {
        return this.f6051f3.f6145g;
    }

    public InterfaceC1673d getHandleStyle() {
        return this.f6035Y2;
    }

    public EdgeEffect getHorizontalEdgeEffect() {
        return this.f6027U2;
    }

    @Override // android.view.View
    public Drawable getHorizontalScrollbarThumbDrawable() {
        return this.f6051f3.f6156r;
    }

    @Override // android.view.View
    public Drawable getHorizontalScrollbarTrackDrawable() {
        return this.f6051f3.f6157s;
    }

    public InputMethodManager getInputMethodManager() {
        return this.f5993D2;
    }

    public int getInputType() {
        return this.f5998G1;
    }

    public InterfaceC1673d.a getInsertHandleDescriptor() {
        return this.f5989B2;
    }

    public float getInsertSelectionWidth() {
        return this.f6010M1;
    }

    public C1139a getKeyMetaStates() {
        return this.f6042c.f6129b;
    }

    public int getLastVisibleLine() {
        try {
            return this.f5990C1.mo3813s(getLastVisibleRow());
        } catch (IndexOutOfBoundsException unused) {
            return getLineCount() - 1;
        }
    }

    public int getLastVisibleRow() {
        return Math.max(0, Math.min(this.f5990C1.mo3806a() - 1, (getHeight() + getOffsetY()) / getRowHeight()));
    }

    public InterfaceC1433b getLayout() {
        return this.f5990C1;
    }

    public InterfaceC1673d.a getLeftHandleDescriptor() {
        return this.f6084z2;
    }

    public int getLineCount() {
        return this.f5997F2.m2147s();
    }

    public float getLineInfoTextSize() {
        return this.f6016P1;
    }

    public Paint.Align getLineNumberAlign() {
        return this.f6017P2;
    }

    public float getLineNumberMarginLeft() {
        return this.f6022S1;
    }

    public Paint.FontMetricsInt getLineNumberMetrics() {
        return this.f6051f3.f6161w;
    }

    public InterfaceC1672c getLineNumberTipTextProvider() {
        return this.f6003I2;
    }

    public EnumC0649m getLineSeparator() {
        return this.f6063l3;
    }

    public float getLineSpacingExtra() {
        return this.f6020R1;
    }

    public float getLineSpacingMultiplier() {
        return this.f6018Q1;
    }

    public int getLineSpacingPixels() {
        Paint.FontMetricsInt fontMetricsInt = this.f6051f3.f6155q;
        return (((int) (((this.f6018Q1 - 1.0f) * (fontMetricsInt.descent - fontMetricsInt.ascent)) + this.f6020R1)) / 2) * 2;
    }

    public int getLnPanelPosition() {
        return this.f6048e2;
    }

    public int getLnPanelPositionMode() {
        return this.f6050f2;
    }

    public int getNonPrintablePaintingFlags() {
        return this.f6000H1;
    }

    public int getOffsetX() {
        return this.f6015O2.f6247e.m3549b();
    }

    public int getOffsetY() {
        return this.f6015O2.f6247e.m3550c();
    }

    public C1836d getOtherPaint() {
        return this.f6051f3.f6141c;
    }

    public C1247d getProps() {
        return this.f6039a3;
    }

    public C1464d getRenderContext() {
        return this.f6049e3;
    }

    public C1250g getRenderer() {
        return this.f6051f3;
    }

    public InterfaceC1673d.a getRightHandleDescriptor() {
        return this.f5987A2;
    }

    public int getRowHeight() {
        Paint.FontMetricsInt fontMetricsInt = this.f6051f3.f6155q;
        return Math.max(1, getLineSpacingPixels() + (fontMetricsInt.descent - fontMetricsInt.ascent));
    }

    public int getRowHeightOfText() {
        Paint.FontMetricsInt fontMetricsInt = this.f6051f3.f6155q;
        return fontMetricsInt.descent - fontMetricsInt.ascent;
    }

    public int getScrollMaxX() {
        return (int) Math.max(0.0f, (m3482Y() + this.f5990C1.mo3805A()) - (getWidth() / 2.0f));
    }

    public int getScrollMaxY() {
        float height;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int mo3810m = this.f5990C1.mo3810m();
        if (layoutParams == null || layoutParams.height == -2) {
            height = getHeight();
        } else {
            height = (1.0f - this.f6024T1) * getHeight();
        }
        return Math.max(0, mo3810m - ((int) height));
    }

    public C1251h getScroller() {
        return this.f6015O2.f6247e;
    }

    public C1256m getSearcher() {
        return this.f6031W2;
    }

    public C0638b getSelectingTarget() {
        return this.f5995E2.m2164b().equals(this.f6083z1) ? this.f5995E2.m2165c() : this.f5995E2.m2164b();
    }

    public C1555a getSnippetController() {
        return this.f6066m3;
    }

    public C0056f getStyles() {
        return this.f6044c3;
    }

    public int getTabWidth() {
        return this.f5992D1;
    }

    public C0641e getText() {
        return this.f5997F2;
    }

    public float getTextLetterSpacing() {
        return this.f6051f3.f6140b.getLetterSpacing();
    }

    public C1836d getTextPaint() {
        return this.f6051f3.f6140b;
    }

    public float getTextScaleX() {
        return this.f6051f3.f6140b.getTextScaleX();
    }

    public float getTextSizePx() {
        return this.f6051f3.f6140b.getTextSize();
    }

    public Typeface getTypefaceLineNumber() {
        return this.f6051f3.f6141c.getTypeface();
    }

    public Typeface getTypefaceText() {
        return this.f6051f3.f6140b.getTypeface();
    }

    public EdgeEffect getVerticalEdgeEffect() {
        return this.f6025T2;
    }

    public float getVerticalExtraSpaceFactor() {
        return this.f6024T1;
    }

    @Override // android.view.View
    public Drawable getVerticalScrollbarThumbDrawable() {
        return this.f6051f3.f6158t;
    }

    @Override // android.view.View
    public Drawable getVerticalScrollbarTrackDrawable() {
        return this.f6051f3.f6159u;
    }

    /* renamed from: h */
    public final void m3494h() {
        m3496i(true);
    }

    /* renamed from: h0 */
    public final void m3495h0() {
        C1248e c1248e = this.f5986A1;
        if (c1248e != null) {
            C0641e text = c1248e.f6125a.getText();
            while (true) {
                if (!(text.f3148X > 0)) {
                    break;
                } else {
                    text.m2140l();
                }
            }
            C0640d c0640d = c1248e.f6126b;
            c0640d.f3146b = -1;
            c0640d.f3145a = -1;
            c1248e.f6127c = false;
        }
        InputMethodManager inputMethodManager = this.f5993D2;
        if (inputMethodManager != null) {
            inputMethodManager.restartInput(this);
        }
    }

    /* renamed from: i */
    public final void m3496i(boolean z6) {
        if (this.f5995E2.m2163a()) {
            C0641e text = getText();
            C0645i c0645i = this.f5995E2;
            m3499k(c0645i.f3166c.f3140a, c0645i.f3167d.f3140a, text);
        } else {
            if (!z6) {
                String str = getLineSeparator().f3181c;
                m3499k(0, str.length(), str);
                return;
            }
            C0645i cursor = getCursor();
            if (cursor.m2163a()) {
                m3494h();
                return;
            }
            int i7 = cursor.m2164b().f3141b;
            m3502m0(i7, 0, i7, getText().m2142n(i7));
            m3496i(false);
        }
    }

    /* renamed from: i0 */
    public final void m3497i0() {
        m3502m0(0, 0, getLineCount() - 1, getText().m2142n(getLineCount() - 1));
    }

    @Override // android.view.View
    public final boolean isHorizontalScrollBarEnabled() {
        return this.f6065m2;
    }

    @Override // android.view.View
    public final boolean isVerticalScrollBarEnabled() {
        return this.f6062l2;
    }

    /* renamed from: j0 */
    public final void m3498j0(int i7, int i8) {
        C0651o m408F = C0143v.m408F(getText(), i7, i8, this.f6039a3.f6096F1);
        C0638b c0638b = m408F.f3186a;
        int i9 = c0638b.f3141b;
        int i10 = c0638b.f3142c;
        C0638b c0638b2 = m408F.f3187b;
        m3503n0(i9, i10, c0638b2.f3141b, c0638b2.f3142c, 5);
    }

    /* renamed from: k */
    public final void m3499k(int i7, int i8, CharSequence charSequence) {
        Toast makeText;
        if (i8 < i7) {
            return;
        }
        if (i8 - i7 > this.f6039a3.f6105O1) {
            Context context = getContext();
            int i9 = R$string.sora_editor_clip_text_length_too_large;
            int i10 = C1703a.f7669a.get(i9);
            if (i10 != 0) {
                i9 = i10;
            }
            Toast.makeText(context, i9, 0).show();
            return;
        }
        try {
            String m2126J = charSequence instanceof C0641e ? ((C0641e) charSequence).m2126J(i7, i8) : charSequence.subSequence(i7, i8).toString();
            this.f5991C2.setPrimaryClip(ClipData.newPlainText(m2126J, m2126J));
        } catch (RuntimeException e7) {
            if (e7.getCause() instanceof TransactionTooLargeException) {
                Context context2 = getContext();
                int i11 = R$string.sora_editor_clip_text_length_too_large;
                int i12 = C1703a.f7669a.get(i11);
                if (i12 != 0) {
                    i11 = i12;
                }
                makeText = Toast.makeText(context2, i11, 0);
            } else {
                Log.w("CodeEditor", e7);
                makeText = Toast.makeText(getContext(), e7.getClass().toString(), 0);
            }
            makeText.show();
        }
    }

    /* renamed from: k0 */
    public final void m3500k0(int i7, int i8) {
        m3501l0(i7, i8, 0, true);
    }

    /* renamed from: l0 */
    public final void m3501l0(int i7, int i8, int i9, boolean z6) {
        ((C1706c) this.f6033X2).m4130d();
        if (i8 > 0 && Character.isHighSurrogate(this.f5997F2.m2131c(i7, i8 - 1)) && (i8 = i8 + 1) > this.f5997F2.m2142n(i7)) {
            i8--;
        }
        C0645i c0645i = this.f5995E2;
        c0645i.f3166c = c0645i.f3165b.m2111q(i7, i8).m2115a();
        c0645i.f3167d = c0645i.f3165b.m2111q(i7, i8).m2115a();
        if (this.f6060k2) {
            this.f5994E1 = m3467J();
        }
        m3510s0();
        m3512u0();
        if (this.f6030W1 && !this.f6015O2.m3565d()) {
            if (this.f6052g2 == 0) {
                ((C1706c) this.f6033X2).m4129c();
                ((C1706c) this.f6033X2).m4131e();
            }
        }
        this.f6083z1 = this.f5995E2.m2165c();
        this.f6049e3.m3845a();
        if (z6) {
            m3462E(i7, i8);
        } else {
            invalidate();
        }
        m3485b0(i9);
    }

    /* renamed from: m0 */
    public final void m3502m0(int i7, int i8, int i9, int i10) {
        m3505o0(i7, i8, i9, i10, true, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p022c5.InterfaceC0643g
    /* renamed from: n */
    public final void mo2109n(C0641e c0641e, int i7, int i8, int i9, int i10, StringBuilder sb) {
        ArrayList arrayList;
        C1465e c1465e;
        C1464d c1464d = this.f6049e3;
        C1463c c1463c = c1464d.f6985a;
        if (i7 != i9) {
            c1463c.f6982b.m3866c(i7, i9);
            ReentrantLock reentrantLock = c1463c.f6981a;
            reentrantLock.lock();
            ArrayList arrayList2 = c1463c.f6983c;
            try {
                C2258f.m5467F0(arrayList2, new C1462b(i7, i9));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    C1461a c1461a = (C1461a) it.next();
                    int i11 = c1461a.f6976a;
                    if (i11 > i9) {
                        c1461a.f6976a = i11 - (i9 - i7);
                    }
                }
            } finally {
                reentrantLock.unlock();
            }
        } else {
            c1463c.getClass();
        }
        if (Build.VERSION.SDK_INT >= 29 && (c1465e = c1464d.f6986b) != null) {
            C1170a c1170a = new C1170a();
            C1170a<C1465e.a> c1170a2 = c1465e.f6989b;
            Iterator<C1465e.a> it2 = c1170a2.iterator();
            while (it2.hasNext()) {
                C1465e.a next = it2.next();
                int i12 = next.f6991a;
                if (i12 == i7) {
                    next.f6993c = true;
                } else {
                    if (i7 + 1 <= i12 && i12 <= i9) {
                        c1170a.add(next);
                        next.f6992b.discardDisplayList();
                    } else if (i12 > i9) {
                        next.f6991a = i12 - (i9 - i7);
                    }
                }
            }
            Collection<?> collection = C2262j.f10278c;
            int size = c1170a.size();
            if (size != 0) {
                if (size != 1) {
                    collection = new LinkedHashSet<>(C0017d.m67F(c1170a.size()));
                    Iterator<E> it3 = c1170a.iterator();
                    while (it3.hasNext()) {
                        collection.add(it3.next());
                    }
                } else {
                    collection = Collections.singleton(c1170a.get(0));
                    C0898f.m2605d(collection, "singleton(element)");
                }
            }
            c1170a2.removeAll(collection);
            c1465e.f6990c.addAll(c1170a);
        }
        this.f6051f3.m3520A();
        this.f6081y1.getClass();
        C0638b m2111q = ((C0637a) this.f5997F2.m2145q()).m2111q(i7, i8);
        C0638b m2115a = m2111q.m2115a();
        m2115a.f3142c = i10;
        m2115a.f3141b = i9;
        m2115a.f3140a = sb.length() + m2111q.f3140a;
        C1250g c1250g = this.f6051f3;
        c1250g.m3521a(i7, i7 + 1, c1250g.f6160v, false);
        try {
            C0056f c0056f = this.f6044c3;
            if (c0056f != null) {
                c0056f.f144a.getClass();
                int i13 = m2111q.f3141b;
                int i14 = i13 - m2115a.f3141b;
                if (i14 != 0 && (arrayList = c0056f.f145b) != null) {
                    C0143v.m403C0(i13, i14, arrayList);
                }
            }
            C2251c c2251c = this.f6046d3;
            if (c2251c != null) {
                c2251c.m5457b(m2111q.f3140a, m2115a.f3140a);
            }
        } catch (Exception e7) {
            Log.w("CodeEditor", "Update failure", e7);
        }
        this.f5990C1.mo2109n(c0641e, i7, i8, i9, i10, sb);
        m3488e();
        m3510s0();
        if (!this.f6026U1) {
            m3511t0();
            m3464G();
            this.f6015O2.m3566e();
        }
        if (this.f6030W1 && !this.f5995E2.m2163a() && !this.f6026U1 && !this.f5986A1.f6126b.m2116a()) {
            if (this.f6052g2 == 0) {
                ((C1706c) this.f6033X2).m4129c();
                ((C1706c) this.f6033X2).m4131e();
            }
        }
        this.f6007K2.mo4416a().mo4427e(m2111q, m2115a);
        this.f6083z1 = this.f6040b2 ? this.f5995E2.m2164b() : this.f5995E2.m2165c();
        this.f5988B1.m4244a(new C1775d(this, 3, m2111q, m2115a, sb, this.f5997F2.f3156x1.f3200x1));
        m3485b0(1);
    }

    /* renamed from: n0 */
    public final void m3503n0(int i7, int i8, int i9, int i10, int i11) {
        m3505o0(i7, i8, i9, i10, true, i11);
    }

    /* renamed from: o */
    public final void m3504o(boolean z6) {
        AbstractC1432a c1435d;
        C1171b c1171b;
        AbstractC1432a abstractC1432a = this.f5990C1;
        if (abstractC1432a != null) {
            if ((abstractC1432a instanceof C1435d) && !this.f6032X1) {
                C1435d c1435d2 = (C1435d) abstractC1432a;
                c1435d2.f6873e = this.f5997F2;
                c1435d2.f6888s.getAndIncrement();
                C1837e c1837e = new C1837e(c1435d2.f6872c.getTabWidth());
                c1435d2.f6887Y = c1837e;
                c1837e.f8305f = c1435d2.f6872c.f6078w2;
                try {
                    if (c1435d2.f6886X.f5737a.tryLock(5L, TimeUnit.MILLISECONDS)) {
                        c1435d2.f6886X.f5737a.unlock();
                        C1171b c1171b2 = c1435d2.f6886X;
                        c1171b2.getClass();
                        c1171b2.f5743g = c1171b2.new a();
                        c1171b2.f5741e = 0;
                        c1171b2.f5740d.clear();
                        c1171b2.f5745i = null;
                        c1171b2.f5744h = 0;
                        c1171b = c1435d2.f6886X;
                    } else {
                        c1171b = new C1171b();
                        c1435d2.f6886X = c1171b;
                    }
                    c1435d2.m3818e(c1171b);
                    return;
                } catch (InterruptedException e7) {
                    throw new RuntimeException("Unable to wait for lock", e7);
                }
            }
            if ((abstractC1432a instanceof C1440i) && this.f6032X1) {
                C1440i c1440i = new C1440i(this, this.f5997F2, this.f6069p2, ((C1440i) this.f5990C1).f6913Y, z6);
                this.f5990C1.mo3808j();
                this.f5990C1 = c1440i;
                return;
            }
            abstractC1432a.mo3808j();
        }
        if (this.f6032X1) {
            this.f6051f3.f6163y = (int) m3481X();
            c1435d = new C1440i(this, this.f5997F2, this.f6069p2, null, false);
        } else {
            c1435d = new C1435d(this, this.f5997F2);
        }
        this.f5990C1 = c1435d;
        GestureDetectorOnGestureListenerC1261r gestureDetectorOnGestureListenerC1261r = this.f6015O2;
        if (gestureDetectorOnGestureListenerC1261r != null) {
            gestureDetectorOnGestureListenerC1261r.m3568g(0.0f, 0.0f, false);
        }
    }

    /* renamed from: o0 */
    public final void m3505o0(int i7, int i8, int i9, int i10, boolean z6, int i11) {
        requestFocus();
        int m2141m = getText().m2141m(i7, i8);
        int m2141m2 = getText().m2141m(i9, i10);
        if (m2141m == m2141m2) {
            m3501l0(i7, i8, i11, z6);
            return;
        }
        if (m2141m > m2141m2) {
            m3505o0(i9, i10, i7, i8, z6, i11);
            Log.w("CodeEditor", "setSelectionRegion() error: start > end:start = " + m2141m + " end = " + m2141m2 + " lineLeft = " + i7 + " columnLeft = " + i8 + " lineRight = " + i9 + " columnRight = " + i10);
            return;
        }
        ((C1706c) this.f6033X2).m4127a();
        this.f5995E2.m2163a();
        if (i8 > 0) {
            if (Character.isHighSurrogate(this.f5997F2.m2131c(i7, i8 - 1)) && (i8 = i8 + 1) > this.f5997F2.m2142n(i7)) {
                i8--;
            }
        }
        if (i10 > 0) {
            if (Character.isHighSurrogate(this.f5997F2.m2131c(i9, i10 - 1)) && (i10 = i10 + 1) > this.f5997F2.m2142n(i9)) {
                i10--;
            }
        }
        C0645i c0645i = this.f5995E2;
        c0645i.f3166c = c0645i.f3165b.m2111q(i7, i8).m2115a();
        C0645i c0645i2 = this.f5995E2;
        c0645i2.f3167d = c0645i2.f3165b.m2111q(i9, i10).m2115a();
        m3510s0();
        m3512u0();
        this.f6049e3.m3845a();
        if (!this.f5995E2.m2164b().equals(this.f6083z1) && !this.f5995E2.m2165c().equals(this.f6083z1)) {
            this.f6083z1 = this.f5995E2.m2165c();
        }
        if (z6) {
            if (i11 == 6) {
                m3462E(i7, i8);
                this.f6011M2 = 0L;
            }
            m3462E(i9, i10);
        } else {
            invalidate();
        }
        m3485b0(i11);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5988B1.m4244a(new C1779h(this));
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        return isEnabled() && m3476S();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        GestureDetectorOnGestureListenerC1261r gestureDetectorOnGestureListenerC1261r = this.f6015O2;
        gestureDetectorOnGestureListenerC1261r.f6232Q1 = 0.0f;
        gestureDetectorOnGestureListenerC1261r.f6231P1 = 0.0f;
        gestureDetectorOnGestureListenerC1261r.f6237V1 = false;
        gestureDetectorOnGestureListenerC1261r.f6238W1 = false;
        gestureDetectorOnGestureListenerC1261r.f6240X1 = null;
        if (gestureDetectorOnGestureListenerC1261r.f6235T1) {
            gestureDetectorOnGestureListenerC1261r.f6235T1 = false;
            gestureDetectorOnGestureListenerC1261r.f6234S1 = 0L;
        }
        this.f6038a2 = false;
        this.f6036Z1 = false;
    }

    @Override // android.view.View
    public final void onCreateContextMenu(ContextMenu contextMenu) {
        super.onCreateContextMenu(contextMenu);
        PointF pointF = this.f6015O2.f6236U1;
        if (pointF == null) {
            return;
        }
        long m3470M = m3470M(pointF.x, pointF.y);
        this.f5988B1.m4244a(new C1777f(this, contextMenu, ((C0637a) this.f5997F2.m2145q()).m2111q((int) (m3470M >> 32), C0017d.m62A(m3470M))));
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        if (!m3476S() || !isEnabled()) {
            return null;
        }
        if (m3490f()) {
            int i7 = this.f5998G1;
            if (i7 == 0) {
                i7 = 131073;
            }
            editorInfo.inputType = i7;
        } else {
            editorInfo.inputType = 0;
        }
        editorInfo.initialSelStart = getCursor() != null ? getCursor().f3166c.f3140a : 0;
        editorInfo.initialSelEnd = getCursor() != null ? getCursor().f3167d.f3140a : 0;
        editorInfo.initialCapsMode = this.f5986A1.getCursorCapsMode(0);
        this.f6039a3.getClass();
        editorInfo.imeOptions = 301989888;
        this.f5988B1.m4244a(new C1770a(this, editorInfo));
        C1248e c1248e = this.f5986A1;
        C0641e text = c1248e.f6125a.getText();
        while (true) {
            if (!(text.f3148X > 0)) {
                C0640d c0640d = c1248e.f6126b;
                c0640d.f3146b = -1;
                c0640d.f3145a = -1;
                c1248e.f6127c = false;
                this.f5997F2.f3148X = 0;
                setExtracting(null);
                return this.f5986A1;
            }
            text.m2140l();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f5988B1.m4244a(new C1779h(this));
        RunnableC1246c runnableC1246c = this.f6037Z2;
        runnableC1246c.f6089m = false;
        removeCallbacks(runnableC1246c);
    }

    @Override // android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        C1248e c1248e;
        int action = dragEvent.getAction();
        if (action == 1) {
            return true;
        }
        if (action == 2) {
            long m3470M = m3470M(dragEvent.getX(), dragEvent.getY());
            this.f6015O2.f6240X1 = ((C0637a) getText().m2145q()).m2111q((int) (m3470M >> 32), C0017d.m62A(m3470M));
            postInvalidate();
            this.f6015O2.m3569h(null, dragEvent.getX(), dragEvent.getY());
            return true;
        }
        if (action == 6) {
            this.f6015O2.f6240X1 = null;
            postInvalidate();
            return true;
        }
        if (action != 3) {
            return super.onDragEvent(dragEvent);
        }
        GestureDetectorOnGestureListenerC1261r gestureDetectorOnGestureListenerC1261r = this.f6015O2;
        C0638b c0638b = gestureDetectorOnGestureListenerC1261r.f6240X1;
        if (c0638b == null) {
            return false;
        }
        gestureDetectorOnGestureListenerC1261r.f6240X1 = null;
        m3500k0(c0638b.f3141b, c0638b.f3142c);
        String m3366a = C1172c.m3366a(dragEvent.getClipData());
        if (m3366a != null && (c1248e = this.f5986A1) != null) {
            c1248e.commitText(m3366a, 1);
            this.f6039a3.getClass();
            m3484a0();
        }
        requestFocus();
        postInvalidate();
        super.onDragEvent(dragEvent);
        return true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C1250g c1250g = this.f6051f3;
        c1250g.getClass();
        int save = canvas.save();
        canvas.translate(c1250g.f6153o.getOffsetX(), c1250g.f6153o.getOffsetY());
        c1250g.f6136C = true;
        try {
            c1250g.m3536p(canvas);
            c1250g.f6136C = false;
            canvas.restoreToCount(save);
            if (!(this.f6071r2 == this.f6037Z2.f6088e && this.f6015O2.f6247e.f6181b.isFinished()) && this.f6015O2.f6249s.f6661e.isShowing()) {
                this.f6071r2 = this.f6037Z2.f6088e;
                C1371h0 c1371h0 = this.f6015O2.f6249s;
                Objects.requireNonNull(c1371h0);
                m3489e0(new RunnableC0123h(6, c1371h0));
            }
        } catch (Throwable th) {
            c1250g.f6136C = false;
            throw th;
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z6, int i7, Rect rect) {
        super.onFocusChanged(z6, i7, rect);
        RunnableC1246c runnableC1246c = this.f6037Z2;
        if (z6) {
            boolean z7 = runnableC1246c.f6085X > 0;
            runnableC1246c.f6089m = z7;
            if (z7) {
                m3489e0(runnableC1246c);
            }
        } else {
            runnableC1246c.f6089m = false;
            runnableC1246c.f6088e = false;
            this.f6015O2.m3566e();
            removeCallbacks(this.f6037Z2);
        }
        this.f5988B1.m4244a(new C1780i(this, z6));
        invalidate();
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (motionEvent.isFromSource(8194)) {
            int i7 = 0;
            if (motionEvent.getAction() == 9) {
                this.f6036Z1 = true;
            } else if (motionEvent.getAction() == 10) {
                this.f6036Z1 = false;
            }
            if (motionEvent.getActionMasked() == 11 || motionEvent.getActionMasked() == 12) {
                this.f6038a2 = motionEvent.getButtonState() != 0;
            }
            int action = motionEvent.getAction();
            if (action == 7 || action == 9 || action == 10) {
                this.f6015O2.m3563b(new C1244a(i7), null, motionEvent);
                return true;
            }
        }
        if (motionEvent.getAction() == 8 && motionEvent.isFromSource(2)) {
            C1249f c1249f = this.f6042c;
            if (!c1249f.f6129b.f5676c) {
                float f7 = -motionEvent.getAxisValue(9);
                float f8 = -motionEvent.getAxisValue(10);
                float f9 = this.f6014O1;
                float f10 = this.f6039a3.f6112V1;
                float f11 = f8 * f9 * f10;
                float f12 = f7 * f9 * f10;
                if (c1249f.f6129b.m3323a()) {
                    float f13 = this.f6039a3.f6106P1;
                    f11 *= f13;
                    f12 *= f13;
                }
                if (c1249f.f6129b.m3324b()) {
                    float f14 = f12;
                    f12 = f11;
                    f11 = f14;
                }
                this.f6015O2.onScroll(motionEvent, motionEvent, f11, f12);
                return true;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        int scrollMaxY = getScrollMaxY();
        accessibilityEvent.setScrollable(scrollMaxY > 0);
        accessibilityEvent.setMaxScrollX(getScrollMaxX());
        accessibilityEvent.setMaxScrollY(scrollMaxY);
    }

    /* JADX WARN: Code restructure failed: missing block: B:166:0x017a, code lost:
    
        if (r4.equals(r0) != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0208, code lost:
    
        r5.f6083z1 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0205, code lost:
    
        r5.f6083z1 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0203, code lost:
    
        if (r4.equals(r0) != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0417, code lost:
    
        if (r5.m3480W() != false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0477, code lost:
    
        if (r5.m3480W() != false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x04f0, code lost:
    
        if (r15.m4243a(true) == false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x04f3, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x04c1, code lost:
    
        if (r15.m4243a(true) == false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0518, code lost:
    
        if (r15.m4243a(true) == false) goto L254;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x059f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:299:0x05de A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0704  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x072a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x072f  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onKeyDown(int r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instructions count: 1886
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p055g5.C1245b.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyMultiple(int i7, int i8, KeyEvent keyEvent) {
        C1245b c1245b = this.f6042c.f6128a;
        C1782k c1782k = new C1782k(c1245b, keyEvent, 3);
        return c1782k.m4243a((c1245b.f5988B1.m4244a(c1782k) & 2) != 0 ? false : super.onKeyMultiple(i7, i8, keyEvent));
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i7, KeyEvent keyEvent) {
        C1249f c1249f = this.f6042c;
        C1139a c1139a = c1249f.f6129b;
        c1139a.getClass();
        c1139a.onKeyUp(c1139a.f5674a, c1139a.f5675b, keyEvent.getKeyCode(), keyEvent);
        c1139a.f5676c = keyEvent.isCtrlPressed();
        C1245b c1245b = c1249f.f6128a;
        C1787p c1787p = c1245b.f5988B1;
        c1245b.getCursor();
        boolean z6 = true;
        C1782k c1782k = new C1782k(c1245b, keyEvent, 1);
        if ((c1787p.m4244a(c1782k) & 2) != 0) {
            return c1782k.m4243a(false);
        }
        if (c1249f.m3519a(i7, keyEvent)) {
            keyEvent.isCtrlPressed();
            c1139a.m3324b();
            c1139a.m3323a();
            C1792u c1792u = new C1792u(c1245b, keyEvent, 1);
            if ((c1787p.m4244a(c1792u) & 2) != 0) {
                if (!c1792u.m4243a(false) && !c1782k.m4243a(false)) {
                    z6 = false;
                }
                return z6;
            }
        }
        return c1782k.m4243a(super.onKeyUp(i7, keyEvent));
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        int i9;
        int i10;
        int makeMeasureSpec;
        int i11;
        int m62A;
        int i12;
        float f7;
        int i13;
        int i14 = 0;
        if (View.MeasureSpec.getMode(i7) == 1073741824 && View.MeasureSpec.getMode(i8) == 1073741824) {
            this.f6076v2 = false;
            i11 = i7;
            m62A = i8;
        } else {
            Log.w("CodeEditor", "use wrap_content in editor may cause layout lags");
            float m3482Y = m3482Y();
            float rowHeight = getRowHeight();
            boolean z6 = this.f6032X1;
            int i15 = this.f5992D1;
            C0641e c0641e = this.f5997F2;
            final C1836d c1836d = this.f6051f3.f6140b;
            int size = View.MeasureSpec.getSize(i7);
            int size2 = View.MeasureSpec.getSize(i8);
            final C1837e c1837e = new C1837e(i15);
            int mode = View.MeasureSpec.getMode(i7);
            if (z6) {
                if (mode != 1073741824) {
                    final int[] iArr = View.MeasureSpec.getMode(i8) != 1073741824 ? new int[c0641e.m2147s()] : null;
                    final C1176g c1176g = new C1176g(0);
                    c0641e.m2121E(c0641e.m2147s() - 1, new C0641e.b() { // from class: j5.g
                        @Override // p022c5.C0641e.b
                        /* renamed from: a */
                        public final void mo2156a(int i16, C0642f c0642f, C0892c c0892c) {
                            int ceil = (int) Math.ceil(C1837e.this.m4328d(c0642f.f3159c, c0642f.f3160e, c1836d));
                            C1176g c1176g2 = c1176g;
                            if (ceil > c1176g2.f5761a) {
                                c1176g2.f5761a = ceil;
                            }
                            int[] iArr2 = iArr;
                            if (iArr2 != null) {
                                iArr2[i16] = ceil;
                            }
                        }
                    });
                    int min = (int) Math.min(size, c1176g.f5761a + m3482Y);
                    int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
                    if (iArr != null) {
                        int i16 = (int) (min - m3482Y);
                        if (i16 <= 0) {
                            i13 = c0641e.f3154s;
                            f7 = rowHeight;
                        } else {
                            int i17 = 0;
                            while (i14 < iArr.length) {
                                i17 = (int) (Math.max(1.0d, Math.ceil((iArr[i14] * 1.0d) / i16)) + i17);
                                i14++;
                                rowHeight = rowHeight;
                            }
                            f7 = rowHeight;
                            i13 = i17;
                        }
                        i12 = View.MeasureSpec.makeMeasureSpec(Math.min((int) (i13 * f7), size2), 1073741824);
                    } else {
                        i12 = i8;
                    }
                    makeMeasureSpec = i12;
                    i10 = makeMeasureSpec2;
                } else if (View.MeasureSpec.getMode(i8) != 1073741824) {
                    final C1176g c1176g2 = new C1176g(0);
                    final int i18 = (int) (size - m3482Y);
                    if (i18 <= 0) {
                        c1176g2.f5761a = c0641e.f3154s;
                    } else {
                        c0641e.m2121E(c0641e.m2147s() - 1, new C0641e.b() { // from class: j5.h
                            @Override // p022c5.C0641e.b
                            /* renamed from: a */
                            public final void mo2156a(int i19, C0642f c0642f, C0892c c0892c) {
                                int ceil = (int) Math.ceil(C1837e.this.m4328d(c0642f.f3159c, c0642f.f3160e, c1836d));
                                c1176g2.f5761a = (int) (Math.max(1.0d, Math.ceil((ceil * 1.0d) / i18)) + r10.f5761a);
                            }
                        });
                    }
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min((int) (c1176g2.f5761a * rowHeight), size2), 1073741824);
                    i10 = i7;
                } else {
                    i10 = i7;
                    makeMeasureSpec = i8;
                }
                long m68G = C0017d.m68G(i10, makeMeasureSpec);
                i11 = (int) (m68G >> 32);
                m62A = C0017d.m62A(m68G);
                this.f6076v2 = true;
            } else {
                if (mode != 1073741824) {
                    int m2147s = c0641e.m2147s() - 1;
                    c0641e.m2154z(false);
                    int i19 = 0;
                    for (int i20 = 0; i20 <= m2147s; i20++) {
                        try {
                            C0642f c0642f = (C0642f) c0641e.f3151c.get(i20);
                            c0641e.f3155w1.m2596b(i20);
                            int ceil = (int) Math.ceil(c1837e.m4328d(c0642f.f3159c, c0642f.f3160e, c1836d));
                            if (ceil > i19) {
                                i19 = ceil;
                            }
                        } catch (Throwable th) {
                            c0641e.m2128L(false);
                            throw th;
                        }
                    }
                    c0641e.m2128L(false);
                    i9 = 1073741824;
                    i10 = View.MeasureSpec.makeMeasureSpec((int) Math.min(i19 + m3482Y, size), 1073741824);
                } else {
                    i9 = 1073741824;
                    i10 = i7;
                }
                if (View.MeasureSpec.getSize(i8) != i9) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(size2, (int) (c0641e.m2147s() * rowHeight)), i9);
                    long m68G2 = C0017d.m68G(i10, makeMeasureSpec);
                    i11 = (int) (m68G2 >> 32);
                    m62A = C0017d.m62A(m68G2);
                    this.f6076v2 = true;
                }
                makeMeasureSpec = i8;
                long m68G22 = C0017d.m68G(i10, makeMeasureSpec);
                i11 = (int) (m68G22 >> 32);
                m62A = C0017d.m62A(m68G22);
                this.f6076v2 = true;
            }
        }
        super.onMeasure(i11, m62A);
    }

    @Override // android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i7) {
        int i8;
        if (Build.VERSION.SDK_INT < 24 || !motionEvent.isFromSource(8194)) {
            return super.onResolvePointerIcon(motionEvent, i7);
        }
        m3477T();
        if (this.f6015O2.m3565d()) {
            return PointerIcon.getSystemIcon(getContext(), 1021);
        }
        if (getLeftHandleDescriptor().f7546a.contains(motionEvent.getX(), motionEvent.getY()) || getRightHandleDescriptor().f7546a.contains(motionEvent.getX(), motionEvent.getY()) || getInsertHandleDescriptor().f7546a.contains(motionEvent.getX(), motionEvent.getY())) {
            return PointerIcon.getSystemIcon(getContext(), 1020);
        }
        long m75N = C0017d.m75N(this, motionEvent, i7);
        int i9 = (int) (m75N >> 32);
        boolean z6 = C0017d.m62A(m75N) == 0;
        if (i9 != 5 || !z6) {
            return (i9 == 1 && ((i8 = this.f6039a3.f6102L1) == 1 || i8 == 2)) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i7);
        }
        GestureDetectorOnGestureListenerC1261r gestureDetectorOnGestureListenerC1261r = this.f6015O2;
        return (!gestureDetectorOnGestureListenerC1261r.f6238W1 || gestureDetectorOnGestureListenerC1261r.f6237V1) ? PointerIcon.getSystemIcon(getContext(), 1008) : PointerIcon.getSystemIcon(getContext(), 1021);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        Rect rect = this.f6051f3.f6142d;
        rect.right = i7;
        rect.bottom = i8;
        getVerticalEdgeEffect().setSize(i7, i8);
        getHorizontalEdgeEffect().setSize(i8, i7);
        getVerticalEdgeEffect().finish();
        getHorizontalEdgeEffect().finish();
        if (this.f5990C1 == null || (this.f6032X1 && i7 != i9)) {
            m3504o(true);
        } else {
            this.f6015O2.m3568g(getOffsetX() > getScrollMaxX() ? getScrollMaxX() - getOffsetX() : 0.0f, getOffsetY() > getScrollMaxY() ? getScrollMaxY() - getOffsetY() : 0.0f, false);
        }
        this.f6059j3 = false;
        this.f6061k3 = false;
        if (i10 <= i8 || !this.f6039a3.f6122y1) {
            return;
        }
        m3464G();
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i7;
        if (!isEnabled()) {
            return false;
        }
        if (!motionEvent.isFromSource(8194)) {
            m3477T();
            GestureDetectorOnGestureListenerC1261r gestureDetectorOnGestureListenerC1261r = this.f6015O2;
            boolean z6 = gestureDetectorOnGestureListenerC1261r.f6222G1 || gestureDetectorOnGestureListenerC1261r.f6221F1 || gestureDetectorOnGestureListenerC1261r.m3565d();
            boolean m3567f = this.f6015O2.m3567f(motionEvent);
            GestureDetectorOnGestureListenerC1261r gestureDetectorOnGestureListenerC1261r2 = this.f6015O2;
            boolean z7 = gestureDetectorOnGestureListenerC1261r2.f6222G1 || gestureDetectorOnGestureListenerC1261r2.f6221F1 || gestureDetectorOnGestureListenerC1261r2.m3565d();
            boolean onTouchEvent = this.f6021R2.onTouchEvent(motionEvent);
            boolean onTouchEvent2 = (z7 || z6) ? false : this.f6019Q2.onTouchEvent(motionEvent);
            if (motionEvent.getAction() == 1) {
                this.f6025T2.onRelease();
                this.f6027U2.onRelease();
            }
            return onTouchEvent || onTouchEvent2 || m3567f;
        }
        this.f6039a3.getClass();
        GestureDetectorOnGestureListenerC1261r gestureDetectorOnGestureListenerC1261r3 = this.f6015O2;
        C1245b c1245b = gestureDetectorOnGestureListenerC1261r3.f6246c;
        c1245b.m3477T();
        if (gestureDetectorOnGestureListenerC1261r3.f6222G1 || gestureDetectorOnGestureListenerC1261r3.f6221F1) {
            return gestureDetectorOnGestureListenerC1261r3.m3567f(motionEvent);
        }
        gestureDetectorOnGestureListenerC1261r3.f6236U1 = null;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            gestureDetectorOnGestureListenerC1261r3.f6231P1 = motionEvent.getX();
            gestureDetectorOnGestureListenerC1261r3.f6232Q1 = motionEvent.getY();
            int buttonState = motionEvent.getButtonState();
            gestureDetectorOnGestureListenerC1261r3.f6233R1 = buttonState;
            gestureDetectorOnGestureListenerC1261r3.f6237V1 = true;
            if ((buttonState & 1) == 0) {
                return true;
            }
            if (gestureDetectorOnGestureListenerC1261r3.m3567f(motionEvent)) {
                if (gestureDetectorOnGestureListenerC1261r3.f6222G1 || gestureDetectorOnGestureListenerC1261r3.f6221F1) {
                    return true;
                }
            }
            if (SystemClock.uptimeMillis() - gestureDetectorOnGestureListenerC1261r3.f6234S1 < ViewConfiguration.getDoubleTapTimeout()) {
                gestureDetectorOnGestureListenerC1261r3.f6235T1 = true;
                gestureDetectorOnGestureListenerC1261r3.onDoubleTap(motionEvent);
                return true;
            }
            long m3470M = c1245b.m3470M(gestureDetectorOnGestureListenerC1261r3.f6231P1, gestureDetectorOnGestureListenerC1261r3.f6232Q1);
            int i8 = (int) (m3470M >> 32);
            int m62A = C0017d.m62A(m3470M);
            C0638b m2111q = ((C0637a) c1245b.getText().m2145q()).m2111q(i8, m62A);
            if (c1245b.m3480W()) {
                C0651o cursorRange = c1245b.getCursorRange();
                cursorRange.getClass();
                int i9 = m2111q.f3140a;
                if ((i9 >= cursorRange.f3186a.f3140a && i9 < cursorRange.f3187b.f3140a) && c1245b.m3479V(gestureDetectorOnGestureListenerC1261r3.f6231P1, gestureDetectorOnGestureListenerC1261r3.f6232Q1)) {
                    gestureDetectorOnGestureListenerC1261r3.f6238W1 = true;
                    gestureDetectorOnGestureListenerC1261r3.f6240X1 = m2111q;
                    c1245b.postInvalidate();
                    return true;
                }
            }
            gestureDetectorOnGestureListenerC1261r3.f6238W1 = false;
            c1245b.m3501l0(i8, m62A, 8, true);
            c1245b.requestFocus();
            gestureDetectorOnGestureListenerC1261r3.f6240X1 = m2111q;
            c1245b.postInvalidate();
            return true;
        }
        if (actionMasked == 2) {
            if (gestureDetectorOnGestureListenerC1261r3.f6235T1) {
                return true;
            }
            float abs = Math.abs(motionEvent.getX() - gestureDetectorOnGestureListenerC1261r3.f6231P1);
            float f7 = gestureDetectorOnGestureListenerC1261r3.f6229N1;
            if (abs > f7 || Math.abs(motionEvent.getY() - gestureDetectorOnGestureListenerC1261r3.f6232Q1) > f7) {
                gestureDetectorOnGestureListenerC1261r3.f6237V1 = false;
            }
            if ((gestureDetectorOnGestureListenerC1261r3.f6233R1 & 1) == 0) {
                return true;
            }
            long m3470M2 = c1245b.m3470M(motionEvent.getX(), motionEvent.getY());
            int i10 = (int) (m3470M2 >> 32);
            int m62A2 = C0017d.m62A(m3470M2);
            C0638b m2111q2 = ((C0637a) c1245b.getText().m2145q()).m2111q(i10, m62A2);
            if (!gestureDetectorOnGestureListenerC1261r3.f6237V1 && !gestureDetectorOnGestureListenerC1261r3.f6238W1) {
                C1245b c1245b2 = gestureDetectorOnGestureListenerC1261r3.f6246c;
                C0638b c0638b = c1245b2.f6083z1;
                c1245b2.m3503n0(c0638b.f3141b, c0638b.f3142c, i10, m62A2, 8);
            }
            gestureDetectorOnGestureListenerC1261r3.f6240X1 = m2111q2;
            c1245b.postInvalidate();
            gestureDetectorOnGestureListenerC1261r3.m3569h(motionEvent, 0.0f, 0.0f);
            return true;
        }
        if (actionMasked == 1) {
            if (motionEvent.getEventTime() - motionEvent.getDownTime() > ViewConfiguration.getTapTimeout() * 2.0f) {
                gestureDetectorOnGestureListenerC1261r3.f6237V1 = false;
            }
            if (!gestureDetectorOnGestureListenerC1261r3.f6235T1) {
                if (gestureDetectorOnGestureListenerC1261r3.f6238W1 && !gestureDetectorOnGestureListenerC1261r3.f6237V1 && (gestureDetectorOnGestureListenerC1261r3.f6233R1 & 1) != 0) {
                    long m3470M3 = c1245b.m3470M(motionEvent.getX(), motionEvent.getY());
                    C0638b m2111q3 = ((C0637a) c1245b.getText().m2145q()).m2111q((int) (m3470M3 >> 32), C0017d.m62A(m3470M3));
                    C0651o cursorRange2 = c1245b.getCursorRange();
                    cursorRange2.getClass();
                    int i11 = m2111q3.f3140a;
                    if (!(i11 >= cursorRange2.f3186a.f3140a && i11 < cursorRange2.f3187b.f3140a)) {
                        boolean z8 = c1245b.getKeyMetaStates().f5676c;
                        C0638b c0638b2 = cursorRange2.f3187b;
                        if (z8 || !c0638b2.equals(m2111q3)) {
                            int i12 = c0638b2.f3140a;
                            C0638b c0638b3 = cursorRange2.f3186a;
                            int i13 = i12 - c0638b3.f3140a;
                            if (c1245b.getKeyMetaStates().f5676c) {
                                i7 = m2111q3.f3140a;
                            } else {
                                i7 = m2111q3.f3140a;
                                if (i7 >= c0638b3.f3140a) {
                                    i7 -= i13;
                                }
                            }
                            C0641e text = c1245b.getText();
                            String m2126J = text.m2126J(c0638b3.f3140a, c0638b2.f3140a);
                            if (c1245b.getKeyMetaStates().f5676c) {
                                text.m2151w(m2111q3.f3141b, m2111q3.f3142c, m2126J);
                            } else {
                                text.m2130b();
                                c1245b.m3459B();
                                m2111q3 = ((C0637a) text.m2145q()).m2110o(i7);
                                text.m2151w(m2111q3.f3141b, m2111q3.f3142c, m2126J);
                                text.m2140l();
                            }
                            C0638b m2110o = ((C0637a) text.m2145q()).m2110o(i7 + i13);
                            gestureDetectorOnGestureListenerC1261r3.f6246c.m3503n0(m2111q3.f3141b, m2111q3.f3142c, m2110o.f3141b, m2110o.f3142c, 8);
                        }
                    }
                }
                if (gestureDetectorOnGestureListenerC1261r3.f6237V1) {
                    int i14 = gestureDetectorOnGestureListenerC1261r3.f6233R1;
                    if ((i14 & 1) != 0) {
                        gestureDetectorOnGestureListenerC1261r3.onSingleTapUp(motionEvent);
                        gestureDetectorOnGestureListenerC1261r3.f6234S1 = motionEvent.getEventTime();
                    } else if ((i14 & 2) != 0) {
                        gestureDetectorOnGestureListenerC1261r3.f6236U1 = new PointF(motionEvent.getX(), motionEvent.getY());
                        if ((gestureDetectorOnGestureListenerC1261r3.m3563b(new C0091c(), null, motionEvent) & 2) == 0) {
                            int i15 = Build.VERSION.SDK_INT;
                            if (i15 >= 24) {
                                c1245b.performContextClick(motionEvent.getX(), motionEvent.getY());
                            } else if (i15 >= 23) {
                                c1245b.performContextClick();
                            }
                            if (c1245b.getProps().f6110T1) {
                                if (i15 >= 24) {
                                    c1245b.showContextMenu(motionEvent.getX(), motionEvent.getY());
                                } else {
                                    c1245b.showContextMenu();
                                }
                            }
                        }
                    }
                }
            }
        } else if (actionMasked != 3) {
            return true;
        }
        gestureDetectorOnGestureListenerC1261r3.f6232Q1 = 0.0f;
        gestureDetectorOnGestureListenerC1261r3.f6231P1 = 0.0f;
        gestureDetectorOnGestureListenerC1261r3.f6237V1 = false;
        gestureDetectorOnGestureListenerC1261r3.f6238W1 = false;
        gestureDetectorOnGestureListenerC1261r3.f6240X1 = null;
        if (gestureDetectorOnGestureListenerC1261r3.f6235T1) {
            gestureDetectorOnGestureListenerC1261r3.f6235T1 = false;
            gestureDetectorOnGestureListenerC1261r3.f6234S1 = 0L;
        }
        gestureDetectorOnGestureListenerC1261r3.f6228M1 = 0;
        return true;
    }

    /* renamed from: p0 */
    public final void m3506p0(boolean z6, boolean z7) {
        if (this.f6032X1 == z6 && this.f6069p2 == z7) {
            return;
        }
        this.f6032X1 = z6;
        this.f6069p2 = z7;
        m3493g0();
        m3504o(true);
        if (!z6) {
            this.f6049e3.m3845a();
        }
        invalidate();
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        if (i7 == 16384) {
            m3496i(true);
            return true;
        }
        if (i7 == 65536) {
            m3513x();
            return true;
        }
        if (i7 == 32768) {
            m3486c0();
            return true;
        }
        if (i7 == 2097152) {
            setText(bundle.getCharSequence("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE"));
            return true;
        }
        if (i7 == 8192) {
            m3483Z(EnumC1262s.PAGE_DOWN);
            return true;
        }
        if (i7 == 4096) {
            m3483Z(EnumC1262s.PAGE_UP);
            return true;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (i7 == 16908346) {
                m3483Z(EnumC1262s.PAGE_UP);
                return true;
            }
            if (i7 == 16908344) {
                m3483Z(EnumC1262s.PAGE_DOWN);
                return true;
            }
        }
        return super.performAccessibilityAction(i7, bundle);
    }

    /* renamed from: q */
    public final String m3507q() {
        InterfaceC1885b editorLanguage = getEditorLanguage();
        int tabWidth = getTabWidth();
        int tabWidth2 = getTabWidth();
        editorLanguage.mo4424i();
        return C0143v.m468v(tabWidth, tabWidth2, false);
    }

    /* renamed from: q0 */
    public final void m3508q0(Class cls, InterfaceC1788q interfaceC1788q) {
        this.f5988B1.m4249f(cls, interfaceC1788q);
    }

    /* renamed from: r0 */
    public final void m3509r0() {
        C0651o c0651o;
        C0641e c0641e = this.f5997F2;
        C0653q c0653q = c0641e.f3156x1;
        if (!(c0653q.f3196e && c0653q.f3199w1 > 0) || c0653q.f3200x1) {
            c0651o = null;
        } else {
            c0653q.f3200x1 = true;
            C0653q.b bVar = (C0653q.b) c0653q.f3195c.get(c0653q.f3199w1 - 1);
            bVar.mo2177j(c0641e);
            c0653q.f3199w1--;
            c0653q.f3200x1 = false;
            c0651o = bVar.f3203c;
        }
        if (c0651o != null) {
            try {
                C0638b c0638b = c0651o.f3186a;
                int i7 = c0638b.f3141b;
                int i8 = c0638b.f3142c;
                C0638b c0638b2 = c0651o.f3187b;
                m3505o0(i7, i8, c0638b2.f3141b, c0638b2.f3142c, true, 1);
            } catch (IndexOutOfBoundsException unused) {
            }
        }
        m3484a0();
    }

    @Override // android.view.View
    public final boolean removeCallbacks(Runnable runnable) {
        HandlerC1173d.f5755a.removeCallbacks(runnable);
        return super.removeCallbacks(runnable);
    }

    /* renamed from: s0 */
    public final void m3510s0() {
        m3511t0();
        ExtractedTextRequest extractedTextRequest = this.f6029V2;
        if (extractedTextRequest != null) {
            this.f5993D2.updateExtractedText(this, this.f6029V2.token, m3466I(extractedTextRequest));
        }
        if (this.f5997F2.f3148X <= 1 || this.f5986A1.f6126b.m2116a()) {
            return;
        }
        m3512u0();
    }

    public void setBasicDisplayMode(boolean z6) {
        boolean z7 = !z6;
        C0891b c0891b = this.f5997F2.f3155w1;
        c0891b.f4674m = z7;
        if (!z7) {
            Arrays.fill(c0891b.f4672c, (Object) null);
        }
        this.f6049e3.m3845a();
        C1250g c1250g = this.f6051f3;
        c1250g.f6137D = z6;
        c1250g.m3520A();
        invalidate();
    }

    public void setBlockLineEnabled(boolean z6) {
        this.f6056i2 = z6;
        invalidate();
    }

    public void setBlockLineWidth(float f7) {
        this.f6012N1 = f7;
        invalidate();
    }

    public void setColorScheme(C1510a c1510a) {
        C1510a c1510a2 = this.f6001H2;
        if (c1510a2 != null) {
            Iterator it = c1510a2.f7135b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((WeakReference) it.next()).get() == this) {
                    it.remove();
                    break;
                }
            }
        }
        this.f6001H2 = c1510a;
        c1510a.m3926b(this);
        invalidate();
    }

    public void setCursorAnimationEnabled(boolean z6) {
        if (!z6) {
            ((C1706c) this.f6033X2).m4127a();
        }
        this.f6067n2 = z6;
    }

    public void setCursorAnimator(InterfaceC1670a interfaceC1670a) {
        this.f6033X2 = interfaceC1670a;
    }

    public void setCursorBlinkPeriod(int i7) {
        RunnableC1246c runnableC1246c = this.f6037Z2;
        if (runnableC1246c == null) {
            this.f6037Z2 = new RunnableC1246c(this, i7);
            return;
        }
        int i8 = runnableC1246c.f6085X;
        runnableC1246c.f6085X = i7;
        if (i7 <= 0) {
            runnableC1246c.f6088e = true;
            runnableC1246c.f6089m = false;
        } else {
            runnableC1246c.f6089m = true;
        }
        if (i8 <= 0 && runnableC1246c.f6089m && isAttachedToWindow()) {
            m3489e0(this.f6037Z2);
        }
    }

    public void setCursorWidth(float f7) {
        if (f7 < 0.0f) {
            throw new IllegalArgumentException("width can not be under zero");
        }
        this.f6010M1 = f7;
        invalidate();
    }

    public void setDiagnosticIndicatorStyle(EnumC1671b enumC1671b) {
        this.f6009L2 = enumC1671b;
        invalidate();
    }

    public void setDiagnostics(C2251c c2251c) {
        this.f6046d3 = c2251c;
        invalidate();
    }

    public void setDisableSoftKbdIfHardKbdAvailable(boolean z6) {
        if (this.f6082y2 == z6) {
            return;
        }
        this.f6082y2 = z6;
        this.f5993D2.hideSoftInputFromWindow(getWindowToken(), 0);
        m3495h0();
    }

    public void setDisplayLnPanel(boolean z6) {
        this.f6045d2 = z6;
        invalidate();
    }

    public void setDividerMargin(float f7) {
        if (f7 < 0.0f || f7 < 0.0f) {
            throw new IllegalArgumentException("margin can not be under zero");
        }
        this.f6006K1 = f7;
        this.f6008L1 = f7;
        m3493g0();
        invalidate();
    }

    public void setDividerWidth(float f7) {
        if (f7 < 0.0f) {
            throw new IllegalArgumentException("width can not be under zero");
        }
        this.f6004J1 = f7;
        m3493g0();
        invalidate();
    }

    public void setEdgeEffectColor(int i7) {
        this.f6025T2.setColor(i7);
        this.f6027U2.setColor(i7);
    }

    public void setEditable(boolean z6) {
        this.f6030W1 = z6;
        if (z6) {
            return;
        }
        this.f5993D2.hideSoftInputFromWindow(getWindowToken(), 0);
        this.f6066m3.m3951d();
    }

    public void setEditorLanguage(InterfaceC1885b interfaceC1885b) {
        if (interfaceC1885b == null) {
            interfaceC1885b = new C1884a();
        }
        InterfaceC1885b interfaceC1885b2 = this.f6007K2;
        if (interfaceC1885b2 != null) {
            interfaceC1885b2.mo4422g();
            ((AbstractC1268b) interfaceC1885b2.mo4416a()).f6333a = null;
            interfaceC1885b2.mo4416a().destroy();
            interfaceC1885b2.destroy();
        }
        C1258o c1258o = this.f6081y1;
        c1258o.f6212b = null;
        c1258o.f6213c = null;
        this.f6007K2 = interfaceC1885b;
        this.f6044c3 = null;
        this.f6046d3 = null;
        InterfaceC1926a mo4416a = interfaceC1885b.mo4416a();
        ((AbstractC1268b) mo4416a).f6333a = this.f6081y1;
        C0641e c0641e = this.f5997F2;
        if (c0641e != null) {
            mo4416a.mo3579a(new C0644h(c0641e), this.f6041b3);
        }
        C1263t c1263t = this.f6047e;
        if (c1263t != null) {
            c1263t.f6298c = null;
        }
        C1263t mo4423h = this.f6007K2.mo4423h();
        this.f6047e = mo4423h;
        if (mo4423h == null) {
            Log.w("CodeEditor", "Language(" + this.f6007K2.toString() + ") returned null for symbol pairs. It is a mistake.");
            this.f6047e = new C1263t();
        }
        this.f6047e.f6298c = this.f6039a3.f6116c;
        C1555a c1555a = this.f6066m3;
        if (c1555a != null) {
            c1555a.m3951d();
        }
        this.f6049e3.m3845a();
        invalidate();
    }

    public void setExtracting(ExtractedTextRequest extractedTextRequest) {
        getProps().getClass();
        this.f6029V2 = extractedTextRequest;
    }

    public void setFirstLineNumberAlwaysVisible(boolean z6) {
        this.f6070q2 = z6;
        if (this.f6032X1) {
            invalidate();
        }
    }

    public void setFontFeatureSettings(String str) {
        C1836d c1836d = this.f6051f3.f6140b;
        c1836d.setFontFeatureSettings(str);
        c1836d.m4324d();
        this.f6051f3.f6141c.setFontFeatureSettings(str);
        this.f6051f3.f6145g.setFontFeatureSettings(str);
        this.f6051f3.m3520A();
        invalidate();
    }

    public void setFormatTip(String str) {
        Objects.requireNonNull(str);
        this.f6005J2 = str;
    }

    public void setHardwareAcceleratedDrawAllowed(boolean z6) {
        this.f6053g3 = z6;
        if (!z6 || this.f6032X1) {
            return;
        }
        this.f6049e3.m3845a();
    }

    public void setHighlightBracketPair(boolean z6) {
        this.f6074t2 = z6;
        if (z6) {
            C1258o c1258o = this.f6081y1;
            c1258o.getClass();
            c1258o.m3560a(new RunnableC1869e(3, c1258o));
        } else {
            this.f6081y1.f6212b = null;
        }
        invalidate();
    }

    public void setHighlightCurrentBlock(boolean z6) {
        this.f6060k2 = z6;
        this.f5994E1 = !z6 ? -1 : m3467J();
        invalidate();
    }

    public void setHighlightCurrentLine(boolean z6) {
        invalidate();
    }

    @Override // android.view.View
    public void setHorizontalScrollBarEnabled(boolean z6) {
        this.f6065m2 = z6;
    }

    @Override // android.view.View
    public void setHorizontalScrollbarThumbDrawable(Drawable drawable) {
        this.f6051f3.f6156r = drawable;
    }

    @Override // android.view.View
    public void setHorizontalScrollbarTrackDrawable(Drawable drawable) {
        this.f6051f3.f6157s = drawable;
    }

    public void setInputType(int i7) {
        this.f5998G1 = i7;
        m3495h0();
    }

    public void setInterceptParentHorizontalScrollIfNeeded(boolean z6) {
        ViewParent parent;
        this.f6058j2 = z6;
        if (z6 || (parent = getParent()) == null) {
            return;
        }
        parent.requestDisallowInterceptTouchEvent(false);
    }

    public void setLayoutBusy(boolean z6) {
        if (!this.f6043c2 || z6) {
            this.f6043c2 = z6;
            return;
        }
        if (this.f6032X1) {
            GestureDetectorOnGestureListenerC1261r gestureDetectorOnGestureListenerC1261r = this.f6015O2;
            if (gestureDetectorOnGestureListenerC1261r.f6244Z1) {
                gestureDetectorOnGestureListenerC1261r.f6244Z1 = false;
                long j7 = gestureDetectorOnGestureListenerC1261r.f6242Y1;
                float rowHeight = getRowHeight() * ((C1440i) this.f5990C1).m3823h((int) (j7 >> 32), C0017d.m62A(j7));
                GestureDetectorOnGestureListenerC1261r gestureDetectorOnGestureListenerC1261r2 = this.f6015O2;
                float f7 = rowHeight - gestureDetectorOnGestureListenerC1261r2.f6245a2;
                C1251h c1251h = gestureDetectorOnGestureListenerC1261r2.f6247e;
                int i7 = (int) f7;
                this.f5988B1.m4244a(new C1795x(this, c1251h.m3549b(), c1251h.m3550c(), 0, i7, 5));
                c1251h.m3552e(0, i7, 0, 0);
                c1251h.f6181b.abortAnimation();
                c1251h.m3551d();
            }
        }
        this.f6043c2 = false;
        m3495h0();
        postInvalidate();
    }

    public void setLigatureEnabled(boolean z6) {
        setFontFeatureSettings(z6 ? null : "'liga' 0,'calt' 0,'hlig' 0,'dlig' 0,'clig' 0");
    }

    public void setLineInfoTextSize(float f7) {
        if (f7 <= 0.0f) {
            throw new IllegalArgumentException();
        }
        this.f6016P1 = f7;
    }

    public void setLineNumberAlign(Paint.Align align) {
        if (align == null) {
            align = Paint.Align.LEFT;
        }
        this.f6017P2 = align;
        invalidate();
    }

    public void setLineNumberEnabled(boolean z6) {
        if (z6 != this.f6054h2 && this.f6032X1) {
            m3504o(true);
        }
        this.f6054h2 = z6;
        invalidate();
    }

    public void setLineNumberMarginLeft(float f7) {
        this.f6022S1 = f7;
        m3493g0();
        invalidate();
    }

    public void setLineNumberTipTextProvider(InterfaceC1672c interfaceC1672c) {
        Objects.requireNonNull(interfaceC1672c, "Provider can not be null");
        this.f6003I2 = interfaceC1672c;
        invalidate();
    }

    public void setLineSeparator(EnumC0649m enumC0649m) {
        Objects.requireNonNull(enumC0649m);
        if (enumC0649m == EnumC0649m.NONE) {
            throw new IllegalArgumentException();
        }
        this.f6063l3 = enumC0649m;
    }

    public void setLineSpacingExtra(float f7) {
        this.f6020R1 = f7;
        invalidate();
    }

    public void setLineSpacingMultiplier(float f7) {
        this.f6018Q1 = f7;
        invalidate();
    }

    public void setLnPanelPosition(int i7) {
        this.f6048e2 = i7;
        invalidate();
    }

    public void setLnPanelPositionMode(int i7) {
        this.f6050f2 = i7;
        invalidate();
    }

    public void setNonPrintablePaintingFlags(int i7) {
        this.f6000H1 = i7;
        invalidate();
    }

    public void setPinLineNumber(boolean z6) {
        this.f6068o2 = z6;
        if (this.f6054h2) {
            invalidate();
        }
    }

    public void setRenderFunctionCharacters(boolean z6) {
        if (this.f6078w2 != z6) {
            this.f6078w2 = z6;
            this.f6051f3.m3545y();
            m3493g0();
            m3504o(true);
            invalidate();
        }
    }

    public void setScalable(boolean z6) {
        this.f6028V1 = z6;
    }

    public void setScrollBarEnabled(boolean z6) {
        this.f6065m2 = z6;
        this.f6062l2 = z6;
        invalidate();
    }

    public void setSelectionHandleStyle(InterfaceC1673d interfaceC1673d) {
        Objects.requireNonNull(interfaceC1673d);
        this.f6035Y2 = interfaceC1673d;
        invalidate();
    }

    public void setSoftKeyboardEnabled(boolean z6) {
        if (this.f6080x2 == z6) {
            return;
        }
        this.f6080x2 = z6;
        this.f5993D2.hideSoftInputFromWindow(getWindowToken(), 0);
        m3495h0();
    }

    public void setStickyTextSelection(boolean z6) {
        this.f6073s2 = z6;
    }

    public void setStyles(C0056f c0056f) {
        this.f6044c3 = c0056f;
        if (this.f6060k2) {
            this.f5994E1 = m3467J();
        }
        this.f6049e3.m3845a();
        this.f6051f3.m3520A();
        invalidate();
    }

    public void setTabWidth(int i7) {
        if (i7 < 1) {
            throw new IllegalArgumentException("width can not be under 1");
        }
        this.f5992D1 = i7;
        this.f6049e3.m3845a();
        this.f6051f3.m3520A();
        m3493g0();
        invalidate();
    }

    public void setText(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        C0641e c0641e = this.f5997F2;
        if (c0641e != null) {
            if (this instanceof InterfaceC0647k) {
                throw new IllegalArgumentException("Permission denied");
            }
            c0641e.f3152e.remove(this);
            this.f5997F2.f3148X = 0;
        }
        this.f6041b3 = new Bundle();
        if (charSequence instanceof C0641e) {
            C0641e c0641e2 = (C0641e) charSequence;
            this.f5997F2 = c0641e2;
            c0641e2.f3148X = 0;
            this.f6051f3.m3520A();
        } else {
            this.f5997F2 = new C0641e(charSequence, true);
        }
        C0641e c0641e3 = this.f5997F2;
        boolean z6 = !this.f6051f3.f6137D;
        C0891b c0891b = c0641e3.f3155w1;
        c0891b.f4674m = z6;
        if (!z6) {
            Arrays.fill(c0891b.f4672c, (Object) null);
        }
        C1258o c1258o = this.f6081y1;
        c1258o.f6212b = null;
        c1258o.f6213c = null;
        this.f6044c3 = null;
        C0645i m2144p = this.f5997F2.m2144p();
        this.f5995E2 = m2144p;
        this.f6083z1 = m2144p.m2165c();
        GestureDetectorOnGestureListenerC1261r gestureDetectorOnGestureListenerC1261r = this.f6015O2;
        gestureDetectorOnGestureListenerC1261r.f6247e.m3552e(0, 0, 0, 0);
        gestureDetectorOnGestureListenerC1261r.f6221F1 = false;
        gestureDetectorOnGestureListenerC1261r.f6222G1 = false;
        gestureDetectorOnGestureListenerC1261r.f6239X = -1;
        gestureDetectorOnGestureListenerC1261r.f6249s.m3728a();
        this.f5997F2.m2129a(this);
        this.f5997F2.m2122F(this.f6034Y1);
        C1464d c1464d = this.f6049e3;
        int m2147s = this.f5997F2.m2147s();
        C1463c c1463c = c1464d.f6985a;
        C1476j c1476j = c1463c.f6982b;
        int i7 = c1476j.f7024b;
        if (i7 > m2147s) {
            c1476j.m3866c(m2147s, i7);
        } else if (i7 < m2147s) {
            int i8 = m2147s - i7;
            for (int i9 = 0; i9 < i8; i9++) {
                c1476j.m3865b(c1476j.f7024b + 1);
                int[] iArr = c1476j.f7023a;
                int i10 = c1476j.f7024b;
                iArr[i10] = 0;
                c1476j.f7024b = i10 + 1;
            }
        }
        int i11 = c1476j.f7024b;
        Iterator<Integer> it = (i11 <= Integer.MIN_VALUE ? C1266c.f6312s : new C1266c(0, i11 - 1)).iterator();
        while (((C1265b) it).f6310m) {
            c1476j.m3867d(((AbstractC2263k) it).nextInt(), 0);
        }
        ReentrantLock reentrantLock = c1463c.f6981a;
        reentrantLock.lock();
        try {
            c1463c.f6983c.clear();
            reentrantLock.unlock();
            C1250g c1250g = this.f6051f3;
            C1245b c1245b = c1250g.f6153o;
            c1250g.f6164z = c1245b.getCursor();
            c1250g.f6135B = c1245b.getText();
            InterfaceC1885b interfaceC1885b = this.f6007K2;
            if (interfaceC1885b != null) {
                interfaceC1885b.mo4416a().mo3579a(new C0644h(this.f5997F2), this.f6041b3);
                this.f6007K2.mo4422g();
            }
            this.f5988B1.m4244a(new C1775d(this, 1, new C0638b(), ((C0637a) this.f5997F2.m2145q()).m2111q(getLineCount() - 1, this.f5997F2.m2142n(getLineCount() - 1)), this.f5997F2, false));
            m3504o(true);
            InputMethodManager inputMethodManager = this.f5993D2;
            if (inputMethodManager != null) {
                inputMethodManager.restartInput(this);
            }
            requestLayout();
            this.f6049e3.m3845a();
            invalidate();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public void setTextLetterSpacing(float f7) {
        C1250g c1250g = this.f6051f3;
        c1250g.f6140b.setLetterSpacing(f7);
        c1250g.f6141c.setLetterSpacing(f7);
        c1250g.m3545y();
        m3493g0();
    }

    public void setTextScaleX(float f7) {
        C1250g c1250g = this.f6051f3;
        c1250g.f6140b.setTextScaleX(f7);
        c1250g.f6141c.setTextScaleX(f7);
        c1250g.m3545y();
    }

    public void setTextSize(float f7) {
        Context context = getContext();
        setTextSizePx(TypedValue.applyDimension(2, f7, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    public void setTextSizePx(float f7) {
        setTextSizePxDirect(f7);
        m3493g0();
        m3504o(true);
        invalidate();
    }

    public void setTextSizePxDirect(float f7) {
        getTextSizePx();
        C1250g c1250g = this.f6051f3;
        C1836d c1836d = c1250g.f6140b;
        c1836d.setTextSize(f7);
        c1836d.m4324d();
        C1836d c1836d2 = c1250g.f6141c;
        c1836d2.setTextSize(f7);
        C1245b c1245b = c1250g.f6153o;
        Objects.requireNonNull(c1245b.getProps());
        C1836d c1836d3 = c1250g.f6145g;
        c1836d3.setTextSize(f7 * 0.85f);
        c1250g.f6155q = c1836d.getFontMetricsInt();
        c1250g.f6161w = c1836d2.getFontMetricsInt();
        c1250g.f6162x = c1836d3.getFontMetricsInt();
        c1245b.getRenderContext().m3845a();
        c1250g.m3520A();
        this.f5988B1.m4244a(new C1770a(this));
    }

    public void setTypefaceLineNumber(Typeface typeface) {
        C1250g c1250g = this.f6051f3;
        if (typeface == null) {
            c1250g.getClass();
            typeface = Typeface.MONOSPACE;
        }
        C1836d c1836d = c1250g.f6141c;
        c1836d.setTypeface(typeface);
        c1250g.f6161w = c1836d.getFontMetricsInt();
        c1250g.f6153o.invalidate();
        m3493g0();
    }

    public void setTypefaceText(Typeface typeface) {
        C1250g c1250g = this.f6051f3;
        if (typeface == null) {
            c1250g.getClass();
            typeface = Typeface.DEFAULT;
        }
        C1836d c1836d = c1250g.f6140b;
        c1836d.setTypeface(typeface);
        c1836d.m4324d();
        c1250g.f6155q = c1836d.getFontMetricsInt();
        C1245b c1245b = c1250g.f6153o;
        c1245b.getRenderContext().m3845a();
        c1250g.m3520A();
        c1245b.m3504o(true);
        c1245b.invalidate();
        m3493g0();
    }

    public void setUndoEnabled(boolean z6) {
        this.f6034Y1 = z6;
        C0641e c0641e = this.f5997F2;
        if (c0641e != null) {
            c0641e.m2122F(z6);
        }
    }

    public void setVerticalExtraSpaceFactor(float f7) {
        if (f7 < 0.0f || f7 > 1.0f) {
            throw new IllegalArgumentException("the factor should be in range [0.0, 1.0]");
        }
        this.f6024T1 = f7;
        this.f6015O2.m3568g(0.0f, 0.0f, false);
    }

    @Override // android.view.View
    public void setVerticalScrollBarEnabled(boolean z6) {
        this.f6062l2 = z6;
    }

    @Override // android.view.View
    public void setVerticalScrollbarThumbDrawable(Drawable drawable) {
        this.f6051f3.f6158t = drawable;
    }

    @Override // android.view.View
    public void setVerticalScrollbarTrackDrawable(Drawable drawable) {
        this.f6051f3.f6159u = drawable;
    }

    public void setWordwrap(boolean z6) {
        m3506p0(z6, true);
    }

    /* renamed from: t0 */
    public final float m3511t0() {
        boolean z6;
        C0638b c0638b = this.f5995E2.f3167d;
        float m3482Y = (m3482Y() + this.f5990C1.m3801b(c0638b.f3141b, c0638b.f3142c)[1]) - getOffsetX();
        if (m3482Y < 0.0f) {
            m3482Y = 0.0f;
            z6 = false;
        } else {
            z6 = true;
        }
        if (this.f6039a3.f6109S1) {
            CursorAnchorInfo.Builder builder = this.f6023S2;
            builder.reset();
            this.f5999G2.set(getMatrix());
            getLocationOnScreen(new int[2]);
            this.f5999G2.postTranslate(r7[0], r7[1]);
            builder.setMatrix(this.f5999G2);
            C0645i c0645i = this.f5995E2;
            builder.setSelectionRange(c0645i.f3166c.f3140a, c0645i.f3167d.f3140a);
            builder.setInsertionMarkerLocation(m3482Y, m3473P(r1) - getOffsetY(), m3471N(r1) - getOffsetY(), m3472O(r1) - getOffsetY(), z6 ? 1 : 2);
            this.f5993D2.updateCursorAnchorInfo(this, builder.build());
        }
        return m3482Y;
    }

    /* renamed from: u0 */
    public final void m3512u0() {
        int i7;
        int i8;
        C0640d c0640d;
        int i9;
        this.f6039a3.getClass();
        if (this.f5986A1.f6126b.m2116a()) {
            try {
                c0640d = this.f5986A1.f6126b;
                i7 = c0640d.f3145a;
            } catch (IndexOutOfBoundsException unused) {
                i7 = -1;
            }
            try {
                i9 = c0640d.f3146b;
                i8 = i7;
            } catch (IndexOutOfBoundsException unused2) {
                i8 = i7;
                i9 = -1;
                InputMethodManager inputMethodManager = this.f5993D2;
                C0645i c0645i = this.f5995E2;
                inputMethodManager.updateSelection(this, c0645i.f3166c.f3140a, c0645i.f3167d.f3140a, i8, i9);
            }
            InputMethodManager inputMethodManager2 = this.f5993D2;
            C0645i c0645i2 = this.f5995E2;
            inputMethodManager2.updateSelection(this, c0645i2.f3166c.f3140a, c0645i2.f3167d.f3140a, i8, i9);
        }
        i8 = -1;
        i9 = -1;
        InputMethodManager inputMethodManager22 = this.f5993D2;
        C0645i c0645i22 = this.f5995E2;
        inputMethodManager22.updateSelection(this, c0645i22.f3166c.f3140a, c0645i22.f3167d.f3140a, i8, i9);
    }

    /* renamed from: x */
    public final void m3513x() {
        if (this.f5995E2.m2163a()) {
            m3496i(true);
            m3459B();
            m3484a0();
            return;
        }
        C0645i cursor = getCursor();
        if (cursor.m2163a()) {
            m3513x();
            return;
        }
        C0638b m2164b = cursor.m2164b();
        int i7 = m2164b.f3141b;
        getText().m2142n(m2164b.f3141b);
        int i8 = i7 + 1;
        if (i8 != getLineCount()) {
            m3502m0(i7, 0, i8, 0);
        } else {
            if (getText().m2142n(i7) == 0) {
                m3496i(false);
                return;
            }
            m3502m0(i7, 0, i7, getText().m2142n(i7));
        }
        m3513x();
        this.f6039a3.getClass();
    }

    @Override // p022c5.InterfaceC0643g
    /* renamed from: y */
    public final void mo2113y(C0641e c0641e, int i7, int i8, int i9, int i10, CharSequence charSequence) {
        ArrayList arrayList;
        C1465e c1465e;
        C1464d c1464d = this.f6049e3;
        C1463c c1463c = c1464d.f6985a;
        if (i7 != i9) {
            int i11 = i9 - i7;
            C1476j c1476j = c1463c.f6982b;
            if (i11 == 1) {
                if (!(i7 >= 0 && i7 <= c1476j.f7024b)) {
                    c1476j.getClass();
                    StringBuilder m221g = C0090b.m221g("Index ", i7, " must be in 0..");
                    m221g.append(c1476j.f7024b);
                    throw new IndexOutOfBoundsException(m221g.toString());
                }
                c1476j.m3865b(c1476j.f7024b + 1);
                int[] iArr = c1476j.f7023a;
                int i12 = c1476j.f7024b;
                if (i7 != i12) {
                    C2255c.m5463F0(i7 + 1, i7, i12, iArr, iArr);
                }
                iArr[i7] = 0;
                c1476j.f7024b++;
            } else {
                int[] iArr2 = new int[i11];
                for (int i13 = 0; i13 < i11; i13++) {
                    iArr2[i13] = 0;
                }
                c1476j.getClass();
                if (!(i7 >= 0 && i7 <= c1476j.f7024b)) {
                    StringBuilder m221g2 = C0090b.m221g("Index ", i7, " must be in 0..");
                    m221g2.append(c1476j.f7024b);
                    throw new IndexOutOfBoundsException(m221g2.toString());
                }
                if (!(i11 == 0)) {
                    c1476j.m3865b(c1476j.f7024b + i11);
                    int[] iArr3 = c1476j.f7023a;
                    int i14 = c1476j.f7024b;
                    if (i7 != i14) {
                        C2255c.m5463F0(i11 + i7, i7, i14, iArr3, iArr3);
                    }
                    C2255c.m5465H0(iArr2, iArr3, i7, 0, 12);
                    c1476j.f7024b += i11;
                }
            }
            ReentrantLock reentrantLock = c1463c.f6981a;
            reentrantLock.lock();
            try {
                Iterator it = c1463c.f6983c.iterator();
                while (it.hasNext()) {
                    C1461a c1461a = (C1461a) it.next();
                    int i15 = c1461a.f6976a;
                    if (i15 > i7) {
                        c1461a.f6976a = i15 + i11;
                    }
                }
            } finally {
                reentrantLock.unlock();
            }
        } else {
            c1463c.getClass();
        }
        if (Build.VERSION.SDK_INT >= 29 && (c1465e = c1464d.f6986b) != null) {
            Iterator<C1465e.a> it2 = c1465e.f6989b.iterator();
            while (it2.hasNext()) {
                C1465e.a next = it2.next();
                int i16 = next.f6991a;
                if (i16 == i7) {
                    next.f6993c = true;
                } else if (i16 > i7) {
                    next.f6991a = (i9 - i7) + i16;
                }
            }
        }
        this.f6051f3.m3520A();
        this.f6081y1.getClass();
        C0638b m2111q = ((C0637a) this.f5997F2.m2145q()).m2111q(i7, i8);
        C0638b m2111q2 = ((C0637a) this.f5997F2.m2145q()).m2111q(i9, i10);
        C1250g c1250g = this.f6051f3;
        c1250g.m3521a(i7, i9, c1250g.f6160v, false);
        try {
            C0056f c0056f = this.f6044c3;
            if (c0056f != null) {
                c0056f.f144a.getClass();
                int i17 = m2111q2.f3141b;
                int i18 = m2111q.f3141b;
                int i19 = i17 - i18;
                if (i19 != 0 && (arrayList = c0056f.f145b) != null) {
                    C0143v.m403C0(i18, i19, arrayList);
                }
            }
            C2251c c2251c = this.f6046d3;
            if (c2251c != null) {
                c2251c.m5458c(m2111q.f3140a, m2111q2.f3140a);
            }
        } catch (Exception e7) {
            Log.w("CodeEditor", "Update failure", e7);
        }
        this.f5990C1.mo2113y(c0641e, i7, i8, i9, i10, charSequence);
        m3488e();
        m3510s0();
        this.f6026U1 = false;
        m3511t0();
        m3464G();
        this.f6007K2.mo4416a().mo4428f(m2111q, m2111q2, charSequence);
        this.f6015O2.m3566e();
        if (this.f6030W1 && !this.f5995E2.m2163a() && !this.f5986A1.f6126b.m2116a()) {
            if (this.f6052g2 == 0) {
                ((C1706c) this.f6033X2).m4129c();
                ((C1706c) this.f6033X2).m4131e();
            }
        }
        this.f6083z1 = this.f6040b2 ? this.f5995E2.m2164b() : this.f5995E2.m2165c();
        this.f5988B1.m4244a(new C1775d(this, 2, m2111q, m2111q2, charSequence, this.f5997F2.f3156x1.f3200x1));
        m3485b0(1);
        m2111q.m2115a();
        m2111q2.m2115a();
    }

    @Override // p022c5.InterfaceC0643g
    /* renamed from: z */
    public final void mo2114z(C0641e c0641e) {
        ((C1706c) this.f6033X2).m4130d();
        this.f6040b2 = this.f5995E2.m2164b().equals(this.f6083z1);
    }
}
