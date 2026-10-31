package p033e;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import p033e.C0907e;
import p189y.C2213a;

/* renamed from: e.b */
/* loaded from: classes.dex */
public class C0904b extends Drawable implements Drawable.Callback {

    /* renamed from: B1 */
    public static final /* synthetic */ int f4708B1 = 0;

    /* renamed from: A1 */
    public b f4709A1;

    /* renamed from: Y */
    public boolean f4711Y;

    /* renamed from: c */
    public c f4713c;

    /* renamed from: e */
    public Rect f4714e;

    /* renamed from: m */
    public Drawable f4715m;

    /* renamed from: s */
    public Drawable f4716s;

    /* renamed from: w1 */
    public boolean f4717w1;

    /* renamed from: x1 */
    public a f4718x1;

    /* renamed from: y1 */
    public long f4719y1;

    /* renamed from: z1 */
    public long f4720z1;

    /* renamed from: X */
    public int f4710X = 255;

    /* renamed from: Z */
    public int f4712Z = -1;

    /* renamed from: e.b$a */
    public class a implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ C0904b f4721c;

        public a(C0907e c0907e) {
            this.f4721c = c0907e;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C0904b c0904b = this.f4721c;
            c0904b.m2618a(true);
            c0904b.invalidateSelf();
        }
    }

    /* renamed from: e.b$b */
    public static class b implements Drawable.Callback {

        /* renamed from: c */
        public Drawable.Callback f4722c;

        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j7) {
            Drawable.Callback callback = this.f4722c;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j7);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f4722c;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* renamed from: e.b$c */
    public static abstract class c extends Drawable.ConstantState {

        /* renamed from: A */
        public boolean f4723A;

        /* renamed from: B */
        public ColorFilter f4724B;

        /* renamed from: C */
        public boolean f4725C;

        /* renamed from: D */
        public ColorStateList f4726D;

        /* renamed from: E */
        public PorterDuff.Mode f4727E;

        /* renamed from: F */
        public boolean f4728F;

        /* renamed from: G */
        public boolean f4729G;

        /* renamed from: a */
        public final C0904b f4730a;

        /* renamed from: b */
        public Resources f4731b;

        /* renamed from: c */
        public int f4732c;

        /* renamed from: d */
        public int f4733d;

        /* renamed from: e */
        public int f4734e;

        /* renamed from: f */
        public SparseArray<Drawable.ConstantState> f4735f;

        /* renamed from: g */
        public Drawable[] f4736g;

        /* renamed from: h */
        public int f4737h;

        /* renamed from: i */
        public boolean f4738i;

        /* renamed from: j */
        public boolean f4739j;

        /* renamed from: k */
        public Rect f4740k;

        /* renamed from: l */
        public boolean f4741l;

        /* renamed from: m */
        public boolean f4742m;

        /* renamed from: n */
        public int f4743n;

        /* renamed from: o */
        public int f4744o;

        /* renamed from: p */
        public int f4745p;

        /* renamed from: q */
        public int f4746q;

        /* renamed from: r */
        public boolean f4747r;

        /* renamed from: s */
        public int f4748s;

        /* renamed from: t */
        public boolean f4749t;

        /* renamed from: u */
        public boolean f4750u;

        /* renamed from: v */
        public boolean f4751v;

        /* renamed from: w */
        public boolean f4752w;

        /* renamed from: x */
        public int f4753x;

        /* renamed from: y */
        public int f4754y;

        /* renamed from: z */
        public int f4755z;

        public c(c cVar, C0904b c0904b, Resources resources) {
            this.f4738i = false;
            this.f4741l = false;
            this.f4752w = true;
            this.f4754y = 0;
            this.f4755z = 0;
            this.f4730a = c0904b;
            this.f4731b = resources != null ? resources : cVar != null ? cVar.f4731b : null;
            int i7 = cVar != null ? cVar.f4732c : 0;
            int i8 = C0904b.f4708B1;
            i7 = resources != null ? resources.getDisplayMetrics().densityDpi : i7;
            i7 = i7 == 0 ? 160 : i7;
            this.f4732c = i7;
            if (cVar == null) {
                this.f4736g = new Drawable[10];
                this.f4737h = 0;
                return;
            }
            this.f4733d = cVar.f4733d;
            this.f4734e = cVar.f4734e;
            this.f4750u = true;
            this.f4751v = true;
            this.f4738i = cVar.f4738i;
            this.f4741l = cVar.f4741l;
            this.f4752w = cVar.f4752w;
            this.f4753x = cVar.f4753x;
            this.f4754y = cVar.f4754y;
            this.f4755z = cVar.f4755z;
            this.f4723A = cVar.f4723A;
            this.f4724B = cVar.f4724B;
            this.f4725C = cVar.f4725C;
            this.f4726D = cVar.f4726D;
            this.f4727E = cVar.f4727E;
            this.f4728F = cVar.f4728F;
            this.f4729G = cVar.f4729G;
            if (cVar.f4732c == i7) {
                if (cVar.f4739j) {
                    this.f4740k = cVar.f4740k != null ? new Rect(cVar.f4740k) : null;
                    this.f4739j = true;
                }
                if (cVar.f4742m) {
                    this.f4743n = cVar.f4743n;
                    this.f4744o = cVar.f4744o;
                    this.f4745p = cVar.f4745p;
                    this.f4746q = cVar.f4746q;
                    this.f4742m = true;
                }
            }
            if (cVar.f4747r) {
                this.f4748s = cVar.f4748s;
                this.f4747r = true;
            }
            if (cVar.f4749t) {
                this.f4749t = true;
            }
            Drawable[] drawableArr = cVar.f4736g;
            this.f4736g = new Drawable[drawableArr.length];
            this.f4737h = cVar.f4737h;
            SparseArray<Drawable.ConstantState> sparseArray = cVar.f4735f;
            this.f4735f = sparseArray != null ? sparseArray.clone() : new SparseArray<>(this.f4737h);
            int i9 = this.f4737h;
            for (int i10 = 0; i10 < i9; i10++) {
                Drawable drawable = drawableArr[i10];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f4735f.put(i10, constantState);
                    } else {
                        this.f4736g[i10] = drawableArr[i10];
                    }
                }
            }
        }

        /* renamed from: a */
        public final int m2621a(Drawable drawable) {
            int i7 = this.f4737h;
            if (i7 >= this.f4736g.length) {
                int i8 = i7 + 10;
                C0907e.a aVar = (C0907e.a) this;
                Drawable[] drawableArr = new Drawable[i8];
                Drawable[] drawableArr2 = aVar.f4736g;
                if (drawableArr2 != null) {
                    System.arraycopy(drawableArr2, 0, drawableArr, 0, i7);
                }
                aVar.f4736g = drawableArr;
                int[][] iArr = new int[i8][];
                System.arraycopy(aVar.f4772H, 0, iArr, 0, i7);
                aVar.f4772H = iArr;
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f4730a);
            this.f4736g[i7] = drawable;
            this.f4737h++;
            this.f4734e = drawable.getChangingConfigurations() | this.f4734e;
            this.f4747r = false;
            this.f4749t = false;
            this.f4740k = null;
            this.f4739j = false;
            this.f4742m = false;
            this.f4750u = false;
            return i7;
        }

        /* renamed from: b */
        public final void m2622b() {
            this.f4742m = true;
            m2623c();
            int i7 = this.f4737h;
            Drawable[] drawableArr = this.f4736g;
            this.f4744o = -1;
            this.f4743n = -1;
            this.f4746q = 0;
            this.f4745p = 0;
            for (int i8 = 0; i8 < i7; i8++) {
                Drawable drawable = drawableArr[i8];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f4743n) {
                    this.f4743n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f4744o) {
                    this.f4744o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f4745p) {
                    this.f4745p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f4746q) {
                    this.f4746q = minimumHeight;
                }
            }
        }

        /* renamed from: c */
        public final void m2623c() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f4735f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i7 = 0; i7 < size; i7++) {
                    int keyAt = this.f4735f.keyAt(i7);
                    Drawable.ConstantState valueAt = this.f4735f.valueAt(i7);
                    Drawable[] drawableArr = this.f4736g;
                    Drawable newDrawable = valueAt.newDrawable(this.f4731b);
                    if (Build.VERSION.SDK_INT >= 23) {
                        C2213a.m5355c(newDrawable, this.f4753x);
                    }
                    Drawable mutate = newDrawable.mutate();
                    mutate.setCallback(this.f4730a);
                    drawableArr[keyAt] = mutate;
                }
                this.f4735f = null;
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            int i7 = this.f4737h;
            Drawable[] drawableArr = this.f4736g;
            for (int i8 = 0; i8 < i7; i8++) {
                Drawable drawable = drawableArr[i8];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f4735f.get(i8);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (C2213a.b.m5366b(drawable)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        public final Drawable m2624d(int i7) {
            int indexOfKey;
            Drawable drawable = this.f4736g[i7];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f4735f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i7)) < 0) {
                return null;
            }
            Drawable newDrawable = this.f4735f.valueAt(indexOfKey).newDrawable(this.f4731b);
            if (Build.VERSION.SDK_INT >= 23) {
                C2213a.m5355c(newDrawable, this.f4753x);
            }
            Drawable mutate = newDrawable.mutate();
            mutate.setCallback(this.f4730a);
            this.f4736g[i7] = mutate;
            this.f4735f.removeAt(indexOfKey);
            if (this.f4735f.size() == 0) {
                this.f4735f = null;
            }
            return mutate;
        }

        /* renamed from: e */
        public abstract void mo2614e();

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return this.f4733d | this.f4734e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2618a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f4711Y = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f4715m
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r8 = 0
            if (r3 == 0) goto L36
            long r9 = r13.f4719y1
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L38
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L20
            int r9 = r13.f4710X
            r3.setAlpha(r9)
            goto L36
        L20:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            e.b$c r9 = r13.f4713c
            int r9 = r9.f4754y
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f4710X
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L39
        L36:
            r13.f4719y1 = r6
        L38:
            r3 = 0
        L39:
            android.graphics.drawable.Drawable r9 = r13.f4716s
            if (r9 == 0) goto L61
            long r10 = r13.f4720z1
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L63
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L4e
            r9.setVisible(r8, r8)
            r0 = 0
            r13.f4716s = r0
            goto L61
        L4e:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            e.b$c r4 = r13.f4713c
            int r4 = r4.f4755z
            int r3 = r3 / r4
            int r4 = r13.f4710X
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L64
        L61:
            r13.f4720z1 = r6
        L63:
            r0 = r3
        L64:
            if (r14 == 0) goto L70
            if (r0 == 0) goto L70
            e.b$a r14 = r13.f4718x1
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p033e.C0904b.m2618a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        c cVar = this.f4713c;
        if (theme == null) {
            cVar.getClass();
            return;
        }
        cVar.m2623c();
        int i7 = cVar.f4737h;
        Drawable[] drawableArr = cVar.f4736g;
        for (int i8 = 0; i8 < i7; i8++) {
            Drawable drawable = drawableArr[i8];
            if (drawable != null && C2213a.b.m5366b(drawable)) {
                C2213a.b.m5365a(drawableArr[i8], theme);
                cVar.f4734e |= drawableArr[i8].getChangingConfigurations();
            }
        }
        Resources resources = theme.getResources();
        if (resources != null) {
            cVar.f4731b = resources;
            int i9 = resources.getDisplayMetrics().densityDpi;
            if (i9 == 0) {
                i9 = 160;
            }
            int i10 = cVar.f4732c;
            cVar.f4732c = i9;
            if (i10 != i9) {
                cVar.f4742m = false;
                cVar.f4739j = false;
            }
        }
    }

    /* renamed from: b */
    public c mo2609b() {
        throw null;
    }

    /* renamed from: c */
    public final void m2619c(Drawable drawable) {
        if (this.f4709A1 == null) {
            this.f4709A1 = new b();
        }
        b bVar = this.f4709A1;
        bVar.f4722c = drawable.getCallback();
        drawable.setCallback(bVar);
        try {
            if (this.f4713c.f4754y <= 0 && this.f4711Y) {
                drawable.setAlpha(this.f4710X);
            }
            c cVar = this.f4713c;
            if (cVar.f4725C) {
                drawable.setColorFilter(cVar.f4724B);
            } else {
                if (cVar.f4728F) {
                    C2213a.b.m5372h(drawable, cVar.f4726D);
                }
                c cVar2 = this.f4713c;
                if (cVar2.f4729G) {
                    C2213a.b.m5373i(drawable, cVar2.f4727E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f4713c.f4752w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                C2213a.m5355c(drawable, C2213a.m5354b(this));
            }
            C2213a.a.m5364e(drawable, this.f4713c.f4723A);
            Rect rect = this.f4714e;
            if (rect != null) {
                C2213a.b.m5370f(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            b bVar2 = this.f4709A1;
            Drawable.Callback callback = bVar2.f4722c;
            bVar2.f4722c = null;
            drawable.setCallback(callback);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.f4713c.canApplyTheme();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m2620d(int r10) {
        /*
            r9 = this;
            int r0 = r9.f4712Z
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            e.b$c r0 = r9.f4713c
            int r0 = r0.f4755z
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f4716s
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f4715m
            if (r0 == 0) goto L29
            r9.f4716s = r0
            e.b$c r0 = r9.f4713c
            int r0 = r0.f4755z
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f4720z1 = r0
            goto L35
        L29:
            r9.f4716s = r4
            r9.f4720z1 = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f4715m
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            e.b$c r0 = r9.f4713c
            int r1 = r0.f4737h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.m2624d(r10)
            r9.f4715m = r0
            r9.f4712Z = r10
            if (r0 == 0) goto L5a
            e.b$c r10 = r9.f4713c
            int r10 = r10.f4754y
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f4719y1 = r2
        L51:
            r9.m2619c(r0)
            goto L5a
        L55:
            r9.f4715m = r4
            r10 = -1
            r9.f4712Z = r10
        L5a:
            long r0 = r9.f4719y1
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L67
            long r0 = r9.f4720z1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L7c
        L67:
            e.b$a r0 = r9.f4718x1
            if (r0 != 0) goto L76
            e.b$a r0 = new e.b$a
            r1 = r9
            e.e r1 = (p033e.C0907e) r1
            r0.<init>(r1)
            r9.f4718x1 = r0
            goto L79
        L76:
            r9.unscheduleSelf(r0)
        L79:
            r9.m2618a(r10)
        L7c:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p033e.C0904b.m2620d(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f4715m;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f4716s;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* renamed from: e */
    public void mo2610e(c cVar) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f4710X;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        c cVar = this.f4713c;
        return changingConfigurations | cVar.f4734e | cVar.f4733d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z6;
        c cVar = this.f4713c;
        if (!cVar.f4750u) {
            cVar.m2623c();
            cVar.f4750u = true;
            int i7 = cVar.f4737h;
            Drawable[] drawableArr = cVar.f4736g;
            int i8 = 0;
            while (true) {
                if (i8 >= i7) {
                    cVar.f4751v = true;
                    z6 = true;
                    break;
                }
                if (drawableArr[i8].getConstantState() == null) {
                    cVar.f4751v = false;
                    z6 = false;
                    break;
                }
                i8++;
            }
        } else {
            z6 = cVar.f4751v;
        }
        if (!z6) {
            return null;
        }
        this.f4713c.f4733d = getChangingConfigurations();
        return this.f4713c;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f4715m;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f4714e;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        c cVar = this.f4713c;
        if (cVar.f4741l) {
            if (!cVar.f4742m) {
                cVar.m2622b();
            }
            return cVar.f4744o;
        }
        Drawable drawable = this.f4715m;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        c cVar = this.f4713c;
        if (cVar.f4741l) {
            if (!cVar.f4742m) {
                cVar.m2622b();
            }
            return cVar.f4743n;
        }
        Drawable drawable = this.f4715m;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        c cVar = this.f4713c;
        if (cVar.f4741l) {
            if (!cVar.f4742m) {
                cVar.m2622b();
            }
            return cVar.f4746q;
        }
        Drawable drawable = this.f4715m;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        c cVar = this.f4713c;
        if (cVar.f4741l) {
            if (!cVar.f4742m) {
                cVar.m2622b();
            }
            return cVar.f4745p;
        }
        Drawable drawable = this.f4715m;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f4715m;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        c cVar = this.f4713c;
        if (cVar.f4747r) {
            return cVar.f4748s;
        }
        cVar.m2623c();
        int i7 = cVar.f4737h;
        Drawable[] drawableArr = cVar.f4736g;
        int opacity = i7 > 0 ? drawableArr[0].getOpacity() : -2;
        for (int i8 = 1; i8 < i7; i8++) {
            opacity = Drawable.resolveOpacity(opacity, drawableArr[i8].getOpacity());
        }
        cVar.f4748s = opacity;
        cVar.f4747r = true;
        return opacity;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.f4715m;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        boolean padding;
        c cVar = this.f4713c;
        Rect rect2 = null;
        if (!cVar.f4738i) {
            Rect rect3 = cVar.f4740k;
            if (rect3 != null || cVar.f4739j) {
                rect2 = rect3;
            } else {
                cVar.m2623c();
                Rect rect4 = new Rect();
                int i7 = cVar.f4737h;
                Drawable[] drawableArr = cVar.f4736g;
                for (int i8 = 0; i8 < i7; i8++) {
                    if (drawableArr[i8].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i9 = rect4.left;
                        if (i9 > rect2.left) {
                            rect2.left = i9;
                        }
                        int i10 = rect4.top;
                        if (i10 > rect2.top) {
                            rect2.top = i10;
                        }
                        int i11 = rect4.right;
                        if (i11 > rect2.right) {
                            rect2.right = i11;
                        }
                        int i12 = rect4.bottom;
                        if (i12 > rect2.bottom) {
                            rect2.bottom = i12;
                        }
                    }
                }
                cVar.f4739j = true;
                cVar.f4740k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            padding = (((rect2.left | rect2.top) | rect2.bottom) | rect2.right) != 0;
        } else {
            Drawable drawable = this.f4715m;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (this.f4713c.f4723A && C2213a.m5354b(this) == 1) {
            int i13 = rect.left;
            rect.left = rect.right;
            rect.right = i13;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        c cVar = this.f4713c;
        if (cVar != null) {
            cVar.f4747r = false;
            cVar.f4749t = false;
        }
        if (drawable != this.f4715m || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f4713c.f4723A;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z6;
        Drawable drawable = this.f4716s;
        boolean z7 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f4716s = null;
            z6 = true;
        } else {
            z6 = false;
        }
        Drawable drawable2 = this.f4715m;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f4711Y) {
                this.f4715m.setAlpha(this.f4710X);
            }
        }
        if (this.f4720z1 != 0) {
            this.f4720z1 = 0L;
            z6 = true;
        }
        if (this.f4719y1 != 0) {
            this.f4719y1 = 0L;
        } else {
            z7 = z6;
        }
        if (z7) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f4717w1 && super.mutate() == this) {
            c mo2609b = mo2609b();
            mo2609b.mo2614e();
            mo2610e(mo2609b);
            this.f4717w1 = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f4716s;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f4715m;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i7) {
        c cVar = this.f4713c;
        int i8 = this.f4712Z;
        int i9 = cVar.f4737h;
        Drawable[] drawableArr = cVar.f4736g;
        boolean z6 = false;
        for (int i10 = 0; i10 < i9; i10++) {
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                boolean m5355c = Build.VERSION.SDK_INT >= 23 ? C2213a.m5355c(drawable, i7) : false;
                if (i10 == i8) {
                    z6 = m5355c;
                }
            }
        }
        cVar.f4753x = i7;
        return z6;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i7) {
        Drawable drawable = this.f4716s;
        if (drawable != null) {
            return drawable.setLevel(i7);
        }
        Drawable drawable2 = this.f4715m;
        if (drawable2 != null) {
            return drawable2.setLevel(i7);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f4716s;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f4715m;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j7) {
        if (drawable != this.f4715m || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j7);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        if (this.f4711Y && this.f4710X == i7) {
            return;
        }
        this.f4711Y = true;
        this.f4710X = i7;
        Drawable drawable = this.f4715m;
        if (drawable != null) {
            if (this.f4719y1 == 0) {
                drawable.setAlpha(i7);
            } else {
                m2618a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z6) {
        c cVar = this.f4713c;
        if (cVar.f4723A != z6) {
            cVar.f4723A = z6;
            Drawable drawable = this.f4715m;
            if (drawable != null) {
                C2213a.a.m5364e(drawable, z6);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        c cVar = this.f4713c;
        cVar.f4725C = true;
        if (cVar.f4724B != colorFilter) {
            cVar.f4724B = colorFilter;
            Drawable drawable = this.f4715m;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z6) {
        c cVar = this.f4713c;
        if (cVar.f4752w != z6) {
            cVar.f4752w = z6;
            Drawable drawable = this.f4715m;
            if (drawable != null) {
                drawable.setDither(z6);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f7, float f8) {
        Drawable drawable = this.f4715m;
        if (drawable != null) {
            C2213a.b.m5369e(drawable, f7, f8);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i7, int i8, int i9, int i10) {
        Rect rect = this.f4714e;
        if (rect == null) {
            this.f4714e = new Rect(i7, i8, i9, i10);
        } else {
            rect.set(i7, i8, i9, i10);
        }
        Drawable drawable = this.f4715m;
        if (drawable != null) {
            C2213a.b.m5370f(drawable, i7, i8, i9, i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i7) {
        setTintList(ColorStateList.valueOf(i7));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        c cVar = this.f4713c;
        cVar.f4728F = true;
        if (cVar.f4726D != colorStateList) {
            cVar.f4726D = colorStateList;
            C2213a.m5357e(this.f4715m, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f4713c;
        cVar.f4729G = true;
        if (cVar.f4727E != mode) {
            cVar.f4727E = mode;
            C2213a.m5358f(this.f4715m, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z6, boolean z7) {
        boolean visible = super.setVisible(z6, z7);
        Drawable drawable = this.f4716s;
        if (drawable != null) {
            drawable.setVisible(z6, z7);
        }
        Drawable drawable2 = this.f4715m;
        if (drawable2 != null) {
            drawable2.setVisible(z6, z7);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f4715m || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
