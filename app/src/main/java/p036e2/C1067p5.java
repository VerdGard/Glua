package p036e2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import java.util.ArrayList;

/* renamed from: e2.p5 */
/* loaded from: classes.dex */
public final class C1067p5 extends AbstractC1025j5 {
    public C1067p5(Context context) {
        super(context, "app_list3", "Create table if not exists app_list3(_id Integer primary key AUTOINCREMENT,time VARCHAR(50),content TEXT);");
    }

    @Override // p036e2.AbstractC1025j5
    /* renamed from: b */
    public final long mo3071b(String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("time", str);
        contentValues.put("content", str2);
        return m3070a(contentValues);
    }

    @Override // p036e2.AbstractC1025j5
    /* renamed from: d */
    public final ArrayList<C1018i5> mo3073d(int i7, int i8) {
        Cursor m3072c = m3072c(i7, i8);
        ArrayList<C1018i5> arrayList = new ArrayList<>();
        if (m3072c != null && m3072c.getCount() != 0) {
            int columnIndex = m3072c.getColumnIndex("_id");
            int columnIndex2 = m3072c.getColumnIndex("time");
            int columnIndex3 = m3072c.getColumnIndex("content");
            while (m3072c.moveToNext()) {
                long j7 = m3072c.getLong(columnIndex);
                m3072c.getString(columnIndex2);
                arrayList.add(new C1018i5(j7, m3072c.getString(columnIndex3)));
            }
        }
        if (m3072c != null) {
            m3072c.close();
        }
        return arrayList;
    }

    @Override // p036e2.AbstractC1025j5
    /* renamed from: h */
    public final boolean mo3077h(long j7) {
        return m3075f(j7);
    }
}
