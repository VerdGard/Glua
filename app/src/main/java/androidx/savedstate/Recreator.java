package androidx.savedstate;

import android.ext.C0089a;
import android.ext.C0091c;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0394f;
import androidx.lifecycle.InterfaceC0398i;
import androidx.lifecycle.InterfaceC0400k;
import androidx.savedstate.C0493a;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import p032d6.C0898f;
import p152t0.InterfaceC1920c;

/* loaded from: classes.dex */
public final class Recreator implements InterfaceC0398i {

    /* renamed from: a */
    public final InterfaceC1920c f2502a;

    public Recreator(InterfaceC1920c interfaceC1920c) {
        C0898f.m2606e(interfaceC1920c, "owner");
        this.f2502a = interfaceC1920c;
    }

    @Override // androidx.lifecycle.InterfaceC0398i
    /* renamed from: d */
    public final void mo357d(InterfaceC0400k interfaceC0400k, AbstractC0394f.a aVar) {
        if (aVar != AbstractC0394f.a.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        interfaceC0400k.mo354m().mo1374b(this);
        InterfaceC1920c interfaceC1920c = this.f2502a;
        Bundle m1819a = interfaceC1920c.mo350b().m1819a("androidx.savedstate.Restarter");
        if (m1819a == null) {
            return;
        }
        ArrayList<String> stringArrayList = m1819a.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for (String str : stringArrayList) {
            try {
                Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(C0493a.a.class);
                C0898f.m2605d(asSubclass, "{\n                Class.…class.java)\n            }");
                try {
                    Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object newInstance = declaredConstructor.newInstance(new Object[0]);
                        C0898f.m2605d(newInstance, "{\n                constr…wInstance()\n            }");
                        ((C0493a.a) newInstance).m1821a(interfaceC1920c);
                    } catch (Exception e7) {
                        throw new RuntimeException(C0089a.m208f("Failed to instantiate ", str), e7);
                    }
                } catch (NoSuchMethodException e8) {
                    throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e8);
                }
            } catch (ClassNotFoundException e9) {
                throw new RuntimeException(C0091c.m228f("Class ", str, " wasn't found"), e9);
            }
        }
    }
}
