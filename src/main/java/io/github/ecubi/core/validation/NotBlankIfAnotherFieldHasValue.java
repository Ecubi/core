package io.github.ecubi.core.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({TYPE,ANNOTATION_TYPE})
@Retention(RUNTIME)
@Constraint(validatedBy = {NotBlankIfAnotherFieldHasValueValidator.class})
@Documented
public @interface NotBlankIfAnotherFieldHasValue {
    String field();
    String dependsOnFieldName();
    String dependsOnFieldValue();
    String message() default "field is required";

    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

    @Target({TYPE, ANNOTATION_TYPE})
    @Retention(RUNTIME)
    @Documented
    @interface List {
        NotBlankIfAnotherFieldHasValue[] value();
    }
}
