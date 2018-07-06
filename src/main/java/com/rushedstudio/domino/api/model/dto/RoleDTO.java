package com.rushedstudio.domino.api.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
public class RoleDTO {

    private Long id;
    private String name;
    @JsonIgnoreProperties("roleList")
    private PermissionDTO permission;
    @JsonIgnore
    private List<UserDTO> userList;
}
