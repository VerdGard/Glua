package p021c4;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* renamed from: c4.c */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0615c implements View.OnClickListener {

    /* renamed from: c */
    public final /* synthetic */ int f3034c;

    /* renamed from: e */
    public final /* synthetic */ AbstractC0628p f3035e;

    public /* synthetic */ ViewOnClickListenerC0615c(AbstractC0628p abstractC0628p, int i7) {
        this.f3034c = i7;
        this.f3035e = abstractC0628p;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        EditText editText;
        PasswordTransformationMethod passwordTransformationMethod;
        int i7 = this.f3034c;
        AbstractC0628p abstractC0628p = this.f3035e;
        switch (i7) {
            case 0:
                C0619g c0619g = (C0619g) abstractC0628p;
                EditText editText2 = c0619g.f3043i;
                if (editText2 != null) {
                    Editable text = editText2.getText();
                    if (text != null) {
                        text.clear();
                    }
                    c0619g.m2076q();
                    break;
                }
                break;
            default:
                C0635w c0635w = (C0635w) abstractC0628p;
                EditText editText3 = c0635w.f3122f;
                if (editText3 != null) {
                    int selectionEnd = editText3.getSelectionEnd();
                    EditText editText4 = c0635w.f3122f;
                    if (editText4 != null && (editText4.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        editText = c0635w.f3122f;
                        passwordTransformationMethod = null;
                    } else {
                        editText = c0635w.f3122f;
                        passwordTransformationMethod = PasswordTransformationMethod.getInstance();
                    }
                    editText.setTransformationMethod(passwordTransformationMethod);
                    if (selectionEnd >= 0) {
                        c0635w.f3122f.setSelection(selectionEnd);
                    }
                    c0635w.m2076q();
                    break;
                }
                break;
        }
    }
}
