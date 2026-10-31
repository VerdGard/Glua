package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;
import p105n.AbstractFutureC1631a;
import p105n.C1632b;

/* renamed from: androidx.profileinstaller.d */
/* loaded from: classes.dex */
public final class C0423d {

    /* renamed from: a */
    public static final C1632b<c> f2041a = new C1632b<>();

    /* renamed from: b */
    public static final Object f2042b = new Object();

    /* renamed from: c */
    public static c f2043c = null;

    /* renamed from: androidx.profileinstaller.d$a */
    public static class a {
        /* renamed from: a */
        public static PackageInfo m1423a(PackageManager packageManager, Context context) {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    /* renamed from: androidx.profileinstaller.d$b */
    public static class b {

        /* renamed from: a */
        public final int f2044a;

        /* renamed from: b */
        public final int f2045b;

        /* renamed from: c */
        public final long f2046c;

        /* renamed from: d */
        public final long f2047d;

        public b(int i7, int i8, long j7, long j8) {
            this.f2044a = i7;
            this.f2045b = i8;
            this.f2046c = j7;
            this.f2047d = j8;
        }

        /* renamed from: a */
        public static b m1424a(File file) {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        /* renamed from: b */
        public final void m1425b(File file) {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f2044a);
                dataOutputStream.writeInt(this.f2045b);
                dataOutputStream.writeLong(this.f2046c);
                dataOutputStream.writeLong(this.f2047d);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f2045b == bVar.f2045b && this.f2046c == bVar.f2046c && this.f2044a == bVar.f2044a && this.f2047d == bVar.f2047d;
        }

        public final int hashCode() {
            return Objects.hash(Integer.valueOf(this.f2045b), Long.valueOf(this.f2046c), Integer.valueOf(this.f2044a), Long.valueOf(this.f2047d));
        }
    }

    /* renamed from: androidx.profileinstaller.d$c */
    public static class c {
    }

    /* renamed from: a */
    public static c m1421a(int i7, boolean z6, boolean z7) {
        c cVar = new c();
        f2043c = cVar;
        C1632b<c> c1632b = f2041a;
        c1632b.getClass();
        if (AbstractFutureC1631a.f7439Y.mo4001b(c1632b, null, cVar)) {
            AbstractFutureC1631a.m3995b(c1632b);
        }
        return f2043c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:24|25|(1:27)(1:74)|28|29|(2:66|67)(1:31)|32|(8:39|(1:43)|(1:50)|51|(2:58|59)|55|56|57)|(1:65)|(1:43)|(3:45|48|50)|51|(1:53)|58|59|55|56|57) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e7, code lost:
    
        r3 = 196608;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b7, code lost:
    
        r3 = 1;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m1422b(android.content.Context r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.profileinstaller.C0423d.m1422b(android.content.Context, boolean):void");
    }
}
