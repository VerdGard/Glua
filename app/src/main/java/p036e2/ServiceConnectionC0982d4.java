package p036e2;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.text.TextUtils;
import p036e2.C0968b4;
import p036e2.InterfaceC1017i4;

/* renamed from: e2.d4 */
/* loaded from: classes.dex */
public final class ServiceConnectionC0982d4 implements ServiceConnection {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC1003g4 f5009a;

    public ServiceConnectionC0982d4(C0996f4 c0996f4) {
        this.f5009a = c0996f4;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC1017i4 c2296a;
        InterfaceC1003g4 interfaceC1003g4;
        try {
            int i7 = InterfaceC1017i4.a.f5130a;
            if (iBinder == null) {
                c2296a = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                c2296a = (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC1017i4)) ? new InterfaceC1017i4.a.C2296a(iBinder) : (InterfaceC1017i4) queryLocalInterface;
            }
            if (TextUtils.isEmpty(c2296a.mo3043a()) || (interfaceC1003g4 = this.f5009a) == null) {
                return;
            }
            String mo3043a = c2296a.mo3043a();
            C0996f4 c0996f4 = (C0996f4) interfaceC1003g4;
            c0996f4.getClass();
            if (TextUtils.isEmpty(mo3043a)) {
                return;
            }
            C1109v5.f5493e = mo3043a;
            InterfaceC0989e4 interfaceC0989e4 = c0996f4.f5067a;
            if (interfaceC0989e4 != null) {
                ((C0968b4.a) interfaceC0989e4).m2986a(mo3043a);
            }
        } catch (Exception e7) {
            e7.printStackTrace();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
