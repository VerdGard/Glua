package p091l1;

import android.widget.CompoundButton;
import com.so.revelation.lua.MainActivity;

/* renamed from: l1.p */
/* loaded from: classes.dex */
public final class C1502p implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ MainActivity f7113a;

    public C1502p(MainActivity mainActivity) {
        this.f7113a = mainActivity;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z6) {
        this.f7113a.f3330e2.edit().putBoolean("isErrorAutoComplete", z6).apply();
    }
}
