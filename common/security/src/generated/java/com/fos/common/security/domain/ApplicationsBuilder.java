package com.fos.common.security.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
  * Builder for Applications class.
  */
public class ApplicationsBuilder {
    private String applicationCode;
    private String applicationName;
    private String applicationDesc;
    private boolean applicationStatus;
    private Date createdDate;
    private String createdBy;
    private Date lastUpdated;
    private String lastUpdatedBy;
    private List<Modules> modules = new ArrayList<Modules>();

    public ApplicationsBuilder() {
    }

    public ApplicationsBuilder(String applicationCode, String applicationName) {
        this.applicationCode = applicationCode;

        this.applicationName = applicationName;

    }

    /**
     * Static factor method for ApplicationsBuilder
     */
    public static ApplicationsBuilder applications() {
        return new ApplicationsBuilder();
    }

    public ApplicationsBuilder applicationCode(String val) {
        this.applicationCode = val;
        return this;
    }

    public ApplicationsBuilder applicationName(String val) {
        this.applicationName = val;
        return this;
    }

    public ApplicationsBuilder applicationDesc(String val) {
        this.applicationDesc = val;
        return this;
    }

    public ApplicationsBuilder applicationStatus(boolean val) {
        this.applicationStatus = val;
        return this;
    }

    public ApplicationsBuilder createdDate(Date val) {
        this.createdDate = val;
        return this;
    }

    public ApplicationsBuilder createdBy(String val) {
        this.createdBy = val;
        return this;
    }

    public ApplicationsBuilder lastUpdated(Date val) {
        this.lastUpdated = val;
        return this;
    }

    public ApplicationsBuilder lastUpdatedBy(String val) {
        this.lastUpdatedBy = val;
        return this;
    }

    /**
     * Adds an object to the to-many
     * association.
     * It is added the collection {@link #getModules}.
     */
    public ApplicationsBuilder addModule(Modules moduleElement) {
        getModules().add(moduleElement);
        return this;
    }

    public String getApplicationCode() {
        return applicationCode;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public String getApplicationDesc() {
        return applicationDesc;
    }

    public boolean isApplicationStatus() {
        return applicationStatus;
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

    public List<Modules> getModules() {
        return modules;
    }

    /**
     * @return new Applications instance constructed based on the values that have been set into this builder
     */
    public Applications build() {
        Applications obj =
            new Applications(getApplicationCode(), getApplicationName());

        obj.setApplicationDesc(applicationDesc);

        obj.setApplicationStatus(applicationStatus);

        obj.setCreatedDate(createdDate);

        obj.setCreatedBy(createdBy);

        obj.setLastUpdated(lastUpdated);

        obj.setLastUpdatedBy(lastUpdatedBy);

        obj.getModules().addAll(modules);

        return obj;
    }
}
