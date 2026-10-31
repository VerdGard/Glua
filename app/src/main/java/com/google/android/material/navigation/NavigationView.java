package com.google.android.material.navigation;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.activity.C0117b;
import androidx.activity.RunnableC0125j;
import androidx.appcompat.R$attr;
import androidx.appcompat.view.menu.C0161h;
import androidx.appcompat.view.menu.InterfaceC0163j;
import androidx.appcompat.widget.C0233h1;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.NavigationMenuView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p002a1.C0017d;
import p004a3.C0034a;
import p034e0.C0923h0;
import p034e0.C0935n0;
import p034e0.C0946x;
import p049g.C1188f;
import p082k0.AbstractC1446a;
import p131q3.C1752h;
import p131q3.C1753i;
import p131q3.C1757m;
import p139r3.C1826d;
import p139r3.C1831i;
import p139r3.InterfaceC1824b;
import p147s3.C1880b;
import p147s3.C1881c;
import p147s3.ViewTreeObserverOnGlobalLayoutListenerC1883e;
import p166v.C2009a;
import p181x.C2152a;
import p193y3.AbstractC2245n;
import p193y3.C2232a;
import p193y3.C2237f;
import p193y3.C2240i;
import p193y3.C2241j;

/* loaded from: classes.dex */
public class NavigationView extends C1757m implements InterfaceC1824b {

    /* renamed from: M1 */
    public static final int[] f4332M1 = {R.attr.state_checked};

    /* renamed from: N1 */
    public static final int[] f4333N1 = {-16842910};

    /* renamed from: O1 */
    public static final int f4334O1 = R$style.Widget_Design_NavigationView;

    /* renamed from: A1 */
    public final C1753i f4335A1;

    /* renamed from: B1 */
    public final int f4336B1;

    /* renamed from: C1 */
    public final int[] f4337C1;

    /* renamed from: D1 */
    public C1188f f4338D1;

    /* renamed from: E1 */
    public ViewTreeObserverOnGlobalLayoutListenerC1883e f4339E1;

    /* renamed from: F1 */
    public boolean f4340F1;

    /* renamed from: G1 */
    public boolean f4341G1;

    /* renamed from: H1 */
    public final int f4342H1;

    /* renamed from: I1 */
    public final AbstractC2245n f4343I1;

    /* renamed from: J1 */
    public final C1831i f4344J1;

    /* renamed from: K1 */
    public final C1826d f4345K1;

    /* renamed from: L1 */
    public final C0822a f4346L1;

    /* renamed from: z1 */
    public final C1752h f4347z1;

    /* renamed from: com.google.android.material.navigation.NavigationView$a */
    public class C0822a extends DrawerLayout.AbstractC0311g {
        public C0822a() {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC0308d
        /* renamed from: c */
        public final void mo1058c(View view) {
            NavigationView navigationView = NavigationView.this;
            if (view == navigationView) {
                C1826d c1826d = navigationView.f4345K1;
                Objects.requireNonNull(c1826d);
                view.post(new RunnableC0125j(2, c1826d));
            }
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC0308d
        /* renamed from: d */
        public final void mo1059d(View view) {
            C1826d c1826d;
            C1826d.a aVar;
            NavigationView navigationView = NavigationView.this;
            if (view != navigationView || (aVar = (c1826d = navigationView.f4345K1).f8263a) == null) {
                return;
            }
            aVar.m4304c(c1826d.f8265c);
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationView$b */
    public interface InterfaceC0823b {
    }

    /* renamed from: com.google.android.material.navigation.NavigationView$c */
    public static class C0824c extends AbstractC1446a {
        public static final Parcelable.Creator<C0824c> CREATOR = new a();

        /* renamed from: m */
        public Bundle f4349m;

        /* renamed from: com.google.android.material.navigation.NavigationView$c$a */
        public class a implements Parcelable.ClassLoaderCreator<C0824c> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new C0824c(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i7) {
                return new C0824c[i7];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final C0824c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0824c(parcel, classLoader);
            }
        }

        public C0824c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f4349m = parcel.readBundle(classLoader);
        }

        public C0824c(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // p082k0.AbstractC1446a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            parcel.writeParcelable(this.f6946c, i7);
            parcel.writeBundle(this.f4349m);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NavigationView(android.content.Context r18, android.util.AttributeSet r19) {
        /*
            Method dump skipped, instructions count: 785
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private MenuInflater getMenuInflater() {
        if (this.f4338D1 == null) {
            this.f4338D1 = new C1188f(getContext());
        }
        return this.f4338D1;
    }

    @Override // p139r3.InterfaceC1824b
    /* renamed from: a */
    public final void mo2308a() {
        Pair<DrawerLayout, DrawerLayout.C0309e> m2480i = m2480i();
        final DrawerLayout drawerLayout = (DrawerLayout) m2480i.first;
        C1831i c1831i = this.f4344J1;
        C0117b c0117b = c1831i.f8261f;
        c1831i.f8261f = null;
        if (c0117b == null || Build.VERSION.SDK_INT < 34) {
            drawerLayout.m1036c(this, true);
            return;
        }
        int i7 = ((DrawerLayout.C0309e) m2480i.second).f1535a;
        int i8 = C1881c.f8425a;
        c1831i.m4308b(c0117b, i7, new C1880b(drawerLayout, this), new ValueAnimator.AnimatorUpdateListener() { // from class: s3.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                DrawerLayout.this.setScrimColor(C2152a.m5266e(-1728053248, C0034a.m127b(valueAnimator.getAnimatedFraction(), C1881c.f8425a, 0)));
            }
        });
    }

    @Override // p139r3.InterfaceC1824b
    /* renamed from: b */
    public final void mo2309b(C0117b c0117b) {
        m2480i();
        this.f4344J1.f8261f = c0117b;
    }

    @Override // p139r3.InterfaceC1824b
    /* renamed from: c */
    public final void mo2310c(C0117b c0117b) {
        int i7 = ((DrawerLayout.C0309e) m2480i().second).f1535a;
        C1831i c1831i = this.f4344J1;
        if (c1831i.f8261f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        C0117b c0117b2 = c1831i.f8261f;
        c1831i.f8261f = c0117b;
        if (c0117b2 == null) {
            return;
        }
        c1831i.m4309c(c0117b.f221c, i7, c0117b.f222d == 0);
    }

    @Override // p139r3.InterfaceC1824b
    /* renamed from: d */
    public final void mo2311d() {
        m2480i();
        this.f4344J1.m4307a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        AbstractC2245n abstractC2245n = this.f4343I1;
        if (abstractC2245n.mo5453b()) {
            Path path = abstractC2245n.f10253e;
            if (!path.isEmpty()) {
                canvas.save();
                canvas.clipPath(path);
                super.dispatchDraw(canvas);
                canvas.restore();
                return;
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // p131q3.C1757m
    /* renamed from: e */
    public final void mo2477e(C0935n0 c0935n0) {
        C1753i c1753i = this.f4335A1;
        c1753i.getClass();
        int m2754e = c0935n0.m2754e();
        if (c1753i.f8056O1 != m2754e) {
            c1753i.f8056O1 = m2754e;
            c1753i.m4226a();
        }
        NavigationMenuView navigationMenuView = c1753i.f8063c;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, c0935n0.m2751b());
        C0946x.m2801b(c1753i.f8064e, c0935n0);
    }

    /* renamed from: g */
    public final ColorStateList m2478g(int i7) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i7, typedValue, true)) {
            return null;
        }
        ColorStateList m4896c = C2009a.m4896c(typedValue.resourceId, getContext());
        if (!getContext().getTheme().resolveAttribute(R$attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i8 = typedValue.data;
        int defaultColor = m4896c.getDefaultColor();
        int[] iArr = f4333N1;
        return new ColorStateList(new int[][]{iArr, f4332M1, FrameLayout.EMPTY_STATE_SET}, new int[]{m4896c.getColorForState(iArr, defaultColor), i8, defaultColor});
    }

    public C1831i getBackHelper() {
        return this.f4344J1;
    }

    public MenuItem getCheckedItem() {
        return this.f4335A1.f8060X.f8073d;
    }

    public int getDividerInsetEnd() {
        return this.f4335A1.f8050I1;
    }

    public int getDividerInsetStart() {
        return this.f4335A1.f8049H1;
    }

    public int getHeaderCount() {
        return this.f4335A1.f8064e.getChildCount();
    }

    public Drawable getItemBackground() {
        return this.f4335A1.f8043B1;
    }

    public int getItemHorizontalPadding() {
        return this.f4335A1.f8045D1;
    }

    public int getItemIconPadding() {
        return this.f4335A1.f8047F1;
    }

    public ColorStateList getItemIconTintList() {
        return this.f4335A1.f8042A1;
    }

    public int getItemMaxLines() {
        return this.f4335A1.f8055N1;
    }

    public ColorStateList getItemTextColor() {
        return this.f4335A1.f8070z1;
    }

    public int getItemVerticalPadding() {
        return this.f4335A1.f8046E1;
    }

    public Menu getMenu() {
        return this.f4347z1;
    }

    public int getSubheaderInsetEnd() {
        return this.f4335A1.f8052K1;
    }

    public int getSubheaderInsetStart() {
        return this.f4335A1.f8051J1;
    }

    /* renamed from: h */
    public final InsetDrawable m2479h(C0233h1 c0233h1, ColorStateList colorStateList) {
        C2237f c2237f = new C2237f(new C2240i(C2240i.m5432a(getContext(), c0233h1.m799i(R$styleable.NavigationView_itemShapeAppearance, 0), c0233h1.m799i(R$styleable.NavigationView_itemShapeAppearanceOverlay, 0), new C2232a(0))));
        c2237f.m5428k(colorStateList);
        return new InsetDrawable((Drawable) c2237f, c0233h1.m794d(R$styleable.NavigationView_itemShapeInsetStart, 0), c0233h1.m794d(R$styleable.NavigationView_itemShapeInsetTop, 0), c0233h1.m794d(R$styleable.NavigationView_itemShapeInsetEnd, 0), c0233h1.m794d(R$styleable.NavigationView_itemShapeInsetBottom, 0));
    }

    /* renamed from: i */
    public final Pair<DrawerLayout, DrawerLayout.C0309e> m2480i() {
        ViewParent parent = getParent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if ((parent instanceof DrawerLayout) && (layoutParams instanceof DrawerLayout.C0309e)) {
            return new Pair<>((DrawerLayout) parent, (DrawerLayout.C0309e) layoutParams);
        }
        throw new IllegalStateException("NavigationView back progress requires the direct parent view to be a DrawerLayout.");
    }

    @Override // p131q3.C1757m, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0017d.m77Q(this);
        ViewParent parent = getParent();
        if (parent instanceof DrawerLayout) {
            if (this.f4345K1.f8263a != null) {
                DrawerLayout drawerLayout = (DrawerLayout) parent;
                C0822a c0822a = this.f4346L1;
                if (c0822a == null) {
                    drawerLayout.getClass();
                } else {
                    ArrayList arrayList = drawerLayout.f1514L1;
                    if (arrayList != null) {
                        arrayList.remove(c0822a);
                    }
                }
                drawerLayout.m1034a(c0822a);
            }
        }
    }

    @Override // p131q3.C1757m, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f4339E1);
        ViewParent parent = getParent();
        if (parent instanceof DrawerLayout) {
            DrawerLayout drawerLayout = (DrawerLayout) parent;
            C0822a c0822a = this.f4346L1;
            if (c0822a == null) {
                drawerLayout.getClass();
                return;
            }
            ArrayList arrayList = drawerLayout.f1514L1;
            if (arrayList == null) {
                return;
            }
            arrayList.remove(c0822a);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        int mode = View.MeasureSpec.getMode(i7);
        int i9 = this.f4336B1;
        if (mode == Integer.MIN_VALUE) {
            i7 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i7), i9), 1073741824);
        } else if (mode == 0) {
            i7 = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
        }
        super.onMeasure(i7, i8);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0824c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0824c c0824c = (C0824c) parcelable;
        super.onRestoreInstanceState(c0824c.f6946c);
        Bundle bundle = c0824c.f4349m;
        C1752h c1752h = this.f4347z1;
        c1752h.getClass();
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null) {
            CopyOnWriteArrayList<WeakReference<InterfaceC0163j>> copyOnWriteArrayList = c1752h.f492u;
            if (copyOnWriteArrayList.isEmpty()) {
                return;
            }
            Iterator<WeakReference<InterfaceC0163j>> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference<InterfaceC0163j> next = it.next();
                InterfaceC0163j interfaceC0163j = next.get();
                if (interfaceC0163j == null) {
                    copyOnWriteArrayList.remove(next);
                } else {
                    int id = interfaceC0163j.getId();
                    if (id > 0 && (parcelable2 = (Parcelable) sparseParcelableArray.get(id)) != null) {
                        interfaceC0163j.mo503f(parcelable2);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable mo508k;
        C0824c c0824c = new C0824c(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        c0824c.f4349m = bundle;
        CopyOnWriteArrayList<WeakReference<InterfaceC0163j>> copyOnWriteArrayList = this.f4347z1.f492u;
        if (!copyOnWriteArrayList.isEmpty()) {
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            Iterator<WeakReference<InterfaceC0163j>> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference<InterfaceC0163j> next = it.next();
                InterfaceC0163j interfaceC0163j = next.get();
                if (interfaceC0163j == null) {
                    copyOnWriteArrayList.remove(next);
                } else {
                    int id = interfaceC0163j.getId();
                    if (id > 0 && (mo508k = interfaceC0163j.mo508k()) != null) {
                        sparseArray.put(id, mo508k);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
        return c0824c;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i8, int i9, int i10) {
        int i11;
        C2240i c2240i;
        C2240i c2240i2;
        super.onSizeChanged(i7, i8, i9, i10);
        if ((getParent() instanceof DrawerLayout) && (getLayoutParams() instanceof DrawerLayout.C0309e) && (i11 = this.f4342H1) > 0 && (getBackground() instanceof C2237f)) {
            int i12 = ((DrawerLayout.C0309e) getLayoutParams()).f1535a;
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            boolean z6 = Gravity.getAbsoluteGravity(i12, C0946x.e.m2847d(this)) == 3;
            C2237f c2237f = (C2237f) getBackground();
            C2240i c2240i3 = c2237f.f10154c.f10163a;
            c2240i3.getClass();
            C2240i.a aVar = new C2240i.a(c2240i3);
            float f7 = i11;
            aVar.m5440e(f7);
            aVar.m5441f(f7);
            aVar.m5439d(f7);
            aVar.m5438c(f7);
            if (z6) {
                aVar.m5440e(0.0f);
                aVar.m5438c(0.0f);
            } else {
                aVar.m5441f(0.0f);
                aVar.m5439d(0.0f);
            }
            C2240i c2240i4 = new C2240i(aVar);
            c2237f.setShapeAppearanceModel(c2240i4);
            AbstractC2245n abstractC2245n = this.f4343I1;
            abstractC2245n.f10251c = c2240i4;
            boolean isEmpty = abstractC2245n.f10252d.isEmpty();
            Path path = abstractC2245n.f10253e;
            if (!isEmpty && (c2240i2 = abstractC2245n.f10251c) != null) {
                C2241j.a.f10222a.m5442a(c2240i2, 1.0f, abstractC2245n.f10252d, null, path);
            }
            abstractC2245n.mo5452a(this);
            RectF rectF = new RectF(0.0f, 0.0f, i7, i8);
            abstractC2245n.f10252d = rectF;
            if (!rectF.isEmpty() && (c2240i = abstractC2245n.f10251c) != null) {
                C2241j.a.f10222a.m5442a(c2240i, 1.0f, abstractC2245n.f10252d, null, path);
            }
            abstractC2245n.mo5452a(this);
            abstractC2245n.f10250b = true;
            abstractC2245n.mo5452a(this);
        }
    }

    public void setBottomInsetScrimEnabled(boolean z6) {
        this.f4341G1 = z6;
    }

    public void setCheckedItem(int i7) {
        MenuItem findItem = this.f4347z1.findItem(i7);
        if (findItem != null) {
            this.f4335A1.f8060X.m4228i((C0161h) findItem);
        }
    }

    public void setDividerInsetEnd(int i7) {
        C1753i c1753i = this.f4335A1;
        c1753i.f8050I1 = i7;
        c1753i.mo504g();
    }

    public void setDividerInsetStart(int i7) {
        C1753i c1753i = this.f4335A1;
        c1753i.f8049H1 = i7;
        c1753i.mo504g();
    }

    @Override // android.view.View
    public void setElevation(float f7) {
        super.setElevation(f7);
        Drawable background = getBackground();
        if (background instanceof C2237f) {
            ((C2237f) background).m5427j(f7);
        }
    }

    public void setForceCompatClippingEnabled(boolean z6) {
        AbstractC2245n abstractC2245n = this.f4343I1;
        if (z6 != abstractC2245n.f10249a) {
            abstractC2245n.f10249a = z6;
            abstractC2245n.mo5452a(this);
        }
    }

    public void setItemBackground(Drawable drawable) {
        C1753i c1753i = this.f4335A1;
        c1753i.f8043B1 = drawable;
        c1753i.mo504g();
    }

    public void setItemBackgroundResource(int i7) {
        Context context = getContext();
        Object obj = C2009a.f9156a;
        setItemBackground(C2009a.c.m4903b(context, i7));
    }

    public void setItemHorizontalPadding(int i7) {
        C1753i c1753i = this.f4335A1;
        c1753i.f8045D1 = i7;
        c1753i.mo504g();
    }

    public void setItemHorizontalPaddingResource(int i7) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i7);
        C1753i c1753i = this.f4335A1;
        c1753i.f8045D1 = dimensionPixelSize;
        c1753i.mo504g();
    }

    public void setItemIconPadding(int i7) {
        C1753i c1753i = this.f4335A1;
        c1753i.f8047F1 = i7;
        c1753i.mo504g();
    }

    public void setItemIconPaddingResource(int i7) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i7);
        C1753i c1753i = this.f4335A1;
        c1753i.f8047F1 = dimensionPixelSize;
        c1753i.mo504g();
    }

    public void setItemIconSize(int i7) {
        C1753i c1753i = this.f4335A1;
        if (c1753i.f8048G1 != i7) {
            c1753i.f8048G1 = i7;
            c1753i.f8053L1 = true;
            c1753i.mo504g();
        }
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        C1753i c1753i = this.f4335A1;
        c1753i.f8042A1 = colorStateList;
        c1753i.mo504g();
    }

    public void setItemMaxLines(int i7) {
        C1753i c1753i = this.f4335A1;
        c1753i.f8055N1 = i7;
        c1753i.mo504g();
    }

    public void setItemTextAppearance(int i7) {
        C1753i c1753i = this.f4335A1;
        c1753i.f8068x1 = i7;
        c1753i.mo504g();
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z6) {
        C1753i c1753i = this.f4335A1;
        c1753i.f8069y1 = z6;
        c1753i.mo504g();
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        C1753i c1753i = this.f4335A1;
        c1753i.f8070z1 = colorStateList;
        c1753i.mo504g();
    }

    public void setItemVerticalPadding(int i7) {
        C1753i c1753i = this.f4335A1;
        c1753i.f8046E1 = i7;
        c1753i.mo504g();
    }

    public void setItemVerticalPaddingResource(int i7) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i7);
        C1753i c1753i = this.f4335A1;
        c1753i.f8046E1 = dimensionPixelSize;
        c1753i.mo504g();
    }

    public void setNavigationItemSelectedListener(InterfaceC0823b interfaceC0823b) {
    }

    @Override // android.view.View
    public void setOverScrollMode(int i7) {
        super.setOverScrollMode(i7);
        C1753i c1753i = this.f4335A1;
        if (c1753i != null) {
            c1753i.f8058Q1 = i7;
            NavigationMenuView navigationMenuView = c1753i.f8063c;
            if (navigationMenuView != null) {
                navigationMenuView.setOverScrollMode(i7);
            }
        }
    }

    public void setSubheaderInsetEnd(int i7) {
        C1753i c1753i = this.f4335A1;
        c1753i.f8052K1 = i7;
        c1753i.mo504g();
    }

    public void setSubheaderInsetStart(int i7) {
        C1753i c1753i = this.f4335A1;
        c1753i.f8051J1 = i7;
        c1753i.mo504g();
    }

    public void setTopInsetScrimEnabled(boolean z6) {
        this.f4340F1 = z6;
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem findItem = this.f4347z1.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.f4335A1.f8060X.m4228i((C0161h) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }
}
