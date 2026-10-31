package p078j4;

import android.ext.C0089a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p054g4.AbstractC1242x;
import p054g4.C1226h;
import p054g4.C1231m;
import p054g4.C1234p;
import p078j4.C1423l;
import p094l4.C1509a;
import p110n4.C1644a;
import p117o4.C1667a;

/* renamed from: j4.k */
/* loaded from: classes.dex */
public final class C1422k extends C1423l.b {

    /* renamed from: e */
    public final /* synthetic */ boolean f6800e;

    /* renamed from: f */
    public final /* synthetic */ AbstractC1242x f6801f;

    /* renamed from: g */
    public final /* synthetic */ boolean f6802g;

    /* renamed from: h */
    public final /* synthetic */ boolean f6803h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1422k(String str, Field field, boolean z6, boolean z7, boolean z8, Method method, boolean z9, AbstractC1242x abstractC1242x, C1226h c1226h, C1644a c1644a, boolean z10, boolean z11) {
        super(str, field, z6, z7);
        this.f6800e = z8;
        this.f6801f = abstractC1242x;
        this.f6802g = z10;
        this.f6803h = z11;
    }

    @Override // p078j4.C1423l.b
    /* renamed from: a */
    public final void mo3788a(C1667a c1667a, int i7, Object[] objArr) {
        Object mo3442a = this.f6801f.mo3442a(c1667a);
        if (mo3442a != null || !this.f6802g) {
            objArr[i7] = mo3442a;
            return;
        }
        throw new C1234p("null is not allowed as value for record component '" + this.f6812c + "' of primitive type; at path " + c1667a.mo3775h());
    }

    @Override // p078j4.C1423l.b
    /* renamed from: b */
    public final void mo3789b(C1667a c1667a, Object obj) {
        Object mo3442a = this.f6801f.mo3442a(c1667a);
        if (mo3442a == null && this.f6802g) {
            return;
        }
        boolean z6 = this.f6800e;
        Field field = this.f6811b;
        if (z6) {
            C1423l.m3790b(obj, field);
        } else if (this.f6803h) {
            throw new C1231m(C0089a.m208f("Cannot set value of 'static final' ", C1509a.m3919d(field, false)));
        }
        field.set(obj, mo3442a);
    }
}
