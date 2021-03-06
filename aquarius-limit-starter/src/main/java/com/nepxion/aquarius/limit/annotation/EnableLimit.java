package com.nepxion.aquarius.limit.annotation;

/**
 * <p>Title: Nepxion Aquarius</p>
 * <p>Description: Nepxion Aquarius</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @version 1.0
 */

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Import;

import com.nepxion.aquarius.limit.aop.LimitImportSelector;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import(LimitImportSelector.class)
public @interface EnableLimit {

}