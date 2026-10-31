package p004a3;

import android.util.Property;
import android.view.ViewGroup;
import com.google.android.material.R$id;

/* renamed from: a3.c */
/* loaded from: classes.dex */
public final class C0036c extends Property<ViewGroup, Float> {

    /* renamed from: a */
    public static final C0036c f114a = new C0036c();

    public C0036c() {
        super(Float.class, "childrenAlpha");
    }

    @Override // android.util.Property
    public final Float get(ViewGroup viewGroup) {
        Float f7 = (Float) viewGroup.getTag(R$id.mtrl_internal_children_alpha_tag);
        return f7 != null ? f7 : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    public final void set(ViewGroup viewGroup, Float f7) {
        ViewGroup viewGroup2 = viewGroup;
        float floatValue = f7.floatValue();
        viewGroup2.setTag(R$id.mtrl_internal_children_alpha_tag, Float.valueOf(floatValue));
        int childCount = viewGroup2.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            viewGroup2.getChildAt(i7).setAlpha(floatValue);
        }
    }
}
