package p036e2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import java.io.Closeable;
import java.util.ArrayList;

/* renamed from: e2.j5 */
/* loaded from: classes.dex */
public abstract class AbstractC1025j5 implements Closeable {

    /* renamed from: c */
    public final C1039l5 f5185c;

    public AbstractC1025j5(Context context, String str, String str2) {
        try {
            C1039l5 c1039l5 = new C1039l5(context, str);
            this.f5185c = c1039l5;
            if (context.getDatabasePath(".confd") != null) {
                c1039l5.getWritableDatabase().execSQL(str2);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final long m3070a(ContentValues contentValues) {
        C1039l5 c1039l5 = this.f5185c;
        return c1039l5.f5243e.insert(c1039l5.f5242c, null, contentValues);
    }

    /* renamed from: b */
    public abstract long mo3071b(String str, String str2);

    /* renamed from: c */
    public final Cursor m3072c(int i7, int i8) {
        String str = i8 + ", " + i7;
        C1039l5 c1039l5 = this.f5185c;
        return c1039l5.f5243e.query(c1039l5.f5242c, null, null, null, null, null, "time desc", str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            this.f5185c.close();
        } catch (Exception e7) {
            C1016i3.f5129e.m386n(e7);
        }
    }

    /* renamed from: d */
    public abstract ArrayList<C1018i5> mo3073d(int i7, int i8);

    /* renamed from: e */
    public final synchronized boolean m3074e() {
        try {
        } catch (Exception e7) {
            C1016i3.f5129e.m386n(e7);
            return false;
        }
        return this.f5185c.m3113a();
    }

    /* renamed from: f */
    public final boolean m3075f(long j7) {
        String[] strArr = {j7 + ""};
        C1039l5 c1039l5 = this.f5185c;
        return c1039l5.f5243e.delete(c1039l5.f5242c, "_id=? ", strArr) > 0;
    }

    /* renamed from: g */
    public final int m3076g() {
        C1039l5 c1039l5 = this.f5185c;
        c1039l5.getClass();
        Cursor cursor = null;
        try {
            cursor = c1039l5.f5243e.rawQuery("SELECT COUNT(*) FROM " + c1039l5.f5242c, null);
            int i7 = 0;
            if (cursor != null && cursor.moveToNext()) {
                i7 = cursor.getInt(0);
            }
            return i7;
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    /* renamed from: h */
    public abstract boolean mo3077h(long j7);
}
