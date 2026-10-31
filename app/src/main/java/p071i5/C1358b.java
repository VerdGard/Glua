package p071i5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import io.github.rosemoe.sora.R$id;
import io.github.rosemoe.sora.R$layout;
import p171v4.AbstractC2020d;

/* renamed from: i5.b */
/* loaded from: classes.dex */
public final class C1358b extends AbstractC1376m {
    @Override // p071i5.AbstractC1376m
    /* renamed from: b */
    public final View mo3717b(int i7, View view, ViewGroup viewGroup, boolean z6) {
        if (view == null) {
            view = LayoutInflater.from(this.f6695c.f6672B1.getContext()).inflate(R$layout.default_completion_result_item, viewGroup, false);
        }
        AbstractC2020d abstractC2020d = this.f6696e.get(i7);
        TextView textView = (TextView) view.findViewById(R$id.result_item_label);
        textView.setText(abstractC2020d.f9175b);
        textView.setTextColor(this.f6695c.f6465e.getColorScheme().m3927c(42));
        TextView textView2 = (TextView) view.findViewById(R$id.apiInfo);
        textView2.setText(abstractC2020d.f9176c);
        textView2.setTextColor(this.f6695c.f6465e.getColorScheme().m3927c(43));
        view.setTag(Integer.valueOf(i7));
        if (z6) {
            view.setBackgroundColor(this.f6695c.f6465e.getColorScheme().m3927c(44));
        } else {
            view.setBackgroundColor(0);
        }
        ((ImageView) view.findViewById(R$id.result_item_image)).setImageDrawable(abstractC2020d.f9174a);
        return view;
    }
}
