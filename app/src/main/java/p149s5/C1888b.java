package p149s5;

import java.io.PrintStream;
import p141r5.AbstractC1840b;

/* renamed from: s5.b */
/* loaded from: classes.dex */
public final class C1888b extends AbstractC1840b {

    /* renamed from: f */
    public final String f8437f;

    /* renamed from: g */
    public final boolean f8438g = false;

    public C1888b(String str) {
        this.f8437f = str;
    }

    @Override // p141r5.AbstractC1841c
    /* renamed from: b */
    public final void mo4330b(PrintStream printStream) {
        StringBuilder sb;
        boolean z6 = this.f8438g;
        String str = this.f8437f;
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
