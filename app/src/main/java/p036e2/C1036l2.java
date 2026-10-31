package p036e2;

import android.view.View;
import java.util.Comparator;
import java.util.Map;

/* renamed from: e2.l2 */
/* loaded from: classes.dex */
public final class C1036l2 implements Comparator<Map.Entry<View, Integer>> {
    @Override // java.util.Comparator
    public final int compare(Map.Entry<View, Integer> entry, Map.Entry<View, Integer> entry2) {
        return entry2.getValue().compareTo(entry.getValue());
    }
}
