package p054g4;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: g4.b */
/* loaded from: classes.dex */
public abstract class EnumC1220b implements InterfaceC1221c {

    /* renamed from: c */
    public static final a f5966c;

    /* renamed from: e */
    public static final /* synthetic */ EnumC1220b[] f5967e;

    /* renamed from: g4.b$a */
    public enum a extends EnumC1220b {
        public a() {
            super("IDENTITY", 0);
        }

        @Override // p054g4.InterfaceC1221c
        /* renamed from: a */
        public final String mo3441a(Field field) {
            return field.getName();
        }
    }

    static {
        a aVar = new a();
        f5966c = aVar;
        f5967e = new EnumC1220b[]{aVar, new EnumC1220b() { // from class: g4.b.b
            @Override // p054g4.InterfaceC1221c
            /* renamed from: a */
            public final String mo3441a(Field field) {
                return EnumC1220b.m3440c(field.getName());
            }
        }, new EnumC1220b() { // from class: g4.b.c
            @Override // p054g4.InterfaceC1221c
            /* renamed from: a */
            public final String mo3441a(Field field) {
                return EnumC1220b.m3440c(EnumC1220b.m3439b(field.getName(), ' '));
            }
        }, new EnumC1220b() { // from class: g4.b.d
            @Override // p054g4.InterfaceC1221c
            /* renamed from: a */
            public final String mo3441a(Field field) {
                return EnumC1220b.m3439b(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        }, new EnumC1220b() { // from class: g4.b.e
            @Override // p054g4.InterfaceC1221c
            /* renamed from: a */
            public final String mo3441a(Field field) {
                return EnumC1220b.m3439b(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        }, new EnumC1220b() { // from class: g4.b.f
            @Override // p054g4.InterfaceC1221c
            /* renamed from: a */
            public final String mo3441a(Field field) {
                return EnumC1220b.m3439b(field.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        }, new EnumC1220b() { // from class: g4.b.g
            @Override // p054g4.InterfaceC1221c
            /* renamed from: a */
            public final String mo3441a(Field field) {
                return EnumC1220b.m3439b(field.getName(), '.').toLowerCase(Locale.ENGLISH);
            }
        }};
    }

    public EnumC1220b(String str, int i7) {
    }

    /* renamed from: b */
    public static String m3439b(String str, char c7) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            char charAt = str.charAt(i7);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(c7);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    /* renamed from: c */
    public static String m3440c(String str) {
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            char charAt = str.charAt(i7);
            if (Character.isLetter(charAt)) {
                if (Character.isUpperCase(charAt)) {
                    return str;
                }
                char upperCase = Character.toUpperCase(charAt);
                if (i7 == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i7) + upperCase + str.substring(i7 + 1);
            }
        }
        return str;
    }

    public static EnumC1220b valueOf(String str) {
        return (EnumC1220b) Enum.valueOf(EnumC1220b.class, str);
    }

    public static EnumC1220b[] values() {
        return (EnumC1220b[]) f5967e.clone();
    }
}
