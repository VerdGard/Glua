package p191y1;

import p047f5.C1181l;

/* renamed from: y1.g */
/* loaded from: classes.dex */
public final class C2228g {

    /* renamed from: a */
    public static C1181l<EnumC2229h> f10099a;

    /* renamed from: b */
    public static String[] f10100b = {"and", "break", "case", "continue", "default", "defer", "do", "else", "elseif", "end", "false", "for", "function", "goto", "if", "in", "lambda", "local", "nil", "not", "or", "repeat", "return", "switch", "then", "true", "until", "when", "while"};

    static {
        EnumC2229h[] enumC2229hArr = {EnumC2229h.f10121Y, EnumC2229h.f10104D1, EnumC2229h.f10101A1, EnumC2229h.f10112L1, EnumC2229h.f10114N1, EnumC2229h.f10116P1, EnumC2229h.f10120X, EnumC2229h.f10129y1, EnumC2229h.f10111K1, EnumC2229h.f10122Z, EnumC2229h.f10106F1, EnumC2229h.f10128x1, EnumC2229h.f10115O1, EnumC2229h.f10130z1, EnumC2229h.f10125m, EnumC2229h.f10124e, EnumC2229h.f10118R1, EnumC2229h.f10105E1, EnumC2229h.f10127w1, EnumC2229h.f10123c, EnumC2229h.f10126s, EnumC2229h.f10110J1, EnumC2229h.f10109I1, EnumC2229h.f10113M1, EnumC2229h.f10103C1, EnumC2229h.f10102B1, EnumC2229h.f10107G1, EnumC2229h.f10117Q1, EnumC2229h.f10108H1};
        f10099a = new C1181l<>();
        int i7 = 0;
        while (true) {
            String[] strArr = f10100b;
            if (i7 >= strArr.length) {
                return;
            }
            C1181l<EnumC2229h> c1181l = f10099a;
            String str = strArr[i7];
            EnumC2229h enumC2229h = enumC2229hArr[i7];
            c1181l.getClass();
            c1181l.f5774b = Math.max(str.length(), c1181l.f5774b);
            C1181l.m3393a(c1181l.f5773a, str, 0, str.length(), enumC2229h);
            i7++;
        }
    }

    public C2228g(CharSequence charSequence) {
        if (charSequence == null) {
            throw new IllegalArgumentException("src can not be null");
        }
        charSequence.length();
    }
}
