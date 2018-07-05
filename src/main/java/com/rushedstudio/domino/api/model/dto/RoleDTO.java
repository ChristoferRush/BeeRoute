package com.rushedstudio.domino.api.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.List;

@Data
public class RoleDTO {

    private Long id;
    private String name;
//    @JsonIgnore
//    private PermissionDTO permission;
    @JsonIgnore
    private List<UserDTO> userList;
}
