package com.rushedstudio.domino.service;

import com.rushedstudio.domino.api.model.CityDto;
import com.rushedstudio.domino.api.model.CountryDto;
import com.rushedstudio.domino.api.model.StateDto;

import java.util.List;

public interface CountryService {

    List<CountryDto> getAllCountries();

    CountryDto getCountryById(Short id);

    CountryDto getCountryByIso(String iso);

    CountryDto getCountryByCode(String code);

    CountryDto getCountryByName(String name);

    CountryDto getCountryByState(StateDto stateDto);

    CountryDto getCountryByStateId(Long stateId);

    CountryDto getCountryByCity(CityDto cityDto);

    CountryDto getCountryByCityId(Long cityId);
}
