package com.rushedstudio.domino.service;

import com.rushedstudio.domino.api.model.dto.RoleDTO;
import com.rushedstudio.domino.api.model.list.RoleListDTO;

public interface RoleService {

    RoleListDTO getAllRoles();

    RoleDTO getRoleById(Long id);
}
