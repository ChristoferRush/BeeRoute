package com.rushedstudio.domino.api.model.dto;

import lombok.Data;

import java.util.List;

@Data
public class PermissionDTO {

    private Long id;
    private String name;
    private List<RoleDTO> roleList;
}
