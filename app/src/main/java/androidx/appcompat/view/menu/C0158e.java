package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.InterfaceC0164k;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.e */
/* loaded from: classes.dex */
public final class C0158e extends BaseAdapter {

    /* renamed from: X */
    public final LayoutInflater f465X;

    /* renamed from: Y */
    public final int f466Y;

    /* renamed from: c */
    public final C0159f f467c;

    /* renamed from: e */
    public int f468e = -1;

    /* renamed from: m */
    public boolean f469m;

    /* renamed from: s */
    public final boolean f470s;

    public C0158e(C0159f c0159f, LayoutInflater layoutInflater, boolean z6, int i7) {
        this.f470s = z6;
        this.f465X = layoutInflater;
        this.f467c = c0159f;
        this.f466Y = i7;
        m523b();
    }

    /* renamed from: b */
    public final void m523b() {
        C0159f c0159f = this.f467c;
        C0161h c0161h = c0159f.f493v;
        if (c0161h != null) {
            c0159f.m533i();
            ArrayList<C0161h> arrayList = c0159f.f481j;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (arrayList.get(i7) == c0161h) {
                    this.f468e = i7;
                    return;
                }
            }
        }
        this.f468e = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final C0161h getItem(int i7) {
        ArrayList<C0161h> m536l;
        boolean z6 = this.f470s;
        C0159f c0159f = this.f467c;
        if (z6) {
            c0159f.m533i();
            m536l = c0159f.f481j;
        } else {
            m536l = c0159f.m536l();
        }
        int i8 = this.f468e;
        if (i8 >= 0 && i7 >= i8) {
            i7++;
        }
        return m536l.get(i7);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList<C0161h> m536l;
        boolean z6 = this.f470s;
        C0159f c0159f = this.f467c;
        if (z6) {
            c0159f.m533i();
            m536l = c0159f.f481j;
        } else {
            m536l = c0159f.m536l();
        }
        int i7 = this.f468e;
        int size = m536l.size();
        return i7 < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i7) {
        return i7;
    }

    @Override // android.widget.Adapter
    public final View getView(int i7, View view, ViewGroup viewGroup) {
        boolean z6 = false;
        if (view == null) {
            view = this.f465X.inflate(this.f466Y, viewGroup, false);
        }
        int i8 = getItem(i7).f503b;
        int i9 = i7 - 1;
        int i10 = i9 >= 0 ? getItem(i9).f503b : i8;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f467c.mo537m() && i8 != i10) {
            z6 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z6);
        InterfaceC0164k.a aVar = (InterfaceC0164k.a) view;
        if (this.f469m) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.mo489c(getItem(i7));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m523b();
        super.notifyDataSetChanged();
    }
}
