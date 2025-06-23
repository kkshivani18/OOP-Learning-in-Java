package interfaces.foodrecommendation.annotations;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface RecommendedFor {

    String[] value();
}
