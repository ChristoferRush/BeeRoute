package com.rushedstudio.domino.api.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.rushedstudio.domino.api.model.list.CityListDTO;
import com.rushedstudio.domino.api.model.list.LocationListDTO;

public class StateDTO {

    private Long id;
    private String name;
    @JsonIgnoreProperties({"states", "cities", "locations"})
    private CountryDTO country;
    @JsonIgnore
    private CityListDTO cities;
    @JsonIgnore
    private LocationListDTO locations;
}
