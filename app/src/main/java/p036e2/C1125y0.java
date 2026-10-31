package p036e2;

import java.math.BigInteger;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;

/* renamed from: e2.y0 */
/* loaded from: classes.dex */
public final class C1125y0 {

    /* renamed from: a */
    public static final SecureRandom f5607a = new SecureRandom();

    /* renamed from: a */
    public static byte[] m3302a(byte[] bArr, C0958a1 c0958a1) {
        BigInteger bigInteger = c0958a1.f4928a;
        BigInteger bigInteger2 = c0958a1.f4929b;
        BigInteger bigInteger3 = new BigInteger(1, bArr);
        if (bigInteger3.compareTo(bigInteger) >= 0) {
            throw new BadPaddingException("Message is larger than modulus");
        }
        BigInteger modPow = bigInteger3.modPow(bigInteger2, bigInteger);
        int bitLength = (bigInteger.bitLength() + 7) >> 3;
        byte[] byteArray = modPow.toByteArray();
        int length = byteArray.length;
        if (length == bitLength) {
            return byteArray;
        }
        if (length == bitLength + 1 && byteArray[0] == 0) {
            byte[] bArr2 = new byte[bitLength];
            System.arraycopy(byteArray, 1, bArr2, 0, bitLength);
            return bArr2;
        }
        if (length >= bitLength) {
            return null;
        }
        byte[] bArr3 = new byte[bitLength];
        System.arraycopy(byteArray, 0, bArr3, bitLength - length, length);
        return bArr3;
    }
}
