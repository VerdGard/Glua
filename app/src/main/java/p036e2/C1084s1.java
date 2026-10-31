package p036e2;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: e2.s1 */
/* loaded from: classes.dex */
public final class C1084s1 {
    /* renamed from: a */
    public static View m3176a(ViewGroup viewGroup) {
        Object tag;
        for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
            View childAt = viewGroup.getChildAt(i7);
            if (childAt != null && (tag = childAt.getTag(-5000)) != null && (tag instanceof String) && ((String) tag).equals("baidu_mtj_edit_txtview")) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static void m3177b(Activity activity, boolean z6) {
        ViewGroup viewGroup;
        View m3176a;
        try {
            viewGroup = (ViewGroup) C1086s3.m3190a(activity).findViewById(android.R.id.content);
        } catch (Exception unused) {
            viewGroup = null;
        }
        if (viewGroup == null || (m3176a = m3176a(viewGroup)) == null) {
            return;
        }
        m3176a.setVisibility(z6 ? 0 : 4);
    }
}
