package com.fos.common.crypto.service;


/**
 * Generated interface for the Service CryptoService.
 */
public interface CryptoService {
    public static final String BEAN_ID = "cryptoService";

    public String encrypt(String plainText)
        throws com.fos.common.crypto.exception.CryptoException;

    public String decrypt(String encryptedText)
        throws com.fos.common.crypto.exception.CryptoException;
}
