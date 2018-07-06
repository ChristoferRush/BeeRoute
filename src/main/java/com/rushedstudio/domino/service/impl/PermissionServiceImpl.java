package com.rushedstudio.domino.service.impl;

import com.rushedstudio.domino.api.mapper.PermissionMapper;
import com.rushedstudio.domino.api.mapper.RoleMapper;
import com.rushedstudio.domino.api.model.PermissionDto;
import com.rushedstudio.domino.api.model.RoleDto;
import com.rushedstudio.domino.domain.Role;
import com.rushedstudio.domino.repository.PermissionRepository;
import com.rushedstudio.domino.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionServiceImpl implements PermissionService {

    private PermissionRepository permissionRepository;

    @Autowired
    public PermissionServiceImpl(PermissionRepository permissionRepository) {
        this.permissionRepository = permissionRepository;
    }

    @Override
    public List<PermissionDto> getAllPermissions() {
        return PermissionMapper.INSTANCE.toPermissionDTOList(permissionRepository.findAll());
    }

    @Override
    public PermissionDto getPermissionById(Long id) {
        return PermissionMapper.INSTANCE.toPermissionDTO(permissionRepository.getOne(id));
    }

    @Override
    public PermissionDto getPermissionByName(String name) {
        return PermissionMapper.INSTANCE.toPermissionDTO(permissionRepository.findByName(name));
    }

    @Override
    public PermissionDto getPermissionByRole(RoleDto roleDto) {
        return PermissionMapper.INSTANCE.toPermissionDTO(permissionRepository.findByRoleListIsContaining(
                RoleMapper.INSTANCE.toRole(roleDto)));
    }
}
