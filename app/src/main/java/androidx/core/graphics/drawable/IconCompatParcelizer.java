package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import java.nio.charset.Charset;
import p190y0.AbstractC2219a;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC2219a abstractC2219a) {
        Parcelable parcelable;
        IconCompat iconCompat = new IconCompat();
        int i7 = iconCompat.f1456a;
        if (abstractC2219a.mo5387h(1)) {
            i7 = abstractC2219a.mo5388i();
        }
        iconCompat.f1456a = i7;
        byte[] bArr = iconCompat.f1458c;
        if (abstractC2219a.mo5387h(2)) {
            bArr = abstractC2219a.mo5385f();
        }
        iconCompat.f1458c = bArr;
        Parcelable parcelable2 = iconCompat.f1459d;
        if (abstractC2219a.mo5387h(3)) {
            parcelable2 = abstractC2219a.mo5389j();
        }
        iconCompat.f1459d = parcelable2;
        int i8 = iconCompat.f1460e;
        if (abstractC2219a.mo5387h(4)) {
            i8 = abstractC2219a.mo5388i();
        }
        iconCompat.f1460e = i8;
        int i9 = iconCompat.f1461f;
        if (abstractC2219a.mo5387h(5)) {
            i9 = abstractC2219a.mo5388i();
        }
        iconCompat.f1461f = i9;
        Parcelable parcelable3 = iconCompat.f1462g;
        if (abstractC2219a.mo5387h(6)) {
            parcelable3 = abstractC2219a.mo5389j();
        }
        iconCompat.f1462g = (ColorStateList) parcelable3;
        String str = iconCompat.f1464i;
        if (abstractC2219a.mo5387h(7)) {
            str = abstractC2219a.mo5390k();
        }
        iconCompat.f1464i = str;
        String str2 = iconCompat.f1465j;
        if (abstractC2219a.mo5387h(8)) {
            str2 = abstractC2219a.mo5390k();
        }
        iconCompat.f1465j = str2;
        iconCompat.f1463h = PorterDuff.Mode.valueOf(iconCompat.f1464i);
        switch (iconCompat.f1456a) {
            case -1:
                parcelable = iconCompat.f1459d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f1457b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                parcelable = iconCompat.f1459d;
                if (parcelable == null) {
                    byte[] bArr2 = iconCompat.f1458c;
                    iconCompat.f1457b = bArr2;
                    iconCompat.f1456a = 3;
                    iconCompat.f1460e = 0;
                    iconCompat.f1461f = bArr2.length;
                    return iconCompat;
                }
                iconCompat.f1457b = parcelable;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f1458c, Charset.forName("UTF-16"));
                iconCompat.f1457b = str3;
                if (iconCompat.f1456a == 2 && iconCompat.f1465j == null) {
                    iconCompat.f1465j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f1457b = iconCompat.f1458c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC2219a abstractC2219a) {
        abstractC2219a.getClass();
        iconCompat.f1464i = iconCompat.f1463h.name();
        switch (iconCompat.f1456a) {
            case -1:
            case 1:
            case 5:
                iconCompat.f1459d = (Parcelable) iconCompat.f1457b;
                break;
            case 2:
                iconCompat.f1458c = ((String) iconCompat.f1457b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f1458c = (byte[]) iconCompat.f1457b;
                break;
            case 4:
            case 6:
                iconCompat.f1458c = iconCompat.f1457b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i7 = iconCompat.f1456a;
        if (-1 != i7) {
            abstractC2219a.mo5392m(1);
            abstractC2219a.mo5396q(i7);
        }
        byte[] bArr = iconCompat.f1458c;
        if (bArr != null) {
            abstractC2219a.mo5392m(2);
            abstractC2219a.mo5394o(bArr);
        }
        Parcelable parcelable = iconCompat.f1459d;
        if (parcelable != null) {
            abstractC2219a.mo5392m(3);
            abstractC2219a.mo5397r(parcelable);
        }
        int i8 = iconCompat.f1460e;
        if (i8 != 0) {
            abstractC2219a.mo5392m(4);
            abstractC2219a.mo5396q(i8);
        }
        int i9 = iconCompat.f1461f;
        if (i9 != 0) {
            abstractC2219a.mo5392m(5);
            abstractC2219a.mo5396q(i9);
        }
        ColorStateList colorStateList = iconCompat.f1462g;
        if (colorStateList != null) {
            abstractC2219a.mo5392m(6);
            abstractC2219a.mo5397r(colorStateList);
        }
        String str = iconCompat.f1464i;
        if (str != null) {
            abstractC2219a.mo5392m(7);
            abstractC2219a.mo5398s(str);
        }
        String str2 = iconCompat.f1465j;
        if (str2 != null) {
            abstractC2219a.mo5392m(8);
            abstractC2219a.mo5398s(str2);
        }
    }
}
