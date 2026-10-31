package androidx.activity.result;

import android.content.Intent;
import android.graphics.Path;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import com.google.android.material.carousel.C0771a;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import p036e2.C1024j4;
import p036e2.C1087s4;
import p036e2.InterfaceC1031k4;
import p053g3.InterfaceC1212b;
import p117o4.C1667a;

/* renamed from: androidx.activity.result.c */
/* loaded from: classes.dex */
public abstract class AbstractC0136c implements InterfaceC1031k4 {

    /* renamed from: c */
    public static C1667a.a f250c;

    /* renamed from: p */
    public static String m379p(Throwable th) {
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof UnknownHostException) {
                return "";
            }
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: e */
    public abstract String mo380e();

    /* renamed from: f */
    public String m381f(C1024j4 c1024j4) {
        InetSocketAddress m3060a = c1024j4.m3060a();
        if (m3060a == null) {
            throw new C1087s4("socket not bound");
        }
        return "<cross-domain-policy><allow-access-from domain=\"*\" to-ports=\"" + m3060a.getPort() + "\" /></cross-domain-policy>\u0000";
    }

    /* renamed from: g */
    public void m382g(int i7, String str) {
        if (!mo387o() || i7 < 2) {
            return;
        }
        Log.println(i7, mo380e(), str);
    }

    /* renamed from: h */
    public void m383h(Exception exc) {
        m382g(3, m379p(exc));
    }

    /* renamed from: i */
    public void m384i(String str, Exception exc) {
        m382g(2, str + '\n' + m379p(exc));
    }

    /* renamed from: l */
    public void m385l(String str, Exception exc) {
        m382g(3, str + '\n' + m379p(exc));
    }

    /* renamed from: n */
    public void m386n(Throwable th) {
        m382g(5, m379p(th));
    }

    /* renamed from: o */
    public abstract boolean mo387o();

    /* renamed from: q */
    public void m388q(String str, Exception exc) {
        m382g(6, str + '\n' + m379p(exc));
    }

    /* renamed from: r */
    public abstract Path mo389r(float f7, float f8, float f9, float f10);

    /* renamed from: s */
    public abstract View mo390s(int i7);

    /* renamed from: t */
    public abstract C0771a mo391t(InterfaceC1212b interfaceC1212b, View view);

    /* renamed from: u */
    public abstract void mo392u(int i7);

    /* renamed from: v */
    public abstract void mo393v(Typeface typeface, boolean z6);

    /* renamed from: w */
    public abstract boolean mo394w();

    /* renamed from: x */
    public abstract Object mo395x(Intent intent, int i7);
}
