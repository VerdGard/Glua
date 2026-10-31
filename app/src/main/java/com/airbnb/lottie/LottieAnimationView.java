package com.airbnb.lottie;

import android.content.Context;
import android.content.res.TypedArray;
import android.ext.C0089a;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.JsonReader;
import android.util.SparseArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;
import p002a1.C0015b;
import p002a1.C0018e;
import p002a1.C0019f;
import p002a1.C0020g;
import p002a1.C0021h;
import p002a1.C0022i;
import p002a1.C0023j;
import p002a1.C0027n;
import p002a1.C0028o;
import p002a1.C0029p;
import p002a1.InterfaceC0014a;
import p002a1.InterfaceC0016c;
import p002a1.InterfaceC0025l;
import p002a1.InterfaceC0026m;
import p027d1.C0877a;
import p027d1.C0878b;
import p035e1.C0953e;
import p067i1.AsyncTaskC1319a;
import p075j1.ChoreographerFrameCallbackC1401b;
import p083k1.C1449c;
import p120p.C1686g;

/* loaded from: classes.dex */
public class LottieAnimationView extends AppCompatImageView {

    /* renamed from: E1 */
    public static final SparseArray<C0680a> f3224E1 = new SparseArray<>();

    /* renamed from: F1 */
    public static final SparseArray<WeakReference<C0680a>> f3225F1 = new SparseArray<>();

    /* renamed from: G1 */
    public static final HashMap f3226G1 = new HashMap();

    /* renamed from: H1 */
    public static final HashMap f3227H1 = new HashMap();

    /* renamed from: A1 */
    public boolean f3228A1;

    /* renamed from: B1 */
    public boolean f3229B1;

    /* renamed from: C1 */
    public InterfaceC0014a f3230C1;

    /* renamed from: D1 */
    public C0680a f3231D1;

    /* renamed from: s */
    public final C0678a f3232s;

    /* renamed from: w1 */
    public final C0020g f3233w1;

    /* renamed from: x1 */
    public int f3234x1;

    /* renamed from: y1 */
    public String f3235y1;

    /* renamed from: z1 */
    public int f3236z1;

    /* renamed from: com.airbnb.lottie.LottieAnimationView$a */
    public class C0678a implements InterfaceC0026m {
        public C0678a() {
        }

        @Override // p002a1.InterfaceC0026m
        /* renamed from: a */
        public final void mo109a(C0680a c0680a) {
            LottieAnimationView lottieAnimationView = LottieAnimationView.this;
            if (c0680a != null) {
                lottieAnimationView.setComposition(c0680a);
            }
            lottieAnimationView.f3230C1 = null;
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$b */
    public static class C0679b extends View.BaseSavedState {
        public static final Parcelable.Creator<C0679b> CREATOR = new a();

        /* renamed from: X */
        public String f3238X;

        /* renamed from: Y */
        public int f3239Y;

        /* renamed from: Z */
        public int f3240Z;

        /* renamed from: c */
        public String f3241c;

        /* renamed from: e */
        public int f3242e;

        /* renamed from: m */
        public float f3243m;

        /* renamed from: s */
        public boolean f3244s;

        /* renamed from: com.airbnb.lottie.LottieAnimationView$b$a */
        public static class a implements Parcelable.Creator<C0679b> {
            @Override // android.os.Parcelable.Creator
            public final C0679b createFromParcel(Parcel parcel) {
                return new C0679b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final C0679b[] newArray(int i7) {
                return new C0679b[i7];
            }
        }

        public C0679b(Parcel parcel) {
            super(parcel);
            this.f3241c = parcel.readString();
            this.f3243m = parcel.readFloat();
            this.f3244s = parcel.readInt() == 1;
            this.f3238X = parcel.readString();
            this.f3239Y = parcel.readInt();
            this.f3240Z = parcel.readInt();
        }

        public C0679b(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeString(this.f3241c);
            parcel.writeFloat(this.f3243m);
            parcel.writeInt(this.f3244s ? 1 : 0);
            parcel.writeString(this.f3238X);
            parcel.writeInt(this.f3239Y);
            parcel.writeInt(this.f3240Z);
        }
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        String string;
        this.f3232s = new C0678a();
        C0020g c0020g = new C0020g();
        this.f3233w1 = c0020g;
        this.f3228A1 = false;
        this.f3229B1 = false;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.f3246a);
        this.f3234x1 = C1686g.m4109d(3)[obtainStyledAttributes.getInt(R$styleable.LottieAnimationView_lottie_cacheStrategy, 1)];
        if (!isInEditMode()) {
            int i7 = R$styleable.LottieAnimationView_lottie_rawRes;
            boolean hasValue = obtainStyledAttributes.hasValue(i7);
            int i8 = R$styleable.LottieAnimationView_lottie_fileName;
            boolean hasValue2 = obtainStyledAttributes.hasValue(i8);
            if (hasValue && hasValue2) {
                throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use use only one at once.");
            }
            if (hasValue) {
                int resourceId = obtainStyledAttributes.getResourceId(i7, 0);
                if (resourceId != 0) {
                    setAnimation(resourceId);
                }
            } else if (hasValue2 && (string = obtainStyledAttributes.getString(i8)) != null) {
                setAnimation(string);
            }
        }
        if (obtainStyledAttributes.getBoolean(R$styleable.LottieAnimationView_lottie_autoPlay, false)) {
            c0020g.m112c();
            this.f3229B1 = true;
        }
        if (obtainStyledAttributes.getBoolean(R$styleable.LottieAnimationView_lottie_loop, false)) {
            c0020g.f47m.setRepeatCount(-1);
        }
        int i9 = R$styleable.LottieAnimationView_lottie_repeatMode;
        if (obtainStyledAttributes.hasValue(i9)) {
            setRepeatMode(obtainStyledAttributes.getInt(i9, 1));
        }
        int i10 = R$styleable.LottieAnimationView_lottie_repeatCount;
        if (obtainStyledAttributes.hasValue(i10)) {
            setRepeatCount(obtainStyledAttributes.getInt(i10, -1));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(R$styleable.LottieAnimationView_lottie_imageAssetsFolder));
        setProgress(obtainStyledAttributes.getFloat(R$styleable.LottieAnimationView_lottie_progress, 0.0f));
        c0020g.f50x1 = obtainStyledAttributes.getBoolean(R$styleable.LottieAnimationView_lottie_enableMergePathsForKitKatAndAbove, false);
        if (c0020g.f46e != null) {
            c0020g.m111b();
        }
        int i11 = R$styleable.LottieAnimationView_lottie_colorFilter;
        if (obtainStyledAttributes.hasValue(i11)) {
            c0020g.m110a(new C0953e("**"), InterfaceC0025l.f91x, new C1449c(new C0028o(obtainStyledAttributes.getColor(i11, 0))));
        }
        int i12 = R$styleable.LottieAnimationView_lottie_scale;
        if (obtainStyledAttributes.hasValue(i12)) {
            c0020g.f48s = obtainStyledAttributes.getFloat(i12, 1.0f);
            c0020g.m114e();
        }
        obtainStyledAttributes.recycle();
        m2182d();
    }

    /* renamed from: c */
    public final void m2181c() {
        InterfaceC0014a interfaceC0014a = this.f3230C1;
        if (interfaceC0014a != null) {
            ((AsyncTaskC1319a) interfaceC0014a).cancel(true);
            this.f3230C1 = null;
        }
    }

    /* renamed from: d */
    public final void m2182d() {
        setLayerType(1, null);
    }

    public C0680a getComposition() {
        return this.f3231D1;
    }

    public long getDuration() {
        C0680a c0680a = this.f3231D1;
        if (c0680a != null) {
            return (long) c0680a.m2184b();
        }
        return 0L;
    }

    public int getFrame() {
        return (int) this.f3233w1.f47m.f6749X;
    }

    public String getImageAssetsFolder() {
        return this.f3233w1.f44Z;
    }

    public C0027n getPerformanceTracker() {
        C0680a c0680a = this.f3233w1.f46e;
        if (c0680a != null) {
            return c0680a.f3247a;
        }
        return null;
    }

    public float getProgress() {
        ChoreographerFrameCallbackC1401b choreographerFrameCallbackC1401b = this.f3233w1.f47m;
        C0680a c0680a = choreographerFrameCallbackC1401b.f6755x1;
        if (c0680a == null) {
            return 0.0f;
        }
        float f7 = choreographerFrameCallbackC1401b.f6749X;
        float f8 = c0680a.f3256j;
        return (f7 - f8) / (c0680a.f3257k - f8);
    }

    public int getRepeatCount() {
        return this.f3233w1.f47m.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.f3233w1.f47m.getRepeatMode();
    }

    public float getScale() {
        return this.f3233w1.f48s;
    }

    public float getSpeed() {
        return this.f3233w1.f47m.f6752m;
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        C0020g c0020g = this.f3233w1;
        if (drawable2 == c0020g) {
            super.invalidateDrawable(c0020g);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f3229B1 && this.f3228A1) {
            this.f3233w1.m112c();
            m2182d();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        C0878b c0878b;
        C0020g c0020g = this.f3233w1;
        if (c0020g.f47m.f6756y1) {
            c0020g.f42X.clear();
            c0020g.f47m.cancel();
            m2182d();
            this.f3228A1 = true;
        }
        if (c0020g != null && (c0878b = c0020g.f43Y) != null) {
            c0878b.m2566a();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0679b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0679b c0679b = (C0679b) parcelable;
        super.onRestoreInstanceState(c0679b.getSuperState());
        String str = c0679b.f3241c;
        this.f3235y1 = str;
        if (!TextUtils.isEmpty(str)) {
            setAnimation(this.f3235y1);
        }
        int i7 = c0679b.f3242e;
        this.f3236z1 = i7;
        if (i7 != 0) {
            setAnimation(i7);
        }
        setProgress(c0679b.f3243m);
        boolean z6 = c0679b.f3244s;
        C0020g c0020g = this.f3233w1;
        if (z6) {
            c0020g.m112c();
            m2182d();
        }
        c0020g.f44Z = c0679b.f3238X;
        setRepeatMode(c0679b.f3239Y);
        setRepeatCount(c0679b.f3240Z);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        float f7;
        C0679b c0679b = new C0679b(super.onSaveInstanceState());
        c0679b.f3241c = this.f3235y1;
        c0679b.f3242e = this.f3236z1;
        C0020g c0020g = this.f3233w1;
        ChoreographerFrameCallbackC1401b choreographerFrameCallbackC1401b = c0020g.f47m;
        C0680a c0680a = choreographerFrameCallbackC1401b.f6755x1;
        if (c0680a == null) {
            f7 = 0.0f;
        } else {
            float f8 = choreographerFrameCallbackC1401b.f6749X;
            float f9 = c0680a.f3256j;
            f7 = (f8 - f9) / (c0680a.f3257k - f9);
        }
        c0679b.f3243m = f7;
        c0679b.f3244s = choreographerFrameCallbackC1401b.f6756y1;
        c0679b.f3238X = c0020g.f44Z;
        c0679b.f3239Y = choreographerFrameCallbackC1401b.getRepeatMode();
        c0679b.f3240Z = c0020g.f47m.getRepeatCount();
        return c0679b;
    }

    public void setAnimation(int i7) {
        int i8 = this.f3234x1;
        this.f3236z1 = i7;
        this.f3235y1 = null;
        SparseArray<WeakReference<C0680a>> sparseArray = f3225F1;
        if (sparseArray.indexOfKey(i7) > 0) {
            C0680a c0680a = sparseArray.get(i7).get();
            if (c0680a != null) {
                setComposition(c0680a);
                return;
            }
        } else {
            SparseArray<C0680a> sparseArray2 = f3224E1;
            if (sparseArray2.indexOfKey(i7) > 0) {
                setComposition(sparseArray2.get(i7));
                return;
            }
        }
        this.f3231D1 = null;
        C0020g c0020g = this.f3233w1;
        C0878b c0878b = c0020g.f43Y;
        if (c0878b != null) {
            c0878b.m2566a();
        }
        ChoreographerFrameCallbackC1401b choreographerFrameCallbackC1401b = c0020g.f47m;
        if (choreographerFrameCallbackC1401b.f6756y1) {
            choreographerFrameCallbackC1401b.cancel();
        }
        c0020g.f46e = null;
        c0020g.f51y1 = null;
        c0020g.f43Y = null;
        c0020g.invalidateSelf();
        m2181c();
        Context context = getContext();
        C0018e c0018e = new C0018e(this, i8, i7);
        JsonReader jsonReader = new JsonReader(new InputStreamReader(context.getResources().openRawResource(i7)));
        AsyncTaskC1319a asyncTaskC1319a = new AsyncTaskC1319a(c0018e);
        asyncTaskC1319a.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, jsonReader);
        this.f3230C1 = asyncTaskC1319a;
    }

    @Deprecated
    public void setAnimation(JSONObject jSONObject) {
        setAnimation(new JsonReader(new StringReader(jSONObject.toString())));
    }

    public void setAnimationFromJson(String str) {
        setAnimation(new JsonReader(new StringReader(str)));
    }

    public void setComposition(C0680a c0680a) {
        boolean z6;
        C0020g c0020g = this.f3233w1;
        c0020g.setCallback(this);
        if (c0020g.f46e == c0680a) {
            z6 = false;
        } else {
            C0878b c0878b = c0020g.f43Y;
            if (c0878b != null) {
                c0878b.m2566a();
            }
            ChoreographerFrameCallbackC1401b choreographerFrameCallbackC1401b = c0020g.f47m;
            if (choreographerFrameCallbackC1401b.f6756y1) {
                choreographerFrameCallbackC1401b.cancel();
            }
            c0020g.f46e = null;
            c0020g.f51y1 = null;
            c0020g.f43Y = null;
            c0020g.invalidateSelf();
            c0020g.f46e = c0680a;
            c0020g.m111b();
            choreographerFrameCallbackC1401b.f6755x1 = c0680a;
            choreographerFrameCallbackC1401b.f6749X = choreographerFrameCallbackC1401b.m3751c();
            choreographerFrameCallbackC1401b.f6753s = System.nanoTime();
            c0020g.m113d(choreographerFrameCallbackC1401b.getAnimatedFraction());
            c0020g.f48s = c0020g.f48s;
            c0020g.m114e();
            c0020g.m114e();
            ArrayList<C0020g.e> arrayList = c0020g.f42X;
            Iterator it = new ArrayList(arrayList).iterator();
            while (it.hasNext()) {
                ((C0020g.e) it.next()).run();
                it.remove();
            }
            arrayList.clear();
            c0680a.f3247a.f92a = c0020g.f41A1;
            z6 = true;
        }
        m2182d();
        if (z6) {
            setImageDrawable(null);
            setImageDrawable(c0020g);
            this.f3231D1 = c0680a;
            requestLayout();
        }
    }

    public void setFontAssetDelegate(C0015b c0015b) {
        C0877a c0877a = this.f3233w1.f49w1;
    }

    public void setFrame(int i7) {
        C0020g c0020g = this.f3233w1;
        C0680a c0680a = c0020g.f46e;
        if (c0680a == null) {
            c0020g.f42X.add(new C0023j(c0020g, i7));
        } else {
            c0020g.m113d(i7 / (c0680a.f3257k - c0680a.f3256j));
        }
    }

    public void setImageAssetDelegate(InterfaceC0016c interfaceC0016c) {
        C0878b c0878b = this.f3233w1.f43Y;
    }

    public void setImageAssetsFolder(String str) {
        this.f3233w1.f44Z = str;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        C0878b c0878b;
        C0020g c0020g = this.f3233w1;
        if (c0020g != null && (c0878b = c0020g.f43Y) != null) {
            c0878b.m2566a();
        }
        m2181c();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C0878b c0878b;
        C0020g c0020g = this.f3233w1;
        if (drawable != c0020g && c0020g != null && (c0878b = c0020g.f43Y) != null) {
            c0878b.m2566a();
        }
        m2181c();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i7) {
        C0878b c0878b;
        C0020g c0020g = this.f3233w1;
        if (c0020g != null && (c0878b = c0020g.f43Y) != null) {
            c0878b.m2566a();
        }
        m2181c();
        super.setImageResource(i7);
    }

    public void setMaxFrame(int i7) {
        float f7 = i7;
        ChoreographerFrameCallbackC1401b choreographerFrameCallbackC1401b = this.f3233w1.f47m;
        choreographerFrameCallbackC1401b.f6754w1 = f7;
        if (choreographerFrameCallbackC1401b.f6749X > f7) {
            choreographerFrameCallbackC1401b.f6749X = f7;
        }
    }

    public void setMaxProgress(float f7) {
        C0020g c0020g = this.f3233w1;
        C0680a c0680a = c0020g.f46e;
        if (c0680a == null) {
            c0020g.f42X.add(new C0022i(c0020g, f7));
            return;
        }
        float f8 = (int) ((c0680a.f3257k - c0680a.f3256j) * f7);
        ChoreographerFrameCallbackC1401b choreographerFrameCallbackC1401b = c0020g.f47m;
        choreographerFrameCallbackC1401b.f6754w1 = f8;
        if (choreographerFrameCallbackC1401b.f6749X > f8) {
            choreographerFrameCallbackC1401b.f6749X = f8;
        }
    }

    public void setMinFrame(int i7) {
        float f7 = i7;
        ChoreographerFrameCallbackC1401b choreographerFrameCallbackC1401b = this.f3233w1.f47m;
        choreographerFrameCallbackC1401b.f6751Z = f7;
        if (choreographerFrameCallbackC1401b.f6749X < f7) {
            choreographerFrameCallbackC1401b.f6749X = f7;
        }
    }

    public void setMinProgress(float f7) {
        C0020g c0020g = this.f3233w1;
        C0680a c0680a = c0020g.f46e;
        if (c0680a == null) {
            c0020g.f42X.add(new C0021h(c0020g, f7));
            return;
        }
        float f8 = (int) ((c0680a.f3257k - c0680a.f3256j) * f7);
        ChoreographerFrameCallbackC1401b choreographerFrameCallbackC1401b = c0020g.f47m;
        choreographerFrameCallbackC1401b.f6751Z = f8;
        if (choreographerFrameCallbackC1401b.f6749X < f8) {
            choreographerFrameCallbackC1401b.f6749X = f8;
        }
    }

    public void setPerformanceTrackingEnabled(boolean z6) {
        C0020g c0020g = this.f3233w1;
        c0020g.f41A1 = z6;
        C0680a c0680a = c0020g.f46e;
        if (c0680a != null) {
            c0680a.f3247a.f92a = z6;
        }
    }

    public void setProgress(float f7) {
        this.f3233w1.m113d(f7);
    }

    public void setRepeatCount(int i7) {
        this.f3233w1.f47m.setRepeatCount(i7);
    }

    public void setRepeatMode(int i7) {
        this.f3233w1.f47m.setRepeatMode(i7);
    }

    public void setScale(float f7) {
        C0020g c0020g = this.f3233w1;
        c0020g.f48s = f7;
        c0020g.m114e();
        if (getDrawable() == c0020g) {
            setImageDrawable(null);
            setImageDrawable(c0020g);
        }
    }

    public void setSpeed(float f7) {
        this.f3233w1.f47m.f6752m = f7;
    }

    public void setTextDelegate(C0029p c0029p) {
        this.f3233w1.getClass();
    }

    public void setAnimation(JsonReader jsonReader) {
        this.f3231D1 = null;
        C0020g c0020g = this.f3233w1;
        C0878b c0878b = c0020g.f43Y;
        if (c0878b != null) {
            c0878b.m2566a();
        }
        ChoreographerFrameCallbackC1401b choreographerFrameCallbackC1401b = c0020g.f47m;
        if (choreographerFrameCallbackC1401b.f6756y1) {
            choreographerFrameCallbackC1401b.cancel();
        }
        c0020g.f46e = null;
        c0020g.f51y1 = null;
        c0020g.f43Y = null;
        c0020g.invalidateSelf();
        m2181c();
        AsyncTaskC1319a asyncTaskC1319a = new AsyncTaskC1319a(this.f3232s);
        asyncTaskC1319a.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, jsonReader);
        this.f3230C1 = asyncTaskC1319a;
    }

    public void setAnimation(String str) {
        int i7 = this.f3234x1;
        this.f3235y1 = str;
        this.f3236z1 = 0;
        HashMap hashMap = f3227H1;
        if (hashMap.containsKey(str)) {
            C0680a c0680a = (C0680a) ((WeakReference) hashMap.get(str)).get();
            if (c0680a != null) {
                setComposition(c0680a);
                return;
            }
        } else {
            HashMap hashMap2 = f3226G1;
            if (hashMap2.containsKey(str)) {
                setComposition((C0680a) hashMap2.get(str));
                return;
            }
        }
        this.f3231D1 = null;
        C0020g c0020g = this.f3233w1;
        C0878b c0878b = c0020g.f43Y;
        if (c0878b != null) {
            c0878b.m2566a();
        }
        ChoreographerFrameCallbackC1401b choreographerFrameCallbackC1401b = c0020g.f47m;
        if (choreographerFrameCallbackC1401b.f6756y1) {
            choreographerFrameCallbackC1401b.cancel();
        }
        c0020g.f46e = null;
        c0020g.f51y1 = null;
        c0020g.f43Y = null;
        c0020g.invalidateSelf();
        m2181c();
        Context context = getContext();
        C0019f c0019f = new C0019f(this, i7, str);
        try {
            JsonReader jsonReader = new JsonReader(new InputStreamReader(context.getAssets().open(str)));
            AsyncTaskC1319a asyncTaskC1319a = new AsyncTaskC1319a(c0019f);
            asyncTaskC1319a.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, jsonReader);
            this.f3230C1 = asyncTaskC1319a;
        } catch (IOException e7) {
            throw new IllegalArgumentException(C0089a.m208f("Unable to find file ", str), e7);
        }
    }
}
