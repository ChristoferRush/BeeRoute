package com.rushedstudio.domino.api.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.rushedstudio.domino.api.model.list.CityListDTO;
import com.rushedstudio.domino.api.model.list.LocationListDTO;
import com.rushedstudio.domino.api.model.list.StateListDTO;
import lombok.Data;

@Data
public class CountryDTO {

    private Short id;
    private String iso;
    private String code;
    private String name;
    @JsonIgnore
    private StateListDTO states;
    @JsonIgnore
    private CityListDTO cities;
    @JsonIgnore
    private LocationListDTO locations;
}
