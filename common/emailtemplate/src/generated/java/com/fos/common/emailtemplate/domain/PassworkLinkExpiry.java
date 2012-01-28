package com.fos.common.emailtemplate.domain;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;

/**
* Enum for PassworkLinkExpiry
*/
public enum PassworkLinkExpiry implements Serializable {
    SECONDS("Seconds"),
    MINUTES("Minutes"),
    HOURS("Hours"),
    DAYS("Days");

    /**
     */
    private static Map<String,PassworkLinkExpiry> identifierMap =
        new HashMap<String,PassworkLinkExpiry>();

    static {
        for (PassworkLinkExpiry value : PassworkLinkExpiry.values()) {
            identifierMap.put(value.getValue(), value);
        }
    }

    private String value;

    /**
     */
    private PassworkLinkExpiry(String value) {
        this.value = value;
    }

    public static PassworkLinkExpiry fromValue(String value) {
        PassworkLinkExpiry result = identifierMap.get(value);
        if (result == null) {
            throw new IllegalArgumentException(
                "No PassworkLinkExpiry for value: " + value);
        }
        return result;
    }

    public static PassworkLinkExpiry toEnum(Object key) {
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
