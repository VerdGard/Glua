package com.so.revelation.lua;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.DialogInterfaceC0151d;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.C0335a;
import androidx.fragment.app.C0379y;
import androidx.lifecycle.C0391d0;
import com.so.revelation.lua.View.ColorPicker.C0700d;
import com.so.revelation.lua.View.widget.Chouti;
import java.util.ArrayList;
import p016c.ActivityC0556j;
import p019c2.C0595c;
import p019c2.SharedPreferencesOnSharedPreferenceChangeListenerC0604l;
import p091l1.C1501o;
import p091l1.C1502p;
import p091l1.C1503q;
import p091l1.ViewOnClickListenerC1504r;
import p091l1.ViewOnClickListenerC1505s;
import p159u.C1954a;
import p166v.C2009a;

/* loaded from: classes.dex */
public class MainActivity extends ActivityC0556j implements View.OnClickListener {

    /* renamed from: M1 */
    public TextView f3312M1;

    /* renamed from: N1 */
    public CardView f3313N1;

    /* renamed from: O1 */
    public CardView f3314O1;

    /* renamed from: P1 */
    public String f3315P1;

    /* renamed from: Q1 */
    public Chouti f3316Q1;

    /* renamed from: R1 */
    public TextView f3317R1;

    /* renamed from: S1 */
    public TextView f3318S1;

    /* renamed from: T1 */
    public TextView f3319T1;

    /* renamed from: U1 */
    public TextView f3320U1;

    /* renamed from: V1 */
    public TextView f3321V1;

    /* renamed from: W1 */
    public TextView f3322W1;

    /* renamed from: X1 */
    public TextView f3323X1;

    /* renamed from: Y1 */
    public TextView f3324Y1;

    /* renamed from: Z1 */
    public TextView f3325Z1;

    /* renamed from: a2 */
    public TextView f3326a2;

    /* renamed from: b2 */
    public TextView f3327b2;

    /* renamed from: c2 */
    public TextView f3328c2;

    /* renamed from: d2 */
    public TextView f3329d2;

    /* renamed from: e2 */
    public SharedPreferences f3330e2;

    /* renamed from: f2 */
    public SharedPreferences.Editor f3331f2;

    /* renamed from: g2 */
    public CardView f3332g2;

    /* renamed from: h2 */
    public Chouti f3333h2;

    /* renamed from: i2 */
    public Switch f3334i2;

    /* renamed from: com.so.revelation.lua.MainActivity$a */
    public class ViewOnClickListenerC0691a implements View.OnClickListener {
        public ViewOnClickListenerC0691a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            MainActivity mainActivity = MainActivity.this;
            boolean m2213b = mainActivity.f3333h2.m2213b();
            Chouti chouti = mainActivity.f3333h2;
            if (m2213b) {
                chouti.m2214c(false);
            } else {
                chouti.m2214c(true);
            }
        }
    }

    /* renamed from: com.so.revelation.lua.MainActivity$b */
    public class ViewOnClickListenerC0692b implements View.OnClickListener {

        /* renamed from: com.so.revelation.lua.MainActivity$b$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0595c c0595c;
                try {
                    int i7 = Build.VERSION.SDK_INT;
                    ViewOnClickListenerC0692b viewOnClickListenerC0692b = ViewOnClickListenerC0692b.this;
                    if (i7 >= 23) {
                        String[] strArr = {"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.ACCESS_WIFI_STATE", "android.permission.INTERNET"};
                        ArrayList arrayList = new ArrayList();
                        for (int i8 = 0; i8 < 4; i8++) {
                            if (C2009a.m4894a(MainActivity.this, strArr[i8]) != 0) {
                                arrayList.add(strArr[i8]);
                            }
                        }
                        if (arrayList.size() > 0) {
                            C1954a.m4559d(MainActivity.this, strArr, 100);
                            return;
                        } else {
                            MainActivity mainActivity = MainActivity.this;
                            c0595c = new C0595c(mainActivity, mainActivity);
                        }
                    } else {
                        MainActivity mainActivity2 = MainActivity.this;
                        c0595c = new C0595c(mainActivity2, mainActivity2);
                    }
                    c0595c.m2042a();
                } catch (Exception e7) {
                    C0391d0.m1370q("自动更新异常：" + e7.getMessage(), false);
                }
            }
        }

        public ViewOnClickListenerC0692b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            MainActivity.this.f3313N1.post(new a());
        }
    }

    /* renamed from: com.so.revelation.lua.MainActivity$c */
    public class ViewOnClickListenerC0693c implements View.OnClickListener {

        /* renamed from: com.so.revelation.lua.MainActivity$c$a */
        public class a implements DialogInterface.OnClickListener {

            /* renamed from: c */
            public final /* synthetic */ EditText f3339c;

            public a(EditText editText) {
                this.f3339c = editText;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i7) {
                SharedPreferencesOnSharedPreferenceChangeListenerC0604l sharedPreferencesOnSharedPreferenceChangeListenerC0604l = new SharedPreferencesOnSharedPreferenceChangeListenerC0604l(MainActivity.this);
                String obj = this.f3339c.getText().toString();
                sharedPreferencesOnSharedPreferenceChangeListenerC0604l.f3010a.edit().putString("pref_symbol", obj).apply();
                sharedPreferencesOnSharedPreferenceChangeListenerC0604l.f3011b.put("pref_symbol", obj);
                C0391d0.m1370q("保存成功", true);
            }
        }

        public ViewOnClickListenerC0693c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            MainActivity mainActivity = MainActivity.this;
            EditText editText = new EditText(mainActivity);
            if (SharedPreferencesOnSharedPreferenceChangeListenerC0604l.f3009e == null) {
                SharedPreferencesOnSharedPreferenceChangeListenerC0604l.f3009e = new SharedPreferencesOnSharedPreferenceChangeListenerC0604l(mainActivity.getApplicationContext());
            }
            editText.setText((String) SharedPreferencesOnSharedPreferenceChangeListenerC0604l.f3009e.f3011b.get("pref_symbol"));
            DialogInterfaceC0151d.a aVar = new DialogInterfaceC0151d.a(mainActivity);
            AlertController.C0145b c0145b = aVar.f374a;
            c0145b.f345e = "自定义快捷输入符";
            c0145b.f343c = R.drawable.ic_dialog_info;
            c0145b.f359s = editText;
            aVar.m486c("确定", new a(editText));
            aVar.m485b("取消", null);
            aVar.m484a().show();
        }
    }

    /* renamed from: com.so.revelation.lua.MainActivity$d */
    public class C0694d implements C0700d.j {

        /* renamed from: a */
        public final /* synthetic */ TextView f3341a;

        /* renamed from: b */
        public final /* synthetic */ String f3342b;

        public C0694d(TextView textView, String str) {
            this.f3341a = textView;
            this.f3342b = str;
        }

        /* renamed from: a */
        public final void m2198a(int i7) {
            this.f3341a.setBackgroundColor(i7);
            MainActivity mainActivity = MainActivity.this;
            mainActivity.getClass();
            mainActivity.f3331f2.putInt(this.f3342b, i7);
            mainActivity.f3331f2.commit();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        TextView textView;
        String str;
        int id = view.getId();
        if (id == R.id.editor_colorLinearLayout0) {
            this.f3316Q1.m2212a();
            return;
        }
        if (id == R.id.editor_colorLinearLayout) {
            textView = this.f3317R1;
            str = "toolbar";
        } else if (id == R.id.editor_colorLinearLayout1) {
            textView = this.f3318S1;
            str = "iv1";
        } else if (id == R.id.editor_colorLinearLayout2) {
            textView = this.f3319T1;
            str = "iv2";
        } else if (id == R.id.editor_colorLinearLayout3) {
            textView = this.f3320U1;
            str = "iv3";
        } else if (id == R.id.editor_colorLinearLayout4) {
            textView = this.f3321V1;
            str = "iv4";
        } else if (id == R.id.editor_colorLinearLayout5) {
            textView = this.f3322W1;
            str = "iv5";
        } else if (id == R.id.editor_colorLinearLayout6) {
            textView = this.f3323X1;
            str = "iv6";
        } else if (id == R.id.editor_colorLinearLayout7) {
            textView = this.f3324Y1;
            str = "iv7";
        } else if (id == R.id.editor_colorLinearLayout8) {
            textView = this.f3325Z1;
            str = "iv8";
        } else if (id == R.id.editor_colorLinearLayout9) {
            textView = this.f3326a2;
            str = "iv9";
        } else if (id == R.id.editor_colorLinearLayout10) {
            textView = this.f3327b2;
            str = "iv10";
        } else if (id == R.id.editor_colorLinearLayout11) {
            textView = this.f3328c2;
            str = "iv11";
        } else {
            if (id != R.id.editor_colorLinearLayout12) {
                return;
            }
            textView = this.f3329d2;
            str = "iv12";
        }
        m2197u(textView, str);
    }

    @Override // androidx.fragment.app.ActivityC0367q, androidx.activity.ComponentActivity, p159u.ActivityC1961h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_setting);
        SharedPreferences sharedPreferences = getSharedPreferences("data", 0);
        this.f3330e2 = sharedPreferences;
        this.f3331f2 = sharedPreferences.edit();
        ((CardView) findViewById(R.id.view_set_cloice)).setOnClickListener(new ViewOnClickListenerC1505s(this));
        this.f3316Q1 = (Chouti) findViewById(R.id.expandable_layout_0);
        ((LinearLayout) findViewById(R.id.editor_colorLinearLayout)).setOnClickListener(this);
        TextView textView = (TextView) findViewById(R.id.editor_colorTextView);
        this.f3317R1 = textView;
        textView.setBackgroundColor(this.f3330e2.getInt("toolbar", 0));
        this.f3317R1.setText("#" + String.format("%08X", Integer.valueOf(this.f3330e2.getInt("toolbar", 0))));
        ((LinearLayout) findViewById(R.id.editor_colorLinearLayout1)).setOnClickListener(this);
        TextView textView2 = (TextView) findViewById(R.id.editor_colorTextView1);
        this.f3318S1 = textView2;
        textView2.setBackgroundColor(this.f3330e2.getInt("iv1", 0));
        this.f3318S1.setText("#" + String.format("%08X", Integer.valueOf(this.f3330e2.getInt("iv1", 0))));
        ((LinearLayout) findViewById(R.id.editor_colorLinearLayout2)).setOnClickListener(this);
        TextView textView3 = (TextView) findViewById(R.id.editor_colorTextView2);
        this.f3319T1 = textView3;
        textView3.setBackgroundColor(this.f3330e2.getInt("iv2", 0));
        this.f3319T1.setText("#" + String.format("%08X", Integer.valueOf(this.f3330e2.getInt("iv2", 0))));
        ((LinearLayout) findViewById(R.id.editor_colorLinearLayout3)).setOnClickListener(this);
        TextView textView4 = (TextView) findViewById(R.id.editor_colorTextView3);
        this.f3320U1 = textView4;
        textView4.setBackgroundColor(this.f3330e2.getInt("iv3", 0));
        this.f3320U1.setText("#" + String.format("%08X", Integer.valueOf(this.f3330e2.getInt("iv3", 0))));
        ((LinearLayout) findViewById(R.id.editor_colorLinearLayout4)).setOnClickListener(this);
        TextView textView5 = (TextView) findViewById(R.id.editor_colorTextView4);
        this.f3321V1 = textView5;
        textView5.setBackgroundColor(this.f3330e2.getInt("iv4", 0));
        this.f3321V1.setText("#" + String.format("%08X", Integer.valueOf(this.f3330e2.getInt("iv4", 0))));
        ((LinearLayout) findViewById(R.id.editor_colorLinearLayout5)).setOnClickListener(this);
        TextView textView6 = (TextView) findViewById(R.id.editor_colorTextView5);
        this.f3322W1 = textView6;
        textView6.setBackgroundColor(this.f3330e2.getInt("iv5", 0));
        this.f3322W1.setText("#" + String.format("%08X", Integer.valueOf(this.f3330e2.getInt("iv5", 0))));
        ((LinearLayout) findViewById(R.id.editor_colorLinearLayout6)).setOnClickListener(this);
        TextView textView7 = (TextView) findViewById(R.id.editor_colorTextView6);
        this.f3323X1 = textView7;
        textView7.setBackgroundColor(this.f3330e2.getInt("iv6", 0));
        this.f3323X1.setText("#" + String.format("%08X", Integer.valueOf(this.f3330e2.getInt("iv6", 0))));
        ((LinearLayout) findViewById(R.id.editor_colorLinearLayout7)).setOnClickListener(this);
        TextView textView8 = (TextView) findViewById(R.id.editor_colorTextView7);
        this.f3324Y1 = textView8;
        textView8.setBackgroundColor(this.f3330e2.getInt("iv7", 0));
        this.f3324Y1.setText("#" + String.format("%08X", Integer.valueOf(this.f3330e2.getInt("iv7", 0))));
        ((LinearLayout) findViewById(R.id.editor_colorLinearLayout8)).setOnClickListener(this);
        TextView textView9 = (TextView) findViewById(R.id.editor_colorTextView8);
        this.f3325Z1 = textView9;
        textView9.setBackgroundColor(this.f3330e2.getInt("iv8", 0));
        this.f3325Z1.setText("#" + String.format("%08X", Integer.valueOf(this.f3330e2.getInt("iv8", 0))));
        ((LinearLayout) findViewById(R.id.editor_colorLinearLayout9)).setOnClickListener(this);
        TextView textView10 = (TextView) findViewById(R.id.editor_colorTextView9);
        this.f3326a2 = textView10;
        textView10.setBackgroundColor(this.f3330e2.getInt("iv9", 0));
        this.f3326a2.setText("#" + String.format("%08X", Integer.valueOf(this.f3330e2.getInt("iv9", 0))));
        ((LinearLayout) findViewById(R.id.editor_colorLinearLayout10)).setOnClickListener(this);
        TextView textView11 = (TextView) findViewById(R.id.editor_colorTextView10);
        this.f3327b2 = textView11;
        textView11.setBackgroundColor(this.f3330e2.getInt("iv10", 0));
        this.f3327b2.setText("#" + String.format("%08X", Integer.valueOf(this.f3330e2.getInt("iv10", 0))));
        ((LinearLayout) findViewById(R.id.editor_colorLinearLayout11)).setOnClickListener(this);
        TextView textView12 = (TextView) findViewById(R.id.editor_colorTextView11);
        this.f3328c2 = textView12;
        textView12.setBackgroundColor(this.f3330e2.getInt("iv11", 0));
        this.f3328c2.setText("#" + String.format("%08X", Integer.valueOf(this.f3330e2.getInt("iv11", 0))));
        ((LinearLayout) findViewById(R.id.editor_colorLinearLayout12)).setOnClickListener(this);
        TextView textView13 = (TextView) findViewById(R.id.editor_colorTextView12);
        this.f3329d2 = textView13;
        textView13.setBackgroundColor(this.f3330e2.getInt("iv12", 0));
        this.f3329d2.setText("#" + String.format("%08X", Integer.valueOf(this.f3330e2.getInt("iv12", 0))));
        this.f3332g2 = (CardView) findViewById(R.id.view_setlog);
        this.f3333h2 = (Chouti) findViewById(R.id.expandable_layout_1);
        ((TextView) findViewById(R.id.view_setTextViewlog)).setText("新增：\n1.内置lua5.3官方中午手册\n2.新增解释器打印结果一键清除\n3.新增解释器各个功能按钮的用法提示(长按即可)\n优化：\n1.优化解释器底层逻辑\n修复：\n1.修复某些bug\n天启：\n•在未来，启示录将独立支持游戏脚本的运行，但在此之前，暂时用GG代替，我正在分解GG的功能，请敬请期待！\n\n启示录_v3.0更新\n新增：\n1.启示录内置了与GG同款的luaj，支持多层table的打印以及sting.char函数的转中文。\n2.新增自定义快捷符号(设置里更改，保存后重启启示录)。\n优化：\n1.优化底层逻辑，修复已知bug，社区正在开发，敬请期待！\n\n新增：\n1.新增打印台长按复制打印内容\n优化：\n1.修复了启示录在安卓5.0长按编辑器闪退的问题\n2.修复了启示录对lua函数库(如：table)的代码提示补全\n3.修复了gg函数高亮问题\n4.优化了一键代码格式化的代码缩进规则以及对单行代码进行代码缩进\n5.优化了代码编辑器的字体显示\n6.优化了启示录安装包的体积\n\n启示录v3.1.1紧急更新\n新增：\n1.新增gg.getFile(),gg.toast(),gg.makeRequest(),io库等多个内置函数。\n修复：\n1.修复打印台打印错误信息清除不了的bug。\n\n启示录_v3.2重大来袭\n新增：\n  1.新增gg.alert()，gg.choice()函数等函数\n  2.新增代码编辑器自定义高亮颜色\n优化：\n  1：优化luaj底层逻辑\n\nv3.2.1更新\n新增：\n1.新增代码自动换行自定义(设置-->编辑器设置)\n2.新增多脚本同时编辑(注意：切换tab前先手动保存脚本)\n3.新增启示录bug反馈入口\n修复：\n1.修复脚本保存异常问题\n\nv3.2.2更新\n新增：\n1.新增顶部栏和打印台的背景色以及字体色自定义\n优化：\n1.修复换行超出原匹配数\n2.修复自定义快捷符号不能自适应宽度的bug\n3.修复格式化代码后代码间隔比较宽的bug\n4.修复部分用户顶部栏文件名不显示的bug\n5.修复自动换行代码超出屏幕的bug\n6.优化字体\n\nv3.2.3更新\n1.新增lua社区(注：社区未彻底完善，邀请大家尝尝鲜)\n2.新增启示录登录注册\n3.新增启示录发布帖子功能(注：登录以后才可以发布)\n4.新增个人界面(未完善)\n5.修复已知bug，优化启动性能\n天启：本社区提供的任何源码皆为原创，注意版权！\n\nv3.2.4更新\n1.新增管理员系统(帖子发布后将等待管理员审核后才能在社区展示)\n2.新增我的帖子功能(用户自己发布的帖子可以自行删除查看)\n3.新增账号一键退出\n4.修复社区点击浏览量混乱的bug\n5.优化账号登录注册底层逻辑\n6.优化社区展示逻辑\n\nv3.2.41更新\n1.新增帖子评论区留言系统(二级评论后续开放)\n2.修复已知bug\n\n3.2.42更新\n1.新增评论区二级回复和展示\n2.优化社区刷新逻辑\n3.优化我的帖子动态删除子item(无需刷新即可展示)\n4.优化评论区动态添加子item评论(无需刷新即可展示)\n5.优化管理员审核帖子动态刷新子item(无需刷新即可展示)\n6.优化未登录状态访问社区逻辑\n\n3.2.43更新\n1.更改进入社区为点击菜单(关闭滑动进入社区)\n2.修复评论区时间显示52年异常问题\n3.修复二级评论区回复失效问题\n4.修复编辑器滑动冲突\n\n3.2.5更新\n1.新增帖子详情页\n2.新增用户查询我的评论以及删除\n3.优化评论区按时间从上到下排序\n4.优化评论区添加回复内容\n5.优化登录逻辑(进入帖子详情页必须为登录状态)\n6.修复评论区回复评论点击部分失效问题\n7.修复已知bug\n\n3.2.6 更新\n1.新增社区源码下载保存\n2.新增自动保存(每隔30秒自动保存)\n3.重构GG文档，增加对GG文档的翻译()\n4.优化社区顶部头像显示刷新逻辑\n5.移出代码编辑器的中文翻译(查看翻译请到GG文档)\n6.修复部分机型启动启示录立马闪退的bug\n7.修复GG文档长按复制强制格式为gg.\n天启：启示录迎来了2022的第一个版本更新，在这里祝大家新年快乐！\n\n3.2.7 更新公告\n1.修复GG文档并发爬虫网络请求被拦截(由于这两天重构的GG文档API功能比较简单易懂，并且用的人比较多，在这个情况下多人查看文档导致请求频繁，而GG官网那边对爬虫进行了拦截。本次修复增加了伪浏览器请求爬虫，同时为了避免下次遇到相同的问题，对GG网页进行了缓存，这意味着，你只需要第一次加载爬虫，后续会从本地上去加载。)\n2.修复了自动保存代码会频繁弹出保存成功的这个toast问题\n\n3.2.8 更新公告\n1.新增GG文档翻译参数\n2.修复代码编辑器在虚拟机里长按导致启示录闪退的bug\n3.修复GG文档在虚拟机里打开导致启示录闪退的bug\n\n3.2.9 更新公告\n1.修复格式化代码[::]会导致分开的问题\n2.增加luajavalib库(真正的java多线程摸索以及java数组)\n3.解释器支持中文变量名和函数名\n\nv3.3 更新公告\n1.新增内置函数ap.CalssCompileAll()和ap.ClassLoad()[类编译器,类装载器]\n2.新增记录脚本打开日志(现重启启示录将默认加载上一个脚本)\n3.新增我内置在天庭的函数快捷补全提示\n4.新增脚本创建功能\n5.优化打印台逻辑(现支持滚动到打印信息焦点处)\n6.优化lua线程，改变lua线程为t执行\n7.优化代码编辑器配色储存逻辑(现打开设置编辑器颜色和自定义快捷符号栏更改即可生效无需重启启示录)\n8.优化启示录弹窗背景\n9.修复部分已知bug\n\n3.3.1 更新公告\n1.修复lua解释器运行脚本后未中断的问题\n2.修复内置函数gg.alert()和gg.choice()不同步返回值的问题\n3.优化打印台显示增加了滚动条\n4.更换启示录左面图标\n\n3.3.3更新公告\n--更换代码编辑器高亮颜色选择器为ColorPickerDialog\n--优化了自动保存代码逻辑，在编辑器上添加上次自动保存时间\n--修复打开GGAPI后代码转移到编辑器的致命bug\n--移出社区功能\n\n3.3.4更新公告\n--修复lua线程在执行大量数据导致UI卡顿的问题\n--修复gg.alert()和gg.choice()在多次调用后导致打印台不返回信息的问题\n--修复GGAPI在首次加载只创建文件不输出流的问题\n--优化自动保存适配至Android5.0\n\n3.3.5更新公告\n1.新增变量名快捷补全\n2.新增实时语法检查(完全阶段)\n3.移出执行代码格式化若当前代码有语法错误会清空脚本的彩蛋\n4.修复一个标题栏背景默认色为默认黑色\n↓↓以下是本次luaj的优化更新↓↓\n** 可省略非必要关键字 **\n  省略then if a then end --> if a end\n  省略do while a do end -- while a end\n  省略in for k,v in pairs(t) do end --> for k,v pairs(t) end\n支持switch switch a case 1,3,5,7,9 print(1) case 2,4,6,8 print(2) case 0 print(0) default print(nil) end\n支持when a=when a case 1,3,5,7,9 return 1 case 2,4,6,8 return 2 case 0 return 0 default return nil end\n支持continue\nfor n=1,10 if n%2==0 continue end print(n) end\n** 支持使用{}作为block块标记 **\n  if(b){ print(true) }else{ print(false) }\n  for(k,v pairs(t)){ }\n** 支持foreach**\n  for(k,v : t){ } for k,v : t end\n** 支持defer **\n  defer后语句将在函数结束时运行，多个defer将按照后入先出原则运行。\n** 支持try-catch-finally **\n  try error(\"err\") catch(m) print(\"catch\",m) finally print(\"finally\") end\n** 支持import **\n  import将导入包并设置为局部变量，支持别名。 import\"java.lang.String\" import str \"java.lang.String\"\n\n3.3.6更新公告\n1.新增代码编辑器滚动条\n2.新增gg.makeRequest()、os.exit()、gg.prompt()函数\n3.优化luaj运行逻辑\n4.优化GG文档翻译逻辑\n5.优化打印台布局,动画以及事件交互\n6.优化第一次启动启示录创建文件夹失败的问题\n7.优化luaj++的block块标记逻辑\n\n3.3.61更新日志\n1.优化gg.prompt()函数为跟GG一致\n2.优化启示录文件选择器\n3.优化实时语法检查\n4.优化luaj++(目前中文关键字和英文关键字可共存)\n5.优化打印台和代码编辑器滚动条\n6.优化脚本运行错误出现两次脚本内容\n7.优化启示录体积\n\n3.3.7更新公告\n1.新增gg.showUiButton()、gg.isClickedUiButton()、gg.hideUiButton()、gg.multiChoice()、gg.saveVariable()等函数，具体用法跟GG修改器一致，同时也可以直接打印gg表查看已适配的函数\n2.优化启示录代码编辑器双指缩放，实现真正意义上的放大和缩小\n3.修复启示录lua运行结束不会清除全局变量的bug\n\n3.3.8更新公告\n1.新增多脚本同时编辑以及运行\n2.新增代码文本匹配\n3.新增行跳转\n4.重做toolbar，此次为第三次重写了toolbar的UI\n5.修复了当代码量很大的情况下删除代码造成闪退并且清空代码的bug\n6.修复了在Android7.0以下长按编辑器选择文本标题栏冲突的bug\n6.暂时移出代码配色实时生效功能\n7.暂时移出错误提示\n***你准备好了吗？\n\n4.0更新日志\n1.更换代码编辑器为sora的CodeEditor\n2.重做代码提示补全\n3.移除底部工具栏到标题工具栏\n4.优化安装包体积\n5.修复已知bug");
        this.f3332g2.setOnClickListener(new ViewOnClickListenerC0691a());
        try {
            this.f3315P1 = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        this.f3312M1 = (TextView) findViewById(R.id.view_vs);
        this.f3314O1 = (CardView) findViewById(R.id.setsym);
        this.f3312M1.setText("正式版（v" + this.f3315P1 + "）");
        CardView cardView = (CardView) findViewById(R.id.cv_cardviewgx);
        this.f3313N1 = cardView;
        cardView.setOnClickListener(new ViewOnClickListenerC0692b());
        this.f3314O1.setOnClickListener(new ViewOnClickListenerC0693c());
        Switch r9 = (Switch) findViewById(R.id.view_setSwitch_font);
        r9.setChecked(this.f3330e2.getBoolean("isAssetFont", true));
        r9.setOnCheckedChangeListener(new C1501o(this));
        Switch r92 = (Switch) findViewById(R.id.view_setSwitch_errorAutoComplete);
        r92.setChecked(this.f3330e2.getBoolean("isErrorAutoComplete", true));
        r92.setOnCheckedChangeListener(new C1502p(this));
        Switch r93 = (Switch) findViewById(R.id.view_setSwitch_zdhh);
        this.f3334i2 = r93;
        r93.setChecked(this.f3330e2.getBoolean("zdhh", false));
        this.f3334i2.setOnCheckedChangeListener(new C1503q(this));
        ((CardView) findViewById(R.id.view_set_fkbug)).setOnClickListener(new ViewOnClickListenerC1504r(this));
    }

    @Override // p016c.ActivityC0556j, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        if (i7 == 82) {
            return true;
        }
        if (i7 != 4) {
            return super.onKeyDown(i7, keyEvent);
        }
        EditorActivity.m2190B();
        finish();
        return false;
    }

    /* renamed from: u */
    public final void m2197u(TextView textView, String str) {
        int[] iArr = C0700d.f3457P2;
        int intValue = Integer.valueOf(C0700d.m2202V(((Object) textView.getText()) + "")).intValue();
        C0700d.f3458Q2 = new C0694d(textView, str);
        C0700d c0700d = new C0700d();
        Bundle bundle = new Bundle();
        bundle.putInt("id", 0);
        bundle.putInt("dialogType", 0);
        bundle.putInt("color", intValue);
        bundle.putIntArray("presets", iArr);
        bundle.putBoolean("alpha", true);
        bundle.putBoolean("allowCustom", true);
        bundle.putBoolean("allowPresets", false);
        bundle.putInt("dialogTitle", R.string.cpv_default_title);
        bundle.putBoolean("showColorShades", true);
        bundle.putInt("colorShape", 1);
        bundle.putInt("presetsButtonText", R.string.cpv_presets);
        bundle.putInt("customButtonText", R.string.cpv_custom);
        bundle.putInt("selectedButtonText", R.string.cpv_select);
        c0700d.m1232M(bundle);
        C0379y c0379y = this.f1839G1.f1866a.f1868X;
        c0700d.f1760u2 = false;
        c0700d.f1761v2 = true;
        c0379y.getClass();
        C0335a c0335a = new C0335a(c0379y);
        c0335a.m1136e(0, c0700d, "color-picker-dialog", 1);
        c0335a.m1135d(false);
    }
}
