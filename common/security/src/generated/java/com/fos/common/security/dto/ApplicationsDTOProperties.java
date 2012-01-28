package com.fos.common.security.dto;

import org.fornax.cartridges.sculptor.framework.domain.LeafProperty;
import org.fornax.cartridges.sculptor.framework.domain.PropertiesCollection;
import org.fornax.cartridges.sculptor.framework.domain.Property;

import com.fos.common.security.dto.ModulesDTOProperties.ModulesDTOProperty;

/**
 * This generated interface defines property names for all
 * attributes and associatations in
 * {@link com.fos.common.security.dto.ApplicationsDTO}.
 * <p>
 * These properties are useful when building
 * criteria with {@link org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteriaBuilder},
 * which can be used with findByCondition Repository operation.
 */
public class ApplicationsDTOProperties {
    private static final ApplicationsDTOPropertiesImpl<ApplicationsDTO> sharedInstance =
        new ApplicationsDTOPropertiesImpl<ApplicationsDTO>(ApplicationsDTO.class);

    private ApplicationsDTOProperties() {
    }

    public static Property<ApplicationsDTO> id() {
        return sharedInstance.id();
    }

    public static Property<ApplicationsDTO> applicationCode() {
        return sharedInstance.applicationCode();
    }

    public static Property<ApplicationsDTO> applicationName() {
        return sharedInstance.applicationName();
    }

    public static Property<ApplicationsDTO> applicationDesc() {
        return sharedInstance.applicationDesc();
    }

    public static Property<ApplicationsDTO> applicationStatus() {
        return sharedInstance.applicationStatus();
    }

    public static ModulesDTOProperty<ApplicationsDTO> modules() {
        return sharedInstance.modules();
    }

    /**
     * This class is used for references to {@link com.fos.common.security.dto.ApplicationsDTO},
     * i.e. nested property.
     */
    public static class ApplicationsDTOProperty<T>
        extends ApplicationsDTOPropertiesImpl<T> implements Property<T> {
        private static final long serialVersionUID = 1L;

        public ApplicationsDTOProperty(String parentPath,
            String additionalPath, Class<T> owningClass) {
            super(parentPath, additionalPath, owningClass);
        }
    }

    protected static class ApplicationsDTOPropertiesImpl<T>
        extends PropertiesCollection {
        private static final long serialVersionUID = 1L;
        Class<T> owningClass;

        ApplicationsDTOPropertiesImpl(Class<T> owningClass) {
            super(null);
            this.owningClass = owningClass;
        }

        ApplicationsDTOPropertiesImpl(String parentPath, String additionalPath,
            Class<T> owningClass) {
            super(parentPath, additionalPath);
            this.owningClass = owningClass;
        }

        public Property<T> id() {
            return new LeafProperty<T>(getParentPath(), "id", false, owningClass);
        }

        public Property<T> applicationCode() {
            return new LeafProperty<T>(getParentPath(), "applicationCode",
                false, owningClass);
        }

        public Property<T> applicationName() {
            return new LeafProperty<T>(getParentPath(), "applicationName",
                false, owningClass);
        }

        public Property<T> applicationDesc() {
            return new LeafProperty<T>(getParentPath(), "applicationDesc",
                false, owningClass);
        }

        public Property<T> applicationStatus() {
            return new LeafProperty<T>(getParentPath(), "applicationStatus",
                false, owningClass);
        }

        public ModulesDTOProperty<T> modules() {
            return new ModulesDTOProperty<T>(getParentPath(), "modules",
                owningClass);
        }
    }
}
