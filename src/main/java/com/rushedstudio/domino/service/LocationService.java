package com.rushedstudio.domino.service;

import com.rushedstudio.domino.api.model.AddressDto;
import com.rushedstudio.domino.api.model.LocationDto;

import java.util.List;

public interface LocationService {

    List<LocationDto> getAllLocations();

    LocationDto getLocationById(Long id);

    LocationDto getLocationByAddress(AddressDto addressDto);
}
