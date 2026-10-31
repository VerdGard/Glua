package p175w1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.ArrayAdapter;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: w1.g */
/* loaded from: classes.dex */
public class C2088g<T> extends ArrayAdapter<T> {
    @SuppressLint({"ResourceType"})
    public C2088g(Context context, ArrayList arrayList) {
        super(context, android.R.layout.select_dialog_item, android.R.id.text1, arrayList);
    }

    @Override // android.widget.ArrayAdapter
    public final void addAll(Collection<? extends T> collection) {
        super.addAll(collection);
    }
}
