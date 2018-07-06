package com.rushedstudio.domino.service.impl;

import com.rushedstudio.domino.api.mapper.AccountMapper;
import com.rushedstudio.domino.api.mapper.UserMapper;
import com.rushedstudio.domino.api.model.AccountDto;
import com.rushedstudio.domino.api.model.UserDto;
import com.rushedstudio.domino.domain.Account;
import com.rushedstudio.domino.repository.AccountRepository;
import com.rushedstudio.domino.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;

    @Autowired
    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public List<AccountDto> getAllAccounts() {
        List<AccountDto> accountDtos;
        List<Account> accountList;
        accountList = accountRepository.findAll();
        accountDtos = AccountMapper.INSTANCE.toAccountDTOList(accountList);
        return accountDtos;
    }

    @Override
    public AccountDto getAccountById(Long id) {
        return AccountMapper.INSTANCE.toAccountDTO(accountRepository.getOne(id));
    }

    @Override
    public AccountDto getAccountByName(String name) {
        return AccountMapper.INSTANCE.toAccountDTO(accountRepository.findByName(name));
    }

    @Override
    public AccountDto getAccountByUser(UserDto userDto) {
        return AccountMapper.INSTANCE.toAccountDTO(accountRepository.findByUser(
                UserMapper.INSTANCE.toUser(userDto)
        ));
    }

    @Override
    public AccountDto getAccountByUserId(Long userId) {
        return AccountMapper.INSTANCE.toAccountDTO(accountRepository.findByUserId(userId));
    }
}
