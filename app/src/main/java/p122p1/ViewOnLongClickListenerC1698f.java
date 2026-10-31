package p122p1;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.View;
import androidx.lifecycle.C0391d0;

/* renamed from: p1.f */
/* loaded from: classes.dex */
public final class ViewOnLongClickListenerC1698f implements View.OnLongClickListener {

    /* renamed from: c */
    public final /* synthetic */ String f7646c;

    /* renamed from: e */
    public final /* synthetic */ C1699g f7647e;

    public ViewOnLongClickListenerC1698f(C1699g c1699g, String str) {
        this.f7647e = c1699g;
        this.f7646c = str;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        ((ClipboardManager) this.f7647e.f7655j.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(null, this.f7646c.replace("◆ ", "gg.")));
        C0391d0.m1370q("复制成功", true);
        return true;
    }
}
