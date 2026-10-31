package com.so.revelation.lua.Baidu;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
class HttpGet {
    protected static final String GET = "GET";
    protected static final int SOCKET_TIMEOUT = 10000;
    private static TrustManager myX509TrustManager = new X509TrustManager() { // from class: com.so.revelation.lua.Baidu.HttpGet.1
        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return null;
        }
    };

    public static void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e7) {
                e7.printStackTrace();
            }
        }
    }

    public static String encode(String str) {
        if (str == null) {
            return "";
        }
        try {
            return URLEncoder.encode(str, "utf-8");
        } catch (UnsupportedEncodingException e7) {
            e7.printStackTrace();
            return str;
        }
    }

    public static String get(String str, Map<String, String> map) {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new TrustManager[]{myX509TrustManager}, null);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(getUrlWithQueryString(str, map)).openConnection();
            if (httpURLConnection instanceof HttpsURLConnection) {
                ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLContext.getSocketFactory());
            }
            httpURLConnection.setConnectTimeout(SOCKET_TIMEOUT);
            httpURLConnection.setRequestMethod(GET);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode != 200) {
                System.out.println("Http错误码：" + responseCode);
            }
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    String sb2 = sb.toString();
                    close(bufferedReader);
                    close(inputStream);
                    httpURLConnection.disconnect();
                    return sb2;
                }
                sb.append(readLine);
            }
        } catch (MalformedURLException | IOException | KeyManagementException | NoSuchAlgorithmException e7) {
            e7.printStackTrace();
            return null;
        }
    }

    public static String getUrlWithQueryString(String str, Map<String, String> map) {
        if (map == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        if (str.contains("?")) {
            sb.append("&");
        } else {
            sb.append("?");
        }
        int i7 = 0;
        for (String str2 : map.keySet()) {
            String str3 = map.get(str2);
            if (str3 != null) {
                if (i7 != 0) {
                    sb.append('&');
                }
                sb.append(str2);
                sb.append('=');
                sb.append(encode(str3));
                i7++;
            }
        }
        return sb.toString();
    }
}
