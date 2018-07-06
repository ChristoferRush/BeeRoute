package com.rushedstudio.domino.api.model;

import lombok.Data;

import java.util.List;

@Data
public class PermissionDto {

    private Long id;
    private String name;
    private List<RoleDto> roleList;
}
