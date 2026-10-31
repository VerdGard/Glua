package p033e;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import p033e.C0904b;

/* renamed from: e.e */
/* loaded from: classes.dex */
public class C0907e extends C0904b {

    /* renamed from: C1 */
    public a f4770C1;

    /* renamed from: D1 */
    public boolean f4771D1;

    /* renamed from: e.e$a */
    public static class a extends C0904b.c {

        /* renamed from: H */
        public int[][] f4772H;

        public a(a aVar, C0907e c0907e, Resources resources) {
            super(aVar, c0907e, resources);
            if (aVar != null) {
                this.f4772H = aVar.f4772H;
            } else {
                this.f4772H = new int[this.f4736g.length][];
            }
        }

        @Override // p033e.C0904b.c
        /* renamed from: e */
        public void mo2614e() {
            int[][] iArr = this.f4772H;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[] iArr3 = this.f4772H[length];
                iArr2[length] = iArr3 != null ? (int[]) iArr3.clone() : null;
            }
            this.f4772H = iArr2;
        }

        /* renamed from: f */
        public final int m2626f(int[] iArr) {
            int[][] iArr2 = this.f4772H;
            int i7 = this.f4737h;
            for (int i8 = 0; i8 < i7; i8++) {
                if (StateSet.stateSetMatches(iArr2[i8], iArr)) {
                    return i8;
                }
            }
            return -1;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C0907e(this, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C0907e(this, resources);
        }
    }

    public C0907e() {
    }

    public C0907e(a aVar, Resources resources) {
        mo2610e(new a(aVar, this, resources));
        onStateChange(getState());
    }

    @Override // p033e.C0904b, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // p033e.C0904b
    /* renamed from: e */
    public void mo2610e(C0904b.c cVar) {
        this.f4713c = cVar;
        int i7 = this.f4712Z;
        if (i7 >= 0) {
            Drawable m2624d = cVar.m2624d(i7);
            this.f4715m = m2624d;
            if (m2624d != null) {
                m2619c(m2624d);
            }
        }
        this.f4716s = null;
        if (cVar instanceof a) {
            this.f4770C1 = (a) cVar;
        }
    }

    @Override // p033e.C0904b
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public a mo2609b() {
        return new a(this.f4770C1, this, null);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // p033e.C0904b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f4771D1) {
            super.mutate();
            this.f4770C1.mo2614e();
            this.f4771D1 = true;
        }
        return this;
    }

    @Override // p033e.C0904b, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int m2626f = this.f4770C1.m2626f(iArr);
        if (m2626f < 0) {
            m2626f = this.f4770C1.m2626f(StateSet.WILD_CARD);
        }
        return m2620d(m2626f) || onStateChange;
    }
}
