package p036e2;

import android.net.wifi.ScanResult;
import java.util.Comparator;

/* renamed from: e2.c4 */
/* loaded from: classes.dex */
public final class C0975c4 implements Comparator<ScanResult> {
    @Override // java.util.Comparator
    public final int compare(ScanResult scanResult, ScanResult scanResult2) {
        return scanResult2.level - scanResult.level;
    }
}
