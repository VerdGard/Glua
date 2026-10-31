package android.ext;

import android.os.Build;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.zip.CRC32;
import p002a1.C0017d;

/* loaded from: classes.dex */
public class InOut {
    private static final int BUFFER_LEN = 10485760;
    private static final int CURRENT_INC = 1024;
    private static final int MAX_SIZE_WAIT = 40;
    public static final int QE_ALIGN = 4;
    public static volatile int byteOrderMask = 15;
    static boolean fifo;
    public static volatile int longSize;
    public static volatile boolean x64;
    private byte[] current;
    private int currentUsed;
    private final ByteBuffer readBuffer;
    private final byte[] readData;
    private volatile boolean started;
    private boolean truncate;
    private final ArrayList<byte[]> wait;
    private final ByteBuffer writeBuffer;
    private final byte[] writeData;
    private CRC32 crc = null;

    /* renamed from: in */
    private InputStream f149in = null;
    private OutputStream out = null;

    public static class DecodeInputStream extends InputStream {
        private static final int EMPTY = -2017;
        private static final int last = 112;
        private final InputStream base;
        private int prev = EMPTY;

        public DecodeInputStream(InputStream inputStream) {
            this.base = inputStream;
        }

        @Override // java.io.InputStream
        public int read() {
            int i7 = this.prev;
            if (i7 != EMPTY) {
                this.prev = EMPTY;
                return i7;
            }
            InputStream inputStream = this.base;
            int read = inputStream.read();
            if (read >= 97 && read <= 112) {
                int i8 = read - 97;
                int read2 = inputStream.read();
                if (read2 >= 97 && read2 <= 112) {
                    return ((read2 - 97) * 16) + i8;
                }
                this.prev = read2;
            }
            return read;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i7, int i8) {
            int i9;
            int i10 = i8 + i7;
            int i11 = this.prev;
            InputStream inputStream = this.base;
            while (i7 < i10) {
                while (true) {
                    i9 = EMPTY;
                    if (i11 != EMPTY) {
                        if (i11 != -1) {
                            break;
                        }
                        i11 = EMPTY;
                    }
                    int read = inputStream.read();
                    if (read >= 97 && read <= 112) {
                        int i12 = read - 97;
                        int read2 = inputStream.read();
                        if (read2 >= 97 && read2 <= 112) {
                            int i13 = i12 + ((read2 - 97) * 16);
                            i9 = i11;
                            i11 = i13;
                            break;
                        }
                        i11 = read2;
                    }
                }
                bArr[i7] = (byte) i11;
                i7++;
                i11 = i9;
            }
            this.prev = i11;
            return 0;
        }
    }

    public static class EncodeOutputStream extends OutputStream {
        private final OutputStream base;

        public EncodeOutputStream(OutputStream outputStream) {
            this.base = outputStream;
        }

        private byte[] getBuf(byte[] bArr, int i7, int i8) {
            int i9 = i8 * 2;
            byte[] bArr2 = new byte[i9 + 4];
            bArr2[0] = 59;
            bArr2[1] = 59;
            for (int i10 = 0; i10 < i8; i10++) {
                byte b7 = bArr[i7 + i10];
                int i11 = (i10 * 2) + 2;
                bArr2[i11 + 0] = (byte) getChar(b7 & 15);
                bArr2[i11 + 1] = (byte) getChar((b7 & 240) >> 4);
            }
            int i12 = i9 + 2;
            bArr2[i12 + 0] = 10;
            bArr2[i12 + 1] = 10;
            return bArr2;
        }

        private int getChar(int i7) {
            return (i7 < 0 || i7 > 15) ? i7 : i7 + 97;
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            this.base.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i7) {
            this.base.write(getChar(i7 & 15));
            this.base.write(getChar((i7 & 240) >> 4));
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            this.base.write(getBuf(bArr, 0, bArr.length));
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i7, int i8) {
            this.base.write(getBuf(bArr, i7, i8));
        }
    }

    static {
        try {
            String[] strArr = Build.SUPPORTED_64_BIT_ABIS;
            if (strArr != null) {
                int length = strArr.length;
            }
        } catch (Throwable unused) {
        }
        setX64(false);
        fifo = false;
    }

    public InOut() {
        byte[] bArr = new byte[4];
        this.readData = bArr;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        this.readBuffer = wrap;
        byte[] bArr2 = new byte[8];
        this.writeData = bArr2;
        ByteBuffer wrap2 = ByteBuffer.wrap(bArr2);
        this.writeBuffer = wrap2;
        this.current = new byte[CURRENT_INC];
        this.wait = new ArrayList<>();
        this.started = false;
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        wrap.order(byteOrder);
        wrap2.order(byteOrder);
    }

    public static String bytesToHex(byte[] bArr, int i7, int i8) {
        if (bArr.length - 1 < i7) {
            android.util.Log.w("bytesToHex failed: ", (bArr.length + 32 + i7 + 32 + i8) + "");
            return "";
        }
        if (bArr.length < i7 + i8) {
            android.util.Log.w("bytesToHex fix len: ", (bArr.length + 32 + i7 + 32 + i8) + "");
            i8 = bArr.length - i7;
        }
        char[] cArr = new char[i8 * 3];
        char[] cArr2 = C0017d.f34v;
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = bArr[i7 + i9] & 255;
            int i11 = i9 * 3;
            cArr[i11 + 0] = cArr2[i10 >>> 4];
            cArr[i11 + 1] = cArr2[i10 & 15];
            cArr[i11 + 2] = ' ';
        }
        return new String(cArr);
    }

    private void checkSize(int i7, boolean z6) {
        byte[] bArr = this.current;
        int i8 = this.currentUsed;
        int i9 = i7 + i8;
        if (i9 > bArr.length || z6) {
            byte[] bArr2 = new byte[i9 + CURRENT_INC];
            if (i8 > 0) {
                System.arraycopy(bArr, 0, bArr2, 0, i8);
            }
            this.current = bArr2;
        }
    }

    private void debug(String str, byte[] bArr, int i7) {
        android.util.Log.d("jj", String.valueOf(str) + ": [" + i7 + "] " + bytesToHex(bArr, 0, i7));
    }

    public static String dump(byte[] bArr, int i7, int i8) {
        if (bArr.length - 1 < i7) {
            android.util.Log.w("dump failed: ", (bArr.length + 32 + i7 + 32 + i8) + "");
            return "";
        }
        if (bArr.length < i7 + i8) {
            android.util.Log.w("dump fix len: ", (bArr.length + 32 + i7 + 32 + i8) + "");
            i8 = bArr.length - i7;
        }
        StringBuilder sb = new StringBuilder();
        int i9 = i7;
        while (i9 < i8) {
            int i10 = i8 - i9;
            if (i10 > 32) {
                i10 = 32;
            }
            int i11 = i7 + i9;
            sb.append(bytesToHex(bArr, i11, i10));
            sb.append('\'');
            sb.append(new String(bArr, i11, i10));
            sb.append("'\n");
            i9 += i10;
        }
        return sb.toString();
    }

    private byte readByte() {
        int read;
        do {
            read = this.f149in.read();
        } while (read == -1);
        return (byte) read;
    }

    private int readInt() {
        int read;
        int i7 = 0;
        while (i7 < 4 && (read = this.f149in.read(this.readData, i7, 4 - i7)) > 0) {
            i7 += read;
        }
        return this.readBuffer.getInt(0);
    }

    public static void setX64(boolean z6) {
        x64 = z6;
        longSize = z6 ? 8 : 4;
    }

    public void clear() {
        this.currentUsed = 0;
    }

    public long crc() {
        if (this.currentUsed < 2) {
            return 0L;
        }
        CRC32 crc32 = this.crc;
        if (crc32 == null) {
            crc32 = new CRC32();
            this.crc = crc32;
        } else {
            crc32.reset();
        }
        crc32.update(this.current, 2, this.currentUsed);
        return crc32.getValue();
    }

    public boolean isStarted() {
        return this.started;
    }

    public byte[] readPacket() {
        String str;
        String str2;
        byte[] bArr = null;
        int i7 = 0;
        while (true) {
            byte readByte = readByte();
            if (readByte == 2) {
                break;
            }
            if (bArr != null || (readByte != 10 && readByte != 59)) {
                if (bArr == null) {
                    bArr = new byte[4096];
                }
                if (i7 < bArr.length) {
                    bArr[i7] = readByte;
                }
                i7++;
                if (i7 >= bArr.length || i7 % 10 == 0) {
                    android.util.Log.d("Bad input from daemon: ", (readByte + 10) + dump(bArr, 0, i7));
                }
            }
        }
        if (bArr != null) {
            android.util.Log.d("123", "10" + dump(bArr, 0, i7));
        }
        int readInt = readInt();
        if (readInt > BUFFER_LEN || readInt < 2) {
            str = (readInt + 32) + dump(this.readData, 0, 4);
            str2 = "Bad len from daemon: ";
        } else {
            byte[] bArr2 = new byte[readInt];
            int i8 = 0;
            while (true) {
                if (i8 < readInt) {
                    int read = this.f149in.read(bArr2, i8, readInt - i8);
                    if (read <= 0) {
                        break;
                    }
                    i8 += read;
                }
            }
            if (i8 == 0) {
                i8 = -1;
            }
            int i9 = readInt - 1;
            if (bArr2[i9] == 3) {
                return bArr2;
            }
            str = ((int) bArr2[i9]) + "; " + ((int) bArr2[0]) + "; " + i9 + "; " + i8;
            str2 = "Bad end from daemon: ";
        }
        android.util.Log.d(str2, str);
        return null;
    }

    public synchronized void send() {
        if (this.started) {
            sendWait();
            this.out.write(this.current, 0, this.currentUsed);
            this.out.flush();
        } else if (this.currentUsed > 0) {
            synchronized (this.wait) {
                this.wait.add(Arrays.copyOf(this.current, this.currentUsed));
                if (this.wait.size() > 40) {
                    this.wait.remove(0);
                }
            }
        }
        this.currentUsed = 0;
    }

    public void sendWait() {
        ArrayList<byte[]> arrayList = this.wait;
        synchronized (arrayList) {
            if (arrayList.size() > 0) {
                OutputStream outputStream = this.out;
                Iterator<byte[]> it = arrayList.iterator();
                while (it.hasNext()) {
                    outputStream.write(it.next());
                    outputStream.flush();
                }
                arrayList.clear();
                arrayList.trimToSize();
            }
        }
    }

    public void setStarted(boolean z6) {
        this.started = z6;
    }

    public void setStreams(InputStream inputStream, OutputStream outputStream) {
        InputStream bufferedInputStream = new BufferedInputStream(inputStream, 65536);
        if (!fifo) {
            EncodeOutputStream encodeOutputStream = new EncodeOutputStream(outputStream);
            bufferedInputStream = new DecodeInputStream(bufferedInputStream);
            outputStream = encodeOutputStream;
        }
        this.f149in = bufferedInputStream;
        this.out = outputStream;
    }

    public void startMessage(byte b7, byte b8, int i7) {
        checkSize(i7 + 2, this.truncate);
        this.truncate = false;
        byte[] bArr = this.current;
        bArr[0] = b8;
        bArr[1] = b7;
        this.currentUsed = 2;
    }

    public void truncate() {
        if (this.current.length > 65536) {
            this.truncate = true;
        }
    }

    public void writeByte(byte b7) {
        checkSize(1, false);
        byte[] bArr = this.current;
        int i7 = this.currentUsed;
        this.currentUsed = i7 + 1;
        bArr[i7] = b7;
    }

    public void writeBytes(byte[] bArr, int i7) {
        checkSize(i7, false);
        System.arraycopy(bArr, 0, this.current, this.currentUsed, i7);
        this.currentUsed += i7;
    }

    public void writeInt(int i7) {
        this.writeBuffer.putInt(0, i7 ^ byteOrderMask);
        writeBytes(this.writeData, 4);
    }

    public void writeLong(long j7) {
        if (!x64) {
            writeInt((int) j7);
        } else {
            this.writeBuffer.putLong(0, j7);
            writeBytes(this.writeData, 8);
        }
    }

    public void writeLongLong(long j7) {
        this.writeBuffer.putLong(0, j7);
        writeBytes(this.writeData, 8);
    }
}
