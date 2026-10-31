package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.appcompat.widget.C0240k;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import p002a1.C0017d;
import p033e.C0903a;
import p041f.C1144b;
import p089l.C1473g;
import p089l.C1474h;
import p089l.C1475i;
import p089l.C1481o;
import p089l.C1482p;
import p182x0.C2168d;
import p182x0.C2173i;

/* renamed from: androidx.appcompat.widget.x0 */
/* loaded from: classes.dex */
public final class C0274x0 {

    /* renamed from: i */
    public static C0274x0 f1114i;

    /* renamed from: a */
    public WeakHashMap<Context, C1482p<ColorStateList>> f1116a;

    /* renamed from: b */
    public C1481o<String, e> f1117b;

    /* renamed from: c */
    public C1482p<String> f1118c;

    /* renamed from: d */
    public final WeakHashMap<Context, C1473g<WeakReference<Drawable.ConstantState>>> f1119d = new WeakHashMap<>(0);

    /* renamed from: e */
    public TypedValue f1120e;

    /* renamed from: f */
    public boolean f1121f;

    /* renamed from: g */
    public f f1122g;

    /* renamed from: h */
    public static final PorterDuff.Mode f1113h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j */
    public static final c f1115j = new c();

    /* renamed from: androidx.appcompat.widget.x0$a */
    public static class a implements e {
        @Override // androidx.appcompat.widget.C0274x0.e
        /* renamed from: a */
        public final Drawable mo909a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C0903a.m2608g(context, theme, context.getResources(), attributeSet, xmlResourceParser);
            } catch (Exception e7) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e7);
                return null;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.x0$b */
    public static class b implements e {
        @Override // androidx.appcompat.widget.C0274x0.e
        /* renamed from: a */
        public final Drawable mo909a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                Resources resources = context.getResources();
                C2168d c2168d = new C2168d(context);
                c2168d.inflate(resources, xmlResourceParser, attributeSet, theme);
                return c2168d;
            } catch (Exception e7) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e7);
                return null;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.x0$c */
    public static class c extends C1475i<Integer, PorterDuffColorFilter> {
        public c() {
            super(6);
        }
    }

    /* renamed from: androidx.appcompat.widget.x0$d */
    public static class d implements e {
        @Override // androidx.appcompat.widget.C0274x0.e
        /* renamed from: a */
        public final Drawable mo909a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute == null) {
                return null;
            }
            try {
                Drawable drawable = (Drawable) d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                C1144b.m3330c(drawable, context.getResources(), xmlResourceParser, attributeSet, theme);
                return drawable;
            } catch (Exception e7) {
                Log.e("DrawableDelegate", "Exception while inflating <drawable>", e7);
                return null;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.x0$e */
    public interface e {
        /* renamed from: a */
        Drawable mo909a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* renamed from: androidx.appcompat.widget.x0$f */
    public interface f {
    }

    /* renamed from: androidx.appcompat.widget.x0$g */
    public static class g implements e {
        @Override // androidx.appcompat.widget.C0274x0.e
        /* renamed from: a */
        public final Drawable mo909a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                Resources resources = context.getResources();
                C2173i c2173i = new C2173i();
                c2173i.inflate(resources, xmlResourceParser, attributeSet, theme);
                return c2173i;
            } catch (Exception e7) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e7);
                return null;
            }
        }
    }

    /* renamed from: d */
    public static synchronized C0274x0 m896d() {
        C0274x0 c0274x0;
        synchronized (C0274x0.class) {
            if (f1114i == null) {
                C0274x0 c0274x02 = new C0274x0();
                f1114i = c0274x02;
                m898j(c0274x02);
            }
            c0274x0 = f1114i;
        }
        return c0274x0;
    }

    /* renamed from: h */
    public static synchronized PorterDuffColorFilter m897h(int i7, PorterDuff.Mode mode) {
        PorterDuffColorFilter m3862a;
        synchronized (C0274x0.class) {
            c cVar = f1115j;
            cVar.getClass();
            int i8 = (i7 + 31) * 31;
            m3862a = cVar.m3862a(Integer.valueOf(mode.hashCode() + i8));
            if (m3862a == null) {
                m3862a = new PorterDuffColorFilter(i7, mode);
                cVar.m3863b(Integer.valueOf(mode.hashCode() + i8), m3862a);
            }
        }
        return m3862a;
    }

    /* renamed from: j */
    public static void m898j(C0274x0 c0274x0) {
        if (Build.VERSION.SDK_INT < 24) {
            c0274x0.m899a("vector", new g());
            c0274x0.m899a("animated-vector", new b());
            c0274x0.m899a("animated-selector", new a());
            c0274x0.m899a("drawable", new d());
        }
    }

    /* renamed from: a */
    public final void m899a(String str, e eVar) {
        if (this.f1117b == null) {
            this.f1117b = new C1481o<>();
        }
        this.f1117b.put(str, eVar);
    }

    /* renamed from: b */
    public final synchronized void m900b(Context context, long j7, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            C1473g<WeakReference<Drawable.ConstantState>> c1473g = this.f1119d.get(context);
            if (c1473g == null) {
                c1473g = new C1473g<>();
                this.f1119d.put(context, c1473g);
            }
            c1473g.m3859g(j7, new WeakReference<>(constantState));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00fc  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable m901c(int r12, android.content.Context r13) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0274x0.m901c(int, android.content.Context):android.graphics.drawable.Drawable");
    }

    /* renamed from: e */
    public final synchronized Drawable m902e(Context context, long j7) {
        C1473g<WeakReference<Drawable.ConstantState>> c1473g = this.f1119d.get(context);
        if (c1473g == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> m3856d = c1473g.m3856d(j7);
        if (m3856d != null) {
            Drawable.ConstantState constantState = m3856d.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int m86k = C0017d.m86k(c1473g.f7030e, c1473g.f7032s, j7);
            if (m86k >= 0) {
                Object[] objArr = c1473g.f7031m;
                Object obj = objArr[m86k];
                Object obj2 = C1474h.f7033a;
                if (obj != obj2) {
                    objArr[m86k] = obj2;
                    c1473g.f7029c = true;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x002a, code lost:
    
        if (((r0 instanceof p182x0.C2173i) || "android.graphics.drawable.VectorDrawable".equals(r0.getClass().getName())) == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0117, code lost:
    
        p189y.C2213a.b.m5373i(r14, r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e9 A[Catch: all -> 0x00cb, TryCatch #1 {all -> 0x00cb, blocks: (B:3:0x0001, B:6:0x002c, B:8:0x0031, B:10:0x0037, B:12:0x003d, B:15:0x004b, B:18:0x005c, B:20:0x0060, B:21:0x0067, B:25:0x00e9, B:27:0x00ef, B:29:0x00f7, B:31:0x00fd, B:35:0x0117, B:38:0x010f, B:40:0x0113, B:41:0x011d, B:43:0x0121, B:45:0x012d, B:50:0x0158, B:52:0x015c, B:54:0x0160, B:56:0x0164, B:57:0x0192, B:62:0x019f, B:66:0x0081, B:68:0x0085, B:71:0x0091, B:72:0x0099, B:78:0x00a5, B:80:0x00b8, B:82:0x00c2, B:83:0x00ce, B:84:0x00d5, B:87:0x00d7, B:89:0x00e0, B:90:0x0055, B:92:0x0008, B:94:0x0012, B:96:0x0016, B:102:0x01a4, B:103:0x01ad), top: B:2:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ef A[Catch: all -> 0x00cb, TryCatch #1 {all -> 0x00cb, blocks: (B:3:0x0001, B:6:0x002c, B:8:0x0031, B:10:0x0037, B:12:0x003d, B:15:0x004b, B:18:0x005c, B:20:0x0060, B:21:0x0067, B:25:0x00e9, B:27:0x00ef, B:29:0x00f7, B:31:0x00fd, B:35:0x0117, B:38:0x010f, B:40:0x0113, B:41:0x011d, B:43:0x0121, B:45:0x012d, B:50:0x0158, B:52:0x015c, B:54:0x0160, B:56:0x0164, B:57:0x0192, B:62:0x019f, B:66:0x0081, B:68:0x0085, B:71:0x0091, B:72:0x0099, B:78:0x00a5, B:80:0x00b8, B:82:0x00c2, B:83:0x00ce, B:84:0x00d5, B:87:0x00d7, B:89:0x00e0, B:90:0x0055, B:92:0x0008, B:94:0x0012, B:96:0x0016, B:102:0x01a4, B:103:0x01ad), top: B:2:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f7 A[Catch: all -> 0x00cb, TryCatch #1 {all -> 0x00cb, blocks: (B:3:0x0001, B:6:0x002c, B:8:0x0031, B:10:0x0037, B:12:0x003d, B:15:0x004b, B:18:0x005c, B:20:0x0060, B:21:0x0067, B:25:0x00e9, B:27:0x00ef, B:29:0x00f7, B:31:0x00fd, B:35:0x0117, B:38:0x010f, B:40:0x0113, B:41:0x011d, B:43:0x0121, B:45:0x012d, B:50:0x0158, B:52:0x015c, B:54:0x0160, B:56:0x0164, B:57:0x0192, B:62:0x019f, B:66:0x0081, B:68:0x0085, B:71:0x0091, B:72:0x0099, B:78:0x00a5, B:80:0x00b8, B:82:0x00c2, B:83:0x00ce, B:84:0x00d5, B:87:0x00d7, B:89:0x00e0, B:90:0x0055, B:92:0x0008, B:94:0x0012, B:96:0x0016, B:102:0x01a4, B:103:0x01ad), top: B:2:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019f A[Catch: all -> 0x00cb, TRY_LEAVE, TryCatch #1 {all -> 0x00cb, blocks: (B:3:0x0001, B:6:0x002c, B:8:0x0031, B:10:0x0037, B:12:0x003d, B:15:0x004b, B:18:0x005c, B:20:0x0060, B:21:0x0067, B:25:0x00e9, B:27:0x00ef, B:29:0x00f7, B:31:0x00fd, B:35:0x0117, B:38:0x010f, B:40:0x0113, B:41:0x011d, B:43:0x0121, B:45:0x012d, B:50:0x0158, B:52:0x015c, B:54:0x0160, B:56:0x0164, B:57:0x0192, B:62:0x019f, B:66:0x0081, B:68:0x0085, B:71:0x0091, B:72:0x0099, B:78:0x00a5, B:80:0x00b8, B:82:0x00c2, B:83:0x00ce, B:84:0x00d5, B:87:0x00d7, B:89:0x00e0, B:90:0x0055, B:92:0x0008, B:94:0x0012, B:96:0x0016, B:102:0x01a4, B:103:0x01ad), top: B:2:0x0001, inners: #0 }] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized android.graphics.drawable.Drawable m903f(int r13, android.content.Context r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0274x0.m903f(int, android.content.Context, boolean):android.graphics.drawable.Drawable");
    }

    /* renamed from: g */
    public final synchronized Drawable m904g(Context context, int i7) {
        return m903f(i7, context, false);
    }

    /* renamed from: i */
    public final synchronized ColorStateList m905i(int i7, Context context) {
        ColorStateList m3880c;
        C1482p<ColorStateList> c1482p;
        WeakHashMap<Context, C1482p<ColorStateList>> weakHashMap = this.f1116a;
        ColorStateList colorStateList = null;
        m3880c = (weakHashMap == null || (c1482p = weakHashMap.get(context)) == null) ? null : c1482p.m3880c(i7);
        if (m3880c == null) {
            f fVar = this.f1122g;
            if (fVar != null) {
                colorStateList = ((C0240k.a) fVar).m815c(i7, context);
            }
            if (colorStateList != null) {
                if (this.f1116a == null) {
                    this.f1116a = new WeakHashMap<>();
                }
                C1482p<ColorStateList> c1482p2 = this.f1116a.get(context);
                if (c1482p2 == null) {
                    c1482p2 = new C1482p<>();
                    this.f1116a.put(context, c1482p2);
                }
                c1482p2.m3878a(i7, colorStateList);
            }
            m3880c = colorStateList;
        }
        return m3880c;
    }

    /* renamed from: k */
    public final synchronized void m906k(Context context) {
        C1473g<WeakReference<Drawable.ConstantState>> c1473g = this.f1119d.get(context);
        if (c1473g != null) {
            c1473g.m3854b();
        }
    }

    /* renamed from: l */
    public final synchronized void m907l(C0240k.a aVar) {
        this.f1122g = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0066 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004b  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m908m(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
        /*
            r6 = this;
            androidx.appcompat.widget.x0$f r0 = r6.f1122g
            r1 = 0
            if (r0 == 0) goto L67
            androidx.appcompat.widget.k$a r0 = (androidx.appcompat.widget.C0240k.a) r0
            android.graphics.PorterDuff$Mode r2 = androidx.appcompat.widget.C0240k.f937b
            int[] r3 = r0.f940a
            boolean r3 = androidx.appcompat.widget.C0240k.a.m812a(r8, r3)
            r4 = 1
            r5 = -1
            if (r3 == 0) goto L16
            int r8 = androidx.appcompat.R$attr.colorControlNormal
            goto L42
        L16:
            int[] r3 = r0.f942c
            boolean r3 = androidx.appcompat.widget.C0240k.a.m812a(r8, r3)
            if (r3 == 0) goto L21
            int r8 = androidx.appcompat.R$attr.colorControlActivated
            goto L42
        L21:
            int[] r0 = r0.f943d
            boolean r0 = androidx.appcompat.widget.C0240k.a.m812a(r8, r0)
            if (r0 == 0) goto L2c
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L3f
        L2c:
            int r0 = androidx.appcompat.R$drawable.abc_list_divider_mtrl_alpha
            if (r8 != r0) goto L3b
            r8 = 1109603123(0x42233333, float:40.8)
            int r8 = java.lang.Math.round(r8)
            r0 = 16842800(0x1010030, float:2.3693693E-38)
            goto L44
        L3b:
            int r0 = androidx.appcompat.R$drawable.abc_dialog_material_background
            if (r8 != r0) goto L46
        L3f:
            r8 = 16842801(0x1010031, float:2.3693695E-38)
        L42:
            r0 = r8
            r8 = -1
        L44:
            r3 = 1
            goto L49
        L46:
            r8 = -1
            r0 = 0
            r3 = 0
        L49:
            if (r3 == 0) goto L63
            int[] r3 = androidx.appcompat.widget.C0244l0.f969a
            android.graphics.drawable.Drawable r9 = r9.mutate()
            int r7 = androidx.appcompat.widget.C0218c1.m704c(r0, r7)
            android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.C0240k.m808c(r7, r2)
            r9.setColorFilter(r7)
            if (r8 == r5) goto L61
            r9.setAlpha(r8)
        L61:
            r7 = 1
            goto L64
        L63:
            r7 = 0
        L64:
            if (r7 == 0) goto L67
            r1 = 1
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0274x0.m908m(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }
}
