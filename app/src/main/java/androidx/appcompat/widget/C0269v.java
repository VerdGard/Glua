package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import p034e0.C0912c;
import p034e0.C0946x;

/* renamed from: androidx.appcompat.widget.v */
/* loaded from: classes.dex */
public final class C0269v {
    /* renamed from: a */
    public static boolean m892a(DragEvent dragEvent, TextView textView, Activity activity) {
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            C0946x.m2813n(textView, (Build.VERSION.SDK_INT >= 31 ? new C0912c.a(clipData, 3) : new C0912c.c(clipData, 3)).build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    /* renamed from: b */
    public static boolean m893b(DragEvent dragEvent, View view, Activity activity) {
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        C0946x.m2813n(view, (Build.VERSION.SDK_INT >= 31 ? new C0912c.a(clipData, 3) : new C0912c.c(clipData, 3)).build());
        return true;
    }
}
