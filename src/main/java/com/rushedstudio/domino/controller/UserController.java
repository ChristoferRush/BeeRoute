package com.rushedstudio.domino.controller;

import com.rushedstudio.domino.api.model.dto.UserDTO;
import com.rushedstudio.domino.api.model.list.UserListDTO;
import com.rushedstudio.domino.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = UserController.BASE_URL)
public class UserController {

    static final String BASE_URL = "/user";

    private UserServiceImpl userService;

    @Autowired
    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    // add



    // get

    @GetMapping(value = "/all")
    @ResponseStatus(HttpStatus.OK)
    public UserListDTO getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping(value = "/id:{userId}")
    @ResponseStatus(HttpStatus.OK)
    public UserDTO getUserById(@PathVariable Long userId){
        return userService.getUserById(userId);
    }

    @GetMapping(value = "/id:{userName}")
    @ResponseStatus(HttpStatus.OK)
    public UserDTO getUserByName(@PathVariable String userName){
        return userService.getUserByUsername(userName);
    }

    // delete

    @GetMapping(value = "/delete/id:{userId}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteUserById(@PathVariable Long userId){
        userService.deleteUserById(userId);
    }
}
