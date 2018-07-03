package com.rushedstudio.domino.service.impl;

import com.rushedstudio.domino.api.mapper.RoleMapper;
import com.rushedstudio.domino.api.model.dto.RoleDTO;
import com.rushedstudio.domino.api.model.list.RoleListDTO;
import com.rushedstudio.domino.domain.Permission;
import com.rushedstudio.domino.exception.RoleNotFoundException;
import com.rushedstudio.domino.repository.RoleRepository;
import com.rushedstudio.domino.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    private RoleRepository roleRepository;

    @Autowired
    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    // get

    @Override
    public RoleListDTO getAllRoles() {
        RoleListDTO dto = new RoleListDTO();
        dto.setRoles(RoleMapper.INSTANCE.roleListToRoleDTOList(roleRepository.findAll()));
        return dto;
    }

    @Override
    public RoleListDTO getRolesByPermission(Permission permission) throws RoleNotFoundException {
        RoleListDTO result = new RoleListDTO();
        result.setRoles(RoleMapper.INSTANCE.roleListToRoleDTOList(roleRepository.findAllByPermission(permission)));
        if (result.getRoles().isEmpty()){
            throw new RoleNotFoundException(permission);
        }
        return result;
    }

    @Override
    public RoleListDTO getRolesByPermissionName(String permissionName) {
        RoleListDTO result = new RoleListDTO();
        result.setRoles(RoleMapper.INSTANCE.roleListToRoleDTOList(roleRepository.findAllByPermissionName(permissionName)));
        if (result.getRoles().isEmpty()){
            throw new RoleNotFoundException(new Permission(permissionName));
        }
        return result;
    }

    @Override
    public RoleDTO getRoleById(Long roleId) throws RoleNotFoundException {
        RoleDTO dto = RoleMapper.INSTANCE.roleToRoleDTO(roleRepository.getOne(roleId));
        if (dto == null) {
            throw new RoleNotFoundException(roleId);
        }
        return dto;
    }

    @Override
    public RoleDTO getRoleByName(String roleName) throws RoleNotFoundException {
        RoleDTO dto = RoleMapper.INSTANCE.roleToRoleDTO(roleRepository.findRoleByName(roleName));
        if (dto == null){
            throw new RoleNotFoundException(roleName);
        }
        return dto;
    }

    // delete

    @Override
    public void deleteRoleById(Long roleId) {
        roleRepository.delete(roleRepository.getOne(roleId));
    }
}
