package com.rushedstudio.domino.api.model;

import lombok.Data;

import java.util.List;

@Data
public class PermissionListDTO {

    private List<PermissionDTO> permissions;
}
