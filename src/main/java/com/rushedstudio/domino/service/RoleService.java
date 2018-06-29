package com.rushedstudio.domino.service;

import com.rushedstudio.domino.api.model.RoleDTO;
import com.rushedstudio.domino.api.model.RoleListDTO;

public interface RoleService {

    // get

    RoleListDTO getAllRoles();

    RoleListDTO getRolesByPermission(String permission);

    RoleDTO getRoleById(Long roleId);

    RoleDTO getRoleByName(String name);

    // delete

    void deleteRoleById(Long roleId);
}
