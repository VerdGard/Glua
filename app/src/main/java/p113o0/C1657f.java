package p113o0;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.emoji2.text.C0323g;

/* renamed from: o0.f */
/* loaded from: classes.dex */
public final class C1657f {

    /* renamed from: a */
    public final b f7502a;

    /* renamed from: o0.f$a */
    public static class a extends b {

        /* renamed from: a */
        public final TextView f7503a;

        /* renamed from: b */
        public final C1655d f7504b;

        /* renamed from: c */
        public boolean f7505c = true;

        public a(TextView textView) {
            this.f7503a = textView;
            this.f7504b = new C1655d(textView);
        }

        @Override // p113o0.C1657f.b
        /* renamed from: a */
        public final InputFilter[] mo4012a(InputFilter[] inputFilterArr) {
            if (!this.f7505c) {
                SparseArray sparseArray = new SparseArray(1);
                for (int i7 = 0; i7 < inputFilterArr.length; i7++) {
                    InputFilter inputFilter = inputFilterArr[i7];
                    if (inputFilter instanceof C1655d) {
                        sparseArray.put(i7, inputFilter);
                    }
                }
                if (sparseArray.size() == 0) {
                    return inputFilterArr;
                }
                int length = inputFilterArr.length;
                InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
                int i8 = 0;
                for (int i9 = 0; i9 < length; i9++) {
                    if (sparseArray.indexOfKey(i9) < 0) {
                        inputFilterArr2[i8] = inputFilterArr[i9];
                        i8++;
                    }
                }
                return inputFilterArr2;
            }
            int length2 = inputFilterArr.length;
            int i10 = 0;
            while (true) {
                C1655d c1655d = this.f7504b;
                if (i10 >= length2) {
                    InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                    System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                    inputFilterArr3[length2] = c1655d;
                    return inputFilterArr3;
                }
                if (inputFilterArr[i10] == c1655d) {
                    return inputFilterArr;
                }
                i10++;
            }
        }

        @Override // p113o0.C1657f.b
        /* renamed from: b */
        public final void mo4013b(boolean z6) {
            if (z6) {
                m4015d();
            }
        }

        @Override // p113o0.C1657f.b
        /* renamed from: c */
        public final void mo4014c(boolean z6) {
            this.f7505c = z6;
            m4015d();
            TextView textView = this.f7503a;
            textView.setFilters(mo4012a(textView.getFilters()));
        }

        /* renamed from: d */
        public final void m4015d() {
            TextView textView = this.f7503a;
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (this.f7505c) {
                if (!(transformationMethod instanceof C1659h) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                    transformationMethod = new C1659h(transformationMethod);
                }
            } else if (transformationMethod instanceof C1659h) {
                transformationMethod = ((C1659h) transformationMethod).f7512c;
            }
            textView.setTransformationMethod(transformationMethod);
        }
    }

    /* renamed from: o0.f$b */
    public static class b {
        /* renamed from: a */
        public InputFilter[] mo4012a(InputFilter[] inputFilterArr) {
            throw null;
        }

        /* renamed from: b */
        public void mo4013b(boolean z6) {
            throw null;
        }

        /* renamed from: c */
        public void mo4014c(boolean z6) {
            throw null;
        }
    }

    /* renamed from: o0.f$c */
    public static class c extends b {

        /* renamed from: a */
        public final a f7506a;

        public c(TextView textView) {
            this.f7506a = new a(textView);
        }

        @Override // p113o0.C1657f.b
        /* renamed from: a */
        public final InputFilter[] mo4012a(InputFilter[] inputFilterArr) {
            return (C0323g.f1557j != null) ^ true ? inputFilterArr : this.f7506a.mo4012a(inputFilterArr);
        }

        @Override // p113o0.C1657f.b
        /* renamed from: b */
        public final void mo4013b(boolean z6) {
            if (!(C0323g.f1557j != null)) {
                return;
            }
            this.f7506a.mo4013b(z6);
        }

        @Override // p113o0.C1657f.b
        /* renamed from: c */
        public final void mo4014c(boolean z6) {
            boolean z7 = !(C0323g.f1557j != null);
            a aVar = this.f7506a;
            if (z7) {
                aVar.f7505c = z6;
            } else {
                aVar.mo4014c(z6);
            }
        }
    }

    public C1657f(TextView textView) {
        if (textView == null) {
            throw new NullPointerException("textView cannot be null");
        }
        this.f7502a = new c(textView);
    }
}
