package p091l1;

import android.view.View;
import com.so.revelation.lua.MainActivity;
import com.so.revelation.lua.View.widget.Chouti;

/* renamed from: l1.s */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1505s implements View.OnClickListener {

    /* renamed from: c */
    public final /* synthetic */ MainActivity f7116c;

    public ViewOnClickListenerC1505s(MainActivity mainActivity) {
        this.f7116c = mainActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MainActivity mainActivity = this.f7116c;
        boolean m2213b = mainActivity.f3316Q1.m2213b();
        Chouti chouti = mainActivity.f3316Q1;
        if (m2213b) {
            chouti.m2214c(false);
        } else {
            chouti.m2214c(true);
        }
    }
}
