package com.udemy.spring.springselenium.veron.annotation;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Nikasan
 */
@Lazy
@Configuration
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface LazyConfiguration {

}
