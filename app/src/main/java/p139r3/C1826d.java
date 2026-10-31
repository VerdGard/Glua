package p139r3;

import android.os.Build;
import android.view.View;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.C0117b;
import java.util.Objects;

/* renamed from: r3.d */
/* loaded from: classes.dex */
public final class C1826d {

    /* renamed from: a */
    public final a f8263a;

    /* renamed from: b */
    public final InterfaceC1824b f8264b;

    /* renamed from: c */
    public final View f8265c;

    /* renamed from: r3.d$a */
    public static class a {

        /* renamed from: a */
        public OnBackInvokedCallback f8266a;

        /* renamed from: a */
        public OnBackInvokedCallback mo4302a(final InterfaceC1824b interfaceC1824b) {
            Objects.requireNonNull(interfaceC1824b);
            return new OnBackInvokedCallback() { // from class: r3.c
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    InterfaceC1824b.this.mo2308a();
                }
            };
        }

        /* renamed from: b */
        public void m4303b(InterfaceC1824b interfaceC1824b, View view, boolean z6) {
            OnBackInvokedDispatcher findOnBackInvokedDispatcher;
            if (this.f8266a == null && (findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) != null) {
                OnBackInvokedCallback mo4302a = mo4302a(interfaceC1824b);
                this.f8266a = mo4302a;
                findOnBackInvokedDispatcher.registerOnBackInvokedCallback(z6 ? 1000000 : 0, mo4302a);
            }
        }

        /* renamed from: c */
        public void m4304c(View view) {
            OnBackInvokedDispatcher findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher();
            if (findOnBackInvokedDispatcher == null) {
                return;
            }
            findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f8266a);
            this.f8266a = null;
        }
    }

    /* renamed from: r3.d$b */
    public static class b extends a {

        /* renamed from: r3.d$b$a */
        public class a implements OnBackAnimationCallback {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC1824b f8267a;

            public a(InterfaceC1824b interfaceC1824b) {
                this.f8267a = interfaceC1824b;
            }

            @Override // android.window.OnBackAnimationCallback
            public final void onBackCancelled() {
                if (b.this.f8266a != null) {
                    this.f8267a.mo2311d();
                }
            }

            @Override // android.window.OnBackInvokedCallback
            public final void onBackInvoked() {
                this.f8267a.mo2308a();
            }

            @Override // android.window.OnBackAnimationCallback
            public final void onBackProgressed(BackEvent backEvent) {
                if (b.this.f8266a != null) {
                    this.f8267a.mo2310c(new C0117b(backEvent));
                }
            }

            @Override // android.window.OnBackAnimationCallback
            public final void onBackStarted(BackEvent backEvent) {
                if (b.this.f8266a != null) {
                    this.f8267a.mo2309b(new C0117b(backEvent));
                }
            }
        }

        @Override // p139r3.C1826d.a
        /* renamed from: a */
        public final OnBackInvokedCallback mo4302a(InterfaceC1824b interfaceC1824b) {
            return new a(interfaceC1824b);
        }
    }

    public <T extends View & InterfaceC1824b> C1826d(T t7) {
        T t8 = t7;
        int i7 = Build.VERSION.SDK_INT;
        this.f8263a = i7 >= 34 ? new b() : i7 >= 33 ? new a() : null;
        this.f8264b = t8;
        this.f8265c = t7;
    }
}
