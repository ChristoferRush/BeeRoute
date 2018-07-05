package com.rushedstudio.domino.service.impl;

import com.rushedstudio.domino.api.mapper.RoleMapper;
import com.rushedstudio.domino.api.model.dto.RoleDTO;
import com.rushedstudio.domino.api.model.list.RoleListDTO;
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
    public RoleListDTO getAllRoles() {
        return new RoleListDTO(RoleMapper.INSTANCE.toRoleDTOList(roleRepository.findAll()));
    }

    @Override
    public RoleDTO getRoleById(Long id) {
        return RoleMapper.INSTANCE.toRoleDTO(roleRepository.getOne(id));
    }
}
