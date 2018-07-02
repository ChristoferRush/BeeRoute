package com.rushedstudio.domino.service;

import com.rushedstudio.domino.api.mapper.RoleMapper;
import com.rushedstudio.domino.api.model.RoleDTO;
import com.rushedstudio.domino.api.model.RoleListDTO;
import com.rushedstudio.domino.domain.Permission;
import com.rushedstudio.domino.domain.Role;
import com.rushedstudio.domino.exception.RoleNotFoundException;
import com.rushedstudio.domino.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoleServiceImpl implements RoleService {

    private RoleMapper roleMapper;

    private RoleRepository roleRepository;

    @Autowired
    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    // get

    @Override
    public RoleListDTO getAllRoles() {
        RoleListDTO dto = new RoleListDTO();
        List<Role> rolesToMap = roleRepository.findAll();
        rolesToMap.forEach(role -> System.out.println(role.toString()));
        List<RoleDTO> roleListDTOS = RoleMapper.INSTANCE.roleListToRoleDTOList(rolesToMap);
        dto.setRoles(roleListDTOS);
        return dto;
    }

    @Override
    public RoleListDTO getRolesByPermission(Permission permission) throws RoleNotFoundException {
        RoleListDTO result = new RoleListDTO();
        List<RoleDTO> roles;
        List<Role> rolesToMap = roleRepository.findAllByPermission(permission);
        roles = RoleMapper.INSTANCE.roleListToRoleDTOList(rolesToMap);
        result.setRoles(roles);
        return result;
    }

    @Override
    public RoleListDTO getRolesByPermissionName(String permissionName) {
        RoleListDTO result = new RoleListDTO();
        result.setRoles(RoleMapper.INSTANCE.roleListToRoleDTOList(roleRepository.findAllByPermissionName(permissionName)));
        return result;
    }

    @Override
    public RoleDTO getRoleById(Long roleId) {
        return roleMapper.INSTANCE.roleToRoleDTO(roleRepository.getOne(roleId));
    }

    @Override
    public RoleDTO getRoleByName(String roleName) {
        return RoleMapper.INSTANCE.roleToRoleDTO(roleRepository.findRoleByName(roleName));
    }

    // delete

    @Override
    public void deleteRoleById(Long roleId) {
        roleRepository.delete(roleRepository.getOne(roleId));
    }
}
