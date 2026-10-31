package p122p1;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.SharedPreferences;
import android.ext.C0090b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.so.revelation.lua.Code;
import com.so.revelation.lua.DemoActivity;
import com.so.revelation.lua.R;
import com.so.revelation.lua.View.widget.Chouti;
import java.util.List;
import p168v1.AbstractApplicationC2012b;
import p199z1.C2276a;

/* renamed from: p1.g */
/* loaded from: classes.dex */
public final class C1699g extends RecyclerView.AbstractC0436e<a> {

    /* renamed from: c */
    public final List<String> f7648c;

    /* renamed from: d */
    public final List<String> f7649d;

    /* renamed from: e */
    public final List<String> f7650e;

    /* renamed from: f */
    public final List<String> f7651f;

    /* renamed from: g */
    public final List<StringBuilder> f7652g;

    /* renamed from: h */
    public final List<String> f7653h;

    /* renamed from: i */
    public final List<StringBuilder> f7654i;

    /* renamed from: j */
    public final Activity f7655j;

    /* renamed from: p1.g$a */
    public static class a extends RecyclerView.AbstractC0432a0 {

        /* renamed from: A */
        public final CardView f7656A;

        /* renamed from: B */
        public final Code f7657B;

        /* renamed from: C */
        public final Chouti f7658C;

        /* renamed from: t */
        public final View f7659t;

        /* renamed from: u */
        public final TextView f7660u;

        /* renamed from: v */
        public final TextView f7661v;

        /* renamed from: w */
        public final TextView f7662w;

        /* renamed from: x */
        public final TextView f7663x;

        /* renamed from: y */
        public final TextView f7664y;

        /* renamed from: z */
        public final TextView f7665z;

        public a(View view) {
            super(view);
            this.f7659t = view;
            this.f7660u = (TextView) view.findViewById(R.id.item_helpcontent);
            this.f7661v = (TextView) view.findViewById(R.id.itemhelpTextView1);
            this.f7662w = (TextView) view.findViewById(R.id.item_helptitle);
            this.f7656A = (CardView) view.findViewById(R.id.cv_cardview);
            this.f7663x = (TextView) view.findViewById(R.id.includehelpTextView1);
            this.f7664y = (TextView) view.findViewById(R.id.includehelpTextView2);
            this.f7665z = (TextView) view.findViewById(R.id.includehelpTextView3);
            this.f7657B = (Code) view.findViewById(R.id.includehelpTextEditor1);
            this.f7658C = (Chouti) view.findViewById(R.id.itemhelpChouti1);
        }
    }

    public C1699g(DemoActivity demoActivity, List list, List list2, List list3, List list4, List list5, List list6, List list7) {
        this.f7648c = list;
        this.f7650e = list2;
        this.f7655j = demoActivity;
        this.f7649d = list3;
        this.f7651f = list4;
        this.f7652g = list5;
        this.f7653h = list6;
        this.f7654i = list7;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0436e
    /* renamed from: a */
    public final int mo1583a() {
        return this.f7648c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0436e
    /* renamed from: d */
    public final void mo1586d(a aVar, @SuppressLint({"RecyclerView"}) int i7) {
        a aVar2 = aVar;
        String str = this.f7648c.get(i7);
        String m220f = C0090b.m220f(new StringBuilder(), this.f7649d.get(i7), "");
        String str2 = this.f7650e.get(i7);
        aVar2.f7661v.setText((i7 + 1) + "");
        aVar2.f7660u.setText(str2 + " ");
        aVar2.f7662w.setText(str + " ");
        SharedPreferences sharedPreferences = AbstractApplicationC2012b.f9161c.getSharedPreferences("data", 0);
        C2276a c2276a = new C2276a();
        Code code = aVar2.f7657B;
        code.setColorScheme(c2276a);
        code.setBackgroundColor(sharedPreferences.getInt("iv1", 0));
        code.setTextSize(12.0f);
        code.setEditable(false);
        aVar2.f7658C.m2214c(false);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) code.getLayoutParams();
        List<StringBuilder> list = this.f7654i;
        int length = list.get(i7).length();
        layoutParams.height = (length >= 100 && length >= 200) ? (length * 2) - 80 : list.get(i7).length() * 3;
        code.setLayoutParams(layoutParams);
        ViewOnClickListenerC1697e viewOnClickListenerC1697e = new ViewOnClickListenerC1697e(this, aVar2, i7);
        CardView cardView = aVar2.f7656A;
        cardView.setOnClickListener(viewOnClickListenerC1697e);
        cardView.setOnLongClickListener(new ViewOnLongClickListenerC1698f(this, m220f));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0436e
    /* renamed from: f */
    public final RecyclerView.AbstractC0432a0 mo1588f(RecyclerView recyclerView, int i7) {
        a aVar = new a(LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.item_help, (ViewGroup) recyclerView, false));
        aVar.f7659t.setOnClickListener(new ViewOnClickListenerC1696d());
        return aVar;
    }
}
