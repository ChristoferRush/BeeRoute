package com.rushedstudio.domino.service;

import com.rushedstudio.domino.api.model.PermissionDto;
import com.rushedstudio.domino.api.model.RoleDto;

import java.util.List;

public interface RoleService {

    List<RoleDto> getAllRoles();

    List<RoleDto> getRolesByPermission(PermissionDto permissionDto);

    List<RoleDto> getRolesByPermissionId(Long permissionId);

    List<RoleDto> getRolesByPermissionName(String permissionName);

    RoleDto getRoleById(Long id);

    RoleDto getRoleByName(String name);
}
