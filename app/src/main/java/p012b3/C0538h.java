package p012b3;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.view.View;
import com.google.android.material.R$attr;
import com.google.android.material.R$integer;

/* renamed from: b3.h */
/* loaded from: classes.dex */
public final class C0538h {

    /* renamed from: a */
    public static final int[] f2693a = {R.attr.stateListAnimator};

    /* renamed from: a */
    public static void m1852a(View view, float f7) {
        int integer = view.getResources().getInteger(R$integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j7 = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, R$attr.state_liftable, -R$attr.state_lifted}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j7));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(view, "elevation", f7).setDuration(j7));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }
}
