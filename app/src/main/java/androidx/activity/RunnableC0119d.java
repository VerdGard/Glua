package androidx.activity;

import android.content.Context;
import android.graphics.Typeface;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewOnLongClickListenerC0248m1;
import androidx.emoji2.text.C0323g;
import androidx.emoji2.text.C0329m;
import androidx.emoji2.text.C0330n;
import androidx.emoji2.text.C0331o;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.timepicker.C0861c;
import java.nio.MappedByteBuffer;
import p001a0.C0013l;
import p009b0.C0509m;
import p021c4.C0619g;
import p071i5.C1366f;
import p071i5.C1374k;
import p090l0.C1486c;
import p181x.C2156e;
import p181x.C2164m;

/* renamed from: androidx.activity.d */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0119d implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ int f223c;

    /* renamed from: e */
    public final /* synthetic */ Object f224e;

    public /* synthetic */ RunnableC0119d(int i7, Object obj) {
        this.f223c = i7;
        this.f224e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f223c) {
            case 0:
                ((ComponentActivity) this.f224e).invalidateOptionsMenu();
                return;
            case 1:
                ComponentActivity.ExecutorC0112e executorC0112e = (ComponentActivity.ExecutorC0112e) this.f224e;
                Runnable runnable = executorC0112e.f190e;
                if (runnable != null) {
                    runnable.run();
                    executorC0112e.f190e = null;
                    return;
                }
                return;
            case 2:
                ((Toolbar) this.f224e).m633l();
                return;
            case 3:
                ((ViewOnLongClickListenerC0248m1) this.f224e).m862c(false);
                return;
            case 4:
                C0329m.b bVar = (C0329m.b) this.f224e;
                synchronized (bVar.f1602d) {
                    if (bVar.f1606h == null) {
                        return;
                    }
                    try {
                        C0509m m1120d = bVar.m1120d();
                        int i7 = m1120d.f2543e;
                        if (i7 == 2) {
                            synchronized (bVar.f1602d) {
                            }
                        }
                        if (i7 != 0) {
                            throw new RuntimeException("fetchFonts result is not OK. (" + i7 + ")");
                        }
                        try {
                            int i8 = C0013l.f12a;
                            C0013l.a.m60a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                            C0329m.a aVar = bVar.f1601c;
                            Context context = bVar.f1599a;
                            aVar.getClass();
                            Typeface mo5285b = C2156e.f9771a.mo5285b(context, new C0509m[]{m1120d}, 0);
                            MappedByteBuffer m5306e = C2164m.m5306e(bVar.f1599a, m1120d.f2539a);
                            if (m5306e == null || mo5285b == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            try {
                                C0013l.a.m60a("EmojiCompat.MetadataRepo.create");
                                C0331o c0331o = new C0331o(mo5285b, C0330n.m1121a(m5306e));
                                C0013l.a.m61b();
                                C0013l.a.m61b();
                                synchronized (bVar.f1602d) {
                                    C0323g.h hVar = bVar.f1606h;
                                    if (hVar != null) {
                                        hVar.mo1101b(c0331o);
                                    }
                                }
                                bVar.m1118b();
                                return;
                            } finally {
                                int i9 = C0013l.f12a;
                                C0013l.a.m61b();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    } catch (Throwable th2) {
                        synchronized (bVar.f1602d) {
                            C0323g.h hVar2 = bVar.f1606h;
                            if (hVar2 != null) {
                                hVar2.mo1100a(th2);
                            }
                            bVar.m1118b();
                            return;
                        }
                    }
                }
            case 5:
            case 6:
            default:
                C1374k c1374k = ((C1374k.a) this.f224e).f6690Z;
                c1374k.f6687Q1 = false;
                ((C1366f) c1374k.f6681K1).f6635b.setVisibility(8);
                return;
            case 7:
                SideSheetBehavior.C0833d c0833d = (SideSheetBehavior.C0833d) this.f224e;
                c0833d.f4394b = false;
                SideSheetBehavior sideSheetBehavior = c0833d.f4396d;
                C1486c c1486c = sideSheetBehavior.f4387x1;
                if (c1486c != null && c1486c.m3899g()) {
                    c0833d.m2488a(c0833d.f4393a);
                    return;
                } else {
                    if (sideSheetBehavior.f4386w1 == 2) {
                        sideSheetBehavior.m2486y(c0833d.f4393a);
                        return;
                    }
                    return;
                }
            case 8:
                ((C0619g) this.f224e).m2061t(true);
                return;
            case 9:
                ((C0861c) this.f224e).mo2548g();
                return;
        }
    }
}
