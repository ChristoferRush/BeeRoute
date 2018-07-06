package com.rushedstudio.domino.service;

import com.rushedstudio.domino.api.model.UserDto;

import java.util.List;

public interface UserService {

    List<UserDto> getAllUsers();

    UserDto getUserById(Long id);
}
