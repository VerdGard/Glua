package p171v4;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF286' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: v4.e */
/* loaded from: classes.dex */
public final class EnumC2021e {

    /* renamed from: X */
    public static final EnumC2021e f9180X;

    /* renamed from: Y */
    public static final EnumC2021e f9181Y;

    /* renamed from: Z */
    public static final /* synthetic */ EnumC2021e[] f9182Z;

    /* renamed from: s */
    public static final EnumC2021e f9183s;

    /* renamed from: c */
    public final int f9184c;

    /* renamed from: e */
    public final long f9185e;

    /* renamed from: m */
    public final String f9186m;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC2021e EF0;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC2021e EF1;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC2021e EF2;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC2021e EF3;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC2021e EF4;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC2021e EF5;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC2021e EF7;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC2021e EF14;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC2021e EF8;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC2021e EF9;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC2021e EF10;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC2021e EF11;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC2021e EF15;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC2021e EF277;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC2021e EF286;

    static {
        EnumC2021e enumC2021e = new EnumC2021e("Identifier", 0, 0, 4289443517L);
        f9183s = enumC2021e;
        EnumC2021e enumC2021e2 = new EnumC2021e("Text", 1, 0, 4289443517L);
        EnumC2021e enumC2021e3 = new EnumC2021e("Method", 2, 1, 4294226622L);
        EnumC2021e enumC2021e4 = new EnumC2021e("Function", 3, 2, 4294226622L);
        EnumC2021e enumC2021e5 = new EnumC2021e("Constructor", 4, 3, 4294226622L);
        EnumC2021e enumC2021e6 = new EnumC2021e("Field", 5, 4, 4294035587L);
        EnumC2021e enumC2021e7 = new EnumC2021e("Variable", 6, 5, 4294035587L);
        EnumC2021e enumC2021e8 = new EnumC2021e("Class", 7, 6, 4286958821L);
        EnumC2021e enumC2021e9 = new EnumC2021e("Interface", 8, 7, 4288269191L);
        EnumC2021e enumC2021e10 = new EnumC2021e("Module", 9, 8, 4286958821L);
        EnumC2021e enumC2021e11 = new EnumC2021e("Property", 10, 9, 4291738868L);
        EnumC2021e enumC2021e12 = new EnumC2021e("Unit", 11, 10);
        EnumC2021e enumC2021e13 = new EnumC2021e("Value", 12, 11, 4294035587L);
        EnumC2021e enumC2021e14 = new EnumC2021e("Enum", 13, 12, 4286958821L);
        EnumC2021e enumC2021e15 = new EnumC2021e("Keyword", 14, 13, 4291590194L);
        f9180X = enumC2021e15;
        EnumC2021e enumC2021e16 = new EnumC2021e("Snippet", 15, 14);
        f9181Y = enumC2021e16;
        int i7 = 17;
        int i8 = 18;
        int i9 = 19;
        int i10 = 26;
        f9182Z = new EnumC2021e[]{enumC2021e, enumC2021e2, enumC2021e3, enumC2021e4, enumC2021e5, enumC2021e6, enumC2021e7, enumC2021e8, enumC2021e9, enumC2021e10, enumC2021e11, enumC2021e12, enumC2021e13, enumC2021e14, enumC2021e15, enumC2021e16, new EnumC2021e("Color", 16, 15, 4294226622L), new EnumC2021e("Reference", i7, i7), new EnumC2021e("File", i8, 16), new EnumC2021e("Folder", i9, i8), new EnumC2021e("EnumMember", 20, i9), new EnumC2021e("Constant", 21, 20, 4294035587L), new EnumC2021e("Struct", 22, 21, 4291738868L), new EnumC2021e("Event", 23, 22), new EnumC2021e("Operator", 24, 23, 4293569462L), new EnumC2021e("TypeParameter", 25, 24, 4294035587L), new EnumC2021e("User", i10, 25), new EnumC2021e("Issue", 27, i10)};
    }

    public /* synthetic */ EnumC2021e(String str, int i7, int i8) {
        this(str, i7, i8, 0L);
    }

    public EnumC2021e(String str, int i7, int i8, long j7) {
        this.f9184c = i8;
        this.f9185e = j7;
        this.f9186m = String.valueOf(name().charAt(0));
    }

    public static EnumC2021e valueOf(String str) {
        return (EnumC2021e) Enum.valueOf(EnumC2021e.class, str);
    }

    public static EnumC2021e[] values() {
        return (EnumC2021e[]) f9182Z.clone();
    }
}
