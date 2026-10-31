package p072i6;

import java.io.Serializable;
import java.util.regex.Pattern;
import p032d6.C0898f;

/* renamed from: i6.a */
/* loaded from: classes.dex */
public final class C1390a implements Serializable {

    /* renamed from: c */
    public final Pattern f6718c;

    public C1390a() {
        Pattern compile = Pattern.compile("\\r|\\n|\\r\\n");
        C0898f.m2605d(compile, "compile(pattern)");
        this.f6718c = compile;
    }

    public final String toString() {
        String pattern = this.f6718c.toString();
        C0898f.m2605d(pattern, "nativePattern.toString()");
        return pattern;
    }
}
