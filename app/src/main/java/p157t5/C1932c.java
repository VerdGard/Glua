package p157t5;

import java.io.PrintStream;
import p141r5.AbstractC1841c;
import p141r5.AbstractC1843e;

/* renamed from: t5.c */
/* loaded from: classes.dex */
public final class C1932c extends AbstractC1843e {

    /* renamed from: e */
    public final String f8724e;

    /* renamed from: f */
    public final boolean f8725f;

    public C1932c(String str, boolean z6) {
        this.f8724e = str;
        this.f8725f = z6;
    }

    @Override // p141r5.AbstractC1841c
    /* renamed from: b */
    public final void mo4330b(PrintStream printStream) {
        StringBuilder sb;
        if (AbstractC1841c.f8313d) {
            boolean z6 = this.f8725f;
            String str = this.f8724e;
            if (z6) {
                sb = new StringBuilder("--[[");
                sb.append(str);
                str = "]]";
            } else {
                sb = new StringBuilder("--");
            }
            sb.append(str);
            printStream.print(sb.toString());
        }
    }
}
