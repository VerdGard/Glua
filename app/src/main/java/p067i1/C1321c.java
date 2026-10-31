package p067i1;

import android.util.JsonReader;
import java.util.concurrent.ConcurrentHashMap;
import p070i4.InterfaceC1349o;
import p111n5.InterfaceC1647c;

/* renamed from: i1.c */
/* loaded from: classes.dex */
public final class C1321c implements InterfaceC1328j, InterfaceC1349o, InterfaceC1647c {

    /* renamed from: a */
    public static final C1321c f6519a = new C1321c();

    @Override // p067i1.InterfaceC1328j
    /* renamed from: c */
    public Object mo105c(JsonReader jsonReader, float f7) {
        return Integer.valueOf(Math.round(C1322d.m3685d(jsonReader) * f7));
    }

    @Override // p111n5.InterfaceC1647c
    /* renamed from: d */
    public String[] mo106d() {
        return new String[]{"CURRENT_YEAR", "CURRENT_YEAR_SHORT", "CURRENT_MONTH", "CURRENT_DATE", "CURRENT_HOUR", "CURRENT_MINUTE", "CURRENT_SECOND", "CURRENT_DAY_NAME", "CURRENT_DAY_NAME_SHORT", "CURRENT_MONTH_NAME", "CURRENT_MONTH_NAME_SHORT", "CURRENT_SECONDS_UNIX"};
    }

    @Override // p070i4.InterfaceC1349o
    /* renamed from: e */
    public Object mo107e() {
        return new ConcurrentHashMap();
    }
}
