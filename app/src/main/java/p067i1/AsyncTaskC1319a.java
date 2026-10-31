package p067i1;

import android.os.AsyncTask;
import android.util.JsonReader;
import com.airbnb.lottie.C0680a;
import java.io.IOException;
import p002a1.InterfaceC0014a;
import p002a1.InterfaceC0026m;

/* renamed from: i1.a */
/* loaded from: classes.dex */
public final class AsyncTaskC1319a extends AsyncTask<JsonReader, Void, C0680a> implements InterfaceC0014a {

    /* renamed from: a */
    public final InterfaceC0026m f6517a;

    public AsyncTaskC1319a(InterfaceC0026m interfaceC0026m) {
        this.f6517a = interfaceC0026m;
    }

    @Override // android.os.AsyncTask
    public final C0680a doInBackground(JsonReader[] jsonReaderArr) {
        try {
            return C0680a.a.m2186a(jsonReaderArr[0]);
        } catch (IOException e7) {
            throw new IllegalStateException(e7);
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(C0680a c0680a) {
        this.f6517a.mo109a(c0680a);
    }
}
