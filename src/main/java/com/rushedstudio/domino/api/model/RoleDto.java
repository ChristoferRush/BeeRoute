package com.rushedstudio.domino.api.model;

import lombok.Data;

@Data
public class RoleDto {

    private Long id;
    private String name;
    private Long permissionId;
}
