package android.ext;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.ext.ExceptionHandler;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.lang.ProcessBuilder;
import android.os.Build;
import android.os.Environment;
import android.os.IBinder;
import android.os.Process;
import android.provider.Settings;
import android.system.Os;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.text.style.ForegroundColorSpan;
import android.util.StateSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.DialogInterfaceC0151d;
import androidx.lifecycle.C0391d0;
import com.so.revelation.lua.EditorActivity;
import com.so.revelation.lua.R;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import p129q1.ViewOnClickListenerC1728d;
import p175w1.C2086f;
import p175w1.C2097k0;
import p175w1.C2101m0;
import p175w1.C2105o0;

/* loaded from: classes.dex */
public class Tools {
    public static final int AID_USER = 100000;
    private static final String HIDDEN_PREFIX = "GG-";
    public static final String OLD_DEFAULT_STORAGE = "DefaultStorage";
    public static final Random RANDOM;
    private static int allowFloatWindows = 0;
    private static String cacheDir = null;
    private static volatile String dataDir = null;
    private static float density = 0.0f;
    private static volatile int dp2px48 = -1;
    static volatile String[] fakeToReal;
    private static String filesDir;
    private static int fixToLegacy;
    private static String hiddenDir;
    private static volatile Object iPm;
    static InputMethodManager imm;
    private static volatile boolean overrideExec;
    private static String pkg;

    /* renamed from: pm */
    private static volatile PackageManager f150pm;
    private static final Semaphore sePM;
    private static WeakReference<SharedPreferences> weakSp = new WeakReference<>(null);
    public static final String DEFAULT_STORAGE = String.valueOf(EditorActivity.f3285f2).concat("_preferences");
    static volatile int dp5 = -1;

    public class FocusChangeListener implements View.OnFocusChangeListener {
        private final ArrayList<View.OnFocusChangeListener> list;

        private FocusChangeListener() {
            this.list = new ArrayList<>();
        }

        public FocusChangeListener(Tools tools, FocusChangeListener focusChangeListener) {
            this();
        }

        public void add(View.OnFocusChangeListener onFocusChangeListener) {
            if (onFocusChangeListener == null || this.list.contains(onFocusChangeListener)) {
                return;
            }
            this.list.add(onFocusChangeListener);
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z6) {
            Iterator<View.OnFocusChangeListener> it = this.list.iterator();
            while (it.hasNext()) {
                it.next().onFocusChange(view, z6);
            }
        }
    }

    public static class MethodDescr {

        /* renamed from: cl */
        Class<? extends Object> f151cl;
        Class<?>[] defs;
        String meth;
        Method method = null;
        Object obj;
        Object[] params;

        public MethodDescr(Class<? extends Object> cls, String str, Class<?>[] clsArr, Object obj, Object[] objArr) {
            this.f151cl = cls;
            this.meth = str;
            this.defs = clsArr;
            this.obj = obj;
            this.params = objArr;
        }

        public MethodDescr check() {
            this.method = this.f151cl.getMethod(this.meth, this.defs);
            return this;
        }

        public Object invoke() {
            return this.method.invoke(this.obj, this.params);
        }
    }

    public static class Semaphore {

        /* renamed from: S0 */
        public static final int f152S0 = 1;

        /* renamed from: S1 */
        public static final int f153S1 = 2;

        /* renamed from: S2 */
        public static final int f154S2 = 4;

        /* renamed from: S3 */
        public static final int f155S3 = 8;

        /* renamed from: S4 */
        public static final int f156S4 = 16;

        /* renamed from: S5 */
        public static final int f157S5 = 32;

        /* renamed from: S6 */
        public static final int f158S6 = 64;

        /* renamed from: S7 */
        public static final int f159S7 = 128;

        /* renamed from: S8 */
        public static final int f160S8 = 256;

        /* renamed from: S9 */
        public static final int f161S9 = 512;
        private static final ThreadLocal<Integer> store = new ThreadLocal<Integer>() { // from class: android.ext.Tools.Semaphore.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.lang.ThreadLocal
            public Integer initialValue() {
                return 0;
            }
        };

        private Semaphore() {
        }

        public Semaphore(Semaphore semaphore) {
            this();
        }

        public void free(int i7) {
            ThreadLocal<Integer> threadLocal = store;
            threadLocal.set(Integer.valueOf((~i7) & threadLocal.get().intValue()));
        }

        public boolean use(int i7) {
            ThreadLocal<Integer> threadLocal = store;
            int intValue = threadLocal.get().intValue();
            if ((intValue & i7) != 0) {
                return false;
            }
            threadLocal.set(Integer.valueOf(i7 | intValue));
            return true;
        }
    }

    public static class ViewWrapper extends FrameLayout {
        public ViewWrapper(Context context) {
            super(context);
        }
    }

    static {
        allowFloatWindows = Build.VERSION.SDK_INT < 23 ? 1 : -1;
        fixToLegacy = 0;
        f150pm = null;
        sePM = new Semaphore(null);
        RANDOM = new Random(System.currentTimeMillis());
        overrideExec = false;
    }

    @SuppressLint({"SdCardPath"})
    private static void _init(Context context) {
        if (f150pm == null) {
            try {
                f150pm = context.getPackageManager();
            } catch (Throwable unused) {
            }
        }
        if (pkg == null) {
            try {
                pkg = context.getPackageName();
            } catch (Throwable unused2) {
            }
        }
        if (pkg == null) {
            pkg = C2086f.f9509a;
        }
        if (filesDir == null) {
            try {
                filesDir = context.getFilesDir().getAbsolutePath();
            } catch (Throwable unused3) {
            }
        }
        if (cacheDir == null) {
            try {
                cacheDir = context.getCacheDir().getAbsolutePath();
            } catch (Throwable unused4) {
            }
        }
        if (filesDir == null && pkg != null) {
            filesDir = String.valueOf(getDataDirSafe()).concat("/files");
        }
        if (cacheDir == null && pkg != null) {
            cacheDir = String.valueOf(getDataDirSafe()).concat("/cache");
        }
        if (filesDir != null) {
            try {
                File file = new File(filesDir);
                if (!file.exists()) {
                    file.mkdirs();
                }
            } catch (Throwable unused5) {
            }
        }
        if (cacheDir != null) {
            try {
                File file2 = new File(cacheDir);
                if (file2.exists()) {
                    return;
                }
                file2.mkdirs();
            } catch (Throwable unused6) {
            }
        }
    }

    public static void add(View.OnFocusChangeListener onFocusChangeListener, ArrayList<View.OnFocusChangeListener> arrayList) {
        if (onFocusChangeListener == null || arrayList.contains(onFocusChangeListener)) {
            return;
        }
        arrayList.add(onFocusChangeListener);
    }

    public static void addIconToTextView(final TextView textView, final Drawable drawable, final int i7) {
        if (textView != null) {
            C2101m0.m5155a(0, new Runnable() { // from class: android.ext.Tools.6
                /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
                /* JADX WARN: Removed duplicated region for block: B:36:0x0089 A[Catch: StringIndexOutOfBoundsException -> 0x00a4, TryCatch #1 {StringIndexOutOfBoundsException -> 0x00a4, blocks: (B:12:0x0023, B:14:0x0030, B:17:0x003c, B:20:0x0056, B:28:0x006e, B:29:0x0075, B:34:0x0083, B:36:0x0089, B:40:0x0097, B:43:0x004e), top: B:11:0x0023 }] */
                /* JADX WARN: Removed duplicated region for block: B:40:0x0097 A[Catch: StringIndexOutOfBoundsException -> 0x00a4, TRY_LEAVE, TryCatch #1 {StringIndexOutOfBoundsException -> 0x00a4, blocks: (B:12:0x0023, B:14:0x0030, B:17:0x003c, B:20:0x0056, B:28:0x006e, B:29:0x0075, B:34:0x0083, B:36:0x0089, B:40:0x0097, B:43:0x004e), top: B:11:0x0023 }] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void run() {
                    /*
                        r8 = this;
                        int r0 = android.ext.Tools.dp5
                        r1 = -1
                        if (r0 != r1) goto L11
                        r0 = 1094713344(0x41400000, float:12.0)
                        float r0 = android.ext.Tools.dp2px(r0)
                        r1 = 1056964608(0x3f000000, float:0.5)
                        float r0 = r0 + r1
                        int r0 = (int) r0
                        android.ext.Tools.dp5 = r0
                    L11:
                        android.graphics.drawable.Drawable r0 = r1
                        r1 = 0
                        if (r0 == 0) goto L23
                        int r0 = r2
                        float r0 = (float) r0
                        float r0 = android.ext.Tools.dp2px(r0)
                        int r0 = (int) r0
                        android.graphics.drawable.Drawable r2 = r1     // Catch: java.lang.Throwable -> L23
                        r2.setBounds(r1, r1, r0, r0)     // Catch: java.lang.Throwable -> L23
                    L23:
                        android.widget.TextView r0 = r3     // Catch: java.lang.StringIndexOutOfBoundsException -> La4
                        r2 = 2131427408(0x7f0b0050, float:1.8476431E38)
                        java.lang.Object r0 = r0.getTag(r2)     // Catch: java.lang.StringIndexOutOfBoundsException -> La4
                        boolean r3 = r0 instanceof java.lang.Integer     // Catch: java.lang.StringIndexOutOfBoundsException -> La4
                        if (r3 == 0) goto L37
                        java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.StringIndexOutOfBoundsException -> La4
                        int r0 = r0.intValue()     // Catch: java.lang.StringIndexOutOfBoundsException -> La4
                        goto L38
                    L37:
                        r0 = 0
                    L38:
                        r3 = 3
                        r4 = 2
                        if (r0 != 0) goto L60
                        android.widget.TextView r0 = r3     // Catch: java.lang.StringIndexOutOfBoundsException -> La4
                        android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawables()     // Catch: java.lang.StringIndexOutOfBoundsException -> La4
                        android.widget.TextView r5 = r3     // Catch: java.lang.StringIndexOutOfBoundsException -> La4
                        android.graphics.drawable.Drawable[] r5 = r5.getCompoundDrawablesRelative()     // Catch: java.lang.StringIndexOutOfBoundsException -> La4
                        r6 = r5[r1]     // Catch: java.lang.StringIndexOutOfBoundsException -> La4
                        if (r6 == 0) goto L4e
                        r0 = 4
                        goto L56
                    L4e:
                        r6 = r0[r1]     // Catch: java.lang.StringIndexOutOfBoundsException -> La4
                        if (r6 == 0) goto L55
                        r5 = r0
                        r0 = 2
                        goto L56
                    L55:
                        r0 = 3
                    L56:
                        android.widget.TextView r6 = r3     // Catch: java.lang.StringIndexOutOfBoundsException -> La4
                        java.lang.Integer r7 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.StringIndexOutOfBoundsException -> La4
                        r6.setTag(r2, r7)     // Catch: java.lang.StringIndexOutOfBoundsException -> La4
                        goto L61
                    L60:
                        r5 = 0
                    L61:
                        r2 = 1
                        if (r0 == r2) goto L69
                        if (r0 != r4) goto L67
                        goto L69
                    L67:
                        r6 = 0
                        goto L6a
                    L69:
                        r6 = 1
                    L6a:
                        if (r5 != 0) goto L7b
                        if (r6 == 0) goto L75
                        android.widget.TextView r5 = r3     // Catch: java.lang.StringIndexOutOfBoundsException -> La4
                        android.graphics.drawable.Drawable[] r5 = r5.getCompoundDrawables()     // Catch: java.lang.StringIndexOutOfBoundsException -> La4
                        goto L7b
                    L75:
                        android.widget.TextView r5 = r3     // Catch: java.lang.StringIndexOutOfBoundsException -> La4
                        android.graphics.drawable.Drawable[] r5 = r5.getCompoundDrawablesRelative()     // Catch: java.lang.StringIndexOutOfBoundsException -> La4
                    L7b:
                        if (r0 == r2) goto L82
                        if (r0 != r3) goto L80
                        goto L82
                    L80:
                        r0 = 2
                        goto L83
                    L82:
                        r0 = 0
                    L83:
                        android.graphics.drawable.Drawable r7 = r1     // Catch: java.lang.StringIndexOutOfBoundsException -> La4
                        r5[r0] = r7     // Catch: java.lang.StringIndexOutOfBoundsException -> La4
                        if (r6 == 0) goto L97
                        android.widget.TextView r0 = r3     // Catch: java.lang.StringIndexOutOfBoundsException -> La4
                        r1 = r5[r1]     // Catch: java.lang.StringIndexOutOfBoundsException -> La4
                        r2 = r5[r2]     // Catch: java.lang.StringIndexOutOfBoundsException -> La4
                        r4 = r5[r4]     // Catch: java.lang.StringIndexOutOfBoundsException -> La4
                        r3 = r5[r3]     // Catch: java.lang.StringIndexOutOfBoundsException -> La4
                        r0.setCompoundDrawables(r1, r2, r4, r3)     // Catch: java.lang.StringIndexOutOfBoundsException -> La4
                        goto La4
                    L97:
                        android.widget.TextView r0 = r3     // Catch: java.lang.StringIndexOutOfBoundsException -> La4
                        r1 = r5[r1]     // Catch: java.lang.StringIndexOutOfBoundsException -> La4
                        r2 = r5[r2]     // Catch: java.lang.StringIndexOutOfBoundsException -> La4
                        r4 = r5[r4]     // Catch: java.lang.StringIndexOutOfBoundsException -> La4
                        r3 = r5[r3]     // Catch: java.lang.StringIndexOutOfBoundsException -> La4
                        r0.setCompoundDrawablesRelative(r1, r2, r4, r3)     // Catch: java.lang.StringIndexOutOfBoundsException -> La4
                    La4:
                        android.widget.TextView r0 = r3
                        int r1 = android.ext.Tools.dp5
                        r0.setCompoundDrawablePadding(r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: android.ext.Tools.RunnableC00846.run():void");
                }
            });
        }
    }

    public static void addView(View view, WindowManager.LayoutParams layoutParams) {
        setView(view, layoutParams, true);
    }

    public static void addViewWithWrapper(final View view, final WindowManager.LayoutParams layoutParams) {
        C2101m0.m5155a(0, new Runnable() { // from class: android.ext.Tools.1
            @Override // java.lang.Runnable
            public void run() {
                Tools.removeViewWithWrapper(view);
                ViewWrapper viewWrapper = new ViewWrapper(view.getContext());
                viewWrapper.addView(view);
                Tools.addView(viewWrapper, layoutParams);
            }
        });
    }

    public static boolean allowExecute(String str) {
        File file = new File(str);
        if (file.canExecute()) {
            return true;
        }
        String[] strArr = {"chmod", "0755", getRealPath(str)};
        try {
            waitForTimeout(exec(strArr), 15);
        } catch (Exception unused) {
        }
        if (!Config.vSpace) {
            if (file.canExecute()) {
                return true;
            }
            try {
                waitForTimeout(RootDetector.tryRoot("exec " + concat(strArr, " ")), 15);
            } catch (Exception unused2) {
            }
        }
        return file.canExecute();
    }

    public static boolean[] booleanArray(List<Boolean> list) {
        boolean[] zArr = new boolean[list.size()];
        Iterator<Boolean> it = list.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            zArr[i7] = it.next().booleanValue();
            i7++;
        }
        return zArr;
    }

    public static final String byteArrayToHexString(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b7 : bArr) {
            String upperCase = Integer.toHexString(b7 & 255).toUpperCase(Locale.US);
            while (upperCase.length() < 2) {
                upperCase = String.valueOf('0') + upperCase;
            }
            sb.append(upperCase);
        }
        return sb.toString();
    }

    public static boolean canDrawOverlays(Context context) {
        boolean canDrawOverlays;
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        try {
            canDrawOverlays = Settings.canDrawOverlays(context);
            return canDrawOverlays;
        } catch (Throwable unused) {
            return true;
        }
    }

    @TargetApi(23)
    public static void checkPermission() {
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                canDrawOverlays(getContext());
            } catch (Throwable unused) {
            }
        }
    }

    public static void chmod(File file, int i7) {
        file.setExecutable((i7 & 64) != 0, (i7 & 9) == 0);
        file.setWritable((i7 & Semaphore.f159S7) != 0, (i7 & 18) == 0);
        file.setReadable((i7 & Semaphore.f160S8) != 0, (i7 & 36) == 0);
        try {
            Os.chmod(file.getAbsolutePath(), i7);
        } catch (Throwable unused) {
        }
    }

    public static void chmod(String str, String str2) {
        try {
            Os.chmod(str, Integer.parseInt(str2, 8));
        } catch (Throwable unused) {
        }
        String[] strArr = {"chmod", str2, getRealPath(str)};
        try {
            waitForTimeout(exec(strArr), 15);
        } catch (Exception unused2) {
        }
        try {
            if (Config.vSpace) {
                return;
            }
            waitForTimeout(RootDetector.tryRoot("exec " + concat(strArr, " ")), 15);
        } catch (Exception unused3) {
        }
    }

    public static boolean click(View view) {
        if (view == null) {
            return false;
        }
        return view.callOnClick();
    }

    public static CharSequence colorize(CharSequence charSequence, int i7) {
        try {
            Spannable spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
            spannableString.setSpan(new ForegroundColorSpan(i7), 0, charSequence.length(), 33);
            return spannableString;
        } catch (Throwable unused) {
            return charSequence;
        }
    }

    public static CharSequence concat(CharSequence... charSequenceArr) {
        try {
            return TextUtils.concat(charSequenceArr);
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder();
            for (CharSequence charSequence : charSequenceArr) {
                sb.append(charSequence);
            }
            return sb.toString();
        }
    }

    public static String concat(String[] strArr, String str) {
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArr) {
            if (sb.length() != 0) {
                sb.append(str);
            }
            sb.append(str2);
        }
        return sb.toString();
    }

    private static void disableSoundEffects(ViewGroup viewGroup) {
        if (viewGroup != null) {
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                try {
                    View childAt = viewGroup.getChildAt(i7);
                    if (childAt != null) {
                        childAt.setSoundEffectsEnabled(false);
                        if (childAt instanceof ViewGroup) {
                            disableSoundEffects((ViewGroup) childAt);
                        }
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            }
        }
    }

    public static void dismiss(final DialogInterface dialogInterface) {
        dialogInterface.getClass();
        C2101m0.m5155a(0, new Runnable() { // from class: android.ext.Tools.7
            @Override // java.lang.Runnable
            public void run() {
                try {
                    dialogInterface.dismiss();
                } catch (Throwable unused) {
                }
            }
        });
    }

    public static void dismiss(WeakReference<DialogInterfaceC0151d> weakReference) {
        DialogInterfaceC0151d dialogInterfaceC0151d;
        if (weakReference == null || (dialogInterfaceC0151d = weakReference.get()) == null) {
            return;
        }
        dismiss(dialogInterfaceC0151d);
    }

    public static float dp2px(float f7) {
        Context context;
        float f8 = density;
        if (f8 == 0.0f && (context = getContext()) != null) {
            f8 = context.getResources().getDisplayMetrics().density;
        }
        if (f8 == 0.0f) {
            f8 = 1.0f;
        }
        return f7 * f8;
    }

    public static int dp2px48() {
        if (dp2px48 < 0) {
            dp2px48 = (int) dp2px(48.0f);
        }
        return dp2px48;
    }

    public static Process exec(String[] strArr) {
        return exec(strArr, null, null);
    }

    public static Process exec(String[] strArr, String[] strArr2) {
        return exec(strArr, strArr2, null);
    }

    public static Process exec(String[] strArr, String[] strArr2, File file) {
        if (!overrideExec) {
            try {
                return Runtime.getRuntime().exec(strArr, strArr2, file);
            } catch (Throwable th) {
                String message = th.getMessage();
                if (!message.contains("nknown error") && !message.contains("xec failed") && !message.contains("ead failed")) {
                    throw th;
                }
                Log.m191w("Failed exec: " + Arrays.toString(strArr) + "; " + strArr2 + "; " + file, th);
            }
        }
        Process exec = ProcessBuilder.exec(strArr, strArr2, file);
        overrideExec = true;
        return exec;
    }

    public static void externalKeyboard(Window window, View view, boolean z6) {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        int i7 = window.getAttributes().softInputMode & (-16);
        if (z6) {
            window.clearFlags(131072);
            window.setSoftInputMode(i7 | 5);
            inputMethodManager.showSoftInput(view, 0);
        } else {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
            window.addFlags(131072);
            window.setSoftInputMode(i7 | 2);
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static void extractFile(String str, File file) {
        Resources resources = getContext().getResources();
        int m204i = C0072Re.m204i("chunk" + str, R.raw.class);
        if (m204i == 0) {
            throw new RuntimeException("Nothing extract");
        }
        try {
            byte[] bArr = new byte[8192];
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            InputStream openRawResource = resources.openRawResource(m204i);
            while (true) {
                int read = openRawResource.read(bArr);
                if (read <= 0) {
                    openRawResource.close();
                    fileOutputStream.close();
                    return;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e7) {
            throw new RuntimeException(e7);
        }
    }

    public static void fixDialogButtonsSize(DialogInterfaceC0151d dialogInterfaceC0151d) {
        boolean z6;
        if (dialogInterfaceC0151d != null) {
            int i7 = 0;
            TextView[] textViewArr = {dialogInterfaceC0151d.m483h(-1), dialogInterfaceC0151d.m483h(-2), dialogInterfaceC0151d.m483h(-3)};
            ViewGroup viewGroup = null;
            for (int i8 = 0; i8 < 3; i8++) {
                TextView textView = textViewArr[i8];
                if (textView != null && (viewGroup = (ViewGroup) textView.getParent()) != null) {
                    break;
                }
            }
            if (viewGroup != null) {
                int width = viewGroup.getWidth();
                if (width == 0) {
                    viewGroup.requestLayout();
                    width = viewGroup.getWidth();
                    if (width == 0) {
                        width = viewGroup.getMeasuredWidth();
                    }
                    if (width == 0) {
                        viewGroup.measure(-1, -2);
                        width = viewGroup.getMeasuredWidth();
                    }
                }
                if (width == 0 || goodSize(width, viewGroup, 0)) {
                    return;
                }
                for (int i9 = 0; i9 < 3; i9++) {
                    TextView textView2 = textViewArr[i9];
                    if (textView2 != null) {
                        textView2.setAllCaps(false);
                    }
                }
                if (goodSize(width, viewGroup, 5)) {
                    return;
                }
                for (int i10 = 0; i10 < 3; i10++) {
                    TextView textView3 = textViewArr[i10];
                    if (textView3 != null) {
                        ColorStateList textColors = textView3.getTextColors();
                        setTextAppearance(textView3, 2131886100);
                        textView3.setTextColor(textColors);
                    }
                }
                if (goodSize(width, viewGroup, 10)) {
                    return;
                }
                String[][] strArr = {new String[]{"", ""}, new String[]{"", "", ""}, new String[]{"", ""}};
                int i11 = 0;
                while (i11 < 3) {
                    String[] strArr2 = strArr[i11];
                    if (strArr2 != null) {
                        int i12 = 0;
                        for (int i13 = 0; i13 < strArr2.length; i13++) {
                            if (strArr2[i12].length() >= strArr2[i13].length()) {
                                i12 = i13;
                            }
                        }
                        int i14 = 0;
                        boolean z7 = false;
                        while (i14 < 3) {
                            TextView textView4 = textViewArr[i14];
                            if (textView4 != null) {
                                String charSequence = textView4.getText().toString();
                                while (i7 < strArr2.length) {
                                    if (i7 != i12 && strArr2[i7].equals(charSequence)) {
                                        textView4.setText(strArr2[i12]);
                                        z7 = true;
                                    }
                                    i7++;
                                }
                            }
                            i14++;
                            i7 = 0;
                        }
                        if (z7 && goodSize(width, viewGroup, i11 + 20)) {
                            return;
                        }
                    }
                    i11++;
                    i7 = 0;
                }
                boolean z8 = false;
                for (int i15 = 0; i15 < 3; i15++) {
                    TextView textView5 = textViewArr[i15];
                    if (textView5 != null && textView5.getText().toString().indexOf(32) != -1) {
                        textView5.setText(textView5.getText().toString().replace(' ', '\n'));
                        z8 = true;
                    }
                }
                if (z8 && goodSize(width, viewGroup, 40)) {
                    return;
                }
                if (viewGroup instanceof LinearLayout) {
                    LinearLayout linearLayout = (LinearLayout) viewGroup;
                    if (linearLayout.getOrientation() == 0) {
                        linearLayout.setOrientation(1);
                        z6 = true;
                        if (z6 || !goodSize(width, viewGroup, 100)) {
                            goodSize(width, viewGroup, -1);
                        }
                        return;
                    }
                }
                z6 = false;
                if (z6) {
                }
                goodSize(width, viewGroup, -1);
            }
        }
    }

    public static void fixEdgeGlow(View view) {
    }

    @SuppressLint({"WrongConstant"})
    public static WindowManager.LayoutParams fixViewParams(WindowManager.LayoutParams layoutParams) {
        IBinder iBinder;
        layoutParams.flags = (Config.configClient & 2) != 0 ? layoutParams.flags | 16777216 : layoutParams.flags & (-16777217);
        if (allowFloatWindows == -1) {
            allowFloatWindows = canDrawOverlays(getContext()) ? 1 : 0;
        }
        if (allowFloatWindows != 0) {
            if ((layoutParams.type == C2097k0.m5152a() || layoutParams.type == C2097k0.m5153b()) && layoutParams.token != null) {
                iBinder = null;
            }
            return layoutParams;
        }
        layoutParams.type = 2;
        iBinder = getActivity().getWindow().getAttributes().token;
        if (iBinder == null) {
            iBinder = getActivity().getWindow().getDecorView().getRootView().getWindowToken();
        }
        layoutParams.token = iBinder;
        return layoutParams;
    }

    public static void fixViewParams(Window window) {
        window.setAttributes(fixViewParams(window.getAttributes()));
    }

    public static void fixViews(View view) {
        View rootView = getRootView(view);
        setUseSoundEffects(rootView);
        fixEdgeGlow(rootView);
    }

    private static String formatFileSize(long j7, boolean z6) {
        String str;
        String stringFormat;
        float f7 = j7;
        if (f7 > 900.0f) {
            f7 /= 1024.0f;
            str = "KB";
        } else {
            str = "B";
        }
        if (f7 > 900.0f) {
            f7 /= 1024.0f;
            str = "MB";
        }
        if (f7 > 900.0f) {
            f7 /= 1024.0f;
            str = "GB";
        }
        if (f7 > 900.0f) {
            f7 /= 1024.0f;
            str = "TB";
        }
        if (f7 > 900.0f) {
            f7 /= 1024.0f;
            str = "PB";
        }
        if (f7 < 1.0f) {
            stringFormat = stringFormat("%.2f", Float.valueOf(f7));
        } else if (f7 < 10.0f) {
            Object[] objArr = new Object[1];
            Float valueOf = Float.valueOf(f7);
            if (z6) {
                objArr[0] = valueOf;
                stringFormat = stringFormat("%.1f", objArr);
            } else {
                objArr[0] = valueOf;
                stringFormat = stringFormat("%.2f", objArr);
            }
        } else if (f7 >= 100.0f) {
            stringFormat = stringFormat("%.0f", Float.valueOf(f7));
        } else {
            Object[] objArr2 = new Object[1];
            Float valueOf2 = Float.valueOf(f7);
            if (z6) {
                objArr2[0] = valueOf2;
                stringFormat = stringFormat("%.0f", objArr2);
            } else {
                objArr2[0] = valueOf2;
                stringFormat = stringFormat("%.2f", objArr2);
            }
        }
        return String.valueOf(stringFormat) + ' ' + str;
    }

    public static String formatFileSize(Context context, long j7) {
        try {
            return Formatter.formatFileSize(context, j7);
        } catch (Throwable unused) {
            try {
                return formatFileSize(j7, false);
            } catch (Throwable unused2) {
                return Long.toString(j7);
            }
        }
    }

    public static EditorActivity getActivity() {
        return EditorActivity.f3285f2;
    }

    public static Drawable getApplicationIcon(ApplicationInfo applicationInfo) {
        PackageManager packageManager = f150pm;
        if (applicationInfo != null && packageManager != null) {
            try {
                boolean enter = CheckNativeCrash.enter(applicationInfo.packageName, "icon");
                Drawable loadIcon = applicationInfo.loadIcon(packageManager);
                CheckNativeCrash.exit(enter);
                if (loadIcon != null) {
                    return loadIcon;
                }
                boolean enter2 = CheckNativeCrash.enter(applicationInfo.packageName, "icon2");
                Drawable applicationIcon = packageManager.getApplicationIcon(applicationInfo);
                CheckNativeCrash.exit(enter2);
                return applicationIcon;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static ApplicationInfo getApplicationInfo(String str) {
        return getApplicationInfo(str, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.pm.ApplicationInfo getApplicationInfo(java.lang.String r19, int r20) {
        /*
            r1 = r19
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            boolean r0 = android.ext.CheckNativeCrash.isBuggedPackage(r19)
            r3 = 0
            if (r0 == 0) goto Lc
            return r3
        Lc:
            android.content.pm.PackageManager r0 = getPackageManager()
            if (r0 == 0) goto L32
            java.lang.String r4 = "app_info"
            boolean r4 = android.ext.CheckNativeCrash.enter(r1, r4)     // Catch: java.lang.Throwable -> L26
            r5 = r20
            android.content.pm.ApplicationInfo r6 = r0.getApplicationInfo(r1, r5)     // Catch: java.lang.Throwable -> L24
            android.ext.CheckNativeCrash.exit(r4)     // Catch: java.lang.Throwable -> L22
            goto L35
        L22:
            r0 = move-exception
            goto L2a
        L24:
            r0 = move-exception
            goto L29
        L26:
            r0 = move-exception
            r5 = r20
        L29:
            r6 = r3
        L2a:
            boolean r4 = r0 instanceof android.content.pm.PackageManager.NameNotFoundException
            if (r4 != 0) goto L2f
            goto L35
        L2f:
            android.content.pm.PackageManager$NameNotFoundException r0 = (android.content.pm.PackageManager.NameNotFoundException) r0
            throw r0
        L32:
            r5 = r20
            r6 = r3
        L35:
            if (r6 != 0) goto Lba
            java.lang.Object r0 = getIPackageManager()
            if (r0 != 0) goto L3f
            goto Lba
        L3f:
            java.lang.Class r4 = r0.getClass()     // Catch: java.lang.Throwable -> Lb1
            r13 = 2
            android.ext.Tools$MethodDescr[] r14 = new android.ext.Tools.MethodDescr[r13]     // Catch: java.lang.Throwable -> Lb1
            android.ext.Tools$MethodDescr r15 = new android.ext.Tools$MethodDescr     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r9 = "getApplicationInfo"
            r7 = 3
            java.lang.Class[] r10 = new java.lang.Class[r7]     // Catch: java.lang.Throwable -> Lb1
            r16 = 0
            r10[r16] = r2     // Catch: java.lang.Throwable -> Lb1
            java.lang.Class r17 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> Lb1
            r18 = 1
            r10[r18] = r17     // Catch: java.lang.Throwable -> Lb1
            r10[r13] = r17     // Catch: java.lang.Throwable -> Lb1
            java.lang.Object[] r12 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> Lb1
            r12[r16] = r1     // Catch: java.lang.Throwable -> Lb1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r20)     // Catch: java.lang.Throwable -> Lb1
            r12[r18] = r7     // Catch: java.lang.Throwable -> Lb1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r16)     // Catch: java.lang.Throwable -> Lb1
            r12[r13] = r7     // Catch: java.lang.Throwable -> Lb1
            r7 = r15
            r8 = r4
            r11 = r0
            r7.<init>(r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> Lb1
            r14[r16] = r15     // Catch: java.lang.Throwable -> Lb1
            android.ext.Tools$MethodDescr r15 = new android.ext.Tools$MethodDescr     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r9 = "getApplicationInfo"
            java.lang.Class[] r10 = new java.lang.Class[r13]     // Catch: java.lang.Throwable -> Lb1
            r10[r16] = r2     // Catch: java.lang.Throwable -> Lb1
            r10[r18] = r17     // Catch: java.lang.Throwable -> Lb1
            java.lang.Object[] r12 = new java.lang.Object[r13]     // Catch: java.lang.Throwable -> Lb1
            r12[r16] = r1     // Catch: java.lang.Throwable -> Lb1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r20)     // Catch: java.lang.Throwable -> Lb1
            r12[r18] = r2     // Catch: java.lang.Throwable -> Lb1
            r7 = r15
            r8 = r4
            r11 = r0
            r7.<init>(r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> Lb1
            r14[r18] = r15     // Catch: java.lang.Throwable -> Lb1
            android.ext.Tools$MethodDescr r0 = getMethodDescr(r4, r14)     // Catch: java.lang.Throwable -> Lb1
            if (r0 == 0) goto La9
            java.lang.String r2 = "app_info2"
            boolean r2 = android.ext.CheckNativeCrash.enter(r1, r2)     // Catch: java.lang.Throwable -> Lb1
            java.lang.Object r3 = r0.invoke()     // Catch: java.lang.Throwable -> Lb1
            android.ext.CheckNativeCrash.exit(r2)     // Catch: java.lang.Throwable -> Lb1
            if (r3 == 0) goto La3
            goto La9
        La3:
            android.content.pm.PackageManager$NameNotFoundException r0 = new android.content.pm.PackageManager$NameNotFoundException     // Catch: java.lang.Throwable -> Lb1
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lb1
            throw r0     // Catch: java.lang.Throwable -> Lb1
        La9:
            boolean r0 = r3 instanceof android.content.pm.ApplicationInfo     // Catch: java.lang.Throwable -> Lb1
            if (r0 == 0) goto Lb0
            android.content.pm.ApplicationInfo r3 = (android.content.pm.ApplicationInfo) r3     // Catch: java.lang.Throwable -> Lb1
            return r3
        Lb0:
            return r6
        Lb1:
            r0 = move-exception
            boolean r1 = r0 instanceof android.content.pm.PackageManager.NameNotFoundException
            if (r1 != 0) goto Lb7
            return r6
        Lb7:
            android.content.pm.PackageManager$NameNotFoundException r0 = (android.content.pm.PackageManager.NameNotFoundException) r0
            throw r0
        Lba:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: android.ext.Tools.getApplicationInfo(java.lang.String, int):android.content.pm.ApplicationInfo");
    }

    public static String getApplicationLabel(ApplicationInfo applicationInfo) {
        CharSequence charSequence;
        PackageManager packageManager = f150pm;
        if (applicationInfo != null && packageManager != null) {
            try {
                boolean enter = CheckNativeCrash.enter(applicationInfo.packageName, "label");
                charSequence = applicationInfo.loadLabel(packageManager);
                try {
                    CheckNativeCrash.exit(enter);
                    if (charSequence == null) {
                        boolean enter2 = CheckNativeCrash.enter(applicationInfo.packageName, "label2");
                        charSequence = packageManager.getApplicationLabel(applicationInfo);
                        CheckNativeCrash.exit(enter2);
                    }
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                charSequence = null;
            }
            if (charSequence != null) {
                return charSequence.toString();
            }
        }
        return null;
    }

    public static File getCacheDir() {
        String str = cacheDir;
        if (str == null) {
            str = getDataDir("/cache");
        }
        if (str != null) {
            return new File(str);
        }
        return null;
    }

    public static File getCacheDirHidden() {
        File cacheDir2 = getCacheDir();
        if (cacheDir2 == null) {
            return cacheDir2;
        }
        File file = new File(cacheDir2, getHiddenDir());
        file.mkdirs();
        return file;
    }

    public static int getColor(int i7) {
        return getColor(i7, -1);
    }

    public static int getColor(int i7, int i8) {
        try {
            Context context = getContext();
            return Build.VERSION.SDK_INT >= 23 ? context.getColor(i7) : context.getResources().getColor(i7);
        } catch (Throwable unused) {
            return i8;
        }
    }

    public static Context getContext() {
        return EditorActivity.f3284e2;
    }

    public static View getCustomTitle(int i7) {
        return getCustomTitle("标题");
    }

    public static View getCustomTitle(String str) {
        return getCustomTitle(str, null);
    }

    public static View getCustomTitle(String str, String str2) {
        return getCustomTitle(str, str2, -1);
    }

    public static View getCustomTitle(String str, String str2, int i7) {
        View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.dialog_title, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.alertTitle);
        textView.setText(str);
        if (i7 != -1 && i7 != 0) {
            setButtonHelpBackground(textView);
            textView.setOnClickListener(new View.OnClickListener() { // from class: android.ext.Tools.9
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                }
            });
        }
        if (str2 != null) {
            TextView textView2 = (TextView) inflate.findViewById(R.id.subTitle);
            textView2.setText(str2);
            textView2.setVisibility(0);
        }
        return inflate;
    }

    private static String getDataDir(String str) {
        if (dataDir == null) {
            try {
                ApplicationInfo applicationInfo = getApplicationInfo(C2086f.f9509a);
                if (applicationInfo != null) {
                    dataDir = applicationInfo.dataDir;
                }
            } catch (PackageManager.NameNotFoundException e7) {
                System.out.print(e7.getMessage());
                android.util.Log.e("64454465456", e7.getMessage());
            }
        }
        return (dataDir == null || str == null) ? dataDir : String.valueOf(dataDir).concat(str);
    }

    public static String getDataDirSafe() {
        StringBuilder sb = new StringBuilder("/data/");
        int myUid = Process.myUid() / AID_USER;
        if (myUid == 0) {
            sb.append("data");
        } else {
            sb.append("user/");
            sb.append(myUid);
        }
        sb.append('/');
        String str = pkg;
        if (str == null) {
            str = C2086f.f9509a;
        }
        sb.append(str);
        return sb.toString();
    }

    public static Drawable getDrawable(int i7) {
        try {
            return getContext().getDrawable(i7);
        } catch (NoSuchMethodError unused) {
            return getContext().getResources().getDrawable(i7);
        }
    }

    public static File getFilesDir() {
        String str = filesDir;
        if (str == null) {
            str = getDataDir("/files");
        }
        if (str != null) {
            return new File(str);
        }
        return null;
    }

    public static File getFilesDirHidden() {
        File filesDir2 = getContext().getFilesDir();
        if (filesDir2 == null) {
            return filesDir2;
        }
        new File(filesDir2, getHiddenDir()).mkdirs();
        return filesDir2;
    }

    public static String getHiddenDir() {
        String hiddenDirFallback;
        SharedPreferences.Editor remove;
        if (hiddenDir == null) {
            try {
                SharedPreferences sharedPreferences = getSharedPreferences();
                if (!sharedPreferences.contains("hidden-dir")) {
                    String hiddenDirFallback2 = getHiddenDirFallback();
                    if (hiddenDirFallback2 == null) {
                        hiddenDirFallback2 = getRnd();
                    }
                    sharedPreferences.edit().putString("hidden-dir", hiddenDirFallback2).commit();
                }
                hiddenDirFallback = null;
                try {
                    hiddenDirFallback = sharedPreferences.getString("hidden-dir", null);
                } catch (ClassCastException unused) {
                }
                if (hiddenDirFallback == null) {
                    int i7 = sharedPreferences.getInt("hidden-dir", 0);
                    if (i7 != 0) {
                        hiddenDirFallback = Integer.toString(i7);
                        remove = sharedPreferences.edit().putString("hidden-dir", hiddenDirFallback);
                    } else {
                        remove = sharedPreferences.edit().remove("hidden-dir");
                    }
                    remove.commit();
                }
            } catch (Throwable unused2) {
                hiddenDirFallback = getHiddenDirFallback();
            }
            if (hiddenDirFallback == null) {
                hiddenDirFallback = getRnd();
            }
            hiddenDir = C0089a.m208f(HIDDEN_PREFIX, hiddenDirFallback);
        }
        return hiddenDir;
    }

    private static String getHiddenDirFallback() {
        String[] list;
        try {
            File filesDir2 = getFilesDir();
            if (filesDir2 != null && (list = filesDir2.list()) != null) {
                for (String str : list) {
                    if (str != null && str.startsWith(HIDDEN_PREFIX)) {
                        return str.substring(3);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static Object getIPackageManager() {
        if (iPm == null) {
            try {
                Method declaredMethod = Class.forName("android.os.ServiceManager").getDeclaredMethod("getIServiceManager", new Class[0]);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(null, C0391d0.f1980p);
                Method declaredMethod2 = invoke.getClass().getDeclaredMethod("getService", String.class);
                declaredMethod2.setAccessible(true);
                Object invoke2 = declaredMethod2.invoke(invoke, "package");
                Method declaredMethod3 = Class.forName("android.content.pm.IPackageManager$Stub").getDeclaredMethod("asInterface", IBinder.class);
                declaredMethod3.setAccessible(true);
                iPm = declaredMethod3.invoke(null, invoke2);
            } catch (Throwable unused) {
            }
        }
        return iPm;
    }

    public static ListView getListView(View view) {
        while (view != null) {
            if (view instanceof ListView) {
                return (ListView) view;
            }
            Object parent = view.getParent();
            if (!(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
        return null;
    }

    private static MethodDescr getMethodDescr(Class<? extends Object> cls, MethodDescr[] methodDescrArr) {
        try {
            return methodDescrArr[0].check();
        } catch (NoSuchMethodException unused) {
            MethodDescr methodDescr = null;
            for (int i7 = 0; i7 < methodDescrArr.length; i7++) {
                if (i7 != 0) {
                    try {
                        methodDescr = methodDescrArr[i7].check();
                    } catch (NoSuchMethodException unused2) {
                    }
                }
            }
            return methodDescr;
        }
    }

    public static PackageManager getPackageManager() {
        if (f150pm == null && sePM.use(1)) {
            try {
                f150pm = getActivity().getPackageManager();
            } catch (Throwable unused) {
            }
            sePM.free(1);
        }
        if (f150pm == null && sePM.use(2)) {
            try {
                f150pm = getActivity().getApplication().getPackageManager();
            } catch (Throwable unused2) {
            }
            sePM.free(2);
        }
        if (f150pm == null && sePM.use(4)) {
            try {
                f150pm = getActivity().getApplicationContext().getPackageManager();
            } catch (Throwable unused3) {
            }
            sePM.free(4);
        }
        if (f150pm == null && sePM.use(8)) {
            try {
                f150pm = getContext().getPackageManager();
            } catch (Throwable unused4) {
            }
            sePM.free(8);
        }
        if (f150pm == null && sePM.use(16)) {
            try {
                f150pm = getActivity().getApplicationContext().getPackageManager();
            } catch (Throwable unused5) {
            }
            sePM.free(16);
        }
        return f150pm;
    }

    public static String getPackageName() {
        String str = pkg;
        return str == null ? C2086f.f9509a : str;
    }

    public static int getPid(Process process) {
        try {
            Field declaredField = process.getClass().getDeclaredField("pid");
            declaredField.setAccessible(true);
            int i7 = declaredField.getInt(process);
            declaredField.setAccessible(false);
            return i7;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static String getRealPath(String str) {
        return fakeToReal != null ? str.replace(fakeToReal[0], fakeToReal[1]) : str;
    }

    public static Drawable getResized(Drawable drawable, int i7) {
        Bitmap bitmap;
        try {
            if (!(drawable instanceof BitmapDrawable) || (bitmap = ((BitmapDrawable) drawable).getBitmap()) == null) {
                return drawable;
            }
            int i8 = i7 + 4;
            if (bitmap.getWidth() <= i8 && bitmap.getHeight() <= i8) {
                return drawable;
            }
            System.currentTimeMillis();
            return new BitmapDrawable(getContext().getResources(), Bitmap.createScaledBitmap(bitmap, i7, i7, false));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static String getRnd() {
        StringBuilder sb = new StringBuilder();
        for (int i7 = 0; i7 < 4; i7++) {
            int nextInt = RANDOM.nextInt(63);
            sb.append((char) (nextInt < 10 ? nextInt + 48 : nextInt < 36 ? (nextInt + 65) - 10 : ((nextInt + 97) - 10) - 26));
        }
        return sb.toString();
    }

    public static View getRootView(View view) {
        View rootView = view.getRootView();
        if (rootView != null) {
            return rootView;
        }
        while (true) {
            Object parent = view.getParent();
            if (parent == null || !(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return view;
    }

    public static String getSdcardPath() {
        String str;
        int i7;
        try {
            str = Environment.getExternalStorageDirectory().getAbsolutePath();
        } catch (Throwable unused) {
            str = null;
        }
        if (str == null) {
            return "/sdcard";
        }
        if (!str.startsWith("/storage/emulated/0")) {
            return str;
        }
        if (fixToLegacy == 0) {
            if (!isGoodDir(str)) {
                if (isGoodDir("/storage/emulated/legacy" + str.substring(19))) {
                    i7 = 1;
                    fixToLegacy = i7;
                }
            }
            i7 = -1;
            fixToLegacy = i7;
        }
        if (fixToLegacy <= 0) {
            return str;
        }
        return "/storage/emulated/legacy" + str.substring(19);
    }

    public static SharedPreferences getSharedPreferences() {
        SharedPreferences sharedPreferences = weakSp.get();
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        SharedPreferences sharedPreferences2 = getContext().getSharedPreferences(DEFAULT_STORAGE, 0);
        weakSp = new WeakReference<>(sharedPreferences2);
        return sharedPreferences2;
    }

    public static View getViewForAttach(View view) {
        ViewParent parent;
        if (view != null && (parent = view.getParent()) != null && (parent instanceof ViewGroup)) {
            try {
                ((ViewGroup) parent).removeView(view);
            } catch (Throwable unused) {
            }
        }
        return view;
    }

    private static boolean goodSize(int i7, ViewGroup viewGroup, int i8) {
        viewGroup.requestLayout();
        viewGroup.measure(-2, -2);
        return viewGroup.getMeasuredWidth() <= i7;
    }

    public static boolean hasEditText(View view) {
        if (view != null && view.getVisibility() == 0) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    try {
                        View childAt = viewGroup.getChildAt(i7);
                        if (childAt != null && childAt.getVisibility() == 0 && ((childAt instanceof EditText) || ((childAt instanceof ViewGroup) && hasEditText(childAt)))) {
                            return true;
                        }
                    } catch (ArrayIndexOutOfBoundsException unused) {
                    }
                }
                return false;
            }
            if (view instanceof EditText) {
                return true;
            }
        }
        return false;
    }

    public static void hideKeyboard(View view) {
        C2101m0.m5155a(0, new Runnable() { // from class: android.ext.Tools.12
            @Override // java.lang.Runnable
            public void run() {
            }
        });
    }

    public static void hideKeyboard(WeakReference<DialogInterfaceC0151d> weakReference) {
        DialogInterfaceC0151d dialogInterfaceC0151d;
        if (weakReference == null || (dialogInterfaceC0151d = weakReference.get()) == null) {
            return;
        }
        hideKeyboard(dialogInterfaceC0151d);
    }

    public static void init(Activity activity) {
        try {
            _init(activity);
        } catch (Throwable unused) {
        }
        try {
            _init(activity.getApplication());
        } catch (Throwable unused2) {
        }
        try {
            _init(activity.getApplicationContext());
        } catch (Throwable unused3) {
        }
    }

    public static void init(Context context) {
        try {
            _init(context);
        } catch (Throwable th) {
            Log.badImplementation(th);
        }
    }

    public static boolean isExited(Process process) {
        try {
            process.exitValue();
            return true;
        } catch (IllegalThreadStateException unused) {
            return false;
        }
    }

    private static boolean isGoodDir(String str) {
        try {
            File file = new File(str);
            String[] list = file.list();
            if (list == null) {
                return false;
            }
            if (list.length == 0) {
                File file2 = new File(file, ".gg." + System.nanoTime());
                file2.createNewFile();
                list = file.list();
                file2.delete();
            }
            return list.length > 0;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String removeNewLinesChars(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i7 = 0; i7 < str.length(); i7++) {
            char charAt = str.charAt(i7);
            boolean z6 = false;
            for (int i8 = 0; i8 < 2; i8++) {
                z6 = z6 || charAt == '\n';
                if (i8 != 1) {
                    charAt = (char) (charAt - 3);
                }
            }
            if (z6) {
                sb.append("");
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    public static void removeView(View view) {
        C2101m0.m5155a(0, new Runnable() { // from class: android.ext.Tools.3
            @Override // java.lang.Runnable
            public void run() {
            }
        });
    }

    public static void removeViewImmediate(View view) {
        C2101m0.m5155a(0, new Runnable() { // from class: android.ext.Tools.4
            @Override // java.lang.Runnable
            public void run() {
            }
        });
    }

    public static void removeViewWithWrapper(final View view) {
        C2101m0.m5155a(0, new Runnable() { // from class: android.ext.Tools.2
            @Override // java.lang.Runnable
            public void run() {
                ViewWrapper viewWrapper = (ViewWrapper) view.getParent();
                if (viewWrapper instanceof ViewWrapper) {
                    Tools.removeView(viewWrapper);
                    viewWrapper.removeAllViews();
                }
            }
        });
    }

    public static void selectAll(final EditText editText) {
        if (editText != null) {
            C2101m0.m5155a(0, new Runnable() { // from class: android.ext.Tools.13
                @Override // java.lang.Runnable
                public void run() {
                    Editable text = editText.getText();
                    if (text.length() > 0) {
                        try {
                            text.replace(0, 1, text.subSequence(0, 1), 0, 1);
                        } catch (Throwable unused) {
                        }
                        editText.selectAll();
                    }
                }
            });
        }
    }

    public static void setButtonBackground(View view, Drawable drawable) {
        if (drawable == null) {
            try {
                drawable = new ColorDrawable(0);
            } catch (Throwable unused) {
                return;
            }
        }
        view.setFocusable(true);
        StateListDrawable stateListDrawable = new StateListDrawable();
        Drawable background = new ImageButton(view.getContext()).getBackground();
        stateListDrawable.addState(C2105o0.f9545c, background);
        stateListDrawable.addState(C2105o0.f9547m, background);
        stateListDrawable.addState(C2105o0.f9546e, background);
        stateListDrawable.addState(StateSet.WILD_CARD, drawable);
        view.setBackground(drawable);
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        int paddingTop = view.getPaddingTop();
        int paddingBottom = view.getPaddingBottom();
        view.setBackground(stateListDrawable);
        view.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
    }

    public static void setButtonHelpBackground(View view) {
        setButtonBackground(view, getDrawable(2130837555));
    }

    public static boolean setButtonListener(DialogInterface dialogInterface, int i7, Object obj, View.OnClickListener onClickListener) {
        Button m483h;
        if (!(dialogInterface instanceof DialogInterfaceC0151d) || (m483h = ((DialogInterfaceC0151d) dialogInterface).m483h(i7)) == null) {
            return false;
        }
        m483h.setTag(obj);
        m483h.setOnClickListener(onClickListener);
        return true;
    }

    public static boolean setButtonListener(DialogInterface dialogInterface, int i7, Object obj, View.OnClickListener onClickListener, EditText editText) {
        if (editText != null) {
            editText.requestFocus();
            selectAll(editText);
        }
        return setButtonListener(dialogInterface, i7, obj, onClickListener);
    }

    public static void setHeight(View view, float f7) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = (int) f7;
            view.setLayoutParams(layoutParams);
        }
    }

    public static void setOnFocusChangeListener(View view, View.OnFocusChangeListener onFocusChangeListener) {
        FocusChangeListener focusChangeListener = (FocusChangeListener) view.getTag(2130968589);
        final ArrayList arrayList = new ArrayList();
        if (focusChangeListener == null) {
            View.OnFocusChangeListener onFocusChangeListener2 = new View.OnFocusChangeListener() { // from class: android.ext.Tools.8
                @Override // android.view.View.OnFocusChangeListener
                public void onFocusChange(View view2, boolean z6) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((View.OnFocusChangeListener) it.next()).onFocusChange(view2, z6);
                    }
                }
            };
            view.setOnFocusChangeListener(onFocusChangeListener2);
            view.setTag(2130968589, onFocusChangeListener2);
        }
        add(onFocusChangeListener, arrayList);
    }

    public static void setTextAppearance(TextView textView, int i7) {
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                textView.setTextAppearance(i7);
            } else {
                textView.setTextAppearance(textView.getContext(), i7);
            }
        } catch (Throwable unused) {
        }
    }

    public static void setUseSoundEffects(View view) {
        if ((Config.configClient & 32) != 0 || view == null) {
            return;
        }
        View rootView = getRootView(view);
        rootView.setSoundEffectsEnabled(false);
        if (rootView instanceof ViewGroup) {
            disableSoundEffects((ViewGroup) rootView);
        }
    }

    private static void setView(final View view, final WindowManager.LayoutParams layoutParams, final boolean z6) {
        fixViewParams(layoutParams);
        C2101m0.m5155a(0, new Runnable() { // from class: android.ext.Tools.5
            @Override // java.lang.Runnable
            public void run() {
                Tools.checkPermission();
                try {
                    if (z6) {
                        ViewOnClickListenerC1728d.f7901B2.addView(view, layoutParams);
                    } else {
                        ViewOnClickListenerC1728d.f7901B2.updateViewLayout(view, layoutParams);
                    }
                } catch (WindowManager.BadTokenException e7) {
                    String message = e7.getMessage();
                    if (message == null || !message.contains("permission denied") || layoutParams.type == C2097k0.m5153b()) {
                        throw e7;
                    }
                    WindowManager.LayoutParams layoutParams2 = layoutParams;
                    int i7 = layoutParams2.type;
                    layoutParams2.type = C2097k0.m5153b();
                    try {
                        if (z6) {
                            ViewOnClickListenerC1728d.f7901B2.addView(view, layoutParams);
                        } else {
                            ViewOnClickListenerC1728d.f7901B2.updateViewLayout(view, layoutParams);
                        }
                    } catch (WindowManager.BadTokenException e8) {
                        layoutParams.type = i7;
                        throw e8;
                    }
                } catch (Throwable unused) {
                }
                if (z6) {
                    Tools.fixViews(view);
                }
            }
        });
    }

    public static void setWidth(View view, float f7) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = (int) f7;
            view.setLayoutParams(layoutParams);
        }
    }

    public static String stringFormat(String str, Object... objArr) {
        return "";
    }

    public static Drawable tryCloneIcon(Drawable drawable) {
        if (drawable == null) {
            return drawable;
        }
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            return constantState != null ? constantState.newDrawable() : drawable;
        } catch (Throwable unused) {
            return drawable;
        }
    }

    public static void updateViewLayout(View view, WindowManager.LayoutParams layoutParams) {
        ViewParent parent = view.getParent();
        if (parent instanceof ViewWrapper) {
            view = (ViewWrapper) parent;
        }
        setView(view, layoutParams, false);
    }

    public static boolean waitForTimeout(final Process process, int i7) {
        FutureTask futureTask = new FutureTask(new Callable<Boolean>() { // from class: android.ext.Tools.14
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Boolean call() {
                process.waitFor();
                return Boolean.TRUE;
            }
        });
        new ExceptionHandler.ThreadEx(futureTask, "waitForTimeout: " + process).start();
        try {
            return ((Boolean) futureTask.get(i7, TimeUnit.SECONDS)).booleanValue();
        } catch (Exception unused) {
            return isExited(process);
        }
    }

    public static void hideKeyboard(final Window window) {
        C2101m0.m5155a(0, new Runnable() { // from class: android.ext.Tools.11
            @Override // java.lang.Runnable
            public void run() {
                try {
                    View currentFocus = window.getCurrentFocus();
                    if (currentFocus == null) {
                        currentFocus = window.peekDecorView();
                    }
                    if (currentFocus != null) {
                        Tools.hideKeyboard(currentFocus);
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }

    public static void hideKeyboard(final DialogInterfaceC0151d dialogInterfaceC0151d) {
        C2101m0.m5155a(0, new Runnable() { // from class: android.ext.Tools.10
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Tools.hideKeyboard(DialogInterfaceC0151d.this.getWindow());
                } catch (Throwable unused) {
                }
            }
        });
    }
}
