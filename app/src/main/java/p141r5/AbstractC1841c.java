package p141r5;

import java.io.PrintStream;
import java.util.function.Consumer;

/* renamed from: r5.c */
/* loaded from: classes.dex */
public abstract class AbstractC1841c {

    /* renamed from: c */
    public static int f8312c = 0;

    /* renamed from: d */
    public static boolean f8313d = true;

    /* renamed from: a */
    public int f8314a;

    /* renamed from: b */
    public int f8315b;

    /* renamed from: a */
    public static void m4331a(PrintStream printStream, int i7) {
        if (!f8313d) {
            printStream.print(" ");
            return;
        }
        for (int i8 = 0; i8 < i7; i8++) {
            printStream.print("\t");
        }
    }

    /* renamed from: c */
    public static void m4332c(PrintStream printStream, Consumer consumer) {
        f8312c++;
        m4333d(printStream);
        consumer.accept(printStream);
        f8312c--;
        m4333d(printStream);
    }

    /* renamed from: d */
    public static void m4333d(PrintStream printStream) {
        if (!f8313d) {
            printStream.print(" ");
            return;
        }
        printStream.println();
        for (int i7 = 0; i7 < f8312c; i7++) {
            printStream.print("\t");
        }
    }

    /* renamed from: b */
    public abstract void mo4330b(PrintStream printStream);

    public final String toString() {
        return getClass().getSimpleName() + "{location=" + this.f8314a + '}';
    }
}
