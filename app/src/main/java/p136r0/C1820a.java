package p136r0;

import android.ext.Tools;
import androidx.activity.result.AbstractC0136c;
import androidx.lifecycle.AbstractC0387b0;
import androidx.lifecycle.C0389c0;
import androidx.lifecycle.C0393e0;
import androidx.lifecycle.C0404o;
import androidx.lifecycle.InterfaceC0400k;
import androidx.lifecycle.InterfaceC0405p;
import java.io.PrintWriter;
import p002a1.C0017d;
import p089l.C1482p;
import p128q0.C1723c;

/* renamed from: r0.a */
/* loaded from: classes.dex */
public final class C1820a extends AbstractC0136c {

    /* renamed from: e */
    public final InterfaceC0400k f8245e;

    /* renamed from: m */
    public final b f8246m;

    /* renamed from: r0.a$a */
    public static class a<D> extends C0404o<D> {
        @Override // androidx.lifecycle.LiveData
        /* renamed from: e */
        public final void mo1344e() {
            throw null;
        }

        @Override // androidx.lifecycle.LiveData
        /* renamed from: f */
        public final void mo1345f() {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        /* renamed from: g */
        public final void mo1346g(InterfaceC0405p<? super D> interfaceC0405p) {
            super.mo1346g(interfaceC0405p);
        }

        @Override // androidx.lifecycle.C0404o
        /* renamed from: h */
        public final void mo1388h(D d7) {
            super.mo1388h(d7);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #0 : ");
            C0017d.m87l(null, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: r0.a$b */
    public static class b extends AbstractC0387b0 {

        /* renamed from: d */
        public static final a f8247d = new a();

        /* renamed from: c */
        public final C1482p<a> f8248c = new C1482p<>();

        /* renamed from: r0.a$b$a */
        public static class a implements C0389c0.a {
            @Override // androidx.lifecycle.C0389c0.a
            /* renamed from: a */
            public final <T extends AbstractC0387b0> T mo1143a(Class<T> cls) {
                return new b();
            }

            @Override // androidx.lifecycle.C0389c0.a
            /* renamed from: b */
            public final AbstractC0387b0 mo1144b(Class cls, C1723c c1723c) {
                return mo1143a(cls);
            }
        }

        @Override // androidx.lifecycle.AbstractC0387b0
        /* renamed from: a */
        public final void mo1141a() {
            C1482p<a> c1482p = this.f8248c;
            int i7 = c1482p.f7050m;
            if (i7 > 0) {
                ((a) c1482p.f7049e[0]).getClass();
                throw null;
            }
            Object[] objArr = c1482p.f7049e;
            for (int i8 = 0; i8 < i7; i8++) {
                objArr[i8] = null;
            }
            c1482p.f7050m = 0;
        }
    }

    public C1820a(InterfaceC0400k interfaceC0400k, C0393e0 c0393e0) {
        this.f8245e = interfaceC0400k;
        this.f8246m = (b) new C0389c0(c0393e0, b.f8247d).m1354a(b.class);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(Tools.Semaphore.f159S7);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C0017d.m87l(this.f8245e, sb);
        sb.append("}}");
        return sb.toString();
    }

    @Deprecated
    /* renamed from: y */
    public final void m4298y(String str, PrintWriter printWriter) {
        C1482p<a> c1482p = this.f8246m.f8248c;
        if (c1482p.f7050m > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            if (c1482p.f7050m <= 0) {
                return;
            }
            a aVar = (a) c1482p.f7049e[0];
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(c1482p.f7048c[0]);
            printWriter.print(": ");
            printWriter.println(aVar.toString());
            printWriter.print(str2);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mArgs=");
            printWriter.println((Object) null);
            printWriter.print(str2);
            printWriter.print("mLoader=");
            printWriter.println((Object) null);
            throw null;
        }
    }
}
