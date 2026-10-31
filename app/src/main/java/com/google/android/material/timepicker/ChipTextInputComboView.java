package com.google.android.material.timepicker;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import p034e0.C0923h0;
import p034e0.C0937o0;
import p034e0.C0946x;
import p131q3.C1761q;
import p166v.C2009a;

/* loaded from: classes.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: c */
    public final Chip f4575c;

    /* renamed from: e */
    public final EditText f4576e;

    /* renamed from: com.google.android.material.timepicker.ChipTextInputComboView$a */
    public class C0856a extends C1761q {
        public C0856a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            boolean isEmpty = TextUtils.isEmpty(editable);
            ChipTextInputComboView chipTextInputComboView = ChipTextInputComboView.this;
            if (isEmpty) {
                chipTextInputComboView.f4575c.setText(ChipTextInputComboView.m2546a(chipTextInputComboView, "00"));
                return;
            }
            String m2546a = ChipTextInputComboView.m2546a(chipTextInputComboView, editable);
            Chip chip = chipTextInputComboView.f4575c;
            if (TextUtils.isEmpty(m2546a)) {
                m2546a = ChipTextInputComboView.m2546a(chipTextInputComboView, "00");
            }
            chip.setText(m2546a);
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LocaleList locales;
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(R$layout.material_time_chip, (ViewGroup) this, false);
        this.f4575c = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(R$layout.material_time_input, (ViewGroup) this, false);
        EditText editText = textInputLayout.getEditText();
        this.f4576e = editText;
        editText.setVisibility(4);
        editText.addTextChangedListener(new C0856a());
        if (Build.VERSION.SDK_INT >= 24) {
            locales = getContext().getResources().getConfiguration().getLocales();
            editText.setImeHintLocales(locales);
        }
        addView(chip);
        addView(textInputLayout);
        TextView textView = (TextView) findViewById(R$id.material_label);
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        editText.setId(C0946x.e.m2844a());
        C0946x.e.m2851h(textView, editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }

    /* renamed from: a */
    public static String m2546a(ChipTextInputComboView chipTextInputComboView, CharSequence charSequence) {
        try {
            return String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f4575c.isChecked();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        LocaleList locales;
        super.onConfigurationChanged(configuration);
        if (Build.VERSION.SDK_INT >= 24) {
            locales = getContext().getResources().getConfiguration().getLocales();
            this.f4576e.setImeHintLocales(locales);
        }
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z6) {
        Chip chip = this.f4575c;
        chip.setChecked(z6);
        int i7 = z6 ? 0 : 4;
        final EditText editText = this.f4576e;
        editText.setVisibility(i7);
        chip.setVisibility(z6 ? 8 : 0);
        if (isChecked()) {
            editText.requestFocus();
            editText.post(new Runnable() { // from class: q3.t

                /* renamed from: e */
                public final /* synthetic */ boolean f8123e = false;

                @Override // java.lang.Runnable
                public final void run() {
                    C0937o0 c0937o0;
                    View view = editText;
                    Object obj = null;
                    if (this.f8123e) {
                        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
                        if (Build.VERSION.SDK_INT >= 30) {
                            c0937o0 = C0946x.n.m2927b(view);
                        } else {
                            Context context = view.getContext();
                            while (true) {
                                if (!(context instanceof ContextWrapper)) {
                                    break;
                                }
                                if (context instanceof Activity) {
                                    Window window = ((Activity) context).getWindow();
                                    if (window != null) {
                                        c0937o0 = new C0937o0(window, view);
                                    }
                                } else {
                                    context = ((ContextWrapper) context).getBaseContext();
                                }
                            }
                            c0937o0 = null;
                        }
                        if (c0937o0 != null) {
                            c0937o0.f4868a.mo2791c();
                            return;
                        }
                    }
                    Context context2 = view.getContext();
                    Object obj2 = C2009a.f9156a;
                    int i8 = Build.VERSION.SDK_INT;
                    if (i8 >= 23) {
                        obj = C2009a.d.m4906b(context2, InputMethodManager.class);
                    } else {
                        String m4907c = i8 >= 23 ? C2009a.d.m4907c(context2, InputMethodManager.class) : C2009a.e.f9157a.get(InputMethodManager.class);
                        if (m4907c != null) {
                            obj = context2.getSystemService(m4907c);
                        }
                    }
                    ((InputMethodManager) obj).showSoftInput(view, 1);
                }
            });
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f4575c.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public final void setTag(int i7, Object obj) {
        this.f4575c.setTag(i7, obj);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.f4575c.toggle();
    }
}
