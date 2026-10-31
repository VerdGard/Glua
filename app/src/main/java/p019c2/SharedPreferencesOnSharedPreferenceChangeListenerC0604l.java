package p019c2;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Environment;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: c2.l */
/* loaded from: classes.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC0604l implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: d */
    public static final String f3008d = TextUtils.join("\n", new String[]{"{", "}", "[", "]", ",", "\"\"", "(", ")", "~", "#", "=", ":", "&", "-", "_", "\\n"});

    /* renamed from: e */
    public static SharedPreferencesOnSharedPreferenceChangeListenerC0604l f3009e;

    /* renamed from: a */
    public final SharedPreferences f3010a;

    /* renamed from: b */
    public final HashMap f3011b;

    /* renamed from: c */
    public final WeakHashMap<SharedPreferences.OnSharedPreferenceChangeListener, Object> f3012c = new WeakHashMap<>();

    public SharedPreferencesOnSharedPreferenceChangeListenerC0604l(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        this.f3010a = defaultSharedPreferences;
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
        HashMap hashMap = new HashMap();
        this.f3011b = hashMap;
        hashMap.put("pref_font_size", 13);
        hashMap.put("pref_cursor_width", 2);
        Boolean bool = Boolean.FALSE;
        hashMap.put("pref_touch_to_adjust_text_size", bool);
        Boolean bool2 = Boolean.TRUE;
        hashMap.put("pref_word_wrap", bool2);
        hashMap.put("pref_show_linenumber", bool2);
        hashMap.put("pref_show_whitespace", bool2);
        hashMap.put("pref_auto_indent", bool2);
        hashMap.put("pref_insert_space_for_tab", bool2);
        hashMap.put("pref_tab_size", 4);
        hashMap.put("pref_symbol", f3008d);
        hashMap.put("pref_auto_capitalize", bool2);
        hashMap.put("pref_enable_highlight", bool2);
        hashMap.put("pref_highlight_file_size_limit", 800);
        hashMap.put("pref_current_theme", 2);
        hashMap.put("pref_auto_save", bool);
        hashMap.put("pref_enable_root", bool2);
        hashMap.put("pref_remember_last_opened_files", bool2);
        hashMap.put("pref_screen_orientation", "auto");
        hashMap.put("pref_keep_screen_on", bool);
        hashMap.put("pref_auto_check_updates", bool2);
        hashMap.put("pref_keep_backup_file", bool2);
        hashMap.put("pref_enable_drawers", bool);
        defaultSharedPreferences.getStringSet("pref_toolbar_icons", null);
        hashMap.put("last_open_path2", Environment.getExternalStorageDirectory().getPath());
        hashMap.put("readonly_mode", bool);
        hashMap.put("show_hidden_files", bool);
        hashMap.put("show_file_sort", 0);
        hashMap.put("fullscreen_mode", bool);
        hashMap.put("last_tab", 0);
        Map<String, ?> all = defaultSharedPreferences.getAll();
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            m2047a((String) it.next(), all);
        }
    }

    /* renamed from: a */
    public final void m2047a(String str, Map<String, ?> map) {
        Object obj;
        int i7;
        HashMap hashMap = this.f3011b;
        Object obj2 = hashMap.get(str);
        if (obj2 == null) {
            return;
        }
        Class<?> cls = obj2.getClass();
        try {
            if (cls != Integer.TYPE && cls != Integer.class) {
                if (cls != Boolean.TYPE && cls != Boolean.class) {
                    obj = (String) map.get(str);
                    if (obj == null) {
                        obj = (String) obj2;
                    }
                    hashMap.put(str, obj);
                }
                Boolean bool = (Boolean) map.get(str);
                obj = Boolean.valueOf(bool == null ? ((Boolean) obj2).booleanValue() : bool.booleanValue());
                hashMap.put(str, obj);
            }
            Object obj3 = map.get(str);
            if (obj3 != null) {
                if (obj3 instanceof Integer) {
                    i7 = ((Integer) obj3).intValue();
                } else {
                    try {
                        i7 = Integer.parseInt(String.valueOf(obj3));
                    } catch (Exception unused) {
                        i7 = 0;
                    }
                }
                obj2 = Integer.valueOf(i7);
            }
            obj = obj2;
            hashMap.put(str, obj);
        } catch (Exception e7) {
            Log.e("JecLog", "key = " + str, e7);
            Log.getStackTraceString(e7);
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        m2047a(str, sharedPreferences.getAll());
        for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : this.f3012c.keySet()) {
            if (onSharedPreferenceChangeListener != null) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(sharedPreferences, str);
            }
        }
    }
}
