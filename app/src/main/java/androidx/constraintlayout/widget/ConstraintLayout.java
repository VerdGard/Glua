package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.ext.Tools;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import p120p.C1683d;
import p127q.C1713d;
import p127q.C1714e;
import p127q.C1716g;
import p135r.C1808b;
import p143s.AbstractC1863c;
import p143s.C1862b;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: H1 */
    public static final /* synthetic */ int f1173H1 = 0;

    /* renamed from: A1 */
    public int f1174A1;

    /* renamed from: B1 */
    public C0283b f1175B1;

    /* renamed from: C1 */
    public C1862b f1176C1;

    /* renamed from: D1 */
    public int f1177D1;

    /* renamed from: E1 */
    public HashMap<String, Integer> f1178E1;

    /* renamed from: F1 */
    public final SparseArray<C1713d> f1179F1;

    /* renamed from: G1 */
    public final C0281b f1180G1;

    /* renamed from: c */
    public final SparseArray<View> f1181c;

    /* renamed from: e */
    public final ArrayList<AbstractC0282a> f1182e;

    /* renamed from: m */
    public final C1714e f1183m;

    /* renamed from: s */
    public int f1184s;

    /* renamed from: w1 */
    public int f1185w1;

    /* renamed from: x1 */
    public int f1186x1;

    /* renamed from: y1 */
    public int f1187y1;

    /* renamed from: z1 */
    public boolean f1188z1;

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a */
    public static class C0280a extends ViewGroup.MarginLayoutParams {

        /* renamed from: A */
        public float f1189A;

        /* renamed from: B */
        public String f1190B;

        /* renamed from: C */
        public final int f1191C;

        /* renamed from: D */
        public float f1192D;

        /* renamed from: E */
        public float f1193E;

        /* renamed from: F */
        public int f1194F;

        /* renamed from: G */
        public int f1195G;

        /* renamed from: H */
        public int f1196H;

        /* renamed from: I */
        public int f1197I;

        /* renamed from: J */
        public int f1198J;

        /* renamed from: K */
        public int f1199K;

        /* renamed from: L */
        public int f1200L;

        /* renamed from: M */
        public int f1201M;

        /* renamed from: N */
        public float f1202N;

        /* renamed from: O */
        public float f1203O;

        /* renamed from: P */
        public int f1204P;

        /* renamed from: Q */
        public int f1205Q;

        /* renamed from: R */
        public int f1206R;

        /* renamed from: S */
        public boolean f1207S;

        /* renamed from: T */
        public boolean f1208T;

        /* renamed from: U */
        public String f1209U;

        /* renamed from: V */
        public boolean f1210V;

        /* renamed from: W */
        public boolean f1211W;

        /* renamed from: X */
        public boolean f1212X;

        /* renamed from: Y */
        public boolean f1213Y;

        /* renamed from: Z */
        public boolean f1214Z;

        /* renamed from: a */
        public int f1215a;

        /* renamed from: a0 */
        public boolean f1216a0;

        /* renamed from: b */
        public int f1217b;

        /* renamed from: b0 */
        public int f1218b0;

        /* renamed from: c */
        public float f1219c;

        /* renamed from: c0 */
        public int f1220c0;

        /* renamed from: d */
        public int f1221d;

        /* renamed from: d0 */
        public int f1222d0;

        /* renamed from: e */
        public int f1223e;

        /* renamed from: e0 */
        public int f1224e0;

        /* renamed from: f */
        public int f1225f;

        /* renamed from: f0 */
        public int f1226f0;

        /* renamed from: g */
        public int f1227g;

        /* renamed from: g0 */
        public int f1228g0;

        /* renamed from: h */
        public int f1229h;

        /* renamed from: h0 */
        public float f1230h0;

        /* renamed from: i */
        public int f1231i;

        /* renamed from: i0 */
        public int f1232i0;

        /* renamed from: j */
        public int f1233j;

        /* renamed from: j0 */
        public int f1234j0;

        /* renamed from: k */
        public int f1235k;

        /* renamed from: k0 */
        public float f1236k0;

        /* renamed from: l */
        public int f1237l;

        /* renamed from: l0 */
        public C1713d f1238l0;

        /* renamed from: m */
        public int f1239m;

        /* renamed from: n */
        public int f1240n;

        /* renamed from: o */
        public float f1241o;

        /* renamed from: p */
        public int f1242p;

        /* renamed from: q */
        public int f1243q;

        /* renamed from: r */
        public int f1244r;

        /* renamed from: s */
        public int f1245s;

        /* renamed from: t */
        public final int f1246t;

        /* renamed from: u */
        public int f1247u;

        /* renamed from: v */
        public final int f1248v;

        /* renamed from: w */
        public int f1249w;

        /* renamed from: x */
        public int f1250x;

        /* renamed from: y */
        public int f1251y;

        /* renamed from: z */
        public float f1252z;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a$a */
        public static class a {

            /* renamed from: a */
            public static final SparseIntArray f1253a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f1253a = sparseIntArray;
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintCircle, 2);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_android_orientation, 1);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintTag, 51);
            }
        }

        public C0280a() {
            super(-2, -2);
            this.f1215a = -1;
            this.f1217b = -1;
            this.f1219c = -1.0f;
            this.f1221d = -1;
            this.f1223e = -1;
            this.f1225f = -1;
            this.f1227g = -1;
            this.f1229h = -1;
            this.f1231i = -1;
            this.f1233j = -1;
            this.f1235k = -1;
            this.f1237l = -1;
            this.f1239m = -1;
            this.f1240n = 0;
            this.f1241o = 0.0f;
            this.f1242p = -1;
            this.f1243q = -1;
            this.f1244r = -1;
            this.f1245s = -1;
            this.f1246t = -1;
            this.f1247u = -1;
            this.f1248v = -1;
            this.f1249w = -1;
            this.f1250x = -1;
            this.f1251y = -1;
            this.f1252z = 0.5f;
            this.f1189A = 0.5f;
            this.f1190B = null;
            this.f1191C = 1;
            this.f1192D = -1.0f;
            this.f1193E = -1.0f;
            this.f1194F = 0;
            this.f1195G = 0;
            this.f1196H = 0;
            this.f1197I = 0;
            this.f1198J = 0;
            this.f1199K = 0;
            this.f1200L = 0;
            this.f1201M = 0;
            this.f1202N = 1.0f;
            this.f1203O = 1.0f;
            this.f1204P = -1;
            this.f1205Q = -1;
            this.f1206R = -1;
            this.f1207S = false;
            this.f1208T = false;
            this.f1209U = null;
            this.f1210V = true;
            this.f1211W = true;
            this.f1212X = false;
            this.f1213Y = false;
            this.f1214Z = false;
            this.f1216a0 = false;
            this.f1218b0 = -1;
            this.f1220c0 = -1;
            this.f1222d0 = -1;
            this.f1224e0 = -1;
            this.f1226f0 = -1;
            this.f1228g0 = -1;
            this.f1230h0 = 0.5f;
            this.f1238l0 = new C1713d();
        }

        public C0280a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            String str;
            int i7;
            this.f1215a = -1;
            this.f1217b = -1;
            this.f1219c = -1.0f;
            this.f1221d = -1;
            this.f1223e = -1;
            this.f1225f = -1;
            this.f1227g = -1;
            this.f1229h = -1;
            this.f1231i = -1;
            this.f1233j = -1;
            this.f1235k = -1;
            this.f1237l = -1;
            this.f1239m = -1;
            this.f1240n = 0;
            this.f1241o = 0.0f;
            this.f1242p = -1;
            this.f1243q = -1;
            this.f1244r = -1;
            this.f1245s = -1;
            this.f1246t = -1;
            this.f1247u = -1;
            this.f1248v = -1;
            this.f1249w = -1;
            this.f1250x = -1;
            this.f1251y = -1;
            this.f1252z = 0.5f;
            this.f1189A = 0.5f;
            this.f1190B = null;
            this.f1191C = 1;
            this.f1192D = -1.0f;
            this.f1193E = -1.0f;
            this.f1194F = 0;
            this.f1195G = 0;
            this.f1196H = 0;
            this.f1197I = 0;
            this.f1198J = 0;
            this.f1199K = 0;
            this.f1200L = 0;
            this.f1201M = 0;
            this.f1202N = 1.0f;
            this.f1203O = 1.0f;
            this.f1204P = -1;
            this.f1205Q = -1;
            this.f1206R = -1;
            this.f1207S = false;
            this.f1208T = false;
            this.f1209U = null;
            this.f1210V = true;
            this.f1211W = true;
            this.f1212X = false;
            this.f1213Y = false;
            this.f1214Z = false;
            this.f1216a0 = false;
            this.f1218b0 = -1;
            this.f1220c0 = -1;
            this.f1222d0 = -1;
            this.f1224e0 = -1;
            this.f1226f0 = -1;
            this.f1228g0 = -1;
            this.f1230h0 = 0.5f;
            this.f1238l0 = new C1713d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f1264b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = obtainStyledAttributes.getIndex(i8);
                int i9 = a.f1253a.get(index);
                switch (i9) {
                    case 1:
                        this.f1206R = obtainStyledAttributes.getInt(index, this.f1206R);
                        continue;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f1239m);
                        this.f1239m = resourceId;
                        if (resourceId == -1) {
                            this.f1239m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 3:
                        this.f1240n = obtainStyledAttributes.getDimensionPixelSize(index, this.f1240n);
                        continue;
                    case 4:
                        float f7 = obtainStyledAttributes.getFloat(index, this.f1241o) % 360.0f;
                        this.f1241o = f7;
                        if (f7 < 0.0f) {
                            this.f1241o = (360.0f - f7) % 360.0f;
                            break;
                        } else {
                            continue;
                        }
                    case 5:
                        this.f1215a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1215a);
                        continue;
                    case 6:
                        this.f1217b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1217b);
                        continue;
                    case 7:
                        this.f1219c = obtainStyledAttributes.getFloat(index, this.f1219c);
                        continue;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f1221d);
                        this.f1221d = resourceId2;
                        if (resourceId2 == -1) {
                            this.f1221d = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f1223e);
                        this.f1223e = resourceId3;
                        if (resourceId3 == -1) {
                            this.f1223e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f1225f);
                        this.f1225f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f1225f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f1227g);
                        this.f1227g = resourceId5;
                        if (resourceId5 == -1) {
                            this.f1227g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f1229h);
                        this.f1229h = resourceId6;
                        if (resourceId6 == -1) {
                            this.f1229h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f1231i);
                        this.f1231i = resourceId7;
                        if (resourceId7 == -1) {
                            this.f1231i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f1233j);
                        this.f1233j = resourceId8;
                        if (resourceId8 == -1) {
                            this.f1233j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f1235k);
                        this.f1235k = resourceId9;
                        if (resourceId9 == -1) {
                            this.f1235k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f1237l);
                        this.f1237l = resourceId10;
                        if (resourceId10 == -1) {
                            this.f1237l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f1242p);
                        this.f1242p = resourceId11;
                        if (resourceId11 == -1) {
                            this.f1242p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f1243q);
                        this.f1243q = resourceId12;
                        if (resourceId12 == -1) {
                            this.f1243q = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f1244r);
                        this.f1244r = resourceId13;
                        if (resourceId13 == -1) {
                            this.f1244r = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f1245s);
                        this.f1245s = resourceId14;
                        if (resourceId14 == -1) {
                            this.f1245s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 21:
                        this.f1246t = obtainStyledAttributes.getDimensionPixelSize(index, this.f1246t);
                        continue;
                    case 22:
                        this.f1247u = obtainStyledAttributes.getDimensionPixelSize(index, this.f1247u);
                        continue;
                    case 23:
                        this.f1248v = obtainStyledAttributes.getDimensionPixelSize(index, this.f1248v);
                        continue;
                    case 24:
                        this.f1249w = obtainStyledAttributes.getDimensionPixelSize(index, this.f1249w);
                        continue;
                    case 25:
                        this.f1250x = obtainStyledAttributes.getDimensionPixelSize(index, this.f1250x);
                        continue;
                    case 26:
                        this.f1251y = obtainStyledAttributes.getDimensionPixelSize(index, this.f1251y);
                        continue;
                    case 27:
                        this.f1207S = obtainStyledAttributes.getBoolean(index, this.f1207S);
                        continue;
                    case 28:
                        this.f1208T = obtainStyledAttributes.getBoolean(index, this.f1208T);
                        continue;
                    case 29:
                        this.f1252z = obtainStyledAttributes.getFloat(index, this.f1252z);
                        continue;
                    case 30:
                        this.f1189A = obtainStyledAttributes.getFloat(index, this.f1189A);
                        continue;
                    case 31:
                        int i10 = obtainStyledAttributes.getInt(index, 0);
                        this.f1196H = i10;
                        if (i10 == 1) {
                            str = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.";
                            break;
                        } else {
                            break;
                        }
                    case 32:
                        int i11 = obtainStyledAttributes.getInt(index, 0);
                        this.f1197I = i11;
                        if (i11 == 1) {
                            str = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.";
                            break;
                        } else {
                            break;
                        }
                    case 33:
                        try {
                            this.f1198J = obtainStyledAttributes.getDimensionPixelSize(index, this.f1198J);
                            continue;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.f1198J) == -2) {
                                this.f1198J = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.f1200L = obtainStyledAttributes.getDimensionPixelSize(index, this.f1200L);
                            continue;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.f1200L) == -2) {
                                this.f1200L = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.f1202N = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f1202N));
                        this.f1196H = 2;
                        continue;
                    case 36:
                        try {
                            this.f1199K = obtainStyledAttributes.getDimensionPixelSize(index, this.f1199K);
                            continue;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.f1199K) == -2) {
                                this.f1199K = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.f1201M = obtainStyledAttributes.getDimensionPixelSize(index, this.f1201M);
                            continue;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.f1201M) == -2) {
                                this.f1201M = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.f1203O = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f1203O));
                        this.f1197I = 2;
                        continue;
                    default:
                        switch (i9) {
                            case 44:
                                String string = obtainStyledAttributes.getString(index);
                                this.f1190B = string;
                                this.f1191C = -1;
                                if (string == null) {
                                    break;
                                } else {
                                    int length = string.length();
                                    int indexOf = this.f1190B.indexOf(44);
                                    if (indexOf <= 0 || indexOf >= length - 1) {
                                        i7 = 0;
                                    } else {
                                        String substring = this.f1190B.substring(0, indexOf);
                                        if (substring.equalsIgnoreCase("W")) {
                                            this.f1191C = 0;
                                        } else if (substring.equalsIgnoreCase("H")) {
                                            this.f1191C = 1;
                                        }
                                        i7 = indexOf + 1;
                                    }
                                    int indexOf2 = this.f1190B.indexOf(58);
                                    if (indexOf2 >= 0 && indexOf2 < length - 1) {
                                        String substring2 = this.f1190B.substring(i7, indexOf2);
                                        String substring3 = this.f1190B.substring(indexOf2 + 1);
                                        if (substring2.length() > 0 && substring3.length() > 0) {
                                            try {
                                                float parseFloat = Float.parseFloat(substring2);
                                                float parseFloat2 = Float.parseFloat(substring3);
                                                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                                    if (this.f1191C == 1) {
                                                        Math.abs(parseFloat2 / parseFloat);
                                                        break;
                                                    } else {
                                                        Math.abs(parseFloat / parseFloat2);
                                                        break;
                                                    }
                                                }
                                            } catch (NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    } else {
                                        String substring4 = this.f1190B.substring(i7);
                                        if (substring4.length() <= 0) {
                                            break;
                                        } else {
                                            Float.parseFloat(substring4);
                                            continue;
                                        }
                                    }
                                }
                                break;
                            case 45:
                                this.f1192D = obtainStyledAttributes.getFloat(index, this.f1192D);
                                break;
                            case 46:
                                this.f1193E = obtainStyledAttributes.getFloat(index, this.f1193E);
                                break;
                            case 47:
                                this.f1194F = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f1195G = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f1204P = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1204P);
                                break;
                            case 50:
                                this.f1205Q = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1205Q);
                                break;
                            case 51:
                                this.f1209U = obtainStyledAttributes.getString(index);
                                break;
                        }
                }
                Log.e("ConstraintLayout", str);
            }
            obtainStyledAttributes.recycle();
            m940a();
        }

        public C0280a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1215a = -1;
            this.f1217b = -1;
            this.f1219c = -1.0f;
            this.f1221d = -1;
            this.f1223e = -1;
            this.f1225f = -1;
            this.f1227g = -1;
            this.f1229h = -1;
            this.f1231i = -1;
            this.f1233j = -1;
            this.f1235k = -1;
            this.f1237l = -1;
            this.f1239m = -1;
            this.f1240n = 0;
            this.f1241o = 0.0f;
            this.f1242p = -1;
            this.f1243q = -1;
            this.f1244r = -1;
            this.f1245s = -1;
            this.f1246t = -1;
            this.f1247u = -1;
            this.f1248v = -1;
            this.f1249w = -1;
            this.f1250x = -1;
            this.f1251y = -1;
            this.f1252z = 0.5f;
            this.f1189A = 0.5f;
            this.f1190B = null;
            this.f1191C = 1;
            this.f1192D = -1.0f;
            this.f1193E = -1.0f;
            this.f1194F = 0;
            this.f1195G = 0;
            this.f1196H = 0;
            this.f1197I = 0;
            this.f1198J = 0;
            this.f1199K = 0;
            this.f1200L = 0;
            this.f1201M = 0;
            this.f1202N = 1.0f;
            this.f1203O = 1.0f;
            this.f1204P = -1;
            this.f1205Q = -1;
            this.f1206R = -1;
            this.f1207S = false;
            this.f1208T = false;
            this.f1209U = null;
            this.f1210V = true;
            this.f1211W = true;
            this.f1212X = false;
            this.f1213Y = false;
            this.f1214Z = false;
            this.f1216a0 = false;
            this.f1218b0 = -1;
            this.f1220c0 = -1;
            this.f1222d0 = -1;
            this.f1224e0 = -1;
            this.f1226f0 = -1;
            this.f1228g0 = -1;
            this.f1230h0 = 0.5f;
            this.f1238l0 = new C1713d();
        }

        /* renamed from: a */
        public final void m940a() {
            this.f1213Y = false;
            this.f1210V = true;
            this.f1211W = true;
            int i7 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i7 == -2 && this.f1207S) {
                this.f1210V = false;
                if (this.f1196H == 0) {
                    this.f1196H = 1;
                }
            }
            int i8 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i8 == -2 && this.f1208T) {
                this.f1211W = false;
                if (this.f1197I == 0) {
                    this.f1197I = 1;
                }
            }
            if (i7 == 0 || i7 == -1) {
                this.f1210V = false;
                if (i7 == 0 && this.f1196H == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f1207S = true;
                }
            }
            if (i8 == 0 || i8 == -1) {
                this.f1211W = false;
                if (i8 == 0 && this.f1197I == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f1208T = true;
                }
            }
            if (this.f1219c == -1.0f && this.f1215a == -1 && this.f1217b == -1) {
                return;
            }
            this.f1213Y = true;
            this.f1210V = true;
            this.f1211W = true;
            if (!(this.f1238l0 instanceof C1716g)) {
                this.f1238l0 = new C1716g();
            }
            ((C1716g) this.f1238l0).m4192B(this.f1206R);
        }

        /* JADX WARN: Code restructure failed: missing block: B:49:0x00ca, code lost:
        
            if (r1 > 0) goto L73;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00cc, code lost:
        
            ((android.view.ViewGroup.MarginLayoutParams) r9).rightMargin = r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x00d9, code lost:
        
            if (r1 > 0) goto L73;
         */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x00e0  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x00eb  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @android.annotation.TargetApi(17)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void resolveLayoutDirection(int r10) {
            /*
                Method dump skipped, instructions count: 249
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0280a.resolveLayoutDirection(int):void");
        }
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$b */
    public class C0281b implements C1808b.b {

        /* renamed from: a */
        public final ConstraintLayout f1254a;

        /* renamed from: b */
        public int f1255b;

        /* renamed from: c */
        public int f1256c;

        /* renamed from: d */
        public int f1257d;

        /* renamed from: e */
        public int f1258e;

        /* renamed from: f */
        public int f1259f;

        /* renamed from: g */
        public int f1260g;

        public C0281b(ConstraintLayout constraintLayout) {
            this.f1254a = constraintLayout;
        }

        /* JADX WARN: Removed duplicated region for block: B:109:0x021e  */
        /* JADX WARN: Removed duplicated region for block: B:111:0x0229  */
        /* JADX WARN: Removed duplicated region for block: B:113:0x0225  */
        /* JADX WARN: Removed duplicated region for block: B:117:0x01ef  */
        /* JADX WARN: Removed duplicated region for block: B:118:0x01dd  */
        /* JADX WARN: Removed duplicated region for block: B:119:0x01ce  */
        /* JADX WARN: Removed duplicated region for block: B:120:0x01be  */
        /* JADX WARN: Removed duplicated region for block: B:126:0x014a  */
        /* JADX WARN: Removed duplicated region for block: B:127:0x0145  */
        /* JADX WARN: Removed duplicated region for block: B:156:0x0136  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00bb  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0143  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0148  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x023f  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0254  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0256  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0241  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x01b6  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x01c7  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x01d8  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x01e2  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x01ea  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x01f4  */
        @android.annotation.SuppressLint({"WrongCall"})
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void m941a(p127q.C1713d r18, p135r.C1808b.a r19) {
            /*
                Method dump skipped, instructions count: 620
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0281b.m941a(q.d, r.b$a):void");
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1181c = new SparseArray<>();
        this.f1182e = new ArrayList<>(4);
        this.f1183m = new C1714e();
        this.f1184s = 0;
        this.f1185w1 = 0;
        this.f1186x1 = Integer.MAX_VALUE;
        this.f1187y1 = Integer.MAX_VALUE;
        this.f1188z1 = true;
        this.f1174A1 = 263;
        this.f1175B1 = null;
        this.f1176C1 = null;
        this.f1177D1 = -1;
        this.f1178E1 = new HashMap<>();
        this.f1179F1 = new SparseArray<>();
        this.f1180G1 = new C0281b(this);
        m936c(attributeSet, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f1181c = new SparseArray<>();
        this.f1182e = new ArrayList<>(4);
        this.f1183m = new C1714e();
        this.f1184s = 0;
        this.f1185w1 = 0;
        this.f1186x1 = Integer.MAX_VALUE;
        this.f1187y1 = Integer.MAX_VALUE;
        this.f1188z1 = true;
        this.f1174A1 = 263;
        this.f1175B1 = null;
        this.f1176C1 = null;
        this.f1177D1 = -1;
        this.f1178E1 = new HashMap<>();
        this.f1179F1 = new SparseArray<>();
        this.f1180G1 = new C0281b(this);
        m936c(attributeSet, i7);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i7, layoutParams);
    }

    /* renamed from: b */
    public final C1713d m935b(View view) {
        if (view == this) {
            return this.f1183m;
        }
        if (view == null) {
            return null;
        }
        return ((C0280a) view.getLayoutParams()).f1238l0;
    }

    /* renamed from: c */
    public final void m936c(AttributeSet attributeSet, int i7) {
        C1714e c1714e = this.f1183m;
        c1714e.f7772W = this;
        C0281b c0281b = this.f1180G1;
        c1714e.f7808h0 = c0281b;
        c1714e.f7807g0.f8214f = c0281b;
        this.f1181c.put(getId(), this);
        this.f1175B1 = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.f1264b, i7, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = obtainStyledAttributes.getIndex(i8);
                if (index == R$styleable.ConstraintLayout_Layout_android_minWidth) {
                    this.f1184s = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1184s);
                } else if (index == R$styleable.ConstraintLayout_Layout_android_minHeight) {
                    this.f1185w1 = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1185w1);
                } else if (index == R$styleable.ConstraintLayout_Layout_android_maxWidth) {
                    this.f1186x1 = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1186x1);
                } else if (index == R$styleable.ConstraintLayout_Layout_android_maxHeight) {
                    this.f1187y1 = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1187y1);
                } else if (index == R$styleable.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.f1174A1 = obtainStyledAttributes.getInt(index, this.f1174A1);
                } else if (index == R$styleable.ConstraintLayout_Layout_layoutDescription) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            this.f1176C1 = new C1862b(getContext(), resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f1176C1 = null;
                        }
                    }
                } else if (index == R$styleable.ConstraintLayout_Layout_constraintSet) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C0283b c0283b = new C0283b();
                        this.f1175B1 = c0283b;
                        c0283b.m952e(resourceId2, getContext());
                    } catch (Resources.NotFoundException unused2) {
                        this.f1175B1 = null;
                    }
                    this.f1177D1 = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        int i9 = this.f1174A1;
        c1714e.f7817q0 = i9;
        C1683d.f7572p = (i9 & Tools.Semaphore.f160S8) == 256;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0280a;
    }

    /* renamed from: d */
    public final boolean m937d() {
        return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<AbstractC0282a> arrayList = this.f1182e;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i7 = 0; i7 < size; i7++) {
                arrayList.get(i7).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = getChildAt(i8);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i9 = (int) ((parseInt / 1080.0f) * width);
                        int i10 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f7 = i9;
                        float f8 = i10;
                        float f9 = i9 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f7, f8, f9, f8, paint);
                        float parseInt4 = i10 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f9, f8, f9, parseInt4, paint);
                        canvas.drawLine(f9, parseInt4, f7, parseInt4, paint);
                        canvas.drawLine(f7, parseInt4, f7, f8, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f7, f8, f9, parseInt4, paint);
                        canvas.drawLine(f7, parseInt4, f9, f8, paint);
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public final void m938e(String str, Integer num) {
        if ((str instanceof String) && (num instanceof Integer)) {
            if (this.f1178E1 == null) {
                this.f1178E1 = new HashMap<>();
            }
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f1178E1.put(str, Integer.valueOf(num.intValue()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:274:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x031e  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m939f() {
        /*
            Method dump skipped, instructions count: 1377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.m939f():boolean");
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f1188z1 = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0280a();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0280a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0280a(layoutParams);
    }

    public int getMaxHeight() {
        return this.f1187y1;
    }

    public int getMaxWidth() {
        return this.f1186x1;
    }

    public int getMinHeight() {
        return this.f1185w1;
    }

    public int getMinWidth() {
        return this.f1184s;
    }

    public int getOptimizationLevel() {
        return this.f1183m.f7817q0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            C0280a c0280a = (C0280a) childAt.getLayoutParams();
            C1713d c1713d = c0280a.f1238l0;
            if ((childAt.getVisibility() != 8 || c0280a.f1213Y || c0280a.f1214Z || isInEditMode) && !c0280a.f1216a0) {
                int m4166m = c1713d.m4166m();
                int m4167n = c1713d.m4167n();
                int m4165l = c1713d.m4165l() + m4166m;
                int m4163j = c1713d.m4163j() + m4167n;
                childAt.layout(m4166m, m4167n, m4165l, m4163j);
                if ((childAt instanceof C0286e) && (content = ((C0286e) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(m4166m, m4167n, m4165l, m4163j);
                }
            }
        }
        ArrayList<AbstractC0282a> arrayList = this.f1182e;
        int size = arrayList.size();
        if (size > 0) {
            for (int i12 = 0; i12 < size; i12++) {
                arrayList.get(i12).getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0775  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0778  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x073a  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x072c  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ec A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01f6  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r29, int r30) {
        /*
            Method dump skipped, instructions count: 1917
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        C1713d m935b = m935b(view);
        if ((view instanceof C0285d) && !(m935b instanceof C1716g)) {
            C0280a c0280a = (C0280a) view.getLayoutParams();
            C1716g c1716g = new C1716g();
            c0280a.f1238l0 = c1716g;
            c0280a.f1213Y = true;
            c1716g.m4192B(c0280a.f1206R);
        }
        if (view instanceof AbstractC0282a) {
            AbstractC0282a abstractC0282a = (AbstractC0282a) view;
            abstractC0282a.m946g();
            ((C0280a) view.getLayoutParams()).f1214Z = true;
            ArrayList<AbstractC0282a> arrayList = this.f1182e;
            if (!arrayList.contains(abstractC0282a)) {
                arrayList.add(abstractC0282a);
            }
        }
        this.f1181c.put(view.getId(), view);
        this.f1188z1 = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f1181c.remove(view.getId());
        C1713d m935b = m935b(view);
        this.f1183m.f7881e0.remove(m935b);
        m935b.f7760K = null;
        this.f1182e.remove(view);
        this.f1188z1 = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f1188z1 = true;
        super.requestLayout();
    }

    public void setConstraintSet(C0283b c0283b) {
        this.f1175B1 = c0283b;
    }

    @Override // android.view.View
    public void setId(int i7) {
        int id = getId();
        SparseArray<View> sparseArray = this.f1181c;
        sparseArray.remove(id);
        super.setId(i7);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i7) {
        if (i7 == this.f1187y1) {
            return;
        }
        this.f1187y1 = i7;
        requestLayout();
    }

    public void setMaxWidth(int i7) {
        if (i7 == this.f1186x1) {
            return;
        }
        this.f1186x1 = i7;
        requestLayout();
    }

    public void setMinHeight(int i7) {
        if (i7 == this.f1185w1) {
            return;
        }
        this.f1185w1 = i7;
        requestLayout();
    }

    public void setMinWidth(int i7) {
        if (i7 == this.f1184s) {
            return;
        }
        this.f1184s = i7;
        requestLayout();
    }

    public void setOnConstraintsChanged(AbstractC1863c abstractC1863c) {
        C1862b c1862b = this.f1176C1;
        if (c1862b != null) {
            c1862b.getClass();
        }
    }

    public void setOptimizationLevel(int i7) {
        this.f1174A1 = i7;
        this.f1183m.f7817q0 = i7;
        C1683d.f7572p = (i7 & Tools.Semaphore.f160S8) == 256;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
