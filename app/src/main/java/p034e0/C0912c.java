package p034e0;

import android.content.ClipData;
import android.ext.C0090b;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* renamed from: e0.c */
/* loaded from: classes.dex */
public final class C0912c {

    /* renamed from: a */
    public final e f4778a;

    /* renamed from: e0.c$a */
    public static final class a implements b {

        /* renamed from: a */
        public final ContentInfo.Builder f4779a;

        public a(ClipData clipData, int i7) {
            this.f4779a = new ContentInfo.Builder(clipData, i7);
        }

        @Override // p034e0.C0912c.b
        /* renamed from: a */
        public final void mo2663a(Uri uri) {
            this.f4779a.setLinkUri(uri);
        }

        @Override // p034e0.C0912c.b
        /* renamed from: b */
        public final void mo2664b(int i7) {
            this.f4779a.setFlags(i7);
        }

        @Override // p034e0.C0912c.b
        public final C0912c build() {
            ContentInfo build;
            build = this.f4779a.build();
            return new C0912c(new d(build));
        }

        @Override // p034e0.C0912c.b
        public final void setExtras(Bundle bundle) {
            this.f4779a.setExtras(bundle);
        }
    }

    /* renamed from: e0.c$b */
    public interface b {
        /* renamed from: a */
        void mo2663a(Uri uri);

        /* renamed from: b */
        void mo2664b(int i7);

        C0912c build();

        void setExtras(Bundle bundle);
    }

    /* renamed from: e0.c$c */
    public static final class c implements b {

        /* renamed from: a */
        public final ClipData f4780a;

        /* renamed from: b */
        public final int f4781b;

        /* renamed from: c */
        public int f4782c;

        /* renamed from: d */
        public Uri f4783d;

        /* renamed from: e */
        public Bundle f4784e;

        public c(ClipData clipData, int i7) {
            this.f4780a = clipData;
            this.f4781b = i7;
        }

        @Override // p034e0.C0912c.b
        /* renamed from: a */
        public final void mo2663a(Uri uri) {
            this.f4783d = uri;
        }

        @Override // p034e0.C0912c.b
        /* renamed from: b */
        public final void mo2664b(int i7) {
            this.f4782c = i7;
        }

        @Override // p034e0.C0912c.b
        public final C0912c build() {
            return new C0912c(new f(this));
        }

        @Override // p034e0.C0912c.b
        public final void setExtras(Bundle bundle) {
            this.f4784e = bundle;
        }
    }

    /* renamed from: e0.c$d */
    public static final class d implements e {

        /* renamed from: a */
        public final ContentInfo f4785a;

        public d(ContentInfo contentInfo) {
            contentInfo.getClass();
            this.f4785a = contentInfo;
        }

        @Override // p034e0.C0912c.e
        /* renamed from: a */
        public final ClipData mo2665a() {
            ClipData clip;
            clip = this.f4785a.getClip();
            return clip;
        }

        @Override // p034e0.C0912c.e
        /* renamed from: b */
        public final int mo2666b() {
            int flags;
            flags = this.f4785a.getFlags();
            return flags;
        }

        @Override // p034e0.C0912c.e
        /* renamed from: c */
        public final ContentInfo mo2667c() {
            return this.f4785a;
        }

        @Override // p034e0.C0912c.e
        /* renamed from: d */
        public final int mo2668d() {
            int source;
            source = this.f4785a.getSource();
            return source;
        }

        public final String toString() {
            return "ContentInfoCompat{" + this.f4785a + "}";
        }
    }

    /* renamed from: e0.c$e */
    public interface e {
        /* renamed from: a */
        ClipData mo2665a();

        /* renamed from: b */
        int mo2666b();

        /* renamed from: c */
        ContentInfo mo2667c();

        /* renamed from: d */
        int mo2668d();
    }

    /* renamed from: e0.c$f */
    public static final class f implements e {

        /* renamed from: a */
        public final ClipData f4786a;

        /* renamed from: b */
        public final int f4787b;

        /* renamed from: c */
        public final int f4788c;

        /* renamed from: d */
        public final Uri f4789d;

        /* renamed from: e */
        public final Bundle f4790e;

        public f(c cVar) {
            ClipData clipData = cVar.f4780a;
            clipData.getClass();
            this.f4786a = clipData;
            int i7 = cVar.f4781b;
            if (i7 < 0) {
                throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", "source", 0, 5));
            }
            if (i7 > 5) {
                throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", "source", 0, 5));
            }
            this.f4787b = i7;
            int i8 = cVar.f4782c;
            if ((i8 & 1) == i8) {
                this.f4788c = i8;
                this.f4789d = cVar.f4783d;
                this.f4790e = cVar.f4784e;
            } else {
                throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i8) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
            }
        }

        @Override // p034e0.C0912c.e
        /* renamed from: a */
        public final ClipData mo2665a() {
            return this.f4786a;
        }

        @Override // p034e0.C0912c.e
        /* renamed from: b */
        public final int mo2666b() {
            return this.f4788c;
        }

        @Override // p034e0.C0912c.e
        /* renamed from: c */
        public final ContentInfo mo2667c() {
            return null;
        }

        @Override // p034e0.C0912c.e
        /* renamed from: d */
        public final int mo2668d() {
            return this.f4787b;
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
            sb.append(this.f4786a.getDescription());
            sb.append(", source=");
            int i7 = this.f4787b;
            sb.append(i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? i7 != 5 ? String.valueOf(i7) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
            sb.append(", flags=");
            int i8 = this.f4788c;
            sb.append((i8 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i8));
            Uri uri = this.f4789d;
            if (uri == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + uri.toString().length() + ")";
            }
            sb.append(str);
            return C0090b.m220f(sb, this.f4790e != null ? ", hasExtras" : "", "}");
        }
    }

    public C0912c(e eVar) {
        this.f4778a = eVar;
    }

    public final String toString() {
        return this.f4778a.toString();
    }
}
