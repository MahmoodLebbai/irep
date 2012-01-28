package com.fos.common.emailtemplate.domain;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;

/**
* Enum for EmailTemplatesEnum
*/
public enum EmailTemplatesEnum implements Serializable {
    USER_REG_EMAIL("USER_REG_EMAIL"),
    RESET_PASSWORD_EMAIL("RESET_PASSWORD_EMAIL");

    /**
     */
    private static Map<String,EmailTemplatesEnum> identifierMap =
        new HashMap<String,EmailTemplatesEnum>();

    static {
        for (EmailTemplatesEnum value : EmailTemplatesEnum.values()) {
            identifierMap.put(value.getValue(), value);
        }
    }

    private String value;

    /**
     */
    private EmailTemplatesEnum(String value) {
        this.value = value;
    }

    public static EmailTemplatesEnum fromValue(String value) {
        EmailTemplatesEnum result = identifierMap.get(value);
        if (result == null) {
            throw new IllegalArgumentException(
                "No EmailTemplatesEnum for value: " + value);
        }
        return result;
    }

    public static EmailTemplatesEnum toEnum(Object key) {
        if (!(key instanceof String)) {
            throw new IllegalArgumentException("key is not of type String");
        }
        return fromValue((String) key);
    }

    public Object toData() {
        return getValue();
    }

    public String getValue() {
        return value;
    }

    public String getName() {
        return name();
    }
}
