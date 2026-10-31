package p182x0;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;
import p173w.C2047i;
import p181x.C2155d;

/* renamed from: x0.f */
/* loaded from: classes.dex */
public final class C2170f {

    /* renamed from: x0.f$a */
    public static class a implements TypeEvaluator<C2155d.a[]> {

        /* renamed from: a */
        public C2155d.a[] f9816a;

        @Override // android.animation.TypeEvaluator
        public final C2155d.a[] evaluate(float f7, C2155d.a[] aVarArr, C2155d.a[] aVarArr2) {
            C2155d.a[] aVarArr3 = aVarArr;
            C2155d.a[] aVarArr4 = aVarArr2;
            if (!C2155d.m5273a(aVarArr3, aVarArr4)) {
                throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
            }
            if (!C2155d.m5273a(this.f9816a, aVarArr3)) {
                this.f9816a = C2155d.m5277e(aVarArr3);
            }
            for (int i7 = 0; i7 < aVarArr3.length; i7++) {
                C2155d.a aVar = this.f9816a[i7];
                C2155d.a aVar2 = aVarArr3[i7];
                C2155d.a aVar3 = aVarArr4[i7];
                aVar.getClass();
                aVar.f9769a = aVar2.f9769a;
                int i8 = 0;
                while (true) {
                    float[] fArr = aVar2.f9770b;
                    if (i8 < fArr.length) {
                        aVar.f9770b[i8] = (aVar3.f9770b[i8] * f7) + ((1.0f - f7) * fArr[i8]);
                        i8++;
                    }
                }
            }
            return this.f9816a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0335, code lost:
    
        r1 = new android.animation.Animator[r13.size()];
        r2 = r13.iterator();
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0344, code lost:
    
        if (r2.hasNext() == false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0346, code lost:
    
        r1[r14] = (android.animation.Animator) r2.next();
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0352, code lost:
    
        if (r33 != 0) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0354, code lost:
    
        r32.playTogether(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0358, code lost:
    
        r32.playSequentially(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x035b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0331, code lost:
    
        if (r32 == null) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0333, code lost:
    
        if (r13 == null) goto L178;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x030a  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.animation.Animator m5308a(android.content.Context r27, android.content.res.Resources r28, android.content.res.Resources.Theme r29, android.content.res.XmlResourceParser r30, android.util.AttributeSet r31, android.animation.AnimatorSet r32, int r33) {
        /*
            Method dump skipped, instructions count: 860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p182x0.C2170f.m5308a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, android.content.res.XmlResourceParser, android.util.AttributeSet, android.animation.AnimatorSet, int):android.animation.Animator");
    }

    /* renamed from: b */
    public static Keyframe m5309b(Keyframe keyframe, float f7) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f7) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f7) : Keyframe.ofObject(f7);
    }

    /* renamed from: c */
    public static PropertyValuesHolder m5310c(TypedArray typedArray, int i7, int i8, int i9, String str) {
        PropertyValuesHolder ofFloat;
        PropertyValuesHolder ofObject;
        TypedValue peekValue = typedArray.peekValue(i8);
        boolean z6 = peekValue != null;
        int i10 = z6 ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i9);
        boolean z7 = peekValue2 != null;
        int i11 = z7 ? peekValue2.type : 0;
        if (i7 == 4) {
            i7 = ((z6 && m5311d(i10)) || (z7 && m5311d(i11))) ? 3 : 0;
        }
        boolean z8 = i7 == 0;
        PropertyValuesHolder propertyValuesHolder = null;
        if (i7 != 2) {
            C2171g c2171g = i7 == 3 ? C2171g.f9817a : null;
            if (z8) {
                if (z6) {
                    float dimension = i10 == 5 ? typedArray.getDimension(i8, 0.0f) : typedArray.getFloat(i8, 0.0f);
                    if (z7) {
                        ofFloat = PropertyValuesHolder.ofFloat(str, dimension, i11 == 5 ? typedArray.getDimension(i9, 0.0f) : typedArray.getFloat(i9, 0.0f));
                    } else {
                        ofFloat = PropertyValuesHolder.ofFloat(str, dimension);
                    }
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, i11 == 5 ? typedArray.getDimension(i9, 0.0f) : typedArray.getFloat(i9, 0.0f));
                }
                propertyValuesHolder = ofFloat;
            } else if (z6) {
                int dimension2 = i10 == 5 ? (int) typedArray.getDimension(i8, 0.0f) : m5311d(i10) ? typedArray.getColor(i8, 0) : typedArray.getInt(i8, 0);
                if (z7) {
                    propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2, i11 == 5 ? (int) typedArray.getDimension(i9, 0.0f) : m5311d(i11) ? typedArray.getColor(i9, 0) : typedArray.getInt(i9, 0));
                } else {
                    propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2);
                }
            } else if (z7) {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i11 == 5 ? (int) typedArray.getDimension(i9, 0.0f) : m5311d(i11) ? typedArray.getColor(i9, 0) : typedArray.getInt(i9, 0));
            }
            if (propertyValuesHolder == null || c2171g == null) {
                return propertyValuesHolder;
            }
            propertyValuesHolder.setEvaluator(c2171g);
            return propertyValuesHolder;
        }
        String string = typedArray.getString(i8);
        String string2 = typedArray.getString(i9);
        C2155d.a[] m5275c = C2155d.m5275c(string);
        C2155d.a[] m5275c2 = C2155d.m5275c(string2);
        if (m5275c == null && m5275c2 == null) {
            return null;
        }
        if (m5275c == null) {
            if (m5275c2 != null) {
                return PropertyValuesHolder.ofObject(str, new a(), m5275c2);
            }
            return null;
        }
        a aVar = new a();
        if (m5275c2 == null) {
            ofObject = PropertyValuesHolder.ofObject(str, aVar, m5275c);
        } else {
            if (!C2155d.m5273a(m5275c, m5275c2)) {
                throw new InflateException(" Can't morph from " + string + " to " + string2);
            }
            ofObject = PropertyValuesHolder.ofObject(str, aVar, m5275c, m5275c2);
        }
        return ofObject;
    }

    /* renamed from: d */
    public static boolean m5311d(int i7) {
        return i7 >= 28 && i7 <= 31;
    }

    /* renamed from: e */
    public static ValueAnimator m5312e(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlResourceParser xmlResourceParser) {
        ValueAnimator valueAnimator;
        TypedArray typedArray;
        TypedArray typedArray2;
        ValueAnimator valueAnimator2;
        TypedArray m5080f = C2047i.m5080f(resources, theme, attributeSet, C2165a.f9796g);
        TypedArray m5080f2 = C2047i.m5080f(resources, theme, attributeSet, C2165a.f9800k);
        ValueAnimator valueAnimator3 = objectAnimator == null ? new ValueAnimator() : objectAnimator;
        long m5077c = C2047i.m5077c(m5080f, xmlResourceParser, "duration", 1, 300);
        int i7 = 0;
        long m5077c2 = C2047i.m5077c(m5080f, xmlResourceParser, "startOffset", 2, 0);
        int m5077c3 = C2047i.m5077c(m5080f, xmlResourceParser, "valueType", 7, 4);
        if (C2047i.m5079e(xmlResourceParser, "valueFrom") && C2047i.m5079e(xmlResourceParser, "valueTo")) {
            if (m5077c3 == 4) {
                TypedValue peekValue = m5080f.peekValue(5);
                boolean z6 = peekValue != null;
                int i8 = z6 ? peekValue.type : 0;
                TypedValue peekValue2 = m5080f.peekValue(6);
                boolean z7 = peekValue2 != null;
                m5077c3 = ((z6 && m5311d(i8)) || (z7 && m5311d(z7 ? peekValue2.type : 0))) ? 3 : 0;
            }
            PropertyValuesHolder m5310c = m5310c(m5080f, m5077c3, 5, 6, "");
            if (m5310c != null) {
                valueAnimator3.setValues(m5310c);
            }
        }
        valueAnimator3.setDuration(m5077c);
        valueAnimator3.setStartDelay(m5077c2);
        valueAnimator3.setRepeatCount(C2047i.m5077c(m5080f, xmlResourceParser, "repeatCount", 3, 0));
        valueAnimator3.setRepeatMode(C2047i.m5077c(m5080f, xmlResourceParser, "repeatMode", 4, 1));
        if (m5080f2 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator3;
            String m5078d = C2047i.m5078d(m5080f2, xmlResourceParser, "pathData", 1);
            if (m5078d != null) {
                String m5078d2 = C2047i.m5078d(m5080f2, xmlResourceParser, "propertyXName", 2);
                String m5078d3 = C2047i.m5078d(m5080f2, xmlResourceParser, "propertyYName", 3);
                if (m5078d2 == null && m5078d3 == null) {
                    throw new InflateException(m5080f2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path m5276d = C2155d.m5276d(m5078d);
                PathMeasure pathMeasure = new PathMeasure(m5276d, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float f7 = 0.0f;
                do {
                    f7 += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(f7));
                } while (pathMeasure.nextContour());
                PathMeasure pathMeasure2 = new PathMeasure(m5276d, false);
                int min = Math.min(100, ((int) (f7 / 0.5f)) + 1);
                float[] fArr = new float[min];
                float[] fArr2 = new float[min];
                float[] fArr3 = new float[2];
                float f8 = f7 / (min - 1);
                valueAnimator = valueAnimator3;
                typedArray = m5080f;
                int i9 = 0;
                float f9 = 0.0f;
                while (true) {
                    if (i7 >= min) {
                        break;
                    }
                    int i10 = min;
                    pathMeasure2.getPosTan(f9 - ((Float) arrayList.get(i9)).floatValue(), fArr3, null);
                    fArr[i7] = fArr3[0];
                    fArr2[i7] = fArr3[1];
                    f9 += f8;
                    int i11 = i9 + 1;
                    if (i11 < arrayList.size() && f9 > ((Float) arrayList.get(i11)).floatValue()) {
                        pathMeasure2.nextContour();
                        i9 = i11;
                    }
                    i7++;
                    min = i10;
                }
                PropertyValuesHolder ofFloat = m5078d2 != null ? PropertyValuesHolder.ofFloat(m5078d2, fArr) : null;
                PropertyValuesHolder ofFloat2 = m5078d3 != null ? PropertyValuesHolder.ofFloat(m5078d3, fArr2) : null;
                if (ofFloat == null) {
                    i7 = 0;
                    objectAnimator2.setValues(ofFloat2);
                } else {
                    i7 = 0;
                    if (ofFloat2 == null) {
                        objectAnimator2.setValues(ofFloat);
                    } else {
                        objectAnimator2.setValues(ofFloat, ofFloat2);
                    }
                }
            } else {
                valueAnimator = valueAnimator3;
                typedArray = m5080f;
                objectAnimator2.setPropertyName(C2047i.m5078d(m5080f2, xmlResourceParser, "propertyName", 0));
            }
        } else {
            valueAnimator = valueAnimator3;
            typedArray = m5080f;
        }
        if (C2047i.m5079e(xmlResourceParser, "interpolator")) {
            typedArray2 = typedArray;
            i7 = typedArray2.getResourceId(i7, i7);
        } else {
            typedArray2 = typedArray;
        }
        if (i7 > 0) {
            valueAnimator2 = valueAnimator;
            valueAnimator2.setInterpolator(AnimationUtils.loadInterpolator(context, i7));
        } else {
            valueAnimator2 = valueAnimator;
        }
        typedArray2.recycle();
        if (m5080f2 != null) {
            m5080f2.recycle();
        }
        return valueAnimator2;
    }
}
