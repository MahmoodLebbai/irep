package com.fos.common.emailtemplate.exception;

import org.fornax.cartridges.sculptor.framework.errorhandling.ApplicationException;

import java.io.Serializable;

import java.util.Formatter;

public class EmailTemplateNotFoundException extends ApplicationException {
    private static final long serialVersionUID = 1L;
    private static final String CLASS_NAME =
        EmailTemplateNotFoundException.class.getSimpleName();
    private static final String CLASS_FULL_NAME =
        EmailTemplateNotFoundException.class.getName();

    public EmailTemplateNotFoundException(String m,
        Serializable... messageParameter) {
        super(CLASS_FULL_NAME, m);
        setMessageParameters(messageParameter);
    }

    public EmailTemplateNotFoundException(int errorCode, String m,
        Serializable... messageParameter) {
        super(new Formatter().format("%1$s-%3$04d", CLASS_FULL_NAME,
                CLASS_NAME, errorCode).toString(), m);
        setMessageParameters(messageParameter);
    }
}
