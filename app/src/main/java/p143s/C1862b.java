package p143s;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C0283b;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R$styleable;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: s.b */
/* loaded from: classes.dex */
public final class C1862b {

    /* renamed from: a */
    public final SparseArray<a> f8368a = new SparseArray<>();

    /* renamed from: b */
    public final SparseArray<C0283b> f8369b = new SparseArray<>();

    /* renamed from: s.b$a */
    public static class a {

        /* renamed from: a */
        public final int f8370a;

        /* renamed from: b */
        public final ArrayList<b> f8371b = new ArrayList<>();

        /* renamed from: c */
        public final int f8372c;

        public a(Context context, XmlResourceParser xmlResourceParser) {
            this.f8372c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.f1270h);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                if (index == R$styleable.State_android_id) {
                    this.f8370a = obtainStyledAttributes.getResourceId(index, this.f8370a);
                } else if (index == R$styleable.State_constraints) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.f8372c);
                    this.f8372c = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    if ("layout".equals(resourceTypeName)) {
                        new C0283b().m951b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: s.b$b */
    public static class b {

        /* renamed from: a */
        public final float f8373a;

        /* renamed from: b */
        public final float f8374b;

        /* renamed from: c */
        public final float f8375c;

        /* renamed from: d */
        public final float f8376d;

        /* renamed from: e */
        public final int f8377e;

        public b(Context context, XmlResourceParser xmlResourceParser) {
            this.f8373a = Float.NaN;
            this.f8374b = Float.NaN;
            this.f8375c = Float.NaN;
            this.f8376d = Float.NaN;
            this.f8377e = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.f1272j);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                if (index == R$styleable.Variant_constraints) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.f8377e);
                    this.f8377e = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    if ("layout".equals(resourceTypeName)) {
                        new C0283b().m951b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                    }
                } else if (index == R$styleable.Variant_region_heightLessThan) {
                    this.f8376d = obtainStyledAttributes.getDimension(index, this.f8376d);
                } else if (index == R$styleable.Variant_region_heightMoreThan) {
                    this.f8374b = obtainStyledAttributes.getDimension(index, this.f8374b);
                } else if (index == R$styleable.Variant_region_widthLessThan) {
                    this.f8375c = obtainStyledAttributes.getDimension(index, this.f8375c);
                } else if (index == R$styleable.Variant_region_widthMoreThan) {
                    this.f8373a = obtainStyledAttributes.getDimension(index, this.f8373a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public C1862b(Context context, int i7) {
        char c7;
        XmlResourceParser xml = context.getResources().getXml(i7);
        try {
            a aVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c7 = 4;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c7 = 2;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                c7 = 1;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c7 = 0;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c7 = 3;
                                break;
                            }
                            c7 = 65535;
                            break;
                        default:
                            c7 = 65535;
                            break;
                    }
                    if (c7 != 0 && c7 != 1) {
                        if (c7 == 2) {
                            a aVar2 = new a(context, xml);
                            this.f8368a.put(aVar2.f8370a, aVar2);
                            aVar = aVar2;
                        } else if (c7 == 3) {
                            b bVar = new b(context, xml);
                            if (aVar != null) {
                                aVar.f8371b.add(bVar);
                            }
                        } else if (c7 != 4) {
                            Log.v("ConstraintLayoutStates", "unknown tag " + name);
                        } else {
                            m4394a(context, xml);
                        }
                    }
                }
            }
        } catch (IOException e7) {
            e7.printStackTrace();
        } catch (XmlPullParserException e8) {
            e8.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x01ce, code lost:
    
        continue;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4394a(android.content.Context r13, android.content.res.XmlResourceParser r14) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p143s.C1862b.m4394a(android.content.Context, android.content.res.XmlResourceParser):void");
    }
}
