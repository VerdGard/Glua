package p015b6;

import p007a6.C0058a;
import p040e6.AbstractC1142c;
import p040e6.C1141b;
import p048f6.C1182a;

/* renamed from: b6.a */
/* loaded from: classes.dex */
public class C0541a extends C0058a {

    /* renamed from: b6.a$a */
    public static final class a {

        /* renamed from: a */
        public static final Integer f2698a;

        /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
        static {
            /*
                r0 = 0
                java.lang.String r1 = "android.os.Build$VERSION"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L18
                java.lang.String r2 = "SDK_INT"
                java.lang.reflect.Field r1 = r1.getField(r2)     // Catch: java.lang.Throwable -> L18
                java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L18
                boolean r2 = r1 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L18
                if (r2 == 0) goto L19
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L18
                goto L1a
            L18:
            L19:
                r1 = r0
            L1a:
                if (r1 == 0) goto L28
                int r2 = r1.intValue()
                if (r2 <= 0) goto L24
                r2 = 1
                goto L25
            L24:
                r2 = 0
            L25:
                if (r2 == 0) goto L28
                r0 = r1
            L28:
                p015b6.C0541a.a.f2698a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p015b6.C0541a.a.<clinit>():void");
        }
    }

    @Override // p203z5.C2288a
    /* renamed from: a */
    public final AbstractC1142c mo1853a() {
        Integer num = a.f2698a;
        return num == null || num.intValue() >= 34 ? new C1182a() : new C1141b();
    }
}
