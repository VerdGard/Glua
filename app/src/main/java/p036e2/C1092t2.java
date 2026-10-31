package p036e2;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: e2.t2 */
/* loaded from: classes.dex */
public final class C1092t2 {

    /* renamed from: g */
    public static final C1092t2 f5443g = new C1092t2();

    /* renamed from: a */
    public final HashMap<String, String> f5444a = new HashMap<>();

    /* renamed from: b */
    public final HashMap<Character, Integer> f5445b = new HashMap<>();

    /* renamed from: c */
    public final HashMap<String, String> f5446c = new HashMap<>();

    /* renamed from: d */
    public final HashMap<Character, Integer> f5447d = new HashMap<>();

    /* renamed from: e */
    public final HashMap<String, String> f5448e = new HashMap<>();

    /* renamed from: f */
    public final HashMap<Character, Integer> f5449f = new HashMap<>();

    /* renamed from: e2.t2$a */
    public class a implements Comparator<Map.Entry<String, String>> {
        @Override // java.util.Comparator
        public final int compare(Map.Entry<String, String> entry, Map.Entry<String, String> entry2) {
            return entry.getValue().compareTo(entry2.getValue());
        }
    }

    /* renamed from: c */
    public static void m3219c(String str, HashMap hashMap, HashMap hashMap2) {
        char lowerCase = Character.toLowerCase(str.charAt(0));
        Integer num = (Integer) hashMap.get(Character.valueOf(lowerCase));
        int intValue = num != null ? num.intValue() + 1 : 0;
        String str2 = Character.toString(lowerCase) + intValue;
        hashMap.put(Character.valueOf(lowerCase), Integer.valueOf(intValue));
        hashMap2.put(str, str2);
    }

    /* renamed from: a */
    public final String m3220a(int i7, String str) {
        HashMap<String, String> hashMap;
        HashMap<Character, Integer> hashMap2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (i7 == 0) {
            hashMap = this.f5444a;
            String str2 = hashMap.get(str);
            if (!TextUtils.isEmpty(str2)) {
                return str2;
            }
            hashMap2 = this.f5445b;
        } else if (i7 == 2) {
            hashMap = this.f5448e;
            String str3 = hashMap.get(str);
            if (!TextUtils.isEmpty(str3)) {
                return str3;
            }
            hashMap2 = this.f5449f;
        } else {
            hashMap = this.f5446c;
            String str4 = hashMap.get(str);
            if (!TextUtils.isEmpty(str4)) {
                return str4;
            }
            hashMap2 = this.f5447d;
        }
        m3219c(str, hashMap2, hashMap);
        return hashMap.get(str);
    }

    /* renamed from: b */
    public final JSONObject m3221b(int i7) {
        HashMap<String, String> hashMap = i7 == 0 ? this.f5444a : i7 == 2 ? this.f5448e : this.f5446c;
        JSONObject jSONObject = new JSONObject();
        if (hashMap == null) {
            return jSONObject;
        }
        ArrayList arrayList = new ArrayList(hashMap.entrySet());
        try {
            Collections.sort(arrayList, new a());
        } catch (Exception unused) {
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            try {
                jSONObject.put((String) entry.getValue(), (String) entry.getKey());
            } catch (Exception unused2) {
            }
        }
        return jSONObject;
    }

    /* renamed from: d */
    public final void m3222d(int i7) {
        HashMap<String, String> hashMap;
        if (i7 == 0) {
            this.f5445b.clear();
            hashMap = this.f5444a;
        } else if (i7 == 2) {
            this.f5449f.clear();
            hashMap = this.f5448e;
        } else {
            this.f5447d.clear();
            hashMap = this.f5446c;
        }
        hashMap.clear();
    }
}
