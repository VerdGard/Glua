package p183x1;

import android.content.DialogInterface;
import android.ext.Config;
import android.ext.Tools;
import android.view.View;
import android.widget.CheckBox;
import android.widget.SeekBar;
import android.widget.TextView;
import com.so.revelation.lua.R;
import com.so.revelation.lua.p024gg.EditTextMulti;
import com.so.revelation.lua.p024gg.EditTextPath;
import com.so.revelation.lua.p024gg.InternalKeyboard;
import java.util.ArrayList;
import java.util.Iterator;
import p165u6.AbstractC1984c0;
import p165u6.AbstractC2003u;
import p165u6.C1981b;
import p165u6.C1993k;
import p165u6.C1996n;
import p165u6.C1998p;
import p165u6.C1999q;
import p175w1.AbstractC2084e;
import p175w1.C2083d0;
import p175w1.C2101m0;
import p175w1.C2108q;
import p175w1.InterfaceC2092i;

/* renamed from: x1.l */
/* loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC2185l extends AbstractC2084e implements DialogInterface.OnDismissListener, DialogInterface.OnClickListener, View.OnFocusChangeListener {

    /* renamed from: j2 */
    public final C2083d0 f9912j2;

    /* renamed from: k2 */
    public volatile int f9913k2 = 0;

    /* renamed from: l2 */
    public volatile C1999q f9914l2 = null;

    /* renamed from: m2 */
    public volatile ArrayList<TextView> f9915m2 = null;

    /* renamed from: x1.l$a */
    public class a implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ C1999q f9917c;

        /* renamed from: e */
        public final /* synthetic */ C1999q f9918e;

        /* renamed from: m */
        public final /* synthetic */ C1999q f9919m;

        /* renamed from: s */
        public final /* synthetic */ ArrayList f9920s;

        /* renamed from: x1.l$a$a, reason: collision with other inner class name */
        public class C2304a implements SeekBar.OnSeekBarChangeListener {

            /* renamed from: a */
            public final /* synthetic */ TextView f9921a;

            /* renamed from: b */
            public final /* synthetic */ int f9922b;

            public C2304a(TextView textView, int i7) {
                this.f9921a = textView;
                this.f9922b = i7;
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onProgressChanged(SeekBar seekBar, int i7, boolean z6) {
                this.f9921a.setText(Integer.toString(this.f9922b + i7));
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onStopTrackingTouch(SeekBar seekBar) {
            }
        }

        /* renamed from: x1.l$a$b */
        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    C2083d0 c2083d0 = DialogInterfaceOnDismissListenerC2185l.this.f9912j2;
                    C1981b c1981b = C2083d0.f9492o2;
                    c1981b.getClass();
                    AbstractC2003u mo4782R1 = c1981b.mo4782R1(C1998p.m4815M2(""));
                    C1996n c1996n = AbstractC2003u.f9130m;
                    mo4782R1.getClass();
                    mo4782R1.mo4787V1(C1998p.m4815M2(""), c1996n);
                } catch (Throwable unused) {
                }
            }
        }

        public a(C1999q c1999q, C1999q c1999q2, C1999q c1999q3, ArrayList arrayList) {
            this.f9917c = c1999q;
            this.f9918e = c1999q2;
            this.f9919m = c1999q3;
            this.f9920s = arrayList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:111:0x01e0  */
        /* JADX WARN: Removed duplicated region for block: B:112:0x01e2  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x02cf  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x02d8 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0237 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0270 A[Catch: all -> 0x0288, TRY_LEAVE, TryCatch #2 {all -> 0x0288, blocks: (B:38:0x0256, B:40:0x0270), top: B:37:0x0256 }] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0290  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x02a1  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x02c4  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0294  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 807
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p183x1.DialogInterfaceOnDismissListenerC2185l.a.run():void");
        }
    }

    public DialogInterfaceOnDismissListenerC2185l(C2083d0 c2083d0) {
        this.f9912j2 = c2083d0;
    }

    /* renamed from: K2 */
    public static void m5321K2(View view) {
        view.setVisibility(8);
        Tools.getViewForAttach(view);
    }

    @Override // p175w1.AbstractC2084e
    /* renamed from: I2 */
    public final AbstractC1984c0 mo5146I2(AbstractC1984c0 abstractC1984c0) {
        C1999q m4636A = abstractC1984c0.m4636A(1);
        C1999q mo4773F1 = abstractC1984c0.mo4623t(2).mo4773F1();
        C1999q mo4773F12 = abstractC1984c0.mo4623t(3).mo4773F1();
        this.f9913k2 = 0;
        ArrayList<TextView> arrayList = new ArrayList<>();
        this.f9915m2 = arrayList;
        this.f9914l2 = new C1999q();
        synchronized (this) {
            C2101m0.m5155a(0, new a(m4636A, mo4773F1, mo4773F12, arrayList));
            C2083d0.m5142N2(this);
        }
        this.f9915m2 = null;
        C1999q c1999q = this.f9914l2;
        this.f9914l2 = null;
        return this.f9913k2 == 0 ? AbstractC2003u.f9130m : c1999q;
    }

    @Override // p175w1.AbstractC2084e
    /* renamed from: J2 */
    public final String mo5147J2() {
        return "gg.prompt(table prompts [, table defaults = {} [, table types = {} ]]) -> nil || table with keys from prompts and values from inputs";
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        C1993k m4765C2;
        if (i7 == -1) {
            this.f9913k2 = -i7;
            ArrayList<TextView> arrayList = this.f9915m2;
            C1999q c1999q = this.f9914l2;
            if (arrayList == null || c1999q == null) {
                return;
            }
            Iterator<TextView> it = arrayList.iterator();
            int i8 = 0;
            while (it.hasNext()) {
                i8++;
                TextView next = it.next();
                if (next != null && (m4765C2 = C1993k.m4765C2(i8)) != null) {
                    if (next instanceof CheckBox) {
                        c1999q.mo4787V1(m4765C2, ((CheckBox) next).isChecked() ? AbstractC2003u.f9131s : AbstractC2003u.f9122X);
                    } else {
                        String charSequence = ((next instanceof EditTextMulti) || (next instanceof EditTextPath)) ? next.getText().toString() : next.toString();
                        c1999q.mo4787V1(m4765C2, C1998p.m4815M2(charSequence));
                        C2108q.m5156a(charSequence, (byte) 0, 1);
                    }
                }
            }
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        synchronized (this) {
            notify();
        }
        this.f9912j2.m5143I2(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z6) {
        InternalKeyboard internalKeyboard;
        boolean z7 = true;
        if ((Config.configClient & 1) == 0 || !z6 || (internalKeyboard = (InternalKeyboard) view.getRootView().findViewById(R.id.keyboard)) == null || !(view instanceof InterfaceC2092i)) {
            return;
        }
        int dataType = ((InterfaceC2092i) view).getDataType();
        if (dataType != 4 && dataType != 2) {
            z7 = false;
        }
        internalKeyboard.m2249b(view, z7);
        if (z7) {
            return;
        }
        Tools.hideKeyboard(view);
    }
}
