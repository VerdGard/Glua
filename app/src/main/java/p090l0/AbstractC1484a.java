package p090l0;

import android.ext.Tools;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.C0775a;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p034e0.C0908a;
import p034e0.C0923h0;
import p034e0.C0946x;
import p042f0.C1151g;
import p042f0.C1152h;
import p042f0.C1154j;
import p090l0.C1485b;

/* renamed from: l0.a */
/* loaded from: classes.dex */
public abstract class AbstractC1484a extends C0908a {

    /* renamed from: n */
    public static final Rect f7052n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o */
    public static final a f7053o = new a();

    /* renamed from: p */
    public static final b f7054p = new b();

    /* renamed from: h */
    public final AccessibilityManager f7059h;

    /* renamed from: i */
    public final View f7060i;

    /* renamed from: j */
    public c f7061j;

    /* renamed from: d */
    public final Rect f7055d = new Rect();

    /* renamed from: e */
    public final Rect f7056e = new Rect();

    /* renamed from: f */
    public final Rect f7057f = new Rect();

    /* renamed from: g */
    public final int[] f7058g = new int[2];

    /* renamed from: k */
    public int f7062k = Integer.MIN_VALUE;

    /* renamed from: l */
    public int f7063l = Integer.MIN_VALUE;

    /* renamed from: m */
    public int f7064m = Integer.MIN_VALUE;

    /* renamed from: l0.a$a */
    public class a implements C1485b.a<C1151g> {
    }

    /* renamed from: l0.a$b */
    public class b {
    }

    /* renamed from: l0.a$c */
    public class c extends C1152h {
        public c() {
        }

        @Override // p042f0.C1152h
        /* renamed from: a */
        public final C1151g mo3350a(int i7) {
            return new C1151g(AccessibilityNodeInfo.obtain(AbstractC1484a.this.m3885n(i7).f5685a));
        }

        @Override // p042f0.C1152h
        /* renamed from: b */
        public final C1151g mo3351b(int i7) {
            AbstractC1484a abstractC1484a = AbstractC1484a.this;
            int i8 = i7 == 2 ? abstractC1484a.f7062k : abstractC1484a.f7063l;
            if (i8 == Integer.MIN_VALUE) {
                return null;
            }
            return mo3350a(i8);
        }

        @Override // p042f0.C1152h
        /* renamed from: c */
        public final boolean mo3352c(int i7, int i8, Bundle bundle) {
            int i9;
            AbstractC1484a abstractC1484a = AbstractC1484a.this;
            View view = abstractC1484a.f7060i;
            if (i7 == -1) {
                WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
                return C0946x.d.m2834j(view, i8, bundle);
            }
            boolean z6 = true;
            if (i8 == 1) {
                return abstractC1484a.m3886p(i7);
            }
            if (i8 == 2) {
                return abstractC1484a.m3882j(i7);
            }
            boolean z7 = false;
            if (i8 == 64) {
                AccessibilityManager accessibilityManager = abstractC1484a.f7059h;
                if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i9 = abstractC1484a.f7062k) != i7) {
                    if (i9 != Integer.MIN_VALUE) {
                        abstractC1484a.f7062k = Integer.MIN_VALUE;
                        abstractC1484a.f7060i.invalidate();
                        abstractC1484a.m3887q(i9, 65536);
                    }
                    abstractC1484a.f7062k = i7;
                    view.invalidate();
                    abstractC1484a.m3887q(i7, 32768);
                }
                z6 = false;
            } else {
                if (i8 != 128) {
                    Chip.C0774b c0774b = (Chip.C0774b) abstractC1484a;
                    if (i8 == 16) {
                        Chip chip = Chip.this;
                        if (i7 == 0) {
                            return chip.performClick();
                        }
                        if (i7 == 1) {
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.f4036z1;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                                z7 = true;
                            }
                            if (chip.f4029K1) {
                                chip.f4028J1.m3887q(1, 1);
                            }
                        }
                    }
                    return z7;
                }
                if (abstractC1484a.f7062k == i7) {
                    abstractC1484a.f7062k = Integer.MIN_VALUE;
                    view.invalidate();
                    abstractC1484a.m3887q(i7, 65536);
                }
                z6 = false;
            }
            return z6;
        }
    }

    public AbstractC1484a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f7060i = view;
        this.f7059h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        if (C0946x.d.m2827c(view) == 0) {
            C0946x.d.m2843s(view, 1);
        }
    }

    @Override // p034e0.C0908a
    /* renamed from: b */
    public final C1152h mo1812b(View view) {
        if (this.f7061j == null) {
            this.f7061j = new c();
        }
        return this.f7061j;
    }

    @Override // p034e0.C0908a
    /* renamed from: c */
    public final void mo1026c(View view, AccessibilityEvent accessibilityEvent) {
        super.mo1026c(view, accessibilityEvent);
    }

    @Override // p034e0.C0908a
    /* renamed from: d */
    public final void mo134d(View view, C1151g c1151g) {
        View.AccessibilityDelegate accessibilityDelegate = this.f4774a;
        AccessibilityNodeInfo accessibilityNodeInfo = c1151g.f5685a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = Chip.this;
        C0775a c0775a = chip.f4033w1;
        accessibilityNodeInfo.setCheckable(c0775a != null && c0775a.f4081f2);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        c1151g.m3342g(chip.getAccessibilityClassName());
        CharSequence text = chip.getText();
        if (Build.VERSION.SDK_INT >= 23) {
            c1151g.m3346k(text);
        } else {
            accessibilityNodeInfo.setContentDescription(text);
        }
    }

    /* renamed from: j */
    public final boolean m3882j(int i7) {
        if (this.f7063l != i7) {
            return false;
        }
        this.f7063l = Integer.MIN_VALUE;
        Chip.C0774b c0774b = (Chip.C0774b) this;
        if (i7 == 1) {
            Chip chip = Chip.this;
            chip.f4023E1 = false;
            chip.refreshDrawableState();
        }
        m3887q(i7, 8);
        return true;
    }

    /* renamed from: k */
    public final C1151g m3883k(int i7) {
        AccessibilityNodeInfo accessibilityNodeInfo;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        C1151g c1151g = new C1151g(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        c1151g.m3342g("android.view.View");
        Rect rect = f7052n;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        c1151g.f5686b = -1;
        View view = this.f7060i;
        obtain.setParent(view);
        mo2370o(i7, c1151g);
        if (c1151g.m3340e() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f7056e;
        c1151g.m3339d(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = obtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & Tools.Semaphore.f159S7) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        obtain.setPackageName(view.getContext().getPackageName());
        c1151g.f5687c = i7;
        obtain.setSource(view, i7);
        boolean z6 = false;
        if (this.f7062k == i7) {
            obtain.setAccessibilityFocused(true);
            c1151g.m3336a(Tools.Semaphore.f159S7);
        } else {
            obtain.setAccessibilityFocused(false);
            c1151g.m3336a(64);
        }
        boolean z7 = this.f7063l == i7;
        if (z7) {
            c1151g.m3336a(2);
        } else if (obtain.isFocusable()) {
            c1151g.m3336a(1);
        }
        obtain.setFocused(z7);
        int[] iArr = this.f7058g;
        view.getLocationOnScreen(iArr);
        Rect rect3 = this.f7055d;
        obtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            c1151g.m3339d(rect3);
            if (c1151g.f5686b != -1) {
                C1151g c1151g2 = new C1151g(AccessibilityNodeInfo.obtain());
                int i8 = c1151g.f5686b;
                while (true) {
                    accessibilityNodeInfo = c1151g2.f5685a;
                    if (i8 == -1) {
                        break;
                    }
                    c1151g2.f5686b = -1;
                    accessibilityNodeInfo.setParent(view, -1);
                    accessibilityNodeInfo.setBoundsInParent(rect);
                    mo2370o(i8, c1151g2);
                    c1151g2.m3339d(rect2);
                    rect3.offset(rect2.left, rect2.top);
                    i8 = c1151g2.f5686b;
                }
                accessibilityNodeInfo.recycle();
            }
            rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
        }
        Rect rect4 = this.f7057f;
        if (view.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
            if (rect3.intersect(rect4)) {
                AccessibilityNodeInfo accessibilityNodeInfo2 = c1151g.f5685a;
                accessibilityNodeInfo2.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                    while (true) {
                        Object parent = view.getParent();
                        if (parent instanceof View) {
                            view = (View) parent;
                            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                                break;
                            }
                        } else if (parent != null) {
                            z6 = true;
                        }
                    }
                }
                if (z6) {
                    accessibilityNodeInfo2.setVisibleToUser(true);
                }
            }
        }
        return c1151g;
    }

    /* renamed from: l */
    public abstract void mo2369l(ArrayList arrayList);

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0141, code lost:
    
        if (r14 < ((r15 * r15) + ((r13 * 13) * r13))) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014d A[SYNTHETIC] */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m3884m(int r19, android.graphics.Rect r20) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p090l0.AbstractC1484a.m3884m(int, android.graphics.Rect):boolean");
    }

    /* renamed from: n */
    public final C1151g m3885n(int i7) {
        if (i7 != -1) {
            return m3883k(i7);
        }
        View view = this.f7060i;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
        C1151g c1151g = new C1151g(obtain);
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        view.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        mo2369l(arrayList);
        if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            c1151g.f5685a.addChild(view, ((Integer) arrayList.get(i8)).intValue());
        }
        return c1151g;
    }

    /* renamed from: o */
    public abstract void mo2370o(int i7, C1151g c1151g);

    /* renamed from: p */
    public final boolean m3886p(int i7) {
        int i8;
        View view = this.f7060i;
        if ((!view.isFocused() && !view.requestFocus()) || (i8 = this.f7063l) == i7) {
            return false;
        }
        if (i8 != Integer.MIN_VALUE) {
            m3882j(i8);
        }
        if (i7 == Integer.MIN_VALUE) {
            return false;
        }
        this.f7063l = i7;
        Chip.C0774b c0774b = (Chip.C0774b) this;
        if (i7 == 1) {
            Chip chip = Chip.this;
            chip.f4023E1 = true;
            chip.refreshDrawableState();
        }
        m3887q(i7, 8);
        return true;
    }

    /* renamed from: q */
    public final void m3887q(int i7, int i8) {
        View view;
        ViewParent parent;
        AccessibilityEvent obtain;
        if (i7 == Integer.MIN_VALUE || !this.f7059h.isEnabled() || (parent = (view = this.f7060i).getParent()) == null) {
            return;
        }
        if (i7 != -1) {
            obtain = AccessibilityEvent.obtain(i8);
            C1151g m3885n = m3885n(i7);
            obtain.getText().add(m3885n.m3340e());
            AccessibilityNodeInfo accessibilityNodeInfo = m3885n.f5685a;
            obtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            obtain.setScrollable(accessibilityNodeInfo.isScrollable());
            obtain.setPassword(accessibilityNodeInfo.isPassword());
            obtain.setEnabled(accessibilityNodeInfo.isEnabled());
            obtain.setChecked(accessibilityNodeInfo.isChecked());
            if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            obtain.setClassName(accessibilityNodeInfo.getClassName());
            C1154j.m3357a(obtain, view, i7);
            obtain.setPackageName(view.getContext().getPackageName());
        } else {
            obtain = AccessibilityEvent.obtain(i8);
            view.onInitializeAccessibilityEvent(obtain);
        }
        parent.requestSendAccessibilityEvent(view, obtain);
    }
}
