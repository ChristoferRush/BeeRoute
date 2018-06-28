package com.rushedstudio.domino.controller;

import com.rushedstudio.domino.api.model.RoleDTO;
import com.rushedstudio.domino.api.model.RoleListDTO;
import com.rushedstudio.domino.service.RoleService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = RoleController.BASE_URL)
public class RoleController {

    static final String BASE_URL = "/role";

    private RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping(value = "/all")
    @ResponseStatus(HttpStatus.OK)
    public RoleListDTO getAllRoles(){
        return roleService.getAllRoles();
    }

    @GetMapping(value = "/{roleId}")
    @ResponseStatus(HttpStatus.OK)
    public RoleDTO getRoleById(@PathVariable Long roleId){
        return roleService.getRoleById(roleId);
    }
}
