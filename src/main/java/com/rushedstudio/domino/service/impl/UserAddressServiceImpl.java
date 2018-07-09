package com.rushedstudio.domino.service.impl;

import com.rushedstudio.domino.api.mapper.AddressMapper;
import com.rushedstudio.domino.api.mapper.UserAddressMapper;
import com.rushedstudio.domino.api.mapper.UserMapper;
import com.rushedstudio.domino.api.model.AddressDto;
import com.rushedstudio.domino.api.model.UserAddressDto;
import com.rushedstudio.domino.api.model.UserDto;
import com.rushedstudio.domino.repository.UserAddressRepository;
import com.rushedstudio.domino.service.UserAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserAddressServiceImpl implements UserAddressService {

    private UserAddressRepository userAddressRepository;

    @Autowired
    public UserAddressServiceImpl(UserAddressRepository userAddressRepository) {
        this.userAddressRepository = userAddressRepository;
    }

    @Override
    public List<UserAddressDto> getAllUserAddresses() {
        return UserAddressMapper.INSTANCE.toUserAddressDTOList(userAddressRepository.findAll());
    }

    @Override
    public List<UserAddressDto> getAllUserAddressesByUser(UserDto userDto) {
        return UserAddressMapper.INSTANCE.toUserAddressDTOList(userAddressRepository.findAllByUser(
                UserMapper.INSTANCE.toUser(userDto)));
    }

    @Override
    public List<UserAddressDto> getAllUserAddressesByAddress(AddressDto addressDto) {
        return UserAddressMapper.INSTANCE.toUserAddressDTOList(userAddressRepository.findAllByAddress(
                AddressMapper.INSTANCE.toAddress(addressDto)));
    }

    @Override
    public List<UserAddressDto> getAllUserAddressesByMain(boolean main) {
        return UserAddressMapper.INSTANCE.toUserAddressDTOList(userAddressRepository.findByMain(main));
    }

    @Override
    public UserAddressDto getUserAddressById(Long id) {
        return UserAddressMapper.INSTANCE.toUserAddressDTO(userAddressRepository.getOne(id));
    }
}
