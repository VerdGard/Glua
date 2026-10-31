package com.so.revelation.lua.p024gg;

import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ApplicationInfo;
import android.ext.Config;
import android.ext.Tools;
import android.os.Build;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.activity.C0143v;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.DialogInterfaceC0151d;
import androidx.lifecycle.C0391d0;
import com.so.revelation.lua.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import p120p.C1686g;
import p175w1.C2078b;
import p175w1.C2088g;
import p175w1.C2101m0;
import p175w1.C2108q;
import p175w1.RunnableC2082d;

/* loaded from: classes.dex */
public class PathSelector extends Button implements View.OnClickListener {

    /* renamed from: c */
    public static boolean f3655c = true;

    /* renamed from: com.so.revelation.lua.gg.PathSelector$a */
    public class C0725a implements Comparator<C0729e> {

        /* renamed from: a */
        public final /* synthetic */ StringBuilder f3656a;

        public C0725a(StringBuilder sb) {
            this.f3656a = sb;
        }

        @Override // java.util.Comparator
        public final int compare(C0729e c0729e, C0729e c0729e2) {
            C0729e c0729e3 = c0729e;
            C0729e c0729e4 = c0729e2;
            boolean z6 = c0729e3.f3674b;
            boolean z7 = c0729e4.f3674b;
            String str = c0729e3.f3675c;
            String str2 = c0729e4.f3675c;
            int m462s = z6 != z7 ? z6 ? -1 : 1 : C0143v.m462s(str, str2);
            char c7 = z6 ? 'D' : 'F';
            StringBuilder sb = this.f3656a;
            sb.append(c7);
            sb.append(':');
            sb.append(c0729e3);
            sb.append(':');
            sb.append(str);
            sb.append('\n');
            sb.append(z7 ? 'D' : 'F');
            sb.append(':');
            sb.append(c0729e4);
            sb.append(':');
            sb.append(str2);
            sb.append('\n');
            sb.append(m462s);
            sb.append('\n');
            return m462s;
        }
    }

    /* renamed from: com.so.revelation.lua.gg.PathSelector$c */
    public static class C0727c implements Comparator<C0729e> {

        /* renamed from: a */
        public final boolean f3671a;

        public C0727c(boolean z6) {
            this.f3671a = z6;
        }

        /* JADX WARN: Removed duplicated region for block: B:4:0x002a A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:6:0x002c A[RETURN, SYNTHETIC] */
        @Override // java.util.Comparator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int compare(com.so.revelation.lua.p024gg.PathSelector.C0729e r4, com.so.revelation.lua.p024gg.PathSelector.C0729e r5) {
            /*
                r3 = this;
                com.so.revelation.lua.gg.PathSelector$e r4 = (com.so.revelation.lua.p024gg.PathSelector.C0729e) r4
                com.so.revelation.lua.gg.PathSelector$e r5 = (com.so.revelation.lua.p024gg.PathSelector.C0729e) r5
                boolean r0 = r4.f3674b
                boolean r1 = r5.f3674b
                if (r0 == r1) goto Ld
                if (r0 == 0) goto L2a
                goto L2c
            Ld:
                boolean r0 = r3.f3671a     // Catch: java.lang.Throwable -> L2e
                if (r0 == 0) goto L1a
                java.lang.String r4 = r4.f3675c     // Catch: java.lang.Throwable -> L2e
                java.lang.String r5 = r5.f3675c     // Catch: java.lang.Throwable -> L2e
                int r4 = androidx.activity.C0143v.m462s(r4, r5)     // Catch: java.lang.Throwable -> L2e
                goto L2f
            L1a:
                java.io.File r4 = r4.f3673a     // Catch: java.lang.Throwable -> L2e
                long r0 = r4.lastModified()     // Catch: java.lang.Throwable -> L2e
                java.io.File r4 = r5.f3673a     // Catch: java.lang.Throwable -> L2e
                long r4 = r4.lastModified()     // Catch: java.lang.Throwable -> L2e
                int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r2 > 0) goto L2c
            L2a:
                r4 = 1
                goto L2f
            L2c:
                r4 = -1
                goto L2f
            L2e:
                r4 = 0
            L2f:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.so.revelation.lua.p024gg.PathSelector.C0727c.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    /* renamed from: com.so.revelation.lua.gg.PathSelector$d */
    public static class C0728d extends C2088g<File> {

        /* renamed from: c */
        public final ViewOnClickListenerC0726b f3672c;

        public C0728d(ViewOnClickListenerC0726b viewOnClickListenerC0726b, Context context, ArrayList arrayList) {
            super(context, arrayList);
            this.f3672c = viewOnClickListenerC0726b;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final View getView(int i7, View view, ViewGroup viewGroup) {
            long j7;
            ViewOnClickListenerC0726b viewOnClickListenerC0726b = this.f3672c;
            PathSelector pathSelector = viewOnClickListenerC0726b.f3659C1;
            File file = null;
            if (view == null) {
                view = LayoutInflater.from(pathSelector.getContext()).inflate(R.layout.path_item, (ViewGroup) null);
                C0730f c0730f = new C0730f();
                c0730f.f3677b = (TextView) view.findViewById(R.id.name);
                c0730f.f3676a = (TextView) view.findViewById(R.id.date);
                c0730f.f3678c = (TextView) view.findViewById(R.id.size);
                Config.setIconSize((ImageView) view.findViewById(R.id.icon));
                view.setTag(c0730f);
            }
            try {
                file = viewOnClickListenerC0726b.f3663c.getItem(i7);
            } catch (IndexOutOfBoundsException e7) {
                Log.w("Failed get item: " + i7, e7);
            }
            if (file == null) {
                file = new File(viewOnClickListenerC0726b.f3661Y, "???");
            }
            C0730f c0730f2 = (C0730f) view.getTag();
            String name = file.getName();
            view.setBackgroundColor(name.endsWith(".lua") ? viewOnClickListenerC0726b.f3665m : name.endsWith(".txt") ? viewOnClickListenerC0726b.f3666s : name.endsWith(".lasm") ? viewOnClickListenerC0726b.f3664e : 0);
            c0730f2.f3677b.setText(name);
            long j8 = -1;
            try {
                j8 = PathSelector.m2254b(file) ? -1L : file.length();
                j7 = file.lastModified();
            } catch (Throwable th) {
                Log.w("Failed get info: " + file.getAbsolutePath(), th);
                j7 = -1L;
            }
            c0730f2.f3678c.setText(j8 >= 0 ? Tools.formatFileSize(pathSelector.getContext(), j8) : "");
            c0730f2.f3676a.setText(j7 > 0 ? DateFormat.format("yyyy-MM-dd kk:mm:ss", j7) : "");
            return view;
        }
    }

    /* renamed from: com.so.revelation.lua.gg.PathSelector$e */
    public static class C0729e {

        /* renamed from: a */
        public final File f3673a;

        /* renamed from: b */
        public final boolean f3674b;

        /* renamed from: c */
        public final String f3675c;

        public C0729e(boolean z6, String str, File file) {
            this.f3673a = file;
            this.f3675c = str;
            this.f3674b = z6;
        }
    }

    /* renamed from: com.so.revelation.lua.gg.PathSelector$f */
    public class C0730f {

        /* renamed from: a */
        public TextView f3676a;

        /* renamed from: b */
        public TextView f3677b;

        /* renamed from: c */
        public TextView f3678c;
    }

    public PathSelector(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setText("...");
        setOnClickListener(this);
    }

    /* renamed from: a */
    public static void m2253a(ArrayList arrayList, String str, String str2) {
        if (str2 == null) {
            return;
        }
        if ((str == null ? (char) 1 : (char) 3) <= 0) {
            return;
        }
        File file = new File(str2);
        while (true) {
            String absolutePath = file.getAbsolutePath();
            if (absolutePath.startsWith("/")) {
                if (file.isDirectory() || file.isFile()) {
                    String str3 = absolutePath.substring(1).split("/", -1)[0];
                    if (!arrayList.contains(str3)) {
                        arrayList.add(str3);
                    }
                }
                file = file.getParentFile();
                if (file != null) {
                    file.getAbsolutePath().getClass();
                }
            }
        }
    }

    /* renamed from: b */
    public static boolean m2254b(File file) {
        try {
            return file.isDirectory();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: c */
    public static String[] m2255c(File file) {
        String[] strArr;
        String str;
        try {
            strArr = file.list();
        } catch (SecurityException e7) {
            Log.w("Failed list dir: " + file.getAbsolutePath(), e7);
            strArr = null;
        }
        if (strArr != null) {
            return strArr;
        }
        try {
            String str2 = file.getAbsolutePath().startsWith("/data/user/") ? "/data/user/" + "".split("/", -1)[3] + "/" : "/data/user/0/";
            ArrayList arrayList = new ArrayList();
            m2253a(arrayList, str2, "/data/anr");
            m2253a(arrayList, str2, "/data/app");
            m2253a(arrayList, str2, "/data/app-lib");
            m2253a(arrayList, str2, "/data/app-private");
            m2253a(arrayList, str2, "/data/dalvik-cache/profiles");
            m2253a(arrayList, str2, "/data/dalvik-cache/x86");
            m2253a(arrayList, str2, "/data/dalvik-cache/armeabi");
            m2253a(arrayList, str2, "/data/dalvik-cache/armeabi-v7a");
            m2253a(arrayList, str2, "/data/dalvik-cache/arm");
            m2253a(arrayList, str2, "/data/dalvik-cache/arm64-v8a");
            m2253a(arrayList, str2, "/data/dalvik-cache/arm64");
            m2253a(arrayList, str2, "/data/dalvik-cache/x86");
            m2253a(arrayList, str2, "/data/dalvik-cache/x86_64");
            m2253a(arrayList, str2, "/data/local/tmp");
            m2253a(arrayList, str2, "/data/misc/user");
            m2253a(arrayList, str2, "/data/misc/zoneinfo");
            m2253a(arrayList, str2, "/data/resource-cache");
            m2253a(arrayList, str2, "/data/security");
            m2253a(arrayList, str2, "/data/system/cache");
            m2253a(arrayList, str2, "/data/system/registered_services");
            m2253a(arrayList, str2, "/data/system/shared_prefs");
            m2253a(arrayList, str2, "/data/system/users");
            m2253a(arrayList, str2, "/data/tmp");
            m2253a(arrayList, str2, str2);
            m2253a(arrayList, str2, "/storage/emulated/legacy");
            m2253a(arrayList, str2, "/storage/emulated/0");
            m2253a(arrayList, str2, "/storage/emulated/sdcard0");
            m2253a(arrayList, str2, "/storage/emulated/sdcard1");
            m2253a(arrayList, str2, "/storage/sdcard0");
            m2253a(arrayList, str2, "/storage/sdcard1");
            m2253a(arrayList, str2, "/sdcard");
            m2253a(arrayList, str2, Tools.getSdcardPath());
            for (ApplicationInfo applicationInfo : Tools.getPackageManager().getInstalledApplications(0)) {
                m2253a(arrayList, str2, applicationInfo.dataDir);
                m2253a(arrayList, str2, applicationInfo.nativeLibraryDir);
                m2253a(arrayList, str2, applicationInfo.publicSourceDir);
                m2253a(arrayList, str2, applicationInfo.sourceDir);
                String[] strArr2 = applicationInfo.splitPublicSourceDirs;
                if (strArr2 != null) {
                    for (String str3 : strArr2) {
                        m2253a(arrayList, str2, str3);
                    }
                }
                if (Build.VERSION.SDK_INT >= 24) {
                    str = applicationInfo.deviceProtectedDataDir;
                    m2253a(arrayList, str2, str);
                }
                m2253a(arrayList, str2, "/data/data/" + applicationInfo.packageName);
                m2253a(arrayList, str2, "/data/app/" + applicationInfo.packageName + "-1/base.apk");
                m2253a(arrayList, str2, "/data/app/" + applicationInfo.packageName + "-2/base.apk");
            }
            if (arrayList.size() == 0) {
                return null;
            }
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static ArrayList<C0729e> m2256d(int i7, File file, String[] strArr, String str, boolean z6) {
        ArrayList<C0729e> arrayList = new ArrayList<>();
        for (String str2 : strArr) {
            String lowerCase = str2.toLowerCase(Locale.US);
            if (str == null || lowerCase.startsWith(str)) {
                File file2 = new File(file, str2);
                boolean m2254b = m2254b(file2);
                if (i7 != 0 || m2254b) {
                    arrayList.add(new C0729e(m2254b, lowerCase, file2));
                }
            }
        }
        if (arrayList.size() > 1) {
            C0727c c0727c = new C0727c(z6);
            try {
                System.currentTimeMillis();
                Collections.sort(arrayList, c0727c);
            } catch (IllegalArgumentException unused) {
                try {
                    Collections.sort(arrayList, new C0725a(C1686g.m4107b("Failed sort:\n")));
                } catch (IllegalArgumentException unused2) {
                }
            }
        }
        return arrayList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        new ViewOnClickListenerC0726b(this, this).onClick(view);
    }

    /* renamed from: com.so.revelation.lua.gg.PathSelector$b */
    public class ViewOnClickListenerC0726b implements View.OnClickListener, AdapterView.OnItemClickListener, DialogInterface.OnClickListener {

        /* renamed from: A1 */
        public int f3657A1;

        /* renamed from: B1 */
        public ImageView f3658B1;

        /* renamed from: C1 */
        public final PathSelector f3659C1;

        /* renamed from: X */
        public EditText f3660X;

        /* renamed from: Y */
        public File f3661Y;

        /* renamed from: Z */
        public DialogInterfaceC0151d f3662Z;

        /* renamed from: c */
        public C0728d f3663c;

        /* renamed from: w1 */
        public EditTextPath f3667w1;

        /* renamed from: x1 */
        public TextView f3668x1;

        /* renamed from: y1 */
        public ListView f3669y1;

        /* renamed from: z1 */
        public TextView f3670z1;

        /* renamed from: m */
        public final int f3665m = R.color.type_dword;

        /* renamed from: s */
        public final int f3666s = R.color.type_byte;

        /* renamed from: e */
        public final int f3664e = R.color.type_float;

        public ViewOnClickListenerC0726b(PathSelector pathSelector, PathSelector pathSelector2) {
            this.f3659C1 = pathSelector2;
        }

        /* renamed from: a */
        public final void m2257a(String str) {
            EditText editText = new EditText(Tools.getContext());
            this.f3660X = editText;
            editText.setText(str);
            DialogInterfaceC0151d.a m5134a = C2078b.m5134a();
            View customTitle = Tools.getCustomTitle("新建文件夹", String.valueOf(this.f3661Y.getAbsolutePath()).concat("/..."));
            AlertController.C0145b c0145b = m5134a.f374a;
            c0145b.f346f = customTitle;
            c0145b.f359s = InternalKeyboard.m2247a(editText, false);
            m5134a.m485b("取消", null);
            m5134a.m486c("确定", this);
            C2101m0.m5155a(0, new RunnableC2082d(m5134a));
        }

        /* renamed from: b */
        public final void m2258b(File file, boolean z6) {
            C0728d c0728d = this.f3663c;
            int count = c0728d.getCount();
            String lowerCase = file.getAbsolutePath().toLowerCase(Locale.US);
            int i7 = 0;
            int i8 = 0;
            while (true) {
                if (i7 >= count) {
                    i7 = i8;
                    break;
                }
                File item = c0728d.getItem(i7);
                if (file.equals(item)) {
                    break;
                }
                if (z6 == PathSelector.m2254b(item) && lowerCase.compareTo(item.getAbsolutePath().toLowerCase(Locale.US)) > 0) {
                    i8 = i7;
                }
                i7++;
            }
            this.f3669y1.setSelection(i7);
            this.f3669y1.post(new RunnableC0734a(this, i7));
        }

        /* renamed from: c */
        public final void m2259c() {
            this.f3670z1.setText(this.f3661Y.getAbsolutePath());
            String[] m2255c = PathSelector.m2255c(this.f3661Y);
            boolean z6 = m2255c == null;
            this.f3668x1.setVisibility(z6 ? 0 : 8);
            this.f3669y1.setVisibility(z6 ? 8 : 0);
            if (m2255c == null) {
                m2255c = C0391d0.f1979o;
            }
            ArrayList<C0729e> m2256d = PathSelector.m2256d(this.f3657A1, this.f3661Y, m2255c, null, this.f3658B1.getTag() == null);
            this.f3663c.clear();
            this.f3663c.setNotifyOnChange(false);
            Iterator<C0729e> it = m2256d.iterator();
            while (it.hasNext()) {
                this.f3663c.add(it.next().f3673a);
            }
            this.f3663c.notifyDataSetChanged();
            this.f3663c.setNotifyOnChange(true);
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i7) {
            if (dialogInterface == this.f3662Z) {
                String absolutePath = this.f3661Y.getAbsolutePath();
                if (this.f3657A1 == 2) {
                    String name = new File(this.f3667w1.getText().toString()).getName();
                    if (name == null || name.length() == 0) {
                        name = "file.txt";
                    }
                    absolutePath = String.valueOf(absolutePath) + "/" + name;
                }
                this.f3667w1.setText(absolutePath);
                return;
            }
            EditText editText = this.f3660X;
            if (editText != null) {
                String trim = editText.getText().toString().trim();
                if (trim.length() > 0) {
                    File file = new File(this.f3661Y, trim);
                    if (file.exists()) {
                        PathSelector.m2254b(file);
                    } else if (file.mkdirs()) {
                        C2108q.m5156a(trim, (byte) 0, 4);
                        m2259c();
                        return;
                    }
                }
                m2257a(trim);
            }
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i7, long j7) {
            if (i7 < 0 || i7 >= this.f3663c.getCount()) {
                return;
            }
            try {
                File item = this.f3663c.getItem(i7);
                if (item == null) {
                    return;
                }
                if (PathSelector.m2254b(item)) {
                    this.f3661Y = new File(this.f3661Y, item.getName());
                    m2259c();
                    this.f3669y1.setSelection(0);
                    this.f3669y1.post(new RunnableC0734a(this, 0));
                } else if (this.f3657A1 != 0) {
                    this.f3667w1.setText(item.getAbsolutePath());
                    Tools.dismiss(this.f3662Z);
                }
            } catch (Exception e7) {
                Log.w("Failed get Item: " + i7, e7);
            }
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int id = view.getId();
            if (id == R.id.add) {
                m2257a("");
                return;
            }
            if (id == R.id.sort) {
                boolean z6 = this.f3658B1.getTag() != null;
                PathSelector.f3655c = z6;
                ImageView imageView = this.f3658B1;
                imageView.setTag(z6 ? null : imageView);
                m2259c();
                this.f3669y1.setSelection(0);
                this.f3669y1.post(new RunnableC0734a(this, 0));
                return;
            }
            if (id == R.id.f3360up) {
                File file = this.f3661Y;
                File parentFile = file.getParentFile();
                this.f3661Y = parentFile;
                if (parentFile == null) {
                    this.f3661Y = new File("/");
                }
                m2259c();
                m2258b(file, true);
                return;
            }
            PathSelector pathSelector = this.f3659C1;
            Object tag = pathSelector.getTag();
            if (tag instanceof EditTextPath) {
                EditTextPath editTextPath = (EditTextPath) tag;
                this.f3667w1 = editTextPath;
                View inflate = LayoutInflater.from(Tools.getActivity()).inflate(R.layout.path_selector, (ViewGroup) null);
                this.f3670z1 = (TextView) inflate.findViewById(R.id.path);
                Config.setIconSize((ImageView) inflate.findViewById(R.id.add)).setOnClickListener(this);
                ImageView imageView2 = (ImageView) inflate.findViewById(R.id.sort);
                this.f3658B1 = imageView2;
                Config.setIconSize(imageView2).setOnClickListener(this);
                boolean z7 = PathSelector.f3655c;
                ImageView imageView3 = this.f3658B1;
                imageView3.setTag(z7 ? null : imageView3);
                Config.setIconSize((ImageView) inflate.findViewById(R.id.f3360up)).setOnClickListener(this);
                this.f3668x1 = (TextView) inflate.findViewById(R.id.failed);
                ListView listView = (ListView) inflate.findViewById(R.id.files);
                this.f3669y1 = listView;
                C0728d c0728d = new C0728d(this, pathSelector.getContext(), new ArrayList());
                this.f3663c = c0728d;
                listView.setAdapter((ListAdapter) c0728d);
                listView.setOnItemClickListener(this);
                this.f3657A1 = editTextPath.getPathType();
                File file2 = new File(editTextPath.getText().toString());
                this.f3661Y = file2;
                while (!PathSelector.m2254b(this.f3661Y)) {
                    File parentFile2 = this.f3661Y.getParentFile();
                    this.f3661Y = parentFile2;
                    if (parentFile2 == null) {
                        this.f3661Y = new File("/");
                    }
                }
                m2259c();
                m2258b(file2, this.f3657A1 == 0);
                DialogInterfaceC0151d.a m5134a = C2078b.m5134a();
                m5134a.f374a.f359s = inflate;
                m5134a.m485b("取消", null);
                if (this.f3657A1 != 1) {
                    m5134a.m486c("确定", this);
                }
                DialogInterfaceC0151d m484a = m5134a.m484a();
                this.f3662Z = m484a;
                C2078b.m5137d(m484a, null);
            }
        }
    }
}
