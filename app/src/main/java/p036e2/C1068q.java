package p036e2;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: e2.q */
/* loaded from: classes.dex */
public final class C1068q {
    public C1068q() {
        new HashMap();
    }

    /* renamed from: a */
    public static void m3160a(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray;
        JSONArray jSONArray = new JSONArray();
        JSONArray optJSONArray2 = jSONObject.optJSONArray("point");
        if (optJSONArray2 != null && optJSONArray2.length() != 0) {
            for (int i7 = 0; i7 < optJSONArray2.length(); i7++) {
                try {
                    jSONArray.put(optJSONArray2.getJSONObject(i7));
                } catch (Exception unused) {
                }
            }
        }
        if (jSONArray.length() < 10 && (optJSONArray = jSONObject2.optJSONArray("point")) != null && optJSONArray.length() != 0) {
            for (int i8 = 0; i8 < optJSONArray.length(); i8++) {
                try {
                    jSONArray.put(optJSONArray.getJSONObject(i8));
                } catch (Exception unused2) {
                }
            }
        }
        if (jSONArray.length() != 0) {
            try {
                jSONObject.put("point", jSONArray);
            } catch (Exception unused3) {
            }
        }
    }

    /* renamed from: b */
    public static boolean m3161b(String str, String str2) {
        if (TextUtils.isEmpty(str) || new JSONObject().toString().equals(str)) {
            return (TextUtils.isEmpty(str2) || new JSONArray().toString().equals(str2)) ? false : true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:175:0x027e, code lost:
    
        if (r2.equalsIgnoreCase(r53) != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x021b, code lost:
    
        if (r49.toString().equals(r36.toString()) != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x01fa, code lost:
    
        if (r31.toString().equals(r40.toString()) != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x00eb, code lost:
    
        if (r4.equals("") != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0226  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m3162c(org.json.JSONArray r72, org.json.JSONObject r73) {
        /*
            Method dump skipped, instructions count: 1296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p036e2.C1068q.m3162c(org.json.JSONArray, org.json.JSONObject):void");
    }

    /* renamed from: d */
    public static JSONObject m3163d(long j7, String str, String str2, int i7, long j8, long j9, JSONArray jSONArray, JSONArray jSONArray2, String str3, String str4, String str5, int i8, Map map, boolean z6) {
        return m3164e(j7, str, str2, "", i7, j8, j9, jSONArray, jSONArray2, str3, str4, str5, i8, map, "", "", z6, null, "", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009f A[SYNTHETIC] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject m3164e(long r12, java.lang.String r14, java.lang.String r15, java.lang.String r16, int r17, long r18, long r20, org.json.JSONArray r22, org.json.JSONArray r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, int r27, java.util.Map r28, java.lang.String r29, java.lang.String r30, boolean r31, org.json.JSONObject r32, java.lang.String r33, org.json.JSONArray r34) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p036e2.C1068q.m3164e(long, java.lang.String, java.lang.String, java.lang.String, int, long, long, org.json.JSONArray, org.json.JSONArray, java.lang.String, java.lang.String, java.lang.String, int, java.util.Map, java.lang.String, java.lang.String, boolean, org.json.JSONObject, java.lang.String, org.json.JSONArray):org.json.JSONObject");
    }
}
