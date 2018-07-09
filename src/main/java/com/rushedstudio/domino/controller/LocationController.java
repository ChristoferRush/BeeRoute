package com.rushedstudio.domino.controller;

import com.rushedstudio.domino.api.model.AddressDto;
import com.rushedstudio.domino.api.model.LocationDto;
import com.rushedstudio.domino.service.impl.LocationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(LocationController.BASE_URL)
public class LocationController {

    static final String BASE_URL = "/location";

    private LocationServiceImpl locationService;

    @Autowired
    public LocationController(LocationServiceImpl locationService) {
        this.locationService = locationService;
    }

    @GetMapping(value = "/all")
    @ResponseStatus(HttpStatus.OK)
    public List<LocationDto> getAllLocations(){
        return locationService.getAllLocations();
    }

    @GetMapping(value = "/id:{id}")
    @ResponseStatus(HttpStatus.OK)
    public LocationDto getLocationById(@PathVariable Long id){
        return locationService.getLocationById(id);
    }

    @GetMapping(value = "/address:{addressDto}")
    @ResponseStatus(HttpStatus.OK)
    public LocationDto getLocationByAddress(@PathVariable AddressDto addressDto){
        return locationService.getLocationByAddress(addressDto);
    }
}
