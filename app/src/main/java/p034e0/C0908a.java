package p034e0;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.R$id;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import p034e0.C0946x;
import p042f0.C1151g;
import p042f0.C1152h;
import p042f0.InterfaceC1155k;

/* renamed from: e0.a */
/* loaded from: classes.dex */
public class C0908a {

    /* renamed from: c */
    public static final View.AccessibilityDelegate f4773c = new View.AccessibilityDelegate();

    /* renamed from: a */
    public final View.AccessibilityDelegate f4774a;

    /* renamed from: b */
    public final a f4775b;

    /* renamed from: e0.a$a */
    public static final class a extends View.AccessibilityDelegate {

        /* renamed from: a */
        public final C0908a f4776a;

        public a(C0908a c0908a) {
            this.f4776a = c0908a;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f4776a.mo1054a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C1152h mo1812b = this.f4776a.mo1812b(view);
            if (mo1812b != null) {
                return (AccessibilityNodeProvider) mo1812b.f5703a;
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f4776a.mo1026c(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            Object tag;
            Object tag2;
            Object tag3;
            int i7;
            C1151g c1151g = new C1151g(accessibilityNodeInfo);
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            int i8 = R$id.tag_screen_reader_focusable;
            if (Build.VERSION.SDK_INT >= 28) {
                tag = Boolean.valueOf(C0946x.l.m2916d(view));
            } else {
                tag = view.getTag(i8);
                if (!Boolean.class.isInstance(tag)) {
                    tag = null;
                }
            }
            Boolean bool = (Boolean) tag;
            boolean z6 = bool != null && bool.booleanValue();
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 28) {
                accessibilityNodeInfo.setScreenReaderFocusable(z6);
            } else {
                c1151g.m3341f(1, z6);
            }
            int i10 = R$id.tag_accessibility_heading;
            if (Build.VERSION.SDK_INT >= 28) {
                tag2 = Boolean.valueOf(C0946x.l.m2915c(view));
            } else {
                tag2 = view.getTag(i10);
                if (!Boolean.class.isInstance(tag2)) {
                    tag2 = null;
                }
            }
            Boolean bool2 = (Boolean) tag2;
            boolean z7 = bool2 != null && bool2.booleanValue();
            if (i9 >= 28) {
                accessibilityNodeInfo.setHeading(z7);
            } else {
                c1151g.m3341f(2, z7);
            }
            CharSequence m2804e = C0946x.m2804e(view);
            if (i9 >= 28) {
                accessibilityNodeInfo.setPaneTitle(m2804e);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", m2804e);
            }
            int i11 = R$id.tag_state_description;
            if (i9 >= 30) {
                tag3 = C0946x.n.m2926a(view);
            } else {
                tag3 = view.getTag(i11);
                if (!CharSequence.class.isInstance(tag3)) {
                    tag3 = null;
                }
            }
            CharSequence charSequence = (CharSequence) tag3;
            if (i9 >= 30) {
                accessibilityNodeInfo.setStateDescription(charSequence);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
            }
            this.f4776a.mo134d(view, c1151g);
            CharSequence text = accessibilityNodeInfo.getText();
            if (i9 < 26) {
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
                SparseArray sparseArray = (SparseArray) view.getTag(R$id.tag_accessibility_clickable_spans);
                if (sparseArray != null) {
                    ArrayList arrayList = new ArrayList();
                    for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                        if (((WeakReference) sparseArray.valueAt(i12)).get() == null) {
                            arrayList.add(Integer.valueOf(i12));
                        }
                    }
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        sparseArray.remove(((Integer) arrayList.get(i13)).intValue());
                    }
                }
                ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
                if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                    c1151g.f5685a.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R$id.accessibility_action_clickable_span);
                    int i14 = R$id.tag_accessibility_clickable_spans;
                    SparseArray sparseArray2 = (SparseArray) view.getTag(i14);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        view.setTag(i14, sparseArray2);
                    }
                    for (int i15 = 0; i15 < clickableSpanArr.length; i15++) {
                        ClickableSpan clickableSpan = clickableSpanArr[i15];
                        int i16 = 0;
                        while (true) {
                            if (i16 >= sparseArray2.size()) {
                                i7 = C1151g.f5684d;
                                C1151g.f5684d = i7 + 1;
                                break;
                            } else {
                                if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i16)).get())) {
                                    i7 = sparseArray2.keyAt(i16);
                                    break;
                                }
                                i16++;
                            }
                        }
                        sparseArray2.put(i7, new WeakReference(clickableSpanArr[i15]));
                        ClickableSpan clickableSpan2 = clickableSpanArr[i15];
                        Spanned spanned = (Spanned) text;
                        c1151g.m3338c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                        c1151g.m3338c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                        c1151g.m3338c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                        c1151g.m3338c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i7));
                    }
                }
            }
            List list = (List) view.getTag(R$id.tag_accessibility_actions);
            if (list == null) {
                list = Collections.emptyList();
            }
            for (int i17 = 0; i17 < list.size(); i17++) {
                c1151g.m3337b((C1151g.a) list.get(i17));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f4776a.mo1813e(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f4776a.mo1055f(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean performAccessibilityAction(View view, int i7, Bundle bundle) {
            return this.f4776a.mo135g(view, i7, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void sendAccessibilityEvent(View view, int i7) {
            this.f4776a.mo1814h(view, i7);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f4776a.mo1815i(view, accessibilityEvent);
        }
    }

    /* renamed from: e0.a$b */
    public static class b {
        /* renamed from: a */
        public static AccessibilityNodeProvider m2627a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return accessibilityDelegate.getAccessibilityNodeProvider(view);
        }

        /* renamed from: b */
        public static boolean m2628b(View.AccessibilityDelegate accessibilityDelegate, View view, int i7, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i7, bundle);
        }
    }

    public C0908a() {
        this(f4773c);
    }

    public C0908a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f4774a = accessibilityDelegate;
        this.f4775b = new a(this);
    }

    /* renamed from: a */
    public boolean mo1054a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f4774a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: b */
    public C1152h mo1812b(View view) {
        AccessibilityNodeProvider m2627a = b.m2627a(this.f4774a, view);
        if (m2627a != null) {
            return new C1152h(m2627a);
        }
        return null;
    }

    /* renamed from: c */
    public void mo1026c(View view, AccessibilityEvent accessibilityEvent) {
        this.f4774a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: d */
    public void mo134d(View view, C1151g c1151g) {
        this.f4774a.onInitializeAccessibilityNodeInfo(view, c1151g.f5685a);
    }

    /* renamed from: e */
    public void mo1813e(View view, AccessibilityEvent accessibilityEvent) {
        this.f4774a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: f */
    public boolean mo1055f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f4774a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: g */
    public boolean mo135g(View view, int i7, Bundle bundle) {
        boolean z6;
        WeakReference weakReference;
        boolean z7;
        List list = (List) view.getTag(R$id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        boolean z8 = false;
        int i8 = 0;
        while (true) {
            if (i8 >= list.size()) {
                break;
            }
            C1151g.a aVar = (C1151g.a) list.get(i8);
            if (aVar.m3347a() == i7) {
                InterfaceC1155k interfaceC1155k = aVar.f5701d;
                if (interfaceC1155k != null) {
                    Class<? extends InterfaceC1155k.a> cls = aVar.f5700c;
                    if (cls != null) {
                        try {
                            cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]).getClass();
                        } catch (Exception e7) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e7);
                        }
                    }
                    z6 = interfaceC1155k.mo1053a(view);
                }
            } else {
                i8++;
            }
        }
        z6 = false;
        if (!z6) {
            z6 = b.m2628b(this.f4774a, view, i7, bundle);
        }
        if (z6 || i7 != R$id.accessibility_action_clickable_span || bundle == null) {
            return z6;
        }
        int i9 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R$id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i9)) != null) {
            ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
            if (clickableSpan != null) {
                CharSequence text = view.createAccessibilityNodeInfo().getText();
                ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
                for (int i10 = 0; clickableSpanArr != null && i10 < clickableSpanArr.length; i10++) {
                    if (clickableSpan.equals(clickableSpanArr[i10])) {
                        z7 = true;
                        break;
                    }
                }
            }
            z7 = false;
            if (z7) {
                clickableSpan.onClick(view);
                z8 = true;
            }
        }
        return z8;
    }

    /* renamed from: h */
    public void mo1814h(View view, int i7) {
        this.f4774a.sendAccessibilityEvent(view, i7);
    }

    /* renamed from: i */
    public void mo1815i(View view, AccessibilityEvent accessibilityEvent) {
        this.f4774a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
