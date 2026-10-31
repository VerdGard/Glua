package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.AbstractC0394f;
import androidx.lifecycle.InterfaceC0398i;
import androidx.lifecycle.InterfaceC0400k;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
final class ImmLeaksCleaner implements InterfaceC0398i {

    /* renamed from: b */
    public static int f193b;

    /* renamed from: c */
    public static Field f194c;

    /* renamed from: d */
    public static Field f195d;

    /* renamed from: e */
    public static Field f196e;

    /* renamed from: a */
    public final Activity f197a;

    public ImmLeaksCleaner(Activity activity) {
        this.f197a = activity;
    }

    @Override // androidx.lifecycle.InterfaceC0398i
    /* renamed from: d */
    public final void mo357d(InterfaceC0400k interfaceC0400k, AbstractC0394f.a aVar) {
        if (aVar != AbstractC0394f.a.ON_DESTROY) {
            return;
        }
        if (f193b == 0) {
            try {
                f193b = 2;
                Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                f195d = declaredField;
                declaredField.setAccessible(true);
                Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                f196e = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                f194c = declaredField3;
                declaredField3.setAccessible(true);
                f193b = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f193b == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f197a.getSystemService("input_method");
            try {
                Object obj = f194c.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f195d.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f196e.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused2) {
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    } catch (ClassCastException unused3) {
                    } catch (IllegalAccessException unused4) {
                    }
                }
            } catch (IllegalAccessException unused5) {
            }
        }
    }
}
