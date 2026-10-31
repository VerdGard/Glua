package p191y1;

import android.content.res.AssetManager;
import android.ext.C0089a;
import android.ext.C0090b;
import android.ext.Tools;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import androidx.activity.C0143v;
import com.so.revelation.lua.EditorActivity;
import com.so.revelation.lua.R;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p002a1.C0017d;
import p022c5.C0638b;
import p022c5.C0641e;
import p022c5.C0642f;
import p022c5.C0644h;
import p047f5.C1177h;
import p054g4.AbstractC1230l;
import p054g4.C1226h;
import p054g4.C1228j;
import p054g4.C1233o;
import p055g5.C1263t;
import p133q5.C1803f;
import p141r5.AbstractC1840b;
import p141r5.AbstractC1843e;
import p141r5.C1839a;
import p148s4.InterfaceC1885b;
import p148s4.InterfaceC1886c;
import p149s5.C1890d;
import p149s5.C1893g;
import p149s5.C1895i;
import p149s5.C1896j;
import p149s5.C1899m;
import p149s5.C1901o;
import p149s5.C1902p;
import p156t4.InterfaceC1926a;
import p157t5.C1930a;
import p157t5.C1936g;
import p157t5.C1937h;
import p157t5.C1940k;
import p157t5.C1942m;
import p157t5.C1943n;
import p157t5.C1944o;
import p157t5.C1945p;
import p164u5.C1976a;
import p164u5.C1977b;
import p164u5.EnumC1978c;
import p171v4.C2024h;
import p171v4.C2030n;
import p171v4.C2031o;
import p183x1.C2175b;
import p186x4.C2193a;
import p202z4.InterfaceC2287a;

/* renamed from: y1.d */
/* loaded from: classes.dex */
public final class C2225d extends C2222a implements InterfaceC1885b {

    /* renamed from: j */
    public static b f10069j;

    /* renamed from: e */
    public final String[] f10070e;

    /* renamed from: f */
    public C2030n f10071f;

    /* renamed from: g */
    public final C2224c f10072g;

    /* renamed from: h */
    public final C2227f f10073h;

    /* renamed from: i */
    public final InterfaceC2287a[] f10074i;

    /* renamed from: y1.d$a */
    public class a implements InterfaceC2287a {
        public a() {
        }

        /* renamed from: a */
        public final C2175b m5409a(C0641e c0641e, C0638b c0638b, int i7) {
            C0642f m2146r = c0641e.m2146r(c0638b.f3141b);
            int i8 = c0638b.f3142c;
            String c0642f = m2146r.subSequence(0, i8).toString();
            String c0642f2 = m2146r.subSequence(i8, m2146r.f3160e).toString();
            long m466u = C0143v.m466u(c0642f);
            int m62A = (C0017d.m62A(m466u) * i7) + ((int) (m466u >> 32));
            C2225d.this.getClass();
            int m5407m = C2225d.m5407m(c0642f);
            int m5407m2 = C2225d.m5407m(c0642f2);
            StringBuilder sb = new StringBuilder("\n");
            sb.append(C0143v.m468v(m5407m + m62A, i7, false));
            sb.append('\n');
            String m468v = C0143v.m468v(m62A + m5407m2, i7, false);
            sb.append(m468v);
            return new C2175b(m468v.length() + 1, sb);
        }
    }

    /* renamed from: y1.d$b */
    public static class b {

        /* renamed from: a */
        public final C1233o f10076a;

        public b() {
            AssetManager assets = Tools.getContext().getAssets();
            StringBuilder sb = new StringBuilder();
            try {
                InputStream open = assets.open("AGG_LUA_API_ZN.json");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    } else {
                        sb.append(readLine);
                    }
                }
                open.close();
            } catch (IOException e7) {
                sb.append("Error: ");
                sb.append(e7.getMessage());
            }
            this.f10076a = (C1233o) new C1226h().m3443a(sb.toString(), C1233o.class);
        }
    }

    /* renamed from: y1.d$c */
    public static class c {

        /* renamed from: a */
        public String f10077a;

        /* renamed from: b */
        public String f10078b;
    }

    static {
        C2193a.m5325h("for(int ${1:i} = 0;$1 < ${2:count};$1++) {\n    $0\n}");
        C2193a.m5325h("private final static ${1:type} ${2/(.*)/${1:/upcase}/} = ${3:value};");
    }

    public C2225d() {
        String[] split = " ".split("\\|");
        this.f10070e = "self|__add|__band|__bnot|__bor|__bxor|__call|__close|__concat|__div|__eq|__gc|__idiv|__index|__le|__len|__lt|__mod|__mul|__newindex|__pow|__shl|__shr|__sub|__tostring|__unm|_ENV|_G|assert|collectgarbage|dofile|error|findtable|getmetatable|ipairs|load|loadfile|loadstring|module|next|pairs|pcall|print|rawequal|rawget|rawlen|rawset|require|select|self|setmetatable|tointeger|tonumber|tostring|type|unpack|xpcall|activity|call|compile|dump|each|enum|import|loadbitmap|loadlayout|loadmenu|service|set|task|thread|timer|gg|coroutine|debug|io|luajava|math|os|package|string|table|utf8".split("\\|");
        char[] cArr = {'(', ')', '{', '}', ',', ';', '=', '+', '-', '/', '*', '&', '!', '|', ':', '[', ']', '<', '>', '?', '~', '%', '^'};
        this.f10073h = new C2227f();
        this.f10074i = new InterfaceC2287a[]{new a()};
        HashMap hashMap = new HashMap(23);
        for (int i7 = 0; i7 < 23; i7++) {
            hashMap.put(Character.valueOf(cArr[i7]), 2);
        }
        this.f10060a = new HashMap<>(split.length);
        for (String str : split) {
            this.f10060a.put(str, 1);
        }
        String[] strArr = this.f10070e;
        this.f10063d = strArr;
        ArrayList arrayList = new ArrayList();
        this.f10061b = new HashMap<>(strArr.length);
        for (int i8 = 0; i8 < strArr.length; i8++) {
            if (!arrayList.contains(strArr[i8])) {
                arrayList.add(strArr[i8]);
            }
            this.f10061b.put(strArr[i8], 3);
        }
        String[] strArr2 = new String[arrayList.size()];
        this.f10063d = strArr2;
        arrayList.toArray(strArr2);
        m5401k("close|flush|info|input|isdir|lines|ls|mkdir|open|output|popen|read|readall|stderr|stdin|stdout|tmpfile|type|write".split("\\|"), "io");
        m5401k("byte|char|dump|find|format|gfind|gmatch|gsub|len|lower|match|pack|packsize|rep|reverse|sub|unpack|upper".split("\\|"), "string");
        m5401k("astable|bindClass|clear|coding|createArray|createProxy|getContext|instanceof|loadLib|loaded|luapath|new|newArray|newInstance|override|package|tostring".split("\\|"), "luajava");
        m5401k("clock|date|difftime|execute|exit|getenv|remove|rename|setlocale|time|tmpname".split("\\|"), "os");
        m5401k("json|toJson|clear|clone|concat|const|find|foreach|foreachi|gfind|insert|maxn|move|pack|remove|size|sort|unpack".split("\\|"), "table");
        m5401k("abs|acos|asin|atan|atan2|ceil|cos|cosh|deg|exp|floor|fmod|frexp|huge|ldexp|log|log10|max|maxinteger|min|mininteger|modf|pi|pow|rad|random|randomseed|sin|sinh|sqrt|tan|tanh|tointeger|type|ult".split("\\|"), "math");
        m5401k("byte|char|charpattern|charpos|codepoint|codes|escape|find|fold|gfind|gmatch|gsub|insert|len|lower|match|ncasecmp|next|offset|remove|reverse|sub|title|upper|width|widthindex".split("\\|"), "utf8");
        m5401k("create|isyieldable|resume|running|status|wrap|yield".split("\\|"), "coroutine");
        m5401k("config|cpath|loaded|loaders|loadlib|path|preload|searchers|searchpath|seeall".split("\\|"), "package");
        m5401k("debug|gethook|getinfo|getlocal|getmetatable|getregistry|getupvalue|getuservalue|sethook|setlocal|setmetatable|setupvalue|setuservalue|traceback|upvalueid|upvaluejoin".split("\\|"), "debug");
        m5401k("getResultsCount|SIGN_INEQUAL|multiChoice|setSpeed|getSpeed|REGION_C_HEAP|bytes|getFile|require|SIGN_LESS_OR_EQUAL|TYPE_QWORD|getValues|setValues|editAll|SIGN_NOT_EQUAL|getListItems|loadResults|TYPE_XOR|getSelectedResults|getTargetPackage|internal3|PROT_NONE|startFuzzy|processKill|alert|REGION_STACK|CACHE_DIR|setRanges|getRanges|REGION_CODE_SYS|getLine|unrandomizer|getActiveTab|searchPointer|ASM_THUMB|PROT_WRITE|skipRestoreState|TYPE_BYTE|REGION_C_DATA|SIGN_GREATER_OR_EQUAL|FILES_DIR|FREEZE_IN_RANGE|allocatePage|getValuesRange|PROT_READ|REGION_OTHER|REGION_VIDEO|LOAD_VALUES|internal1|EXT_FILES_DIR|REGION_BAD|ANDROID_SDK_INT|removeListItems|getTargetInfo|toast|processResume|makeRequest|LOAD_VALUES_FREEZE|getLocale|getSelectedListItems|timeJump|processToggle|disasm|getResultCount|FREEZE_MAY_DECREASE|SIGN_FUZZY_EQUAL|processPause|FREEZE_MAY_INCREASE|isProcessPaused|getRangesList|getResults|TAB_SEARCH|copyText|REGION_CODE_APP|POINTER_NO|TAB_SAVED_LIST|searchFuzzy|BUILD|internal2|REGION_ASHMEM|TYPE_AUTO|REGION_ANONYMOUS|clearResults|SAVE_AS_TEXT|removeResults|refineAddress|refineNumber|SIGN_LARGER|TYPE_FLOAT|choice|ASM_ARM|SIGN_FUZZY_GREATER|SIGN_EQUAL|FREEZE_NORMAL|LOAD_APPEND|TYPE_WORD|numberFromLocale|POINTER_READ_ONLY|POINTER_WRITABLE|REGION_JAVA_HEAP|getSelectedElements|showUiButton|isVisible|gotoAddress|SIGN_FUZZY_LESS|getSelectedPackage|TAB_MEMORY_EDITOR|REGION_C_BSS|saveList|addListItems|POINTER_EXECUTABLE|prompt|DUMP_SKIP_SYSTEM_LIBS|setVisible|REGION_PPSSPP|REGION_JAVA|searchNumber|POINTER_EXECUTABLE_WRITABLE|TYPE_DOUBLE|PROT_EXEC|saveVariable|TAB_SETTINGS|isPackageInstalled|numberToLocale|clearList|copyMemory|EXT_STORAGE|SIGN_SMALLER|REGION_C_ALLOC|hideUiButton|VERSION_INT|ASM_ARM64|sleep|loadList|SIGN_FUZZY_NOT_EQUAL|TYPE_DWORD|VERSION|isClickedUiButton|dumpMemory|PACKAGE|EXT_CACHE_DIR|searchAddress|".split("\\|"), "gg");
        m5401k("ClassCompileAll()|ClassLoad()".split("\\|"), "ap");
        m5401k("md5|zip|unzip|read|create|getFiles|new".split("\\|"), "file");
        this.f10071f = new C2030n(C2228g.f10100b);
        this.f10072g = new C2224c();
    }

    /* renamed from: l */
    public static void m5406l(ArrayList arrayList, C1901o c1901o, String str) {
        ArrayList arrayList2;
        String str2;
        ArrayList arrayList3 = c1901o.f8460f;
        if (arrayList3 == null || (arrayList2 = c1901o.f8461g) == null) {
            return;
        }
        for (int i7 = 0; i7 < arrayList3.size(); i7++) {
            AbstractC1840b abstractC1840b = (AbstractC1840b) arrayList3.get(i7);
            AbstractC1840b abstractC1840b2 = (AbstractC1840b) arrayList2.get(i7);
            String mo4251A = abstractC1840b instanceof C1899m ? ((C1899m) abstractC1840b).f8455f.mo4251A() : null;
            if (mo4251A != null) {
                if (!str.isEmpty()) {
                    mo4251A = str + "." + mo4251A;
                }
                if (abstractC1840b2 instanceof C1901o) {
                    m5406l(arrayList, (C1901o) abstractC1840b2, mo4251A);
                } else {
                    c cVar = new c();
                    cVar.f10077a = mo4251A;
                    if (abstractC1840b2 instanceof C1899m) {
                        C1899m c1899m = (C1899m) abstractC1840b2;
                        C1803f c1803f = c1899m.f8455f;
                        C1977b c1977b = c1899m.f8456g;
                        if (c1977b != null) {
                            EnumC1978c enumC1978c = c1977b.f8865d;
                            if (enumC1978c == null) {
                                enumC1978c = EnumC1978c.f8927u2;
                            }
                            if (enumC1978c == EnumC1978c.f8928v2) {
                                str2 = c1803f.mo4251A();
                            }
                        }
                        str2 = "\"" + c1803f.mo4251A() + "\"";
                    } else {
                        str2 = abstractC1840b2 instanceof C1893g ? "function" : abstractC1840b2 instanceof C1895i ? ((C1895i) abstractC1840b2).f8452f : abstractC1840b2 instanceof C1902p ? "true" : abstractC1840b2 instanceof C1890d ? "false" : abstractC1840b2 instanceof C1896j ? "nil" : "unknown";
                    }
                    cVar.f10078b = str2;
                    arrayList.add(cVar);
                }
            }
        }
    }

    /* renamed from: m */
    public static int m5407m(String str) {
        new C2228g(str);
        return Math.max(0, 0) * 4;
    }

    /* renamed from: n */
    public static void m5408n(ArrayList arrayList, List list, String str) {
        AbstractC1840b abstractC1840b;
        C1839a c1839a;
        AbstractC1840b abstractC1840b2;
        List<AbstractC1843e> list2;
        C1839a c1839a2;
        C1893g c1893g;
        C1839a c1839a3;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC1843e abstractC1843e = (AbstractC1843e) it.next();
            int i7 = 0;
            if (abstractC1843e instanceof C1943n) {
                C1943n c1943n = (C1943n) abstractC1843e;
                List<String> list3 = c1943n.f8753e;
                if (list3 != null) {
                    while (i7 < list3.size()) {
                        boolean equals = list3.get(i7).equals(str);
                        List<AbstractC1840b> list4 = c1943n.f8754f;
                        if (equals || (list4.get(i7) != null && (list4.get(i7) instanceof C1893g))) {
                            if (list4 != null && (abstractC1840b = list4.get(i7)) != null) {
                                if (abstractC1840b instanceof C1901o) {
                                    m5406l(arrayList, (C1901o) abstractC1840b, "");
                                } else if ((abstractC1840b instanceof C1893g) && (c1839a = ((C1893g) abstractC1840b).f8446h) != null) {
                                    m5408n(arrayList, c1839a.f8309e, str);
                                }
                            }
                        }
                        i7++;
                    }
                }
            } else if (abstractC1843e instanceof C1930a) {
                C1930a c1930a = (C1930a) abstractC1843e;
                List<AbstractC1840b> list5 = c1930a.f8722f;
                while (true) {
                    List<AbstractC1840b> list6 = c1930a.f8721e;
                    if (i7 >= list6.size()) {
                        break;
                    }
                    if ((list6.get(i7) instanceof C1895i) && (((C1895i) list6.get(i7)).f8452f.equals(str) || (list5.get(i7) != null && (list5.get(i7) instanceof C1893g)))) {
                        if (list5 != null && (abstractC1840b2 = list5.get(i7)) != null) {
                            if (abstractC1840b2 instanceof C1901o) {
                                m5406l(arrayList, (C1901o) abstractC1840b2, "");
                            } else if (abstractC1840b2 instanceof C1893g) {
                                C1839a c1839a4 = ((C1893g) abstractC1840b2).f8446h;
                                if (c1839a4 != null && (list2 = c1839a4.f8309e) != null) {
                                    m5408n(arrayList, list2, str);
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    i7++;
                }
            } else if (abstractC1843e instanceof C1940k) {
                C1940k c1940k = (C1940k) abstractC1843e;
                C1839a c1839a5 = c1940k.f8742f;
                if (c1839a5 != null) {
                    m5408n(arrayList, c1839a5.f8309e, str);
                }
                C1839a c1839a6 = c1940k.f8745i;
                if (c1839a6 != null) {
                    m5408n(arrayList, c1839a6.f8309e, str);
                }
                List<C1839a> list7 = c1940k.f8744h;
                if (list7 != null) {
                    Iterator<C1839a> it2 = list7.iterator();
                    while (it2.hasNext()) {
                        m5408n(arrayList, it2.next().f8309e, str);
                    }
                }
            } else if (abstractC1843e instanceof C1936g) {
                c1839a2 = ((C1936g) abstractC1843e).f8731g;
                if (c1839a2 != null) {
                    m5408n(arrayList, c1839a2.f8309e, str);
                }
            } else if (abstractC1843e instanceof C1937h) {
                c1839a2 = ((C1937h) abstractC1843e).f8737i;
                if (c1839a2 != null) {
                    m5408n(arrayList, c1839a2.f8309e, str);
                }
            } else if (abstractC1843e instanceof C1945p) {
                c1839a2 = ((C1945p) abstractC1843e).f8759f;
                if (c1839a2 != null) {
                    m5408n(arrayList, c1839a2.f8309e, str);
                }
            } else if (abstractC1843e instanceof C1944o) {
                c1839a2 = ((C1944o) abstractC1843e).f8755e;
                if (c1839a2 != null) {
                    m5408n(arrayList, c1839a2.f8309e, str);
                }
            } else if ((abstractC1843e instanceof C1942m) && (c1893g = ((C1942m) abstractC1843e).f8752f) != null && (c1839a3 = c1893g.f8446h) != null) {
                m5408n(arrayList, c1839a3.f8309e, str);
            }
        }
    }

    @Override // p148s4.InterfaceC1885b
    /* renamed from: a */
    public final InterfaceC1926a mo4416a() {
        return this.f10072g;
    }

    @Override // p148s4.InterfaceC1885b
    /* renamed from: b */
    public final int mo4417b(C0644h c0644h, int i7, int i8) {
        c0644h.m2171a();
        return m5407m(c0644h.f3163X.m2150v(i7).substring(0, i8));
    }

    @Override // p148s4.InterfaceC1885b
    /* renamed from: c */
    public final void mo4418c() {
    }

    @Override // p148s4.InterfaceC1885b
    /* renamed from: d */
    public final int mo4419d(C0644h c0644h, int i7, int i8) {
        return mo4417b(c0644h, i7, i8);
    }

    @Override // p148s4.InterfaceC1885b
    public final void destroy() {
        this.f10071f = null;
    }

    @Override // p148s4.InterfaceC1885b
    /* renamed from: e */
    public final void mo4420e(C0644h c0644h, C0638b c0638b, C2024h c2024h) {
        C2030n.a aVar;
        C1228j c1228j;
        String m210h;
        C2031o c2031o;
        EditorActivity editorActivity;
        int i7;
        int i8 = c0638b.f3142c;
        int i9 = c0638b.f3141b;
        c0644h.m2171a();
        String m2150v = c0644h.f3163X.m2150v(i9);
        while (i8 > 0) {
            int i10 = i8 - 1;
            if (!C1177h.m3386b(m2150v.charAt(i10))) {
                break;
            } else {
                i8 = i10;
            }
        }
        String substring = m2150v.substring(i8, c0638b.f3142c);
        int i11 = c0638b.f3140a;
        CharSequence charSequence = c0644h.f3188c;
        char charAt = i11 > 0 ? ((C0641e) charSequence).charAt(i11 - 1) : (char) 0;
        if (i11 < 0) {
            return;
        }
        C0641e c0641e = (C0641e) charSequence;
        char c7 = 1;
        boolean z6 = c0641e.charAt((c0638b.f3140a - substring.length()) - 1) == '.';
        HashMap<String, String[]> hashMap = this.f10062c;
        int i12 = 33;
        int i13 = -2196964;
        C2224c c2224c = this.f10072g;
        if (charAt == '.' || z6) {
            StringBuilder sb = new StringBuilder();
            for (int i14 = c0638b.f3140a - 2; i14 >= 0 && C1177h.m3386b(c0641e.charAt(i14)); i14--) {
                sb.insert(0, c0641e.charAt(i14));
            }
            String sb2 = sb.length() > 0 ? sb.toString() : null;
            int i15 = 2;
            if (z6 && !substring.isEmpty()) {
                StringBuilder sb3 = new StringBuilder();
                for (int length = (c0638b.f3140a - substring.length()) - 2; length >= 0 && C1177h.m3386b(c0641e.charAt(length)); length--) {
                    sb3.insert(0, c0641e.charAt(length));
                }
                sb2 = sb3.length() > 0 ? sb3.toString() : null;
            }
            if (sb2 == null) {
                return;
            }
            if (hashMap.containsKey(sb2)) {
                String[] strArr = hashMap.get(sb2);
                if (!sb2.equals("gg")) {
                    for (String str : strArr) {
                        if (substring.isEmpty() || (z6 && str.startsWith(substring))) {
                            SpannableString spannableString = new SpannableString(str);
                            spannableString.setSpan(new ForegroundColorSpan(-2196964), 0, substring.length(), 33);
                            C2031o c2031o2 = new C2031o(spannableString, "function", substring.length(), str);
                            c2031o2.f9174a = EditorActivity.f3285f2.getDrawable(R.drawable.function_x);
                            c2024h.m4915a(c2031o2);
                        }
                    }
                    return;
                }
                if (f10069j == null) {
                    f10069j = new b();
                }
                AbstractC1230l m3451c = f10069j.f10076a.m3451c("GG");
                m3451c.getClass();
                if (!(m3451c instanceof C1228j)) {
                    throw new IllegalStateException("Not a JSON Array: " + m3451c);
                }
                C1228j c1228j2 = (C1228j) m3451c;
                int i16 = 0;
                while (i16 < c1228j2.f5976c.size()) {
                    String mo3447b = c1228j2.m3448c(i16).m3450a().m3451c("title").mo3447b();
                    String mo3447b2 = c1228j2.m3448c(i16).m3450a().m3451c("content").mo3447b();
                    if (c1228j2.m3448c(i16).m3450a().m3451c("code") != null) {
                        c1228j2.m3448c(i16).m3450a().m3451c("code").mo3447b();
                    }
                    String mo3447b3 = c1228j2.m3448c(i16).m3450a().m3451c("interpretation").mo3447b();
                    c1228j2.m3448c(i16).m3450a().m3451c("return_value").mo3447b();
                    c1228j2.m3448c(i16).m3450a().m3451c("params").mo3447b();
                    String substring2 = mo3447b.trim().substring(i15);
                    String str2 = mo3447b2.split(" ")[0];
                    if (!substring.isEmpty() && (!z6 || !substring2.startsWith(substring))) {
                        c1228j = c1228j2;
                    } else if (substring2.contains("(")) {
                        String[] split = mo3447b2.trim().split("\\(");
                        boolean equals = split[c7].trim().equals(")");
                        String substring3 = substring2.substring(0, substring2.length() - 2);
                        if (equals) {
                            c1228j = c1228j2;
                            m210h = C0089a.m210h(substring3, "()");
                        } else {
                            c1228j = c1228j2;
                            m210h = substring3 + "(" + split[1].trim().split("\\)")[0].trim() + ")";
                        }
                        SpannableString spannableString2 = new SpannableString(m210h + " : " + str2);
                        spannableString2.setSpan(new ForegroundColorSpan(-2196964), 0, substring.length(), 33);
                        spannableString2.setSpan(new ForegroundColorSpan(-6645094), substring3.length(), m210h.length(), 33);
                        C2031o c2031o3 = new C2031o(spannableString2, mo3447b3.trim().substring(5), substring.length(), substring2);
                        c2031o3.f9174a = EditorActivity.f3285f2.getDrawable(R.drawable.box_light_red);
                        c2031o3.f9218h = equals;
                        c2024h.m4915a(c2031o3);
                    } else {
                        c1228j = c1228j2;
                        SpannableString spannableString3 = new SpannableString(substring2 + " : " + str2);
                        spannableString3.setSpan(new ForegroundColorSpan(-2196964), 0, substring.length(), 33);
                        C2031o c2031o4 = new C2031o(spannableString3, mo3447b3.trim().substring(5), substring.length(), substring2);
                        c2031o4.f9174a = EditorActivity.f3285f2.getDrawable(R.drawable.box_light_blue);
                        c2024h.m4915a(c2031o4);
                    }
                    i16++;
                    c7 = 1;
                    i15 = 2;
                    c1228j2 = c1228j;
                }
                return;
            }
            ArrayList arrayList = new ArrayList();
            try {
                C0641e c0641e2 = new C0641e((C0641e) charSequence, true);
                int i17 = c0638b.f3141b;
                c0641e2.m2136h(i17, 0, i17, c0641e2.m2146r(i17).f3160e);
                m5408n(arrayList, C0017d.m71J(new C1976a(new ByteArrayInputStream(c0641e2.toString().getBytes()))).f8309e, sb2);
            } catch (Exception e7) {
                e7.printStackTrace();
            }
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    c cVar = (c) it.next();
                    if (substring.isEmpty() || (z6 && cVar.f10077a.startsWith(substring))) {
                        SpannableString spannableString4 = new SpannableString(cVar.f10077a);
                        spannableString4.setSpan(new ForegroundColorSpan(-2196964), 0, substring.length(), 33);
                        String str3 = cVar.f10077a;
                        int length2 = substring.length();
                        if (cVar.f10077a.matches(".*[^a-zA-Z0-9].*")) {
                            str3 = C0090b.m220f(new StringBuilder("[\""), cVar.f10077a, "\"]");
                            length2++;
                        }
                        C2031o c2031o5 = new C2031o(spannableString4, "value = " + cVar.f10078b, length2, str3);
                        c2031o5.f9174a = EditorActivity.f3285f2.getDrawable(R.drawable.parameter);
                        c2024h.m4915a(c2031o5);
                    }
                }
                return;
            }
            aVar = c2224c.f10068h;
            if (aVar == null) {
                return;
            }
        } else {
            String[] strArr2 = this.f10063d;
            int length3 = strArr2.length;
            int i18 = 0;
            while (i18 < length3) {
                String str4 = strArr2[i18];
                if (str4.startsWith(substring) && substring.length() > 0) {
                    SpannableString spannableString5 = new SpannableString(str4);
                    spannableString5.setSpan(new ForegroundColorSpan(i13), 0, substring.length(), i12);
                    if (hashMap.containsKey(str4)) {
                        c2031o = new C2031o(spannableString5, "global table", substring.length(), str4);
                        editorActivity = EditorActivity.f3285f2;
                        i7 = R.drawable.objects;
                    } else {
                        c2031o = new C2031o(spannableString5, "global method", substring.length(), str4);
                        editorActivity = EditorActivity.f3285f2;
                        i7 = R.drawable.box_redh;
                    }
                    c2031o.f9174a = editorActivity.getDrawable(i7);
                    c2024h.m4915a(c2031o);
                }
                i18++;
                i12 = 33;
                i13 = -2196964;
            }
            aVar = c2224c.f10068h;
            if (aVar == null) {
                return;
            }
        }
        this.f10071f.m4923a(c0644h, c0638b, substring, c2024h, aVar);
    }

    @Override // p148s4.InterfaceC1885b
    /* renamed from: f */
    public final InterfaceC2287a[] mo4421f() {
        return this.f10074i;
    }

    @Override // p148s4.InterfaceC1885b
    /* renamed from: g */
    public final void mo4422g() {
    }

    @Override // p148s4.InterfaceC1885b
    /* renamed from: h */
    public final C1263t mo4423h() {
        return new C1263t.a();
    }

    @Override // p148s4.InterfaceC1885b
    /* renamed from: i */
    public final void mo4424i() {
    }

    @Override // p148s4.InterfaceC1885b
    /* renamed from: j */
    public final InterfaceC1886c mo4425j() {
        return this.f10073h;
    }
}
