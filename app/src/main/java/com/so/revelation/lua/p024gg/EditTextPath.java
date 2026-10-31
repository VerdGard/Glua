package com.so.revelation.lua.p024gg;

import android.annotation.TargetApi;
import android.content.Context;
import android.ext.Config;
import android.ext.Tools;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import com.so.revelation.lua.R;
import com.so.revelation.lua.p024gg.PathSelector;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Locale;
import p175w1.C2090h;
import p175w1.InterfaceC2092i;

/* loaded from: classes.dex */
public class EditTextPath extends AutoCompleteTextView implements InterfaceC2092i {

    /* renamed from: c */
    public int f3643c;

    /* renamed from: e */
    public int f3644e;

    /* renamed from: com.so.revelation.lua.gg.EditTextPath$a */
    public class C0722a extends BaseAdapter implements Filterable {

        /* renamed from: c */
        public final C0723b f3645c;

        public C0722a(EditTextPath editTextPath) {
            this.f3645c = editTextPath.new C0723b(this);
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            return 0;
        }

        @Override // android.widget.Filterable
        public final Filter getFilter() {
            return this.f3645c;
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i7) {
            return null;
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i7) {
            return i7;
        }

        @Override // android.widget.Adapter
        public final View getView(int i7, View view, ViewGroup viewGroup) {
            return view == null ? LayoutInflater.from(Tools.getActivity()).inflate(R.layout.path_suggestion, viewGroup, false) : view;
        }
    }

    /* renamed from: com.so.revelation.lua.gg.EditTextPath$b */
    public class C0723b extends Filter {

        /* renamed from: a */
        public final C0722a f3646a;

        public C0723b(C0722a c0722a) {
            this.f3646a = c0722a;
        }

        @Override // android.widget.Filter
        public final Filter.FilterResults performFiltering(CharSequence charSequence) {
            String[] m2255c;
            Filter.FilterResults filterResults = new Filter.FilterResults();
            if (charSequence != null) {
                String charSequence2 = charSequence.length() == 0 ? "/" : charSequence.toString();
                File file = new File(charSequence2);
                boolean endsWith = charSequence2.endsWith("/");
                File parentFile = endsWith ? file : file.getParentFile();
                String lowerCase = (endsWith ? "" : file.getName()).toLowerCase(Locale.US);
                if (parentFile.exists() && (m2255c = PathSelector.m2255c(parentFile)) != null && m2255c.length > 0) {
                    ArrayList<PathSelector.C0729e> m2256d = PathSelector.m2256d(EditTextPath.this.f3643c, parentFile, m2255c, lowerCase, true);
                    int size = m2256d.size();
                    if (size == 1 && m2256d.get(0).f3675c.equals(lowerCase)) {
                        size = 0;
                    }
                    if (size > 0) {
                        File[] fileArr = new File[size];
                        for (int i7 = 0; i7 < size; i7++) {
                            fileArr[i7] = m2256d.get(i7).f3673a;
                        }
                        filterResults.values = fileArr;
                        filterResults.count = size;
                    }
                }
            }
            return filterResults;
        }

        @Override // android.widget.Filter
        public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            this.f3646a.notifyDataSetChanged();
        }
    }

    public EditTextPath(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3643c = 0;
        this.f3644e = -1;
        setAdapter(new C0722a(this));
        if (!isInEditMode()) {
            setInputType((Config.configClient & 8) != 0 ? 1 : 524289);
        }
        setSingleLine(true);
        setSelectAllOnFocus(true);
        setMinEms(10);
        setCursorVisible(true);
        setFocusableInTouchMode(true);
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            declaredField.set(this, 0);
        } catch (Exception unused) {
        }
        if (!isInEditMode()) {
            C2090h.m5148a(this);
        }
        setInputType(getInputType() | 262144);
        setHorizontallyScrolling(false);
        setMaxLines(Integer.MAX_VALUE);
    }

    @Override // android.view.View
    public final void dispatchWindowFocusChanged(boolean z6) {
        try {
            super.dispatchWindowFocusChanged(z6);
        } catch (Throwable unused) {
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        try {
            super.drawableStateChanged();
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
    }

    @Override // p175w1.InterfaceC2092i
    public int getDataType() {
        return this.f3644e;
    }

    public int getPathType() {
        return this.f3643c;
    }

    public boolean getSecClipboardEnabled() {
        return false;
    }

    @Override // android.widget.TextView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        try {
            super.invalidateDrawable(drawable);
        } catch (NoSuchFieldError unused) {
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        try {
            return super.onDragEvent(dragEvent);
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (ArrayIndexOutOfBoundsException | NullPointerException unused) {
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z6, int i7, Rect rect) {
        try {
            int imeOptions = super.getImeOptions();
            if ((imeOptions & 1912602624) != 1912602624) {
                super.setImeOptions(imeOptions | 1912602624);
            }
        } catch (Throwable unused) {
        }
        try {
            super.onFocusChanged(z6, i7, rect);
        } catch (Throwable unused2) {
        }
    }

    @Override // android.view.View
    @TargetApi(14)
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        try {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        } catch (NullPointerException unused) {
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i7, KeyEvent keyEvent) {
        boolean isPopupShowing = isPopupShowing();
        if (i7 == 66 && isPopupShowing) {
            return true;
        }
        return super.onKeyPreIme(i7, keyEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView, android.view.View
    public final boolean onKeyShortcut(int i7, KeyEvent keyEvent) {
        try {
            return super.onKeyShortcut(i7, keyEvent);
        } catch (NullPointerException unused) {
            return false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i7, int i8) {
        try {
            super.onMeasure(i7, i8);
        } catch (Throwable unused) {
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i7) {
        try {
            return super.onTextContextMenuItem(i7);
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z6) {
        try {
            super.onWindowFocusChanged(z6);
        } catch (Throwable unused) {
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean performLongClick() {
        try {
            return super.performLongClick();
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // android.view.View
    public final void playSoundEffect(int i7) {
        try {
            super.playSoundEffect(i7);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        try {
            super.refreshDrawableState();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEvent(int i7) {
        try {
            super.sendAccessibilityEvent(i7);
        } catch (Throwable unused) {
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        try {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } catch (StringIndexOutOfBoundsException unused) {
        }
    }

    @Override // p175w1.InterfaceC2092i
    public void setDataType(int i7) {
        this.f3644e = i7;
    }

    @Override // android.widget.TextView
    public void setHorizontallyScrolling(boolean z6) {
        super.setHorizontallyScrolling(false);
    }

    @Override // android.widget.TextView
    public void setImeOptions(int i7) {
        try {
            super.setImeOptions(i7 | 1912602624);
        } catch (Throwable unused) {
        }
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i7) {
        super.setMaxLines(Integer.MAX_VALUE);
    }

    public void setPathType(int i7) {
        this.f3643c = i7;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        try {
            super.setText(charSequence, bufferType);
        } catch (NullPointerException | SecurityException unused) {
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(int i7) {
        super.setTextColor(-16777216);
    }
}
