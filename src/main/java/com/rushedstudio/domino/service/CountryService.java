package com.rushedstudio.domino.service;

import com.rushedstudio.domino.api.model.CountryDTO;

public interface CountryService {

    void addCountryList();

    CountryDTO getCountryById(Short countryId);

    CountryDTO getCountryByName(String countryName);

    CountryDTO getCountryByCode(String countryCode);

    CountryDTO getCountryByIso(String countryIso);
}
