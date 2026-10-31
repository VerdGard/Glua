package p074j0;

import android.content.Context;
import android.view.LayoutInflater;

/* renamed from: j0.c */
/* loaded from: classes.dex */
public abstract class AbstractC1399c extends AbstractC1397a {

    /* renamed from: w1 */
    public final int f6744w1;

    /* renamed from: x1 */
    public final int f6745x1;

    /* renamed from: y1 */
    public final LayoutInflater f6746y1;

    @Deprecated
    public AbstractC1399c(Context context, int i7) {
        super(context);
        this.f6745x1 = i7;
        this.f6744w1 = i7;
        this.f6746y1 = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
