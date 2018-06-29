package com.rushedstudio.domino.api.model;

import com.rushedstudio.domino.domain.Permission;
import lombok.Data;

import java.util.List;

@Data
public class RoleDTO {

    private Long id;
    private String name;
    private List<UserDTO> users;
    private Permission permission;
}
