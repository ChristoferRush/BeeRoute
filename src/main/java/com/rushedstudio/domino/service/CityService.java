package com.rushedstudio.domino.service;

import com.rushedstudio.domino.api.model.AddressDto;
import com.rushedstudio.domino.api.model.CityDto;
import com.rushedstudio.domino.api.model.CountryDto;
import com.rushedstudio.domino.api.model.StateDto;

import java.util.List;

public interface CityService {

    List<CityDto> getAllCities();

    List<CityDto> getCitiesByCountry(CountryDto countryDto);

    List<CityDto> getCitiesByCountryId(Short countryId);

    List<CityDto> getCitiesByState(StateDto stateDto);

    List<CityDto> getCitiesByStateId(Long stateId);

    CityDto getCityById(Long id);

    CityDto getCityByName(String name);

    CityDto getCityByAddress(AddressDto addressDto);
}
