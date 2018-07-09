package com.rushedstudio.domino.controller;

import com.rushedstudio.domino.api.model.CityDto;
import com.rushedstudio.domino.api.model.CountryDto;
import com.rushedstudio.domino.api.model.StateDto;
import com.rushedstudio.domino.service.impl.StateServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(StateController.BASE_URL)
public class StateController {

    static final String BASE_URL = "/state";

    private StateServiceImpl stateService;

    @Autowired
    public StateController(StateServiceImpl stateService) {
        this.stateService = stateService;
    }

    @GetMapping(value = "/all")
    @ResponseStatus(HttpStatus.OK)
    public List<StateDto> getAllStates(){
        return stateService.getAllStates();
    }

    @GetMapping(value = "/country:{countryDto}")
    @ResponseStatus(HttpStatus.OK)
    public List<StateDto> getAllStatesByCountry(@PathVariable CountryDto countryDto){
        return stateService.getAllStatesByCountry(countryDto);
    }

    @GetMapping(value = "/countryId:{countryId}")
    @ResponseStatus(HttpStatus.OK)
    public List<StateDto> getAllStatesByCountryId(@PathVariable Short countryId){
        return stateService.getAllStatesByCountryId(countryId);
    }

    @GetMapping(value = "/countryName:{countryName}")
    @ResponseStatus(HttpStatus.OK)
    public List<StateDto> getAllStatesByCountryName(@PathVariable String countryName){
        return stateService.getAllStatesByCountryName(countryName);
    }

    @GetMapping(value = "/id:{id}")
    @ResponseStatus(HttpStatus.OK)
    public StateDto getStateById(@PathVariable Long id){
        return stateService.getStateById(id);
    }

    @GetMapping(value = "/name:{name}")
    @ResponseStatus(HttpStatus.OK)
    public StateDto getStateByName(@PathVariable String name){
        return stateService.getStateByName(name);
    }

    @GetMapping(value = "/city:{cityDto}")
    @ResponseStatus(HttpStatus.OK)
    public StateDto getStateByCity(@PathVariable CityDto cityDto){
        return stateService.getStateByCity(cityDto);
    }
}
