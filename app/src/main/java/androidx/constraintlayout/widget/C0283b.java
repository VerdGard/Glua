package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.ext.C0089a;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C0284c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.C0391d0;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import p120p.C1686g;
import p143s.C1861a;

/* renamed from: androidx.constraintlayout.widget.b */
/* loaded from: classes.dex */
public final class C0283b {

    /* renamed from: d */
    public static final int[] f1279d = {0, 4, 8};

    /* renamed from: e */
    public static final SparseIntArray f1280e;

    /* renamed from: a */
    public final HashMap<String, C1861a> f1281a = new HashMap<>();

    /* renamed from: b */
    public final boolean f1282b = true;

    /* renamed from: c */
    public final HashMap<Integer, a> f1283c = new HashMap<>();

    /* renamed from: androidx.constraintlayout.widget.b$a */
    public static class a {

        /* renamed from: a */
        public int f1284a;

        /* renamed from: b */
        public final d f1285b = new d();

        /* renamed from: c */
        public final c f1286c = new c();

        /* renamed from: d */
        public final b f1287d = new b();

        /* renamed from: e */
        public final e f1288e = new e();

        /* renamed from: f */
        public HashMap<String, C1861a> f1289f = new HashMap<>();

        /* renamed from: a */
        public final void m953a(ConstraintLayout.C0280a c0280a) {
            b bVar = this.f1287d;
            c0280a.f1221d = bVar.f1329g;
            c0280a.f1223e = bVar.f1331h;
            c0280a.f1225f = bVar.f1333i;
            c0280a.f1227g = bVar.f1335j;
            c0280a.f1229h = bVar.f1336k;
            c0280a.f1231i = bVar.f1337l;
            c0280a.f1233j = bVar.f1338m;
            c0280a.f1235k = bVar.f1339n;
            c0280a.f1237l = bVar.f1340o;
            c0280a.f1242p = bVar.f1341p;
            c0280a.f1243q = bVar.f1342q;
            c0280a.f1244r = bVar.f1343r;
            c0280a.f1245s = bVar.f1344s;
            ((ViewGroup.MarginLayoutParams) c0280a).leftMargin = bVar.f1293C;
            ((ViewGroup.MarginLayoutParams) c0280a).rightMargin = bVar.f1294D;
            ((ViewGroup.MarginLayoutParams) c0280a).topMargin = bVar.f1295E;
            ((ViewGroup.MarginLayoutParams) c0280a).bottomMargin = bVar.f1296F;
            c0280a.f1250x = bVar.f1304N;
            c0280a.f1251y = bVar.f1303M;
            c0280a.f1247u = bVar.f1300J;
            c0280a.f1249w = bVar.f1302L;
            c0280a.f1252z = bVar.f1345t;
            c0280a.f1189A = bVar.f1346u;
            c0280a.f1239m = bVar.f1348w;
            c0280a.f1240n = bVar.f1349x;
            c0280a.f1241o = bVar.f1350y;
            c0280a.f1190B = bVar.f1347v;
            c0280a.f1204P = bVar.f1351z;
            c0280a.f1205Q = bVar.f1291A;
            c0280a.f1193E = bVar.f1305O;
            c0280a.f1192D = bVar.f1306P;
            c0280a.f1195G = bVar.f1308R;
            c0280a.f1194F = bVar.f1307Q;
            c0280a.f1207S = bVar.f1330g0;
            c0280a.f1208T = bVar.f1332h0;
            c0280a.f1196H = bVar.f1309S;
            c0280a.f1197I = bVar.f1310T;
            c0280a.f1200L = bVar.f1311U;
            c0280a.f1201M = bVar.f1312V;
            c0280a.f1198J = bVar.f1313W;
            c0280a.f1199K = bVar.f1314X;
            c0280a.f1202N = bVar.f1315Y;
            c0280a.f1203O = bVar.f1316Z;
            c0280a.f1206R = bVar.f1292B;
            c0280a.f1219c = bVar.f1327f;
            c0280a.f1215a = bVar.f1323d;
            c0280a.f1217b = bVar.f1325e;
            ((ViewGroup.MarginLayoutParams) c0280a).width = bVar.f1319b;
            ((ViewGroup.MarginLayoutParams) c0280a).height = bVar.f1321c;
            String str = bVar.f1328f0;
            if (str != null) {
                c0280a.f1209U = str;
            }
            c0280a.setMarginStart(bVar.f1298H);
            c0280a.setMarginEnd(bVar.f1297G);
            c0280a.m940a();
        }

        /* renamed from: b */
        public final void m954b(int i7, ConstraintLayout.C0280a c0280a) {
            this.f1284a = i7;
            int i8 = c0280a.f1221d;
            b bVar = this.f1287d;
            bVar.f1329g = i8;
            bVar.f1331h = c0280a.f1223e;
            bVar.f1333i = c0280a.f1225f;
            bVar.f1335j = c0280a.f1227g;
            bVar.f1336k = c0280a.f1229h;
            bVar.f1337l = c0280a.f1231i;
            bVar.f1338m = c0280a.f1233j;
            bVar.f1339n = c0280a.f1235k;
            bVar.f1340o = c0280a.f1237l;
            bVar.f1341p = c0280a.f1242p;
            bVar.f1342q = c0280a.f1243q;
            bVar.f1343r = c0280a.f1244r;
            bVar.f1344s = c0280a.f1245s;
            bVar.f1345t = c0280a.f1252z;
            bVar.f1346u = c0280a.f1189A;
            bVar.f1347v = c0280a.f1190B;
            bVar.f1348w = c0280a.f1239m;
            bVar.f1349x = c0280a.f1240n;
            bVar.f1350y = c0280a.f1241o;
            bVar.f1351z = c0280a.f1204P;
            bVar.f1291A = c0280a.f1205Q;
            bVar.f1292B = c0280a.f1206R;
            bVar.f1327f = c0280a.f1219c;
            bVar.f1323d = c0280a.f1215a;
            bVar.f1325e = c0280a.f1217b;
            bVar.f1319b = ((ViewGroup.MarginLayoutParams) c0280a).width;
            bVar.f1321c = ((ViewGroup.MarginLayoutParams) c0280a).height;
            bVar.f1293C = ((ViewGroup.MarginLayoutParams) c0280a).leftMargin;
            bVar.f1294D = ((ViewGroup.MarginLayoutParams) c0280a).rightMargin;
            bVar.f1295E = ((ViewGroup.MarginLayoutParams) c0280a).topMargin;
            bVar.f1296F = ((ViewGroup.MarginLayoutParams) c0280a).bottomMargin;
            bVar.f1305O = c0280a.f1193E;
            bVar.f1306P = c0280a.f1192D;
            bVar.f1308R = c0280a.f1195G;
            bVar.f1307Q = c0280a.f1194F;
            bVar.f1330g0 = c0280a.f1207S;
            bVar.f1332h0 = c0280a.f1208T;
            bVar.f1309S = c0280a.f1196H;
            bVar.f1310T = c0280a.f1197I;
            bVar.f1311U = c0280a.f1200L;
            bVar.f1312V = c0280a.f1201M;
            bVar.f1313W = c0280a.f1198J;
            bVar.f1314X = c0280a.f1199K;
            bVar.f1315Y = c0280a.f1202N;
            bVar.f1316Z = c0280a.f1203O;
            bVar.f1328f0 = c0280a.f1209U;
            bVar.f1300J = c0280a.f1247u;
            bVar.f1302L = c0280a.f1249w;
            bVar.f1299I = c0280a.f1246t;
            bVar.f1301K = c0280a.f1248v;
            bVar.f1304N = c0280a.f1250x;
            bVar.f1303M = c0280a.f1251y;
            bVar.f1297G = c0280a.getMarginEnd();
            bVar.f1298H = c0280a.getMarginStart();
        }

        /* renamed from: c */
        public final void m955c(int i7, C0284c.a aVar) {
            m954b(i7, aVar);
            this.f1285b.f1359c = aVar.f1375m0;
            float f7 = aVar.f1378p0;
            e eVar = this.f1288e;
            eVar.f1362a = f7;
            eVar.f1363b = aVar.f1379q0;
            eVar.f1364c = aVar.f1380r0;
            eVar.f1365d = aVar.f1381s0;
            eVar.f1366e = aVar.f1382t0;
            eVar.f1367f = aVar.f1383u0;
            eVar.f1368g = aVar.f1384v0;
            eVar.f1369h = aVar.f1385w0;
            eVar.f1370i = aVar.f1386x0;
            eVar.f1371j = aVar.f1387y0;
            eVar.f1373l = aVar.f1377o0;
            eVar.f1372k = aVar.f1376n0;
        }

        public final Object clone() {
            a aVar = new a();
            b bVar = aVar.f1287d;
            bVar.getClass();
            b bVar2 = this.f1287d;
            bVar.f1317a = bVar2.f1317a;
            bVar.f1319b = bVar2.f1319b;
            bVar.f1321c = bVar2.f1321c;
            bVar.f1323d = bVar2.f1323d;
            bVar.f1325e = bVar2.f1325e;
            bVar.f1327f = bVar2.f1327f;
            bVar.f1329g = bVar2.f1329g;
            bVar.f1331h = bVar2.f1331h;
            bVar.f1333i = bVar2.f1333i;
            bVar.f1335j = bVar2.f1335j;
            bVar.f1336k = bVar2.f1336k;
            bVar.f1337l = bVar2.f1337l;
            bVar.f1338m = bVar2.f1338m;
            bVar.f1339n = bVar2.f1339n;
            bVar.f1340o = bVar2.f1340o;
            bVar.f1341p = bVar2.f1341p;
            bVar.f1342q = bVar2.f1342q;
            bVar.f1343r = bVar2.f1343r;
            bVar.f1344s = bVar2.f1344s;
            bVar.f1345t = bVar2.f1345t;
            bVar.f1346u = bVar2.f1346u;
            bVar.f1347v = bVar2.f1347v;
            bVar.f1348w = bVar2.f1348w;
            bVar.f1349x = bVar2.f1349x;
            bVar.f1350y = bVar2.f1350y;
            bVar.f1351z = bVar2.f1351z;
            bVar.f1291A = bVar2.f1291A;
            bVar.f1292B = bVar2.f1292B;
            bVar.f1293C = bVar2.f1293C;
            bVar.f1294D = bVar2.f1294D;
            bVar.f1295E = bVar2.f1295E;
            bVar.f1296F = bVar2.f1296F;
            bVar.f1297G = bVar2.f1297G;
            bVar.f1298H = bVar2.f1298H;
            bVar.f1299I = bVar2.f1299I;
            bVar.f1300J = bVar2.f1300J;
            bVar.f1301K = bVar2.f1301K;
            bVar.f1302L = bVar2.f1302L;
            bVar.f1303M = bVar2.f1303M;
            bVar.f1304N = bVar2.f1304N;
            bVar.f1305O = bVar2.f1305O;
            bVar.f1306P = bVar2.f1306P;
            bVar.f1307Q = bVar2.f1307Q;
            bVar.f1308R = bVar2.f1308R;
            bVar.f1309S = bVar2.f1309S;
            bVar.f1310T = bVar2.f1310T;
            bVar.f1311U = bVar2.f1311U;
            bVar.f1312V = bVar2.f1312V;
            bVar.f1313W = bVar2.f1313W;
            bVar.f1314X = bVar2.f1314X;
            bVar.f1315Y = bVar2.f1315Y;
            bVar.f1316Z = bVar2.f1316Z;
            bVar.f1318a0 = bVar2.f1318a0;
            bVar.f1320b0 = bVar2.f1320b0;
            bVar.f1322c0 = bVar2.f1322c0;
            bVar.f1328f0 = bVar2.f1328f0;
            int[] iArr = bVar2.f1324d0;
            if (iArr != null) {
                bVar.f1324d0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                bVar.f1324d0 = null;
            }
            bVar.f1326e0 = bVar2.f1326e0;
            bVar.f1330g0 = bVar2.f1330g0;
            bVar.f1332h0 = bVar2.f1332h0;
            bVar.f1334i0 = bVar2.f1334i0;
            c cVar = aVar.f1286c;
            cVar.getClass();
            c cVar2 = this.f1286c;
            cVar2.getClass();
            cVar.f1353a = cVar2.f1353a;
            cVar.f1354b = cVar2.f1354b;
            cVar.f1356d = cVar2.f1356d;
            cVar.f1355c = cVar2.f1355c;
            d dVar = aVar.f1285b;
            dVar.getClass();
            d dVar2 = this.f1285b;
            dVar2.getClass();
            dVar.f1357a = dVar2.f1357a;
            dVar.f1359c = dVar2.f1359c;
            dVar.f1360d = dVar2.f1360d;
            dVar.f1358b = dVar2.f1358b;
            e eVar = aVar.f1288e;
            eVar.getClass();
            e eVar2 = this.f1288e;
            eVar2.getClass();
            eVar.f1362a = eVar2.f1362a;
            eVar.f1363b = eVar2.f1363b;
            eVar.f1364c = eVar2.f1364c;
            eVar.f1365d = eVar2.f1365d;
            eVar.f1366e = eVar2.f1366e;
            eVar.f1367f = eVar2.f1367f;
            eVar.f1368g = eVar2.f1368g;
            eVar.f1369h = eVar2.f1369h;
            eVar.f1370i = eVar2.f1370i;
            eVar.f1371j = eVar2.f1371j;
            eVar.f1372k = eVar2.f1372k;
            eVar.f1373l = eVar2.f1373l;
            aVar.f1284a = this.f1284a;
            return aVar;
        }
    }

    /* renamed from: androidx.constraintlayout.widget.b$b */
    public static class b {

        /* renamed from: j0 */
        public static final SparseIntArray f1290j0;

        /* renamed from: b */
        public int f1319b;

        /* renamed from: c */
        public int f1321c;

        /* renamed from: d0 */
        public int[] f1324d0;

        /* renamed from: e0 */
        public String f1326e0;

        /* renamed from: f0 */
        public String f1328f0;

        /* renamed from: a */
        public boolean f1317a = false;

        /* renamed from: d */
        public int f1323d = -1;

        /* renamed from: e */
        public int f1325e = -1;

        /* renamed from: f */
        public float f1327f = -1.0f;

        /* renamed from: g */
        public int f1329g = -1;

        /* renamed from: h */
        public int f1331h = -1;

        /* renamed from: i */
        public int f1333i = -1;

        /* renamed from: j */
        public int f1335j = -1;

        /* renamed from: k */
        public int f1336k = -1;

        /* renamed from: l */
        public int f1337l = -1;

        /* renamed from: m */
        public int f1338m = -1;

        /* renamed from: n */
        public int f1339n = -1;

        /* renamed from: o */
        public int f1340o = -1;

        /* renamed from: p */
        public int f1341p = -1;

        /* renamed from: q */
        public int f1342q = -1;

        /* renamed from: r */
        public int f1343r = -1;

        /* renamed from: s */
        public int f1344s = -1;

        /* renamed from: t */
        public float f1345t = 0.5f;

        /* renamed from: u */
        public float f1346u = 0.5f;

        /* renamed from: v */
        public String f1347v = null;

        /* renamed from: w */
        public int f1348w = -1;

        /* renamed from: x */
        public int f1349x = 0;

        /* renamed from: y */
        public float f1350y = 0.0f;

        /* renamed from: z */
        public int f1351z = -1;

        /* renamed from: A */
        public int f1291A = -1;

        /* renamed from: B */
        public int f1292B = -1;

        /* renamed from: C */
        public int f1293C = -1;

        /* renamed from: D */
        public int f1294D = -1;

        /* renamed from: E */
        public int f1295E = -1;

        /* renamed from: F */
        public int f1296F = -1;

        /* renamed from: G */
        public int f1297G = -1;

        /* renamed from: H */
        public int f1298H = -1;

        /* renamed from: I */
        public int f1299I = -1;

        /* renamed from: J */
        public int f1300J = -1;

        /* renamed from: K */
        public int f1301K = -1;

        /* renamed from: L */
        public int f1302L = -1;

        /* renamed from: M */
        public int f1303M = -1;

        /* renamed from: N */
        public int f1304N = -1;

        /* renamed from: O */
        public float f1305O = -1.0f;

        /* renamed from: P */
        public float f1306P = -1.0f;

        /* renamed from: Q */
        public int f1307Q = 0;

        /* renamed from: R */
        public int f1308R = 0;

        /* renamed from: S */
        public int f1309S = 0;

        /* renamed from: T */
        public int f1310T = 0;

        /* renamed from: U */
        public int f1311U = -1;

        /* renamed from: V */
        public int f1312V = -1;

        /* renamed from: W */
        public int f1313W = -1;

        /* renamed from: X */
        public int f1314X = -1;

        /* renamed from: Y */
        public float f1315Y = 1.0f;

        /* renamed from: Z */
        public float f1316Z = 1.0f;

        /* renamed from: a0 */
        public int f1318a0 = -1;

        /* renamed from: b0 */
        public int f1320b0 = 0;

        /* renamed from: c0 */
        public int f1322c0 = -1;

        /* renamed from: g0 */
        public boolean f1330g0 = false;

        /* renamed from: h0 */
        public boolean f1332h0 = false;

        /* renamed from: i0 */
        public boolean f1334i0 = true;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1290j0 = sparseIntArray;
            sparseIntArray.append(R$styleable.Layout_layout_constraintLeft_toLeftOf, 24);
            sparseIntArray.append(R$styleable.Layout_layout_constraintLeft_toRightOf, 25);
            sparseIntArray.append(R$styleable.Layout_layout_constraintRight_toLeftOf, 28);
            sparseIntArray.append(R$styleable.Layout_layout_constraintRight_toRightOf, 29);
            sparseIntArray.append(R$styleable.Layout_layout_constraintTop_toTopOf, 35);
            sparseIntArray.append(R$styleable.Layout_layout_constraintTop_toBottomOf, 34);
            sparseIntArray.append(R$styleable.Layout_layout_constraintBottom_toTopOf, 4);
            sparseIntArray.append(R$styleable.Layout_layout_constraintBottom_toBottomOf, 3);
            sparseIntArray.append(R$styleable.Layout_layout_constraintBaseline_toBaselineOf, 1);
            sparseIntArray.append(R$styleable.Layout_layout_editor_absoluteX, 6);
            sparseIntArray.append(R$styleable.Layout_layout_editor_absoluteY, 7);
            sparseIntArray.append(R$styleable.Layout_layout_constraintGuide_begin, 17);
            sparseIntArray.append(R$styleable.Layout_layout_constraintGuide_end, 18);
            sparseIntArray.append(R$styleable.Layout_layout_constraintGuide_percent, 19);
            sparseIntArray.append(R$styleable.Layout_android_orientation, 26);
            sparseIntArray.append(R$styleable.Layout_layout_constraintStart_toEndOf, 31);
            sparseIntArray.append(R$styleable.Layout_layout_constraintStart_toStartOf, 32);
            sparseIntArray.append(R$styleable.Layout_layout_constraintEnd_toStartOf, 10);
            sparseIntArray.append(R$styleable.Layout_layout_constraintEnd_toEndOf, 9);
            sparseIntArray.append(R$styleable.Layout_layout_goneMarginLeft, 13);
            sparseIntArray.append(R$styleable.Layout_layout_goneMarginTop, 16);
            sparseIntArray.append(R$styleable.Layout_layout_goneMarginRight, 14);
            sparseIntArray.append(R$styleable.Layout_layout_goneMarginBottom, 11);
            sparseIntArray.append(R$styleable.Layout_layout_goneMarginStart, 15);
            sparseIntArray.append(R$styleable.Layout_layout_goneMarginEnd, 12);
            sparseIntArray.append(R$styleable.Layout_layout_constraintVertical_weight, 38);
            sparseIntArray.append(R$styleable.Layout_layout_constraintHorizontal_weight, 37);
            sparseIntArray.append(R$styleable.Layout_layout_constraintHorizontal_chainStyle, 39);
            sparseIntArray.append(R$styleable.Layout_layout_constraintVertical_chainStyle, 40);
            sparseIntArray.append(R$styleable.Layout_layout_constraintHorizontal_bias, 20);
            sparseIntArray.append(R$styleable.Layout_layout_constraintVertical_bias, 36);
            sparseIntArray.append(R$styleable.Layout_layout_constraintDimensionRatio, 5);
            sparseIntArray.append(R$styleable.Layout_layout_constraintLeft_creator, 76);
            sparseIntArray.append(R$styleable.Layout_layout_constraintTop_creator, 76);
            sparseIntArray.append(R$styleable.Layout_layout_constraintRight_creator, 76);
            sparseIntArray.append(R$styleable.Layout_layout_constraintBottom_creator, 76);
            sparseIntArray.append(R$styleable.Layout_layout_constraintBaseline_creator, 76);
            sparseIntArray.append(R$styleable.Layout_android_layout_marginLeft, 23);
            sparseIntArray.append(R$styleable.Layout_android_layout_marginRight, 27);
            sparseIntArray.append(R$styleable.Layout_android_layout_marginStart, 30);
            sparseIntArray.append(R$styleable.Layout_android_layout_marginEnd, 8);
            sparseIntArray.append(R$styleable.Layout_android_layout_marginTop, 33);
            sparseIntArray.append(R$styleable.Layout_android_layout_marginBottom, 2);
            sparseIntArray.append(R$styleable.Layout_android_layout_width, 22);
            sparseIntArray.append(R$styleable.Layout_android_layout_height, 21);
            sparseIntArray.append(R$styleable.Layout_layout_constraintCircle, 61);
            sparseIntArray.append(R$styleable.Layout_layout_constraintCircleRadius, 62);
            sparseIntArray.append(R$styleable.Layout_layout_constraintCircleAngle, 63);
            sparseIntArray.append(R$styleable.Layout_layout_constraintWidth_percent, 69);
            sparseIntArray.append(R$styleable.Layout_layout_constraintHeight_percent, 70);
            sparseIntArray.append(R$styleable.Layout_chainUseRtl, 71);
            sparseIntArray.append(R$styleable.Layout_barrierDirection, 72);
            sparseIntArray.append(R$styleable.Layout_barrierMargin, 73);
            sparseIntArray.append(R$styleable.Layout_constraint_referenced_ids, 74);
            sparseIntArray.append(R$styleable.Layout_barrierAllowsGoneWidgets, 75);
        }

        /* renamed from: a */
        public final void m956a(Context context, AttributeSet attributeSet) {
            StringBuilder sb;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f1267e);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                SparseIntArray sparseIntArray = f1290j0;
                int i8 = sparseIntArray.get(index);
                if (i8 == 80) {
                    this.f1330g0 = obtainStyledAttributes.getBoolean(index, this.f1330g0);
                } else if (i8 != 81) {
                    switch (i8) {
                        case 1:
                            this.f1340o = C0283b.m949f(obtainStyledAttributes, index, this.f1340o);
                            break;
                        case 2:
                            this.f1296F = obtainStyledAttributes.getDimensionPixelSize(index, this.f1296F);
                            break;
                        case 3:
                            this.f1339n = C0283b.m949f(obtainStyledAttributes, index, this.f1339n);
                            break;
                        case 4:
                            this.f1338m = C0283b.m949f(obtainStyledAttributes, index, this.f1338m);
                            break;
                        case 5:
                            this.f1347v = obtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            this.f1351z = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1351z);
                            break;
                        case 7:
                            this.f1291A = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1291A);
                            break;
                        case 8:
                            this.f1297G = obtainStyledAttributes.getDimensionPixelSize(index, this.f1297G);
                            break;
                        case 9:
                            this.f1344s = C0283b.m949f(obtainStyledAttributes, index, this.f1344s);
                            break;
                        case 10:
                            this.f1343r = C0283b.m949f(obtainStyledAttributes, index, this.f1343r);
                            break;
                        case 11:
                            this.f1302L = obtainStyledAttributes.getDimensionPixelSize(index, this.f1302L);
                            break;
                        case 12:
                            this.f1303M = obtainStyledAttributes.getDimensionPixelSize(index, this.f1303M);
                            break;
                        case 13:
                            this.f1299I = obtainStyledAttributes.getDimensionPixelSize(index, this.f1299I);
                            break;
                        case 14:
                            this.f1301K = obtainStyledAttributes.getDimensionPixelSize(index, this.f1301K);
                            break;
                        case 15:
                            this.f1304N = obtainStyledAttributes.getDimensionPixelSize(index, this.f1304N);
                            break;
                        case 16:
                            this.f1300J = obtainStyledAttributes.getDimensionPixelSize(index, this.f1300J);
                            break;
                        case 17:
                            this.f1323d = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1323d);
                            break;
                        case 18:
                            this.f1325e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1325e);
                            break;
                        case 19:
                            this.f1327f = obtainStyledAttributes.getFloat(index, this.f1327f);
                            break;
                        case 20:
                            this.f1345t = obtainStyledAttributes.getFloat(index, this.f1345t);
                            break;
                        case 21:
                            this.f1321c = obtainStyledAttributes.getLayoutDimension(index, this.f1321c);
                            break;
                        case 22:
                            this.f1319b = obtainStyledAttributes.getLayoutDimension(index, this.f1319b);
                            break;
                        case 23:
                            this.f1293C = obtainStyledAttributes.getDimensionPixelSize(index, this.f1293C);
                            break;
                        case 24:
                            this.f1329g = C0283b.m949f(obtainStyledAttributes, index, this.f1329g);
                            break;
                        case 25:
                            this.f1331h = C0283b.m949f(obtainStyledAttributes, index, this.f1331h);
                            break;
                        case 26:
                            this.f1292B = obtainStyledAttributes.getInt(index, this.f1292B);
                            break;
                        case 27:
                            this.f1294D = obtainStyledAttributes.getDimensionPixelSize(index, this.f1294D);
                            break;
                        case 28:
                            this.f1333i = C0283b.m949f(obtainStyledAttributes, index, this.f1333i);
                            break;
                        case 29:
                            this.f1335j = C0283b.m949f(obtainStyledAttributes, index, this.f1335j);
                            break;
                        case 30:
                            this.f1298H = obtainStyledAttributes.getDimensionPixelSize(index, this.f1298H);
                            break;
                        case 31:
                            this.f1341p = C0283b.m949f(obtainStyledAttributes, index, this.f1341p);
                            break;
                        case 32:
                            this.f1342q = C0283b.m949f(obtainStyledAttributes, index, this.f1342q);
                            break;
                        case 33:
                            this.f1295E = obtainStyledAttributes.getDimensionPixelSize(index, this.f1295E);
                            break;
                        case 34:
                            this.f1337l = C0283b.m949f(obtainStyledAttributes, index, this.f1337l);
                            break;
                        case 35:
                            this.f1336k = C0283b.m949f(obtainStyledAttributes, index, this.f1336k);
                            break;
                        case 36:
                            this.f1346u = obtainStyledAttributes.getFloat(index, this.f1346u);
                            break;
                        case 37:
                            this.f1306P = obtainStyledAttributes.getFloat(index, this.f1306P);
                            break;
                        case 38:
                            this.f1305O = obtainStyledAttributes.getFloat(index, this.f1305O);
                            break;
                        case 39:
                            this.f1307Q = obtainStyledAttributes.getInt(index, this.f1307Q);
                            break;
                        case 40:
                            this.f1308R = obtainStyledAttributes.getInt(index, this.f1308R);
                            break;
                        default:
                            switch (i8) {
                                case 54:
                                    this.f1309S = obtainStyledAttributes.getInt(index, this.f1309S);
                                    break;
                                case 55:
                                    this.f1310T = obtainStyledAttributes.getInt(index, this.f1310T);
                                    break;
                                case 56:
                                    this.f1311U = obtainStyledAttributes.getDimensionPixelSize(index, this.f1311U);
                                    break;
                                case 57:
                                    this.f1312V = obtainStyledAttributes.getDimensionPixelSize(index, this.f1312V);
                                    break;
                                case 58:
                                    this.f1313W = obtainStyledAttributes.getDimensionPixelSize(index, this.f1313W);
                                    break;
                                case 59:
                                    this.f1314X = obtainStyledAttributes.getDimensionPixelSize(index, this.f1314X);
                                    break;
                                default:
                                    switch (i8) {
                                        case 61:
                                            this.f1348w = C0283b.m949f(obtainStyledAttributes, index, this.f1348w);
                                            break;
                                        case 62:
                                            this.f1349x = obtainStyledAttributes.getDimensionPixelSize(index, this.f1349x);
                                            break;
                                        case 63:
                                            this.f1350y = obtainStyledAttributes.getFloat(index, this.f1350y);
                                            break;
                                        default:
                                            switch (i8) {
                                                case 69:
                                                    this.f1315Y = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    continue;
                                                case 70:
                                                    this.f1316Z = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    continue;
                                                case 71:
                                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                    continue;
                                                case 72:
                                                    this.f1318a0 = obtainStyledAttributes.getInt(index, this.f1318a0);
                                                    continue;
                                                case 73:
                                                    this.f1320b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1320b0);
                                                    continue;
                                                case 74:
                                                    this.f1326e0 = obtainStyledAttributes.getString(index);
                                                    continue;
                                                case 75:
                                                    this.f1334i0 = obtainStyledAttributes.getBoolean(index, this.f1334i0);
                                                    continue;
                                                case 76:
                                                    sb = new StringBuilder("unused attribute 0x");
                                                    break;
                                                case 77:
                                                    this.f1328f0 = obtainStyledAttributes.getString(index);
                                                    continue;
                                                default:
                                                    sb = new StringBuilder("Unknown attribute 0x");
                                                    break;
                                            }
                                            sb.append(Integer.toHexString(index));
                                            sb.append("   ");
                                            sb.append(sparseIntArray.get(index));
                                            Log.w("ConstraintSet", sb.toString());
                                            break;
                                    }
                            }
                    }
                } else {
                    this.f1332h0 = obtainStyledAttributes.getBoolean(index, this.f1332h0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.b$c */
    public static class c {

        /* renamed from: e */
        public static final SparseIntArray f1352e;

        /* renamed from: a */
        public int f1353a = -1;

        /* renamed from: b */
        public int f1354b = -1;

        /* renamed from: c */
        public float f1355c = Float.NaN;

        /* renamed from: d */
        public float f1356d = Float.NaN;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1352e = sparseIntArray;
            sparseIntArray.append(R$styleable.Motion_motionPathRotate, 1);
            sparseIntArray.append(R$styleable.Motion_pathMotionArc, 2);
            sparseIntArray.append(R$styleable.Motion_transitionEasing, 3);
            sparseIntArray.append(R$styleable.Motion_drawPath, 4);
            sparseIntArray.append(R$styleable.Motion_animate_relativeTo, 5);
            sparseIntArray.append(R$styleable.Motion_motionStagger, 6);
        }

        /* renamed from: a */
        public final void m957a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f1268f);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                switch (f1352e.get(index)) {
                    case 1:
                        this.f1356d = obtainStyledAttributes.getFloat(index, this.f1356d);
                        break;
                    case 2:
                        this.f1354b = obtainStyledAttributes.getInt(index, this.f1354b);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            String str = C0391d0.f1973i[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f1353a = C0283b.m949f(obtainStyledAttributes, index, this.f1353a);
                        break;
                    case 6:
                        this.f1355c = obtainStyledAttributes.getFloat(index, this.f1355c);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.b$d */
    public static class d {

        /* renamed from: a */
        public int f1357a = 0;

        /* renamed from: b */
        public int f1358b = 0;

        /* renamed from: c */
        public float f1359c = 1.0f;

        /* renamed from: d */
        public float f1360d = Float.NaN;

        /* renamed from: a */
        public final void m958a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f1269g);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                if (index == R$styleable.PropertySet_android_alpha) {
                    this.f1359c = obtainStyledAttributes.getFloat(index, this.f1359c);
                } else if (index == R$styleable.PropertySet_android_visibility) {
                    int i8 = obtainStyledAttributes.getInt(index, this.f1357a);
                    this.f1357a = i8;
                    this.f1357a = C0283b.f1279d[i8];
                } else if (index == R$styleable.PropertySet_visibilityMode) {
                    this.f1358b = obtainStyledAttributes.getInt(index, this.f1358b);
                } else if (index == R$styleable.PropertySet_motionProgress) {
                    this.f1360d = obtainStyledAttributes.getFloat(index, this.f1360d);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.b$e */
    public static class e {

        /* renamed from: m */
        public static final SparseIntArray f1361m;

        /* renamed from: a */
        public float f1362a = 0.0f;

        /* renamed from: b */
        public float f1363b = 0.0f;

        /* renamed from: c */
        public float f1364c = 0.0f;

        /* renamed from: d */
        public float f1365d = 1.0f;

        /* renamed from: e */
        public float f1366e = 1.0f;

        /* renamed from: f */
        public float f1367f = Float.NaN;

        /* renamed from: g */
        public float f1368g = Float.NaN;

        /* renamed from: h */
        public float f1369h = 0.0f;

        /* renamed from: i */
        public float f1370i = 0.0f;

        /* renamed from: j */
        public float f1371j = 0.0f;

        /* renamed from: k */
        public boolean f1372k = false;

        /* renamed from: l */
        public float f1373l = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1361m = sparseIntArray;
            sparseIntArray.append(R$styleable.Transform_android_rotation, 1);
            sparseIntArray.append(R$styleable.Transform_android_rotationX, 2);
            sparseIntArray.append(R$styleable.Transform_android_rotationY, 3);
            sparseIntArray.append(R$styleable.Transform_android_scaleX, 4);
            sparseIntArray.append(R$styleable.Transform_android_scaleY, 5);
            sparseIntArray.append(R$styleable.Transform_android_transformPivotX, 6);
            sparseIntArray.append(R$styleable.Transform_android_transformPivotY, 7);
            sparseIntArray.append(R$styleable.Transform_android_translationX, 8);
            sparseIntArray.append(R$styleable.Transform_android_translationY, 9);
            sparseIntArray.append(R$styleable.Transform_android_translationZ, 10);
            sparseIntArray.append(R$styleable.Transform_android_elevation, 11);
        }

        /* renamed from: a */
        public final void m959a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f1271i);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                switch (f1361m.get(index)) {
                    case 1:
                        this.f1362a = obtainStyledAttributes.getFloat(index, this.f1362a);
                        break;
                    case 2:
                        this.f1363b = obtainStyledAttributes.getFloat(index, this.f1363b);
                        break;
                    case 3:
                        this.f1364c = obtainStyledAttributes.getFloat(index, this.f1364c);
                        break;
                    case 4:
                        this.f1365d = obtainStyledAttributes.getFloat(index, this.f1365d);
                        break;
                    case 5:
                        this.f1366e = obtainStyledAttributes.getFloat(index, this.f1366e);
                        break;
                    case 6:
                        this.f1367f = obtainStyledAttributes.getDimension(index, this.f1367f);
                        break;
                    case 7:
                        this.f1368g = obtainStyledAttributes.getDimension(index, this.f1368g);
                        break;
                    case 8:
                        this.f1369h = obtainStyledAttributes.getDimension(index, this.f1369h);
                        break;
                    case 9:
                        this.f1370i = obtainStyledAttributes.getDimension(index, this.f1370i);
                        break;
                    case 10:
                        this.f1371j = obtainStyledAttributes.getDimension(index, this.f1371j);
                        break;
                    case 11:
                        this.f1372k = true;
                        this.f1373l = obtainStyledAttributes.getDimension(index, this.f1373l);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1280e = sparseIntArray;
        sparseIntArray.append(R$styleable.Constraint_layout_constraintLeft_toLeftOf, 25);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintLeft_toRightOf, 26);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintRight_toLeftOf, 29);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintRight_toRightOf, 30);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintTop_toTopOf, 36);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintTop_toBottomOf, 35);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintBottom_toTopOf, 4);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintBottom_toBottomOf, 3);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        sparseIntArray.append(R$styleable.Constraint_layout_editor_absoluteX, 6);
        sparseIntArray.append(R$styleable.Constraint_layout_editor_absoluteY, 7);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintGuide_begin, 17);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintGuide_end, 18);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintGuide_percent, 19);
        sparseIntArray.append(R$styleable.Constraint_android_orientation, 27);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintStart_toEndOf, 32);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintStart_toStartOf, 33);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintEnd_toStartOf, 10);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintEnd_toEndOf, 9);
        sparseIntArray.append(R$styleable.Constraint_layout_goneMarginLeft, 13);
        sparseIntArray.append(R$styleable.Constraint_layout_goneMarginTop, 16);
        sparseIntArray.append(R$styleable.Constraint_layout_goneMarginRight, 14);
        sparseIntArray.append(R$styleable.Constraint_layout_goneMarginBottom, 11);
        sparseIntArray.append(R$styleable.Constraint_layout_goneMarginStart, 15);
        sparseIntArray.append(R$styleable.Constraint_layout_goneMarginEnd, 12);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintVertical_weight, 40);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintHorizontal_weight, 39);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintHorizontal_chainStyle, 41);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintVertical_chainStyle, 42);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintHorizontal_bias, 20);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintVertical_bias, 37);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintDimensionRatio, 5);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintLeft_creator, 82);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintTop_creator, 82);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintRight_creator, 82);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintBottom_creator, 82);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintBaseline_creator, 82);
        sparseIntArray.append(R$styleable.Constraint_android_layout_marginLeft, 24);
        sparseIntArray.append(R$styleable.Constraint_android_layout_marginRight, 28);
        sparseIntArray.append(R$styleable.Constraint_android_layout_marginStart, 31);
        sparseIntArray.append(R$styleable.Constraint_android_layout_marginEnd, 8);
        sparseIntArray.append(R$styleable.Constraint_android_layout_marginTop, 34);
        sparseIntArray.append(R$styleable.Constraint_android_layout_marginBottom, 2);
        sparseIntArray.append(R$styleable.Constraint_android_layout_width, 23);
        sparseIntArray.append(R$styleable.Constraint_android_layout_height, 21);
        sparseIntArray.append(R$styleable.Constraint_android_visibility, 22);
        sparseIntArray.append(R$styleable.Constraint_android_alpha, 43);
        sparseIntArray.append(R$styleable.Constraint_android_elevation, 44);
        sparseIntArray.append(R$styleable.Constraint_android_rotationX, 45);
        sparseIntArray.append(R$styleable.Constraint_android_rotationY, 46);
        sparseIntArray.append(R$styleable.Constraint_android_rotation, 60);
        sparseIntArray.append(R$styleable.Constraint_android_scaleX, 47);
        sparseIntArray.append(R$styleable.Constraint_android_scaleY, 48);
        sparseIntArray.append(R$styleable.Constraint_android_transformPivotX, 49);
        sparseIntArray.append(R$styleable.Constraint_android_transformPivotY, 50);
        sparseIntArray.append(R$styleable.Constraint_android_translationX, 51);
        sparseIntArray.append(R$styleable.Constraint_android_translationY, 52);
        sparseIntArray.append(R$styleable.Constraint_android_translationZ, 53);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintWidth_default, 54);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintHeight_default, 55);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintWidth_max, 56);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintHeight_max, 57);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintWidth_min, 58);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintHeight_min, 59);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintCircle, 61);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintCircleRadius, 62);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintCircleAngle, 63);
        sparseIntArray.append(R$styleable.Constraint_animate_relativeTo, 64);
        sparseIntArray.append(R$styleable.Constraint_transitionEasing, 65);
        sparseIntArray.append(R$styleable.Constraint_drawPath, 66);
        sparseIntArray.append(R$styleable.Constraint_transitionPathRotate, 67);
        sparseIntArray.append(R$styleable.Constraint_motionStagger, 79);
        sparseIntArray.append(R$styleable.Constraint_android_id, 38);
        sparseIntArray.append(R$styleable.Constraint_motionProgress, 68);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintWidth_percent, 69);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintHeight_percent, 70);
        sparseIntArray.append(R$styleable.Constraint_chainUseRtl, 71);
        sparseIntArray.append(R$styleable.Constraint_barrierDirection, 72);
        sparseIntArray.append(R$styleable.Constraint_barrierMargin, 73);
        sparseIntArray.append(R$styleable.Constraint_constraint_referenced_ids, 74);
        sparseIntArray.append(R$styleable.Constraint_barrierAllowsGoneWidgets, 75);
        sparseIntArray.append(R$styleable.Constraint_pathMotionArc, 76);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintTag, 77);
        sparseIntArray.append(R$styleable.Constraint_visibilityMode, 78);
        sparseIntArray.append(R$styleable.Constraint_layout_constrainedWidth, 80);
        sparseIntArray.append(R$styleable.Constraint_layout_constrainedHeight, 81);
    }

    /* renamed from: c */
    public static int[] m947c(Barrier barrier, String str) {
        int i7;
        HashMap<String, Integer> hashMap;
        String[] split = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[split.length];
        int i8 = 0;
        int i9 = 0;
        while (i8 < split.length) {
            String trim = split[i8].trim();
            Integer num = null;
            try {
                i7 = R$id.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i7 = 0;
            }
            if (i7 == 0) {
                i7 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i7 == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) barrier.getParent();
                constraintLayout.getClass();
                if ((trim instanceof String) && (hashMap = constraintLayout.f1178E1) != null && hashMap.containsKey(trim)) {
                    num = constraintLayout.f1178E1.get(trim);
                }
                if (num != null && (num instanceof Integer)) {
                    i7 = num.intValue();
                }
            }
            iArr[i9] = i7;
            i8++;
            i9++;
        }
        return i9 != split.length ? Arrays.copyOf(iArr, i9) : iArr;
    }

    /* renamed from: d */
    public static a m948d(Context context, AttributeSet attributeSet) {
        StringBuilder sb;
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f1263a);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = obtainStyledAttributes.getIndex(i7);
            int i8 = R$styleable.Constraint_android_id;
            d dVar = aVar.f1285b;
            c cVar = aVar.f1286c;
            e eVar = aVar.f1288e;
            b bVar = aVar.f1287d;
            if (index != i8 && R$styleable.Constraint_android_layout_marginStart != index && R$styleable.Constraint_android_layout_marginEnd != index) {
                cVar.getClass();
                bVar.getClass();
                dVar.getClass();
                eVar.getClass();
            }
            SparseIntArray sparseIntArray = f1280e;
            switch (sparseIntArray.get(index)) {
                case 1:
                    bVar.f1340o = m949f(obtainStyledAttributes, index, bVar.f1340o);
                    break;
                case 2:
                    bVar.f1296F = obtainStyledAttributes.getDimensionPixelSize(index, bVar.f1296F);
                    break;
                case 3:
                    bVar.f1339n = m949f(obtainStyledAttributes, index, bVar.f1339n);
                    break;
                case 4:
                    bVar.f1338m = m949f(obtainStyledAttributes, index, bVar.f1338m);
                    break;
                case 5:
                    bVar.f1347v = obtainStyledAttributes.getString(index);
                    break;
                case 6:
                    bVar.f1351z = obtainStyledAttributes.getDimensionPixelOffset(index, bVar.f1351z);
                    break;
                case 7:
                    bVar.f1291A = obtainStyledAttributes.getDimensionPixelOffset(index, bVar.f1291A);
                    break;
                case 8:
                    bVar.f1297G = obtainStyledAttributes.getDimensionPixelSize(index, bVar.f1297G);
                    break;
                case 9:
                    bVar.f1344s = m949f(obtainStyledAttributes, index, bVar.f1344s);
                    break;
                case 10:
                    bVar.f1343r = m949f(obtainStyledAttributes, index, bVar.f1343r);
                    break;
                case 11:
                    bVar.f1302L = obtainStyledAttributes.getDimensionPixelSize(index, bVar.f1302L);
                    break;
                case 12:
                    bVar.f1303M = obtainStyledAttributes.getDimensionPixelSize(index, bVar.f1303M);
                    break;
                case 13:
                    bVar.f1299I = obtainStyledAttributes.getDimensionPixelSize(index, bVar.f1299I);
                    break;
                case 14:
                    bVar.f1301K = obtainStyledAttributes.getDimensionPixelSize(index, bVar.f1301K);
                    break;
                case 15:
                    bVar.f1304N = obtainStyledAttributes.getDimensionPixelSize(index, bVar.f1304N);
                    break;
                case 16:
                    bVar.f1300J = obtainStyledAttributes.getDimensionPixelSize(index, bVar.f1300J);
                    break;
                case 17:
                    bVar.f1323d = obtainStyledAttributes.getDimensionPixelOffset(index, bVar.f1323d);
                    break;
                case 18:
                    bVar.f1325e = obtainStyledAttributes.getDimensionPixelOffset(index, bVar.f1325e);
                    break;
                case 19:
                    bVar.f1327f = obtainStyledAttributes.getFloat(index, bVar.f1327f);
                    break;
                case 20:
                    bVar.f1345t = obtainStyledAttributes.getFloat(index, bVar.f1345t);
                    break;
                case 21:
                    bVar.f1321c = obtainStyledAttributes.getLayoutDimension(index, bVar.f1321c);
                    break;
                case 22:
                    dVar.f1357a = f1279d[obtainStyledAttributes.getInt(index, dVar.f1357a)];
                    break;
                case 23:
                    bVar.f1319b = obtainStyledAttributes.getLayoutDimension(index, bVar.f1319b);
                    break;
                case 24:
                    bVar.f1293C = obtainStyledAttributes.getDimensionPixelSize(index, bVar.f1293C);
                    break;
                case 25:
                    bVar.f1329g = m949f(obtainStyledAttributes, index, bVar.f1329g);
                    break;
                case 26:
                    bVar.f1331h = m949f(obtainStyledAttributes, index, bVar.f1331h);
                    break;
                case 27:
                    bVar.f1292B = obtainStyledAttributes.getInt(index, bVar.f1292B);
                    break;
                case 28:
                    bVar.f1294D = obtainStyledAttributes.getDimensionPixelSize(index, bVar.f1294D);
                    break;
                case 29:
                    bVar.f1333i = m949f(obtainStyledAttributes, index, bVar.f1333i);
                    break;
                case 30:
                    bVar.f1335j = m949f(obtainStyledAttributes, index, bVar.f1335j);
                    break;
                case 31:
                    bVar.f1298H = obtainStyledAttributes.getDimensionPixelSize(index, bVar.f1298H);
                    break;
                case 32:
                    bVar.f1341p = m949f(obtainStyledAttributes, index, bVar.f1341p);
                    break;
                case 33:
                    bVar.f1342q = m949f(obtainStyledAttributes, index, bVar.f1342q);
                    break;
                case 34:
                    bVar.f1295E = obtainStyledAttributes.getDimensionPixelSize(index, bVar.f1295E);
                    break;
                case 35:
                    bVar.f1337l = m949f(obtainStyledAttributes, index, bVar.f1337l);
                    break;
                case 36:
                    bVar.f1336k = m949f(obtainStyledAttributes, index, bVar.f1336k);
                    break;
                case 37:
                    bVar.f1346u = obtainStyledAttributes.getFloat(index, bVar.f1346u);
                    break;
                case 38:
                    aVar.f1284a = obtainStyledAttributes.getResourceId(index, aVar.f1284a);
                    break;
                case 39:
                    bVar.f1306P = obtainStyledAttributes.getFloat(index, bVar.f1306P);
                    break;
                case 40:
                    bVar.f1305O = obtainStyledAttributes.getFloat(index, bVar.f1305O);
                    break;
                case 41:
                    bVar.f1307Q = obtainStyledAttributes.getInt(index, bVar.f1307Q);
                    break;
                case 42:
                    bVar.f1308R = obtainStyledAttributes.getInt(index, bVar.f1308R);
                    break;
                case 43:
                    dVar.f1359c = obtainStyledAttributes.getFloat(index, dVar.f1359c);
                    break;
                case 44:
                    eVar.f1372k = true;
                    eVar.f1373l = obtainStyledAttributes.getDimension(index, eVar.f1373l);
                    break;
                case 45:
                    eVar.f1363b = obtainStyledAttributes.getFloat(index, eVar.f1363b);
                    break;
                case 46:
                    eVar.f1364c = obtainStyledAttributes.getFloat(index, eVar.f1364c);
                    break;
                case 47:
                    eVar.f1365d = obtainStyledAttributes.getFloat(index, eVar.f1365d);
                    break;
                case 48:
                    eVar.f1366e = obtainStyledAttributes.getFloat(index, eVar.f1366e);
                    break;
                case 49:
                    eVar.f1367f = obtainStyledAttributes.getDimension(index, eVar.f1367f);
                    break;
                case 50:
                    eVar.f1368g = obtainStyledAttributes.getDimension(index, eVar.f1368g);
                    break;
                case 51:
                    eVar.f1369h = obtainStyledAttributes.getDimension(index, eVar.f1369h);
                    break;
                case 52:
                    eVar.f1370i = obtainStyledAttributes.getDimension(index, eVar.f1370i);
                    break;
                case 53:
                    eVar.f1371j = obtainStyledAttributes.getDimension(index, eVar.f1371j);
                    break;
                case 54:
                    bVar.f1309S = obtainStyledAttributes.getInt(index, bVar.f1309S);
                    break;
                case 55:
                    bVar.f1310T = obtainStyledAttributes.getInt(index, bVar.f1310T);
                    break;
                case 56:
                    bVar.f1311U = obtainStyledAttributes.getDimensionPixelSize(index, bVar.f1311U);
                    break;
                case 57:
                    bVar.f1312V = obtainStyledAttributes.getDimensionPixelSize(index, bVar.f1312V);
                    break;
                case 58:
                    bVar.f1313W = obtainStyledAttributes.getDimensionPixelSize(index, bVar.f1313W);
                    break;
                case 59:
                    bVar.f1314X = obtainStyledAttributes.getDimensionPixelSize(index, bVar.f1314X);
                    break;
                case 60:
                    eVar.f1362a = obtainStyledAttributes.getFloat(index, eVar.f1362a);
                    break;
                case 61:
                    bVar.f1348w = m949f(obtainStyledAttributes, index, bVar.f1348w);
                    break;
                case 62:
                    bVar.f1349x = obtainStyledAttributes.getDimensionPixelSize(index, bVar.f1349x);
                    break;
                case 63:
                    bVar.f1350y = obtainStyledAttributes.getFloat(index, bVar.f1350y);
                    break;
                case 64:
                    cVar.f1353a = m949f(obtainStyledAttributes, index, cVar.f1353a);
                    break;
                case 65:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                    } else {
                        String str = C0391d0.f1973i[obtainStyledAttributes.getInteger(index, 0)];
                    }
                    cVar.getClass();
                    break;
                case 66:
                    obtainStyledAttributes.getInt(index, 0);
                    cVar.getClass();
                    break;
                case 67:
                    cVar.f1356d = obtainStyledAttributes.getFloat(index, cVar.f1356d);
                    break;
                case 68:
                    dVar.f1360d = obtainStyledAttributes.getFloat(index, dVar.f1360d);
                    break;
                case 69:
                    bVar.f1315Y = obtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 70:
                    bVar.f1316Z = obtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    bVar.f1318a0 = obtainStyledAttributes.getInt(index, bVar.f1318a0);
                    break;
                case 73:
                    bVar.f1320b0 = obtainStyledAttributes.getDimensionPixelSize(index, bVar.f1320b0);
                    break;
                case 74:
                    bVar.f1326e0 = obtainStyledAttributes.getString(index);
                    break;
                case 75:
                    bVar.f1334i0 = obtainStyledAttributes.getBoolean(index, bVar.f1334i0);
                    break;
                case 76:
                    cVar.f1354b = obtainStyledAttributes.getInt(index, cVar.f1354b);
                    break;
                case 77:
                    bVar.f1328f0 = obtainStyledAttributes.getString(index);
                    break;
                case 78:
                    dVar.f1358b = obtainStyledAttributes.getInt(index, dVar.f1358b);
                    break;
                case 79:
                    cVar.f1355c = obtainStyledAttributes.getFloat(index, cVar.f1355c);
                    break;
                case 80:
                    bVar.f1330g0 = obtainStyledAttributes.getBoolean(index, bVar.f1330g0);
                    break;
                case 81:
                    bVar.f1332h0 = obtainStyledAttributes.getBoolean(index, bVar.f1332h0);
                    break;
                case 82:
                    sb = new StringBuilder("unused attribute 0x");
                    sb.append(Integer.toHexString(index));
                    sb.append("   ");
                    sb.append(sparseIntArray.get(index));
                    Log.w("ConstraintSet", sb.toString());
                    break;
                default:
                    sb = new StringBuilder("Unknown attribute 0x");
                    sb.append(Integer.toHexString(index));
                    sb.append("   ");
                    sb.append(sparseIntArray.get(index));
                    Log.w("ConstraintSet", sb.toString());
                    break;
            }
        }
        obtainStyledAttributes.recycle();
        return aVar;
    }

    /* renamed from: f */
    public static int m949f(TypedArray typedArray, int i7, int i8) {
        int resourceId = typedArray.getResourceId(i7, i8);
        return resourceId == -1 ? typedArray.getInt(i7, -1) : resourceId;
    }

    /* renamed from: a */
    public final void m950a(ConstraintLayout constraintLayout) {
        int i7;
        Iterator<String> it;
        StringBuilder sb;
        String str;
        C0283b c0283b = this;
        int childCount = constraintLayout.getChildCount();
        HashMap<Integer, a> hashMap = c0283b.f1283c;
        HashSet hashSet = new HashSet(hashMap.keySet());
        int i8 = 0;
        while (i8 < childCount) {
            View childAt = constraintLayout.getChildAt(i8);
            int id = childAt.getId();
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                StringBuilder sb2 = new StringBuilder("id unknown ");
                try {
                    str = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    str = "UNKNOWN";
                }
                sb2.append(str);
                Log.w("ConstraintSet", sb2.toString());
            } else {
                if (c0283b.f1282b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (hashMap.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        a aVar = hashMap.get(Integer.valueOf(id));
                        if (childAt instanceof Barrier) {
                            aVar.f1287d.f1322c0 = 1;
                        }
                        int i9 = aVar.f1287d.f1322c0;
                        if (i9 != -1 && i9 == 1) {
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            b bVar = aVar.f1287d;
                            barrier.setType(bVar.f1318a0);
                            barrier.setMargin(bVar.f1320b0);
                            barrier.setAllowsGoneWidget(bVar.f1334i0);
                            int[] iArr = bVar.f1324d0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str2 = bVar.f1326e0;
                                if (str2 != null) {
                                    int[] m947c = m947c(barrier, str2);
                                    bVar.f1324d0 = m947c;
                                    barrier.setReferencedIds(m947c);
                                }
                            }
                        }
                        ConstraintLayout.C0280a c0280a = (ConstraintLayout.C0280a) childAt.getLayoutParams();
                        c0280a.m940a();
                        aVar.m953a(c0280a);
                        HashMap<String, C1861a> hashMap2 = aVar.f1289f;
                        Class<?> cls = childAt.getClass();
                        Iterator<String> it2 = hashMap2.keySet().iterator();
                        while (it2.hasNext()) {
                            String next = it2.next();
                            C1861a c1861a = hashMap2.get(next);
                            int i10 = childCount;
                            String m208f = C0089a.m208f("set", next);
                            HashMap<String, C1861a> hashMap3 = hashMap2;
                            try {
                                switch (C1686g.m4108c(c1861a.f8362a)) {
                                    case 0:
                                        it = it2;
                                        cls.getMethod(m208f, Integer.TYPE).invoke(childAt, Integer.valueOf(c1861a.f8363b));
                                        break;
                                    case 1:
                                        it = it2;
                                        cls.getMethod(m208f, Float.TYPE).invoke(childAt, Float.valueOf(c1861a.f8364c));
                                        break;
                                    case 2:
                                        it = it2;
                                        cls.getMethod(m208f, Integer.TYPE).invoke(childAt, Integer.valueOf(c1861a.f8367f));
                                        break;
                                    case 3:
                                        it = it2;
                                        Method method = cls.getMethod(m208f, Drawable.class);
                                        ColorDrawable colorDrawable = new ColorDrawable();
                                        colorDrawable.setColor(c1861a.f8367f);
                                        method.invoke(childAt, colorDrawable);
                                        break;
                                    case 4:
                                        it = it2;
                                        cls.getMethod(m208f, CharSequence.class).invoke(childAt, c1861a.f8365d);
                                        break;
                                    case 5:
                                        it = it2;
                                        cls.getMethod(m208f, Boolean.TYPE).invoke(childAt, Boolean.valueOf(c1861a.f8366e));
                                        break;
                                    case 6:
                                        it = it2;
                                        try {
                                            cls.getMethod(m208f, Float.TYPE).invoke(childAt, Float.valueOf(c1861a.f8364c));
                                        } catch (IllegalAccessException e7) {
                                            e = e7;
                                            sb = new StringBuilder(" Custom Attribute \"");
                                            sb.append(next);
                                            sb.append("\" not found on ");
                                            sb.append(cls.getName());
                                            Log.e("TransitionLayout", sb.toString());
                                            e.printStackTrace();
                                            childCount = i10;
                                            hashMap2 = hashMap3;
                                            it2 = it;
                                        } catch (NoSuchMethodException e8) {
                                            e = e8;
                                            Log.e("TransitionLayout", e.getMessage());
                                            Log.e("TransitionLayout", " Custom Attribute \"" + next + "\" not found on " + cls.getName());
                                            Log.e("TransitionLayout", cls.getName() + " must have a method " + m208f);
                                            childCount = i10;
                                            hashMap2 = hashMap3;
                                            it2 = it;
                                        } catch (InvocationTargetException e9) {
                                            e = e9;
                                            sb = new StringBuilder(" Custom Attribute \"");
                                            sb.append(next);
                                            sb.append("\" not found on ");
                                            sb.append(cls.getName());
                                            Log.e("TransitionLayout", sb.toString());
                                            e.printStackTrace();
                                            childCount = i10;
                                            hashMap2 = hashMap3;
                                            it2 = it;
                                        }
                                    default:
                                        it = it2;
                                        break;
                                }
                            } catch (IllegalAccessException e10) {
                                e = e10;
                                it = it2;
                            } catch (NoSuchMethodException e11) {
                                e = e11;
                                it = it2;
                            } catch (InvocationTargetException e12) {
                                e = e12;
                                it = it2;
                            }
                            childCount = i10;
                            hashMap2 = hashMap3;
                            it2 = it;
                        }
                        i7 = childCount;
                        childAt.setLayoutParams(c0280a);
                        d dVar = aVar.f1285b;
                        if (dVar.f1358b == 0) {
                            childAt.setVisibility(dVar.f1357a);
                        }
                        childAt.setAlpha(dVar.f1359c);
                        e eVar = aVar.f1288e;
                        childAt.setRotation(eVar.f1362a);
                        childAt.setRotationX(eVar.f1363b);
                        childAt.setRotationY(eVar.f1364c);
                        childAt.setScaleX(eVar.f1365d);
                        childAt.setScaleY(eVar.f1366e);
                        if (!Float.isNaN(eVar.f1367f)) {
                            childAt.setPivotX(eVar.f1367f);
                        }
                        if (!Float.isNaN(eVar.f1368g)) {
                            childAt.setPivotY(eVar.f1368g);
                        }
                        childAt.setTranslationX(eVar.f1369h);
                        childAt.setTranslationY(eVar.f1370i);
                        childAt.setTranslationZ(eVar.f1371j);
                        if (eVar.f1372k) {
                            childAt.setElevation(eVar.f1373l);
                        }
                    } else {
                        i7 = childCount;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                    i8++;
                    c0283b = this;
                    childCount = i7;
                }
            }
            i7 = childCount;
            i8++;
            c0283b = this;
            childCount = i7;
        }
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            Integer num = (Integer) it3.next();
            a aVar2 = hashMap.get(num);
            b bVar2 = aVar2.f1287d;
            int i11 = bVar2.f1322c0;
            if (i11 != -1 && i11 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                int[] iArr2 = bVar2.f1324d0;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str3 = bVar2.f1326e0;
                    if (str3 != null) {
                        int[] m947c2 = m947c(barrier2, str3);
                        bVar2.f1324d0 = m947c2;
                        barrier2.setReferencedIds(m947c2);
                    }
                }
                barrier2.setType(bVar2.f1318a0);
                barrier2.setMargin(bVar2.f1320b0);
                int i12 = ConstraintLayout.f1173H1;
                ConstraintLayout.C0280a c0280a2 = new ConstraintLayout.C0280a();
                barrier2.m946g();
                aVar2.m953a(c0280a2);
                constraintLayout.addView(barrier2, c0280a2);
            }
            if (bVar2.f1317a) {
                View c0285d = new C0285d(constraintLayout.getContext());
                c0285d.setId(num.intValue());
                int i13 = ConstraintLayout.f1173H1;
                ConstraintLayout.C0280a c0280a3 = new ConstraintLayout.C0280a();
                aVar2.m953a(c0280a3);
                constraintLayout.addView(c0285d, c0280a3);
            }
        }
    }

    /* renamed from: b */
    public final void m951b(ConstraintLayout constraintLayout) {
        int i7;
        C1861a c1861a;
        C0283b c0283b = this;
        int childCount = constraintLayout.getChildCount();
        HashMap<Integer, a> hashMap = c0283b.f1283c;
        hashMap.clear();
        int i8 = 0;
        while (i8 < childCount) {
            View childAt = constraintLayout.getChildAt(i8);
            ConstraintLayout.C0280a c0280a = (ConstraintLayout.C0280a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (c0283b.f1282b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                hashMap.put(Integer.valueOf(id), new a());
            }
            a aVar = hashMap.get(Integer.valueOf(id));
            HashMap<String, C1861a> hashMap2 = c0283b.f1281a;
            HashMap<String, C1861a> hashMap3 = new HashMap<>();
            Class<?> cls = childAt.getClass();
            for (String str : hashMap2.keySet()) {
                C1861a c1861a2 = hashMap2.get(str);
                try {
                    if (str.equals("BackgroundColor")) {
                        c1861a = new C1861a(c1861a2, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor()));
                        i7 = childCount;
                    } else {
                        i7 = childCount;
                        try {
                            c1861a = new C1861a(c1861a2, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0]));
                        } catch (IllegalAccessException e7) {
                            e = e7;
                            e.printStackTrace();
                            childCount = i7;
                        } catch (NoSuchMethodException e8) {
                            e = e8;
                            e.printStackTrace();
                            childCount = i7;
                        } catch (InvocationTargetException e9) {
                            e = e9;
                            e.printStackTrace();
                            childCount = i7;
                        }
                    }
                    hashMap3.put(str, c1861a);
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
                    e = e10;
                    i7 = childCount;
                }
                childCount = i7;
            }
            int i9 = childCount;
            aVar.f1289f = hashMap3;
            aVar.m954b(id, c0280a);
            int visibility = childAt.getVisibility();
            d dVar = aVar.f1285b;
            dVar.f1357a = visibility;
            dVar.f1359c = childAt.getAlpha();
            float rotation = childAt.getRotation();
            e eVar = aVar.f1288e;
            eVar.f1362a = rotation;
            eVar.f1363b = childAt.getRotationX();
            eVar.f1364c = childAt.getRotationY();
            eVar.f1365d = childAt.getScaleX();
            eVar.f1366e = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                eVar.f1367f = pivotX;
                eVar.f1368g = pivotY;
            }
            eVar.f1369h = childAt.getTranslationX();
            eVar.f1370i = childAt.getTranslationY();
            eVar.f1371j = childAt.getTranslationZ();
            if (eVar.f1372k) {
                eVar.f1373l = childAt.getElevation();
            }
            if (childAt instanceof Barrier) {
                Barrier barrier = (Barrier) childAt;
                boolean z6 = barrier.f1170A1.f7715h0;
                b bVar = aVar.f1287d;
                bVar.f1334i0 = z6;
                bVar.f1324d0 = barrier.getReferencedIds();
                bVar.f1318a0 = barrier.getType();
                bVar.f1320b0 = barrier.getMargin();
            }
            i8++;
            c0283b = this;
            childCount = i9;
        }
    }

    /* renamed from: e */
    public final void m952e(int i7, Context context) {
        XmlResourceParser xml = context.getResources().getXml(i7);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a m948d = m948d(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        m948d.f1287d.f1317a = true;
                    }
                    this.f1283c.put(Integer.valueOf(m948d.f1284a), m948d);
                }
            }
        } catch (IOException e7) {
            e7.printStackTrace();
        } catch (XmlPullParserException e8) {
            e8.printStackTrace();
        }
    }
}
