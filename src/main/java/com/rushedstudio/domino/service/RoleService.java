package com.rushedstudio.domino.service;

import com.rushedstudio.domino.api.model.dto.RoleDTO;
import com.rushedstudio.domino.api.model.list.RoleListDTO;
import com.rushedstudio.domino.domain.Permission;

public interface RoleService {

    // get

    RoleListDTO getAllRoles();

    RoleListDTO getRolesByPermission(Permission permission);

    RoleListDTO getRolesByPermissionName(String permissionName);

    RoleDTO getRoleById(Long roleId);

    RoleDTO getRoleByName(String name);

    // delete

    void deleteRoleById(Long roleId);
}
