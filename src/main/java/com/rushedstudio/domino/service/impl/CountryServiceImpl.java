package com.rushedstudio.domino.service.impl;

import com.rushedstudio.domino.api.mapper.CountryMapper;
import com.rushedstudio.domino.api.model.dto.CityDTO;
import com.rushedstudio.domino.api.model.dto.CountryDTO;
import com.rushedstudio.domino.api.model.dto.StateDTO;
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
    public List<CountryDTO> getAllCountries() {
        return null;
    }

    @Override
    public CountryDTO getCountryById(Short id) {
        return CountryMapper.INSTANCE.toCountryDTO(countryRepository.getOne(id));
    }

    @Override
    public CountryDTO getCountryByIso(String iso) {
        return CountryMapper.INSTANCE.toCountryDTO(countryRepository.findByIso(iso));
    }

    @Override
    public CountryDTO getCountryByCode(String code) {
        return CountryMapper.INSTANCE.toCountryDTO(countryRepository.findByCode(code));
    }

    @Override
    public CountryDTO getCountryByName(String name) {
        return CountryMapper.INSTANCE.toCountryDTO(countryRepository.findByName(name));
    }

    @Override
    public CountryDTO getCountryByState(StateDTO stateDTO) {
        return null;
    }

    @Override
    public CountryDTO getCountryByStateId(Long stateId) {
        return null;
    }

    @Override
    public CountryDTO getCountryByCity(CityDTO cityDTO) {
        return null;
    }

    @Override
    public CountryDTO getCountryByCityId(Long cityId) {
        return null;
    }
}
