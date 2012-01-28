package com.fos.irep.web.application.irepapplication.managerimpl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import junit.framework.TestCase;

/**
 * JUnit test to verify that dependency injection setter methods
 * of other Spring beans have been implemented.
 */
public class SecurityManagerDependencyInjectionTest extends TestCase {
    public void testSecurityServiceSetter() throws Exception {
        Class clazz = SecurityManagerImpl.class;
        Method[] methods = clazz.getMethods();
        String setterMethodName = "setSecurityService";
        Method setter = null;
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals(setterMethodName) &&
                  void.class.equals(methods[i].getReturnType()) &&
                  methods[i].getParameterTypes().length == 1) {
                setter = methods[i];
                break;
            }
        }

        assertNotNull("Setter method for dependency injection of " +
            "SecurityService must be defined in SecurityManager.", setter);

        SecurityManagerImpl securityManager = new SecurityManagerImpl();
        try {
            setter.invoke(securityManager, new Object[] { null });
        } catch (InvocationTargetException e) {
            if (e.getCause().getClass()
                   .equals(UnsupportedOperationException.class)) {
                assertTrue(e.getCause().getMessage(), false);
            } else {

                // exception due to something else, but the method was not forgotten
            }
        }
    }
}
