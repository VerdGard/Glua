package p180w6;

import android.ext.DaemonManager;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import p165u6.AbstractC1984c0;
import p165u6.AbstractC2003u;
import p165u6.C1979a;
import p165u6.C1981b;
import p165u6.C1988f;
import p165u6.C1990h;
import p165u6.C1993k;
import p165u6.C1996n;
import p165u6.C1998p;
import p165u6.C1999q;

/* renamed from: w6.k */
/* loaded from: classes.dex */
public class C2142k extends AbstractC2149r {

    /* renamed from: h2 */
    public static final String[] f9706h2 = {"clock", "date", "difftime", "execute", "exit", "getenv", "remove", "rename", "setlocale", "time", "tmpname"};

    /* renamed from: i2 */
    public static final long f9707i2;

    /* renamed from: j2 */
    public static long f9708j2;

    /* renamed from: k2 */
    public static final String[] f9709k2;

    /* renamed from: l2 */
    public static final String[] f9710l2;

    /* renamed from: m2 */
    public static final String[] f9711m2;

    /* renamed from: n2 */
    public static final String[] f9712n2;

    /* renamed from: g2 */
    public C1981b f9713g2;

    /* renamed from: w6.k$a */
    public class a extends AbstractC2150s {
        public a(int i7, String str) {
            this.f9700e2 = i7;
            this.f9701f2 = str;
        }

        @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: W0 */
        public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
            double m5240O2;
            C1996n c1996n = AbstractC2003u.f9130m;
            try {
                int i7 = this.f9700e2;
                boolean z6 = true;
                C1988f c1988f = AbstractC2003u.f9131s;
                AbstractC2003u.a aVar = AbstractC2003u.f9124Y;
                C2142k c2142k = C2142k.this;
                switch (i7) {
                    case 0:
                        c2142k.getClass();
                        return C1990h.m4698E2((System.nanoTime() - C2142k.f9707i2) / 1.0E9d);
                    case 1:
                        String m4644K = abstractC1984c0.m4644K(1, "%c");
                        if (abstractC1984c0.mo4623t(2).mo4808e1()) {
                            m5240O2 = abstractC1984c0.mo4623t(2).mo4744n2();
                        } else {
                            c2142k.getClass();
                            m5240O2 = C2142k.m5240O2(null);
                        }
                        if (!m4644K.equals("*t")) {
                            if (m5240O2 == -1.0d) {
                                c2142k.getClass();
                                m5240O2 = C2142k.m5240O2(null);
                            }
                            c2142k.getClass();
                            return C1998p.m4815M2(C2142k.m5239J2(m4644K, m5240O2));
                        }
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTime(new Date((long) (m5240O2 * 1000.0d)));
                        C1999q c1999q = new C1999q();
                        c1999q.mo4790Y1(C1998p.m4815M2("year"), C1993k.m4765C2(calendar.get(1)));
                        c1999q.mo4790Y1(C1998p.m4815M2("month"), C1993k.m4765C2(calendar.get(2) + 1));
                        c1999q.mo4790Y1(C1998p.m4815M2("day"), C1993k.m4765C2(calendar.get(5)));
                        c1999q.mo4790Y1(C1998p.m4815M2("hour"), C1993k.m4765C2(calendar.get(11)));
                        c1999q.mo4790Y1(C1998p.m4815M2("min"), C1993k.m4765C2(calendar.get(12)));
                        c1999q.mo4790Y1(C1998p.m4815M2("sec"), C1993k.m4765C2(calendar.get(13)));
                        c1999q.mo4790Y1(C1998p.m4815M2("wday"), C1993k.m4765C2(calendar.get(7)));
                        c1999q.mo4790Y1(C1998p.m4815M2("yday"), C1993k.m4765C2(calendar.get(6)));
                        c2142k.getClass();
                        if (C2142k.m5241P2(calendar) == calendar.getTimeZone().getRawOffset() / DaemonManager.TIME_JUMP_MUL_INT) {
                            z6 = false;
                        }
                        if (!z6) {
                            c1988f = AbstractC2003u.f9122X;
                        }
                        c1999q.mo4790Y1(C1998p.m4815M2("isdst"), c1988f);
                        return c1999q;
                    case 2:
                        double m4647v = abstractC1984c0.m4647v(1);
                        double m4647v2 = abstractC1984c0.m4647v(2);
                        c2142k.getClass();
                        return C1990h.m4698E2(m4647v - m4647v2);
                    case 3:
                        return c2142k.mo5243K2(abstractC1984c0.m4644K(1, null));
                    case 4:
                        abstractC1984c0.m4643J(1, 0);
                        c2142k.getClass();
                        return aVar;
                    case 5:
                        String mo5244L2 = c2142k.mo5244L2(abstractC1984c0.m4649x(1));
                        return mo5244L2 != null ? C1998p.m4815M2(mo5244L2) : c1996n;
                    case 6:
                        c2142k.mo5245M2(abstractC1984c0.m4649x(1));
                        return c1988f;
                    case 7:
                        c2142k.mo5246N2(abstractC1984c0.m4649x(1), abstractC1984c0.m4649x(2));
                        return c1988f;
                    case 8:
                        abstractC1984c0.m4644K(1, null);
                        abstractC1984c0.m4644K(2, "all");
                        c2142k.getClass();
                        return C1998p.m4815M2("C");
                    case 9:
                        C1999q mo4773F1 = abstractC1984c0.mo4623t(1).mo4773F1();
                        c2142k.getClass();
                        return C1990h.m4698E2(C2142k.m5240O2(mo4773F1));
                    case 10:
                        return C1998p.m4815M2(c2142k.mo5247Q2());
                    default:
                        return aVar;
                }
            } catch (IOException e7) {
                return AbstractC2003u.m4867y2(c1996n, C1998p.m4815M2(e7.getMessage()));
            }
        }
    }

    static {
        long nanoTime = System.nanoTime();
        f9707i2 = nanoTime;
        f9708j2 = nanoTime;
        f9709k2 = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        f9710l2 = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        f9711m2 = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        f9712n2 = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    }

    /* renamed from: I2 */
    public static Calendar m5238I2(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(calendar.getTime());
        calendar2.set(2, 0);
        calendar2.set(5, 1);
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        return calendar2;
    }

    /* renamed from: J2 */
    public static String m5239J2(String str, double d7) {
        int i7;
        int i8;
        String substring;
        int i9;
        int m5242R2;
        String str2;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date((long) (d7 * 1000.0d)));
        if (str.startsWith("!")) {
            d7 -= m5241P2(calendar);
            calendar.setTime(new Date((long) (1000.0d * d7)));
            str = str.substring(1);
        }
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        C1979a c1979a = new C1979a(length);
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            byte b7 = bytes[i10];
            if (b7 == 10) {
                c1979a.m4615b("\n");
            } else if (b7 != 37) {
                c1979a.m4614a(b7);
            } else if (i11 < length) {
                i10 = i11 + 1;
                byte b8 = bytes[i11];
                if (b8 != 37) {
                    if (b8 != 77) {
                        if (b8 != 83) {
                            if (b8 != 85) {
                                if (b8 == 106) {
                                    i8 = ((int) ((calendar.getTime().getTime() - m5238I2(calendar).getTime().getTime()) / 86400000)) + 1001;
                                } else if (b8 != 109) {
                                    if (b8 == 112) {
                                        substring = calendar.get(11) < 12 ? "AM" : "PM";
                                    } else if (b8 == 65) {
                                        substring = f9710l2[calendar.get(7) - 1];
                                    } else if (b8 == 66) {
                                        substring = f9712n2[calendar.get(2)];
                                    } else if (b8 == 72) {
                                        i7 = calendar.get(11);
                                    } else if (b8 != 73) {
                                        switch (b8) {
                                            case 87:
                                                m5242R2 = m5242R2(calendar, 1);
                                                break;
                                            case 88:
                                                str2 = "%H:%M:%S";
                                                substring = m5239J2(str2, d7);
                                                break;
                                            case 89:
                                                m5242R2 = calendar.get(1);
                                                break;
                                            default:
                                                switch (b8) {
                                                    case 97:
                                                        substring = f9709k2[calendar.get(7) - 1];
                                                        break;
                                                    case 98:
                                                        substring = f9711m2[calendar.get(2)];
                                                        break;
                                                    case 99:
                                                        str2 = "%a %b %d %H:%M:%S %Y";
                                                        substring = m5239J2(str2, d7);
                                                        break;
                                                    case 100:
                                                        i9 = 5;
                                                        break;
                                                    default:
                                                        switch (b8) {
                                                            case 119:
                                                                m5242R2 = (calendar.get(7) + 6) % 7;
                                                                break;
                                                            case 120:
                                                                str2 = "%m/%d/%y";
                                                                substring = m5239J2(str2, d7);
                                                                break;
                                                            case 121:
                                                                substring = String.valueOf(calendar.get(1)).substring(2);
                                                                break;
                                                            case 122:
                                                                int m5241P2 = m5241P2(calendar) / 60;
                                                                int abs = Math.abs(m5241P2);
                                                                String substring2 = String.valueOf((abs / 60) + 100).substring(1);
                                                                String substring3 = String.valueOf((abs % 60) + 100).substring(1);
                                                                StringBuilder sb = new StringBuilder();
                                                                sb.append(m5241P2 >= 0 ? "+" : "-");
                                                                sb.append(substring2);
                                                                sb.append(substring3);
                                                                substring = sb.toString();
                                                                break;
                                                            default:
                                                                AbstractC2003u.m4863R(1, "invalid conversion specifier '%" + ((int) b8) + "'");
                                                                throw null;
                                                        }
                                                }
                                        }
                                    } else {
                                        i7 = calendar.get(11) % 12;
                                    }
                                    c1979a.m4615b(substring);
                                } else {
                                    i8 = calendar.get(2) + 101;
                                }
                                substring = String.valueOf(i8).substring(1);
                                c1979a.m4615b(substring);
                            } else {
                                m5242R2 = m5242R2(calendar, 0);
                            }
                            substring = String.valueOf(m5242R2);
                            c1979a.m4615b(substring);
                        } else {
                            i9 = 13;
                        }
                        i7 = calendar.get(i9);
                    } else {
                        i7 = calendar.get(12);
                    }
                    i8 = i7 + 100;
                    substring = String.valueOf(i8).substring(1);
                    c1979a.m4615b(substring);
                } else {
                    c1979a.m4614a((byte) 37);
                }
            }
            i10 = i11;
        }
        AbstractC1984c0 abstractC1984c0 = c1979a.f8941d;
        if (abstractC1984c0 == null) {
            abstractC1984c0 = c1979a.m4619f();
        }
        return abstractC1984c0.mo4645M();
    }

    /* renamed from: O2 */
    public static double m5240O2(C1999q c1999q) {
        Date time;
        if (c1999q == null) {
            time = new Date();
        } else {
            Calendar calendar = Calendar.getInstance();
            calendar.set(1, c1999q.mo4777L0(C1998p.m4815M2("year")).mo4740m0());
            calendar.set(2, c1999q.mo4777L0(C1998p.m4815M2("month")).mo4740m0() - 1);
            calendar.set(5, c1999q.mo4777L0(C1998p.m4815M2("day")).mo4740m0());
            calendar.set(11, c1999q.mo4777L0(C1998p.m4815M2("hour")).mo4699C1(12));
            calendar.set(12, c1999q.mo4777L0(C1998p.m4815M2("min")).mo4699C1(0));
            calendar.set(13, c1999q.mo4777L0(C1998p.m4815M2("sec")).mo4699C1(0));
            calendar.set(14, 0);
            time = calendar.getTime();
        }
        return time.getTime() / 1000.0d;
    }

    /* renamed from: P2 */
    public static int m5241P2(Calendar calendar) {
        return calendar.getTimeZone().getOffset(1, calendar.get(1), calendar.get(2), calendar.get(5), calendar.get(7), (calendar.get(13) + ((calendar.get(12) * 60) + (calendar.get(11) * 3600))) * DaemonManager.TIME_JUMP_MUL_INT) / DaemonManager.TIME_JUMP_MUL_INT;
    }

    /* renamed from: R2 */
    public static int m5242R2(Calendar calendar, int i7) {
        Calendar m5238I2 = m5238I2(calendar);
        int i8 = i7 + 8;
        m5238I2.set(5, ((i8 - m5238I2.get(7)) % 7) + 1);
        if (m5238I2.after(calendar)) {
            m5238I2.set(1, m5238I2.get(1) - 1);
            m5238I2.set(5, ((i8 - m5238I2.get(7)) % 7) + 1);
        }
        return ((int) ((calendar.getTime().getTime() - m5238I2.getTime().getTime()) / 604800000)) + 1;
    }

    /* renamed from: K2 */
    public AbstractC1984c0 mo5243K2(String str) {
        return AbstractC2003u.m4866x2(AbstractC2003u.f9130m, C1998p.m4815M2("exit"), AbstractC2003u.f9132w1);
    }

    /* renamed from: L2 */
    public String mo5244L2(String str) {
        return System.getProperty(str);
    }

    /* renamed from: M2 */
    public void mo5245M2(String str) {
        throw new IOException("not implemented");
    }

    /* renamed from: N2 */
    public void mo5246N2(String str, String str2) {
        throw new IOException("not implemented");
    }

    /* renamed from: Q2 */
    public String mo5247Q2() {
        String sb;
        synchronized (C2142k.class) {
            StringBuilder sb2 = new StringBuilder(".luaj");
            long j7 = f9708j2;
            f9708j2 = 1 + j7;
            sb2.append(j7);
            sb2.append("tmp");
            sb = sb2.toString();
        }
        return sb;
    }

    @Override // p180w6.AbstractC2149r, p180w6.AbstractC2139h, p165u6.AbstractC2003u
    /* renamed from: g0 */
    public final AbstractC2003u mo4692g0(AbstractC2003u abstractC2003u, AbstractC2003u abstractC2003u2) {
        this.f9713g2 = abstractC2003u2.mo4629l0();
        C1999q c1999q = new C1999q();
        for (int i7 = 0; i7 < 11; i7++) {
            String str = f9706h2[i7];
            c1999q.m4878X1(str, new a(i7, str));
        }
        abstractC2003u2.mo4790Y1(C1998p.m4815M2("os"), c1999q);
        if (!abstractC2003u2.mo4777L0(C1998p.m4815M2("package")).mo4804d1()) {
            AbstractC2003u mo4777L0 = abstractC2003u2.mo4777L0(C1998p.m4815M2("package"));
            mo4777L0.getClass();
            AbstractC2003u mo4777L02 = mo4777L0.mo4777L0(C1998p.m4815M2("loaded"));
            mo4777L02.getClass();
            mo4777L02.mo4790Y1(C1998p.m4815M2("os"), c1999q);
        }
        return c1999q;
    }
}
