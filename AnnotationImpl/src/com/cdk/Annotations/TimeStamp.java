package com.cdk.Annotations;

import com.cdk.enums.Day;
import com.cdk.enums.Month;
import com.cdk.enums.Year;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by karodes on 7/24/2017.
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
public @interface TimeStamp {
    Year year();
    Month month();
    Day day();
}
