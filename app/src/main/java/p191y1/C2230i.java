package p191y1;

import java.util.ArrayList;
import java.util.Objects;

/* renamed from: y1.i */
/* loaded from: classes.dex */
public final class C2230i {

    /* renamed from: a */
    public int f10131a = 0;

    /* renamed from: b */
    public boolean f10132b = false;

    /* renamed from: c */
    public ArrayList f10133c = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2230i.class != obj.getClass()) {
            return false;
        }
        C2230i c2230i = (C2230i) obj;
        return this.f10131a == c2230i.f10131a && this.f10132b == c2230i.f10132b;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f10131a), Boolean.valueOf(this.f10132b));
    }
}
