package com.rushedstudio.domino.repository;

import com.rushedstudio.domino.domain.Permission;
import com.rushedstudio.domino.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissionRepository extends JpaRepository<Permission, Long> {

    Permission findByName(String name);

    Permission findByRoleListIsContaining(Role role);
}
