package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.R$id;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;
import p074j0.AbstractC1399c;

/* renamed from: androidx.appcompat.widget.b1 */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0215b1 extends AbstractC1399c implements View.OnClickListener {

    /* renamed from: M1 */
    public static final /* synthetic */ int f802M1 = 0;

    /* renamed from: A1 */
    public final SearchableInfo f803A1;

    /* renamed from: B1 */
    public final Context f804B1;

    /* renamed from: C1 */
    public final WeakHashMap<String, Drawable.ConstantState> f805C1;

    /* renamed from: D1 */
    public final int f806D1;

    /* renamed from: E1 */
    public int f807E1;

    /* renamed from: F1 */
    public ColorStateList f808F1;

    /* renamed from: G1 */
    public int f809G1;

    /* renamed from: H1 */
    public int f810H1;

    /* renamed from: I1 */
    public int f811I1;

    /* renamed from: J1 */
    public int f812J1;

    /* renamed from: K1 */
    public int f813K1;

    /* renamed from: L1 */
    public int f814L1;

    /* renamed from: z1 */
    public final SearchView f815z1;

    /* renamed from: androidx.appcompat.widget.b1$a */
    public static final class a {

        /* renamed from: a */
        public final TextView f816a;

        /* renamed from: b */
        public final TextView f817b;

        /* renamed from: c */
        public final ImageView f818c;

        /* renamed from: d */
        public final ImageView f819d;

        /* renamed from: e */
        public final ImageView f820e;

        public a(View view) {
            this.f816a = (TextView) view.findViewById(android.R.id.text1);
            this.f817b = (TextView) view.findViewById(android.R.id.text2);
            this.f818c = (ImageView) view.findViewById(android.R.id.icon1);
            this.f819d = (ImageView) view.findViewById(android.R.id.icon2);
            this.f820e = (ImageView) view.findViewById(R$id.edit_query);
        }
    }

    public ViewOnClickListenerC0215b1(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout());
        this.f807E1 = 1;
        this.f809G1 = -1;
        this.f810H1 = -1;
        this.f811I1 = -1;
        this.f812J1 = -1;
        this.f813K1 = -1;
        this.f814L1 = -1;
        this.f815z1 = searchView;
        this.f803A1 = searchableInfo;
        this.f806D1 = searchView.getSuggestionCommitIconResId();
        this.f804B1 = context;
        this.f805C1 = weakHashMap;
    }

    /* renamed from: i */
    public static String m688i(Cursor cursor, int i7) {
        if (i7 == -1) {
            return null;
        }
        try {
            return cursor.getString(i7);
        } catch (Exception e7) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e7);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0133  */
    @Override // p074j0.AbstractC1397a
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo689b(android.view.View r21, android.database.Cursor r22) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ViewOnClickListenerC0215b1.mo689b(android.view.View, android.database.Cursor):void");
    }

    @Override // p074j0.AbstractC1397a
    /* renamed from: c */
    public final void mo690c(Cursor cursor) {
        try {
            super.mo690c(cursor);
            if (cursor != null) {
                this.f809G1 = cursor.getColumnIndex("suggest_text_1");
                this.f810H1 = cursor.getColumnIndex("suggest_text_2");
                this.f811I1 = cursor.getColumnIndex("suggest_text_2_url");
                this.f812J1 = cursor.getColumnIndex("suggest_icon_1");
                this.f813K1 = cursor.getColumnIndex("suggest_icon_2");
                this.f814L1 = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e7) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e7);
        }
    }

    @Override // p074j0.AbstractC1397a
    /* renamed from: d */
    public final String mo691d(Cursor cursor) {
        String m688i;
        String m688i2;
        if (cursor == null) {
            return null;
        }
        String m688i3 = m688i(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (m688i3 != null) {
            return m688i3;
        }
        SearchableInfo searchableInfo = this.f803A1;
        if (searchableInfo.shouldRewriteQueryFromData() && (m688i2 = m688i(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return m688i2;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (m688i = m688i(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return m688i;
    }

    @Override // p074j0.AbstractC1397a
    /* renamed from: e */
    public final View mo692e(ViewGroup viewGroup) {
        View inflate = this.f6746y1.inflate(this.f6744w1, viewGroup, false);
        inflate.setTag(new a(inflate));
        ((ImageView) inflate.findViewById(R$id.edit_query)).setImageResource(this.f806D1);
        return inflate;
    }

    /* renamed from: f */
    public final Drawable m693f(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f804B1.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (parseInt != 0) {
                return resourcesForApplication.getDrawable(parseInt);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x010e  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable m694g(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ViewOnClickListenerC0215b1.m694g(java.lang.String):android.graphics.drawable.Drawable");
    }

    @Override // p074j0.AbstractC1397a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i7, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i7, view, viewGroup);
        } catch (RuntimeException e7) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e7);
            View inflate = this.f6746y1.inflate(this.f6745x1, viewGroup, false);
            if (inflate != null) {
                ((a) inflate.getTag()).f816a.setText(e7.toString());
            }
            return inflate;
        }
    }

    @Override // p074j0.AbstractC1397a, android.widget.Adapter
    public final View getView(int i7, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i7, view, viewGroup);
        } catch (RuntimeException e7) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e7);
            View mo692e = mo692e(viewGroup);
            ((a) mo692e.getTag()).f816a.setText(e7.toString());
            return mo692e;
        }
    }

    /* renamed from: h */
    public final Cursor m695h(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        fragment.appendQueryParameter("limit", String.valueOf(50));
        return this.f804B1.getContentResolver().query(fragment.build(), null, suggestSelection, strArr, null);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f6739m;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f6739m;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f815z1.m610p((CharSequence) tag);
        }
    }
}
