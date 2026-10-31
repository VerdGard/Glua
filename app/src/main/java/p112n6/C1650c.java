package p112n6;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.zip.ZipFile;

/* renamed from: n6.c */
/* loaded from: classes.dex */
public final class C1650c implements Serializable {

    /* renamed from: e */
    public static final C1650c f7484e = new C1650c();

    /* renamed from: c */
    public final String f7485c;

    /* renamed from: n6.c$a */
    public static class a extends b {

        /* renamed from: c */
        public final String f7486c;

        public a(String str) {
            this.f7486c = str;
        }

        public final String toString() {
            return this.f7486c;
        }
    }

    /* renamed from: n6.c$b */
    public static abstract class b implements Serializable {
    }

    /* renamed from: n6.c$c */
    public static class c extends b {
    }

    public C1650c() {
        String m4009a = m4009a();
        this.f7485c = m4009a;
        ArrayList arrayList = new ArrayList();
        StringTokenizer stringTokenizer = new StringTokenizer(m4009a, System.getProperty("path.separator"));
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            if (!nextToken.equals("")) {
                File file = new File(nextToken);
                try {
                    if (file.exists()) {
                        if (file.isDirectory()) {
                            arrayList.add(new a(nextToken));
                        } else {
                            new ZipFile(file);
                            arrayList.add(new c());
                        }
                    }
                } catch (IOException e7) {
                    PrintStream printStream = System.err;
                    StringBuffer stringBuffer = new StringBuffer("CLASSPATH component ");
                    stringBuffer.append(file);
                    stringBuffer.append(": ");
                    stringBuffer.append(e7);
                    printStream.println(stringBuffer.toString());
                }
            }
        }
        arrayList.toArray(new b[arrayList.size()]);
    }

    /* renamed from: a */
    public static final String m4009a() {
        String property = System.getProperty("java.class.path");
        String property2 = System.getProperty("sun.boot.class.path");
        String property3 = System.getProperty("java.ext.dirs");
        ArrayList arrayList = new ArrayList();
        m4010b(property, arrayList);
        m4010b(property2, arrayList);
        ArrayList arrayList2 = new ArrayList();
        m4010b(property3, arrayList2);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            File file = new File((String) it.next());
            String[] list = file.list(new C1649b());
            if (list != null) {
                for (String str : list) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(file.getPath());
                    stringBuffer.append(File.separatorChar);
                    stringBuffer.append(str);
                    arrayList.add(stringBuffer.toString());
                }
            }
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            stringBuffer2.append((String) it2.next());
            if (it2.hasNext()) {
                stringBuffer2.append(File.pathSeparatorChar);
            }
        }
        return stringBuffer2.toString().intern();
    }

    /* renamed from: b */
    public static final void m4010b(String str, ArrayList arrayList) {
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, File.pathSeparator);
            while (stringTokenizer.hasMoreTokens()) {
                String nextToken = stringTokenizer.nextToken();
                if (new File(nextToken).exists()) {
                    arrayList.add(nextToken);
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1650c)) {
            return false;
        }
        return this.f7485c.equals(((C1650c) obj).f7485c);
    }

    public final int hashCode() {
        return this.f7485c.hashCode();
    }

    public final String toString() {
        return this.f7485c;
    }
}
