package p142r6;

import androidx.activity.C0143v;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import p134q6.C1806b;
import p142r6.C1850g;
import p160u0.C1966c;

/* renamed from: r6.a */
/* loaded from: classes.dex */
public class C1844a implements Map.Entry<String, String>, Cloneable {

    /* renamed from: s */
    public static final String[] f8316s = {"allowfullscreen", "async", "autofocus", "checked", "compact", "declare", "default", "defer", "disabled", "formnovalidate", "hidden", "inert", "ismap", "itemscope", "multiple", "muted", "nohref", "noresize", "noshade", "novalidate", "nowrap", "open", "readonly", "required", "reversed", "seamless", "selected", "sortable", "truespeed", "typemustmatch"};

    /* renamed from: c */
    public final String f8317c;

    /* renamed from: e */
    public String f8318e;

    /* renamed from: m */
    public C1845b f8319m;

    public C1844a(String str, String str2, C1845b c1845b) {
        C0143v.m423U(str);
        String trim = str.trim();
        C0143v.m421S(trim);
        this.f8317c = trim;
        this.f8318e = str2;
        this.f8319m = c1845b;
    }

    /* renamed from: a */
    public static boolean m4334a(String str, String str2, C1850g.a aVar) {
        if (aVar.f8331Z == 1) {
            if (str2 == null) {
                return true;
            }
            if ("".equals(str2) || str2.equalsIgnoreCase(str)) {
                if (Arrays.binarySearch(f8316s, str) >= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Object clone() {
        try {
            return (C1844a) super.clone();
        } catch (CloneNotSupportedException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1844a c1844a = (C1844a) obj;
        String str = c1844a.f8317c;
        String str2 = this.f8317c;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        String str3 = this.f8318e;
        String str4 = c1844a.f8318e;
        return str3 != null ? str3.equals(str4) : str4 == null;
    }

    @Override // java.util.Map.Entry
    public final String getKey() {
        return this.f8317c;
    }

    @Override // java.util.Map.Entry
    public final String getValue() {
        String str = this.f8318e;
        return str == null ? "" : str;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        String str = this.f8317c;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f8318e;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final String setValue(String str) {
        String str2 = str;
        String str3 = this.f8318e;
        C1845b c1845b = this.f8319m;
        if (c1845b != null) {
            String str4 = this.f8317c;
            String m4338d = c1845b.m4338d(str4);
            int m4341g = this.f8319m.m4341g(str4);
            if (m4341g != -1) {
                this.f8319m.f8323m[m4341g] = str2;
            }
            str3 = m4338d;
        }
        this.f8318e = str2;
        return str3 == null ? "" : str3;
    }

    public final String toString() {
        String str = "";
        StringBuilder m4257a = C1806b.m4257a();
        try {
            C1850g.a aVar = new C1850g("").f8326x1;
            String str2 = this.f8318e;
            String str3 = this.f8317c;
            m4257a.append((CharSequence) str3);
            if (!m4334a(str3, str2, aVar)) {
                m4257a.append((CharSequence) "=\"");
                if (str2 != null) {
                    str = str2;
                }
                C1853j.m4378b(m4257a, str, aVar, true, false);
                m4257a.append('\"');
            }
            return C1806b.m4263g(m4257a);
        } catch (IOException e7) {
            throw new C1966c(e7);
        }
    }
}
