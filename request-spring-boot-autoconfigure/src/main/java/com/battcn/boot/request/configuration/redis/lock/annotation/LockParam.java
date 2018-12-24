package com.battcn.boot.request.configuration.redis.lock.annotation;


import java.lang.annotation.Target;

import java.lang.annotation.*;

/**
 * 锁的参数
 *
 * @author Levin
 */
@Target({ElementType.PARAMETER, ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface LockParam {

    /**
     * 字段名称
     *
     * @return String
     */
    String name() default "";
}