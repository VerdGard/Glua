package com.so.revelation.lua.Baidu;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public class MD5 {
    private static final char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    private static String byteArrayToHex(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        int i7 = 0;
        for (byte b7 : bArr) {
            int i8 = i7 + 1;
            char[] cArr2 = hexDigits;
            cArr[i7] = cArr2[(b7 >>> 4) & 15];
            i7 = i8 + 1;
            cArr[i8] = cArr2[b7 & 15];
        }
        return new String(cArr);
    }

    public static String md5(File file) {
        try {
            if (file.isFile()) {
                FileInputStream fileInputStream = new FileInputStream(file);
                String md5 = md5(fileInputStream);
                fileInputStream.close();
                return md5;
            }
            System.err.println("文件" + file.getAbsolutePath() + "不存在或者不是文件");
            return null;
        } catch (FileNotFoundException | IOException e7) {
            e7.printStackTrace();
            return null;
        }
    }

    public static String md5(InputStream inputStream) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    inputStream.close();
                    return byteArrayToHex(messageDigest.digest());
                }
                messageDigest.update(bArr, 0, read);
            }
        } catch (FileNotFoundException | IOException | NoSuchAlgorithmException e7) {
            e7.printStackTrace();
            return null;
        }
    }

    public static String md5(String str) {
        if (str == null) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes("utf-8"));
            return byteArrayToHex(messageDigest.digest());
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException unused) {
            return null;
        }
    }
}
