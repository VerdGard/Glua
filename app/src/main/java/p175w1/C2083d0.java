package p175w1;

import android.ext.C0090b;
import android.ext.Tools;
import com.so.revelation.lua.EditorActivity;
import com.so.revelation.lua.p024gg.ShowApp;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import p129q1.ViewOnClickListenerC1728d;
import p165u6.AbstractC1992j;
import p165u6.AbstractC1997o;
import p165u6.AbstractC2003u;
import p165u6.C1981b;
import p165u6.C1983c;
import p165u6.C1988f;
import p165u6.C1989g;
import p165u6.C1991i;
import p165u6.C1996n;
import p165u6.C1998p;
import p165u6.C1999q;
import p165u6.C2000r;
import p172v6.C2034b;
import p172v6.C2038f;
import p180w6.AbstractC2149r;
import p180w6.C2132a;
import p180w6.C2133b;
import p180w6.C2134c;
import p180w6.C2135d;
import p180w6.C2143l;
import p180w6.C2145n;
import p180w6.C2146o;
import p180w6.InterfaceC2144m;
import p183x1.C2174a;
import p183x1.C2175b;
import p183x1.C2176c;
import p183x1.C2180g;
import p183x1.C2181h;
import p183x1.C2182i;
import p183x1.C2186m;
import p183x1.C2187n;
import p183x1.C2188o;
import p183x1.DialogInterfaceOnDismissListenerC2178e;
import p183x1.DialogInterfaceOnDismissListenerC2179f;
import p183x1.DialogInterfaceOnDismissListenerC2183j;
import p183x1.DialogInterfaceOnDismissListenerC2184k;
import p183x1.DialogInterfaceOnDismissListenerC2185l;
import p188x6.C2208i;
import p188x6.C2209j;
import p188x6.C2210k;
import p188x6.C2212m;

/* renamed from: w1.d0 */
/* loaded from: classes.dex */
public final class C2083d0 extends AbstractC2149r implements InterfaceC2144m {

    /* renamed from: o2 */
    public static C1981b f9492o2;

    /* renamed from: q2 */
    public static C2083d0 f9494q2;

    /* renamed from: h2 */
    public final String f9496h2;

    /* renamed from: i2 */
    public final C2085e0 f9497i2;

    /* renamed from: l2 */
    public final ShowApp f9500l2;

    /* renamed from: m2 */
    public static final int[] f9490m2 = new int[3];

    /* renamed from: n2 */
    public static final int[] f9491n2 = new int[8];

    /* renamed from: p2 */
    public static final C1998p[] f9493p2 = {C1998p.m4815M2("address"), C1998p.m4815M2("value"), C1998p.m4815M2("flags"), C1998p.m4815M2("name"), C1998p.m4815M2("freeze"), C1998p.m4815M2("freezeType"), C1998p.m4815M2("freezeFrom"), C1998p.m4815M2("freezeTo")};

    /* renamed from: j2 */
    public a f9498j2 = null;

    /* renamed from: k2 */
    public boolean f9499k2 = false;

    /* renamed from: g2 */
    public final int f9495g2 = 0;

    /* renamed from: w1.d0$a */
    public class a extends AbstractC2100m {

        /* renamed from: G1 */
        public final int f9501G1;

        /* renamed from: H1 */
        public final int f9502H1;

        /* renamed from: I1 */
        public final String f9503I1;

        public a(EditorActivity editorActivity) {
            super(editorActivity);
            this.f9503I1 = "script-ui-button";
            this.f9501G1 = 0;
            this.f9502H1 = 50;
        }

        @Override // p175w1.AbstractC2100m
        public int getDefX() {
            return this.f9501G1;
        }

        @Override // p175w1.AbstractC2100m
        public int getDefY() {
            return this.f9502H1;
        }

        @Override // p175w1.AbstractC2100m
        public String getPrefName() {
            return this.f9503I1;
        }
    }

    static {
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int[] iArr = f9490m2;
            if (i8 >= iArr.length) {
                break;
            }
            iArr[i8] = C1999q.m4828J2(3, f9493p2[i8]);
            i8++;
        }
        while (true) {
            int[] iArr2 = f9491n2;
            if (i7 >= iArr2.length) {
                return;
            }
            iArr2[i7] = C1999q.m4828J2(7, f9493p2[i7]);
            i7++;
        }
    }

    public C2083d0(ViewOnClickListenerC1728d viewOnClickListenerC1728d, String str) {
        this.f9497i2 = new C2085e0(viewOnClickListenerC1728d, this);
        this.f9500l2 = viewOnClickListenerC1728d.f7905k2;
        this.f9496h2 = str;
        f9494q2 = this;
        C1981b c1981b = new C1981b();
        f9492o2 = c1981b;
        c1981b.f8953t2 = C1983c.f8964f;
        C2038f c2038f = C2038f.f9299b;
        c1981b.f8952s2 = c2038f;
        c1981b.f8951r2 = c2038f;
        C2132a c2132a = new C2132a();
        C1998p c1998p = AbstractC2003u.f9116R1;
        c2132a.mo4692g0(c1998p, c1981b);
        new C2143l().mo4692g0(c1998p, c1981b);
        new C2133b().mo4692g0(c1998p, c1981b);
        new C2146o().mo4692g0(c1998p, c1981b);
        new C2145n().mo4692g0(c1998p, c1981b);
        new C2209j().mo4692g0(c1998p, c1981b);
        new C2210k().mo4692g0(c1998p, c1981b);
        new C2135d().mo4692g0(c1998p, c1981b);
        new C2134c().mo4692g0(c1998p, c1981b);
        new C2208i().mo4692g0(c1998p, c1981b);
        new C2212m().mo4692g0(c1998p, c1981b);
        c1981b.f8947n2 = this;
        f9492o2.f8945l2 = new C2116y();
        f9492o2.f8946m2 = new C2117z();
        C1981b c1981b2 = f9492o2;
        c1981b2.getClass();
        mo4692g0(c1998p, c1981b2);
    }

    /* renamed from: J2 */
    public static String m5139J2(String str) {
        char charAt;
        boolean z6 = false;
        if (str.length() > 0 && ((charAt = str.charAt(0)) == ':' || charAt == ';' || charAt == 'H' || charAt == 'Q' || charAt == 'h' || charAt == 'q')) {
            z6 = true;
        }
        return (z6 || C2115x.m5163a(str) != 0) ? str : str.replace(" ", "").replace(" ", "").replace(",", "").replace('.', '.');
    }

    /* renamed from: K2 */
    public static String m5140K2(String str) {
        return str.replace(" ", "").replace(" ", "").replace((CharSequence) null, "").replace('.', '.');
    }

    /* renamed from: M2 */
    public static void m5141M2(ArrayList<C2175b> arrayList, C1999q c1999q, String str, int i7) {
        c1999q.m4873T1(str, i7);
        if (arrayList != null) {
            arrayList.add(new C2175b("gg.".concat(str), i7));
        }
    }

    /* renamed from: N2 */
    public static void m5142N2(Object obj) {
        try {
            obj.wait();
        } catch (InterruptedException e7) {
            Thread.currentThread().interrupt();
            throw new C1991i(e7);
        }
    }

    /* renamed from: I2 */
    public final void m5143I2(boolean z6) {
        ShowApp showApp = this.f9500l2;
        if (!z6) {
            showApp.getClass();
            C2101m0.m5155a(0, new RunnableC2089g0(showApp));
            C2101m0.m5155a(0, new RunnableC2095j0(showApp));
        } else {
            showApp.getClass();
            C2101m0.m5155a(0, new RunnableC2087f0(showApp));
            C2101m0.m5155a(0, new RunnableC2091h0(showApp));
            C2101m0.m5155a(0, new RunnableC2093i0(showApp));
        }
    }

    /* renamed from: L2 */
    public final void m5144L2() {
        char[] cArr;
        Object obj = this.f9496h2;
        if (!(obj instanceof File)) {
            f9492o2.m4626a3(new ByteArrayInputStream(obj.toString().getBytes()), "启", "bt", f9492o2).mo4690d0();
            return;
        }
        File file = (File) obj;
        file.exists();
        C1989g m4628c3 = f9492o2.m4628c3(file.getAbsolutePath());
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(file.getAbsolutePath()));
        sb.append('.');
        long currentTimeMillis = System.currentTimeMillis() - 1546300800000L;
        char[] cArr2 = C2103n0.f9544a;
        char[] cArr3 = new char[12];
        boolean z6 = currentTimeMillis < 0;
        if (!z6) {
            currentTimeMillis = -currentTimeMillis;
        }
        int i7 = 11;
        while (true) {
            cArr = C2103n0.f9544a;
            if (currentTimeMillis > -64) {
                break;
            }
            i7--;
            cArr3[i7] = cArr[(int) (-(currentTimeMillis % 64))];
            currentTimeMillis /= 64;
        }
        cArr3[i7] = cArr[(int) (-currentTimeMillis)];
        if (z6) {
            i7--;
            cArr3[i7] = '-';
        }
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(C0090b.m220f(sb, new String(cArr3, i7, 12 - i7), ".lua")), 65536);
        try {
            C2034b.m4931a(m4628c3.f9008e2, bufferedOutputStream, false);
            File file2 = new File(String.valueOf(file.getAbsolutePath()) + ".tail");
            if (file2.exists()) {
                FileInputStream fileInputStream = new FileInputStream(file2);
                byte[] bArr = new byte[65536];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    } else {
                        bufferedOutputStream.write(bArr, 0, read);
                    }
                }
                fileInputStream.close();
            }
            bufferedOutputStream.close();
        } catch (Throwable unused) {
            bufferedOutputStream.close();
        }
    }

    @Override // p180w6.AbstractC2149r, p180w6.AbstractC2139h, p165u6.AbstractC2003u
    /* renamed from: g0 */
    public final AbstractC2003u mo4692g0(AbstractC2003u abstractC2003u, AbstractC2003u abstractC2003u2) {
        Tools.getContext();
        ArrayList arrayList = (this.f9495g2 & 4) != 0 ? new ArrayList() : null;
        C1999q c1999q = new C1999q(0, Tools.Semaphore.f159S7);
        C1999q c1999q2 = new C1999q(0, Tools.Semaphore.f159S7);
        m5141M2(arrayList, c1999q, "TYPE_AUTO", 127);
        m5141M2(arrayList, c1999q, "TYPE_BYTE", 1);
        m5141M2(arrayList, c1999q, "TYPE_WORD", 2);
        m5141M2(arrayList, c1999q, "TYPE_DWORD", 4);
        m5141M2(arrayList, c1999q, "TYPE_XOR", 8);
        m5141M2(arrayList, c1999q, "TYPE_FLOAT", 16);
        m5141M2(arrayList, c1999q, "TYPE_QWORD", 32);
        m5141M2(arrayList, c1999q, "TYPE_DOUBLE", 64);
        m5141M2(arrayList, c1999q, "SIGN_EQUAL", 536870912);
        m5141M2(arrayList, c1999q, "SIGN_NOT_EQUAL", 268435456);
        m5141M2(arrayList, c1999q, "SIGN_LESS_OR_EQUAL", 134217728);
        m5141M2(arrayList, c1999q, "SIGN_GREATER_OR_EQUAL", 67108864);
        m5141M2(arrayList, c1999q, "SIGN_FUZZY_EQUAL", 536870912);
        m5141M2(arrayList, c1999q, "SIGN_FUZZY_NOT_EQUAL", 268435456);
        m5141M2(arrayList, c1999q, "SIGN_FUZZY_LESS", 134217728);
        m5141M2(arrayList, c1999q, "SIGN_FUZZY_GREATER", 67108864);
        m5141M2(arrayList, c1999q, "REGION_JAVA_HEAP", 2);
        m5141M2(arrayList, c1999q, "REGION_C_HEAP", 1);
        m5141M2(arrayList, c1999q, "REGION_C_ALLOC", 4);
        m5141M2(arrayList, c1999q, "REGION_C_DATA", 8);
        m5141M2(arrayList, c1999q, "REGION_C_BSS", 16);
        m5141M2(arrayList, c1999q, "REGION_PPSSPP", 262144);
        m5141M2(arrayList, c1999q, "REGION_ANONYMOUS", 32);
        m5141M2(arrayList, c1999q, "REGION_JAVA", 65536);
        m5141M2(arrayList, c1999q, "REGION_STACK", 64);
        m5141M2(arrayList, c1999q, "REGION_ASHMEM", 524288);
        m5141M2(arrayList, c1999q, "REGION_VIDEO", 1048576);
        m5141M2(arrayList, c1999q, "REGION_OTHER", -2080896);
        m5141M2(arrayList, c1999q, "REGION_BAD", 131072);
        m5141M2(arrayList, c1999q, "REGION_CODE_APP", 16384);
        m5141M2(arrayList, c1999q, "REGION_CODE_SYS", 32768);
        m5141M2(arrayList, c1999q, "LOAD_VALUES_FREEZE", 3);
        m5141M2(arrayList, c1999q, "LOAD_VALUES", 2);
        m5141M2(arrayList, c1999q, "LOAD_APPEND", 8);
        m5141M2(arrayList, c1999q, "SAVE_AS_TEXT", 1);
        c1999q.m4873T1("FREEZE_NORMAL", 0);
        c1999q.m4873T1("FREEZE_MAY_INCREASE", 1);
        c1999q.m4873T1("FREEZE_MAY_DECREASE", 2);
        c1999q.m4873T1("FREEZE_IN_RANGE", 3);
        c1999q.m4873T1("PROT_NONE", 0);
        m5141M2(arrayList, c1999q, "PROT_READ", 2);
        m5141M2(arrayList, c1999q, "PROT_WRITE", 1);
        m5141M2(arrayList, c1999q, "PROT_EXEC", 4);
        m5141M2(arrayList, c1999q, "POINTER_NO", 4);
        m5141M2(arrayList, c1999q, "POINTER_READ_ONLY", 8);
        m5141M2(arrayList, c1999q, "POINTER_WRITABLE", 16);
        m5141M2(arrayList, c1999q, "POINTER_EXECUTABLE", 2);
        m5141M2(arrayList, c1999q, "POINTER_EXECUTABLE_WRITABLE", 1);
        m5141M2(arrayList, c1999q, "DUMP_SKIP_SYSTEM_LIBS", 1);
        m5141M2(arrayList, c1999q, "TAB_SETTINGS", 0);
        m5141M2(arrayList, c1999q, "TAB_SEARCH", 1);
        m5141M2(arrayList, c1999q, "TAB_SAVED_LIST", 2);
        m5141M2(arrayList, c1999q, "TAB_MEMORY_EDITOR", 3);
        m5141M2(arrayList, c1999q, "ASM_ARM", 4);
        m5141M2(arrayList, c1999q, "ASM_THUMB", 5);
        m5141M2(arrayList, c1999q, "ASM_ARM64", 6);
        c1999q.m4875U1("VERSION", "96.0");
        c1999q.m4873T1("BUILD", 15993);
        c1999q.mo4787V1(C1998p.m4815M2("alert"), new DialogInterfaceOnDismissListenerC2178e(Tools.getActivity(), this));
        c1999q.mo4787V1(C1998p.m4815M2("choice"), new DialogInterfaceOnDismissListenerC2179f(this));
        c1999q.mo4787V1(C1998p.m4815M2("toast"), new C2187n());
        c1999q.mo4787V1(C1998p.m4815M2("makeRequest"), new DialogInterfaceOnDismissListenerC2183j());
        c1999q.mo4787V1(C1998p.m4815M2("hideUiButton"), new C2181h(this));
        c1999q.mo4787V1(C1998p.m4815M2("showUiButton"), new C2174a(1, this));
        c1999q.mo4787V1(C1998p.m4815M2("isClickedUiButton"), new C2182i());
        c1999q2.mo4787V1(C1998p.m4815M2("ClassCompileAll"), new C2176c(f9492o2));
        c1999q2.mo4787V1(C1998p.m4815M2("ClassLoad"), new C2174a(0, f9492o2));
        c1999q.mo4787V1(C1998p.m4815M2("prompt"), new DialogInterfaceOnDismissListenerC2185l(this));
        c1999q.mo4787V1(C1998p.m4815M2("multiChoice"), new DialogInterfaceOnDismissListenerC2184k(this));
        c1999q.mo4787V1(C1998p.m4815M2("saveVariable"), new C2186m(this));
        c1999q.mo4787V1(C1998p.m4815M2("exit"), new C2180g());
        C1981b c1981b = f9492o2;
        c1981b.getClass();
        AbstractC2003u mo4777L0 = c1981b.mo4777L0(C1998p.m4815M2("io"));
        mo4777L0.getClass();
        mo4777L0.mo4790Y1(C1998p.m4815M2("open"), new C2188o("io.open", mo4777L0.mo4777L0(C1998p.m4815M2("open")), 2));
        mo4777L0.mo4790Y1(C1998p.m4815M2("input"), new C2188o("io.input", mo4777L0.mo4777L0(C1998p.m4815M2("input")), 1));
        mo4777L0.mo4790Y1(C1998p.m4815M2("output"), new C2188o("io.output", mo4777L0.mo4777L0(C1998p.m4815M2("output")), 1));
        mo4777L0.mo4790Y1(C1998p.m4815M2("tmpfile"), new C2188o("io.tmpfile", mo4777L0.mo4777L0(C1998p.m4815M2("tmpfile")), 0));
        mo4777L0.mo4790Y1(C1998p.m4815M2("lines"), new C2188o("io.lines", mo4777L0.mo4777L0(C1998p.m4815M2("lines")), 1));
        abstractC2003u2.getClass();
        AbstractC2003u mo4777L02 = abstractC2003u2.mo4777L0(C1998p.m4815M2("os"));
        C2180g c2180g = new C2180g();
        mo4777L02.getClass();
        mo4777L02.mo4790Y1(C1998p.m4815M2("exit"), c2180g);
        C1981b c1981b2 = f9492o2;
        C1996n.f9036d2 = null;
        AbstractC1997o.f9037c2 = null;
        C1988f.f9005f2 = null;
        AbstractC2003u mo4777L03 = c1981b2 == null ? null : c1981b2.mo4777L0(C1998p.m4815M2("string"));
        C1998p.f9038h2 = (mo4777L03 == null || mo4777L03.mo4804d1()) ? null : new C1999q(new AbstractC2003u[]{c1981b2, mo4777L03});
        AbstractC1992j.f9021d2 = null;
        C2000r.f9069g2 = null;
        C1981b c1981b3 = f9492o2;
        c1981b3.getClass();
        c1981b3.mo4787V1(C1998p.m4815M2("gg"), c1999q);
        C1981b c1981b4 = f9492o2;
        c1981b4.getClass();
        c1981b4.mo4787V1(C1998p.m4815M2("ap"), c1999q2);
        return c1999q;
    }

    @Override // p180w6.InterfaceC2144m
    /* renamed from: s */
    public final InputStream mo5145s(String str) {
        try {
            return new FileInputStream(new File(str));
        } catch (Exception e7) {
            e7.printStackTrace();
            return null;
        }
    }
}
