package com.rushedstudio.domino.service;

import com.rushedstudio.domino.api.model.PermissionDTO;
import com.rushedstudio.domino.api.model.list.PermissionListDTO;

public interface PermissionService {

    // get

    PermissionListDTO getAllPermissions();

    PermissionDTO getPermissionById(Long permissionId);

    PermissionDTO getPermissionByName(String permissionName);

    // delete

    void deletePermissionById(Long permissionId);
}
