package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$color;
import androidx.appcompat.R$drawable;
import androidx.appcompat.widget.C0274x0;
import p166v.C2009a;
import p181x.C2152a;

/* renamed from: androidx.appcompat.widget.k */
/* loaded from: classes.dex */
public final class C0240k {

    /* renamed from: b */
    public static final PorterDuff.Mode f937b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    public static C0240k f938c;

    /* renamed from: a */
    public C0274x0 f939a;

    /* renamed from: androidx.appcompat.widget.k$a */
    public class a implements C0274x0.f {

        /* renamed from: a */
        public final int[] f940a = {R$drawable.abc_textfield_search_default_mtrl_alpha, R$drawable.abc_textfield_default_mtrl_alpha, R$drawable.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b */
        public final int[] f941b = {R$drawable.abc_ic_commit_search_api_mtrl_alpha, R$drawable.abc_seekbar_tick_mark_material, R$drawable.abc_ic_menu_share_mtrl_alpha, R$drawable.abc_ic_menu_copy_mtrl_am_alpha, R$drawable.abc_ic_menu_cut_mtrl_alpha, R$drawable.abc_ic_menu_selectall_mtrl_alpha, R$drawable.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c */
        public final int[] f942c = {R$drawable.abc_textfield_activated_mtrl_alpha, R$drawable.abc_textfield_search_activated_mtrl_alpha, R$drawable.abc_cab_background_top_mtrl_alpha, R$drawable.abc_text_cursor_material, R$drawable.abc_text_select_handle_left_mtrl, R$drawable.abc_text_select_handle_middle_mtrl, R$drawable.abc_text_select_handle_right_mtrl};

        /* renamed from: d */
        public final int[] f943d = {R$drawable.abc_popup_background_mtrl_mult, R$drawable.abc_cab_background_internal_bg, R$drawable.abc_menu_hardkey_panel_mtrl_mult};

        /* renamed from: e */
        public final int[] f944e = {R$drawable.abc_tab_indicator_material, R$drawable.abc_textfield_search_material};

        /* renamed from: f */
        public final int[] f945f = {R$drawable.abc_btn_check_material, R$drawable.abc_btn_radio_material, R$drawable.abc_btn_check_material_anim, R$drawable.abc_btn_radio_material_anim};

        /* renamed from: a */
        public static boolean m812a(int i7, int[] iArr) {
            for (int i8 : iArr) {
                if (i8 == i7) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public static ColorStateList m813b(int i7, Context context) {
            int m704c = C0218c1.m704c(R$attr.colorControlHighlight, context);
            return new ColorStateList(new int[][]{C0218c1.f849b, C0218c1.f851d, C0218c1.f850c, C0218c1.f853f}, new int[]{C0218c1.m703b(R$attr.colorButtonNormal, context), C2152a.m5264c(m704c, i7), C2152a.m5264c(m704c, i7), i7});
        }

        /* renamed from: d */
        public static void m814d(Drawable drawable, int i7, PorterDuff.Mode mode) {
            int[] iArr = C0244l0.f969a;
            Drawable mutate = drawable.mutate();
            if (mode == null) {
                mode = C0240k.f937b;
            }
            mutate.setColorFilter(C0240k.m808c(i7, mode));
        }

        /* renamed from: c */
        public final ColorStateList m815c(int i7, Context context) {
            if (i7 == R$drawable.abc_edit_text_material) {
                return C2009a.m4896c(R$color.abc_tint_edittext, context);
            }
            if (i7 == R$drawable.abc_switch_track_mtrl_alpha) {
                return C2009a.m4896c(R$color.abc_tint_switch_track, context);
            }
            if (i7 != R$drawable.abc_switch_thumb_material) {
                if (i7 == R$drawable.abc_btn_default_mtrl_shape) {
                    return m813b(C0218c1.m704c(R$attr.colorButtonNormal, context), context);
                }
                if (i7 == R$drawable.abc_btn_borderless_material) {
                    return m813b(0, context);
                }
                if (i7 == R$drawable.abc_btn_colored_material) {
                    return m813b(C0218c1.m704c(R$attr.colorAccent, context), context);
                }
                if (i7 == R$drawable.abc_spinner_mtrl_am_alpha || i7 == R$drawable.abc_spinner_textfield_background_material) {
                    return C2009a.m4896c(R$color.abc_tint_spinner, context);
                }
                if (m812a(i7, this.f941b)) {
                    return C0218c1.m705d(R$attr.colorControlNormal, context);
                }
                if (m812a(i7, this.f944e)) {
                    return C2009a.m4896c(R$color.abc_tint_default, context);
                }
                if (m812a(i7, this.f945f)) {
                    return C2009a.m4896c(R$color.abc_tint_btn_checkable, context);
                }
                if (i7 == R$drawable.abc_seekbar_thumb_material) {
                    return C2009a.m4896c(R$color.abc_tint_seek_thumb, context);
                }
                return null;
            }
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            int i8 = R$attr.colorSwitchThumbNormal;
            ColorStateList m705d = C0218c1.m705d(i8, context);
            if (m705d == null || !m705d.isStateful()) {
                iArr[0] = C0218c1.f849b;
                iArr2[0] = C0218c1.m703b(i8, context);
                iArr[1] = C0218c1.f852e;
                iArr2[1] = C0218c1.m704c(R$attr.colorControlActivated, context);
                iArr[2] = C0218c1.f853f;
                iArr2[2] = C0218c1.m704c(i8, context);
            } else {
                int[] iArr3 = C0218c1.f849b;
                iArr[0] = iArr3;
                iArr2[0] = m705d.getColorForState(iArr3, 0);
                iArr[1] = C0218c1.f852e;
                iArr2[1] = C0218c1.m704c(R$attr.colorControlActivated, context);
                iArr[2] = C0218c1.f853f;
                iArr2[2] = m705d.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }
    }

    /* renamed from: a */
    public static synchronized C0240k m807a() {
        C0240k c0240k;
        synchronized (C0240k.class) {
            if (f938c == null) {
                m809d();
            }
            c0240k = f938c;
        }
        return c0240k;
    }

    /* renamed from: c */
    public static synchronized PorterDuffColorFilter m808c(int i7, PorterDuff.Mode mode) {
        PorterDuffColorFilter m897h;
        synchronized (C0240k.class) {
            m897h = C0274x0.m897h(i7, mode);
        }
        return m897h;
    }

    /* renamed from: d */
    public static synchronized void m809d() {
        synchronized (C0240k.class) {
            if (f938c == null) {
                C0240k c0240k = new C0240k();
                f938c = c0240k;
                c0240k.f939a = C0274x0.m896d();
                f938c.f939a.m907l(new a());
            }
        }
    }

    /* renamed from: e */
    public static void m810e(Drawable drawable, C0227f1 c0227f1, int[] iArr) {
        PorterDuff.Mode mode = C0274x0.f1113h;
        int[] state = drawable.getState();
        int[] iArr2 = C0244l0.f969a;
        if (!(drawable.mutate() == drawable)) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z6 = c0227f1.f892d;
        if (z6 || c0227f1.f891c) {
            PorterDuffColorFilter porterDuffColorFilter = null;
            ColorStateList colorStateList = z6 ? c0227f1.f889a : null;
            PorterDuff.Mode mode2 = c0227f1.f891c ? c0227f1.f890b : C0274x0.f1113h;
            if (colorStateList != null && mode2 != null) {
                porterDuffColorFilter = C0274x0.m897h(colorStateList.getColorForState(iArr, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilter);
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    /* renamed from: b */
    public final synchronized Drawable m811b(Context context, int i7) {
        return this.f939a.m904g(context, i7);
    }
}
