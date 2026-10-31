package com.so.revelation.lua;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p145s1.C1876c;
import p161u1.C1967a;
import p161u1.C1968b;

/* renamed from: com.so.revelation.lua.b */
/* loaded from: classes.dex */
public final class RunnableC0721b implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ EditorActivity f3639c;

    /* renamed from: com.so.revelation.lua.b$a */
    public class a implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ List f3640c;

        /* renamed from: com.so.revelation.lua.b$a$a, reason: collision with other inner class name */
        public class C2293a implements C1876c.b {
            public C2293a() {
            }
        }

        public a(ArrayList arrayList) {
            this.f3640c = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            RunnableC0721b runnableC0721b = RunnableC0721b.this;
            runnableC0721b.f3639c.f3294T1.setLayoutManager(new LinearLayoutManager(1));
            C1876c c1876c = new C1876c(this.f3640c, Arrays.asList(new C1968b(), new C1967a()));
            EditorActivity editorActivity = runnableC0721b.f3639c;
            editorActivity.f3295U1 = c1876c;
            C1876c c1876c2 = editorActivity.f3295U1;
            c1876c2.f8419f = new C2293a();
            editorActivity.f3294T1.setAdapter(c1876c2);
        }
    }

    public RunnableC0721b(EditorActivity editorActivity) {
        this.f3639c = editorActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EditorActivity editorActivity = this.f3639c;
        editorActivity.f3294T1.post(new a(editorActivity.f3291Q1.f102b.m4123i().f7893e.m4202S(editorActivity.f3291Q1.m121f())));
    }
}
