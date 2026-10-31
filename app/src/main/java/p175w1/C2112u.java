package p175w1;

import android.inputmethodservice.KeyboardView;
import com.so.revelation.lua.p024gg.InternalKeyboard;

/* renamed from: w1.u */
/* loaded from: classes.dex */
public final class C2112u implements KeyboardView.OnKeyboardActionListener {

    /* renamed from: a */
    public final /* synthetic */ InternalKeyboard f9576a;

    public C2112u(InternalKeyboard internalKeyboard) {
        this.f9576a = internalKeyboard;
    }

    @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
    public final void onKey(int i7, int[] iArr) {
        this.f9576a.m2251d(i7);
    }

    @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
    public final void onPress(int i7) {
    }

    @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
    public final void onRelease(int i7) {
    }

    @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
    public final void onText(CharSequence charSequence) {
    }

    @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
    public final void swipeDown() {
    }

    @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
    public final void swipeLeft() {
    }

    @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
    public final void swipeRight() {
    }

    @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
    public final void swipeUp() {
    }
}
