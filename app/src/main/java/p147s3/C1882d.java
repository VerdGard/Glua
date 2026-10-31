package p147s3;

import android.content.Context;
import android.util.TypedValue;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import p022c5.C0641e;
import p022c5.C0642f;
import p023c6.InterfaceC0655a;
import p031d5.C0892c;
import p032d6.C0898f;
import p055g5.C1245b;
import p055g5.C1250g;
import p071i5.AbstractC1376m;
import p071i5.C1358b;
import p071i5.C1366f;
import p071i5.C1374k;
import p071i5.C1378o;
import p071i5.C1379p;
import p071i5.C1380q;
import p071i5.C1381r;
import p071i5.InterfaceC1356a;
import p132q4.AbstractC1786o;
import p132q4.C1773b0;
import p132q4.C1777f;
import p132q4.C1782k;
import p132q4.C1787p;
import p132q4.InterfaceC1788q;

/* renamed from: s3.d */
/* loaded from: classes.dex */
public final /* synthetic */ class C1882d implements InterfaceC1788q, C0641e.b, C1787p.a {

    /* renamed from: c */
    public final /* synthetic */ int f8426c;

    /* renamed from: e */
    public final /* synthetic */ Object f8427e;

    public /* synthetic */ C1882d(int i7, Object obj) {
        this.f8426c = i7;
        this.f8427e = obj;
    }

    @Override // p022c5.C0641e.b
    /* renamed from: a */
    public final void mo2156a(int i7, C0642f c0642f, C0892c c0892c) {
        C1250g c1250g = (C1250g) this.f8427e;
        c1250g.f6151m.put(i7, c0642f);
        c1250g.f6152n.put(i7, c0892c);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [i5.n] */
    /* JADX WARN: Type inference failed for: r6v0, types: [i5.n] */
    /* JADX WARN: Type inference failed for: r6v1, types: [i5.n] */
    @Override // p132q4.C1787p.a
    /* renamed from: c */
    public final void mo3554c(AbstractC1786o abstractC1786o) {
        C1378o c1378o = (C1378o) this.f8427e;
        C1777f c1777f = (C1777f) abstractC1786o;
        c1378o.getClass();
        C0898f.m2606e(c1777f, "event");
        ContextMenu contextMenu = c1777f.f8136c;
        C0898f.m2606e(contextMenu, "menu");
        C1245b c1245b = c1378o.f6698c;
        Context context = c1245b.getContext();
        C0898f.m2605d(context, "editor.context");
        ArrayList arrayList = new ArrayList();
        C1378o.a aVar = new C1378o.a(context);
        aVar.m3739a(android.R.string.copy);
        aVar.f6701c = c1245b.m3480W();
        final C1379p c1379p = new C1379p(c1378o);
        aVar.f6702d = new MenuItem.OnMenuItemClickListener() { // from class: i5.n
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                InterfaceC0655a interfaceC0655a = InterfaceC0655a.this;
                C0898f.m2606e(interfaceC0655a, "$listener");
                C0898f.m2606e(menuItem, "it");
                interfaceC0655a.mo373a();
                return true;
            }
        };
        arrayList.add(aVar);
        C1378o.a aVar2 = new C1378o.a(context);
        aVar2.m3739a(android.R.string.cut);
        aVar2.f6701c = c1245b.m3480W();
        final C1380q c1380q = new C1380q(c1378o);
        aVar2.f6702d = new MenuItem.OnMenuItemClickListener() { // from class: i5.n
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                InterfaceC0655a interfaceC0655a = InterfaceC0655a.this;
                C0898f.m2606e(interfaceC0655a, "$listener");
                C0898f.m2606e(menuItem, "it");
                interfaceC0655a.mo373a();
                return true;
            }
        };
        arrayList.add(aVar2);
        C1378o.a aVar3 = new C1378o.a(context);
        aVar3.m3739a(android.R.string.paste);
        aVar3.f6701c = c1245b.f5991C2.hasPrimaryClip();
        final C1381r c1381r = new C1381r(c1378o);
        aVar3.f6702d = new MenuItem.OnMenuItemClickListener() { // from class: i5.n
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                InterfaceC0655a interfaceC0655a = InterfaceC0655a.this;
                C0898f.m2606e(interfaceC0655a, "$listener");
                C0898f.m2606e(menuItem, "it");
                interfaceC0655a.mo373a();
                return true;
            }
        };
        arrayList.add(aVar3);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1378o.a aVar4 = (C1378o.a) it.next();
            aVar4.getClass();
            contextMenu.add(0, 0, 0, aVar4.f6700b).setEnabled(aVar4.f6701c).setOnMenuItemClickListener(aVar4.f6702d);
        }
    }

    /* JADX WARN: Type inference failed for: r9v14, types: [T, java.lang.Boolean] */
    @Override // p132q4.InterfaceC1788q
    /* renamed from: d */
    public final void mo2065d(AbstractC1786o abstractC1786o, C1773b0 c1773b0) {
        int i7 = this.f8426c;
        Object obj = this.f8427e;
        switch (i7) {
            case 1:
                ((C1787p.a) obj).mo3554c(abstractC1786o);
                break;
            default:
                C1374k c1374k = (C1374k) obj;
                C1782k c1782k = (C1782k) abstractC1786o;
                c1374k.getClass();
                if (c1782k.f8139e == 2 && !c1782k.f8141g) {
                    KeyEvent keyEvent = c1782k.f8138d;
                    if (!((keyEvent.getMetaState() & 4096) != 0) && !c1782k.f8140f && c1374k.m3617d()) {
                        int keyCode = keyEvent.getKeyCode();
                        C1358b c1358b = c1374k.f6680J1;
                        if (keyCode == 19) {
                            ListView listView = ((C1366f) c1374k.f6681K1).f6634a;
                            int i8 = c1374k.f6679I1 - 1;
                            if (i8 >= 0) {
                                c1374k.f6679I1 = i8;
                                ((AbstractC1376m) listView.getAdapter()).notifyDataSetChanged();
                                final int i9 = c1374k.f6679I1;
                                if (i9 != -1) {
                                    InterfaceC1356a interfaceC1356a = c1374k.f6681K1;
                                    final int applyDimension = (int) TypedValue.applyDimension(1, 45.0f, c1358b.f6695c.f6672B1.getContext().getResources().getDisplayMetrics());
                                    final C1366f c1366f = (C1366f) interfaceC1356a;
                                    c1366f.f6634a.post(new Runnable() { // from class: i5.d
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            C1366f c1366f2;
                                            int i10;
                                            int i11;
                                            while (true) {
                                                c1366f2 = C1366f.this;
                                                int firstVisiblePosition = c1366f2.f6634a.getFirstVisiblePosition() + 1;
                                                i10 = i9;
                                                i11 = applyDimension;
                                                if (firstVisiblePosition <= i10 || !c1366f2.f6634a.canScrollList(-1)) {
                                                    break;
                                                } else {
                                                    c1366f2.m3723a(i11 / 2);
                                                }
                                            }
                                            while (c1366f2.f6634a.getLastVisiblePosition() - 1 < i10 && c1366f2.f6634a.canScrollList(1)) {
                                                c1366f2.m3723a((-i11) / 2);
                                            }
                                        }
                                    });
                                }
                            }
                        } else if (keyCode == 20) {
                            ListView listView2 = ((C1366f) c1374k.f6681K1).f6634a;
                            if (c1374k.f6679I1 + 1 < listView2.getAdapter().getCount()) {
                                c1374k.f6679I1++;
                                ((AbstractC1376m) listView2.getAdapter()).notifyDataSetChanged();
                                final int i10 = c1374k.f6679I1;
                                if (i10 != -1) {
                                    InterfaceC1356a interfaceC1356a2 = c1374k.f6681K1;
                                    final int applyDimension2 = (int) TypedValue.applyDimension(1, 45.0f, c1358b.f6695c.f6672B1.getContext().getResources().getDisplayMetrics());
                                    final C1366f c1366f2 = (C1366f) interfaceC1356a2;
                                    c1366f2.f6634a.post(new Runnable() { // from class: i5.d
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            C1366f c1366f22;
                                            int i102;
                                            int i11;
                                            while (true) {
                                                c1366f22 = C1366f.this;
                                                int firstVisiblePosition = c1366f22.f6634a.getFirstVisiblePosition() + 1;
                                                i102 = i10;
                                                i11 = applyDimension2;
                                                if (firstVisiblePosition <= i102 || !c1366f22.f6634a.canScrollList(-1)) {
                                                    break;
                                                } else {
                                                    c1366f22.m3723a(i11 / 2);
                                                }
                                            }
                                            while (c1366f22.f6634a.getLastVisiblePosition() - 1 < i102 && c1366f22.f6634a.canScrollList(1)) {
                                                c1366f22.m3723a((-i11) / 2);
                                            }
                                        }
                                    });
                                }
                            }
                        } else if (keyCode == 93 || keyCode == 92) {
                            c1374k.m3733h();
                            break;
                        } else if ((keyCode != 61 && keyCode != 66) || !c1374k.m3735j(c1374k.f6679I1)) {
                        }
                        c1782k.f8157c = Boolean.TRUE;
                        c1782k.f8146b = 3;
                        break;
                    }
                }
                break;
        }
    }
}
