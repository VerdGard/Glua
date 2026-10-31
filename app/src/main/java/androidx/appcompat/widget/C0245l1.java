package androidx.appcompat.widget;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* renamed from: androidx.appcompat.widget.l1 */
/* loaded from: classes.dex */
public final class C0245l1 {

    /* renamed from: androidx.appcompat.widget.l1$a */
    public static class a {
        /* renamed from: a */
        public static void m846a(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* renamed from: a */
    public static void m845a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            a.m846a(view, charSequence);
            return;
        }
        ViewOnLongClickListenerC0248m1 viewOnLongClickListenerC0248m1 = ViewOnLongClickListenerC0248m1.f993z1;
        if (viewOnLongClickListenerC0248m1 != null && viewOnLongClickListenerC0248m1.f997c == view) {
            ViewOnLongClickListenerC0248m1.m860b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new ViewOnLongClickListenerC0248m1(view, charSequence);
            return;
        }
        ViewOnLongClickListenerC0248m1 viewOnLongClickListenerC0248m12 = ViewOnLongClickListenerC0248m1.f992A1;
        if (viewOnLongClickListenerC0248m12 != null && viewOnLongClickListenerC0248m12.f997c == view) {
            viewOnLongClickListenerC0248m12.m861a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }
}
