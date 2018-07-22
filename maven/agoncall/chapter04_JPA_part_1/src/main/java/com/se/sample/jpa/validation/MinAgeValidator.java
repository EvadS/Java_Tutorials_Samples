package com.se.sample.jpa.validation;

import com.se.sample.jpa.entities.Customer;
import com.se.sample.jpa.utils.DateTimeUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;
import java.util.Calendar;
import java.util.Date;

public class MinAgeValidator implements ConstraintValidator <MinAge, Customer>
{
    public void initialize(MinAge constraintAnnotation) {
int  A = 10;
    }

    public boolean isValid(Customer customer, ConstraintValidatorContext constraintValidatorContext) {
        int currentAge = DateTimeUtils.calculateAge(customer.getDateOfBirth());

        if(currentAge <18)
            return false;

        return true;
    }
}
