package p129q1;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.ext.Tools;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.preference.PreferenceManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0159f;
import androidx.appcompat.view.menu.C0161h;
import androidx.appcompat.view.menu.C0162i;
import androidx.appcompat.widget.C0262r0;
import androidx.appcompat.widget.C0272w0;
import androidx.fragment.app.ComponentCallbacksC0361n;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.so.revelation.lua.Code;
import com.so.revelation.lua.EditorActivity;
import com.so.revelation.lua.View.SymbolBarLayout;
import com.so.revelation.lua.View.widget.SlidingUpPanelLayout;
import com.so.revelation.lua.View.widget.TintImageView;
import com.so.revelation.lua.p024gg.ShowApp;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p002a1.C0017d;
import p019c2.C0605m;
import p022c5.C0637a;
import p022c5.C0638b;
import p047f5.C1175f;
import p055g5.C1245b;
import p055g5.C1256m;
import p122p1.C1695c;
import p129q1.C1726b;
import p132q4.C1773b0;
import p132q4.C1775d;
import p132q4.C1796y;
import p132q4.InterfaceC1788q;
import p133q5.C1799b;
import p141r5.AbstractC1840b;
import p141r5.AbstractC1843e;
import p145s1.C1875b;
import p149s5.C1893g;
import p149s5.C1895i;
import p153t1.C1921a;
import p157t5.C1930a;
import p157t5.C1942m;
import p157t5.C1943n;
import p164u5.C1976a;
import p168v1.AbstractApplicationC2012b;
import p175w1.C2083d0;
import p194y4.C2249a;
import p194y4.C2250b;
import p194y4.C2251c;
import p194y4.C2252d;
import p199z1.C2276a;

/* renamed from: q1.d */
/* loaded from: classes.dex */
public class ViewOnClickListenerC1728d extends ComponentCallbacksC0361n implements View.OnClickListener {

    /* renamed from: A2 */
    @SuppressLint({"StaticFieldLeak"})
    public static EditorActivity f7900A2;

    /* renamed from: B2 */
    public static WindowManager f7901B2;

    /* renamed from: h2 */
    public RecyclerView f7902h2;

    /* renamed from: i2 */
    public SlidingUpPanelLayout f7903i2;

    /* renamed from: j2 */
    public C2083d0 f7904j2;

    /* renamed from: k2 */
    public ShowApp f7905k2;

    /* renamed from: l2 */
    public Code f7906l2;

    /* renamed from: m2 */
    public TintImageView f7907m2;

    /* renamed from: n2 */
    public LinearLayout f7908n2;

    /* renamed from: o2 */
    public TextView f7909o2;

    /* renamed from: p2 */
    public EditText f7910p2;

    /* renamed from: q2 */
    public EditText f7911q2;

    /* renamed from: r2 */
    public TableRow f7912r2;

    /* renamed from: s2 */
    public C0262r0 f7913s2;

    /* renamed from: t2 */
    public C1726b f7914t2;

    /* renamed from: v2 */
    public C1695c f7916v2;

    /* renamed from: w2 */
    public Code f7917w2;

    /* renamed from: z2 */
    public SharedPreferences f7920z2;

    /* renamed from: u2 */
    public ArrayList f7915u2 = new ArrayList();

    /* renamed from: x2 */
    public final Handler f7918x2 = new Handler(Looper.getMainLooper());

    /* renamed from: y2 */
    public Runnable f7919y2 = null;

    /* renamed from: q1.d$a */
    public class a implements MenuItem.OnMenuItemClickListener {
        public a() {
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            ViewOnClickListenerC1728d viewOnClickListenerC1728d = ViewOnClickListenerC1728d.this;
            viewOnClickListenerC1728d.f7908n2.setVisibility(8);
            viewOnClickListenerC1728d.f7903i2.setPanelHeight(ViewOnClickListenerC1728d.m4199R(ViewOnClickListenerC1728d.f7900A2, 42.0f));
            viewOnClickListenerC1728d.f7906l2.getSearcher().m3558d();
            return true;
        }
    }

    /* renamed from: q1.d$b */
    public class b implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    /* renamed from: q1.d$c */
    public class c implements AdapterView.OnItemClickListener {

        /* renamed from: c */
        public final /* synthetic */ ArrayAdapter f7922c;

        /* renamed from: e */
        public final /* synthetic */ EditText f7923e;

        public c(ArrayAdapter arrayAdapter, EditText editText) {
            this.f7922c = arrayAdapter;
            this.f7923e = editText;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i7, long j7) {
            String intern = ((String) this.f7922c.getItem(i7)).intern();
            EditText editText = this.f7923e;
            editText.setText(intern);
            editText.setSelection(intern.length());
            ViewOnClickListenerC1728d.this.f7913s2.dismiss();
        }
    }

    /* renamed from: q1.d$d */
    public class d implements InterfaceC1788q<C1796y> {
        @Override // p132q4.InterfaceC1788q
        /* renamed from: d */
        public final void mo2065d(C1796y c1796y, C1773b0 c1773b0) {
            ViewOnClickListenerC1728d.f7900A2.f3291Q1.m125j();
        }
    }

    /* renamed from: q1.d$e */
    public class e implements InterfaceC1788q<C1775d> {
        public e() {
        }

        @Override // p132q4.InterfaceC1788q
        /* renamed from: d */
        public final void mo2065d(C1775d c1775d, C1773b0 c1773b0) {
            ViewOnClickListenerC1728d viewOnClickListenerC1728d = ViewOnClickListenerC1728d.this;
            Runnable runnable = viewOnClickListenerC1728d.f7919y2;
            Handler handler = viewOnClickListenerC1728d.f7918x2;
            if (runnable != null) {
                handler.removeCallbacks(runnable);
            }
            RunnableC1729e runnableC1729e = new RunnableC1729e(this);
            viewOnClickListenerC1728d.f7919y2 = runnableC1729e;
            handler.postDelayed(runnableC1729e, 300L);
        }
    }

    /* renamed from: q1.d$f */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ViewOnClickListenerC1728d viewOnClickListenerC1728d = ViewOnClickListenerC1728d.this;
            int i7 = viewOnClickListenerC1728d.f7917w2.getText().m2144p().f3166c.f3142c;
            viewOnClickListenerC1728d.f7917w2.getText().m2151w(viewOnClickListenerC1728d.f7917w2.getText().m2144p().f3166c.f3141b, i7, "    ");
        }
    }

    /* renamed from: q1.d$g */
    public class g implements TextWatcher {
        public g() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            ViewOnClickListenerC1728d viewOnClickListenerC1728d = ViewOnClickListenerC1728d.this;
            String obj = viewOnClickListenerC1728d.f7910p2.getText().toString();
            if (obj == null || obj.length() == 0) {
                viewOnClickListenerC1728d.f7917w2.getSearcher().m3558d();
                return;
            }
            C1256m searcher = viewOnClickListenerC1728d.f7917w2.getSearcher();
            C1256m.a aVar = new C1256m.a();
            searcher.getClass();
            if (obj.isEmpty()) {
                throw new IllegalArgumentException("pattern length must be > 0");
            }
            searcher.f6198b = obj;
            searcher.f6199c = aVar;
            searcher.m3555a();
            searcher.f6197a.postInvalidate();
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        }
    }

    /* renamed from: q1.d$h */
    public class h implements MenuItem.OnMenuItemClickListener {
        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            return false;
        }
    }

    /* renamed from: q1.d$i */
    public class i implements MenuItem.OnMenuItemClickListener {
        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: P */
    public static void m4198P(EditText editText) {
        String obj = editText.getTag().toString();
        long currentTimeMillis = System.currentTimeMillis();
        Object hashSet = new HashSet();
        Object obj2 = PreferenceManager.getDefaultSharedPreferences(f7900A2).getAll().get(obj);
        if (obj2 != null) {
            hashSet = obj2;
        }
        HashSet hashSet2 = (HashSet) hashSet;
        HashSet hashSet3 = new HashSet();
        String obj3 = editText.getText().toString();
        if (obj3.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet2);
        Collections.sort(arrayList, Collections.reverseOrder());
        Iterator it = arrayList.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            i7++;
            if (i7 >= 10) {
                break;
            }
            int indexOf = str.indexOf("&");
            if (!obj3.equals(str.substring(indexOf + 1)) && indexOf == 13) {
                hashSet3.add(str);
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(currentTimeMillis);
        stringBuffer2.append("&");
        stringBuffer.append(stringBuffer2.toString());
        stringBuffer.append(obj3);
        hashSet3.add(stringBuffer.toString());
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(f7900A2).edit();
        if (hashSet3 instanceof String) {
            edit.putString(obj, hashSet3.toString());
        } else if (hashSet3 instanceof Boolean) {
            edit.putBoolean(obj, ((Boolean) hashSet3).booleanValue());
        } else {
            edit.putStringSet(obj, hashSet3);
        }
        edit.commit();
    }

    /* renamed from: R */
    public static int m4199R(EditorActivity editorActivity, float f7) {
        return (int) ((f7 * editorActivity.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: O */
    public final void m4200O(EditText editText) {
        String obj = editText.getTag().toString();
        Object hashSet = new HashSet();
        Object obj2 = PreferenceManager.getDefaultSharedPreferences(f7900A2).getAll().get(obj);
        if (obj2 != null) {
            hashSet = obj2;
        }
        ArrayList arrayList = new ArrayList((HashSet) hashSet);
        Collections.sort(arrayList, Collections.reverseOrder());
        ArrayAdapter arrayAdapter = new ArrayAdapter(f7900A2, android.R.layout.simple_expandable_list_item_1);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            arrayAdapter.add(str.substring(str.indexOf("&") + 1));
        }
        this.f7913s2.mo880p(arrayAdapter);
        this.f7913s2.f1072X = editText.getWidth();
        C0262r0 c0262r0 = this.f7913s2;
        int height = this.f7906l2.getHeight() / 2;
        c0262r0.getClass();
        if (height < 0 && -2 != height && -1 != height) {
            throw new IllegalArgumentException("Invalid height. Must be a positive value, MATCH_PARENT, or WRAP_CONTENT.");
        }
        c0262r0.f1078s = height;
        C0262r0 c0262r02 = this.f7913s2;
        c0262r02.f1060D1 = editText;
        c0262r02.f1070N1 = true;
        c0262r02.f1071O1.setFocusable(true);
        C0262r0 c0262r03 = this.f7913s2;
        c0262r03.f1061E1 = new c(arrayAdapter, editText);
        c0262r03.mo500a();
    }

    /* renamed from: Q */
    public final void m4201Q(String str) {
        this.f7915u2.add(str);
    }

    /* renamed from: S */
    public final ArrayList m4202S(Code code) {
        C1875b c1875b;
        int i7;
        ArrayList arrayList = new ArrayList();
        try {
            for (AbstractC1843e abstractC1843e : C0017d.m71J(new C1976a(new BufferedReader(new InputStreamReader(new ByteArrayInputStream(this.f7906l2.getText().toString().getBytes()), "UTF-8")))).f8309e) {
                if (abstractC1843e instanceof C1930a) {
                    C1930a c1930a = (C1930a) abstractC1843e;
                    List<AbstractC1840b> list = c1930a.f8721e;
                    List<AbstractC1840b> list2 = c1930a.f8722f;
                    if (list2 == null && list == null) {
                        break;
                    }
                    for (int i8 = 0; i8 < list.size(); i8++) {
                        AbstractC1840b abstractC1840b = list.get(i8);
                        AbstractC1840b abstractC1840b2 = list2.get(i8);
                        if (!c1930a.f8723g) {
                            if (abstractC1840b2 != null && (abstractC1840b2 instanceof C1893g) && (abstractC1840b instanceof C1895i)) {
                                C1895i c1895i = (C1895i) abstractC1840b;
                                c1875b = new C1875b(new C1921a(c1895i.f8452f + "()\nline:" + c1895i.f8314a));
                                i7 = c1895i.f8314a;
                                c1875b.f8415s = i7;
                                arrayList.add(c1875b);
                            }
                        } else if (abstractC1840b instanceof C1895i) {
                            C1895i c1895i2 = (C1895i) abstractC1840b;
                            c1875b = new C1875b(new C1921a(c1895i2.f8452f + "()\nline:" + c1895i2.f8314a));
                            i7 = c1895i2.f8314a;
                            c1875b.f8415s = i7;
                            arrayList.add(c1875b);
                        }
                    }
                } else if (abstractC1843e instanceof C1942m) {
                    C1942m c1942m = (C1942m) abstractC1843e;
                    C1875b c1875b2 = new C1875b(new C1921a(c1942m.f8751e + "()\nline:" + c1942m.f8752f.f8314a));
                    c1875b2.f8415s = c1942m.f8752f.f8314a;
                    arrayList.add(c1875b2);
                } else if (abstractC1843e instanceof C1943n) {
                    C1943n c1943n = (C1943n) abstractC1843e;
                    List<AbstractC1840b> list3 = c1943n.f8754f;
                    List<String> list4 = c1943n.f8753e;
                    if (list3 != null) {
                        for (int i9 = 0; i9 < list3.size(); i9++) {
                            AbstractC1840b abstractC1840b3 = list3.get(i9);
                            if ((abstractC1840b3 instanceof C1893g) && list4 != null && list4.get(i9) != null) {
                                C1875b c1875b3 = new C1875b(new C1921a(list4.get(i9) + "()\nline:" + abstractC1840b3.f8314a));
                                c1875b3.f8415s = abstractC1840b3.f8314a;
                                arrayList.add(c1875b3);
                            }
                        }
                    }
                }
            }
            code.setDiagnostics(null);
        } catch (Exception e7) {
            if ((e7 instanceof C1799b) && this.f7920z2.getBoolean("isErrorAutoComplete", true)) {
                C1799b c1799b = (C1799b) e7;
                C1875b c1875b4 = new C1875b(new C1921a(c1799b.getMessage()));
                c1875b4.f8415s = c1799b.f8171c - 1;
                arrayList.add(c1875b4);
                if (code == null) {
                    return arrayList;
                }
                C2251c c2251c = new C2251c();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new C2252d("修复", new Runnable() { // from class: q1.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        EditorActivity editorActivity = ViewOnClickListenerC1728d.f7900A2;
                    }
                }));
                arrayList2.add(new C2252d("测试", new Runnable() { // from class: q1.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        EditorActivity editorActivity = ViewOnClickListenerC1728d.f7900A2;
                    }
                }));
                String message = e7.getMessage();
                ArrayList arrayList3 = new ArrayList(1);
                Object obj = new Object[]{arrayList2}[0];
                Objects.requireNonNull(obj);
                arrayList3.add(obj);
                C2250b c2250b = new C2250b(c1799b.f8172e, c1799b.f8173m, new C2249a(message, arrayList2, Collections.unmodifiableList(arrayList3)));
                synchronized (c2251c) {
                    c2251c.f10267a.add(c2250b);
                    code.setDiagnostics(c2251c);
                }
            }
        }
        return arrayList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        EditText editText;
        C1175f c1175f;
        EditText editText2;
        C1175f c1175f2;
        int id = view.getId();
        if (id == com.so.revelation.lua.R.id.replaceRecord) {
            editText = this.f7911q2;
        } else {
            if (id != com.so.revelation.lua.R.id.searchRecord) {
                switch (id) {
                    case com.so.revelation.lua.R.id.prev_match /* 2131231428 */:
                        if (this.f7910p2.getText().toString().length() > 0) {
                            C1256m searcher = this.f7906l2.getSearcher();
                            if ((searcher.f6198b != null ? 1 : 0) == 0) {
                                throw new IllegalStateException("pattern not set");
                            }
                            if (searcher.m3556b() && (c1175f = searcher.f6201e) != null && c1175f.f5759b != 0) {
                                C1245b c1245b = searcher.f6197a;
                                int m3379k = c1175f.m3379k(c1245b.getCursor().f3166c.f3140a);
                                if (m3379k == c1175f.f5759b || ((int) (c1175f.m3377i(m3379k) >> 32)) >= m3379k) {
                                    m3379k--;
                                }
                                if (m3379k < 0) {
                                    m3379k = c1175f.f5759b - 1;
                                }
                                if (m3379k >= 0 && m3379k < c1175f.f5759b) {
                                    long m3377i = c1175f.m3377i(m3379k);
                                    int m62A = C0017d.m62A(m3377i);
                                    C0638b m2110o = ((C0637a) c1245b.getText().m2145q()).m2110o((int) (m3377i >> 32));
                                    C0638b m2110o2 = ((C0637a) c1245b.getText().m2145q()).m2110o(m62A);
                                    searcher.f6197a.m3503n0(m2110o.f3141b, m2110o.f3142c, m2110o2.f3141b, m2110o2.f3142c, 6);
                                }
                            }
                            editText2 = this.f7910p2;
                            m4198P(editText2);
                            return;
                        }
                        return;
                    case com.so.revelation.lua.R.id.next_match /* 2131231429 */:
                        if (this.f7910p2.getText().toString().length() > 0) {
                            C1256m searcher2 = this.f7906l2.getSearcher();
                            if (!(searcher2.f6198b != null)) {
                                throw new IllegalStateException("pattern not set");
                            }
                            if (searcher2.m3556b() && (c1175f2 = searcher2.f6201e) != null) {
                                C1245b c1245b2 = searcher2.f6197a;
                                int m3379k2 = c1175f2.m3379k(c1245b2.getCursor().f3167d.f3140a);
                                int i7 = c1175f2.f5759b;
                                int i8 = m3379k2 != i7 ? m3379k2 : 0;
                                if (i8 < i7) {
                                    long m3377i2 = c1175f2.m3377i(i8);
                                    C0638b m2110o3 = ((C0637a) c1245b2.getText().m2145q()).m2110o((int) (m3377i2 >> 32));
                                    C0638b m2110o4 = ((C0637a) c1245b2.getText().m2145q()).m2110o(C0017d.m62A(m3377i2));
                                    searcher2.f6197a.m3503n0(m2110o3.f3141b, m2110o3.f3142c, m2110o4.f3141b, m2110o4.f3142c, 6);
                                }
                            }
                            editText2 = this.f7910p2;
                            m4198P(editText2);
                            return;
                        }
                        return;
                    case com.so.revelation.lua.R.id.replace_all /* 2131231430 */:
                        if (this.f7910p2.getText().length() > 0 && this.f7911q2.getText().length() > 0) {
                            this.f7906l2.getSearcher().m3557c(new b(), this.f7911q2.getText().toString());
                        }
                        editText2 = this.f7911q2;
                        m4198P(editText2);
                        return;
                    case com.so.revelation.lua.R.id.replace_one /* 2131231431 */:
                        if (!this.f7912r2.isShown()) {
                            this.f7912r2.setVisibility(0);
                            this.f7903i2.setPanelHeight(m4199R(f7900A2, this.f7907m2.getHeight() + 47));
                            this.f7909o2.setTextColor(-16777216);
                        }
                        if (this.f7910p2.getText().length() <= 0 || this.f7911q2.getText().length() <= 0) {
                            return;
                        }
                        this.f7906l2.getSearcher().m3557c(null, this.f7911q2.getText().toString());
                        editText2 = this.f7911q2;
                        m4198P(editText2);
                        return;
                    case com.so.revelation.lua.R.id.match_more /* 2131231432 */:
                        C0272w0 c0272w0 = new C0272w0(f7900A2, view);
                        C0159f c0159f = c0272w0.f1105a;
                        C0161h m525a = c0159f.m525a(0, 0, 0, "全词匹配");
                        m525a.setCheckable(true);
                        m525a.setChecked(true);
                        m525a.f517p = new h();
                        C0161h m525a2 = c0159f.m525a(0, 0, 0, "区分大小写");
                        m525a2.setCheckable(true);
                        m525a2.setChecked(true);
                        m525a2.f517p = new i();
                        c0159f.m525a(0, 0, 0, "关闭搜索").f517p = new a();
                        C0162i c0162i = c0272w0.f1106b;
                        if (!c0162i.m561b()) {
                            if (c0162i.f534f == null) {
                                r2 = false;
                            } else {
                                c0162i.m563d(0, 0, false, false);
                            }
                        }
                        if (!r2) {
                            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                        }
                        return;
                    default:
                        return;
                }
            }
            editText = this.f7910p2;
        }
        m4200O(editText);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0361n
    /* renamed from: u */
    public final View mo1245u(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("save_state");
            if (parcelable instanceof C1726b.a) {
                this.f7914t2 = new C1726b((C1726b.a) parcelable);
            }
        }
        f7900A2 = (EditorActivity) m1235f();
        this.f7920z2 = m1235f().getSharedPreferences("data", 0);
        this.f7913s2 = new C0262r0(EditorActivity.f3285f2);
        if (this.f7914t2 == null) {
            Bundle bundle2 = this.f1800Z;
            this.f7914t2 = new C1726b((File) bundle2.getSerializable("KEY_FILE"), bundle2.getInt("KEY_OFFSET"), bundle2.getString("KEY_ENCODING"));
        }
        View inflate = layoutInflater.inflate(com.so.revelation.lua.R.layout.fragment_editor_default, viewGroup, false);
        Code code = (Code) inflate.findViewById(com.so.revelation.lua.R.id.edit_text);
        this.f7917w2 = code;
        code.setEditorFragment(this);
        this.f7917w2.setColorScheme(new C2276a());
        C1726b c1726b = this.f7914t2;
        Code code2 = this.f7917w2;
        c1726b.getClass();
        c1726b.f7894m = Tools.getActivity();
        c1726b.f7890X = code2;
        c1726b.f7893e = this;
        C1725a c1725a = new C1725a(c1726b, c1726b.f7891Y.f7898m);
        c1726b.f7895s = c1725a;
        String absolutePath = c1725a.f7889m.getAbsolutePath();
        code2.getClass();
        new C0605m(new File(absolutePath).getAbsolutePath(), code2.f3262q3).start();
        c1726b.mo4195a();
        Code code3 = this.f7917w2;
        this.f7903i2 = (SlidingUpPanelLayout) inflate.findViewById(com.so.revelation.lua.R.id.sliding);
        SymbolBarLayout symbolBarLayout = (SymbolBarLayout) inflate.findViewById(com.so.revelation.lua.R.id.symbolBarLayout);
        int childCount = symbolBarLayout.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            TextView textView = (TextView) symbolBarLayout.getChildAt(i7);
            textView.setOnClickListener(new ViewOnClickListenerC1730f(code3, textView));
        }
        this.f7902h2 = (RecyclerView) inflate.findViewById(com.so.revelation.lua.R.id.recyclerView);
        this.f7902h2.setLayoutManager(new LinearLayoutManager(1));
        C1695c c1695c = new C1695c(this.f7915u2);
        this.f7916v2 = c1695c;
        this.f7902h2.setAdapter(c1695c);
        this.f7903i2.setScrollableView(this.f7902h2);
        this.f7903i2.setParallaxOffset(100);
        this.f7917w2.m3508q0(C1796y.class, new d());
        this.f7917w2.m3508q0(C1775d.class, new e());
        TintImageView tintImageView = (TintImageView) inflate.findViewById(com.so.revelation.lua.R.id.btn_toggle_panel);
        this.f7907m2 = tintImageView;
        tintImageView.setOnClickListener(new f());
        SharedPreferences sharedPreferences = AbstractApplicationC2012b.f9161c.getSharedPreferences("data", 0);
        this.f7917w2.setBackgroundColor(sharedPreferences.getInt("iv1", 0));
        this.f7907m2.setBackgroundColor(sharedPreferences.getInt("iv1", 0));
        this.f7902h2.setBackgroundColor(sharedPreferences.getInt("iv1", 0));
        this.f7906l2 = this.f7917w2;
        this.f7905k2 = (ShowApp) LayoutInflater.from(f7900A2).inflate(com.so.revelation.lua.R.layout.show_app, (ViewGroup) null);
        f7901B2 = (WindowManager) f7900A2.getSystemService(Tools.removeNewLinesChars("zlqgrz&dvvhwv2&uhv2udz2&fodvvhv51gh{").split("#")[0]);
        this.f7908n2 = (LinearLayout) inflate.findViewById(com.so.revelation.lua.R.id.search_replace);
        ((TextView) inflate.findViewById(com.so.revelation.lua.R.id.match_more)).setOnClickListener(this);
        ((TextView) inflate.findViewById(com.so.revelation.lua.R.id.next_match)).setOnClickListener(this);
        ((TextView) inflate.findViewById(com.so.revelation.lua.R.id.prev_match)).setOnClickListener(this);
        ((TextView) inflate.findViewById(com.so.revelation.lua.R.id.replace_one)).setOnClickListener(this);
        TextView textView2 = (TextView) inflate.findViewById(com.so.revelation.lua.R.id.replace_all);
        this.f7909o2 = textView2;
        textView2.setOnClickListener(this);
        this.f7912r2 = (TableRow) inflate.findViewById(com.so.revelation.lua.R.id.replace);
        ((TextView) inflate.findViewById(com.so.revelation.lua.R.id.searchRecord)).setOnClickListener(this);
        ((TextView) inflate.findViewById(com.so.revelation.lua.R.id.replaceRecord)).setOnClickListener(this);
        this.f7911q2 = (EditText) inflate.findViewById(com.so.revelation.lua.R.id.replaceEdit);
        EditText editText = (EditText) inflate.findViewById(com.so.revelation.lua.R.id.searchEdit);
        this.f7910p2 = editText;
        editText.addTextChangedListener(new g());
        return inflate;
    }
}
