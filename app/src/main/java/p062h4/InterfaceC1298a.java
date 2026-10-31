package p062h4;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: h4.a */
/* loaded from: classes.dex */
public @interface InterfaceC1298a {
    boolean nullSafe() default true;

    Class<?> value();
}
