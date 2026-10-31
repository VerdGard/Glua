package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$id;
import androidx.appcompat.R$layout;
import androidx.appcompat.R$styleable;
import androidx.appcompat.view.menu.InterfaceC0164k;
import androidx.appcompat.widget.C0233h1;
import java.util.WeakHashMap;
import p034e0.C0923h0;
import p034e0.C0946x;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC0164k.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: A1 */
    public LinearLayout f393A1;

    /* renamed from: B1 */
    public final Drawable f394B1;

    /* renamed from: C1 */
    public final int f395C1;

    /* renamed from: D1 */
    public final Context f396D1;

    /* renamed from: E1 */
    public boolean f397E1;

    /* renamed from: F1 */
    public final Drawable f398F1;

    /* renamed from: G1 */
    public final boolean f399G1;

    /* renamed from: H1 */
    public LayoutInflater f400H1;

    /* renamed from: I1 */
    public boolean f401I1;

    /* renamed from: c */
    public C0161h f402c;

    /* renamed from: e */
    public ImageView f403e;

    /* renamed from: m */
    public RadioButton f404m;

    /* renamed from: s */
    public TextView f405s;

    /* renamed from: w1 */
    public CheckBox f406w1;

    /* renamed from: x1 */
    public TextView f407x1;

    /* renamed from: y1 */
    public ImageView f408y1;

    /* renamed from: z1 */
    public ImageView f409z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i7 = R$attr.listMenuViewStyle;
        C0233h1 m790m = C0233h1.m790m(getContext(), attributeSet, R$styleable.f291s, i7);
        this.f394B1 = m790m.m795e(R$styleable.MenuView_android_itemBackground);
        this.f395C1 = m790m.m799i(R$styleable.MenuView_android_itemTextAppearance, -1);
        this.f397E1 = m790m.m791a(R$styleable.MenuView_preserveIconSpacing, false);
        this.f396D1 = context;
        this.f398F1 = m790m.m795e(R$styleable.MenuView_subMenuArrow);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, R$attr.dropDownListViewStyle, 0);
        this.f399G1 = obtainStyledAttributes.hasValue(0);
        m790m.m803n();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f400H1 == null) {
            this.f400H1 = LayoutInflater.from(getContext());
        }
        return this.f400H1;
    }

    private void setSubMenuArrowVisible(boolean z6) {
        ImageView imageView = this.f408y1;
        if (imageView != null) {
            imageView.setVisibility(z6 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f409z1;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f409z1.getLayoutParams();
        rect.top = this.f409z1.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0109  */
    @Override // androidx.appcompat.view.menu.InterfaceC0164k.a
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo489c(androidx.appcompat.view.menu.C0161h r11) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.mo489c(androidx.appcompat.view.menu.h):void");
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0164k.a
    public C0161h getItemData() {
        return this.f402c;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        C0946x.d.m2841q(this, this.f394B1);
        TextView textView = (TextView) findViewById(R$id.title);
        this.f405s = textView;
        int i7 = this.f395C1;
        if (i7 != -1) {
            textView.setTextAppearance(this.f396D1, i7);
        }
        this.f407x1 = (TextView) findViewById(R$id.shortcut);
        ImageView imageView = (ImageView) findViewById(R$id.submenuarrow);
        this.f408y1 = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f398F1);
        }
        this.f409z1 = (ImageView) findViewById(R$id.group_divider);
        this.f393A1 = (LinearLayout) findViewById(R$id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        if (this.f403e != null && this.f397E1) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f403e.getLayoutParams();
            int i9 = layoutParams.height;
            if (i9 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i9;
            }
        }
        super.onMeasure(i7, i8);
    }

    public void setCheckable(boolean z6) {
        CompoundButton compoundButton;
        View view;
        if (!z6 && this.f404m == null && this.f406w1 == null) {
            return;
        }
        if ((this.f402c.f525x & 4) != 0) {
            if (this.f404m == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R$layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f404m = radioButton;
                LinearLayout linearLayout = this.f393A1;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f404m;
            view = this.f406w1;
        } else {
            if (this.f406w1 == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R$layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f406w1 = checkBox;
                LinearLayout linearLayout2 = this.f393A1;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f406w1;
            view = this.f404m;
        }
        if (z6) {
            compoundButton.setChecked(this.f402c.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f406w1;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f404m;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z6) {
        CompoundButton compoundButton;
        if ((this.f402c.f525x & 4) != 0) {
            if (this.f404m == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R$layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f404m = radioButton;
                LinearLayout linearLayout = this.f393A1;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f404m;
        } else {
            if (this.f406w1 == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R$layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f406w1 = checkBox;
                LinearLayout linearLayout2 = this.f393A1;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f406w1;
        }
        compoundButton.setChecked(z6);
    }

    public void setForceShowIcon(boolean z6) {
        this.f401I1 = z6;
        this.f397E1 = z6;
    }

    public void setGroupDividerEnabled(boolean z6) {
        ImageView imageView = this.f409z1;
        if (imageView != null) {
            imageView.setVisibility((this.f399G1 || !z6) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f402c.f515n.getClass();
        boolean z6 = this.f401I1;
        if (z6 || this.f397E1) {
            ImageView imageView = this.f403e;
            if (imageView == null && drawable == null && !this.f397E1) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R$layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f403e = imageView2;
                LinearLayout linearLayout = this.f393A1;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f397E1) {
                this.f403e.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f403e;
            if (!z6) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f403e.getVisibility() != 0) {
                this.f403e.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        int i7;
        TextView textView;
        if (charSequence != null) {
            this.f405s.setText(charSequence);
            if (this.f405s.getVisibility() == 0) {
                return;
            }
            textView = this.f405s;
            i7 = 0;
        } else {
            i7 = 8;
            if (this.f405s.getVisibility() == 8) {
                return;
            } else {
                textView = this.f405s;
            }
        }
        textView.setVisibility(i7);
    }
}
