package com.hope.springmvc.exception;

/**
 * SpringMvcException
 *
 * @author zhougf
 * @date 2019/08/18
 */
public class SpringMvcException extends RuntimeException {

    private static final long SERIALVERSIONUID = 3721036867889297081L;

    private String message;

    private Object object;

    public SpringMvcException(Object object, String message) {
        this.object = object;
        this.message = message;
    }
}
