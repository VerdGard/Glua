package p019c2;

import android.ext.C0089a;
import com.android.dx.command.dexer.Main;

/* renamed from: c2.d */
/* loaded from: classes.dex */
public final class C0596d {
    /* renamed from: a */
    public static void m2043a(String str, String str2, String str3) {
        String[] strArr = {"--verbose", "--num-threads=" + Runtime.getRuntime().availableProcessors(), C0089a.m208f("--output=", str), str2, str3};
        Main.Arguments arguments = new Main.Arguments();
        arguments.parse(strArr);
        try {
            Main.run(arguments);
        } catch (Exception e7) {
            e7.getMessage();
        }
    }
}
