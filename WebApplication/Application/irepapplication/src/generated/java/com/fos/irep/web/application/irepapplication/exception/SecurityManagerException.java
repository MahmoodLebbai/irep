package com.fos.irep.web.application.irepapplication.exception;

import org.fornax.cartridges.sculptor.framework.errorhandling.ApplicationException;

import java.io.Serializable;

import java.util.Formatter;

public class SecurityManagerException extends ApplicationException {
    private static final long serialVersionUID = 1L;
    private static final String CLASS_NAME =
        SecurityManagerException.class.getSimpleName();
    private static final String CLASS_FULL_NAME =
        SecurityManagerException.class.getName();

    public SecurityManagerException(String m, Serializable... messageParameter) {
        super(CLASS_FULL_NAME, m);
        setMessageParameters(messageParameter);
    }

    public SecurityManagerException(int errorCode, String m,
        Serializable... messageParameter) {
        super(new Formatter().format("%1$s-%3$04d", CLASS_FULL_NAME,
                CLASS_NAME, errorCode).toString(), m);
        setMessageParameters(messageParameter);
    }
}
