package p036e2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: e2.i4 */
/* loaded from: classes.dex */
public interface InterfaceC1017i4 extends IInterface {

    /* renamed from: e2.i4$a */
    public static abstract class a extends Binder implements InterfaceC1017i4 {

        /* renamed from: a */
        public static final /* synthetic */ int f5130a = 0;

        /* renamed from: e2.i4$a$a, reason: collision with other inner class name */
        public static class C2296a implements InterfaceC1017i4 {

            /* renamed from: a */
            public final IBinder f5131a;

            public C2296a(IBinder iBinder) {
                this.f5131a = iBinder;
            }

            @Override // p036e2.InterfaceC1017i4
            /* renamed from: a */
            public final String mo3043a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                    this.f5131a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f5131a;
            }
        }
    }

    /* renamed from: a */
    String mo3043a();
}
