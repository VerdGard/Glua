package p021c4;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;

/* renamed from: c4.s */
/* loaded from: classes.dex */
public final class C0631s extends View.AccessibilityDelegate {

    /* renamed from: a */
    public final /* synthetic */ C0630r f3108a;

    public C0631s(C0630r c0630r) {
        this.f3108a = c0630r;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        EditText editText = this.f3108a.f3084h.getEditText();
        if (editText != null) {
            accessibilityNodeInfo.setLabeledBy(editText);
        }
    }
}
