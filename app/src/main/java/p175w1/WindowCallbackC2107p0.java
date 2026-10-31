package p175w1;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import com.so.revelation.lua.p024gg.InternalKeyboard;

/* renamed from: w1.p0 */
/* loaded from: classes.dex */
public final class WindowCallbackC2107p0 implements Window.Callback {

    /* renamed from: c */
    public final Window.Callback f9551c;

    /* renamed from: e */
    public InternalKeyboard f9552e = null;

    /* renamed from: m */
    public boolean f9553m = false;

    /* renamed from: s */
    public boolean f9554s = false;

    /* renamed from: X */
    public boolean f9550X = false;

    public WindowCallbackC2107p0(Window.Callback callback) {
        this.f9551c = callback;
    }

    @Override // android.view.Window.Callback
    @TargetApi(12)
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        try {
            return this.f9551c.dispatchGenericMotionEvent(motionEvent);
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        try {
            return this.f9551c.dispatchKeyEvent(keyEvent);
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // android.view.Window.Callback
    @TargetApi(11)
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        try {
            return this.f9551c.dispatchKeyShortcutEvent(keyEvent);
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f9551c.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return this.f9551c.dispatchTouchEvent(motionEvent);
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f9551c.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    @TargetApi(11)
    public final void onActionModeFinished(ActionMode actionMode) {
        if (this.f9550X) {
            return;
        }
        this.f9550X = true;
        try {
            this.f9551c.onActionModeFinished(actionMode);
            actionMode.finish();
        } finally {
            this.f9550X = false;
        }
    }

    @Override // android.view.Window.Callback
    @TargetApi(11)
    public final void onActionModeStarted(ActionMode actionMode) {
        if (this.f9554s) {
            return;
        }
        this.f9554s = true;
        try {
            this.f9551c.onActionModeStarted(actionMode);
        } finally {
            this.f9554s = false;
        }
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f9551c.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        this.f9551c.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i7, Menu menu) {
        return this.f9551c.onCreatePanelMenu(i7, menu);
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i7) {
        return this.f9551c.onCreatePanelView(i7);
    }

    @Override // android.view.Window.Callback
    @SuppressLint({"MissingSuperCall"})
    public final void onDetachedFromWindow() {
        this.f9551c.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i7, MenuItem menuItem) {
        return this.f9551c.onMenuItemSelected(i7, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i7, Menu menu) {
        return this.f9551c.onMenuOpened(i7, menu);
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i7, Menu menu) {
        this.f9551c.onPanelClosed(i7, menu);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i7, View view, Menu menu) {
        return this.f9551c.onPreparePanel(i7, view, menu);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f9551c.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    @TargetApi(23)
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        boolean onSearchRequested;
        onSearchRequested = this.f9551c.onSearchRequested(searchEvent);
        return onSearchRequested;
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        try {
            this.f9551c.onWindowAttributesChanged(layoutParams);
        } catch (IllegalArgumentException unused) {
        }
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z6) {
        try {
            this.f9551c.onWindowFocusChanged(z6);
        } catch (IllegalArgumentException unused) {
        }
        InternalKeyboard internalKeyboard = this.f9552e;
        if (internalKeyboard != null) {
            internalKeyboard.m2250c();
        }
    }

    @Override // android.view.Window.Callback
    @TargetApi(11)
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        ActionMode actionMode = null;
        if (this.f9553m) {
            return null;
        }
        this.f9553m = true;
        try {
            actionMode = this.f9551c.onWindowStartingActionMode(callback);
            if (actionMode != null) {
                return actionMode;
            }
            ViewOnClickListenerC2076a viewOnClickListenerC2076a = new ViewOnClickListenerC2076a(callback);
            try {
                if (callback.onCreateActionMode(viewOnClickListenerC2076a, viewOnClickListenerC2076a.f9466e)) {
                    viewOnClickListenerC2076a.invalidate();
                }
                return viewOnClickListenerC2076a;
            } catch (Throwable unused) {
                actionMode = viewOnClickListenerC2076a;
                this.f9553m = false;
                return actionMode;
            }
        } catch (Throwable unused2) {
        }
    }

    @Override // android.view.Window.Callback
    @TargetApi(23)
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i7) {
        ActionMode onWindowStartingActionMode;
        try {
            onWindowStartingActionMode = this.f9551c.onWindowStartingActionMode(callback, i7);
            return (onWindowStartingActionMode == null && i7 == 0) ? onWindowStartingActionMode(callback) : onWindowStartingActionMode;
        } catch (Throwable unused) {
            return null;
        }
    }
}
