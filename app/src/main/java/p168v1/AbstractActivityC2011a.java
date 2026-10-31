package p168v1;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.TextView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.so.revelation.lua.EditorActivity;
import com.so.revelation.lua.R;
import com.so.revelation.lua.View.widget.SmartTabLayout;
import com.google.android.material.appbar.MaterialToolbar;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;
import org.json.JSONException;
import org.json.JSONObject;
import p003a2.C0033d;
import p016c.ActivityC0556j;
import p016c.C0546c;
import p019c2.C0603k;
import p091l1.C1496j;
import p091l1.ViewOnClickListenerC1497k;
import p100m2.C1547c;
import p122p1.C1694b;
import p129q1.C1732h;
import p129q1.C1734j;
import p129q1.C1735k;
import p129q1.C1736l;
import p159u.C1954a;
import p166v.C2009a;
import p198z0.C2274b;

/* renamed from: v1.a */
/* loaded from: classes.dex */
public abstract class AbstractActivityC2011a extends ActivityC0556j {

    /* renamed from: M1 */
    public boolean f9160M1 = true;

    public abstract /* synthetic */ void initData(View view);

    @Override // androidx.fragment.app.ActivityC0367q, androidx.activity.ComponentActivity, p159u.ActivityC1961h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0603k.f3004c = this;
        C0603k c0603k = C0603k.a.f3007a;
        ArrayList arrayList = c0603k.f3006b;
        arrayList.clear();
        int i7 = 0;
        while (true) {
            String[] strArr = c0603k.f3005a;
            if (i7 >= strArr.length) {
                break;
            }
            if (C2009a.m4894a(C0603k.f3004c, strArr[i7]) != 0) {
                arrayList.add(strArr[i7]);
            }
            i7++;
        }
        ArrayList arrayList2 = c0603k.f3006b;
        if (!arrayList2.isEmpty()) {
            C1954a.m4559d((Activity) C0603k.f3004c, (String[]) arrayList2.toArray(new String[arrayList2.size()]), 1);
        }
        setContentView(R.layout.editoractivity_main);
        getLayoutInflater();
        mo4909u();
        mo2194v();
        EditorActivity editorActivity = (EditorActivity) this;
        EditorActivity.f3284e2 = editorActivity;
        EditorActivity.f3285f2 = editorActivity;
        if (Boolean.valueOf(editorActivity.getSharedPreferences("FirstRun", 0).getBoolean("First", true)).booleanValue()) {
            SharedPreferences.Editor edit = AbstractApplicationC2012b.f9161c.getSharedPreferences("data", 0).edit();
            edit.putInt("toolbar", -14080988);
            edit.putInt("iv1", -14080988);
            edit.putInt("iv2", -1);
            edit.putInt("iv3", -13421773);
            edit.putInt("iv4", -8158333);
            edit.putInt("iv5", -498845);
            edit.putInt("iv6", -416205);
            edit.putInt("iv7", -686891556);
            edit.putInt("iv8", -672957573);
            edit.putInt("iv9", -13860152);
            edit.putInt("iv10", -8919891);
            edit.putInt("iv11", 512264328);
            edit.putInt("iv12", -16737536);
            edit.putString("scriptPath", editorActivity.f3290P1);
            edit.putString("scriptName", "第一行代码.lua");
            edit.commit();
        }
        editorActivity.m2193A();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build());
        EditorActivity.f3285f2 = editorActivity;
        EditorActivity.f3288i2 = (SmartTabLayout) editorActivity.findViewById(R.id.tab_layout);
        EditorActivity.f3289j2 = (TextView) editorActivity.findViewById(R.id.txt_document_info);
        EditorActivity.f3287h2 = editorActivity.getSharedPreferences("data", 0);
        MaterialToolbar materialToolbar = editorActivity.f9162N1;
        EditorActivity.f3286g2 = materialToolbar;
        editorActivity.m1907s().mo1931x(materialToolbar);
        editorActivity.m1907s().mo1918i().mo1866m();
        EditorActivity.m2190B();
        editorActivity.f3292R1 = (DrawerLayout) editorActivity.findViewById(R.id.drawer_layout);
        editorActivity.f3294T1 = (RecyclerView) editorActivity.findViewById(R.id.f3358rv);
        editorActivity.f3292R1.setDrawerLockMode(1);
        editorActivity.f3293S1 = new EditorActivity.ViewTreeObserverOnGlobalLayoutListenerC0690e(editorActivity);
        editorActivity.f3292R1.getViewTreeObserver().addOnGlobalLayoutListener(editorActivity.f3293S1);
        C1496j c1496j = new C1496j(editorActivity, editorActivity.f3292R1, EditorActivity.f3286g2);
        DrawerLayout drawerLayout = c1496j.f2724b;
        View m1039f = drawerLayout.m1039f(8388611);
        c1496j.m1876e(m1039f != null ? DrawerLayout.m1031o(m1039f) : false ? 1.0f : 0.0f);
        View m1039f2 = drawerLayout.m1039f(8388611);
        int i8 = m1039f2 != null ? DrawerLayout.m1031o(m1039f2) : false ? c1496j.f2729g : c1496j.f2728f;
        boolean z6 = c1496j.f2730h;
        C0546c.a aVar = c1496j.f2723a;
        if (!z6 && !aVar.mo1877a()) {
            Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
            c1496j.f2730h = true;
        }
        aVar.mo1880d(c1496j.f2725c, i8);
        editorActivity.f3292R1.m1034a(c1496j);
        EditorActivity.f3286g2.setNavigationOnClickListener(new ViewOnClickListenerC1497k(editorActivity));
        C2274b c2274b = (C2274b) editorActivity.findViewById(R.id.editor_view_pager);
        C0033d c0033d = new C0033d(editorActivity, c2274b);
        editorActivity.f3291Q1 = c0033d;
        SharedPreferences sharedPreferences = editorActivity.getSharedPreferences("data", 0);
        c0033d.f106f = sharedPreferences;
        int i9 = sharedPreferences.getInt("TabIndex", 0);
        C1694b c1694b = new C1694b(editorActivity);
        c0033d.f102b = c1694b;
        c2274b.setAdapter(c1694b);
        int i10 = C1736l.f7944c;
        C1734j c1734j = new C1734j(editorActivity.getApplicationContext());
        ArrayList arrayList3 = new ArrayList(30);
        JSONObject m4203a = c1734j.m4203a();
        Iterator<String> keys = m4203a.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                C1734j.a aVar2 = c1734j.f7938b;
                JSONObject jSONObject = m4203a.getJSONObject(next);
                aVar2.getClass();
                C1735k m4206a = C1734j.a.m4206a(jSONObject);
                if (m4206a.f7940b) {
                    arrayList3.add(m4206a);
                }
            } catch (JSONException e7) {
                e7.printStackTrace();
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            C1735k c1735k = (C1735k) it.next();
            File file = new File(c1735k.f7942d);
            if (file.isFile() && file.canRead() && file.canWrite()) {
                arrayList4.add(new C1732h(file, c1735k.f7941c, c1735k.f7939a));
            } else {
                c1734j.m4205c(c1735k.f7942d);
            }
        }
        C1694b c1694b2 = c0033d.f102b;
        synchronized (c1694b2.f8252f) {
            c1694b2.f8251e.addAll(c1694b2.f8249c.m4301a(arrayList4));
        }
        c1694b2.f8250d = new SparseBooleanArray(c1694b2.f8251e.size());
        c1694b2.m5503e();
        c0033d.f105e.setOffscreenPageLimit(c0033d.f102b.mo4299c());
        c0033d.m124i();
        if (c0033d.m120e() > 0) {
            c0033d.m123h(i9);
        }
        c0033d.f102b.f10372a.registerObserver(c0033d.new a());
        EditorActivity.f3289j2.setTextColor(AbstractApplicationC2012b.f9161c.getSharedPreferences("data", 0).getInt("iv2", 0));
    }

    @Override // p016c.ActivityC0556j, androidx.fragment.app.ActivityC0367q, android.app.Activity
    public void onDestroy() {
        if (C1547c.f7212b == null) {
            C1547c.f7212b = new C1547c();
        }
        C1547c.f7212b.getClass();
        Stack stack = C1547c.f7211a;
        if (stack != null) {
            stack.remove(this);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z6) {
        super.onWindowFocusChanged(z6);
        if (this.f9160M1 && z6) {
            this.f9160M1 = false;
        }
    }

    /* renamed from: u */
    public void mo4909u() {
        if (C1547c.f7212b == null) {
            C1547c.f7212b = new C1547c();
        }
        C1547c.f7212b.getClass();
        if (C1547c.f7211a == null) {
            C1547c.f7211a = new Stack();
        }
        C1547c.f7211a.remove(this);
        C1547c.f7211a.add(this);
        getApplicationContext();
    }

    /* renamed from: v */
    public void mo2194v() {
    }
}
