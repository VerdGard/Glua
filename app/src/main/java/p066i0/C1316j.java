package p066i0;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import p034e0.C0912c;
import p034e0.InterfaceC0939q;

/* renamed from: i0.j */
/* loaded from: classes.dex */
public final class C1316j implements InterfaceC0939q {
    @Override // p034e0.InterfaceC0939q
    /* renamed from: a */
    public final C0912c mo2795a(View view, C0912c c0912c) {
        CharSequence coerceToStyledText;
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + c0912c);
        }
        if (c0912c.f4778a.mo2668d() == 2) {
            return c0912c;
        }
        C0912c.e eVar = c0912c.f4778a;
        ClipData mo2665a = eVar.mo2665a();
        int mo2666b = eVar.mo2666b();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z6 = false;
        for (int i7 = 0; i7 < mo2665a.getItemCount(); i7++) {
            ClipData.Item itemAt = mo2665a.getItemAt(i7);
            if ((mo2666b & 1) != 0) {
                coerceToStyledText = itemAt.coerceToText(context);
                if (coerceToStyledText instanceof Spanned) {
                    coerceToStyledText = coerceToStyledText.toString();
                }
            } else {
                coerceToStyledText = itemAt.coerceToStyledText(context);
            }
            if (coerceToStyledText != null) {
                if (z6) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), coerceToStyledText);
                } else {
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    int max = Math.max(0, Math.min(selectionStart, selectionEnd));
                    int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection(editable, max2);
                    editable.replace(max, max2, coerceToStyledText);
                    z6 = true;
                }
            }
        }
        return null;
    }
}
