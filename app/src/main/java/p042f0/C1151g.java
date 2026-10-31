package p042f0;

import android.ext.Tools;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p001a0.C0002a;
import p042f0.InterfaceC1155k;

/* renamed from: f0.g */
/* loaded from: classes.dex */
public final class C1151g {

    /* renamed from: d */
    public static int f5684d;

    /* renamed from: a */
    public final AccessibilityNodeInfo f5685a;

    /* renamed from: b */
    public int f5686b = -1;

    /* renamed from: c */
    public int f5687c = -1;

    /* renamed from: f0.g$a */
    public static class a {

        /* renamed from: e */
        public static final a f5688e = new a(1);

        /* renamed from: f */
        public static final a f5689f = new a(2);

        /* renamed from: g */
        public static final a f5690g;

        /* renamed from: h */
        public static final a f5691h;

        /* renamed from: i */
        public static final a f5692i;

        /* renamed from: j */
        public static final a f5693j;

        /* renamed from: k */
        public static final a f5694k;

        /* renamed from: l */
        public static final a f5695l;

        /* renamed from: m */
        public static final a f5696m;

        /* renamed from: n */
        public static final a f5697n;

        /* renamed from: a */
        public final Object f5698a;

        /* renamed from: b */
        public final int f5699b;

        /* renamed from: c */
        public final Class<? extends InterfaceC1155k.a> f5700c;

        /* renamed from: d */
        public final InterfaceC1155k f5701d;

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction17;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction18;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction19;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction20;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction21;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction22;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction23;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction24;
            new a(4);
            new a(8);
            f5690g = new a(16);
            new a(32);
            new a(64);
            new a(Tools.Semaphore.f159S7);
            new a(Tools.Semaphore.f160S8, InterfaceC1155k.b.class);
            new a(Tools.Semaphore.f161S9, InterfaceC1155k.b.class);
            new a(1024, InterfaceC1155k.c.class);
            new a(2048, InterfaceC1155k.c.class);
            f5691h = new a(4096);
            f5692i = new a(8192);
            new a(16384);
            new a(32768);
            new a(65536);
            new a(131072, InterfaceC1155k.g.class);
            f5693j = new a(262144);
            f5694k = new a(524288);
            f5695l = new a(1048576);
            new a(2097152, InterfaceC1155k.h.class);
            int i7 = Build.VERSION.SDK_INT;
            new a(i7 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, android.R.id.accessibilityActionShowOnScreen, null, null, null);
            if (i7 >= 23) {
                accessibilityAction24 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION;
                accessibilityAction = accessibilityAction24;
            } else {
                accessibilityAction = null;
            }
            new a(accessibilityAction, android.R.id.accessibilityActionScrollToPosition, null, null, InterfaceC1155k.e.class);
            if (i7 >= 23) {
                accessibilityAction23 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP;
                accessibilityAction2 = accessibilityAction23;
            } else {
                accessibilityAction2 = null;
            }
            f5696m = new a(accessibilityAction2, android.R.id.accessibilityActionScrollUp, null, null, null);
            if (i7 >= 23) {
                accessibilityAction22 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT;
                accessibilityAction3 = accessibilityAction22;
            } else {
                accessibilityAction3 = null;
            }
            new a(accessibilityAction3, android.R.id.accessibilityActionScrollLeft, null, null, null);
            if (i7 >= 23) {
                accessibilityAction21 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN;
                accessibilityAction4 = accessibilityAction21;
            } else {
                accessibilityAction4 = null;
            }
            f5697n = new a(accessibilityAction4, android.R.id.accessibilityActionScrollDown, null, null, null);
            if (i7 >= 23) {
                accessibilityAction20 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT;
                accessibilityAction5 = accessibilityAction20;
            } else {
                accessibilityAction5 = null;
            }
            new a(accessibilityAction5, android.R.id.accessibilityActionScrollRight, null, null, null);
            new a(i7 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, android.R.id.accessibilityActionPageUp, null, null, null);
            if (i7 >= 29) {
                accessibilityAction19 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
                accessibilityAction6 = accessibilityAction19;
            } else {
                accessibilityAction6 = null;
            }
            new a(accessibilityAction6, android.R.id.accessibilityActionPageDown, null, null, null);
            new a(i7 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, android.R.id.accessibilityActionPageLeft, null, null, null);
            if (i7 >= 29) {
                accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
                accessibilityAction7 = accessibilityAction18;
            } else {
                accessibilityAction7 = null;
            }
            new a(accessibilityAction7, android.R.id.accessibilityActionPageRight, null, null, null);
            if (i7 >= 23) {
                accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK;
                accessibilityAction8 = accessibilityAction17;
            } else {
                accessibilityAction8 = null;
            }
            new a(accessibilityAction8, android.R.id.accessibilityActionContextClick, null, null, null);
            if (i7 >= 24) {
                accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
                accessibilityAction9 = accessibilityAction16;
            } else {
                accessibilityAction9 = null;
            }
            new a(accessibilityAction9, android.R.id.accessibilityActionSetProgress, null, null, InterfaceC1155k.f.class);
            new a(i7 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, android.R.id.accessibilityActionMoveWindow, null, null, InterfaceC1155k.d.class);
            if (i7 >= 28) {
                accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
                accessibilityAction10 = accessibilityAction15;
            } else {
                accessibilityAction10 = null;
            }
            new a(accessibilityAction10, android.R.id.accessibilityActionShowTooltip, null, null, null);
            if (i7 >= 28) {
                accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
                accessibilityAction11 = accessibilityAction14;
            } else {
                accessibilityAction11 = null;
            }
            new a(accessibilityAction11, android.R.id.accessibilityActionHideTooltip, null, null, null);
            new a(i7 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, android.R.id.accessibilityActionPressAndHold, null, null, null);
            if (i7 >= 30) {
                accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
                accessibilityAction12 = accessibilityAction13;
            } else {
                accessibilityAction12 = null;
            }
            new a(accessibilityAction12, android.R.id.accessibilityActionImeEnter, null, null, null);
            new a(i7 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, android.R.id.accessibilityActionDragStart, null, null, null);
            new a(i7 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, android.R.id.accessibilityActionDragDrop, null, null, null);
            new a(i7 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, android.R.id.accessibilityActionDragCancel, null, null, null);
            new a(i7 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, android.R.id.accessibilityActionShowTextSuggestions, null, null, null);
        }

        public a(int i7) {
            this(null, i7, null, null, null);
        }

        public a(int i7, Class cls) {
            this(null, i7, null, null, cls);
        }

        public a(Object obj, int i7, String str, InterfaceC1155k interfaceC1155k, Class cls) {
            this.f5699b = i7;
            this.f5701d = interfaceC1155k;
            this.f5698a = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i7, str) : obj;
            this.f5700c = cls;
        }

        /* renamed from: a */
        public final int m3347a() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f5698a).getId();
        }

        /* renamed from: b */
        public final CharSequence m3348b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f5698a).getLabel();
        }

        public final boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            Object obj2 = ((a) obj).f5698a;
            Object obj3 = this.f5698a;
            return obj3 == null ? obj2 == null : obj3.equals(obj2);
        }

        public final int hashCode() {
            Object obj = this.f5698a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
    }

    /* renamed from: f0.g$b */
    public static class b {

        /* renamed from: a */
        public final Object f5702a;

        public b(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
            this.f5702a = collectionItemInfo;
        }

        /* renamed from: a */
        public static b m3349a(int i7, int i8, int i9, int i10, boolean z6, boolean z7) {
            return new b(AccessibilityNodeInfo.CollectionItemInfo.obtain(i7, i8, i9, i10, z6, z7));
        }
    }

    public C1151g(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f5685a = accessibilityNodeInfo;
    }

    /* renamed from: a */
    public final void m3336a(int i7) {
        this.f5685a.addAction(i7);
    }

    /* renamed from: b */
    public final void m3337b(a aVar) {
        this.f5685a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f5698a);
    }

    /* renamed from: c */
    public final ArrayList m3338c(String str) {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f5685a;
        ArrayList<Integer> integerArrayList = accessibilityNodeInfo.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        accessibilityNodeInfo.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    @Deprecated
    /* renamed from: d */
    public final void m3339d(Rect rect) {
        this.f5685a.getBoundsInParent(rect);
    }

    /* renamed from: e */
    public final CharSequence m3340e() {
        boolean z6 = !m3338c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
        AccessibilityNodeInfo accessibilityNodeInfo = this.f5685a;
        if (!z6) {
            return accessibilityNodeInfo.getText();
        }
        ArrayList m3338c = m3338c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        ArrayList m3338c2 = m3338c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        ArrayList m3338c3 = m3338c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        ArrayList m3338c4 = m3338c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
        for (int i7 = 0; i7 < m3338c.size(); i7++) {
            spannableString.setSpan(new C1145a(((Integer) m3338c4.get(i7)).intValue(), this, accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) m3338c.get(i7)).intValue(), ((Integer) m3338c2.get(i7)).intValue(), ((Integer) m3338c3.get(i7)).intValue());
        }
        return spannableString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1151g)) {
            return false;
        }
        C1151g c1151g = (C1151g) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = c1151g.f5685a;
        AccessibilityNodeInfo accessibilityNodeInfo2 = this.f5685a;
        if (accessibilityNodeInfo2 == null) {
            if (accessibilityNodeInfo != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo2.equals(accessibilityNodeInfo)) {
            return false;
        }
        return this.f5687c == c1151g.f5687c && this.f5686b == c1151g.f5686b;
    }

    /* renamed from: f */
    public final void m3341f(int i7, boolean z6) {
        Bundle extras = this.f5685a.getExtras();
        if (extras != null) {
            int i8 = extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i7);
            if (!z6) {
                i7 = 0;
            }
            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i7 | i8);
        }
    }

    /* renamed from: g */
    public final void m3342g(CharSequence charSequence) {
        this.f5685a.setClassName(charSequence);
    }

    /* renamed from: h */
    public final void m3343h(b bVar) {
        this.f5685a.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) bVar.f5702a);
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f5685a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* renamed from: i */
    public final void m3344i(String str) {
        int i7 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f5685a;
        if (i7 >= 26) {
            accessibilityNodeInfo.setHintText(str);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", str);
        }
    }

    /* renamed from: j */
    public final void m3345j(boolean z6) {
        this.f5685a.setScrollable(z6);
    }

    /* renamed from: k */
    public final void m3346k(CharSequence charSequence) {
        this.f5685a.setText(charSequence);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList] */
    public final String toString() {
        ?? emptyList;
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        m3339d(rect);
        sb.append("; boundsInParent: " + rect);
        AccessibilityNodeInfo accessibilityNodeInfo = this.f5685a;
        accessibilityNodeInfo.getBoundsInScreen(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(accessibilityNodeInfo.getPackageName());
        sb.append("; className: ");
        sb.append(accessibilityNodeInfo.getClassName());
        sb.append("; text: ");
        sb.append(m3340e());
        sb.append("; contentDescription: ");
        sb.append(accessibilityNodeInfo.getContentDescription());
        sb.append("; viewId: ");
        sb.append(accessibilityNodeInfo.getViewIdResourceName());
        sb.append("; uniqueId: ");
        sb.append(C0002a.m1a() ? accessibilityNodeInfo.getUniqueId() : accessibilityNodeInfo.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY"));
        sb.append("; checkable: ");
        sb.append(accessibilityNodeInfo.isCheckable());
        sb.append("; checked: ");
        sb.append(accessibilityNodeInfo.isChecked());
        sb.append("; focusable: ");
        sb.append(accessibilityNodeInfo.isFocusable());
        sb.append("; focused: ");
        sb.append(accessibilityNodeInfo.isFocused());
        sb.append("; selected: ");
        sb.append(accessibilityNodeInfo.isSelected());
        sb.append("; clickable: ");
        sb.append(accessibilityNodeInfo.isClickable());
        sb.append("; longClickable: ");
        sb.append(accessibilityNodeInfo.isLongClickable());
        sb.append("; enabled: ");
        sb.append(accessibilityNodeInfo.isEnabled());
        sb.append("; password: ");
        sb.append(accessibilityNodeInfo.isPassword());
        sb.append("; scrollable: " + accessibilityNodeInfo.isScrollable());
        sb.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = accessibilityNodeInfo.getActionList();
        if (actionList != null) {
            emptyList = new ArrayList();
            int size = actionList.size();
            for (int i7 = 0; i7 < size; i7++) {
                emptyList.add(new a(actionList.get(i7), 0, null, null, null));
            }
        } else {
            emptyList = Collections.emptyList();
        }
        for (int i8 = 0; i8 < emptyList.size(); i8++) {
            a aVar = (a) emptyList.get(i8);
            int m3347a = aVar.m3347a();
            if (m3347a == 1) {
                str = "ACTION_FOCUS";
            } else if (m3347a != 2) {
                switch (m3347a) {
                    case 4:
                        str = "ACTION_SELECT";
                        break;
                    case 8:
                        str = "ACTION_CLEAR_SELECTION";
                        break;
                    case 16:
                        str = "ACTION_CLICK";
                        break;
                    case 32:
                        str = "ACTION_LONG_CLICK";
                        break;
                    case 64:
                        str = "ACTION_ACCESSIBILITY_FOCUS";
                        break;
                    case Tools.Semaphore.f159S7 /* 128 */:
                        str = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                        break;
                    case Tools.Semaphore.f160S8 /* 256 */:
                        str = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                        break;
                    case Tools.Semaphore.f161S9 /* 512 */:
                        str = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                        break;
                    case 1024:
                        str = "ACTION_NEXT_HTML_ELEMENT";
                        break;
                    case 2048:
                        str = "ACTION_PREVIOUS_HTML_ELEMENT";
                        break;
                    case 4096:
                        str = "ACTION_SCROLL_FORWARD";
                        break;
                    case 8192:
                        str = "ACTION_SCROLL_BACKWARD";
                        break;
                    case 16384:
                        str = "ACTION_COPY";
                        break;
                    case 32768:
                        str = "ACTION_PASTE";
                        break;
                    case 65536:
                        str = "ACTION_CUT";
                        break;
                    case 131072:
                        str = "ACTION_SET_SELECTION";
                        break;
                    case 262144:
                        str = "ACTION_EXPAND";
                        break;
                    case 524288:
                        str = "ACTION_COLLAPSE";
                        break;
                    case 2097152:
                        str = "ACTION_SET_TEXT";
                        break;
                    case android.R.id.accessibilityActionMoveWindow:
                        str = "ACTION_MOVE_WINDOW";
                        break;
                    default:
                        switch (m3347a) {
                            case android.R.id.accessibilityActionShowOnScreen:
                                str = "ACTION_SHOW_ON_SCREEN";
                                break;
                            case android.R.id.accessibilityActionScrollToPosition:
                                str = "ACTION_SCROLL_TO_POSITION";
                                break;
                            case android.R.id.accessibilityActionScrollUp:
                                str = "ACTION_SCROLL_UP";
                                break;
                            case android.R.id.accessibilityActionScrollLeft:
                                str = "ACTION_SCROLL_LEFT";
                                break;
                            case android.R.id.accessibilityActionScrollDown:
                                str = "ACTION_SCROLL_DOWN";
                                break;
                            case android.R.id.accessibilityActionScrollRight:
                                str = "ACTION_SCROLL_RIGHT";
                                break;
                            case android.R.id.accessibilityActionContextClick:
                                str = "ACTION_CONTEXT_CLICK";
                                break;
                            case android.R.id.accessibilityActionSetProgress:
                                str = "ACTION_SET_PROGRESS";
                                break;
                            default:
                                switch (m3347a) {
                                    case android.R.id.accessibilityActionShowTooltip:
                                        str = "ACTION_SHOW_TOOLTIP";
                                        break;
                                    case android.R.id.accessibilityActionHideTooltip:
                                        str = "ACTION_HIDE_TOOLTIP";
                                        break;
                                    case android.R.id.accessibilityActionPageUp:
                                        str = "ACTION_PAGE_UP";
                                        break;
                                    case android.R.id.accessibilityActionPageDown:
                                        str = "ACTION_PAGE_DOWN";
                                        break;
                                    case android.R.id.accessibilityActionPageLeft:
                                        str = "ACTION_PAGE_LEFT";
                                        break;
                                    case android.R.id.accessibilityActionPageRight:
                                        str = "ACTION_PAGE_RIGHT";
                                        break;
                                    case android.R.id.accessibilityActionPressAndHold:
                                        str = "ACTION_PRESS_AND_HOLD";
                                        break;
                                    default:
                                        switch (m3347a) {
                                            case android.R.id.accessibilityActionImeEnter:
                                                str = "ACTION_IME_ENTER";
                                                break;
                                            case android.R.id.accessibilityActionDragStart:
                                                str = "ACTION_DRAG_START";
                                                break;
                                            case android.R.id.accessibilityActionDragDrop:
                                                str = "ACTION_DRAG_DROP";
                                                break;
                                            case android.R.id.accessibilityActionDragCancel:
                                                str = "ACTION_DRAG_CANCEL";
                                                break;
                                            default:
                                                str = "ACTION_UNKNOWN";
                                                break;
                                        }
                                }
                        }
                }
            } else {
                str = "ACTION_CLEAR_FOCUS";
            }
            if (str.equals("ACTION_UNKNOWN") && aVar.m3348b() != null) {
                str = aVar.m3348b().toString();
            }
            sb.append(str);
            if (i8 != emptyList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
