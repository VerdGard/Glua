package p129q1;

import android.view.MenuItem;
import com.so.revelation.lua.Code;
import com.so.revelation.lua.EditorActivity;
import com.so.revelation.lua.R;
import com.so.revelation.lua.View.widget.SlidingUpPanelLayout;
import java.io.IOException;
import p022c5.C0653q;
import p122p1.C1695c;
import p129q1.ViewOnClickListenerC1728d;

/* renamed from: q1.e */
/* loaded from: classes.dex */
public final class RunnableC1729e implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ ViewOnClickListenerC1728d.e f7928c;

    /* renamed from: q1.e$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RunnableC1729e runnableC1729e = RunnableC1729e.this;
            try {
                ViewOnClickListenerC1728d viewOnClickListenerC1728d = ViewOnClickListenerC1728d.this;
                Code code = viewOnClickListenerC1728d.f7917w2;
                String m4197c = viewOnClickListenerC1728d.f7914t2.m4197c();
                if (code.getText().toString().isEmpty()) {
                    return;
                }
                code.m2188w0(m4197c);
            } catch (IOException e7) {
                ViewOnClickListenerC1728d viewOnClickListenerC1728d2 = ViewOnClickListenerC1728d.this;
                String str = "自动保存失败：" + e7.getMessage();
                viewOnClickListenerC1728d2.f7903i2.setPanelState(SlidingUpPanelLayout.EnumC0710e.f3565c);
                C1695c c1695c = viewOnClickListenerC1728d2.f7916v2;
                c1695c.f7633c.add(0, "️\n");
                c1695c.f2197a.m1591b();
                C1695c c1695c2 = viewOnClickListenerC1728d2.f7916v2;
                c1695c2.f7633c.add(0, str);
                c1695c2.f2197a.m1591b();
            }
        }
    }

    public RunnableC1729e(ViewOnClickListenerC1728d.e eVar) {
        this.f7928c = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MenuItem menuItem;
        MenuItem menuItem2;
        EditorActivity editorActivity = EditorActivity.f3285f2;
        int m120e = editorActivity.f3291Q1.m120e();
        int i7 = R.drawable.redo_h;
        int i8 = R.drawable.undo_h;
        if (m120e != 0) {
            C0653q c0653q = editorActivity.f3291Q1.m121f().f5997F2.f3156x1;
            boolean z6 = c0653q.f3196e && c0653q.f3199w1 > 0;
            C0653q c0653q2 = editorActivity.f3291Q1.m121f().f5997F2.f3156x1;
            boolean z7 = c0653q2.f3196e && c0653q2.f3199w1 < c0653q2.f3195c.size();
            if (z6) {
                menuItem2 = editorActivity.f3299Y1;
                i8 = R.drawable.ic_undo_white_24dp;
            } else {
                menuItem2 = editorActivity.f3299Y1;
            }
            menuItem2.setIcon(editorActivity.getDrawable(i8));
            menuItem = editorActivity.f3304d2;
            if (z7) {
                i7 = R.drawable.ic_redo_white_24dp;
            }
        } else {
            editorActivity.f3299Y1.setIcon(editorActivity.getDrawable(R.drawable.undo_h));
            menuItem = editorActivity.f3304d2;
        }
        menuItem.setIcon(editorActivity.getDrawable(i7));
        ViewOnClickListenerC1728d viewOnClickListenerC1728d = ViewOnClickListenerC1728d.this;
        viewOnClickListenerC1728d.m4202S(viewOnClickListenerC1728d.f7917w2);
        new Thread(new a()).start();
    }
}
