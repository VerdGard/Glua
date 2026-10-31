package p091l1;

import android.content.ClipboardManager;
import android.view.View;
import androidx.lifecycle.C0391d0;
import com.so.revelation.lua.MainActivity;

/* renamed from: l1.r */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1504r implements View.OnClickListener {

    /* renamed from: c */
    public final /* synthetic */ MainActivity f7115c;

    public ViewOnClickListenerC1504r(MainActivity mainActivity) {
        this.f7115c = mainActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ((ClipboardManager) this.f7115c.getSystemService("clipboard")).setText("556340773");
        C0391d0.m1370q("已复制QQ群号到剪切板", true);
    }
}
