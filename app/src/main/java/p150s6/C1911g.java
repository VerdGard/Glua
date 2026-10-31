package p150s6;

import androidx.activity.C0143v;
import java.util.HashMap;

/* renamed from: s6.g */
/* loaded from: classes.dex */
public final class C1911g {

    /* renamed from: k */
    public static final HashMap f8543k = new HashMap();

    /* renamed from: l */
    public static final String[] f8544l = {"object", "base", "font", "tt", "i", "b", "u", "big", "small", "em", "strong", "dfn", "code", "samp", "kbd", "var", "cite", "abbr", "time", "acronym", "mark", "ruby", "rt", "rp", "a", "img", "br", "wbr", "map", "q", "sub", "sup", "bdo", "iframe", "embed", "span", "input", "select", "textarea", "label", "button", "optgroup", "option", "legend", "datalist", "keygen", "output", "progress", "meter", "area", "param", "source", "track", "summary", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track", "data", "bdi", "s"};

    /* renamed from: m */
    public static final String[] f8545m = {"meta", "link", "base", "frame", "img", "br", "wbr", "embed", "hr", "input", "keygen", "col", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track"};

    /* renamed from: n */
    public static final String[] f8546n = {"title", "a", "p", "h1", "h2", "h3", "h4", "h5", "h6", "pre", "address", "li", "th", "td", "script", "style", "ins", "del", "s"};

    /* renamed from: o */
    public static final String[] f8547o = {"pre", "plaintext", "title", "textarea"};

    /* renamed from: p */
    public static final String[] f8548p = {"button", "fieldset", "input", "keygen", "object", "output", "select", "textarea"};

    /* renamed from: q */
    public static final String[] f8549q = {"input", "keygen", "object", "select", "textarea"};

    /* renamed from: a */
    public final String f8550a;

    /* renamed from: b */
    public final String f8551b;

    /* renamed from: c */
    public boolean f8552c = true;

    /* renamed from: d */
    public boolean f8553d = true;

    /* renamed from: e */
    public boolean f8554e = true;

    /* renamed from: f */
    public boolean f8555f = false;

    /* renamed from: g */
    public boolean f8556g = false;

    /* renamed from: h */
    public boolean f8557h = false;

    /* renamed from: i */
    public boolean f8558i = false;

    /* renamed from: j */
    public boolean f8559j = false;

    static {
        String[] strArr = {"html", "head", "body", "frameset", "script", "noscript", "style", "meta", "link", "title", "frame", "noframes", "section", "nav", "aside", "hgroup", "header", "footer", "p", "h1", "h2", "h3", "h4", "h5", "h6", "ul", "ol", "pre", "div", "blockquote", "hr", "address", "figure", "figcaption", "form", "fieldset", "ins", "del", "dl", "dt", "dd", "li", "table", "caption", "thead", "tfoot", "tbody", "colgroup", "col", "tr", "th", "td", "video", "audio", "canvas", "details", "menu", "plaintext", "template", "article", "main", "svg", "math", "center"};
        for (int i7 = 0; i7 < 64; i7++) {
            String str = strArr[i7];
            f8543k.put(str, new C1911g(str));
        }
        for (String str2 : f8544l) {
            C1911g c1911g = new C1911g(str2);
            c1911g.f8552c = false;
            c1911g.f8553d = false;
            f8543k.put(str2, c1911g);
        }
        for (String str3 : f8545m) {
            C1911g c1911g2 = (C1911g) f8543k.get(str3);
            C0143v.m423U(c1911g2);
            c1911g2.f8554e = false;
            c1911g2.f8555f = true;
        }
        for (String str4 : f8546n) {
            C1911g c1911g3 = (C1911g) f8543k.get(str4);
            C0143v.m423U(c1911g3);
            c1911g3.f8553d = false;
        }
        for (String str5 : f8547o) {
            C1911g c1911g4 = (C1911g) f8543k.get(str5);
            C0143v.m423U(c1911g4);
            c1911g4.f8557h = true;
        }
        for (String str6 : f8548p) {
            C1911g c1911g5 = (C1911g) f8543k.get(str6);
            C0143v.m423U(c1911g5);
            c1911g5.f8558i = true;
        }
        for (String str7 : f8549q) {
            C1911g c1911g6 = (C1911g) f8543k.get(str7);
            C0143v.m423U(c1911g6);
            c1911g6.f8559j = true;
        }
    }

    public C1911g(String str) {
        this.f8550a = str;
        this.f8551b = C0143v.m418P(str);
    }

    /* renamed from: a */
    public static C1911g m4491a(String str, C1909e c1909e) {
        C0143v.m423U(str);
        HashMap hashMap = f8543k;
        C1911g c1911g = (C1911g) hashMap.get(str);
        if (c1911g != null) {
            return c1911g;
        }
        String m4490a = c1909e.m4490a(str);
        C0143v.m421S(m4490a);
        C1911g c1911g2 = (C1911g) hashMap.get(m4490a);
        if (c1911g2 != null) {
            return c1911g2;
        }
        C1911g c1911g3 = new C1911g(m4490a);
        c1911g3.f8552c = false;
        return c1911g3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1911g)) {
            return false;
        }
        C1911g c1911g = (C1911g) obj;
        return this.f8550a.equals(c1911g.f8550a) && this.f8554e == c1911g.f8554e && this.f8555f == c1911g.f8555f && this.f8553d == c1911g.f8553d && this.f8552c == c1911g.f8552c && this.f8557h == c1911g.f8557h && this.f8556g == c1911g.f8556g && this.f8558i == c1911g.f8558i && this.f8559j == c1911g.f8559j;
    }

    public final int hashCode() {
        return (((((((((((((((this.f8550a.hashCode() * 31) + (this.f8552c ? 1 : 0)) * 31) + (this.f8553d ? 1 : 0)) * 31) + (this.f8554e ? 1 : 0)) * 31) + (this.f8555f ? 1 : 0)) * 31) + (this.f8556g ? 1 : 0)) * 31) + (this.f8557h ? 1 : 0)) * 31) + (this.f8558i ? 1 : 0)) * 31) + (this.f8559j ? 1 : 0);
    }

    public final String toString() {
        return this.f8550a;
    }
}
