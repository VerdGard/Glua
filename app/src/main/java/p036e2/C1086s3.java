package p036e2;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.ext.Tools;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p198z0.C2274b;

/* renamed from: e2.s3 */
/* loaded from: classes.dex */
public final class C1086s3 {

    /* renamed from: e2.s3$a */
    public static class a implements Comparator<View> {
        @Override // java.util.Comparator
        public final int compare(View view, View view2) {
            return view.getLeft() - view2.getLeft();
        }
    }

    /* renamed from: A */
    public static Map<String, String> m3184A(View view) {
        Map<String, String> map;
        Object tag = view.getTag(-96000);
        if (tag != null && (tag instanceof Map)) {
            try {
                map = (Map) tag;
            } catch (Exception unused) {
                map = null;
            }
            if (map != null && map.size() != 0) {
                return map;
            }
        }
        return null;
    }

    /* renamed from: B */
    public static String m3185B(View view) {
        if (view == null) {
            return "";
        }
        Class<?> cls = view.getClass();
        String m3197h = m3197h(cls, true);
        if (!TextUtils.isEmpty(m3197h) && cls.isAnonymousClass()) {
            m3197h = m3197h.concat("$");
        }
        return m3197h == null ? "" : m3197h;
    }

    /* renamed from: C */
    public static boolean m3186C(View view) {
        Class<RecyclerView> cls;
        if (view == null) {
            return false;
        }
        if ((view instanceof ListView) || (view instanceof GridView)) {
            return true;
        }
        String m3196g = m3196g(view.getClass());
        if ("android.widget".equals(m3196g) || "android.view".equals(m3196g)) {
            return false;
        }
        try {
            cls = RecyclerView.class;
            int[] iArr = RecyclerView.f2100J2;
        } catch (Exception unused) {
            cls = null;
        }
        return cls != null && cls.isAssignableFrom(view.getClass());
    }

    /* renamed from: D */
    public static boolean m3187D(View view) {
        Class<RecyclerView> cls;
        String m3196g = m3196g(view.getClass());
        if (!"android.widget".equals(m3196g) && !"android.view".equals(m3196g)) {
            try {
                cls = RecyclerView.class;
                int[] iArr = RecyclerView.f2100J2;
            } catch (Exception unused) {
                cls = null;
            }
            if (cls != null && cls.isAssignableFrom(view.getClass())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: E */
    public static boolean m3188E(View view) {
        Object tag = view.getTag(-97001);
        return tag != null && (tag instanceof String);
    }

    /* renamed from: F */
    public static boolean m3189F(View view) {
        return view != null && "com.android.internal.policy".equals(m3196g(view.getClass())) && "DecorView".equals(m3185B(view));
    }

    /* renamed from: a */
    public static View m3190a(Activity activity) {
        Window window;
        if (activity == null || (window = activity.getWindow()) == null) {
            return null;
        }
        return window.getDecorView();
    }

    /* renamed from: b */
    public static View m3191b(Activity activity, View view) {
        View view2;
        if (view == null) {
            return null;
        }
        try {
            view2 = m3190a(activity);
        } catch (Exception unused) {
            view2 = null;
        }
        if (view2 == null) {
            return null;
        }
        while (view != null && view != view2 && view.getParent() != null && (view.getParent() instanceof View)) {
            View view3 = (View) view.getParent();
            if (m3186C(view3)) {
                return view;
            }
            view = view3;
        }
        return null;
    }

    /* renamed from: c */
    public static String m3192c(Context context) {
        ResolveInfo resolveInfo;
        ActivityInfo activityInfo;
        if (context == null) {
            return "";
        }
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return "";
        }
        try {
            resolveInfo = packageManager.resolveActivity(intent, 0);
        } catch (Exception unused) {
            resolveInfo = null;
        }
        if (resolveInfo == null || (activityInfo = resolveInfo.activityInfo) == null) {
            return "";
        }
        String str = activityInfo.packageName;
        return ("android".equals(str) || TextUtils.isEmpty(str)) ? "" : str;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: d */
    public static String m3193d(View view) {
        CharSequence text;
        String str = "";
        if (view == null) {
            return "";
        }
        if (view instanceof TextView) {
            if (!(view instanceof EditText) && (text = ((TextView) view).getText()) != null) {
                str = text.toString();
            }
            if (view instanceof Switch) {
                Switch r32 = (Switch) view;
                CharSequence textOn = r32.isChecked() ? r32.getTextOn() : r32.getTextOff();
                if (textOn != null) {
                    str = textOn.toString();
                }
            }
        } else if (view instanceof Spinner) {
            Spinner spinner = (Spinner) view;
            Object selectedItem = spinner.getSelectedItem();
            if (selectedItem == null || !(selectedItem instanceof String)) {
                return m3193d(spinner.getSelectedView());
            }
            str = (String) selectedItem;
        }
        byte[] bytes = str.getBytes();
        return bytes.length > 4096 ? new String(Arrays.copyOf(bytes, 4096)) : str;
    }

    /* renamed from: e */
    public static String m3194e(View view, View view2) {
        if (view != null && view != view2) {
            ViewParent parent = view.getParent();
            if (parent == null || !(parent instanceof ViewGroup)) {
                return String.valueOf(0);
            }
            String m3202m = m3202m(view.getClass());
            if (TextUtils.isEmpty(m3202m)) {
                return String.valueOf(0);
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            int i7 = 0;
            for (int i8 = 0; i8 < viewGroup.getChildCount(); i8++) {
                View childAt = viewGroup.getChildAt(i8);
                if (childAt != null) {
                    if (childAt == view) {
                        break;
                    }
                    if (m3202m.equals(m3202m(childAt.getClass()))) {
                        i7++;
                    }
                }
            }
            return String.valueOf(i7);
        }
        return String.valueOf(0);
    }

    /* renamed from: f */
    public static String m3195f(View view, String str) {
        Object parent;
        int m1569c;
        AdapterView adapterView;
        if (TextUtils.isEmpty(str) || view == null || (parent = view.getParent()) == null || !(parent instanceof View)) {
            return "";
        }
        View view2 = (View) parent;
        try {
            if (ListView.class.getSimpleName().equals(str)) {
                if (!(view2 instanceof ListView) || view.getParent() == null) {
                    return "";
                }
                adapterView = (ListView) view2;
            } else {
                if (!GridView.class.getSimpleName().equals(str)) {
                    if (!"RecyclerView".equals(str)) {
                        return "";
                    }
                    RecyclerView.AbstractC0432a0 m1513I = RecyclerView.m1513I(view);
                    m1569c = m1513I != null ? m1513I.m1569c() : -1;
                    return String.valueOf(m1569c);
                }
                if (!(view2 instanceof GridView) || view.getParent() == null) {
                    return "";
                }
                adapterView = (GridView) view2;
            }
            m1569c = adapterView.getPositionForView(view);
            return String.valueOf(m1569c);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: g */
    public static String m3196g(Class<?> cls) {
        if (cls == null) {
            return "";
        }
        Package r12 = cls.getPackage();
        String name = r12 != null ? r12.getName() : "";
        return name == null ? "" : name;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:?, code lost:
    
        return r1.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001b, code lost:
    
        if (r2 != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
    
        if (r2 != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        return r1.getSimpleName();
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m3197h(java.lang.Class<?> r1, boolean r2) {
        /*
            boolean r0 = r1.isAnonymousClass()
            if (r0 == 0) goto L1b
            java.lang.Class r1 = r1.getSuperclass()
            if (r1 == 0) goto L18
            if (r2 == 0) goto L13
        Le:
            java.lang.String r1 = r1.getSimpleName()
            goto L1e
        L13:
            java.lang.String r1 = r1.getName()
            goto L1e
        L18:
            java.lang.String r1 = ""
            goto L1e
        L1b:
            if (r2 == 0) goto L13
            goto Le
        L1e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p036e2.C1086s3.m3197h(java.lang.Class, boolean):java.lang.String");
    }

    /* renamed from: i */
    public static JSONArray m3198i(Activity activity, View view) {
        View view2;
        JSONArray jSONArray = new JSONArray();
        if (view == null) {
            return jSONArray;
        }
        try {
            view2 = m3190a(activity);
        } catch (Exception unused) {
            view2 = null;
        }
        if (view2 == null) {
            return jSONArray;
        }
        while (true) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("p", m3185B(view));
                String m3205p = m3205p(view);
                if (TextUtils.isEmpty(m3205p)) {
                    String str = "";
                    Object parent = view.getParent();
                    if (parent != null && (parent instanceof View)) {
                        str = m3201l((View) parent);
                    }
                    m3205p = m3195f(view, str);
                    if (TextUtils.isEmpty(m3205p)) {
                        m3205p = m3194e(view, view2);
                    }
                }
                jSONObject.put("i", m3205p);
                jSONObject.put("t", m3201l(view));
                jSONArray.put(jSONObject);
                Object parent2 = view.getParent();
                if (parent2 == null || view == view2 || !(parent2 instanceof View) || m3189F(view) || jSONArray.length() > 1000) {
                    break;
                }
                view = (View) parent2;
            } catch (Exception unused2) {
                jSONArray = new JSONArray();
            }
        }
        JSONArray jSONArray2 = new JSONArray();
        try {
            int length = jSONArray.length();
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                jSONArray2.put(jSONArray.get(length));
            }
        } catch (Exception unused3) {
        }
        return jSONArray2;
    }

    /* renamed from: j */
    public static void m3199j(View view, LinkedHashMap<View, Integer> linkedHashMap) {
        if (view == null) {
            return;
        }
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            if (textView.getVisibility() == 0) {
                linkedHashMap.put(view, Integer.valueOf((int) (textView.getTextSize() * 10.0f)));
                return;
            }
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                m3199j(viewGroup.getChildAt(i7), linkedHashMap);
            }
        }
    }

    /* renamed from: k */
    public static String m3200k(View view) {
        String sb;
        if (view instanceof TextView) {
            CharSequence text = ((TextView) view).getText();
            if (text != null) {
                sb = text.toString();
            }
            sb = null;
        } else {
            if (view instanceof ViewGroup) {
                StringBuilder sb2 = new StringBuilder();
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                boolean z6 = false;
                for (int i7 = 0; i7 < childCount && sb2.length() < 128; i7++) {
                    String m3200k = m3200k(viewGroup.getChildAt(i7));
                    if (m3200k != null && m3200k.length() > 0) {
                        if (z6) {
                            sb2.append("| ");
                        }
                        sb2.append(m3200k);
                        z6 = true;
                    }
                }
                if (sb2.length() > 4096) {
                    sb = sb2.substring(0, 4096);
                } else if (z6) {
                    sb = sb2.toString();
                }
            }
            sb = null;
        }
        return TextUtils.isEmpty(sb) ? "" : sb;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m3201l(android.view.View r3) {
        /*
            boolean r0 = r3 instanceof android.widget.ListView
            if (r0 == 0) goto Lb
            java.lang.Class<android.widget.ListView> r0 = android.widget.ListView.class
        L6:
            java.lang.String r0 = r0.getSimpleName()
            goto L14
        Lb:
            boolean r0 = r3 instanceof android.webkit.WebView
            if (r0 == 0) goto L12
            java.lang.Class<android.webkit.WebView> r0 = android.webkit.WebView.class
            goto L6
        L12:
            java.lang.String r0 = ""
        L14:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L46
            java.lang.Class r1 = r3.getClass()
            java.lang.String r1 = m3196g(r1)
            java.lang.String r2 = "android.widget"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L46
            java.lang.String r2 = "android.view"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L46
            java.lang.Class<androidx.recyclerview.widget.RecyclerView> r1 = androidx.recyclerview.widget.RecyclerView.class
            int[] r2 = androidx.recyclerview.widget.RecyclerView.f2100J2     // Catch: java.lang.Exception -> L37
            goto L38
        L37:
            r1 = 0
        L38:
            if (r1 == 0) goto L46
            java.lang.Class r2 = r3.getClass()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L46
            java.lang.String r0 = "RecyclerView"
        L46:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L54
            java.lang.Class r3 = r3.getClass()
            java.lang.String r0 = m3207r(r3)
        L54:
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L5c
            java.lang.String r0 = "Object"
        L5c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p036e2.C1086s3.m3201l(android.view.View):java.lang.String");
    }

    /* renamed from: m */
    public static String m3202m(Class<?> cls) {
        String m3197h = m3197h(cls, false);
        if (!TextUtils.isEmpty(m3197h) && cls.isAnonymousClass()) {
            m3197h = m3197h.concat("$");
        }
        return m3197h == null ? "" : m3197h;
    }

    /* renamed from: n */
    public static HashMap m3203n(View view, boolean z6) {
        View view2;
        HashMap hashMap = new HashMap();
        if (view == null) {
            return hashMap;
        }
        Object tag = view.getTag(-97003);
        String str = (tag == null || !(tag instanceof String)) ? "" : (String) tag;
        HashMap hashMap2 = new HashMap();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        m3199j(view, linkedHashMap);
        StringBuilder sb = new StringBuilder();
        if (linkedHashMap.size() != 0) {
            ArrayList arrayList = new ArrayList(linkedHashMap.entrySet());
            Iterator it = arrayList.iterator();
            int i7 = 0;
            boolean z7 = false;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                int intValue = ((Integer) entry.getValue()).intValue();
                if (intValue > i7) {
                    i7 = intValue;
                }
                View view3 = (View) entry.getKey();
                if (view3 != null && (view3 instanceof TextView)) {
                    CharSequence text = ((TextView) view3).getText();
                    String charSequence = text != null ? text.toString() : "";
                    if (!TextUtils.isEmpty(charSequence)) {
                        if (!TextUtils.isEmpty(sb.toString())) {
                            sb.append("_");
                        }
                        sb.append(charSequence);
                        if (!z6 || charSequence.contains("广告")) {
                            z7 = true;
                        }
                    }
                }
            }
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(sb2) && z7) {
                if (sb2.length() > 256) {
                    sb2 = sb2.substring(0, Tools.Semaphore.f160S8);
                }
                hashMap2.put("content", sb2);
            }
            StringBuilder sb3 = new StringBuilder();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it2.next();
                if (((Integer) entry2.getValue()).intValue() >= i7 && (view2 = (View) entry2.getKey()) != null && (view2 instanceof TextView)) {
                    CharSequence text2 = ((TextView) view2).getText();
                    String charSequence2 = text2 != null ? text2.toString() : "";
                    if (!TextUtils.isEmpty(charSequence2)) {
                        if (!TextUtils.isEmpty(sb3.toString())) {
                            sb3.append("_");
                        }
                        sb3.append(charSequence2);
                    }
                }
            }
            String sb4 = sb3.toString();
            if (!TextUtils.isEmpty(sb4)) {
                if (sb4.length() > 256) {
                    sb4 = sb4.substring(0, Tools.Semaphore.f160S8);
                }
                hashMap2.put("title", sb4);
            }
        }
        if (TextUtils.isEmpty(str)) {
            hashMap.put("title", hashMap2.get("title"));
        } else {
            hashMap.put("title", str);
        }
        hashMap.put("content", hashMap2.get("content"));
        return hashMap;
    }

    /* renamed from: o */
    public static boolean m3204o(View view, String str) {
        return "ListView".equals(str) || "RecyclerView".equals(str) || "GridView".equals(str) || view.isClickable();
    }

    /* renamed from: p */
    public static String m3205p(View view) {
        ViewParent parent;
        Class<C2274b> cls;
        int currentItem;
        if (view == null || (parent = view.getParent()) == null || !(parent instanceof ViewGroup)) {
            return "";
        }
        String m3196g = m3196g(parent.getClass());
        if ("android.widget".equals(m3196g) || "android.view".equals(m3196g)) {
            return "";
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        try {
            cls = C2274b.class;
            int[] iArr = C2274b.f10374n2;
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls == null || !cls.isAssignableFrom(viewGroup.getClass())) {
            return "";
        }
        try {
            C2274b c2274b = (C2274b) viewGroup;
            ArrayList arrayList = new ArrayList();
            int childCount = c2274b.getChildCount();
            int i7 = 0;
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = c2274b.getChildAt(i8);
                arrayList.add(childAt);
                if (m3212w(childAt) != null) {
                    i7++;
                }
            }
            if (arrayList.size() < 2 || i7 < 2) {
                currentItem = c2274b.getCurrentItem();
            } else {
                try {
                    Collections.sort(arrayList, new a());
                } catch (Exception unused2) {
                }
                currentItem = view.getLeft() / Math.abs(((View) arrayList.get(1)).getLeft() - ((View) arrayList.get(0)).getLeft());
                int mo4299c = c2274b.getAdapter().mo4299c();
                if (mo4299c != 0) {
                    currentItem %= mo4299c;
                }
            }
            return String.valueOf(currentItem);
        } catch (Throwable unused3) {
            return "";
        }
    }

    /* renamed from: q */
    public static String m3206q(View view, String str) {
        Object tag = view.getTag(-97001);
        String str2 = (tag == null || !(tag instanceof String)) ? "" : (String) tag;
        return (str == null || !TextUtils.isEmpty(str2)) ? str2 : str;
    }

    /* renamed from: r */
    public static String m3207r(Class<?> cls) {
        if (cls == null) {
            return "";
        }
        String m3196g = m3196g(cls);
        return ("android.widget".equals(m3196g) || "android.view".equals(m3196g)) ? m3197h(cls, true) : m3207r(cls.getSuperclass());
    }

    /* renamed from: s */
    public static String m3208s(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
            try {
                JSONObject jSONObject = (JSONObject) jSONArray.get(i7);
                String string = jSONObject.getString("p");
                String str = C0988e3.f5039b.f5040a.get(string);
                if (TextUtils.isEmpty(str)) {
                    str = C1092t2.f5443g.m3220a(0, string);
                }
                if (str == null) {
                    str = "";
                }
                sb.append("/" + str + "[" + jSONObject.getString("i") + "]");
            } catch (Exception unused) {
                return "";
            }
        }
        return sb.toString();
    }

    /* renamed from: t */
    public static boolean m3209t(Activity activity, View view) {
        View m3190a;
        return (view == null || (m3190a = m3190a(activity)) == null || !m3189F(view) || m3190a == view) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0020, code lost:
    
        if (r1 == null) goto L16;
     */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] m3210u(android.graphics.Bitmap r4) {
        /*
            r0 = 0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L17 java.lang.Exception -> L1e
            r1.<init>()     // Catch: java.lang.Throwable -> L17 java.lang.Exception -> L1e
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L15
            r3 = 100
            r4.compress(r2, r3, r1)     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L15
            byte[] r0 = r1.toByteArray()     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L15
            goto L22
        L12:
            r4 = move-exception
            r0 = r1
            goto L18
        L15:
            goto L20
        L17:
            r4 = move-exception
        L18:
            if (r0 == 0) goto L1d
            r0.close()     // Catch: java.lang.Exception -> L1d
        L1d:
            throw r4
        L1e:
            r1 = r0
        L20:
            if (r1 == 0) goto L25
        L22:
            r1.close()     // Catch: java.lang.Exception -> L25
        L25:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p036e2.C1086s3.m3210u(android.graphics.Bitmap):byte[]");
    }

    /* renamed from: v */
    public static boolean m3211v(View view) {
        if (view.getVisibility() != 0) {
            return false;
        }
        try {
            return view.getGlobalVisibleRect(new Rect());
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: w */
    public static Rect m3212w(View view) {
        boolean z6;
        if (view.getVisibility() != 0) {
            return null;
        }
        Rect rect = new Rect();
        try {
            z6 = view.getGlobalVisibleRect(rect);
        } catch (Exception unused) {
            z6 = false;
        }
        if (z6 && rect.right > rect.left && rect.bottom > rect.top) {
            return rect;
        }
        return null;
    }

    /* renamed from: x */
    public static String m3213x(Activity activity) {
        if (activity == null) {
            return "";
        }
        String name = activity.getClass().getName();
        return !TextUtils.isEmpty(name) ? name : "";
    }

    /* renamed from: y */
    public static String m3214y(View view) {
        int lastIndexOf;
        int i7;
        String str = null;
        try {
            if (view.getId() != 0) {
                str = view.getResources().getResourceName(view.getId());
            }
        } catch (Exception unused) {
        }
        if (!TextUtils.isEmpty(str) && str.contains(":id/") && (lastIndexOf = str.lastIndexOf(":id/")) != -1 && (i7 = lastIndexOf + 4) < str.length()) {
            str = str.substring(i7);
        }
        return str == null ? "" : str;
    }

    /* renamed from: z */
    public static String m3215z(Activity activity) {
        if (activity == null) {
            return "";
        }
        String callingPackage = activity.getCallingPackage();
        if (!TextUtils.isEmpty(callingPackage)) {
            return callingPackage;
        }
        Intent intent = activity.getIntent();
        Uri uri = null;
        if (intent != null) {
            int i7 = Build.VERSION.SDK_INT;
            Uri uri2 = (Uri) intent.getParcelableExtra("android.intent.extra.REFERRER");
            if (uri2 != null) {
                uri = uri2;
            } else {
                if (i7 >= 22) {
                    String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                    if (!TextUtils.isEmpty(stringExtra)) {
                        uri = Uri.parse(stringExtra);
                    }
                }
                if (i7 >= 22) {
                    uri = activity.getReferrer();
                }
            }
        }
        if (uri == null) {
            return "";
        }
        String host = uri.getHost();
        return !TextUtils.isEmpty(host) ? host : "";
    }
}
