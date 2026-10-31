package com.so.revelation.lua.Baidu;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class TransApi {
    private static final String TRANS_API_HOST = "http://api.fanyi.baidu.com/api/trans/vip/translate";
    private String appid = "20220208001076983";
    private String securityKey = "EIFm02qH4slP_TSImIE2";

    private Map<String, String> buildParams(String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("q", str);
        hashMap.put("from", str2);
        hashMap.put("to", str3);
        hashMap.put("appid", this.appid);
        String valueOf = String.valueOf(System.currentTimeMillis());
        hashMap.put("salt", valueOf);
        hashMap.put("sign", MD5.md5(this.appid + str + valueOf + this.securityKey));
        return hashMap;
    }

    public String getTransResult(String str, String str2, String str3) {
        return HttpGet.get(TRANS_API_HOST, buildParams(str, str2, str3));
    }
}
