package p027d1;

import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import java.util.HashMap;
import p035e1.C0955g;

/* renamed from: d1.a */
/* loaded from: classes.dex */
public final class C0877a {

    /* renamed from: d */
    public final AssetManager f4649d;

    /* renamed from: a */
    public final C0955g f4646a = new C0955g();

    /* renamed from: b */
    public final HashMap f4647b = new HashMap();

    /* renamed from: c */
    public final HashMap f4648c = new HashMap();

    /* renamed from: e */
    public final String f4650e = ".ttf";

    public C0877a(Drawable.Callback callback) {
        AssetManager assets;
        if (callback instanceof View) {
            assets = ((View) callback).getContext().getAssets();
        } else {
            Log.w("LOTTIE", "LottieDrawable must be inside of a view for images to work.");
            assets = null;
        }
        this.f4649d = assets;
    }
}
