package p129q1;

import java.util.ArrayList;
import java.util.List;
import p122p1.C1695c;

/* renamed from: q1.g */
/* loaded from: classes.dex */
public final class RunnableC1731g implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ List f7932c;

    /* renamed from: e */
    public final /* synthetic */ ViewOnClickListenerC1728d f7933e;

    public RunnableC1731g(ViewOnClickListenerC1728d viewOnClickListenerC1728d, ArrayList arrayList) {
        this.f7933e = viewOnClickListenerC1728d;
        this.f7932c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list = this.f7932c;
        list.add("脚本运行结束\n");
        ViewOnClickListenerC1728d viewOnClickListenerC1728d = this.f7933e;
        C1695c c1695c = viewOnClickListenerC1728d.f7916v2;
        c1695c.f7633c.addAll(list);
        c1695c.f2197a.m1591b();
        viewOnClickListenerC1728d.f7902h2.m1542Z(viewOnClickListenerC1728d.f7916v2.mo1583a() - 1);
    }
}
