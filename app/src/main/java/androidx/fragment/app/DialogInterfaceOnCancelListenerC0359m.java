package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.ext.C0090b;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.AbstractC0136c;
import androidx.fragment.app.AbstractC0378x.m;
import androidx.fragment.app.ComponentCallbacksC0361n;
import androidx.lifecycle.InterfaceC0400k;
import androidx.lifecycle.InterfaceC0405p;
import androidx.lifecycle.runtime.R$id;
import p032d6.C0898f;

/* renamed from: androidx.fragment.app.m */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0359m extends ComponentCallbacksC0361n implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: h2 */
    public Handler f1747h2;

    /* renamed from: q2 */
    public boolean f1756q2;

    /* renamed from: s2 */
    public Dialog f1758s2;

    /* renamed from: t2 */
    public boolean f1759t2;

    /* renamed from: u2 */
    public boolean f1760u2;

    /* renamed from: v2 */
    public boolean f1761v2;

    /* renamed from: i2 */
    public final a f1748i2 = new a();

    /* renamed from: j2 */
    public final b f1749j2 = new b();

    /* renamed from: k2 */
    public final c f1750k2 = new c();

    /* renamed from: l2 */
    public int f1751l2 = 0;

    /* renamed from: m2 */
    public int f1752m2 = 0;

    /* renamed from: n2 */
    public boolean f1753n2 = true;

    /* renamed from: o2 */
    public boolean f1754o2 = true;

    /* renamed from: p2 */
    public int f1755p2 = -1;

    /* renamed from: r2 */
    public final d f1757r2 = new d();

    /* renamed from: w2 */
    public boolean f1762w2 = false;

    /* renamed from: androidx.fragment.app.m$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public final void run() {
            DialogInterfaceOnCancelListenerC0359m dialogInterfaceOnCancelListenerC0359m = DialogInterfaceOnCancelListenerC0359m.this;
            dialogInterfaceOnCancelListenerC0359m.f1750k2.onDismiss(dialogInterfaceOnCancelListenerC0359m.f1758s2);
        }
    }

    /* renamed from: androidx.fragment.app.m$b */
    public class b implements DialogInterface.OnCancelListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        @SuppressLint({"SyntheticAccessor"})
        public final void onCancel(DialogInterface dialogInterface) {
            DialogInterfaceOnCancelListenerC0359m dialogInterfaceOnCancelListenerC0359m = DialogInterfaceOnCancelListenerC0359m.this;
            Dialog dialog = dialogInterfaceOnCancelListenerC0359m.f1758s2;
            if (dialog != null) {
                dialogInterfaceOnCancelListenerC0359m.onCancel(dialog);
            }
        }
    }

    /* renamed from: androidx.fragment.app.m$c */
    public class c implements DialogInterface.OnDismissListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        @SuppressLint({"SyntheticAccessor"})
        public final void onDismiss(DialogInterface dialogInterface) {
            DialogInterfaceOnCancelListenerC0359m dialogInterfaceOnCancelListenerC0359m = DialogInterfaceOnCancelListenerC0359m.this;
            Dialog dialog = dialogInterfaceOnCancelListenerC0359m.f1758s2;
            if (dialog != null) {
                dialogInterfaceOnCancelListenerC0359m.onDismiss(dialog);
            }
        }
    }

    /* renamed from: androidx.fragment.app.m$d */
    public class d implements InterfaceC0405p<InterfaceC0400k> {
        public d() {
        }
    }

    /* renamed from: androidx.fragment.app.m$e */
    public class e extends AbstractC0136c {

        /* renamed from: e */
        public final /* synthetic */ AbstractC0136c f1767e;

        public e(ComponentCallbacksC0361n.a aVar) {
            this.f1767e = aVar;
        }

        @Override // androidx.activity.result.AbstractC0136c
        /* renamed from: s */
        public final View mo390s(int i7) {
            AbstractC0136c abstractC0136c = this.f1767e;
            if (abstractC0136c.mo394w()) {
                return abstractC0136c.mo390s(i7);
            }
            Dialog dialog = DialogInterfaceOnCancelListenerC0359m.this.f1758s2;
            if (dialog != null) {
                return dialog.findViewById(i7);
            }
            return null;
        }

        @Override // androidx.activity.result.AbstractC0136c
        /* renamed from: w */
        public final boolean mo394w() {
            return this.f1767e.mo394w() || DialogInterfaceOnCancelListenerC0359m.this.f1762w2;
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0361n
    /* renamed from: A */
    public void mo1207A() {
        this.f1791S1 = true;
        Dialog dialog = this.f1758s2;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0361n
    /* renamed from: B */
    public final void mo1208B(Bundle bundle) {
        Bundle bundle2;
        this.f1791S1 = true;
        if (this.f1758s2 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f1758s2.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0361n
    /* renamed from: C */
    public final void mo1209C(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.mo1209C(layoutInflater, viewGroup, bundle);
        if (this.f1793U1 != null || this.f1758s2 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f1758s2.onRestoreInstanceState(bundle2);
    }

    /* renamed from: O */
    public final void m1210O(boolean z6, boolean z7) {
        if (this.f1760u2) {
            return;
        }
        this.f1760u2 = true;
        this.f1761v2 = false;
        Dialog dialog = this.f1758s2;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f1758s2.dismiss();
            if (!z7) {
                if (Looper.myLooper() == this.f1747h2.getLooper()) {
                    onDismiss(this.f1758s2);
                } else {
                    this.f1747h2.post(this.f1748i2);
                }
            }
        }
        this.f1759t2 = true;
        if (this.f1755p2 >= 0) {
            AbstractC0378x m1239l = m1239l();
            int i7 = this.f1755p2;
            if (i7 < 0) {
                throw new IllegalArgumentException(C0090b.m219e("Bad id: ", i7));
            }
            m1239l.m1335v(m1239l.new m(i7), false);
            this.f1755p2 = -1;
            return;
        }
        C0335a c0335a = new C0335a(m1239l());
        c0335a.m1140i(this);
        if (z6) {
            c0335a.m1135d(true);
        } else {
            c0335a.m1135d(false);
        }
    }

    /* renamed from: P */
    public Dialog mo1211P(Bundle bundle) {
        if (AbstractC0378x.m1285I(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new Dialog(m1228I(), this.f1752m2);
    }

    /* renamed from: Q */
    public final Dialog m1212Q() {
        Dialog dialog = this.f1758s2;
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0361n
    /* renamed from: d */
    public final AbstractC0136c mo1213d() {
        return new e(new ComponentCallbacksC0361n.a());
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f1759t2) {
            return;
        }
        if (AbstractC0378x.m1285I(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        m1210O(true, true);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0361n
    /* renamed from: s */
    public final void mo1214s(Context context) {
        super.mo1214s(context);
        this.f1806d2.m1343d(this.f1757r2);
        if (this.f1761v2) {
            return;
        }
        this.f1760u2 = false;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0361n
    /* renamed from: t */
    public void mo1215t(Bundle bundle) {
        super.mo1215t(bundle);
        this.f1747h2 = new Handler();
        this.f1754o2 = this.f1785M1 == 0;
        if (bundle != null) {
            this.f1751l2 = bundle.getInt("android:style", 0);
            this.f1752m2 = bundle.getInt("android:theme", 0);
            this.f1753n2 = bundle.getBoolean("android:cancelable", true);
            this.f1754o2 = bundle.getBoolean("android:showsDialog", this.f1754o2);
            this.f1755p2 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0361n
    /* renamed from: v */
    public final void mo1216v() {
        this.f1791S1 = true;
        Dialog dialog = this.f1758s2;
        if (dialog != null) {
            this.f1759t2 = true;
            dialog.setOnDismissListener(null);
            this.f1758s2.dismiss();
            if (!this.f1760u2) {
                onDismiss(this.f1758s2);
            }
            this.f1758s2 = null;
            this.f1762w2 = false;
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0361n
    /* renamed from: w */
    public final void mo1217w() {
        this.f1791S1 = true;
        if (!this.f1761v2 && !this.f1760u2) {
            this.f1760u2 = true;
        }
        this.f1806d2.mo1346g(this.f1757r2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0046 A[Catch: all -> 0x006b, TryCatch #0 {all -> 0x006b, blocks: (B:10:0x001a, B:12:0x0026, B:18:0x003e, B:20:0x0046, B:21:0x004d, B:23:0x0030, B:25:0x0036, B:26:0x003b, B:27:0x0065), top: B:9:0x001a }] */
    @Override // androidx.fragment.app.ComponentCallbacksC0361n
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.LayoutInflater mo1218x(android.os.Bundle r8) {
        /*
            r7 = this;
            android.view.LayoutInflater r0 = super.mo1218x(r8)
            boolean r1 = r7.f1754o2
            java.lang.String r2 = "FragmentManager"
            r3 = 2
            if (r1 == 0) goto L98
            boolean r4 = r7.f1756q2
            if (r4 == 0) goto L11
            goto L98
        L11:
            if (r1 != 0) goto L14
            goto L6f
        L14:
            boolean r1 = r7.f1762w2
            if (r1 != 0) goto L6f
            r1 = 0
            r4 = 1
            r7.f1756q2 = r4     // Catch: java.lang.Throwable -> L6b
            android.app.Dialog r8 = r7.mo1211P(r8)     // Catch: java.lang.Throwable -> L6b
            r7.f1758s2 = r8     // Catch: java.lang.Throwable -> L6b
            boolean r5 = r7.f1754o2     // Catch: java.lang.Throwable -> L6b
            if (r5 == 0) goto L65
            int r5 = r7.f1751l2     // Catch: java.lang.Throwable -> L6b
            if (r5 == r4) goto L3b
            if (r5 == r3) goto L3b
            r6 = 3
            if (r5 == r6) goto L30
            goto L3e
        L30:
            android.view.Window r5 = r8.getWindow()     // Catch: java.lang.Throwable -> L6b
            if (r5 == 0) goto L3b
            r6 = 24
            r5.addFlags(r6)     // Catch: java.lang.Throwable -> L6b
        L3b:
            r8.requestWindowFeature(r4)     // Catch: java.lang.Throwable -> L6b
        L3e:
            android.content.Context r8 = r7.m1237i()     // Catch: java.lang.Throwable -> L6b
            boolean r5 = r8 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L6b
            if (r5 == 0) goto L4d
            android.app.Dialog r5 = r7.f1758s2     // Catch: java.lang.Throwable -> L6b
            android.app.Activity r8 = (android.app.Activity) r8     // Catch: java.lang.Throwable -> L6b
            r5.setOwnerActivity(r8)     // Catch: java.lang.Throwable -> L6b
        L4d:
            android.app.Dialog r8 = r7.f1758s2     // Catch: java.lang.Throwable -> L6b
            boolean r5 = r7.f1753n2     // Catch: java.lang.Throwable -> L6b
            r8.setCancelable(r5)     // Catch: java.lang.Throwable -> L6b
            android.app.Dialog r8 = r7.f1758s2     // Catch: java.lang.Throwable -> L6b
            androidx.fragment.app.m$b r5 = r7.f1749j2     // Catch: java.lang.Throwable -> L6b
            r8.setOnCancelListener(r5)     // Catch: java.lang.Throwable -> L6b
            android.app.Dialog r8 = r7.f1758s2     // Catch: java.lang.Throwable -> L6b
            androidx.fragment.app.m$c r5 = r7.f1750k2     // Catch: java.lang.Throwable -> L6b
            r8.setOnDismissListener(r5)     // Catch: java.lang.Throwable -> L6b
            r7.f1762w2 = r4     // Catch: java.lang.Throwable -> L6b
            goto L68
        L65:
            r8 = 0
            r7.f1758s2 = r8     // Catch: java.lang.Throwable -> L6b
        L68:
            r7.f1756q2 = r1
            goto L6f
        L6b:
            r8 = move-exception
            r7.f1756q2 = r1
            throw r8
        L6f:
            boolean r8 = androidx.fragment.app.AbstractC0378x.m1285I(r3)
            if (r8 == 0) goto L8b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r1 = "get layout inflater for DialogFragment "
            r8.<init>(r1)
            r8.append(r7)
            java.lang.String r1 = " from dialog context"
            r8.append(r1)
            java.lang.String r8 = r8.toString()
            android.util.Log.d(r2, r8)
        L8b:
            android.app.Dialog r8 = r7.f1758s2
            if (r8 == 0) goto L97
            android.content.Context r8 = r8.getContext()
            android.view.LayoutInflater r0 = r0.cloneInContext(r8)
        L97:
            return r0
        L98:
            boolean r8 = androidx.fragment.app.AbstractC0378x.m1285I(r3)
            if (r8 == 0) goto Lc9
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r1 = "getting layout inflater for DialogFragment "
            r8.<init>(r1)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            boolean r1 = r7.f1754o2
            if (r1 != 0) goto Lb8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "mShowsDialog = false: "
            r1.<init>(r3)
            goto Lbf
        Lb8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "mCreatingDialog = true: "
            r1.<init>(r3)
        Lbf:
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            android.util.Log.d(r2, r8)
        Lc9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.DialogInterfaceOnCancelListenerC0359m.mo1218x(android.os.Bundle):android.view.LayoutInflater");
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0361n
    /* renamed from: y */
    public void mo1219y(Bundle bundle) {
        Dialog dialog = this.f1758s2;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i7 = this.f1751l2;
        if (i7 != 0) {
            bundle.putInt("android:style", i7);
        }
        int i8 = this.f1752m2;
        if (i8 != 0) {
            bundle.putInt("android:theme", i8);
        }
        boolean z6 = this.f1753n2;
        if (!z6) {
            bundle.putBoolean("android:cancelable", z6);
        }
        boolean z7 = this.f1754o2;
        if (!z7) {
            bundle.putBoolean("android:showsDialog", z7);
        }
        int i9 = this.f1755p2;
        if (i9 != -1) {
            bundle.putInt("android:backStackId", i9);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0361n
    /* renamed from: z */
    public void mo1220z() {
        this.f1791S1 = true;
        Dialog dialog = this.f1758s2;
        if (dialog != null) {
            this.f1759t2 = false;
            dialog.show();
            View decorView = this.f1758s2.getWindow().getDecorView();
            C0898f.m2606e(decorView, "<this>");
            decorView.setTag(R$id.view_tree_lifecycle_owner, this);
            decorView.setTag(androidx.lifecycle.viewmodel.R$id.view_tree_view_model_store_owner, this);
            decorView.setTag(androidx.savedstate.R$id.view_tree_saved_state_registry_owner, this);
        }
    }
}
