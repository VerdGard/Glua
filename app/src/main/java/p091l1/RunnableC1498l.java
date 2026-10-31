package p091l1;

import com.so.revelation.lua.EditorActivity;

/* renamed from: l1.l */
/* loaded from: classes.dex */
public final class RunnableC1498l implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ EditorActivity f7109c;

    public RunnableC1498l(EditorActivity editorActivity) {
        this.f7109c = editorActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EditorActivity editorActivity = this.f7109c;
        editorActivity.f3291Q1.m121f().setFocusable(true);
        editorActivity.f3291Q1.m121f().requestFocus();
    }
}
