package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.R$attr;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p033e.C0905c;
import p066i0.C1311e;

/* renamed from: androidx.appcompat.widget.m0 */
/* loaded from: classes.dex */
public class C0247m0 extends ListView {

    /* renamed from: A1 */
    public final boolean f973A1;

    /* renamed from: B1 */
    public boolean f974B1;

    /* renamed from: C1 */
    public C1311e f975C1;

    /* renamed from: D1 */
    public f f976D1;

    /* renamed from: c */
    public final Rect f977c;

    /* renamed from: e */
    public int f978e;

    /* renamed from: m */
    public int f979m;

    /* renamed from: s */
    public int f980s;

    /* renamed from: w1 */
    public int f981w1;

    /* renamed from: x1 */
    public int f982x1;

    /* renamed from: y1 */
    public d f983y1;

    /* renamed from: z1 */
    public boolean f984z1;

    /* renamed from: androidx.appcompat.widget.m0$a */
    public static class a {
        /* renamed from: a */
        public static void m857a(View view, float f7, float f8) {
            view.drawableHotspotChanged(f7, f8);
        }
    }

    /* renamed from: androidx.appcompat.widget.m0$b */
    public static class b {

        /* renamed from: a */
        public static final Method f985a;

        /* renamed from: b */
        public static final Method f986b;

        /* renamed from: c */
        public static final Method f987c;

        /* renamed from: d */
        public static final boolean f988d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
                f985a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f986b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f987c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f988d = true;
            } catch (NoSuchMethodException e7) {
                e7.printStackTrace();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.m0$c */
    public static class c {
        /* renamed from: a */
        public static boolean m858a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        /* renamed from: b */
        public static void m859b(AbsListView absListView, boolean z6) {
            absListView.setSelectedChildViewEnabled(z6);
        }
    }

    /* renamed from: androidx.appcompat.widget.m0$d */
    public static class d extends C0905c {

        /* renamed from: e */
        public boolean f989e;

        public d(Drawable drawable) {
            super(drawable);
            this.f989e = true;
        }

        @Override // p033e.C0905c, android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            if (this.f989e) {
                super.draw(canvas);
            }
        }

        @Override // p033e.C0905c, android.graphics.drawable.Drawable
        public final void setHotspot(float f7, float f8) {
            if (this.f989e) {
                super.setHotspot(f7, f8);
            }
        }

        @Override // p033e.C0905c, android.graphics.drawable.Drawable
        public final void setHotspotBounds(int i7, int i8, int i9, int i10) {
            if (this.f989e) {
                super.setHotspotBounds(i7, i8, i9, i10);
            }
        }

        @Override // p033e.C0905c, android.graphics.drawable.Drawable
        public final boolean setState(int[] iArr) {
            if (this.f989e) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // p033e.C0905c, android.graphics.drawable.Drawable
        public final boolean setVisible(boolean z6, boolean z7) {
            if (this.f989e) {
                return super.setVisible(z6, z7);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.m0$e */
    public static class e {

        /* renamed from: a */
        public static final Field f990a;

        static {
            Field field = null;
            try {
                field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                field.setAccessible(true);
            } catch (NoSuchFieldException e7) {
                e7.printStackTrace();
            }
            f990a = field;
        }
    }

    /* renamed from: androidx.appcompat.widget.m0$f */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C0247m0 c0247m0 = C0247m0.this;
            c0247m0.f976D1 = null;
            c0247m0.drawableStateChanged();
        }
    }

    public C0247m0(Context context, boolean z6) {
        super(context, null, R$attr.dropDownListViewStyle);
        this.f977c = new Rect();
        this.f978e = 0;
        this.f979m = 0;
        this.f980s = 0;
        this.f981w1 = 0;
        this.f973A1 = z6;
        setCacheColorHint(0);
    }

    private void setSelectorEnabled(boolean z6) {
        d dVar = this.f983y1;
        if (dVar != null) {
            dVar.f989e = z6;
        }
    }

    /* renamed from: a */
    public final int m855a(int i7, int i8) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i9 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i9;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i10 = 0;
        for (int i11 = 0; i11 < count; i11++) {
            int itemViewType = adapter.getItemViewType(i11);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = adapter.getView(i11, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i12 = layoutParams.height;
            view.measure(i7, i12 > 0 ? View.MeasureSpec.makeMeasureSpec(i12, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i11 > 0) {
                i9 += dividerHeight;
            }
            i9 += view.getMeasuredHeight();
            if (i9 >= i8) {
                return i8;
            }
        }
        return i9;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0143 A[ADDED_TO_REGION] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m856b(android.view.MotionEvent r17, int r18) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0247m0.m856b(android.view.MotionEvent, int):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f977c;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f976D1 != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        Drawable selector = getSelector();
        if (selector != null && this.f974B1 && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f973A1 || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f973A1 || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f973A1 || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f973A1 && this.f984z1) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f976D1 = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f976D1 == null) {
            f fVar = new f();
            this.f976D1 = fVar;
            post(fVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i7 < 30 || !b.f988d) {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    } else {
                        try {
                            b.f985a.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                            b.f986b.invoke(this, Integer.valueOf(pointToPosition));
                            b.f987c.invoke(this, Integer.valueOf(pointToPosition));
                        } catch (IllegalAccessException | InvocationTargetException e7) {
                            e7.printStackTrace();
                        }
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.f974B1 && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f982x1 = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        f fVar = this.f976D1;
        if (fVar != null) {
            C0247m0 c0247m0 = C0247m0.this;
            c0247m0.f976D1 = null;
            c0247m0.removeCallbacks(fVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z6) {
        this.f984z1 = z6;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        d dVar = drawable != null ? new d(drawable) : null;
        this.f983y1 = dVar;
        super.setSelector(dVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f978e = rect.left;
        this.f979m = rect.top;
        this.f980s = rect.right;
        this.f981w1 = rect.bottom;
    }
}
