package p198z0;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.ViewGroup;
import p198z0.C2274b;

/* renamed from: z0.a */
/* loaded from: classes.dex */
public abstract class AbstractC2273a {

    /* renamed from: a */
    public final DataSetObservable f10372a = new DataSetObservable();

    /* renamed from: b */
    public DataSetObserver f10373b;

    /* renamed from: a */
    public abstract void mo4117a(int i7, Object obj);

    /* renamed from: b */
    public abstract void mo4118b();

    /* renamed from: c */
    public abstract int mo4299c();

    /* renamed from: d */
    public abstract Object mo4119d(ViewGroup viewGroup, int i7);

    /* renamed from: e */
    public final void m5503e() {
        synchronized (this) {
            DataSetObserver dataSetObserver = this.f10373b;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        this.f10372a.notifyChanged();
    }

    /* renamed from: f */
    public abstract void mo4120f(Parcelable parcelable, ClassLoader classLoader);

    /* renamed from: g */
    public final void m5504g(C2274b.i iVar) {
        synchronized (this) {
            this.f10373b = iVar;
        }
    }
}
