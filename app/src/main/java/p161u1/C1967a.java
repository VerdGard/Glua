package p161u1;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.so.revelation.lua.R;
import p145s1.AbstractC1877d;
import p145s1.C1875b;
import p153t1.C1921a;

/* renamed from: u1.a */
/* loaded from: classes.dex */
public final class C1967a extends AbstractC1877d<a> {

    /* renamed from: u1.a$a */
    public static class a extends AbstractC1877d.a {

        /* renamed from: t */
        public final ImageView f8822t;

        /* renamed from: u */
        public final TextView f8823u;

        public a(View view) {
            super(view);
            this.f8822t = (ImageView) view.findViewById(R.id.iv_arrow);
            this.f8823u = (TextView) view.findViewById(R.id.tv_name);
        }
    }

    @Override // p145s1.InterfaceC1874a
    /* renamed from: a */
    public final int mo4409a() {
        return R.layout.item_dir;
    }

    @Override // p145s1.AbstractC1877d
    /* renamed from: b */
    public final void mo4414b(RecyclerView.AbstractC0432a0 abstractC0432a0, C1875b c1875b) {
        a aVar = (a) abstractC0432a0;
        ImageView imageView = aVar.f8822t;
        imageView.setRotation(0.0f);
        imageView.setImageResource(R.drawable.xiangyou);
        imageView.setRotation(c1875b.f8414m ? 90 : 0);
        aVar.f8823u.setText(((C1921a) c1875b.f8412c).f8686a);
        if (c1875b.m4410a()) {
            imageView.setVisibility(4);
        } else {
            imageView.setVisibility(0);
        }
    }

    @Override // p145s1.AbstractC1877d
    /* renamed from: c */
    public final a mo4415c(View view) {
        return new a(view);
    }
}
