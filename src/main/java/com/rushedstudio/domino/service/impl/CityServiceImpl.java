package com.rushedstudio.domino.service.impl;

import com.rushedstudio.domino.api.mapper.AddressMapper;
import com.rushedstudio.domino.api.mapper.CityMapper;
import com.rushedstudio.domino.api.mapper.CountryMapper;
import com.rushedstudio.domino.api.mapper.StateMapper;
import com.rushedstudio.domino.api.model.AddressDto;
import com.rushedstudio.domino.api.model.CityDto;
import com.rushedstudio.domino.api.model.CountryDto;
import com.rushedstudio.domino.api.model.StateDto;
import com.rushedstudio.domino.domain.City;
import com.rushedstudio.domino.repository.CityRepository;
import com.rushedstudio.domino.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    private CityRepository cityRepository;

    @Autowired
    public CityServiceImpl(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public List<CityDto> getAllCities() {
        return CityMapper.INSTANCE.toCityDtoList(cityRepository.findAll());
    }

    @Override
    public CityDto getCityById(Long id) {
        return CityMapper.INSTANCE.toCityDTO(cityRepository.getOne(id));
    }

    @Override
    public CityDto getCityByName(String name) {
        return CityMapper.INSTANCE.toCityDTO(cityRepository.findByName(name));
    }

    @Override
    public List<CityDto> getCitiesByCountry(CountryDto countryDto) {
        return CityMapper.INSTANCE.toCityDtoList(cityRepository.findAllByCountry(
                CountryMapper.INSTANCE.toCountry(countryDto)));
    }

    @Override
    public List<CityDto> getCitiesByCountryId(Short countryId) {
        return CityMapper.INSTANCE.toCityDtoList(cityRepository.findAllByCountryId(countryId));
    }

    @Override
    public List<CityDto> getCitiesByState(StateDto stateDto) {
        return CityMapper.INSTANCE.toCityDtoList(cityRepository.findAllByState(
                StateMapper.INSTANCE.toState(stateDto)));
    }

    @Override
    public List<CityDto> getCitiesByStateId(Long stateId) {
        return CityMapper.INSTANCE.toCityDtoList(cityRepository.findAllByStateId(stateId));
    }

    @Override
    public CityDto getCityByAddress(AddressDto addressDto) {
        return CityMapper.INSTANCE.toCityDTO(cityRepository.findByAddressListIsContaining(
                AddressMapper.INSTANCE.toAddress(addressDto)));
    }
}
