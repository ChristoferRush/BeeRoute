package com.rushedstudio.domino.service.impl;

import com.rushedstudio.domino.api.mapper.AccountMapper;
import com.rushedstudio.domino.api.mapper.RoleMapper;
import com.rushedstudio.domino.api.mapper.UserMapper;
import com.rushedstudio.domino.api.model.AccountDto;
import com.rushedstudio.domino.api.model.RoleDto;
import com.rushedstudio.domino.api.model.UserDto;
import com.rushedstudio.domino.repository.UserRepository;
import com.rushedstudio.domino.service.UserService;
import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserDto> getAllUsers() {
        return UserMapper.INSTANCE.toUserDTOList(userRepository.findAll());
    }

    @Override
    public List<UserDto> getAllUsersByFirstName(String firstName) {
        return UserMapper.INSTANCE.toUserDTOList(userRepository.findAllByFirstName(firstName));
    }

    @Override
    public List<UserDto> getAllUsersByLastName(String lastName) {
        return UserMapper.INSTANCE.toUserDTOList(userRepository.findAllByLastName(lastName));
    }

    @Override
    public List<UserDto> getAllUsersByRole(RoleDto role) {
        return UserMapper.INSTANCE.toUserDTOList(userRepository.findAllByRole(RoleMapper.INSTANCE.toRole(role)));
    }

    @Override
    public List<UserDto> getAllUsersByRoleId(Long roleId) {
        return UserMapper.INSTANCE.toUserDTOList(userRepository.findAllByRoleId(roleId));
    }

    @Override
    public UserDto getUserById(Long id) {
        return UserMapper.INSTANCE.toUserDTO(userRepository.getOne(id));
    }

    @Override
    public UserDto getUserByEmail(String email) {
        return UserMapper.INSTANCE.toUserDTO(userRepository.findByEmail(email));
    }

    @Override
    public UserDto getUserByAccount(AccountDto accountDto) {
        return UserMapper.INSTANCE.toUserDTO(userRepository.findByAccount(
                AccountMapper.INSTANCE.toAccount(accountDto)));
    }

    @Override
    public UserDto getUserByAccountId(Long accountId) {
        return UserMapper.INSTANCE.toUserDTO(userRepository.findByAccountId(accountId));
    }
}
