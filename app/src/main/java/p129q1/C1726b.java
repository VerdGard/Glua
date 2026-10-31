package p129q1;

import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import com.so.revelation.lua.Code;
import com.so.revelation.lua.EditorActivity;
import java.io.File;
import p003a2.C0033d;

/* renamed from: q1.b */
/* loaded from: classes.dex */
public final class C1726b implements TextWatcher, InterfaceC1733i {

    /* renamed from: X */
    public Code f7890X;

    /* renamed from: Y */
    public final a f7891Y;

    /* renamed from: c */
    public final boolean f7892c;

    /* renamed from: e */
    public ViewOnClickListenerC1728d f7893e;

    /* renamed from: m */
    public EditorActivity f7894m;

    /* renamed from: s */
    public C1725a f7895s;

    /* renamed from: q1.b$a */
    public static class a implements Parcelable {

        /* renamed from: c */
        public int f7896c;

        /* renamed from: e */
        public String f7897e;

        /* renamed from: m */
        public File f7898m;

        /* renamed from: s */
        public String f7899s;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            parcel.writeInt(this.f7896c);
            parcel.writeInt(0);
            parcel.writeString(this.f7898m.getPath());
            parcel.writeString(this.f7899s);
            parcel.writeString(this.f7897e);
            parcel.writeString(null);
            parcel.writeInt(0);
            parcel.writeByteArray(null);
            parcel.writeInt(0);
        }
    }

    public C1726b(File file, int i7, String str) {
        new Handler();
        this.f7892c = true;
        a aVar = new a();
        this.f7891Y = aVar;
        aVar.f7897e = str;
        aVar.f7896c = i7;
        aVar.f7898m = file;
        aVar.f7899s = file.getName();
    }

    public C1726b(a aVar) {
        new Handler();
        this.f7892c = true;
        this.f7891Y = aVar;
    }

    @Override // p129q1.InterfaceC1733i
    /* renamed from: a */
    public final void mo4195a() {
        File file = this.f7895s.f7889m;
        a aVar = this.f7891Y;
        aVar.f7898m = file;
        aVar.f7899s = file.getName();
        C0033d c0033d = this.f7894m.f3291Q1;
        c0033d.m124i();
        c0033d.m125j();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (this.f7892c) {
            C0033d c0033d = this.f7894m.f3291Q1;
            c0033d.m124i();
            c0033d.m125j();
        }
    }

    @Override // p129q1.InterfaceC1733i
    /* renamed from: b */
    public final void mo4196b() {
        this.f7895s.f7887c.f7890X.getText().toString().length();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
    }

    /* renamed from: c */
    public final String m4197c() {
        C1725a c1725a = this.f7895s;
        return c1725a == null ? this.f7891Y.f7898m.getPath() : c1725a.f7889m.getPath();
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
    }
}
