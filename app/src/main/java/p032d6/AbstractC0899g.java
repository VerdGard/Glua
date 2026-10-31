package p032d6;

import java.io.Serializable;

/* renamed from: d6.g */
/* loaded from: classes.dex */
public abstract class AbstractC0899g implements Serializable {

    /* renamed from: c */
    public final /* synthetic */ int f4689c = 1;

    /* renamed from: e */
    public int f4690e;

    public AbstractC0899g() {
    }

    public String toString() {
        switch (this.f4689c) {
            case 0:
                C0901i.f4692a.getClass();
                String obj = getClass().getGenericInterfaces()[0].toString();
                if (obj.startsWith("kotlin.jvm.functions.")) {
                    obj = obj.substring(21);
                }
                C0898f.m2605d(obj, "renderLambdaToString(this)");
                return obj;
            default:
                return super.toString();
        }
    }

    public AbstractC0899g(int i7) {
        this.f4690e = i7;
    }
}
