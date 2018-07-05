package com.rushedstudio.domino.service.impl;

import com.rushedstudio.domino.api.mapper.UserMapper;
import com.rushedstudio.domino.api.model.dto.UserDTO;
import com.rushedstudio.domino.repository.UserRepository;
import com.rushedstudio.domino.service.UserService;
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
    public List<UserDTO> getAllUsers() {
        return UserMapper.INSTANCE.toUserDTOList(userRepository.findAll());
    }

    @Override
    public UserDTO getUserById(Long id) {
        return UserMapper.INSTANCE.toUserDTO(userRepository.getOne(id));
    }
}
