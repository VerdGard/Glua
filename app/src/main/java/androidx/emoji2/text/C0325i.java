package androidx.emoji2.text;

import androidx.emoji2.text.C0323g;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: androidx.emoji2.text.i */
/* loaded from: classes.dex */
public final class C0325i extends C0323g.h {

    /* renamed from: a */
    public final /* synthetic */ C0323g.h f1578a;

    /* renamed from: b */
    public final /* synthetic */ ThreadPoolExecutor f1579b;

    public C0325i(C0323g.h hVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f1578a = hVar;
        this.f1579b = threadPoolExecutor;
    }

    @Override // androidx.emoji2.text.C0323g.h
    /* renamed from: a */
    public final void mo1100a(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f1579b;
        try {
            this.f1578a.mo1100a(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // androidx.emoji2.text.C0323g.h
    /* renamed from: b */
    public final void mo1101b(C0331o c0331o) {
        ThreadPoolExecutor threadPoolExecutor = this.f1579b;
        try {
            this.f1578a.mo1101b(c0331o);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
