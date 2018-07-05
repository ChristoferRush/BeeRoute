package com.rushedstudio.domino.service.impl;

import com.rushedstudio.domino.api.mapper.AccountMapper;
import com.rushedstudio.domino.api.model.dto.AccountDTO;
import com.rushedstudio.domino.api.model.dto.UserDTO;
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
    public List<AccountDTO> getAllAccounts() {
        List<AccountDTO> accountDTOS = new ArrayList<>();
        List<Account> accountList = new ArrayList<>();
        accountList = accountRepository.findAll();
        accountDTOS = AccountMapper.INSTANCE.toAccountDTOList(accountList);
        return accountDTOS;
    }

    @Override
    public AccountDTO getAccountById(Long id) {
        return AccountMapper.INSTANCE.toAccountDTO(accountRepository.getOne(id));
    }

    @Override
    public AccountDTO getAccountByName(String name) {
        return AccountMapper.INSTANCE.toAccountDTO(accountRepository.findByName(name));
    }

    @Override
    public AccountDTO getAccountByUser(UserDTO userDTO) {
//        return Mapper.INSTANCE.toAccountDTO(accountRepository.findByUser(
//                userDTO
//        ));
        return null;
    }

    @Override
    public AccountDTO getAccountByUserId(Long userId) {
        return AccountMapper.INSTANCE.toAccountDTO(accountRepository.findByUserId(userId));
    }
}
