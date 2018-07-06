package com.rushedstudio.domino.service.impl;

import com.rushedstudio.domino.api.mapper.CityMapper;
import com.rushedstudio.domino.api.mapper.CountryMapper;
import com.rushedstudio.domino.api.mapper.StateMapper;
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
    private StateServiceImpl stateService;
    private CityServiceImpl cityService;

    @Autowired
    public CountryServiceImpl(CountryRepository countryRepository, StateServiceImpl stateService, CityServiceImpl cityService) {
        this.countryRepository = countryRepository;
        this.stateService = stateService;
        this.cityService = cityService;
    }

    @Override
    public List<CountryDto> getAllCountries() {
        return CountryMapper.INSTANCE.toCountryDTOList(countryRepository.findAll());
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
        return CountryMapper.INSTANCE.toCountryDTO(countryRepository.findByStateListIsContaining(
                StateMapper.INSTANCE.toState(stateDto)));
    }

    @Override
    public CountryDto getCountryByStateId(Long stateId) {
        return CountryMapper.INSTANCE.toCountryDTO(countryRepository.findByStateListIsContaining(
                StateMapper.INSTANCE.toState(stateService.getStateById(stateId))));
    }

    @Override
    public CountryDto getCountryByCity(CityDto cityDto) {
        return CountryMapper.INSTANCE.toCountryDTO(countryRepository.findByCityListIsContaining(
                CityMapper.INSTANCE.toCity(cityDto)));
    }

    @Override
    public CountryDto getCountryByCityId(Long cityId) {
        return CountryMapper.INSTANCE.toCountryDTO(countryRepository.findByCityListIsContaining(
                CityMapper.INSTANCE.toCity(cityService.getCityById(cityId))));
    }
}
