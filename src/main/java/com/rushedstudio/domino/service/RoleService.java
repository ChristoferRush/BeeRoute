package com.rushedstudio.domino.service;

import com.rushedstudio.domino.model.Role;

import java.util.List;

public interface RoleService {

    List<Role> getAllRoles();

    Role getRoleById(Long roleId);
}
