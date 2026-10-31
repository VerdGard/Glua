package p095l5;

import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import p055g5.C1245b;
import p132q4.C1774c;

/* renamed from: l5.a */
/* loaded from: classes.dex */
public class C1510a {

    /* renamed from: d */
    public static final C1510a f7133d = new C1510a(false);

    /* renamed from: a */
    public final SparseIntArray f7134a = new SparseIntArray();

    /* renamed from: b */
    public final ArrayList f7135b = new ArrayList();

    /* renamed from: c */
    public final boolean f7136c;

    public C1510a(boolean z6) {
        this.f7136c = z6;
        mo3925a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        if (r2 != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0042, code lost:
    
        if (r2 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0045, code lost:
    
        if (r2 != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00de, code lost:
    
        r1 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0049, code lost:
    
        if (r2 != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x006c, code lost:
    
        if (r2 != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00d8, code lost:
    
        if (r2 != false) goto L65;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo3925a() {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p095l5.C1510a.mo3925a():void");
    }

    /* renamed from: b */
    public final void m3926b(C1245b c1245b) {
        Objects.requireNonNull(c1245b);
        ArrayList arrayList = this.f7135b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() == c1245b) {
                return;
            }
        }
        arrayList.add(new WeakReference(c1245b));
        c1245b.f5988B1.m4244a(new C1774c(c1245b));
        c1245b.f6049e3.m3845a();
        c1245b.invalidate();
    }

    /* renamed from: c */
    public final int m3927c(int i7) {
        return this.f7134a.get(i7);
    }

    /* renamed from: d */
    public final void m3928d(int i7, int i8) {
        if (m3927c(i7) == i8) {
            return;
        }
        this.f7134a.put(i7, i8);
        Iterator it = this.f7135b.iterator();
        while (it.hasNext()) {
            C1245b c1245b = (C1245b) ((WeakReference) it.next()).get();
            if (c1245b == null) {
                it.remove();
            } else {
                c1245b.f5988B1.m4244a(new C1774c(c1245b));
                c1245b.f6049e3.m3845a();
                c1245b.invalidate();
            }
        }
    }
}
