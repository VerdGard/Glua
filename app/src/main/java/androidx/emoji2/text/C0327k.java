package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.util.SparseArray;
import android.view.KeyEvent;
import androidx.emoji2.text.C0323g;
import androidx.emoji2.text.C0331o;
import java.util.Arrays;
import p106n0.C1633a;

/* renamed from: androidx.emoji2.text.k */
/* loaded from: classes.dex */
public final class C0327k {

    /* renamed from: a */
    public final C0323g.i f1584a;

    /* renamed from: b */
    public final C0331o f1585b;

    /* renamed from: c */
    public final C0323g.d f1586c;

    /* renamed from: androidx.emoji2.text.k$a */
    public static final class a {

        /* renamed from: a */
        public int f1587a = 1;

        /* renamed from: b */
        public final C0331o.a f1588b;

        /* renamed from: c */
        public C0331o.a f1589c;

        /* renamed from: d */
        public C0331o.a f1590d;

        /* renamed from: e */
        public int f1591e;

        /* renamed from: f */
        public int f1592f;

        /* renamed from: g */
        public final boolean f1593g;

        /* renamed from: h */
        public final int[] f1594h;

        public a(C0331o.a aVar, boolean z6, int[] iArr) {
            this.f1588b = aVar;
            this.f1589c = aVar;
            this.f1593g = z6;
            this.f1594h = iArr;
        }

        /* renamed from: a */
        public final int m1115a(int i7) {
            SparseArray<C0331o.a> sparseArray = this.f1589c.f1612a;
            C0331o.a aVar = sparseArray == null ? null : sparseArray.get(i7);
            int i8 = 2;
            if (this.f1587a != 2) {
                if (aVar != null) {
                    this.f1587a = 2;
                    this.f1589c = aVar;
                    this.f1592f = 1;
                }
                m1116b();
                i8 = 1;
            } else if (aVar != null) {
                this.f1589c = aVar;
                this.f1592f++;
            } else {
                if (!(i7 == 65038)) {
                    if (!(i7 == 65039)) {
                        C0331o.a aVar2 = this.f1589c;
                        if (aVar2.f1613b != null) {
                            if (this.f1592f == 1) {
                                if (m1117c()) {
                                    aVar2 = this.f1589c;
                                }
                            }
                            this.f1590d = aVar2;
                            m1116b();
                            i8 = 3;
                        }
                    }
                }
                m1116b();
                i8 = 1;
            }
            this.f1591e = i7;
            return i8;
        }

        /* renamed from: b */
        public final void m1116b() {
            this.f1587a = 1;
            this.f1589c = this.f1588b;
            this.f1592f = 0;
        }

        /* renamed from: c */
        public final boolean m1117c() {
            int[] iArr;
            C1633a m1112c = this.f1589c.f1613b.m1112c();
            int m4005a = m1112c.m4005a(6);
            if ((m4005a == 0 || m1112c.f7462b.get(m4005a + m1112c.f7461a) == 0) ? false : true) {
                return true;
            }
            if (this.f1591e == 65039) {
                return true;
            }
            return this.f1593g && ((iArr = this.f1594h) == null || Arrays.binarySearch(iArr, this.f1589c.f1613b.m1110a(0)) < 0);
        }
    }

    public C0327k(C0331o c0331o, C0323g.i iVar, C0321e c0321e) {
        this.f1584a = iVar;
        this.f1585b = c0331o;
        this.f1586c = c0321e;
    }

    /* renamed from: a */
    public static boolean m1113a(Editable editable, KeyEvent keyEvent, boolean z6) {
        AbstractC0328l[] abstractC0328lArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!(selectionStart == -1 || selectionEnd == -1 || selectionStart != selectionEnd) && (abstractC0328lArr = (AbstractC0328l[]) editable.getSpans(selectionStart, selectionEnd, AbstractC0328l.class)) != null && abstractC0328lArr.length > 0) {
            for (AbstractC0328l abstractC0328l : abstractC0328lArr) {
                int spanStart = editable.getSpanStart(abstractC0328l);
                int spanEnd = editable.getSpanEnd(abstractC0328l);
                if ((z6 && spanStart == selectionStart) || ((!z6 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b5, code lost:
    
        if (r6 >= r7) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0102  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m1114b(java.lang.CharSequence r10, int r11, int r12, androidx.emoji2.text.C0326j r13) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.C0327k.m1114b(java.lang.CharSequence, int, int, androidx.emoji2.text.j):boolean");
    }
}
