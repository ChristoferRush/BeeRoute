package com.rushedstudio.domino.service.impl;

import com.rushedstudio.domino.api.mapper.AddressMapper;
import com.rushedstudio.domino.api.mapper.LocationMapper;
import com.rushedstudio.domino.api.model.AddressDto;
import com.rushedstudio.domino.api.model.LocationDto;
import com.rushedstudio.domino.repository.LocationRepository;
import com.rushedstudio.domino.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {

    private LocationRepository locationRepository;

    @Autowired
    public LocationServiceImpl(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @Override
    public List<LocationDto> getAllLocations() {
        return LocationMapper.INSTANCE.toLocationDTOList(locationRepository.findAll());
    }

    @Override
    public LocationDto getLocationById(Long id) {
        return LocationMapper.INSTANCE.toLocationDTO(locationRepository.getOne(id));
    }

    @Override
    public LocationDto getLocationByAddress(AddressDto addressDto) {
        return LocationMapper.INSTANCE.toLocationDTO(locationRepository.findByAddress(
                AddressMapper.INSTANCE.toAddress(addressDto)));
    }
}
