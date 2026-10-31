package p091l1;

import android.content.DialogInterface;
import com.so.revelation.lua.EditorActivity;
import com.so.revelation.lua.p024gg.EditTextPath;
import java.io.File;

/* renamed from: l1.n */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC1500n implements DialogInterface.OnClickListener {

    /* renamed from: c */
    public final /* synthetic */ EditTextPath f7110c;

    /* renamed from: e */
    public final /* synthetic */ EditorActivity f7111e;

    public DialogInterfaceOnClickListenerC1500n(EditorActivity editorActivity, EditTextPath editTextPath) {
        this.f7111e = editorActivity;
        this.f7110c = editTextPath;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        File file = new File(this.f7110c.getText().toString());
        this.f7111e.m2196z(file.getAbsolutePath());
        EditorActivity.m2191w(file.getPath(), file.getName());
    }
}
