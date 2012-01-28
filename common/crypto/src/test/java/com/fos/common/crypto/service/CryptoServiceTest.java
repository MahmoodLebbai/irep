package com.fos.common.crypto.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Spring based transactional test with DbUnit support.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class CryptoServiceTest implements CryptoServiceTestBase
 {
	
    @Autowired
    protected CryptoService cryptoService;

    @Test
    public void testEncrypt() throws Exception {
    	
        String sampleText = "Hello";
        String encryptText = cryptoService.encrypt(sampleText);
        String decryptedText = cryptoService.decrypt(encryptText);
        if(sampleText.equals(decryptedText))
            System.out.println("Success");
        else
        	System.out.println("FAilure");
        
        
    }

    @Test
    public void testDecrypt() throws Exception {
    	 String sampleText = "Hello";
         String encryptText = cryptoService.encrypt(sampleText);
         String decryptedText = cryptoService.decrypt(encryptText);
         if(sampleText.equals(decryptedText))
             System.out.println("Success");
         else
         	 System.out.println("FAilure");
    }
}
