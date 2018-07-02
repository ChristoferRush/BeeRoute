package com.rushedstudio.domino.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.List;

@Data
public class PermissionDTO {

    private Long id;
    private String name;
    @JsonIgnore
    private List<RoleDTO> roles;
}
