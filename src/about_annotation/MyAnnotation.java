package about_annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


//表示该注解只能现在 类 和 方法
@Target(value = {ElementType.TYPE,ElementType.METHOD})

//表示该注解可与被反射


@Retention(value = RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String name() default "lbw";
}
