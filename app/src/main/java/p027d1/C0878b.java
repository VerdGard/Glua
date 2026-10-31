package p027d1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p002a1.C0024k;

/* renamed from: d1.b */
/* loaded from: classes.dex */
public final class C0878b {

    /* renamed from: a */
    public final Context f4651a;

    /* renamed from: b */
    public final String f4652b;

    /* renamed from: c */
    public final Map<String, C0024k> f4653c;

    /* renamed from: d */
    public final HashMap f4654d = new HashMap();

    public C0878b(Drawable.Callback callback, String str, Map map) {
        this.f4652b = str;
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            this.f4652b = str.concat("/");
        }
        if (callback instanceof View) {
            this.f4651a = ((View) callback).getContext();
            this.f4653c = map;
        } else {
            Log.w("LOTTIE", "LottieDrawable must be inside of a view for images to work.");
            this.f4653c = new HashMap();
            this.f4651a = null;
        }
    }

    /* renamed from: a */
    public final void m2566a() {
        Iterator it = this.f4654d.entrySet().iterator();
        while (it.hasNext()) {
            ((Bitmap) ((Map.Entry) it.next()).getValue()).recycle();
            it.remove();
        }
    }
}
