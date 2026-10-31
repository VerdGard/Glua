package p091l1;

import android.widget.CompoundButton;
import com.so.revelation.lua.MainActivity;

/* renamed from: l1.q */
/* loaded from: classes.dex */
public final class C1503q implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ MainActivity f7114a;

    public C1503q(MainActivity mainActivity) {
        this.f7114a = mainActivity;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z6) {
        MainActivity mainActivity = this.f7114a;
        mainActivity.f3331f2.putBoolean("zdhh", z6);
        mainActivity.f3331f2.apply();
        mainActivity.getClass();
    }
}
