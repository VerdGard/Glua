package com.so.revelation.lua;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import androidx.lifecycle.C0391d0;
import com.so.revelation.lua.View.widget.SlidingUpPanelLayout;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintStream;
import p002a1.C0017d;
import p055g5.C1245b;
import p071i5.C1371h0;
import p122p1.C1695c;
import p129q1.ViewOnClickListenerC1728d;
import p141r5.AbstractC1841c;
import p141r5.C1839a;
import p164u5.C1976a;
import p168v1.AbstractApplicationC2012b;
import p191y1.C2225d;

/* loaded from: classes.dex */
public class Code extends C1245b {

    /* renamed from: o3 */
    public final Context f3260o3;

    /* renamed from: p3 */
    public ViewOnClickListenerC1728d f3261p3;

    /* renamed from: q3 */
    @SuppressLint({"HandlerLeak"})
    public final HandlerC0682a f3262q3;

    /* renamed from: com.so.revelation.lua.Code$a */
    public class HandlerC0682a extends Handler {
        public HandlerC0682a() {
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            String str;
            int i7 = message.what;
            if (i7 == 257) {
                Code.this.setText(message.obj.toString());
                return;
            }
            if (i7 == 258) {
                str = "打开脚本文件失败";
            } else if (i7 == 513) {
                C0391d0.m1370q("保存成功", true);
                return;
            } else if (i7 != 514) {
                return;
            } else {
                str = "保存失败";
            }
            C0391d0.m1370q(str, false);
        }
    }

    public Code(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3262q3 = new HandlerC0682a();
        this.f3260o3 = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences("data", 0);
        setEditorLanguage(new C2225d());
        setCursorAnimationEnabled(false);
        setBasicDisplayMode(true);
        if (sharedPreferences.getBoolean("isAssetFont", true)) {
            setTypefaceText(Typeface.createFromAsset(AbstractApplicationC2012b.f9161c.getAssets(), "JetBrainsMono-Regular.ttf"));
        }
        setNonPrintablePaintingFlags(64);
        setWordwrap(sharedPreferences.getBoolean("zdhh", true));
        setPinLineNumber(sharedPreferences.getBoolean("pinline", false));
        setLineNumberEnabled(sharedPreferences.getBoolean("showline", true));
        C1371h0 c1371h0 = (C1371h0) m3468K(C1371h0.class);
        boolean z6 = sharedPreferences.getBoolean("magnifier", true);
        c1371h0.f6665x1 = z6;
        if (!z6) {
            c1371h0.m3728a();
        }
        setStickyTextSelection(true);
    }

    public void setEditorFragment(ViewOnClickListenerC1728d viewOnClickListenerC1728d) {
        this.f3261p3 = viewOnClickListenerC1728d;
    }

    /* renamed from: v0 */
    public final String m2187v0(String str, boolean z6) {
        try {
            C1839a m71J = C0017d.m71J(new C1976a(new ByteArrayInputStream(str.getBytes())));
            AbstractC1841c.f8313d = z6;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            m71J.mo4330b(new PrintStream(byteArrayOutputStream));
            return byteArrayOutputStream.toString();
        } catch (Exception e7) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(e7.getMessage());
            stringBuffer.append("\n");
            for (StackTraceElement stackTraceElement : e7.getStackTrace()) {
                stringBuffer.append(stackTraceElement.toString());
                stringBuffer.append("\n");
            }
            ViewOnClickListenerC1728d viewOnClickListenerC1728d = this.f3261p3;
            if (viewOnClickListenerC1728d == null) {
                return null;
            }
            String stringBuffer2 = stringBuffer.toString();
            viewOnClickListenerC1728d.f7903i2.setPanelState(SlidingUpPanelLayout.EnumC0710e.f3565c);
            C1695c c1695c = viewOnClickListenerC1728d.f7916v2;
            c1695c.f7633c.add(0, "️\n");
            c1695c.f2197a.m1591b();
            C1695c c1695c2 = viewOnClickListenerC1728d.f7916v2;
            c1695c2.f7633c.add(0, stringBuffer2);
            c1695c2.f2197a.m1591b();
            return null;
        }
    }

    /* renamed from: w0 */
    public final boolean m2188w0(String str) {
        if (str == null) {
            return true;
        }
        File file = new File(str);
        if (file.exists() && !file.canWrite()) {
            return false;
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(str));
        bufferedWriter.write(getText().toString() + "");
        bufferedWriter.close();
        return true;
    }
}
