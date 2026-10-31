package com.so.revelation.lua.p024gg;

import android.annotation.SuppressLint;
import android.content.Context;
import android.ext.Tools;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import p175w1.AbstractC2100m;
import p175w1.C2097k0;
import p175w1.C2101m0;
import p175w1.RunnableC2089g0;
import p175w1.RunnableC2098l;

@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes.dex */
public class ShowApp extends ImageView {

    /* renamed from: w1 */
    public static final ArrayList<C0733c> f3679w1 = new ArrayList<>();

    /* renamed from: c */
    public final RunnableC0732b f3680c;

    /* renamed from: e */
    public final WindowManager.LayoutParams f3681e;

    /* renamed from: m */
    public final WindowManager.LayoutParams f3682m;

    /* renamed from: s */
    public volatile boolean f3683s;

    /* renamed from: com.so.revelation.lua.gg.ShowApp$a */
    public class ViewOnTouchListenerC0731a implements View.OnTouchListener {
        public ViewOnTouchListenerC0731a() {
        }

        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            ShowApp showApp = ShowApp.this;
            if (action == 0) {
                showApp.m2261b(true);
                return true;
            }
            if (action != 1 && action != 3) {
                return false;
            }
            showApp.m2261b(false);
            return true;
        }
    }

    /* renamed from: com.so.revelation.lua.gg.ShowApp$b */
    public class RunnableC0732b implements Runnable {
        public RunnableC0732b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ShowApp showApp = ShowApp.this;
            showApp.getClass();
            C2101m0.m5155a(0, new RunnableC2089g0(showApp));
        }
    }

    /* renamed from: com.so.revelation.lua.gg.ShowApp$c */
    public static class C0733c {
    }

    public ShowApp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3683s = false;
        if (!isInEditMode()) {
            TextView textView = new TextView(getContext());
            try {
                textView.setGravity(17);
            } catch (NoSuchMethodError unused) {
            }
            textView.setText(Tools.removeNewLinesChars(""));
            textView.setBackgroundColor(-16777216);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f3682m = layoutParams;
            layoutParams.type = C2097k0.m5153b();
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.format = -2;
            layoutParams.gravity = 51;
            layoutParams.x = -10000;
            layoutParams.y = -10000;
            layoutParams.flags = 8;
            WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams();
            this.f3681e = layoutParams2;
            layoutParams2.type = C2097k0.m5153b();
            layoutParams2.width = (int) Tools.dp2px(60.0f);
            layoutParams2.height = (int) Tools.dp2px(20.0f);
            layoutParams2.format = -2;
            layoutParams2.gravity = 51;
            layoutParams2.x = 10000;
            layoutParams2.y = 10000;
            layoutParams2.flags = 264;
            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams();
            layoutParams3.type = C2097k0.m5152a();
            layoutParams3.width = -2;
            layoutParams3.height = -2;
            layoutParams3.format = -2;
            layoutParams3.gravity = 49;
            layoutParams3.x = 0;
            layoutParams3.y = -1000;
            layoutParams3.flags = 24;
            setOnTouchListener(new ViewOnTouchListenerC0731a());
        }
        this.f3680c = new RunnableC0732b();
    }

    /* renamed from: a */
    public static boolean m2260a(View view) {
        if (view == null) {
            return false;
        }
        try {
            if (view instanceof AbstractC2100m) {
                C2101m0.m5155a(0, new RunnableC2098l((AbstractC2100m) view));
                return true;
            }
            Tools.removeViewWithWrapper(view);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: b */
    public final void m2261b(boolean z6) {
        Iterator<C0733c> it = f3679w1.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw null;
        }
    }
}
