package com.rushedstudio.domino.repository;

import com.rushedstudio.domino.domain.Permission;
import com.rushedstudio.domino.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    List<Role> findAllByPermission(Permission permission);

    List<Role> findAllByPermissionName(String permissionName);

    Role findRoleByName(String name);
}
