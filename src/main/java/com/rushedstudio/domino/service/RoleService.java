package com.rushedstudio.domino.service;

import com.rushedstudio.domino.api.model.PermissionDto;
import com.rushedstudio.domino.api.model.RoleDto;

import java.util.List;

public interface RoleService {

    List<RoleDto> getAllRoles();

    RoleDto getRoleById(Long id);

    RoleDto getRoleByName(String name);

    List<RoleDto> getRolesByPermission(PermissionDto permissionDto);

    List<RoleDto> getRolesByPermissionId(Long permissionId);

    List<RoleDto> getRolesByPermissionName(String permissionName);
}
