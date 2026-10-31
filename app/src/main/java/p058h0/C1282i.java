package p058h0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* renamed from: h0.i */
/* loaded from: classes.dex */
public final class C1282i {

    /* renamed from: a */
    public final c f6354a;

    /* renamed from: h0.i$a */
    public static final class a implements c {

        /* renamed from: a */
        public final InputContentInfo f6355a;

        public a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f6355a = new InputContentInfo(uri, clipDescription, uri2);
        }

        public a(Object obj) {
            this.f6355a = (InputContentInfo) obj;
        }

        @Override // p058h0.C1282i.c
        /* renamed from: a */
        public final ClipDescription mo3592a() {
            ClipDescription description;
            description = this.f6355a.getDescription();
            return description;
        }

        @Override // p058h0.C1282i.c
        /* renamed from: b */
        public final Object mo3593b() {
            return this.f6355a;
        }

        @Override // p058h0.C1282i.c
        /* renamed from: c */
        public final Uri mo3594c() {
            Uri contentUri;
            contentUri = this.f6355a.getContentUri();
            return contentUri;
        }

        @Override // p058h0.C1282i.c
        /* renamed from: d */
        public final void mo3595d() {
            this.f6355a.requestPermission();
        }

        @Override // p058h0.C1282i.c
        /* renamed from: e */
        public final Uri mo3596e() {
            Uri linkUri;
            linkUri = this.f6355a.getLinkUri();
            return linkUri;
        }
    }

    /* renamed from: h0.i$b */
    public static final class b implements c {

        /* renamed from: a */
        public final Uri f6356a;

        /* renamed from: b */
        public final ClipDescription f6357b;

        /* renamed from: c */
        public final Uri f6358c;

        public b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f6356a = uri;
            this.f6357b = clipDescription;
            this.f6358c = uri2;
        }

        @Override // p058h0.C1282i.c
        /* renamed from: a */
        public final ClipDescription mo3592a() {
            return this.f6357b;
        }

        @Override // p058h0.C1282i.c
        /* renamed from: b */
        public final Object mo3593b() {
            return null;
        }

        @Override // p058h0.C1282i.c
        /* renamed from: c */
        public final Uri mo3594c() {
            return this.f6356a;
        }

        @Override // p058h0.C1282i.c
        /* renamed from: d */
        public final void mo3595d() {
        }

        @Override // p058h0.C1282i.c
        /* renamed from: e */
        public final Uri mo3596e() {
            return this.f6358c;
        }
    }

    /* renamed from: h0.i$c */
    public interface c {
        /* renamed from: a */
        ClipDescription mo3592a();

        /* renamed from: b */
        Object mo3593b();

        /* renamed from: c */
        Uri mo3594c();

        /* renamed from: d */
        void mo3595d();

        /* renamed from: e */
        Uri mo3596e();
    }

    public C1282i(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f6354a = Build.VERSION.SDK_INT >= 25 ? new a(uri, clipDescription, uri2) : new b(uri, clipDescription, uri2);
    }

    public C1282i(a aVar) {
        this.f6354a = aVar;
    }
}
