package p175w1;

import android.content.Context;
import android.ext.Config;
import android.ext.Tools;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.DialogInterfaceC0151d;
import com.so.revelation.lua.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import p175w1.C2078b;

/* renamed from: w1.r */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC2109r extends BaseAdapter implements View.OnClickListener, View.OnLongClickListener, View.OnFocusChangeListener {

    /* renamed from: X */
    public static boolean f9557X = false;

    /* renamed from: c */
    public final Context f9558c;

    /* renamed from: e */
    public final ArrayList<C2102n> f9559e;

    /* renamed from: m */
    public DialogInterfaceC0151d f9560m = null;

    /* renamed from: s */
    public boolean f9561s = false;

    /* renamed from: w1.r$a */
    public class a implements TextWatcher {

        /* renamed from: c */
        public final /* synthetic */ b f9562c;

        public a(b bVar) {
            this.f9562c = bVar;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            b bVar = this.f9562c;
            C2102n c2102n = bVar.f9565b;
            if (c2102n != null) {
                ViewOnClickListenerC2109r.this.m5160b(c2102n.f9542a, bVar.f9567d.getText().toString(), false);
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        }
    }

    /* renamed from: w1.r$b */
    public class b {

        /* renamed from: a */
        public ImageView f9564a;

        /* renamed from: b */
        public C2102n f9565b;

        /* renamed from: c */
        public TextView f9566c;

        /* renamed from: d */
        public EditText f9567d;

        /* renamed from: e */
        public ImageView f9568e;

        /* renamed from: f */
        public int f9569f;

        /* renamed from: g */
        public TextView f9570g;

        /* renamed from: h */
        public View f9571h;
    }

    public ViewOnClickListenerC2109r(int i7, Context context) {
        this.f9558c = context;
        C2108q.m5157b();
        ArrayList<C2102n> arrayList = new ArrayList<>();
        this.f9559e = arrayList;
        int i8 = C2108q.f9556b;
        Iterator<C2113v> it = C2108q.f9555a.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            C2113v next = it.next();
            if (next != null && (next.f9579c & i7) != 0) {
                arrayList.add(new C2102n(next, i9 < i8));
            }
            i9++;
        }
    }

    /* renamed from: c */
    public static void m5159c(b bVar, int i7, int i8) {
        bVar.f9568e.setImageResource(i7);
        bVar.f9571h.setBackgroundColor(i8);
    }

    /* renamed from: b */
    public final void m5160b(C2113v c2113v, String str, boolean z6) {
        Iterator<C2113v> it = C2108q.f9555a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C2113v next = it.next();
            if (c2113v.equals(next)) {
                c2113v = next;
                break;
            }
        }
        String trim = str.trim();
        if (trim.length() == 0) {
            trim = "...";
        }
        if (trim.equals(c2113v.f9578b)) {
            return;
        }
        c2113v.f9578b = trim;
        if (z6) {
            notifyDataSetChanged();
        }
        C2108q.m5158c();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f9559e.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i7) {
        return this.f9559e.get(i7);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i7) {
        return i7;
    }

    @Override // android.widget.Adapter
    public final View getView(int i7, View view, ViewGroup viewGroup) {
        int i8;
        int i9 = 0;
        if (view == null || !(view.getTag() instanceof b)) {
            view = LayoutInflater.from(this.f9558c).inflate(2130968580, viewGroup, false);
            b bVar = new b();
            bVar.f9570g = (TextView) view.findViewById(R.layout.abc_tooltip);
            bVar.f9566c = (TextView) view.findViewById(R.layout.abcc);
            EditText editText = (EditText) view.findViewById(R.layout.activity_demo);
            bVar.f9567d = editText;
            editText.addTextChangedListener(new a(bVar));
            Tools.setOnFocusChangeListener(bVar.f9567d, this);
            ImageView iconSize = Config.setIconSize((ImageView) view.findViewById(R.layout.abc_select_dialog_material));
            bVar.f9568e = iconSize;
            iconSize.setOnClickListener(this);
            bVar.f9568e.setOnLongClickListener(this);
            bVar.f9568e.setTag(bVar);
            ImageView iconSize2 = Config.setIconSize((ImageView) view.findViewById(R.layout.activity_setting));
            bVar.f9564a = iconSize2;
            iconSize2.setOnClickListener(this);
            bVar.f9564a.setOnLongClickListener(this);
            bVar.f9564a.setTag(bVar);
            bVar.f9571h = view;
            view.setTag(bVar);
            view.setOnLongClickListener(this);
            view.setOnClickListener(this);
        }
        b bVar2 = (b) view.getTag();
        C2102n c2102n = this.f9559e.get(i7);
        bVar2.f9565b = c2102n;
        bVar2.f9570g.setText(c2102n.f9542a.f9580d);
        String str = c2102n.f9542a.f9578b;
        bVar2.f9566c.setText(str);
        EditText editText2 = bVar2.f9567d;
        String trim = str.trim();
        if ("...".equals(trim)) {
            trim = "";
        }
        editText2.setText(trim);
        bVar2.f9569f = i7;
        bVar2.f9566c.setVisibility(!f9557X ? 0 : 8);
        int i10 = f9557X ? 0 : 8;
        bVar2.f9567d.setVisibility(i10);
        bVar2.f9564a.setVisibility(i10);
        ((ViewGroup) view).setDescendantFocusability(f9557X ? 131072 : 393216);
        if (bVar2.f9565b.f9543b) {
            i8 = 2130837563;
            i9 = -2139864428;
        } else {
            i8 = 2130837564;
        }
        m5159c(bVar2, i8, i9);
        return view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7;
        AdapterView.OnItemClickListener onItemClickListener;
        DialogInterfaceC0151d dialogInterfaceC0151d;
        Window window;
        if (view != null) {
            int id = view.getId();
            int i8 = 0;
            if (id == R.layout.abc_action_mode_close_item_material) {
                boolean z6 = !f9557X;
                f9557X = z6;
                if (!z6 && this.f9561s && (dialogInterfaceC0151d = this.f9560m) != null && (window = dialogInterfaceC0151d.getWindow()) != null) {
                    Tools.externalKeyboard(window, view, false);
                    this.f9561s = false;
                }
                notifyDataSetChanged();
                return;
            }
            b bVar = (b) view.getTag();
            if (bVar != null) {
                int i9 = bVar.f9569f;
                if (id == R.layout.abc_select_dialog_material) {
                    C2102n c2102n = bVar.f9565b;
                    boolean z7 = !c2102n.f9543b;
                    c2102n.f9543b = z7;
                    if (z7) {
                        i7 = 2130837563;
                        i8 = -2139864428;
                    } else {
                        i7 = 2130837564;
                    }
                    m5159c(bVar, i7, i8);
                    C2113v c2113v = bVar.f9565b.f9542a;
                    C2108q.m5156a(c2113v.f9580d, z7 ? (byte) 1 : (byte) 2, c2113v.f9579c);
                    return;
                }
                if (id != R.layout.activity_setting) {
                    AdapterView<?> listView = Tools.getListView(view);
                    if (listView == null || (onItemClickListener = listView.getOnItemClickListener()) == null) {
                        return;
                    }
                    onItemClickListener.onItemClick(listView, view, i9, i9);
                    return;
                }
                C2113v c2113v2 = bVar.f9565b.f9542a;
                ListIterator<C2113v> listIterator = C2108q.f9555a.listIterator();
                while (listIterator.hasNext()) {
                    if (listIterator.next().equals(c2113v2)) {
                        listIterator.remove();
                        int i10 = C2108q.f9556b;
                        if (i8 < i10) {
                            C2108q.f9556b = i10 - 1;
                        }
                        this.f9559e.remove(bVar.f9565b);
                        notifyDataSetChanged();
                        C2108q.m5158c();
                        return;
                    }
                    i8++;
                }
            }
        }
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z6) {
        boolean z7;
        DialogInterfaceC0151d dialogInterfaceC0151d;
        Window window;
        if ((!z6 && f9557X) || this.f9561s == (z7 = z6 & f9557X) || (dialogInterfaceC0151d = this.f9560m) == null || (window = dialogInterfaceC0151d.getWindow()) == null) {
            return;
        }
        Tools.externalKeyboard(window, view, z7);
        this.f9561s = z7;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        b bVar;
        if (f9557X || view == null) {
            return false;
        }
        while (view != null) {
            Object tag = view.getTag();
            if (tag instanceof b) {
                bVar = (b) tag;
                break;
            }
            Object parent = view.getParent();
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        bVar = null;
        if (bVar == null) {
            return false;
        }
        C2113v c2113v = bVar.f9565b.f9542a;
        Context context = view.getContext();
        EditText editText = new EditText(context);
        String trim = c2113v.f9578b.trim();
        if ("...".equals(trim)) {
            trim = "";
        }
        editText.setText(trim);
        C2078b.a aVar = C2078b.f9472a;
        DialogInterfaceC0151d.a aVar2 = new DialogInterfaceC0151d.a(context);
        View customTitle = Tools.getCustomTitle(c2113v.f9580d);
        AlertController.C0145b c0145b = aVar2.f374a;
        c0145b.f346f = customTitle;
        c0145b.f359s = editText;
        aVar2.m486c("确定", new DialogInterfaceOnClickListenerC2110s(this, c2113v, editText));
        aVar2.m485b("确定", null);
        DialogInterfaceC0151d m484a = aVar2.m484a();
        C2078b.m5136c(m484a, new DialogInterfaceOnShowListenerC2111t(editText));
        C2078b.m5137d(m484a, editText);
        return true;
    }
}
