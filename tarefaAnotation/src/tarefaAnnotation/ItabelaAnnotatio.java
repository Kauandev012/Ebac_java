package tarefaAnnotation;


import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})

public @interface ItabelaAnnotatio {
    String value();
}
