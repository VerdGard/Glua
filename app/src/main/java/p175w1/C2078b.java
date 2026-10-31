package p175w1;

import android.content.DialogInterface;
import android.ext.Config;
import android.ext.Tools;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.EditText;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.DialogInterfaceC0151d;
import com.so.revelation.lua.EditorActivity;
import com.so.revelation.lua.R;
import com.so.revelation.lua.p024gg.InternalKeyboard;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: w1.b */
/* loaded from: classes.dex */
public final class C2078b {

    /* renamed from: b */
    public static volatile int f9473b;

    /* renamed from: a */
    public static final a f9472a = new a();

    /* renamed from: c */
    public static final ArrayList f9474c = new ArrayList();

    /* renamed from: d */
    public static final ArrayList f9475d = new ArrayList();

    /* renamed from: e */
    public static ArrayList<WeakReference<DialogInterfaceC0151d>> f9476e = new ArrayList<>();

    /* renamed from: w1.b$a */
    public class a implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            a aVar = C2078b.f9472a;
        }
    }

    /* renamed from: w1.b$b */
    public static class b {

        /* renamed from: a */
        public final WeakReference<DialogInterfaceC0151d> f9477a;

        /* renamed from: b */
        public final WeakReference<c> f9478b;

        public b(DialogInterfaceC0151d dialogInterfaceC0151d, c cVar) {
            this.f9477a = new WeakReference<>(dialogInterfaceC0151d);
            this.f9478b = new WeakReference<>(cVar);
        }
    }

    /* renamed from: w1.b$c */
    public static class c implements DialogInterface.OnDismissListener {

        /* renamed from: c */
        public final ArrayList f9479c = new ArrayList();

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            a aVar = C2078b.f9472a;
            Iterator it = this.f9479c.iterator();
            while (it.hasNext()) {
                DialogInterface.OnDismissListener onDismissListener = (DialogInterface.OnDismissListener) it.next();
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(dialogInterface);
                }
            }
        }
    }

    /* renamed from: w1.b$d */
    public static class d {

        /* renamed from: a */
        public final WeakReference<DialogInterfaceC0151d> f9480a;

        /* renamed from: b */
        public final WeakReference<e> f9481b;

        public d(DialogInterfaceC0151d dialogInterfaceC0151d, e eVar) {
            this.f9480a = new WeakReference<>(dialogInterfaceC0151d);
            this.f9481b = new WeakReference<>(eVar);
        }
    }

    /* renamed from: w1.b$e */
    public static class e implements DialogInterface.OnShowListener {

        /* renamed from: a */
        public final ArrayList f9482a = new ArrayList();

        @Override // android.content.DialogInterface.OnShowListener
        public final void onShow(DialogInterface dialogInterface) {
            Tools.fixDialogButtonsSize((DialogInterfaceC0151d) dialogInterface);
            Iterator it = this.f9482a.iterator();
            while (it.hasNext()) {
                DialogInterface.OnShowListener onShowListener = (DialogInterface.OnShowListener) it.next();
                if (onShowListener != null) {
                    onShowListener.onShow(dialogInterface);
                }
            }
        }
    }

    /* renamed from: w1.b$f */
    public static class f implements AdapterView.OnItemClickListener {

        /* renamed from: c */
        public final DialogInterfaceC0151d f9483c;

        /* renamed from: e */
        public final AdapterView.OnItemClickListener f9484e;

        public f(DialogInterfaceC0151d dialogInterfaceC0151d, AdapterView.OnItemClickListener onItemClickListener) {
            this.f9484e = onItemClickListener;
            this.f9483c = dialogInterfaceC0151d;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i7, long j7) {
            try {
                this.f9484e.onItemClick(adapterView, view, i7, j7);
            } catch (Throwable unused) {
                Tools.dismiss(this.f9483c);
            }
        }
    }

    /* renamed from: a */
    public static DialogInterfaceC0151d.a m5134a() {
        return new DialogInterfaceC0151d.a(Tools.getContext());
    }

    /* renamed from: b */
    public static void m5135b(DialogInterfaceC0151d dialogInterfaceC0151d, DialogInterface.OnDismissListener onDismissListener) {
        ArrayList arrayList;
        DialogInterfaceC0151d dialogInterfaceC0151d2;
        b bVar = null;
        int i7 = 0;
        while (true) {
            arrayList = f9475d;
            if (i7 >= arrayList.size()) {
                break;
            }
            b bVar2 = (b) arrayList.get(i7);
            if (bVar2 == null || (dialogInterfaceC0151d2 = bVar2.f9477a.get()) == null) {
                arrayList.remove(i7);
                i7--;
            } else if (dialogInterfaceC0151d2 == dialogInterfaceC0151d) {
                bVar = bVar2;
            }
            i7++;
        }
        if (bVar == null) {
            c cVar = new c();
            dialogInterfaceC0151d.setOnDismissListener(cVar);
            b bVar3 = new b(dialogInterfaceC0151d, cVar);
            arrayList.add(bVar3);
            bVar = bVar3;
        }
        c cVar2 = bVar.f9478b.get();
        if (onDismissListener == null) {
            cVar2.getClass();
            return;
        }
        ArrayList arrayList2 = cVar2.f9479c;
        if (arrayList2.contains(onDismissListener)) {
            return;
        }
        arrayList2.add(onDismissListener);
    }

    /* renamed from: c */
    public static void m5136c(DialogInterfaceC0151d dialogInterfaceC0151d, DialogInterfaceOnShowListenerC2111t dialogInterfaceOnShowListenerC2111t) {
        ArrayList arrayList;
        DialogInterfaceC0151d dialogInterfaceC0151d2;
        d dVar = null;
        int i7 = 0;
        while (true) {
            arrayList = f9474c;
            if (i7 >= arrayList.size()) {
                break;
            }
            d dVar2 = (d) arrayList.get(i7);
            if (dVar2 == null || (dialogInterfaceC0151d2 = dVar2.f9480a.get()) == null) {
                arrayList.remove(i7);
                i7--;
            } else if (dialogInterfaceC0151d2 == dialogInterfaceC0151d) {
                dVar = dVar2;
            }
            i7++;
        }
        if (dVar == null) {
            e eVar = new e();
            dialogInterfaceC0151d.setOnShowListener(eVar);
            d dVar3 = new d(dialogInterfaceC0151d, eVar);
            arrayList.add(dVar3);
            dVar = dVar3;
        }
        e eVar2 = dVar.f9481b.get();
        if (dialogInterfaceOnShowListenerC2111t == null) {
            eVar2.getClass();
            return;
        }
        ArrayList arrayList2 = eVar2.f9482a;
        if (arrayList2.contains(dialogInterfaceOnShowListenerC2111t)) {
            return;
        }
        arrayList2.add(dialogInterfaceOnShowListenerC2111t);
    }

    /* renamed from: d */
    public static void m5137d(DialogInterfaceC0151d dialogInterfaceC0151d, EditText editText) {
        if (editText != null) {
            editText.setOnEditorActionListener(new C2094j(dialogInterfaceC0151d));
        }
        Window window = dialogInterfaceC0151d.getWindow();
        window.setCallback(new WindowCallbackC2107p0(window.getCallback()));
        if (!(EditorActivity.f3285f2 == null)) {
            window.setType(C2097k0.m5152a());
            Tools.fixViewParams(window);
            if ((Config.configClient & 2) != 0) {
                window.addFlags(16777216);
                C2101m0.m5155a(0, new RunnableC2080c(dialogInterfaceC0151d));
            }
        }
        window.clearFlags(16777216);
        C2101m0.m5155a(0, new RunnableC2080c(dialogInterfaceC0151d));
    }

    /* renamed from: e */
    public static void m5138e(DialogInterfaceC0151d dialogInterfaceC0151d) {
        AlertController.RecycleListView recycleListView;
        m5136c(dialogInterfaceC0151d, null);
        dialogInterfaceC0151d.show();
        if (EditorActivity.f3285f2 == null) {
            return;
        }
        try {
            recycleListView = dialogInterfaceC0151d.f373Y.f318g;
        } catch (Throwable unused) {
            recycleListView = null;
        }
        if (recycleListView != null) {
            try {
                AdapterView.OnItemClickListener onItemClickListener = recycleListView.getOnItemClickListener();
                if (onItemClickListener != null && !(onItemClickListener instanceof f)) {
                    recycleListView.setOnItemClickListener(new f(dialogInterfaceC0151d, onItemClickListener));
                }
            } catch (Throwable unused2) {
            }
        }
        Window window = dialogInterfaceC0151d.getWindow();
        View decorView = window.getDecorView();
        InternalKeyboard internalKeyboard = (InternalKeyboard) decorView.findViewById(R.id.keyboard);
        if (internalKeyboard != null) {
            internalKeyboard.f3653x1 = new WeakReference<>(window);
            if (internalKeyboard.f3650m && (Config.configClient & 1) != 0) {
                window.addFlags(131072);
            } else {
                window.clearFlags(131072);
            }
            internalKeyboard.m2252f();
            View decorView2 = window.getDecorView();
            WindowCallbackC2107p0 windowCallbackC2107p0 = (WindowCallbackC2107p0) window.getCallback();
            if ((windowCallbackC2107p0 instanceof WindowCallbackC2107p0) && decorView2.getWidth() == 0) {
                windowCallbackC2107p0.f9552e = internalKeyboard;
            } else {
                internalKeyboard.m2250c();
            }
        }
        window.setSoftInputMode(((Tools.hasEditText(decorView) && (internalKeyboard == null || (Config.configClient & 1) == 0)) ? 5 : 2) | 16);
        Tools.fixViews(decorView);
        Handler handler = C2101m0.f9540a[0];
        a aVar = f9472a;
        handler.removeCallbacks(aVar);
        handler.postDelayed(aVar, 100L);
        if (f9473b <= 0) {
            f9473b = 1;
        } else {
            f9473b++;
        }
        m5135b(dialogInterfaceC0151d, null);
        if (dialogInterfaceC0151d.getWindow().getAttributes().type >= 2000) {
            ArrayList<WeakReference<DialogInterfaceC0151d>> arrayList = f9476e;
            ArrayList<WeakReference<DialogInterfaceC0151d>> arrayList2 = new ArrayList<>();
            Iterator<WeakReference<DialogInterfaceC0151d>> it = arrayList.iterator();
            while (it.hasNext()) {
                WeakReference<DialogInterfaceC0151d> next = it.next();
                DialogInterfaceC0151d dialogInterfaceC0151d2 = next.get();
                if (dialogInterfaceC0151d2 != null && dialogInterfaceC0151d2 != dialogInterfaceC0151d) {
                    arrayList2.add(next);
                }
            }
            arrayList2.add(new WeakReference<>(dialogInterfaceC0151d));
            f9476e = arrayList2;
            arrayList.clear();
            arrayList.trimToSize();
        }
    }
}
