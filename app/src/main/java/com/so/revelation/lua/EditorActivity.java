package com.so.revelation.lua;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.ext.Tools;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.activity.C0143v;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.DialogInterfaceC0151d;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.FileProvider;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.lifecycle.C0391d0;
import androidx.recyclerview.widget.RecyclerView;
import com.so.revelation.lua.View.widget.SlidingUpPanelLayout;
import com.so.revelation.lua.View.widget.SmartTabLayout;
import com.so.revelation.lua.p024gg.EditTextPath;
import com.so.revelation.lua.p024gg.InternalKeyboard;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.C0845g;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.snackbar.SnackbarContentLayout;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p003a2.C0033d;
import p019c2.C0595c;
import p019c2.C0602j;
import p019c2.DialogInterfaceOnClickListenerC0600h;
import p019c2.DialogInterfaceOnClickListenerC0601i;
import p022c5.C0638b;
import p022c5.C0641e;
import p022c5.C0645i;
import p036e2.C0991f;
import p036e2.C1023j3;
import p036e2.C1124y;
import p044f2.C1164a;
import p055g5.EnumC1262s;
import p068i2.C1329a;
import p071i5.C1371h0;
import p084k2.C1452b;
import p091l1.C1489c;
import p091l1.DialogInterfaceOnClickListenerC1499m;
import p091l1.DialogInterfaceOnClickListenerC1500n;
import p091l1.RunnableC1498l;
import p122p1.AbstractC1693a;
import p122p1.C1694b;
import p122p1.C1695c;
import p129q1.C1726b;
import p129q1.C1732h;
import p129q1.C1734j;
import p129q1.C1735k;
import p129q1.C1736l;
import p129q1.ViewOnClickListenerC1728d;
import p137r1.AbstractC1821a;
import p145s1.C1876c;
import p159u.C1954a;
import p166v.C2009a;
import p168v1.AbstractActivityC2013c;
import p168v1.AbstractApplicationC2012b;
import p175w1.C2078b;
import p175w1.C2083d0;
import p199z1.C2276a;
import p200z2.C2277a;
import p200z2.C2279c;

/* loaded from: classes.dex */
public class EditorActivity extends AbstractActivityC2013c implements View.OnClickListener {

    /* renamed from: e2 */
    @SuppressLint({"StaticFieldLeak"})
    public static EditorActivity f3284e2;

    /* renamed from: f2 */
    @SuppressLint({"StaticFieldLeak"})
    public static EditorActivity f3285f2;

    /* renamed from: g2 */
    @SuppressLint({"StaticFieldLeak"})
    public static MaterialToolbar f3286g2;

    /* renamed from: h2 */
    public static SharedPreferences f3287h2;

    /* renamed from: i2 */
    public static SmartTabLayout f3288i2;

    /* renamed from: j2 */
    @SuppressLint({"StaticFieldLeak"})
    public static TextView f3289j2;

    /* renamed from: P1 */
    public final String f3290P1;

    /* renamed from: Q1 */
    public C0033d f3291Q1;

    /* renamed from: R1 */
    public DrawerLayout f3292R1;

    /* renamed from: S1 */
    public ViewTreeObserverOnGlobalLayoutListenerC0690e f3293S1;

    /* renamed from: T1 */
    public RecyclerView f3294T1;

    /* renamed from: U1 */
    public C1876c f3295U1;

    /* renamed from: V1 */
    public final C0688c f3296V1;

    /* renamed from: W1 */
    public final SharedPreferences f3297W1;

    /* renamed from: X1 */
    public final SharedPreferences.Editor f3298X1;

    /* renamed from: Y1 */
    public MenuItem f3299Y1;

    /* renamed from: Z1 */
    public MenuItem f3300Z1;

    /* renamed from: a2 */
    public MenuItem f3301a2;

    /* renamed from: b2 */
    public MenuItem f3302b2;

    /* renamed from: c2 */
    public MenuItem f3303c2;

    /* renamed from: d2 */
    public MenuItem f3304d2;

    /* renamed from: com.so.revelation.lua.EditorActivity$a */
    public class C0686a extends WebViewClient {
        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            webView.loadUrl(str);
            return true;
        }
    }

    /* renamed from: com.so.revelation.lua.EditorActivity$b */
    public class ViewOnClickListenerC0687b implements View.OnClickListener {

        /* renamed from: c */
        public final /* synthetic */ EditText f3305c;

        /* renamed from: e */
        public final /* synthetic */ DialogInterfaceC0151d f3306e;

        public ViewOnClickListenerC0687b(EditText editText, DialogInterfaceC0151d dialogInterfaceC0151d) {
            this.f3305c = editText;
            this.f3306e = dialogInterfaceC0151d;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ViewGroup viewGroup;
            if (!this.f3305c.getText().toString().trim().isEmpty()) {
                EditorActivity editorActivity = EditorActivity.this;
                String obj = this.f3305c.getText().toString();
                EditorActivity editorActivity2 = EditorActivity.f3284e2;
                editorActivity.m2195y(obj);
                this.f3306e.dismiss();
                return;
            }
            View view2 = this.f3305c;
            int[] iArr = Snackbar.f4439B;
            ViewGroup viewGroup2 = null;
            while (!(view2 instanceof CoordinatorLayout)) {
                if (view2 instanceof FrameLayout) {
                    if (view2.getId() == 16908290) {
                        break;
                    } else {
                        viewGroup2 = (ViewGroup) view2;
                    }
                }
                if (view2 != null) {
                    Object parent = view2.getParent();
                    view2 = parent instanceof View ? (View) parent : null;
                }
                if (view2 == null) {
                    viewGroup = viewGroup2;
                    break;
                }
            }
            viewGroup = (ViewGroup) view2;
            if (viewGroup == null) {
                throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
            }
            Context context = viewGroup.getContext();
            LayoutInflater from = LayoutInflater.from(context);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Snackbar.f4439B);
            boolean z6 = false;
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
            obtainStyledAttributes.recycle();
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) from.inflate(resourceId != -1 && resourceId2 != -1 ? com.google.android.material.R$layout.mtrl_layout_snackbar_include : com.google.android.material.R$layout.design_layout_snackbar_include, viewGroup, false);
            Snackbar snackbar = new Snackbar(context, viewGroup, snackbarContentLayout, snackbarContentLayout);
            ((SnackbarContentLayout) snackbar.f4411i.getChildAt(0)).getMessageView().setText("输入文件名");
            snackbar.f4413k = 0;
            C0845g m2501b = C0845g.m2501b();
            int m2498g = snackbar.m2498g();
            BaseTransientBottomBar.C0836c c0836c = snackbar.f4422t;
            synchronized (m2501b.f4452a) {
                if (m2501b.m2503c(c0836c)) {
                    C0845g.c cVar = m2501b.f4454c;
                    cVar.f4458b = m2498g;
                    m2501b.f4453b.removeCallbacksAndMessages(cVar);
                    m2501b.m2506f(m2501b.f4454c);
                } else {
                    C0845g.c cVar2 = m2501b.f4455d;
                    if (cVar2 != null) {
                        if (c0836c != null && cVar2.f4457a.get() == c0836c) {
                            z6 = true;
                        }
                    }
                    if (z6) {
                        m2501b.f4455d.f4458b = m2498g;
                    } else {
                        m2501b.f4455d = new C0845g.c(m2498g, c0836c);
                    }
                    C0845g.c cVar3 = m2501b.f4454c;
                    if (cVar3 == null || !m2501b.m2502a(cVar3, 4)) {
                        m2501b.f4454c = null;
                        C0845g.c cVar4 = m2501b.f4455d;
                        if (cVar4 != null) {
                            m2501b.f4454c = cVar4;
                            m2501b.f4455d = null;
                            C0845g.b bVar = cVar4.f4457a.get();
                            if (bVar != null) {
                                bVar.mo2495a();
                            } else {
                                m2501b.f4454c = null;
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.so.revelation.lua.EditorActivity$c */
    public class C0688c implements C0602j.a {
        public C0688c() {
        }
    }

    /* renamed from: com.so.revelation.lua.EditorActivity$d */
    public class RunnableC0689d implements Runnable {
        public RunnableC0689d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1164a m3359a = C1164a.m3359a(EditorActivity.this);
            m3359a.getClass();
            int i7 = C2279c.f10445a;
            int i8 = 0;
            if (!(!(Looper.myLooper() == Looper.getMainLooper()))) {
                throw new IllegalArgumentException("YOu must call this method on a background thread");
            }
            C1329a.a aVar = m3359a.f5723b.f6528b;
            if (aVar.f6530b == null) {
                synchronized (aVar) {
                    if (aVar.f6530b == null) {
                        aVar.f6530b = ((C1452b) aVar.f6529a).m3835a();
                    }
                    if (aVar.f6530b == null) {
                        aVar.f6530b = new C0143v(i8);
                    }
                }
            }
            aVar.f6530b.clear();
        }
    }

    /* renamed from: com.so.revelation.lua.EditorActivity$e */
    public class ViewTreeObserverOnGlobalLayoutListenerC0690e implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: c */
        public final EditorActivity f3310c;

        /* renamed from: e */
        public int f3311e = 0;

        public ViewTreeObserverOnGlobalLayoutListenerC0690e(EditorActivity editorActivity) {
            this.f3310c = editorActivity;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            EditorActivity editorActivity = this.f3310c;
            int identifier = editorActivity.getResources().getIdentifier("navigation_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? editorActivity.getResources().getDimensionPixelSize(identifier) : 0;
            int identifier2 = editorActivity.getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (identifier2 > 0) {
                this.f3311e = editorActivity.getResources().getDimensionPixelSize(identifier2);
            }
            Rect rect = new Rect();
            editorActivity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            int height = editorActivity.f3292R1.getRootView().getHeight() - (rect.height() + (dimensionPixelSize + this.f3311e));
            editorActivity.getClass();
            if (height <= 0) {
                SmartTabLayout smartTabLayout = EditorActivity.f3288i2;
                if (smartTabLayout != null) {
                    smartTabLayout.setVisibility(0);
                }
                TextView textView = EditorActivity.f3289j2;
                if (textView != null) {
                    textView.setVisibility(8);
                    return;
                }
                return;
            }
            SmartTabLayout smartTabLayout2 = EditorActivity.f3288i2;
            if (smartTabLayout2 != null) {
                smartTabLayout2.setVisibility(8);
            }
            TextView textView2 = EditorActivity.f3289j2;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            if (editorActivity.f3291Q1.m120e() == 0 || !editorActivity.f3291Q1.m121f().requestFocus()) {
                return;
            }
            editorActivity.f3291Q1.m121f().postDelayed(new RunnableC1498l(editorActivity), 50L);
        }
    }

    public EditorActivity() {
        String str = Environment.getExternalStorageDirectory() + "/启示录/第一行代码.lua";
        this.f3290P1 = str;
        new File(str);
        this.f3296V1 = new C0688c();
        SharedPreferences sharedPreferences = AbstractApplicationC2012b.f9161c.getSharedPreferences("data", 0);
        this.f3297W1 = sharedPreferences;
        this.f3298X1 = sharedPreferences.edit();
    }

    /* renamed from: B */
    public static void m2190B() {
        f3286g2.setBackgroundColor(f3287h2.getInt("toolbar", -1));
        f3288i2.setBackgroundColor(f3287h2.getInt("toolbar", -1));
        f3289j2.setBackgroundColor(f3287h2.getInt("toolbar", -1));
        f3286g2.setTitle("");
        f3285f2.getWindow().setStatusBarColor(f3287h2.getInt("toolbar", -1));
    }

    /* renamed from: w */
    public static void m2191w(String str, String str2) {
        SharedPreferences.Editor edit = AbstractApplicationC2012b.f9161c.getSharedPreferences("data", 0).edit();
        edit.putString("scriptPath", str);
        edit.putString("scriptName", str2);
        edit.commit();
    }

    /* renamed from: x */
    public static void m2192x(Code code, String str) {
        C0641e text;
        StringBuilder sb;
        String sb2;
        C0645i cursor = code.getCursor();
        C0638b c0638b = cursor.f3166c;
        int i7 = c0638b.f3142c;
        int i8 = c0638b.f3141b;
        C0641e text2 = code.getText();
        C0638b c0638b2 = cursor.f3166c;
        int i9 = c0638b2.f3141b;
        String c0641e = text2.m2123G(i9, 0, i9, c0638b2.f3142c).toString();
        C0641e text3 = code.getText();
        C0638b c0638b3 = cursor.f3166c;
        int i10 = c0638b3.f3141b;
        int i11 = c0638b3.f3142c;
        C0638b c0638b4 = cursor.f3167d;
        String c0641e2 = text3.m2123G(i10, i11, c0638b4.f3141b, c0638b4.f3142c).toString();
        if (!cursor.m2163a()) {
            c0641e2 = "";
            str = "function Text";
        }
        if (str.equals("function")) {
            if (c0641e2.indexOf("(") <= 0) {
                c0641e2 = c0641e2.concat("()");
            }
            code.m3459B();
            text = code.getText();
            sb2 = str + " " + c0641e2 + "\n" + c0641e + "\t\n" + c0641e + "end";
        } else {
            if (str.equals("forin")) {
                code.m3459B();
                text = code.getText();
                sb = new StringBuilder("for k,v in pairs() do\n\t");
            } else {
                if (!str.equals("fornub")) {
                    return;
                }
                code.m3459B();
                text = code.getText();
                sb = new StringBuilder("for i=1,10 do\n\t");
            }
            sb.append(c0641e);
            sb.append(c0641e2);
            sb.append("\n");
            sb.append(c0641e);
            sb.append("end");
            sb2 = sb.toString();
        }
        text.m2151w(i8, i7, sb2);
    }

    /* renamed from: A */
    public final void m2193A() {
        boolean isExternalStorageManager;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            isExternalStorageManager = Environment.isExternalStorageManager();
            if (isExternalStorageManager) {
                return;
            }
            Intent intent = new Intent("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION");
            intent.setData(Uri.parse("package:" + getPackageName()));
            startActivityForResult(intent, 100);
            return;
        }
        String[] strArr = {"android.permission.CAMERA", "android.permission.WRITE_CALENDAR", "android.permission.READ_CALENDAR", "android.permission.WRITE_EXTERNAL_STORAGE"};
        if (C0602j.f3001c == null) {
            C0602j.f3001c = new C0602j();
        }
        C0602j c0602j = C0602j.f3001c;
        C0688c c0688c = this.f3296V1;
        c0602j.f3002a = c0688c;
        if (i7 >= 23) {
            ArrayList arrayList = new ArrayList();
            for (int i8 = 0; i8 < 4; i8++) {
                if (C2009a.m4894a(this, strArr[i8]) != 0) {
                    arrayList.add(strArr[i8]);
                }
            }
            if (arrayList.size() > 0) {
                C1954a.m4559d(this, strArr, 100);
                return;
            }
        }
        c0688c.getClass();
    }

    @Override // p168v1.AbstractActivityC2013c, p168v1.AbstractActivityC2011a
    public void initData(View view) {
    }

    @Override // androidx.fragment.app.ActivityC0367q, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i7, int i8, Intent intent) {
        C0033d c0033d;
        C1694b c1694b;
        super.onActivityResult(i7, i8, intent);
        if (i7 == 10001) {
            if (i8 == -1) {
                Uri mo1004b = FileProvider.m1000a(this, getPackageName() + ".fileprovider").mo1004b(new File(C0595c.f2983h.getPath()));
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setFlags(268435456);
                intent2.addFlags(1);
                intent2.setDataAndType(mo1004b, "application/vnd.android.package-archive");
                startActivity(intent2);
                return;
            }
            return;
        }
        if (i7 != 633 || (c0033d = this.f3291Q1) == null || c0033d.m120e() == 0 || (c1694b = this.f3291Q1.f102b) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < c1694b.mo4299c(); i9++) {
            arrayList.add(c1694b.m4124j(i9));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Code code = ((C1726b) it.next()).f7890X;
            if (code != null) {
                code.setColorScheme(new C2276a());
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // p168v1.AbstractActivityC2013c, android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_editor_act, menu);
        this.f3299Y1 = menu.findItem(R.id.menu_undo);
        this.f3304d2 = menu.findItem(R.id.menu_redo);
        this.f3300Z1 = menu.findItem(R.id.text_wordwrap);
        this.f3301a2 = menu.findItem(R.id.editor_line_number);
        this.f3302b2 = menu.findItem(R.id.pin_line_number);
        this.f3303c2 = menu.findItem(R.id.magnifier);
        MenuItem menuItem = this.f3300Z1;
        SharedPreferences sharedPreferences = this.f3297W1;
        menuItem.setChecked(sharedPreferences.getBoolean("zdhh", true));
        this.f3301a2.setChecked(sharedPreferences.getBoolean("showline", true));
        this.f3302b2.setChecked(sharedPreferences.getBoolean("pinline", false));
        this.f3303c2.setChecked(sharedPreferences.getBoolean("magnifier", true));
        return super.onCreateOptionsMenu(menu);
    }

    @Override // p168v1.AbstractActivityC2011a, p016c.ActivityC0556j, androidx.fragment.app.ActivityC0367q, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        new Thread(new RunnableC0689d()).start();
        C1164a m3359a = C1164a.m3359a(this);
        m3359a.f5724c.mo3758a();
        C2277a c2277a = (C2277a) m3359a.f5725d;
        while (c2277a.f10442b > 0) {
            LinkedHashMap<T, Y> linkedHashMap = c2277a.f10441a;
            Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
            Object value = entry.getValue();
            c2277a.f10442b -= c2277a.mo3838a(value);
            Object key = entry.getKey();
            linkedHashMap.remove(key);
            c2277a.mo3839b(key, value);
        }
    }

    @Override // p016c.ActivityC0556j, android.app.Activity, android.view.KeyEvent.Callback
    @SuppressLint({"SuspiciousIndentation"})
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        if (i7 == 82) {
            return true;
        }
        if (i7 != 4) {
            if (i7 == 25) {
                if (this.f3291Q1.m120e() != 0) {
                    this.f3291Q1.m121f().m3483Z(EnumC1262s.RIGHT);
                }
                return true;
            }
            if (i7 != 24) {
                return super.onKeyDown(i7, keyEvent);
            }
            if (this.f3291Q1.m120e() != 0) {
                this.f3291Q1.m121f().m3483Z(EnumC1262s.LEFT);
            }
            return true;
        }
        if (this.f3291Q1.m120e() != 0) {
            int ordinal = this.f3291Q1.f102b.m4123i().f7893e.f7903i2.getPanelState().ordinal();
            if (ordinal == 0) {
                this.f3291Q1.f102b.m4123i().f7893e.f7903i2.setPanelState(SlidingUpPanelLayout.EnumC0710e.f3566e);
                return false;
            }
            if (ordinal == 1) {
                DialogInterfaceOnClickListenerC0720a dialogInterfaceOnClickListenerC0720a = new DialogInterfaceOnClickListenerC0720a(this);
                DialogInterfaceC0151d.a aVar = new DialogInterfaceC0151d.a(this);
                AlertController.C0145b c0145b = aVar.f374a;
                c0145b.f345e = "保存项目";
                c0145b.f347g = "项目已被更改，是否保存并退出";
                aVar.m486c("是", dialogInterfaceOnClickListenerC0720a);
                aVar.m485b("否", dialogInterfaceOnClickListenerC0720a);
                c0145b.f352l = "取消";
                c0145b.f353m = dialogInterfaceOnClickListenerC0720a;
                aVar.m484a().show();
                return false;
            }
            if (ordinal != 3) {
                return false;
            }
        }
        finish();
        return false;
    }

    @Override // p168v1.AbstractActivityC2013c, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        SharedPreferences.Editor editor = this.f3298X1;
        switch (itemId) {
            case R.id.action_helper /* 2131230782 */:
                startActivity(new Intent(this, (Class<?>) DemoActivity.class));
            case android.R.id.home:
                return true;
            case R.id.action_luahelper /* 2131230784 */:
                Tools.init((Activity) this);
                DialogInterfaceC0151d.a aVar = new DialogInterfaceC0151d.a(this);
                View inflate = View.inflate(this, R.layout.web_dialog, null);
                AlertController.C0145b c0145b = aVar.f374a;
                c0145b.f359s = inflate;
                c0145b.f354n = true;
                WebView webView = (WebView) inflate.findViewById(R.id.webdialogWebView1);
                webView.loadUrl("https://www.runoob.com/manual/lua53doc/manual.html");
                webView.setWebViewClient(new C0686a());
                aVar.m484a().show();
                return true;
            case R.id.action_share /* 2131230794 */:
                startActivityForResult(new Intent(this, (Class<?>) MainActivity.class), 633);
                return true;
            case R.id.copy /* 2131230862 */:
                if (this.f3291Q1.m120e() != 0) {
                    String m2150v = this.f3291Q1.m121f().getText().m2150v(this.f3291Q1.m121f().getText().m2144p().f3166c.f3141b);
                    ((ClipboardManager) getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(m2150v, m2150v));
                }
                return true;
            case R.id.del /* 2131230888 */:
                if (this.f3291Q1.m120e() != 0) {
                    this.f3291Q1.m121f().getText().m2136h(this.f3291Q1.m121f().getCursor().f3166c.f3141b, 0, this.f3291Q1.m121f().getCursor().f3166c.f3141b, this.f3291Q1.m121f().getText().m2142n(this.f3291Q1.m121f().getCursor().f3166c.f3141b));
                }
                return true;
            case R.id.duplicate /* 2131230920 */:
                if (this.f3291Q1.m120e() != 0) {
                    this.f3291Q1.m121f().getText().m2151w(this.f3291Q1.m121f().getCursor().f3166c.f3141b, this.f3291Q1.m121f().getText().m2142n(this.f3291Q1.m121f().getCursor().f3166c.f3141b), "\n".concat(this.f3291Q1.m121f().getText().m2150v(this.f3291Q1.m121f().getText().m2144p().f3166c.f3141b)));
                }
                return true;
            case R.id.editor_line_number /* 2131230958 */:
                if (this.f3301a2.isChecked()) {
                    this.f3301a2.setChecked(false);
                } else {
                    this.f3301a2.setChecked(true);
                }
                if (this.f3291Q1.m120e() != 0) {
                    this.f3291Q1.m121f().setLineNumberEnabled(this.f3301a2.isChecked());
                }
                editor.putBoolean("showline", this.f3301a2.isChecked());
                editor.apply();
                return true;
            case R.id.frame /* 2131230996 */:
                if (this.f3291Q1.m120e() != 0) {
                    Code m121f = this.f3291Q1.m121f();
                    C0645i cursor = m121f.getCursor();
                    if (cursor.m2163a()) {
                        C0641e text = m121f.getText();
                        C0638b c0638b = cursor.f3166c;
                        int i7 = c0638b.f3141b;
                        int i8 = c0638b.f3142c;
                        C0638b c0638b2 = cursor.f3167d;
                        String m2187v0 = m121f.m2187v0(text.m2123G(i7, i8, c0638b2.f3141b, c0638b2.f3142c).toString(), true);
                        if (m2187v0 != null) {
                            C0641e text2 = m121f.getText();
                            C0638b c0638b3 = cursor.f3166c;
                            int i9 = c0638b3.f3141b;
                            int i10 = c0638b3.f3142c;
                            C0638b c0638b4 = cursor.f3167d;
                            text2.m2119C(i9, i10, m2187v0, c0638b4.f3141b, c0638b4.f3142c);
                        }
                    } else {
                        int i11 = m121f.getText().m2144p().f3166c.f3141b;
                        String m2187v02 = m121f.m2187v0(m121f.getText().toString(), true);
                        if (m2187v02 != null) {
                            m121f.getText().m2118B(0, m121f.getText().f3154s, m2187v02);
                            int m2147s = m121f.getText().m2147s();
                            if (i11 >= m2147s) {
                                i11 = m2147s - 1;
                            }
                            if (i11 < 0 || i11 >= m2147s) {
                                m121f.m3500k0(0, m121f.getText().m2146r(0).f3160e);
                            } else {
                                m121f.m3500k0(i11, m121f.getText().m2146r(i11).f3160e);
                            }
                        }
                    }
                }
                return true;
            case R.id.magnifier /* 2131231097 */:
                if (this.f3303c2.isChecked()) {
                    this.f3303c2.setChecked(false);
                } else {
                    this.f3303c2.setChecked(true);
                }
                if (this.f3291Q1.m120e() != 0) {
                    C1371h0 c1371h0 = (C1371h0) this.f3291Q1.m121f().m3468K(C1371h0.class);
                    boolean isChecked = this.f3303c2.isChecked();
                    c1371h0.f6665x1 = isChecked;
                    if (!isChecked) {
                        c1371h0.m3728a();
                    }
                }
                editor.putBoolean("magnifier", this.f3303c2.isChecked());
                editor.apply();
                return true;
            case R.id.pin_line_number /* 2131231224 */:
                if (this.f3302b2.isChecked()) {
                    this.f3302b2.setChecked(false);
                } else {
                    this.f3302b2.setChecked(true);
                }
                if (this.f3291Q1.m120e() != 0) {
                    this.f3291Q1.m121f().setPinLineNumber(this.f3302b2.isChecked());
                }
                editor.putBoolean("pinline", this.f3302b2.isChecked());
                editor.apply();
                return true;
            case R.id.post /* 2131231226 */:
                if (this.f3291Q1.m120e() != 0) {
                    ViewOnClickListenerC1728d viewOnClickListenerC1728d = this.f3291Q1.f102b.m4123i().f7893e;
                    viewOnClickListenerC1728d.f7903i2.setPanelState(SlidingUpPanelLayout.EnumC0710e.f3565c);
                    viewOnClickListenerC1728d.f7915u2.add("️脚本开始运行\n");
                    C0143v.f267f = new StringBuilder();
                    String c0641e = viewOnClickListenerC1728d.f7906l2.getText().toString();
                    C2083d0 c2083d0 = viewOnClickListenerC1728d.f7904j2;
                    if (c2083d0 != null) {
                        c2083d0.f9497i2.interrupt();
                    }
                    C2083d0 c2083d02 = new C2083d0(viewOnClickListenerC1728d, c0641e);
                    viewOnClickListenerC1728d.f7904j2 = c2083d02;
                    c2083d02.f9497i2.start();
                }
                return true;
            case R.id.removelog /* 2131231239 */:
                if (this.f3291Q1.m120e() != 0) {
                    ViewOnClickListenerC1728d viewOnClickListenerC1728d2 = this.f3291Q1.f102b.m4123i().f7893e;
                    viewOnClickListenerC1728d2.getClass();
                    ArrayList arrayList = new ArrayList();
                    viewOnClickListenerC1728d2.f7915u2 = arrayList;
                    C1695c c1695c = new C1695c(arrayList);
                    viewOnClickListenerC1728d2.f7916v2 = c1695c;
                    viewOnClickListenerC1728d2.f7902h2.setAdapter(c1695c);
                }
                return true;
            case R.id.text_wordwrap /* 2131231359 */:
                if (this.f3300Z1.isChecked()) {
                    this.f3300Z1.setChecked(false);
                } else {
                    this.f3300Z1.setChecked(true);
                }
                if (this.f3291Q1.m120e() != 0) {
                    this.f3291Q1.m121f().setWordwrap(this.f3300Z1.isChecked());
                }
                editor.putBoolean("zdhh", this.f3300Z1.isChecked());
                editor.apply();
                return true;
            case R.id.zip_code /* 2131231427 */:
                if (this.f3291Q1.m120e() != 0) {
                    Code m121f2 = this.f3291Q1.m121f();
                    C0645i cursor2 = m121f2.getCursor();
                    if (cursor2.m2163a()) {
                        C0641e text3 = m121f2.getText();
                        C0638b c0638b5 = cursor2.f3166c;
                        int i12 = c0638b5.f3141b;
                        int i13 = c0638b5.f3142c;
                        C0638b c0638b6 = cursor2.f3167d;
                        String m2187v03 = m121f2.m2187v0(text3.m2123G(i12, i13, c0638b6.f3141b, c0638b6.f3142c).toString(), false);
                        if (m2187v03 != null) {
                            C0641e text4 = m121f2.getText();
                            C0638b c0638b7 = cursor2.f3166c;
                            int i14 = c0638b7.f3141b;
                            int i15 = c0638b7.f3142c;
                            C0638b c0638b8 = cursor2.f3167d;
                            text4.m2119C(i14, i15, m2187v03, c0638b8.f3141b, c0638b8.f3142c);
                        }
                    } else {
                        String m2187v04 = m121f2.m2187v0(m121f2.getText().toString(), false);
                        if (m2187v04 != null) {
                            m121f2.getText().m2118B(0, m121f2.getText().f3154s, m2187v04);
                        }
                    }
                }
                return true;
            default:
                switch (itemId) {
                    case R.id.cut /* 2131230877 */:
                        if (this.f3291Q1.m120e() != 0) {
                            String m2150v2 = this.f3291Q1.m121f().getText().m2150v(this.f3291Q1.m121f().getText().m2144p().f3166c.f3141b);
                            ((ClipboardManager) getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(m2150v2, m2150v2));
                            if (this.f3291Q1.m121f().getText().m2144p().f3166c.f3141b > 0) {
                                this.f3291Q1.m121f().getText().m2136h(this.f3291Q1.m121f().getCursor().f3166c.f3141b - 1, this.f3291Q1.m121f().getText().m2142n(this.f3291Q1.m121f().getCursor().f3166c.f3141b - 1), this.f3291Q1.m121f().getCursor().f3166c.f3141b, this.f3291Q1.m121f().getText().m2142n(this.f3291Q1.m121f().getCursor().f3166c.f3141b));
                            }
                        }
                        return true;
                    case R.id.cutall /* 2131230878 */:
                        if (this.f3291Q1.m120e() != 0 && this.f3291Q1.m121f().getText().m2144p().f3166c.f3141b > 0) {
                            this.f3291Q1.m121f().getText().m2136h(this.f3291Q1.m121f().getCursor().f3166c.f3141b - 1, this.f3291Q1.m121f().getText().m2142n(this.f3291Q1.m121f().getCursor().f3166c.f3141b - 1), this.f3291Q1.m121f().getCursor().f3166c.f3141b, this.f3291Q1.m121f().getText().m2142n(this.f3291Q1.m121f().getCursor().f3166c.f3141b));
                        }
                        return true;
                    default:
                        switch (itemId) {
                            case R.id.infor /* 2131231050 */:
                                if (this.f3291Q1.m120e() != 0) {
                                    m2192x(this.f3291Q1.m121f(), "fornub");
                                }
                                return true;
                            case R.id.inforin /* 2131231051 */:
                                if (this.f3291Q1.m120e() != 0) {
                                    m2192x(this.f3291Q1.m121f(), "forin");
                                }
                                return true;
                            case R.id.infunc /* 2131231052 */:
                                if (this.f3291Q1.m120e() != 0) {
                                    m2192x(this.f3291Q1.m121f(), "function");
                                }
                                return true;
                            default:
                                switch (itemId) {
                                    case R.id.menu_open_log /* 2131231123 */:
                                        SharedPreferences sharedPreferences = f3285f2.getSharedPreferences("data", 0);
                                        f3287h2 = sharedPreferences;
                                        String string = sharedPreferences.getString("scriptPath", Environment.getExternalStorageDirectory() + "/启示录/第一行代码.lua");
                                        View inflate2 = LayoutInflater.from(this).inflate(R.layout.execute, (ViewGroup) null);
                                        ((TextView) inflate2.findViewById(R.id.message)).setText("选择器");
                                        EditTextPath editTextPath = (EditTextPath) inflate2.findViewById(R.id.file);
                                        editTextPath.setText(string);
                                        editTextPath.setDataType(4);
                                        editTextPath.setPathType(1);
                                        inflate2.findViewById(R.id.file_selector).setTag(editTextPath);
                                        DialogInterfaceC0151d.a m5134a = C2078b.m5134a();
                                        m5134a.f374a.f359s = InternalKeyboard.m2247a(inflate2, false);
                                        m5134a.m486c("确定", new DialogInterfaceOnClickListenerC1500n(this, editTextPath));
                                        m5134a.m485b("取消", new DialogInterfaceOnClickListenerC1499m());
                                        C2078b.m5137d(m5134a.m484a(), editTextPath);
                                        return true;
                                    case R.id.menu_partial_select /* 2131231124 */:
                                        View inflate3 = LayoutInflater.from(this).inflate(R.layout.dialog_post, (ViewGroup) null, false);
                                        DialogInterfaceC0151d.a aVar2 = new DialogInterfaceC0151d.a(this);
                                        aVar2.f374a.f359s = inflate3;
                                        DialogInterfaceC0151d m484a = aVar2.m484a();
                                        Button button = (Button) inflate3.findViewById(R.id.dialog_postButtonpost);
                                        EditText editText = (EditText) inflate3.findViewById(R.id.dialog_postEditTexttitle);
                                        TextView textView = (TextView) inflate3.findViewById(R.id.dialog_postTextView);
                                        button.setText("创建");
                                        textView.setText("新建脚本文件");
                                        button.setOnClickListener(new ViewOnClickListenerC0687b(editText, m484a));
                                        m484a.getWindow().setBackgroundDrawableResource(R.color.transparent);
                                        m484a.show();
                                        m484a.getWindow().setLayout((getResources().getDisplayMetrics().widthPixels / 4) * 3, -2);
                                        return true;
                                    case R.id.menu_redo /* 2131231125 */:
                                        if (this.f3291Q1.m120e() != 0) {
                                            this.f3291Q1.m121f().m3491f0();
                                        }
                                        return true;
                                    case R.id.menu_save_as_log /* 2131231126 */:
                                        this.f3291Q1.m122g();
                                        return true;
                                    case R.id.menu_save_log /* 2131231127 */:
                                        if (this.f3291Q1.m120e() != 0) {
                                            C1726b m4123i = this.f3291Q1.f102b.m4123i();
                                            try {
                                                if (m4123i.f7890X.m2188w0(m4123i.m4197c())) {
                                                    C0391d0.m1370q("保存成功", true);
                                                } else {
                                                    C0391d0.m1370q("保存失败", false);
                                                }
                                            } catch (IOException e7) {
                                                C0391d0.m1370q("保存失败" + e7.getMessage(), false);
                                            }
                                        }
                                        return true;
                                    case R.id.menu_search_find /* 2131231128 */:
                                        if (this.f3291Q1.m120e() != 0) {
                                            ViewOnClickListenerC1728d viewOnClickListenerC1728d3 = this.f3291Q1.f102b.m4123i().f7893e;
                                            if (!viewOnClickListenerC1728d3.f7908n2.isShown()) {
                                                viewOnClickListenerC1728d3.f7908n2.setVisibility(0);
                                                viewOnClickListenerC1728d3.f7903i2.setPanelHeight(ViewOnClickListenerC1728d.m4199R(ViewOnClickListenerC1728d.f7900A2, viewOnClickListenerC1728d3.f7907m2.getHeight()));
                                            }
                                            C0641e text5 = viewOnClickListenerC1728d3.f7906l2.getText();
                                            C0645i m2144p = text5.m2144p();
                                            if (m2144p.m2163a()) {
                                                C0638b c0638b9 = m2144p.f3166c;
                                                int i16 = c0638b9.f3141b;
                                                int i17 = c0638b9.f3142c;
                                                C0638b c0638b10 = m2144p.f3167d;
                                                viewOnClickListenerC1728d3.f7910p2.setText(text5.m2123G(i16, i17, c0638b10.f3141b, c0638b10.f3142c).toString());
                                            }
                                        }
                                        return true;
                                    case R.id.menu_search_gotoLine /* 2131231129 */:
                                        if (this.f3291Q1.m120e() != 0) {
                                            Code m121f3 = this.f3291Q1.m121f();
                                            m121f3.getClass();
                                            Tools.getActivity().m1907s().mo1911A(new C1489c(m121f3));
                                        }
                                        return true;
                                    case R.id.menu_undo /* 2131231130 */:
                                        if (this.f3291Q1.m120e() != 0) {
                                            this.f3291Q1.m121f().m3509r0();
                                        }
                                        return true;
                                    default:
                                        return super.onOptionsItemSelected(menuItem);
                                }
                        }
                }
        }
    }

    @Override // androidx.fragment.app.ActivityC0367q, android.app.Activity
    public final void onPause() {
        super.onPause();
        synchronized (C1124y.class) {
            C1124y.m3301d(this);
        }
    }

    @Override // androidx.fragment.app.ActivityC0367q, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        boolean isExternalStorageManager;
        super.onRequestPermissionsResult(i7, strArr, iArr);
        if (Boolean.valueOf(getSharedPreferences("FirstRun", 0).getBoolean("First", true)).booleanValue()) {
            m2195y("第一行代码.lua");
        }
        if (i7 == 100 && Build.VERSION.SDK_INT >= 30) {
            isExternalStorageManager = Environment.isExternalStorageManager();
            if (!isExternalStorageManager) {
                m2193A();
            }
        }
        if (C0602j.f3001c == null) {
            C0602j.f3001c = new C0602j();
        }
        C0602j c0602j = C0602j.f3001c;
        c0602j.getClass();
        if (100 == i7) {
            boolean z6 = false;
            for (int i8 : iArr) {
                if (i8 == -1) {
                    z6 = true;
                }
            }
            if (!z6) {
                c0602j.f3002a.getClass();
                return;
            }
            String packageName = getPackageName();
            if (c0602j.f3003b == null) {
                DialogInterfaceC0151d.a aVar = new DialogInterfaceC0151d.a(this);
                aVar.f374a.f347g = "已禁用权限，请手动授予";
                aVar.m486c("设置", new DialogInterfaceOnClickListenerC0601i(c0602j, packageName, this));
                aVar.m485b("取消", new DialogInterfaceOnClickListenerC0600h(c0602j));
                c0602j.f3003b = aVar.m484a();
            }
            c0602j.f3003b.show();
        }
    }

    @Override // androidx.fragment.app.ActivityC0367q, android.app.Activity
    public final void onResume() {
        super.onResume();
        synchronized (C1124y.class) {
            if (C1124y.m3299b(this, "onResume(...)")) {
                if (!C1124y.m3300c("onResume")) {
                    C1023j3.f5170m.m382g(6, "[WARNING] onResume must be called in Activity.onResume()");
                } else if (!C1124y.m3298a(this)) {
                    C0991f.m3015d().m3020g(this, false);
                }
            }
        }
    }

    @Override // p168v1.AbstractActivityC2011a
    /* renamed from: v */
    public final void mo2194v() {
    }

    /* renamed from: y */
    public final void m2195y(String str) {
        StringBuilder sb;
        Log.e("创建", "正在创建");
        String str2 = Environment.getExternalStorageDirectory() + "/启示录";
        SharedPreferences sharedPreferences = getSharedPreferences("FirstRun", 0);
        File file = new File(str2);
        if (file.exists()) {
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                String str3 = File.separator;
                sb2.append(str3);
                sb2.append(str);
                new FileWriter(sb2.toString()).close();
                m2196z(str2 + str3 + str);
                m2191w(str2 + str3 + str, str);
                sharedPreferences.edit().putBoolean("First", false).commit();
                return;
            } catch (Exception e7) {
                e = e7;
                e.printStackTrace();
                sb = new StringBuilder("创建失败：");
            }
        } else {
            file.mkdirs();
            try {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str2);
                String str4 = File.separator;
                sb3.append(str4);
                sb3.append(str);
                new FileWriter(sb3.toString()).close();
                m2196z(str2 + str4 + str);
                m2191w(str2 + str4 + str, str);
                sharedPreferences.edit().putBoolean("First", false).commit();
                return;
            } catch (Exception e8) {
                e = e8;
                e.printStackTrace();
                sb = new StringBuilder("创建失败：");
            }
        }
        sb.append(e.getMessage());
        C0391d0.m1370q(sb.toString(), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: z */
    public final void m2196z(String str) {
        JSONObject jSONObject;
        C1735k c1735k;
        AbstractC1693a.a bVar;
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.isFile() && file.canRead()) {
                C0033d c0033d = this.f3291Q1;
                c0033d.getClass();
                boolean z6 = false;
                if (file.exists() && file.canRead() && file.canWrite()) {
                    int mo4299c = c0033d.f102b.mo4299c();
                    int i7 = 0;
                    while (true) {
                        if (i7 < mo4299c) {
                            C1732h c1732h = (C1732h) ((AbstractC1821a.a) c0033d.f102b.f8251e.get(i7)).f8254b;
                            if (c1732h.f7934X.getPath() != null && c1732h.f7934X.getPath().equals(file.getPath())) {
                                c0033d.m123h(i7);
                                break;
                            }
                            i7++;
                        } else {
                            C1694b c1694b = c0033d.f102b;
                            c1694b.getClass();
                            C1732h c1732h2 = new C1732h(file, 0, null);
                            synchronized (c1694b.f8252f) {
                                ArrayList<AbstractC1821a<T>.a<T>> arrayList = c1694b.f8251e;
                                AbstractC1821a<T>.b<T> bVar2 = c1694b.f8249c;
                                long j7 = bVar2.f8255a;
                                bVar2.f8255a = j7 + 1;
                                arrayList.add(new AbstractC1821a.a(j7, c1732h2));
                            }
                            c1694b.m5503e();
                            if (!c1694b.f7632m) {
                                c1694b.m4300h();
                                if (c1694b.m4300h().size() > 0) {
                                    C1732h c1732h3 = c1694b.m4300h().get(0);
                                    c1694b.f7632m = true;
                                    c1694b.m4300h();
                                    if (c1732h3 instanceof Serializable) {
                                        bVar = new AbstractC1693a.c();
                                    } else {
                                        if (!(c1732h3 instanceof Parcelable)) {
                                            throw new IllegalArgumentException("Item of StatePagerAdapter must be subclass of Serializable or Parcelable.");
                                        }
                                        bVar = new AbstractC1693a.b();
                                    }
                                    c1694b.f7630k = bVar;
                                }
                            }
                            c0033d.m123h(mo4299c);
                            z6 = true;
                        }
                    }
                }
                if (z6) {
                    int i8 = C1736l.f7944c;
                    C1734j c1734j = new C1734j(getApplicationContext());
                    String path = file.getPath();
                    if (TextUtils.isEmpty(path)) {
                        return;
                    }
                    try {
                        JSONObject m4203a = c1734j.m4203a();
                        boolean has = m4203a.has(path);
                        C1734j.a aVar = c1734j.f7938b;
                        if (has) {
                            jSONObject = m4203a.getJSONObject(path);
                            aVar.getClass();
                            c1735k = C1734j.a.m4206a(jSONObject);
                            c1735k.f7942d = path;
                            c1735k.f7940b = true;
                        } else {
                            jSONObject = new JSONObject();
                            C1735k c1735k2 = new C1735k();
                            c1735k2.f7942d = path;
                            c1735k2.f7939a = null;
                            c1735k2.f7940b = true;
                            m4203a.put(path, jSONObject);
                            c1735k = c1735k2;
                        }
                        aVar.getClass();
                        C1734j.a.m4207b(jSONObject, c1735k);
                        c1734j.m4204b(m4203a);
                    } catch (JSONException e7) {
                        e7.printStackTrace();
                    }
                }
            }
        }
    }
}
