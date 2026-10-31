package p044f2;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import androidx.appcompat.widget.C0246m;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p016c.C0572z;
import p043f1.C1160e;
import p060h2.EnumC1292a;
import p068i2.C1329a;
import p076j2.InterfaceC1404a;
import p084k2.InterfaceC1457g;
import p100m2.C1545a;
import p100m2.C1546b;
import p100m2.C1547c;
import p100m2.InterfaceC1548d;
import p108n2.C1639a;
import p108n2.C1640b;
import p108n2.C1641c;
import p108n2.C1642d;
import p115o2.C1665a;
import p120p.C1682c;
import p130q2.C1742c;
import p130q2.C1743d;
import p138r2.AbstractC1822a;
import p146s2.C1878a;
import p154t2.C1923a;
import p162u2.C1969a;
import p169v2.C2014a;
import p176w2.C2119b;
import p176w2.InterfaceC2118a;
import p184x2.C2190b;
import p200z2.C2278b;

/* renamed from: f2.a */
/* loaded from: classes.dex */
public final class C1164a {

    /* renamed from: e */
    public static volatile C1164a f5721e;

    /* renamed from: a */
    public final C1545a f5722a;

    /* renamed from: b */
    public final C1329a f5723b;

    /* renamed from: c */
    public final InterfaceC1404a f5724c;

    /* renamed from: d */
    public final InterfaceC1457g f5725d;

    public C1164a(C1329a c1329a, InterfaceC1457g interfaceC1457g, InterfaceC1404a interfaceC1404a, Context context, EnumC1292a enumC1292a) {
        C2014a c2014a = new C2014a();
        this.f5723b = c1329a;
        this.f5724c = interfaceC1404a;
        this.f5725d = interfaceC1457g;
        this.f5722a = new C1545a(context);
        new Handler(Looper.getMainLooper());
        new Handler(Looper.getMainLooper());
        C2190b c2190b = new C2190b();
        C1160e c1160e = new C1160e(interfaceC1404a, enumC1292a);
        c2190b.m5322a(InputStream.class, Bitmap.class, c1160e);
        C1742c c1742c = new C1742c(interfaceC1404a, enumC1292a);
        c2190b.m5322a(ParcelFileDescriptor.class, Bitmap.class, c1742c);
        C1742c c1742c2 = new C1742c(c1160e, c1742c);
        c2190b.m5322a(C1547c.class, Bitmap.class, c1742c2);
        C1742c c1742c3 = new C1742c();
        c2190b.m5322a(InputStream.class, C1923a.class, c1742c3);
        c2190b.m5322a(C1547c.class, C1969a.class, new C1682c(c1742c2, c1742c3));
        c2190b.m5322a(InputStream.class, File.class, new C1878a());
        m3360b(File.class, ParcelFileDescriptor.class, new C1639a(0));
        m3360b(File.class, InputStream.class, new C1641c(1));
        Class cls = Integer.TYPE;
        m3360b(cls, ParcelFileDescriptor.class, new C1640b(0));
        m3360b(cls, InputStream.class, new C1642d(1));
        m3360b(Integer.class, ParcelFileDescriptor.class, new C1640b(0));
        m3360b(Integer.class, InputStream.class, new C1642d(1));
        m3360b(String.class, ParcelFileDescriptor.class, new C1641c(0));
        m3360b(String.class, InputStream.class, new C1639a(1));
        m3360b(Uri.class, ParcelFileDescriptor.class, new C1642d(0));
        m3360b(Uri.class, InputStream.class, new C1640b(2));
        m3360b(URL.class, InputStream.class, new C1641c(2));
        m3360b(C1546b.class, InputStream.class, new C1665a());
        m3360b(byte[].class, InputStream.class, new C1640b(1));
        C0246m c0246m = new C0246m(context.getResources(), interfaceC1404a);
        HashMap hashMap = c2014a.f9164a;
        hashMap.put(new C2278b(Bitmap.class, C1743d.class), c0246m);
        hashMap.put(new C2278b(C1969a.class, AbstractC1822a.class), new C0572z(7, new C0246m(context.getResources(), interfaceC1404a)));
    }

    /* renamed from: a */
    public static C1164a m3359a(Context context) {
        if (f5721e == null) {
            synchronized (C1164a.class) {
                if (f5721e == null) {
                    Context applicationContext = context.getApplicationContext();
                    ArrayList m5167a = new C2119b(applicationContext).m5167a();
                    C1165b c1165b = new C1165b(applicationContext);
                    Iterator it = m5167a.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC2118a) it.next()).m5164a();
                    }
                    f5721e = c1165b.m3361a();
                    Iterator it2 = m5167a.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC2118a) it2.next()).m5165b();
                    }
                }
            }
        }
        return f5721e;
    }

    /* renamed from: b */
    public final <T, Y> void m3360b(Class<T> cls, Class<Y> cls2, InterfaceC1548d<T, Y> interfaceC1548d) {
        InterfaceC1548d interfaceC1548d2;
        C1545a c1545a = this.f5722a;
        synchronized (c1545a) {
            c1545a.f7210b.clear();
            Map map = (Map) c1545a.f7209a.get(cls);
            if (map == null) {
                map = new HashMap();
                c1545a.f7209a.put(cls, map);
            }
            interfaceC1548d2 = (InterfaceC1548d) map.put(cls2, interfaceC1548d);
            if (interfaceC1548d2 != null) {
                Iterator it = c1545a.f7209a.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((Map) it.next()).containsValue(interfaceC1548d2)) {
                        interfaceC1548d2 = null;
                        break;
                    }
                }
            }
        }
        if (interfaceC1548d2 != null) {
            interfaceC1548d2.mo3946a();
        }
    }
}
