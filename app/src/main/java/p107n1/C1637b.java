package p107n1;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import com.so.revelation.lua.R;
import com.so.revelation.lua.View.ColorPicker.C0697a;
import com.so.revelation.lua.View.ColorPicker.C0700d;
import com.so.revelation.lua.View.ColorPicker.ColorPanelView;
import java.util.Locale;
import p181x.C2152a;

/* renamed from: n1.b */
/* loaded from: classes.dex */
public final class C1637b implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C0700d f7472a;

    public C1637b(C0700d c0700d) {
        this.f7472a = c0700d;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i7, boolean z6) {
        C0697a c0697a;
        C0700d c0700d = this.f7472a;
        c0700d.f3465G2.setText(String.format(Locale.ENGLISH, "%d%%", Integer.valueOf((int) ((i7 * 100.0d) / 255.0d))));
        int i8 = 255 - i7;
        int i9 = 0;
        while (true) {
            c0697a = c0700d.f3462D2;
            int[] iArr = c0697a.f3446e;
            if (i9 >= iArr.length) {
                break;
            }
            int i10 = iArr[i9];
            c0700d.f3462D2.f3446e[i9] = Color.argb(i8, Color.red(i10), Color.green(i10), Color.blue(i10));
            i9++;
        }
        c0697a.notifyDataSetChanged();
        for (int i11 = 0; i11 < c0700d.f3463E2.getChildCount(); i11++) {
            FrameLayout frameLayout = (FrameLayout) c0700d.f3463E2.getChildAt(i11);
            ColorPanelView colorPanelView = (ColorPanelView) frameLayout.findViewById(R.id.cpv_color_panel_view);
            ImageView imageView = (ImageView) frameLayout.findViewById(R.id.cpv_color_image_view);
            if (frameLayout.getTag() == null) {
                frameLayout.setTag(Integer.valueOf(colorPanelView.getBorderColor()));
            }
            int color = colorPanelView.getColor();
            int argb = Color.argb(i8, Color.red(color), Color.green(color), Color.blue(color));
            colorPanelView.setBorderColor(i8 <= 165 ? argb | (-16777216) : ((Integer) frameLayout.getTag()).intValue());
            if (colorPanelView.getTag() != null && ((Boolean) colorPanelView.getTag()).booleanValue()) {
                if (i8 > 165 && C2152a.m5263b(argb) < 0.65d) {
                    imageView.setColorFilter(-1, PorterDuff.Mode.SRC_IN);
                } else {
                    imageView.setColorFilter(-16777216, PorterDuff.Mode.SRC_IN);
                }
            }
            colorPanelView.setColor(argb);
        }
        c0700d.f3476z2 = Color.argb(i8, Color.red(c0700d.f3476z2), Color.green(c0700d.f3476z2), Color.blue(c0700d.f3476z2));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }
}
