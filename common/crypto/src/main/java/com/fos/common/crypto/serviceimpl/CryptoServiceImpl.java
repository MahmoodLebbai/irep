package com.fos.common.crypto.serviceimpl;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fos.common.crypto.exception.CryptoException;

/**
 * Implementation of CryptoService.
 */
@Service("cryptoService")
public class CryptoServiceImpl extends CryptoServiceImplBase {
    public CryptoServiceImpl() {
    }
    
    @Autowired
    StandardPBEStringEncryptor standardPBEStringEncryptor;
    

    public String encrypt(String plainText) throws CryptoException {

    	String encryptedText = "";
    	
    	try
    	{
    		encryptedText = standardPBEStringEncryptor.encrypt(plainText);
    	}
    	catch(Exception ex)
    	{
    		throw new CryptoException("Error in Encrypting Plain Text . Exception = " , ex);
    	}
    	
    	
    	return encryptedText;

    }

    public String decrypt(String encryptedText) throws CryptoException {
    	
    	String decryptedText = "";
    	
    	try
    	{
    		decryptedText = standardPBEStringEncryptor.decrypt(encryptedText);
    	}
    	catch(Exception ex)
    	{
    		throw new CryptoException("Error in Decrypting Encrypted Text. Exception = " , ex);
    	}
    	
    	
    	return decryptedText;
     

    }

	/**
	 * @return the standardPBEStringEncryptor
	 */
	public StandardPBEStringEncryptor getStandardPBEStringEncryptor() {
		return standardPBEStringEncryptor;
	}

	/**
	 * @param standardPBEStringEncryptor the standardPBEStringEncryptor to set
	 */
	public void setStandardPBEStringEncryptor(
			StandardPBEStringEncryptor standardPBEStringEncryptor) {
		this.standardPBEStringEncryptor = standardPBEStringEncryptor;
	}



    
    
    
}
