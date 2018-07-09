package com.rushedstudio.domino.controller;

import com.rushedstudio.domino.api.model.PermissionDto;
import com.rushedstudio.domino.api.model.RoleDto;
import com.rushedstudio.domino.service.impl.PermissionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(PermissionController.BASE_URL)
public class PermissionController {

    static final String BASE_URL = "/permission";

    private PermissionServiceImpl permissionService;

    @Autowired
    public PermissionController(PermissionServiceImpl permissionService) {
        this.permissionService = permissionService;
    }

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<PermissionDto> getAllPermissions(){
        return permissionService.getAllPermissions();
    }

    @GetMapping("/id:{id}")
    @ResponseStatus(HttpStatus.OK)
    public PermissionDto getPermissionById(@PathVariable Long id){
        return permissionService.getPermissionById(id);
    }

    @GetMapping("/name:{name}")
    @ResponseStatus(HttpStatus.OK)
    public PermissionDto getPermissionById(@PathVariable String name){
        return permissionService.getPermissionByName(name);
    }

    @GetMapping("/role:{roleDto}")
    @ResponseStatus(HttpStatus.OK)
    public PermissionDto getPermissionByRole(@PathVariable RoleDto roleDto){
        return permissionService.getPermissionByRole(roleDto);
    }
}
