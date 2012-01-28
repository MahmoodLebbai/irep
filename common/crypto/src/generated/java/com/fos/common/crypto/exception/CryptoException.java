package com.fos.common.crypto.exception;

import org.fornax.cartridges.sculptor.framework.errorhandling.ApplicationException;

import java.io.Serializable;

import java.util.Formatter;

public class CryptoException extends ApplicationException {
    private static final long serialVersionUID = 1L;
    private static final String CLASS_NAME =
        CryptoException.class.getSimpleName();
    private static final String CLASS_FULL_NAME =
        CryptoException.class.getName();

    public CryptoException(String m, Serializable... messageParameter) {
        super(CLASS_FULL_NAME, m);
        setMessageParameters(messageParameter);
    }

    public CryptoException(int errorCode, String m,
        Serializable... messageParameter) {
        super(new Formatter().format("%1$s-%3$04d", CLASS_FULL_NAME,
                CLASS_NAME, errorCode).toString(), m);
        setMessageParameters(messageParameter);
    }
}
