package com.fos.common.emailtemplate.service;

import org.fornax.cartridges.sculptor.framework.test.AbstractDbUnitJpaTests;
import static org.junit.Assert.fail;
import org.junit.Test;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Spring based transactional test with DbUnit support.
 */
public class EmailTemplateServiceTest extends AbstractDbUnitJpaTests
    implements EmailTemplateServiceTestBase {
    @Autowired
    protected EmailTemplateService emailTemplateService;

    @Test
    public void testGetEmailTemplate() throws Exception {
        // TODO Auto-generated method stub
        fail("testGetEmailTemplate not implemented");
    }

    @Test
    public void testGetEmailContent() throws Exception {
        // TODO Auto-generated method stub
        fail("testGetEmailContent not implemented");
    }

    @Test
    public void testFindById() throws Exception {
        // TODO Auto-generated method stub
        fail("testFindById not implemented");
    }

    @Test
    public void testFindAll() throws Exception {
        // TODO Auto-generated method stub
        fail("testFindAll not implemented");
    }

    @Test
    public void testSave() throws Exception {
        // TODO Auto-generated method stub
        fail("testSave not implemented");
    }

    @Test
    public void testDelete() throws Exception {
        // TODO Auto-generated method stub
        fail("testDelete not implemented");
    }
}
