package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.R$attr;
import androidx.appcompat.app.AlertController;
import androidx.core.widget.NestedScrollView;
import p016c.DialogC0567u;

/* renamed from: androidx.appcompat.app.d */
/* loaded from: classes.dex */
public final class DialogInterfaceC0151d extends DialogC0567u implements DialogInterface {

    /* renamed from: Y */
    public final AlertController f373Y;

    /* renamed from: androidx.appcompat.app.d$a */
    public static class a {

        /* renamed from: a */
        public final AlertController.C0145b f374a;

        /* renamed from: b */
        public final int f375b;

        public a(Context context) {
            int m482j = DialogInterfaceC0151d.m482j(0, context);
            this.f374a = new AlertController.C0145b(new ContextThemeWrapper(context, DialogInterfaceC0151d.m482j(m482j, context)));
            this.f375b = m482j;
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x00e1  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00e3  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final androidx.appcompat.app.DialogInterfaceC0151d m484a() {
            /*
                Method dump skipped, instructions count: 273
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.DialogInterfaceC0151d.a.m484a():androidx.appcompat.app.d");
        }

        /* renamed from: b */
        public final void m485b(String str, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0145b c0145b = this.f374a;
            c0145b.f350j = str;
            c0145b.f351k = onClickListener;
        }

        /* renamed from: c */
        public final void m486c(String str, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0145b c0145b = this.f374a;
            c0145b.f348h = str;
            c0145b.f349i = onClickListener;
        }
    }

    public DialogInterfaceC0151d(int i7, Context context) {
        super(m482j(i7, context), context);
        this.f373Y = new AlertController(getContext(), this, getWindow());
    }

    /* renamed from: j */
    public static int m482j(int i7, Context context) {
        if (((i7 >>> 24) & 255) >= 1) {
            return i7;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R$attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: h */
    public final Button m483h(int i7) {
        AlertController alertController = this.f373Y;
        if (i7 == -3) {
            return alertController.f330s;
        }
        if (i7 == -2) {
            return alertController.f326o;
        }
        if (i7 == -1) {
            return alertController.f322k;
        }
        alertController.getClass();
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x033b, code lost:
    
        if (r3 != null) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02e0, code lost:
    
        r4.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02de, code lost:
    
        if (r4 != null) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02d5, code lost:
    
        if (r4 != null) goto L131;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02e9  */
    @Override // p016c.DialogC0567u, androidx.activity.DialogC0124i, android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r18) {
        /*
            Method dump skipped, instructions count: 933
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.DialogInterfaceC0151d.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f373Y.f334w;
        if (nestedScrollView != null && nestedScrollView.m1014e(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i7, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i7, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f373Y.f334w;
        if (nestedScrollView != null && nestedScrollView.m1014e(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i7, keyEvent);
    }

    @Override // p016c.DialogC0567u, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.f373Y;
        alertController.f316e = charSequence;
        TextView textView = alertController.f299A;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
