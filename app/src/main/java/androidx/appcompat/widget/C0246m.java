package androidx.appcompat.widget;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.appcompat.R$styleable;
import androidx.emoji2.text.C0323g;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p036e2.C1109v5;
import p036e2.InterfaceC0983d5;
import p076j2.InterfaceC1404a;
import p113o0.C1652a;
import p113o0.C1654c;
import p113o0.C1656e;
import p113o0.C1658g;

/* renamed from: androidx.appcompat.widget.m */
/* loaded from: classes.dex */
public class C0246m implements InterfaceC0983d5 {

    /* renamed from: a */
    public final Object f971a;

    /* renamed from: b */
    public final Object f972b;

    public /* synthetic */ C0246m() {
        this.f972b = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    }

    public /* synthetic */ C0246m(Resources resources, InterfaceC1404a interfaceC1404a) {
        this.f971a = resources;
        this.f972b = interfaceC1404a;
    }

    public /* synthetic */ C0246m(EditText editText) {
        this.f971a = editText;
        this.f972b = new C1652a(editText);
    }

    @Override // p036e2.InterfaceC0983d5
    /* renamed from: b */
    public final boolean mo847b(String str) {
        return ((TreeMap) this.f972b).containsKey(str);
    }

    @Override // p036e2.InterfaceC0983d5
    /* renamed from: c */
    public final String mo848c(String str) {
        String str2 = (String) ((TreeMap) this.f972b).get(str);
        return str2 == null ? "" : str2;
    }

    /* renamed from: d */
    public final void m849d(String str, String str2) {
        ((TreeMap) this.f972b).put(str, str2);
    }

    /* renamed from: e */
    public final Iterator m850e() {
        return Collections.unmodifiableSet(((TreeMap) this.f972b).keySet()).iterator();
    }

    /* renamed from: f */
    public final KeyListener m851f(KeyListener keyListener) {
        if (!(!(keyListener instanceof NumberKeyListener))) {
            return keyListener;
        }
        ((C1652a) this.f972b).f7488a.getClass();
        if (keyListener instanceof C1656e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new C1656e(keyListener);
    }

    /* renamed from: g */
    public final void m852g(AttributeSet attributeSet, int i7) {
        TypedArray obtainStyledAttributes = ((EditText) this.f971a).getContext().obtainStyledAttributes(attributeSet, R$styleable.f281i, i7, 0);
        try {
            int i8 = R$styleable.AppCompatTextView_emojiCompatEnabled;
            boolean z6 = obtainStyledAttributes.hasValue(i8) ? obtainStyledAttributes.getBoolean(i8, true) : true;
            obtainStyledAttributes.recycle();
            m854i(z6);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: h */
    public final InputConnection m853h(InputConnection inputConnection, EditorInfo editorInfo) {
        C1652a c1652a = (C1652a) this.f972b;
        if (inputConnection == null) {
            c1652a.getClass();
            return null;
        }
        C1652a.a aVar = c1652a.f7488a;
        aVar.getClass();
        return inputConnection instanceof C1654c ? inputConnection : new C1654c(aVar.f7489a, inputConnection, editorInfo);
    }

    /* renamed from: i */
    public final void m854i(boolean z6) {
        C1658g c1658g = ((C1652a) this.f972b).f7488a.f7490b;
        if (c1658g.f7510s != z6) {
            if (c1658g.f7509m != null) {
                C0323g m1102a = C0323g.m1102a();
                C1658g.a aVar = c1658g.f7509m;
                m1102a.getClass();
                C1109v5.m3253q(aVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = m1102a.f1558a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    m1102a.f1559b.remove(aVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            c1658g.f7510s = z6;
            if (z6) {
                C1658g.m4016a(c1658g.f7507c, C0323g.m1102a().m1103b());
            }
        }
    }
}
