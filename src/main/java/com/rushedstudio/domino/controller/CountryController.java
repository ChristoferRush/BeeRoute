package com.rushedstudio.domino.controller;

import com.rushedstudio.domino.api.model.dto.CountryDTO;
import com.rushedstudio.domino.service.CountryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = CountryController.BASE_URL)
public class CountryController {

    static final String BASE_URL = "/country";

    private CountryServiceImpl countryService;

    @Autowired
    public CountryController(CountryServiceImpl countryService) {
        this.countryService = countryService;
    }

    @GetMapping(value = "/add")
    @ResponseStatus(HttpStatus.OK)
    public void addCountryList(){
        countryService.addCountryList();
    }

    // get

    @GetMapping(value = "/id:{id}")
    @ResponseStatus(HttpStatus.OK)
    public CountryDTO getCountryById(@PathVariable Short countryId){
        return countryService.getCountryById(countryId);
    }

    @GetMapping(value = "/name:{name}")
    @ResponseStatus(HttpStatus.OK)
    public CountryDTO getCountryByName(@PathVariable String countryName){
        return countryService.getCountryByName(countryName);
    }

    @GetMapping(value = "/code:{code}")
    @ResponseStatus(HttpStatus.OK)
    public CountryDTO getCountryByCode(@PathVariable String countryCode){
        return countryService.getCountryByCode(countryCode);
    }

    @GetMapping(value = "/iso:{iso}")
    @ResponseStatus(HttpStatus.OK)
    public CountryDTO getCountryByIso(@PathVariable String countryIso){
        return countryService.getCountryByIso(countryIso);
    }
}
