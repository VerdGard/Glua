package p036e2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: e2.l5 */
/* loaded from: classes.dex */
public final class C1039l5 extends SQLiteOpenHelper {

    /* renamed from: c */
    public final String f5242c;

    /* renamed from: e */
    public SQLiteDatabase f5243e;

    public C1039l5(Context context, String str) {
        super(context, ".confd", (SQLiteDatabase.CursorFactory) null, 1);
        this.f5242c = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0013 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean m3113a() {
        /*
            r3 = this;
            monitor-enter(r3)
            android.database.sqlite.SQLiteDatabase r0 = r3.f5243e     // Catch: java.lang.Throwable -> L2f
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L8
            goto Le
        L8:
            boolean r0 = r0.isOpen()     // Catch: java.lang.Throwable -> L2f
            if (r0 != 0) goto L10
        Le:
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            if (r0 == 0) goto L22
            android.database.sqlite.SQLiteDatabase r0 = r3.getWritableDatabase()     // Catch: java.lang.NullPointerException -> L1a java.lang.Throwable -> L2f
            r3.f5243e = r0     // Catch: java.lang.NullPointerException -> L1a java.lang.Throwable -> L2f
            goto L22
        L1a:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L2f
            java.lang.String r1 = "db path is null"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L2f
            throw r0     // Catch: java.lang.Throwable -> L2f
        L22:
            android.database.sqlite.SQLiteDatabase r0 = r3.f5243e     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L2c
            boolean r0 = r0.isOpen()     // Catch: java.lang.Throwable -> L2f
            if (r0 != 0) goto L2d
        L2c:
            r1 = 0
        L2d:
            monitor-exit(r3)
            return r1
        L2f:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p036e2.C1039l5.m3113a():boolean");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final synchronized void close() {
        super.close();
        SQLiteDatabase sQLiteDatabase = this.f5243e;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.close();
            this.f5243e = null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final synchronized SQLiteDatabase getReadableDatabase() {
        return super.getReadableDatabase();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final synchronized SQLiteDatabase getWritableDatabase() {
        return super.getWritableDatabase();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        this.f5243e = sQLiteDatabase;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
    }
}
