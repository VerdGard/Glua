package p003a2;

import android.view.View;
import androidx.lifecycle.C0391d0;
import java.io.File;
import p129q1.C1732h;

/* renamed from: a2.b */
/* loaded from: classes.dex */
public final class ViewOnLongClickListenerC0031b implements View.OnLongClickListener {

    /* renamed from: c */
    public final /* synthetic */ File f97c;

    /* renamed from: e */
    public final /* synthetic */ C1732h f98e;

    public ViewOnLongClickListenerC0031b(File file, C1732h c1732h) {
        this.f97c = file;
        this.f98e = c1732h;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C0391d0.m1370q("Path:" + this.f97c.getPath() + ", Encoding " + this.f98e.f7936s, true);
        return true;
    }
}
