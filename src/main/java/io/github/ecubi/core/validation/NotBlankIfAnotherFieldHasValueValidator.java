package io.github.ecubi.core.validation;

import org.springframework.beans.BeanWrapperImpl;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NotBlankIfAnotherFieldHasValueValidator implements ConstraintValidator<NotBlankIfAnotherFieldHasValue, Object> {

    private String field;
    private String dependsOnFieldName;
    private String dependsOnFieldValue;

    @Override
    public void initialize(final NotBlankIfAnotherFieldHasValue annotation) {
        field = annotation.field();
        dependsOnFieldName = annotation.dependsOnFieldName();
        dependsOnFieldValue = annotation.dependsOnFieldValue();
    }

    @Override
    public boolean isValid(final Object value, ConstraintValidatorContext context) {

        BeanWrapperImpl wrapper = new BeanWrapperImpl(value);


        Object dependsOnFieldValue1 = wrapper.getPropertyValue(dependsOnFieldName);

        if (dependsOnFieldValue1.toString().equals(dependsOnFieldValue)) {

            Object fieldValue = wrapper.getPropertyValue(field);

            if (fieldValue == null || fieldValue.toString().isEmpty()) {
                return false;
            }
        }


        return true;
    }
}
