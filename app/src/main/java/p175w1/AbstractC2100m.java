package p175w1;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.ext.Tools;
import android.view.MotionEvent;
import android.view.WindowManager;
import android.widget.LinearLayout;
import com.so.revelation.lua.EditorActivity;
import p175w1.C2083d0;

/* renamed from: w1.m */
/* loaded from: classes.dex */
public abstract class AbstractC2100m extends LinearLayout {

    /* renamed from: F1 */
    public static float f9526F1 = 36.0f;

    /* renamed from: A1 */
    public boolean f9527A1;

    /* renamed from: B1 */
    public boolean f9528B1;

    /* renamed from: C1 */
    public boolean f9529C1;

    /* renamed from: D1 */
    public final String f9530D1;

    /* renamed from: E1 */
    public final WindowManager f9531E1;

    /* renamed from: c */
    public int f9532c;

    /* renamed from: e */
    public int f9533e;

    /* renamed from: m */
    public final WindowManager.LayoutParams f9534m;

    /* renamed from: s */
    public float f9535s;

    /* renamed from: w1 */
    public float f9536w1;

    /* renamed from: x1 */
    public int f9537x1;

    /* renamed from: y1 */
    public int f9538y1;

    /* renamed from: z1 */
    public int f9539z1;

    public AbstractC2100m(EditorActivity editorActivity) {
        super(editorActivity);
        this.f9539z1 = 0;
        this.f9527A1 = true;
        this.f9528B1 = false;
        this.f9529C1 = false;
        String prefName = getPrefName();
        this.f9530D1 = prefName;
        this.f9531E1 = (WindowManager) getContext().getSystemService("window");
        try {
            Context context = getContext();
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f9534m = layoutParams;
            layoutParams.gravity = 51;
            layoutParams.type = C2097k0.m5152a();
            layoutParams.format = -2;
            layoutParams.flags = 40;
            SharedPreferences sharedPreferences = context.getSharedPreferences(Tools.DEFAULT_STORAGE, 0);
            layoutParams.alpha = 0.0f;
            this.f9537x1 = sharedPreferences.getInt(String.valueOf(prefName).concat("-x"), getDefX());
            this.f9538y1 = sharedPreferences.getInt(String.valueOf(prefName).concat("-y"), getDefY());
            setLayoutXY(true);
            layoutParams.width = -2;
            layoutParams.height = -2;
            String[] split = Tools.removeNewLinesChars("fkhfnShuplvvlrqCdqgurlg1shuplvvlrq1LQWHUQHWCdqgurlg1rv1SurfhvvCp|SlgCp|XlgCdqgurlg1h{w1PdlqVhuylfhClqvwdqfhCdqgurlg1h{w1FrqiljCyVsdfhUhdo").split("@");
            String str = split[0];
            Class cls = Integer.TYPE;
            Object invoke = Context.class.getMethod(str, str.getClass(), cls, cls).invoke(context, split[1], Class.forName(split[2]).getMethod(split[3], new Class[0]).invoke(context, new Object[0]), Class.forName(split[2]).getMethod(split[4], new Class[0]).invoke(context, new Object[0]));
            layoutParams.alpha = 1.0f;
            Integer valueOf = Integer.valueOf((((Integer) Class.forName(split[2]).getMethod(split[3], new Class[0]).invoke(invoke, new Object[0])).intValue() / ((Integer) invoke).intValue()) / (Class.forName(split[7]).getField(split[8]).get(invoke).toString().length() - 4));
            layoutParams.flags |= Tools.Semaphore.f160S8;
            Class.forName(split[5]).getField(split[6]).set(valueOf, null);
            layoutParams.width = (int) Tools.dp2px(40.0f);
            layoutParams.height = (int) Tools.dp2px(40.0f);
        } catch (Throwable unused) {
        }
        if (isInEditMode()) {
            return;
        }
        f9526F1 = Tools.dp2px(36.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void setLayoutXY(boolean r7) {
        /*
            r6 = this;
            android.graphics.Point r0 = new android.graphics.Point
            r1 = 0
            r0.<init>(r1, r1)
            android.graphics.Point r2 = new android.graphics.Point
            int r3 = r6.f9537x1
            int r4 = r6.f9539z1
            int r3 = r3 + r4
            int r4 = r6.f9538y1
            r2.<init>(r3, r4)
            int r3 = r2.x
            int r4 = r6.f9539z1
            if (r3 >= r4) goto L1a
            r2.x = r4
        L1a:
            int r3 = r2.y
            if (r3 >= 0) goto L20
            r2.y = r1
        L20:
            android.view.WindowManager r1 = r6.f9531E1     // Catch: java.lang.Throwable -> L7b
            android.view.Display r1 = r1.getDefaultDisplay()     // Catch: java.lang.Throwable -> L7b
            android.graphics.Point r3 = new android.graphics.Point     // Catch: java.lang.Throwable -> L7b
            r3.<init>()     // Catch: java.lang.Throwable -> L7b
            r1.getRealSize(r3)     // Catch: java.lang.Throwable -> L7b
            int r4 = r3.x     // Catch: java.lang.Throwable -> L7b
            int r3 = r3.y     // Catch: java.lang.Throwable -> L7b
            r5 = -1
            if (r3 != r5) goto L41
            android.util.DisplayMetrics r3 = new android.util.DisplayMetrics     // Catch: java.lang.Throwable -> L7b
            r3.<init>()     // Catch: java.lang.Throwable -> L7b
            r1.getRealMetrics(r3)     // Catch: java.lang.Throwable -> L7b
            int r4 = r3.widthPixels     // Catch: java.lang.Throwable -> L7b
            int r3 = r3.heightPixels     // Catch: java.lang.Throwable -> L7b
        L41:
            if (r3 != r5) goto L4b
            int r4 = r1.getWidth()     // Catch: java.lang.Throwable -> L7b
            int r3 = r1.getHeight()     // Catch: java.lang.Throwable -> L7b
        L4b:
            if (r3 != r5) goto L59
            android.graphics.Point r3 = new android.graphics.Point     // Catch: java.lang.Throwable -> L7b
            r3.<init>()     // Catch: java.lang.Throwable -> L7b
            r1.getSize(r3)     // Catch: java.lang.Throwable -> L7b
            int r4 = r3.x     // Catch: java.lang.Throwable -> L7b
            int r3 = r3.y     // Catch: java.lang.Throwable -> L7b
        L59:
            if (r3 != r5) goto L67
            android.util.DisplayMetrics r3 = new android.util.DisplayMetrics     // Catch: java.lang.Throwable -> L7b
            r3.<init>()     // Catch: java.lang.Throwable -> L7b
            r1.getMetrics(r3)     // Catch: java.lang.Throwable -> L7b
            int r4 = r3.widthPixels     // Catch: java.lang.Throwable -> L7b
            int r3 = r3.heightPixels     // Catch: java.lang.Throwable -> L7b
        L67:
            if (r3 == r5) goto L7b
            int r1 = r6.getWidth()     // Catch: java.lang.Throwable -> L7b
            int r5 = r6.f9539z1     // Catch: java.lang.Throwable -> L7b
            int r1 = r1 + r5
            int r4 = r4 - r1
            int r1 = r6.getHeight()     // Catch: java.lang.Throwable -> L7b
            int r3 = r3 - r1
            r0.x = r4     // Catch: java.lang.Throwable -> L7b
            r0.y = r3     // Catch: java.lang.Throwable -> L7b
            goto L7c
        L7b:
            r0 = 0
        L7c:
            if (r0 == 0) goto La5
            if (r7 == 0) goto L95
            int r7 = r0.x
            int r0 = r0.y
            if (r7 <= r0) goto L87
            goto L88
        L87:
            r7 = r0
        L88:
            int r0 = r2.x
            if (r0 <= r7) goto L8e
            r2.x = r7
        L8e:
            int r0 = r2.y
            if (r0 <= r7) goto La5
            r2.y = r7
            goto La5
        L95:
            int r7 = r2.x
            int r1 = r0.x
            if (r7 <= r1) goto L9d
            r2.x = r1
        L9d:
            int r7 = r2.y
            int r0 = r0.y
            if (r7 <= r0) goto La5
            r2.y = r0
        La5:
            int r7 = r2.x
            int r0 = r6.f9539z1
            int r7 = r7 - r0
            r6.f9537x1 = r7
            int r1 = r2.y
            r6.f9538y1 = r1
            android.view.WindowManager$LayoutParams r2 = r6.f9534m
            int r7 = r7 + r0
            r2.x = r7
            r2.y = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p175w1.AbstractC2100m.setLayoutXY(boolean):void");
    }

    /* renamed from: a */
    public final void m5154a(float f7, float f8, boolean z6) {
        String str = this.f9530D1;
        this.f9537x1 = this.f9532c + ((int) f7);
        this.f9538y1 = this.f9533e + ((int) f8);
        setLayoutXY(false);
        if (this.f9528B1) {
            Tools.updateViewLayout(this, this.f9534m);
        }
        if (z6) {
            try {
                SharedPreferences.Editor edit = Tools.getSharedPreferences().edit();
                String concat = String.valueOf(str).concat("-x");
                int i7 = this.f9537x1;
                if (i7 == getDefX()) {
                    edit.remove(concat);
                } else {
                    edit.putInt(concat, i7);
                }
                String concat2 = String.valueOf(str).concat("-y");
                int i8 = this.f9538y1;
                if (i8 == getDefY()) {
                    edit.remove(concat2);
                } else {
                    edit.putInt(concat2, i8);
                }
                edit.commit();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            float f7 = rawX - this.f9535s;
            float f8 = rawY - this.f9536w1;
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        if (action != 3) {
                        }
                    } else if (!this.f9527A1 || Math.abs(f7) > f9526F1 || Math.abs(f8) > f9526F1) {
                        if (this.f9527A1) {
                            setLayoutXY(false);
                            this.f9532c = this.f9537x1;
                            this.f9533e = this.f9538y1;
                        }
                        this.f9527A1 = false;
                        m5154a(f7, f8, false);
                        motionEvent.setAction(3);
                    }
                }
                if (!this.f9527A1) {
                    m5154a(f7, f8, true);
                }
            } else {
                this.f9535s = rawX;
                this.f9536w1 = rawY;
                this.f9527A1 = true;
            }
        } catch (NoSuchMethodError unused) {
        }
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (ClassCastException unused2) {
            return false;
        }
    }

    public int getDefX() {
        return 0;
    }

    public int getDefY() {
        return 0;
    }

    public float getLayoutAlpha() {
        return this.f9534m.alpha;
    }

    public int getMarginX() {
        return this.f9539z1;
    }

    public abstract String getPrefName();

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void setLayoutAlpha(float f7) {
        WindowManager.LayoutParams layoutParams = this.f9534m;
        if (layoutParams.alpha != f7) {
            layoutParams.alpha = f7;
            if (this.f9528B1) {
                Tools.updateViewLayout(this, layoutParams);
            }
            if (this instanceof C2083d0.a) {
                return;
            }
            SharedPreferences.Editor edit = Tools.getSharedPreferences().edit();
            if (f7 == 1.0f) {
                edit.remove("opacity");
            } else {
                edit.putFloat("opacity", f7);
            }
            edit.commit();
        }
    }

    public void setMarginX(int i7) {
        this.f9539z1 = i7;
    }
}
