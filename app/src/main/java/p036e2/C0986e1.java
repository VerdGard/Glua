package p036e2;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* renamed from: e2.e1 */
/* loaded from: classes.dex */
public final class C0986e1 {

    /* renamed from: a */
    public final Context f5027a;

    /* renamed from: b */
    public a f5028b;

    /* renamed from: e2.e1$a */
    public final class a {

        /* renamed from: a */
        public File f5029a;

        /* renamed from: b */
        public final String f5030b;

        /* renamed from: c */
        public final a f5031c;

        /* renamed from: d */
        public final boolean f5032d;

        public a(File file) {
            this.f5032d = false;
            this.f5032d = true;
            this.f5029a = file;
            this.f5030b = file.getName();
        }

        public a(String str, a aVar) {
            this.f5032d = false;
            this.f5030b = str;
            this.f5031c = aVar;
            this.f5032d = false;
        }

        /* renamed from: a */
        public final String m3008a(String str) {
            Throwable th;
            ByteArrayOutputStream byteArrayOutputStream;
            File m3010c = m3010c();
            m3010c.mkdirs();
            File file = new File(m3010c, str);
            FileInputStream fileInputStream = null;
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(file);
                    try {
                        byte[] bArr = new byte[8192];
                        while (true) {
                            int read = fileInputStream2.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, read);
                        }
                        ByteBuffer wrap = ByteBuffer.wrap(byteArrayOutputStream.toByteArray());
                        if (wrap.remaining() < 12) {
                            throw new GeneralSecurityException("data too short");
                        }
                        byte[] bArr2 = new byte[12];
                        wrap.get(bArr2);
                        ByteBuffer allocate = ByteBuffer.allocate(wrap.remaining());
                        C1111w0.m3264b(bArr2, C1109v5.m3250n(), allocate, wrap);
                        String str2 = new String(allocate.array(), "UTF-8");
                        C1007h1.m3037b(fileInputStream2);
                        C1007h1.m3037b(byteArrayOutputStream);
                        return str2;
                    } catch (Exception unused) {
                        fileInputStream = fileInputStream2;
                        C1007h1.m3037b(fileInputStream);
                        C1007h1.m3037b(byteArrayOutputStream);
                        return "";
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream = fileInputStream2;
                        C1007h1.m3037b(fileInputStream);
                        C1007h1.m3037b(byteArrayOutputStream);
                        throw th;
                    }
                } catch (Exception unused2) {
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Exception unused3) {
                byteArrayOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                byteArrayOutputStream = null;
            }
        }

        /* renamed from: b */
        public final boolean m3009b(String str, String str2) {
            File m3010c = m3010c();
            m3010c.mkdirs();
            File file = new File(m3010c, str);
            FileOutputStream fileOutputStream = null;
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    fileOutputStream2.write(new C1118x0(0).m3279a(str2.getBytes()));
                    C1007h1.m3037b(fileOutputStream2);
                    return true;
                } catch (Exception unused) {
                    fileOutputStream = fileOutputStream2;
                    C1007h1.m3037b(fileOutputStream);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    C1007h1.m3037b(fileOutputStream);
                    throw th;
                }
            } catch (Exception unused2) {
            } catch (Throwable th2) {
                th = th2;
            }
        }

        /* renamed from: c */
        public final File m3010c() {
            File file = this.f5029a;
            if (file != null) {
                return file;
            }
            String str = this.f5030b;
            a aVar = this.f5031c;
            File file2 = aVar == null ? new File(C0986e1.this.m3006a(), str) : new File(aVar.m3010c(), str);
            this.f5029a = file2;
            return file2;
        }
    }

    public C0986e1(Context context) {
        this.f5027a = context;
        new File(m3006a(), ".cesium").mkdirs();
    }

    /* renamed from: a */
    public final File m3006a() {
        return new File(this.f5027a.getApplicationInfo().dataDir);
    }

    /* renamed from: b */
    public final synchronized a m3007b() {
        if (this.f5028b == null) {
            this.f5028b = new a(".cesium", null);
        }
        return this.f5028b;
    }
}
