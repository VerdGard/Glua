package com.google.android.material.button;

import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.google.android.material.R$style;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import p034e0.C0908a;
import p034e0.C0920g;
import p034e0.C0923h0;
import p034e0.C0946x;
import p042f0.C1151g;
import p131q3.C1767w;
import p193y3.C2232a;
import p193y3.C2240i;
import p193y3.InterfaceC2234c;

/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: C1 */
    public static final int f3956C1 = R$style.Widget_MaterialComponents_MaterialButtonToggleGroup;

    /* renamed from: A1 */
    public final int f3957A1;

    /* renamed from: B1 */
    public HashSet f3958B1;

    /* renamed from: c */
    public final ArrayList f3959c;

    /* renamed from: e */
    public final C0767e f3960e;

    /* renamed from: m */
    public final LinkedHashSet<InterfaceC0766d> f3961m;

    /* renamed from: s */
    public final C0763a f3962s;

    /* renamed from: w1 */
    public Integer[] f3963w1;

    /* renamed from: x1 */
    public boolean f3964x1;

    /* renamed from: y1 */
    public boolean f3965y1;

    /* renamed from: z1 */
    public boolean f3966z1;

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$a */
    public class C0763a implements Comparator<MaterialButton> {
        public C0763a() {
        }

        @Override // java.util.Comparator
        public final int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            MaterialButton materialButton3 = materialButton;
            MaterialButton materialButton4 = materialButton2;
            int compareTo = Boolean.valueOf(materialButton3.isChecked()).compareTo(Boolean.valueOf(materialButton4.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton3.isPressed()).compareTo(Boolean.valueOf(materialButton4.isPressed()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            return Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton3)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton4)));
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$b */
    public class C0764b extends C0908a {
        public C0764b() {
        }

        @Override // p034e0.C0908a
        /* renamed from: d */
        public final void mo134d(View view, C1151g c1151g) {
            int i7;
            this.f4774a.onInitializeAccessibilityNodeInfo(view, c1151g.f5685a);
            int i8 = MaterialButtonToggleGroup.f3956C1;
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            materialButtonToggleGroup.getClass();
            if (view instanceof MaterialButton) {
                i7 = 0;
                for (int i9 = 0; i9 < materialButtonToggleGroup.getChildCount(); i9++) {
                    if (materialButtonToggleGroup.getChildAt(i9) == view) {
                        break;
                    }
                    if ((materialButtonToggleGroup.getChildAt(i9) instanceof MaterialButton) && materialButtonToggleGroup.m2328d(i9)) {
                        i7++;
                    }
                }
            }
            i7 = -1;
            c1151g.m3343h(C1151g.b.m3349a(0, 1, i7, 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$c */
    public static class C0765c {

        /* renamed from: e */
        public static final C2232a f3969e = new C2232a(0.0f);

        /* renamed from: a */
        public final InterfaceC2234c f3970a;

        /* renamed from: b */
        public final InterfaceC2234c f3971b;

        /* renamed from: c */
        public final InterfaceC2234c f3972c;

        /* renamed from: d */
        public final InterfaceC2234c f3973d;

        public C0765c(InterfaceC2234c interfaceC2234c, InterfaceC2234c interfaceC2234c2, InterfaceC2234c interfaceC2234c3, InterfaceC2234c interfaceC2234c4) {
            this.f3970a = interfaceC2234c;
            this.f3971b = interfaceC2234c3;
            this.f3972c = interfaceC2234c4;
            this.f3973d = interfaceC2234c2;
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$d */
    public interface InterfaceC0766d {
        /* renamed from: a */
        void mo2331a();
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$e */
    public class C0767e implements MaterialButton.InterfaceC0761b {
        public C0767e() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialButtonToggleGroup(android.content.Context r7, android.util.AttributeSet r8) {
        /*
            r6 = this;
            int r3 = com.google.android.material.R$attr.materialButtonToggleGroupStyle
            int r4 = com.google.android.material.button.MaterialButtonToggleGroup.f3956C1
            android.content.Context r7 = p038e4.C1138a.m3322a(r7, r8, r3, r4)
            r6.<init>(r7, r8, r3)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r6.f3959c = r7
            com.google.android.material.button.MaterialButtonToggleGroup$e r7 = new com.google.android.material.button.MaterialButtonToggleGroup$e
            r7.<init>()
            r6.f3960e = r7
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            r6.f3961m = r7
            com.google.android.material.button.MaterialButtonToggleGroup$a r7 = new com.google.android.material.button.MaterialButtonToggleGroup$a
            r7.<init>()
            r6.f3962s = r7
            r7 = 0
            r6.f3964x1 = r7
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r6.f3958B1 = r0
            android.content.Context r0 = r6.getContext()
            int[] r2 = com.google.android.material.R$styleable.f3739m
            int[] r5 = new int[r7]
            r1 = r8
            android.content.res.TypedArray r8 = p131q3.C1762r.m4235d(r0, r1, r2, r3, r4, r5)
            int r0 = com.google.android.material.R$styleable.MaterialButtonToggleGroup_singleSelection
            boolean r0 = r8.getBoolean(r0, r7)
            r6.setSingleSelection(r0)
            int r0 = com.google.android.material.R$styleable.MaterialButtonToggleGroup_checkedButton
            r1 = -1
            int r0 = r8.getResourceId(r0, r1)
            r6.f3957A1 = r0
            int r0 = com.google.android.material.R$styleable.MaterialButtonToggleGroup_selectionRequired
            boolean r7 = r8.getBoolean(r0, r7)
            r6.f3966z1 = r7
            r7 = 1
            r6.setChildrenDrawingOrderEnabled(r7)
            int r0 = com.google.android.material.R$styleable.MaterialButtonToggleGroup_android_enabled
            boolean r0 = r8.getBoolean(r0, r7)
            r6.setEnabled(r0)
            r8.recycle()
            java.util.WeakHashMap<android.view.View, e0.h0> r8 = p034e0.C0946x.f4876a
            p034e0.C0946x.d.m2843s(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButtonToggleGroup.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            if (m2328d(i7)) {
                return i7;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (m2328d(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i7 = 0;
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            if ((getChildAt(i8) instanceof MaterialButton) && m2328d(i8)) {
                i7++;
            }
        }
        return i7;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            materialButton.setId(C0946x.e.m2844a());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f3960e);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    /* renamed from: a */
    public final void m2325a() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i7 = firstVisibleChildIndex + 1; i7 < getChildCount(); i7++) {
            MaterialButton m2327c = m2327c(i7);
            int min = Math.min(m2327c.getStrokeWidth(), m2327c(i7 - 1).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams = m2327c.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                C0920g.m2701g(layoutParams2, 0);
                C0920g.m2702h(layoutParams2, -min);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -min;
                C0920g.m2702h(layoutParams2, 0);
            }
            m2327c.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) m2327c(firstVisibleChildIndex).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            C0920g.m2701g(layoutParams3, 0);
            C0920g.m2702h(layoutParams3, 0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i7, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        m2326b(materialButton.getId(), materialButton.isChecked());
        C2240i shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f3959c.add(new C0765c(shapeAppearanceModel.f10190e, shapeAppearanceModel.f10193h, shapeAppearanceModel.f10191f, shapeAppearanceModel.f10192g));
        materialButton.setEnabled(isEnabled());
        C0946x.m2817r(materialButton, new C0764b());
    }

    /* renamed from: b */
    public final void m2326b(int i7, boolean z6) {
        if (i7 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i7);
            return;
        }
        HashSet hashSet = new HashSet(this.f3958B1);
        if (z6 && !hashSet.contains(Integer.valueOf(i7))) {
            if (this.f3965y1 && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i7));
        } else {
            if (z6 || !hashSet.contains(Integer.valueOf(i7))) {
                return;
            }
            if (!this.f3966z1 || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i7));
            }
        }
        m2329e(hashSet);
    }

    /* renamed from: c */
    public final MaterialButton m2327c(int i7) {
        return (MaterialButton) getChildAt(i7);
    }

    /* renamed from: d */
    public final boolean m2328d(int i7) {
        return getChildAt(i7).getVisibility() != 8;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f3962s);
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            treeMap.put(m2327c(i7), Integer.valueOf(i7));
        }
        this.f3963w1 = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    /* renamed from: e */
    public final void m2329e(Set<Integer> set) {
        HashSet hashSet = this.f3958B1;
        this.f3958B1 = new HashSet(set);
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            int id = m2327c(i7).getId();
            boolean contains = set.contains(Integer.valueOf(id));
            View findViewById = findViewById(id);
            if (findViewById instanceof MaterialButton) {
                this.f3964x1 = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.f3964x1 = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator<InterfaceC0766d> it = this.f3961m.iterator();
                while (it.hasNext()) {
                    it.next().mo2331a();
                }
            }
        }
        invalidate();
    }

    /* renamed from: f */
    public final void m2330f() {
        C0765c c0765c;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i7 = 0; i7 < childCount; i7++) {
            MaterialButton m2327c = m2327c(i7);
            if (m2327c.getVisibility() != 8) {
                C2240i shapeAppearanceModel = m2327c.getShapeAppearanceModel();
                shapeAppearanceModel.getClass();
                C2240i.a aVar = new C2240i.a(shapeAppearanceModel);
                C0765c c0765c2 = (C0765c) this.f3959c.get(i7);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z6 = getOrientation() == 0;
                    C2232a c2232a = C0765c.f3969e;
                    if (i7 == firstVisibleChildIndex) {
                        c0765c = z6 ? C1767w.m4239b(this) ? new C0765c(c2232a, c2232a, c0765c2.f3971b, c0765c2.f3972c) : new C0765c(c0765c2.f3970a, c0765c2.f3973d, c2232a, c2232a) : new C0765c(c0765c2.f3970a, c2232a, c0765c2.f3971b, c2232a);
                    } else if (i7 == lastVisibleChildIndex) {
                        c0765c = z6 ? C1767w.m4239b(this) ? new C0765c(c0765c2.f3970a, c0765c2.f3973d, c2232a, c2232a) : new C0765c(c2232a, c2232a, c0765c2.f3971b, c0765c2.f3972c) : new C0765c(c2232a, c0765c2.f3973d, c2232a, c0765c2.f3972c);
                    } else {
                        c0765c2 = null;
                    }
                    c0765c2 = c0765c;
                }
                if (c0765c2 == null) {
                    aVar.m5440e(0.0f);
                    aVar.m5441f(0.0f);
                    aVar.m5439d(0.0f);
                    aVar.m5438c(0.0f);
                } else {
                    aVar.f10202e = c0765c2.f3970a;
                    aVar.f10205h = c0765c2.f3973d;
                    aVar.f10203f = c0765c2.f3971b;
                    aVar.f10204g = c0765c2.f3972c;
                }
                m2327c.setShapeAppearanceModel(new C2240i(aVar));
            }
        }
    }

    public int getCheckedButtonId() {
        if (!this.f3965y1 || this.f3958B1.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f3958B1.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            int id = m2327c(i7).getId();
            if (this.f3958B1.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i7, int i8) {
        Integer[] numArr = this.f3963w1;
        if (numArr != null && i8 < numArr.length) {
            return numArr[i8].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i8;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i7 = this.f3957A1;
        if (i7 != -1) {
            m2329e(Collections.singleton(Integer.valueOf(i7)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, getVisibleButtonCount(), false, this.f3965y1 ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        m2330f();
        m2325a();
        super.onMeasure(i7, i8);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f3959c.remove(indexOfChild);
        }
        m2330f();
        m2325a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z6) {
        super.setEnabled(z6);
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            m2327c(i7).setEnabled(z6);
        }
    }

    public void setSelectionRequired(boolean z6) {
        this.f3966z1 = z6;
    }

    public void setSingleSelection(int i7) {
        setSingleSelection(getResources().getBoolean(i7));
    }

    public void setSingleSelection(boolean z6) {
        if (this.f3965y1 != z6) {
            this.f3965y1 = z6;
            m2329e(new HashSet());
        }
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            m2327c(i7).setA11yClassName((this.f3965y1 ? RadioButton.class : ToggleButton.class).getName());
        }
    }
}
