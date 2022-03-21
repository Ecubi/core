package io.github.ecubi.core.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.List;

public class NotEmptyListValidator implements ConstraintValidator<NotEmptyList, List<? extends Object>> {

    @Override
    public boolean isValid(List<? extends  Object> list, ConstraintValidatorContext context) {
        return (list != null && !list.isEmpty());
    }
}
