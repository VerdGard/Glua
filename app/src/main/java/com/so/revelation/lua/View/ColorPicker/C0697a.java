package com.so.revelation.lua.View.ColorPicker;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.so.revelation.lua.R;
import com.so.revelation.lua.View.ColorPicker.C0700d;
import p181x.C2152a;

/* renamed from: com.so.revelation.lua.View.ColorPicker.a */
/* loaded from: classes.dex */
public final class C0697a extends BaseAdapter {

    /* renamed from: c */
    public final a f3445c;

    /* renamed from: e */
    public final int[] f3446e;

    /* renamed from: m */
    public int f3447m;

    /* renamed from: s */
    public final int f3448s;

    /* renamed from: com.so.revelation.lua.View.ColorPicker.a$a */
    public interface a {
    }

    /* renamed from: com.so.revelation.lua.View.ColorPicker.a$b */
    public final class b {

        /* renamed from: a */
        public final View f3449a;

        /* renamed from: b */
        public final ColorPanelView f3450b;

        /* renamed from: c */
        public final ImageView f3451c;

        /* renamed from: d */
        public final int f3452d;

        public b(Context context) {
            View inflate = View.inflate(context, C0697a.this.f3448s == 0 ? R.layout.cpv_color_item_square : R.layout.cpv_color_item_circle, null);
            this.f3449a = inflate;
            ColorPanelView colorPanelView = (ColorPanelView) inflate.findViewById(R.id.cpv_color_panel_view);
            this.f3450b = colorPanelView;
            this.f3451c = (ImageView) inflate.findViewById(R.id.cpv_color_image_view);
            this.f3452d = colorPanelView.getBorderColor();
            inflate.setTag(this);
        }
    }

    public C0697a(C0700d.f fVar, int[] iArr, int i7, int i8) {
        this.f3445c = fVar;
        this.f3446e = iArr;
        this.f3447m = i7;
        this.f3448s = i8;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f3446e.length;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i7) {
        return Integer.valueOf(this.f3446e[i7]);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i7) {
        return i7;
    }

    @Override // android.widget.Adapter
    public final View getView(int i7, View view, ViewGroup viewGroup) {
        View view2;
        b bVar;
        if (view == null) {
            bVar = new b(viewGroup.getContext());
            view2 = bVar.f3449a;
        } else {
            view2 = view;
            bVar = (b) view.getTag();
        }
        C0697a c0697a = C0697a.this;
        int i8 = c0697a.f3446e[i7];
        int alpha = Color.alpha(i8);
        ColorPanelView colorPanelView = bVar.f3450b;
        colorPanelView.setColor(i8);
        int i9 = c0697a.f3447m == i7 ? R.drawable.cpv_preset_checked : 0;
        ImageView imageView = bVar.f3451c;
        imageView.setImageResource(i9);
        if (alpha != 255) {
            if (alpha <= 165) {
                colorPanelView.setBorderColor(i8 | (-16777216));
                imageView.setColorFilter(-16777216, PorterDuff.Mode.SRC_IN);
            } else {
                colorPanelView.setBorderColor(bVar.f3452d);
                imageView.setColorFilter(-1, PorterDuff.Mode.SRC_IN);
            }
        } else if (i7 != c0697a.f3447m || C2152a.m5263b(c0697a.f3446e[i7]) < 0.65d) {
            imageView.setColorFilter((ColorFilter) null);
        } else {
            imageView.setColorFilter(-16777216, PorterDuff.Mode.SRC_IN);
        }
        colorPanelView.setOnClickListener(new ViewOnClickListenerC0698b(bVar, i7));
        colorPanelView.setOnLongClickListener(new ViewOnLongClickListenerC0699c(bVar));
        return view2;
    }
}
