package p036e2;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p036e2.AbstractC1093t3;
import p036e2.AbstractC1093t3.a.C2297a;

/* renamed from: e2.q3 */
/* loaded from: classes.dex */
public final class C1072q3 {

    /* renamed from: a */
    public boolean f5348a;

    /* renamed from: b */
    public final ArrayList f5349b = new ArrayList();

    /* renamed from: c */
    public final String f5350c;

    /* renamed from: d */
    public final AbstractC1093t3 f5351d;

    /* renamed from: e */
    public final boolean f5352e;

    /* renamed from: e2.q3$a */
    public class a {

        /* renamed from: a */
        public final String f5353a;

        /* renamed from: b */
        public final boolean f5354b;

        public a(String str, boolean z6) {
            this.f5353a = str;
            this.f5354b = z6;
        }
    }

    /* renamed from: e2.q3$b */
    public static class b {

        /* renamed from: a */
        public final String f5355a;

        /* renamed from: b */
        public final String f5356b;

        /* renamed from: c */
        public final String f5357c;

        /* renamed from: d */
        public final b f5358d;

        public b(View view, b bVar, View view2) {
            this.f5358d = bVar;
            this.f5355a = C1086s3.m3185B(view);
            this.f5356b = C1086s3.m3201l(view);
            String m3205p = C1086s3.m3205p(view);
            if (TextUtils.isEmpty(m3205p)) {
                m3205p = C1086s3.m3195f(view, bVar == null ? "" : bVar.f5356b);
                if (TextUtils.isEmpty(m3205p)) {
                    m3205p = C1086s3.m3194e(view, view2);
                }
            }
            this.f5357c = m3205p;
        }

        /* renamed from: a */
        public final String m3168a(boolean z6) {
            StringBuilder sb = new StringBuilder("/");
            sb.append(this.f5355a);
            if (!z6) {
                sb.append("[");
                sb.append(this.f5357c);
                sb.append("]");
            }
            return sb.toString();
        }
    }

    public C1072q3(Activity activity, AbstractC1093t3 abstractC1093t3, boolean z6) {
        this.f5350c = activity.getClass().getName();
        this.f5351d = abstractC1093t3;
        this.f5352e = z6;
    }

    /* renamed from: a */
    public final void m3167a(Activity activity, View view, b bVar, View view2) {
        boolean z6;
        View.AccessibilityDelegate accessibilityDelegate;
        boolean z7;
        if (view == null) {
            return;
        }
        Object tag = view.getTag(-5000);
        boolean z8 = true;
        if ((tag != null && (tag instanceof String) && ((String) tag).equals("baidu_mtj_edit_txtview")) || C1086s3.m3209t(activity, view)) {
            return;
        }
        b bVar2 = new b(view, bVar, view2);
        if (bVar != null) {
            StringBuilder sb = new StringBuilder();
            for (b bVar3 = bVar2; bVar3 != null; bVar3 = bVar3.f5358d) {
                sb.insert(0, bVar3.m3168a(false));
            }
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            b bVar4 = bVar2;
            boolean z9 = false;
            while (true) {
                if (bVar4 == null) {
                    break;
                }
                if (!z9) {
                    b bVar5 = bVar4.f5358d;
                    String str = bVar5 != null ? bVar5.f5356b : "";
                    if ("ListView".equals(str) || "RecyclerView".equals(str) || "GridView".equals(str)) {
                        z9 = true;
                        z7 = true;
                        sb3.insert(0, bVar4.m3168a(z7));
                        bVar4 = bVar4.f5358d;
                    }
                }
                z7 = false;
                sb3.insert(0, bVar4.m3168a(z7));
                bVar4 = bVar4.f5358d;
            }
            String sb4 = sb3.toString();
            if (this.f5348a) {
                b bVar6 = bVar2.f5358d;
                z6 = C1086s3.m3204o(view, bVar6 != null ? bVar6.f5356b : "");
            } else {
                Iterator it = this.f5349b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z8 = false;
                        break;
                    }
                    a aVar = (a) it.next();
                    String str2 = aVar.f5354b ? sb4 : sb2;
                    if (!TextUtils.isEmpty(str2) && str2.equals(aVar.f5353a)) {
                        break;
                    }
                }
                z6 = z8;
            }
            if (z6 || this.f5352e) {
                AbstractC1093t3.a aVar2 = (AbstractC1093t3.a) this.f5351d;
                aVar2.getClass();
                C1086s3.m3193d(view);
                WeakReference<Activity> weakReference = aVar2.f5451b;
                try {
                    accessibilityDelegate = (View.AccessibilityDelegate) view.getClass().getMethod("getAccessibilityDelegate", new Class[0]).invoke(view, new Object[0]);
                } catch (Exception unused) {
                    accessibilityDelegate = null;
                }
                View.AccessibilityDelegate accessibilityDelegate2 = accessibilityDelegate;
                if (accessibilityDelegate2 instanceof AbstractC1093t3.a.C2297a) {
                    ((AbstractC1093t3.a.C2297a) accessibilityDelegate2).f5456c = z6;
                } else {
                    AbstractC1093t3.a.C2297a c2297a = aVar2.new C2297a(weakReference, view, accessibilityDelegate2, z6);
                    view.setAccessibilityDelegate(c2297a);
                    aVar2.f5453d.put(view, c2297a);
                }
            }
        }
        if (!(view instanceof WebView) && (view instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                m3167a(activity, viewGroup.getChildAt(i7), bVar2, view2);
            }
        }
    }
}
