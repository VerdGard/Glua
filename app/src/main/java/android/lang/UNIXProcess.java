package android.lang;

import android.annotation.SuppressLint;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
final class UNIXProcess extends Process {
    private static int pid;
    private static final Executor processReaperExecutor = (Executor) doPrivileged(new PrivilegedAction<Executor>() { // from class: android.lang.UNIXProcess.1
        @Override // java.security.PrivilegedAction
        public Executor run() {
            return Executors.newCachedThreadPool(new ProcessReaperThreadFactory(null));
        }
    });
    private int exitcode;
    private boolean hasExited;
    private ProcessPipeInputStream stderr;
    private ProcessPipeOutputStream stdin;
    private ProcessPipeInputStream stdout;

    public static class ProcessPipeInputStream extends BufferedInputStream {
        public ProcessPipeInputStream(int i7) {
            super(UNIXProcess.getFileInputStream(i7));
        }

        private static byte[] drainInputStream(InputStream inputStream) {
            byte[] bArr = null;
            if (inputStream == null) {
                return null;
            }
            int i7 = 0;
            while (true) {
                int available = inputStream.available();
                if (available <= 0) {
                    break;
                }
                bArr = bArr == null ? new byte[available] : Arrays.copyOf(bArr, i7 + available);
                i7 += inputStream.read(bArr, i7, available);
            }
            return (bArr == null || i7 == bArr.length) ? bArr : Arrays.copyOf(bArr, i7);
        }

        public synchronized void processExited() {
            try {
                InputStream inputStream = ((BufferedInputStream) this).in;
                if (inputStream != null) {
                    byte[] drainInputStream = drainInputStream(inputStream);
                    inputStream.close();
                    ((BufferedInputStream) this).in = drainInputStream == null ? NullInputStream.INSTANCE : (NullInputStream) new ByteArrayInputStream(drainInputStream);
                    if (((BufferedInputStream) this).buf == null) {
                        ((BufferedInputStream) this).in = null;
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    public static class ProcessPipeOutputStream extends BufferedOutputStream {
        public ProcessPipeOutputStream(int i7) {
            super(UNIXProcess.getFileOutputStream(i7));
        }

        public synchronized void processExited() {
            OutputStream outputStream = ((BufferedOutputStream) this).out;
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException unused) {
                }
                ((BufferedOutputStream) this).out = NullOutputStream.INSTANCE;
            }
        }
    }

    public static class ProcessReaperThreadFactory implements ThreadFactory {
        private static final ThreadGroup group = getRootThreadGroup();

        private ProcessReaperThreadFactory() {
        }

        public ProcessReaperThreadFactory(ProcessReaperThreadFactory processReaperThreadFactory) {
            this();
        }

        private static ThreadGroup getRootThreadGroup() {
            return (ThreadGroup) UNIXProcess.doPrivileged(new PrivilegedAction<ThreadGroup>() { // from class: android.lang.UNIXProcess.ProcessReaperThreadFactory.1
                @Override // java.security.PrivilegedAction
                public ThreadGroup run() {
                    ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
                    while (true) {
                        ThreadGroup parent = threadGroup.getParent();
                        if (parent == null || threadGroup == parent) {
                            break;
                        }
                        threadGroup = parent;
                    }
                    return threadGroup;
                }
            });
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(group, runnable, "process reaper", 32768L);
            thread.setDaemon(true);
            thread.setPriority(10);
            return thread;
        }
    }

    static {
        initIDs();
    }

    public UNIXProcess(byte[] bArr, byte[] bArr2, int i7, byte[] bArr3, int i8, byte[] bArr4, final int[] iArr, boolean z6) {
        pid = forkAndExec(bArr, bArr2, i7, bArr3, i8, bArr4, iArr, z6);
        try {
            doPrivileged(new PrivilegedExceptionAction<Void>() { // from class: android.lang.UNIXProcess.2
                @Override // java.security.PrivilegedExceptionAction
                public Void run() {
                    UNIXProcess.this.initStreams(iArr);
                    return null;
                }
            });
        } catch (PrivilegedActionException e7) {
            throw ((IOException) e7.getException());
        }
    }

    private static native void destroyProcess(int i7);

    public static <T> T doPrivileged(PrivilegedAction<T> privilegedAction) {
        return (T) AccessController.doPrivileged(privilegedAction);
    }

    public static <T> T doPrivileged(PrivilegedExceptionAction<T> privilegedExceptionAction) {
        return (T) AccessController.doPrivileged(privilegedExceptionAction);
    }

    private native int forkAndExec(byte[] bArr, byte[] bArr2, int i7, byte[] bArr3, int i8, byte[] bArr4, int[] iArr, boolean z6);

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static FileInputStream getFileInputStream(int i7) {
        Field declaredField;
        FileInputStream fileInputStream = new FileInputStream(newFileDescriptor(i7));
        try {
            try {
                declaredField = FileInputStream.class.getDeclaredField("isFdOwner");
            } catch (NoSuchFieldException unused) {
                declaredField = FileInputStream.class.getDeclaredField("shouldClose");
            }
            declaredField.setAccessible(true);
            declaredField.set(fileInputStream, Boolean.TRUE);
        } catch (Throwable unused2) {
        }
        return fileInputStream;
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static FileOutputStream getFileOutputStream(int i7) {
        Field declaredField;
        FileOutputStream fileOutputStream = new FileOutputStream(newFileDescriptor(i7));
        try {
            try {
                declaredField = FileOutputStream.class.getDeclaredField("isFdOwner");
            } catch (NoSuchFieldException unused) {
                declaredField = FileOutputStream.class.getDeclaredField("shouldClose");
            }
            declaredField.setAccessible(true);
            declaredField.set(fileOutputStream, Boolean.TRUE);
        } catch (Throwable unused2) {
        }
        return fileOutputStream;
    }

    private static native void initIDs();

    public static FileDescriptor newFileDescriptor(int i7) {
        FileDescriptor fileDescriptor = new FileDescriptor();
        try {
            Field declaredField = FileDescriptor.class.getDeclaredField("descriptor");
            declaredField.setAccessible(true);
            declaredField.set(fileDescriptor, Integer.valueOf(i7));
            return fileDescriptor;
        } catch (Throwable th) {
            throw new RuntimeException("Failed set fd", th);
        }
    }

    public static native int waitForProcessExit(int i7);

    @Override // java.lang.Process
    public void destroy() {
        synchronized (this) {
            if (!this.hasExited) {
                destroyProcess(pid);
            }
        }
        try {
            this.stdin.close();
        } catch (IOException unused) {
        }
        try {
            this.stdout.close();
        } catch (IOException unused2) {
        }
        try {
            this.stderr.close();
        } catch (IOException unused3) {
        }
    }

    @Override // java.lang.Process
    public synchronized int exitValue() {
        if (!this.hasExited) {
            throw new IllegalThreadStateException("process hasn't exited");
        }
        return this.exitcode;
    }

    @Override // java.lang.Process
    public InputStream getErrorStream() {
        return this.stderr;
    }

    @Override // java.lang.Process
    public InputStream getInputStream() {
        return this.stdout;
    }

    @Override // java.lang.Process
    public OutputStream getOutputStream() {
        return this.stdin;
    }

    public void initStreams(int[] iArr) {
        this.stdin = (ProcessPipeOutputStream) (iArr[0] == -1 ? NullOutputStream.INSTANCE : (NullOutputStream) new ProcessPipeOutputStream(iArr[0]));
        this.stdout = (ProcessPipeInputStream) (iArr[1] == -1 ? NullInputStream.INSTANCE : (NullInputStream) new ProcessPipeInputStream(iArr[1]));
        this.stderr = (ProcessPipeInputStream) (iArr[2] == -1 ? NullInputStream.INSTANCE : (NullInputStream) new ProcessPipeInputStream(iArr[2]));
        processReaperExecutor.execute(new Runnable() { // from class: android.lang.UNIXProcess.3
            @Override // java.lang.Runnable
            public void run() {
                UNIXProcess.this.processExited(UNIXProcess.waitForProcessExit(UNIXProcess.pid));
            }
        });
    }

    public void processExited(int i7) {
        synchronized (this) {
            this.exitcode = i7;
            this.hasExited = true;
            notifyAll();
        }
        ProcessPipeInputStream processPipeInputStream = this.stdout;
        if (processPipeInputStream instanceof ProcessPipeInputStream) {
            processPipeInputStream.processExited();
        }
        ProcessPipeInputStream processPipeInputStream2 = this.stderr;
        if (processPipeInputStream2 instanceof ProcessPipeInputStream) {
            processPipeInputStream2.processExited();
        }
        ProcessPipeOutputStream processPipeOutputStream = this.stdin;
        if (processPipeOutputStream instanceof ProcessPipeOutputStream) {
            processPipeOutputStream.processExited();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Process[pid=");
        sb.append(pid);
        if (this.hasExited) {
            sb.append(", hasExited=true, exitcode=");
            sb.append(this.exitcode);
            sb.append(']');
        } else {
            sb.append(", hasExited=false]");
        }
        return sb.toString();
    }

    @Override // java.lang.Process
    public synchronized int waitFor() {
        while (!this.hasExited) {
            wait();
        }
        return this.exitcode;
    }
}
