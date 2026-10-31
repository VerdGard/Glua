package p129q1;

import android.os.AsyncTask;
import androidx.lifecycle.C0391d0;
import com.so.revelation.lua.DialogInterfaceOnClickListenerC0720a;
import com.so.revelation.lua.EditorActivity;
import java.util.ArrayList;
import java.util.Iterator;
import p122p1.C1694b;

/* renamed from: q1.m */
/* loaded from: classes.dex */
public final class AsyncTaskC1737m extends AsyncTask<Void, Void, Boolean> {

    /* renamed from: a */
    public final EditorActivity f7945a;

    /* renamed from: b */
    public Exception f7946b;

    /* renamed from: c */
    public final InterfaceC1738n f7947c;

    public AsyncTaskC1737m(EditorActivity editorActivity, DialogInterfaceOnClickListenerC0720a.a aVar) {
        this.f7945a = editorActivity;
        this.f7947c = aVar;
    }

    @Override // android.os.AsyncTask
    public final Boolean doInBackground(Void[] voidArr) {
        System.currentTimeMillis();
        C1694b c1694b = this.f7945a.f3291Q1.f102b;
        c1694b.getClass();
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < c1694b.mo4299c(); i7++) {
            arrayList.add(c1694b.m4124j(i7));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC1733i) it.next()).mo4196b();
            } catch (Exception e7) {
                e7.printStackTrace();
                this.f7946b = e7;
            }
        }
        return Boolean.valueOf(this.f7946b == null);
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Boolean bool) {
        Boolean bool2 = bool;
        super.onPostExecute(bool2);
        C1694b c1694b = this.f7945a.f3291Q1.f102b;
        c1694b.getClass();
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < c1694b.mo4299c(); i7++) {
            arrayList.add(c1694b.m4124j(i7));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC1733i) it.next()).mo4195a();
        }
        boolean booleanValue = bool2.booleanValue();
        InterfaceC1738n interfaceC1738n = this.f7947c;
        if (!booleanValue) {
            if (interfaceC1738n != null) {
                C0391d0.m1370q(this.f7946b.getMessage(), true);
            }
        } else if (interfaceC1738n != null) {
            DialogInterfaceOnClickListenerC0720a dialogInterfaceOnClickListenerC0720a = DialogInterfaceOnClickListenerC0720a.this;
            dialogInterfaceOnClickListenerC0720a.f3637c.f3291Q1.m122g();
            dialogInterfaceOnClickListenerC0720a.f3637c.finish();
        }
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        super.onPreExecute();
    }
}
