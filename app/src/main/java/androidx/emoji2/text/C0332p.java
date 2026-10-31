package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: androidx.emoji2.text.p */
/* loaded from: classes.dex */
public final class C0332p extends SpannableStringBuilder {

    /* renamed from: c */
    public final Class<?> f1614c;

    /* renamed from: e */
    public final ArrayList f1615e;

    /* renamed from: androidx.emoji2.text.p$a */
    public static class a implements TextWatcher, SpanWatcher {

        /* renamed from: c */
        public final Object f1616c;

        /* renamed from: e */
        public final AtomicInteger f1617e = new AtomicInteger(0);

        public a(Object obj) {
            this.f1616c = obj;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f1616c).afterTextChanged(editable);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
            ((TextWatcher) this.f1616c).beforeTextChanged(charSequence, i7, i8, i9);
        }

        @Override // android.text.SpanWatcher
        public final void onSpanAdded(Spannable spannable, Object obj, int i7, int i8) {
            if (this.f1617e.get() <= 0 || !(obj instanceof AbstractC0328l)) {
                ((SpanWatcher) this.f1616c).onSpanAdded(spannable, obj, i7, i8);
            }
        }

        @Override // android.text.SpanWatcher
        public final void onSpanChanged(Spannable spannable, Object obj, int i7, int i8, int i9, int i10) {
            int i11;
            int i12;
            if (this.f1617e.get() <= 0 || !(obj instanceof AbstractC0328l)) {
                if (Build.VERSION.SDK_INT < 28) {
                    if (i7 > i8) {
                        i7 = 0;
                    }
                    if (i9 > i10) {
                        i11 = i7;
                        i12 = 0;
                        ((SpanWatcher) this.f1616c).onSpanChanged(spannable, obj, i11, i8, i12, i10);
                    }
                }
                i11 = i7;
                i12 = i9;
                ((SpanWatcher) this.f1616c).onSpanChanged(spannable, obj, i11, i8, i12, i10);
            }
        }

        @Override // android.text.SpanWatcher
        public final void onSpanRemoved(Spannable spannable, Object obj, int i7, int i8) {
            if (this.f1617e.get() <= 0 || !(obj instanceof AbstractC0328l)) {
                ((SpanWatcher) this.f1616c).onSpanRemoved(spannable, obj, i7, i8);
            }
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
            ((TextWatcher) this.f1616c).onTextChanged(charSequence, i7, i8, i9);
        }
    }

    public C0332p(Class<?> cls, CharSequence charSequence) {
        super(charSequence);
        this.f1615e = new ArrayList();
        if (cls == null) {
            throw new NullPointerException("watcherClass cannot be null");
        }
        this.f1614c = cls;
    }

    /* renamed from: a */
    public final void m1125a() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f1615e;
            if (i7 >= arrayList.size()) {
                return;
            }
            ((a) arrayList.get(i7)).f1617e.incrementAndGet();
            i7++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c7) {
        super.append(c7);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c7) {
        super.append(c7);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i7, int i8) {
        super.append(charSequence, i7, i8);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i7) {
        super.append(charSequence, obj, i7);
        return this;
    }

    /* renamed from: b */
    public final void m1126b() {
        m1129e();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f1615e;
            if (i7 >= arrayList.size()) {
                return;
            }
            ((a) arrayList.get(i7)).onTextChanged(this, 0, length(), length());
            i7++;
        }
    }

    /* renamed from: c */
    public final a m1127c(Object obj) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f1615e;
            if (i7 >= arrayList.size()) {
                return null;
            }
            a aVar = (a) arrayList.get(i7);
            if (aVar.f1616c == obj) {
                return aVar;
            }
            i7++;
        }
    }

    /* renamed from: d */
    public final boolean m1128d(Object obj) {
        if (obj != null) {
            return this.f1614c == obj.getClass();
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final Editable delete(int i7, int i8) {
        super.delete(i7, i8);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder delete(int i7, int i8) {
        super.delete(i7, i8);
        return this;
    }

    /* renamed from: e */
    public final void m1129e() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f1615e;
            if (i7 >= arrayList.size()) {
                return;
            }
            ((a) arrayList.get(i7)).f1617e.decrementAndGet();
            i7++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        a m1127c;
        if (m1128d(obj) && (m1127c = m1127c(obj)) != null) {
            obj = m1127c;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        a m1127c;
        if (m1128d(obj) && (m1127c = m1127c(obj)) != null) {
            obj = m1127c;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        a m1127c;
        if (m1128d(obj) && (m1127c = m1127c(obj)) != null) {
            obj = m1127c;
        }
        return super.getSpanStart(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    @SuppressLint({"UnknownNullness"})
    public final <T> T[] getSpans(int i7, int i8, Class<T> cls) {
        if (!(this.f1614c == cls)) {
            return (T[]) super.getSpans(i7, i8, cls);
        }
        a[] aVarArr = (a[]) super.getSpans(i7, i8, a.class);
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, aVarArr.length));
        for (int i9 = 0; i9 < aVarArr.length; i9++) {
            tArr[i9] = aVarArr[i9].f1616c;
        }
        return tArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final Editable insert(int i7, CharSequence charSequence) {
        super.insert(i7, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder insert(int i7, CharSequence charSequence) {
        super.insert(i7, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder insert(int i7, CharSequence charSequence, int i8, int i9) {
        super.insert(i7, charSequence, i8, i9);
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0009, code lost:
    
        if ((r1.f1614c == r4) != false) goto L8;
     */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int nextSpanTransition(int r2, int r3, java.lang.Class r4) {
        /*
            r1 = this;
            if (r4 == 0) goto Lb
            java.lang.Class<?> r0 = r1.f1614c
            if (r0 != r4) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 == 0) goto Ld
        Lb:
            java.lang.Class<androidx.emoji2.text.p$a> r4 = androidx.emoji2.text.C0332p.a.class
        Ld:
            int r2 = super.nextSpanTransition(r2, r3, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.C0332p.nextSpanTransition(int, int, java.lang.Class):int");
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        a aVar;
        if (m1128d(obj)) {
            aVar = m1127c(obj);
            if (aVar != null) {
                obj = aVar;
            }
        } else {
            aVar = null;
        }
        super.removeSpan(obj);
        if (aVar != null) {
            this.f1615e.remove(aVar);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final /* bridge */ /* synthetic */ Editable replace(int i7, int i8, CharSequence charSequence) {
        replace(i7, i8, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final /* bridge */ /* synthetic */ Editable replace(int i7, int i8, CharSequence charSequence, int i9, int i10) {
        replace(i7, i8, charSequence, i9, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder replace(int i7, int i8, CharSequence charSequence) {
        m1125a();
        super.replace(i7, i8, charSequence);
        m1129e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder replace(int i7, int i8, CharSequence charSequence, int i9, int i10) {
        m1125a();
        super.replace(i7, i8, charSequence, i9, i10);
        m1129e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i7, int i8, int i9) {
        if (m1128d(obj)) {
            a aVar = new a(obj);
            this.f1615e.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i7, i8, i9);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    @SuppressLint({"UnknownNullness"})
    public final CharSequence subSequence(int i7, int i8) {
        return new C0332p(this.f1614c, this, i7, i8);
    }

    public C0332p(Class<?> cls, CharSequence charSequence, int i7, int i8) {
        super(charSequence, i7, i8);
        this.f1615e = new ArrayList();
        if (cls == null) {
            throw new NullPointerException("watcherClass cannot be null");
        }
        this.f1614c = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final Editable insert(int i7, CharSequence charSequence, int i8, int i9) {
        super.insert(i7, charSequence, i8, i9);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i7, int i8) {
        super.append(charSequence, i7, i8);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c7) {
        super.append(c7);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i7, int i8) {
        super.append(charSequence, i7, i8);
        return this;
    }
}
