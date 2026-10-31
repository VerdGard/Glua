package p113o0;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.C0323g;
import java.lang.ref.WeakReference;

/* renamed from: o0.d */
/* loaded from: classes.dex */
public final class C1655d implements InputFilter {

    /* renamed from: a */
    public final TextView f7496a;

    /* renamed from: b */
    public a f7497b;

    /* renamed from: o0.d$a */
    public static class a extends C0323g.e {

        /* renamed from: a */
        public final WeakReference f7498a;

        /* renamed from: b */
        public final WeakReference f7499b;

        public a(TextView textView, C1655d c1655d) {
            this.f7498a = new WeakReference(textView);
            this.f7499b = new WeakReference(c1655d);
        }

        @Override // androidx.emoji2.text.C0323g.e
        /* renamed from: a */
        public final void mo1109a() {
            boolean z6;
            int length;
            InputFilter[] filters;
            TextView textView = (TextView) this.f7498a.get();
            InputFilter inputFilter = (InputFilter) this.f7499b.get();
            if (inputFilter != null && textView != null && (filters = textView.getFilters()) != null) {
                for (InputFilter inputFilter2 : filters) {
                    if (inputFilter2 == inputFilter) {
                        z6 = true;
                        break;
                    }
                }
            }
            z6 = false;
            if (z6 && textView.isAttachedToWindow()) {
                CharSequence text = textView.getText();
                C0323g m1102a = C0323g.m1102a();
                if (text == null) {
                    length = 0;
                } else {
                    m1102a.getClass();
                    length = text.length();
                }
                CharSequence m1107f = m1102a.m1107f(0, length, text);
                if (text == m1107f) {
                    return;
                }
                int selectionStart = Selection.getSelectionStart(m1107f);
                int selectionEnd = Selection.getSelectionEnd(m1107f);
                textView.setText(m1107f);
                if (m1107f instanceof Spannable) {
                    Spannable spannable = (Spannable) m1107f;
                    if (selectionStart >= 0 && selectionEnd >= 0) {
                        Selection.setSelection(spannable, selectionStart, selectionEnd);
                    } else if (selectionStart >= 0) {
                        Selection.setSelection(spannable, selectionStart);
                    } else if (selectionEnd >= 0) {
                        Selection.setSelection(spannable, selectionEnd);
                    }
                }
            }
        }
    }

    public C1655d(TextView textView) {
        this.f7496a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i7, int i8, Spanned spanned, int i9, int i10) {
        TextView textView = this.f7496a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int m1103b = C0323g.m1102a().m1103b();
        if (m1103b != 0) {
            boolean z6 = true;
            if (m1103b == 1) {
                if (i10 == 0 && i9 == 0 && spanned.length() == 0 && charSequence == textView.getText()) {
                    z6 = false;
                }
                if (!z6 || charSequence == null) {
                    return charSequence;
                }
                if (i7 != 0 || i8 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i7, i8);
                }
                return C0323g.m1102a().m1107f(0, charSequence.length(), charSequence);
            }
            if (m1103b != 3) {
                return charSequence;
            }
        }
        C0323g m1102a = C0323g.m1102a();
        if (this.f7497b == null) {
            this.f7497b = new a(textView, this);
        }
        m1102a.m1108g(this.f7497b);
        return charSequence;
    }
}
