package p090l0;

import android.graphics.Rect;
import java.util.Comparator;
import p042f0.C1151g;
import p090l0.AbstractC1484a;

/* renamed from: l0.b */
/* loaded from: classes.dex */
public final class C1485b {

    /* renamed from: l0.b$a */
    public interface a<T> {
    }

    /* renamed from: l0.b$b */
    public static class b<T> implements Comparator<T> {

        /* renamed from: a */
        public final Rect f7066a = new Rect();

        /* renamed from: b */
        public final Rect f7067b = new Rect();

        /* renamed from: c */
        public final boolean f7068c;

        /* renamed from: d */
        public final a<T> f7069d;

        public b(boolean z6, AbstractC1484a.a aVar) {
            this.f7068c = z6;
            this.f7069d = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t8) {
            AbstractC1484a.a aVar = (AbstractC1484a.a) this.f7069d;
            aVar.getClass();
            Rect rect = this.f7066a;
            ((C1151g) t7).m3339d(rect);
            aVar.getClass();
            Rect rect2 = this.f7067b;
            ((C1151g) t8).m3339d(rect2);
            int i7 = rect.top;
            int i8 = rect2.top;
            if (i7 < i8) {
                return -1;
            }
            if (i7 > i8) {
                return 1;
            }
            int i9 = rect.left;
            int i10 = rect2.left;
            boolean z6 = this.f7068c;
            if (i9 < i10) {
                return z6 ? 1 : -1;
            }
            if (i9 > i10) {
                return z6 ? -1 : 1;
            }
            int i11 = rect.bottom;
            int i12 = rect2.bottom;
            if (i11 < i12) {
                return -1;
            }
            if (i11 > i12) {
                return 1;
            }
            int i13 = rect.right;
            int i14 = rect2.right;
            if (i13 < i14) {
                return z6 ? 1 : -1;
            }
            if (i13 > i14) {
                return z6 ? -1 : 1;
            }
            return 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r10.bottom <= r12.top) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0043, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0033, code lost:
    
        if (r10.right <= r12.left) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x003a, code lost:
    
        if (r10.top >= r12.bottom) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0041, code lost:
    
        if (r10.left >= r12.right) goto L24;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m3888a(int r9, android.graphics.Rect r10, android.graphics.Rect r11, android.graphics.Rect r12) {
        /*
            boolean r0 = m3889b(r9, r10, r11)
            boolean r1 = m3889b(r9, r10, r12)
            r2 = 0
            if (r1 != 0) goto L7d
            if (r0 != 0) goto Lf
            goto L7d
        Lf:
            r0 = 1
            java.lang.String r1 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r3 = 130(0x82, float:1.82E-43)
            r4 = 33
            r5 = 66
            r6 = 17
            if (r9 == r6) goto L3d
            if (r9 == r4) goto L36
            if (r9 == r5) goto L2f
            if (r9 != r3) goto L29
            int r7 = r10.bottom
            int r8 = r12.top
            if (r7 > r8) goto L45
            goto L43
        L29:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r1)
            throw r9
        L2f:
            int r7 = r10.right
            int r8 = r12.left
            if (r7 > r8) goto L45
            goto L43
        L36:
            int r7 = r10.top
            int r8 = r12.bottom
            if (r7 < r8) goto L45
            goto L43
        L3d:
            int r7 = r10.left
            int r8 = r12.right
            if (r7 < r8) goto L45
        L43:
            r7 = 1
            goto L46
        L45:
            r7 = 0
        L46:
            if (r7 != 0) goto L49
            return r0
        L49:
            if (r9 == r6) goto L7c
            if (r9 != r5) goto L4e
            goto L7c
        L4e:
            int r11 = m3891d(r9, r10, r11)
            if (r9 == r6) goto L6f
            if (r9 == r4) goto L6a
            if (r9 == r5) goto L65
            if (r9 != r3) goto L5f
            int r9 = r12.bottom
            int r10 = r10.bottom
            goto L73
        L5f:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r1)
            throw r9
        L65:
            int r9 = r12.right
            int r10 = r10.right
            goto L73
        L6a:
            int r9 = r10.top
            int r10 = r12.top
            goto L73
        L6f:
            int r9 = r10.left
            int r10 = r12.left
        L73:
            int r9 = r9 - r10
            int r9 = java.lang.Math.max(r0, r9)
            if (r11 >= r9) goto L7b
            r2 = 1
        L7b:
            return r2
        L7c:
            return r0
        L7d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p090l0.C1485b.m3888a(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    /* renamed from: b */
    public static boolean m3889b(int i7, Rect rect, Rect rect2) {
        if (i7 != 17) {
            if (i7 != 33) {
                if (i7 != 66) {
                    if (i7 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* renamed from: c */
    public static boolean m3890c(int i7, Rect rect, Rect rect2) {
        if (i7 == 17) {
            int i8 = rect.right;
            int i9 = rect2.right;
            return (i8 > i9 || rect.left >= i9) && rect.left > rect2.left;
        }
        if (i7 == 33) {
            int i10 = rect.bottom;
            int i11 = rect2.bottom;
            return (i10 > i11 || rect.top >= i11) && rect.top > rect2.top;
        }
        if (i7 == 66) {
            int i12 = rect.left;
            int i13 = rect2.left;
            return (i12 < i13 || rect.right <= i13) && rect.right < rect2.right;
        }
        if (i7 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i14 = rect.top;
        int i15 = rect2.top;
        return (i14 < i15 || rect.bottom <= i15) && rect.bottom < rect2.bottom;
    }

    /* renamed from: d */
    public static int m3891d(int i7, Rect rect, Rect rect2) {
        int i8;
        int i9;
        if (i7 == 17) {
            i8 = rect.left;
            i9 = rect2.right;
        } else if (i7 == 33) {
            i8 = rect.top;
            i9 = rect2.bottom;
        } else if (i7 == 66) {
            i8 = rect2.left;
            i9 = rect.right;
        } else {
            if (i7 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i8 = rect2.top;
            i9 = rect.bottom;
        }
        return Math.max(0, i8 - i9);
    }

    /* renamed from: e */
    public static int m3892e(int i7, Rect rect, Rect rect2) {
        int height;
        int i8;
        int height2;
        if (i7 != 17) {
            if (i7 != 33) {
                if (i7 != 66) {
                    if (i7 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            height = (rect.width() / 2) + rect.left;
            i8 = rect2.left;
            height2 = rect2.width();
            return Math.abs(height - ((height2 / 2) + i8));
        }
        height = (rect.height() / 2) + rect.top;
        i8 = rect2.top;
        height2 = rect2.height();
        return Math.abs(height - ((height2 / 2) + i8));
    }
}
