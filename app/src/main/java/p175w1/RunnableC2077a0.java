package p175w1;

import android.ext.Tools;
import android.widget.ImageButton;
import com.so.revelation.lua.R;
import com.so.revelation.lua.p024gg.ShowApp;
import p175w1.C2083d0;

/* renamed from: w1.a0 */
/* loaded from: classes.dex */
public final class RunnableC2077a0 implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ boolean f9470c;

    /* renamed from: e */
    public final /* synthetic */ C2083d0 f9471e;

    public RunnableC2077a0(C2083d0 c2083d0, boolean z6) {
        this.f9471e = c2083d0;
        this.f9470c = z6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2083d0.a aVar;
        C2083d0 c2083d0 = this.f9471e;
        boolean z6 = this.f9470c;
        if (z6) {
            c2083d0.f9499k2 = false;
        }
        if (z6) {
            c2083d0.getClass();
            aVar = new C2083d0.a(Tools.getActivity());
            ImageButton imageButton = new ImageButton(Tools.getActivity());
            imageButton.setImageResource(R.drawable.ic_ui_button_24dp);
            imageButton.setKeepScreenOn(true);
            imageButton.setId(R.drawable.ic_ui_button_24dp);
            imageButton.setOnClickListener(new ViewOnClickListenerC2079b0(c2083d0));
            imageButton.setOnLongClickListener(new ViewOnLongClickListenerC2081c0(aVar));
            aVar.addView(imageButton);
        } else {
            aVar = null;
        }
        c2083d0.f9498j2 = aVar;
        ShowApp showApp = c2083d0.f9500l2;
        showApp.getClass();
        C2101m0.m5155a(0, new RunnableC2087f0(showApp));
        C2083d0.a aVar2 = c2083d0.f9498j2;
        aVar2.getClass();
        C2101m0.m5155a(0, new RunnableC2096k(aVar2));
    }
}
