package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.C0421b;
import androidx.profileinstaller.C0422c;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;
import p144s0.C1866b;
import p144s0.C1872h;
import p144s0.ExecutorC1867c;

/* renamed from: androidx.profileinstaller.b */
/* loaded from: classes.dex */
public final class C0421b {

    /* renamed from: a */
    public final Executor f2031a;

    /* renamed from: b */
    public final C0422c.c f2032b;

    /* renamed from: c */
    public final byte[] f2033c;

    /* renamed from: d */
    public final File f2034d;

    /* renamed from: e */
    public final String f2035e;

    /* renamed from: f */
    public boolean f2036f = false;

    /* renamed from: g */
    public C1866b[] f2037g;

    /* renamed from: h */
    public byte[] f2038h;

    public C0421b(AssetManager assetManager, ExecutorC1867c executorC1867c, C0422c.c cVar, String str, File file) {
        byte[] bArr;
        this.f2031a = executorC1867c;
        this.f2032b = cVar;
        this.f2035e = str;
        this.f2034d = file;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 24 && i7 <= 33) {
            switch (i7) {
                case 24:
                case 25:
                    bArr = C1872h.f8406e;
                    break;
                case 26:
                    bArr = C1872h.f8405d;
                    break;
                case 27:
                    bArr = C1872h.f8404c;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = C1872h.f8403b;
                    break;
                case 31:
                case 32:
                case 33:
                    bArr = C1872h.f8402a;
                    break;
            }
            this.f2033c = bArr;
        }
        bArr = null;
        this.f2033c = bArr;
    }

    /* renamed from: a */
    public final FileInputStream m1417a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e7) {
            String message = e7.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f2032b.mo1412a();
            }
            return null;
        }
    }

    /* renamed from: b */
    public final void m1418b(final int i7, final Serializable serializable) {
        this.f2031a.execute(new Runnable() { // from class: s0.a
            @Override // java.lang.Runnable
            public final void run() {
                C0421b.this.f2032b.mo1413b(i7, serializable);
            }
        });
    }
}
