package p175w1;

import android.annotation.TargetApi;
import android.content.Context;
import android.ext.Config;
import android.ext.Tools;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import p057h.C1267a;
import p099m1.MenuC1543a;

@TargetApi(11)
/* renamed from: w1.a */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC2076a extends ActionMode implements View.OnClickListener {

    /* renamed from: c */
    public final ActionMode.Callback f9465c;

    /* renamed from: e */
    public final MenuC1543a f9466e;

    /* renamed from: m */
    public final LinearLayout f9467m;

    /* renamed from: w1 */
    public final Context f9469w1;

    /* renamed from: s */
    public CharSequence f9468s = null;

    /* renamed from: X */
    public CharSequence f9462X = null;

    /* renamed from: Y */
    public View f9463Y = null;

    /* renamed from: Z */
    public boolean f9464Z = false;

    public ViewOnClickListenerC2076a(ActionMode.Callback callback) {
        Context context = Tools.getContext();
        this.f9469w1 = context;
        this.f9467m = null;
        this.f9466e = null;
        this.f9466e = new MenuC1543a(context);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f9467m = linearLayout;
        linearLayout.setAlpha(1.0f);
        Drawable background = linearLayout.getBackground();
        linearLayout.setBackgroundColor((background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0) | (-16777216));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.type = C2097k0.m5152a();
        layoutParams.width = -1;
        layoutParams.height = -2;
        layoutParams.format = -2;
        int i7 = Config.floatFlags;
        layoutParams.flags = i7 < 0 ? 8 : i7;
        layoutParams.gravity = 55;
        layoutParams.y = 0;
        layoutParams.alpha = 1.0f;
        this.f9465c = callback;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        if (this.f9464Z) {
            return;
        }
        this.f9464Z = true;
        this.f9465c.onDestroyActionMode(this);
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f9463Y;
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return this.f9466e;
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return new MenuInflater(this.f9469w1);
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f9462X;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f9468s;
    }

    @Override // android.view.ActionMode
    @TargetApi(16)
    public final void invalidate() {
        Context context = this.f9469w1;
        MenuC1543a menuC1543a = this.f9466e;
        LinearLayout linearLayout = this.f9467m;
        try {
            this.f9465c.onPrepareActionMode(this, menuC1543a);
        } finally {
            linearLayout.removeAllViews();
            int size = menuC1543a.size();
            for (int i7 = 0; i7 < size; i7++) {
                MenuItem item = menuC1543a.getItem(i7);
                Button button = new Button(context);
                button.setAlpha(1.0f);
                button.setFocusable(false);
                Drawable icon = item.getIcon();
                Tools.addIconToTextView(button, icon, 32);
                if (icon == null) {
                    button.setText(item.getTitle());
                }
                button.setTag(item);
                button.setOnClickListener(this);
                linearLayout.addView(button);
            }
            View view = this.f9463Y;
            if (view != null) {
                linearLayout.addView(view);
            }
            linearLayout.invalidate();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1267a c1267a = (C1267a) ((MenuItem) view.getTag());
        if (c1267a instanceof C1267a) {
            c1267a.m3578d();
        }
        this.f9465c.onActionItemClicked(this, c1267a);
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f9463Y = view;
        invalidate();
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i7) {
        this.f9462X = "副标题";
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f9462X = charSequence;
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i7) {
        this.f9468s = "标题";
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f9468s = charSequence;
    }
}
