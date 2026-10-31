package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.appcompat.R$attr;
import androidx.appcompat.widget.C0252o;
import p034e0.C0946x;
import p082k0.AbstractC1446a;
import p131q3.C1745a;

/* loaded from: classes.dex */
public class CheckableImageButton extends C0252o implements Checkable {

    /* renamed from: y1 */
    public static final int[] f4313y1 = {R.attr.state_checked};

    /* renamed from: s */
    public boolean f4314s;

    /* renamed from: w1 */
    public boolean f4315w1;

    /* renamed from: x1 */
    public boolean f4316x1;

    /* renamed from: com.google.android.material.internal.CheckableImageButton$a */
    public static class C0820a extends AbstractC1446a {
        public static final Parcelable.Creator<C0820a> CREATOR = new a();

        /* renamed from: m */
        public boolean f4317m;

        /* renamed from: com.google.android.material.internal.CheckableImageButton$a$a */
        public class a implements Parcelable.ClassLoaderCreator<C0820a> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new C0820a(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i7) {
                return new C0820a[i7];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final C0820a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0820a(parcel, classLoader);
            }
        }

        public C0820a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f4317m = parcel.readInt() == 1;
        }

        public C0820a(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // p082k0.AbstractC1446a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            parcel.writeParcelable(this.f6946c, i7);
            parcel.writeInt(this.f4317m ? 1 : 0);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R$attr.imageButtonStyle);
        this.f4315w1 = true;
        this.f4316x1 = true;
        C0946x.m2817r(this, new C1745a(this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f4314s;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i7) {
        return this.f4314s ? View.mergeDrawableStates(super.onCreateDrawableState(i7 + 1), f4313y1) : super.onCreateDrawableState(i7);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0820a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0820a c0820a = (C0820a) parcelable;
        super.onRestoreInstanceState(c0820a.f6946c);
        setChecked(c0820a.f4317m);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0820a c0820a = new C0820a(super.onSaveInstanceState());
        c0820a.f4317m = this.f4314s;
        return c0820a;
    }

    public void setCheckable(boolean z6) {
        if (this.f4315w1 != z6) {
            this.f4315w1 = z6;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z6) {
        if (!this.f4315w1 || this.f4314s == z6) {
            return;
        }
        this.f4314s = z6;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z6) {
        this.f4316x1 = z6;
    }

    @Override // android.view.View
    public void setPressed(boolean z6) {
        if (this.f4316x1) {
            super.setPressed(z6);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f4314s);
    }
}
