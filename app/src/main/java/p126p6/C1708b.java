package p126p6;

import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.util.Locale;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p134q6.C1806b;

/* renamed from: p6.b */
/* loaded from: classes.dex */
public final class C1708b {

    /* renamed from: a */
    public static final Pattern f7687a = Pattern.compile("(?i)\\bcharset=\\s*(?:[\"'])?([^\\s,;\"']*)");

    /* renamed from: b */
    public static final char[] f7688b = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    /* renamed from: p6.b$a */
    public static class a {

        /* renamed from: a */
        public final String f7689a;

        /* renamed from: b */
        public final boolean f7690b;

        public a(String str, boolean z6) {
            this.f7689a = str;
            this.f7690b = z6;
        }
    }

    /* renamed from: a */
    public static String m4133a(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = f7687a.matcher(str);
        if (matcher.find()) {
            return m4135c(matcher.group(1).trim().replace("charset=", ""));
        }
        return null;
    }

    /* renamed from: b */
    public static String m4134b() {
        StringBuilder m4257a = C1806b.m4257a();
        Random random = new Random();
        for (int i7 = 0; i7 < 32; i7++) {
            char[] cArr = f7688b;
            m4257a.append(cArr[random.nextInt(cArr.length)]);
        }
        return C1806b.m4263g(m4257a);
    }

    /* renamed from: c */
    public static String m4135c(String str) {
        if (str != null && str.length() != 0) {
            String replaceAll = str.trim().replaceAll("[\"']", "");
            try {
                if (Charset.isSupported(replaceAll)) {
                    return replaceAll;
                }
                String upperCase = replaceAll.toUpperCase(Locale.ENGLISH);
                if (Charset.isSupported(upperCase)) {
                    return upperCase;
                }
            } catch (IllegalCharsetNameException unused) {
            }
        }
        return null;
    }
}
