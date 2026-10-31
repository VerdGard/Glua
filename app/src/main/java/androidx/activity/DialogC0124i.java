package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC0394f;
import androidx.lifecycle.C0401l;
import androidx.lifecycle.InterfaceC0400k;
import androidx.savedstate.C0493a;
import p032d6.C0898f;
import p152t0.C1919b;
import p152t0.InterfaceC1920c;

/* renamed from: androidx.activity.i */
/* loaded from: classes.dex */
public class DialogC0124i extends Dialog implements InterfaceC0400k, InterfaceC0142u, InterfaceC1920c {

    /* renamed from: c */
    public C0401l f230c;

    /* renamed from: e */
    public final C1919b f231e;

    /* renamed from: m */
    public final OnBackPressedDispatcher f232m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC0124i(int i7, Context context) {
        super(context, i7);
        C0898f.m2606e(context, "context");
        this.f231e = new C1919b(this);
        this.f232m = new OnBackPressedDispatcher(new RunnableC0123h(0, this));
    }

    /* renamed from: d */
    public static void m375d(DialogC0124i dialogC0124i) {
        C0898f.m2606e(dialogC0124i, "this$0");
        super.onBackPressed();
    }

    @Override // androidx.activity.InterfaceC0142u
    /* renamed from: a */
    public final OnBackPressedDispatcher mo349a() {
        return this.f232m;
    }

    @Override // p152t0.InterfaceC1920c
    /* renamed from: b */
    public final C0493a mo350b() {
        return this.f231e.f8684b;
    }

    @Override // androidx.lifecycle.InterfaceC0400k
    /* renamed from: m */
    public final C0401l mo354m() {
        C0401l c0401l = this.f230c;
        if (c0401l != null) {
            return c0401l;
        }
        C0401l c0401l2 = new C0401l(this);
        this.f230c = c0401l2;
        return c0401l2;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f232m.m361b();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            C0898f.m2605d(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            OnBackPressedDispatcher onBackPressedDispatcher = this.f232m;
            onBackPressedDispatcher.getClass();
            onBackPressedDispatcher.f203f = onBackInvokedDispatcher;
            onBackPressedDispatcher.m362c(onBackPressedDispatcher.f205h);
        }
        this.f231e.m4533b(bundle);
        C0401l c0401l = this.f230c;
        if (c0401l == null) {
            c0401l = new C0401l(this);
            this.f230c = c0401l;
        }
        c0401l.m1379e(AbstractC0394f.a.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        C0898f.m2605d(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f231e.m4534c(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        C0401l c0401l = this.f230c;
        if (c0401l == null) {
            c0401l = new C0401l(this);
            this.f230c = c0401l;
        }
        c0401l.m1379e(AbstractC0394f.a.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        C0401l c0401l = this.f230c;
        if (c0401l == null) {
            c0401l = new C0401l(this);
            this.f230c = c0401l;
        }
        c0401l.m1379e(AbstractC0394f.a.ON_DESTROY);
        this.f230c = null;
        super.onStop();
    }
}
