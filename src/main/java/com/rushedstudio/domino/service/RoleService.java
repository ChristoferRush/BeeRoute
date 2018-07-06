package com.rushedstudio.domino.service;

import com.rushedstudio.domino.api.model.RoleDto;

import java.util.List;

public interface RoleService {

    List<RoleDto> getAllRoles();

    RoleDto getRoleById(Long id);
}
