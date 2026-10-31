package com.so.revelation.lua.View.ColorPicker;

import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.app.DialogInterfaceC0151d;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0359m;
import androidx.lifecycle.InterfaceC0392e;
import com.so.revelation.lua.MainActivity;
import com.so.revelation.lua.R;
import com.so.revelation.lua.View.ColorPicker.C0697a;
import com.so.revelation.lua.View.ColorPicker.ColorPickerView;
import java.util.Arrays;
import java.util.Locale;
import p107n1.C1637b;
import p107n1.InterfaceC1638c;
import p181x.C2152a;

/* renamed from: com.so.revelation.lua.View.ColorPicker.d */
/* loaded from: classes.dex */
public class C0700d extends DialogInterfaceOnCancelListenerC0359m implements ColorPickerView.InterfaceC0696b, TextWatcher {

    /* renamed from: P2 */
    public static final int[] f3457P2 = {-769226, -1499549, -54125, -6543440, -10011977, -12627531, -14575885, -16537100, -16728876, -16738680, -11751600, -7617718, -3285959, -5317, -16121, -26624, -8825528, -10453621, -6381922};

    /* renamed from: Q2 */
    public static j f3458Q2;

    /* renamed from: A2 */
    public int f3459A2;

    /* renamed from: B2 */
    public boolean f3460B2;

    /* renamed from: C2 */
    public int f3461C2;

    /* renamed from: D2 */
    public C0697a f3462D2;

    /* renamed from: E2 */
    public LinearLayout f3463E2;

    /* renamed from: F2 */
    public SeekBar f3464F2;

    /* renamed from: G2 */
    public TextView f3465G2;

    /* renamed from: H2 */
    public ColorPickerView f3466H2;

    /* renamed from: I2 */
    public ColorPanelView f3467I2;

    /* renamed from: J2 */
    public EditText f3468J2;

    /* renamed from: K2 */
    public boolean f3469K2;

    /* renamed from: L2 */
    public int f3470L2;

    /* renamed from: M2 */
    public boolean f3471M2;

    /* renamed from: N2 */
    public int f3472N2;

    /* renamed from: O2 */
    public final a f3473O2 = new a();

    /* renamed from: x2 */
    public FrameLayout f3474x2;

    /* renamed from: y2 */
    public int[] f3475y2;

    /* renamed from: z2 */
    public int f3476z2;

    /* renamed from: com.so.revelation.lua.View.ColorPicker.d$a */
    public class a implements View.OnTouchListener {
        public a() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C0700d c0700d = C0700d.this;
            EditText editText = c0700d.f3468J2;
            if (view == editText || !editText.hasFocus()) {
                return false;
            }
            c0700d.f3468J2.clearFocus();
            ((InputMethodManager) c0700d.m1235f().getSystemService("input_method")).hideSoftInputFromWindow(c0700d.f3468J2.getWindowToken(), 0);
            c0700d.f3468J2.clearFocus();
            return true;
        }
    }

    /* renamed from: com.so.revelation.lua.View.ColorPicker.d$b */
    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i7) {
            ((MainActivity.C0694d) C0700d.f3458Q2).m2198a(C0700d.this.f3476z2);
        }
    }

    /* renamed from: com.so.revelation.lua.View.ColorPicker.d$c */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            FrameLayout frameLayout;
            View m2207T;
            C0700d c0700d = C0700d.this;
            c0700d.f3474x2.removeAllViews();
            int i7 = c0700d.f3459A2;
            if (i7 == 0) {
                c0700d.f3459A2 = 1;
                Button button = (Button) view;
                int i8 = c0700d.f3472N2;
                if (i8 == 0) {
                    i8 = R.string.cpv_custom;
                }
                button.setText(i8);
                frameLayout = c0700d.f3474x2;
                m2207T = c0700d.m2207T();
            } else {
                if (i7 != 1) {
                    return;
                }
                c0700d.f3459A2 = 0;
                Button button2 = (Button) view;
                int i9 = c0700d.f3470L2;
                if (i9 == 0) {
                    i9 = R.string.cpv_presets;
                }
                button2.setText(i9);
                frameLayout = c0700d.f3474x2;
                m2207T = c0700d.m2206S();
            }
            frameLayout.addView(m2207T);
        }
    }

    /* renamed from: com.so.revelation.lua.View.ColorPicker.d$d */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C0700d c0700d = C0700d.this;
            int color = c0700d.f3467I2.getColor();
            int i7 = c0700d.f3476z2;
            if (color == i7) {
                ((MainActivity.C0694d) C0700d.f3458Q2).m2198a(i7);
                c0700d.m1210O(false, false);
            }
        }
    }

    /* renamed from: com.so.revelation.lua.View.ColorPicker.d$e */
    public class e implements View.OnFocusChangeListener {
        public e() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view, boolean z6) {
            if (z6) {
                C0700d c0700d = C0700d.this;
                ((InputMethodManager) c0700d.m1235f().getSystemService("input_method")).showSoftInput(c0700d.f3468J2, 1);
            }
        }
    }

    /* renamed from: com.so.revelation.lua.View.ColorPicker.d$f */
    public class f implements C0697a.a {
        public f() {
        }
    }

    /* renamed from: com.so.revelation.lua.View.ColorPicker.d$g */
    public class g implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ ColorPanelView f3483c;

        /* renamed from: e */
        public final /* synthetic */ int f3484e;

        public g(ColorPanelView colorPanelView, int i7) {
            this.f3483c = colorPanelView;
            this.f3484e = i7;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f3483c.setColor(this.f3484e);
        }
    }

    /* renamed from: com.so.revelation.lua.View.ColorPicker.d$h */
    public class h implements View.OnClickListener {

        /* renamed from: c */
        public final /* synthetic */ ColorPanelView f3485c;

        public h(ColorPanelView colorPanelView) {
            this.f3485c = colorPanelView;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            boolean z6 = view.getTag() instanceof Boolean;
            C0700d c0700d = C0700d.this;
            if (z6 && ((Boolean) view.getTag()).booleanValue()) {
                ((MainActivity.C0694d) C0700d.f3458Q2).m2198a(c0700d.f3476z2);
                c0700d.m1210O(false, false);
                return;
            }
            c0700d.f3476z2 = this.f3485c.getColor();
            C0697a c0697a = c0700d.f3462D2;
            c0697a.f3447m = -1;
            c0697a.notifyDataSetChanged();
            for (int i7 = 0; i7 < c0700d.f3463E2.getChildCount(); i7++) {
                FrameLayout frameLayout = (FrameLayout) c0700d.f3463E2.getChildAt(i7);
                ColorPanelView colorPanelView = (ColorPanelView) frameLayout.findViewById(R.id.cpv_color_panel_view);
                ImageView imageView = (ImageView) frameLayout.findViewById(R.id.cpv_color_image_view);
                imageView.setImageResource(colorPanelView == view ? R.drawable.cpv_preset_checked : 0);
                if ((colorPanelView != view || C2152a.m5263b(colorPanelView.getColor()) < 0.65d) && Color.alpha(colorPanelView.getColor()) > 165) {
                    imageView.setColorFilter((ColorFilter) null);
                } else {
                    imageView.setColorFilter(-16777216, PorterDuff.Mode.SRC_IN);
                }
                colorPanelView.setTag(Boolean.valueOf(colorPanelView == view));
            }
        }
    }

    /* renamed from: com.so.revelation.lua.View.ColorPicker.d$i */
    public class i implements View.OnLongClickListener {

        /* renamed from: c */
        public final /* synthetic */ ColorPanelView f3487c;

        public i(ColorPanelView colorPanelView) {
            this.f3487c = colorPanelView;
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            this.f3487c.m2199a();
            return true;
        }
    }

    /* renamed from: com.so.revelation.lua.View.ColorPicker.d$j */
    public interface j {
    }

    /* renamed from: V */
    public static int m2202V(String str) {
        int i7;
        int i8;
        String substring;
        if (str.startsWith("#")) {
            str = str.substring(1);
        }
        int i9 = 255;
        int i10 = 0;
        if (str.length() == 0) {
            i7 = 0;
        } else {
            if (str.length() > 2) {
                if (str.length() == 3) {
                    i10 = Integer.parseInt(str.substring(0, 1), 16);
                    i8 = Integer.parseInt(str.substring(1, 2), 16);
                    substring = str.substring(2, 3);
                } else if (str.length() == 4) {
                    i8 = Integer.parseInt(str.substring(0, 2), 16);
                    substring = str.substring(2, 4);
                } else if (str.length() == 5) {
                    i10 = Integer.parseInt(str.substring(0, 1), 16);
                    i8 = Integer.parseInt(str.substring(1, 3), 16);
                    substring = str.substring(3, 5);
                } else {
                    if (str.length() != 6) {
                        if (str.length() == 7) {
                            int parseInt = Integer.parseInt(str.substring(0, 1), 16);
                            i10 = Integer.parseInt(str.substring(1, 3), 16);
                            int parseInt2 = Integer.parseInt(str.substring(3, 5), 16);
                            i7 = Integer.parseInt(str.substring(5, 7), 16);
                            i9 = parseInt;
                            i8 = parseInt2;
                        } else if (str.length() == 8) {
                            i9 = Integer.parseInt(str.substring(0, 2), 16);
                            i10 = Integer.parseInt(str.substring(2, 4), 16);
                            i8 = Integer.parseInt(str.substring(4, 6), 16);
                            substring = str.substring(6, 8);
                        } else {
                            i9 = -1;
                            i7 = -1;
                            i8 = -1;
                            i10 = -1;
                        }
                        return Color.argb(i9, i10, i8, i7);
                    }
                    i10 = Integer.parseInt(str.substring(0, 2), 16);
                    i8 = Integer.parseInt(str.substring(2, 4), 16);
                    substring = str.substring(4, 6);
                }
                i7 = Integer.parseInt(substring, 16);
                return Color.argb(i9, i10, i8, i7);
            }
            i7 = Integer.parseInt(str, 16);
        }
        i8 = 0;
        return Color.argb(i9, i10, i8, i7);
    }

    /* renamed from: X */
    public static int m2203X(int i7, double d7) {
        long parseLong = Long.parseLong(String.format("#%06X", Integer.valueOf(16777215 & i7)).substring(1), 16);
        double d8 = d7 >= 0.0d ? 255.0d : 0.0d;
        if (d7 < 0.0d) {
            d7 *= -1.0d;
        }
        long j7 = parseLong >> 16;
        long j8 = (parseLong >> 8) & 255;
        long j9 = parseLong & 255;
        return Color.argb(Color.alpha(i7), (int) (Math.round((d8 - j7) * d7) + j7), (int) (Math.round((d8 - j8) * d7) + j8), (int) (Math.round((d8 - j9) * d7) + j9));
    }

    /* renamed from: Y */
    public static int[] m2204Y(int i7, int[] iArr) {
        boolean z6;
        int length = iArr.length;
        int i8 = 0;
        while (true) {
            if (i8 >= length) {
                z6 = false;
                break;
            }
            if (iArr[i8] == i7) {
                z6 = true;
                break;
            }
            i8++;
        }
        if (z6) {
            return iArr;
        }
        int length2 = iArr.length + 1;
        int[] iArr2 = new int[length2];
        iArr2[0] = i7;
        System.arraycopy(iArr, 0, iArr2, 1, length2 - 1);
        return iArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e2  */
    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0359m
    /* renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.app.Dialog mo1211P(android.os.Bundle r6) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.so.revelation.lua.View.ColorPicker.C0700d.mo1211P(android.os.Bundle):android.app.Dialog");
    }

    /* renamed from: R */
    public final void m2205R(int i7) {
        int i8 = 0;
        int[] iArr = {m2203X(i7, 0.9d), m2203X(i7, 0.7d), m2203X(i7, 0.5d), m2203X(i7, 0.333d), m2203X(i7, 0.166d), m2203X(i7, -0.125d), m2203X(i7, -0.25d), m2203X(i7, -0.375d), m2203X(i7, -0.5d), m2203X(i7, -0.675d), m2203X(i7, -0.7d), m2203X(i7, -0.775d)};
        if (this.f3463E2.getChildCount() != 0) {
            while (i8 < this.f3463E2.getChildCount()) {
                FrameLayout frameLayout = (FrameLayout) this.f3463E2.getChildAt(i8);
                ColorPanelView colorPanelView = (ColorPanelView) frameLayout.findViewById(R.id.cpv_color_panel_view);
                ImageView imageView = (ImageView) frameLayout.findViewById(R.id.cpv_color_image_view);
                colorPanelView.setColor(iArr[i8]);
                colorPanelView.setTag(Boolean.FALSE);
                imageView.setImageDrawable(null);
                i8++;
            }
            return;
        }
        int dimensionPixelSize = m1228I().getResources().getDimensionPixelSize(R.dimen.cpv_item_horizontal_padding);
        while (i8 < 12) {
            int i9 = iArr[i8];
            View inflate = View.inflate(m1235f(), this.f3461C2 == 0 ? R.layout.cpv_color_item_square : R.layout.cpv_color_item_circle, null);
            ColorPanelView colorPanelView2 = (ColorPanelView) inflate.findViewById(R.id.cpv_color_panel_view);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) colorPanelView2.getLayoutParams();
            marginLayoutParams.rightMargin = dimensionPixelSize;
            marginLayoutParams.leftMargin = dimensionPixelSize;
            colorPanelView2.setLayoutParams(marginLayoutParams);
            colorPanelView2.setColor(i9);
            this.f3463E2.addView(inflate);
            colorPanelView2.post(new g(colorPanelView2, i9));
            colorPanelView2.setOnClickListener(new h(colorPanelView2));
            colorPanelView2.setOnLongClickListener(new i(colorPanelView2));
            i8++;
        }
    }

    /* renamed from: S */
    public final View m2206S() {
        View inflate = View.inflate(m1235f(), R.layout.cpv_dialog_color_picker, null);
        this.f3466H2 = (ColorPickerView) inflate.findViewById(R.id.cpv_color_picker_view);
        ColorPanelView colorPanelView = (ColorPanelView) inflate.findViewById(R.id.cpv_color_panel_old);
        this.f3467I2 = (ColorPanelView) inflate.findViewById(R.id.cpv_color_panel_new);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.cpv_arrow_right);
        this.f3468J2 = (EditText) inflate.findViewById(R.id.cpv_hex);
        try {
            TypedArray obtainStyledAttributes = m1235f().obtainStyledAttributes(new TypedValue().data, new int[]{android.R.attr.textColorPrimary});
            int color = obtainStyledAttributes.getColor(0, -16777216);
            obtainStyledAttributes.recycle();
            imageView.setColorFilter(color);
        } catch (Exception unused) {
        }
        this.f3466H2.setAlphaSliderVisible(this.f3469K2);
        colorPanelView.setColor(this.f1800Z.getInt("color"));
        this.f3466H2.m2201b(this.f3476z2, true);
        this.f3467I2.setColor(this.f3476z2);
        m2209W(this.f3476z2);
        if (!this.f3469K2) {
            this.f3468J2.setFilters(new InputFilter[]{new InputFilter.LengthFilter(6)});
        }
        this.f3467I2.setOnClickListener(new d());
        inflate.setOnTouchListener(this.f3473O2);
        this.f3466H2.setOnColorChangedListener(this);
        this.f3468J2.addTextChangedListener(this);
        this.f3468J2.setOnFocusChangeListener(new e());
        return inflate;
    }

    /* renamed from: T */
    public final View m2207T() {
        boolean z6;
        View inflate = View.inflate(m1235f(), R.layout.cpv_dialog_presets, null);
        this.f3463E2 = (LinearLayout) inflate.findViewById(R.id.shades_layout);
        this.f3464F2 = (SeekBar) inflate.findViewById(R.id.transparency_seekbar);
        this.f3465G2 = (TextView) inflate.findViewById(R.id.transparency_text);
        GridView gridView = (GridView) inflate.findViewById(R.id.gridView);
        int alpha = Color.alpha(this.f3476z2);
        int[] intArray = this.f1800Z.getIntArray("presets");
        this.f3475y2 = intArray;
        int[] iArr = f3457P2;
        if (intArray == null) {
            this.f3475y2 = iArr;
        }
        int[] iArr2 = this.f3475y2;
        boolean z7 = iArr2 == iArr;
        this.f3475y2 = Arrays.copyOf(iArr2, iArr2.length);
        if (alpha != 255) {
            int i7 = 0;
            while (true) {
                int[] iArr3 = this.f3475y2;
                if (i7 >= iArr3.length) {
                    break;
                }
                int i8 = iArr3[i7];
                this.f3475y2[i7] = Color.argb(alpha, Color.red(i8), Color.green(i8), Color.blue(i8));
                i7++;
            }
        }
        this.f3475y2 = m2204Y(this.f3476z2, this.f3475y2);
        int i9 = this.f1800Z.getInt("color");
        if (i9 != this.f3476z2) {
            this.f3475y2 = m2204Y(i9, this.f3475y2);
        }
        if (z7) {
            int[] iArr4 = this.f3475y2;
            if (iArr4.length == 19) {
                int argb = Color.argb(alpha, 0, 0, 0);
                int length = iArr4.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        z6 = false;
                        break;
                    }
                    if (iArr4[i10] == argb) {
                        z6 = true;
                        break;
                    }
                    i10++;
                }
                if (!z6) {
                    int length2 = iArr4.length + 1;
                    int[] iArr5 = new int[length2];
                    int i11 = length2 - 1;
                    iArr5[i11] = argb;
                    System.arraycopy(iArr4, 0, iArr5, 0, i11);
                    iArr4 = iArr5;
                }
                this.f3475y2 = iArr4;
            }
        }
        if (this.f3460B2) {
            m2205R(this.f3476z2);
        } else {
            this.f3463E2.setVisibility(8);
            inflate.findViewById(R.id.shades_divider).setVisibility(8);
        }
        f fVar = new f();
        int[] iArr6 = this.f3475y2;
        int i12 = 0;
        while (true) {
            int[] iArr7 = this.f3475y2;
            if (i12 >= iArr7.length) {
                i12 = -1;
                break;
            }
            if (iArr7[i12] == this.f3476z2) {
                break;
            }
            i12++;
        }
        C0697a c0697a = new C0697a(fVar, iArr6, i12, this.f3461C2);
        this.f3462D2 = c0697a;
        gridView.setAdapter((ListAdapter) c0697a);
        if (this.f3469K2) {
            int alpha2 = 255 - Color.alpha(this.f3476z2);
            this.f3464F2.setMax(255);
            this.f3464F2.setProgress(alpha2);
            this.f3465G2.setText(String.format(Locale.ENGLISH, "%d%%", Integer.valueOf((int) ((alpha2 * 100.0d) / 255.0d))));
            this.f3464F2.setOnSeekBarChangeListener(new C1637b(this));
        } else {
            inflate.findViewById(R.id.transparency_layout).setVisibility(8);
            inflate.findViewById(R.id.transparency_title).setVisibility(8);
        }
        return inflate;
    }

    /* renamed from: U */
    public final void m2208U(int i7) {
        this.f3476z2 = i7;
        ColorPanelView colorPanelView = this.f3467I2;
        if (colorPanelView != null) {
            colorPanelView.setColor(i7);
        }
        if (!this.f3471M2 && this.f3468J2 != null) {
            m2209W(i7);
            if (this.f3468J2.hasFocus()) {
                ((InputMethodManager) m1235f().getSystemService("input_method")).hideSoftInputFromWindow(this.f3468J2.getWindowToken(), 0);
                this.f3468J2.clearFocus();
            }
        }
        this.f3471M2 = false;
    }

    /* renamed from: W */
    public final void m2209W(int i7) {
        EditText editText;
        String format;
        if (this.f3469K2) {
            editText = this.f3468J2;
            format = String.format("%08X", Integer.valueOf(i7));
        } else {
            editText = this.f3468J2;
            format = String.format("%06X", Integer.valueOf(i7 & 16777215));
        }
        editText.setText(format);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int m2202V;
        if (!this.f3468J2.isFocused() || (m2202V = m2202V(editable.toString())) == this.f3466H2.getColor()) {
            return;
        }
        this.f3471M2 = true;
        this.f3466H2.m2201b(m2202V, true);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0359m, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        InterfaceC0392e m1235f = m1235f();
        if (m1235f instanceof InterfaceC1638c) {
            ((InterfaceC1638c) m1235f).m4006a();
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0359m, androidx.fragment.app.ComponentCallbacksC0361n
    /* renamed from: y */
    public final void mo1219y(Bundle bundle) {
        bundle.putInt("color", this.f3476z2);
        bundle.putInt("dialogType", this.f3459A2);
        super.mo1219y(bundle);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0359m, androidx.fragment.app.ComponentCallbacksC0361n
    /* renamed from: z */
    public final void mo1220z() {
        super.mo1220z();
        DialogInterfaceC0151d dialogInterfaceC0151d = (DialogInterfaceC0151d) this.f1758s2;
        dialogInterfaceC0151d.getWindow().clearFlags(131080);
        dialogInterfaceC0151d.getWindow().setSoftInputMode(4);
        Button m483h = dialogInterfaceC0151d.m483h(-3);
        if (m483h != null) {
            m483h.setOnClickListener(new c());
        }
    }
}
