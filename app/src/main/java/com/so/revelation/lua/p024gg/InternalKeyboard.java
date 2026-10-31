package com.so.revelation.lua.p024gg;

import android.content.Context;
import android.content.res.Resources;
import android.ext.Config;
import android.ext.Tools;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.DialogInterfaceC0151d;
import com.so.revelation.lua.R;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import p175w1.C2078b;
import p175w1.C2108q;
import p175w1.C2112u;
import p175w1.C2113v;
import p175w1.DialogInterfaceOnClickListenerC2106p;
import p175w1.InterfaceC2092i;
import p175w1.ViewOnClickListenerC2109r;

/* loaded from: classes.dex */
public class InternalKeyboard extends KeyboardView {

    /* renamed from: c */
    public boolean f3648c;

    /* renamed from: e */
    public boolean f3649e;

    /* renamed from: m */
    public boolean f3650m;

    /* renamed from: s */
    public boolean f3651s;

    /* renamed from: w1 */
    public int f3652w1;

    /* renamed from: x1 */
    public WeakReference<Window> f3653x1;

    /* renamed from: y1 */
    public int f3654y1;

    /* renamed from: com.so.revelation.lua.gg.InternalKeyboard$a */
    public class C0724a {
    }

    public InternalKeyboard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3650m = true;
        this.f3651s = false;
        this.f3652w1 = 0;
        this.f3653x1 = new WeakReference<>(null);
        this.f3654y1 = -1;
        this.f3649e = false;
        this.f3648c = false;
        if (isInEditMode()) {
            return;
        }
        try {
            setPreviewEnabled(false);
            setOnKeyboardActionListener(new C2112u(this));
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.view.View m2247a(android.view.View r4, boolean r5) {
        /*
            r0 = 0
            r1 = 2131427393(0x7f0b0041, float:1.84764E38)
            r2 = 0
            com.so.revelation.lua.EditorActivity r3 = android.ext.Tools.getActivity()     // Catch: java.lang.Throwable -> L16
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)     // Catch: java.lang.Throwable -> L16
            android.view.View r3 = r3.inflate(r1, r0)     // Catch: java.lang.Throwable -> L16
            if (r3 != 0) goto L14
            goto L17
        L14:
            r3 = 1
            goto L18
        L16:
        L17:
            r3 = 0
        L18:
            if (r3 != 0) goto L1b
            return r4
        L1b:
            com.so.revelation.lua.EditorActivity r3 = android.ext.Tools.getActivity()
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            android.view.View r0 = r3.inflate(r1, r0)
            com.so.revelation.lua.View.KeyboardLayout r0 = (com.so.revelation.lua.View.KeyboardLayout) r0
            boolean r1 = r4 instanceof android.widget.ScrollView
            if (r1 == 0) goto L31
            r1 = 2131231068(0x7f08015c, float:1.8078207E38)
            goto L34
        L31:
            r1 = 2131231069(0x7f08015d, float:1.8078209E38)
        L34:
            android.view.View r1 = r0.findViewById(r1)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r1.addView(r4)
            r1.setVisibility(r2)
            r1 = 2131231070(0x7f08015e, float:1.807821E38)
            android.view.View r1 = r0.findViewById(r1)
            com.so.revelation.lua.gg.InternalKeyboard r1 = (com.so.revelation.lua.p024gg.InternalKeyboard) r1
            r1.setAllowUseInternal(r5)
            java.lang.Object r4 = r4.getTag()
            boolean r5 = r4 instanceof com.so.revelation.lua.p024gg.InternalKeyboard.C0724a
            if (r5 == 0) goto L5c
            com.so.revelation.lua.gg.InternalKeyboard$a r4 = (com.so.revelation.lua.p024gg.InternalKeyboard.C0724a) r4
            r4.getClass()
            r1.setFlags(r2)
        L5c:
            r0.m2211a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.so.revelation.lua.p024gg.InternalKeyboard.m2247a(android.view.View, boolean):android.view.View");
    }

    /* renamed from: e */
    public static void m2248e(Keyboard.Key key, String str) {
        key.label = str;
        if (key.codes == null) {
            key.codes = new int[1];
        }
        key.codes[0] = str.charAt(0);
    }

    private Window getWindow() {
        return this.f3653x1.get();
    }

    private void setKeyboard(boolean z6) {
        boolean z7 = this.f3649e;
        boolean z8 = this.f3648c;
        boolean z9 = (Config.configClient & 64) != 0;
        int i7 = this.f3651s ? R.xml.empty : R.xml.keyboard;
        Keyboard keyboard = new Keyboard(Tools.getActivity(), i7, 0);
        if (!this.f3651s) {
            if (z7 && keyboard.getKeys().size() == 0) {
                keyboard = new Keyboard(Tools.getActivity(), i7, 0);
            }
            if (z8 && keyboard.getKeys().size() == 0) {
                keyboard = new Keyboard(Tools.getActivity(), i7, 0);
                z8 = false;
            }
            if (z9 && keyboard.getKeys().size() == 0) {
                keyboard = new Keyboard(Tools.getActivity(), i7, 0);
            }
        }
        SparseIntArray sparseIntArray = new SparseIntArray();
        for (Keyboard.Key key : keyboard.getKeys()) {
            if (key != null) {
                int i8 = key.y;
                sparseIntArray.put(i8, sparseIntArray.get(i8, 0) + 1);
                if (!z8) {
                    if ((this.f3652w1 & 1) != 0 && ":".equals(key.label)) {
                        m2248e(key, "?");
                    }
                    if ((this.f3652w1 & 2) != 0 && ";".equals(key.label)) {
                        m2248e(key, "*");
                    }
                    if ((this.f3652w1 & 4) != 0 && "~".equals(key.label)) {
                        m2248e(key, "^");
                    }
                    if ((this.f3652w1 & 8) != 0 && "r".equals(key.label)) {
                        m2248e(key, "$");
                    }
                }
                int[] iArr = key.codes;
                if (iArr != null && iArr.length != 0) {
                    int i9 = iArr[0];
                    if (i9 == 5002) {
                        key.label = null;
                    }
                    if (i9 == 5003) {
                        key.label = String.valueOf('.');
                    }
                }
            }
        }
        Resources resources = getContext().getResources();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null && sparseIntArray.size() > 0) {
            layoutParams.width = Math.round(resources.getDimension(R.dimen.key_width) * sparseIntArray.valueAt(0));
            layoutParams.height = Math.round(resources.getDimension(R.dimen.key_height) * sparseIntArray.size());
            setLayoutParams(layoutParams);
        }
        setKeyboard(keyboard);
    }

    /* renamed from: b */
    public final void m2249b(View view, boolean z6) {
        if (view != null) {
            try {
                Window window = getWindow();
                if (window != null) {
                    Tools.externalKeyboard(window, view, z6);
                }
                if (z6) {
                    setKeyboard(false);
                } else {
                    m2252f();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: c */
    public final void m2250c() {
        Window window = getWindow();
        if (window != null) {
            int i7 = this.f3654y1;
            int i8 = Tools.getActivity().getResources().getConfiguration().orientation;
            if (i7 != i8) {
                this.f3654y1 = i8;
                boolean z6 = i8 != 1;
                WindowManager.LayoutParams attributes = window.getAttributes();
                View decorView = window.getDecorView();
                int width = decorView.getWidth();
                try {
                    decorView.measure(-2, -2);
                    width = Math.max(width, decorView.getMeasuredWidth());
                } catch (Throwable unused) {
                }
                if (z6) {
                    int width2 = getWidth();
                    try {
                        measure(-2, -2);
                        width += Math.max(width2, getMeasuredWidth());
                    } catch (Throwable unused2) {
                    }
                } else {
                    width += Tools.dp2px48();
                }
                attributes.width = width;
                if (width >= Tools.getActivity().getResources().getDisplayMetrics().widthPixels) {
                    attributes.width = -1;
                }
                window.setAttributes(attributes);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public final void m2251d(int i7) {
        String valueOf;
        int i8;
        Window window = getWindow();
        if (window != null) {
            View currentFocus = window.getCurrentFocus();
            if (currentFocus instanceof EditText) {
                EditText editText = (EditText) currentFocus;
                int max = Math.max(editText.getSelectionStart(), 0);
                int max2 = Math.max(editText.getSelectionEnd(), 0);
                if (i7 >= 5000) {
                    String str = null;
                    switch (i7) {
                        case 5000:
                            i8 = 67;
                            break;
                        case 5001:
                            i8 = 112;
                            break;
                        case 5002:
                        default:
                            i8 = 0;
                            break;
                        case 5003:
                            str = String.valueOf('.');
                            i8 = 0;
                            break;
                        case 5004:
                        case 5005:
                            if (!(max == max2 && ((max == 0 && i7 == 5004) || (max == editText.getText().length() && i7 == 5005)))) {
                                if (i7 == 5004) {
                                    i8 = 21;
                                    break;
                                } else {
                                    i8 = 22;
                                    break;
                                }
                            }
                            i8 = 0;
                            break;
                        case 5006:
                            this.f3649e = !this.f3649e;
                            m2252f();
                            i8 = 0;
                            break;
                        case 5007:
                            LinkedList<C2113v> linkedList = C2108q.f9555a;
                            ViewOnClickListenerC2109r viewOnClickListenerC2109r = new ViewOnClickListenerC2109r(editText instanceof InterfaceC2092i ? ((InterfaceC2092i) editText).getDataType() : -1, Tools.getContext());
                            if (viewOnClickListenerC2109r.getCount() != 0) {
                                ViewOnClickListenerC2109r.f9557X = false;
                                View customTitle = Tools.getCustomTitle("标题", "副标题");
                                customTitle.setOnClickListener(viewOnClickListenerC2109r);
                                Context context = Tools.getContext();
                                C2078b.a aVar = C2078b.f9472a;
                                DialogInterfaceC0151d.a aVar2 = new DialogInterfaceC0151d.a(context);
                                AlertController.C0145b c0145b = aVar2.f374a;
                                c0145b.f346f = customTitle;
                                DialogInterfaceOnClickListenerC2106p dialogInterfaceOnClickListenerC2106p = new DialogInterfaceOnClickListenerC2106p(viewOnClickListenerC2109r, editText);
                                c0145b.f357q = viewOnClickListenerC2109r;
                                c0145b.f358r = dialogInterfaceOnClickListenerC2106p;
                                DialogInterfaceC0151d m484a = aVar2.m484a();
                                viewOnClickListenerC2109r.f9560m = m484a;
                                C2078b.m5137d(m484a, null);
                            }
                            i8 = 0;
                            break;
                        case 5008:
                            Tools.selectAll(editText);
                            i8 = 0;
                            break;
                        case 5009:
                            m2252f();
                            i8 = 0;
                            break;
                        case 5010:
                            this.f3648c = !this.f3648c;
                            m2252f();
                            i8 = 0;
                            break;
                    }
                    valueOf = str;
                } else {
                    valueOf = String.valueOf((char) i7);
                    i8 = 0;
                }
                if (valueOf != null) {
                    editText.getText().replace(Math.min(max, max2), Math.max(max, max2), valueOf, 0, valueOf.length());
                    editText.setSelection(Math.max(editText.getSelectionStart(), editText.getSelectionEnd()));
                }
                if (i8 != 0) {
                    try {
                        editText.dispatchKeyEvent(new KeyEvent(0, i8));
                        editText.dispatchKeyEvent(new KeyEvent(1, i8));
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0008, code lost:
    
        if ((android.ext.Config.configClient & 1) != 0) goto L8;
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2252f() {
        /*
            r2 = this;
            boolean r0 = r2.f3650m
            if (r0 == 0) goto Lb
            int r0 = android.ext.Config.configClient
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto Lb
            goto Lc
        Lb:
            r1 = 0
        Lc:
            r2.setKeyboard(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.so.revelation.lua.p024gg.InternalKeyboard.m2252f():void");
    }

    public int getFlags() {
        return this.f3652w1;
    }

    @Override // android.view.View
    public final void playSoundEffect(int i7) {
        try {
            super.playSoundEffect(i7);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEvent(int i7) {
        try {
            super.sendAccessibilityEvent(i7);
        } catch (Throwable unused) {
        }
    }

    public void setAllowUseInternal(boolean z6) {
        this.f3650m = z6;
    }

    public void setFlags(int i7) {
        this.f3652w1 = i7;
    }

    public void setHideKeyboard(boolean z6) {
        boolean z7 = this.f3651s;
        this.f3651s = z6;
        if (z7 != z6) {
            m2252f();
        }
    }
}
