package p036e2;

import android.ext.C0090b;
import android.ext.C0091c;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.MGF1ParameterSpec;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;

/* renamed from: e2.b1 */
/* loaded from: classes.dex */
public final class C0965b1 {

    /* renamed from: g */
    public static final Map<String, byte[]> f4945g = Collections.synchronizedMap(new HashMap());

    /* renamed from: a */
    public final int f4946a;

    /* renamed from: b */
    public final int f4947b;

    /* renamed from: c */
    public SecureRandom f4948c;

    /* renamed from: d */
    public final int f4949d;

    /* renamed from: e */
    public final MessageDigest f4950e;

    /* renamed from: f */
    public final byte[] f4951f;

    public C0965b1(int i7, int i8, SecureRandom secureRandom, OAEPParameterSpec oAEPParameterSpec) {
        String digestAlgorithm;
        byte[] value;
        byte[] bArr;
        this.f4946a = i7;
        this.f4947b = i8;
        this.f4948c = secureRandom;
        if (i8 < 64) {
            throw new InvalidKeyException("Padded size must be at least 64");
        }
        if (i7 == 1 || i7 == 2) {
            i8 -= 11;
        } else if (i7 != 3) {
            if (i7 != 4) {
                throw new InvalidKeyException(C0090b.m219e("Invalid padding: ", i7));
            }
            String str = "SHA-1";
            if (oAEPParameterSpec != null) {
                try {
                    str = oAEPParameterSpec.getDigestAlgorithm();
                    String mGFAlgorithm = oAEPParameterSpec.getMGFAlgorithm();
                    if (!mGFAlgorithm.equalsIgnoreCase("MGF1")) {
                        throw new InvalidAlgorithmParameterException("Unsupported MGF algo: ".concat(mGFAlgorithm));
                    }
                    digestAlgorithm = ((MGF1ParameterSpec) oAEPParameterSpec.getMGFParameters()).getDigestAlgorithm();
                    PSource pSource = oAEPParameterSpec.getPSource();
                    String algorithm = pSource.getAlgorithm();
                    if (!algorithm.equalsIgnoreCase("PSpecified")) {
                        throw new InvalidAlgorithmParameterException("Unsupported pSource algo: ".concat(algorithm));
                    }
                    value = ((PSource.PSpecified) pSource).getValue();
                } catch (NoSuchAlgorithmException e7) {
                    throw new InvalidKeyException(C0091c.m228f("Digest ", "SHA-1", " not available"), e7);
                }
            } else {
                value = null;
                digestAlgorithm = "SHA-1";
            }
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            this.f4950e = MessageDigest.getInstance(digestAlgorithm);
            if (value == null || value.length == 0) {
                String algorithm2 = messageDigest.getAlgorithm();
                Map<String, byte[]> map = f4945g;
                byte[] bArr2 = map.get(algorithm2);
                if (bArr2 == null) {
                    byte[] digest = messageDigest.digest();
                    map.put(algorithm2, digest);
                    bArr = digest;
                } else {
                    bArr = bArr2;
                }
            } else {
                bArr = messageDigest.digest(value);
            }
            this.f4951f = bArr;
            int length = (i8 - 2) - (bArr.length * 2);
            this.f4949d = length;
            if (length > 0) {
                return;
            }
            throw new InvalidKeyException("Key is too short for encryption using OAEPPadding with " + str + " and MGF1" + digestAlgorithm);
        }
        this.f4949d = i8;
    }

    /* renamed from: a */
    public final void m2963a(byte[] bArr, int i7, int i8, byte[] bArr2, int i9, int i10) {
        int i11;
        byte[] bArr3 = new byte[4];
        byte[] bArr4 = new byte[20];
        while (i10 > 0) {
            MessageDigest messageDigest = this.f4950e;
            messageDigest.update(bArr, i7, i8);
            messageDigest.update(bArr3);
            try {
                messageDigest.digest(bArr4, 0, 20);
                for (int i12 = 0; i12 < 20 && i10 > 0; i12++) {
                    bArr2[i9] = (byte) (bArr4[i12] ^ bArr2[i9]);
                    i10--;
                    i9++;
                }
                if (i10 > 0) {
                    while (true) {
                        byte b7 = (byte) (bArr3[i11] + 1);
                        bArr3[i11] = b7;
                        i11 = (b7 == 0 && i11 > 0) ? i11 - 1 : 3;
                    }
                }
            } catch (DigestException e7) {
                throw new BadPaddingException(e7.toString());
            }
        }
    }

    /* renamed from: b */
    public final byte[] m2964b(byte[] bArr, int i7) {
        byte[] bArr2;
        int i8;
        int i9;
        SecureRandom secureRandom = C1125y0.f5607a;
        if (i7 == bArr.length) {
            bArr2 = bArr;
        } else {
            byte[] bArr3 = new byte[i7];
            System.arraycopy(bArr, 0, bArr3, 0, i7);
            bArr2 = bArr3;
        }
        int length = bArr2.length;
        int i10 = this.f4949d;
        if (length > i10) {
            throw new BadPaddingException("Data must be shorter than " + (i10 + 1) + " bytes");
        }
        int i11 = this.f4947b;
        int i12 = 2;
        int i13 = this.f4946a;
        if (i13 != 1 && i13 != 2) {
            if (i13 == 3) {
                return bArr2;
            }
            if (i13 != 4) {
                throw new AssertionError();
            }
            if (this.f4948c == null) {
                this.f4948c = C1125y0.f5607a;
            }
            byte[] bArr4 = this.f4951f;
            int length2 = bArr4.length;
            byte[] bArr5 = new byte[length2];
            this.f4948c.nextBytes(bArr5);
            byte[] bArr6 = new byte[i11];
            System.arraycopy(bArr5, 0, bArr6, 1, length2);
            int i14 = length2 + 1;
            int i15 = i11 - i14;
            int length3 = i11 - bArr2.length;
            System.arraycopy(bArr4, 0, bArr6, i14, length2);
            bArr6[length3 - 1] = 1;
            System.arraycopy(bArr2, 0, bArr6, length3, bArr2.length);
            m2963a(bArr6, 1, length2, bArr6, i14, i15);
            m2963a(bArr6, i14, i15, bArr6, 1, length2);
            return bArr6;
        }
        byte[] bArr7 = new byte[i11];
        System.arraycopy(bArr2, 0, bArr7, i11 - bArr2.length, bArr2.length);
        int length4 = (i11 - 3) - bArr2.length;
        bArr7[0] = 0;
        bArr7[1] = (byte) i13;
        int i16 = -1;
        if (i13 != 1) {
            if (this.f4948c == null) {
                this.f4948c = C1125y0.f5607a;
            }
            byte[] bArr8 = new byte[64];
            while (true) {
                int i17 = length4 - 1;
                if (length4 <= 0) {
                    break;
                }
                while (true) {
                    if (i16 < 0) {
                        this.f4948c.nextBytes(bArr8);
                        i16 = 63;
                    }
                    i8 = i16 - 1;
                    i9 = bArr8[i16] & 255;
                    if (i9 != 0) {
                        break;
                    }
                    i16 = i8;
                }
                bArr7[i12] = (byte) i9;
                i16 = i8;
                length4 = i17;
                i12++;
            }
        } else {
            while (true) {
                int i18 = length4 - 1;
                if (length4 <= 0) {
                    break;
                }
                bArr7[i12] = -1;
                i12++;
                length4 = i18;
            }
        }
        return bArr7;
    }

    /* renamed from: c */
    public final byte[] m2965c(byte[] bArr) {
        int length = bArr.length;
        int i7 = this.f4947b;
        if (length != i7) {
            throw new BadPaddingException(C0090b.m219e("Padded length must be ", i7));
        }
        int i8 = 2;
        int i9 = this.f4946a;
        if (i9 != 1 && i9 != 2) {
            if (i9 == 3) {
                return bArr;
            }
            if (i9 != 4) {
                throw new AssertionError();
            }
            byte[] bArr2 = this.f4951f;
            int length2 = bArr2.length;
            if (bArr[0] != 0) {
                throw new BadPaddingException("Data must start with zero");
            }
            int i10 = length2 + 1;
            int length3 = bArr.length - i10;
            m2963a(bArr, i10, length3, bArr, 1, length2);
            m2963a(bArr, 1, length2, bArr, i10, length3);
            for (int i11 = 0; i11 < length2; i11++) {
                if (bArr2[i11] != bArr[i10 + i11]) {
                    throw new BadPaddingException("lHash mismatch");
                }
            }
            int i12 = i10 + length2;
            do {
                byte b7 = bArr[i12];
                if (b7 != 0) {
                    int i13 = i12 + 1;
                    if (b7 != 1) {
                        throw new BadPaddingException("Padding string not terminated by 0x01 byte");
                    }
                    int length4 = bArr.length - i13;
                    byte[] bArr3 = new byte[length4];
                    System.arraycopy(bArr, i13, bArr3, 0, length4);
                    return bArr3;
                }
                i12++;
            } while (i12 < bArr.length);
            throw new BadPaddingException("Padding string not terminated");
        }
        if (bArr[0] != 0) {
            throw new BadPaddingException("Data must start with zero");
        }
        if (bArr[1] != i9) {
            throw new BadPaddingException("Blocktype mismatch: " + ((int) bArr[1]));
        }
        while (true) {
            int i14 = i8 + 1;
            int i15 = bArr[i8] & 255;
            if (i15 == 0) {
                int length5 = bArr.length - i14;
                if (length5 > this.f4949d) {
                    throw new BadPaddingException("Padding string too short");
                }
                byte[] bArr4 = new byte[length5];
                System.arraycopy(bArr, bArr.length - length5, bArr4, 0, length5);
                return bArr4;
            }
            if (i14 == bArr.length) {
                throw new BadPaddingException("Padding string not terminated");
            }
            if (i9 == 1 && i15 != 255) {
                throw new BadPaddingException(C0090b.m219e("Padding byte not 0xff: ", i15));
            }
            i8 = i14;
        }
    }
}
