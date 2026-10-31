package p036e2;

import java.util.ArrayList;
import java.util.regex.Pattern;

/* renamed from: e2.a4 */
/* loaded from: classes.dex */
public final class C0961a4 {

    /* renamed from: a */
    public static volatile C0961a4 f4938a;

    /* renamed from: b */
    public static final Pattern f4939b = Pattern.compile("\\s*|\t|\r|\n");

    /* renamed from: c */
    public static final boolean f4940c = true;

    /* renamed from: d */
    public static final boolean f4941d = true;

    public C0961a4() {
        new ArrayList();
        new ArrayList();
    }

    /* renamed from: a */
    public static C0961a4 m2954a() {
        if (f4938a == null) {
            synchronized (C0961a4.class) {
                if (f4938a == null) {
                    f4938a = new C0961a4();
                }
            }
        }
        return f4938a;
    }
}
