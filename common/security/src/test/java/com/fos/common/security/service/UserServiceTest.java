package com.fos.common.security.service;

import org.fornax.cartridges.sculptor.framework.test.AbstractDbUnitJpaTests;
import static org.junit.Assert.fail;
import org.junit.Test;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Spring based transactional test with DbUnit support.
 */
public class UserServiceTest extends AbstractDbUnitJpaTests
    implements UserServiceTestBase {
    @Autowired
    protected UserService userService;

    @Test
    public void testGetUserDetails() throws Exception {
        // TODO Auto-generated method stub
        fail("testGetUserDetails not implemented");
    }

    @Test
    public void testFindUser() throws Exception {
        // TODO Auto-generated method stub
        fail("testFindUser not implemented");
    }

    @Test
    public void testFindUserByEmail() throws Exception {
        // TODO Auto-generated method stub
        fail("testFindUserByEmail not implemented");
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
