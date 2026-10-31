package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$styleable;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import p016c.DialogC0567u;

/* loaded from: classes.dex */
public final class AlertController {

    /* renamed from: A */
    public TextView f299A;

    /* renamed from: B */
    public TextView f300B;

    /* renamed from: C */
    public View f301C;

    /* renamed from: D */
    public ListAdapter f302D;

    /* renamed from: F */
    public final int f304F;

    /* renamed from: G */
    public final int f305G;

    /* renamed from: H */
    public final int f306H;

    /* renamed from: I */
    public final int f307I;

    /* renamed from: J */
    public final int f308J;

    /* renamed from: K */
    public final boolean f309K;

    /* renamed from: L */
    public final HandlerC0146c f310L;

    /* renamed from: a */
    public final Context f312a;

    /* renamed from: b */
    public final DialogC0567u f313b;

    /* renamed from: c */
    public final Window f314c;

    /* renamed from: d */
    public final int f315d;

    /* renamed from: e */
    public CharSequence f316e;

    /* renamed from: f */
    public CharSequence f317f;

    /* renamed from: g */
    public RecycleListView f318g;

    /* renamed from: h */
    public View f319h;

    /* renamed from: i */
    public int f320i;

    /* renamed from: k */
    public Button f322k;

    /* renamed from: l */
    public CharSequence f323l;

    /* renamed from: m */
    public Message f324m;

    /* renamed from: n */
    public Drawable f325n;

    /* renamed from: o */
    public Button f326o;

    /* renamed from: p */
    public CharSequence f327p;

    /* renamed from: q */
    public Message f328q;

    /* renamed from: r */
    public Drawable f329r;

    /* renamed from: s */
    public Button f330s;

    /* renamed from: t */
    public CharSequence f331t;

    /* renamed from: u */
    public Message f332u;

    /* renamed from: v */
    public Drawable f333v;

    /* renamed from: w */
    public NestedScrollView f334w;

    /* renamed from: y */
    public Drawable f336y;

    /* renamed from: z */
    public ImageView f337z;

    /* renamed from: j */
    public boolean f321j = false;

    /* renamed from: x */
    public int f335x = 0;

    /* renamed from: E */
    public int f303E = -1;

    /* renamed from: M */
    public final ViewOnClickListenerC0144a f311M = new ViewOnClickListenerC0144a();

    public static class RecycleListView extends ListView {

        /* renamed from: c */
        public final int f338c;

        /* renamed from: e */
        public final int f339e;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f293u);
            this.f339e = obtainStyledAttributes.getDimensionPixelOffset(R$styleable.RecycleListView_paddingBottomNoButtons, -1);
            this.f338c = obtainStyledAttributes.getDimensionPixelOffset(R$styleable.RecycleListView_paddingTopNoTitle, -1);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$a */
    public class ViewOnClickListenerC0144a implements View.OnClickListener {
        public ViewOnClickListenerC0144a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Message message;
            Message message2;
            AlertController alertController = AlertController.this;
            Message obtain = ((view != alertController.f322k || (message2 = alertController.f324m) == null) && (view != alertController.f326o || (message2 = alertController.f328q) == null)) ? (view != alertController.f330s || (message = alertController.f332u) == null) ? null : Message.obtain(message) : Message.obtain(message2);
            if (obtain != null) {
                obtain.sendToTarget();
            }
            alertController.f310L.obtainMessage(1, alertController.f313b).sendToTarget();
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$b */
    public static class C0145b {

        /* renamed from: a */
        public final Context f341a;

        /* renamed from: b */
        public final LayoutInflater f342b;

        /* renamed from: d */
        public Drawable f344d;

        /* renamed from: e */
        public CharSequence f345e;

        /* renamed from: f */
        public View f346f;

        /* renamed from: g */
        public CharSequence f347g;

        /* renamed from: h */
        public CharSequence f348h;

        /* renamed from: i */
        public DialogInterface.OnClickListener f349i;

        /* renamed from: j */
        public CharSequence f350j;

        /* renamed from: k */
        public DialogInterface.OnClickListener f351k;

        /* renamed from: l */
        public CharSequence f352l;

        /* renamed from: m */
        public DialogInterface.OnClickListener f353m;

        /* renamed from: o */
        public DialogInterface.OnKeyListener f355o;

        /* renamed from: p */
        public CharSequence[] f356p;

        /* renamed from: q */
        public ListAdapter f357q;

        /* renamed from: r */
        public DialogInterface.OnClickListener f358r;

        /* renamed from: s */
        public View f359s;

        /* renamed from: t */
        public boolean[] f360t;

        /* renamed from: u */
        public boolean f361u;

        /* renamed from: v */
        public boolean f362v;

        /* renamed from: x */
        public DialogInterface.OnMultiChoiceClickListener f364x;

        /* renamed from: c */
        public int f343c = 0;

        /* renamed from: w */
        public int f363w = -1;

        /* renamed from: n */
        public boolean f354n = true;

        public C0145b(ContextThemeWrapper contextThemeWrapper) {
            this.f341a = contextThemeWrapper;
            this.f342b = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$c */
    public static final class HandlerC0146c extends Handler {

        /* renamed from: a */
        public final WeakReference<DialogInterface> f365a;

        public HandlerC0146c(DialogInterface dialogInterface) {
            this.f365a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i7 = message.what;
            if (i7 == -3 || i7 == -2 || i7 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f365a.get(), message.what);
            } else {
                if (i7 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$d */
    public static class C0147d extends ArrayAdapter<CharSequence> {
        public C0147d(Context context, int i7, CharSequence[] charSequenceArr) {
            super(context, i7, android.R.id.text1, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final long getItemId(int i7) {
            return i7;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, DialogC0567u dialogC0567u, Window window) {
        this.f312a = context;
        this.f313b = dialogC0567u;
        this.f314c = window;
        this.f310L = new HandlerC0146c(dialogC0567u);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, R$styleable.f277e, R$attr.alertDialogStyle, 0);
        this.f304F = obtainStyledAttributes.getResourceId(R$styleable.AlertDialog_android_layout, 0);
        obtainStyledAttributes.getResourceId(R$styleable.AlertDialog_buttonPanelSideLayout, 0);
        this.f305G = obtainStyledAttributes.getResourceId(R$styleable.AlertDialog_listLayout, 0);
        this.f306H = obtainStyledAttributes.getResourceId(R$styleable.AlertDialog_multiChoiceItemLayout, 0);
        this.f307I = obtainStyledAttributes.getResourceId(R$styleable.AlertDialog_singleChoiceItemLayout, 0);
        this.f308J = obtainStyledAttributes.getResourceId(R$styleable.AlertDialog_listItemLayout, 0);
        this.f309K = obtainStyledAttributes.getBoolean(R$styleable.AlertDialog_showTitle, true);
        this.f315d = obtainStyledAttributes.getDimensionPixelSize(R$styleable.AlertDialog_buttonIconDimen, 0);
        obtainStyledAttributes.recycle();
        dialogC0567u.m1982e().mo1927t(1);
    }

    /* renamed from: a */
    public static boolean m478a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m478a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static void m479b(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    /* renamed from: c */
    public static ViewGroup m480c(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: d */
    public final void m481d(int i7, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message obtainMessage = onClickListener != null ? this.f310L.obtainMessage(i7, onClickListener) : null;
        if (i7 == -3) {
            this.f331t = charSequence;
            this.f332u = obtainMessage;
            this.f333v = null;
        } else if (i7 == -2) {
            this.f327p = charSequence;
            this.f328q = obtainMessage;
            this.f329r = null;
        } else {
            if (i7 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f323l = charSequence;
            this.f324m = obtainMessage;
            this.f325n = null;
        }
    }
}
