package com.so.revelation.lua;

import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import androidx.activity.C0143v;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.C0391d0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.so.revelation.lua.Baidu.TransApi;
import com.so.revelation.lua.Baidu.TranslateResult;
import com.so.revelation.lua.View.widget.Chouti;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import p002a1.C0017d;
import p016c.ActivityC0556j;
import p054g4.C1226h;
import p091l1.RunnableC1490d;
import p091l1.RunnableC1491e;
import p091l1.RunnableC1492f;
import p091l1.RunnableC1493g;
import p091l1.RunnableC1494h;
import p091l1.RunnableC1495i;
import p119o6.C1677d;
import p122p1.C1699g;
import p126p6.C1709c;
import p142r6.C1850g;
import p142r6.C1852i;
import p150s6.C1906b;
import p150s6.C1910f;
import p158t6.C1948c;

/* loaded from: classes.dex */
public class DemoActivity extends ActivityC0556j {

    /* renamed from: M1 */
    public RecyclerView f3264M1;

    /* renamed from: N1 */
    public ArrayList f3265N1 = new ArrayList();

    /* renamed from: O1 */
    public ArrayList f3266O1 = new ArrayList();

    /* renamed from: P1 */
    public ArrayList f3267P1 = new ArrayList();

    /* renamed from: Q1 */
    public ArrayList f3268Q1;

    /* renamed from: R1 */
    public ArrayList f3269R1;

    /* renamed from: S1 */
    public ArrayList f3270S1;

    /* renamed from: T1 */
    public ArrayList f3271T1;

    /* renamed from: U1 */
    public C1699g f3272U1;

    /* renamed from: V1 */
    public Chouti f3273V1;

    /* renamed from: W1 */
    public TextView f3274W1;

    /* renamed from: X1 */
    public final String f3275X1;

    /* renamed from: Y1 */
    public String f3276Y1;

    /* renamed from: Z1 */
    public Switch f3277Z1;

    /* renamed from: com.so.revelation.lua.DemoActivity$a */
    public class C0683a implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        public int f3278a = 0;

        /* renamed from: com.so.revelation.lua.DemoActivity$a$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                String str;
                C0683a c0683a = C0683a.this;
                DemoActivity demoActivity = DemoActivity.this;
                demoActivity.getClass();
                demoActivity.f3265N1 = new ArrayList();
                demoActivity.f3266O1 = new ArrayList();
                demoActivity.f3267P1 = new ArrayList();
                demoActivity.f3268Q1 = new ArrayList();
                demoActivity.f3269R1 = new ArrayList();
                demoActivity.f3270S1 = new ArrayList();
                demoActivity.f3271T1 = new ArrayList();
                String concat = C0017d.m73L(demoActivity.f3275X1).concat("");
                int i7 = 1;
                if (concat != "") {
                    C1906b c1906b = new C1906b();
                    C1850g m4528d = c1906b.m4528d(new StringReader(concat), "", new C1910f(c1906b));
                    C1948c m4359C = m4528d.m4359C("memtitle");
                    C1948c m4359C2 = m4528d.m4359C("memproto");
                    C1948c m4359C3 = m4528d.m4359C("memdoc");
                    Iterator<C1852i> it = m4359C.iterator();
                    while (it.hasNext()) {
                        C1852i next = it.next();
                        demoActivity.f3265N1.add(next.m4364H());
                        demoActivity.f3266O1.add(next.m4364H());
                    }
                    Iterator<C1852i> it2 = m4359C2.iterator();
                    while (it2.hasNext()) {
                        demoActivity.f3267P1.add(it2.next().m4364H());
                    }
                    Iterator<C1852i> it3 = m4359C3.iterator();
                    int i8 = 0;
                    while (it3.hasNext()) {
                        C1852i next2 = it3.next();
                        i8 += i7;
                        StringBuilder sb = new StringBuilder();
                        StringBuilder sb2 = new StringBuilder();
                        demoActivity.f3268Q1.add(next2.m4363G("p").m4548b().toString());
                        demoActivity.f3270S1.add(next2.m4359C("section return").m4548b().toString());
                        Iterator<C1852i> it4 = next2.m4359C("line").iterator();
                        while (it4.hasNext()) {
                            sb.append(it4.next().m4364H().toString() + "\n");
                        }
                        for (int i9 = 0; i9 < next2.m4363G("td").size(); i9++) {
                            C1852i c1852i = next2.m4363G("td").get(i9);
                            if (i9 % 2 != 0) {
                                int size = next2.m4363G("td").size();
                                m4359C3.size();
                                demoActivity.f3274W1.post(new RunnableC1494h(demoActivity, i8, i9, size));
                                str = "     " + ((TranslateResult) new C1226h().m3443a(new TransApi().getTransResult(c1852i.m4364H().toString() + "\nend", "en", "zh"), TranslateResult.class)).getTrans_result().get(0).getDst().toString() + "\n";
                            } else {
                                str = " ▪" + c1852i.m4364H().toString() + "▪\n";
                            }
                            sb2.append(str);
                        }
                        demoActivity.f3269R1.add(sb2);
                        demoActivity.f3271T1.add(sb);
                        demoActivity.f3274W1.post(new RunnableC1493g(demoActivity));
                        i7 = 1;
                    }
                    demoActivity.f3264M1.post(new RunnableC1495i(demoActivity));
                }
                c0683a.f3278a = 2;
                DemoActivity.this.f3277Z1.setClickable(true);
            }
        }

        /* renamed from: com.so.revelation.lua.DemoActivity$a$b */
        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0683a c0683a = C0683a.this;
                DemoActivity.this.m2189u();
                c0683a.f3278a = 0;
                DemoActivity.this.f3277Z1.setClickable(true);
            }
        }

        public C0683a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z6) {
            Boolean bool;
            Thread thread;
            Boolean bool2;
            DemoActivity demoActivity = DemoActivity.this;
            try {
                if (z6) {
                    demoActivity.f3277Z1.setClickable(false);
                    if (this.f3278a != 0) {
                        return;
                    }
                    this.f3278a = -1;
                    C0391d0.m1370q("开启自动翻译参数", true);
                    File file = new File(demoActivity.f3275X1);
                    if (file.exists()) {
                        bool2 = Boolean.TRUE;
                    } else {
                        file.createNewFile();
                        bool2 = Boolean.FALSE;
                    }
                    if (!bool2.booleanValue()) {
                        return;
                    } else {
                        thread = new Thread(new a());
                    }
                } else {
                    if (this.f3278a != 2) {
                        return;
                    }
                    demoActivity.f3277Z1.setClickable(false);
                    this.f3278a = -1;
                    File file2 = new File(demoActivity.f3275X1);
                    if (file2.exists()) {
                        bool = Boolean.TRUE;
                    } else {
                        file2.createNewFile();
                        bool = Boolean.FALSE;
                    }
                    if (!bool.booleanValue()) {
                        return;
                    } else {
                        thread = new Thread(new b());
                    }
                }
                thread.start();
            } catch (IOException e7) {
                System.out.println(e7.getMessage());
            }
        }
    }

    /* renamed from: com.so.revelation.lua.DemoActivity$b */
    public class RunnableC0684b implements Runnable {
        public RunnableC0684b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            DemoActivity.this.m2189u();
        }
    }

    /* renamed from: com.so.revelation.lua.DemoActivity$c */
    public class RunnableC0685c implements Runnable {
        public RunnableC0685c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            StringBuilder sb;
            DemoActivity demoActivity = DemoActivity.this;
            demoActivity.f3274W1.post(new RunnableC1490d(demoActivity));
            try {
                C1709c m4064a = C1677d.m4064a();
                C1709c.b bVar = m4064a.f7691a;
                bVar.getClass();
                C0143v.m422T("User-Agent", "Header name must not be empty");
                bVar.m4141e("User-Agent");
                bVar.m4137a("User-Agent", "Mozilla");
                C1850g m4136a = m4064a.m4136a();
                m4136a.m4359C("section see").m4547a();
                C1948c m4359C = m4136a.m4359C("memtitle");
                C1948c m4359C2 = m4136a.m4359C("memproto");
                C1948c m4359C3 = m4136a.m4359C("memdoc");
                m4136a.m4359C("params");
                m4136a.m4359C("section return");
                m4136a.m4359C("section user");
                demoActivity.f3276Y1 = m4136a.m4360D().toString();
                Iterator<C1852i> it = m4359C.iterator();
                while (it.hasNext()) {
                    C1852i next = it.next();
                    demoActivity.f3265N1.add(next.m4364H());
                    demoActivity.f3266O1.add(next.m4364H());
                }
                Iterator<C1852i> it2 = m4359C2.iterator();
                while (it2.hasNext()) {
                    demoActivity.f3267P1.add(it2.next().m4364H());
                }
                Iterator<C1852i> it3 = m4359C3.iterator();
                while (it3.hasNext()) {
                    C1852i next2 = it3.next();
                    StringBuilder sb2 = new StringBuilder();
                    StringBuilder sb3 = new StringBuilder();
                    demoActivity.f3268Q1.add(next2.m4363G("p").m4548b().toString());
                    demoActivity.f3270S1.add(next2.m4359C("section return").m4548b().toString());
                    Iterator<C1852i> it4 = next2.m4359C("line").iterator();
                    while (it4.hasNext()) {
                        sb2.append(it4.next().m4364H().toString() + "\n");
                    }
                    for (int i7 = 0; i7 < next2.m4363G("td").size(); i7++) {
                        C1852i c1852i = next2.m4363G("td").get(i7);
                        if (i7 % 2 != 0) {
                            sb = new StringBuilder();
                            sb.append("     ");
                            sb.append(c1852i.m4364H().toString());
                            sb.append("\n");
                        } else {
                            sb = new StringBuilder();
                            sb.append(" ▪");
                            sb.append(c1852i.m4364H().toString());
                            sb.append("▪\n");
                        }
                        sb3.append(sb.toString());
                    }
                    demoActivity.f3269R1.add(sb3);
                    demoActivity.f3271T1.add(sb2);
                }
                demoActivity.f3274W1.post(new RunnableC1491e(demoActivity));
                demoActivity.f3264M1.post(new RunnableC1495i(demoActivity));
            } catch (IOException e7) {
                Log.e("解析错误", e7.getMessage());
            }
            demoActivity.f3274W1.post(new RunnableC1492f(demoActivity));
        }
    }

    public DemoActivity() {
        new ArrayList();
        this.f3268Q1 = new ArrayList();
        this.f3269R1 = new ArrayList();
        this.f3270S1 = new ArrayList();
        this.f3271T1 = new ArrayList();
        this.f3275X1 = Environment.getExternalStorageDirectory() + "/启示录/ggapi.html";
        this.f3276Y1 = "";
    }

    @Override // androidx.fragment.app.ActivityC0367q, androidx.activity.ComponentActivity, p159u.ActivityC1961h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        long j7;
        StringBuilder sb;
        String str;
        String sb2;
        super.onCreate(bundle);
        setContentView(R.layout.activity_demo);
        m1907s().mo1931x((Toolbar) findViewById(R.id.view_toolbar));
        this.f3264M1 = (RecyclerView) findViewById(R.id.recyclerView);
        this.f3273V1 = (Chouti) findViewById(R.id.expandable_layout_0);
        this.f3274W1 = (TextView) findViewById(R.id.f3359tz);
        Switch r8 = (Switch) findViewById(R.id.activity_demoSwitch);
        this.f3277Z1 = r8;
        r8.setOnCheckedChangeListener(new C0683a());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        linearLayoutManager.m1490b1(1);
        this.f3264M1.setLayoutManager(linearLayoutManager);
        int i7 = C0017d.f14b;
        File file = new File(this.f3275X1);
        try {
            j7 = file.isDirectory() ? C0017d.m100y(file) : C0017d.m99x(file);
        } catch (Exception e7) {
            e7.printStackTrace();
            Log.e("d", "获取文件大小失败!");
            j7 = 0;
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        if (j7 == 0) {
            sb2 = "0B";
        } else {
            if (j7 < 1024) {
                sb = new StringBuilder();
                sb.append(decimalFormat.format(j7));
                str = "B";
            } else if (j7 < 1048576) {
                sb = new StringBuilder();
                sb.append(decimalFormat.format(j7 / 1024.0d));
                str = "KB";
            } else {
                sb = new StringBuilder();
                double d7 = j7;
                if (j7 < 1073741824) {
                    sb.append(decimalFormat.format(d7 / 1048576.0d));
                    str = "MB";
                } else {
                    sb.append(decimalFormat.format(d7 / 1.073741824E9d));
                    str = "GB";
                }
            }
            sb.append(str);
            sb2 = sb.toString();
        }
        (sb2 != "0B" ? new Thread(new RunnableC0684b()) : new Thread(new RunnableC0685c())).start();
    }

    /* renamed from: u */
    public final void m2189u() {
        StringBuilder sb;
        this.f3265N1 = new ArrayList();
        this.f3266O1 = new ArrayList();
        this.f3267P1 = new ArrayList();
        this.f3268Q1 = new ArrayList();
        this.f3269R1 = new ArrayList();
        this.f3270S1 = new ArrayList();
        this.f3271T1 = new ArrayList();
        String concat = C0017d.m73L(this.f3275X1).concat("");
        if (concat != "") {
            C1906b c1906b = new C1906b();
            C1850g m4528d = c1906b.m4528d(new StringReader(concat), "", new C1910f(c1906b));
            C1948c m4359C = m4528d.m4359C("memtitle");
            C1948c m4359C2 = m4528d.m4359C("memproto");
            C1948c m4359C3 = m4528d.m4359C("memdoc");
            Iterator<C1852i> it = m4359C.iterator();
            while (it.hasNext()) {
                C1852i next = it.next();
                this.f3265N1.add(next.m4364H());
                this.f3266O1.add(next.m4364H());
            }
            Iterator<C1852i> it2 = m4359C2.iterator();
            while (it2.hasNext()) {
                this.f3267P1.add(it2.next().m4364H());
            }
            Iterator<C1852i> it3 = m4359C3.iterator();
            while (it3.hasNext()) {
                C1852i next2 = it3.next();
                StringBuilder sb2 = new StringBuilder();
                StringBuilder sb3 = new StringBuilder();
                this.f3268Q1.add(next2.m4363G("p").m4548b().toString());
                this.f3270S1.add(next2.m4359C("section return").m4548b().toString());
                Iterator<C1852i> it4 = next2.m4359C("line").iterator();
                while (it4.hasNext()) {
                    sb2.append(it4.next().m4364H().toString() + "\n");
                }
                for (int i7 = 0; i7 < next2.m4363G("td").size(); i7++) {
                    C1852i c1852i = next2.m4363G("td").get(i7);
                    if (i7 % 2 != 0) {
                        sb = new StringBuilder("     ");
                        sb.append(c1852i.m4364H().toString());
                        sb.append("\n");
                    } else {
                        sb = new StringBuilder(" ▪");
                        sb.append(c1852i.m4364H().toString());
                        sb.append("▪\n");
                    }
                    sb3.append(sb.toString());
                }
                this.f3269R1.add(sb3);
                this.f3271T1.add(sb2);
            }
            this.f3264M1.post(new RunnableC1495i(this));
        }
    }
}
