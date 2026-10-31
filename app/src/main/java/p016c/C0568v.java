package p016c;

import android.content.Context;
import android.content.ContextWrapper;
import android.ext.C0090b;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.R$attr;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0219d;
import androidx.appcompat.widget.C0225f;
import androidx.appcompat.widget.C0228g;
import androidx.appcompat.widget.C0265t;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p089l.C1481o;

/* renamed from: c.v */
/* loaded from: classes.dex */
public class C0568v {

    /* renamed from: b */
    public static final Class<?>[] f2905b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    public static final int[] f2906c = {R.attr.onClick};

    /* renamed from: d */
    public static final int[] f2907d = {R.attr.accessibilityHeading};

    /* renamed from: e */
    public static final int[] f2908e = {R.attr.accessibilityPaneTitle};

    /* renamed from: f */
    public static final int[] f2909f = {R.attr.screenReaderFocusable};

    /* renamed from: g */
    public static final String[] f2910g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h */
    public static final C1481o<String, Constructor<? extends View>> f2911h = new C1481o<>();

    /* renamed from: a */
    public final Object[] f2912a = new Object[2];

    /* renamed from: c.v$a */
    public static class a implements View.OnClickListener {

        /* renamed from: c */
        public final View f2913c;

        /* renamed from: e */
        public final String f2914e;

        /* renamed from: m */
        public Method f2915m;

        /* renamed from: s */
        public Context f2916s;

        public a(View view, String str) {
            this.f2913c = view;
            this.f2914e = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String str;
            Method method;
            if (this.f2915m == null) {
                View view2 = this.f2913c;
                Context context = view2.getContext();
                while (true) {
                    String str2 = this.f2914e;
                    if (context == null) {
                        int id = view2.getId();
                        if (id == -1) {
                            str = "";
                        } else {
                            str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                        }
                        StringBuilder m222h = C0090b.m222h("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                        m222h.append(view2.getClass());
                        m222h.append(str);
                        throw new IllegalStateException(m222h.toString());
                    }
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                            this.f2915m = method;
                            this.f2916s = context;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                    context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
                }
            }
            try {
                this.f2915m.invoke(this.f2916s, view);
            } catch (IllegalAccessException e7) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException("Could not execute method for android:onClick", e8);
            }
        }
    }

    /* renamed from: a */
    public C0219d mo1984a(Context context, AttributeSet attributeSet) {
        return new C0219d(context, attributeSet);
    }

    /* renamed from: b */
    public C0225f mo1985b(Context context, AttributeSet attributeSet) {
        return new C0225f(context, attributeSet);
    }

    /* renamed from: c */
    public C0228g mo1986c(Context context, AttributeSet attributeSet) {
        return new C0228g(context, attributeSet);
    }

    /* renamed from: d */
    public C0265t mo1987d(Context context, AttributeSet attributeSet) {
        return new C0265t(context, attributeSet, R$attr.radioButtonStyle);
    }

    /* renamed from: e */
    public AppCompatTextView mo1988e(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    /* renamed from: f */
    public final View m1989f(Context context, String str, String str2) {
        String concat;
        C1481o<String, Constructor<? extends View>> c1481o = f2911h;
        Constructor<? extends View> constructor = c1481o.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    concat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                concat = str;
            }
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f2905b);
            c1481o.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.f2912a);
    }
}
