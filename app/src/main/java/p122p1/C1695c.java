package p122p1;

import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.so.revelation.lua.R;
import java.util.List;
import p168v1.AbstractApplicationC2012b;

/* renamed from: p1.c */
/* loaded from: classes.dex */
public final class C1695c extends RecyclerView.AbstractC0436e<a> {

    /* renamed from: c */
    public final List<String> f7633c;

    /* renamed from: d */
    public final SharedPreferences f7634d = AbstractApplicationC2012b.f9161c.getSharedPreferences("data", 0);

    /* renamed from: p1.c$a */
    public static class a extends RecyclerView.AbstractC0432a0 {

        /* renamed from: t */
        public final TextView f7635t;

        /* renamed from: u */
        public final View f7636u;

        public a(View view) {
            super(view);
            this.f7635t = (TextView) view.findViewById(R.id.log_text_viewTextView);
            this.f7636u = view.findViewById(R.id.log_text_viewView);
        }
    }

    public C1695c(List<String> list) {
        this.f7633c = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0436e
    /* renamed from: a */
    public final int mo1583a() {
        return this.f7633c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0436e
    /* renamed from: d */
    public final void mo1586d(a aVar, int i7) {
        a aVar2 = aVar;
        aVar2.f7636u.setBackgroundColor(-16711720);
        int i8 = this.f7634d.getInt("iv2", 0);
        TextView textView = aVar2.f7635t;
        textView.setTextColor(i8);
        textView.setText(this.f7633c.get(i7));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0436e
    /* renamed from: f */
    public final RecyclerView.AbstractC0432a0 mo1588f(RecyclerView recyclerView, int i7) {
        return new a(LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.log_text_view, (ViewGroup) recyclerView, false));
    }
}
