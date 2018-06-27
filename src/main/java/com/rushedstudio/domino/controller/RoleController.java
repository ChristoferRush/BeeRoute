package com.rushedstudio.domino.controller;

import com.rushedstudio.domino.exception.RoleNotFoundException;
import com.rushedstudio.domino.model.Permission;
import com.rushedstudio.domino.model.Role;
import com.rushedstudio.domino.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/role")
public class RoleController {

    private final RoleRepository roleRepository;

    @Autowired
    public RoleController(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @GetMapping
    public void add(){
        roleRepository.save(new Role("rola", Permission.USER));
    }

    public void validateRoleId(Long roleId){
        roleRepository.findById(roleId).orElseThrow(
                () -> new RoleNotFoundException(roleId)
        );
    }
}
