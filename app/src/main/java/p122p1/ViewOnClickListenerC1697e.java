package p122p1;

import android.ext.C0090b;
import android.view.View;
import com.so.revelation.lua.Baidu.TransApi;
import com.so.revelation.lua.Baidu.TranslateResult;
import com.so.revelation.lua.View.widget.Chouti;
import p054g4.C1226h;
import p122p1.C1699g;

/* renamed from: p1.e */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1697e implements View.OnClickListener {

    /* renamed from: c */
    public final /* synthetic */ C1699g.a f7637c;

    /* renamed from: e */
    public final /* synthetic */ int f7638e;

    /* renamed from: m */
    public final /* synthetic */ C1699g f7639m;

    /* renamed from: p1.e$a */
    public class a implements Runnable {

        /* renamed from: p1.e$a$a, reason: collision with other inner class name */
        public class RunnableC2301a implements Runnable {

            /* renamed from: c */
            public final /* synthetic */ StringBuilder f7642c;

            /* renamed from: e */
            public final /* synthetic */ String f7643e;

            /* renamed from: m */
            public final /* synthetic */ TranslateResult f7644m;

            /* renamed from: s */
            public final /* synthetic */ TranslateResult f7645s;

            public RunnableC2301a(StringBuilder sb, String str, TranslateResult translateResult, TranslateResult translateResult2) {
                this.f7642c = sb;
                this.f7643e = str;
                this.f7644m = translateResult;
                this.f7645s = translateResult2;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x00f0  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x00e4  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 282
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: p122p1.ViewOnClickListenerC1697e.a.RunnableC2301a.run():void");
            }
        }

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            TransApi transApi;
            String str;
            String[] strArr;
            int i7;
            TransApi transApi2 = new TransApi();
            StringBuilder sb = new StringBuilder();
            ViewOnClickListenerC1697e viewOnClickListenerC1697e = ViewOnClickListenerC1697e.this;
            String str2 = "en";
            String transResult = transApi2.getTransResult(C0090b.m220f(sb, viewOnClickListenerC1697e.f7639m.f7651f.get(viewOnClickListenerC1697e.f7638e), "\nEnd of translation"), "en", "zh");
            String transResult2 = transApi2.getTransResult(C0090b.m220f(new StringBuilder(), viewOnClickListenerC1697e.f7639m.f7653h.get(viewOnClickListenerC1697e.f7638e), "\nNo return value"), "en", "zh");
            TranslateResult translateResult = (TranslateResult) new C1226h().m3443a(transResult, TranslateResult.class);
            TranslateResult translateResult2 = (TranslateResult) new C1226h().m3443a(transResult2, TranslateResult.class);
            StringBuilder sb2 = new StringBuilder();
            if (viewOnClickListenerC1697e.f7639m.f7654i.get(viewOnClickListenerC1697e.f7638e) != null && !viewOnClickListenerC1697e.f7639m.f7654i.get(viewOnClickListenerC1697e.f7638e).toString().isEmpty()) {
                String[] split = viewOnClickListenerC1697e.f7639m.f7654i.get(viewOnClickListenerC1697e.f7638e).toString().split("\n");
                int length = split.length;
                int i8 = 0;
                while (i8 < length) {
                    String str3 = split[i8];
                    if (str3.contains("--")) {
                        String[] split2 = str3.split("--");
                        strArr = split;
                        i7 = length;
                        if (split2.length > 1) {
                            String trim = split2[1].trim();
                            transApi = transApi2;
                            TranslateResult translateResult3 = (TranslateResult) new C1226h().m3443a(transApi2.getTransResult(trim + "\nEnd of translation", str2, "zh"), TranslateResult.class);
                            if (translateResult3 == null || translateResult3.getTrans_result() == null) {
                                str = str2;
                            } else {
                                str = str2;
                                if (translateResult3.getTrans_result().get(0) != null) {
                                    sb2.append(split2[0].trim());
                                    sb2.append(" --");
                                    sb2.append(translateResult3.getTrans_result().get(0).getDst());
                                    sb2.append("\n");
                                    System.out.println(trim);
                                    i8++;
                                    split = strArr;
                                    length = i7;
                                    transApi2 = transApi;
                                    str2 = str;
                                }
                            }
                            sb2.append(str3);
                            sb2.append("\n");
                            System.out.println(trim);
                            i8++;
                            split = strArr;
                            length = i7;
                            transApi2 = transApi;
                            str2 = str;
                        } else {
                            transApi = transApi2;
                            str = str2;
                        }
                    } else {
                        transApi = transApi2;
                        str = str2;
                        strArr = split;
                        i7 = length;
                    }
                    sb2.append(str3);
                    sb2.append("\n");
                    i8++;
                    split = strArr;
                    length = i7;
                    transApi2 = transApi;
                    str2 = str;
                }
            }
            viewOnClickListenerC1697e.f7639m.f7655j.runOnUiThread(new RunnableC2301a(sb2, transResult, translateResult, translateResult2));
        }
    }

    public ViewOnClickListenerC1697e(C1699g c1699g, C1699g.a aVar, int i7) {
        this.f7639m = c1699g;
        this.f7637c = aVar;
        this.f7638e = i7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1699g.a aVar = this.f7637c;
        boolean m2213b = aVar.f7658C.m2213b();
        Chouti chouti = aVar.f7658C;
        if (m2213b) {
            chouti.m2214c(false);
            return;
        }
        chouti.m2214c(true);
        aVar.f7663x.setText("正在翻译...");
        aVar.f7664y.setText("");
        aVar.f7665z.setText("");
        new Thread(new a()).start();
    }
}
