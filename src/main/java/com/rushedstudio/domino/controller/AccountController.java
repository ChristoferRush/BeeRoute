package com.rushedstudio.domino.controller;

import com.rushedstudio.domino.api.model.dto.AccountDTO;
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
    public List<AccountDTO> getAllAccounts(){
        return accountService.getAllAccounts();
    }

    @GetMapping(value = "/id:{id}")
    @ResponseStatus(HttpStatus.OK)
    public AccountDTO getAccountById(@PathVariable Long id){
        return accountService.getAccountById(id);
    }

    @GetMapping(value = "/name:{name}")
    @ResponseStatus(HttpStatus.OK)
    public AccountDTO getAccountByName(@PathVariable String name){
        return accountService.getAccountByName(name);
    }
}
