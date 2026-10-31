package p142r6;

import androidx.activity.C0143v;
import java.util.Collections;
import java.util.List;

/* renamed from: r6.l */
/* loaded from: classes.dex */
public abstract class AbstractC1855l extends AbstractC1856m {

    /* renamed from: s */
    public static final List<AbstractC1856m> f8355s = Collections.emptyList();

    /* renamed from: m */
    public Object f8356m;

    @Override // p142r6.AbstractC1856m
    /* renamed from: a */
    public final String mo4380a(String str) {
        m4385w();
        return super.mo4380a(str);
    }

    @Override // p142r6.AbstractC1856m
    /* renamed from: c */
    public final String mo4381c(String str) {
        C0143v.m423U(str);
        return !(this.f8356m instanceof C1845b) ? str.equals(mo4344p()) ? (String) this.f8356m : "" : super.mo4381c(str);
    }

    @Override // p142r6.AbstractC1856m
    /* renamed from: d */
    public final void mo4382d(String str, String str2) {
        if (!(this.f8356m instanceof C1845b) && str.equals(mo4344p())) {
            this.f8356m = str2;
        } else {
            m4385w();
            super.mo4382d(str, str2);
        }
    }

    @Override // p142r6.AbstractC1856m
    /* renamed from: e */
    public final C1845b mo4365e() {
        m4385w();
        return (C1845b) this.f8356m;
    }

    @Override // p142r6.AbstractC1856m
    /* renamed from: f */
    public final String mo4366f() {
        AbstractC1856m abstractC1856m = this.f8357c;
        return abstractC1856m != null ? abstractC1856m.mo4366f() : "";
    }

    @Override // p142r6.AbstractC1856m
    /* renamed from: g */
    public final int mo4367g() {
        return 0;
    }

    @Override // p142r6.AbstractC1856m
    /* renamed from: j */
    public final void mo4369j(String str) {
    }

    @Override // p142r6.AbstractC1856m
    /* renamed from: k */
    public final List<AbstractC1856m> mo4370k() {
        return f8355s;
    }

    @Override // p142r6.AbstractC1856m
    /* renamed from: l */
    public final boolean mo4383l(String str) {
        m4385w();
        return super.mo4383l(str);
    }

    @Override // p142r6.AbstractC1856m
    /* renamed from: m */
    public final boolean mo4371m() {
        return this.f8356m instanceof C1845b;
    }

    /* renamed from: v */
    public final String m4384v() {
        return mo4381c(mo4344p());
    }

    /* renamed from: w */
    public final void m4385w() {
        Object obj = this.f8356m;
        if (obj instanceof C1845b) {
            return;
        }
        C1845b c1845b = new C1845b();
        this.f8356m = c1845b;
        if (obj != null) {
            c1845b.m4343i(mo4344p(), (String) obj);
        }
    }
}
