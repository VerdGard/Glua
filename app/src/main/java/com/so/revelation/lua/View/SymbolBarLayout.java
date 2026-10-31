package com.so.revelation.lua.View;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.so.revelation.lua.R;
import p019c2.SharedPreferencesOnSharedPreferenceChangeListenerC0604l;
import p131q3.C1749e;
import p168v1.AbstractApplicationC2012b;

/* loaded from: classes.dex */
public class SymbolBarLayout extends C1749e implements View.OnClickListener {

    /* renamed from: w1 */
    public static String[] f3496w1;

    /* renamed from: com.so.revelation.lua.View.SymbolBarLayout$a */
    public interface InterfaceC0703a {
    }

    public SymbolBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        removeAllViews();
        Context context2 = getContext();
        if (SharedPreferencesOnSharedPreferenceChangeListenerC0604l.f3009e == null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC0604l.f3009e = new SharedPreferencesOnSharedPreferenceChangeListenerC0604l(context2.getApplicationContext());
        }
        f3496w1 = TextUtils.split((String) SharedPreferencesOnSharedPreferenceChangeListenerC0604l.f3009e.f3011b.get("pref_symbol"), "\n");
        Context context3 = getContext();
        String[] strArr = f3496w1;
        if (strArr == null || strArr.length == 0) {
            return;
        }
        SharedPreferences sharedPreferences = AbstractApplicationC2012b.f9161c.getSharedPreferences("data", 0);
        LayoutInflater from = LayoutInflater.from(context3);
        for (String str : f3496w1) {
            TextView textView = (TextView) from.inflate(R.layout.symbol_item, (ViewGroup) this, false);
            textView.setBackgroundColor(sharedPreferences.getInt("iv1", 0));
            textView.setTextColor(sharedPreferences.getInt("iv2", 0));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((str.length() * 20) + 80, 110);
            textView.setText(str);
            textView.setLayoutParams(new LinearLayout.LayoutParams(layoutParams));
            textView.setOnClickListener(this);
            addView(textView);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
    }

    public void setOnSymbolCharClickListener(InterfaceC0703a interfaceC0703a) {
    }
}
