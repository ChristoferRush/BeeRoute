package com.rushedstudio.domino.api.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.List;

@Data
public class CountryDTO {

    private Short id;
    private String iso;
    private String code;
    private String name;
    @JsonIgnore
    private List<StateDTO> stateList;
    @JsonIgnore
    private List<CityDTO> cityList;
}
