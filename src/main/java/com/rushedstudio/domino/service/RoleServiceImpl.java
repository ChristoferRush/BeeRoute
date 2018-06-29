package com.rushedstudio.domino.service;

import com.rushedstudio.domino.api.mapper.RoleMapper;
import com.rushedstudio.domino.api.model.RoleDTO;
import com.rushedstudio.domino.api.model.RoleListDTO;
import com.rushedstudio.domino.domain.Role;
import com.rushedstudio.domino.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public RoleListDTO getAllRoles() {
        List<RoleDTO> roleDTOS = new ArrayList<>();
        List<Role> roles = new ArrayList<>();
        RoleListDTO roleListDTO = new RoleListDTO();
        roles = roleRepository.findAll();
        for (Role role : roles){
            roleDTOS.add(RoleMapper.INSTANCE.roleToRoleDTO(role));
        }
        roleListDTO.setRoles(roleDTOS);

        return roleListDTO;
    }


//        List<RoleDTO> list = roleRepository.findAll()
//                .stream()
//                .map(roleMapper::roleToRoleDTO)
//                .collect(Collectors.toList());
//        RoleListDTO roleListDTO = new RoleListDTO();
//        roleListDTO.setRoles(list);
//        return roleListDTO;
//    }


//        List<Role> roles = roleRepository.findAll();
//        List<RoleDTO> roleDTOS = null;
//        RoleListDTO dto = new RoleListDTO();
//        for (Role role : roles){
//            roleDTOS.add(RoleMapper.INSTANCE.roleToRoleDTO(role));
//        }
//        dto.setRoles(roleDTOS);
//        return dto;
//}

    @Override
    public RoleDTO getRoleById(Long roleId) {
        return RoleMapper.INSTANCE.roleToRoleDTO(roleRepository.getOne(roleId));
    }
}
