package p036e2;

import android.content.Context;
import org.json.JSONObject;

/* renamed from: e2.s */
/* loaded from: classes.dex */
public final class C1082s {

    /* renamed from: A */
    public JSONObject f5371A;

    /* renamed from: B */
    public JSONObject f5372B;

    /* renamed from: C */
    public String f5373C;

    /* renamed from: b */
    public String f5377b;

    /* renamed from: c */
    public String f5378c;

    /* renamed from: h */
    public String f5383h;

    /* renamed from: i */
    public String f5384i;

    /* renamed from: j */
    public int f5385j;

    /* renamed from: k */
    public int f5386k;

    /* renamed from: m */
    public String f5388m;

    /* renamed from: n */
    public String f5389n;

    /* renamed from: o */
    public String f5390o;

    /* renamed from: p */
    public String f5391p;

    /* renamed from: q */
    public String f5392q;

    /* renamed from: r */
    public String f5393r;

    /* renamed from: s */
    public String f5394s;

    /* renamed from: t */
    public String f5395t;

    /* renamed from: u */
    public String f5396u;

    /* renamed from: v */
    public String f5397v;

    /* renamed from: w */
    public String f5398w;

    /* renamed from: x */
    public String f5399x;

    /* renamed from: y */
    public String f5400y;

    /* renamed from: z */
    public String f5401z;

    /* renamed from: a */
    public boolean f5376a = false;

    /* renamed from: d */
    public String f5379d = "0";

    /* renamed from: e */
    public String f5380e = null;

    /* renamed from: f */
    public String f5381f = null;

    /* renamed from: g */
    public int f5382g = -1;

    /* renamed from: l */
    public String f5387l = null;

    /* renamed from: D */
    public String f5374D = "";

    /* renamed from: E */
    public String f5375E = "";

    /* JADX WARN: Can't wrap try/catch for region: R(63:8|(1:10)|11|(1:13)|14|(1:16)|17|(1:19)|20|(54:136|137|23|(3:131|132|133)|25|(1:27)(1:130)|28|29|30|(44:32|(1:34)|35|(4:119|120|122|123)|37|38|39|(1:41)|117|43|44|(1:46)(1:114)|47|48|49|(1:51)|52|54|55|56|57|58|59|60|61|62|63|(1:65)|67|68|69|(1:71)|72|73|74|(2:76|(3:78|(1:80)(1:83)|81))|84|85|(2:87|(3:89|(1:91)(1:94)|92))|95|96|97|98|99)|127|(0)|35|(0)|37|38|39|(0)|117|43|44|(0)(0)|47|48|49|(0)|52|54|55|56|57|58|59|60|61|62|63|(0)|67|68|69|(0)|72|73|74|(0)|84|85|(0)|95|96|97|98|99)|22|23|(0)|25|(0)(0)|28|29|30|(0)|127|(0)|35|(0)|37|38|39|(0)|117|43|44|(0)(0)|47|48|49|(0)|52|54|55|56|57|58|59|60|61|62|63|(0)|67|68|69|(0)|72|73|74|(0)|84|85|(0)|95|96|97|98|99) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x015d, code lost:
    
        if (r4 != null) goto L127;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0168 A[Catch: Exception -> 0x0172, all -> 0x02c7, TryCatch #6 {, blocks: (B:3:0x0001, B:8:0x0007, B:10:0x002c, B:11:0x0034, B:13:0x0046, B:14:0x004a, B:16:0x005c, B:17:0x0060, B:19:0x0072, B:20:0x0076, B:137:0x00a2, B:23:0x00a9, B:132:0x00c4, B:25:0x00ca, B:28:0x00f4, B:30:0x00f8, B:34:0x010a, B:35:0x010e, B:120:0x012e, B:39:0x0153, B:41:0x0159, B:44:0x0161, B:47:0x0170, B:114:0x0168, B:49:0x0172, B:51:0x0180, B:52:0x0186, B:55:0x018a, B:57:0x018f, B:67:0x01e6, B:69:0x01fa, B:71:0x0212, B:72:0x0218, B:74:0x021c, B:76:0x0227, B:78:0x0232, B:80:0x0247, B:81:0x024e, B:85:0x0250, B:87:0x025b, B:89:0x0266, B:91:0x027b, B:92:0x0282, B:96:0x0284, B:97:0x028e, B:59:0x01a8, B:61:0x01b1, B:63:0x01ca, B:65:0x01db, B:123:0x014b), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x012e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010a A[Catch: all -> 0x02c7, TRY_ENTER, TryCatch #6 {, blocks: (B:3:0x0001, B:8:0x0007, B:10:0x002c, B:11:0x0034, B:13:0x0046, B:14:0x004a, B:16:0x005c, B:17:0x0060, B:19:0x0072, B:20:0x0076, B:137:0x00a2, B:23:0x00a9, B:132:0x00c4, B:25:0x00ca, B:28:0x00f4, B:30:0x00f8, B:34:0x010a, B:35:0x010e, B:120:0x012e, B:39:0x0153, B:41:0x0159, B:44:0x0161, B:47:0x0170, B:114:0x0168, B:49:0x0172, B:51:0x0180, B:52:0x0186, B:55:0x018a, B:57:0x018f, B:67:0x01e6, B:69:0x01fa, B:71:0x0212, B:72:0x0218, B:74:0x021c, B:76:0x0227, B:78:0x0232, B:80:0x0247, B:81:0x024e, B:85:0x0250, B:87:0x025b, B:89:0x0266, B:91:0x027b, B:92:0x0282, B:96:0x0284, B:97:0x028e, B:59:0x01a8, B:61:0x01b1, B:63:0x01ca, B:65:0x01db, B:123:0x014b), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0159 A[Catch: Exception -> 0x0160, all -> 0x02c7, TRY_LEAVE, TryCatch #6 {, blocks: (B:3:0x0001, B:8:0x0007, B:10:0x002c, B:11:0x0034, B:13:0x0046, B:14:0x004a, B:16:0x005c, B:17:0x0060, B:19:0x0072, B:20:0x0076, B:137:0x00a2, B:23:0x00a9, B:132:0x00c4, B:25:0x00ca, B:28:0x00f4, B:30:0x00f8, B:34:0x010a, B:35:0x010e, B:120:0x012e, B:39:0x0153, B:41:0x0159, B:44:0x0161, B:47:0x0170, B:114:0x0168, B:49:0x0172, B:51:0x0180, B:52:0x0186, B:55:0x018a, B:57:0x018f, B:67:0x01e6, B:69:0x01fa, B:71:0x0212, B:72:0x0218, B:74:0x021c, B:76:0x0227, B:78:0x0232, B:80:0x0247, B:81:0x024e, B:85:0x0250, B:87:0x025b, B:89:0x0266, B:91:0x027b, B:92:0x0282, B:96:0x0284, B:97:0x028e, B:59:0x01a8, B:61:0x01b1, B:63:0x01ca, B:65:0x01db, B:123:0x014b), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0180 A[Catch: Exception -> 0x018a, all -> 0x02c7, TryCatch #4 {Exception -> 0x018a, blocks: (B:49:0x0172, B:51:0x0180, B:52:0x0186), top: B:48:0x0172 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01db A[Catch: Exception -> 0x01e6, all -> 0x02c7, TRY_LEAVE, TryCatch #6 {, blocks: (B:3:0x0001, B:8:0x0007, B:10:0x002c, B:11:0x0034, B:13:0x0046, B:14:0x004a, B:16:0x005c, B:17:0x0060, B:19:0x0072, B:20:0x0076, B:137:0x00a2, B:23:0x00a9, B:132:0x00c4, B:25:0x00ca, B:28:0x00f4, B:30:0x00f8, B:34:0x010a, B:35:0x010e, B:120:0x012e, B:39:0x0153, B:41:0x0159, B:44:0x0161, B:47:0x0170, B:114:0x0168, B:49:0x0172, B:51:0x0180, B:52:0x0186, B:55:0x018a, B:57:0x018f, B:67:0x01e6, B:69:0x01fa, B:71:0x0212, B:72:0x0218, B:74:0x021c, B:76:0x0227, B:78:0x0232, B:80:0x0247, B:81:0x024e, B:85:0x0250, B:87:0x025b, B:89:0x0266, B:91:0x027b, B:92:0x0282, B:96:0x0284, B:97:0x028e, B:59:0x01a8, B:61:0x01b1, B:63:0x01ca, B:65:0x01db, B:123:0x014b), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0212 A[Catch: Exception -> 0x021c, all -> 0x02c7, TryCatch #6 {, blocks: (B:3:0x0001, B:8:0x0007, B:10:0x002c, B:11:0x0034, B:13:0x0046, B:14:0x004a, B:16:0x005c, B:17:0x0060, B:19:0x0072, B:20:0x0076, B:137:0x00a2, B:23:0x00a9, B:132:0x00c4, B:25:0x00ca, B:28:0x00f4, B:30:0x00f8, B:34:0x010a, B:35:0x010e, B:120:0x012e, B:39:0x0153, B:41:0x0159, B:44:0x0161, B:47:0x0170, B:114:0x0168, B:49:0x0172, B:51:0x0180, B:52:0x0186, B:55:0x018a, B:57:0x018f, B:67:0x01e6, B:69:0x01fa, B:71:0x0212, B:72:0x0218, B:74:0x021c, B:76:0x0227, B:78:0x0232, B:80:0x0247, B:81:0x024e, B:85:0x0250, B:87:0x025b, B:89:0x0266, B:91:0x027b, B:92:0x0282, B:96:0x0284, B:97:0x028e, B:59:0x01a8, B:61:0x01b1, B:63:0x01ca, B:65:0x01db, B:123:0x014b), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0227 A[Catch: Exception -> 0x0250, all -> 0x02c7, TryCatch #0 {Exception -> 0x0250, blocks: (B:74:0x021c, B:76:0x0227, B:78:0x0232, B:80:0x0247, B:81:0x024e), top: B:73:0x021c }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x025b A[Catch: Exception -> 0x0284, all -> 0x02c7, TryCatch #6 {, blocks: (B:3:0x0001, B:8:0x0007, B:10:0x002c, B:11:0x0034, B:13:0x0046, B:14:0x004a, B:16:0x005c, B:17:0x0060, B:19:0x0072, B:20:0x0076, B:137:0x00a2, B:23:0x00a9, B:132:0x00c4, B:25:0x00ca, B:28:0x00f4, B:30:0x00f8, B:34:0x010a, B:35:0x010e, B:120:0x012e, B:39:0x0153, B:41:0x0159, B:44:0x0161, B:47:0x0170, B:114:0x0168, B:49:0x0172, B:51:0x0180, B:52:0x0186, B:55:0x018a, B:57:0x018f, B:67:0x01e6, B:69:0x01fa, B:71:0x0212, B:72:0x0218, B:74:0x021c, B:76:0x0227, B:78:0x0232, B:80:0x0247, B:81:0x024e, B:85:0x0250, B:87:0x025b, B:89:0x0266, B:91:0x027b, B:92:0x0282, B:96:0x0284, B:97:0x028e, B:59:0x01a8, B:61:0x01b1, B:63:0x01ca, B:65:0x01db, B:123:0x014b), top: B:2:0x0001 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void m3173a(android.content.Context r7) {
        /*
            Method dump skipped, instructions count: 714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p036e2.C1082s.m3173a(android.content.Context):void");
    }

    /* renamed from: b */
    public final synchronized void m3174b(Context context, JSONObject jSONObject) {
        m3173a(context);
        if (jSONObject.length() > 10) {
            return;
        }
        m3175c(context, jSONObject);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01fe A[Catch: all -> 0x02a1, Exception -> 0x02a4, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x0016, B:9:0x0021, B:12:0x002c, B:15:0x0037, B:18:0x005e, B:21:0x0070, B:24:0x007b, B:27:0x0086, B:30:0x0091, B:33:0x00b0, B:36:0x00bb, B:39:0x00c6, B:42:0x00d1, B:45:0x00dc, B:48:0x00e7, B:51:0x00f2, B:54:0x00fd, B:56:0x0111, B:57:0x0117, B:107:0x011d, B:59:0x0125, B:62:0x0130, B:65:0x013b, B:68:0x0146, B:70:0x0164, B:73:0x016b, B:74:0x0173, B:76:0x01fe, B:78:0x0206, B:79:0x0213, B:80:0x020e, B:81:0x0230, B:83:0x024d, B:87:0x0259, B:90:0x0264, B:92:0x026b, B:94:0x0271, B:95:0x027e, B:97:0x0282, B:98:0x0289, B:103:0x0279), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x024d A[Catch: all -> 0x02a1, Exception -> 0x02a4, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x0016, B:9:0x0021, B:12:0x002c, B:15:0x0037, B:18:0x005e, B:21:0x0070, B:24:0x007b, B:27:0x0086, B:30:0x0091, B:33:0x00b0, B:36:0x00bb, B:39:0x00c6, B:42:0x00d1, B:45:0x00dc, B:48:0x00e7, B:51:0x00f2, B:54:0x00fd, B:56:0x0111, B:57:0x0117, B:107:0x011d, B:59:0x0125, B:62:0x0130, B:65:0x013b, B:68:0x0146, B:70:0x0164, B:73:0x016b, B:74:0x0173, B:76:0x01fe, B:78:0x0206, B:79:0x0213, B:80:0x020e, B:81:0x0230, B:83:0x024d, B:87:0x0259, B:90:0x0264, B:92:0x026b, B:94:0x0271, B:95:0x027e, B:97:0x0282, B:98:0x0289, B:103:0x0279), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0282 A[Catch: all -> 0x02a1, Exception -> 0x02a4, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x0016, B:9:0x0021, B:12:0x002c, B:15:0x0037, B:18:0x005e, B:21:0x0070, B:24:0x007b, B:27:0x0086, B:30:0x0091, B:33:0x00b0, B:36:0x00bb, B:39:0x00c6, B:42:0x00d1, B:45:0x00dc, B:48:0x00e7, B:51:0x00f2, B:54:0x00fd, B:56:0x0111, B:57:0x0117, B:107:0x011d, B:59:0x0125, B:62:0x0130, B:65:0x013b, B:68:0x0146, B:70:0x0164, B:73:0x016b, B:74:0x0173, B:76:0x01fe, B:78:0x0206, B:79:0x0213, B:80:0x020e, B:81:0x0230, B:83:0x024d, B:87:0x0259, B:90:0x0264, B:92:0x026b, B:94:0x0271, B:95:0x027e, B:97:0x0282, B:98:0x0289, B:103:0x0279), top: B:2:0x0001 }] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void m3175c(android.content.Context r7, org.json.JSONObject r8) {
        /*
            Method dump skipped, instructions count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p036e2.C1082s.m3175c(android.content.Context, org.json.JSONObject):void");
    }
}
