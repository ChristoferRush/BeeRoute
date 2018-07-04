package com.rushedstudio.domino.service.impl;

import com.rushedstudio.domino.api.mapper.AccountMapper;
import com.rushedstudio.domino.api.model.dto.AccountDTO;
import com.rushedstudio.domino.api.model.dto.UserDTO;
import com.rushedstudio.domino.api.model.list.AccountListDTO;
import com.rushedstudio.domino.repository.AccountRepository;
import com.rushedstudio.domino.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;

public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;

    @Autowired
    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public AccountListDTO getAllAccounts() {
        return new AccountListDTO(AccountMapper.INSTANCE.accountListToAccountDTOList(accountRepository.findAll()));
    }

    @Override
    public AccountDTO getAccountById(Long id) {
        return null;
    }

    @Override
    public AccountDTO getAccountByName(String name) {
        return null;
    }

    @Override
    public AccountDTO getAccountByUser(UserDTO userDTO) {
        return null;
    }

    @Override
    public AccountDTO getAccountByUserId(Long userId) {
        return null;
    }
}
