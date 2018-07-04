package com.rushedstudio.domino.api.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.List;

@Data
public class StateDTO {

    private Long id;
    private String name;
    private CountryDTO country;
    @JsonIgnore
    private List<CityDTO> cityList;
}
