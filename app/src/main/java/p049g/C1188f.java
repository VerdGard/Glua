package p049g;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.ext.C0090b;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.R$styleable;
import androidx.appcompat.view.menu.C0161h;
import androidx.appcompat.widget.C0233h1;
import androidx.appcompat.widget.C0244l0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParserException;
import p034e0.AbstractC0910b;
import p034e0.C0924i;
import p057h.MenuItemC1269c;
import p197z.InterfaceMenuC2270a;
import p197z.InterfaceMenuItemC2271b;

/* renamed from: g.f */
/* loaded from: classes.dex */
public final class C1188f extends MenuInflater {

    /* renamed from: e */
    public static final Class<?>[] f5802e;

    /* renamed from: f */
    public static final Class<?>[] f5803f;

    /* renamed from: a */
    public final Object[] f5804a;

    /* renamed from: b */
    public final Object[] f5805b;

    /* renamed from: c */
    public final Context f5806c;

    /* renamed from: d */
    public Object f5807d;

    /* renamed from: g.f$a */
    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c */
        public static final Class<?>[] f5808c = {MenuItem.class};

        /* renamed from: a */
        public final Object f5809a;

        /* renamed from: b */
        public final Method f5810b;

        public a(Object obj, String str) {
            this.f5809a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f5810b = cls.getMethod(str, f5808c);
            } catch (Exception e7) {
                StringBuilder m222h = C0090b.m222h("Couldn't resolve menu item onClick handler ", str, " in class ");
                m222h.append(cls.getName());
                InflateException inflateException = new InflateException(m222h.toString());
                inflateException.initCause(e7);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            Method method = this.f5810b;
            try {
                Class<?> returnType = method.getReturnType();
                Class<?> cls = Boolean.TYPE;
                Object obj = this.f5809a;
                if (returnType == cls) {
                    return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
                }
                method.invoke(obj, menuItem);
                return true;
            } catch (Exception e7) {
                throw new RuntimeException(e7);
            }
        }
    }

    /* renamed from: g.f$b */
    public class b {

        /* renamed from: A */
        public CharSequence f5811A;

        /* renamed from: B */
        public CharSequence f5812B;

        /* renamed from: a */
        public final Menu f5816a;

        /* renamed from: h */
        public boolean f5823h;

        /* renamed from: i */
        public int f5824i;

        /* renamed from: j */
        public int f5825j;

        /* renamed from: k */
        public CharSequence f5826k;

        /* renamed from: l */
        public CharSequence f5827l;

        /* renamed from: m */
        public int f5828m;

        /* renamed from: n */
        public char f5829n;

        /* renamed from: o */
        public int f5830o;

        /* renamed from: p */
        public char f5831p;

        /* renamed from: q */
        public int f5832q;

        /* renamed from: r */
        public int f5833r;

        /* renamed from: s */
        public boolean f5834s;

        /* renamed from: t */
        public boolean f5835t;

        /* renamed from: u */
        public boolean f5836u;

        /* renamed from: v */
        public int f5837v;

        /* renamed from: w */
        public int f5838w;

        /* renamed from: x */
        public String f5839x;

        /* renamed from: y */
        public String f5840y;

        /* renamed from: z */
        public AbstractC0910b f5841z;

        /* renamed from: C */
        public ColorStateList f5813C = null;

        /* renamed from: D */
        public PorterDuff.Mode f5814D = null;

        /* renamed from: b */
        public int f5817b = 0;

        /* renamed from: c */
        public int f5818c = 0;

        /* renamed from: d */
        public int f5819d = 0;

        /* renamed from: e */
        public int f5820e = 0;

        /* renamed from: f */
        public boolean f5821f = true;

        /* renamed from: g */
        public boolean f5822g = true;

        public b(Menu menu) {
            this.f5816a = menu;
        }

        /* renamed from: a */
        public final <T> T m3400a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, C1188f.this.f5806c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e7) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e7);
                return null;
            }
        }

        /* renamed from: b */
        public final void m3401b(MenuItem menuItem) {
            boolean z6 = false;
            menuItem.setChecked(this.f5834s).setVisible(this.f5835t).setEnabled(this.f5836u).setCheckable(this.f5833r >= 1).setTitleCondensed(this.f5827l).setIcon(this.f5828m);
            int i7 = this.f5837v;
            if (i7 >= 0) {
                menuItem.setShowAsAction(i7);
            }
            String str = this.f5840y;
            C1188f c1188f = C1188f.this;
            if (str != null) {
                if (c1188f.f5806c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                if (c1188f.f5807d == null) {
                    c1188f.f5807d = C1188f.m3398a(c1188f.f5806c);
                }
                menuItem.setOnMenuItemClickListener(new a(c1188f.f5807d, this.f5840y));
            }
            if (this.f5833r >= 2) {
                if (menuItem instanceof C0161h) {
                    ((C0161h) menuItem).m558g(true);
                } else if (menuItem instanceof MenuItemC1269c) {
                    MenuItemC1269c menuItemC1269c = (MenuItemC1269c) menuItem;
                    try {
                        Method method = menuItemC1269c.f6337e;
                        InterfaceMenuItemC2271b interfaceMenuItemC2271b = menuItemC1269c.f6336d;
                        if (method == null) {
                            menuItemC1269c.f6337e = interfaceMenuItemC2271b.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        }
                        menuItemC1269c.f6337e.invoke(interfaceMenuItemC2271b, Boolean.TRUE);
                    } catch (Exception e7) {
                        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e7);
                    }
                }
            }
            String str2 = this.f5839x;
            if (str2 != null) {
                menuItem.setActionView((View) m3400a(str2, C1188f.f5802e, c1188f.f5804a));
                z6 = true;
            }
            int i8 = this.f5838w;
            if (i8 > 0) {
                if (z6) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i8);
                }
            }
            AbstractC0910b abstractC0910b = this.f5841z;
            if (abstractC0910b != null) {
                if (menuItem instanceof InterfaceMenuItemC2271b) {
                    ((InterfaceMenuItemC2271b) menuItem).mo553b(abstractC0910b);
                } else {
                    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
                }
            }
            CharSequence charSequence = this.f5811A;
            boolean z7 = menuItem instanceof InterfaceMenuItemC2271b;
            if (z7) {
                ((InterfaceMenuItemC2271b) menuItem).setContentDescription(charSequence);
            } else if (Build.VERSION.SDK_INT >= 26) {
                C0924i.m2716h(menuItem, charSequence);
            }
            CharSequence charSequence2 = this.f5812B;
            if (z7) {
                ((InterfaceMenuItemC2271b) menuItem).setTooltipText(charSequence2);
            } else if (Build.VERSION.SDK_INT >= 26) {
                C0924i.m2721m(menuItem, charSequence2);
            }
            char c7 = this.f5829n;
            int i9 = this.f5830o;
            if (z7) {
                ((InterfaceMenuItemC2271b) menuItem).setAlphabeticShortcut(c7, i9);
            } else if (Build.VERSION.SDK_INT >= 26) {
                C0924i.m2715g(menuItem, c7, i9);
            }
            char c8 = this.f5831p;
            int i10 = this.f5832q;
            if (z7) {
                ((InterfaceMenuItemC2271b) menuItem).setNumericShortcut(c8, i10);
            } else if (Build.VERSION.SDK_INT >= 26) {
                C0924i.m2719k(menuItem, c8, i10);
            }
            PorterDuff.Mode mode = this.f5814D;
            if (mode != null) {
                if (z7) {
                    ((InterfaceMenuItemC2271b) menuItem).setIconTintMode(mode);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    C0924i.m2718j(menuItem, mode);
                }
            }
            ColorStateList colorStateList = this.f5813C;
            if (colorStateList != null) {
                if (z7) {
                    ((InterfaceMenuItemC2271b) menuItem).setIconTintList(colorStateList);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    C0924i.m2717i(menuItem, colorStateList);
                }
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f5802e = clsArr;
        f5803f = clsArr;
    }

    public C1188f(Context context) {
        super(context);
        this.f5806c = context;
        Object[] objArr = {context};
        this.f5804a = objArr;
        this.f5805b = objArr;
    }

    /* renamed from: a */
    public static Object m3398a(Context context) {
        return (!(context instanceof Activity) && (context instanceof ContextWrapper)) ? m3398a(((ContextWrapper) context).getBaseContext()) : context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final void m3399b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        int i7;
        b bVar = new b(menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            i7 = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlResourceParser.next();
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        String str = null;
        boolean z6 = false;
        boolean z7 = false;
        while (!z6) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            Menu menu2 = bVar.f5816a;
            if (eventType != i7) {
                if (eventType == 3) {
                    String name2 = xmlResourceParser.getName();
                    if (z7 && name2.equals(str)) {
                        str = null;
                        z7 = false;
                    } else if (name2.equals("group")) {
                        bVar.f5817b = 0;
                        bVar.f5818c = 0;
                        bVar.f5819d = 0;
                        bVar.f5820e = 0;
                        bVar.f5821f = true;
                        bVar.f5822g = true;
                    } else if (name2.equals("item")) {
                        if (!bVar.f5823h) {
                            AbstractC0910b abstractC0910b = bVar.f5841z;
                            if (abstractC0910b == null || !abstractC0910b.mo2643a()) {
                                bVar.f5823h = true;
                                bVar.m3401b(menu2.add(bVar.f5817b, bVar.f5824i, bVar.f5825j, bVar.f5826k));
                            } else {
                                bVar.f5823h = true;
                                bVar.m3401b(menu2.addSubMenu(bVar.f5817b, bVar.f5824i, bVar.f5825j, bVar.f5826k).getItem());
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z6 = true;
                    }
                }
            } else if (!z7) {
                String name3 = xmlResourceParser.getName();
                boolean equals = name3.equals("group");
                C1188f c1188f = C1188f.this;
                if (equals) {
                    TypedArray obtainStyledAttributes = c1188f.f5806c.obtainStyledAttributes(attributeSet, R$styleable.f289q);
                    bVar.f5817b = obtainStyledAttributes.getResourceId(R$styleable.MenuGroup_android_id, 0);
                    bVar.f5818c = obtainStyledAttributes.getInt(R$styleable.MenuGroup_android_menuCategory, 0);
                    bVar.f5819d = obtainStyledAttributes.getInt(R$styleable.MenuGroup_android_orderInCategory, 0);
                    bVar.f5820e = obtainStyledAttributes.getInt(R$styleable.MenuGroup_android_checkableBehavior, 0);
                    bVar.f5821f = obtainStyledAttributes.getBoolean(R$styleable.MenuGroup_android_visible, true);
                    bVar.f5822g = obtainStyledAttributes.getBoolean(R$styleable.MenuGroup_android_enabled, true);
                    obtainStyledAttributes.recycle();
                } else if (name3.equals("item")) {
                    Context context = c1188f.f5806c;
                    C0233h1 c0233h1 = new C0233h1(context, context.obtainStyledAttributes(attributeSet, R$styleable.f290r));
                    bVar.f5824i = c0233h1.m799i(R$styleable.MenuItem_android_id, 0);
                    bVar.f5825j = (c0233h1.m798h(R$styleable.MenuItem_android_menuCategory, bVar.f5818c) & (-65536)) | (c0233h1.m798h(R$styleable.MenuItem_android_orderInCategory, bVar.f5819d) & 65535);
                    bVar.f5826k = c0233h1.m801k(R$styleable.MenuItem_android_title);
                    bVar.f5827l = c0233h1.m801k(R$styleable.MenuItem_android_titleCondensed);
                    bVar.f5828m = c0233h1.m799i(R$styleable.MenuItem_android_icon, 0);
                    String m800j = c0233h1.m800j(R$styleable.MenuItem_android_alphabeticShortcut);
                    bVar.f5829n = m800j == null ? (char) 0 : m800j.charAt(0);
                    bVar.f5830o = c0233h1.m798h(R$styleable.MenuItem_alphabeticModifiers, 4096);
                    String m800j2 = c0233h1.m800j(R$styleable.MenuItem_android_numericShortcut);
                    bVar.f5831p = m800j2 == null ? (char) 0 : m800j2.charAt(0);
                    bVar.f5832q = c0233h1.m798h(R$styleable.MenuItem_numericModifiers, 4096);
                    int i8 = R$styleable.MenuItem_android_checkable;
                    bVar.f5833r = c0233h1.m802l(i8) ? c0233h1.m791a(i8, false) : bVar.f5820e;
                    bVar.f5834s = c0233h1.m791a(R$styleable.MenuItem_android_checked, false);
                    bVar.f5835t = c0233h1.m791a(R$styleable.MenuItem_android_visible, bVar.f5821f);
                    bVar.f5836u = c0233h1.m791a(R$styleable.MenuItem_android_enabled, bVar.f5822g);
                    bVar.f5837v = c0233h1.m798h(R$styleable.MenuItem_showAsAction, -1);
                    bVar.f5840y = c0233h1.m800j(R$styleable.MenuItem_android_onClick);
                    bVar.f5838w = c0233h1.m799i(R$styleable.MenuItem_actionLayout, 0);
                    bVar.f5839x = c0233h1.m800j(R$styleable.MenuItem_actionViewClass);
                    String m800j3 = c0233h1.m800j(R$styleable.MenuItem_actionProviderClass);
                    boolean z8 = m800j3 != null;
                    if (z8 && bVar.f5838w == 0 && bVar.f5839x == null) {
                        bVar.f5841z = (AbstractC0910b) bVar.m3400a(m800j3, f5803f, c1188f.f5805b);
                    } else {
                        if (z8) {
                            Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                        }
                        bVar.f5841z = null;
                    }
                    bVar.f5811A = c0233h1.m801k(R$styleable.MenuItem_contentDescription);
                    bVar.f5812B = c0233h1.m801k(R$styleable.MenuItem_tooltipText);
                    int i9 = R$styleable.MenuItem_iconTintMode;
                    if (c0233h1.m802l(i9)) {
                        bVar.f5814D = C0244l0.m844c(c0233h1.m798h(i9, -1), bVar.f5814D);
                    } else {
                        bVar.f5814D = null;
                    }
                    int i10 = R$styleable.MenuItem_iconTint;
                    if (c0233h1.m802l(i10)) {
                        bVar.f5813C = c0233h1.m792b(i10);
                    } else {
                        bVar.f5813C = null;
                    }
                    c0233h1.m803n();
                    bVar.f5823h = false;
                } else if (name3.equals("menu")) {
                    bVar.f5823h = true;
                    SubMenu addSubMenu = menu2.addSubMenu(bVar.f5817b, bVar.f5824i, bVar.f5825j, bVar.f5826k);
                    bVar.m3401b(addSubMenu.getItem());
                    m3399b(xmlResourceParser, attributeSet, addSubMenu);
                } else {
                    str = name3;
                    z7 = true;
                }
            }
            eventType = xmlResourceParser.next();
            i7 = 2;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i7, Menu menu) {
        if (!(menu instanceof InterfaceMenuC2270a)) {
            super.inflate(i7, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f5806c.getResources().getLayout(i7);
                    m3399b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                    xmlResourceParser.close();
                } catch (XmlPullParserException e7) {
                    throw new InflateException("Error inflating menu XML", e7);
                }
            } catch (IOException e8) {
                throw new InflateException("Error inflating menu XML", e8);
            }
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
