package com.rushedstudio.domino.service;

import com.rushedstudio.domino.api.model.dto.CityDTO;
import com.rushedstudio.domino.api.model.dto.CountryDTO;
import com.rushedstudio.domino.api.model.dto.LocationDTO;
import com.rushedstudio.domino.api.model.dto.StateDTO;
import com.rushedstudio.domino.api.model.list.LocationListDTO;

public interface LocationService {

    LocationListDTO getAllLocations();

    LocationListDTO getAllLocationsByCountry(CountryDTO country);

    LocationListDTO getAllLocationsByState(StateDTO state);

    LocationListDTO getAllLocationsByCity(CityDTO cityDTO);

    LocationDTO getLocationById(Long locationId);


}
