package com.rushedstudio.domino.service;

import com.rushedstudio.domino.api.model.AddressDto;
import com.rushedstudio.domino.api.model.UserAddressDto;
import com.rushedstudio.domino.api.model.UserDto;

import java.util.List;

public interface UserAddressService {

    List<UserAddressDto> getAllUserAddresses();

    List<UserAddressDto> getAllUserAddressesByUser(UserDto userDto);

    List<UserAddressDto> getAllUserAddressesByAddress(AddressDto addressDto);

    List<UserAddressDto> getAllUserAddressesByMain(boolean main);

    UserAddressDto getUserAddressById(Long id);
}
