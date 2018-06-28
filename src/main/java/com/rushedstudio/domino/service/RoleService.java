package com.rushedstudio.domino.service;

import com.rushedstudio.domino.api.model.RoleDTO;
import com.rushedstudio.domino.api.model.RoleListDTO;

public interface RoleService {

    RoleListDTO getAllRoles();

    RoleDTO getRoleById(Long roleId);
}
