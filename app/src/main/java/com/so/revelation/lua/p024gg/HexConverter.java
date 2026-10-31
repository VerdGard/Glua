package com.so.revelation.lua.p024gg;

import android.content.Context;
import android.ext.Config;
import android.text.Editable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import com.so.revelation.lua.R;
import p175w1.C2099l0;
import p175w1.C2115x;

/* loaded from: classes.dex */
public class HexConverter extends ImageButton implements View.OnClickListener {
    public HexConverter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnClickListener(this);
        if (isInEditMode()) {
            return;
        }
        setImageResource(R.animator.m3_card_elevated_state_list_anim);
        Config.setIconSize(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        EditText editText;
        String obj;
        Object tag = getTag();
        if (tag instanceof EditText) {
            editText = (EditText) tag;
        } else {
            if (tag instanceof Object[]) {
                Object[] objArr = (Object[]) tag;
                if (objArr.length == 2) {
                    Object obj2 = objArr[0];
                    if (obj2 instanceof EditText) {
                        EditText editText2 = (EditText) obj2;
                        Object obj3 = objArr[1];
                        if (obj3 instanceof Integer) {
                            ((Integer) obj3).intValue();
                        } else if (obj3 instanceof C2099l0) {
                        }
                        editText = editText2;
                    }
                }
            }
            editText = null;
        }
        if (editText != null) {
            editText.requestFocus();
            Editable text = editText.getText();
            int selectionStart = editText.getSelectionStart();
            int selectionEnd = editText.getSelectionEnd();
            boolean z6 = selectionStart < 0 || selectionEnd < 0 || selectionStart == selectionEnd;
            if (z6) {
                selectionEnd = text.length();
                selectionStart = 0;
            }
            try {
                obj = text.subSequence(selectionStart, selectionEnd).toString().trim();
            } catch (StringIndexOutOfBoundsException e7) {
                Log.w("subSequence fail for " + selectionStart + ", " + selectionEnd + "; " + text.length(), e7);
                text.length();
                obj = text.toString();
                z6 = true;
            }
            if (obj.length() == 0) {
                return;
            }
            try {
                if (C2115x.m5163a(obj) != 0) {
                    char charAt = obj.charAt(1);
                    if (charAt != 'T' && charAt == 'A') {
                        obj.charAt(2);
                    }
                    z6 = false;
                }
                if (z6) {
                    char[] cArr = {'.', ':', ';', '~', 'X', 'W', 'Q'};
                    for (int i7 = 0; i7 < 7; i7++) {
                        int indexOf = obj.indexOf(cArr[i7]);
                        if (indexOf > 0) {
                            obj = obj.substring(0, indexOf);
                        }
                    }
                    obj.getClass();
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void setUseXor(boolean z6) {
    }
}
