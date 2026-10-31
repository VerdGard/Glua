package p113o0;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import android.widget.TextView;
import androidx.emoji2.text.C0323g;
import p106n0.C1634b;

/* renamed from: o0.c */
/* loaded from: classes.dex */
public final class C1654c extends InputConnectionWrapper {

    /* renamed from: a */
    public final TextView f7494a;

    /* renamed from: b */
    public final a f7495b;

    /* renamed from: o0.c$a */
    public static class a {
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0050, code lost:
        
            if (java.lang.Character.isHighSurrogate(r5) != false) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x008d, code lost:
        
            if (java.lang.Character.isLowSurrogate(r5) != false) goto L64;
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x0080, code lost:
        
            if (r11 != false) goto L72;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static boolean m4011a(android.view.inputmethod.InputConnection r7, android.text.Editable r8, int r9, int r10, boolean r11) {
            /*
                Method dump skipped, instructions count: 252
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p113o0.C1654c.a.m4011a(android.view.inputmethod.InputConnection, android.text.Editable, int, int, boolean):boolean");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1654c(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        a aVar = new a();
        this.f7494a = editText;
        this.f7495b = aVar;
        if (C0323g.f1557j != null) {
            C0323g m1102a = C0323g.m1102a();
            if (!(m1102a.m1103b() == 1) || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            C0323g.a aVar2 = m1102a.f1562e;
            aVar2.getClass();
            Bundle bundle = editorInfo.extras;
            C1634b c1634b = aVar2.f1567c.f1608a;
            int m4005a = c1634b.m4005a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", m4005a != 0 ? c1634b.f7462b.getInt(m4005a + c1634b.f7461a) : 0);
            Bundle bundle2 = editorInfo.extras;
            aVar2.f1568a.getClass();
            bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i7, int i8) {
        Editable editableText = this.f7494a.getEditableText();
        this.f7495b.getClass();
        return a.m4011a(this, editableText, i7, i8, false) || super.deleteSurroundingText(i7, i8);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i7, int i8) {
        Editable editableText = this.f7494a.getEditableText();
        this.f7495b.getClass();
        return a.m4011a(this, editableText, i7, i8, true) || super.deleteSurroundingTextInCodePoints(i7, i8);
    }
}
