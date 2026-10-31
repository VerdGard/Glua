package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import p127q.C1713d;
import p127q.C1718i;

/* renamed from: androidx.constraintlayout.widget.a */
/* loaded from: classes.dex */
public abstract class AbstractC0282a extends View {

    /* renamed from: c */
    public int[] f1273c;

    /* renamed from: e */
    public int f1274e;

    /* renamed from: m */
    public final Context f1275m;

    /* renamed from: s */
    public C1718i f1276s;

    /* renamed from: w1 */
    public String f1277w1;

    /* renamed from: x1 */
    public final HashMap<Integer, String> f1278x1;

    public AbstractC0282a(Context context) {
        super(context);
        this.f1273c = new int[32];
        this.f1278x1 = new HashMap<>();
        this.f1275m = context;
        mo932e(null);
    }

    public AbstractC0282a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1273c = new int[32];
        this.f1278x1 = new HashMap<>();
        this.f1275m = context;
        mo932e(attributeSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m942a(java.lang.String r6) {
        /*
            r5 = this;
            if (r6 == 0) goto La9
            int r0 = r6.length()
            if (r0 != 0) goto La
            goto La9
        La:
            android.content.Context r0 = r5.f1275m
            if (r0 != 0) goto Lf
            return
        Lf:
            java.lang.String r6 = r6.trim()
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r1 == 0) goto L21
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
        L21:
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            r2 = 0
            if (r1 == 0) goto L31
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            goto L32
        L31:
            r1 = r2
        L32:
            boolean r3 = r5.isInEditMode()
            if (r3 == 0) goto L5b
            if (r1 == 0) goto L5b
            boolean r3 = r6 instanceof java.lang.String
            if (r3 == 0) goto L4f
            java.util.HashMap<java.lang.String, java.lang.Integer> r3 = r1.f1178E1
            if (r3 == 0) goto L4f
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L4f
            java.util.HashMap<java.lang.String, java.lang.Integer> r3 = r1.f1178E1
            java.lang.Object r3 = r3.get(r6)
            goto L50
        L4f:
            r3 = r2
        L50:
            boolean r4 = r3 instanceof java.lang.Integer
            if (r4 == 0) goto L5b
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L5c
        L5b:
            r3 = 0
        L5c:
            if (r3 != 0) goto L64
            if (r1 == 0) goto L64
            int r3 = r5.m945d(r1, r6)
        L64:
            if (r3 != 0) goto L72
            java.lang.Class<androidx.constraintlayout.widget.R$id> r1 = androidx.constraintlayout.widget.R$id.class
            java.lang.reflect.Field r1 = r1.getField(r6)     // Catch: java.lang.Exception -> L71
            int r3 = r1.getInt(r2)     // Catch: java.lang.Exception -> L71
            goto L72
        L71:
        L72:
            if (r3 != 0) goto L82
            android.content.res.Resources r1 = r0.getResources()
            java.lang.String r2 = "id"
            java.lang.String r0 = r0.getPackageName()
            int r3 = r1.getIdentifier(r6, r2, r0)
        L82:
            if (r3 == 0) goto L91
            java.util.HashMap<java.lang.Integer, java.lang.String> r0 = r5.f1278x1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r0.put(r1, r6)
            r5.m943b(r3)
            goto La9
        L91:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Could not find id of \""
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = "\""
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "ConstraintHelper"
            android.util.Log.w(r0, r6)
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.AbstractC0282a.m942a(java.lang.String):void");
    }

    /* renamed from: b */
    public final void m943b(int i7) {
        if (i7 == getId()) {
            return;
        }
        int i8 = this.f1274e + 1;
        int[] iArr = this.f1273c;
        if (i8 > iArr.length) {
            this.f1273c = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f1273c;
        int i9 = this.f1274e;
        iArr2[i9] = i7;
        this.f1274e = i9 + 1;
    }

    /* renamed from: c */
    public final void m944c() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) parent;
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i7 = 0; i7 < this.f1274e; i7++) {
            View view = constraintLayout.f1181c.get(this.f1273c[i7]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* renamed from: d */
    public final int m945d(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str == null || constraintLayout == null || (resources = this.f1275m.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = constraintLayout.getChildAt(i7);
            if (childAt.getId() != -1) {
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    str2 = null;
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    /* renamed from: e */
    public void mo932e(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.f1264b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                if (index == R$styleable.ConstraintLayout_Layout_constraint_referenced_ids) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f1277w1 = string;
                    setIds(string);
                }
            }
        }
    }

    /* renamed from: f */
    public void mo933f(C1713d c1713d, boolean z6) {
    }

    /* renamed from: g */
    public final void m946g() {
        if (this.f1276s == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.C0280a) {
            ((ConstraintLayout.C0280a) layoutParams).f1238l0 = this.f1276s;
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f1273c, this.f1274e);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f1277w1;
        if (str != null) {
            setIds(str);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i8) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f1277w1 = str;
        if (str == null) {
            return;
        }
        int i7 = 0;
        this.f1274e = 0;
        while (true) {
            int indexOf = str.indexOf(44, i7);
            if (indexOf == -1) {
                m942a(str.substring(i7));
                return;
            } else {
                m942a(str.substring(i7, indexOf));
                i7 = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f1277w1 = null;
        this.f1274e = 0;
        for (int i7 : iArr) {
            m943b(i7);
        }
    }
}
