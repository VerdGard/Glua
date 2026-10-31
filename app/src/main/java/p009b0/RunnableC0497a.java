package p009b0;

import android.graphics.Typeface;
import androidx.lifecycle.C0391d0;
import p173w.C2044f;
import p181x.C2156e;

/* renamed from: b0.a */
/* loaded from: classes.dex */
public final class RunnableC0497a implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ C0391d0 f2508c;

    /* renamed from: e */
    public final /* synthetic */ Typeface f2509e;

    public RunnableC0497a(C0391d0 c0391d0, Typeface typeface) {
        this.f2508c = c0391d0;
        this.f2509e = typeface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2044f.e eVar = ((C2156e.a) this.f2508c).f9773q;
        if (eVar != null) {
            eVar.mo721d(this.f2509e);
        }
    }
}
