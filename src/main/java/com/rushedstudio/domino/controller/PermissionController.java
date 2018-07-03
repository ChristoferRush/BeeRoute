package com.rushedstudio.domino.controller;

import com.rushedstudio.domino.api.model.dto.PermissionDTO;
import com.rushedstudio.domino.api.model.list.PermissionListDTO;
import com.rushedstudio.domino.service.PermissionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = PermissionController.BASE_URL)
public class PermissionController {

    static final String BASE_URL = "/permission";

    private PermissionServiceImpl permissionService;

    @Autowired
    public PermissionController(PermissionServiceImpl permissionService) {
        this.permissionService = permissionService;
    }

    // get

    @GetMapping(value = "/all")
    @ResponseStatus(HttpStatus.OK)
    public PermissionListDTO getAllPermissions(){
        return permissionService.getAllPermissions();
    }

    @GetMapping(value = "/id:{permissionId}")
    @ResponseStatus(HttpStatus.OK)
    public PermissionDTO getPermissionById(@PathVariable Long permissionId){
        return permissionService.getPermissionById(permissionId);
    }

    @GetMapping(value = "/name:{permissionName}")
    @ResponseStatus(HttpStatus.OK)
    public PermissionDTO getPermissionByName(@PathVariable String permissionName){
        return permissionService.getPermissionByName(permissionName);
    }

    // delete

    @GetMapping(value = "/delete/id:{permissionid}")
    @ResponseStatus(HttpStatus.OK)
    public void deletePermissionById(@PathVariable Long permissionid){
        permissionService.deletePermissionById(permissionid);
    }
}
