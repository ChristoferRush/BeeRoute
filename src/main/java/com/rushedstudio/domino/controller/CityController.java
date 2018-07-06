package com.rushedstudio.domino.controller;

import com.rushedstudio.domino.api.model.AddressDto;
import com.rushedstudio.domino.api.model.CityDto;
import com.rushedstudio.domino.api.model.CountryDto;
import com.rushedstudio.domino.api.model.StateDto;
import com.rushedstudio.domino.domain.City;
import com.rushedstudio.domino.domain.State;
import com.rushedstudio.domino.service.impl.CityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(CityController.BASE_URL)
public class CityController {

    static final String BASE_URL = "/city";

    private CityServiceImpl cityService;

    @Autowired
    public CityController(CityServiceImpl cityService) {
        this.cityService = cityService;
    }

    @GetMapping(value = "/all")
    @ResponseStatus(HttpStatus.OK)
    public List<CityDto> getAllCities(){
        return cityService.getAllCities();
    }

    @GetMapping(value = "/id:{id}")
    @ResponseStatus(HttpStatus.OK)
    public CityDto getCityById(@PathVariable Long id){
        return cityService.getCityById(id);
    }

    @GetMapping(value = "/name:{name}")
    @ResponseStatus(HttpStatus.OK)
    public CityDto getCityByName(@PathVariable String name){
        return cityService.getCityByName(name);
    }

    @GetMapping(value = "/state:{state}")
    @ResponseStatus(HttpStatus.OK)
    public List<CityDto> getCitiesByState(@PathVariable StateDto stateDto){
        return cityService.getCitiesByState(stateDto);
    }

    @GetMapping(value = "/stateId:{stateId}")
    @ResponseStatus(HttpStatus.OK)
    public List<CityDto> getCitiesByStateId(@PathVariable Long stateId){
        return cityService.getCitiesByStateId(stateId);
    }

    @GetMapping(value = "/country:{country}")
    @ResponseStatus(HttpStatus.OK)
    public List<CityDto> getCitiesByCountry(@PathVariable CountryDto countryDto){
        return cityService.getCitiesByCountry(countryDto);
    }

    @GetMapping(value = "/countryId:{countryId}")
    @ResponseStatus(HttpStatus.OK)
    public List<CityDto> getCitiesByCountryId(@PathVariable Short countryId){
        return cityService.getCitiesByCountryId(countryId);
    }

    @GetMapping(value = "/address:{address}")
    @ResponseStatus(HttpStatus.OK)
    public CityDto getCityByAddress(@PathVariable AddressDto addressDto){
        return cityService.getCityByAddress(addressDto);
    }
}
