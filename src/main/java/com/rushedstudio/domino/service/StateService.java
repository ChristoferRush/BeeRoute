package com.rushedstudio.domino.service;

import com.rushedstudio.domino.api.model.CityDto;
import com.rushedstudio.domino.api.model.CountryDto;
import com.rushedstudio.domino.api.model.StateDto;

import java.util.List;

public interface StateService {

    List<StateDto> getAllStates();

    List<StateDto> getAllStatesByCountry(CountryDto countryDto);

    List<StateDto> getAllStatesByCountryId(Short countryId);

    List<StateDto> getAllStatesByCountryName(String countryName);

    StateDto getStateById(Long id);

    StateDto getStateByName(String name);

    StateDto getStateByCity(CityDto cityDto);
}
