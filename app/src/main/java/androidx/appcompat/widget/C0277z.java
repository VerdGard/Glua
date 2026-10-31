package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.DialogInterfaceC0151d;
import java.util.WeakHashMap;
import p025d.C0872a;
import p026d0.C0874b;
import p034e0.C0923h0;
import p034e0.C0946x;

/* renamed from: androidx.appcompat.widget.z */
/* loaded from: classes.dex */
public final class C0277z extends Spinner {

    /* renamed from: A1 */
    @SuppressLint({"ResourceType"})
    public static final int[] f1125A1 = {R.attr.spinnerMode};

    /* renamed from: c */
    public final C0222e f1126c;

    /* renamed from: e */
    public final Context f1127e;

    /* renamed from: m */
    public final C0275y f1128m;

    /* renamed from: s */
    public SpinnerAdapter f1129s;

    /* renamed from: w1 */
    public final boolean f1130w1;

    /* renamed from: x1 */
    public final i f1131x1;

    /* renamed from: y1 */
    public int f1132y1;

    /* renamed from: z1 */
    public final Rect f1133z1;

    /* renamed from: androidx.appcompat.widget.z$a */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            C0277z c0277z = C0277z.this;
            if (!c0277z.getInternalPopup().mo917c()) {
                c0277z.f1131x1.mo925m(c.m913b(c0277z), c.m912a(c0277z));
            }
            ViewTreeObserver viewTreeObserver = c0277z.getViewTreeObserver();
            if (viewTreeObserver != null) {
                b.m911a(viewTreeObserver, this);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.z$b */
    public static final class b {
        /* renamed from: a */
        public static void m911a(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    /* renamed from: androidx.appcompat.widget.z$c */
    public static final class c {
        /* renamed from: a */
        public static int m912a(View view) {
            return view.getTextAlignment();
        }

        /* renamed from: b */
        public static int m913b(View view) {
            return view.getTextDirection();
        }

        /* renamed from: c */
        public static void m914c(View view, int i7) {
            view.setTextAlignment(i7);
        }

        /* renamed from: d */
        public static void m915d(View view, int i7) {
            view.setTextDirection(i7);
        }
    }

    /* renamed from: androidx.appcompat.widget.z$d */
    public static final class d {
        /* renamed from: a */
        public static void m916a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            Resources.Theme dropDownViewTheme;
            dropDownViewTheme = themedSpinnerAdapter.getDropDownViewTheme();
            if (C0874b.m2562a(dropDownViewTheme, theme)) {
                return;
            }
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    /* renamed from: androidx.appcompat.widget.z$e */
    public class e implements i, DialogInterface.OnClickListener {

        /* renamed from: c */
        public DialogInterfaceC0151d f1135c;

        /* renamed from: e */
        public ListAdapter f1136e;

        /* renamed from: m */
        public CharSequence f1137m;

        public e() {
        }

        @Override // androidx.appcompat.widget.C0277z.i
        /* renamed from: c */
        public final boolean mo917c() {
            DialogInterfaceC0151d dialogInterfaceC0151d = this.f1135c;
            if (dialogInterfaceC0151d != null) {
                return dialogInterfaceC0151d.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.C0277z.i
        /* renamed from: d */
        public final int mo918d() {
            return 0;
        }

        @Override // androidx.appcompat.widget.C0277z.i
        public final void dismiss() {
            DialogInterfaceC0151d dialogInterfaceC0151d = this.f1135c;
            if (dialogInterfaceC0151d != null) {
                dialogInterfaceC0151d.dismiss();
                this.f1135c = null;
            }
        }

        @Override // androidx.appcompat.widget.C0277z.i
        /* renamed from: f */
        public final Drawable mo919f() {
            return null;
        }

        @Override // androidx.appcompat.widget.C0277z.i
        /* renamed from: g */
        public final void mo920g(CharSequence charSequence) {
            this.f1137m = charSequence;
        }

        @Override // androidx.appcompat.widget.C0277z.i
        /* renamed from: i */
        public final void mo921i(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.C0277z.i
        /* renamed from: j */
        public final void mo922j(int i7) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.C0277z.i
        /* renamed from: k */
        public final void mo923k(int i7) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.C0277z.i
        /* renamed from: l */
        public final void mo924l(int i7) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.C0277z.i
        /* renamed from: m */
        public final void mo925m(int i7, int i8) {
            if (this.f1136e == null) {
                return;
            }
            C0277z c0277z = C0277z.this;
            DialogInterfaceC0151d.a aVar = new DialogInterfaceC0151d.a(c0277z.getPopupContext());
            CharSequence charSequence = this.f1137m;
            AlertController.C0145b c0145b = aVar.f374a;
            if (charSequence != null) {
                c0145b.f345e = charSequence;
            }
            ListAdapter listAdapter = this.f1136e;
            int selectedItemPosition = c0277z.getSelectedItemPosition();
            c0145b.f357q = listAdapter;
            c0145b.f358r = this;
            c0145b.f363w = selectedItemPosition;
            c0145b.f362v = true;
            DialogInterfaceC0151d m484a = aVar.m484a();
            this.f1135c = m484a;
            AlertController.RecycleListView recycleListView = m484a.f373Y.f318g;
            c.m915d(recycleListView, i7);
            c.m914c(recycleListView, i8);
            this.f1135c.show();
        }

        @Override // androidx.appcompat.widget.C0277z.i
        /* renamed from: n */
        public final int mo926n() {
            return 0;
        }

        @Override // androidx.appcompat.widget.C0277z.i
        /* renamed from: o */
        public final CharSequence mo927o() {
            return this.f1137m;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i7) {
            C0277z c0277z = C0277z.this;
            c0277z.setSelection(i7);
            if (c0277z.getOnItemClickListener() != null) {
                c0277z.performItemClick(null, i7, this.f1136e.getItemId(i7));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.C0277z.i
        /* renamed from: p */
        public final void mo880p(ListAdapter listAdapter) {
            this.f1136e = listAdapter;
        }
    }

    /* renamed from: androidx.appcompat.widget.z$f */
    public static class f implements ListAdapter, SpinnerAdapter {

        /* renamed from: c */
        public final SpinnerAdapter f1139c;

        /* renamed from: e */
        public final ListAdapter f1140e;

        public f(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f1139c = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1140e = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                    d.m916a((ThemedSpinnerAdapter) spinnerAdapter, theme);
                } else if (spinnerAdapter instanceof InterfaceC0221d1) {
                    InterfaceC0221d1 interfaceC0221d1 = (InterfaceC0221d1) spinnerAdapter;
                    if (interfaceC0221d1.getDropDownViewTheme() == null) {
                        interfaceC0221d1.m733a();
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public final boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1140e;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1139c;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public final View getDropDownView(int i7, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1139c;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i7, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i7) {
            SpinnerAdapter spinnerAdapter = this.f1139c;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i7);
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i7) {
            SpinnerAdapter spinnerAdapter = this.f1139c;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i7);
        }

        @Override // android.widget.Adapter
        public final int getItemViewType(int i7) {
            return 0;
        }

        @Override // android.widget.Adapter
        public final View getView(int i7, View view, ViewGroup viewGroup) {
            return getDropDownView(i7, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public final int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public final boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1139c;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public final boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public final boolean isEnabled(int i7) {
            ListAdapter listAdapter = this.f1140e;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i7);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1139c;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1139c;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.z$g */
    public class g extends C0262r0 implements i {

        /* renamed from: S1 */
        public CharSequence f1141S1;

        /* renamed from: T1 */
        public ListAdapter f1142T1;

        /* renamed from: U1 */
        public final Rect f1143U1;

        /* renamed from: V1 */
        public int f1144V1;

        /* renamed from: androidx.appcompat.widget.z$g$a */
        public class a implements AdapterView.OnItemClickListener {
            public a() {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView<?> adapterView, View view, int i7, long j7) {
                g gVar = g.this;
                C0277z.this.setSelection(i7);
                if (C0277z.this.getOnItemClickListener() != null) {
                    C0277z.this.performItemClick(view, i7, gVar.f1142T1.getItemId(i7));
                }
                gVar.dismiss();
            }
        }

        /* renamed from: androidx.appcompat.widget.z$g$b */
        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                g gVar = g.this;
                C0277z c0277z = C0277z.this;
                gVar.getClass();
                WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
                if (!(C0946x.g.m2859b(c0277z) && c0277z.getGlobalVisibleRect(gVar.f1143U1))) {
                    gVar.dismiss();
                } else {
                    gVar.m928s();
                    gVar.mo500a();
                }
            }
        }

        /* renamed from: androidx.appcompat.widget.z$g$c */
        public class c implements PopupWindow.OnDismissListener {

            /* renamed from: c */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f1148c;

            public c(b bVar) {
                this.f1148c = bVar;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                ViewTreeObserver viewTreeObserver = C0277z.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f1148c);
                }
            }
        }

        public g(Context context, AttributeSet attributeSet, int i7) {
            super(context, attributeSet, i7, 0);
            this.f1143U1 = new Rect();
            this.f1060D1 = C0277z.this;
            this.f1070N1 = true;
            this.f1071O1.setFocusable(true);
            this.f1061E1 = new a();
        }

        @Override // androidx.appcompat.widget.C0277z.i
        /* renamed from: g */
        public final void mo920g(CharSequence charSequence) {
            this.f1141S1 = charSequence;
        }

        @Override // androidx.appcompat.widget.C0277z.i
        /* renamed from: k */
        public final void mo923k(int i7) {
            this.f1144V1 = i7;
        }

        @Override // androidx.appcompat.widget.C0277z.i
        /* renamed from: m */
        public final void mo925m(int i7, int i8) {
            ViewTreeObserver viewTreeObserver;
            boolean mo502c = mo502c();
            m928s();
            C0261r c0261r = this.f1071O1;
            c0261r.setInputMethodMode(2);
            mo500a();
            C0247m0 c0247m0 = this.f1077m;
            c0247m0.setChoiceMode(1);
            c.m915d(c0247m0, i7);
            c.m914c(c0247m0, i8);
            C0277z c0277z = C0277z.this;
            int selectedItemPosition = c0277z.getSelectedItemPosition();
            C0247m0 c0247m02 = this.f1077m;
            if (mo502c() && c0247m02 != null) {
                c0247m02.setListSelectionHidden(false);
                c0247m02.setSelection(selectedItemPosition);
                if (c0247m02.getChoiceMode() != 0) {
                    c0247m02.setItemChecked(selectedItemPosition, true);
                }
            }
            if (mo502c || (viewTreeObserver = c0277z.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            c0261r.setOnDismissListener(new c(bVar));
        }

        @Override // androidx.appcompat.widget.C0277z.i
        /* renamed from: o */
        public final CharSequence mo927o() {
            return this.f1141S1;
        }

        @Override // androidx.appcompat.widget.C0262r0, androidx.appcompat.widget.C0277z.i
        /* renamed from: p */
        public final void mo880p(ListAdapter listAdapter) {
            super.mo880p(listAdapter);
            this.f1142T1 = listAdapter;
        }

        /* renamed from: s */
        public final void m928s() {
            int i7;
            Drawable m875f = m875f();
            C0277z c0277z = C0277z.this;
            if (m875f != null) {
                m875f.getPadding(c0277z.f1133z1);
                i7 = C0257p1.m872a(c0277z) ? c0277z.f1133z1.right : -c0277z.f1133z1.left;
            } else {
                Rect rect = c0277z.f1133z1;
                rect.right = 0;
                rect.left = 0;
                i7 = 0;
            }
            int paddingLeft = c0277z.getPaddingLeft();
            int paddingRight = c0277z.getPaddingRight();
            int width = c0277z.getWidth();
            int i8 = c0277z.f1132y1;
            if (i8 == -2) {
                int m910a = c0277z.m910a((SpinnerAdapter) this.f1142T1, m875f());
                int i9 = c0277z.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = c0277z.f1133z1;
                int i10 = (i9 - rect2.left) - rect2.right;
                if (m910a > i10) {
                    m910a = i10;
                }
                i8 = Math.max(m910a, (width - paddingLeft) - paddingRight);
            } else if (i8 == -1) {
                i8 = (width - paddingLeft) - paddingRight;
            }
            m882r(i8);
            this.f1073Y = C0257p1.m872a(c0277z) ? (((width - paddingRight) - this.f1072X) - this.f1144V1) + i7 : paddingLeft + this.f1144V1 + i7;
        }
    }

    /* renamed from: androidx.appcompat.widget.z$h */
    public static class h extends View.BaseSavedState {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: c */
        public boolean f1150c;

        /* renamed from: androidx.appcompat.widget.z$h$a */
        public class a implements Parcelable.Creator<h> {
            @Override // android.os.Parcelable.Creator
            public final h createFromParcel(Parcel parcel) {
                return new h(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final h[] newArray(int i7) {
                return new h[i7];
            }
        }

        public h(Parcel parcel) {
            super(parcel);
            this.f1150c = parcel.readByte() != 0;
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeByte(this.f1150c ? (byte) 1 : (byte) 0);
        }
    }

    /* renamed from: androidx.appcompat.widget.z$i */
    public interface i {
        /* renamed from: c */
        boolean mo917c();

        /* renamed from: d */
        int mo918d();

        void dismiss();

        /* renamed from: f */
        Drawable mo919f();

        /* renamed from: g */
        void mo920g(CharSequence charSequence);

        /* renamed from: i */
        void mo921i(Drawable drawable);

        /* renamed from: j */
        void mo922j(int i7);

        /* renamed from: k */
        void mo923k(int i7);

        /* renamed from: l */
        void mo924l(int i7);

        /* renamed from: m */
        void mo925m(int i7, int i8);

        /* renamed from: n */
        int mo926n();

        /* renamed from: o */
        CharSequence mo927o();

        /* renamed from: p */
        void mo880p(ListAdapter listAdapter);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0057, code lost:
    
        if (r5 == null) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0277z(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            r8.<init>(r9, r10, r11)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r8.f1133z1 = r0
            android.content.Context r0 = r8.getContext()
            androidx.appcompat.widget.C0218c1.m702a(r0, r8)
            int[] r0 = androidx.appcompat.R$styleable.f295w
            r1 = 0
            android.content.res.TypedArray r2 = r9.obtainStyledAttributes(r10, r0, r11, r1)
            androidx.appcompat.widget.e r3 = new androidx.appcompat.widget.e
            r3.<init>(r8)
            r8.f1126c = r3
            int r3 = androidx.appcompat.R$styleable.Spinner_popupTheme
            int r3 = r2.getResourceId(r3, r1)
            if (r3 == 0) goto L2f
            g.c r4 = new g.c
            r4.<init>(r3, r9)
            r8.f1127e = r4
            goto L31
        L2f:
            r8.f1127e = r9
        L31:
            r3 = -1
            r4 = 0
            int[] r5 = androidx.appcompat.widget.C0277z.f1125A1     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4e
            android.content.res.TypedArray r5 = r9.obtainStyledAttributes(r10, r5, r11, r1)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4e
            boolean r6 = r5.hasValue(r1)     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L49
            if (r6 == 0) goto L59
            int r1 = r5.getInt(r1, r1)     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L49
            r3 = r1
            goto L59
        L45:
            r9 = move-exception
            r4 = r5
            goto Ld3
        L49:
            r1 = move-exception
            goto L50
        L4b:
            r9 = move-exception
            goto Ld3
        L4e:
            r1 = move-exception
            r5 = r4
        L50:
            java.lang.String r6 = "AppCompatSpinner"
            java.lang.String r7 = "Could not read android:spinnerMode"
            android.util.Log.i(r6, r7, r1)     // Catch: java.lang.Throwable -> L45
            if (r5 == 0) goto L5c
        L59:
            r5.recycle()
        L5c:
            r1 = 1
            if (r3 == 0) goto L98
            if (r3 == r1) goto L62
            goto La7
        L62:
            androidx.appcompat.widget.z$g r3 = new androidx.appcompat.widget.z$g
            android.content.Context r5 = r8.f1127e
            r3.<init>(r5, r10, r11)
            android.content.Context r5 = r8.f1127e
            androidx.appcompat.widget.h1 r0 = androidx.appcompat.widget.C0233h1.m790m(r5, r10, r0, r11)
            int r5 = androidx.appcompat.R$styleable.Spinner_android_dropDownWidth
            android.content.res.TypedArray r6 = r0.f915b
            r7 = -2
            int r5 = r6.getLayoutDimension(r5, r7)
            r8.f1132y1 = r5
            int r5 = androidx.appcompat.R$styleable.Spinner_android_popupBackground
            android.graphics.drawable.Drawable r5 = r0.m795e(r5)
            r3.m876i(r5)
            int r5 = androidx.appcompat.R$styleable.Spinner_android_prompt
            java.lang.String r5 = r2.getString(r5)
            r3.f1141S1 = r5
            r0.m803n()
            r8.f1131x1 = r3
            androidx.appcompat.widget.y r0 = new androidx.appcompat.widget.y
            r0.<init>(r8, r8, r3)
            r8.f1128m = r0
            goto La7
        L98:
            androidx.appcompat.widget.z$e r0 = new androidx.appcompat.widget.z$e
            r0.<init>()
            r8.f1131x1 = r0
            int r3 = androidx.appcompat.R$styleable.Spinner_android_prompt
            java.lang.String r3 = r2.getString(r3)
            r0.f1137m = r3
        La7:
            int r0 = androidx.appcompat.R$styleable.Spinner_android_entries
            java.lang.CharSequence[] r0 = r2.getTextArray(r0)
            if (r0 == 0) goto Lbf
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r5 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r9, r5, r0)
            int r9 = androidx.appcompat.R$layout.support_simple_spinner_dropdown_item
            r3.setDropDownViewResource(r9)
            r8.setAdapter(r3)
        Lbf:
            r2.recycle()
            r8.f1130w1 = r1
            android.widget.SpinnerAdapter r9 = r8.f1129s
            if (r9 == 0) goto Lcd
            r8.setAdapter(r9)
            r8.f1129s = r4
        Lcd:
            androidx.appcompat.widget.e r9 = r8.f1126c
            r9.m737d(r10, r11)
            return
        Ld3:
            if (r4 == 0) goto Ld8
            r4.recycle()
        Ld8:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0277z.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* renamed from: a */
    public final int m910a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i7 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i8 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i7) {
                view = null;
                i7 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i8 = Math.max(i8, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i8;
        }
        Rect rect = this.f1133z1;
        drawable.getPadding(rect);
        return i8 + rect.left + rect.right;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0222e c0222e = this.f1126c;
        if (c0222e != null) {
            c0222e.m734a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        i iVar = this.f1131x1;
        return iVar != null ? iVar.mo918d() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        i iVar = this.f1131x1;
        return iVar != null ? iVar.mo926n() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f1131x1 != null ? this.f1132y1 : super.getDropDownWidth();
    }

    public final i getInternalPopup() {
        return this.f1131x1;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        i iVar = this.f1131x1;
        return iVar != null ? iVar.mo919f() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f1127e;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        i iVar = this.f1131x1;
        return iVar != null ? iVar.mo927o() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0222e c0222e = this.f1126c;
        if (c0222e != null) {
            return c0222e.m735b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0222e c0222e = this.f1126c;
        if (c0222e != null) {
            return c0222e.m736c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i iVar = this.f1131x1;
        if (iVar == null || !iVar.mo917c()) {
            return;
        }
        iVar.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        if (this.f1131x1 == null || View.MeasureSpec.getMode(i7) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m910a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i7)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.getSuperState());
        if (!hVar.f1150c || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new a());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        i iVar = this.f1131x1;
        hVar.f1150c = iVar != null && iVar.mo917c();
        return hVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0275y c0275y = this.f1128m;
        if (c0275y == null || !c0275y.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        i iVar = this.f1131x1;
        if (iVar == null) {
            return super.performClick();
        }
        if (iVar.mo917c()) {
            return true;
        }
        iVar.mo925m(c.m913b(this), c.m912a(this));
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1130w1) {
            this.f1129s = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        i iVar = this.f1131x1;
        if (iVar != null) {
            Context context = this.f1127e;
            if (context == null) {
                context = getContext();
            }
            iVar.mo880p(new f(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0222e c0222e = this.f1126c;
        if (c0222e != null) {
            c0222e.m738e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        C0222e c0222e = this.f1126c;
        if (c0222e != null) {
            c0222e.m739f(i7);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i7) {
        i iVar = this.f1131x1;
        if (iVar == null) {
            super.setDropDownHorizontalOffset(i7);
        } else {
            iVar.mo923k(i7);
            iVar.mo924l(i7);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i7) {
        i iVar = this.f1131x1;
        if (iVar != null) {
            iVar.mo922j(i7);
        } else {
            super.setDropDownVerticalOffset(i7);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i7) {
        if (this.f1131x1 != null) {
            this.f1132y1 = i7;
        } else {
            super.setDropDownWidth(i7);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        i iVar = this.f1131x1;
        if (iVar != null) {
            iVar.mo921i(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i7) {
        setPopupBackgroundDrawable(C0872a.m2561a(getPopupContext(), i7));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        i iVar = this.f1131x1;
        if (iVar != null) {
            iVar.mo920g(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0222e c0222e = this.f1126c;
        if (c0222e != null) {
            c0222e.m741h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0222e c0222e = this.f1126c;
        if (c0222e != null) {
            c0222e.m742i(mode);
        }
    }
}
