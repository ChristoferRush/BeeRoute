package com.rushedstudio.domino.service.impl;

import com.rushedstudio.domino.api.mapper.PermissionMapper;
import com.rushedstudio.domino.api.mapper.RoleMapper;
import com.rushedstudio.domino.api.model.PermissionDto;
import com.rushedstudio.domino.api.model.RoleDto;
import com.rushedstudio.domino.domain.Role;
import com.rushedstudio.domino.repository.RoleRepository;
import com.rushedstudio.domino.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    private RoleRepository roleRepository;

    @Autowired
    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public List<RoleDto> getAllRoles() {
        return RoleMapper.INSTANCE.toRoleDTOList(roleRepository.findAll());
    }

    @Override
    public RoleDto getRoleById(Long id) {
        return RoleMapper.INSTANCE.toRoleDTO(roleRepository.getOne(id));
    }

    @Override
    public RoleDto getRoleByName(String name) {
        return RoleMapper.INSTANCE.toRoleDTO(roleRepository.findRoleByName(name));
    }

    @Override
    public List<RoleDto> getRolesByPermission(PermissionDto permissionDto) {
        return RoleMapper.INSTANCE.toRoleDTOList(roleRepository.findAllByPermission(
                PermissionMapper.INSTANCE.toPermission(permissionDto)));
    }

    @Override
    public List<RoleDto> getRolesByPermissionId(Long permissionId) {
        return RoleMapper.INSTANCE.toRoleDTOList(roleRepository.findAllByPermissionId(permissionId));
    }

    @Override
    public List<RoleDto> getRolesByPermissionName(String permissionName) {
        return RoleMapper.INSTANCE.toRoleDTOList(roleRepository.findAllByPermissionName(permissionName));
    }
}
