package com.rushedstudio.domino.service;

import com.rushedstudio.domino.api.model.AddressDto;
import com.rushedstudio.domino.api.model.CityDto;
import com.rushedstudio.domino.api.model.LocationDto;
import com.rushedstudio.domino.api.model.UserAddressDto;

import java.util.List;

public interface AddressService {

    List<AddressDto> getAllAddresses();

    List<AddressDto> getAllAddressesByStreetAddress(String streetAddress);

    List<AddressDto> getAllAddressesByHomeNumber(String homeNumber);

    List<AddressDto> getAllAddressesByHomeNumberAndFlatNumber(String homeNumber, String flatNumber);

    List<AddressDto> getAllAddressesByCity(CityDto cityDto);

    AddressDto getAddressById(Long id);

    AddressDto getAddressByLocation(LocationDto locationDto);

    AddressDto getAddressByUserAddress(UserAddressDto userAddressDto);
}
