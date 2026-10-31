package android.ext;

/* loaded from: classes.dex */
public class DaemonThread extends Thread {
    public DaemonThread(Runnable runnable, String str) {
        super(runnable, str);
        setDaemon(true);
        ExceptionHandler.install(this);
    }

    public DaemonThread(String str) {
        super(str);
        setDaemon(true);
        ExceptionHandler.install(this);
    }
}
