package p036e2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import java.util.ArrayList;

/* renamed from: e2.m5 */
/* loaded from: classes.dex */
public final class C1046m5 extends AbstractC1025j5 {

    /* renamed from: e */
    public final /* synthetic */ int f5251e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1046m5(int i7, Context context) {
        super(context, "ap_list3", "Create table if not exists ap_list3(_id Integer primary key AUTOINCREMENT,time VARCHAR(50),content TEXT);");
        this.f5251e = i7;
        if (i7 != 1) {
        } else {
            super(context, "app_trace3", "Create table if not exists app_trace3(_id Integer primary key AUTOINCREMENT,time VARCHAR(50),content TEXT);");
        }
    }

    @Override // p036e2.AbstractC1025j5
    /* renamed from: b */
    public final long mo3071b(String str, String str2) {
        switch (this.f5251e) {
            case 0:
                ContentValues contentValues = new ContentValues();
                contentValues.put("time", str);
                contentValues.put("content", str2);
                return m3070a(contentValues);
            default:
                C1039l5 c1039l5 = this.f5185c;
                Cursor query = c1039l5.f5243e.query(c1039l5.f5242c, null, "content=? ", new String[]{str2}, null, null, "time desc", "1");
                ArrayList m3122i = m3122i(query);
                if (query != null) {
                    query.close();
                }
                if (m3122i.size() != 0) {
                    return ((C1018i5) m3122i.get(0)).f5132a;
                }
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("time", str);
                contentValues2.put("content", str2);
                return m3070a(contentValues2);
        }
    }

    @Override // p036e2.AbstractC1025j5
    /* renamed from: d */
    public final ArrayList mo3073d(int i7, int i8) {
        switch (this.f5251e) {
            case 0:
                Cursor m3072c = m3072c(i7, i8);
                ArrayList m3122i = m3122i(m3072c);
                if (m3072c != null) {
                    m3072c.close();
                }
                return m3122i;
            default:
                Cursor m3072c2 = m3072c(i7, i8);
                ArrayList m3122i2 = m3122i(m3072c2);
                if (m3072c2 != null) {
                    m3072c2.close();
                }
                return m3122i2;
        }
    }

    @Override // p036e2.AbstractC1025j5
    /* renamed from: h */
    public final boolean mo3077h(long j7) {
        switch (this.f5251e) {
        }
        return m3075f(j7);
    }

    /* renamed from: i */
    public final ArrayList m3122i(Cursor cursor) {
        switch (this.f5251e) {
            case 0:
                ArrayList arrayList = new ArrayList();
                if (cursor != null && cursor.getCount() != 0) {
                    int columnIndex = cursor.getColumnIndex("_id");
                    int columnIndex2 = cursor.getColumnIndex("time");
                    int columnIndex3 = cursor.getColumnIndex("content");
                    while (cursor.moveToNext()) {
                        long j7 = cursor.getLong(columnIndex);
                        cursor.getString(columnIndex2);
                        arrayList.add(new C1018i5(j7, cursor.getString(columnIndex3)));
                    }
                }
                return arrayList;
            default:
                ArrayList arrayList2 = new ArrayList();
                if (cursor != null && cursor.getCount() != 0) {
                    int columnIndex4 = cursor.getColumnIndex("_id");
                    int columnIndex5 = cursor.getColumnIndex("time");
                    int columnIndex6 = cursor.getColumnIndex("content");
                    while (cursor.moveToNext()) {
                        long j8 = cursor.getLong(columnIndex4);
                        cursor.getString(columnIndex5);
                        arrayList2.add(new C1018i5(j8, cursor.getString(columnIndex6)));
                    }
                }
                return arrayList2;
        }
    }
}
