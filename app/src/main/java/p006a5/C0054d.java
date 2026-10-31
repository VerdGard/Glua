package p006a5;

import android.ext.C0091c;
import java.util.concurrent.ArrayBlockingQueue;
import p006a5.InterfaceC0053c;
import p023c6.InterfaceC0670p;

/* renamed from: a5.d */
/* loaded from: classes.dex */
public final class C0054d<SpanT extends InterfaceC0053c> {

    /* renamed from: a */
    public final InterfaceC0670p<Integer, Long, SpanT> f142a;

    /* renamed from: b */
    public final ArrayBlockingQueue<SpanT> f143b = new ArrayBlockingQueue<>(16384);

    public C0054d(C0091c c0091c) {
        this.f142a = c0091c;
    }
}
