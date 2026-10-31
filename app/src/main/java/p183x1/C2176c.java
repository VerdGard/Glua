package p183x1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Map;
import p002a1.C0017d;
import p019c2.C0596d;
import p165u6.AbstractC1984c0;
import p165u6.C1981b;
import p165u6.C1998p;
import p175w1.AbstractC2084e;

/* renamed from: x1.c */
/* loaded from: classes.dex */
public final class C2176c extends AbstractC2084e {

    /* renamed from: j2 */
    public final C1981b f9888j2;

    public C2176c(C1981b c1981b) {
        this.f9888j2 = c1981b;
    }

    @Override // p175w1.AbstractC2084e
    /* renamed from: I2 */
    public final AbstractC1984c0 mo5146I2(AbstractC1984c0 abstractC1984c0) {
        C1998p m5319K2;
        File file = new File(abstractC1984c0.m4646N(1));
        synchronized (this) {
            m5319K2 = m5319K2(file, this.f9888j2, abstractC1984c0.m4646N(2));
        }
        return m5319K2;
    }

    @Override // p175w1.AbstractC2084e
    /* renamed from: J2 */
    public final String mo5147J2() {
        return "gg.ClassCompileAll(string text [, string positive = 'ok' [, string negative = nil [, string neutral = nil]]]) -> int: 0 = cancel, 1 = positive, 2 = negative, 3 = neutral";
    }

    /* renamed from: K2 */
    public final synchronized C1998p m5319K2(File file, C1981b c1981b, String str) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            Hashtable m92q = C0017d.m92q(fileInputStream, file.getName(), file.getName(), c1981b);
            fileInputStream.close();
            for (Map.Entry entry : m92q.entrySet()) {
                System.out.println("key= " + ((String) entry.getKey()) + " and value= " + entry.getValue());
                String str2 = (String) entry.getKey();
                byte[] bArr = (byte[]) entry.getValue();
                if (str2.indexOf(47) >= 0) {
                    new File(file.getPath() + str2.substring(0, str2.lastIndexOf(47))).mkdirs();
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file.getParent() + "/" + str2 + ".class");
                fileOutputStream.write(bArr);
                fileOutputStream.close();
                C0596d.m2043a(file.getParent() + "/classes.dex", file.getParent() + "/classes", str);
            }
        } catch (IOException e7) {
            return C1998p.m4815M2("编译错误" + e7.getMessage());
        }
        return C1998p.m4815M2("编译结束");
    }
}
