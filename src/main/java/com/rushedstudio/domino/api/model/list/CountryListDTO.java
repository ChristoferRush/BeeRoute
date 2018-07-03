package com.rushedstudio.domino.api.model.list;

import com.rushedstudio.domino.api.model.CountryDTO;
import lombok.Data;

import java.util.List;

@Data
public class CountryListDTO {

    private List<CountryDTO> countryDTOS;
}
