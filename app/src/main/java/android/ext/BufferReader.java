package android.ext;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public class BufferReader {
    private final ByteBuffer buffer;
    private final byte[] data;

    public BufferReader(byte[] bArr) {
        this.data = bArr;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        this.buffer = wrap;
        wrap.order(ByteOrder.LITTLE_ENDIAN);
    }

    public int getPosition() {
        return this.buffer.position();
    }

    public byte getSeq() {
        byte b7;
        int position = this.buffer.position();
        this.buffer.position(1);
        try {
            b7 = readByte();
        } catch (IOException e7) {
            Log.m178e("getSeq fail", e7);
            b7 = -1;
        }
        this.buffer.position(position);
        return b7;
    }

    public void read(byte[] bArr) {
        this.buffer.get(bArr);
    }

    public void read(byte[] bArr, int i7, int i8) {
        this.buffer.get(bArr, i7, i8);
    }

    public byte readByte() {
        return this.buffer.get();
    }

    public int readInt() {
        return this.buffer.getInt();
    }

    public long readLong() {
        return InOut.x64 ? this.buffer.getLong() : readInt() & 4294967295L;
    }

    public long readLongLong() {
        return this.buffer.getLong();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
    
        if (r2 != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String readString(int r7, java.lang.String r8) {
        /*
            r6 = this;
            if (r7 != 0) goto L5
            java.lang.String r7 = ""
            return r7
        L5:
            java.nio.ByteBuffer r0 = r6.buffer
            int r0 = r0.position()
            byte[] r1 = r6.data
            if (r8 == 0) goto L2b
            int r2 = r8.length()
            if (r2 != r7) goto L2b
            r2 = 0
            r3 = 0
        L17:
            if (r3 < r7) goto L1b
            r2 = 1
            goto L25
        L1b:
            char r4 = r8.charAt(r3)
            int r5 = r0 + r3
            r5 = r1[r5]
            if (r4 == r5) goto L28
        L25:
            if (r2 == 0) goto L2b
            goto L2c
        L28:
            int r3 = r3 + 1
            goto L17
        L2b:
            r8 = 0
        L2c:
            if (r8 != 0) goto L33
            java.lang.String r8 = new java.lang.String
            r8.<init>(r1, r0, r7)
        L33:
            java.nio.ByteBuffer r1 = r6.buffer
            int r0 = r0 + r7
            r1.position(r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: android.ext.BufferReader.readString(int, java.lang.String):java.lang.String");
    }

    public void reset() {
        this.buffer.position(2);
    }

    public int size() {
        return this.buffer.capacity();
    }

    public void skip(int i7) {
        ByteBuffer byteBuffer = this.buffer;
        byteBuffer.position(byteBuffer.position() + i7);
    }
}
