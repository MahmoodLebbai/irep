package com.fos.common.util;

import org.fornax.cartridges.sculptor.framework.util.EnumHelper;

import org.hibernate.HibernateException;
import org.hibernate.type.EnumType;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import java.util.Properties;

@SuppressWarnings("serial")
public class EnumUserType extends EnumType {
    @Override
    public Object nullSafeGet(ResultSet rs, String[] names, Object owner)
        throws HibernateException, SQLException {
        Object object = rs.getObject(names[0]);
        if (rs.wasNull()) {
            return null;
        }
        return EnumHelper.toEnum(returnedClass(), object);
    }

    @Override
    public void nullSafeSet(PreparedStatement st, Object value, int index)
        throws HibernateException, SQLException {
        if (value == null) {
            st.setNull(index, sqlTypes()[0]);
        } else {
            st.setObject(index, EnumHelper.toData((Enum) value), sqlTypes()[0]);
        }
    }

    @Override
    public void setParameterValues(Properties properties) {
        // set default type to varchar
        properties.setProperty(TYPE,
            properties.getProperty(TYPE, "" + Types.VARCHAR));
        super.setParameterValues(properties);
    }
}
