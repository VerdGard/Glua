package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* renamed from: androidx.appcompat.widget.c0 */
/* loaded from: classes.dex */
public final class C0217c0 {

    /* renamed from: a */
    public final TextView f846a;

    /* renamed from: b */
    public TextClassifier f847b;

    /* renamed from: androidx.appcompat.widget.c0$a */
    public static final class a {
        /* renamed from: a */
        public static TextClassifier m701a(TextView textView) {
            Object systemService;
            TextClassifier textClassifier;
            TextClassifier textClassifier2;
            systemService = textView.getContext().getSystemService((Class<Object>) TextClassificationManager.class);
            TextClassificationManager textClassificationManager = (TextClassificationManager) systemService;
            if (textClassificationManager != null) {
                textClassifier2 = textClassificationManager.getTextClassifier();
                return textClassifier2;
            }
            textClassifier = TextClassifier.NO_OP;
            return textClassifier;
        }
    }

    public C0217c0(TextView textView) {
        textView.getClass();
        this.f846a = textView;
    }
}
