package com.rushedstudio.domino.controller;

import com.rushedstudio.domino.api.model.CityDto;
import com.rushedstudio.domino.api.model.CountryDto;
import com.rushedstudio.domino.api.model.StateDto;
import com.rushedstudio.domino.service.impl.CountryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(CountryController.BASE_URL)
public class CountryController {

    static final String BASE_URL = "/country";

    private CountryServiceImpl countryService;

    @Autowired
    public CountryController(CountryServiceImpl countryService) {
        this.countryService = countryService;
    }

    @GetMapping(value = "/all")
    @ResponseStatus(HttpStatus.OK)
    public List<CountryDto> getAllCountries(){
        return countryService.getAllCountries();
    }

    @GetMapping(value = "/id:{id}")
    @ResponseStatus(HttpStatus.OK)
    public CountryDto getCountryById(@PathVariable Short id){
        return countryService.getCountryById(id);
    }

    @GetMapping(value = "/iso:{iso}")
    @ResponseStatus(HttpStatus.OK)
    public CountryDto getCountryByIso(@PathVariable String iso){
        return countryService.getCountryByIso(iso);
    }

    @GetMapping(value = "/code:{code}")
    @ResponseStatus(HttpStatus.OK)
    public CountryDto getCountryByCode(@PathVariable String code){
        return countryService.getCountryByCode(code);
    }

    @GetMapping(value = "/name:{name}")
    @ResponseStatus(HttpStatus.OK)
    public CountryDto getCountryByName(@PathVariable String name){
        return countryService.getCountryByName(name);
    }

    @GetMapping(value = "/state:{state}")
    @ResponseStatus(HttpStatus.OK)
    public CountryDto getCountryByState(@PathVariable StateDto stateDto){
        return countryService.getCountryByState(stateDto);
    }

    @GetMapping(value = "/stateId:{stateId}")
    @ResponseStatus(HttpStatus.OK)
    public CountryDto getCountryByStateId(@PathVariable Long stateId){
        return countryService.getCountryByStateId(stateId);
    }

    @GetMapping(value = "/city:{city}")
    @ResponseStatus(HttpStatus.OK)
    public CountryDto getCountryByCity(@PathVariable CityDto cityDto){
        return countryService.getCountryByCity(cityDto);
    }

    @GetMapping(value = "/cityId:{cityId}")
    @ResponseStatus(HttpStatus.OK)
    public CountryDto getCountryByCityId(@PathVariable Long cityId){
        return countryService.getCountryByCityId(cityId);
    }
}
