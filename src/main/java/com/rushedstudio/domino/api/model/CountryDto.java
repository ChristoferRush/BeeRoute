package com.rushedstudio.domino.api.model;

import lombok.Data;

import java.util.List;

@Data
public class CountryDto {

    private Short id;
    private String iso;
    private String code;
    private String name;
    private List<StateDto> stateList;
    private List<CityDto> cityList;
}
