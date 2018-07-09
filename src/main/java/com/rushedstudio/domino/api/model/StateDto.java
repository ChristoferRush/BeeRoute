package com.rushedstudio.domino.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
public class StateDto {

    private Long id;
    private String name;
    @JsonIgnoreProperties({"stateList"})
    private Short countryId;
    private List<CityDto> cityList;
}
