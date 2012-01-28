package com.fos.common.security.domain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import com.fos.common.security.dto.DepartmentDTO;
import com.fos.common.security.dto.UserDTO;

/**
  * Builder for DepartmentDTO class.
  */
public class DepartmentDTOBuilder {
    private String departmentCode;
    private String departmentName;
    private String departmentDesc;
    private List<UserDTO> users = new ArrayList<UserDTO>();

    public DepartmentDTOBuilder() {
    }

    /**
     * Static factor method for DepartmentDTOBuilder
     */
    public static DepartmentDTOBuilder departmentDTO() {
        return new DepartmentDTOBuilder();
    }

    public DepartmentDTOBuilder departmentCode(String val) {
        this.departmentCode = val;
        return this;
    }

    public DepartmentDTOBuilder departmentName(String val) {
        this.departmentName = val;
        return this;
    }

    public DepartmentDTOBuilder departmentDesc(String val) {
        this.departmentDesc = val;
        return this;
    }

    /**
     * Adds an object to the to-many
     * association.
     * It is added the collection {@link #getUsers}.
     */
    public DepartmentDTOBuilder addUser(UserDTO userElement) {
        getUsers().add(userElement);
        return this;
    }

    @XmlElement()
    public String getDepartmentCode() {
        return departmentCode;
    }

    @XmlElement()
    public String getDepartmentName() {
        return departmentName;
    }

    @XmlElement()
    public String getDepartmentDesc() {
        return departmentDesc;
    }

    public List<UserDTO> getUsers() {
        return users;
    }

    /**
     * @return new DepartmentDTO instance constructed based on the values that have been set into this builder
     */
    public DepartmentDTO build() {
        DepartmentDTO obj = new DepartmentDTO();

        obj.setDepartmentCode(departmentCode);

        obj.setDepartmentName(departmentName);

        obj.setDepartmentDesc(departmentDesc);

        obj.getUsers().addAll(users);

        return obj;
    }
}
