package p074j0;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.ext.C0090b;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import p074j0.C1398b;

/* renamed from: j0.a */
/* loaded from: classes.dex */
public abstract class AbstractC1397a extends BaseAdapter implements Filterable, C1398b.a {

    /* renamed from: Z */
    public C1398b f6736Z;

    /* renamed from: e */
    public boolean f6738e = true;

    /* renamed from: m */
    public Cursor f6739m = null;

    /* renamed from: c */
    public boolean f6737c = false;

    /* renamed from: s */
    public int f6740s = -1;

    /* renamed from: X */
    public a f6734X = new a();

    /* renamed from: Y */
    public b f6735Y = new b();

    /* renamed from: j0.a$a */
    public class a extends ContentObserver {
        public a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public final boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z6) {
            Cursor cursor;
            AbstractC1397a abstractC1397a = AbstractC1397a.this;
            if (!abstractC1397a.f6738e || (cursor = abstractC1397a.f6739m) == null || cursor.isClosed()) {
                return;
            }
            abstractC1397a.f6737c = abstractC1397a.f6739m.requery();
        }
    }

    /* renamed from: j0.a$b */
    public class b extends DataSetObserver {
        public b() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            AbstractC1397a abstractC1397a = AbstractC1397a.this;
            abstractC1397a.f6737c = true;
            abstractC1397a.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            AbstractC1397a abstractC1397a = AbstractC1397a.this;
            abstractC1397a.f6737c = false;
            abstractC1397a.notifyDataSetInvalidated();
        }
    }

    public AbstractC1397a(Context context) {
    }

    /* renamed from: b */
    public abstract void mo689b(View view, Cursor cursor);

    /* renamed from: c */
    public void mo690c(Cursor cursor) {
        Cursor cursor2 = this.f6739m;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                a aVar = this.f6734X;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                b bVar = this.f6735Y;
                if (bVar != null) {
                    cursor2.unregisterDataSetObserver(bVar);
                }
            }
            this.f6739m = cursor;
            if (cursor != null) {
                a aVar2 = this.f6734X;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                b bVar2 = this.f6735Y;
                if (bVar2 != null) {
                    cursor.registerDataSetObserver(bVar2);
                }
                this.f6740s = cursor.getColumnIndexOrThrow("_id");
                this.f6737c = true;
                notifyDataSetChanged();
            } else {
                this.f6740s = -1;
                this.f6737c = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    /* renamed from: d */
    public abstract String mo691d(Cursor cursor);

    /* renamed from: e */
    public abstract View mo692e(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f6737c || (cursor = this.f6739m) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i7, View view, ViewGroup viewGroup) {
        if (!this.f6737c) {
            return null;
        }
        this.f6739m.moveToPosition(i7);
        if (view == null) {
            AbstractC1399c abstractC1399c = (AbstractC1399c) this;
            view = abstractC1399c.f6746y1.inflate(abstractC1399c.f6745x1, viewGroup, false);
        }
        mo689b(view, this.f6739m);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f6736Z == null) {
            this.f6736Z = new C1398b(this);
        }
        return this.f6736Z;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i7) {
        Cursor cursor;
        if (!this.f6737c || (cursor = this.f6739m) == null) {
            return null;
        }
        cursor.moveToPosition(i7);
        return this.f6739m;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i7) {
        Cursor cursor;
        if (this.f6737c && (cursor = this.f6739m) != null && cursor.moveToPosition(i7)) {
            return this.f6739m.getLong(this.f6740s);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i7, View view, ViewGroup viewGroup) {
        if (!this.f6737c) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f6739m.moveToPosition(i7)) {
            throw new IllegalStateException(C0090b.m219e("couldn't move cursor to position ", i7));
        }
        if (view == null) {
            view = mo692e(viewGroup);
        }
        mo689b(view, this.f6739m);
        return view;
    }
}
