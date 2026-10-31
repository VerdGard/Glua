package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Parcelable;
import androidx.versionedparcelable.CustomVersionedParcelable;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k */
    public static final PorterDuff.Mode f1455k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    public Object f1457b;

    /* renamed from: j */
    public String f1465j;

    /* renamed from: a */
    public int f1456a = -1;

    /* renamed from: c */
    public byte[] f1458c = null;

    /* renamed from: d */
    public Parcelable f1459d = null;

    /* renamed from: e */
    public int f1460e = 0;

    /* renamed from: f */
    public int f1461f = 0;

    /* renamed from: g */
    public ColorStateList f1462g = null;

    /* renamed from: h */
    public PorterDuff.Mode f1463h = f1455k;

    /* renamed from: i */
    public String f1464i = null;

    /* renamed from: androidx.core.graphics.drawable.IconCompat$a */
    public static class C0300a {
        /* renamed from: a */
        public static int m1005a(Object obj) {
            int resId;
            resId = ((Icon) obj).getResId();
            return resId;
        }

        /* renamed from: b */
        public static String m1006b(Object obj) {
            String resPackage;
            resPackage = ((Icon) obj).getResPackage();
            return resPackage;
        }

        /* renamed from: c */
        public static int m1007c(Object obj) {
            int type;
            type = ((Icon) obj).getType();
            return type;
        }

        /* renamed from: d */
        public static Uri m1008d(Object obj) {
            Uri uri;
            uri = ((Icon) obj).getUri();
            return uri;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.toString():java.lang.String");
    }
}
