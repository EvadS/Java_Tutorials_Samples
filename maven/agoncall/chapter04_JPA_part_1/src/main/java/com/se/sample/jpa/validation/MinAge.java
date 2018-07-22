package com.se.sample.jpa.validation;


import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.PARAMETER;

@NotNull
@ReportAsSingleViolation

@Target({FIELD })///{METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = MinAgeValidatorField.class)
//@Constraint(validatedBy = {})

public @interface MinAge {

    String message() default "Некорректный формат";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
