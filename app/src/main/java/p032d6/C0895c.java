package p032d6;

import androidx.activity.C0143v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p002a1.C0017d;
import p023c6.InterfaceC0655a;
import p023c6.InterfaceC0656b;
import p023c6.InterfaceC0657c;
import p023c6.InterfaceC0658d;
import p023c6.InterfaceC0659e;
import p023c6.InterfaceC0660f;
import p023c6.InterfaceC0661g;
import p023c6.InterfaceC0662h;
import p023c6.InterfaceC0663i;
import p023c6.InterfaceC0664j;
import p023c6.InterfaceC0665k;
import p023c6.InterfaceC0666l;
import p023c6.InterfaceC0667m;
import p023c6.InterfaceC0668n;
import p023c6.InterfaceC0669o;
import p023c6.InterfaceC0670p;
import p023c6.InterfaceC0671q;
import p023c6.InterfaceC0672r;
import p023c6.InterfaceC0673s;
import p023c6.InterfaceC0674t;
import p023c6.InterfaceC0675u;
import p023c6.InterfaceC0676v;
import p023c6.InterfaceC0677w;
import p064h6.InterfaceC1303a;
import p072i6.C1394e;
import p187x5.C2197a;
import p195y5.C2264l;

/* renamed from: d6.c */
/* loaded from: classes.dex */
public final class C0895c implements InterfaceC1303a<Object>, InterfaceC0894b {

    /* renamed from: b */
    public static final Map<Class<Object>, Integer> f4685b;

    /* renamed from: a */
    public final Class<?> f4686a;

    static {
        int i7 = 0;
        List asList = Arrays.asList(InterfaceC0655a.class, InterfaceC0666l.class, InterfaceC0670p.class, InterfaceC0671q.class, InterfaceC0672r.class, InterfaceC0673s.class, InterfaceC0674t.class, InterfaceC0675u.class, InterfaceC0676v.class, InterfaceC0677w.class, InterfaceC0656b.class, InterfaceC0657c.class, InterfaceC0658d.class, InterfaceC0659e.class, InterfaceC0660f.class, InterfaceC0661g.class, InterfaceC0662h.class, InterfaceC0663i.class, InterfaceC0664j.class, InterfaceC0665k.class, InterfaceC0667m.class, InterfaceC0668n.class, InterfaceC0669o.class);
        C0898f.m2605d(asList, "asList(this)");
        ArrayList arrayList = new ArrayList(asList.size());
        for (Object obj : asList) {
            int i8 = i7 + 1;
            if (i7 < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new C2197a((Class) obj, Integer.valueOf(i7)));
            i7 = i8;
        }
        f4685b = C2264l.m5468W(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        C0898f.m2605d(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            C0898f.m2605d(str, "kotlinName");
            sb.append(C1394e.m3742Y(str));
            sb.append("CompanionObject");
            hashMap3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry<Class<Object>, Integer> entry : f4685b.entrySet()) {
            Class<Object> key = entry.getKey();
            int intValue = entry.getValue().intValue();
            hashMap3.put(key.getName(), "kotlin.Function" + intValue);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C0017d.m67F(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), C1394e.m3742Y((String) entry2.getValue()));
        }
    }

    public C0895c(Class<?> cls) {
        C0898f.m2606e(cls, "jClass");
        this.f4686a = cls;
    }

    @Override // p032d6.InterfaceC0894b
    /* renamed from: a */
    public final Class<?> mo2601a() {
        return this.f4686a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0895c) && C0898f.m2602a(C0143v.m404D(this), C0143v.m404D((InterfaceC1303a) obj));
    }

    public final int hashCode() {
        return C0143v.m404D(this).hashCode();
    }

    public final String toString() {
        return this.f4686a.toString() + " (Kotlin reflection is not available)";
    }
}
