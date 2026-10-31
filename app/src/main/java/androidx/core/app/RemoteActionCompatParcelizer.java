package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import p190y0.AbstractC2219a;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC2219a abstractC2219a) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        Object obj = remoteActionCompat.f1443a;
        if (abstractC2219a.mo5387h(1)) {
            obj = abstractC2219a.m5391l();
        }
        remoteActionCompat.f1443a = (IconCompat) obj;
        CharSequence charSequence = remoteActionCompat.f1444b;
        if (abstractC2219a.mo5387h(2)) {
            charSequence = abstractC2219a.mo5386g();
        }
        remoteActionCompat.f1444b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f1445c;
        if (abstractC2219a.mo5387h(3)) {
            charSequence2 = abstractC2219a.mo5386g();
        }
        remoteActionCompat.f1445c = charSequence2;
        Parcelable parcelable = remoteActionCompat.f1446d;
        if (abstractC2219a.mo5387h(4)) {
            parcelable = abstractC2219a.mo5389j();
        }
        remoteActionCompat.f1446d = (PendingIntent) parcelable;
        boolean z6 = remoteActionCompat.f1447e;
        if (abstractC2219a.mo5387h(5)) {
            z6 = abstractC2219a.mo5384e();
        }
        remoteActionCompat.f1447e = z6;
        boolean z7 = remoteActionCompat.f1448f;
        if (abstractC2219a.mo5387h(6)) {
            z7 = abstractC2219a.mo5384e();
        }
        remoteActionCompat.f1448f = z7;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC2219a abstractC2219a) {
        abstractC2219a.getClass();
        IconCompat iconCompat = remoteActionCompat.f1443a;
        abstractC2219a.mo5392m(1);
        abstractC2219a.m5399t(iconCompat);
        CharSequence charSequence = remoteActionCompat.f1444b;
        abstractC2219a.mo5392m(2);
        abstractC2219a.mo5395p(charSequence);
        CharSequence charSequence2 = remoteActionCompat.f1445c;
        abstractC2219a.mo5392m(3);
        abstractC2219a.mo5395p(charSequence2);
        PendingIntent pendingIntent = remoteActionCompat.f1446d;
        abstractC2219a.mo5392m(4);
        abstractC2219a.mo5397r(pendingIntent);
        boolean z6 = remoteActionCompat.f1447e;
        abstractC2219a.mo5392m(5);
        abstractC2219a.mo5393n(z6);
        boolean z7 = remoteActionCompat.f1448f;
        abstractC2219a.mo5392m(6);
        abstractC2219a.mo5393n(z7);
    }
}
