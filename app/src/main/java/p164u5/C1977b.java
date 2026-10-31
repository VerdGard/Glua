package p164u5;

import java.util.HashMap;
import p133q5.C1803f;

/* renamed from: u5.b */
/* loaded from: classes.dex */
public final class C1977b {

    /* renamed from: i */
    public static final HashMap f8861i;

    /* renamed from: a */
    public int f8862a;

    /* renamed from: b */
    public EnumC1978c f8863b;

    /* renamed from: c */
    public C1803f f8864c;

    /* renamed from: d */
    public EnumC1978c f8865d;

    /* renamed from: e */
    public boolean f8866e;

    /* renamed from: f */
    public String f8867f;

    /* renamed from: g */
    public final int f8868g;

    /* renamed from: h */
    public final int f8869h;

    static {
        HashMap hashMap = new HashMap();
        f8861i = hashMap;
        hashMap.put("and", EnumC1978c.f8898X1);
        hashMap.put("break", EnumC1978c.f8903a2);
        hashMap.put("continue", EnumC1978c.f8904b2);
        hashMap.put("do", EnumC1978c.f8906c2);
        hashMap.put("else", EnumC1978c.f8907d2);
        hashMap.put("elseif", EnumC1978c.f8909e2);
        hashMap.put("end", EnumC1978c.f8910f2);
        hashMap.put("false", EnumC1978c.f8911g2);
        hashMap.put("for", EnumC1978c.f8912h2);
        hashMap.put("function", EnumC1978c.f8913i2);
        hashMap.put("goto", EnumC1978c.f8914j2);
        hashMap.put("if", EnumC1978c.f8915k2);
        hashMap.put("in", EnumC1978c.f8916l2);
        hashMap.put("local", EnumC1978c.f8918m2);
        hashMap.put("nil", EnumC1978c.f8919n2);
        hashMap.put("not", EnumC1978c.f8902Z1);
        hashMap.put("or", EnumC1978c.f8900Y1);
        hashMap.put("repeat", EnumC1978c.f8920o2);
        hashMap.put("return", EnumC1978c.f8921p2);
        hashMap.put("then", EnumC1978c.f8922q2);
        hashMap.put("true", EnumC1978c.f8923r2);
        hashMap.put("until", EnumC1978c.f8925s2);
        hashMap.put("while", EnumC1978c.f8926t2);
    }

    public C1977b(int i7, C1803f c1803f, int i8, int i9) {
        EnumC1978c enumC1978c = EnumC1978c.f8930w2;
        this.f8862a = i7;
        this.f8863b = enumC1978c;
        this.f8864c = c1803f;
        this.f8868g = i8;
        this.f8869h = i9;
    }

    public C1977b(int i7, EnumC1978c enumC1978c, String str, int i8, int i9) {
        this.f8862a = i7;
        this.f8863b = enumC1978c;
        this.f8864c = C1803f.m4255B(str);
        this.f8868g = i8;
        this.f8869h = i9;
    }

    /* renamed from: a */
    public final String m4613a() {
        return this.f8864c.mo4251A();
    }
}
