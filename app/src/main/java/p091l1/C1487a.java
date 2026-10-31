package p091l1;

import android.content.Context;
import androidx.appcompat.widget.C0243l;

/* renamed from: l1.a */
/* loaded from: classes.dex */
public final class C1487a extends C0243l {

    /* renamed from: y1 */
    public final /* synthetic */ C1489c f7095y1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1487a(C1489c c1489c, Context context) {
        super(context, null);
        this.f7095y1 = c1489c;
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        if (charSequence.length() > 0) {
            C1489c c1489c = this.f7095y1;
            c1489c.getClass();
            c1489c.m3913e();
        }
    }
}
