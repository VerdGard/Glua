package p036e2;

import android.annotation.SuppressLint;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* renamed from: e2.w1 */
/* loaded from: classes.dex */
public final class WindowCallbackC1112w1 implements Window.Callback {

    /* renamed from: c */
    public final Window.Callback f5512c;

    /* renamed from: e */
    public final a f5513e;

    /* renamed from: e2.w1$a */
    public interface a {
        /* renamed from: a */
        void mo3026a(KeyEvent keyEvent);

        /* renamed from: b */
        void mo3027b(MotionEvent motionEvent);
    }

    public WindowCallbackC1112w1(Window.Callback callback, a aVar) {
        this.f5512c = callback;
        this.f5513e = aVar;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f5512c.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        a aVar = this.f5513e;
        if (aVar != null) {
            aVar.mo3026a(keyEvent);
        }
        return this.f5512c.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f5512c.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f5512c.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        a aVar = this.f5513e;
        if (aVar != null) {
            aVar.mo3027b(motionEvent);
        }
        return this.f5512c.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f5512c.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f5512c.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f5512c.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f5512c.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        this.f5512c.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i7, Menu menu) {
        return this.f5512c.onCreatePanelMenu(i7, menu);
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i7) {
        return this.f5512c.onCreatePanelView(i7);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f5512c.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i7, MenuItem menuItem) {
        return this.f5512c.onMenuItemSelected(i7, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i7, Menu menu) {
        return this.f5512c.onMenuOpened(i7, menu);
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i7, Menu menu) {
        this.f5512c.onPanelClosed(i7, menu);
    }

    @Override // android.view.Window.Callback
    @SuppressLint({"NewApi"})
    public final void onPointerCaptureChanged(boolean z6) {
        this.f5512c.onPointerCaptureChanged(z6);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i7, View view, Menu menu) {
        return this.f5512c.onPreparePanel(i7, view, menu);
    }

    @Override // android.view.Window.Callback
    @SuppressLint({"NewApi"})
    public final void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i7) {
        this.f5512c.onProvideKeyboardShortcuts(list, menu, i7);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f5512c.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    @SuppressLint({"NewApi"})
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        boolean onSearchRequested;
        onSearchRequested = this.f5512c.onSearchRequested(searchEvent);
        return onSearchRequested;
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f5512c.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z6) {
        this.f5512c.onWindowFocusChanged(z6);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f5512c.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    @SuppressLint({"NewApi"})
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i7) {
        ActionMode onWindowStartingActionMode;
        onWindowStartingActionMode = this.f5512c.onWindowStartingActionMode(callback, i7);
        return onWindowStartingActionMode;
    }
}
