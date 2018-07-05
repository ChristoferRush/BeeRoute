package com.rushedstudio.domino.service;

import com.rushedstudio.domino.api.model.dto.AccountDTO;
import com.rushedstudio.domino.api.model.dto.UserDTO;

import java.util.List;

public interface AccountService {

    List<AccountDTO> getAllAccounts();

    AccountDTO getAccountById(Long id);

    AccountDTO getAccountByName(String name);

    AccountDTO getAccountByUser(UserDTO userDTO);

    AccountDTO getAccountByUserId(Long userId);
}
