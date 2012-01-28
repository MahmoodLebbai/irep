package com.fos.common.security.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
  * Builder for Department class.
  */
public class DepartmentBuilder {
    private String departmentCode;
    private String departmentName;
    private String departmentDesc;
    private Date createdDate;
    private String createdBy;
    private Date lastUpdated;
    private String lastUpdatedBy;
    private List<User> users = new ArrayList<User>();

    public DepartmentBuilder() {
    }

    public DepartmentBuilder(String departmentCode, String departmentName) {
        this.departmentCode = departmentCode;

        this.departmentName = departmentName;

    }

    /**
     * Static factor method for DepartmentBuilder
     */
    public static DepartmentBuilder department() {
        return new DepartmentBuilder();
    }

    public DepartmentBuilder departmentCode(String val) {
        this.departmentCode = val;
        return this;
    }

    public DepartmentBuilder departmentName(String val) {
        this.departmentName = val;
        return this;
    }

    public DepartmentBuilder departmentDesc(String val) {
        this.departmentDesc = val;
        return this;
    }

    public DepartmentBuilder createdDate(Date val) {
        this.createdDate = val;
        return this;
    }

    public DepartmentBuilder createdBy(String val) {
        this.createdBy = val;
        return this;
    }

    public DepartmentBuilder lastUpdated(Date val) {
        this.lastUpdated = val;
        return this;
    }

    public DepartmentBuilder lastUpdatedBy(String val) {
        this.lastUpdatedBy = val;
        return this;
    }

    /**
     * Adds an object to the to-many
     * association.
     * It is added the collection {@link #getUsers}.
     */
    public DepartmentBuilder addUser(User userElement) {
        getUsers().add(userElement);
        return this;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public String getDepartmentDesc() {
        return departmentDesc;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public List<User> getUsers() {
        return users;
    }

    /**
     * @return new Department instance constructed based on the values that have been set into this builder
     */
    public Department build() {
        Department obj =
            new Department(getDepartmentCode(), getDepartmentName());

        obj.setDepartmentDesc(departmentDesc);

        obj.setCreatedDate(createdDate);

        obj.setCreatedBy(createdBy);

        obj.setLastUpdated(lastUpdated);

        obj.setLastUpdatedBy(lastUpdatedBy);

        obj.getUsers().addAll(users);

        return obj;
    }
}
