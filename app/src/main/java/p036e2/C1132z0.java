package p036e2;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.SecureRandom;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;

/* renamed from: e2.z0 */
/* loaded from: classes.dex */
public final class C1132z0 {

    /* renamed from: a */
    public int f5625a;

    /* renamed from: c */
    public C0965b1 f5627c;

    /* renamed from: d */
    public byte[] f5628d;

    /* renamed from: e */
    public int f5629e;

    /* renamed from: f */
    public C0958a1 f5630f;

    /* renamed from: g */
    public String f5631g = "SHA-1";

    /* renamed from: b */
    public String f5626b = "PKCS1Padding";

    /* renamed from: a */
    public final void m3313a(C0958a1 c0958a1, SecureRandom secureRandom) {
        if (!(c0958a1 instanceof C0958a1)) {
            throw new InvalidKeyException("only support helios key");
        }
        this.f5625a = 4;
        this.f5630f = c0958a1;
        BigInteger bigInteger = c0958a1.f4928a;
        SecureRandom secureRandom2 = C1125y0.f5607a;
        int bitLength = (bigInteger.bitLength() + 7) >> 3;
        this.f5629e = 0;
        String str = this.f5626b;
        if (str == "NoPadding") {
            this.f5627c = new C0965b1(3, bitLength, secureRandom, null);
            this.f5628d = new byte[bitLength];
        } else {
            if (str == "PKCS1Padding") {
                this.f5627c = new C0965b1(this.f5625a > 2 ? 1 : 2, bitLength, secureRandom, null);
                this.f5628d = new byte[bitLength];
                return;
            }
            int i7 = this.f5625a;
            if (i7 == 3 || i7 == 4) {
                throw new InvalidKeyException("OAEP cannot be used to sign or verify signatures");
            }
            this.f5627c = new C0965b1(4, bitLength, secureRandom, new OAEPParameterSpec(this.f5631g, "MGF1", MGF1ParameterSpec.SHA1, PSource.PSpecified.DEFAULT));
            this.f5628d = new byte[bitLength];
        }
    }
}
