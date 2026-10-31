package androidx.activity;

import androidx.activity.ComponentActivity;
import java.util.ArrayList;
import java.util.Iterator;
import p023c6.InterfaceC0655a;
import p187x5.C2199c;

/* renamed from: androidx.activity.k */
/* loaded from: classes.dex */
public final class C0126k {

    /* renamed from: a */
    public final InterfaceC0655a<C2199c> f235a;

    /* renamed from: c */
    public boolean f237c;

    /* renamed from: b */
    public final Object f236b = new Object();

    /* renamed from: d */
    public final ArrayList f238d = new ArrayList();

    public C0126k(ComponentActivity.ExecutorC0112e executorC0112e, C0120e c0120e) {
        this.f235a = c0120e;
    }

    /* renamed from: a */
    public final void m376a() {
        synchronized (this.f236b) {
            this.f237c = true;
            Iterator it = this.f238d.iterator();
            while (it.hasNext()) {
                ((InterfaceC0655a) it.next()).mo373a();
            }
            this.f238d.clear();
        }
    }
}
