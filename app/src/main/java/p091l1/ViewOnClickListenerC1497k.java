package p091l1;

import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import com.so.revelation.lua.EditorActivity;
import com.so.revelation.lua.RunnableC0721b;

/* renamed from: l1.k */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1497k implements View.OnClickListener {

    /* renamed from: c */
    public final /* synthetic */ EditorActivity f7108c;

    public ViewOnClickListenerC1497k(EditorActivity editorActivity) {
        this.f7108c = editorActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        EditorActivity editorActivity = this.f7108c;
        View m1039f = editorActivity.f3292R1.m1039f(8388611);
        if (m1039f != null ? DrawerLayout.m1031o(m1039f) : false) {
            editorActivity.f3292R1.m1037d();
            return;
        }
        editorActivity.f3292R1.m1047t();
        if (editorActivity.f3291Q1.m120e() != 0) {
            new Thread(new RunnableC0721b(editorActivity)).start();
        }
    }
}
