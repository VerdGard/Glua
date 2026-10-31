package p134q6;

import androidx.activity.C0143v;
import java.net.URL;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/* renamed from: q6.b */
/* loaded from: classes.dex */
public final class C1806b {

    /* renamed from: a */
    public static final String[] f8192a = {"", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    "};

    /* renamed from: b */
    public static final Stack<StringBuilder> f8193b = new Stack<>();

    /* renamed from: a */
    public static StringBuilder m4257a() {
        StringBuilder sb;
        Stack<StringBuilder> stack = f8193b;
        synchronized (stack) {
            sb = stack.empty() ? new StringBuilder(8192) : stack.pop();
        }
        return sb;
    }

    /* renamed from: b */
    public static boolean m4258b(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m4259c(String[] strArr, String str) {
        return Arrays.binarySearch(strArr, str) >= 0;
    }

    /* renamed from: d */
    public static boolean m4260d(String str) {
        if (str != null && str.length() != 0) {
            int length = str.length();
            for (int i7 = 0; i7 < length; i7++) {
                if (!m4261e(str.codePointAt(i7))) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m4261e(int i7) {
        return i7 == 32 || i7 == 9 || i7 == 10 || i7 == 12 || i7 == 13;
    }

    /* renamed from: f */
    public static String m4262f(List list, String str) {
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return "";
        }
        String obj = it.next().toString();
        if (!it.hasNext()) {
            return obj;
        }
        StringBuilder m4257a = m4257a();
        m4257a.append(obj);
        while (it.hasNext()) {
            m4257a.append(str);
            m4257a.append(it.next());
        }
        return m4263g(m4257a);
    }

    /* renamed from: g */
    public static String m4263g(StringBuilder sb) {
        C0143v.m423U(sb);
        String sb2 = sb.toString();
        if (sb.length() > 8192) {
            sb = new StringBuilder(8192);
        } else {
            sb.delete(0, sb.length());
        }
        Stack<StringBuilder> stack = f8193b;
        synchronized (stack) {
            stack.push(sb);
            while (true) {
                Stack<StringBuilder> stack2 = f8193b;
                if (stack2.size() > 8) {
                    stack2.pop();
                }
            }
        }
        return sb2;
    }

    /* renamed from: h */
    public static URL m4264h(URL url, String str) {
        if (str.startsWith("?")) {
            str = url.getPath() + str;
        }
        if (str.indexOf(46) == 0 && url.getFile().indexOf(47) != 0) {
            url = new URL(url.getProtocol(), url.getHost(), url.getPort(), "/" + url.getFile());
        }
        return new URL(url, str);
    }
}
