package com.rushedstudio.domino.service;

import com.rushedstudio.domino.api.model.dto.RoleDTO;

import java.util.List;

public interface RoleService {

    List<RoleDTO> getAllRoles();

    RoleDTO getRoleById(Long id);
}
