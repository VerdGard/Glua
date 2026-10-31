package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.appcompat.view.menu.InterfaceC0163j;

/* renamed from: androidx.appcompat.view.menu.a */
/* loaded from: classes.dex */
public abstract class AbstractC0154a implements InterfaceC0163j {

    /* renamed from: X */
    public InterfaceC0163j.a f410X;

    /* renamed from: Y */
    public final int f411Y;

    /* renamed from: Z */
    public final int f412Z;

    /* renamed from: c */
    public final Context f413c;

    /* renamed from: e */
    public Context f414e;

    /* renamed from: m */
    public C0159f f415m;

    /* renamed from: s */
    public final LayoutInflater f416s;

    /* renamed from: w1 */
    public InterfaceC0164k f417w1;

    /* renamed from: x1 */
    public int f418x1;

    public AbstractC0154a(Context context, int i7, int i8) {
        this.f413c = context;
        this.f416s = LayoutInflater.from(context);
        this.f411Y = i7;
        this.f412Z = i8;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0163j
    /* renamed from: d */
    public final boolean mo497d(C0161h c0161h) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0163j
    public final int getId() {
        return this.f418x1;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0163j
    /* renamed from: l */
    public final void mo498l(InterfaceC0163j.a aVar) {
        this.f410X = aVar;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0163j
    /* renamed from: m */
    public final boolean mo499m(C0161h c0161h) {
        return false;
    }
}
