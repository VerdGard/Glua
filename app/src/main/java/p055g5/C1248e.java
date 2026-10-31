package p055g5;

import android.ext.Tools;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.SurroundingText;
import p021c4.C0623k;
import p022c5.C0637a;
import p022c5.C0638b;
import p022c5.C0640d;
import p022c5.C0641e;
import p022c5.C0645i;
import p039e5.C1139a;
import p047f5.C1174e;
import p132q4.C1775d;
import p132q4.C1791t;

/* renamed from: g5.e */
/* loaded from: classes.dex */
public final class C1248e extends BaseInputConnection {

    /* renamed from: d */
    public static final C1174e f6124d = C1174e.m3367a("EditorInputConnection");

    /* renamed from: a */
    public final C1245b f6125a;

    /* renamed from: b */
    public final C0640d f6126b;

    /* renamed from: c */
    public boolean f6127c;

    public C1248e(C1245b c1245b) {
        super(c1245b, true);
        this.f6126b = new C0640d();
        this.f6127c = false;
        this.f6125a = c1245b;
        c1245b.m3508q0(C1775d.class, new C0623k(2, this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
    
        if (r0.m2116a() != false) goto L17;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3514a(java.lang.CharSequence r8) {
        /*
            r7 = this;
            c5.d r0 = r7.f6126b
            boolean r1 = r0.m2116a()
            g5.b r2 = r7.f6125a
            g5.d r3 = r2.getProps()
            boolean r3 = r3.f6093C1
            if (r3 == 0) goto L60
            boolean r3 = r0.m2116a()
            if (r3 == 0) goto L69
            c5.e r3 = r2.getText()
            int r4 = r0.f3145a
            int r5 = r0.f3146b
            java.lang.CharSequence r3 = r3.subSequence(r4, r5)
            c5.e r3 = (p022c5.C0641e) r3
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = r8.toString()
            int r5 = r0.f3146b
            c5.i r6 = r7.m3516c()
            c5.b r6 = r6.f3166c
            int r6 = r6.f3140a
            if (r5 != r6) goto L66
            c5.i r5 = r7.m3516c()
            boolean r5 = r5.m2163a()
            if (r5 != 0) goto L66
            boolean r5 = r4.startsWith(r3)
            if (r5 == 0) goto L66
            int r5 = r4.length()
            int r6 = r3.length()
            if (r5 <= r6) goto L66
            int r8 = r3.length()
            java.lang.String r8 = r4.substring(r8)
            r3 = -1
            r0.f3146b = r3
            r0.f3145a = r3
            goto L69
        L60:
            boolean r0 = r0.m2116a()
            if (r0 == 0) goto L69
        L66:
            r7.m3515b()
        L69:
            r0 = 1
            r2.m3492g(r8, r0)
            if (r1 == 0) goto L72
            r7.endBatchEdit()
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p055g5.C1248e.m3514a(java.lang.CharSequence):void");
    }

    /* renamed from: b */
    public final void m3515b() {
        C0640d c0640d = this.f6126b;
        if (c0640d.m2116a()) {
            try {
                this.f6125a.getText().m2135g(c0640d.f3145a, c0640d.f3146b);
            } catch (IndexOutOfBoundsException e7) {
                e7.printStackTrace();
            }
            c0640d.f3146b = -1;
            c0640d.f3145a = -1;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final synchronized boolean beginBatchEdit() {
        this.f6125a.getProps().getClass();
        return this.f6125a.getText().m2130b();
    }

    /* renamed from: c */
    public final C0645i m3516c() {
        return this.f6125a.getCursor();
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i7) {
        C1139a keyMetaStates = this.f6125a.getKeyMetaStates();
        keyMetaStates.clearMetaKeyState(keyMetaStates.f5674a, keyMetaStates.f5675b, i7);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final synchronized void closeConnection() {
        super.closeConnection();
        C0641e text = this.f6125a.getText();
        while (true) {
            if (text.f3148X > 0) {
                text.m2140l();
            } else {
                C0640d c0640d = this.f6126b;
                c0640d.f3146b = -1;
                c0640d.f3145a = -1;
                C1245b c1245b = this.f6125a;
                c1245b.setExtracting(null);
                c1245b.invalidate();
            }
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i7) {
        if (!this.f6125a.m3476S() || charSequence == null) {
            return false;
        }
        if (!"\n".equals(charSequence.toString())) {
            m3514a(charSequence);
            return true;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        sendKeyEvent(new KeyEvent(uptimeMillis, uptimeMillis, 0, 66, 0, 0, -1, 0, 6));
        sendKeyEvent(new KeyEvent(SystemClock.uptimeMillis(), uptimeMillis, 1, 66, 0, 0, -1, 0, 6));
        return true;
    }

    /* renamed from: d */
    public final CharSequence m3517d(int i7, int i8, int i9) {
        try {
            return m3518e(i7, i8, i9, false);
        } catch (IndexOutOfBoundsException e7) {
            Log.w(f6124d.f5757a, "Failed to get text region for IME", e7);
            return "";
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i7, int i8) {
        C1245b c1245b = this.f6125a;
        if (!c1245b.m3476S() || i7 < 0 || i8 < 0) {
            return false;
        }
        C0640d c0640d = this.f6126b;
        if (i7 == 1 && i8 == 0 && !c0640d.m2116a()) {
            c1245b.m3459B();
            return true;
        }
        if (i7 > 0 && i8 > 0) {
            beginBatchEdit();
        }
        boolean m2116a = c0640d.m2116a();
        int i9 = m2116a ? c0640d.f3145a : 0;
        int i10 = m2116a ? c0640d.f3146b : 0;
        int i11 = m3516c().f3166c.f3140a;
        int i12 = i11 - i7;
        if (i12 < 0) {
            i12 = 0;
        }
        c1245b.getText().m2135g(i12, i11);
        if (m2116a) {
            int max = Math.max(i12, i9);
            int max2 = i10 - Math.max(0, Math.min(i11, i10) - max);
            int max3 = Math.max(0, max - i12);
            i10 = max2 - max3;
            i9 -= max3;
        }
        int i13 = m3516c().f3167d.f3140a;
        int i14 = i13 + i8;
        if (i14 > c1245b.getText().f3154s) {
            i14 = c1245b.getText().f3154s;
        }
        c1245b.getText().m2135g(i13, i14);
        if (m2116a) {
            int max4 = Math.max(i13, i9);
            Math.max(0, Math.min(i14, i10) - max4);
            Math.max(0, max4 - i13);
        }
        if (i7 > 0 && i8 > 0) {
            endBatchEdit();
        }
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i7, int i8) {
        return false;
    }

    /* renamed from: e */
    public final CharSequence m3518e(int i7, int i8, int i9, boolean z6) {
        C1245b c1245b = this.f6125a;
        C0641e text = c1245b.getText();
        if (i7 > i8) {
            i8 = i7;
            i7 = i8;
        }
        int i10 = 0;
        if (i7 < 0) {
            i7 = 0;
        }
        int i11 = text.f3154s;
        if (i8 > i11) {
            i8 = i11;
        }
        if (i8 < i7) {
            i7 = 0;
            i8 = 0;
        }
        if (!z6 && i8 - i7 > c1245b.getProps().f6115Z) {
            i8 = Math.max(0, c1245b.getProps().f6115Z) + i7;
        }
        String c0641e = ((C0641e) text.subSequence(i7, i8)).toString();
        if (i9 != 1) {
            return c0641e;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(c0641e);
        C0640d c0640d = this.f6126b;
        if (c0640d.m2116a()) {
            try {
                int i12 = c0640d.f3145a;
                int i13 = c0640d.f3146b;
                int i14 = i12 - i7;
                if (i14 >= spannableStringBuilder.length()) {
                    return spannableStringBuilder;
                }
                if (i14 >= 0) {
                    i10 = i14;
                }
                int i15 = i13 - i7;
                if (i15 <= 0) {
                    return spannableStringBuilder;
                }
                if (i15 >= spannableStringBuilder.length()) {
                    i15 = spannableStringBuilder.length();
                }
                spannableStringBuilder.setSpan(Integer.valueOf(Tools.Semaphore.f160S8), i10, i15, 33);
            } catch (IndexOutOfBoundsException unused) {
            }
        }
        return spannableStringBuilder;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final synchronized boolean endBatchEdit() {
        boolean m2140l;
        m2140l = this.f6125a.getText().m2140l();
        if (!m2140l) {
            this.f6125a.m3512u0();
        }
        return m2140l;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        C1245b c1245b = this.f6125a;
        if (!c1245b.m3476S()) {
            return false;
        }
        c1245b.getProps().getClass();
        C0640d c0640d = this.f6126b;
        c0640d.f3146b = -1;
        c0640d.f3145a = -1;
        endBatchEdit();
        c1245b.m3510s0();
        c1245b.invalidate();
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i7) {
        return TextUtils.getCapsMode(this.f6125a.getText(), m3516c().f3166c.f3140a, i7);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i7) {
        C1245b c1245b = this.f6125a;
        c1245b.getProps().getClass();
        c1245b.getProps().getClass();
        if ((i7 & 1) != 0) {
            c1245b.setExtracting(extractedTextRequest);
        } else {
            c1245b.setExtracting(null);
        }
        return c1245b.m3466I(extractedTextRequest);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return this.f6125a.getHandler();
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i7) {
        this.f6125a.getProps().getClass();
        int i8 = m3516c().f3166c.f3140a;
        int i9 = m3516c().f3167d.f3140a;
        if (i8 == i9) {
            return null;
        }
        return m3517d(i8, i9, i7);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final SurroundingText getSurroundingText(int i7, int i8, int i9) {
        CharSequence charSequence;
        C1245b c1245b = this.f6125a;
        c1245b.getProps().getClass();
        if ((i7 | i8) < 0) {
            throw new IllegalArgumentException("length < 0");
        }
        int min = Math.min(Math.max(0, m3516c().f3166c.f3140a - i7), m3516c().f3166c.f3140a);
        try {
            charSequence = m3518e(min, Math.min(c1245b.getText().f3154s, m3516c().f3167d.f3140a + i8), i9, true);
        } catch (IndexOutOfBoundsException e7) {
            Log.w(f6124d.f5757a, "Failed to get text region for IME", e7);
            charSequence = "";
        }
        return new SurroundingText(charSequence, m3516c().f3166c.f3140a - min, m3516c().f3167d.f3140a - min, min);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i7, int i8) {
        this.f6125a.getProps().getClass();
        int i9 = m3516c().f3167d.f3140a;
        return m3517d(i9, i7 + i9, i8);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i7, int i8) {
        C1245b c1245b = this.f6125a;
        c1245b.getProps().getClass();
        int i9 = m3516c().f3166c.f3140a;
        return m3517d(Math.max(i9 - i7, i9 - c1245b.getProps().f6115Z), i9, i8);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i7) {
        C1245b c1245b = this.f6125a;
        switch (i7) {
            case android.R.id.selectAll:
                c1245b.m3497i0();
                return true;
            case android.R.id.cut:
                c1245b.m3496i(true);
                if (m3516c().m2163a()) {
                    c1245b.m3459B();
                }
                return true;
            case android.R.id.copy:
                c1245b.m3496i(true);
                return true;
            case android.R.id.paste:
                break;
            default:
                switch (i7) {
                    case android.R.id.undo:
                        c1245b.m3509r0();
                        break;
                    case android.R.id.redo:
                        c1245b.m3491f0();
                        break;
                }
                return true;
        }
        c1245b.m3486c0();
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        C1245b c1245b = this.f6125a;
        c1245b.f5988B1.m4244a(new C1791t(c1245b, str));
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z6) {
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i7) {
        this.f6125a.m3511t0();
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i7, int i8) {
        C1245b c1245b = this.f6125a;
        if (c1245b.m3476S()) {
            if (c1245b.f6052g2 == 0) {
                c1245b.getProps().getClass();
                if (i7 == i8) {
                    finishComposingText();
                    return true;
                }
                if (i7 > i8) {
                    i8 = i7;
                    i7 = i8;
                }
                if (i7 < 0) {
                    i7 = 0;
                }
                try {
                    int i9 = c1245b.getText().f3154s;
                    if (i8 > i9) {
                        i8 = i9;
                    }
                    if (i7 >= i8) {
                        return false;
                    }
                    C0640d c0640d = this.f6126b;
                    c0640d.f3145a = i7;
                    c0640d.f3146b = i8;
                    c1245b.invalidate();
                    beginBatchEdit();
                    return true;
                } catch (IndexOutOfBoundsException e7) {
                    Log.w(f6124d.f5757a, "set composing region for IME failed", e7);
                }
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i7) {
        C1245b c1245b = this.f6125a;
        if (c1245b.m3476S()) {
            if (c1245b.f6052g2 == 0) {
                c1245b.getProps().getClass();
                if (TextUtils.indexOf(charSequence, '\n') != -1) {
                    return false;
                }
                C0640d c0640d = this.f6126b;
                if (!c0640d.m2116a()) {
                    if (m3516c().m2163a()) {
                        c1245b.m3459B();
                    }
                    beginBatchEdit();
                    c0640d.f3147c = true;
                    c1245b.m3492g(charSequence, true);
                    int length = m3516c().f3166c.f3140a - charSequence.length();
                    int i8 = m3516c().f3166c.f3140a;
                    c0640d.f3145a = length;
                    c0640d.f3146b = i8;
                } else if (c0640d.m2116a()) {
                    if (c1245b.getProps().f6094D1) {
                        String charSequence2 = charSequence.toString();
                        C0641e text = c1245b.getText();
                        String m2126J = text.m2126J(c0640d.f3145a, c0640d.f3146b);
                        if (!m2126J.equals(charSequence2)) {
                            if (m2126J.length() < charSequence2.length() && charSequence2.startsWith(m2126J)) {
                                C0638b m2110o = ((C0637a) text.m2145q()).m2110o(c0640d.f3146b);
                                text.m2151w(m2110o.f3141b, m2110o.f3142c, charSequence2.substring(m2126J.length()));
                            } else if (m2126J.length() <= charSequence2.length() || !m2126J.startsWith(charSequence2)) {
                                text.m2118B(c0640d.f3145a, c0640d.f3146b, charSequence2);
                            } else {
                                text.m2135g(c0640d.f3146b - (m2126J.length() - charSequence2.length()), c0640d.f3146b);
                            }
                        }
                    } else {
                        c1245b.getText().m2118B(c0640d.f3145a, c0640d.f3146b, charSequence);
                    }
                    c0640d.f3146b = c0640d.f3145a + charSequence.length();
                }
                if (charSequence.length() == 0) {
                    finishComposingText();
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setImeConsumesInput(boolean z6) {
        this.f6127c = z6;
        this.f6125a.invalidate();
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setSelection(int i7, int i8) {
        C1245b c1245b = this.f6125a;
        int i9 = 0;
        if (!c1245b.m3476S()) {
            return false;
        }
        c1245b.getProps().getClass();
        if (i7 < 0) {
            i7 = 0;
        } else if (i7 > c1245b.getText().f3154s) {
            i7 = c1245b.getText().f3154s;
        }
        if (i8 >= 0) {
            if (i8 > c1245b.getText().f3154s) {
                i8 = c1245b.getText().f3154s;
            }
            i9 = i8;
        }
        if (i7 > i9) {
            int i10 = i9;
            i9 = i7;
            i7 = i10;
        }
        if (i7 == m3516c().f3166c.f3140a && i9 == m3516c().f3167d.f3140a) {
            return true;
        }
        C0641e text = c1245b.getText();
        C0638b m2110o = ((C0637a) text.m2145q()).m2110o(i7);
        C0638b m2110o2 = ((C0637a) text.m2145q()).m2110o(i9);
        this.f6125a.m3505o0(m2110o.f3141b, m2110o.f3142c, m2110o2.f3141b, m2110o2.f3142c, false, 4);
        return true;
    }
}
