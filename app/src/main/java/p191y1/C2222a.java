package p191y1;

import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: y1.a */
/* loaded from: classes.dex */
public class C2222a {

    /* renamed from: a */
    public HashMap<String, Integer> f10060a = new HashMap<>(0);

    /* renamed from: b */
    public HashMap<String, Integer> f10061b = new HashMap<>(0);

    /* renamed from: c */
    public final HashMap<String, String[]> f10062c = new HashMap<>(0);

    /* renamed from: d */
    public String[] f10063d;

    public C2222a() {
        char[] cArr = {'(', ')', '{', '}', '.', ',', ';', '=', '+', '-', '/', '*', '&', '!', '|', ':', '[', ']', '<', '>', '?', '~', '%', '^'};
        new HashMap(0);
        HashMap hashMap = new HashMap(24);
        for (int i7 = 0; i7 < 24; i7++) {
            hashMap.put(Character.valueOf(cArr[i7]), 2);
        }
        new ArrayList();
    }

    /* renamed from: k */
    public final void m5401k(String[] strArr, String str) {
        this.f10062c.put(str, strArr);
    }
}
