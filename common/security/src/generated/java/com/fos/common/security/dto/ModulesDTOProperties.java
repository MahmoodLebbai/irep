package com.fos.common.security.dto;

import org.fornax.cartridges.sculptor.framework.domain.LeafProperty;
import org.fornax.cartridges.sculptor.framework.domain.PropertiesCollection;
import org.fornax.cartridges.sculptor.framework.domain.Property;

import com.fos.common.security.dto.ApplicationsDTOProperties.ApplicationsDTOProperty;
import com.fos.common.security.dto.OperationDTOProperties.OperationDTOProperty;

/**
 * This generated interface defines property names for all
 * attributes and associatations in
 * {@link com.fos.common.security.dto.ModulesDTO}.
 * <p>
 * These properties are useful when building
 * criteria with {@link org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteriaBuilder},
 * which can be used with findByCondition Repository operation.
 */
public class ModulesDTOProperties {
    private static final ModulesDTOPropertiesImpl<ModulesDTO> sharedInstance =
        new ModulesDTOPropertiesImpl<ModulesDTO>(ModulesDTO.class);

    private ModulesDTOProperties() {
    }

    public static Property<ModulesDTO> id() {
        return sharedInstance.id();
    }

    public static Property<ModulesDTO> moduleCode() {
        return sharedInstance.moduleCode();
    }

    public static Property<ModulesDTO> moduleName() {
        return sharedInstance.moduleName();
    }

    public static Property<ModulesDTO> moduleDesc() {
        return sharedInstance.moduleDesc();
    }

    public static Property<ModulesDTO> moduleStatus() {
        return sharedInstance.moduleStatus();
    }

    public static ApplicationsDTOProperty<ModulesDTO> application() {
        return sharedInstance.application();
    }

    public static OperationDTOProperty<ModulesDTO> operations() {
        return sharedInstance.operations();
    }

    /**
     * This class is used for references to {@link com.fos.common.security.dto.ModulesDTO},
     * i.e. nested property.
     */
    public static class ModulesDTOProperty<T> extends ModulesDTOPropertiesImpl<T>
        implements Property<T> {
        private static final long serialVersionUID = 1L;

        public ModulesDTOProperty(String parentPath, String additionalPath,
            Class<T> owningClass) {
            super(parentPath, additionalPath, owningClass);
        }
    }

    protected static class ModulesDTOPropertiesImpl<T>
        extends PropertiesCollection {
        private static final long serialVersionUID = 1L;
        Class<T> owningClass;

        ModulesDTOPropertiesImpl(Class<T> owningClass) {
            super(null);
            this.owningClass = owningClass;
        }

        ModulesDTOPropertiesImpl(String parentPath, String additionalPath,
            Class<T> owningClass) {
            super(parentPath, additionalPath);
            this.owningClass = owningClass;
        }

        public Property<T> id() {
            return new LeafProperty<T>(getParentPath(), "id", false, owningClass);
        }

        public Property<T> moduleCode() {
            return new LeafProperty<T>(getParentPath(), "moduleCode", false,
                owningClass);
        }

        public Property<T> moduleName() {
            return new LeafProperty<T>(getParentPath(), "moduleName", false,
                owningClass);
        }

        public Property<T> moduleDesc() {
            return new LeafProperty<T>(getParentPath(), "moduleDesc", false,
                owningClass);
        }

        public Property<T> moduleStatus() {
            return new LeafProperty<T>(getParentPath(), "moduleStatus", false,
                owningClass);
        }

        public ApplicationsDTOProperty<T> application() {
            return new ApplicationsDTOProperty<T>(getParentPath(),
                "application", owningClass);
        }

        public OperationDTOProperty<T> operations() {
            return new OperationDTOProperty<T>(getParentPath(), "operations",
                owningClass);
        }
    }
}
