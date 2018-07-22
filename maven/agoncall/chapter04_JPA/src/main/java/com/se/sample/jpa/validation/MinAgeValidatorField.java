package com.se.sample.jpa.validation;

import com.se.sample.jpa.utils.DateTimeUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;
import java.util.Date;

public class MinAgeValidatorField implements ConstraintValidator <MinAge,Date>{


    public void initialize(MinAge constraintAnnotation) {

    }

    public boolean isValid(Date date, ConstraintValidatorContext constraintValidatorContext) {

        int currentAge = DateTimeUtils.calculateAge(date);

        if(currentAge <18) {
            System.out.println("------------------------------------------------");
            return false;
        }

        return true;

    }
}
