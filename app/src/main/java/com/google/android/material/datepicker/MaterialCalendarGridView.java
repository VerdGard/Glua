package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.google.android.material.R$attr;
import com.google.android.material.R$id;
import java.util.Calendar;
import java.util.Iterator;
import p026d0.C0875c;
import p034e0.C0946x;
import p131q3.C1767w;

/* loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {

    /* renamed from: c */
    public final Calendar f4102c;

    /* renamed from: e */
    public final boolean f4103e;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f4102c = C0785e0.m2425e(null);
        if (C0800r.m2430T(getContext())) {
            setNextFocusLeftId(R$id.cancel_button);
            setNextFocusRightId(R$id.confirm_button);
        }
        this.f4103e = C0800r.m2431U(R$attr.nestedScrollable, getContext());
        C0946x.m2817r(this, new C0798p());
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: a, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C0805w getAdapter2() {
        return (C0805w) super.getAdapter();
    }

    /* renamed from: b */
    public final View m2407b(int i7) {
        return getChildAt(i7 - getFirstVisiblePosition());
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int m2439b;
        int width;
        int m2439b2;
        int width2;
        int i7;
        int i8;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        C0805w adapter = getAdapter();
        InterfaceC0782d<?> interfaceC0782d = adapter.f4226e;
        C0780c c0780c = adapter.f4228s;
        int max = Math.max(adapter.m2439b(), getFirstVisiblePosition());
        int m2439b3 = adapter.m2439b();
        C0804v c0804v = adapter.f4225c;
        int min = Math.min((m2439b3 + c0804v.f4214X) - 1, getLastVisiblePosition());
        Long item = adapter.getItem(max);
        Long item2 = adapter.getItem(min);
        Iterator<C0875c<Long, Long>> it = interfaceC0782d.m2415g().iterator();
        while (it.hasNext()) {
            C0875c<Long, Long> next = it.next();
            Long l7 = next.f4643a;
            if (l7 != null) {
                Long l8 = next.f4644b;
                if (l8 != null) {
                    long longValue = l7.longValue();
                    long longValue2 = l8.longValue();
                    Long valueOf = Long.valueOf(longValue);
                    Long valueOf2 = Long.valueOf(longValue2);
                    if (!(item == null || item2 == null || valueOf == null || valueOf2 == null || valueOf.longValue() > item2.longValue() || valueOf2.longValue() < item.longValue())) {
                        boolean m4239b = C1767w.m4239b(this);
                        long longValue3 = item.longValue();
                        Calendar calendar = materialCalendarGridView.f4102c;
                        if (longValue < longValue3) {
                            if (max % c0804v.f4220s == 0) {
                                width = 0;
                            } else {
                                View m2407b = materialCalendarGridView.m2407b(max - 1);
                                width = !m4239b ? m2407b.getRight() : m2407b.getLeft();
                            }
                            m2439b = max;
                        } else {
                            calendar.setTimeInMillis(longValue);
                            m2439b = adapter.m2439b() + (calendar.get(5) - 1);
                            View m2407b2 = materialCalendarGridView.m2407b(m2439b);
                            width = (m2407b2.getWidth() / 2) + m2407b2.getLeft();
                        }
                        if (longValue2 > item2.longValue()) {
                            if ((min + 1) % c0804v.f4220s == 0) {
                                width2 = getWidth();
                            } else {
                                View m2407b3 = materialCalendarGridView.m2407b(min);
                                width2 = !m4239b ? m2407b3.getRight() : m2407b3.getLeft();
                            }
                            m2439b2 = min;
                        } else {
                            calendar.setTimeInMillis(longValue2);
                            m2439b2 = adapter.m2439b() + (calendar.get(5) - 1);
                            View m2407b4 = materialCalendarGridView.m2407b(m2439b2);
                            width2 = (m2407b4.getWidth() / 2) + m2407b4.getLeft();
                        }
                        int itemId = (int) adapter.getItemId(m2439b);
                        int i9 = max;
                        int i10 = min;
                        int itemId2 = (int) adapter.getItemId(m2439b2);
                        while (itemId <= itemId2) {
                            int numColumns = getNumColumns() * itemId;
                            C0805w c0805w = adapter;
                            int numColumns2 = (getNumColumns() + numColumns) - 1;
                            View m2407b5 = materialCalendarGridView.m2407b(numColumns);
                            int top = m2407b5.getTop() + c0780c.f4125a.f4119a.top;
                            Iterator<C0875c<Long, Long>> it2 = it;
                            int bottom = m2407b5.getBottom() - c0780c.f4125a.f4119a.bottom;
                            if (m4239b) {
                                int i11 = m2439b2 > numColumns2 ? 0 : width2;
                                int width3 = numColumns > m2439b ? getWidth() : width;
                                i7 = i11;
                                i8 = width3;
                            } else {
                                i7 = numColumns > m2439b ? 0 : width;
                                i8 = m2439b2 > numColumns2 ? getWidth() : width2;
                            }
                            canvas.drawRect(i7, top, i8, bottom, c0780c.f4132h);
                            itemId++;
                            materialCalendarGridView = this;
                            itemId2 = itemId2;
                            adapter = c0805w;
                            it = it2;
                        }
                        materialCalendarGridView = this;
                        max = i9;
                        min = i10;
                    }
                }
            } else {
                materialCalendarGridView = this;
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z6, int i7, Rect rect) {
        int m2439b;
        if (!z6) {
            super.onFocusChanged(false, i7, rect);
            return;
        }
        if (i7 == 33) {
            C0805w adapter = getAdapter();
            m2439b = (adapter.m2439b() + adapter.f4225c.f4214X) - 1;
        } else {
            if (i7 != 130) {
                super.onFocusChanged(true, i7, rect);
                return;
            }
            m2439b = getAdapter().m2439b();
        }
        setSelection(m2439b);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        if (!super.onKeyDown(i7, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().m2439b()) {
            return true;
        }
        if (19 != i7) {
            return false;
        }
        setSelection(getAdapter().m2439b());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i7, int i8) {
        if (!this.f4103e) {
            super.onMeasure(i7, i8);
            return;
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof C0805w)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), C0805w.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i7) {
        if (i7 < getAdapter().m2439b()) {
            i7 = getAdapter().m2439b();
        }
        super.setSelection(i7);
    }
}
