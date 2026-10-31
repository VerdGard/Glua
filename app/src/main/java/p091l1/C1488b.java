package p091l1;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: l1.b */
/* loaded from: classes.dex */
public final class C1488b implements TextView.OnEditorActionListener {

    /* renamed from: a */
    public final /* synthetic */ C1489c f7096a;

    public C1488b(C1489c c1489c) {
        this.f7096a = c1489c;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        this.f7096a.m3913e();
        return true;
    }
}
