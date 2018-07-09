package com.rushedstudio.domino.controller;

import com.rushedstudio.domino.api.model.RoleDto;
import com.rushedstudio.domino.service.impl.RoleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(RoleController.BASE_URL)
public class RoleController {

    static final String BASE_URL = "/role";

    private RoleServiceImpl roleService;

    @Autowired
    public RoleController(RoleServiceImpl roleService) {
        this.roleService = roleService;
    }

    @GetMapping(value = "/all")
    @ResponseStatus(HttpStatus.OK)
    public List<RoleDto> getAllRoles(){
        return roleService.getAllRoles();
    }

    @GetMapping(value = "/id:{id}")
    @ResponseStatus(HttpStatus.OK)
    public RoleDto getRoleById(@PathVariable Long id){
        return roleService.getRoleById(id);
    }


}
