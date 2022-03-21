package io.github.ecubi.core.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {NotEmptyListValidator.class})
@Documented
public @interface NotEmptyList {
    String message() default "list cannot be empty";

    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
