package com.rushedstudio.domino.controller;

import com.rushedstudio.domino.api.model.AccountDto;
import com.rushedstudio.domino.api.model.RoleDto;
import com.rushedstudio.domino.api.model.UserDto;
import com.rushedstudio.domino.domain.User;
import com.rushedstudio.domino.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    private UserServiceImpl userService;

    @Autowired
    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/all")
    @ResponseStatus(HttpStatus.OK)
    public List<UserDto> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping(value = "/firstname:{firstName}")
    @ResponseStatus(HttpStatus.OK)
    public List<UserDto> getAllUsersByFirstName(@PathVariable String firstName){
        return userService.getAllUsersByFirstName(firstName);
    }

    @GetMapping(value = "/lastName:{lastName}")
    @ResponseStatus(HttpStatus.OK)
    public List<UserDto> getAllUsersByLastName(@PathVariable String lastName){
        return userService.getAllUsersByLastName(lastName);
    }

    @GetMapping(value = "/role:{roleDto}")
    @ResponseStatus(HttpStatus.OK)
    public List<UserDto> getAllUsersByRole(@PathVariable RoleDto roleDto){
        return userService.getAllUsersByRole(roleDto);
    }

    @GetMapping(value = "/roleId:{roleId}")
    @ResponseStatus(HttpStatus.OK)
    public List<UserDto> getAllUsersByRoleId(@PathVariable Long roleId){
        return userService.getAllUsersByRoleId(roleId);
    }

    @GetMapping(value = "/id:{id}")
    @ResponseStatus(HttpStatus.OK)
    public UserDto getUserById(@PathVariable Long id){
        return userService.getUserById(id);
    }

    @GetMapping(value = "/email:{email}")
    @ResponseStatus(HttpStatus.OK)
    public UserDto getUserByEmail(@PathVariable String email){
        return userService.getUserByEmail(email);
    }

    @GetMapping(value = "/account:{accountDto}")
    @ResponseStatus(HttpStatus.OK)
    public UserDto getUserByAccount(@PathVariable AccountDto accountDto){
        return userService.getUserByAccount(accountDto);
    }

    @GetMapping(value = "/accountId:{accountId}")
    @ResponseStatus(HttpStatus.OK)
    public UserDto getUserByAccountId(@PathVariable Long accountId){
        return userService.getUserByAccountId(accountId);
    }
}
