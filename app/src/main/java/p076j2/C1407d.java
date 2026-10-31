package p076j2;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import java.util.HashMap;
import java.util.Map;
import p043f1.AbstractC1163h;
import p120p.C1686g;

@TargetApi(19)
/* renamed from: j2.d */
/* loaded from: classes.dex */
public final class C1407d {

    /* renamed from: a */
    public final C1405b<Object, Bitmap> f6766a;

    /* renamed from: b */
    public final HashMap f6767b;

    /* renamed from: j2.d$a */
    public static class a extends AbstractC1163h {
        public a() {
            super(1);
        }
    }

    static {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap.Config config2 = Bitmap.Config.RGB_565;
        Bitmap.Config config3 = Bitmap.Config.ARGB_4444;
        Bitmap.Config config4 = Bitmap.Config.ALPHA_8;
    }

    public C1407d() {
        new a();
        this.f6766a = new C1405b<>();
        this.f6767b = new HashMap();
    }

    public final String toString() {
        StringBuilder m4107b = C1686g.m4107b("SizeConfigStrategy{groupedMap=");
        m4107b.append(this.f6766a);
        m4107b.append(", sortedSizes=(");
        HashMap hashMap = this.f6767b;
        for (Map.Entry entry : hashMap.entrySet()) {
            m4107b.append(entry.getKey());
            m4107b.append('[');
            m4107b.append(entry.getValue());
            m4107b.append("], ");
        }
        if (!hashMap.isEmpty()) {
            m4107b.replace(m4107b.length() - 2, m4107b.length(), "");
        }
        m4107b.append(")}");
        return m4107b.toString();
    }
}
