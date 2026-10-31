package p020c3;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* renamed from: c3.b */
/* loaded from: classes.dex */
public final class C0608b extends FloatingActionButton.AbstractC0813a {

    /* renamed from: a */
    public final /* synthetic */ int f3017a;

    /* renamed from: b */
    public final /* synthetic */ BottomAppBar f3018b;

    /* renamed from: c3.b$a */
    public class a extends FloatingActionButton.AbstractC0813a {
        public a() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.AbstractC0813a
        /* renamed from: b */
        public final void mo2050b() {
            BottomAppBar bottomAppBar = C0608b.this.f3018b;
            int i7 = BottomAppBar.f3840y2;
            bottomAppBar.getClass();
        }
    }

    public C0608b(BottomAppBar bottomAppBar, int i7) {
        this.f3018b = bottomAppBar;
        this.f3017a = i7;
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.AbstractC0813a
    /* renamed from: a */
    public final void mo2049a(FloatingActionButton floatingActionButton) {
        floatingActionButton.setTranslationX(this.f3018b.m2290y(this.f3017a));
        floatingActionButton.m2455k(new a(), true);
    }
}
