package p049g;

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

/* renamed from: g.h */
/* loaded from: classes.dex */
public class WindowCallbackC1190h implements Window.Callback {

    /* renamed from: c */
    public final Window.Callback f5851c;

    /* renamed from: g.h$a */
    public static class a {
        /* renamed from: a */
        public static boolean m3404a(Window.Callback callback, SearchEvent searchEvent) {
            boolean onSearchRequested;
            onSearchRequested = callback.onSearchRequested(searchEvent);
            return onSearchRequested;
        }

        /* renamed from: b */
        public static ActionMode m3405b(Window.Callback callback, ActionMode.Callback callback2, int i7) {
            ActionMode onWindowStartingActionMode;
            onWindowStartingActionMode = callback.onWindowStartingActionMode(callback2, i7);
            return onWindowStartingActionMode;
        }
    }

    /* renamed from: g.h$b */
    public static class b {
        /* renamed from: a */
        public static void m3406a(Window.Callback callback, List<KeyboardShortcutGroup> list, Menu menu, int i7) {
            callback.onProvideKeyboardShortcuts(list, menu, i7);
        }
    }

    /* renamed from: g.h$c */
    public static class c {
        /* renamed from: a */
        public static void m3407a(Window.Callback callback, boolean z6) {
            callback.onPointerCaptureChanged(z6);
        }
    }

    public WindowCallbackC1190h(Window.Callback callback) {
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f5851c = callback;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f5851c.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f5851c.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f5851c.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f5851c.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f5851c.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f5851c.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f5851c.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f5851c.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f5851c.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int i7, Menu menu) {
        return this.f5851c.onCreatePanelMenu(i7, menu);
    }

    @Override // android.view.Window.Callback
    public View onCreatePanelView(int i7) {
        return this.f5851c.onCreatePanelView(i7);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f5851c.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i7, MenuItem menuItem) {
        return this.f5851c.onMenuItemSelected(i7, menuItem);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int i7, Menu menu) {
        return this.f5851c.onMenuOpened(i7, menu);
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int i7, Menu menu) {
        this.f5851c.onPanelClosed(i7, menu);
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z6) {
        c.m3407a(this.f5851c, z6);
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int i7, View view, Menu menu) {
        return this.f5851c.onPreparePanel(i7, view, menu);
    }

    @Override // android.view.Window.Callback
    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i7) {
        b.m3406a(this.f5851c, list, menu, i7);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f5851c.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return a.m3404a(this.f5851c, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f5851c.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z6) {
        this.f5851c.onWindowFocusChanged(z6);
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f5851c.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i7) {
        return a.m3405b(this.f5851c, callback, i7);
    }
}
