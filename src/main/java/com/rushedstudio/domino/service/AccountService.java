package com.rushedstudio.domino.service;

import com.rushedstudio.domino.api.model.dto.AccountDTO;
import com.rushedstudio.domino.api.model.dto.UserDTO;
import com.rushedstudio.domino.api.model.list.AccountListDTO;

public interface AccountService {

    AccountListDTO getAllAccounts();

    AccountDTO getAccountById(Long id);

    AccountDTO getAccountByName(String name);

    AccountDTO getAccountByUser(UserDTO userDTO);

    AccountDTO getAccountByUserId(Long userId);
}
