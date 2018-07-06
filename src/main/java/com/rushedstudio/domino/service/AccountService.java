package com.rushedstudio.domino.service;

import com.rushedstudio.domino.api.model.AccountDto;
import com.rushedstudio.domino.api.model.UserDto;

import java.util.List;

public interface AccountService {

    List<AccountDto> getAllAccounts();

    AccountDto getAccountById(Long id);

    AccountDto getAccountByName(String name);

    AccountDto getAccountByUser(UserDto userDto);

    AccountDto getAccountByUserId(Long userId);
}
