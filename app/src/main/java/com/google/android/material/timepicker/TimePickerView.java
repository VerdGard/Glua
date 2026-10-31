package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;

/* loaded from: classes.dex */
class TimePickerView extends ConstraintLayout {

    /* renamed from: J1 */
    public static final /* synthetic */ int f4606J1 = 0;

    /* renamed from: I1 */
    public final Chip f4607I1;

    /* renamed from: com.google.android.material.timepicker.TimePickerView$a */
    public class ViewOnClickListenerC0858a implements View.OnClickListener {
        public ViewOnClickListenerC0858a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i7 = TimePickerView.f4606J1;
            TimePickerView.this.getClass();
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ViewOnClickListenerC0858a viewOnClickListenerC0858a = new ViewOnClickListenerC0858a();
        LayoutInflater.from(context).inflate(R$layout.material_timepicker, this);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R$id.material_clock_period_toggle);
        materialButtonToggleGroup.f3961m.add(new MaterialButtonToggleGroup.InterfaceC0766d() { // from class: com.google.android.material.timepicker.d
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.InterfaceC0766d
            /* renamed from: a */
            public final void mo2331a() {
                int i7 = TimePickerView.f4606J1;
                TimePickerView.this.getClass();
            }
        });
        Chip chip = (Chip) findViewById(R$id.material_minute_tv);
        Chip chip2 = (Chip) findViewById(R$id.material_hour_tv);
        this.f4607I1 = chip2;
        ViewOnTouchListenerC0864f viewOnTouchListenerC0864f = new ViewOnTouchListenerC0864f(new GestureDetector(getContext(), new C0863e(this)));
        chip.setOnTouchListener(viewOnTouchListenerC0864f);
        chip2.setOnTouchListener(viewOnTouchListenerC0864f);
        int i7 = R$id.selection_type;
        chip.setTag(i7, 12);
        chip2.setTag(i7, 10);
        chip.setOnClickListener(viewOnClickListenerC0858a);
        chip2.setOnClickListener(viewOnClickListenerC0858a);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i7) {
        super.onVisibilityChanged(view, i7);
        if (view == this && i7 == 0) {
            this.f4607I1.sendAccessibilityEvent(8);
        }
    }
}
