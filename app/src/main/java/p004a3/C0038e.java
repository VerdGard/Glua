package p004a3;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* renamed from: a3.e */
/* loaded from: classes.dex */
public final class C0038e extends Property<ImageView, Matrix> {

    /* renamed from: a */
    public final Matrix f116a;

    public C0038e() {
        super(Matrix.class, "imageMatrixProperty");
        this.f116a = new Matrix();
    }

    @Override // android.util.Property
    public final Matrix get(ImageView imageView) {
        Matrix matrix = this.f116a;
        matrix.set(imageView.getImageMatrix());
        return matrix;
    }

    @Override // android.util.Property
    public final void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
