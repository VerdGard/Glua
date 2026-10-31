package p069i3;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.C0775a;
import com.google.android.material.chip.Chip;

/* renamed from: i3.b */
/* loaded from: classes.dex */
public final class C1333b extends ViewOutlineProvider {

    /* renamed from: a */
    public final /* synthetic */ Chip f6534a;

    public C1333b(Chip chip) {
        this.f6534a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    @TargetApi(21)
    public final void getOutline(View view, Outline outline) {
        C0775a c0775a = this.f6534a.f4033w1;
        if (c0775a != null) {
            c0775a.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
