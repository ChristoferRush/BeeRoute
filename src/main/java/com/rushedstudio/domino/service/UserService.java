package com.rushedstudio.domino.service;

import com.rushedstudio.domino.api.model.AccountDto;
import com.rushedstudio.domino.api.model.RoleDto;
import com.rushedstudio.domino.api.model.UserDto;

import java.util.List;

public interface UserService {

    List<UserDto> getAllUsers();

    List<UserDto> getAllUsersByFirstName(String firstName);

    List<UserDto> getAllUsersByLastName(String lastName);

    List<UserDto> getAllUsersByRole(RoleDto role);

    List<UserDto> getAllUsersByRoleId(Long roleId);

    UserDto getUserById(Long id);

    UserDto getUserByEmail(String email);

    UserDto getUserByAccount(AccountDto accountDto);

    UserDto getUserByAccountId(Long accountId);
}
