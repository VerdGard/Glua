package p052g2;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: g2.a */
/* loaded from: classes.dex */
public final class C1208a implements Closeable {

    /* renamed from: Y */
    public final long f5925Y;

    /* renamed from: c */
    public final File f5927c;

    /* renamed from: e */
    public final File f5928e;

    /* renamed from: m */
    public final File f5929m;

    /* renamed from: s */
    public final File f5930s;

    /* renamed from: x1 */
    public BufferedWriter f5932x1;

    /* renamed from: z1 */
    public int f5934z1;

    /* renamed from: w1 */
    public long f5931w1 = 0;

    /* renamed from: y1 */
    public final LinkedHashMap<String, c> f5933y1 = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: A1 */
    public final ThreadPoolExecutor f5922A1 = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: B1 */
    public final a f5923B1 = new a();

    /* renamed from: X */
    public final int f5924X = 1;

    /* renamed from: Z */
    public final int f5926Z = 1;

    /* renamed from: g2.a$a */
    public class a implements Callable<Void> {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        public final Void call() {
            synchronized (C1208a.this) {
                C1208a c1208a = C1208a.this;
                if (c1208a.f5932x1 != null) {
                    c1208a.m3419i();
                    if (C1208a.this.m3414b()) {
                        C1208a.this.m3418g();
                        C1208a.this.f5934z1 = 0;
                    }
                }
            }
            return null;
        }
    }

    /* renamed from: g2.a$b */
    public final class b {

        /* renamed from: a */
        public final c f5936a;

        public b(c cVar) {
            this.f5936a = cVar;
            if (cVar.f5942e) {
                return;
            }
            boolean[] zArr = new boolean[C1208a.this.f5926Z];
        }

        /* renamed from: a */
        public final void m3420a() {
            C1208a c1208a = C1208a.this;
            synchronized (c1208a) {
                c cVar = this.f5936a;
                if (cVar.f5943f != this) {
                    throw new IllegalStateException();
                }
                for (int i7 = 0; i7 < c1208a.f5926Z; i7++) {
                    C1208a.m3411a(cVar.f5941d[i7]);
                }
                c1208a.f5934z1++;
                cVar.f5943f = null;
                if (false || cVar.f5942e) {
                    cVar.f5942e = true;
                    c1208a.f5932x1.append((CharSequence) "CLEAN");
                    c1208a.f5932x1.append(' ');
                    c1208a.f5932x1.append((CharSequence) cVar.f5938a);
                    c1208a.f5932x1.append((CharSequence) cVar.m3421a());
                } else {
                    c1208a.f5933y1.remove(cVar.f5938a);
                    c1208a.f5932x1.append((CharSequence) "REMOVE");
                    c1208a.f5932x1.append(' ');
                    c1208a.f5932x1.append((CharSequence) cVar.f5938a);
                }
                c1208a.f5932x1.append('\n');
                c1208a.f5932x1.flush();
                if (c1208a.f5931w1 > c1208a.f5925Y || c1208a.m3414b()) {
                    c1208a.f5922A1.submit(c1208a.f5923B1);
                }
            }
        }
    }

    /* renamed from: g2.a$c */
    public final class c {

        /* renamed from: a */
        public final String f5938a;

        /* renamed from: b */
        public final long[] f5939b;

        /* renamed from: c */
        public final File[] f5940c;

        /* renamed from: d */
        public final File[] f5941d;

        /* renamed from: e */
        public boolean f5942e;

        /* renamed from: f */
        public b f5943f;

        public c(String str) {
            this.f5938a = str;
            int i7 = C1208a.this.f5926Z;
            this.f5939b = new long[i7];
            this.f5940c = new File[i7];
            this.f5941d = new File[i7];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i8 = 0; i8 < C1208a.this.f5926Z; i8++) {
                sb.append(i8);
                File[] fileArr = this.f5940c;
                String sb2 = sb.toString();
                File file = C1208a.this.f5927c;
                fileArr[i8] = new File(file, sb2);
                sb.append(".tmp");
                this.f5941d[i8] = new File(file, sb.toString());
                sb.setLength(length);
            }
        }

        /* renamed from: a */
        public final String m3421a() {
            StringBuilder sb = new StringBuilder();
            for (long j7 : this.f5939b) {
                sb.append(' ');
                sb.append(j7);
            }
            return sb.toString();
        }
    }

    public C1208a(File file, long j7) {
        this.f5927c = file;
        this.f5928e = new File(file, "journal");
        this.f5929m = new File(file, "journal.tmp");
        this.f5930s = new File(file, "journal.bkp");
        this.f5925Y = j7;
    }

    /* renamed from: a */
    public static void m3411a(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: c */
    public static C1208a m3412c(File file, long j7) {
        if (j7 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                m3413h(file2, file3, false);
            }
        }
        C1208a c1208a = new C1208a(file, j7);
        if (c1208a.f5928e.exists()) {
            try {
                c1208a.m3416e();
                c1208a.m3415d();
                return c1208a;
            } catch (IOException e7) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e7.getMessage() + ", removing");
                c1208a.close();
                C1210c.m3423a(c1208a.f5927c);
            }
        }
        file.mkdirs();
        C1208a c1208a2 = new C1208a(file, j7);
        c1208a2.m3418g();
        return c1208a2;
    }

    /* renamed from: h */
    public static void m3413h(File file, File file2, boolean z6) {
        if (z6) {
            m3411a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* renamed from: b */
    public final boolean m3414b() {
        int i7 = this.f5934z1;
        return i7 >= 2000 && i7 >= this.f5933y1.size();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f5932x1 == null) {
            return;
        }
        Iterator it = new ArrayList(this.f5933y1.values()).iterator();
        while (it.hasNext()) {
            b bVar = ((c) it.next()).f5943f;
            if (bVar != null) {
                bVar.m3420a();
            }
        }
        m3419i();
        this.f5932x1.close();
        this.f5932x1 = null;
    }

    /* renamed from: d */
    public final void m3415d() {
        m3411a(this.f5929m);
        Iterator<c> it = this.f5933y1.values().iterator();
        while (it.hasNext()) {
            c next = it.next();
            b bVar = next.f5943f;
            int i7 = this.f5926Z;
            int i8 = 0;
            if (bVar == null) {
                while (i8 < i7) {
                    this.f5931w1 += next.f5939b[i8];
                    i8++;
                }
            } else {
                next.f5943f = null;
                while (i8 < i7) {
                    m3411a(next.f5940c[i8]);
                    m3411a(next.f5941d[i8]);
                    i8++;
                }
                it.remove();
            }
        }
    }

    /* renamed from: e */
    public final void m3416e() {
        File file = this.f5928e;
        C1209b c1209b = new C1209b(new FileInputStream(file), C1210c.f5951a);
        try {
            String m3422a = c1209b.m3422a();
            String m3422a2 = c1209b.m3422a();
            String m3422a3 = c1209b.m3422a();
            String m3422a4 = c1209b.m3422a();
            String m3422a5 = c1209b.m3422a();
            if (!"libcore.io.DiskLruCache".equals(m3422a) || !"1".equals(m3422a2) || !Integer.toString(this.f5924X).equals(m3422a3) || !Integer.toString(this.f5926Z).equals(m3422a4) || !"".equals(m3422a5)) {
                throw new IOException("unexpected journal header: [" + m3422a + ", " + m3422a2 + ", " + m3422a4 + ", " + m3422a5 + "]");
            }
            int i7 = 0;
            while (true) {
                try {
                    m3417f(c1209b.m3422a());
                    i7++;
                } catch (EOFException unused) {
                    this.f5934z1 = i7 - this.f5933y1.size();
                    if (c1209b.f5945X == -1) {
                        m3418g();
                    } else {
                        this.f5932x1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), C1210c.f5951a));
                    }
                    try {
                        c1209b.close();
                        return;
                    } catch (RuntimeException e7) {
                        throw e7;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                c1209b.close();
            } catch (RuntimeException e8) {
                throw e8;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    /* renamed from: f */
    public final void m3417f(String str) {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i7 = indexOf + 1;
        int indexOf2 = str.indexOf(32, i7);
        LinkedHashMap<String, c> linkedHashMap = this.f5933y1;
        if (indexOf2 == -1) {
            substring = str.substring(i7);
            if (indexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i7, indexOf2);
        }
        c cVar = linkedHashMap.get(substring);
        if (cVar == null) {
            cVar = new c(substring);
            linkedHashMap.put(substring, cVar);
        }
        if (indexOf2 == -1 || indexOf != 5 || !str.startsWith("CLEAN")) {
            if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                cVar.f5943f = new b(cVar);
                return;
            } else {
                if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] split = str.substring(indexOf2 + 1).split(" ");
        cVar.f5942e = true;
        cVar.f5943f = null;
        if (split.length != C1208a.this.f5926Z) {
            throw new IOException("unexpected journal line: " + Arrays.toString(split));
        }
        for (int i8 = 0; i8 < split.length; i8++) {
            try {
                cVar.f5939b[i8] = Long.parseLong(split[i8]);
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + Arrays.toString(split));
            }
        }
    }

    /* renamed from: g */
    public final synchronized void m3418g() {
        StringBuilder sb;
        BufferedWriter bufferedWriter = this.f5932x1;
        if (bufferedWriter != null) {
            bufferedWriter.close();
        }
        BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f5929m), C1210c.f5951a));
        try {
            bufferedWriter2.write("libcore.io.DiskLruCache");
            bufferedWriter2.write("\n");
            bufferedWriter2.write("1");
            bufferedWriter2.write("\n");
            bufferedWriter2.write(Integer.toString(this.f5924X));
            bufferedWriter2.write("\n");
            bufferedWriter2.write(Integer.toString(this.f5926Z));
            bufferedWriter2.write("\n");
            bufferedWriter2.write("\n");
            for (c cVar : this.f5933y1.values()) {
                if (cVar.f5943f != null) {
                    sb = new StringBuilder();
                    sb.append("DIRTY ");
                    sb.append(cVar.f5938a);
                    sb.append('\n');
                } else {
                    sb = new StringBuilder();
                    sb.append("CLEAN ");
                    sb.append(cVar.f5938a);
                    sb.append(cVar.m3421a());
                    sb.append('\n');
                }
                bufferedWriter2.write(sb.toString());
            }
            bufferedWriter2.close();
            if (this.f5928e.exists()) {
                m3413h(this.f5928e, this.f5930s, true);
            }
            m3413h(this.f5929m, this.f5928e, false);
            this.f5930s.delete();
            this.f5932x1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f5928e, true), C1210c.f5951a));
        } catch (Throwable th) {
            bufferedWriter2.close();
            throw th;
        }
    }

    /* renamed from: i */
    public final void m3419i() {
        while (this.f5931w1 > this.f5925Y) {
            String key = this.f5933y1.entrySet().iterator().next().getKey();
            synchronized (this) {
                if (this.f5932x1 == null) {
                    throw new IllegalStateException("cache is closed");
                }
                c cVar = this.f5933y1.get(key);
                if (cVar != null && cVar.f5943f == null) {
                    for (int i7 = 0; i7 < this.f5926Z; i7++) {
                        File file = cVar.f5940c[i7];
                        if (file.exists() && !file.delete()) {
                            throw new IOException("failed to delete " + file);
                        }
                        long j7 = this.f5931w1;
                        long[] jArr = cVar.f5939b;
                        this.f5931w1 = j7 - jArr[i7];
                        jArr[i7] = 0;
                    }
                    this.f5934z1++;
                    this.f5932x1.append((CharSequence) "REMOVE");
                    this.f5932x1.append(' ');
                    this.f5932x1.append((CharSequence) key);
                    this.f5932x1.append('\n');
                    this.f5933y1.remove(key);
                    if (m3414b()) {
                        this.f5922A1.submit(this.f5923B1);
                    }
                }
            }
        }
    }
}
