package com.rushedstudio.domino.service.impl;

import com.rushedstudio.domino.api.mapper.CountryMapper;
import com.rushedstudio.domino.api.model.CityDto;
import com.rushedstudio.domino.api.model.CountryDto;
import com.rushedstudio.domino.api.model.StateDto;
import com.rushedstudio.domino.repository.CountryRepository;
import com.rushedstudio.domino.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {

    private CountryRepository countryRepository;

    @Autowired
    public CountryServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public List<CountryDto> getAllCountries() {
        return null;
    }

    @Override
    public CountryDto getCountryById(Short id) {
        return CountryMapper.INSTANCE.toCountryDTO(countryRepository.getOne(id));
    }

    @Override
    public CountryDto getCountryByIso(String iso) {
        return CountryMapper.INSTANCE.toCountryDTO(countryRepository.findByIso(iso));
    }

    @Override
    public CountryDto getCountryByCode(String code) {
        return CountryMapper.INSTANCE.toCountryDTO(countryRepository.findByCode(code));
    }

    @Override
    public CountryDto getCountryByName(String name) {
        return CountryMapper.INSTANCE.toCountryDTO(countryRepository.findByName(name));
    }

    @Override
    public CountryDto getCountryByState(StateDto stateDto) {
        return null;
    }

    @Override
    public CountryDto getCountryByStateId(Long stateId) {
        return null;
    }

    @Override
    public CountryDto getCountryByCity(CityDto cityDto) {
        return null;
    }

    @Override
    public CountryDto getCountryByCityId(Long cityId) {
        return null;
    }
}
