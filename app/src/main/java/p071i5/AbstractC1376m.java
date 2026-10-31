package p071i5;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import java.util.List;
import p171v4.AbstractC2020d;

/* renamed from: i5.m */
/* loaded from: classes.dex */
public abstract class AbstractC1376m extends BaseAdapter implements Adapter {

    /* renamed from: c */
    public C1374k f6695c;

    /* renamed from: e */
    public List<AbstractC2020d> f6696e;

    /* renamed from: b */
    public abstract View mo3717b(int i7, View view, ViewGroup viewGroup, boolean z6);

    @Override // android.widget.Adapter
    public final int getCount() {
        List<AbstractC2020d> list = this.f6696e;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i7) {
        return this.f6696e.get(i7);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i7) {
        return this.f6696e.get(i7).hashCode();
    }

    @Override // android.widget.Adapter
    public final View getView(int i7, View view, ViewGroup viewGroup) {
        return mo3717b(i7, view, viewGroup, i7 == this.f6695c.f6679I1);
    }
}
