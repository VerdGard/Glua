package p036e2;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: e2.r5 */
/* loaded from: classes.dex */
public final class C1081r5 implements FilenameFilter {

    /* renamed from: a */
    public final /* synthetic */ String f5370a = "__send_log_data_";

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.startsWith(this.f5370a);
    }
}
