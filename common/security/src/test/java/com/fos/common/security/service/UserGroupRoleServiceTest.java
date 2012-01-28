package com.fos.common.security.service;

import org.fornax.cartridges.sculptor.framework.test.AbstractDbUnitJpaTests;
import static org.junit.Assert.fail;
import org.junit.Test;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Spring based transactional test with DbUnit support.
 */
public class UserGroupRoleServiceTest extends AbstractDbUnitJpaTests
    implements UserGroupRoleServiceTestBase {
    @Autowired
    protected UserGroupRoleService userGroupRoleService;

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
