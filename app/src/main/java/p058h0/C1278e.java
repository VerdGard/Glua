package p058h0;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import p058h0.C1282i;

/* renamed from: h0.e */
/* loaded from: classes.dex */
public final class C1278e extends InputConnectionWrapper {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC1280g f6352a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1278e(InputConnection inputConnection, C1277d c1277d) {
        super(inputConnection, false);
        this.f6352a = c1277d;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i7, Bundle bundle) {
        if (((C1277d) this.f6352a).m3590a((inputContentInfo != null && Build.VERSION.SDK_INT >= 25) ? new C1282i(new C1282i.a(inputContentInfo)) : null, i7, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i7, bundle);
    }
}
