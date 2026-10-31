package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.ext.Tools;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$dimen;
import androidx.appcompat.R$id;
import androidx.appcompat.R$layout;
import androidx.appcompat.R$string;
import androidx.appcompat.R$styleable;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p034e0.C0946x;
import p049g.InterfaceC1184b;
import p074j0.AbstractC1397a;
import p082k0.AbstractC1446a;

/* loaded from: classes.dex */
public class SearchView extends C0256p0 implements InterfaceC1184b {

    /* renamed from: v2 */
    public static final C0197o f664v2;

    /* renamed from: H1 */
    public final SearchAutoComplete f665H1;

    /* renamed from: I1 */
    public final View f666I1;

    /* renamed from: J1 */
    public final View f667J1;

    /* renamed from: K1 */
    public final View f668K1;

    /* renamed from: L1 */
    public final ImageView f669L1;

    /* renamed from: M1 */
    public final ImageView f670M1;

    /* renamed from: N1 */
    public final ImageView f671N1;

    /* renamed from: O1 */
    public final ImageView f672O1;

    /* renamed from: P1 */
    public final View f673P1;

    /* renamed from: Q1 */
    public C0199q f674Q1;

    /* renamed from: R1 */
    public final Rect f675R1;

    /* renamed from: S1 */
    public final Rect f676S1;

    /* renamed from: T1 */
    public final int[] f677T1;

    /* renamed from: U1 */
    public final int[] f678U1;

    /* renamed from: V1 */
    public final ImageView f679V1;

    /* renamed from: W1 */
    public final Drawable f680W1;

    /* renamed from: X1 */
    public final int f681X1;

    /* renamed from: Y1 */
    public final int f682Y1;

    /* renamed from: Z1 */
    public final Intent f683Z1;

    /* renamed from: a2 */
    public final Intent f684a2;

    /* renamed from: b2 */
    public final CharSequence f685b2;

    /* renamed from: c2 */
    public View.OnFocusChangeListener f686c2;

    /* renamed from: d2 */
    public View.OnClickListener f687d2;

    /* renamed from: e2 */
    public boolean f688e2;

    /* renamed from: f2 */
    public boolean f689f2;

    /* renamed from: g2 */
    public AbstractC1397a f690g2;

    /* renamed from: h2 */
    public boolean f691h2;

    /* renamed from: i2 */
    public CharSequence f692i2;

    /* renamed from: j2 */
    public boolean f693j2;

    /* renamed from: k2 */
    public boolean f694k2;

    /* renamed from: l2 */
    public int f695l2;

    /* renamed from: m2 */
    public boolean f696m2;

    /* renamed from: n2 */
    public CharSequence f697n2;

    /* renamed from: o2 */
    public boolean f698o2;

    /* renamed from: p2 */
    public int f699p2;

    /* renamed from: q2 */
    public SearchableInfo f700q2;

    /* renamed from: r2 */
    public Bundle f701r2;

    /* renamed from: s2 */
    public final RunnableC0184b f702s2;

    /* renamed from: t2 */
    public final RunnableC0185c f703t2;

    /* renamed from: u2 */
    public final WeakHashMap<String, Drawable.ConstantState> f704u2;

    public static class SearchAutoComplete extends C0219d {

        /* renamed from: w1 */
        public int f705w1;

        /* renamed from: x1 */
        public SearchView f706x1;

        /* renamed from: y1 */
        public boolean f707y1;

        /* renamed from: z1 */
        public final RunnableC0182a f708z1;

        /* renamed from: androidx.appcompat.widget.SearchView$SearchAutoComplete$a */
        public class RunnableC0182a implements Runnable {
            public RunnableC0182a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                if (searchAutoComplete.f707y1) {
                    ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                    searchAutoComplete.f707y1 = false;
                }
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet, R$attr.autoCompleteTextViewStyle);
            this.f708z1 = new RunnableC0182a();
            this.f705w1 = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i7 = configuration.screenWidthDp;
            int i8 = configuration.screenHeightDp;
            if (i7 >= 960 && i8 >= 720 && configuration.orientation == 2) {
                return Tools.Semaphore.f160S8;
            }
            if (i7 < 600) {
                return (i7 < 640 || i8 < 480) ? 160 : 192;
            }
            return 192;
        }

        /* renamed from: a */
        public final void m618a() {
            if (Build.VERSION.SDK_INT >= 29) {
                C0193k.m620b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            C0197o c0197o = SearchView.f664v2;
            c0197o.getClass();
            C0197o.m621a();
            Method method = c0197o.f722c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f705w1 <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.C0219d, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f707y1) {
                RunnableC0182a runnableC0182a = this.f708z1;
                removeCallbacks(runnableC0182a);
                post(runnableC0182a);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z6, int i7, Rect rect) {
            super.onFocusChanged(z6, i7, rect);
            SearchView searchView = this.f706x1;
            searchView.m617w(searchView.f689f2);
            searchView.post(searchView.f702s2);
            if (searchView.f665H1.hasFocus()) {
                searchView.m606l();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i7, KeyEvent keyEvent) {
            if (i7 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f706x1.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i7, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z6) {
            super.onWindowFocusChanged(z6);
            if (z6 && this.f706x1.hasFocus() && getVisibility() == 0) {
                this.f707y1 = true;
                Context context = getContext();
                C0197o c0197o = SearchView.f664v2;
                if (context.getResources().getConfiguration().orientation == 2) {
                    m618a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z6) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            RunnableC0182a runnableC0182a = this.f708z1;
            if (!z6) {
                this.f707y1 = false;
                removeCallbacks(runnableC0182a);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f707y1 = true;
                    return;
                }
                this.f707y1 = false;
                removeCallbacks(runnableC0182a);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f706x1 = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i7) {
            super.setThreshold(i7);
            this.f705w1 = i7;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$a */
    public class C0183a implements TextWatcher {
        public C0183a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
            SearchView searchView = SearchView.this;
            Editable text = searchView.f665H1.getText();
            searchView.f697n2 = text;
            boolean z6 = !TextUtils.isEmpty(text);
            searchView.m616v(z6);
            boolean z7 = !z6;
            int i10 = 8;
            if (searchView.f696m2 && !searchView.f689f2 && z7) {
                searchView.f670M1.setVisibility(8);
                i10 = 0;
            }
            searchView.f672O1.setVisibility(i10);
            searchView.m612r();
            searchView.m615u();
            charSequence.toString();
            searchView.getClass();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$b */
    public class RunnableC0184b implements Runnable {
        public RunnableC0184b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            SearchView.this.m613s();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$c */
    public class RunnableC0185c implements Runnable {
        public RunnableC0185c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AbstractC1397a abstractC1397a = SearchView.this.f690g2;
            if (abstractC1397a instanceof ViewOnClickListenerC0215b1) {
                abstractC1397a.mo690c(null);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$d */
    public class ViewOnFocusChangeListenerC0186d implements View.OnFocusChangeListener {
        public ViewOnFocusChangeListenerC0186d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view, boolean z6) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f686c2;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z6);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$e */
    public class ViewOnLayoutChangeListenerC0187e implements View.OnLayoutChangeListener {
        public ViewOnLayoutChangeListenerC0187e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
            SearchView searchView = SearchView.this;
            View view2 = searchView.f673P1;
            if (view2.getWidth() > 1) {
                Resources resources = searchView.getContext().getResources();
                int paddingLeft = searchView.f667J1.getPaddingLeft();
                Rect rect = new Rect();
                boolean m872a = C0257p1.m872a(searchView);
                int dimensionPixelSize = searchView.f688e2 ? resources.getDimensionPixelSize(R$dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R$dimen.abc_dropdownitem_icon_width) : 0;
                SearchAutoComplete searchAutoComplete = searchView.f665H1;
                searchAutoComplete.getDropDownBackground().getPadding(rect);
                searchAutoComplete.setDropDownHorizontalOffset(m872a ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$f */
    public class ViewOnClickListenerC0188f implements View.OnClickListener {
        public ViewOnClickListenerC0188f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            SearchView searchView = SearchView.this;
            ImageView imageView = searchView.f669L1;
            SearchAutoComplete searchAutoComplete = searchView.f665H1;
            if (view == imageView) {
                searchView.m617w(false);
                searchAutoComplete.requestFocus();
                searchAutoComplete.setImeVisibility(true);
                View.OnClickListener onClickListener = searchView.f687d2;
                if (onClickListener != null) {
                    onClickListener.onClick(searchView);
                    return;
                }
                return;
            }
            if (view == searchView.f671N1) {
                searchView.m607m();
                return;
            }
            if (view == searchView.f670M1) {
                searchView.m611q();
                return;
            }
            if (view != searchView.f672O1) {
                if (view == searchAutoComplete) {
                    searchView.m606l();
                    return;
                }
                return;
            }
            SearchableInfo searchableInfo = searchView.f700q2;
            if (searchableInfo == null) {
                return;
            }
            try {
                if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                        searchView.getContext().startActivity(searchView.m605k(searchView.f684a2, searchableInfo));
                    }
                } else {
                    Intent intent = new Intent(searchView.f683Z1);
                    ComponentName searchActivity = searchableInfo.getSearchActivity();
                    intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                    searchView.getContext().startActivity(intent);
                }
            } catch (ActivityNotFoundException unused) {
                Log.w("SearchView", "Could not find voice search activity");
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$g */
    public class ViewOnKeyListenerC0189g implements View.OnKeyListener {
        public ViewOnKeyListenerC0189g() {
        }

        @Override // android.view.View.OnKeyListener
        public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f700q2 == null) {
                return false;
            }
            SearchAutoComplete searchAutoComplete = searchView.f665H1;
            if (!searchAutoComplete.isPopupShowing() || searchAutoComplete.getListSelection() == -1) {
                if ((TextUtils.getTrimmedLength(searchAutoComplete.getText()) == 0) || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i7 != 66) {
                    return false;
                }
                view.cancelLongPress();
                searchView.getContext().startActivity(searchView.m604j("android.intent.action.SEARCH", null, null, searchAutoComplete.getText().toString()));
                return true;
            }
            if (searchView.f700q2 == null || searchView.f690g2 == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
                return false;
            }
            if (i7 == 66 || i7 == 84 || i7 == 61) {
                searchView.m608n(searchAutoComplete.getListSelection());
            } else {
                if (i7 != 21 && i7 != 22) {
                    if (i7 != 19) {
                        return false;
                    }
                    searchAutoComplete.getListSelection();
                    return false;
                }
                searchAutoComplete.setSelection(i7 == 21 ? 0 : searchAutoComplete.length());
                searchAutoComplete.setListSelection(0);
                searchAutoComplete.clearListSelection();
                searchAutoComplete.m618a();
            }
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$h */
    public class C0190h implements TextView.OnEditorActionListener {
        public C0190h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
            SearchView.this.m611q();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$i */
    public class C0191i implements AdapterView.OnItemClickListener {
        public C0191i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i7, long j7) {
            SearchView.this.m608n(i7);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$j */
    public class C0192j implements AdapterView.OnItemSelectedListener {
        public C0192j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView<?> adapterView, View view, int i7, long j7) {
            SearchView.this.m609o(i7);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$k */
    public static class C0193k {
        /* renamed from: a */
        public static void m619a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        /* renamed from: b */
        public static void m620b(SearchAutoComplete searchAutoComplete, int i7) {
            searchAutoComplete.setInputMethodMode(i7);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$l */
    public interface InterfaceC0194l {
    }

    /* renamed from: androidx.appcompat.widget.SearchView$m */
    public interface InterfaceC0195m {
    }

    /* renamed from: androidx.appcompat.widget.SearchView$n */
    public interface InterfaceC0196n {
    }

    /* renamed from: androidx.appcompat.widget.SearchView$o */
    public static class C0197o {

        /* renamed from: a */
        public final Method f720a;

        /* renamed from: b */
        public final Method f721b;

        /* renamed from: c */
        public final Method f722c;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        public C0197o() {
            this.f720a = null;
            this.f721b = null;
            this.f722c = null;
            m621a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f720a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f721b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f722c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* renamed from: a */
        public static void m621a() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$p */
    public static class C0198p extends AbstractC1446a {
        public static final Parcelable.Creator<C0198p> CREATOR = new a();

        /* renamed from: m */
        public boolean f723m;

        /* renamed from: androidx.appcompat.widget.SearchView$p$a */
        public class a implements Parcelable.ClassLoaderCreator<C0198p> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new C0198p(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i7) {
                return new C0198p[i7];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final C0198p createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0198p(parcel, classLoader);
            }
        }

        public C0198p(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f723m = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public C0198p(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f723m + "}";
        }

        @Override // p082k0.AbstractC1446a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            parcel.writeParcelable(this.f6946c, i7);
            parcel.writeValue(Boolean.valueOf(this.f723m));
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$q */
    public static class C0199q extends TouchDelegate {

        /* renamed from: a */
        public final View f724a;

        /* renamed from: b */
        public final Rect f725b;

        /* renamed from: c */
        public final Rect f726c;

        /* renamed from: d */
        public final Rect f727d;

        /* renamed from: e */
        public final int f728e;

        /* renamed from: f */
        public boolean f729f;

        public C0199q(Rect rect, Rect rect2, SearchAutoComplete searchAutoComplete) {
            super(rect, searchAutoComplete);
            int scaledTouchSlop = ViewConfiguration.get(searchAutoComplete.getContext()).getScaledTouchSlop();
            this.f728e = scaledTouchSlop;
            Rect rect3 = new Rect();
            this.f725b = rect3;
            Rect rect4 = new Rect();
            this.f727d = rect4;
            Rect rect5 = new Rect();
            this.f726c = rect5;
            rect3.set(rect);
            rect4.set(rect);
            int i7 = -scaledTouchSlop;
            rect4.inset(i7, i7);
            rect5.set(rect2);
            this.f724a = searchAutoComplete;
        }

        @Override // android.view.TouchDelegate
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z6;
            float f7;
            int i7;
            boolean z7;
            int x7 = (int) motionEvent.getX();
            int y7 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z8 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z7 = this.f729f;
                    if (z7 && !this.f727d.contains(x7, y7)) {
                        z8 = z7;
                        z6 = false;
                    }
                } else {
                    if (action == 3) {
                        z7 = this.f729f;
                        this.f729f = false;
                    }
                    z6 = true;
                    z8 = false;
                }
                z8 = z7;
                z6 = true;
            } else {
                if (this.f725b.contains(x7, y7)) {
                    this.f729f = true;
                    z6 = true;
                }
                z6 = true;
                z8 = false;
            }
            if (!z8) {
                return false;
            }
            Rect rect = this.f726c;
            View view = this.f724a;
            if (!z6 || rect.contains(x7, y7)) {
                f7 = x7 - rect.left;
                i7 = y7 - rect.top;
            } else {
                f7 = view.getWidth() / 2;
                i7 = view.getHeight() / 2;
            }
            motionEvent.setLocation(f7, i7);
            return view.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        f664v2 = Build.VERSION.SDK_INT < 29 ? new C0197o() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f675R1 = new Rect();
        this.f676S1 = new Rect();
        this.f677T1 = new int[2];
        this.f678U1 = new int[2];
        this.f702s2 = new RunnableC0184b();
        this.f703t2 = new RunnableC0185c();
        this.f704u2 = new WeakHashMap<>();
        ViewOnClickListenerC0188f viewOnClickListenerC0188f = new ViewOnClickListenerC0188f();
        ViewOnKeyListenerC0189g viewOnKeyListenerC0189g = new ViewOnKeyListenerC0189g();
        C0190h c0190h = new C0190h();
        C0191i c0191i = new C0191i();
        C0192j c0192j = new C0192j();
        C0183a c0183a = new C0183a();
        int[] iArr = R$styleable.f294v;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i7, 0);
        C0233h1 c0233h1 = new C0233h1(context, obtainStyledAttributes);
        C0946x.m2816q(this, context, iArr, attributeSet, obtainStyledAttributes, i7);
        LayoutInflater.from(context).inflate(c0233h1.m799i(R$styleable.SearchView_layout, R$layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R$id.search_src_text);
        this.f665H1 = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f666I1 = findViewById(R$id.search_edit_frame);
        View findViewById = findViewById(R$id.search_plate);
        this.f667J1 = findViewById;
        View findViewById2 = findViewById(R$id.submit_area);
        this.f668K1 = findViewById2;
        ImageView imageView = (ImageView) findViewById(R$id.search_button);
        this.f669L1 = imageView;
        ImageView imageView2 = (ImageView) findViewById(R$id.search_go_btn);
        this.f670M1 = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R$id.search_close_btn);
        this.f671N1 = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R$id.search_voice_btn);
        this.f672O1 = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R$id.search_mag_icon);
        this.f679V1 = imageView5;
        C0946x.d.m2841q(findViewById, c0233h1.m795e(R$styleable.SearchView_queryBackground));
        C0946x.d.m2841q(findViewById2, c0233h1.m795e(R$styleable.SearchView_submitBackground));
        int i8 = R$styleable.SearchView_searchIcon;
        imageView.setImageDrawable(c0233h1.m795e(i8));
        imageView2.setImageDrawable(c0233h1.m795e(R$styleable.SearchView_goIcon));
        imageView3.setImageDrawable(c0233h1.m795e(R$styleable.SearchView_closeIcon));
        imageView4.setImageDrawable(c0233h1.m795e(R$styleable.SearchView_voiceIcon));
        imageView5.setImageDrawable(c0233h1.m795e(i8));
        this.f680W1 = c0233h1.m795e(R$styleable.SearchView_searchHintIcon);
        C0245l1.m845a(imageView, getResources().getString(R$string.abc_searchview_description_search));
        this.f681X1 = c0233h1.m799i(R$styleable.SearchView_suggestionRowLayout, R$layout.abc_search_dropdown_item_icons_2line);
        this.f682Y1 = c0233h1.m799i(R$styleable.SearchView_commitIcon, 0);
        imageView.setOnClickListener(viewOnClickListenerC0188f);
        imageView3.setOnClickListener(viewOnClickListenerC0188f);
        imageView2.setOnClickListener(viewOnClickListenerC0188f);
        imageView4.setOnClickListener(viewOnClickListenerC0188f);
        searchAutoComplete.setOnClickListener(viewOnClickListenerC0188f);
        searchAutoComplete.addTextChangedListener(c0183a);
        searchAutoComplete.setOnEditorActionListener(c0190h);
        searchAutoComplete.setOnItemClickListener(c0191i);
        searchAutoComplete.setOnItemSelectedListener(c0192j);
        searchAutoComplete.setOnKeyListener(viewOnKeyListenerC0189g);
        searchAutoComplete.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0186d());
        setIconifiedByDefault(c0233h1.m791a(R$styleable.SearchView_iconifiedByDefault, true));
        int m794d = c0233h1.m794d(R$styleable.SearchView_android_maxWidth, -1);
        if (m794d != -1) {
            setMaxWidth(m794d);
        }
        this.f685b2 = c0233h1.m801k(R$styleable.SearchView_defaultQueryHint);
        this.f692i2 = c0233h1.m801k(R$styleable.SearchView_queryHint);
        int m798h = c0233h1.m798h(R$styleable.SearchView_android_imeOptions, -1);
        if (m798h != -1) {
            setImeOptions(m798h);
        }
        int m798h2 = c0233h1.m798h(R$styleable.SearchView_android_inputType, -1);
        if (m798h2 != -1) {
            setInputType(m798h2);
        }
        setFocusable(c0233h1.m791a(R$styleable.SearchView_android_focusable, true));
        c0233h1.m803n();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f683Z1 = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f684a2 = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f673P1 = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0187e());
        }
        m617w(this.f688e2);
        m614t();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R$dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R$dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.f665H1;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f694k2 = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f665H1;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f694k2 = false;
    }

    public int getImeOptions() {
        return this.f665H1.getImeOptions();
    }

    public int getInputType() {
        return this.f665H1.getInputType();
    }

    public int getMaxWidth() {
        return this.f695l2;
    }

    public CharSequence getQuery() {
        return this.f665H1.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f692i2;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f700q2;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f685b2 : getContext().getText(this.f700q2.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f682Y1;
    }

    public int getSuggestionRowLayout() {
        return this.f681X1;
    }

    public AbstractC1397a getSuggestionsAdapter() {
        return this.f690g2;
    }

    /* renamed from: j */
    public final Intent m604j(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f697n2);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f701r2;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f700q2.getSearchActivity());
        return intent;
    }

    /* renamed from: k */
    public final Intent m605k(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f701r2;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* renamed from: l */
    public final void m606l() {
        int i7 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.f665H1;
        if (i7 >= 29) {
            C0193k.m619a(searchAutoComplete);
            return;
        }
        C0197o c0197o = f664v2;
        c0197o.getClass();
        C0197o.m621a();
        Method method = c0197o.f720a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        c0197o.getClass();
        C0197o.m621a();
        Method method2 = c0197o.f721b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: m */
    public final void m607m() {
        SearchAutoComplete searchAutoComplete = this.f665H1;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.f688e2) {
            clearFocus();
            m617w(true);
        }
    }

    /* renamed from: n */
    public final void m608n(int i7) {
        int i8;
        String m688i;
        Cursor cursor = this.f690g2.f6739m;
        if (cursor != null && cursor.moveToPosition(i7)) {
            Intent intent = null;
            try {
                int i9 = ViewOnClickListenerC0215b1.f802M1;
                String m688i2 = ViewOnClickListenerC0215b1.m688i(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (m688i2 == null) {
                    m688i2 = this.f700q2.getSuggestIntentAction();
                }
                if (m688i2 == null) {
                    m688i2 = "android.intent.action.SEARCH";
                }
                String m688i3 = ViewOnClickListenerC0215b1.m688i(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (m688i3 == null) {
                    m688i3 = this.f700q2.getSuggestIntentData();
                }
                if (m688i3 != null && (m688i = ViewOnClickListenerC0215b1.m688i(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    m688i3 = m688i3 + "/" + Uri.encode(m688i);
                }
                intent = m604j(m688i2, m688i3 == null ? null : Uri.parse(m688i3), ViewOnClickListenerC0215b1.m688i(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), ViewOnClickListenerC0215b1.m688i(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e7) {
                try {
                    i8 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i8 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + i8 + " returned exception.", e7);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e8) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e8);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f665H1;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    /* renamed from: o */
    public final void m609o(int i7) {
        String mo691d;
        Editable text = this.f665H1.getText();
        Cursor cursor = this.f690g2.f6739m;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i7) || (mo691d = this.f690g2.mo691d(cursor)) == null) {
            setQuery(text);
        } else {
            setQuery(mo691d);
        }
    }

    @Override // p049g.InterfaceC1184b
    public final void onActionViewCollapsed() {
        SearchAutoComplete searchAutoComplete = this.f665H1;
        searchAutoComplete.setText("");
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.f697n2 = "";
        clearFocus();
        m617w(true);
        searchAutoComplete.setImeOptions(this.f699p2);
        this.f698o2 = false;
    }

    @Override // p049g.InterfaceC1184b
    public final void onActionViewExpanded() {
        if (this.f698o2) {
            return;
        }
        this.f698o2 = true;
        SearchAutoComplete searchAutoComplete = this.f665H1;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.f699p2 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f702s2);
        post(this.f703t2);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.C0256p0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        super.onLayout(z6, i7, i8, i9, i10);
        if (z6) {
            SearchAutoComplete searchAutoComplete = this.f665H1;
            int[] iArr = this.f677T1;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.f678U1;
            getLocationInWindow(iArr2);
            int i11 = iArr[1] - iArr2[1];
            int i12 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i12;
            int height = searchAutoComplete.getHeight() + i11;
            Rect rect = this.f675R1;
            rect.set(i12, i11, width, height);
            int i13 = rect.left;
            int i14 = rect.right;
            int i15 = i10 - i8;
            Rect rect2 = this.f676S1;
            rect2.set(i13, 0, i14, i15);
            C0199q c0199q = this.f674Q1;
            if (c0199q == null) {
                C0199q c0199q2 = new C0199q(rect2, rect, searchAutoComplete);
                this.f674Q1 = c0199q2;
                setTouchDelegate(c0199q2);
            } else {
                c0199q.f725b.set(rect2);
                Rect rect3 = c0199q.f727d;
                rect3.set(rect2);
                int i16 = -c0199q.f728e;
                rect3.inset(i16, i16);
                c0199q.f726c.set(rect);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        if (r0 <= 0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    @Override // androidx.appcompat.widget.C0256p0, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.f689f2
            if (r0 == 0) goto L8
            super.onMeasure(r4, r5)
            return
        L8:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L2a
            if (r0 == 0) goto L20
            if (r0 == r2) goto L1b
            goto L37
        L1b:
            int r0 = r3.f695l2
            if (r0 <= 0) goto L37
            goto L2e
        L20:
            int r4 = r3.f695l2
            if (r4 <= 0) goto L25
            goto L37
        L25:
            int r4 = r3.getPreferredWidth()
            goto L37
        L2a:
            int r0 = r3.f695l2
            if (r0 <= 0) goto L2f
        L2e:
            goto L33
        L2f:
            int r0 = r3.getPreferredWidth()
        L33:
            int r4 = java.lang.Math.min(r0, r4)
        L37:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L49
            if (r0 == 0) goto L44
            goto L51
        L44:
            int r5 = r3.getPreferredHeight()
            goto L51
        L49:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L51:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0198p)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0198p c0198p = (C0198p) parcelable;
        super.onRestoreInstanceState(c0198p.f6946c);
        m617w(c0198p.f723m);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0198p c0198p = new C0198p(super.onSaveInstanceState());
        c0198p.f723m = this.f689f2;
        return c0198p;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z6) {
        super.onWindowFocusChanged(z6);
        post(this.f702s2);
    }

    /* renamed from: p */
    public final void m610p(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* renamed from: q */
    public final void m611q() {
        SearchAutoComplete searchAutoComplete = this.f665H1;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f700q2 != null) {
            getContext().startActivity(m604j("android.intent.action.SEARCH", null, null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    /* renamed from: r */
    public final void m612r() {
        boolean z6 = true;
        boolean z7 = !TextUtils.isEmpty(this.f665H1.getText());
        if (!z7 && (!this.f688e2 || this.f698o2)) {
            z6 = false;
        }
        int i7 = z6 ? 0 : 8;
        ImageView imageView = this.f671N1;
        imageView.setVisibility(i7);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(z7 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i7, Rect rect) {
        if (this.f694k2 || !isFocusable()) {
            return false;
        }
        if (this.f689f2) {
            return super.requestFocus(i7, rect);
        }
        boolean requestFocus = this.f665H1.requestFocus(i7, rect);
        if (requestFocus) {
            m617w(false);
        }
        return requestFocus;
    }

    /* renamed from: s */
    public final void m613s() {
        int[] iArr = this.f665H1.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f667J1.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f668K1.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public void setAppSearchData(Bundle bundle) {
        this.f701r2 = bundle;
    }

    public void setIconified(boolean z6) {
        if (z6) {
            m607m();
            return;
        }
        m617w(false);
        SearchAutoComplete searchAutoComplete = this.f665H1;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f687d2;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z6) {
        if (this.f688e2 == z6) {
            return;
        }
        this.f688e2 = z6;
        m617w(z6);
        m614t();
    }

    public void setImeOptions(int i7) {
        this.f665H1.setImeOptions(i7);
    }

    public void setInputType(int i7) {
        this.f665H1.setInputType(i7);
    }

    public void setMaxWidth(int i7) {
        this.f695l2 = i7;
        requestLayout();
    }

    public void setOnCloseListener(InterfaceC0194l interfaceC0194l) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f686c2 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(InterfaceC0195m interfaceC0195m) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f687d2 = onClickListener;
    }

    public void setOnSuggestionListener(InterfaceC0196n interfaceC0196n) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f692i2 = charSequence;
        m614t();
    }

    public void setQueryRefinementEnabled(boolean z6) {
        this.f693j2 = z6;
        AbstractC1397a abstractC1397a = this.f690g2;
        if (abstractC1397a instanceof ViewOnClickListenerC0215b1) {
            ((ViewOnClickListenerC0215b1) abstractC1397a).f807E1 = z6 ? 2 : 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0095, code lost:
    
        if (getContext().getPackageManager().resolveActivity(r3, 65536) != null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setSearchableInfo(android.app.SearchableInfo r8) {
        /*
            r7 = this;
            r7.f700q2 = r8
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r7.f665H1
            r1 = 1
            r2 = 65536(0x10000, float:9.18355E-41)
            r3 = 0
            if (r8 == 0) goto L68
            int r8 = r8.getSuggestThreshold()
            r0.setThreshold(r8)
            android.app.SearchableInfo r8 = r7.f700q2
            int r8 = r8.getImeOptions()
            r0.setImeOptions(r8)
            android.app.SearchableInfo r8 = r7.f700q2
            int r8 = r8.getInputType()
            r4 = r8 & 15
            if (r4 != r1) goto L34
            r4 = -65537(0xfffffffffffeffff, float:NaN)
            r8 = r8 & r4
            android.app.SearchableInfo r4 = r7.f700q2
            java.lang.String r4 = r4.getSuggestAuthority()
            if (r4 == 0) goto L34
            r8 = r8 | r2
            r4 = 524288(0x80000, float:7.34684E-40)
            r8 = r8 | r4
        L34:
            r0.setInputType(r8)
            j0.a r8 = r7.f690g2
            if (r8 == 0) goto L3e
            r8.mo690c(r3)
        L3e:
            android.app.SearchableInfo r8 = r7.f700q2
            java.lang.String r8 = r8.getSuggestAuthority()
            if (r8 == 0) goto L65
            androidx.appcompat.widget.b1 r8 = new androidx.appcompat.widget.b1
            android.content.Context r4 = r7.getContext()
            android.app.SearchableInfo r5 = r7.f700q2
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r6 = r7.f704u2
            r8.<init>(r4, r7, r5, r6)
            r7.f690g2 = r8
            r0.setAdapter(r8)
            j0.a r8 = r7.f690g2
            androidx.appcompat.widget.b1 r8 = (androidx.appcompat.widget.ViewOnClickListenerC0215b1) r8
            boolean r4 = r7.f693j2
            if (r4 == 0) goto L62
            r4 = 2
            goto L63
        L62:
            r4 = 1
        L63:
            r8.f807E1 = r4
        L65:
            r7.m614t()
        L68:
            android.app.SearchableInfo r8 = r7.f700q2
            if (r8 == 0) goto L98
            boolean r8 = r8.getVoiceSearchEnabled()
            if (r8 == 0) goto L98
            android.app.SearchableInfo r8 = r7.f700q2
            boolean r8 = r8.getVoiceSearchLaunchWebSearch()
            if (r8 == 0) goto L7d
            android.content.Intent r3 = r7.f683Z1
            goto L87
        L7d:
            android.app.SearchableInfo r8 = r7.f700q2
            boolean r8 = r8.getVoiceSearchLaunchRecognizer()
            if (r8 == 0) goto L87
            android.content.Intent r3 = r7.f684a2
        L87:
            if (r3 == 0) goto L98
            android.content.Context r8 = r7.getContext()
            android.content.pm.PackageManager r8 = r8.getPackageManager()
            android.content.pm.ResolveInfo r8 = r8.resolveActivity(r3, r2)
            if (r8 == 0) goto L98
            goto L99
        L98:
            r1 = 0
        L99:
            r7.f696m2 = r1
            if (r1 == 0) goto La2
            java.lang.String r8 = "nm"
            r0.setPrivateImeOptions(r8)
        La2:
            boolean r8 = r7.f689f2
            r7.m617w(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z6) {
        this.f691h2 = z6;
        m617w(this.f689f2);
    }

    public void setSuggestionsAdapter(AbstractC1397a abstractC1397a) {
        this.f690g2 = abstractC1397a;
        this.f665H1.setAdapter(abstractC1397a);
    }

    /* renamed from: t */
    public final void m614t() {
        Drawable drawable;
        CharSequence queryHint = getQueryHint();
        if (queryHint == null) {
            queryHint = "";
        }
        boolean z6 = this.f688e2;
        SearchAutoComplete searchAutoComplete = this.f665H1;
        if (z6 && (drawable = this.f680W1) != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    /* renamed from: u */
    public final void m615u() {
        int i7 = 0;
        if (!((this.f691h2 || this.f696m2) && !this.f689f2) || (this.f670M1.getVisibility() != 0 && this.f672O1.getVisibility() != 0)) {
            i7 = 8;
        }
        this.f668K1.setVisibility(i7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001e, code lost:
    
        if (r2.f696m2 == false) goto L20;
     */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m616v(boolean r3) {
        /*
            r2 = this;
            boolean r0 = r2.f691h2
            if (r0 == 0) goto L21
            r1 = 0
            if (r0 != 0) goto Lb
            boolean r0 = r2.f696m2
            if (r0 == 0) goto L11
        Lb:
            boolean r0 = r2.f689f2
            if (r0 != 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 == 0) goto L21
            boolean r0 = r2.hasFocus()
            if (r0 == 0) goto L21
            if (r3 != 0) goto L23
            boolean r3 = r2.f696m2
            if (r3 != 0) goto L21
            goto L23
        L21:
            r1 = 8
        L23:
            android.widget.ImageView r3 = r2.f670M1
            r3.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.m616v(boolean):void");
    }

    /* renamed from: w */
    public final void m617w(boolean z6) {
        this.f689f2 = z6;
        int i7 = 8;
        int i8 = z6 ? 0 : 8;
        boolean z7 = !TextUtils.isEmpty(this.f665H1.getText());
        this.f669L1.setVisibility(i8);
        m616v(z7);
        this.f666I1.setVisibility(z6 ? 8 : 0);
        ImageView imageView = this.f679V1;
        imageView.setVisibility((imageView.getDrawable() == null || this.f688e2) ? 8 : 0);
        m612r();
        boolean z8 = !z7;
        if (this.f696m2 && !this.f689f2 && z8) {
            this.f670M1.setVisibility(8);
            i7 = 0;
        }
        this.f672O1.setVisibility(i7);
        m615u();
    }
}
