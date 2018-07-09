package com.rushedstudio.domino.service.impl;

import com.rushedstudio.domino.api.mapper.AddressMapper;
import com.rushedstudio.domino.api.mapper.CityMapper;
import com.rushedstudio.domino.api.mapper.LocationMapper;
import com.rushedstudio.domino.api.mapper.UserAddressMapper;
import com.rushedstudio.domino.api.model.AddressDto;
import com.rushedstudio.domino.api.model.CityDto;
import com.rushedstudio.domino.api.model.LocationDto;
import com.rushedstudio.domino.api.model.UserAddressDto;
import com.rushedstudio.domino.repository.AddressRepository;
import com.rushedstudio.domino.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    private AddressRepository addressRepository;

    @Autowired
    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public List<AddressDto> getAllAddresses() {
        return AddressMapper.INSTANCE.toAddressDTOList(addressRepository.findAll());
    }

    @Override
    public List<AddressDto> getAllAddressesByStreetAddress(String streetAddress) {
        return AddressMapper.INSTANCE.toAddressDTOList(addressRepository.findAllByStreetAddress(streetAddress));
    }

    @Override
    public List<AddressDto> getAllAddressesByHomeNumber(String homeNumber) {
        return AddressMapper.INSTANCE.toAddressDTOList(addressRepository.findAllByHomeNumber(homeNumber));
    }

    @Override
    public List<AddressDto> getAllAddressesByHomeNumberAndFlatNumber(String homeNumber, String flatNumber) {
        return AddressMapper.INSTANCE.toAddressDTOList(
                addressRepository.findAllByHomeNumberAndFlatNumber(homeNumber, flatNumber));
    }

    @Override
    public List<AddressDto> getAllAddressesByCity(CityDto cityDto) {
        return AddressMapper.INSTANCE.toAddressDTOList(addressRepository.findAllByCity(
                CityMapper.INSTANCE.toCity(cityDto)));
    }

    @Override
    public AddressDto getAddressById(Long id) {
        return AddressMapper.INSTANCE.toAddressDTO(addressRepository.getOne(id));
    }

    @Override
    public AddressDto getAddressByLocation(LocationDto locationDto) {
        return AddressMapper.INSTANCE.toAddressDTO(addressRepository.findByLocation(
                LocationMapper.INSTANCE.toLocation(locationDto)));
    }

    @Override
    public AddressDto getAddressByUserAddress(UserAddressDto userAddressDto) {
        return AddressMapper.INSTANCE.toAddressDTO(addressRepository.findByUserAddressListIsContaining(
                UserAddressMapper.INSTANCE.toUserAddress(userAddressDto)));
    }
}
