package com.rushedstudio.domino.api.model.list;

import com.rushedstudio.domino.api.model.dto.CountryDTO;
import lombok.Data;

import java.util.List;

@Data
public class CountryListDTO {

    private List<CountryDTO> countryDTOList;
}
