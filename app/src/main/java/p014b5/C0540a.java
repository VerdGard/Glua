package p014b5;

import android.ext.C0091c;
import java.util.Objects;
import p006a5.C0054d;
import p006a5.InterfaceC0053c;

/* renamed from: b5.a */
/* loaded from: classes.dex */
public final class C0540a implements InterfaceC0053c {

    /* renamed from: c */
    public static final C0054d<C0540a> f2695c = new C0054d<>(new C0091c());

    /* renamed from: a */
    public int f2696a;

    /* renamed from: b */
    public long f2697b;

    public C0540a() {
    }

    public C0540a(long j7, int i7) {
        this.f2696a = i7;
        this.f2697b = j7;
    }

    @Override // p006a5.InterfaceC0053c
    /* renamed from: a */
    public final void mo158a(long j7) {
        this.f2697b = j7;
    }

    @Override // p006a5.InterfaceC0053c
    /* renamed from: b */
    public final long mo159b() {
        return mo163f() & 1924145348608L;
    }

    @Override // p006a5.InterfaceC0053c
    /* renamed from: c */
    public final int mo160c() {
        return (int) ((mo163f() & 274877382656L) >> 19);
    }

    @Override // p006a5.InterfaceC0053c
    /* renamed from: d */
    public final void mo161d() {
    }

    @Override // p006a5.InterfaceC0053c
    /* renamed from: e */
    public final void mo162e(int i7) {
        this.f2696a = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0540a.class != obj.getClass()) {
            return false;
        }
        C0540a c0540a = (C0540a) obj;
        return this.f2696a == c0540a.f2696a && this.f2697b == c0540a.f2697b;
    }

    @Override // p006a5.InterfaceC0053c
    /* renamed from: f */
    public final long mo163f() {
        return this.f2697b;
    }

    @Override // p006a5.InterfaceC0053c
    /* renamed from: g */
    public final void mo164g() {
    }

    @Override // p006a5.InterfaceC0053c
    /* renamed from: h */
    public final int mo165h() {
        return (int) (mo163f() & 524287);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f2696a), Long.valueOf(this.f2697b), null);
    }

    @Override // p006a5.InterfaceC0053c
    /* renamed from: i */
    public final int mo166i() {
        return this.f2696a;
    }

    public final String toString() {
        return "SpanImpl{column=" + this.f2696a + ", style=" + this.f2697b + ", extra=null, extMap=null}";
    }
}
