package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* renamed from: com.google.android.material.datepicker.u */
/* loaded from: classes.dex */
public final class C0803u<S> extends AbstractC0777a0<S> {

    /* renamed from: i2 */
    public int f4210i2;

    /* renamed from: j2 */
    public InterfaceC0782d<S> f4211j2;

    /* renamed from: k2 */
    public C0776a f4212k2;

    /* renamed from: com.google.android.material.datepicker.u$a */
    public class a extends AbstractC0808z<S> {
        public a() {
        }

        @Override // com.google.android.material.datepicker.AbstractC0808z
        /* renamed from: a */
        public final void mo2434a(S s7) {
            Iterator<AbstractC0808z<S>> it = C0803u.this.f4118h2.iterator();
            while (it.hasNext()) {
                it.next().mo2434a(s7);
            }
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0361n
    /* renamed from: t */
    public final void mo1215t(Bundle bundle) {
        super.mo1215t(bundle);
        if (bundle == null) {
            bundle = this.f1800Z;
        }
        this.f4210i2 = bundle.getInt("THEME_RES_ID_KEY");
        this.f4211j2 = (InterfaceC0782d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f4212k2 = (C0776a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0361n
    /* renamed from: u */
    public final View mo1245u(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(m1237i(), this.f4210i2));
        InterfaceC0782d<S> interfaceC0782d = this.f4211j2;
        new a();
        return interfaceC0782d.m2420x();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0361n
    /* renamed from: y */
    public final void mo1219y(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f4210i2);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f4211j2);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f4212k2);
    }
}
