package com.rushedstudio.domino.service;

import com.rushedstudio.domino.api.model.PermissionDto;
import com.rushedstudio.domino.api.model.RoleDto;

import java.util.List;

public interface PermissionService {

    List<PermissionDto> getAllPermissions();

    PermissionDto getPermissionById(Long id);

    PermissionDto getPermissionByName(String name);

    PermissionDto getPermissionByRole(RoleDto roleDto);
}
