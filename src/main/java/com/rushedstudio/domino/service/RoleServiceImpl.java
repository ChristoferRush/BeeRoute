package com.rushedstudio.domino.service;

import com.rushedstudio.domino.model.Role;
import com.rushedstudio.domino.repository.RoleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    private RoleRepository roleRepository;

    @Override
    public List<Role> getAllRoles() {
        return null;
    }

    @Override
    public Role getRoleById(Long roleId) {
        return null;
    }
}
