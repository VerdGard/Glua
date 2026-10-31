package p091l1;

import android.widget.CompoundButton;
import androidx.lifecycle.C0391d0;
import com.so.revelation.lua.MainActivity;

/* renamed from: l1.o */
/* loaded from: classes.dex */
public final class C1501o implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ MainActivity f7112a;

    public C1501o(MainActivity mainActivity) {
        this.f7112a = mainActivity;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z6) {
        this.f7112a.f3330e2.edit().putBoolean("isAssetFont", z6).apply();
        C0391d0.m1370q("重启启示录生效", true);
    }
}
