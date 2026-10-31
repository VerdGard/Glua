package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.ext.C0089a;
import android.ext.Tools;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;
import p166v.C2009a;

/* loaded from: classes.dex */
public class FileProvider extends ContentProvider {

    /* renamed from: e */
    public static final String[] f1449e = {"_display_name", "_size"};

    /* renamed from: m */
    public static final File f1450m = new File("/");

    /* renamed from: s */
    public static final HashMap<String, InterfaceC0298b> f1451s = new HashMap<>();

    /* renamed from: c */
    public InterfaceC0298b f1452c;

    /* renamed from: androidx.core.content.FileProvider$a */
    public static class C0297a {
        /* renamed from: a */
        public static File[] m1002a(Context context) {
            return context.getExternalMediaDirs();
        }
    }

    /* renamed from: androidx.core.content.FileProvider$b */
    public interface InterfaceC0298b {
        /* renamed from: a */
        File mo1003a(Uri uri);

        /* renamed from: b */
        Uri mo1004b(File file);
    }

    /* renamed from: androidx.core.content.FileProvider$c */
    public static class C0299c implements InterfaceC0298b {

        /* renamed from: a */
        public final String f1453a;

        /* renamed from: b */
        public final HashMap<String, File> f1454b = new HashMap<>();

        public C0299c(String str) {
            this.f1453a = str;
        }

        @Override // androidx.core.content.FileProvider.InterfaceC0298b
        /* renamed from: a */
        public final File mo1003a(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = this.f1454b.get(decode);
            if (file == null) {
                throw new IllegalArgumentException("Unable to find configured root for " + uri);
            }
            File file2 = new File(file, decode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                if (canonicalFile.getPath().startsWith(file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
            }
        }

        @Override // androidx.core.content.FileProvider.InterfaceC0298b
        /* renamed from: b */
        public final Uri mo1004b(File file) {
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry<String, File> entry = null;
                for (Map.Entry<String, File> entry2 : this.f1454b.entrySet()) {
                    String path = entry2.getValue().getPath();
                    if (canonicalPath.startsWith(path) && (entry == null || path.length() > entry.getValue().getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry == null) {
                    throw new IllegalArgumentException(C0089a.m208f("Failed to find configured root that contains ", canonicalPath));
                }
                String path2 = entry.getValue().getPath();
                boolean endsWith = path2.endsWith("/");
                int length = path2.length();
                if (!endsWith) {
                    length++;
                }
                return new Uri.Builder().scheme("content").authority(this.f1453a).encodedPath(Uri.encode(entry.getKey()) + '/' + Uri.encode(canonicalPath.substring(length), "/")).build();
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }
    }

    /* renamed from: a */
    public static InterfaceC0298b m1000a(Context context, String str) {
        InterfaceC0298b interfaceC0298b;
        HashMap<String, InterfaceC0298b> hashMap = f1451s;
        synchronized (hashMap) {
            interfaceC0298b = hashMap.get(str);
            if (interfaceC0298b == null) {
                try {
                    try {
                        interfaceC0298b = m1001b(context, str);
                        hashMap.put(str, interfaceC0298b);
                    } catch (XmlPullParserException e7) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e7);
                    }
                } catch (IOException e8) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e8);
                }
            }
        }
        return interfaceC0298b;
    }

    /* renamed from: b */
    public static C0299c m1001b(Context context, String str) {
        C0299c c0299c = new C0299c(str);
        ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(str, Tools.Semaphore.f159S7);
        if (resolveContentProvider == null) {
            throw new IllegalArgumentException(C0089a.m208f("Couldn't find meta-data for provider with authority ", str));
        }
        Bundle bundle = resolveContentProvider.metaData;
        XmlResourceParser loadXmlMetaData = resolveContentProvider.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
        if (loadXmlMetaData == null) {
            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
        }
        while (true) {
            int next = loadXmlMetaData.next();
            if (next == 1) {
                return c0299c;
            }
            if (next == 2) {
                String name = loadXmlMetaData.getName();
                File file = null;
                String attributeValue = loadXmlMetaData.getAttributeValue(null, "name");
                String attributeValue2 = loadXmlMetaData.getAttributeValue(null, "path");
                if ("root-path".equals(name)) {
                    file = f1450m;
                } else if ("files-path".equals(name)) {
                    file = context.getFilesDir();
                } else if ("cache-path".equals(name)) {
                    file = context.getCacheDir();
                } else if ("external-path".equals(name)) {
                    file = Environment.getExternalStorageDirectory();
                } else if ("external-files-path".equals(name)) {
                    Object obj = C2009a.f9156a;
                    File[] m4900b = C2009a.b.m4900b(context, null);
                    if (m4900b.length > 0) {
                        file = m4900b[0];
                    }
                } else if ("external-cache-path".equals(name)) {
                    Object obj2 = C2009a.f9156a;
                    File[] m4899a = C2009a.b.m4899a(context);
                    if (m4899a.length > 0) {
                        file = m4899a[0];
                    }
                } else if ("external-media-path".equals(name)) {
                    File[] m1002a = C0297a.m1002a(context);
                    if (m1002a.length > 0) {
                        file = m1002a[0];
                    }
                }
                if (file == null) {
                    continue;
                } else {
                    if (attributeValue2 != null) {
                        file = new File(file, attributeValue2);
                    }
                    if (TextUtils.isEmpty(attributeValue)) {
                        throw new IllegalArgumentException("Name must not be empty");
                    }
                    try {
                        c0299c.f1454b.put(attributeValue, file.getCanonicalFile());
                    } catch (IOException e7) {
                        throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e7);
                    }
                }
            }
        }
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        String str = providerInfo.authority.split(";")[0];
        HashMap<String, InterfaceC0298b> hashMap = f1451s;
        synchronized (hashMap) {
            hashMap.remove(str);
        }
        this.f1452c = m1000a(context, str);
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return this.f1452c.mo1003a(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        File mo1003a = this.f1452c.mo1003a(uri);
        int lastIndexOf = mo1003a.getName().lastIndexOf(46);
        if (lastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(mo1003a.getName().substring(lastIndexOf + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    @SuppressLint({"UnknownNullness"})
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        int i7;
        File mo1003a = this.f1452c.mo1003a(uri);
        if ("r".equals(str)) {
            i7 = 268435456;
        } else if ("w".equals(str) || "wt".equals(str)) {
            i7 = 738197504;
        } else if ("wa".equals(str)) {
            i7 = 704643072;
        } else if ("rw".equals(str)) {
            i7 = 939524096;
        } else {
            if (!"rwt".equals(str)) {
                throw new IllegalArgumentException(C0089a.m208f("Invalid mode: ", str));
            }
            i7 = 1006632960;
        }
        return ParcelFileDescriptor.open(mo1003a, i7);
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i7;
        File mo1003a = this.f1452c.mo1003a(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = f1449e;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i8 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i8] = "_display_name";
                i7 = i8 + 1;
                objArr[i8] = queryParameter == null ? mo1003a.getName() : queryParameter;
            } else if ("_size".equals(str3)) {
                strArr3[i8] = "_size";
                i7 = i8 + 1;
                objArr[i8] = Long.valueOf(mo1003a.length());
            }
            i8 = i7;
        }
        String[] strArr4 = new String[i8];
        System.arraycopy(strArr3, 0, strArr4, 0, i8);
        Object[] objArr2 = new Object[i8];
        System.arraycopy(objArr, 0, objArr2, 0, i8);
        MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}
