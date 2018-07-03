package com.rushedstudio.domino.service;

import com.rushedstudio.domino.api.mapper.PermissionMapper;
import com.rushedstudio.domino.api.model.dto.PermissionDTO;
import com.rushedstudio.domino.api.model.list.PermissionListDTO;
import com.rushedstudio.domino.repository.PermissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PermissionServiceImpl implements PermissionService {

    private PermissionRepository permissionRepository;

    @Autowired
    public PermissionServiceImpl(PermissionRepository permissionRepository) {
        this.permissionRepository = permissionRepository;
    }

    // get

    @Override
    public PermissionListDTO getAllPermissions() {
        PermissionListDTO dto = new PermissionListDTO();
        dto.setPermissions(PermissionMapper.INSTANCE.permissionListToPermissionDTOList(permissionRepository.findAll()));
        return dto;
    }

    @Override
    public PermissionDTO getPermissionById(Long permissionId) {
        return PermissionMapper.INSTANCE.permissionToPermissionDTO(permissionRepository.getOne(permissionId));
    }

    @Override
    public PermissionDTO getPermissionByName(String permissionName) {
        return PermissionMapper.INSTANCE.permissionToPermissionDTO(permissionRepository.findByName(permissionName));
    }

    // delete

    @Override
    public void deletePermissionById(Long permissionId) {
        permissionRepository.delete(permissionRepository.getOne(permissionId));
    }
}
