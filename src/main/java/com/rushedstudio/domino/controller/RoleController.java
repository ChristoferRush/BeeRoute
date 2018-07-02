package com.rushedstudio.domino.controller;

import com.rushedstudio.domino.api.model.RoleDTO;
import com.rushedstudio.domino.api.model.RoleListDTO;
import com.rushedstudio.domino.service.RoleServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = RoleController.BASE_URL)
public class RoleController {

    static final String BASE_URL = "/role";

    private RoleServiceImpl roleService;

    public RoleController(RoleServiceImpl roleService) {
        this.roleService = roleService;
    }

    // get

    @GetMapping(value = "/all")
    @ResponseStatus(HttpStatus.OK)
    public RoleListDTO getAllRoles(){
        return roleService.getAllRoles();
    }

    @GetMapping(value = "/permission:{permissionName}")
    @ResponseStatus(HttpStatus.OK)
    public RoleListDTO getAllRolesByPermission(@PathVariable String permissionName){
        return roleService.getRolesByPermissionName(permissionName);
    }

    @GetMapping(value = "/id:{roleId}")
    @ResponseStatus(HttpStatus.OK)
    public RoleDTO getRoleById(@PathVariable Long roleId){
        return roleService.getRoleById(roleId);
    }

    @GetMapping(value = "/name:{roleName}")
    @ResponseStatus(HttpStatus.OK)
    public RoleDTO getRoleByName(@PathVariable String roleName){
        return roleService.getRoleByName(roleName);
    }

    // delete

    @GetMapping(value = "/delete/{roleId}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteRoleById(@PathVariable Long roleId){
        roleService.deleteRoleById(roleId);
    }
}
