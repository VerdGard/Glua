package p055g5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import p022c5.C0641e;

/* renamed from: g5.t */
/* loaded from: classes.dex */
public class C1263t {

    /* renamed from: a */
    public final HashMap f6296a = new HashMap();

    /* renamed from: b */
    public final HashMap f6297b = new HashMap();

    /* renamed from: c */
    public C1263t f6298c = null;

    /* renamed from: g5.t$a */
    public static final class a extends C1263t {

        /* renamed from: g5.t$a$a, reason: collision with other inner class name */
        public class C2298a implements b.a {
            @Override // p055g5.C1263t.b.a
            /* renamed from: a */
            public final boolean mo3575a(C0641e c0641e) {
                return c0641e.m2144p().m2163a();
            }

            @Override // p055g5.C1263t.b.a
            /* renamed from: b */
            public final /* synthetic */ void mo3576b() {
            }
        }

        /* renamed from: g5.t$a$b */
        public class b implements b.a {
            @Override // p055g5.C1263t.b.a
            /* renamed from: a */
            public final boolean mo3575a(C0641e c0641e) {
                return c0641e.m2144p().m2163a();
            }

            @Override // p055g5.C1263t.b.a
            /* renamed from: b */
            public final /* synthetic */ void mo3576b() {
            }
        }

        public a() {
            m3574c('{', new b("{", "}"));
            m3574c('(', new b("(", ")"));
            m3574c('[', new b("[", "]"));
            m3574c('\"', new b("\"", "\"", new C2298a()));
            m3574c('\'', new b("'", "'", new b()));
        }
    }

    /* renamed from: g5.t$b */
    public static class b {

        /* renamed from: f */
        public static final b f6299f = new b("", "");

        /* renamed from: a */
        public final String f6300a;

        /* renamed from: b */
        public final String f6301b;

        /* renamed from: c */
        public final a f6302c;

        /* renamed from: d */
        public int f6303d;

        /* renamed from: e */
        public int f6304e;

        /* renamed from: g5.t$b$a */
        public interface a {
            /* renamed from: a */
            boolean mo3575a(C0641e c0641e);

            /* renamed from: b */
            void mo3576b();
        }

        public b(String str, String str2) {
            this.f6300a = str;
            this.f6301b = str2;
        }

        public b(String str, String str2, a aVar) {
            this(str, str2);
            this.f6302c = aVar;
        }
    }

    /* renamed from: a */
    public final b m3572a(char c7) {
        C1263t c1263t;
        b bVar = (b) this.f6296a.get(Character.valueOf(c7));
        return (bVar != null || (c1263t = this.f6298c) == null) ? bVar : c1263t.m3572a(c7);
    }

    /* renamed from: b */
    public final List<b> m3573b(char c7) {
        C1263t c1263t;
        List<b> list = (List) this.f6297b.get(Character.valueOf(c7));
        if (list == null && (c1263t = this.f6298c) != null) {
            list = new ArrayList<>(c1263t.m3573b(c7));
        }
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: c */
    public final void m3574c(char c7, b bVar) {
        this.f6296a.put(Character.valueOf(c7), bVar);
    }
}
