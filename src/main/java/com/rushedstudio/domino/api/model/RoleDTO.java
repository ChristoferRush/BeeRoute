package com.rushedstudio.domino.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.rushedstudio.domino.domain.Permission;
import lombok.Data;

import java.util.List;

@Data
public class RoleDTO {

    private Long id;
    private String name;
    @JsonIgnore
    private List<UserDTO> users;
    @JsonIgnoreProperties("roles")
    private Permission permission;
}
