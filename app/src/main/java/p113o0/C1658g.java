package p113o0;

import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.C0323g;
import java.lang.ref.WeakReference;

/* renamed from: o0.g */
/* loaded from: classes.dex */
public final class C1658g implements TextWatcher {

    /* renamed from: c */
    public final EditText f7507c;

    /* renamed from: m */
    public a f7509m;

    /* renamed from: e */
    public final boolean f7508e = false;

    /* renamed from: s */
    public boolean f7510s = true;

    /* renamed from: o0.g$a */
    public static class a extends C0323g.e {

        /* renamed from: a */
        public final WeakReference f7511a;

        public a(EditText editText) {
            this.f7511a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.C0323g.e
        /* renamed from: a */
        public final void mo1109a() {
            C1658g.m4016a((EditText) this.f7511a.get(), 1);
        }
    }

    public C1658g(EditText editText) {
        this.f7507c = editText;
    }

    /* renamed from: a */
    public static void m4016a(EditText editText, int i7) {
        int length;
        if (i7 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C0323g m1102a = C0323g.m1102a();
            if (editableText == null) {
                length = 0;
            } else {
                m1102a.getClass();
                length = editableText.length();
            }
            m1102a.m1107f(0, length, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        if ((androidx.emoji2.text.C0323g.f1557j != null) == false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onTextChanged(java.lang.CharSequence r5, int r6, int r7, int r8) {
        /*
            r4 = this;
            android.widget.EditText r0 = r4.f7507c
            boolean r1 = r0.isInEditMode()
            if (r1 != 0) goto L54
            boolean r1 = r4.f7510s
            r2 = 1
            if (r1 == 0) goto L1b
            boolean r1 = r4.f7508e
            r3 = 0
            if (r1 != 0) goto L1c
            androidx.emoji2.text.g r1 = androidx.emoji2.text.C0323g.f1557j
            if (r1 == 0) goto L18
            r1 = 1
            goto L19
        L18:
            r1 = 0
        L19:
            if (r1 != 0) goto L1c
        L1b:
            r3 = 1
        L1c:
            if (r3 == 0) goto L1f
            goto L54
        L1f:
            if (r7 > r8) goto L54
            boolean r7 = r5 instanceof android.text.Spannable
            if (r7 == 0) goto L54
            androidx.emoji2.text.g r7 = androidx.emoji2.text.C0323g.m1102a()
            int r7 = r7.m1103b()
            if (r7 == 0) goto L40
            if (r7 == r2) goto L35
            r5 = 3
            if (r7 == r5) goto L40
            goto L54
        L35:
            android.text.Spannable r5 = (android.text.Spannable) r5
            androidx.emoji2.text.g r7 = androidx.emoji2.text.C0323g.m1102a()
            int r8 = r8 + r6
            r7.m1107f(r6, r8, r5)
            goto L54
        L40:
            androidx.emoji2.text.g r5 = androidx.emoji2.text.C0323g.m1102a()
            o0.g$a r6 = r4.f7509m
            if (r6 != 0) goto L4f
            o0.g$a r6 = new o0.g$a
            r6.<init>(r0)
            r4.f7509m = r6
        L4f:
            o0.g$a r6 = r4.f7509m
            r5.m1108g(r6)
        L54:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p113o0.C1658g.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }
}
