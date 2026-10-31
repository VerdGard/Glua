package p047f5;

import android.content.ClipData;

/* renamed from: f5.c */
/* loaded from: classes.dex */
public final class C1172c {
    /* renamed from: a */
    public static String m3366a(ClipData clipData) {
        if (clipData == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i7 = 0; i7 < clipData.getItemCount(); i7++) {
            if (i7 > 0) {
                sb.append('\n');
            }
            ClipData.Item itemAt = clipData.getItemAt(i7);
            CharSequence text = itemAt.getText();
            if (text == null) {
                text = itemAt.toString();
            }
            sb.append(text);
        }
        return sb.toString();
    }
}
