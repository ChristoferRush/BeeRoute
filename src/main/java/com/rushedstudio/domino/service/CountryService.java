package com.rushedstudio.domino.service;

import com.rushedstudio.domino.api.model.dto.CityDTO;
import com.rushedstudio.domino.api.model.dto.CountryDTO;
import com.rushedstudio.domino.api.model.dto.StateDTO;

import java.util.List;

public interface CountryService {

    List<CountryDTO> getAllCountries();

    CountryDTO getCountryById(Short id);

    CountryDTO getCountryByIso(String iso);

    CountryDTO getCountryByCode(String code);

    CountryDTO getCountryByName(String name);

    CountryDTO getCountryByState(StateDTO stateDTO);

    CountryDTO getCountryByStateId(Long stateId);

    CountryDTO getCountryByCity(CityDTO cityDTO);

    CountryDTO getCountryByCityId(Long cityId);
}
