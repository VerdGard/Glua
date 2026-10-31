package p043f1;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p083k1.C1447a;
import p200z2.C2279c;

/* renamed from: f1.h */
/* loaded from: classes.dex */
public abstract class AbstractC1163h implements InterfaceC1162g {

    /* renamed from: a */
    public final /* synthetic */ int f5719a;

    /* renamed from: b */
    public final Object f5720b;

    public AbstractC1163h() {
        this.f5719a = 3;
        this.f5720b = new Object[16];
    }

    public final String toString() {
        switch (this.f5719a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                List list = (List) this.f5720b;
                if (!list.isEmpty()) {
                    sb.append("values=");
                    sb.append(Arrays.toString(list.toArray()));
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC1163h(int i7) {
        this();
        this.f5719a = i7;
        if (i7 == 3) {
        } else {
            int i8 = C2279c.f10445a;
            this.f5720b = new ArrayDeque(20);
        }
    }

    public /* synthetic */ AbstractC1163h(int i7, Object obj) {
        this.f5719a = i7;
        this.f5720b = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC1163h(Object obj) {
        this(0, Collections.singletonList(new C1447a(obj)));
        this.f5719a = 0;
    }
}
