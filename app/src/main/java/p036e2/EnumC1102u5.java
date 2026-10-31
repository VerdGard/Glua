package p036e2;

import android.content.Context;
import android.content.Intent;
import org.json.JSONException;
import org.json.JSONObject;
import p016c.C0572z;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: e2.u5 */
/* loaded from: classes.dex */
public abstract class EnumC1102u5 {

    /* renamed from: e */
    public static final b f5477e;

    /* renamed from: m */
    public static final /* synthetic */ EnumC1102u5[] f5478m;

    /* renamed from: c */
    public final int f5479c;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1102u5 EF0;

    /* renamed from: e2.u5$b */
    public enum b extends EnumC1102u5 {
        public b() {
            super("NO_SERVICE", 1, 2);
        }

        @Override // p036e2.EnumC1102u5
        /* renamed from: a */
        public final void mo3232a(Context context) {
            Context applicationContext = context.getApplicationContext();
            C0572z m3241d = C1109v5.m3241d(context);
            C1016i3 c1016i3 = C1016i3.f5129e;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("SDK_BPLUS_SERVICE", false);
            } catch (JSONException e7) {
                c1016i3.m386n(e7);
            }
            try {
                jSONObject.put("SDK_PRODUCT_LY", "M");
            } catch (JSONException e8) {
                c1016i3.m386n(e8);
            }
            try {
                jSONObject.put("SDK_LOCAL_SERVER", false);
            } catch (JSONException e9) {
                c1016i3.m386n(e9);
            }
            m3241d.m1995b(applicationContext, jSONObject);
        }
    }

    static {
        EnumC1102u5 enumC1102u5 = new EnumC1102u5() { // from class: e2.u5.a
            @Override // p036e2.EnumC1102u5
            /* renamed from: a */
            public final void mo3232a(Context context) {
                ((C1130y5) C1109v5.m3241d(context).f2925b).getClass();
                boolean z6 = true;
                if ((C1123x5.m3292b(context).f5598d != 0) && !C1130y5.m3309a(context)) {
                    z6 = false;
                }
                if (z6) {
                    try {
                        Intent intent = new Intent(context, Class.forName("com.baidu.bottom.service.BottomService"));
                        intent.putExtra("SDK_PRODUCT_LY", "MS");
                        context.startService(intent);
                    } catch (Throwable th) {
                        C1016i3.f5129e.m386n(th);
                    }
                }
            }
        };
        b bVar = new b();
        f5477e = bVar;
        f5478m = new EnumC1102u5[]{enumC1102u5, bVar, new EnumC1102u5() { // from class: e2.u5.c
            @Override // p036e2.EnumC1102u5
            /* renamed from: a */
            public final void mo3232a(Context context) {
                Context applicationContext = context.getApplicationContext();
                C0572z m3241d = C1109v5.m3241d(context);
                C1016i3 c1016i3 = C1016i3.f5129e;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("SDK_BPLUS_SERVICE", false);
                } catch (JSONException e7) {
                    c1016i3.m386n(e7);
                }
                try {
                    jSONObject.put("SDK_PRODUCT_LY", "R");
                } catch (JSONException e8) {
                    c1016i3.m386n(e8);
                }
                try {
                    jSONObject.put("SDK_LOCAL_SERVER", false);
                } catch (JSONException e9) {
                    c1016i3.m386n(e9);
                }
                m3241d.m1995b(applicationContext, jSONObject);
            }
        }, new EnumC1102u5() { // from class: e2.u5.d
            @Override // p036e2.EnumC1102u5
            /* renamed from: a */
            public final void mo3232a(Context context) {
                Context applicationContext = context.getApplicationContext();
                C0572z m3241d = C1109v5.m3241d(context);
                C1016i3 c1016i3 = C1016i3.f5129e;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("SDK_BPLUS_SERVICE", false);
                } catch (JSONException e7) {
                    c1016i3.m386n(e7);
                }
                try {
                    jSONObject.put("SDK_PRODUCT_LY", "E");
                } catch (JSONException e8) {
                    c1016i3.m386n(e8);
                }
                try {
                    jSONObject.put("SDK_LOCAL_SERVER", false);
                } catch (JSONException e9) {
                    c1016i3.m386n(e9);
                }
                m3241d.m1995b(applicationContext, jSONObject);
            }
        }};
    }

    public EnumC1102u5(String str, int i7, int i8) {
        this.f5479c = i8;
    }

    public static EnumC1102u5 valueOf(String str) {
        return (EnumC1102u5) Enum.valueOf(EnumC1102u5.class, str);
    }

    public static EnumC1102u5[] values() {
        return (EnumC1102u5[]) f5478m.clone();
    }

    /* renamed from: a */
    public abstract void mo3232a(Context context);

    @Override // java.lang.Enum
    public final String toString() {
        return String.valueOf(this.f5479c);
    }
}
