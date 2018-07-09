package com.rushedstudio.domino.controller;

import com.rushedstudio.domino.api.model.AccountDto;
import com.rushedstudio.domino.api.model.UserDto;
import com.rushedstudio.domino.service.impl.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(AccountController.BASE_URL)
public class AccountController {

    static final String BASE_URL = "/account";

    private AccountServiceImpl accountService;

    @Autowired
    public AccountController(AccountServiceImpl accountService) {
        this.accountService = accountService;
    }

    @GetMapping(value = "/all")
    @ResponseStatus(HttpStatus.OK)
    public List<AccountDto> getAllAccounts(){
        return accountService.getAllAccounts();
    }

    @GetMapping(value = "/id:{id}")
    @ResponseStatus(HttpStatus.OK)
    public AccountDto getAccountById(@PathVariable Long id){
        return accountService.getAccountById(id);
    }

    @GetMapping(value = "/name:{name}")
    @ResponseStatus(HttpStatus.OK)
    public AccountDto getAccountByName(@PathVariable String name){
        return accountService.getAccountByName(name);
    }

    @GetMapping(value = "/user:{user}")
    @ResponseStatus(HttpStatus.OK)
    public AccountDto getAccountByUser(@PathVariable UserDto user){
        return accountService.getAccountByUser(user);
    }

    @GetMapping(value = "/userId:{userId}")
    @ResponseStatus(HttpStatus.OK)
    public AccountDto getAccountByUserId(@PathVariable Long userId){
        return accountService.getAccountByUserId(userId);
    }
}
