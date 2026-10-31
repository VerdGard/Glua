package p175w1;

import android.content.SharedPreferences;
import android.ext.C0090b;
import android.ext.Config;
import android.ext.Tools;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/* renamed from: w1.q */
/* loaded from: classes.dex */
public final class C2108q {

    /* renamed from: a */
    public static final LinkedList<C2113v> f9555a = new LinkedList<>();

    /* renamed from: b */
    public static int f9556b = 0;

    /* renamed from: a */
    public static void m5156a(String str, byte b7, int i7) {
        if (str == null || str.length() == 0 || "0".equals(str) || "-1".equals(str) || "1".equals(str)) {
            return;
        }
        C2113v c2113v = new C2113v(str, i7);
        ListIterator<C2113v> listIterator = f9555a.listIterator();
        int i8 = 0;
        while (listIterator.hasNext()) {
            C2113v next = listIterator.next();
            if (next.equals(c2113v)) {
                c2113v.f9578b = next.f9578b;
                listIterator.remove();
                int i9 = f9556b;
                if (i8 < i9) {
                    f9556b = i9 - 1;
                    if (b7 == 0) {
                        b7 = 1;
                    }
                }
            } else {
                i8++;
            }
        }
        if (b7 == 0) {
            b7 = 2;
        }
        if (b7 == 1) {
            f9555a.addFirst(c2113v);
            f9556b++;
        } else {
            m5157b();
            f9555a.add(f9556b, c2113v);
        }
        LinkedList<C2113v> linkedList = f9555a;
        int i10 = Config.historyLimit;
        if (linkedList.size() > i10) {
            for (int size = linkedList.size() - i10; size > 0; size--) {
                linkedList.removeLast();
            }
            m5157b();
        }
        m5158c();
    }

    /* renamed from: b */
    public static void m5157b() {
        int i7 = f9556b;
        if (i7 < 0) {
            f9556b = 0;
            return;
        }
        int size = f9555a.size();
        if (i7 > size) {
            f9556b = size;
        }
    }

    /* renamed from: c */
    public static void m5158c() {
        SharedPreferences sharedPreferences = Tools.getSharedPreferences();
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            Iterator<C2113v> it = f9555a.iterator();
            int i7 = 0;
            while (it.hasNext()) {
                C2113v next = it.next();
                edit.putString(C0090b.m219e("history-", i7), next.f9580d);
                String str = "h-" + i7;
                int i8 = next.f9579c;
                if (i8 == 1) {
                    edit.remove(str);
                } else {
                    edit.putInt(str, i8);
                }
                String m219e = C0090b.m219e("hi-", i7);
                String str2 = next.f9578b;
                if (str2.equals("...")) {
                    edit.remove(m219e);
                } else {
                    edit.putString(m219e, str2);
                }
                i7++;
            }
            if (i7 == 0) {
                edit.remove("history-size");
            } else {
                edit.putInt("history-size", i7);
            }
            int i9 = f9556b;
            if (i9 == 0) {
                edit.remove("history-sticked");
            } else {
                edit.putInt("history-sticked", i9);
            }
            edit.commit();
        }
    }
}
