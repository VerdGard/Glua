package android.ext;

import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class Hash {
    public static final String hash(Object obj, String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            if (obj instanceof File) {
                FileInputStream fileInputStream = new FileInputStream((File) obj);
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    messageDigest.update(bArr, 0, read);
                }
                fileInputStream.close();
            } else {
                messageDigest.update(obj.toString().getBytes());
            }
            return toString(messageDigest);
        } catch (Throwable th) {
            Log.m178e("hash fail", th);
            return th.toString();
        }
    }

    public static final String toString(MessageDigest messageDigest) {
        byte[] digest = messageDigest.digest();
        byte[] bArr = new byte[8];
        System.arraycopy(digest, 0, bArr, 0, 4);
        System.arraycopy(digest, digest.length - 4, bArr, 4, 4);
        return Tools.byteArrayToHexString(bArr);
    }
}
