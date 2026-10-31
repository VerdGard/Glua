package p087k5;

import android.graphics.RenderNode;
import java.util.Stack;
import p032d6.C0898f;
import p047f5.C1170a;
import p055g5.C1245b;

/* renamed from: k5.e */
/* loaded from: classes.dex */
public final class C1465e {

    /* renamed from: a */
    public final C1245b f6988a;

    /* renamed from: b */
    public final C1170a<a> f6989b;

    /* renamed from: c */
    public final Stack<a> f6990c;

    /* renamed from: k5.e$a */
    public static final class a {

        /* renamed from: a */
        public int f6991a;

        /* renamed from: b */
        public final RenderNode f6992b = new RenderNode("editorRenderNode");

        /* renamed from: c */
        public boolean f6993c = true;

        public a(int i7) {
            this.f6991a = i7;
        }
    }

    public C1465e(C1245b c1245b) {
        C0898f.m2606e(c1245b, "editor");
        this.f6988a = c1245b;
        this.f6989b = new C1170a<>(64);
        this.f6990c = new Stack<>();
    }
}
