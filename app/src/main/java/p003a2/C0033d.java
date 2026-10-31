package p003a2;

import android.content.SharedPreferences;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.C0391d0;
import com.so.revelation.lua.Code;
import com.so.revelation.lua.EditorActivity;
import com.so.revelation.lua.R;
import com.so.revelation.lua.View.widget.C0718a;
import com.so.revelation.lua.View.widget.SmartTabLayout;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import p022c5.C0638b;
import p022c5.C0641e;
import p022c5.C0645i;
import p022c5.EnumC0649m;
import p122p1.C1694b;
import p129q1.C1725a;
import p129q1.C1726b;
import p129q1.C1732h;
import p137r1.AbstractC1821a;
import p198z0.AbstractC2273a;
import p198z0.C2274b;

/* renamed from: a2.d */
/* loaded from: classes.dex */
public final class C0033d implements C2274b.h, SmartTabLayout.InterfaceC0717g {

    /* renamed from: a */
    public final EditorActivity f101a;

    /* renamed from: b */
    public C1694b f102b;

    /* renamed from: c */
    public final SmartTabLayout f103c;

    /* renamed from: d */
    public final TextView f104d;

    /* renamed from: e */
    public final C2274b f105e;

    /* renamed from: f */
    public SharedPreferences f106f;

    /* renamed from: a2.d$a */
    public class a extends DataSetObserver {
        public a() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            C0033d c0033d = C0033d.this;
            c0033d.m124i();
            c0033d.m125j();
            c0033d.f105e.setOffscreenPageLimit(c0033d.f102b.mo4299c());
            c0033d.f106f.edit().putInt("TabIndex", c0033d.f105e.getCurrentItem()).apply();
        }
    }

    public C0033d(EditorActivity editorActivity, C2274b c2274b) {
        this.f101a = editorActivity;
        this.f105e = c2274b;
        this.f104d = (TextView) editorActivity.findViewById(R.id.txt_document_info);
        SmartTabLayout smartTabLayout = (SmartTabLayout) editorActivity.findViewById(R.id.tab_layout);
        this.f103c = smartTabLayout;
        if (smartTabLayout != null) {
            smartTabLayout.setCustomTabView(this);
        }
    }

    @Override // p198z0.C2274b.h
    /* renamed from: a */
    public final void mo116a(int i7) {
    }

    @Override // p198z0.C2274b.h
    /* renamed from: b */
    public final void mo117b(int i7) {
        m125j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.so.revelation.lua.View.widget.SmartTabLayout.InterfaceC0717g
    /* renamed from: c */
    public final View mo118c(C0718a c0718a, int i7, AbstractC2273a abstractC2273a) {
        if (!(abstractC2273a instanceof C1694b)) {
            return null;
        }
        View inflate = LayoutInflater.from(this.f101a).inflate(R.layout.list_item_tab, (ViewGroup) c0718a, false);
        TextView textView = (TextView) inflate.findViewById(R.id.txt_name);
        C1732h c1732h = (C1732h) ((AbstractC1821a.a) ((C1694b) abstractC2273a).f8251e.get(i7)).f8254b;
        File file = new File(c1732h.f7934X.getPath());
        textView.setText(file.getName());
        textView.setOnClickListener(new ViewOnClickListenerC0030a(this, i7));
        textView.setOnLongClickListener(new ViewOnLongClickListenerC0031b(file, c1732h));
        inflate.findViewById(R.id.btn_close).setOnClickListener(new ViewOnClickListenerC0032c(this, i7));
        return inflate;
    }

    @Override // p198z0.C2274b.h
    /* renamed from: d */
    public final void mo119d(float f7, int i7, int i8) {
    }

    /* renamed from: e */
    public final int m120e() {
        return this.f102b.mo4299c();
    }

    /* renamed from: f */
    public final Code m121f() {
        return this.f102b.m4123i().f7890X;
    }

    /* renamed from: g */
    public final void m122g() {
        StringBuffer stringBuffer = new StringBuffer();
        C1694b c1694b = this.f102b;
        c1694b.getClass();
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < c1694b.mo4299c(); i7++) {
            arrayList.add(c1694b.m4124j(i7));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1726b c1726b = (C1726b) it.next();
            try {
                c1726b.f7890X.m2188w0(c1726b.m4197c());
                stringBuffer.append(c1726b.f7891Y.f7899s + "保存成功\n");
            } catch (IOException e7) {
                stringBuffer.append(c1726b.f7891Y.f7899s + "保存失败err:" + e7.getMessage() + "\n");
            }
        }
        C0391d0.m1370q(stringBuffer.toString(), true);
    }

    /* renamed from: h */
    public final void m123h(int i7) {
        int max = Math.max(0, i7);
        C2274b c2274b = this.f105e;
        c2274b.setCurrentItem(Math.min(max, c2274b.getAdapter().mo4299c()));
        m125j();
    }

    /* renamed from: i */
    public final void m124i() {
        C2274b c2274b = this.f105e;
        ArrayList arrayList = c2274b.f10414j2;
        if (arrayList != null) {
            arrayList.clear();
        }
        SmartTabLayout smartTabLayout = this.f103c;
        if (smartTabLayout != null) {
            smartTabLayout.setViewPager(c2274b);
        }
        if (c2274b.f10414j2 == null) {
            c2274b.f10414j2 = new ArrayList();
        }
        c2274b.f10414j2.add(this);
    }

    /* renamed from: j */
    public final void m125j() {
        String str;
        StringBuilder sb;
        char m2131c;
        StringBuilder sb2;
        C0638b c0638b;
        int i7;
        String sb3;
        TextView textView = this.f104d;
        if (textView == null) {
            return;
        }
        C1726b m4124j = this.f102b.m4124j(this.f105e.getCurrentItem());
        String str2 = "";
        if (m4124j != null) {
            try {
                C1725a c1725a = m4124j.f7895s;
                String str3 = c1725a == null ? "UTF-8" : c1725a.f7888e;
                String str4 = m4124j.f7891Y.f7899s;
                String str5 = m4124j.f7890X.getText().f3155w1.f4674m ? "*" : "";
                Code code = m4124j.f7890X;
                if (code != null) {
                    C0645i cursor = code.getCursor();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(m4124j.f7890X.getText().m2147s() + ":" + (cursor.f3166c.f3141b + 1) + ";" + cursor.f3166c.f3142c + ":" + (cursor.f3166c.f3140a + 1) + " ");
                    if (cursor.m2163a()) {
                        sb = new StringBuilder("(");
                        sb.append(cursor.f3167d.f3140a - cursor.f3166c.f3140a);
                        sb.append(" chars)");
                    } else {
                        C0641e text = m4124j.f7890X.getText();
                        int m2142n = text.m2142n(cursor.f3166c.f3141b);
                        C0638b c0638b2 = cursor.f3166c;
                        int i8 = c0638b2.f3142c;
                        if (m2142n == i8) {
                            EnumC0649m m2160d = text.m2146r(c0638b2.f3141b).m2160d();
                            String name = m2160d == EnumC0649m.NONE ? "EOF" : m2160d.name();
                            sb2 = new StringBuilder("(<");
                            sb2.append(name);
                            sb2.append(">)");
                        } else {
                            char m2131c2 = text.m2131c(c0638b2.f3141b, i8);
                            if (!Character.isLowSurrogate(m2131c2) || (i7 = (c0638b = cursor.f3166c).f3142c) <= 0) {
                                if (Character.isHighSurrogate(m2131c2)) {
                                    C0638b c0638b3 = cursor.f3166c;
                                    if (c0638b3.f3142c + 1 < text.m2142n(c0638b3.f3141b)) {
                                        C0638b c0638b4 = cursor.f3166c;
                                        m2131c = text.m2131c(c0638b4.f3141b, c0638b4.f3142c + 1);
                                        sb2 = new StringBuilder("(");
                                    }
                                }
                                sb = new StringBuilder("(");
                                sb.append(m2131c2);
                                sb.append(")");
                            } else {
                                m2131c = text.m2131c(c0638b.f3141b, i7 - 1);
                                sb2 = new StringBuilder("(");
                            }
                            sb2.append(m2131c);
                            sb2.append(")");
                        }
                        sb3 = sb2.toString();
                        sb4.append(sb3);
                        str = sb4.toString();
                    }
                    sb3 = sb.toString();
                    sb4.append(sb3);
                    str = sb4.toString();
                } else {
                    str = "";
                }
                str2 = String.format(Locale.US, "%s%s  \t|\t  %s \t %s \t %s", str5, str4, str3, "", str);
            } catch (Exception unused) {
            }
        }
        textView.setText(str2);
    }
}
